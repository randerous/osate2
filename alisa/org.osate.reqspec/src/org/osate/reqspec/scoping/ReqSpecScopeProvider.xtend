/*
 * generated by Xtext
 */
package org.osate.reqspec.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.osate.alisa.common.common.ShowValue
import org.osate.alisa.common.scoping.AlisaAbstractDeclarativeScopeProvider
import org.osate.reqspec.reqSpec.ContractualElement

import static org.osate.reqspec.util.ReqSpecUtilExtension.*
import org.osate.reqspec.reqSpec.Requirement
import org.osate.reqspec.reqSpec.Goal

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class ReqSpecScopeProvider extends AlisaAbstractDeclarativeScopeProvider{ 
	
	//Reference is from Goal, ReqSpec, or Hazard
	def scope_NamedElement(ContractualElement context, EReference reference) {
		val targetClassifier = contextClassifier(context)
		if (targetClassifier != null){
			targetClassifier.getAllFeatures.scopeFor
		new SimpleScope(IScope::NULLSCOPE, Scopes::scopedElementsFor(targetClassifier.getAllFeatures, QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), true)
		} else {
			IScope.NULLSCOPE
		}
	}
	
	def scope_XVariableDeclaration(ShowValue context, EReference reference) {
		var result = IScope.NULLSCOPE
		val reqspec = containingRequirement(context)
		val reqspecs = containingReqSpecs(context)
		if (!reqspecs.constants.empty){
		 result = new SimpleScope(result, Scopes::scopedElementsFor(reqspecs.constants, QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), true)
		}
		if (!reqspec.constants.empty){ 
		 result = new SimpleScope(result, Scopes::scopedElementsFor(reqspec.constants, QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), true)
		}
		result
		}

}
