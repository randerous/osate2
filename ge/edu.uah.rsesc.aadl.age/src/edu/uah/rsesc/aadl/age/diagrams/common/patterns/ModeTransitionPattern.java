package edu.uah.rsesc.aadl.age.diagrams.common.patterns;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.datatypes.ILocation;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.internal.datatypes.impl.LocationImpl;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.PrecisionPoint;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.CurvedConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.ILayoutService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipse.graphiti.ui.internal.services.IGefService;
import org.osate.aadl2.ModeTransition;
import org.osate.aadl2.ModeTransitionTrigger;

import edu.uah.rsesc.aadl.age.diagrams.common.AadlElementWrapper;
import edu.uah.rsesc.aadl.age.diagrams.common.util.AnchorUtil;
import edu.uah.rsesc.aadl.age.diagrams.common.util.StyleUtil;

public class ModeTransitionPattern extends AgeConnectionPattern {
	@Override
	public boolean isMainBusinessObjectApplicable(final Object mainBusinessObject) {
		return AadlElementWrapper.unwrap(mainBusinessObject) instanceof ModeTransition;
	}

	@Override
	public PictogramElement add(final IAddContext context) {
		final IAddConnectionContext addConContext = (IAddConnectionContext)context;
        final ModeTransition mt = (ModeTransition)AadlElementWrapper.unwrap(context.getNewObject());
        final IPeCreateService peCreateService = Graphiti.getPeCreateService();
        
        // Create the connection
        final Connection connection = peCreateService.createCurvedConnection(new double[] {0.0, 0.0}, getDiagram());
        link(connection, new AadlElementWrapper(mt));

        connection.setStart(addConContext.getSourceAnchor());
        connection.setEnd(addConContext.getTargetAnchor());

        updateControlPoints(connection);
        createGraphicsAlgorithm(connection);
        createDecorators(connection, mt);
        updateTriggers(connection, mt);
        
		return connection;
	}
	
	public static void updateControlPoints(final Connection connection) {
		if(connection instanceof CurvedConnection) {
			final CurvedConnection cc = (CurvedConnection)connection;
			final ILayoutService layoutService = Graphiti.getLayoutService();			

			// Decide a sign for the control point
			final ILocation startLocation = layoutService.getLocationRelativeToDiagram(connection.getStart());
			final ILocation endLocation = layoutService.getLocationRelativeToDiagram(connection.getEnd());
			final int sign = (startLocation.getX() - endLocation.getX()) > 0 ? -1 : 1; 
			
			final int magnitude = 30;

			// Determine a reasonable control point
			int y = sign * magnitude;
			boolean unique = false;
			while(!unique) {
				unique = true;
				for(final Connection tempConnection : connection.getParent().getConnections()) {
					if(tempConnection != connection) {
						if(tempConnection instanceof CurvedConnection) {
							final CurvedConnection tempCC = (CurvedConnection)tempConnection;
							if(connection.getStart() == tempCC.getStart() && connection.getEnd() == tempCC.getEnd()) {
								if(tempCC.getControlPoints().get(0).getY() == y) {
									unique = false;
									y += sign * magnitude;
									break;
								}
							}
						}
					}
				}
			}
			
			// Set the control point
			cc.getControlPoints().clear();
			final PrecisionPoint pp = StylesFactory.eINSTANCE.createPrecisionPoint();
			pp.setX(1.0);
			pp.setY(y);
			cc.getControlPoints().add(pp);
		}
	}
	private void createDecorators(final Connection connection, final ModeTransition mt) {
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		
		// Before removing all the decorators, get position of the label(if one exists)
		/*
		int labelX = 0;
		int labelY = 0;
		for(final ConnectionDecorator d : connection.getConnectionDecorators()) {
			if(d.getGraphicsAlgorithm() instanceof Text) {
				final Text text = (Text)d.getGraphicsAlgorithm();
				labelX = text.getX();
				labelY = text.getY();
			}
		}
		*/
		connection.getConnectionDecorators().clear();
		
		// Create the arrow
        final ConnectionDecorator arrowConnectionDecorator = peCreateService.createConnectionDecorator(connection, false, 1.0, true);    
        createArrow(arrowConnectionDecorator, StyleUtil.getDecoratorStyle(getDiagram()));
        
		// Create Label
        // TODO: Consider whether or not to have labels for transitions. Only show up in properties? Causes the diagram to be less cluttered. 
        /*
        final IGaService gaService = Graphiti.getGaService();
		final ConnectionDecorator textDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
		final Text text = gaService.createDefaultText(getDiagram(), textDecorator);
		text.setStyle(StyleUtil.getLabelStyle(getDiagram()));
		gaService.setLocation(text, labelX, labelY);
	    text.setValue(mt.getName());
	    */
	}
	
