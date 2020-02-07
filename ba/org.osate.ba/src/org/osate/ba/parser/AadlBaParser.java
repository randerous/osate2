// Generated from AadlBa.g by ANTLR 4.4
 
/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2013 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the Eclipse Public License as published by Eclipse,
 * either version 2.0 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see 
 * https://www.eclipse.org/legal/epl-2.0/
 */
  
  package org.osate.ba.parser;
  
  import org.eclipse.emf.common.util.BasicEList ;

  import org.eclipse.emf.common.util.EList;

  import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;  
  
  import org.osate.aadl2.parsesupport.AObject;
  import org.osate.aadl2.parsesupport.LocationReference;
  
  import org.osate.annexsupport.AnnexHighlighterPositionAcceptor ;
  
  import org.osate.ba.aadlba.*;
  import org.osate.ba.declarative.* ;
  import org.osate.ba.analyzers.DeclarativeUtils ;
  
  import org.osate.ba.utils.AadlBaLocationReference ;
  
  import org.osate.aadl2.* ;
  import org.osate.aadl2.parsesupport.ParseUtil ;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AadlBaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABS=1, AND=2, ANY=3, BINDING=4, CLASSIFIER=5, COMPLETE=6, COMPUTATION=7, 
		COUNT=8, DISPATCH=9, DO=10, ELSE=11, ELSIF=12, END=13, FALSE=14, FINAL=15, 
		FOR=16, FORALL=17, FRESH=18, FROZEN=19, IF=20, IN=21, INITIAL=22, LOWER_BOUND=23, 
		MOD=24, NOT=25, ON=26, OR=27, OTHERWISE=28, REFERENCE=29, VARIABLES=30, 
		REM=31, STATE=32, STATES=33, STOP=34, TIMEOUT=35, TRANSITIONS=36, TRUE=37, 
		UNTIL=38, UPPER_BOUND=39, WHILE=40, XOR=41, LBRACK=42, RBRACK=43, COMMA=44, 
		LTRANS=45, RTRANS=46, LPAREN=47, RPAREN=48, CONCAT=49, LCURLY=50, RCURLY=51, 
		COLON=52, ASSIGN=53, PROPERTYASSIGN=54, EXCLAM=55, INTERROG=56, GGREATER=57, 
		EXCLLESS=58, EXCLGREATER=59, DOT=60, TICK=61, EQUAL=62, NOTEQUAL=63, LESSTHAN=64, 
		LESSOREQUAL=65, GREATERTHAN=66, GREATEROREQUAL=67, PLUS=68, MINUS=69, 
		STAR=70, DIVIDE=71, STARSTAR=72, DOTDOT=73, SEMICOLON=74, DOUBLECOLON=75, 
		HASH=76, ERR_EQUALEQUAL=77, ERR_END=78, ERR_ELSIF=79, IDENT=80, STRING_LITERAL=81, 
		REAL_LIT=82, INTEGER_LIT=83, WS=84, SL_COMMENT=85;
	public static final String[] tokenNames = {
		"<INVALID>", "'abs'", "'and'", "'any'", "'binding'", "'classifier'", "'complete'", 
		"'computation'", "'count'", "'dispatch'", "'do'", "'else'", "'elsif'", 
		"'end'", "'false'", "'final'", "'for'", "'forall'", "'fresh'", "'frozen'", 
		"'if'", "'in'", "'initial'", "'lower_bound'", "'mod'", "'not'", "'on'", 
		"'or'", "'otherwise'", "'reference'", "'variables'", "'rem'", "'state'", 
		"'states'", "'stop'", "'timeout'", "'transitions'", "'true'", "'until'", 
		"'upper_bound'", "'while'", "'xor'", "'['", "']'", "','", "'-['", "']->'", 
		"'('", "')'", "'&'", "'{'", "'}'", "':'", "':='", "'=>'", "'!'", "'?'", 
		"'>>'", "'!<'", "'!>'", "'.'", "'''", "'='", "'!='", "'<'", "'<='", "'>'", 
		"'>='", "'+'", "'-'", "'*'", "'/'", "'**'", "'..'", "';'", "'::'", "'#'", 
		"'=='", "'endif'", "'elif'", "IDENT", "STRING_LITERAL", "REAL_LIT", "INTEGER_LIT", 
		"WS", "SL_COMMENT"
	};
	public static final int
		RULE_behavior_annex = 0, RULE_behavior_variable_list = 1, RULE_behavior_variable = 2, 
		RULE_data_classifier_property_association = 3, RULE_property_ref = 4, 
		RULE_qualifiable_property = 5, RULE_property_value = 6, RULE_list_property_value = 7, 
		RULE_boolean_property_value = 8, RULE_numeric_range_property_value = 9, 
		RULE_record_property_value = 10, RULE_field_property_association = 11, 
		RULE_unit_reference = 12, RULE_integer_property_value = 13, RULE_signed_int = 14, 
		RULE_real_property_value = 15, RULE_signed_real = 16, RULE_numeric_property_value = 17, 
		RULE_qualifiable_named_element = 18, RULE_unique_component_classifier_reference = 19, 
		RULE_behavior_state_list = 20, RULE_behavior_transition = 21, RULE_behavior_action_block = 22, 
		RULE_action_block = 23, RULE_behavior_condition = 24, RULE_execute_condition = 25, 
		RULE_integer_value_constant = 26, RULE_dispatch_condition = 27, RULE_dispatch_trigger_condition = 28, 
		RULE_mode_switch_trigger_logical_expression = 29, RULE_dispatch_trigger_logical_expression = 30, 
		RULE_dispatch_conjunction = 31, RULE_mode_switch_trigger_conjunction = 32, 
		RULE_behavior_actions = 33, RULE_behavior_action = 34, RULE_if_statement = 35, 
		RULE_elsif_statement = 36, RULE_for_statement = 37, RULE_for_condition = 38, 
		RULE_forall_statement = 39, RULE_forall_condition = 40, RULE_while_statement = 41, 
		RULE_while_condition = 42, RULE_dountil_statement = 43, RULE_element_values = 44, 
		RULE_basic_action = 45, RULE_assignment_action = 46, RULE_target = 47, 
		RULE_qualified_named_element = 48, RULE_communication_action = 49, RULE_timed_action = 50, 
		RULE_in_binding = 51, RULE_processor_parameter_list = 52, RULE_subprogram_parameter_list = 53, 
		RULE_parameter_label = 54, RULE_reference = 55, RULE_array_identifier = 56, 
		RULE_value_constant = 57, RULE_value_constant_or_variable = 58, RULE_value_variable = 59, 
		RULE_value_expression = 60, RULE_relation = 61, RULE_simple_expression = 62, 
		RULE_term = 63, RULE_factor = 64, RULE_logical_operator = 65, RULE_relational_operator = 66, 
		RULE_binary_adding_operator = 67, RULE_unary_adding_operator = 68, RULE_multiplying_operator = 69, 
		RULE_binary_numeric_operator = 70, RULE_unary_numeric_operator = 71, RULE_unary_boolean_operator = 72, 
		RULE_boolean_literal = 73, RULE_integer_range = 74, RULE_integer_value = 75, 
		RULE_behavior_time = 76, RULE_property_reference = 77, RULE_property_name = 78, 
		RULE_numeric_literal = 79, RULE_real_literal = 80, RULE_integer_literal = 81, 
		RULE_string_literal = 82, RULE_numeral = 83;
	public static final String[] ruleNames = {
		"behavior_annex", "behavior_variable_list", "behavior_variable", "data_classifier_property_association", 
		"property_ref", "qualifiable_property", "property_value", "list_property_value", 
		"boolean_property_value", "numeric_range_property_value", "record_property_value", 
		"field_property_association", "unit_reference", "integer_property_value", 
		"signed_int", "real_property_value", "signed_real", "numeric_property_value", 
		"qualifiable_named_element", "unique_component_classifier_reference", 
		"behavior_state_list", "behavior_transition", "behavior_action_block", 
		"action_block", "behavior_condition", "execute_condition", "integer_value_constant", 
		"dispatch_condition", "dispatch_trigger_condition", "mode_switch_trigger_logical_expression", 
		"dispatch_trigger_logical_expression", "dispatch_conjunction", "mode_switch_trigger_conjunction", 
		"behavior_actions", "behavior_action", "if_statement", "elsif_statement", 
		"for_statement", "for_condition", "forall_statement", "forall_condition", 
		"while_statement", "while_condition", "dountil_statement", "element_values", 
		"basic_action", "assignment_action", "target", "qualified_named_element", 
		"communication_action", "timed_action", "in_binding", "processor_parameter_list", 
		"subprogram_parameter_list", "parameter_label", "reference", "array_identifier", 
		"value_constant", "value_constant_or_variable", "value_variable", "value_expression", 
		"relation", "simple_expression", "term", "factor", "logical_operator", 
		"relational_operator", "binary_adding_operator", "unary_adding_operator", 
		"multiplying_operator", "binary_numeric_operator", "unary_numeric_operator", 
		"unary_boolean_operator", "boolean_literal", "integer_range", "integer_value", 
		"behavior_time", "property_reference", "property_name", "numeric_literal", 
		"real_literal", "integer_literal", "string_literal", "numeral"
	};

	@Override
	public String getGrammarFileName() { return "AadlBa.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  protected BehaviorAnnex _ba = null ;
	  
	  protected void notifyDuplicateSymbol(List<TerminalNode> left,
	                                       List<TerminalNode> right,
	                                       String symbolName)
	  {
	    Token token ;
	        
	    if(left.size() > 1)
	    {
	      token = left.get(left.size() -1).getSymbol() ;
	    }
	    else
	    {
	      token = right.get(right.size() -1).getSymbol() ;
	    }
	        
	    notifyErrorListeners(token, "unbalanced " + symbolName, null);
	  }
	  
	  protected void integerLiteralChecker(TerminalNode integerLiteral)
	  {
	    try
	    {
	      String str = integerLiteral.getText() ;
	      ParseUtil.parseAadlInteger(str);
	    }
	    catch(IllegalArgumentException ex)
	    {
	      notifyErrorListeners(integerLiteral.getSymbol(),
	                           "mal-formatted integer literal input \'" + 
	                           integerLiteral.getText() + '\'', null) ;
	    }
	  }
	  
	  protected void realLiteralChecker(TerminalNode realLiteral)
	  {
	    try
	    {
	      String str = realLiteral.getText() ;
	      str = str.replaceAll("_", "") ;
	      ParseUtil.parseAadlReal(str) ;
	    }
	    catch (IllegalArgumentException ex)
	    {
	      notifyErrorListeners(realLiteral.getSymbol(),
	                           "mal-formatted real literal input \'" + 
	                           realLiteral.getText() + '\'', null) ;
	    }
	  }

	public AadlBaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Behavior_annexContext extends ParserRuleContext {
		public BehaviorAnnex result;
		public TerminalNode VARIABLES() { return getToken(AadlBaParser.VARIABLES, 0); }
		public Behavior_transitionContext behavior_transition(int i) {
			return getRuleContext(Behavior_transitionContext.class,i);
		}
		public Behavior_variable_listContext behavior_variable_list(int i) {
			return getRuleContext(Behavior_variable_listContext.class,i);
		}
		public List<Behavior_transitionContext> behavior_transition() {
			return getRuleContexts(Behavior_transitionContext.class);
		}
		public TerminalNode STATES() { return getToken(AadlBaParser.STATES, 0); }
		public Behavior_state_listContext behavior_state_list(int i) {
			return getRuleContext(Behavior_state_listContext.class,i);
		}
		public List<Behavior_variable_listContext> behavior_variable_list() {
			return getRuleContexts(Behavior_variable_listContext.class);
		}
		public List<Behavior_state_listContext> behavior_state_list() {
			return getRuleContexts(Behavior_state_listContext.class);
		}
		public TerminalNode TRANSITIONS() { return getToken(AadlBaParser.TRANSITIONS, 0); }
		public Behavior_annexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior_annex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBehavior_annex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBehavior_annex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBehavior_annex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Behavior_annexContext behavior_annex() throws RecognitionException {
		Behavior_annexContext _localctx = new Behavior_annexContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_behavior_annex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if (_la==VARIABLES) {
				{
				setState(168); match(VARIABLES);
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169); behavior_variable_list(_localctx.result);
					}
					}
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENT );
				}
			}

			setState(182);
			_la = _input.LA(1);
			if (_la==STATES) {
				{
				setState(176); match(STATES);
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(177); behavior_state_list(_localctx.result);
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENT );
				}
			}

			setState(190);
			_la = _input.LA(1);
			if (_la==TRANSITIONS) {
				{
				setState(184); match(TRANSITIONS);
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(185); behavior_transition();
					}
					}
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENT );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Behavior_variable_listContext extends ParserRuleContext {
		public BehaviorAnnex ba;
		public int variableCount;
		public Token separator;
		public Data_classifier_property_associationContext data_classifier_property_association;
		public List<Data_classifier_property_associationContext> property_associations = new ArrayList<Data_classifier_property_associationContext>();
		public Token SEMICOLON;
		public TerminalNode SEMICOLON() { return getToken(AadlBaParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AadlBaParser.COMMA); }
		public TerminalNode COLON() { return getToken(AadlBaParser.COLON, 0); }
		public TerminalNode RCURLY() { return getToken(AadlBaParser.RCURLY, 0); }
		public Data_classifier_property_associationContext data_classifier_property_association(int i) {
			return getRuleContext(Data_classifier_property_associationContext.class,i);
		}
		public TerminalNode LCURLY() { return getToken(AadlBaParser.LCURLY, 0); }
		public Behavior_variableContext behavior_variable(int i) {
			return getRuleContext(Behavior_variableContext.class,i);
		}
		public List<Behavior_variableContext> behavior_variable() {
			return getRuleContexts(Behavior_variableContext.class);
		}
		public List<Data_classifier_property_associationContext> data_classifier_property_association() {
			return getRuleContexts(Data_classifier_property_associationContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(AadlBaParser.COMMA, i);
		}
		public Unique_component_classifier_referenceContext unique_component_classifier_reference() {
			return getRuleContext(Unique_component_classifier_referenceContext.class,0);
		}
		public Behavior_variable_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Behavior_variable_listContext(ParserRuleContext parent, int invokingState, BehaviorAnnex ba) {
			super(parent, invokingState);
			this.ba = ba;
		}
		@Override public int getRuleIndex() { return RULE_behavior_variable_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBehavior_variable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBehavior_variable_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBehavior_variable_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Behavior_variable_listContext behavior_variable_list(BehaviorAnnex ba) throws RecognitionException {
		Behavior_variable_listContext _localctx = new Behavior_variable_listContext(_ctx, getState(), ba);
		enterRule(_localctx, 2, RULE_behavior_variable_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); behavior_variable();

			      ((Behavior_variable_listContext)_localctx).variableCount =  0 ;
			    
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==IDENT) {
				{
				{
				setState(195);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(194); ((Behavior_variable_listContext)_localctx).separator = match(COMMA);
					}
				}

				setState(197); behavior_variable();

				        _localctx.variableCount++ ;
				            
				        if(((Behavior_variable_listContext)_localctx).separator == null) 
				        {
				          try
				          {
				            notifyErrorListeners(_localctx.behavior_variable(_localctx.variableCount -1).getStop(),
				                                 "missing behavior variable separator \',\'", null);
				          }
				          catch(Exception e)
				          {
				            notifyErrorListeners("missing behavior variable separator \',\'") ;
				          }
				        }
				        else
				        {
				          _localctx.separator = null ;
				        }
				      
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205); match(COLON);
			setState(206); unique_component_classifier_reference();
			setState(215);
			_la = _input.LA(1);
			if (_la==LCURLY) {
				{
				setState(207); match(LCURLY);
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(208); ((Behavior_variable_listContext)_localctx).data_classifier_property_association = data_classifier_property_association();
					((Behavior_variable_listContext)_localctx).property_associations.add(((Behavior_variable_listContext)_localctx).data_classifier_property_association);
					}
					}
					setState(211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENT );
				setState(213); match(RCURLY);
				}
			}

			setState(218);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(217); ((Behavior_variable_listContext)_localctx).SEMICOLON = match(SEMICOLON);
				}
			}


			      if(((Behavior_variable_listContext)_localctx).SEMICOLON() == null)
			      {
			        try
			        {
			           notifyErrorListeners(_localctx.unique_component_classifier_reference().getStop(),
			                                "unterminated behavior variable (missing ending \';\')", null) ;
			        }
			        catch(Exception e)
			        {
			          notifyErrorListeners("unterminated behavior variable (missing ending \';\')") ;
			        }
			      }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Behavior_variableContext extends ParserRuleContext {
		public BehaviorVariable result;
		public Integer_value_constantContext integer_value_constant(int i) {
			return getRuleContext(Integer_value_constantContext.class,i);
		}
		public TerminalNode RBRACK(int i) {
			return getToken(AadlBaParser.RBRACK, i);
		}
		public TerminalNode LBRACK(int i) {
			return getToken(AadlBaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AadlBaParser.RBRACK); }
		public TerminalNode IDENT() { return getToken(AadlBaParser.IDENT, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AadlBaParser.LBRACK); }
		public List<Integer_value_constantContext> integer_value_constant() {
			return getRuleContexts(Integer_value_constantContext.class);
		}
		public Behavior_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBehavior_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBehavior_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBehavior_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Behavior_variableContext behavior_variable() throws RecognitionException {
		Behavior_variableContext _localctx = new Behavior_variableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_behavior_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(IDENT);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(223); match(LBRACK);
				setState(224); integer_value_constant();
				setState(225); match(RBRACK);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_classifier_property_associationContext extends ParserRuleContext {
		public DeclarativePropertyAssociation result;
		public Property_refContext property;
		public Property_valueContext ownedValue;
		public TerminalNode SEMICOLON() { return getToken(AadlBaParser.SEMICOLON, 0); }
		public Property_refContext property_ref() {
			return getRuleContext(Property_refContext.class,0);
		}
		public Property_valueContext property_value() {
			return getRuleContext(Property_valueContext.class,0);
		}
		public TerminalNode PROPERTYASSIGN() { return getToken(AadlBaParser.PROPERTYASSIGN, 0); }
		public Data_classifier_property_associationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_classifier_property_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterData_classifier_property_association(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitData_classifier_property_association(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitData_classifier_property_association(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_classifier_property_associationContext data_classifier_property_association() throws RecognitionException {
		Data_classifier_property_associationContext _localctx = new Data_classifier_property_associationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data_classifier_property_association);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); ((Data_classifier_property_associationContext)_localctx).property = property_ref();
			setState(233); match(PROPERTYASSIGN);
			setState(234); ((Data_classifier_property_associationContext)_localctx).ownedValue = property_value();
			setState(235); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_refContext extends ParserRuleContext {
		public QualifiedNamedElement result;
		public Qualifiable_propertyContext qualifiable_property() {
			return getRuleContext(Qualifiable_propertyContext.class,0);
		}
		public Property_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterProperty_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitProperty_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitProperty_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_refContext property_ref() throws RecognitionException {
		Property_refContext _localctx = new Property_refContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_property_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(237); qualifiable_property(_localctx.result);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualifiable_propertyContext extends ParserRuleContext {
		public QualifiedNamedElement result;
		public String id1;
		public String id2;
		public Token identifier1;
		public Token identifier2;
		public TerminalNode DOUBLECOLON(int i) {
			return getToken(AadlBaParser.DOUBLECOLON, i);
		}
		public TerminalNode IDENT(int i) {
			return getToken(AadlBaParser.IDENT, i);
		}
		public List<TerminalNode> DOUBLECOLON() { return getTokens(AadlBaParser.DOUBLECOLON); }
		public List<TerminalNode> IDENT() { return getTokens(AadlBaParser.IDENT); }
		public Qualifiable_propertyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Qualifiable_propertyContext(ParserRuleContext parent, int invokingState, QualifiedNamedElement result) {
			super(parent, invokingState);
			this.result = result;
		}
		@Override public int getRuleIndex() { return RULE_qualifiable_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterQualifiable_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitQualifiable_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitQualifiable_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualifiable_propertyContext qualifiable_property(QualifiedNamedElement result) throws RecognitionException {
		Qualifiable_propertyContext _localctx = new Qualifiable_propertyContext(_ctx, getState(), result);
		enterRule(_localctx, 10, RULE_qualifiable_property);

		    ((Qualifiable_propertyContext)_localctx).id1 =  "";
		    ((Qualifiable_propertyContext)_localctx).id2 =  "";
		  
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239); ((Qualifiable_propertyContext)_localctx).identifier1 = match(IDENT);
					setState(240); match(DOUBLECOLON);
					 
					        ((Qualifiable_propertyContext)_localctx).id1 = _localctx.id1+(_localctx.id1.length() == 0 ? "":"::") + (((Qualifiable_propertyContext)_localctx).identifier1!=null?((Qualifiable_propertyContext)_localctx).identifier1.getText():null) ;
					      
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(247); ((Qualifiable_propertyContext)_localctx).identifier2 = match(IDENT);
			 ((Qualifiable_propertyContext)_localctx).id2 = (((Qualifiable_propertyContext)_localctx).identifier2!=null?((Qualifiable_propertyContext)_localctx).identifier2.getText():null) ; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_valueContext extends ParserRuleContext {
		public DeclarativePropertyExpression result;
		public Record_property_valueContext record_property_value() {
			return getRuleContext(Record_property_valueContext.class,0);
		}
		public Real_property_valueContext real_property_value() {
			return getRuleContext(Real_property_valueContext.class,0);
		}
		public Boolean_property_valueContext boolean_property_value() {
			return getRuleContext(Boolean_property_valueContext.class,0);
		}
		public Integer_property_valueContext integer_property_value() {
			return getRuleContext(Integer_property_valueContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public List_property_valueContext list_property_value() {
			return getRuleContext(List_property_valueContext.class,0);
		}
		public Numeric_range_property_valueContext numeric_range_property_value() {
			return getRuleContext(Numeric_range_property_valueContext.class,0);
		}
		public Property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterProperty_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitProperty_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitProperty_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_valueContext property_value() throws RecognitionException {
		Property_valueContext _localctx = new Property_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property_value);
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); record_property_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252); numeric_range_property_value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253); integer_property_value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254); real_property_value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255); list_property_value();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(256); boolean_property_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_property_valueContext extends ParserRuleContext {
		public DeclarativeListValue result;
		public Property_valueContext property_value;
		public List<Property_valueContext> ownedListElement = new ArrayList<Property_valueContext>();
		public Property_valueContext property_value(int i) {
			return getRuleContext(Property_valueContext.class,i);
		}
		public List<Property_valueContext> property_value() {
			return getRuleContexts(Property_valueContext.class);
		}
		public TerminalNode LPAREN() { return getToken(AadlBaParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AadlBaParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(AadlBaParser.RPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(AadlBaParser.COMMA, i);
		}
		public List_property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterList_property_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitList_property_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitList_property_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_property_valueContext list_property_value() throws RecognitionException {
		List_property_valueContext _localctx = new List_property_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list_property_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(LPAREN);
			setState(260); ((List_property_valueContext)_localctx).property_value = property_value();
			((List_property_valueContext)_localctx).ownedListElement.add(((List_property_valueContext)_localctx).property_value);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261); match(COMMA);
				setState(262); ((List_property_valueContext)_localctx).property_value = property_value();
				((List_property_valueContext)_localctx).ownedListElement.add(((List_property_valueContext)_localctx).property_value);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_property_valueContext extends ParserRuleContext {
		public BehaviorBooleanLiteral result;
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Boolean_property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBoolean_property_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBoolean_property_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBoolean_property_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_property_valueContext boolean_property_value() throws RecognitionException {
		Boolean_property_valueContext _localctx = new Boolean_property_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolean_property_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); boolean_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_range_property_valueContext extends ParserRuleContext {
		public DeclarativeRangeValue result;
		public Numeric_property_valueContext lower_bound;
		public Numeric_property_valueContext upper_bound;
		public Numeric_property_valueContext numeric_property_value(int i) {
			return getRuleContext(Numeric_property_valueContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(AadlBaParser.DOTDOT, 0); }
		public List<Numeric_property_valueContext> numeric_property_value() {
			return getRuleContexts(Numeric_property_valueContext.class);
		}
		public Numeric_range_property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_range_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterNumeric_range_property_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitNumeric_range_property_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitNumeric_range_property_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_range_property_valueContext numeric_range_property_value() throws RecognitionException {
		Numeric_range_property_valueContext _localctx = new Numeric_range_property_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numeric_range_property_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); ((Numeric_range_property_valueContext)_localctx).lower_bound = numeric_property_value();
			setState(273); match(DOTDOT);
			setState(274); ((Numeric_range_property_valueContext)_localctx).upper_bound = numeric_property_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_property_valueContext extends ParserRuleContext {
		public DeclarativeRecordValue result;
		public Field_property_associationContext field_property_association;
		public List<Field_property_associationContext> field_assign = new ArrayList<Field_property_associationContext>();
		public Field_property_associationContext field_property_association(int i) {
			return getRuleContext(Field_property_associationContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(AadlBaParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(AadlBaParser.LBRACK, 0); }
		public List<Field_property_associationContext> field_property_association() {
			return getRuleContexts(Field_property_associationContext.class);
		}
		public Record_property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterRecord_property_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitRecord_property_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitRecord_property_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_property_valueContext record_property_value() throws RecognitionException {
		Record_property_valueContext _localctx = new Record_property_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_record_property_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(LBRACK);
			setState(277); ((Record_property_valueContext)_localctx).field_property_association = field_property_association();
			((Record_property_valueContext)_localctx).field_assign.add(((Record_property_valueContext)_localctx).field_property_association);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(278); ((Record_property_valueContext)_localctx).field_property_association = field_property_association();
				((Record_property_valueContext)_localctx).field_assign.add(((Record_property_valueContext)_localctx).field_property_association);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_property_associationContext extends ParserRuleContext {
		public DeclarativeBasicPropertyAssociation result;
		public Token property;
		public TerminalNode SEMICOLON() { return getToken(AadlBaParser.SEMICOLON, 0); }
		public Property_valueContext property_value() {
			return getRuleContext(Property_valueContext.class,0);
		}
		public TerminalNode PROPERTYASSIGN() { return getToken(AadlBaParser.PROPERTYASSIGN, 0); }
		public TerminalNode IDENT() { return getToken(AadlBaParser.IDENT, 0); }
		public Field_property_associationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_property_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterField_property_association(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitField_property_association(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitField_property_association(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_property_associationContext field_property_association() throws RecognitionException {
		Field_property_associationContext _localctx = new Field_property_associationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_field_property_association);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); ((Field_property_associationContext)_localctx).property = match(IDENT);
			setState(287); match(PROPERTYASSIGN);
			setState(288); property_value();
			setState(289); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unit_referenceContext extends ParserRuleContext {
		public QualifiedNamedElement result;
		public Qualifiable_propertyContext qualifiable_property() {
			return getRuleContext(Qualifiable_propertyContext.class,0);
		}
		public Unit_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterUnit_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitUnit_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitUnit_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unit_referenceContext unit_reference() throws RecognitionException {
		Unit_referenceContext _localctx = new Unit_referenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unit_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291); qualifiable_property(_localctx.result);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_property_valueContext extends ParserRuleContext {
		public BehaviorIntegerLiteral result;
		public Signed_intContext value;
		public Unit_referenceContext unit;
		public Unit_referenceContext unit_reference() {
			return getRuleContext(Unit_referenceContext.class,0);
		}
		public Signed_intContext signed_int() {
			return getRuleContext(Signed_intContext.class,0);
		}
		public Integer_property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterInteger_property_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitInteger_property_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitInteger_property_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_property_valueContext integer_property_value() throws RecognitionException {
		Integer_property_valueContext _localctx = new Integer_property_valueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_integer_property_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); ((Integer_property_valueContext)_localctx).value = signed_int();
			setState(295);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(294); ((Integer_property_valueContext)_localctx).unit = unit_reference();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_intContext extends ParserRuleContext {
		public Integer result;
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Signed_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterSigned_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitSigned_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitSigned_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_intContext signed_int() throws RecognitionException {
		Signed_intContext _localctx = new Signed_intContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_signed_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(300); integer_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Real_property_valueContext extends ParserRuleContext {
		public BehaviorRealLiteral result;
		public Signed_realContext value;
		public Unit_referenceContext unit;
		public Unit_referenceContext unit_reference() {
			return getRuleContext(Unit_referenceContext.class,0);
		}
		public Signed_realContext signed_real() {
			return getRuleContext(Signed_realContext.class,0);
		}
		public Real_property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterReal_property_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitReal_property_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitReal_property_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_property_valueContext real_property_value() throws RecognitionException {
		Real_property_valueContext _localctx = new Real_property_valueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_real_property_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); ((Real_property_valueContext)_localctx).value = signed_real();
			setState(304);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(303); ((Real_property_valueContext)_localctx).unit = unit_reference();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_realContext extends ParserRuleContext {
		public Double result;
		public Real_literalContext real_literal() {
			return getRuleContext(Real_literalContext.class,0);
		}
		public Signed_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterSigned_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitSigned_real(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitSigned_real(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_realContext signed_real() throws RecognitionException {
		Signed_realContext _localctx = new Signed_realContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_signed_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(309); real_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_property_valueContext extends ParserRuleContext {
		public DeclarativePropertyExpression result;
		public Real_property_valueContext real_property_value() {
			return getRuleContext(Real_property_valueContext.class,0);
		}
		public Integer_property_valueContext integer_property_value() {
			return getRuleContext(Integer_property_valueContext.class,0);
		}
		public Numeric_property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterNumeric_property_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitNumeric_property_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitNumeric_property_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_property_valueContext numeric_property_value() throws RecognitionException {
		Numeric_property_valueContext _localctx = new Numeric_property_valueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numeric_property_value);
		try {
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311); integer_property_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); real_property_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualifiable_named_elementContext extends ParserRuleContext {
		public QualifiedNamedElement result;
		public String id1;
		public String id2;
		public Token identifier1;
		public Token identifier2;
		public Token identifier3;
		public TerminalNode DOUBLECOLON(int i) {
			return getToken(AadlBaParser.DOUBLECOLON, i);
		}
		public TerminalNode DOT() { return getToken(AadlBaParser.DOT, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(AadlBaParser.IDENT, i);
		}
		public List<TerminalNode> DOUBLECOLON() { return getTokens(AadlBaParser.DOUBLECOLON); }
		public List<TerminalNode> IDENT() { return getTokens(AadlBaParser.IDENT); }
		public Qualifiable_named_elementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Qualifiable_named_elementContext(ParserRuleContext parent, int invokingState, QualifiedNamedElement result) {
			super(parent, invokingState);
			this.result = result;
		}
		@Override public int getRuleIndex() { return RULE_qualifiable_named_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterQualifiable_named_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitQualifiable_named_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitQualifiable_named_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualifiable_named_elementContext qualifiable_named_element(QualifiedNamedElement result) throws RecognitionException {
		Qualifiable_named_elementContext _localctx = new Qualifiable_named_elementContext(_ctx, getState(), result);
		enterRule(_localctx, 36, RULE_qualifiable_named_element);

		    ((Qualifiable_named_elementContext)_localctx).id1 =  "";
		    ((Qualifiable_named_elementContext)_localctx).id2 =  "";
		  
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315); ((Qualifiable_named_elementContext)_localctx).identifier1 = match(IDENT);
					setState(316); match(DOUBLECOLON);
					 
					        ((Qualifiable_named_elementContext)_localctx).id1 = _localctx.id1+(_localctx.id1.length() == 0 ? "":"::") + (((Qualifiable_named_elementContext)_localctx).identifier1!=null?((Qualifiable_named_elementContext)_localctx).identifier1.getText():null) ;
					      
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(323); ((Qualifiable_named_elementContext)_localctx).identifier2 = match(IDENT);
			 ((Qualifiable_named_elementContext)_localctx).id2 = (((Qualifiable_named_elementContext)_localctx).identifier2!=null?((Qualifiable_named_elementContext)_localctx).identifier2.getText():null) ; 
			setState(328);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(325); match(DOT);
				setState(326); ((Qualifiable_named_elementContext)_localctx).identifier3 = match(IDENT);
				 ((Qualifiable_named_elementContext)_localctx).id2 = _localctx.id2+"." + (((Qualifiable_named_elementContext)_localctx).identifier3!=null?((Qualifiable_named_elementContext)_localctx).identifier3.getText():null) ; 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unique_component_classifier_referenceContext extends ParserRuleContext {
		public QualifiedNamedElement result;
		public Qualifiable_named_elementContext qualifiable_named_element() {
			return getRuleContext(Qualifiable_named_elementContext.class,0);
		}
		public Unique_component_classifier_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unique_component_classifier_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterUnique_component_classifier_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitUnique_component_classifier_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitUnique_component_classifier_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unique_component_classifier_referenceContext unique_component_classifier_reference() throws RecognitionException {
		Unique_component_classifier_referenceContext _localctx = new Unique_component_classifier_referenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unique_component_classifier_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(330); qualifiable_named_element(_localctx.result);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Behavior_state_listContext extends ParserRuleContext {
		public BehaviorAnnex ba;
		public int stateCount;
		public Token IDENT;
		public Token separator;
		public Token STATE;
		public Token SEMICOLON;
		public TerminalNode SEMICOLON() { return getToken(AadlBaParser.SEMICOLON, 0); }
		public TerminalNode COMPLETE() { return getToken(AadlBaParser.COMPLETE, 0); }
		public TerminalNode FINAL() { return getToken(AadlBaParser.FINAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AadlBaParser.COMMA); }
		public TerminalNode COLON() { return getToken(AadlBaParser.COLON, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(AadlBaParser.IDENT, i);
		}
		public TerminalNode STATE() { return getToken(AadlBaParser.STATE, 0); }
		public List<TerminalNode> IDENT() { return getTokens(AadlBaParser.IDENT); }
		public TerminalNode COMMA(int i) {
			return getToken(AadlBaParser.COMMA, i);
		}
		public TerminalNode INITIAL() { return getToken(AadlBaParser.INITIAL, 0); }
		public Behavior_state_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Behavior_state_listContext(ParserRuleContext parent, int invokingState, BehaviorAnnex ba) {
			super(parent, invokingState);
			this.ba = ba;
		}
		@Override public int getRuleIndex() { return RULE_behavior_state_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBehavior_state_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBehavior_state_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBehavior_state_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Behavior_state_listContext behavior_state_list(BehaviorAnnex ba) throws RecognitionException {
		Behavior_state_listContext _localctx = new Behavior_state_listContext(_ctx, getState(), ba);
		enterRule(_localctx, 40, RULE_behavior_state_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); ((Behavior_state_listContext)_localctx).IDENT = match(IDENT);

			      ((Behavior_state_listContext)_localctx).stateCount =  0 ;
			    
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==IDENT) {
				{
				{
				setState(335);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(334); ((Behavior_state_listContext)_localctx).separator = match(COMMA);
					}
				}

				setState(337); ((Behavior_state_listContext)_localctx).IDENT = match(IDENT);

				        _localctx.stateCount++ ;
				        
				        if(((Behavior_state_listContext)_localctx).separator == null) 
				        {
				          try
				          {
				            notifyErrorListeners(((Behavior_state_listContext)_localctx).IDENT(_localctx.stateCount -1).getSymbol(),
				                                 "missing behavior state separator \',\'", null);
				          }
				          catch(Exception e)
				          {
				            notifyErrorListeners("missing behavior state separator \',\'") ;
				          }
				        }
				        else
				        {
				          _localctx.separator = null ;
				        }
				      
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344); match(COLON);
			setState(346);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(345); match(INITIAL);
				}
			}

			setState(349);
			_la = _input.LA(1);
			if (_la==COMPLETE) {
				{
				setState(348); match(COMPLETE);
				}
			}

			setState(352);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(351); match(FINAL);
				}
			}

			setState(354); ((Behavior_state_listContext)_localctx).STATE = match(STATE);
			setState(356);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(355); ((Behavior_state_listContext)_localctx).SEMICOLON = match(SEMICOLON);
				}
			}


			      if(((Behavior_state_listContext)_localctx).SEMICOLON() == null)
			      {
			        try
			        {
			          notifyErrorListeners(((Behavior_state_listContext)_localctx).STATE().getSymbol(),
			                               "unterminated behavior state (missing ending \';\')", null) ;
			        }
			        catch(Exception e)
			        {
			          notifyErrorListeners("unterminated behavior state (missing ending \';\')") ;
			        }
			      }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Behavior_transitionContext extends ParserRuleContext {
		public DeclarativeBehaviorTransition result;
		public int srcCount;
		public Token transId;
		public Token separator;
		public Token destId;
		public Token SEMICOLON;
		public TerminalNode SEMICOLON() { return getToken(AadlBaParser.SEMICOLON, 0); }
		public Behavior_conditionContext behavior_condition() {
			return getRuleContext(Behavior_conditionContext.class,0);
		}
		public Behavior_action_blockContext behavior_action_block() {
			return getRuleContext(Behavior_action_blockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AadlBaParser.COLON, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(AadlBaParser.IDENT, i);
		}
		public TerminalNode RBRACK() { return getToken(AadlBaParser.RBRACK, 0); }
		public List<TerminalNode> IDENT() { return getTokens(AadlBaParser.IDENT); }
		public TerminalNode LBRACK() { return getToken(AadlBaParser.LBRACK, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(AadlBaParser.COMMA, i);
		}
		public TerminalNode RTRANS() { return getToken(AadlBaParser.RTRANS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AadlBaParser.COMMA); }
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public TerminalNode LTRANS() { return getToken(AadlBaParser.LTRANS, 0); }
		public Behavior_transitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBehavior_transition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBehavior_transition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBehavior_transition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Behavior_transitionContext behavior_transition() throws RecognitionException {
		Behavior_transitionContext _localctx = new Behavior_transitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_behavior_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(360); ((Behavior_transitionContext)_localctx).transId = match(IDENT);
				setState(365);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(361); match(LBRACK);
					setState(362); numeral();
					setState(363); match(RBRACK);
					}
				}

				setState(367); match(COLON);
				}
				break;
			}
			setState(370); match(IDENT);

			     if(((Behavior_transitionContext)_localctx).transId != null)
			     {
			       ((Behavior_transitionContext)_localctx).srcCount =  1 ;
			     }
			     else
			     {
			       ((Behavior_transitionContext)_localctx).srcCount =  0 ;
			     }
			   
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==IDENT) {
				{
				{
				setState(373);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(372); ((Behavior_transitionContext)_localctx).separator = match(COMMA);
					}
				}

				setState(375); match(IDENT);

				       _localctx.srcCount++ ;
				            
				       if(((Behavior_transitionContext)_localctx).separator == null) 
				       {
				         try
				         {
				           notifyErrorListeners(_localctx.IDENT(_localctx.srcCount -1).getSymbol(),
				                                 "missing behavior state source separator \',\'", null);
				         }
				         catch(Exception e)
				         {
				           notifyErrorListeners("missing behavior state source separator \',\'") ;
				         }
				       }
				       else
				       {
				         _localctx.separator = null ;
				       }
				     
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382); match(LTRANS);
			setState(383); behavior_condition();
			setState(384); match(RTRANS);
			setState(385); ((Behavior_transitionContext)_localctx).destId = match(IDENT);
			setState(387);
			_la = _input.LA(1);
			if (_la==LCURLY) {
				{
				setState(386); behavior_action_block();
				}
			}

			setState(390);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(389); ((Behavior_transitionContext)_localctx).SEMICOLON = match(SEMICOLON);
				}
			}


			     if(((Behavior_transitionContext)_localctx).SEMICOLON() == null)
			     {
			       try
			       {
			         Token token = null ;
			       
			         if(_localctx.behavior_action_block() != null)
			         {
			           token = _localctx.behavior_action_block().getStop() ;
			         }
			         else
			         {
			           token = ((Behavior_transitionContext)_localctx).destId ;
			         }
			         
			         notifyErrorListeners(token,
			                              "unterminated behavior transition (missing ending \';\')", null) ;
			       }
			       catch(Exception e)
			       {
			         notifyErrorListeners("unterminated behavior transition (missing ending \';\')") ;
			       }
			     }
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Behavior_action_blockContext extends ParserRuleContext {
		public BehaviorActionBlock result;
		public Action_blockContext action_block() {
			return getRuleContext(Action_blockContext.class,0);
		}
		public Behavior_timeContext behavior_time() {
			return getRuleContext(Behavior_timeContext.class,0);
		}
		public TerminalNode TIMEOUT() { return getToken(AadlBaParser.TIMEOUT, 0); }
		public Behavior_action_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior_action_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBehavior_action_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBehavior_action_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBehavior_action_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Behavior_action_blockContext behavior_action_block() throws RecognitionException {
		Behavior_action_blockContext _localctx = new Behavior_action_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_behavior_action_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); action_block();
			setState(397);
			_la = _input.LA(1);
			if (_la==TIMEOUT) {
				{
				setState(395); match(TIMEOUT);
				setState(396); behavior_time();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Action_blockContext extends ParserRuleContext {
		public BehaviorActionBlock result;
		public Token LCURLY;
		public Token RCURLY;
		public Behavior_actionsContext behavior_actions() {
			return getRuleContext(Behavior_actionsContext.class,0);
		}
		public TerminalNode RCURLY(int i) {
			return getToken(AadlBaParser.RCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(AadlBaParser.RCURLY); }
		public List<TerminalNode> LCURLY() { return getTokens(AadlBaParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(AadlBaParser.LCURLY, i);
		}
		public Action_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterAction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitAction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitAction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_blockContext action_block() throws RecognitionException {
		Action_blockContext _localctx = new Action_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_action_block);
		try {
			int _alt;
			setState(416);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399); match(LCURLY);
				setState(400); behavior_actions();
				setState(401); match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(403); ((Action_blockContext)_localctx).LCURLY = match(LCURLY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(406); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(408); behavior_actions();
				setState(410); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(409); ((Action_blockContext)_localctx).RCURLY = match(RCURLY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(412); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				        notifyDuplicateSymbol(((Action_blockContext)_localctx).LCURLY(), ((Action_blockContext)_localctx).RCURLY(), "{}") ;
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Behavior_conditionContext extends ParserRuleContext {
		public BehaviorCondition result;
		public Dispatch_conditionContext dispatch_condition() {
			return getRuleContext(Dispatch_conditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(AadlBaParser.ON, 0); }
		public Execute_conditionContext execute_condition() {
			return getRuleContext(Execute_conditionContext.class,0);
		}
		public Mode_switch_trigger_logical_expressionContext mode_switch_trigger_logical_expression() {
			return getRuleContext(Mode_switch_trigger_logical_expressionContext.class,0);
		}
		public Behavior_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBehavior_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBehavior_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBehavior_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Behavior_conditionContext behavior_condition() throws RecognitionException {
		Behavior_conditionContext _localctx = new Behavior_conditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_behavior_condition);
		int _la;
		try {
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(418); match(ON);
				setState(419); dispatch_condition();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(420); match(ON);
				setState(421); mode_switch_trigger_logical_expression();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << FALSE) | (1L << NOT) | (1L << OTHERWISE) | (1L << TIMEOUT) | (1L << TRUE) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PLUS - 68)) | (1L << (MINUS - 68)) | (1L << (HASH - 68)) | (1L << (IDENT - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (REAL_LIT - 68)) | (1L << (INTEGER_LIT - 68)))) != 0)) {
					{
					setState(422); execute_condition();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_conditionContext extends ParserRuleContext {
		public ExecuteCondition result;
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode OTHERWISE() { return getToken(AadlBaParser.OTHERWISE, 0); }
		public TerminalNode TIMEOUT() { return getToken(AadlBaParser.TIMEOUT, 0); }
		public Execute_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterExecute_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitExecute_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitExecute_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_conditionContext execute_condition() throws RecognitionException {
		Execute_conditionContext _localctx = new Execute_conditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_execute_condition);
		try {
			setState(430);
			switch (_input.LA(1)) {
			case ABS:
			case FALSE:
			case NOT:
			case TRUE:
			case LPAREN:
			case PLUS:
			case MINUS:
			case HASH:
			case IDENT:
			case STRING_LITERAL:
			case REAL_LIT:
			case INTEGER_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(427); value_expression();
				}
				break;
			case TIMEOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(428); match(TIMEOUT);
				}
				break;
			case OTHERWISE:
				enterOuterAlt(_localctx, 3);
				{
				setState(429); match(OTHERWISE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_value_constantContext extends ParserRuleContext {
		public IntegerValueConstant result;
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Property_referenceContext property_reference() {
			return getRuleContext(Property_referenceContext.class,0);
		}
		public Integer_value_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_value_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterInteger_value_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitInteger_value_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitInteger_value_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_value_constantContext integer_value_constant() throws RecognitionException {
		Integer_value_constantContext _localctx = new Integer_value_constantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_integer_value_constant);
		try {
			setState(434);
			switch (_input.LA(1)) {
			case INTEGER_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(432); integer_literal();
				}
				break;
			case HASH:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(433); property_reference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dispatch_conditionContext extends ParserRuleContext {
		public DispatchCondition result;
		public int count;
		public Token separator;
		public TerminalNode FROZEN() { return getToken(AadlBaParser.FROZEN, 0); }
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(AadlBaParser.COMMA); }
		public Dispatch_trigger_conditionContext dispatch_trigger_condition() {
			return getRuleContext(Dispatch_trigger_conditionContext.class,0);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public TerminalNode DISPATCH() { return getToken(AadlBaParser.DISPATCH, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(AadlBaParser.COMMA, i);
		}
		public Dispatch_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterDispatch_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitDispatch_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitDispatch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dispatch_conditionContext dispatch_condition() throws RecognitionException {
		Dispatch_conditionContext _localctx = new Dispatch_conditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dispatch_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); match(DISPATCH);
			setState(438);
			_la = _input.LA(1);
			if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (STOP - 34)) | (1L << (TIMEOUT - 34)) | (1L << (IDENT - 34)))) != 0)) {
				{
				setState(437); dispatch_trigger_condition();
				}
			}

			setState(454);
			_la = _input.LA(1);
			if (_la==FROZEN) {
				{
				setState(440); match(FROZEN);
				setState(441); reference();

				       ((Dispatch_conditionContext)_localctx).count =  0 ;
				     
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==IDENT) {
					{
					{
					setState(444);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(443); ((Dispatch_conditionContext)_localctx).separator = match(COMMA);
						}
					}

					setState(446); reference();

					         _localctx.count++ ;
					            
					         if(((Dispatch_conditionContext)_localctx).separator == null) 
					         {
					           try
					           {
					             notifyErrorListeners(_localctx.reference(_localctx.count -1).getStop(),
					                                 "missing frozen port separator \',\'", null);
					           }
					           catch(Exception e)
					           {
					             notifyErrorListeners("missing frozen port separator \',\'") ;
					           }
					         }
					         else
					         {
					           _localctx.separator = null ;
					         }
					       
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dispatch_trigger_conditionContext extends ParserRuleContext {
		public DispatchTriggerCondition result;
		public Dispatch_trigger_logical_expressionContext dispatch_trigger_logical_expression() {
			return getRuleContext(Dispatch_trigger_logical_expressionContext.class,0);
		}
		public TerminalNode STOP() { return getToken(AadlBaParser.STOP, 0); }
		public Behavior_timeContext behavior_time() {
			return getRuleContext(Behavior_timeContext.class,0);
		}
		public TerminalNode TIMEOUT() { return getToken(AadlBaParser.TIMEOUT, 0); }
		public Dispatch_trigger_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch_trigger_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterDispatch_trigger_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitDispatch_trigger_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitDispatch_trigger_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dispatch_trigger_conditionContext dispatch_trigger_condition() throws RecognitionException {
		Dispatch_trigger_conditionContext _localctx = new Dispatch_trigger_conditionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dispatch_trigger_condition);
		int _la;
		try {
			setState(462);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(456); dispatch_trigger_logical_expression();
				}
				break;
			case TIMEOUT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(457); match(TIMEOUT);
				setState(459);
				_la = _input.LA(1);
				if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (HASH - 76)) | (1L << (IDENT - 76)) | (1L << (INTEGER_LIT - 76)))) != 0)) {
					{
					setState(458); behavior_time();
					}
				}

				}
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(461); match(STOP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mode_switch_trigger_logical_expressionContext extends ParserRuleContext {
		public ModeSwitchTriggerLogicalExpression result;
		public List<Mode_switch_trigger_conjunctionContext> mode_switch_trigger_conjunction() {
			return getRuleContexts(Mode_switch_trigger_conjunctionContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(AadlBaParser.OR); }
		public Mode_switch_trigger_conjunctionContext mode_switch_trigger_conjunction(int i) {
			return getRuleContext(Mode_switch_trigger_conjunctionContext.class,i);
		}
		public TerminalNode OR(int i) {
			return getToken(AadlBaParser.OR, i);
		}
		public Mode_switch_trigger_logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mode_switch_trigger_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterMode_switch_trigger_logical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitMode_switch_trigger_logical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitMode_switch_trigger_logical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mode_switch_trigger_logical_expressionContext mode_switch_trigger_logical_expression() throws RecognitionException {
		Mode_switch_trigger_logical_expressionContext _localctx = new Mode_switch_trigger_logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mode_switch_trigger_logical_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); mode_switch_trigger_conjunction();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(465); match(OR);
				setState(466); mode_switch_trigger_conjunction();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dispatch_trigger_logical_expressionContext extends ParserRuleContext {
		public DispatchTriggerLogicalExpression result;
		public List<Dispatch_conjunctionContext> dispatch_conjunction() {
			return getRuleContexts(Dispatch_conjunctionContext.class);
		}
		public Dispatch_conjunctionContext dispatch_conjunction(int i) {
			return getRuleContext(Dispatch_conjunctionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AadlBaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AadlBaParser.OR, i);
		}
		public Dispatch_trigger_logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch_trigger_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterDispatch_trigger_logical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitDispatch_trigger_logical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitDispatch_trigger_logical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dispatch_trigger_logical_expressionContext dispatch_trigger_logical_expression() throws RecognitionException {
		Dispatch_trigger_logical_expressionContext _localctx = new Dispatch_trigger_logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dispatch_trigger_logical_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); dispatch_conjunction();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(473); match(OR);
				setState(474); dispatch_conjunction();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dispatch_conjunctionContext extends ParserRuleContext {
		public DispatchConjunction result;
		public TerminalNode AND(int i) {
			return getToken(AadlBaParser.AND, i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AadlBaParser.AND); }
		public Dispatch_conjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterDispatch_conjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitDispatch_conjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitDispatch_conjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dispatch_conjunctionContext dispatch_conjunction() throws RecognitionException {
		Dispatch_conjunctionContext _localctx = new Dispatch_conjunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dispatch_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); reference();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(481); match(AND);
				setState(482); reference();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mode_switch_trigger_conjunctionContext extends ParserRuleContext {
		public ModeSwitchConjunction result;
		public TerminalNode AND(int i) {
			return getToken(AadlBaParser.AND, i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AadlBaParser.AND); }
		public Mode_switch_trigger_conjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mode_switch_trigger_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterMode_switch_trigger_conjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitMode_switch_trigger_conjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitMode_switch_trigger_conjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mode_switch_trigger_conjunctionContext mode_switch_trigger_conjunction() throws RecognitionException {
		Mode_switch_trigger_conjunctionContext _localctx = new Mode_switch_trigger_conjunctionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mode_switch_trigger_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); reference();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(489); match(AND);
				setState(490); reference();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Behavior_actionsContext extends ParserRuleContext {
		public BehaviorActions result;
		public int actionCount;
		public Token separator;
		public Token ending;
		public List<Behavior_actionContext> behavior_action() {
			return getRuleContexts(Behavior_actionContext.class);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AadlBaParser.SEMICOLON); }
		public TerminalNode CONCAT(int i) {
			return getToken(AadlBaParser.CONCAT, i);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(AadlBaParser.SEMICOLON, i);
		}
		public Behavior_actionContext behavior_action(int i) {
			return getRuleContext(Behavior_actionContext.class,i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(AadlBaParser.CONCAT); }
		public Behavior_actionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBehavior_actions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBehavior_actions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBehavior_actions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Behavior_actionsContext behavior_actions() throws RecognitionException {
		Behavior_actionsContext _localctx = new Behavior_actionsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_behavior_actions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(496); behavior_action();

			     ((Behavior_actionsContext)_localctx).actionCount =  0 ;
			   
			setState(528);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(499);
						_la = _input.LA(1);
						if (_la==SEMICOLON) {
							{
							setState(498); ((Behavior_actionsContext)_localctx).separator = match(SEMICOLON);
							}
						}

						setState(501); behavior_action();

						           _localctx.actionCount++ ;
						         
						           if(((Behavior_actionsContext)_localctx).separator == null) 
						           {
						             try
						             {
						               notifyErrorListeners(_localctx.behavior_action(_localctx.actionCount -1).getStop(),
						                 "missing behavior action sequence separator \';\'", null);
						             }
						             catch (Exception e)
						             {
						               notifyErrorListeners("missing behavior action sequence separator \';\'");
						             }
						           }
						           else
						           {
						             _localctx.separator = null ;
						           }
						         
						}
						} 
					}
					setState(508);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(510);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(509); ((Behavior_actionsContext)_localctx).ending = match(SEMICOLON);
					}
					break;
				}

				         if(((Behavior_actionsContext)_localctx).ending != null)
				         {
				           notifyErrorListeners(((Behavior_actionsContext)_localctx).ending, "extraneous input \'" + (((Behavior_actionsContext)_localctx).ending!=null?((Behavior_actionsContext)_localctx).ending.getText():null) +
				                            "\', delete it", null);
				         }
				       
				}
				break;
			case 2:
				{
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(514);
						_la = _input.LA(1);
						if (_la==CONCAT) {
							{
							setState(513); ((Behavior_actionsContext)_localctx).separator = match(CONCAT);
							}
						}

						setState(516); behavior_action();

						           _localctx.actionCount++ ;
						         
						           if(((Behavior_actionsContext)_localctx).separator == null) 
						           {
						             try
						             {
						               notifyErrorListeners(_localctx.behavior_action(_localctx.actionCount -1).getStop(),
						                 "missing behavior action set separator \'&\'", null);
						             }
						             catch (Exception e)
						             {
						               notifyErrorListeners("missing behavior action set separator \'&\'");
						             }
						           }
						           else
						           {
						             _localctx.separator = null ;
						           }
						         
						}
						} 
					}
					setState(523);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(525);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(524); ((Behavior_actionsContext)_localctx).ending = match(CONCAT);
					}
					break;
				}

				         if(((Behavior_actionsContext)_localctx).ending != null)
				         {
				           notifyErrorListeners(((Behavior_actionsContext)_localctx).ending, "extraneous input \'" + (((Behavior_actionsContext)_localctx).ending!=null?((Behavior_actionsContext)_localctx).ending.getText():null) +
				                              "\', delete it", null);
				         }
				       
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Behavior_actionContext extends ParserRuleContext {
		public BehaviorAction result;
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Basic_actionContext basic_action() {
			return getRuleContext(Basic_actionContext.class,0);
		}
		public Forall_statementContext forall_statement() {
			return getRuleContext(Forall_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Behavior_action_blockContext behavior_action_block() {
			return getRuleContext(Behavior_action_blockContext.class,0);
		}
		public Dountil_statementContext dountil_statement() {
			return getRuleContext(Dountil_statementContext.class,0);
		}
		public Behavior_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBehavior_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBehavior_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBehavior_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Behavior_actionContext behavior_action() throws RecognitionException {
		Behavior_actionContext _localctx = new Behavior_actionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_behavior_action);
		try {
			setState(537);
			switch (_input.LA(1)) {
			case COMPUTATION:
			case STAR:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(530); basic_action();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(531); if_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(532); for_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(533); while_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(534); dountil_statement();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(535); behavior_action_block();
				}
				break;
			case FORALL:
				enterOuterAlt(_localctx, 7);
				{
				setState(536); forall_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public IfStatement result;
		public Token LPAREN;
		public Token RPAREN;
		public Token END;
		public Token ERR_END;
		public TerminalNode ELSE() { return getToken(AadlBaParser.ELSE, 0); }
		public List<TerminalNode> IF() { return getTokens(AadlBaParser.IF); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public List<Behavior_actionsContext> behavior_actions() {
			return getRuleContexts(Behavior_actionsContext.class);
		}
		public Elsif_statementContext elsif_statement(int i) {
			return getRuleContext(Elsif_statementContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AadlBaParser.RPAREN); }
		public TerminalNode ERR_END() { return getToken(AadlBaParser.ERR_END, 0); }
		public TerminalNode IF(int i) {
			return getToken(AadlBaParser.IF, i);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(AadlBaParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AadlBaParser.LPAREN); }
		public Behavior_actionsContext behavior_actions(int i) {
			return getRuleContext(Behavior_actionsContext.class,i);
		}
		public TerminalNode END() { return getToken(AadlBaParser.END, 0); }
		public TerminalNode LPAREN(int i) {
			return getToken(AadlBaParser.LPAREN, i);
		}
		public List<Elsif_statementContext> elsif_statement() {
			return getRuleContexts(Elsif_statementContext.class);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_if_statement);
		int _la;
		try {
			int _alt;
			setState(587);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539); match(IF);
				setState(540); match(LPAREN);
				setState(541); value_expression();
				setState(542); match(RPAREN);
				setState(543); behavior_actions();
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSIF || _la==ERR_ELSIF) {
					{
					{
					setState(544); elsif_statement();
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(552);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(550); match(ELSE);
					setState(551); behavior_actions();
					}
				}

				setState(554); match(END);
				setState(555); match(IF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557); match(IF);
				setState(559); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(558); ((If_statementContext)_localctx).LPAREN = match(LPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(561); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(563); value_expression();
				setState(565); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(564); ((If_statementContext)_localctx).RPAREN = match(RPAREN);
					}
					}
					setState(567); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RPAREN );
				setState(569); behavior_actions();
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(570); elsif_statement();
						}
						} 
					}
					setState(575);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(578);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(576); match(ELSE);
					setState(577); behavior_actions();
					}
					break;
				}
				setState(583);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(580); ((If_statementContext)_localctx).END = match(END);
					setState(581); match(IF);
					}
					break;
				case 2:
					{
					setState(582); ((If_statementContext)_localctx).ERR_END = match(ERR_END);
					}
					break;
				}

				        if(((If_statementContext)_localctx).ERR_END() != null)
				        {
				          String msg = "mismatched input \'" + ((If_statementContext)_localctx).ERR_END().getText() + "\' expecting \'end if\'" ;
				          notifyErrorListeners(((If_statementContext)_localctx).ERR_END().getSymbol(), msg, null) ;
				        }
				        else if(((If_statementContext)_localctx).END() == null)
				        {
				          notifyErrorListeners("unterminated if statement (missing \'end if\')") ;
				        }
				        
				        if(((If_statementContext)_localctx).LPAREN().size() > 1 ||
				           ((If_statementContext)_localctx).RPAREN().size() > 1)
				        {  
				          notifyDuplicateSymbol(((If_statementContext)_localctx).LPAREN(), ((If_statementContext)_localctx).RPAREN(), "()") ;
				        }
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elsif_statementContext extends ParserRuleContext {
		public IfStatement result;
		public Token ERR_ELSIF;
		public Token LPAREN;
		public Token RPAREN;
		public TerminalNode ELSIF() { return getToken(AadlBaParser.ELSIF, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(AadlBaParser.RPAREN, i);
		}
		public Behavior_actionsContext behavior_actions() {
			return getRuleContext(Behavior_actionsContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AadlBaParser.LPAREN); }
		public List<TerminalNode> RPAREN() { return getTokens(AadlBaParser.RPAREN); }
		public TerminalNode ERR_ELSIF() { return getToken(AadlBaParser.ERR_ELSIF, 0); }
		public TerminalNode LPAREN(int i) {
			return getToken(AadlBaParser.LPAREN, i);
		}
		public Elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterElsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitElsif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitElsif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elsif_statementContext elsif_statement() throws RecognitionException {
		Elsif_statementContext _localctx = new Elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elsif_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_la = _input.LA(1);
			if ( !(_la==ELSIF || _la==ERR_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(591); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(590); ((Elsif_statementContext)_localctx).LPAREN = match(LPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(593); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(595); value_expression();
			setState(597); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(596); ((Elsif_statementContext)_localctx).RPAREN = match(RPAREN);
				}
				}
				setState(599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RPAREN );
			setState(601); behavior_actions();

			      if(((Elsif_statementContext)_localctx).LPAREN().size() > 1 ||
			         ((Elsif_statementContext)_localctx).RPAREN().size() > 1   )
			      {  
			          notifyDuplicateSymbol(((Elsif_statementContext)_localctx).LPAREN(), ((Elsif_statementContext)_localctx).RPAREN(), "()") ;
			      }
			      
			      if(((Elsif_statementContext)_localctx).ERR_ELSIF() != null)
			      {
			        String msg = "mismatched input \'" + ((Elsif_statementContext)_localctx).ERR_ELSIF().getText() + "\' expecting \'"
			            + AadlBaLexer.tokenNames[AadlBaLexer.ELSIF] + '\'' ;
			          notifyErrorListeners(((Elsif_statementContext)_localctx).ERR_ELSIF().getSymbol(), msg, null) ;
			      }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public ForOrForAllStatement result;
		public Token LCURLY;
		public Token RCURLY;
		public Behavior_actionsContext behavior_actions() {
			return getRuleContext(Behavior_actionsContext.class,0);
		}
		public TerminalNode RCURLY(int i) {
			return getToken(AadlBaParser.RCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(AadlBaParser.RCURLY); }
		public List<TerminalNode> LCURLY() { return getTokens(AadlBaParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(AadlBaParser.LCURLY, i);
		}
		public For_conditionContext for_condition() {
			return getRuleContext(For_conditionContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_for_statement);
		try {
			int _alt;
			setState(623);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604); for_condition();
				setState(605); match(LCURLY);
				setState(606); behavior_actions();
				setState(607); match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609); for_condition();
				setState(611); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(610); ((For_statementContext)_localctx).LCURLY = match(LCURLY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(613); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(615); behavior_actions();
				setState(617); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(616); ((For_statementContext)_localctx).RCURLY = match(RCURLY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(619); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				        notifyDuplicateSymbol(((For_statementContext)_localctx).LCURLY(), ((For_statementContext)_localctx).RCURLY(), "{}") ;
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_conditionContext extends ParserRuleContext {
		public ForOrForAllStatement result;
		public Token LPAREN;
		public TerminalNode RPAREN(int i) {
			return getToken(AadlBaParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AadlBaParser.LPAREN); }
		public TerminalNode COLON() { return getToken(AadlBaParser.COLON, 0); }
		public TerminalNode FOR() { return getToken(AadlBaParser.FOR, 0); }
		public Element_valuesContext element_values() {
			return getRuleContext(Element_valuesContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AadlBaParser.RPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AadlBaParser.LPAREN, i);
		}
		public TerminalNode IDENT() { return getToken(AadlBaParser.IDENT, 0); }
		public TerminalNode IN() { return getToken(AadlBaParser.IN, 0); }
		public Unique_component_classifier_referenceContext unique_component_classifier_reference() {
			return getRuleContext(Unique_component_classifier_referenceContext.class,0);
		}
		public For_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterFor_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitFor_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitFor_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_conditionContext for_condition() throws RecognitionException {
		For_conditionContext _localctx = new For_conditionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_for_condition);
		int _la;
		try {
			setState(652);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625); match(FOR);
				setState(626); match(LPAREN);
				setState(627); match(IDENT);
				setState(628); match(COLON);
				setState(629); unique_component_classifier_reference();
				setState(630); match(IN);
				setState(631); element_values();
				setState(632); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634); match(FOR);
				setState(636); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(635); ((For_conditionContext)_localctx).LPAREN = match(LPAREN);
					}
					}
					setState(638); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(640); match(IDENT);
				setState(641); match(COLON);
				setState(642); unique_component_classifier_reference();
				setState(643); match(IN);
				setState(644); element_values();
				setState(646); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(645); match(RPAREN);
					}
					}
					setState(648); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RPAREN );

				          notifyDuplicateSymbol(((For_conditionContext)_localctx).LPAREN(), ((For_conditionContext)_localctx).LPAREN(), "()") ;
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forall_statementContext extends ParserRuleContext {
		public ForOrForAllStatement result;
		public Token LCURLY;
		public Token RCURLY;
		public Behavior_actionsContext behavior_actions() {
			return getRuleContext(Behavior_actionsContext.class,0);
		}
		public TerminalNode RCURLY(int i) {
			return getToken(AadlBaParser.RCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(AadlBaParser.RCURLY); }
		public List<TerminalNode> LCURLY() { return getTokens(AadlBaParser.LCURLY); }
		public Forall_conditionContext forall_condition() {
			return getRuleContext(Forall_conditionContext.class,0);
		}
		public TerminalNode LCURLY(int i) {
			return getToken(AadlBaParser.LCURLY, i);
		}
		public Forall_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forall_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterForall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitForall_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitForall_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forall_statementContext forall_statement() throws RecognitionException {
		Forall_statementContext _localctx = new Forall_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forall_statement);
		try {
			int _alt;
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654); forall_condition();
				setState(655); match(LCURLY);
				setState(656); behavior_actions();
				setState(657); match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659); forall_condition();
				setState(661); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(660); ((Forall_statementContext)_localctx).LCURLY = match(LCURLY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(663); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(665); behavior_actions();
				setState(667); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(666); ((Forall_statementContext)_localctx).RCURLY = match(RCURLY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(669); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				        notifyDuplicateSymbol(((Forall_statementContext)_localctx).LCURLY(), ((Forall_statementContext)_localctx).RCURLY(), "{}") ;
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forall_conditionContext extends ParserRuleContext {
		public ForOrForAllStatement result;
		public Token LPAREN;
		public TerminalNode RPAREN(int i) {
			return getToken(AadlBaParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AadlBaParser.LPAREN); }
		public TerminalNode COLON() { return getToken(AadlBaParser.COLON, 0); }
		public Element_valuesContext element_values() {
			return getRuleContext(Element_valuesContext.class,0);
		}
		public TerminalNode FORALL() { return getToken(AadlBaParser.FORALL, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(AadlBaParser.RPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AadlBaParser.LPAREN, i);
		}
		public TerminalNode IDENT() { return getToken(AadlBaParser.IDENT, 0); }
		public TerminalNode IN() { return getToken(AadlBaParser.IN, 0); }
		public Unique_component_classifier_referenceContext unique_component_classifier_reference() {
			return getRuleContext(Unique_component_classifier_referenceContext.class,0);
		}
		public Forall_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forall_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterForall_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitForall_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitForall_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forall_conditionContext forall_condition() throws RecognitionException {
		Forall_conditionContext _localctx = new Forall_conditionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forall_condition);
		int _la;
		try {
			setState(702);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675); match(FORALL);
				setState(676); match(LPAREN);
				setState(677); match(IDENT);
				setState(678); match(COLON);
				setState(679); unique_component_classifier_reference();
				setState(680); match(IN);
				setState(681); element_values();
				setState(682); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684); match(FORALL);
				setState(686); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(685); ((Forall_conditionContext)_localctx).LPAREN = match(LPAREN);
					}
					}
					setState(688); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(690); match(IDENT);
				setState(691); match(COLON);
				setState(692); unique_component_classifier_reference();
				setState(693); match(IN);
				setState(694); element_values();
				setState(696); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(695); match(RPAREN);
					}
					}
					setState(698); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RPAREN );

				          notifyDuplicateSymbol(((Forall_conditionContext)_localctx).LPAREN(), ((Forall_conditionContext)_localctx).LPAREN(), "()") ;
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public WhileOrDoUntilStatement result;
		public Token LCURLY;
		public Token RCURLY;
		public Behavior_actionsContext behavior_actions() {
			return getRuleContext(Behavior_actionsContext.class,0);
		}
		public TerminalNode RCURLY(int i) {
			return getToken(AadlBaParser.RCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(AadlBaParser.RCURLY); }
		public While_conditionContext while_condition() {
			return getRuleContext(While_conditionContext.class,0);
		}
		public List<TerminalNode> LCURLY() { return getTokens(AadlBaParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(AadlBaParser.LCURLY, i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_while_statement);
		try {
			int _alt;
			setState(723);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704); while_condition();
				setState(705); match(LCURLY);
				setState(706); behavior_actions();
				setState(707); match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709); while_condition();
				setState(711); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(710); ((While_statementContext)_localctx).LCURLY = match(LCURLY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(713); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(715); behavior_actions();
				setState(717); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(716); ((While_statementContext)_localctx).RCURLY = match(RCURLY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(719); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				        notifyDuplicateSymbol(((While_statementContext)_localctx).LCURLY(), ((While_statementContext)_localctx).RCURLY(), "{}") ;
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_conditionContext extends ParserRuleContext {
		public WhileOrDoUntilStatement result;
		public Token LPAREN;
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(AadlBaParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AadlBaParser.LPAREN); }
		public List<TerminalNode> RPAREN() { return getTokens(AadlBaParser.RPAREN); }
		public TerminalNode WHILE() { return getToken(AadlBaParser.WHILE, 0); }
		public TerminalNode LPAREN(int i) {
			return getToken(AadlBaParser.LPAREN, i);
		}
		public While_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterWhile_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitWhile_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitWhile_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_conditionContext while_condition() throws RecognitionException {
		While_conditionContext _localctx = new While_conditionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_while_condition);
		int _la;
		try {
			int _alt;
			setState(744);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725); match(WHILE);
				setState(726); match(LPAREN);
				setState(727); value_expression();
				setState(728); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730); match(WHILE);
				setState(732); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(731); ((While_conditionContext)_localctx).LPAREN = match(LPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(734); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(736); value_expression();
				setState(738); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(737); match(RPAREN);
					}
					}
					setState(740); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RPAREN );

				        notifyDuplicateSymbol(((While_conditionContext)_localctx).LPAREN(), ((While_conditionContext)_localctx).LPAREN(), "()") ;
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dountil_statementContext extends ParserRuleContext {
		public WhileOrDoUntilStatement result;
		public Token LPAREN;
		public TerminalNode DO() { return getToken(AadlBaParser.DO, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(AadlBaParser.RPAREN, i);
		}
		public Behavior_actionsContext behavior_actions() {
			return getRuleContext(Behavior_actionsContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AadlBaParser.LPAREN); }
		public TerminalNode UNTIL() { return getToken(AadlBaParser.UNTIL, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(AadlBaParser.RPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AadlBaParser.LPAREN, i);
		}
		public Dountil_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dountil_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterDountil_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitDountil_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitDountil_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dountil_statementContext dountil_statement() throws RecognitionException {
		Dountil_statementContext _localctx = new Dountil_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_dountil_statement);
		int _la;
		try {
			int _alt;
			setState(769);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746); match(DO);
				setState(747); behavior_actions();
				setState(748); match(UNTIL);
				setState(749); match(LPAREN);
				setState(750); value_expression();
				setState(751); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753); match(DO);
				setState(754); behavior_actions();
				setState(755); match(UNTIL);
				setState(757); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(756); ((Dountil_statementContext)_localctx).LPAREN = match(LPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(759); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(761); value_expression();
				setState(763); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(762); match(RPAREN);
					}
					}
					setState(765); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RPAREN );

				        notifyDuplicateSymbol(((Dountil_statementContext)_localctx).LPAREN(), ((Dountil_statementContext)_localctx).LPAREN(), "()") ;
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_valuesContext extends ParserRuleContext {
		public ElementValues result;
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public Integer_rangeContext integer_range() {
			return getRuleContext(Integer_rangeContext.class,0);
		}
		public Element_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterElement_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitElement_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitElement_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_valuesContext element_values() throws RecognitionException {
		Element_valuesContext _localctx = new Element_valuesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_element_values);
		try {
			setState(773);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771); integer_range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772); reference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_actionContext extends ParserRuleContext {
		public BasicAction result;
		public Timed_actionContext timed_action() {
			return getRuleContext(Timed_actionContext.class,0);
		}
		public Communication_actionContext communication_action() {
			return getRuleContext(Communication_actionContext.class,0);
		}
		public Assignment_actionContext assignment_action() {
			return getRuleContext(Assignment_actionContext.class,0);
		}
		public Basic_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBasic_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBasic_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBasic_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_actionContext basic_action() throws RecognitionException {
		Basic_actionContext _localctx = new Basic_actionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_basic_action);
		try {
			setState(778);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(775); assignment_action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776); communication_action();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(777); timed_action();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_actionContext extends ParserRuleContext {
		public AssignmentAction result;
		public Token EQUAL;
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AadlBaParser.ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(AadlBaParser.EQUAL, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode ANY() { return getToken(AadlBaParser.ANY, 0); }
		public Assignment_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterAssignment_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitAssignment_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitAssignment_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_actionContext assignment_action() throws RecognitionException {
		Assignment_actionContext _localctx = new Assignment_actionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_assignment_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780); target();
			setState(781);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==EQUAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(784);
			switch (_input.LA(1)) {
			case ABS:
			case FALSE:
			case NOT:
			case TRUE:
			case LPAREN:
			case PLUS:
			case MINUS:
			case HASH:
			case IDENT:
			case STRING_LITERAL:
			case REAL_LIT:
			case INTEGER_LIT:
				{
				setState(782); value_expression();
				}
				break;
			case ANY:
				{
				setState(783); match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			       if(((Assignment_actionContext)_localctx).EQUAL() != null)
			       {
			         notifyErrorListeners(((Assignment_actionContext)_localctx).EQUAL().getSymbol(),
			           "mismatched input \'" + ((Assignment_actionContext)_localctx).EQUAL().getText() + "\' expecting " + 
			             AadlBaLexer.tokenNames[AadlBaLexer.ASSIGN], null) ;
			       }
			     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public Target result;
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788); reference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_named_elementContext extends ParserRuleContext {
		public QualifiedNamedElement result;
		public String namespaceId;
		public String nameId;
		public Token id1;
		public Token id2;
		public Token id3;
		public TerminalNode DOUBLECOLON(int i) {
			return getToken(AadlBaParser.DOUBLECOLON, i);
		}
		public TerminalNode DOT() { return getToken(AadlBaParser.DOT, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(AadlBaParser.IDENT, i);
		}
		public List<TerminalNode> DOUBLECOLON() { return getTokens(AadlBaParser.DOUBLECOLON); }
		public List<TerminalNode> IDENT() { return getTokens(AadlBaParser.IDENT); }
		public Qualified_named_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_named_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterQualified_named_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitQualified_named_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitQualified_named_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_named_elementContext qualified_named_element() throws RecognitionException {
		Qualified_named_elementContext _localctx = new Qualified_named_elementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_qualified_named_element);

		  ((Qualified_named_elementContext)_localctx).namespaceId =  "";
		  ((Qualified_named_elementContext)_localctx).nameId =  "";

		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(793); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(790); ((Qualified_named_elementContext)_localctx).id1 = match(IDENT);
					setState(791); match(DOUBLECOLON);
					 
					        ((Qualified_named_elementContext)_localctx).namespaceId = _localctx.namespaceId+(_localctx.namespaceId.length() == 0 ? "":"::") + (((Qualified_named_elementContext)_localctx).id1!=null?((Qualified_named_elementContext)_localctx).id1.getText():null) ;
					      
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(795); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(797); ((Qualified_named_elementContext)_localctx).id2 = match(IDENT);
			 
			      ((Qualified_named_elementContext)_localctx).nameId = (((Qualified_named_elementContext)_localctx).id2!=null?((Qualified_named_elementContext)_localctx).id2.getText():null) ;
			    
			setState(802);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(799); match(DOT);
				setState(800); ((Qualified_named_elementContext)_localctx).id3 = match(IDENT);

				        ((Qualified_named_elementContext)_localctx).nameId = _localctx.nameId+ "." + (((Qualified_named_elementContext)_localctx).id3!=null?((Qualified_named_elementContext)_localctx).id3.getText():null) ;
				      
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Communication_actionContext extends ParserRuleContext {
		public CommAction result;
		public Token LPAREN;
		public Token RPAREN;
		public Qualified_named_elementContext qualified_named_element() {
			return getRuleContext(Qualified_named_elementContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AadlBaParser.RPAREN); }
		public TerminalNode STAR() { return getToken(AadlBaParser.STAR, 0); }
		public TerminalNode EXCLLESS() { return getToken(AadlBaParser.EXCLLESS, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode INTERROG() { return getToken(AadlBaParser.INTERROG, 0); }
		public TerminalNode RPAREN(int i) {
			return getToken(AadlBaParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AadlBaParser.LPAREN); }
		public TerminalNode EXCLGREATER() { return getToken(AadlBaParser.EXCLGREATER, 0); }
		public Subprogram_parameter_listContext subprogram_parameter_list() {
			return getRuleContext(Subprogram_parameter_listContext.class,0);
		}
		public TerminalNode GGREATER() { return getToken(AadlBaParser.GGREATER, 0); }
		public TerminalNode EXCLAM() { return getToken(AadlBaParser.EXCLAM, 0); }
		public TerminalNode LPAREN(int i) {
			return getToken(AadlBaParser.LPAREN, i);
		}
		public Communication_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_communication_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterCommunication_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitCommunication_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitCommunication_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Communication_actionContext communication_action() throws RecognitionException {
		Communication_actionContext _localctx = new Communication_actionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_communication_action);
		int _la;
		try {
			int _alt;
			setState(881);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804); qualified_named_element();
				setState(805); match(EXCLAM);
				setState(810);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(806); match(LPAREN);
					setState(807); subprogram_parameter_list();
					setState(808); match(RPAREN);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812); reference();
				setState(860);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(813); match(INTERROG);
					setState(818);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(814); ((Communication_actionContext)_localctx).LPAREN = match(LPAREN);
						setState(815); target();
						setState(816); ((Communication_actionContext)_localctx).RPAREN = match(RPAREN);
						}
					}

					}
					break;
				case 2:
					{
					setState(820); match(GGREATER);
					}
					break;
				case 3:
					{
					setState(821); match(EXCLLESS);
					}
					break;
				case 4:
					{
					setState(822); match(EXCLGREATER);
					}
					break;
				case 5:
					{
					setState(823); match(EXCLAM);
					setState(828);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(824); ((Communication_actionContext)_localctx).LPAREN = match(LPAREN);
						setState(825); subprogram_parameter_list();
						setState(826); ((Communication_actionContext)_localctx).RPAREN = match(RPAREN);
						}
					}

					}
					break;
				case 6:
					{
					setState(830); match(INTERROG);
					setState(842);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(832); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(831); ((Communication_actionContext)_localctx).LPAREN = match(LPAREN);
							}
							}
							setState(834); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LPAREN );
						setState(836); target();
						setState(838); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(837); ((Communication_actionContext)_localctx).RPAREN = match(RPAREN);
							}
							}
							setState(840); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==RPAREN );
						}
					}


					            notifyDuplicateSymbol(((Communication_actionContext)_localctx).LPAREN(), ((Communication_actionContext)_localctx).RPAREN(), "()") ;
					          
					}
					break;
				case 7:
					{
					setState(845); match(EXCLAM);
					setState(857);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(847); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(846); ((Communication_actionContext)_localctx).LPAREN = match(LPAREN);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(849); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(851); subprogram_parameter_list();
						setState(853); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(852); ((Communication_actionContext)_localctx).RPAREN = match(RPAREN);
							}
							}
							setState(855); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==RPAREN );
						}
					}


					            notifyDuplicateSymbol(((Communication_actionContext)_localctx).LPAREN(), ((Communication_actionContext)_localctx).RPAREN(), "()") ;
					          
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(862); match(STAR);
				setState(863);
				_la = _input.LA(1);
				if ( !(_la==EXCLLESS || _la==EXCLGREATER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(864); qualified_named_element();
				setState(865); match(EXCLAM);
				setState(877);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(867); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(866); ((Communication_actionContext)_localctx).LPAREN = match(LPAREN);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(869); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(871); subprogram_parameter_list();
					setState(873); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(872); ((Communication_actionContext)_localctx).RPAREN = match(RPAREN);
						}
						}
						setState(875); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==RPAREN );
					}
				}


				        notifyDuplicateSymbol(((Communication_actionContext)_localctx).LPAREN(), ((Communication_actionContext)_localctx).RPAREN(), "()") ;
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timed_actionContext extends ParserRuleContext {
		public TimedAction result;
		public Token LPAREN;
		public Token RPAREN;
		public In_bindingContext in_binding() {
			return getRuleContext(In_bindingContext.class,0);
		}
		public TerminalNode DOTDOT() { return getToken(AadlBaParser.DOTDOT, 0); }
		public TerminalNode RPAREN(int i) {
			return getToken(AadlBaParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AadlBaParser.LPAREN); }
		public List<TerminalNode> RPAREN() { return getTokens(AadlBaParser.RPAREN); }
		public List<Behavior_timeContext> behavior_time() {
			return getRuleContexts(Behavior_timeContext.class);
		}
		public TerminalNode COMPUTATION() { return getToken(AadlBaParser.COMPUTATION, 0); }
		public TerminalNode LPAREN(int i) {
			return getToken(AadlBaParser.LPAREN, i);
		}
		public Behavior_timeContext behavior_time(int i) {
			return getRuleContext(Behavior_timeContext.class,i);
		}
		public Timed_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timed_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterTimed_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitTimed_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitTimed_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timed_actionContext timed_action() throws RecognitionException {
		Timed_actionContext _localctx = new Timed_actionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_timed_action);
		int _la;
		try {
			setState(915);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(883); match(COMPUTATION);
				setState(884); match(LPAREN);
				setState(885); behavior_time();
				setState(888);
				_la = _input.LA(1);
				if (_la==DOTDOT) {
					{
					setState(886); match(DOTDOT);
					setState(887); behavior_time();
					}
				}

				setState(890); match(RPAREN);
				setState(892);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(891); in_binding(_localctx.result);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(894); match(COMPUTATION);
				setState(896); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(895); ((Timed_actionContext)_localctx).LPAREN = match(LPAREN);
					}
					}
					setState(898); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(900); behavior_time();
				setState(903);
				_la = _input.LA(1);
				if (_la==DOTDOT) {
					{
					setState(901); match(DOTDOT);
					setState(902); behavior_time();
					}
				}

				setState(906); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(905); ((Timed_actionContext)_localctx).RPAREN = match(RPAREN);
					}
					}
					setState(908); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RPAREN );
				setState(911);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(910); in_binding(_localctx.result);
					}
				}


				       notifyDuplicateSymbol(((Timed_actionContext)_localctx).LPAREN(), ((Timed_actionContext)_localctx).RPAREN(), "()") ;
				     
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_bindingContext extends ParserRuleContext {
		public TimedAction ta;
		public Token LPAREN;
		public Token RPAREN;
		public Processor_parameter_listContext processor_parameter_list() {
			return getRuleContext(Processor_parameter_listContext.class,0);
		}
		public TerminalNode BINDING() { return getToken(AadlBaParser.BINDING, 0); }
		public TerminalNode RPAREN(int i) {
			return getToken(AadlBaParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AadlBaParser.LPAREN); }
		public List<TerminalNode> RPAREN() { return getTokens(AadlBaParser.RPAREN); }
		public TerminalNode IN() { return getToken(AadlBaParser.IN, 0); }
		public TerminalNode LPAREN(int i) {
			return getToken(AadlBaParser.LPAREN, i);
		}
		public In_bindingContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public In_bindingContext(ParserRuleContext parent, int invokingState, TimedAction ta) {
			super(parent, invokingState);
			this.ta = ta;
		}
		@Override public int getRuleIndex() { return RULE_in_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterIn_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitIn_binding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitIn_binding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_bindingContext in_binding(TimedAction ta) throws RecognitionException {
		In_bindingContext _localctx = new In_bindingContext(_ctx, getState(), ta);
		enterRule(_localctx, 102, RULE_in_binding);
		int _la;
		try {
			setState(938);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917); match(IN);
				setState(918); match(BINDING);
				setState(919); match(LPAREN);
				setState(920); processor_parameter_list();
				setState(921); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923); match(IN);
				setState(924); match(BINDING);
				setState(926); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(925); ((In_bindingContext)_localctx).LPAREN = match(LPAREN);
					}
					}
					setState(928); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(930); processor_parameter_list();
				setState(932); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(931); ((In_bindingContext)_localctx).RPAREN = match(RPAREN);
					}
					}
					setState(934); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RPAREN );

				        notifyDuplicateSymbol(((In_bindingContext)_localctx).LPAREN(), ((In_bindingContext)_localctx).RPAREN(), "()") ;
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Processor_parameter_listContext extends ParserRuleContext {
		public EList<ProcessorClassifier> result;
		public int count;
		public Token separator;
		public List<TerminalNode> COMMA() { return getTokens(AadlBaParser.COMMA); }
		public Unique_component_classifier_referenceContext unique_component_classifier_reference(int i) {
			return getRuleContext(Unique_component_classifier_referenceContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(AadlBaParser.COMMA, i);
		}
		public List<Unique_component_classifier_referenceContext> unique_component_classifier_reference() {
			return getRuleContexts(Unique_component_classifier_referenceContext.class);
		}
		public Processor_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processor_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterProcessor_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitProcessor_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitProcessor_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Processor_parameter_listContext processor_parameter_list() throws RecognitionException {
		Processor_parameter_listContext _localctx = new Processor_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_processor_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940); unique_component_classifier_reference();

			      ((Processor_parameter_listContext)_localctx).count =  0 ;
			    
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==IDENT) {
				{
				{
				setState(943);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(942); ((Processor_parameter_listContext)_localctx).separator = match(COMMA);
					}
				}

				setState(945); unique_component_classifier_reference();

				        _localctx.count++ ;
				        
				        if(((Processor_parameter_listContext)_localctx).separator == null) 
				        {
				          try
				          {
				            notifyErrorListeners(_localctx.unique_component_classifier_reference(_localctx.count -1).getStop(),
				                                 "missing processor parameter separator \',\'", null);
				          }
				          catch(Exception e)
				          {
				            notifyErrorListeners("missing processor parameter separator \',\'") ;
				          }
				        }
				        else
				        {
				          _localctx.separator = null ;
				        }
				      
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_parameter_listContext extends ParserRuleContext {
		public EList<ParameterLabel> result;
		public int count;
		public Token separator;
		public Parameter_labelContext parameter_label(int i) {
			return getRuleContext(Parameter_labelContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AadlBaParser.COMMA); }
		public List<Parameter_labelContext> parameter_label() {
			return getRuleContexts(Parameter_labelContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(AadlBaParser.COMMA, i);
		}
		public Subprogram_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterSubprogram_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitSubprogram_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitSubprogram_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_parameter_listContext subprogram_parameter_list() throws RecognitionException {
		Subprogram_parameter_listContext _localctx = new Subprogram_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_subprogram_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953); parameter_label();

			     ((Subprogram_parameter_listContext)_localctx).count =  0 ;
			   
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << FALSE) | (1L << NOT) | (1L << TRUE) | (1L << COMMA) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PLUS - 68)) | (1L << (MINUS - 68)) | (1L << (HASH - 68)) | (1L << (IDENT - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (REAL_LIT - 68)) | (1L << (INTEGER_LIT - 68)))) != 0)) {
				{
				{
				setState(956);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(955); ((Subprogram_parameter_listContext)_localctx).separator = match(COMMA);
					}
				}

				setState(958); parameter_label();

				       _localctx.count++ ;
				            
				       if(((Subprogram_parameter_listContext)_localctx).separator == null) 
				       {
				         try
				         {
				           notifyErrorListeners(_localctx.parameter_label(_localctx.count -1).getStop(),
				                               "missing subprogram parameter separator \',\'", null);
				         }
				         catch(Exception e)
				         {
				           notifyErrorListeners("missing subprogram parameter separator \',\'") ;
				         }
				       }
				       else
				       {
				         _localctx.separator = null ;
				       }
				     
				}
				}
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_labelContext extends ParserRuleContext {
		public ParameterLabel result;
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Parameter_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterParameter_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitParameter_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitParameter_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_labelContext parameter_label() throws RecognitionException {
		Parameter_labelContext _localctx = new Parameter_labelContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_parameter_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966); value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public Reference result;
		public List<TerminalNode> DOT() { return getTokens(AadlBaParser.DOT); }
		public List<Array_identifierContext> array_identifier() {
			return getRuleContexts(Array_identifierContext.class);
		}
		public Array_identifierContext array_identifier(int i) {
			return getRuleContext(Array_identifierContext.class,i);
		}
		public TerminalNode DOT(int i) {
			return getToken(AadlBaParser.DOT, i);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968); array_identifier();
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(969); match(DOT);
				setState(970); array_identifier();
				}
				}
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_identifierContext extends ParserRuleContext {
		public ArrayableIdentifier result;
		public TerminalNode RBRACK(int i) {
			return getToken(AadlBaParser.RBRACK, i);
		}
		public List<Integer_valueContext> integer_value() {
			return getRuleContexts(Integer_valueContext.class);
		}
		public TerminalNode LBRACK(int i) {
			return getToken(AadlBaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AadlBaParser.RBRACK); }
		public TerminalNode IDENT() { return getToken(AadlBaParser.IDENT, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AadlBaParser.LBRACK); }
		public Integer_valueContext integer_value(int i) {
			return getRuleContext(Integer_valueContext.class,i);
		}
		public Array_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterArray_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitArray_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitArray_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_identifierContext array_identifier() throws RecognitionException {
		Array_identifierContext _localctx = new Array_identifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_array_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976); match(IDENT);
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(977); match(LBRACK);
				setState(978); integer_value();
				setState(979); match(RBRACK);
				}
				}
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_constantContext extends ParserRuleContext {
		public ValueConstant result;
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Property_referenceContext property_reference() {
			return getRuleContext(Property_referenceContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Value_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterValue_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitValue_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitValue_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_constantContext value_constant() throws RecognitionException {
		Value_constantContext _localctx = new Value_constantContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_value_constant);
		try {
			setState(990);
			switch (_input.LA(1)) {
			case REAL_LIT:
			case INTEGER_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(986); numeric_literal();
				}
				break;
			case HASH:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(987); property_reference();
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(988); boolean_literal();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(989); string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_constant_or_variableContext extends ParserRuleContext {
		public Value result;
		public Token LPAREN;
		public Token RPAREN;
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(AadlBaParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AadlBaParser.LPAREN); }
		public Value_constantContext value_constant() {
			return getRuleContext(Value_constantContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AadlBaParser.RPAREN); }
		public Value_variableContext value_variable() {
			return getRuleContext(Value_variableContext.class,0);
		}
		public TerminalNode LPAREN(int i) {
			return getToken(AadlBaParser.LPAREN, i);
		}
		public Value_constant_or_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_constant_or_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterValue_constant_or_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitValue_constant_or_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitValue_constant_or_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_constant_or_variableContext value_constant_or_variable() throws RecognitionException {
		Value_constant_or_variableContext _localctx = new Value_constant_or_variableContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_value_constant_or_variable);
		try {
			int _alt;
			setState(1011);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992); value_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993); value_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(994); match(LPAREN);
				setState(995); value_expression();
				setState(996); match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(999); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(998); ((Value_constant_or_variableContext)_localctx).LPAREN = match(LPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1001); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1003); value_expression();
				setState(1005); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1004); ((Value_constant_or_variableContext)_localctx).RPAREN = match(RPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1007); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				       notifyDuplicateSymbol(((Value_constant_or_variableContext)_localctx).LPAREN(), ((Value_constant_or_variableContext)_localctx).RPAREN(), "()") ;
				     
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_variableContext extends ParserRuleContext {
		public ValueVariable result;
		public TerminalNode COUNT() { return getToken(AadlBaParser.COUNT, 0); }
		public TerminalNode FRESH() { return getToken(AadlBaParser.FRESH, 0); }
		public TerminalNode INTERROG() { return getToken(AadlBaParser.INTERROG, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode TICK() { return getToken(AadlBaParser.TICK, 0); }
		public Value_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterValue_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitValue_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitValue_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_variableContext value_variable() throws RecognitionException {
		Value_variableContext _localctx = new Value_variableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_value_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013); reference();
			setState(1017);
			switch (_input.LA(1)) {
			case INTERROG:
				{
				setState(1014); match(INTERROG);
				}
				break;
			case TICK:
				{
				setState(1015); match(TICK);
				setState(1016);
				_la = _input.LA(1);
				if ( !(_la==COUNT || _la==FRESH) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ABS:
			case AND:
			case COMPUTATION:
			case DO:
			case ELSE:
			case ELSIF:
			case END:
			case FALSE:
			case FOR:
			case FORALL:
			case IF:
			case MOD:
			case NOT:
			case OR:
			case REM:
			case TRUE:
			case UNTIL:
			case WHILE:
			case XOR:
			case RBRACK:
			case COMMA:
			case RTRANS:
			case LPAREN:
			case RPAREN:
			case CONCAT:
			case LCURLY:
			case RCURLY:
			case EQUAL:
			case NOTEQUAL:
			case LESSTHAN:
			case LESSOREQUAL:
			case GREATERTHAN:
			case GREATEROREQUAL:
			case PLUS:
			case MINUS:
			case STAR:
			case DIVIDE:
			case STARSTAR:
			case DOTDOT:
			case SEMICOLON:
			case HASH:
			case ERR_EQUALEQUAL:
			case ERR_END:
			case ERR_ELSIF:
			case IDENT:
			case STRING_LITERAL:
			case REAL_LIT:
			case INTEGER_LIT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_expressionContext extends ParserRuleContext {
		public ValueExpression result;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public List<Logical_operatorContext> logical_operator() {
			return getRuleContexts(Logical_operatorContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public Logical_operatorContext logical_operator(int i) {
			return getRuleContext(Logical_operatorContext.class,i);
		}
		public Value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterValue_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitValue_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitValue_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_expressionContext value_expression() throws RecognitionException {
		Value_expressionContext _localctx = new Value_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_value_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019); relation();
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) {
				{
				{
				setState(1020); logical_operator();
				setState(1021); relation();
				}
				}
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public Relation result;
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028); simple_expression();
			setState(1032);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (EQUAL - 62)) | (1L << (NOTEQUAL - 62)) | (1L << (LESSTHAN - 62)) | (1L << (LESSOREQUAL - 62)) | (1L << (GREATERTHAN - 62)) | (1L << (GREATEROREQUAL - 62)) | (1L << (ERR_EQUALEQUAL - 62)))) != 0)) {
				{
				setState(1029); relational_operator();
				setState(1030); simple_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_expressionContext extends ParserRuleContext {
		public SimpleExpression result;
		public Binary_adding_operatorContext binary_adding_operator(int i) {
			return getRuleContext(Binary_adding_operatorContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Binary_adding_operatorContext> binary_adding_operator() {
			return getRuleContexts(Binary_adding_operatorContext.class);
		}
		public Unary_adding_operatorContext unary_adding_operator() {
			return getRuleContext(Unary_adding_operatorContext.class,0);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_simple_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1034); unary_adding_operator();
				}
			}

			setState(1037); term();
			setState(1043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1038); binary_adding_operator();
					setState(1039); term();
					}
					} 
				}
				setState(1045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Term result;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public Multiplying_operatorContext multiplying_operator(int i) {
			return getRuleContext(Multiplying_operatorContext.class,i);
		}
		public List<Multiplying_operatorContext> multiplying_operator() {
			return getRuleContexts(Multiplying_operatorContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1046); factor();
			setState(1052);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1047); multiplying_operator();
					setState(1048); factor();
					}
					} 
				}
				setState(1054);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Factor result;
		public List<Value_constant_or_variableContext> value_constant_or_variable() {
			return getRuleContexts(Value_constant_or_variableContext.class);
		}
		public Binary_numeric_operatorContext binary_numeric_operator() {
			return getRuleContext(Binary_numeric_operatorContext.class,0);
		}
		public Value_constant_or_variableContext value_constant_or_variable(int i) {
			return getRuleContext(Value_constant_or_variableContext.class,i);
		}
		public Unary_numeric_operatorContext unary_numeric_operator() {
			return getRuleContext(Unary_numeric_operatorContext.class,0);
		}
		public Unary_boolean_operatorContext unary_boolean_operator() {
			return getRuleContext(Unary_boolean_operatorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_factor);
		int _la;
		try {
			setState(1067);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
			case LPAREN:
			case HASH:
			case IDENT:
			case STRING_LITERAL:
			case REAL_LIT:
			case INTEGER_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055); value_constant_or_variable();
				setState(1059);
				_la = _input.LA(1);
				if (_la==STARSTAR) {
					{
					setState(1056); binary_numeric_operator();
					setState(1057); value_constant_or_variable();
					}
				}

				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061); unary_numeric_operator();
				setState(1062); value_constant_or_variable();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1064); unary_boolean_operator();
				setState(1065); value_constant_or_variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_operatorContext extends ParserRuleContext {
		public LogicalOperator result;
		public TerminalNode XOR() { return getToken(AadlBaParser.XOR, 0); }
		public TerminalNode AND() { return getToken(AadlBaParser.AND, 0); }
		public TerminalNode OR() { return getToken(AadlBaParser.OR, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_operatorContext extends ParserRuleContext {
		public RelationalOperator result;
		public Token ERR_EQUALEQUAL;
		public TerminalNode EQUAL() { return getToken(AadlBaParser.EQUAL, 0); }
		public TerminalNode GREATERTHAN() { return getToken(AadlBaParser.GREATERTHAN, 0); }
		public TerminalNode ERR_EQUALEQUAL() { return getToken(AadlBaParser.ERR_EQUALEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(AadlBaParser.LESSTHAN, 0); }
		public TerminalNode LESSOREQUAL() { return getToken(AadlBaParser.LESSOREQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(AadlBaParser.NOTEQUAL, 0); }
		public TerminalNode GREATEROREQUAL() { return getToken(AadlBaParser.GREATEROREQUAL, 0); }
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_relational_operator);
		try {
			setState(1079);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071); match(EQUAL);
				}
				break;
			case NOTEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072); match(NOTEQUAL);
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1073); match(LESSTHAN);
				}
				break;
			case LESSOREQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1074); match(LESSOREQUAL);
				}
				break;
			case GREATERTHAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1075); match(GREATERTHAN);
				}
				break;
			case GREATEROREQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1076); match(GREATEROREQUAL);
				}
				break;
			case ERR_EQUALEQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1077); ((Relational_operatorContext)_localctx).ERR_EQUALEQUAL = match(ERR_EQUALEQUAL);

				       notifyErrorListeners(((Relational_operatorContext)_localctx).ERR_EQUALEQUAL().getSymbol(),
				                            "mismatched input \'" + ((Relational_operatorContext)_localctx).ERR_EQUALEQUAL().getText() +
				                            "\' expecting " + 
				                            AadlBaLexer.tokenNames[AadlBaLexer.EQUAL], null) ;
				     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_adding_operatorContext extends ParserRuleContext {
		public BinaryAddingOperator result;
		public TerminalNode PLUS() { return getToken(AadlBaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AadlBaParser.MINUS, 0); }
		public Binary_adding_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_adding_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBinary_adding_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBinary_adding_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBinary_adding_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_adding_operatorContext binary_adding_operator() throws RecognitionException {
		Binary_adding_operatorContext _localctx = new Binary_adding_operatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_binary_adding_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_adding_operatorContext extends ParserRuleContext {
		public UnaryAddingOperator result;
		public TerminalNode PLUS() { return getToken(AadlBaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AadlBaParser.MINUS, 0); }
		public Unary_adding_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_adding_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterUnary_adding_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitUnary_adding_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitUnary_adding_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_adding_operatorContext unary_adding_operator() throws RecognitionException {
		Unary_adding_operatorContext _localctx = new Unary_adding_operatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unary_adding_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplying_operatorContext extends ParserRuleContext {
		public MultiplyingOperator result;
		public TerminalNode DIVIDE() { return getToken(AadlBaParser.DIVIDE, 0); }
		public TerminalNode REM() { return getToken(AadlBaParser.REM, 0); }
		public TerminalNode STAR() { return getToken(AadlBaParser.STAR, 0); }
		public TerminalNode MOD() { return getToken(AadlBaParser.MOD, 0); }
		public Multiplying_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplying_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterMultiplying_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitMultiplying_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitMultiplying_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplying_operatorContext multiplying_operator() throws RecognitionException {
		Multiplying_operatorContext _localctx = new Multiplying_operatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_multiplying_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_la = _input.LA(1);
			if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (MOD - 24)) | (1L << (REM - 24)) | (1L << (STAR - 24)) | (1L << (DIVIDE - 24)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_numeric_operatorContext extends ParserRuleContext {
		public BinaryNumericOperator result;
		public TerminalNode STARSTAR() { return getToken(AadlBaParser.STARSTAR, 0); }
		public Binary_numeric_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_numeric_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBinary_numeric_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBinary_numeric_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBinary_numeric_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_numeric_operatorContext binary_numeric_operator() throws RecognitionException {
		Binary_numeric_operatorContext _localctx = new Binary_numeric_operatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_binary_numeric_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087); match(STARSTAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_numeric_operatorContext extends ParserRuleContext {
		public UnaryNumericOperator result;
		public TerminalNode ABS() { return getToken(AadlBaParser.ABS, 0); }
		public Unary_numeric_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_numeric_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterUnary_numeric_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitUnary_numeric_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitUnary_numeric_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_numeric_operatorContext unary_numeric_operator() throws RecognitionException {
		Unary_numeric_operatorContext _localctx = new Unary_numeric_operatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_unary_numeric_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089); match(ABS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_boolean_operatorContext extends ParserRuleContext {
		public UnaryBooleanOperator result;
		public TerminalNode NOT() { return getToken(AadlBaParser.NOT, 0); }
		public Unary_boolean_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_boolean_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterUnary_boolean_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitUnary_boolean_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitUnary_boolean_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_boolean_operatorContext unary_boolean_operator() throws RecognitionException {
		Unary_boolean_operatorContext _localctx = new Unary_boolean_operatorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_unary_boolean_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091); match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public BehaviorBooleanLiteral result;
		public TerminalNode FALSE() { return getToken(AadlBaParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(AadlBaParser.TRUE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_rangeContext extends ParserRuleContext {
		public IntegerRange result;
		public List<Integer_valueContext> integer_value() {
			return getRuleContexts(Integer_valueContext.class);
		}
		public TerminalNode DOTDOT() { return getToken(AadlBaParser.DOTDOT, 0); }
		public Integer_valueContext integer_value(int i) {
			return getRuleContext(Integer_valueContext.class,i);
		}
		public Integer_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterInteger_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitInteger_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitInteger_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_rangeContext integer_range() throws RecognitionException {
		Integer_rangeContext _localctx = new Integer_rangeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_integer_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095); integer_value();
			setState(1096); match(DOTDOT);
			setState(1097); integer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_valueContext extends ParserRuleContext {
		public IntegerValue result;
		public Value_variableContext value_variable() {
			return getRuleContext(Value_variableContext.class,0);
		}
		public Integer_value_constantContext integer_value_constant() {
			return getRuleContext(Integer_value_constantContext.class,0);
		}
		public Integer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterInteger_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitInteger_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitInteger_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_valueContext integer_value() throws RecognitionException {
		Integer_valueContext _localctx = new Integer_valueContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_integer_value);
		try {
			setState(1101);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099); integer_value_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100); value_variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Behavior_timeContext extends ParserRuleContext {
		public DeclarativeTime result;
		public Integer_valueContext integer_value() {
			return getRuleContext(Integer_valueContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(AadlBaParser.IDENT, 0); }
		public Behavior_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterBehavior_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitBehavior_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitBehavior_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Behavior_timeContext behavior_time() throws RecognitionException {
		Behavior_timeContext _localctx = new Behavior_timeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_behavior_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103); integer_value();
			setState(1104); match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_referenceContext extends ParserRuleContext {
		public DeclarativePropertyReference result;
		public Token h1;
		public Token h2;
		public List<TerminalNode> DOT() { return getTokens(AadlBaParser.DOT); }
		public Qualified_named_elementContext qualified_named_element() {
			return getRuleContext(Qualified_named_elementContext.class,0);
		}
		public Property_nameContext property_name(int i) {
			return getRuleContext(Property_nameContext.class,i);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public List<Property_nameContext> property_name() {
			return getRuleContexts(Property_nameContext.class);
		}
		public TerminalNode DOUBLECOLON() { return getToken(AadlBaParser.DOUBLECOLON, 0); }
		public TerminalNode DOT(int i) {
			return getToken(AadlBaParser.DOT, i);
		}
		public TerminalNode IDENT() { return getToken(AadlBaParser.IDENT, 0); }
		public TerminalNode HASH() { return getToken(AadlBaParser.HASH, 0); }
		public Property_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterProperty_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitProperty_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitProperty_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_referenceContext property_reference() throws RecognitionException {
		Property_referenceContext _localctx = new Property_referenceContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_property_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			switch (_input.LA(1)) {
			case HASH:
				{
				{
				setState(1106); ((Property_referenceContext)_localctx).h1 = match(HASH);
				setState(1109);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1107); match(IDENT);
					setState(1108); match(DOUBLECOLON);
					}
					break;
				}
				}
				}
				break;
			case IDENT:
				{
				{
				setState(1113);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1111); qualified_named_element();
					}
					break;
				case 2:
					{
					setState(1112); reference();
					}
					break;
				}
				setState(1115); ((Property_referenceContext)_localctx).h2 = match(HASH);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1119); property_name();
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1120); match(DOT);
				setState(1121); property_name();
				}
				}
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_nameContext extends ParserRuleContext {
		public DeclarativePropertyName result;
		public TerminalNode DOT() { return getToken(AadlBaParser.DOT, 0); }
		public TerminalNode RBRACK(int i) {
			return getToken(AadlBaParser.RBRACK, i);
		}
		public List<Integer_valueContext> integer_value() {
			return getRuleContexts(Integer_valueContext.class);
		}
		public TerminalNode LOWER_BOUND() { return getToken(AadlBaParser.LOWER_BOUND, 0); }
		public TerminalNode LBRACK(int i) {
			return getToken(AadlBaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AadlBaParser.RBRACK); }
		public TerminalNode IDENT() { return getToken(AadlBaParser.IDENT, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AadlBaParser.LBRACK); }
		public TerminalNode UPPER_BOUND() { return getToken(AadlBaParser.UPPER_BOUND, 0); }
		public Integer_valueContext integer_value(int i) {
			return getRuleContext(Integer_valueContext.class,i);
		}
		public Property_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterProperty_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitProperty_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitProperty_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_nameContext property_name() throws RecognitionException {
		Property_nameContext _localctx = new Property_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_property_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127); match(IDENT);
			setState(1138);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1128); match(LBRACK);
					setState(1129); integer_value();
					setState(1130); match(RBRACK);
					}
					}
					setState(1134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				}
				break;
			case 2:
				{
				{
				setState(1136); match(DOT);
				setState(1137);
				_la = _input.LA(1);
				if ( !(_la==LOWER_BOUND || _la==UPPER_BOUND) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_literalContext extends ParserRuleContext {
		public NumericLiteral result;
		public Real_literalContext real_literal() {
			return getRuleContext(Real_literalContext.class,0);
		}
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_numeric_literal);
		try {
			setState(1142);
			switch (_input.LA(1)) {
			case INTEGER_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140); integer_literal();
				}
				break;
			case REAL_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141); real_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Real_literalContext extends ParserRuleContext {
		public DeclarativeRealLiteral result;
		public TerminalNode REAL_LIT() { return getToken(AadlBaParser.REAL_LIT, 0); }
		public Real_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterReal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitReal_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitReal_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_literalContext real_literal() throws RecognitionException {
		Real_literalContext _localctx = new Real_literalContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_real_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144); match(REAL_LIT);

			      realLiteralChecker(_localctx.REAL_LIT()) ;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public DeclarativeIntegerLiteral result;
		public TerminalNode INTEGER_LIT() { return getToken(AadlBaParser.INTEGER_LIT, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_integer_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147); match(INTEGER_LIT);

			      integerLiteralChecker(_localctx.INTEGER_LIT());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public DeclarativeStringLiteral result;
		public TerminalNode STRING_LITERAL() { return getToken(AadlBaParser.STRING_LITERAL, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeralContext extends ParserRuleContext {
		public Integer result;
		public TerminalNode INTEGER_LIT() { return getToken(AadlBaParser.INTEGER_LIT, 0); }
		public NumeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).enterNumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AadlBaListener ) ((AadlBaListener)listener).exitNumeral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AadlBaVisitor ) return ((AadlBaVisitor<? extends T>)visitor).visitNumeral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeralContext numeral() throws RecognitionException {
		NumeralContext _localctx = new NumeralContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_numeral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152); match(INTEGER_LIT);

			      integerLiteralChecker(_localctx.INTEGER_LIT());
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3W\u0486\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\6\2\u00ad\n\2\r\2\16\2\u00ae\5\2\u00b1\n\2\3\2\3\2\6\2"+
		"\u00b5\n\2\r\2\16\2\u00b6\5\2\u00b9\n\2\3\2\3\2\6\2\u00bd\n\2\r\2\16\2"+
		"\u00be\5\2\u00c1\n\2\3\3\3\3\3\3\5\3\u00c6\n\3\3\3\3\3\3\3\7\3\u00cb\n"+
		"\3\f\3\16\3\u00ce\13\3\3\3\3\3\3\3\3\3\6\3\u00d4\n\3\r\3\16\3\u00d5\3"+
		"\3\3\3\5\3\u00da\n\3\3\3\5\3\u00dd\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4"+
		"\u00e6\n\4\f\4\16\4\u00e9\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\7\7\u00f5\n\7\f\7\16\7\u00f8\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0104\n\b\3\t\3\t\3\t\3\t\7\t\u010a\n\t\f\t\16\t\u010d\13\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u011a\n\f\f\f\16\f"+
		"\u011d\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u012a"+
		"\n\17\3\20\5\20\u012d\n\20\3\20\3\20\3\21\3\21\5\21\u0133\n\21\3\22\5"+
		"\22\u0136\n\22\3\22\3\22\3\23\3\23\5\23\u013c\n\23\3\24\3\24\3\24\7\24"+
		"\u0141\n\24\f\24\16\24\u0144\13\24\3\24\3\24\3\24\3\24\3\24\5\24\u014b"+
		"\n\24\3\25\3\25\3\26\3\26\3\26\5\26\u0152\n\26\3\26\3\26\7\26\u0156\n"+
		"\26\f\26\16\26\u0159\13\26\3\26\3\26\5\26\u015d\n\26\3\26\5\26\u0160\n"+
		"\26\3\26\5\26\u0163\n\26\3\26\3\26\5\26\u0167\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0170\n\27\3\27\5\27\u0173\n\27\3\27\3\27\3\27\5"+
		"\27\u0178\n\27\3\27\3\27\7\27\u017c\n\27\f\27\16\27\u017f\13\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u0186\n\27\3\27\5\27\u0189\n\27\3\27\3\27\3\30"+
		"\3\30\3\30\5\30\u0190\n\30\3\31\3\31\3\31\3\31\3\31\6\31\u0197\n\31\r"+
		"\31\16\31\u0198\3\31\3\31\6\31\u019d\n\31\r\31\16\31\u019e\3\31\3\31\5"+
		"\31\u01a3\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u01aa\n\32\5\32\u01ac\n\32"+
		"\3\33\3\33\3\33\5\33\u01b1\n\33\3\34\3\34\5\34\u01b5\n\34\3\35\3\35\5"+
		"\35\u01b9\n\35\3\35\3\35\3\35\3\35\5\35\u01bf\n\35\3\35\3\35\3\35\7\35"+
		"\u01c4\n\35\f\35\16\35\u01c7\13\35\5\35\u01c9\n\35\3\36\3\36\3\36\5\36"+
		"\u01ce\n\36\3\36\5\36\u01d1\n\36\3\37\3\37\3\37\7\37\u01d6\n\37\f\37\16"+
		"\37\u01d9\13\37\3 \3 \3 \7 \u01de\n \f \16 \u01e1\13 \3!\3!\3!\7!\u01e6"+
		"\n!\f!\16!\u01e9\13!\3\"\3\"\3\"\7\"\u01ee\n\"\f\"\16\"\u01f1\13\"\3#"+
		"\3#\3#\5#\u01f6\n#\3#\3#\3#\7#\u01fb\n#\f#\16#\u01fe\13#\3#\5#\u0201\n"+
		"#\3#\3#\5#\u0205\n#\3#\3#\3#\7#\u020a\n#\f#\16#\u020d\13#\3#\5#\u0210"+
		"\n#\3#\5#\u0213\n#\3$\3$\3$\3$\3$\3$\3$\5$\u021c\n$\3%\3%\3%\3%\3%\3%"+
		"\7%\u0224\n%\f%\16%\u0227\13%\3%\3%\5%\u022b\n%\3%\3%\3%\3%\3%\6%\u0232"+
		"\n%\r%\16%\u0233\3%\3%\6%\u0238\n%\r%\16%\u0239\3%\3%\7%\u023e\n%\f%\16"+
		"%\u0241\13%\3%\3%\5%\u0245\n%\3%\3%\3%\5%\u024a\n%\3%\3%\5%\u024e\n%\3"+
		"&\3&\6&\u0252\n&\r&\16&\u0253\3&\3&\6&\u0258\n&\r&\16&\u0259\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\6\'\u0266\n\'\r\'\16\'\u0267\3\'\3\'\6\'"+
		"\u026c\n\'\r\'\16\'\u026d\3\'\3\'\5\'\u0272\n\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\6(\u027f\n(\r(\16(\u0280\3(\3(\3(\3(\3(\3(\6(\u0289\n(\r(\16"+
		"(\u028a\3(\3(\5(\u028f\n(\3)\3)\3)\3)\3)\3)\3)\6)\u0298\n)\r)\16)\u0299"+
		"\3)\3)\6)\u029e\n)\r)\16)\u029f\3)\3)\5)\u02a4\n)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\6*\u02b1\n*\r*\16*\u02b2\3*\3*\3*\3*\3*\3*\6*\u02bb\n*\r"+
		"*\16*\u02bc\3*\3*\5*\u02c1\n*\3+\3+\3+\3+\3+\3+\3+\6+\u02ca\n+\r+\16+"+
		"\u02cb\3+\3+\6+\u02d0\n+\r+\16+\u02d1\3+\3+\5+\u02d6\n+\3,\3,\3,\3,\3"+
		",\3,\3,\6,\u02df\n,\r,\16,\u02e0\3,\3,\6,\u02e5\n,\r,\16,\u02e6\3,\3,"+
		"\5,\u02eb\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\6-\u02f8\n-\r-\16-\u02f9"+
		"\3-\3-\6-\u02fe\n-\r-\16-\u02ff\3-\3-\5-\u0304\n-\3.\3.\5.\u0308\n.\3"+
		"/\3/\3/\5/\u030d\n/\3\60\3\60\3\60\3\60\5\60\u0313\n\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\62\6\62\u031c\n\62\r\62\16\62\u031d\3\62\3\62\3\62\3"+
		"\62\3\62\5\62\u0325\n\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u032d\n\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0335\n\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u033f\n\63\3\63\3\63\6\63\u0343\n\63\r\63\16\63\u0344"+
		"\3\63\3\63\6\63\u0349\n\63\r\63\16\63\u034a\5\63\u034d\n\63\3\63\3\63"+
		"\3\63\6\63\u0352\n\63\r\63\16\63\u0353\3\63\3\63\6\63\u0358\n\63\r\63"+
		"\16\63\u0359\5\63\u035c\n\63\3\63\5\63\u035f\n\63\3\63\3\63\3\63\3\63"+
		"\3\63\6\63\u0366\n\63\r\63\16\63\u0367\3\63\3\63\6\63\u036c\n\63\r\63"+
		"\16\63\u036d\5\63\u0370\n\63\3\63\3\63\5\63\u0374\n\63\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u037b\n\64\3\64\3\64\5\64\u037f\n\64\3\64\3\64\6\64\u0383"+
		"\n\64\r\64\16\64\u0384\3\64\3\64\3\64\5\64\u038a\n\64\3\64\6\64\u038d"+
		"\n\64\r\64\16\64\u038e\3\64\5\64\u0392\n\64\3\64\3\64\5\64\u0396\n\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\6\65\u03a1\n\65\r\65\16"+
		"\65\u03a2\3\65\3\65\6\65\u03a7\n\65\r\65\16\65\u03a8\3\65\3\65\5\65\u03ad"+
		"\n\65\3\66\3\66\3\66\5\66\u03b2\n\66\3\66\3\66\3\66\7\66\u03b7\n\66\f"+
		"\66\16\66\u03ba\13\66\3\67\3\67\3\67\5\67\u03bf\n\67\3\67\3\67\3\67\7"+
		"\67\u03c4\n\67\f\67\16\67\u03c7\13\67\38\38\39\39\39\79\u03ce\n9\f9\16"+
		"9\u03d1\139\3:\3:\3:\3:\3:\7:\u03d8\n:\f:\16:\u03db\13:\3;\3;\3;\3;\5"+
		";\u03e1\n;\3<\3<\3<\3<\3<\3<\3<\6<\u03ea\n<\r<\16<\u03eb\3<\3<\6<\u03f0"+
		"\n<\r<\16<\u03f1\3<\3<\5<\u03f6\n<\3=\3=\3=\3=\5=\u03fc\n=\3>\3>\3>\3"+
		">\7>\u0402\n>\f>\16>\u0405\13>\3?\3?\3?\3?\5?\u040b\n?\3@\5@\u040e\n@"+
		"\3@\3@\3@\3@\7@\u0414\n@\f@\16@\u0417\13@\3A\3A\3A\3A\7A\u041d\nA\fA\16"+
		"A\u0420\13A\3B\3B\3B\3B\5B\u0426\nB\3B\3B\3B\3B\3B\3B\5B\u042e\nB\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3D\3D\5D\u043a\nD\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3"+
		"J\3J\3K\3K\3L\3L\3L\3L\3M\3M\5M\u0450\nM\3N\3N\3N\3O\3O\3O\5O\u0458\n"+
		"O\3O\3O\5O\u045c\nO\3O\3O\5O\u0460\nO\3O\3O\3O\7O\u0465\nO\fO\16O\u0468"+
		"\13O\3P\3P\3P\3P\3P\6P\u046f\nP\rP\16P\u0470\3P\3P\5P\u0475\nP\3Q\3Q\5"+
		"Q\u0479\nQ\3R\3R\3R\3S\3S\3S\3T\3T\3U\3U\3U\3U\2\2V\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\2\13"+
		"\3\2FG\4\2\16\16QQ\4\2\67\67@@\3\2<=\4\2\n\n\24\24\5\2\4\4\35\35++\5\2"+
		"\32\32!!HI\4\2\20\20\'\'\4\2\31\31))\u04e7\2\u00b0\3\2\2\2\4\u00c2\3\2"+
		"\2\2\6\u00e0\3\2\2\2\b\u00ea\3\2\2\2\n\u00ef\3\2\2\2\f\u00f6\3\2\2\2\16"+
		"\u0103\3\2\2\2\20\u0105\3\2\2\2\22\u0110\3\2\2\2\24\u0112\3\2\2\2\26\u0116"+
		"\3\2\2\2\30\u0120\3\2\2\2\32\u0125\3\2\2\2\34\u0127\3\2\2\2\36\u012c\3"+
		"\2\2\2 \u0130\3\2\2\2\"\u0135\3\2\2\2$\u013b\3\2\2\2&\u0142\3\2\2\2(\u014c"+
		"\3\2\2\2*\u014e\3\2\2\2,\u0172\3\2\2\2.\u018c\3\2\2\2\60\u01a2\3\2\2\2"+
		"\62\u01ab\3\2\2\2\64\u01b0\3\2\2\2\66\u01b4\3\2\2\28\u01b6\3\2\2\2:\u01d0"+
		"\3\2\2\2<\u01d2\3\2\2\2>\u01da\3\2\2\2@\u01e2\3\2\2\2B\u01ea\3\2\2\2D"+
		"\u01f2\3\2\2\2F\u021b\3\2\2\2H\u024d\3\2\2\2J\u024f\3\2\2\2L\u0271\3\2"+
		"\2\2N\u028e\3\2\2\2P\u02a3\3\2\2\2R\u02c0\3\2\2\2T\u02d5\3\2\2\2V\u02ea"+
		"\3\2\2\2X\u0303\3\2\2\2Z\u0307\3\2\2\2\\\u030c\3\2\2\2^\u030e\3\2\2\2"+
		"`\u0316\3\2\2\2b\u031b\3\2\2\2d\u0373\3\2\2\2f\u0395\3\2\2\2h\u03ac\3"+
		"\2\2\2j\u03ae\3\2\2\2l\u03bb\3\2\2\2n\u03c8\3\2\2\2p\u03ca\3\2\2\2r\u03d2"+
		"\3\2\2\2t\u03e0\3\2\2\2v\u03f5\3\2\2\2x\u03f7\3\2\2\2z\u03fd\3\2\2\2|"+
		"\u0406\3\2\2\2~\u040d\3\2\2\2\u0080\u0418\3\2\2\2\u0082\u042d\3\2\2\2"+
		"\u0084\u042f\3\2\2\2\u0086\u0439\3\2\2\2\u0088\u043b\3\2\2\2\u008a\u043d"+
		"\3\2\2\2\u008c\u043f\3\2\2\2\u008e\u0441\3\2\2\2\u0090\u0443\3\2\2\2\u0092"+
		"\u0445\3\2\2\2\u0094\u0447\3\2\2\2\u0096\u0449\3\2\2\2\u0098\u044f\3\2"+
		"\2\2\u009a\u0451\3\2\2\2\u009c\u045f\3\2\2\2\u009e\u0469\3\2\2\2\u00a0"+
		"\u0478\3\2\2\2\u00a2\u047a\3\2\2\2\u00a4\u047d\3\2\2\2\u00a6\u0480\3\2"+
		"\2\2\u00a8\u0482\3\2\2\2\u00aa\u00ac\7 \2\2\u00ab\u00ad\5\4\3\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b8\3\2\2\2\u00b2\u00b4\7#\2\2\u00b3\u00b5\5*\26\2\u00b4\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c0\3\2"+
		"\2\2\u00ba\u00bc\7&\2\2\u00bb\u00bd\5,\27\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\3\3\2\2\2\u00c2\u00c3"+
		"\5\6\4\2\u00c3\u00cc\b\3\1\2\u00c4\u00c6\7.\2\2\u00c5\u00c4\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\5\6\4\2\u00c8\u00c9\b\3"+
		"\1\2\u00c9\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7\66\2\2\u00d0\u00d9\5(\25\2\u00d1\u00d3\7\64\2\2\u00d2"+
		"\u00d4\5\b\5\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\65\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00dd\7L\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\b\3\1\2\u00df\5\3\2\2\2\u00e0\u00e7\7R\2\2"+
		"\u00e1\u00e2\7,\2\2\u00e2\u00e3\5\66\34\2\u00e3\u00e4\7-\2\2\u00e4\u00e6"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\7\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5\n\6\2"+
		"\u00eb\u00ec\78\2\2\u00ec\u00ed\5\16\b\2\u00ed\u00ee\7L\2\2\u00ee\t\3"+
		"\2\2\2\u00ef\u00f0\5\f\7\2\u00f0\13\3\2\2\2\u00f1\u00f2\7R\2\2\u00f2\u00f3"+
		"\7M\2\2\u00f3\u00f5\b\7\1\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fa\7R\2\2\u00fa\u00fb\b\7\1\2\u00fb\r\3\2\2\2\u00fc\u0104"+
		"\5\26\f\2\u00fd\u0104\5\u00a6T\2\u00fe\u0104\5\24\13\2\u00ff\u0104\5\34"+
		"\17\2\u0100\u0104\5 \21\2\u0101\u0104\5\20\t\2\u0102\u0104\5\22\n\2\u0103"+
		"\u00fc\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2"+
		"\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\17\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u010b\5\16\b\2\u0107\u0108\7.\2"+
		"\2\u0108\u010a\5\16\b\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u010f\7\62\2\2\u010f\21\3\2\2\2\u0110\u0111\5\u0094K\2\u0111"+
		"\23\3\2\2\2\u0112\u0113\5$\23\2\u0113\u0114\7K\2\2\u0114\u0115\5$\23\2"+
		"\u0115\25\3\2\2\2\u0116\u0117\7,\2\2\u0117\u011b\5\30\r\2\u0118\u011a"+
		"\5\30\r\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2"+
		"\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f"+
		"\7-\2\2\u011f\27\3\2\2\2\u0120\u0121\7R\2\2\u0121\u0122\78\2\2\u0122\u0123"+
		"\5\16\b\2\u0123\u0124\7L\2\2\u0124\31\3\2\2\2\u0125\u0126\5\f\7\2\u0126"+
		"\33\3\2\2\2\u0127\u0129\5\36\20\2\u0128\u012a\5\32\16\2\u0129\u0128\3"+
		"\2\2\2\u0129\u012a\3\2\2\2\u012a\35\3\2\2\2\u012b\u012d\t\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5\u00a4"+
		"S\2\u012f\37\3\2\2\2\u0130\u0132\5\"\22\2\u0131\u0133\5\32\16\2\u0132"+
		"\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133!\3\2\2\2\u0134\u0136\t\2\2\2"+
		"\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\5\u00a2R\2\u0138#\3\2\2\2\u0139\u013c\5\34\17\2\u013a\u013c\5 \21\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c%\3\2\2\2\u013d\u013e\7R\2\2\u013e"+
		"\u013f\7M\2\2\u013f\u0141\b\24\1\2\u0140\u013d\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\7R\2\2\u0146\u014a\b\24\1\2\u0147\u0148\7>"+
		"\2\2\u0148\u0149\7R\2\2\u0149\u014b\b\24\1\2\u014a\u0147\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\'\3\2\2\2\u014c\u014d\5&\24\2\u014d)\3\2\2\2\u014e"+
		"\u014f\7R\2\2\u014f\u0157\b\26\1\2\u0150\u0152\7.\2\2\u0151\u0150\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7R\2\2\u0154"+
		"\u0156\b\26\1\2\u0155\u0151\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015c\7\66\2\2\u015b\u015d\7\30\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3"+
		"\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160\7\b\2\2\u015f\u015e\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\7\21\2\2\u0162\u0161\3"+
		"\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\7\"\2\2\u0165"+
		"\u0167\7L\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0169\b\26\1\2\u0169+\3\2\2\2\u016a\u016f\7R\2\2\u016b\u016c"+
		"\7,\2\2\u016c\u016d\5\u00a8U\2\u016d\u016e\7-\2\2\u016e\u0170\3\2\2\2"+
		"\u016f\u016b\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173"+
		"\7\66\2\2\u0172\u016a\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2"+
		"\u0174\u0175\7R\2\2\u0175\u017d\b\27\1\2\u0176\u0178\7.\2\2\u0177\u0176"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7R\2\2\u017a"+
		"\u017c\b\27\1\2\u017b\u0177\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3"+
		"\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0181\7/\2\2\u0181\u0182\5\62\32\2\u0182\u0183\7\60\2\2\u0183\u0185\7"+
		"R\2\2\u0184\u0186\5.\30\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0188\3\2\2\2\u0187\u0189\7L\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u018b\b\27\1\2\u018b-\3\2\2\2\u018c\u018f"+
		"\5\60\31\2\u018d\u018e\7%\2\2\u018e\u0190\5\u009aN\2\u018f\u018d\3\2\2"+
		"\2\u018f\u0190\3\2\2\2\u0190/\3\2\2\2\u0191\u0192\7\64\2\2\u0192\u0193"+
		"\5D#\2\u0193\u0194\7\65\2\2\u0194\u01a3\3\2\2\2\u0195\u0197\7\64\2\2\u0196"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019c\5D#\2\u019b\u019d\7\65\2\2\u019c"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\b\31\1\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u0191\3\2\2\2\u01a2\u0196\3\2\2\2\u01a3\61\3\2\2\2\u01a4\u01a5\7\34\2"+
		"\2\u01a5\u01ac\58\35\2\u01a6\u01a7\7\34\2\2\u01a7\u01ac\5<\37\2\u01a8"+
		"\u01aa\5\64\33\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3"+
		"\2\2\2\u01ab\u01a4\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\63\3\2\2\2\u01ad\u01b1\5z>\2\u01ae\u01b1\7%\2\2\u01af\u01b1\7\36\2\2"+
		"\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1\65"+
		"\3\2\2\2\u01b2\u01b5\5\u00a4S\2\u01b3\u01b5\5\u009cO\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b3\3\2\2\2\u01b5\67\3\2\2\2\u01b6\u01b8\7\13\2\2\u01b7\u01b9"+
		"\5:\36\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01c8\3\2\2\2\u01ba"+
		"\u01bb\7\25\2\2\u01bb\u01bc\5p9\2\u01bc\u01c5\b\35\1\2\u01bd\u01bf\7."+
		"\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\5p9\2\u01c1\u01c2\b\35\1\2\u01c2\u01c4\3\2\2\2\u01c3\u01be\3\2"+
		"\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01ba\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c99\3\2\2\2\u01ca\u01d1\5> \2\u01cb\u01cd\7%\2\2\u01cc\u01ce\5"+
		"\u009aN\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2"+
		"\u01cf\u01d1\7$\2\2\u01d0\u01ca\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d0\u01cf"+
		"\3\2\2\2\u01d1;\3\2\2\2\u01d2\u01d7\5B\"\2\u01d3\u01d4\7\35\2\2\u01d4"+
		"\u01d6\5B\"\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8=\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01df"+
		"\5@!\2\u01db\u01dc\7\35\2\2\u01dc\u01de\5@!\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0?\3\2\2\2"+
		"\u01e1\u01df\3\2\2\2\u01e2\u01e7\5p9\2\u01e3\u01e4\7\4\2\2\u01e4\u01e6"+
		"\5p9\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8A\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ef\5p9\2\u01eb"+
		"\u01ec\7\4\2\2\u01ec\u01ee\5p9\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2"+
		"\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0C\3\2\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f2\u01f3\5F$\2\u01f3\u0212\b#\1\2\u01f4\u01f6\7L\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\5F"+
		"$\2\u01f8\u01f9\b#\1\2\u01f9\u01fb\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fb\u01fe"+
		"\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01ff\u0201\7L\2\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0213\b#\1\2\u0203\u0205\7\63\2\2\u0204"+
		"\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\5F"+
		"$\2\u0207\u0208\b#\1\2\u0208\u020a\3\2\2\2\u0209\u0204\3\2\2\2\u020a\u020d"+
		"\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020f\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020e\u0210\7\63\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3"+
		"\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\b#\1\2\u0212\u01fc\3\2\2\2\u0212"+
		"\u020b\3\2\2\2\u0213E\3\2\2\2\u0214\u021c\5\\/\2\u0215\u021c\5H%\2\u0216"+
		"\u021c\5L\'\2\u0217\u021c\5T+\2\u0218\u021c\5X-\2\u0219\u021c\5.\30\2"+
		"\u021a\u021c\5P)\2\u021b\u0214\3\2\2\2\u021b\u0215\3\2\2\2\u021b\u0216"+
		"\3\2\2\2\u021b\u0217\3\2\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021a\3\2\2\2\u021cG\3\2\2\2\u021d\u021e\7\26\2\2\u021e\u021f\7\61\2"+
		"\2\u021f\u0220\5z>\2\u0220\u0221\7\62\2\2\u0221\u0225\5D#\2\u0222\u0224"+
		"\5J&\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u022a\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229\7\r"+
		"\2\2\u0229\u022b\5D#\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c"+
		"\3\2\2\2\u022c\u022d\7\17\2\2\u022d\u022e\7\26\2\2\u022e\u024e\3\2\2\2"+
		"\u022f\u0231\7\26\2\2\u0230\u0232\7\61\2\2\u0231\u0230\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0237\5z>\2\u0236\u0238\7\62\2\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023f\5D#\2\u023c\u023e\5J&\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2"+
		"\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0244\3\2\2\2\u0241\u023f"+
		"\3\2\2\2\u0242\u0243\7\r\2\2\u0243\u0245\5D#\2\u0244\u0242\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0249\3\2\2\2\u0246\u0247\7\17\2\2\u0247\u024a\7"+
		"\26\2\2\u0248\u024a\7P\2\2\u0249\u0246\3\2\2\2\u0249\u0248\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\b%\1\2\u024c\u024e\3\2"+
		"\2\2\u024d\u021d\3\2\2\2\u024d\u022f\3\2\2\2\u024eI\3\2\2\2\u024f\u0251"+
		"\t\3\2\2\u0250\u0252\7\61\2\2\u0251\u0250\3\2\2\2\u0252\u0253\3\2\2\2"+
		"\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257"+
		"\5z>\2\u0256\u0258\7\62\2\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\5D"+
		"#\2\u025c\u025d\b&\1\2\u025dK\3\2\2\2\u025e\u025f\5N(\2\u025f\u0260\7"+
		"\64\2\2\u0260\u0261\5D#\2\u0261\u0262\7\65\2\2\u0262\u0272\3\2\2\2\u0263"+
		"\u0265\5N(\2\u0264\u0266\7\64\2\2\u0265\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026b\5D#\2\u026a\u026c\7\65\2\2\u026b\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0270\b\'\1\2\u0270\u0272\3\2\2\2\u0271\u025e\3\2\2\2\u0271\u0263\3\2"+
		"\2\2\u0272M\3\2\2\2\u0273\u0274\7\22\2\2\u0274\u0275\7\61\2\2\u0275\u0276"+
		"\7R\2\2\u0276\u0277\7\66\2\2\u0277\u0278\5(\25\2\u0278\u0279\7\27\2\2"+
		"\u0279\u027a\5Z.\2\u027a\u027b\7\62\2\2\u027b\u028f\3\2\2\2\u027c\u027e"+
		"\7\22\2\2\u027d\u027f\7\61\2\2\u027e\u027d\3\2\2\2\u027f\u0280\3\2\2\2"+
		"\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283"+
		"\7R\2\2\u0283\u0284\7\66\2\2\u0284\u0285\5(\25\2\u0285\u0286\7\27\2\2"+
		"\u0286\u0288\5Z.\2\u0287\u0289\7\62\2\2\u0288\u0287\3\2\2\2\u0289\u028a"+
		"\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028d\b(\1\2\u028d\u028f\3\2\2\2\u028e\u0273\3\2\2\2\u028e\u027c\3\2"+
		"\2\2\u028fO\3\2\2\2\u0290\u0291\5R*\2\u0291\u0292\7\64\2\2\u0292\u0293"+
		"\5D#\2\u0293\u0294\7\65\2\2\u0294\u02a4\3\2\2\2\u0295\u0297\5R*\2\u0296"+
		"\u0298\7\64\2\2\u0297\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u0297\3"+
		"\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\5D#\2\u029c"+
		"\u029e\7\65\2\2\u029d\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u029d\3"+
		"\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\b)\1\2\u02a2"+
		"\u02a4\3\2\2\2\u02a3\u0290\3\2\2\2\u02a3\u0295\3\2\2\2\u02a4Q\3\2\2\2"+
		"\u02a5\u02a6\7\23\2\2\u02a6\u02a7\7\61\2\2\u02a7\u02a8\7R\2\2\u02a8\u02a9"+
		"\7\66\2\2\u02a9\u02aa\5(\25\2\u02aa\u02ab\7\27\2\2\u02ab\u02ac\5Z.\2\u02ac"+
		"\u02ad\7\62\2\2\u02ad\u02c1\3\2\2\2\u02ae\u02b0\7\23\2\2\u02af\u02b1\7"+
		"\61\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\7R\2\2\u02b5\u02b6\7\66"+
		"\2\2\u02b6\u02b7\5(\25\2\u02b7\u02b8\7\27\2\2\u02b8\u02ba\5Z.\2\u02b9"+
		"\u02bb\7\62\2\2\u02ba\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02ba\3"+
		"\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\b*\1\2\u02bf"+
		"\u02c1\3\2\2\2\u02c0\u02a5\3\2\2\2\u02c0\u02ae\3\2\2\2\u02c1S\3\2\2\2"+
		"\u02c2\u02c3\5V,\2\u02c3\u02c4\7\64\2\2\u02c4\u02c5\5D#\2\u02c5\u02c6"+
		"\7\65\2\2\u02c6\u02d6\3\2\2\2\u02c7\u02c9\5V,\2\u02c8\u02ca\7\64\2\2\u02c9"+
		"\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\5D#\2\u02ce\u02d0\7\65\2\2\u02cf"+
		"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2"+
		"\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\b+\1\2\u02d4\u02d6\3\2\2\2\u02d5"+
		"\u02c2\3\2\2\2\u02d5\u02c7\3\2\2\2\u02d6U\3\2\2\2\u02d7\u02d8\7*\2\2\u02d8"+
		"\u02d9\7\61\2\2\u02d9\u02da\5z>\2\u02da\u02db\7\62\2\2\u02db\u02eb\3\2"+
		"\2\2\u02dc\u02de\7*\2\2\u02dd\u02df\7\61\2\2\u02de\u02dd\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2"+
		"\2\2\u02e2\u02e4\5z>\2\u02e3\u02e5\7\62\2\2\u02e4\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8\u02e9\b,\1\2\u02e9\u02eb\3\2\2\2\u02ea\u02d7\3\2\2\2\u02ea"+
		"\u02dc\3\2\2\2\u02ebW\3\2\2\2\u02ec\u02ed\7\f\2\2\u02ed\u02ee\5D#\2\u02ee"+
		"\u02ef\7(\2\2\u02ef\u02f0\7\61\2\2\u02f0\u02f1\5z>\2\u02f1\u02f2\7\62"+
		"\2\2\u02f2\u0304\3\2\2\2\u02f3\u02f4\7\f\2\2\u02f4\u02f5\5D#\2\u02f5\u02f7"+
		"\7(\2\2\u02f6\u02f8\7\61\2\2\u02f7\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\5z"+
		">\2\u02fc\u02fe\7\62\2\2\u02fd\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\b-"+
		"\1\2\u0302\u0304\3\2\2\2\u0303\u02ec\3\2\2\2\u0303\u02f3\3\2\2\2\u0304"+
		"Y\3\2\2\2\u0305\u0308\5\u0096L\2\u0306\u0308\5p9\2\u0307\u0305\3\2\2\2"+
		"\u0307\u0306\3\2\2\2\u0308[\3\2\2\2\u0309\u030d\5^\60\2\u030a\u030d\5"+
		"d\63\2\u030b\u030d\5f\64\2\u030c\u0309\3\2\2\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030b\3\2\2\2\u030d]\3\2\2\2\u030e\u030f\5`\61\2\u030f\u0312\t\4\2\2"+
		"\u0310\u0313\5z>\2\u0311\u0313\7\5\2\2\u0312\u0310\3\2\2\2\u0312\u0311"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\b\60\1\2\u0315_\3\2\2\2\u0316"+
		"\u0317\5p9\2\u0317a\3\2\2\2\u0318\u0319\7R\2\2\u0319\u031a\7M\2\2\u031a"+
		"\u031c\b\62\1\2\u031b\u0318\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031b\3"+
		"\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\7R\2\2\u0320"+
		"\u0324\b\62\1\2\u0321\u0322\7>\2\2\u0322\u0323\7R\2\2\u0323\u0325\b\62"+
		"\1\2\u0324\u0321\3\2\2\2\u0324\u0325\3\2\2\2\u0325c\3\2\2\2\u0326\u0327"+
		"\5b\62\2\u0327\u032c\79\2\2\u0328\u0329\7\61\2\2\u0329\u032a\5l\67\2\u032a"+
		"\u032b\7\62\2\2\u032b\u032d\3\2\2\2\u032c\u0328\3\2\2\2\u032c\u032d\3"+
		"\2\2\2\u032d\u0374\3\2\2\2\u032e\u035e\5p9\2\u032f\u0334\7:\2\2\u0330"+
		"\u0331\7\61\2\2\u0331\u0332\5`\61\2\u0332\u0333\7\62\2\2\u0333\u0335\3"+
		"\2\2\2\u0334\u0330\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u035f\3\2\2\2\u0336"+
		"\u035f\7;\2\2\u0337\u035f\7<\2\2\u0338\u035f\7=\2\2\u0339\u033e\79\2\2"+
		"\u033a\u033b\7\61\2\2\u033b\u033c\5l\67\2\u033c\u033d\7\62\2\2\u033d\u033f"+
		"\3\2\2\2\u033e\u033a\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u035f\3\2\2\2\u0340"+
		"\u034c\7:\2\2\u0341\u0343\7\61\2\2\u0342\u0341\3\2\2\2\u0343\u0344\3\2"+
		"\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346"+
		"\u0348\5`\61\2\u0347\u0349\7\62\2\2\u0348\u0347\3\2\2\2\u0349\u034a\3"+
		"\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\3\2\2\2\u034c"+
		"\u0342\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u035f\b\63"+
		"\1\2\u034f\u035b\79\2\2\u0350\u0352\7\61\2\2\u0351\u0350\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2"+
		"\2\2\u0355\u0357\5l\67\2\u0356\u0358\7\62\2\2\u0357\u0356\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2"+
		"\2\2\u035b\u0351\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"\u035f\b\63\1\2\u035e\u032f\3\2\2\2\u035e\u0336\3\2\2\2\u035e\u0337\3"+
		"\2\2\2\u035e\u0338\3\2\2\2\u035e\u0339\3\2\2\2\u035e\u0340\3\2\2\2\u035e"+
		"\u034f\3\2\2\2\u035f\u0374\3\2\2\2\u0360\u0361\7H\2\2\u0361\u0374\t\5"+
		"\2\2\u0362\u0363\5b\62\2\u0363\u036f\79\2\2\u0364\u0366\7\61\2\2\u0365"+
		"\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2"+
		"\2\2\u0368\u0369\3\2\2\2\u0369\u036b\5l\67\2\u036a\u036c\7\62\2\2\u036b"+
		"\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2"+
		"\2\2\u036e\u0370\3\2\2\2\u036f\u0365\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0372\b\63\1\2\u0372\u0374\3\2\2\2\u0373\u0326\3"+
		"\2\2\2\u0373\u032e\3\2\2\2\u0373\u0360\3\2\2\2\u0373\u0362\3\2\2\2\u0374"+
		"e\3\2\2\2\u0375\u0376\7\t\2\2\u0376\u0377\7\61\2\2\u0377\u037a\5\u009a"+
		"N\2\u0378\u0379\7K\2\2\u0379\u037b\5\u009aN\2\u037a\u0378\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e\7\62\2\2\u037d\u037f\5"+
		"h\65\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0396\3\2\2\2\u0380"+
		"\u0382\7\t\2\2\u0381\u0383\7\61\2\2\u0382\u0381\3\2\2\2\u0383\u0384\3"+
		"\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0389\5\u009aN\2\u0387\u0388\7K\2\2\u0388\u038a\5\u009aN\2\u0389\u0387"+
		"\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c\3\2\2\2\u038b\u038d\7\62\2\2"+
		"\u038c\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038c\3\2\2\2\u038e\u038f"+
		"\3\2\2\2\u038f\u0391\3\2\2\2\u0390\u0392\5h\65\2\u0391\u0390\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\b\64\1\2\u0394\u0396\3"+
		"\2\2\2\u0395\u0375\3\2\2\2\u0395\u0380\3\2\2\2\u0396g\3\2\2\2\u0397\u0398"+
		"\7\27\2\2\u0398\u0399\7\6\2\2\u0399\u039a\7\61\2\2\u039a\u039b\5j\66\2"+
		"\u039b\u039c\7\62\2\2\u039c\u03ad\3\2\2\2\u039d\u039e\7\27\2\2\u039e\u03a0"+
		"\7\6\2\2\u039f\u03a1\7\61\2\2\u03a0\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2"+
		"\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6"+
		"\5j\66\2\u03a5\u03a7\7\62\2\2\u03a6\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2"+
		"\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab"+
		"\b\65\1\2\u03ab\u03ad\3\2\2\2\u03ac\u0397\3\2\2\2\u03ac\u039d\3\2\2\2"+
		"\u03adi\3\2\2\2\u03ae\u03af\5(\25\2\u03af\u03b8\b\66\1\2\u03b0\u03b2\7"+
		".\2\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u03b4\5(\25\2\u03b4\u03b5\b\66\1\2\u03b5\u03b7\3\2\2\2\u03b6\u03b1\3"+
		"\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"k\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bc\5n8\2\u03bc\u03c5\b\67\1\2\u03bd"+
		"\u03bf\7.\2\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2"+
		"\2\2\u03c0\u03c1\5n8\2\u03c1\u03c2\b\67\1\2\u03c2\u03c4\3\2\2\2\u03c3"+
		"\u03be\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2"+
		"\2\2\u03c6m\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03c9\5z>\2\u03c9o\3\2\2"+
		"\2\u03ca\u03cf\5r:\2\u03cb\u03cc\7>\2\2\u03cc\u03ce\5r:\2\u03cd\u03cb"+
		"\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0"+
		"q\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d9\7R\2\2\u03d3\u03d4\7,\2\2\u03d4"+
		"\u03d5\5\u0098M\2\u03d5\u03d6\7-\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d3\3"+
		"\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"s\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u03e1\5\u00a0Q\2\u03dd\u03e1\5\u009c"+
		"O\2\u03de\u03e1\5\u0094K\2\u03df\u03e1\5\u00a6T\2\u03e0\u03dc\3\2\2\2"+
		"\u03e0\u03dd\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03df\3\2\2\2\u03e1u\3"+
		"\2\2\2\u03e2\u03f6\5t;\2\u03e3\u03f6\5x=\2\u03e4\u03e5\7\61\2\2\u03e5"+
		"\u03e6\5z>\2\u03e6\u03e7\7\62\2\2\u03e7\u03f6\3\2\2\2\u03e8\u03ea\7\61"+
		"\2\2\u03e9\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb"+
		"\u03ec\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\5z>\2\u03ee\u03f0\7\62"+
		"\2\2\u03ef\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1"+
		"\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\b<\1\2\u03f4\u03f6\3\2"+
		"\2\2\u03f5\u03e2\3\2\2\2\u03f5\u03e3\3\2\2\2\u03f5\u03e4\3\2\2\2\u03f5"+
		"\u03e9\3\2\2\2\u03f6w\3\2\2\2\u03f7\u03fb\5p9\2\u03f8\u03fc\7:\2\2\u03f9"+
		"\u03fa\7?\2\2\u03fa\u03fc\t\6\2\2\u03fb\u03f8\3\2\2\2\u03fb\u03f9\3\2"+
		"\2\2\u03fb\u03fc\3\2\2\2\u03fcy\3\2\2\2\u03fd\u0403\5|?\2\u03fe\u03ff"+
		"\5\u0084C\2\u03ff\u0400\5|?\2\u0400\u0402\3\2\2\2\u0401\u03fe\3\2\2\2"+
		"\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404{\3"+
		"\2\2\2\u0405\u0403\3\2\2\2\u0406\u040a\5~@\2\u0407\u0408\5\u0086D\2\u0408"+
		"\u0409\5~@\2\u0409\u040b\3\2\2\2\u040a\u0407\3\2\2\2\u040a\u040b\3\2\2"+
		"\2\u040b}\3\2\2\2\u040c\u040e\5\u008aF\2\u040d\u040c\3\2\2\2\u040d\u040e"+
		"\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0415\5\u0080A\2\u0410\u0411\5\u0088"+
		"E\2\u0411\u0412\5\u0080A\2\u0412\u0414\3\2\2\2\u0413\u0410\3\2\2\2\u0414"+
		"\u0417\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\177\3\2\2"+
		"\2\u0417\u0415\3\2\2\2\u0418\u041e\5\u0082B\2\u0419\u041a\5\u008cG\2\u041a"+
		"\u041b\5\u0082B\2\u041b\u041d\3\2\2\2\u041c\u0419\3\2\2\2\u041d\u0420"+
		"\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0081\3\2\2\2\u0420"+
		"\u041e\3\2\2\2\u0421\u0425\5v<\2\u0422\u0423\5\u008eH\2\u0423\u0424\5"+
		"v<\2\u0424\u0426\3\2\2\2\u0425\u0422\3\2\2\2\u0425\u0426\3\2\2\2\u0426"+
		"\u042e\3\2\2\2\u0427\u0428\5\u0090I\2\u0428\u0429\5v<\2\u0429\u042e\3"+
		"\2\2\2\u042a\u042b\5\u0092J\2\u042b\u042c\5v<\2\u042c\u042e\3\2\2\2\u042d"+
		"\u0421\3\2\2\2\u042d\u0427\3\2\2\2\u042d\u042a\3\2\2\2\u042e\u0083\3\2"+
		"\2\2\u042f\u0430\t\7\2\2\u0430\u0085\3\2\2\2\u0431\u043a\7@\2\2\u0432"+
		"\u043a\7A\2\2\u0433\u043a\7B\2\2\u0434\u043a\7C\2\2\u0435\u043a\7D\2\2"+
		"\u0436\u043a\7E\2\2\u0437\u0438\7O\2\2\u0438\u043a\bD\1\2\u0439\u0431"+
		"\3\2\2\2\u0439\u0432\3\2\2\2\u0439\u0433\3\2\2\2\u0439\u0434\3\2\2\2\u0439"+
		"\u0435\3\2\2\2\u0439\u0436\3\2\2\2\u0439\u0437\3\2\2\2\u043a\u0087\3\2"+
		"\2\2\u043b\u043c\t\2\2\2\u043c\u0089\3\2\2\2\u043d\u043e\t\2\2\2\u043e"+
		"\u008b\3\2\2\2\u043f\u0440\t\b\2\2\u0440\u008d\3\2\2\2\u0441\u0442\7J"+
		"\2\2\u0442\u008f\3\2\2\2\u0443\u0444\7\3\2\2\u0444\u0091\3\2\2\2\u0445"+
		"\u0446\7\33\2\2\u0446\u0093\3\2\2\2\u0447\u0448\t\t\2\2\u0448\u0095\3"+
		"\2\2\2\u0449\u044a\5\u0098M\2\u044a\u044b\7K\2\2\u044b\u044c\5\u0098M"+
		"\2\u044c\u0097\3\2\2\2\u044d\u0450\5\66\34\2\u044e\u0450\5x=\2\u044f\u044d"+
		"\3\2\2\2\u044f\u044e\3\2\2\2\u0450\u0099\3\2\2\2\u0451\u0452\5\u0098M"+
		"\2\u0452\u0453\7R\2\2\u0453\u009b\3\2\2\2\u0454\u0457\7N\2\2\u0455\u0456"+
		"\7R\2\2\u0456\u0458\7M\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"\u0460\3\2\2\2\u0459\u045c\5b\62\2\u045a\u045c\5p9\2\u045b\u0459\3\2\2"+
		"\2\u045b\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\7N\2\2\u045e\u0460"+
		"\3\2\2\2\u045f\u0454\3\2\2\2\u045f\u045b\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u0466\5\u009eP\2\u0462\u0463\7>\2\2\u0463\u0465\5\u009eP\2\u0464\u0462"+
		"\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u009d\3\2\2\2\u0468\u0466\3\2\2\2\u0469\u0474\7R\2\2\u046a\u046b\7,\2"+
		"\2\u046b\u046c\5\u0098M\2\u046c\u046d\7-\2\2\u046d\u046f\3\2\2\2\u046e"+
		"\u046a\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2"+
		"\2\2\u0471\u0475\3\2\2\2\u0472\u0473\7>\2\2\u0473\u0475\t\n\2\2\u0474"+
		"\u046e\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u009f\3\2"+
		"\2\2\u0476\u0479\5\u00a4S\2\u0477\u0479\5\u00a2R\2\u0478\u0476\3\2\2\2"+
		"\u0478\u0477\3\2\2\2\u0479\u00a1\3\2\2\2\u047a\u047b\7T\2\2\u047b\u047c"+
		"\bR\1\2\u047c\u00a3\3\2\2\2\u047d\u047e\7U\2\2\u047e\u047f\bS\1\2\u047f"+
		"\u00a5\3\2\2\2\u0480\u0481\7S\2\2\u0481\u00a7\3\2\2\2\u0482\u0483\7U\2"+
		"\2\u0483\u0484\bU\1\2\u0484\u00a9\3\2\2\2\u0096\u00ae\u00b0\u00b6\u00b8"+
		"\u00be\u00c0\u00c5\u00cc\u00d5\u00d9\u00dc\u00e7\u00f6\u0103\u010b\u011b"+
		"\u0129\u012c\u0132\u0135\u013b\u0142\u014a\u0151\u0157\u015c\u015f\u0162"+
		"\u0166\u016f\u0172\u0177\u017d\u0185\u0188\u018f\u0198\u019e\u01a2\u01a9"+
		"\u01ab\u01b0\u01b4\u01b8\u01be\u01c5\u01c8\u01cd\u01d0\u01d7\u01df\u01e7"+
		"\u01ef\u01f5\u01fc\u0200\u0204\u020b\u020f\u0212\u021b\u0225\u022a\u0233"+
		"\u0239\u023f\u0244\u0249\u024d\u0253\u0259\u0267\u026d\u0271\u0280\u028a"+
		"\u028e\u0299\u029f\u02a3\u02b2\u02bc\u02c0\u02cb\u02d1\u02d5\u02e0\u02e6"+
		"\u02ea\u02f9\u02ff\u0303\u0307\u030c\u0312\u031d\u0324\u032c\u0334\u033e"+
		"\u0344\u034a\u034c\u0353\u0359\u035b\u035e\u0367\u036d\u036f\u0373\u037a"+
		"\u037e\u0384\u0389\u038e\u0391\u0395\u03a2\u03a8\u03ac\u03b1\u03b8\u03be"+
		"\u03c5\u03cf\u03d9\u03e0\u03eb\u03f1\u03f5\u03fb\u0403\u040a\u040d\u0415"+
		"\u041e\u0425\u042d\u0439\u044f\u0457\u045b\u045f\u0466\u0470\u0474\u0478";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}