/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */

package org.osate.assure.evaluator

import com.google.inject.ImplementedBy
import com.rockwellcollins.atc.resolute.analysis.execution.EvaluationContext
import com.rockwellcollins.atc.resolute.analysis.execution.ResoluteInterpreter
import com.rockwellcollins.atc.resolute.analysis.results.ClaimResult
import com.rockwellcollins.atc.resolute.resolute.FnCallExpr
import com.rockwellcollins.atc.resolute.resolute.ProveStatement
import com.rockwellcollins.atc.resolute.resolute.ResoluteFactory
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.osate.aadl2.BooleanLiteral
import org.osate.aadl2.IntegerLiteral
import org.osate.aadl2.NumberValue
import org.osate.aadl2.RealLiteral
import org.osate.aadl2.StringLiteral
import org.osate.aadl2.instance.ComponentInstance
import org.osate.aadl2.instance.InstanceObject
import org.osate.alisa.common.common.AVariableReference
import org.osate.alisa.common.common.CommonFactory
import org.osate.alisa.common.common.ValDeclaration
import org.osate.assure.assure.AssuranceCaseResult
import org.osate.assure.assure.ElseResult
import org.osate.assure.assure.ElseType
import org.osate.assure.assure.ModelResult
import org.osate.assure.assure.PreconditionResult
import org.osate.assure.assure.SubsystemResult
import org.osate.assure.assure.ThenResult
import org.osate.assure.assure.ValidationResult
import org.osate.assure.assure.VerificationActivityResult
import org.osate.assure.assure.VerificationExecutionState
import org.osate.assure.assure.VerificationResult
import org.osate.assure.util.AssureUtilExtension
import org.osate.results.results.ResultReport
import org.osate.verify.util.VerificationMethodDispatchers
import org.osate.verify.verify.FormalParameter
import org.osate.verify.verify.JavaMethod
import org.osate.verify.verify.ManualMethod
import org.osate.verify.verify.PluginMethod
import org.osate.verify.verify.ResoluteMethod
import org.osate.xtext.aadl2.properties.util.PropertyUtils

import static extension org.osate.alisa.common.util.CommonUtilExtension.*
import static extension org.osate.assure.util.AssureUtilExtension.*
import org.osate.verify.verify.AgreeMethod
import com.rockwellcollins.atc.agree.analysis.AgreeUtils
import com.rockwellcollins.atc.agree.analysis.AgreeException
import com.rockwellcollins.atc.agree.analysis.ast.AgreeProgram
import com.rockwellcollins.atc.agree.analysis.ast.AgreeASTBuilder
import jkind.lustre.Program
//import com.rockwellcollins.atc.agree.analysis.translation.LustreAstBuilder
import org.eclipse.xtext.util.Pair
import java.util.List
import jkind.api.results.CompositeAnalysisResult
import com.rockwellcollins.atc.agree.analysis.ConsistencyResult
import jkind.api.results.JRealizabilityResult
import jkind.api.results.AnalysisResult
import org.osate.aadl2.ComponentImplementation
import java.util.HashMap
import com.rockwellcollins.atc.agree.analysis.AgreeLayout
import java.util.ArrayList
import jkind.lustre.Node
import com.rockwellcollins.atc.agree.analysis.AgreeRenaming
import jkind.api.results.JKindResult
import java.util.Map
import java.util.Collections
import jkind.lustre.VarDecl
import com.rockwellcollins.atc.agree.analysis.ast.AgreeVar
import com.rockwellcollins.atc.agree.analysis.AgreeLayout.SigType
import org.osate.aadl2.FeatureGroup
import com.rockwellcollins.atc.agree.agree.Arg
import com.rockwellcollins.atc.agree.agree.AssertStatement
import com.rockwellcollins.atc.agree.agree.AssumeStatement
import com.rockwellcollins.atc.agree.agree.LemmaStatement
import org.osate.aadl2.DataPort
import com.rockwellcollins.atc.agree.agree.GuaranteeStatement
import org.osate.aadl2.EventDataPort
import org.osate.aadl2.ComponentType
import com.rockwellcollins.atc.agree.agree.PropertyStatement
import com.rockwellcollins.atc.agree.analysis.ast.AgreeNode
import com.rockwellcollins.atc.agree.analysis.ast.AgreeStatement
import java.util.ArrayDeque
import java.util.Queue
import com.rockwellcollins.atc.agree.analysis.handlers.VerifySingleHandler
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.osate.aadl2.Element
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Status
import org.eclipse.ui.handlers.IHandlerService
import org.eclipse.core.resources.WorkspaceJob
import org.eclipse.core.runtime.IStatus
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.ui.handlers.IHandlerActivation
import org.eclipse.emf.ecore.util.EcoreUtil