	private void createGraphicsAlgorithm(final Connection connection) {
		final IGaService gaService = Graphiti.getGaService();
		final Polyline polyline = gaService.createPlainPolyline(connection);
		final Style style = StyleUtil.getDecoratorStyle(getDiagram());
		polyline.setStyle(style);
	}
	
	private void createTriggerGraphicsAlgorithm(final Connection connection) {
		final IGaService gaService = Graphiti.getGaService();
		final Polyline polyline = gaService.createPlainPolyline(connection);
		final Style style = StyleUtil.getModeTransitionTrigger(getDiagram());
		polyline.setStyle(style);
	}
	
	private GraphicsAlgorithm createArrow(final GraphicsAlgorithmContainer gaContainer, final Style style) {
	    final IGaService gaService = Graphiti.getGaService();
	    final GraphicsAlgorithm ga = gaService.createPlainPolygon(gaContainer, new int[] {
	    		-6, 4, 
	    		2, 0, 
	    		-6, -4});
	    ga.setStyle(style);
	    return ga;
	}	
	
	private static ContainerShape getModeContainer(final Connection connection) {
		return getStartModeShape(connection).getContainer();
	}

	// CLEAN-UP: Dependent on behavior of ModePattern to determine how many levels to go up
	private static ContainerShape getStartModeShape(final Connection connection) {
		return ((Shape)connection.getStart().getParent()).getContainer();
	}
	
	// Assume freeform and no bendpoints
	private static ILocation getConnectionMidpoint(final Connection connection, final double d) {
		final ILayoutService layoutService = Graphiti.getLayoutService();
		
		final IGefService gefService = GraphitiUiInternal.getGefService();
		// Should be end point?
		final Shape startShape = (Shape)connection.getStart().getParent();
		final Shape endShape = (Shape)connection.getEnd().getParent();
		final ILocation startShapeLocation = layoutService.getLocationRelativeToDiagram(startShape);
		final ILocation endShapeLocation = layoutService.getLocationRelativeToDiagram(endShape);
		
		final GraphicsAlgorithm startShapeGa = startShape.getGraphicsAlgorithm();
		final GraphicsAlgorithm endShapeGa = endShape.getGraphicsAlgorithm();
		
		final Rectangle startShapeRect = new Rectangle(startShapeLocation.getX(), startShapeLocation.getY(), startShapeGa.getWidth(), startShapeGa.getHeight());
		final Rectangle endShapeRect = new Rectangle(endShapeLocation.getX(), endShapeLocation.getY(), endShapeGa.getWidth(), endShapeGa.getHeight());
		
		// TODO: Look for layout helpers
		if(connection instanceof CurvedConnection) {			
			final Point startPoint = gefService.getChopboxLocationOnBox(new Point(endShapeLocation.getX(), endShapeLocation.getY()), startShapeRect);
			final Point endPoint = gefService.getChopboxLocationOnBox(new Point(startShapeLocation.getX(), startShapeLocation.getY()), endShapeRect);
			
			// Code example: y is handled differently than x....
			final Point endPointRel = new Point(endPoint.x-startPoint.x, endPoint.y-startPoint.y);			
			
			final CurvedConnection cc = (CurvedConnection)connection;
			
			// Calculate the transformed control point
			// Algorithm copied from org.eclipse.graphiti.ui.internal.parts.CurvedConnectionEditPart.BezierRouter to duplicate control point transformation
			double gradient = endPointRel.preciseY() / -endPointRel.preciseX();
			double ortho_gradient = -Math.pow(gradient, -1);
			double orthovector_x = 1;
			double orthovector_y = ortho_gradient;
			double factor_to_length = 1 / Math.sqrt((Math.pow(orthovector_y, 2) + Math.pow(orthovector_x, 2)));
			final PrecisionPoint cp = cc.getControlPoints().get(0);			
			double orthovector_x_cp = factor_to_length * orthovector_x * cp.getY();
			double orthovector_y_cp = factor_to_length * orthovector_y * cp.getY();
			if (Double.isNaN(orthovector_x_cp)) {
				orthovector_x_cp = 0;
			}
			if (Double.isNaN(orthovector_y_cp)) {
				orthovector_y_cp = 1 * cp.getY();
			}

			final double cpX = startPoint.x + (endPointRel.preciseX() * cp.getX() - orthovector_x_cp);
			final double cpY = startPoint.y + ((endPointRel.preciseY() * cp.getX()) + orthovector_y_cp);
			
			// Calculate the midpoint
			final double ax = (startPoint.x + cpX) / 2;
			final double ay = (startPoint.y + cpY) / 2;
			final double bx = (cpX + endPoint.x) / 2;
			final double by = (cpY + endPoint.y) / 2;
			final double mx = (ax + bx)/2;
			final double my = (ay + by)/2;		      
			final int x = (int)mx;
			final int y = (int)my;
						
			return new LocationImpl(x, y);			
		}
		
		final ILocation startLoc = layoutService.getLocationRelativeToDiagram(connection.getStart());
		final ILocation endLoc = layoutService.getLocationRelativeToDiagram(connection.getEnd());
		
		// TODO: Replace with something that works in all cases. The layout service works for freestyle but has an offset(of 25) for some reason
		// Need a method that will work with CurvedConnections
		return new LocationImpl((int)(startLoc.getX() + (endLoc.getX() - startLoc.getX()) * d), (int)(startLoc.getY() + (endLoc.getY() - startLoc.getY()) * d));
	}
	
