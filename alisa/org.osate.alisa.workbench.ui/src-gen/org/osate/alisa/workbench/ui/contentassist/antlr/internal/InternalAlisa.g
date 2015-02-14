/*
* generated by Xtext
*/
grammar InternalAlisa;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.osate.alisa.workbench.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.osate.alisa.workbench.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.osate.alisa.workbench.services.AlisaGrammarAccess;

}

@parser::members {
 
 	private AlisaGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(AlisaGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleAlisaWorkArea
entryRuleAlisaWorkArea 
:
{ before(grammarAccess.getAlisaWorkAreaRule()); }
	 ruleAlisaWorkArea
{ after(grammarAccess.getAlisaWorkAreaRule()); } 
	 EOF 
;

// Rule AlisaWorkArea
ruleAlisaWorkArea
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getGroup()); }
(rule__AlisaWorkArea__Group__0)
{ after(grammarAccess.getAlisaWorkAreaAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAssuranceEvidenceConfiguration
entryRuleAssuranceEvidenceConfiguration 
:
{ before(grammarAccess.getAssuranceEvidenceConfigurationRule()); }
	 ruleAssuranceEvidenceConfiguration
{ after(grammarAccess.getAssuranceEvidenceConfigurationRule()); } 
	 EOF 
;

// Rule AssuranceEvidenceConfiguration
ruleAssuranceEvidenceConfiguration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getGroup()); }
(rule__AssuranceEvidenceConfiguration__Group__0)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDescription
entryRuleDescription 
:
{ before(grammarAccess.getDescriptionRule()); }
	 ruleDescription
{ after(grammarAccess.getDescriptionRule()); } 
	 EOF 
;

// Rule Description
ruleDescription
    @init {
		int stackSize = keepStackSize();
    }
	:
(
(
{ before(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); }
(rule__Description__DescriptionAssignment)
{ after(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); }
)
(
{ before(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); }
(rule__Description__DescriptionAssignment)*
{ after(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDescriptionElement
entryRuleDescriptionElement 
:
{ before(grammarAccess.getDescriptionElementRule()); }
	 ruleDescriptionElement
{ after(grammarAccess.getDescriptionElementRule()); } 
	 EOF 
;

// Rule DescriptionElement
ruleDescriptionElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDescriptionElementAccess().getAlternatives()); }
(rule__DescriptionElement__Alternatives)
{ after(grammarAccess.getDescriptionElementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAadlClassifierReference
entryRuleAadlClassifierReference 
:
{ before(grammarAccess.getAadlClassifierReferenceRule()); }
	 ruleAadlClassifierReference
{ after(grammarAccess.getAadlClassifierReferenceRule()); } 
	 EOF 
;

// Rule AadlClassifierReference
ruleAadlClassifierReference
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getGroup()); }
(rule__AadlClassifierReference__Group__0)
{ after(grammarAccess.getAadlClassifierReferenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DescriptionElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDescriptionElementAccess().getTextAssignment_0()); }
(rule__DescriptionElement__TextAssignment_0)
{ after(grammarAccess.getDescriptionElementAccess().getTextAssignment_0()); }
)

    |(
{ before(grammarAccess.getDescriptionElementAccess().getThisTargetAssignment_1()); }
(rule__DescriptionElement__ThisTargetAssignment_1)
{ after(grammarAccess.getDescriptionElementAccess().getThisTargetAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__AlisaWorkArea__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlisaWorkArea__Group__0__Impl
	rule__AlisaWorkArea__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AlisaWorkArea__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getAlisaKeyword_0()); }

	'alisa' 

{ after(grammarAccess.getAlisaWorkAreaAccess().getAlisaKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AlisaWorkArea__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlisaWorkArea__Group__1__Impl
	rule__AlisaWorkArea__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AlisaWorkArea__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getNameAssignment_1()); }
(rule__AlisaWorkArea__NameAssignment_1)
{ after(grammarAccess.getAlisaWorkAreaAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AlisaWorkArea__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AlisaWorkArea__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AlisaWorkArea__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getCasesAssignment_2()); }
(rule__AlisaWorkArea__CasesAssignment_2)*
{ after(grammarAccess.getAlisaWorkAreaAccess().getCasesAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__AssuranceEvidenceConfiguration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group__0__Impl
	rule__AssuranceEvidenceConfiguration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getAssuranceKeyword_0()); }

	'assurance' 

{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getAssuranceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group__1__Impl
	rule__AssuranceEvidenceConfiguration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getTaskKeyword_1()); }

	'task' 

{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getTaskKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group__2__Impl
	rule__AssuranceEvidenceConfiguration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getNameAssignment_2()); }