@ImplementedBy(AssureProcessor)
interface IAssureProcessor {
	def void processCase(AssuranceCaseResult assureResult, IProgressMonitor monitor);
}

/**
 * performs the processing of verification activities
 * records the result propagating up the counts
 * Will process only those that are TBD
 * It assumes the counts are ok
 */
class AssureProcessor implements IAssureProcessor {

	var IProgressMonitor progressmonitor
	
	var long start = 0
	
	
	def void startSubTask(VerificationActivityResult vaResult){
		progressmonitor.subTask(vaResult.target.name) // + " on " + vaResult.claimSubject.name)
		start = System.currentTimeMillis();	
	}
	def void doneSubTask(VerificationActivityResult vaResult){
		val instanceroot = vaResult.assuranceCaseInstanceModel
		val targetComponent = findTargetSystemComponentInstance(instanceroot, vaResult.enclosingSubsystemResult)
		val target = targetComponent.instanceObjectPath
		progressmonitor.worked(1)
		val stop = System.currentTimeMillis();
		System.out.println("Evaluation time: " + (stop - start) / 1000.0 + "s :"+vaResult.target.name+" on "+target);
	}

	override processCase(AssuranceCaseResult assureResult, IProgressMonitor monitor) {
		progressmonitor = monitor
		val count = AssureUtilExtension.numberVerificationResults(assureResult)
		progressmonitor.beginTask(assureResult.name, count)
		assureResult.process
	}

	def dispatch void process(AssuranceCaseResult caseResult) {
		caseResult.modelResult.forEach[claimResult|claimResult.process]
	}

	def dispatch void process(ModelResult caseResult) {
		caseResult.claimResult.forEach[claimResult|claimResult.process]
		caseResult.subsystemResult.forEach[claimResult|claimResult.process]
		caseResult.subAssuranceCase.forEach[subcaseResult|subcaseResult.process]
	}

	def dispatch void process(SubsystemResult caseResult) {
		caseResult.claimResult.forEach[claimResult|claimResult.process]
		caseResult.subsystemResult.forEach[subcaseResult|subcaseResult.process]
	}

	def dispatch void process(org.osate.assure.assure.ClaimResult claimResult) {
		claimResult.verificationActivityResult.forEach[vaResult|vaResult.process]
		claimResult.subClaimResult.forEach[subclaimResult|subclaimResult.process]
	}

	def dispatch void process(VerificationActivityResult vaResult) {
		startSubTask(vaResult)
		if (vaResult.executionState != VerificationExecutionState.TODO) {
			doneSubTask(vaResult)
			return;
		}
		if (vaResult.preconditionResult != null) {
			vaResult.preconditionResult.process
			if (!vaResult.preconditionResult.isSuccess) {
				doneSubTask(vaResult)
				return
			}
		}
		runVerificationMethod(vaResult)
		if (vaResult.validationResult != null) {
			vaResult.validationResult.process
		}
		doneSubTask(vaResult)
	}

