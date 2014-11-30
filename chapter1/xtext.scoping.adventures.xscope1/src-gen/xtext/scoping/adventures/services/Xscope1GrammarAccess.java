/*
* generated by Xtext
*/
package xtext.scoping.adventures.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class Xscope1GrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Program");
		private final Assignment cStatementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_0 = (RuleCall)cStatementsAssignment.eContents().get(0);
		
		//Program:
		//	statements+=Statement*;
		public ParserRule getRule() { return rule; }

		//statements+=Statement*
		public Assignment getStatementsAssignment() { return cStatementsAssignment; }

		//Statement
		public RuleCall getStatementsStatementParserRuleCall_0() { return cStatementsStatementParserRuleCall_0; }
	}

	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVariableParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAssignmentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Statement:
		//	Variable | Assignment;
		public ParserRule getRule() { return rule; }

		//Variable | Assignment
		public Alternatives getAlternatives() { return cAlternatives; }

		//Variable
		public RuleCall getVariableParserRuleCall_0() { return cVariableParserRuleCall_0; }

		//Assignment
		public RuleCall getAssignmentParserRuleCall_1() { return cAssignmentParserRuleCall_1; }
	}

	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Variable:
		//	"var" name=ID;
		public ParserRule getRule() { return rule; }

		//"var" name=ID
		public Group getGroup() { return cGroup; }

		//"var"
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLhsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cLhsVariableCrossReference_0_0 = (CrossReference)cLhsAssignment_0.eContents().get(0);
		private final RuleCall cLhsVariableIDTerminalRuleCall_0_0_1 = (RuleCall)cLhsVariableCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRhsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cRhsVariableCrossReference_2_0 = (CrossReference)cRhsAssignment_2.eContents().get(0);
		private final RuleCall cRhsVariableIDTerminalRuleCall_2_0_1 = (RuleCall)cRhsVariableCrossReference_2_0.eContents().get(1);
		
		//Assignment:
		//	lhs=[Variable] "=" rhs=[Variable];
		public ParserRule getRule() { return rule; }

		//lhs=[Variable] "=" rhs=[Variable]
		public Group getGroup() { return cGroup; }

		//lhs=[Variable]
		public Assignment getLhsAssignment_0() { return cLhsAssignment_0; }

		//[Variable]
		public CrossReference getLhsVariableCrossReference_0_0() { return cLhsVariableCrossReference_0_0; }

		//ID
		public RuleCall getLhsVariableIDTerminalRuleCall_0_0_1() { return cLhsVariableIDTerminalRuleCall_0_0_1; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//rhs=[Variable]
		public Assignment getRhsAssignment_2() { return cRhsAssignment_2; }

		//[Variable]
		public CrossReference getRhsVariableCrossReference_2_0() { return cRhsVariableCrossReference_2_0; }

		//ID
		public RuleCall getRhsVariableIDTerminalRuleCall_2_0_1() { return cRhsVariableIDTerminalRuleCall_2_0_1; }
	}
	
	
	private final ProgramElements pProgram;
	private final StatementElements pStatement;
	private final VariableElements pVariable;
	private final AssignmentElements pAssignment;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Xscope1GrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pStatement = new StatementElements();
		this.pVariable = new VariableElements();
		this.pAssignment = new AssignmentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("xtext.scoping.adventures.Xscope1".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//	statements+=Statement*;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}

	//Statement:
	//	Variable | Assignment;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}

	//Variable:
	//	"var" name=ID;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}

	//Assignment:
	//	lhs=[Variable] "=" rhs=[Variable];
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}