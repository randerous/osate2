/*
* generated by Xtext
*/
package org.osate.assure.ui.labeling

import com.google.inject.Inject
import org.osate.assure.assure.FailThenResult
import org.osate.assure.assure.AndThenResult
import org.osate.assure.assure.ResultIssue
import org.osate.assure.assure.ResultIssueType
import org.osate.assure.assure.ClaimResult
import static extension org.osate.assure.util.AssureUtilExtension.*
import org.osate.assure.assure.VerificationActivityResult
import org.osate.assure.assure.AssuranceEvidence
import org.osate.assure.assure.ValidationResult

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class AssureLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
	def text(ClaimResult ele) {
		ele.constructLabel + " "+ele.constructMessage
		+ ele.assureResultCounts
	}
	
	def text(VerificationActivityResult ele) {
		ele.constructLabel +" "+ ele.constructMessage	+ ele.resultState.toTextLabel
		+ ele.assureResultCounts

	}
	
	def text(AssuranceEvidence ele) {
		ele.constructLabel +" "+ ele.constructMessage		
		+ ele.assureResultCounts
	}
	
	def text(ResultIssue ele) {
		if (ele.name == null) return (ele.target?.constructLabel?:"")+ ele.constructMessage
		ele.name + ": " + ele.constructMessage
	}
	
	def text(FailThenResult ele) {
		if (ele.isFailThen) 'failthen' else 'unknownthen'
	}
	def text(AndThenResult ele) {
		'andthen'
	}

	def image(ResultIssue ele) {
		switch(ele.issueType){
			case ResultIssueType.ERROR: 'error.png'
			case ResultIssueType.SUCCESS: 'valid.png'
			case ResultIssueType.WARNING: 'warning.png'
			case ResultIssueType.INFO: 'info.png'
		}
	}
	
	
	def image(ClaimResult ele) {
		if (ele.isSuccessful) return 'claimsuccess.png'
		if (ele.hasFailedorError) return 'claimfail.png'
		return 'claim.png'
	}
	
	def image(VerificationActivityResult ele) {
		if (ele.isSuccessful) return 'evidencesuccess.png'
		if (ele.hasFailedorError) return 'evidencefail.png'
		return 'evidence.png'
	}
	
	def image(AssuranceEvidence ele) {
		if (ele.isSuccessful) return 'assuresuccess.png'
		if (ele.hasFailedorError) return 'assurefail.png'
		return 'assure.png'
	}
	
	def image(ValidationResult ele) {
		if (ele.isSuccessful) return 'validationsuccess.png'
		if (ele.hasFailedorError) return 'validationfail.png'
		return 'validation.png'
	}
	
	def image(AndThenResult ele) {
		if (ele.isSuccessful) return 'valid.png'
		if (ele.hasFailedorError) return 'error.png'
		return 'questionmark.png'
	}
	
	def image(FailThenResult ele) {
		if (ele.isSuccessful) return 'valid.png'
		if (ele.hasFailedorError) return 'error.png'
		return 'questionmark.png'
	}
	
}