	def dispatch void process(ElseResult vaResult) {
		vaResult.first.forEach[expr|expr.process]
		if (vaResult.first.hasError) {
			vaResult.recordElse(ElseType.ERROR)
			vaResult.error.forEach[expr|expr.process]
		} else if (vaResult.first.isFailed) {
			vaResult.recordElse(ElseType.FAIL)
			vaResult.fail.forEach[expr|expr.process]
		} else if (vaResult.first.isTimeout) {
			vaResult.recordElse(ElseType.TIMEOUT)
			vaResult.timeout.forEach[expr|expr.process]
		} else {
			vaResult.recordNoElse
		}
	}

	def dispatch void process(ThenResult vaResult) {
		vaResult.first.forEach[expr|expr.process]
		if (vaResult.first.isSuccess) {
			vaResult.recordNoSkip
			vaResult.second.forEach[expr|expr.process]
		} else {
			vaResult.recordSkip
		}
	}

	def dispatch void process(ValidationResult validationResult) {
		runVerificationMethod(validationResult)
	}

	def dispatch void process(PreconditionResult preconditionResult) {
		runVerificationMethod(preconditionResult)
	}

	/**
	 * who needs to understand the method types?
	 * the runVerificationMethod dispatcher may do different catch methods
	 * The dispatchVerificationMethod may know from its label what type it is.
	 * The methods are expected to return boolean for predicate, 
	 * null or bool for analysis with results in marker/diagnostic, or the result report object
	 */
	def void runVerificationMethod(VerificationResult verificationResult) {
		val method = verificationResult.method;
		var Object res = null
		// target element is the element referred to by the requirement. This may be empty
		val targetElement = verificationResult.targetElement
		// the next outer assurance case object that refers to a system implementation. 
		var instanceroot = verificationResult.assuranceCaseInstanceModel
		if (instanceroot == null) {
			setToError(verificationResult, "Could not find instance model", null)
			return
		}
		var ComponentInstance targetComponent = instanceroot
		targetComponent = findTargetSystemComponentInstance(instanceroot, verificationResult.enclosingSubsystemResult)
		if (targetComponent == null) {
			setToError(verificationResult, "Unresolved target system for claim", null)
			return
		}
		var InstanceObject target = targetComponent;
		if (targetElement != null) {
			if (targetElement.eIsProxy) {
				setToError(verificationResult, "Unresolved target element for claim", targetComponent)
				return
			}
			val x = targetComponent.findElementInstance(targetElement)
			target = x ?: targetComponent
		}
		// The parameters are objects from the Properties Meta model.
		var EList<EObject> parameters
		var Iterable actualParameters
		if (verificationResult instanceof VerificationActivityResult) {
			actualParameters = verificationResult.target.parameters
		} else if (verificationResult instanceof ValidationResult) {
			actualParameters = method.validation.parameters
		} else if (verificationResult instanceof PreconditionResult) {
			actualParameters = method.precondition.parameters
		}

		if (actualParameters.size < method.params.size) {
			setToError(verificationResult, "Fewer actual parameters than formal parameters for verification activity",
				null)
			return
		}
		val nbParams = method.params.size
		var i = 0

		parameters = new BasicEList(actualParameters.size)

		for (ap : actualParameters) {
			var EObject actual
			var String typeName
			var Object pi
			if (ap instanceof FormalParameter) {
				val varesult = verificationResult.eContainer as VerificationActivityResult
				val aps = varesult.target.parameters
				val idx = method.params.indexOf(ap)
				if (idx >= 0) {
					pi = aps.get(idx)
				} else {
					setToError(verificationResult,
						"Referenced formal parameter '" + ap.name + " of method '" + method.name +
							"' does not have an actual value", null)
					return
				}
			} else {
				pi = ap
			}
			if (pi instanceof ValDeclaration) {
				typeName = pi.type
				actual = pi.right
			} else if (pi instanceof AVariableReference) {
				// handle Val reference if AExpression is used
				val pari = pi.variable
				if (pari instanceof ValDeclaration) {
					typeName = pari.type
					actual = pari.right
				}
			} else {
				// the other types if AExpression is used
				actual = pi as EObject
			}

			// for conversion into Java Object see AssureUtilExtension.convertToJavaObjects 
			if (i < nbParams) {
				var formalParam = method.params.get(i)
				if (actual instanceof NumberValue) {
					if (formalParam.unit != null && actual.unit != null &&
						!formalParam.unit.name.equals(actual.unit.name)) {
						actual = convertValueToUnit(actual, formalParam.unit)
					}
				}
				val paramType = formalParam.parameterType
				if (typeName != null && paramType != null && ! typeName.equals(paramType)) {
					setToError(verificationResult,
						"Parameter '" + formalParam.name + ": mismatched  types '" + paramType + "' and actual '" +
							typeName, null)
					return
				}
			}
			parameters.add(actual)
			i = i + 1
		}
		if (verificationResult instanceof VerificationActivityResult) {
			checkProperties(target, verificationResult)
		}

		try {
			val methodtype = method.methodKind
			switch (methodtype) {
				JavaMethod: {
					// The parameters are objects from the Properties Meta model. May need to get converted to Java base types
					res = VerificationMethodDispatchers.eInstance.workspaceInvoke(methodtype, target, parameters)
					if (res != null) {
						if (res instanceof Boolean) {
							if (res != true) {
								setToFail(verificationResult, "", target);
							} else {
								setToSuccess(verificationResult)
							}
						} else if (res instanceof String) {
							setToSuccess(verificationResult, res, target)
						} else if (res instanceof ResultReport) {
							verificationResult.resultReport = res
						} else {
							setToError(verificationResult, "No result report from analysis", target);
						}
					}
				}
				PluginMethod: {
					// The parameters are objects from the Properties Meta model. It is up to the plugin interface method to convert to Java base types
					res = VerificationMethodDispatchers.eInstance.dispatchVerificationMethod(methodtype, instanceroot,
						parameters) // returning the marker or diagnostic id as string
					if (res instanceof String) {
						addMarkersAsResult(verificationResult, target, res, method)
					} else {
						setToError(verificationResult, "Analysis return type is not a string of MarkerType", target);
					}
				}
				ResoluteMethod: {
					// The parameters are objects from the Properties Meta model. Resolute likes them this way
					AssureUtilExtension.initializeResoluteContext(instanceroot);
					val EvaluationContext context = new EvaluationContext(instanceroot, sets, featToConnsMap);
					val ResoluteInterpreter interpreter = new ResoluteInterpreter(context);
					val provecall = createWrapperProveCall(methodtype, parameters)
					if (provecall == null) {
						setToError(verificationResult,
							"Could not find Resolute Function " + verificationResult.method.name)
					} else {

						// using com.rockwellcollins.atc.resolute.analysis.results.ClaimResult
						val ClaimResult proof = interpreter.evaluateProveStatement(provecall) as ClaimResult
						if (proof.valid) {
							setToSuccess(verificationResult)
						} else {
							val proveri = CommonFactory.eINSTANCE.createResultIssue
							proof.doResoluteResults(proveri)
							setToFail(verificationResult, proveri.issues)
						}
					}
				}
				AgreeMethod: {
					AssureUtilExtension.initializeResoluteContext(instanceroot);
					
					val agreemethod = methodtype as AgreeMethod
					
					if (agreemethod.isAll) { // is recursive
						//System.out.println("AgreeMethodAgreeMethodAgreeMethod executeURI ALL   ");
					
					} else if (agreemethod.singleLayer) {
						System.out.println("AgreeMethodAgreeMethodAgreeMethod executeSystemInstance SINGLE   ");
						
						val AgreeVerifySingleHandler verHandler = new AgreeVerifySingleHandler (verificationResult);
						verHandler.executeSystemInstance(instanceroot);
					}
				}
//					case SupportedTypes.RESOLUTEPREDICATE: {
//					AssureUtilExtension.initializeResoluteContext(instance);
//						val EvaluationContext context = new EvaluationContext(instance, sets, featToConnsMap);
//						val ResoluteEvaluator evaluator = new ResoluteEvaluator(context, null);
//						val fncall = createWrapperFnCall(verificationResult,parameters)
//						if (fncall == null) {
//							setToError(verificationResult,
//								"Could not find Resolute Function " + verificationResult.method.name)
//						} else {
//							try {
//								val ResoluteValue resultvalue = evaluator.caseFnCallExpr(fncall)
//								if (resultvalue instanceof BoolValue) {
//									if (resultvalue.getBool) {
//										setToSuccess(verificationResult)
//									} else {
//										setToFail(verificationResult, "Resolute predicate evaluated to false")
//									}
//								} else {
//									setToError(verificationResult, "Expected boolean result. Found " + resultvalue.type)
//								}
//							} catch (Throwable t) {
//								setToError(verificationResult,
//									"Verification activity did not complete. Exception: " + t.message)
//							}
//						}
//					}
				case ManualMethod: {
				}
			} // end switch on method
		} catch (AssertionError e) {
			setToFail(verificationResult, e);
		} catch (ThreadDeath e) { // don't catch ThreadDeath by accident
			throw e;
		} catch (Throwable e) {
			setToError(verificationResult, e);
			//e.printStackTrace;
		}
		verificationResult.eResource.save(null)
	}

