/* Created on Mar 21, 2006
 */
package org.osate.aadl2.modelsupport.errorreporting;

import org.eclipse.emf.ecore.resource.Resource;
import org.osate.aadl2.Element;


public final class ChainedAnalysisErrorReporter extends AbstractAnalysisErrorReporter {
	/** The error reporters to delegate to */
	private final AnalysisErrorReporter[] reporters;
	
	
	
	private ChainedAnalysisErrorReporter(final Resource rsrc,
			final AnalysisErrorReporter[] reporters) {
		super(rsrc);
		this.reporters = reporters;
	}
	
	
	@Override
	protected void errorImpl(Element where, String message,
			final String[] attrs, final Object[] values) {
		for (int i = 0; i < reporters.length; i++) {
			reporters[i].error(where, message, attrs, values);
		}
	}

	@Override
	protected void warningImpl(Element where, String message,
			final String[] attrs, final Object[] values) {
		for (int i = 0; i < reporters.length; i++) {
			reporters[i].warning(where, message, attrs, values);
		}
	}

	@Override
	protected void infoImpl(Element where, String message,
			final String[] attrs, final Object[] values) {
		for (int i = 0; i < reporters.length; i++) {
			reporters[i].info(where, message, attrs, values);
		}
	}

	protected void deleteMessagesImpl() {
		for (int i = 0; i < reporters.length; i++) {
			reporters[i].deleteMessages();
		}
	}


	public static final class Factory implements AnalysisErrorReporterFactory {
		final AnalysisErrorReporterFactory[] factories;
		
		/**
		 * Create a new factory that creates an analysis error reporter that
		 * delegates to error reporters generated by the given list of
		 * factories.
		 * 
		 * @param factories
		 *            The factories to use to generate the delegates. This array
		 *            is referenced directly. The caller should not keep a
		 *            reference to it.
		 */
		public Factory(final AnalysisErrorReporterFactory[] factories) {
			this.factories = factories;
		}

		public AnalysisErrorReporter getReporterFor(final Resource rsrc) {
			final AnalysisErrorReporter[] reporters = 
				new AnalysisErrorReporter[factories.length];
			for (int i = 0; i < factories.length; i++) {
				reporters[i] = factories[i].getReporterFor(rsrc);
			}
			return new ChainedAnalysisErrorReporter(rsrc, reporters);
		}
	}
}