(rule__AssuranceEvidenceConfiguration__NameAssignment_2)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group__3__Impl
	rule__AssuranceEvidenceConfiguration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getGroup_3()); }
(rule__AssuranceEvidenceConfiguration__Group_3__0)?
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group__4__Impl
	rule__AssuranceEvidenceConfiguration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getForKeyword_4()); }

	'for' 

{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getForKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group__5__Impl
	rule__AssuranceEvidenceConfiguration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSystemAssignment_5()); }
(rule__AssuranceEvidenceConfiguration__SystemAssignment_5)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSystemAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group__6__Impl
	rule__AssuranceEvidenceConfiguration__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getLeftSquareBracketKeyword_6()); }

	'[' 

{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getLeftSquareBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group__7__Impl
	rule__AssuranceEvidenceConfiguration__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7()); }
(rule__AssuranceEvidenceConfiguration__UnorderedGroup_7)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getRightSquareBracketKeyword_8()); }

	']' 

{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getRightSquareBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__AssuranceEvidenceConfiguration__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group_3__0__Impl
	rule__AssuranceEvidenceConfiguration__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getColonKeyword_3_0()); }

	':' 

{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getColonKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getTitleAssignment_3_1()); }
(rule__AssuranceEvidenceConfiguration__TitleAssignment_3_1)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getTitleAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__AssuranceEvidenceConfiguration__Group_7_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group_7_0__0__Impl
	rule__AssuranceEvidenceConfiguration__Group_7_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group_7_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getDescriptionKeyword_7_0_0()); }

	'description' 

{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getDescriptionKeyword_7_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group_7_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group_7_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group_7_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getDescriptionAssignment_7_0_1()); }
(rule__AssuranceEvidenceConfiguration__DescriptionAssignment_7_0_1)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getDescriptionAssignment_7_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__AssuranceEvidenceConfiguration__Group_7_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group_7_1__0__Impl
	rule__AssuranceEvidenceConfiguration__Group_7_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group_7_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getPlansKeyword_7_1_0()); }

	'plans' 

{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getPlansKeyword_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group_7_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group_7_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group_7_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getPlansAssignment_7_1_1()); }
(rule__AssuranceEvidenceConfiguration__PlansAssignment_7_1_1)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getPlansAssignment_7_1_1()); }
)
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getPlansAssignment_7_1_1()); }
(rule__AssuranceEvidenceConfiguration__PlansAssignment_7_1_1)*
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getPlansAssignment_7_1_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}






rule__AssuranceEvidenceConfiguration__Group_7_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group_7_2__0__Impl
	rule__AssuranceEvidenceConfiguration__Group_7_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group_7_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getFilterKeyword_7_2_0()); }

	'filter' 

{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getFilterKeyword_7_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__Group_7_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__Group_7_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__Group_7_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSelectionFilterAssignment_7_2_1()); }
(rule__AssuranceEvidenceConfiguration__SelectionFilterAssignment_7_2_1)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSelectionFilterAssignment_7_2_1()); }
)
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSelectionFilterAssignment_7_2_1()); }
(rule__AssuranceEvidenceConfiguration__SelectionFilterAssignment_7_2_1)*
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSelectionFilterAssignment_7_2_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}






rule__AadlClassifierReference__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group__0__Impl
	rule__AadlClassifierReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AadlClassifierReference__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group__1__Impl
	rule__AadlClassifierReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getColonColonKeyword_1()); }

	'::' 

{ after(grammarAccess.getAadlClassifierReferenceAccess().getColonColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AadlClassifierReference__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group__2__Impl
	rule__AadlClassifierReference__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_2()); }
	RULE_ID
{ after(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AadlClassifierReference__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getGroup_3()); }
(rule__AadlClassifierReference__Group_3__0)?
{ after(grammarAccess.getAadlClassifierReferenceAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__AadlClassifierReference__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group_3__0__Impl
	rule__AadlClassifierReference__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getFullStopKeyword_3_0()); }

	'.' 