	def ProveStatement createWrapperProveCall(ResoluteMethod rm, EList<EObject> params) {
		val found = rm.methodReference
		val factory = ResoluteFactory.eINSTANCE
		if(found == null) return null
		val call = factory.createFnCallExpr
		call.fn = found
		call.args.add(factory.createThisExpr)
		addParams(call, params)
		val prove = factory.createProveStatement
		prove.expr = call
		prove
	}

	def addParams(FnCallExpr call, EList<EObject> params) {
		for (p : params) {
			if (p instanceof RealLiteral) {
				val realval = ResoluteFactory.eINSTANCE.createRealExpr
				realval.^val = p
				call.args.add(realval)
			} else if (p instanceof IntegerLiteral) {
				val intval = ResoluteFactory.eINSTANCE.createIntExpr
				intval.^val = p
				call.args.add(intval)
			} else if (p instanceof StringLiteral) {
				val stringval = ResoluteFactory.eINSTANCE.createStringExpr
				stringval.^val = p
				call.args.add(stringval)
			} else if (p instanceof BooleanLiteral) {
				val stringval = ResoluteFactory.eINSTANCE.createBoolExpr
				stringval.^val = p
				call.args.add(stringval)
			}
		}
	}

	def createWrapperFnCall(ResoluteMethod vr, EList<EObject> params) {
		val found = vr.methodReference
		val factory = ResoluteFactory.eINSTANCE
		val target = factory.createIdExpr
		target.id = vr.claimSubject
		val call = factory.createFnCallExpr
		call.fn = found
		call.args.add(target)
		addParams(call, params)
		call
	}

	def boolean checkProperties(InstanceObject object, VerificationActivityResult result) {
		val method = result.method
		val properties = method.properties
		val values = result.target.propertyValues

		val iter1 = properties.iterator
		val iter2 = values.iterator
		var success = true;

		while (iter1.hasNext && iter2.hasNext) {
			val property = iter1.next
			val variable = iter2.next

			try {
				val value = variable.right
				if (value instanceof NumberValue) {
					val unit = value.unit
					val reqValue = value.getScaledValue(unit)
					val modelValue = PropertyUtils.getScaledNumberValue(object, property, unit)

					if (reqValue != modelValue) {
						println(
							"Property " + property.getQualifiedName() + ": Value in model (" + modelValue + unit.name +
								") does not match required value (" + reqValue + unit.name + ")")
						result.addErrorIssue(object,
							"Property " + property.getQualifiedName() + ": Value in model (" + modelValue + unit.name +
								") does not match required value (" + reqValue + unit.name + ")")
						result.setToFail
					} else {
						println("   match " + modelValue + " == " + reqValue)
					}
				}
			} catch (Exception e) {
				e.printStackTrace
			}
		}
		return success;
	}
	
}

