/*
* generated by Xtext
*/
grammar InternalXscope1;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package xtext.scoping.adventures.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package xtext.scoping.adventures.ui.contentassist.antlr.internal; 

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
import xtext.scoping.adventures.services.Xscope1GrammarAccess;

}

@parser::members {
 
 	private Xscope1GrammarAccess grammarAccess;
 	
    public void setGrammarAccess(Xscope1GrammarAccess grammarAccess) {
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




// Entry rule entryRuleProgram
entryRuleProgram 
:
{ before(grammarAccess.getProgramRule()); }
	 ruleProgram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule Program
ruleProgram
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getProgramAccess().getStatementsAssignment()); }
(rule__Program__StatementsAssignment)*
{ after(grammarAccess.getProgramAccess().getStatementsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStatement
entryRuleStatement 
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStatementAccess().getAlternatives()); }
(rule__Statement__Alternatives)
{ after(grammarAccess.getStatementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVariable
entryRuleVariable 
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVariableAccess().getGroup()); }
(rule__Variable__Group__0)
{ after(grammarAccess.getVariableAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAssignment
entryRuleAssignment 
:
{ before(grammarAccess.getAssignmentRule()); }
	 ruleAssignment
{ after(grammarAccess.getAssignmentRule()); } 
	 EOF 
;

// Rule Assignment
ruleAssignment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAssignmentAccess().getGroup()); }
(rule__Assignment__Group__0)
{ after(grammarAccess.getAssignmentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Statement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatementAccess().getVariableParserRuleCall_0()); }
	ruleVariable
{ after(grammarAccess.getStatementAccess().getVariableParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); }
	ruleAssignment
{ after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Variable__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Variable__Group__0__Impl
	rule__Variable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getVarKeyword_0()); }

	'var' 

{ after(grammarAccess.getVariableAccess().getVarKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Variable__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Variable__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getNameAssignment_1()); }
(rule__Variable__NameAssignment_1)
{ after(grammarAccess.getVariableAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Assignment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Assignment__Group__0__Impl
	rule__Assignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssignmentAccess().getLhsAssignment_0()); }
(rule__Assignment__LhsAssignment_0)
{ after(grammarAccess.getAssignmentAccess().getLhsAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Assignment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Assignment__Group__1__Impl
	rule__Assignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Assignment__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Assignment__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssignmentAccess().getRhsAssignment_2()); }
(rule__Assignment__RhsAssignment_2)
{ after(grammarAccess.getAssignmentAccess().getRhsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Program__StatementsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); }
	ruleStatement{ after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__LhsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssignmentAccess().getLhsVariableCrossReference_0_0()); }
(
{ before(grammarAccess.getAssignmentAccess().getLhsVariableIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getAssignmentAccess().getLhsVariableIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getAssignmentAccess().getLhsVariableCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__RhsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssignmentAccess().getRhsVariableCrossReference_2_0()); }
(
{ before(grammarAccess.getAssignmentAccess().getRhsVariableIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getAssignmentAccess().getRhsVariableIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getAssignmentAccess().getRhsVariableCrossReference_2_0()); }
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


