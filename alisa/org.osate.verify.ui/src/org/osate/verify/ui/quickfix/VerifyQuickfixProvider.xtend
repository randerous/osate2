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

/*
* generated by Xtext
*/
package org.osate.verify.ui.quickfix

import com.rockwellcollins.atc.resolute.resolute.BaseType
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.osate.reqspec.reqSpec.Requirement
import org.osate.verify.validation.VerifyValidator
import org.osate.verify.verify.Claim
import org.osate.verify.verify.ResoluteMethod
import org.osate.verify.verify.Verification
import org.osate.verify.verify.VerificationMethod
import org.osate.verify.verify.VerificationPlan
import org.osate.verify.verify.VerifyFactory
import org.osate.verify.verify.VerifyPackage
import org.osate.verify.verify.FormalParameter
import org.osate.verify.verify.impl.FormalParameterImpl
import org.eclipse.xtext.ui.editor.model.edit.IModification

//import org.eclipse.xtext.ui.editor.quickfix.Fix
//import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
//import org.eclipse.xtext.validation.Issue

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class VerifyQuickfixProvider extends DefaultQuickfixProvider {

//	@Fix(MyDslValidator::INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}
	protected VerifyPackage verifyPackage = VerifyPackage.eINSTANCE;
	protected VerifyFactory verifyFactory = verifyPackage.getVerifyFactory();

	/**
	 * QuickFix for adding a claim for a requirement
	 * The issue data array is expected to have two elements:
	 *
	 * issue.getData()[0]: The name of the requirement
	 * issue.getData()[1]: the uri of the requirement
	 * 
	 */
	@Fix(VerifyValidator.MISSING_CLAIM_FOR_REQ)
	def public void fixMissingClaimForRequirement(Issue issue, IssueResolutionAcceptor acceptor) {
		val reqName = issue.getData().head
		val reqURI = issue.getData().get(1)

		acceptor.accept(issue, "Add claim for " + reqName, null, null,
				new ISemanticModification() {
					override apply(EObject element, IModificationContext context) throws Exception {
						val resourceSet = element.eResource().getResourceSet() 
						val req = resourceSet.getEObject(URI.createURI(reqURI), true) as Requirement
						val verificationPlan = element as VerificationPlan
						val Claim claim = verifyFactory.createClaim
						claim.requirement = req
						verificationPlan.claim.add(claim)
					}
				});
	}

	/**
	 * QuickFix for adding claims for multiple requirements
	 * The issue data array is expected to hold URIs
	 *
	 * issue.getData(): the URIs of the requirements
	 * 
	 */
	@Fix(VerifyValidator.MISSING_CLAIM_FOR_MULTIPLE_REQ)
	def public void fixMissingClaimForMultipleRequirements(Issue issue, IssueResolutionAcceptor acceptor) {

		acceptor.accept(issue, "Add a claim for each missing requirement", null, null,
				new ISemanticModification() {
					override apply(EObject element, IModificationContext context) throws Exception {
						val resourceSet = element.eResource().getResourceSet() 
						issue.data.forEach[reqURI|
							val req = resourceSet.getEObject(URI.createURI(reqURI), true) as Requirement
							val verificationPlan = element as VerificationPlan
							val Claim claim = verifyFactory.createClaim
							claim.requirement = req
							verificationPlan.claim.add(claim)
						]
					}
				});
	}

	/**
	 * QuickFix for organizing claims when multiples are missing requirements
	 * The issue data array is expected to hold URIs
	 *
	 * issue.getData(): the URIs of the missing requirements
	 * 
	 */
	@Fix(VerifyValidator.MISSING_REQUIREMENTS_FOR_MULTIPLE_CLAIMS)
	def public void fixOrganizeClaimsMissingRequirements(Issue issue, IssueResolutionAcceptor acceptor) {

		acceptor.accept(issue, "Add claims for missing requirements", null, null,
				new ISemanticModification() {
					override apply(EObject element, IModificationContext context) throws Exception {
						val resourceSet = element.eResource().getResourceSet() 
						val vp = element as VerificationPlan
						val claims = vp.claim
						issue.data.forEach[reqURI|
							val req = resourceSet.getEObject(URI.createURI(reqURI), true) as Requirement
							val verificationPlan = element as VerificationPlan
							val Claim claim = verifyFactory.createClaim
							claim.requirement = req
							verificationPlan.claim.add(claim)
						]
					}
				});
	}

	/**
	 * QuickFix for removing an illegal object in a Verification file
	 * The issue data array is expected to have two elements:
	 *
	 * issue.getData()[0]: The type of element
	 * issue.getData()[1]: The uri of the containing parent
	 * 
	 */
	@Fix(VerifyValidator.ILLEGAL_OBJECT_FOR_FILETYPE)
	def public void fixIllegalObjectForFileTypeInVerify(Issue issue, IssueResolutionAcceptor acceptor) {
		val elementType = issue.getData().head
		val verificationURI = issue.getData().get(1)

		acceptor.accept(issue, "Remove " + elementType + ".", null, null,
				new ISemanticModification() {
					override apply(EObject element, IModificationContext context) throws Exception {
						val resourceSet = element.eResource().getResourceSet() 
						val verification  = resourceSet.getEObject(URI.createURI(verificationURI), true) as Verification
						val illegalObject = element 
						verification.contents.remove(illegalObject)
					}
				});
	}

	/**
	 * QuickFix for merging multiple calims with the same requirement
	 * The issue data array is expected to have multiple elements:
	 *
	 * issue.getData()[0]: The uri of the verification plan
	 * issue.getData()[1]: The name of the requirement duplicate by multiple claims
	 * issue.getData()[2..n]: The uris of the claims with duplicate requirements as the claim passed as the element
	 * 
	 */
	@Fix(VerifyValidator.MULTIPLE_CLAIMS_WITH_DUPLICATE_REQUIREMENTS)
	def public void mergeMultipleClaimsWithDuplicateRequirements(Issue issue, IssueResolutionAcceptor acceptor) {
		val vpURI = issue.data.head
		val reqName = issue.data.get(1)
		val duplicateClaimUris = issue.data.drop(2)
		acceptor.accept(issue, "Merge claims for requirement " + reqName + ".", null, null,
				new ISemanticModification() {
					override apply(EObject element, IModificationContext context) throws Exception {
						val resourceSet = element.eResource().getResourceSet() 
						val claim = element as Claim
						val vp  = resourceSet.getEObject(URI.createURI(vpURI), true) as VerificationPlan
						val duplicateClaims = duplicateClaimUris.map[resourceSet.getEObject(URI.createURI(it), true) as Claim]
						val activitiesToMove = duplicateClaims.map[activities].flatten.groupBy[name].values.map[head]
						vp.claim.removeAll(duplicateClaims)
						claim.activities.addAll(activitiesToMove.filter[actMov |
							!claim.activities.exists[it.name == actMov.name]])
					}
				}
		);
	}

	/**
	 * QuickFix for fixing parameters that don't match the Resolute definition
	 * The issue data array is expected to have two elements:
	 *
	 * issue.getData()[0]: The text of the VerificationMethod
	 * issue.getData()[1]: The revised text of the VerificationMethod with corrected parameters
	 * 
	 */
	@Fix(VerifyValidator.METHOD_PARMS_DO_NOT_MATCH_RESOLUTE_DEFINITION)
	def public void fixMethodParmsDoNotMatchResoluteDefinition(Issue issue, IssueResolutionAcceptor acceptor) {
		val oldVMText = issue.getData().head
		val newVMText = issue.getData().get(1)

		acceptor.accept(issue, "Change method parameters to match Resolute method parameters", null, null, new IModification() {
			override public void apply(IModificationContext context) throws Exception {
				val docText = context.xtextDocument.get
				val vmIndex = docText.indexOf(oldVMText)
				val newDocText = docText.substring(0, vmIndex) + newVMText + docText.substring(vmIndex + oldVMText.length)
				context.xtextDocument.set(newDocText)
			}
		});
	}

//	/**
//	 * QuickFix for changing method parms to match args defined by Resolute Method
//	 * 
//	 */
//	@Fix(VerifyValidator.METHOD_PARMS_DO_NOT_MATCH_RESOLUTE_DEFINITION)
//	def public void fixMethodParmsToMatchResoluteDefinition(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, "Change method parameters to match Resolute method parameters", null, null,
//				new ISemanticModification() {
//					override apply(EObject element, IModificationContext context) throws Exception {
//						val resourceSet = element.eResource().getResourceSet() 
//						val vm = element as VerificationMethod
//						val ResoluteMethod methodKind =  vm.methodKind as ResoluteMethod
//						val vmParms = vm.params
//						val methodReference = methodKind.methodReference 
//						val refArgs = methodReference.args
//						if (!vm.params.empty) {
//							vm.params.removeAll(vmParms)
//						}
//						
////						refArgs.forEach[refArg, j |
////							val baseType = refArg.type as BaseType
////							val refArgType = baseType.type
////							val refArgName = refArg.name
////							val vmParamsSize = vm.params.size
////							
////							if (vmParamsSize < j +1) {
////								val formalParameter = new FormalParameterImpl
////								vm.params.add(new FormalParameter)
////									
////								
////							}
////							vm.params.get
////						]
//					
//						//vm.params = new BasicEList<FormalParameter>				
//					}
//				}
//		);
//	}
	 


}