	public static void updateAnchors(final Connection connection, final ModeTransition mt) {
		final ILayoutService layoutService = Graphiti.getLayoutService();
		final ContainerShape modeShape = getStartModeShape(connection);
		final ILocation modeLocation = layoutService.getLocationRelativeToDiagram(modeShape);
		final ILocation l = getConnectionMidpoint(connection, 0.5);
		AnchorUtil.createOrUpdateFixPointAnchor(modeShape, getTransitionAnchorName(mt), l.getX() - modeLocation.getX(), l.getY() - modeLocation.getY());
	}
	
	private void updateTriggers(final Connection connection, final ModeTransition mt) {	
		updateAnchors(connection, mt);

		final ContainerShape modeShape = getStartModeShape(connection);
		final Anchor anchor = AnchorUtil.getAnchorByName(modeShape, getTransitionAnchorName(mt));
		for(final ModeTransitionTrigger trigger : mt.getOwnedTriggers()) {

			final ContainerShape modeTransitionContainer = getModeContainer(connection);	
			// TODO: Use same anchor for all triggers for hte transition...
			final Anchor eventSourceAnchor = AnchorUtil.getAnchorForModeTransitionTrigger(trigger, modeTransitionContainer, modeShape, getFeatureProvider());
			
			if(eventSourceAnchor != null) {
				final IPeCreateService peCreateService = Graphiti.getPeCreateService();
				final Connection triggerConnection = peCreateService.createFreeFormConnection(getDiagram());
				triggerConnection.setStart(eventSourceAnchor);
				triggerConnection.setEnd(anchor);
				createTriggerGraphicsAlgorithm(triggerConnection);
			}
		}
	}
	
	/**
	 * Builds a unique name for the anchor that will be used for the end of the trigger connection that connects it to the transition connection.
	 * @param trigger
	 * @return
	 */
	private static String getTransitionAnchorName(final ModeTransition mt) {
		return mt.getName();
	}
	
	@Override
	public boolean canUpdate(final IUpdateContext context) {
		final Object bo = this.getBusinessObjectForPictogramElement(context.getPictogramElement());
		return context.getPictogramElement() instanceof Connection && isMainBusinessObjectApplicable(bo);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		return Reason.createFalseReason();
	}

	@Override
	public boolean update(final IUpdateContext context) {
		// Rebuild the graphics algorithm and the decorators to ensure they are up to date and to ensure they reference the latest styles.
		// Old styles are removed when the diagram is updated
		final Connection connection = (Connection)context.getPictogramElement();
		final ModeTransition mt = (ModeTransition)AadlElementWrapper.unwrap(getBusinessObjectForPictogramElement(connection));

		final Anchor[] anchors = AnchorUtil.getAnchorsForModeTransition(mt, getFeatureProvider());

		// Update anchors
		if(anchors == null) {
			connection.setStart(null);
			connection.setEnd(null);
			EcoreUtil.remove(connection);
		}
		else {
			connection.setStart(anchors[0]);
			connection.setEnd(anchors[1]);
			
			updateControlPoints(connection);
			createGraphicsAlgorithm(connection);
			createDecorators(connection, mt);
			updateTriggers(connection, mt);
		}
		
		return true;
	}
}