{ after(grammarAccess.getAadlClassifierReferenceAccess().getFullStopKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AadlClassifierReference__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AadlClassifierReference__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AadlClassifierReference__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_3_1()); }
	RULE_ID
{ after(grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)?
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__AssuranceEvidenceConfiguration__UnorderedGroup_7
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7());
    }
:
	rule__AssuranceEvidenceConfiguration__UnorderedGroup_7__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7());
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__UnorderedGroup_7__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getGroup_7_0()); }
						(rule__AssuranceEvidenceConfiguration__Group_7_0__0)
						{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getGroup_7_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getGroup_7_1()); }
						(rule__AssuranceEvidenceConfiguration__Group_7_1__0)
						{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getGroup_7_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getGroup_7_2()); }
						(rule__AssuranceEvidenceConfiguration__Group_7_2__0)
						{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getGroup_7_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssuranceEvidenceConfigurationAccess().getUnorderedGroup_7());
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__UnorderedGroup_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__UnorderedGroup_7__Impl
	rule__AssuranceEvidenceConfiguration__UnorderedGroup_7__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__UnorderedGroup_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__UnorderedGroup_7__Impl
	rule__AssuranceEvidenceConfiguration__UnorderedGroup_7__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__AssuranceEvidenceConfiguration__UnorderedGroup_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssuranceEvidenceConfiguration__UnorderedGroup_7__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__AlisaWorkArea__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getAlisaWorkAreaAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AlisaWorkArea__CasesAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlisaWorkAreaAccess().getCasesAssuranceEvidenceConfigurationParserRuleCall_2_0()); }
	ruleAssuranceEvidenceConfiguration{ after(grammarAccess.getAlisaWorkAreaAccess().getCasesAssuranceEvidenceConfigurationParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__TitleAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getTitleSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getTitleSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__SystemAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSystemComponentImplementationCrossReference_5_0()); }
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSystemComponentImplementationAadlClassifierReferenceParserRuleCall_5_0_1()); }
	ruleAadlClassifierReference{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSystemComponentImplementationAadlClassifierReferenceParserRuleCall_5_0_1()); }
)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSystemComponentImplementationCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__DescriptionAssignment_7_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getDescriptionDescriptionParserRuleCall_7_0_1_0()); }
	ruleDescription{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getDescriptionDescriptionParserRuleCall_7_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__PlansAssignment_7_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getPlansVerificationPlanCrossReference_7_1_1_0()); }
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getPlansVerificationPlanQualifiedNameParserRuleCall_7_1_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getPlansVerificationPlanQualifiedNameParserRuleCall_7_1_1_0_1()); }
)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getPlansVerificationPlanCrossReference_7_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssuranceEvidenceConfiguration__SelectionFilterAssignment_7_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSelectionFilterSelectionCategoryCrossReference_7_2_1_0()); }
(
{ before(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSelectionFilterSelectionCategoryIDTerminalRuleCall_7_2_1_0_1()); }
	RULE_ID{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSelectionFilterSelectionCategoryIDTerminalRuleCall_7_2_1_0_1()); }
)
{ after(grammarAccess.getAssuranceEvidenceConfigurationAccess().getSelectionFilterSelectionCategoryCrossReference_7_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Description__DescriptionAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDescriptionAccess().getDescriptionDescriptionElementParserRuleCall_0()); }
	ruleDescriptionElement{ after(grammarAccess.getDescriptionAccess().getDescriptionDescriptionElementParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionElement__TextAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDescriptionElementAccess().getTextSTRINGTerminalRuleCall_0_0()); }
	RULE_STRING{ after(grammarAccess.getDescriptionElementAccess().getTextSTRINGTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionElement__ThisTargetAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDescriptionElementAccess().getThisTargetThisKeyword_1_0()); }
(
{ before(grammarAccess.getDescriptionElementAccess().getThisTargetThisKeyword_1_0()); }

	'this' 

{ after(grammarAccess.getDescriptionElementAccess().getThisTargetThisKeyword_1_0()); }
)

{ after(grammarAccess.getDescriptionElementAccess().getThisTargetThisKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


