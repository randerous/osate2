/*
 * generated by Xtext
 */
package org.osate.assure.generator

import com.google.inject.Inject
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.UniqueEList
import org.osate.aadl2.ComponentClassifier
import org.osate.aadl2.ComponentImplementation
import org.osate.aadl2.ComponentType
import org.osate.alisa.workbench.alisa.AssurancePlan
import org.osate.alisa.workbench.alisa.AssuranceTask
import org.osate.assure.assure.AssuranceEvidence
import org.osate.assure.assure.AssureFactory
import org.osate.assure.assure.ClaimResult
import org.osate.assure.assure.VerificationExecutionState
import org.osate.assure.assure.VerificationExpr
import org.osate.assure.assure.VerificationResultState
import org.osate.categories.categories.RequirementCategory
import org.osate.categories.categories.SelectionCategory
import org.osate.categories.categories.VerificationCategory
import org.osate.verify.util.IVerifyGlobalReferenceFinder
import org.osate.verify.verify.AllExpr
import org.osate.verify.verify.ArgumentExpr
import org.osate.verify.verify.Claim
import org.osate.verify.verify.ElseExpr
import org.osate.verify.verify.RefExpr
import org.osate.verify.verify.ThenExpr

import static extension org.osate.alisa.common.util.CommonUtilExtension.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.osate.verify.verify.VerificationActivity
import org.osate.assure.assure.VerificationResult
import org.osate.verify.verify.VerificationValidation
import org.osate.verify.verify.VerificationPrecondition
import org.osate.verify.verify.VerificationCondition
import org.osate.verify.verify.VerificationPlan

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AssureConstructor {

	val factory = AssureFactory.eINSTANCE

	var EList<SelectionCategory> selectionFilter = null
	var EList<RequirementCategory> requirementFilter = null
	var EList<VerificationCategory> verificationFilter = null

	def constructAssuranceTask(AssuranceTask at) {
		selectionFilter = at.selectionFilter
		requirementFilter = at.requirementFilter
		verificationFilter = at.verificationFilter
		at.assurancePlan?.constructCase
	}

	def constructCase(AssurancePlan acp) {
		acp.target.construct(acp, false)
	}

	def constructSystemEvidence(ComponentClassifier cc, AssurancePlan acp) {
		cc.construct(acp, true)
	}

	@Inject extension IVerifyGlobalReferenceFinder referenceFinder

	def AssuranceEvidence construct(ComponentClassifier cc, AssurancePlan acp, boolean systemEvidence) {
		val myplans = cc.getVerificationPlans(acp);
		var AssuranceEvidence acase = null
		if (!myplans.empty) {
			acase = factory.createAssuranceEvidence
			acase.name = acp.name
			acase.target = acp
			for (myplan : myplans) {
				for (claim : (myplan as VerificationPlan).claim) {
					if (claim.evaluateRequirementFilter)
						acase.claimResult += claim.construct
				}
			}
			for (subci : cc.subcomponentClassifiers) {
				acase.subAssuranceEvidence += subci.filterplans(acp)
			}
		}
		acase
	}

	def AssuranceEvidence filterplans(ComponentClassifier cc, AssurancePlan parentacp) {
		if(cc instanceof ComponentType || cc.skipAssuranceplans(parentacp)) return null
		val subacp = cc.getSubsystemAssuranceplan(parentacp)
		if (subacp != null) {
			subacp.constructCase
		} else {
			cc.constructSystemEvidence(parentacp)
		}
	}

	def subcomponentClassifiers(ComponentClassifier cl) {
		if (cl instanceof ComponentImplementation) {
			val List<ComponentClassifier> result = new UniqueEList<ComponentClassifier>()
			result += cl.allSubcomponents.map[sub|sub.classifier]
			result
		} else {
			Collections.emptyList
		}
	}

	def boolean skipAssuranceplans(ComponentClassifier cc, AssurancePlan parentacp) {
		val assumes = parentacp.assumeSubsystems
		for (cl : assumes) {
			if(cc.isSameorExtends(cl)) return true;
		}
		return false
	}

	def AssurancePlan getSubsystemAssuranceplan(ComponentClassifier cc, AssurancePlan parentacp) {
		val assure = parentacp.assurePlans
		for (ap : assure) {
			if(cc.isSameorExtends(ap.target)) return ap;
		}
		return null
	}

	def ClaimResult construct(Claim claim) {
		val claimresult = factory.createClaimResult
		claimresult.target = claim.requirement
		for (subclaim : claim?.subclaim) {
			claimresult.subClaimResult += subclaim.construct
		}
		if (claim.assert != null) {
			claimresult.verificationActivityResult.construct(claim.assert)
		} else {
			for (va : claim.activities) {
				claimresult.verificationActivityResult.doConstruct(va)
			}
		}
		claimresult
	}

	def void construct(List<VerificationExpr> arl, ArgumentExpr expr) {
		switch expr {
			AllExpr: arl.doConstruct(expr)
			ThenExpr: arl.doConstruct(expr)
			ElseExpr: arl.doConstruct(expr)
			RefExpr: arl.doConstruct(expr)
		}
	}

	def void doConstruct(List<VerificationExpr> arl, AllExpr expr) {
		for (subexpr : expr.elements) {
			arl.construct(subexpr)
		}
	}

	def void doConstruct(List<VerificationExpr> arl, ThenExpr expr) {
		val andres = factory.createThenResult
		andres.first.construct(expr.left)
		andres.second.construct(expr.successor)
		arl += andres
	}

	def void doConstruct(List<VerificationExpr> arl, ElseExpr expr) {
		val elseres = factory.createElseResult
		elseres.first.construct(expr.left)
		elseres.other.construct(expr.other)
		if(expr.fail != null) elseres.fail.construct(expr.fail)
		if(expr.timeout != null) elseres.timeout.construct(expr.timeout)
		arl += elseres
	}


	def void doConstruct(List<VerificationExpr> arl, RefExpr expr) {
		val va = expr.verification
		if (va.evaluateSelectionFilter && va.evaluateVerificationFilter) {
			val vr = factory.createVerificationActivityResult
			vr.resultState = VerificationResultState.TBD
			vr.executionState = VerificationExecutionState.TODO
			vr.target = expr.verification
			arl += vr
			val cond = expr.verification?.method?.condition
			if (cond != null) {
				vr.conditionResult = doConstruct(cond)
			}
		}
	}


	def void doConstruct(List<VerificationExpr> arl, VerificationActivity expr) {
		if (expr.evaluateSelectionFilter) {
		val vr = factory.createVerificationActivityResult
		vr.resultState = VerificationResultState.TBD
		vr.executionState = VerificationExecutionState.TODO
		vr.target = expr
		val cond = expr.method?.condition
		if (cond != null) {
			vr.conditionResult = doConstruct(cond)
		}
		}
	}

	def VerificationResult doConstruct( VerificationCondition vc) {
		var VerificationResult vcr
		switch (vc) {
			VerificationValidation: {
				vcr = factory.createValidationResult
			}
			VerificationPrecondition: {
				vcr = factory.createPreconditionResult
			}
		}
		vcr.resultState = VerificationResultState.TBD
		vcr.executionState = VerificationExecutionState.TODO
		return vcr
	}

	def evaluateSelectionFilter(VerificationActivity expr) {
		val selection = expr.condition
		if (selectionFilter == null || selectionFilter.empty || selection.empty) return true
		val intersect = selection.copyAll
		intersect.retainAll(selectionFilter) 
		!intersect.isEmpty
	}

	def evaluateRequirementFilter(Claim claim) {
		val req = claim.requirement.category
		if (requirementFilter == null || requirementFilter.empty || req.empty) return true
		val intersect = req.copyAll
		intersect.retainAll(requirementFilter) 
		!intersect.isEmpty
	}

	def evaluateVerificationFilter(VerificationActivity va) {
		val vcs = va.method.category
		if (verificationFilter == null || verificationFilter.empty || vcs.empty) return true
		val intersect = vcs.copyAll
		intersect.retainAll(requirementFilter) 
		!intersect.isEmpty
	}

	
}
