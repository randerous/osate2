// $ANTLR 3.4 AadlBa.g 2012-07-27 12:00:47
 
  package fr.tpt.aadl.annex.behavior.parser;
  
  //import org.antlr.runtime;
  
  import org.eclipse.emf.common.util.BasicEList ;

  import org.antlr.runtime.BaseRecognizer;
  import org.antlr.runtime.BitSet;
  import org.antlr.runtime.DFA;
  import org.antlr.runtime.EarlyExitException;
  import org.antlr.runtime.FailedPredicateException;
  import org.antlr.runtime.MismatchedNotSetException;
  import org.antlr.runtime.MismatchedRangeException;
  import org.antlr.runtime.MismatchedSetException;
  import org.antlr.runtime.MismatchedTokenException;
  import org.antlr.runtime.MismatchedTreeNodeException;
  import org.antlr.runtime.NoViableAltException;
  import org.antlr.runtime.Parser;
  import org.antlr.runtime.RecognitionException;
  import org.antlr.runtime.Token;
  import org.antlr.runtime.TokenStream;
  
  import org.eclipse.emf.common.util.EList;

  import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;  
  
  import org.osate.aadl2.parsesupport.AObject;
  import org.osate.aadl2.parsesupport.LocationReference;
  
  import org.osate.annexsupport.AnnexHighlighterPositionAcceptor ;
  
  import fr.tpt.aadl.annex.behavior.aadlba.*;
  import fr.tpt.aadl.annex.behavior.declarative.* ;
  import fr.tpt.aadl.annex.behavior.analyzers.DeclarativeUtils ;
  
  import fr.tpt.aadl.annex.behavior.texteditor.AadlBaHighlighter ;
  import fr.tpt.aadl.annex.behavior.texteditor.DefaultAadlBaHighlighter ;
  
  import org.osate.aadl2.Element ;
  import org.osate.aadl2.Aadl2Package ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the Eclipse Public License as published by Eclipse,
 * either version 1.0 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see 
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AadlBaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AND", "ANY", "ASSIGN", "BASE", "BASED_INTEGER", "COLON", "COMMA", "COMPLETE", "COMPUTATION", "CONCAT", "COUNT", "DIGIT", "DISPATCH", "DIVIDE", "DO", "DOT", "DOTDOT", "DOUBLECOLON", "ELSE", "ELSIF", "END", "ENUMERATOR", "EQUAL", "ESC", "EXCLAM", "EXCLGREATER", "EXCLLESS", "EXPONENT", "EXTENDED_DIGIT", "FALSE", "FINAL", "FOR", "FORALL", "FRESH", "FROZEN", "GGREATER", "GREATEROREQUAL", "GREATERTHAN", "HASH", "HEX_DIGIT", "IDENT", "IF", "IN", "INITIAL", "INTEGER_LIT", "INTERROG", "INT_EXPONENT", "LBRACK", "LCURLY", "LESSOREQUAL", "LESSTHAN", "LETTER", "LPAREN", "LTRANS", "MINUS", "MOD", "NOT", "NOTEQUAL", "ON", "OR", "OTHERWISE", "PLUS", "RBRACK", "RCURLY", "REAL_LIT", "REM", "RPAREN", "RTRANS", "SEMICOLON", "SL_COMMENT", "STAR", "STARSTAR", "STATE", "STATES", "STOP", "STRING_LITERAL", "TICK", "TIMEOUT", "TRANSITIONS", "TRUE", "UNTIL", "VARIABLES", "WHILE", "WS", "XOR"
    };

    public static final int EOF=-1;
    public static final int ABS=4;
    public static final int AND=5;
    public static final int ANY=6;
    public static final int ASSIGN=7;
    public static final int BASE=8;
    public static final int BASED_INTEGER=9;
    public static final int COLON=10;
    public static final int COMMA=11;
    public static final int COMPLETE=12;
    public static final int COMPUTATION=13;
    public static final int CONCAT=14;
    public static final int COUNT=15;
    public static final int DIGIT=16;
    public static final int DISPATCH=17;
    public static final int DIVIDE=18;
    public static final int DO=19;
    public static final int DOT=20;
    public static final int DOTDOT=21;
    public static final int DOUBLECOLON=22;
    public static final int ELSE=23;
    public static final int ELSIF=24;
    public static final int END=25;
    public static final int ENUMERATOR=26;
    public static final int EQUAL=27;
    public static final int ESC=28;
    public static final int EXCLAM=29;
    public static final int EXCLGREATER=30;
    public static final int EXCLLESS=31;
    public static final int EXPONENT=32;
    public static final int EXTENDED_DIGIT=33;
    public static final int FALSE=34;
    public static final int FINAL=35;
    public static final int FOR=36;
    public static final int FORALL=37;
    public static final int FRESH=38;
    public static final int FROZEN=39;
    public static final int GGREATER=40;
    public static final int GREATEROREQUAL=41;
    public static final int GREATERTHAN=42;
    public static final int HASH=43;
    public static final int HEX_DIGIT=44;
    public static final int IDENT=45;
    public static final int IF=46;
    public static final int IN=47;
    public static final int INITIAL=48;
    public static final int INTEGER_LIT=49;
    public static final int INTERROG=50;
    public static final int INT_EXPONENT=51;
    public static final int LBRACK=52;
    public static final int LCURLY=53;
    public static final int LESSOREQUAL=54;
    public static final int LESSTHAN=55;
    public static final int LETTER=56;
    public static final int LPAREN=57;
    public static final int LTRANS=58;
    public static final int MINUS=59;
    public static final int MOD=60;
    public static final int NOT=61;
    public static final int NOTEQUAL=62;
    public static final int ON=63;
    public static final int OR=64;
    public static final int OTHERWISE=65;
    public static final int PLUS=66;
    public static final int RBRACK=67;
    public static final int RCURLY=68;
    public static final int REAL_LIT=69;
    public static final int REM=70;
    public static final int RPAREN=71;
    public static final int RTRANS=72;
    public static final int SEMICOLON=73;
    public static final int SL_COMMENT=74;
    public static final int STAR=75;
    public static final int STARSTAR=76;
    public static final int STATE=77;
    public static final int STATES=78;
    public static final int STOP=79;
    public static final int STRING_LITERAL=80;
    public static final int TICK=81;
    public static final int TIMEOUT=82;
    public static final int TRANSITIONS=83;
    public static final int TRUE=84;
    public static final int UNTIL=85;
    public static final int VARIABLES=86;
    public static final int WHILE=87;
    public static final int WS=88;
    public static final int XOR=89;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AadlBaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AadlBaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return AadlBaParser.tokenNames; }
    public String getGrammarFileName() { return "AadlBa.g"; }


      /**
      * Aadl Ba metamodel factory.
      */
      protected AadlBaFactory _fact = AadlBaFactory.eINSTANCE ;
      
      protected DeclarativeFactory _decl = DeclarativeFactory.eINSTANCE ;
      

      /**
       * The error reporter to use.
       */
      protected ParseErrorReporter errReporter = null;
      
      /**
       * The aadl filename to be parsed.
       */
      private String filename;
      
      /**
       * Set the error reporter to use.
       */
       
      public void setParseErrorReporter(final ParseErrorReporter reporter) {
          errReporter = reporter;
      }
      
      public void setFilename(String fn){
        filename=fn;
      }
      
      public String getFilename(){
        return filename;
      }
    /*  
      public void nameCopy(Name src, Name dest)
      {
        dest.setLocationReference(src.getLocationReference());
        dest.setIdentifierOwned(src.getIdentifierOwned());
        dest.getArrayIndexes().addAll(src.getArrayIndexes());
      }
    */  
      /**
       * Reports a parser error.
       * @param e  antlr error exception 
       */
      public  void reportError(RecognitionException e)  {
            String description=null;
            if (e instanceof MismatchedTokenException){
              MismatchedTokenException mte = (MismatchedTokenException) e;
              if (mte.expecting != -1)
                description = "Expecting: "+tokenNames[mte.expecting]+", found: "+mte.token.getText();
              else
                description = "Unexpected token '"+mte.token.getText()+"'";
            } else if (e instanceof MismatchedTreeNodeException){
              description = "Unexpected Tree Node Exception";
            } else if (e instanceof NoViableAltException){
              NoViableAltException nva = (NoViableAltException) e;
              description = "No viable alternative: "+nva.grammarDecisionDescription;
            } else if (e instanceof EarlyExitException){
              EarlyExitException ee = (EarlyExitException) e;
              description = "Early Exit";
            } else if (e instanceof FailedPredicateException){
              FailedPredicateException fp = (FailedPredicateException)e;
              description = "Semantic error: "+fp.predicateText;
            } else if (e instanceof MismatchedRangeException){
              MismatchedRangeException mr = (MismatchedRangeException)e;
              description = "Mismatched range: ";
            } else if (e instanceof MismatchedSetException){
              MismatchedSetException ms = (MismatchedSetException)e;
              description = "Mismatched set";
            } else if (e instanceof MismatchedNotSetException){
              description="Mismatched of inverse of a set";
            } 
            description += " at line " + e.line + " col " + e.charPositionInLine ;
            errReporter.error(this.getFilename(), e.line, description);
      }

      /**
       * Reports parser error.
       * @param e  any exception 
       */
      public  void reportError(Exception e) {
        //AadlParserPlugin.INSTANCE.log(e);
        errReporter.error(this.getFilename(), 0, e.toString());
      }

      /**
       * Sets obj's location reference based on full token informations.
       *
       * @param obj the AObject to be set
       * @param src the token 
       */ 
      private void setLocationReference(AObject obj, Token src){
        
        String description = "file " + this.getFilename() + " col " + src.getCharPositionInLine() ;
        
        obj.setLocationReference(new LocationReference(description, src.getLine()));
      
      }
      
      private BehaviorAnnex _ba = null ;
      
      // Default highlighter does nothing.
      private AadlBaHighlighter _ht = new DefaultAadlBaHighlighter() ;
      
      public void setHighlighter(AadlBaHighlighter ht)
      {
        _ht = ht ;
      }
      
      private void highlight(Token token, String id)
      {
        _ht.addToHighlighting(token, id);  
      }



    // $ANTLR start "behavior_annex"
    // AadlBa.g:375:1: behavior_annex returns [BehaviorAnnex BehAnnex] : (keyword= VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )? ( STATES (lbs= behavior_state_list )+ )? ( TRANSITIONS (BehTrans= behavior_transition )+ )? ;
    public final BehaviorAnnex behavior_annex() throws RecognitionException {
        BehaviorAnnex BehAnnex = null;


        Token keyword=null;
        List<BehaviorVariable> lbv =null;

        List<BehaviorState> lbs =null;

        DeclarativeBehaviorTransition BehTrans =null;



           BehAnnex = _fact.createBehaviorAnnex();
           _ba = BehAnnex ;
           BehAnnex.setLocationReference(new LocationReference(this.getFilename(), input.get(0).getLine())) ; 
              
         
        try {
            // AadlBa.g:382:3: ( (keyword= VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )? ( STATES (lbs= behavior_state_list )+ )? ( TRANSITIONS (BehTrans= behavior_transition )+ )? )
            // AadlBa.g:383:4: (keyword= VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )? ( STATES (lbs= behavior_state_list )+ )? ( TRANSITIONS (BehTrans= behavior_transition )+ )?
            {
            // AadlBa.g:383:4: (keyword= VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VARIABLES) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // AadlBa.g:383:6: keyword= VARIABLES (lbv= behavior_variable_list[BehAnnex] )+
                    {
                    keyword=(Token)match(input,VARIABLES,FOLLOW_VARIABLES_in_behavior_annex1192); if (state.failed) return BehAnnex;

                    if ( state.backtracking==0 ) {highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    // AadlBa.g:384:8: (lbv= behavior_variable_list[BehAnnex] )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==IDENT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // AadlBa.g:384:10: lbv= behavior_variable_list[BehAnnex]
                    	    {
                    	    pushFollow(FOLLOW_behavior_variable_list_in_behavior_annex1207);
                    	    lbv=behavior_variable_list(BehAnnex);

                    	    state._fsp--;
                    	    if (state.failed) return BehAnnex;

                    	    if ( state.backtracking==0 ) { BehAnnex.getVariables().addAll(lbv);}

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return BehAnnex;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }


            // AadlBa.g:387:4: ( STATES (lbs= behavior_state_list )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATES) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // AadlBa.g:387:6: STATES (lbs= behavior_state_list )+
                    {
                    match(input,STATES,FOLLOW_STATES_in_behavior_annex1230); if (state.failed) return BehAnnex;

                    // AadlBa.g:388:8: (lbs= behavior_state_list )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IDENT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // AadlBa.g:388:10: lbs= behavior_state_list
                    	    {
                    	    pushFollow(FOLLOW_behavior_state_list_in_behavior_annex1243);
                    	    lbs=behavior_state_list();

                    	    state._fsp--;
                    	    if (state.failed) return BehAnnex;

                    	    if ( state.backtracking==0 ) { BehAnnex.getStates().addAll(lbs); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return BehAnnex;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            // AadlBa.g:391:4: ( TRANSITIONS (BehTrans= behavior_transition )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TRANSITIONS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // AadlBa.g:391:6: TRANSITIONS (BehTrans= behavior_transition )+
                    {
                    match(input,TRANSITIONS,FOLLOW_TRANSITIONS_in_behavior_annex1265); if (state.failed) return BehAnnex;

                    // AadlBa.g:392:8: (BehTrans= behavior_transition )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==IDENT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // AadlBa.g:392:10: BehTrans= behavior_transition
                    	    {
                    	    pushFollow(FOLLOW_behavior_transition_in_behavior_annex1279);
                    	    BehTrans=behavior_transition();

                    	    state._fsp--;
                    	    if (state.failed) return BehAnnex;

                    	    if ( state.backtracking==0 ) {BehAnnex.getTransitions().add(BehTrans); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return BehAnnex;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehAnnex;
    }
    // $ANTLR end "behavior_annex"



    // $ANTLR start "behavior_variable_list"
    // AadlBa.g:404:1: behavior_variable_list[BehaviorAnnex ba] returns [List<BehaviorVariable> lbv] : bv= behavior_variable ( COMMA bv= behavior_variable )* COLON DataClassRef= unique_component_classifier_reference SEMICOLON ;
    public final List<BehaviorVariable> behavior_variable_list(BehaviorAnnex ba) throws RecognitionException {
        List<BehaviorVariable> lbv = null;


        BehaviorVariable bv =null;

        QualifiedNamedElement DataClassRef =null;



           lbv = new ArrayList<BehaviorVariable>() ;
         
        try {
            // AadlBa.g:408:3: (bv= behavior_variable ( COMMA bv= behavior_variable )* COLON DataClassRef= unique_component_classifier_reference SEMICOLON )
            // AadlBa.g:410:4: bv= behavior_variable ( COMMA bv= behavior_variable )* COLON DataClassRef= unique_component_classifier_reference SEMICOLON
            {
            pushFollow(FOLLOW_behavior_variable_in_behavior_variable_list1334);
            bv=behavior_variable();

            state._fsp--;
            if (state.failed) return lbv;

            if ( state.backtracking==0 ) {
                 lbv.add(bv) ;
               }

            // AadlBa.g:415:4: ( COMMA bv= behavior_variable )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // AadlBa.g:415:6: COMMA bv= behavior_variable
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_behavior_variable_list1351); if (state.failed) return lbv;

            	    pushFollow(FOLLOW_behavior_variable_in_behavior_variable_list1355);
            	    bv=behavior_variable();

            	    state._fsp--;
            	    if (state.failed) return lbv;

            	    if ( state.backtracking==0 ) {
            	           lbv.add(bv) ;
            	         }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,COLON,FOLLOW_COLON_in_behavior_variable_list1378); if (state.failed) return lbv;

            pushFollow(FOLLOW_unique_component_classifier_reference_in_behavior_variable_list1390);
            DataClassRef=unique_component_classifier_reference();

            state._fsp--;
            if (state.failed) return lbv;

            if ( state.backtracking==0 ) {
                  DeclarativeUtils.setEcontainer(_ba, DataClassRef);
                  
                  for(BehaviorVariable tmp : lbv)
                  {
                    tmp.setDataClassifier(DataClassRef);
                  }
               }

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_variable_list1400); if (state.failed) return lbv;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return lbv;
    }
    // $ANTLR end "behavior_variable_list"



    // $ANTLR start "behavior_variable"
    // AadlBa.g:443:1: behavior_variable returns [BehaviorVariable bv] : identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )* ;
    public final BehaviorVariable behavior_variable() throws RecognitionException {
        BehaviorVariable bv = null;


        Token identifier=null;
        IntegerValueConstant IntValue =null;



           bv = _fact.createBehaviorVariable();
         
        try {
            // AadlBa.g:448:3: (identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )* )
            // AadlBa.g:449:5: identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )*
            {
            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_variable1436); if (state.failed) return bv;

            if ( state.backtracking==0 ) { 
                                   setLocationReference(bv, identifier);
                                   bv.setName(identifier.getText()) ;
                                 }

            // AadlBa.g:453:5: ( LBRACK IntValue= integer_value_constant RBRACK )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LBRACK) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // AadlBa.g:453:7: LBRACK IntValue= integer_value_constant RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_behavior_variable1446); if (state.failed) return bv;

            	    pushFollow(FOLLOW_integer_value_constant_in_behavior_variable1450);
            	    IntValue=integer_value_constant();

            	    state._fsp--;
            	    if (state.failed) return bv;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_behavior_variable1452); if (state.failed) return bv;

            	    if ( state.backtracking==0 ) { 
            	            DeclarativeArrayDimension dad = _decl.createDeclarativeArrayDimension();
            	            dad.setLocationReference(IntValue.getLocationReference()) ;
            	            dad.setDimension(IntValue) ;
            	            bv.getArrayDimensions().add(dad); 
            	          }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return bv;
    }
    // $ANTLR end "behavior_variable"



    // $ANTLR start "qualifiable_named_element"
    // AadlBa.g:471:1: qualifiable_named_element[QualifiedNamedElement qne] : ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? ) ;
    public final void qualifiable_named_element(QualifiedNamedElement qne) throws RecognitionException {
        Token identifier1=null;
        Token identifier2=null;
        Token identifier3=null;


                String id1 = "";
                String id2 = "";
              
        try {
            // AadlBa.g:476:3: ( ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? ) )
            // AadlBa.g:477:4: ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? )
            {
            // AadlBa.g:477:4: ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? )
            // AadlBa.g:478:5: (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )?
            {
            // AadlBa.g:478:5: (identifier1= IDENT DOUBLECOLON )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==IDENT) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==DOUBLECOLON) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // AadlBa.g:478:7: identifier1= IDENT DOUBLECOLON
            	    {
            	    identifier1=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiable_named_element1507); if (state.failed) return ;

            	    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_qualifiable_named_element1509); if (state.failed) return ;

            	    if ( state.backtracking==0 ) { 
            	            id1=id1+(id1.length() == 0 ? "":"::")+identifier1.getText();
            	          }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            identifier2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiable_named_element1537); if (state.failed) return ;

            if ( state.backtracking==0 ) { id2=identifier2.getText(); }

            // AadlBa.g:486:5: ( DOT identifier3= IDENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DOT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==IDENT) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // AadlBa.g:486:7: DOT identifier3= IDENT
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiable_named_element1552); if (state.failed) return ;

                    identifier3=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiable_named_element1556); if (state.failed) return ;

                    if ( state.backtracking==0 ) { id2=id2+"."+identifier3.getText(); }

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
                 Identifier nameId = _decl.createIdentifier();
                 nameId.setId(id2);
                 setLocationReference(nameId, identifier2); 
                 qne.setBaName(nameId);
                
                 if (! id1.equals(""))
                 {
                   Identifier nameSpaceId = _decl.createIdentifier();
                   nameSpaceId.setId(id1);
                   setLocationReference(nameSpaceId, identifier1); 
                   qne.setBaNamespace(nameSpaceId);
                   setLocationReference(qne, identifier1);
                 }
                 else
                 {
                   setLocationReference(qne, identifier2);
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "qualifiable_named_element"



    // $ANTLR start "unique_component_classifier_reference"
    // AadlBa.g:517:1: unique_component_classifier_reference returns [QualifiedNamedElement DataClassRef] : ( qualifiable_named_element[DataClassRef] ) ;
    public final QualifiedNamedElement unique_component_classifier_reference() throws RecognitionException {
        QualifiedNamedElement DataClassRef = null;



           DataClassRef = _decl.createQualifiedNamedElement();
         
        try {
            // AadlBa.g:521:3: ( ( qualifiable_named_element[DataClassRef] ) )
            // AadlBa.g:522:4: ( qualifiable_named_element[DataClassRef] )
            {
            // AadlBa.g:522:4: ( qualifiable_named_element[DataClassRef] )
            // AadlBa.g:523:6: qualifiable_named_element[DataClassRef]
            {
            pushFollow(FOLLOW_qualifiable_named_element_in_unique_component_classifier_reference1612);
            qualifiable_named_element(DataClassRef);

            state._fsp--;
            if (state.failed) return DataClassRef;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DataClassRef;
    }
    // $ANTLR end "unique_component_classifier_reference"



    // $ANTLR start "behavior_state_list"
    // AadlBa.g:539:1: behavior_state_list returns [List<BehaviorState> lbs] : identifier= IDENT ( COMMA identifier= IDENT )* COLON ( (keyword= INITIAL )? (keyword= COMPLETE )? (keyword= FINAL )? ) STATE SEMICOLON ;
    public final List<BehaviorState> behavior_state_list() throws RecognitionException {
        List<BehaviorState> lbs = null;


        Token identifier=null;
        Token keyword=null;


           lbs = new ArrayList<BehaviorState>() ;
         
        try {
            // AadlBa.g:543:3: (identifier= IDENT ( COMMA identifier= IDENT )* COLON ( (keyword= INITIAL )? (keyword= COMPLETE )? (keyword= FINAL )? ) STATE SEMICOLON )
            // AadlBa.g:544:5: identifier= IDENT ( COMMA identifier= IDENT )* COLON ( (keyword= INITIAL )? (keyword= COMPLETE )? (keyword= FINAL )? ) STATE SEMICOLON
            {
            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_state_list1657); if (state.failed) return lbs;

            if ( state.backtracking==0 ) {
                    BehaviorState bs = _fact.createBehaviorState() ;
                    bs.setName(identifier.getText());
                    setLocationReference(bs, identifier); 
                    lbs.add(bs) ; 
                  }

            // AadlBa.g:551:4: ( COMMA identifier= IDENT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // AadlBa.g:551:6: COMMA identifier= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_behavior_state_list1673); if (state.failed) return lbs;

            	    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_state_list1677); if (state.failed) return lbs;

            	    if ( state.backtracking==0 ) {
            	            BehaviorState bs = _fact.createBehaviorState() ;
            	            bs.setName(identifier.getText());
            	            setLocationReference(bs, identifier); 
            	            lbs.add(bs) ; 
            	         }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,COLON,FOLLOW_COLON_in_behavior_state_list1697); if (state.failed) return lbs;

            // AadlBa.g:560:4: ( (keyword= INITIAL )? (keyword= COMPLETE )? (keyword= FINAL )? )
            // AadlBa.g:561:6: (keyword= INITIAL )? (keyword= COMPLETE )? (keyword= FINAL )?
            {
            // AadlBa.g:561:6: (keyword= INITIAL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==INITIAL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // AadlBa.g:561:7: keyword= INITIAL
                    {
                    keyword=(Token)match(input,INITIAL,FOLLOW_INITIAL_in_behavior_state_list1713); if (state.failed) return lbs;

                    if ( state.backtracking==0 ) {
                                     for (BehaviorState bs : lbs)
                                     {
                                       bs.setInitial(true)  ;
                                     } 
                                   }

                    }
                    break;

            }


            // AadlBa.g:567:6: (keyword= COMPLETE )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==COMPLETE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // AadlBa.g:567:7: keyword= COMPLETE
                    {
                    keyword=(Token)match(input,COMPLETE,FOLLOW_COMPLETE_in_behavior_state_list1730); if (state.failed) return lbs;

                    if ( state.backtracking==0 ) { 
                                     for (BehaviorState bs : lbs)
                                     {
                                       bs.setComplete(true)  ;
                                     } 
                                   }

                    }
                    break;

            }


            // AadlBa.g:573:6: (keyword= FINAL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==FINAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // AadlBa.g:573:7: keyword= FINAL
                    {
                    keyword=(Token)match(input,FINAL,FOLLOW_FINAL_in_behavior_state_list1746); if (state.failed) return lbs;

                    if ( state.backtracking==0 ) { 
                                     for (BehaviorState bs : lbs)
                                     {
                                       bs.setFinal(true)  ;
                                     } 
                                   }

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
                 highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);  
               }

            match(input,STATE,FOLLOW_STATE_in_behavior_state_list1770); if (state.failed) return lbs;

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_state_list1772); if (state.failed) return lbs;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return lbs;
    }
    // $ANTLR end "behavior_state_list"



    // $ANTLR start "behavior_transition"
    // AadlBa.g:598:1: behavior_transition returns [DeclarativeBehaviorTransition BehTrans] : (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )? identifier= IDENT ( COMMA identifier= IDENT )* (identifier= LTRANS BehCond= behavior_condition RTRANS ) identifier= IDENT (BehActionBlock= behavior_action_block )? SEMICOLON ;
    public final DeclarativeBehaviorTransition behavior_transition() throws RecognitionException {
        DeclarativeBehaviorTransition BehTrans = null;


        Token identifier=null;
        Integer Num =null;

        BehaviorCondition BehCond =null;

        BehaviorActionBlock BehActionBlock =null;



           BehTrans = _decl.createDeclarativeBehaviorTransition();
         
        try {
            // AadlBa.g:603:3: ( (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )? identifier= IDENT ( COMMA identifier= IDENT )* (identifier= LTRANS BehCond= behavior_condition RTRANS ) identifier= IDENT (BehActionBlock= behavior_action_block )? SEMICOLON )
            // AadlBa.g:604:4: (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )? identifier= IDENT ( COMMA identifier= IDENT )* (identifier= LTRANS BehCond= behavior_condition RTRANS ) identifier= IDENT (BehActionBlock= behavior_action_block )? SEMICOLON
            {
            // AadlBa.g:604:4: (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENT) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==COLON||LA16_1==LBRACK) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // AadlBa.g:604:6: identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON
                    {
                    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1814); if (state.failed) return BehTrans;

                    if ( state.backtracking==0 ) {
                           BehTrans.setName(identifier.getText()) ;
                           setLocationReference(BehTrans, identifier); 
                         }

                    // AadlBa.g:609:6: ( LBRACK Num= numeral RBRACK )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==LBRACK) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // AadlBa.g:609:8: LBRACK Num= numeral RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_behavior_transition1832); if (state.failed) return BehTrans;

                            pushFollow(FOLLOW_numeral_in_behavior_transition1836);
                            Num=numeral();

                            state._fsp--;
                            if (state.failed) return BehTrans;

                            match(input,RBRACK,FOLLOW_RBRACK_in_behavior_transition1838); if (state.failed) return BehTrans;

                            if ( state.backtracking==0 ) { BehTrans.setPriority(Num);}

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_behavior_transition1851); if (state.failed) return BehTrans;

                    }
                    break;

            }


            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1870); if (state.failed) return BehTrans;

            if ( state.backtracking==0 ) { 
                 Identifier Id = _decl.createIdentifier();
                 Id.setId(identifier.getText());
                 setLocationReference(Id, identifier); 
                 BehTrans.getSrcStates().add(Id);
                
                 if(BehTrans.getLocationReference() == null)
                 {
                   BehTrans.setLocationReference(Id.getLocationReference()) ;
                 } 
               }

            // AadlBa.g:626:4: ( COMMA identifier= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // AadlBa.g:626:6: COMMA identifier= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_behavior_transition1887); if (state.failed) return BehTrans;

            	    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1891); if (state.failed) return BehTrans;

            	    if ( state.backtracking==0 ) { 
            	          Identifier Id = _decl.createIdentifier();
            	          Id.setId(identifier.getText());
            	          setLocationReference(Id, identifier); 
            	          BehTrans.getSrcStates().add(Id);
            	         }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // AadlBa.g:635:4: (identifier= LTRANS BehCond= behavior_condition RTRANS )
            // AadlBa.g:635:6: identifier= LTRANS BehCond= behavior_condition RTRANS
            {
            identifier=(Token)match(input,LTRANS,FOLLOW_LTRANS_in_behavior_transition1919); if (state.failed) return BehTrans;

            pushFollow(FOLLOW_behavior_condition_in_behavior_transition1923);
            BehCond=behavior_condition();

            state._fsp--;
            if (state.failed) return BehTrans;

            if ( state.backtracking==0 ) { 
                   // behavior condition can be null.
                   if (BehCond != null)
                   {
                     DeclarativeUtils.setEcontainer(_ba, BehCond);
                     BehTrans.setCondition(BehCond);
                   }
                 }

            match(input,RTRANS,FOLLOW_RTRANS_in_behavior_transition1938); if (state.failed) return BehTrans;

            }


            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1955); if (state.failed) return BehTrans;

            if ( state.backtracking==0 ) {
                 Identifier Id = _decl.createIdentifier();
                 Id.setId(identifier.getText());
                 setLocationReference(Id, identifier); 
                 BehTrans.setDestState(Id);
               }

            // AadlBa.g:655:4: (BehActionBlock= behavior_action_block )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LCURLY) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // AadlBa.g:655:6: BehActionBlock= behavior_action_block
                    {
                    pushFollow(FOLLOW_behavior_action_block_in_behavior_transition1975);
                    BehActionBlock=behavior_action_block();

                    state._fsp--;
                    if (state.failed) return BehTrans;

                    if ( state.backtracking==0 ) { 
                              DeclarativeUtils.setEcontainer(_ba, BehActionBlock);
                              BehTrans.setActionBlock(BehActionBlock);
                            }

                    }
                    break;

            }


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_transition2006); if (state.failed) return BehTrans;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehTrans;
    }
    // $ANTLR end "behavior_transition"



    // $ANTLR start "behavior_action_block"
    // AadlBa.g:672:1: behavior_action_block returns [BehaviorActionBlock BehActionBlock] : identifier= LCURLY BehActions= behavior_actions RCURLY ( TIMEOUT BehTime= behavior_time )? ;
    public final BehaviorActionBlock behavior_action_block() throws RecognitionException {
        BehaviorActionBlock BehActionBlock = null;


        Token identifier=null;
        BehaviorActions BehActions =null;

        DeclarativeTime BehTime =null;



                 BehActionBlock = _fact.createBehaviorActionBlock() ;
         
        try {
            // AadlBa.g:676:3: (identifier= LCURLY BehActions= behavior_actions RCURLY ( TIMEOUT BehTime= behavior_time )? )
            // AadlBa.g:676:5: identifier= LCURLY BehActions= behavior_actions RCURLY ( TIMEOUT BehTime= behavior_time )?
            {
            identifier=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action_block2036); if (state.failed) return BehActionBlock;

            pushFollow(FOLLOW_behavior_actions_in_behavior_action_block2040);
            BehActions=behavior_actions();

            state._fsp--;
            if (state.failed) return BehActionBlock;

            match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action_block2042); if (state.failed) return BehActionBlock;

            if ( state.backtracking==0 ) {
                   BehActionBlock.setContent(BehActions) ;
                   setLocationReference(BehActionBlock, identifier);
                   DeclarativeUtils.setEcontainer(_ba, BehActionBlock);
                }

            // AadlBa.g:683:5: ( TIMEOUT BehTime= behavior_time )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TIMEOUT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // AadlBa.g:683:7: TIMEOUT BehTime= behavior_time
                    {
                    match(input,TIMEOUT,FOLLOW_TIMEOUT_in_behavior_action_block2064); if (state.failed) return BehActionBlock;

                    pushFollow(FOLLOW_behavior_time_in_behavior_action_block2068);
                    BehTime=behavior_time();

                    state._fsp--;
                    if (state.failed) return BehActionBlock;

                    if ( state.backtracking==0 ) {
                            BehActionBlock.setTimeout(BehTime) ;
                          }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehActionBlock;
    }
    // $ANTLR end "behavior_action_block"



    // $ANTLR start "behavior_condition"
    // AadlBa.g:698:1: behavior_condition returns [BehaviorCondition BehCond] : (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? ) ;
    public final BehaviorCondition behavior_condition() throws RecognitionException {
        BehaviorCondition BehCond = null;


        Token pos=null;
        DispatchCondition DisCond =null;

        ExecuteCondition ExecCond =null;



         
        try {
            // AadlBa.g:701:3: ( (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? ) )
            // AadlBa.g:702:4: (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? )
            {
            // AadlBa.g:702:4: (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ON) ) {
                alt21=1;
            }
            else if ( (LA21_0==ABS||LA21_0==FALSE||LA21_0==IDENT||LA21_0==INTEGER_LIT||LA21_0==LPAREN||LA21_0==MINUS||LA21_0==NOT||(LA21_0 >= OTHERWISE && LA21_0 <= PLUS)||LA21_0==REAL_LIT||LA21_0==RTRANS||LA21_0==STRING_LITERAL||LA21_0==TIMEOUT||LA21_0==TRUE) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return BehCond;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // AadlBa.g:703:8: pos= ON DisCond= dispatch_condition
                    {
                    pos=(Token)match(input,ON,FOLLOW_ON_in_behavior_condition2126); if (state.failed) return BehCond;

                    pushFollow(FOLLOW_dispatch_condition_in_behavior_condition2130);
                    DisCond=dispatch_condition();

                    state._fsp--;
                    if (state.failed) return BehCond;

                    if ( state.backtracking==0 ) {
                             setLocationReference(DisCond, pos);
                           }

                    }
                    break;
                case 2 :
                    // AadlBa.g:708:8: (ExecCond= execute_condition )?
                    {
                    // AadlBa.g:708:8: (ExecCond= execute_condition )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==ABS||LA20_0==FALSE||LA20_0==IDENT||LA20_0==INTEGER_LIT||LA20_0==LPAREN||LA20_0==MINUS||LA20_0==NOT||(LA20_0 >= OTHERWISE && LA20_0 <= PLUS)||LA20_0==REAL_LIT||LA20_0==STRING_LITERAL||LA20_0==TIMEOUT||LA20_0==TRUE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // AadlBa.g:708:9: ExecCond= execute_condition
                            {
                            pushFollow(FOLLOW_execute_condition_in_behavior_condition2158);
                            ExecCond=execute_condition();

                            state._fsp--;
                            if (state.failed) return BehCond;

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                 if (DisCond != null)
                 {
                   BehCond = DisCond;
                 } 
                 else
                 {
                   BehCond = ExecCond;
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehCond;
    }
    // $ANTLR end "behavior_condition"



    // $ANTLR start "execute_condition"
    // AadlBa.g:737:1: execute_condition returns [ExecuteCondition ExecCond] : (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression ) ;
    public final ExecuteCondition execute_condition() throws RecognitionException {
        ExecuteCondition ExecCond = null;


        Token identifier=null;
        ValueExpression ValExpr =null;



            ExecCond= null ;
         
        try {
            // AadlBa.g:742:3: ( (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression ) )
            // AadlBa.g:743:4: (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression )
            {
            // AadlBa.g:743:4: (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression )
            int alt22=3;
            switch ( input.LA(1) ) {
            case TIMEOUT:
                {
                alt22=1;
                }
                break;
            case OTHERWISE:
                {
                alt22=2;
                }
                break;
            case ABS:
            case FALSE:
            case IDENT:
            case INTEGER_LIT:
            case LPAREN:
            case MINUS:
            case NOT:
            case PLUS:
            case REAL_LIT:
            case STRING_LITERAL:
            case TRUE:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ExecCond;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // AadlBa.g:744:8: identifier= TIMEOUT
                    {
                    identifier=(Token)match(input,TIMEOUT,FOLLOW_TIMEOUT_in_execute_condition2218); if (state.failed) return ExecCond;

                    if ( state.backtracking==0 ) {
                             ExecCond = _fact.createExecutionTimeoutCatch();
                             setLocationReference(ExecCond, identifier);
                           }

                    }
                    break;
                case 2 :
                    // AadlBa.g:750:8: identifier= OTHERWISE
                    {
                    identifier=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_execute_condition2245); if (state.failed) return ExecCond;

                    if ( state.backtracking==0 ) {
                             ExecCond = _fact.createOtherwise() ;
                             setLocationReference(ExecCond, identifier);
                           }

                    }
                    break;
                case 3 :
                    // AadlBa.g:756:8: ValExpr= value_expression
                    {
                    pushFollow(FOLLOW_value_expression_in_execute_condition2279);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return ExecCond;

                    if ( state.backtracking==0 ) { 
                             ExecCond = ValExpr ;
                           }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ExecCond;
    }
    // $ANTLR end "execute_condition"



    // $ANTLR start "integer_value_constant"
    // AadlBa.g:768:1: integer_value_constant returns [IntegerValueConstant ivc] : (il= integer_literal |prop= property );
    public final IntegerValueConstant integer_value_constant() throws RecognitionException {
        IntegerValueConstant ivc = null;


        BehaviorIntegerLiteral il =null;

        QualifiedNamedElement prop =null;


        try {
            // AadlBa.g:770:2: (il= integer_literal |prop= property )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==INTEGER_LIT) ) {
                alt23=1;
            }
            else if ( (LA23_0==IDENT) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ivc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // AadlBa.g:771:6: il= integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_integer_value_constant2323);
                    il=integer_literal();

                    state._fsp--;
                    if (state.failed) return ivc;

                    if ( state.backtracking==0 ) {ivc = il ;}

                    }
                    break;
                case 2 :
                    // AadlBa.g:774:6: prop= property
                    {
                    pushFollow(FOLLOW_property_in_integer_value_constant2345);
                    prop=property();

                    state._fsp--;
                    if (state.failed) return ivc;

                    if ( state.backtracking==0 ) {ivc = prop;}

                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ivc;
    }
    // $ANTLR end "integer_value_constant"



    // $ANTLR start "dispatch_condition"
    // AadlBa.g:800:1: dispatch_condition returns [DispatchCondition DisCond] : DISPATCH (DisTriggCond= dispatch_trigger_condition )? ( FROZEN port= reference ( COMMA port= reference )* )? ;
    public final DispatchCondition dispatch_condition() throws RecognitionException {
        DispatchCondition DisCond = null;


        DispatchTriggerCondition DisTriggCond =null;

        Reference port =null;



           // Location reference is set in behavior_transition
           DisCond = _fact.createDispatchCondition ();
         
        try {
            // AadlBa.g:805:3: ( DISPATCH (DisTriggCond= dispatch_trigger_condition )? ( FROZEN port= reference ( COMMA port= reference )* )? )
            // AadlBa.g:806:4: DISPATCH (DisTriggCond= dispatch_trigger_condition )? ( FROZEN port= reference ( COMMA port= reference )* )?
            {
            match(input,DISPATCH,FOLLOW_DISPATCH_in_dispatch_condition2396); if (state.failed) return DisCond;

            // AadlBa.g:807:4: (DisTriggCond= dispatch_trigger_condition )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENT||LA24_0==STOP||LA24_0==TIMEOUT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // AadlBa.g:807:6: DisTriggCond= dispatch_trigger_condition
                    {
                    pushFollow(FOLLOW_dispatch_trigger_condition_in_dispatch_condition2406);
                    DisTriggCond=dispatch_trigger_condition();

                    state._fsp--;
                    if (state.failed) return DisCond;

                    if ( state.backtracking==0 ) {
                           DisCond.setDispatchTriggerCondition (DisTriggCond);
                         }

                    }
                    break;

            }


            // AadlBa.g:813:4: ( FROZEN port= reference ( COMMA port= reference )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FROZEN) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // AadlBa.g:813:6: FROZEN port= reference ( COMMA port= reference )*
                    {
                    match(input,FROZEN,FOLLOW_FROZEN_in_dispatch_condition2430); if (state.failed) return DisCond;

                    pushFollow(FOLLOW_reference_in_dispatch_condition2434);
                    port=reference();

                    state._fsp--;
                    if (state.failed) return DisCond;

                    if ( state.backtracking==0 ) {
                           DisCond.getFrozenPorts().add(port);
                         }

                    // AadlBa.g:817:6: ( COMMA port= reference )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==COMMA) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // AadlBa.g:817:8: COMMA port= reference
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_dispatch_condition2450); if (state.failed) return DisCond;

                    	    pushFollow(FOLLOW_reference_in_dispatch_condition2454);
                    	    port=reference();

                    	    state._fsp--;
                    	    if (state.failed) return DisCond;

                    	    if ( state.backtracking==0 ) {
                    	             DisCond.getFrozenPorts().add(port);
                    	           }

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisCond;
    }
    // $ANTLR end "dispatch_condition"



    // $ANTLR start "dispatch_trigger_condition"
    // AadlBa.g:842:1: dispatch_trigger_condition returns [DispatchTriggerCondition DisTriggCond] : (identifier= STOP | (identifier= TIMEOUT (BehTime= behavior_time )? ) |DisTriggLogicalExpr= dispatch_trigger_logical_expression );
    public final DispatchTriggerCondition dispatch_trigger_condition() throws RecognitionException {
        DispatchTriggerCondition DisTriggCond = null;


        Token identifier=null;
        DeclarativeTime BehTime =null;

        DispatchTriggerLogicalExpression DisTriggLogicalExpr =null;



           DisTriggCond = null ;
         
        try {
            // AadlBa.g:846:4: (identifier= STOP | (identifier= TIMEOUT (BehTime= behavior_time )? ) |DisTriggLogicalExpr= dispatch_trigger_logical_expression )
            int alt28=3;
            switch ( input.LA(1) ) {
            case STOP:
                {
                alt28=1;
                }
                break;
            case TIMEOUT:
                {
                alt28=2;
                }
                break;
            case IDENT:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return DisTriggCond;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // AadlBa.g:852:8: identifier= STOP
                    {
                    identifier=(Token)match(input,STOP,FOLLOW_STOP_in_dispatch_trigger_condition2556); if (state.failed) return DisTriggCond;

                    if ( state.backtracking==0 ) { DisTriggCond = _fact.createDispatchTriggerConditionStop() ;
                             setLocationReference(DisTriggCond, identifier) ;
                           }

                    }
                    break;
                case 2 :
                    // AadlBa.g:857:8: (identifier= TIMEOUT (BehTime= behavior_time )? )
                    {
                    // AadlBa.g:857:8: (identifier= TIMEOUT (BehTime= behavior_time )? )
                    // AadlBa.g:857:10: identifier= TIMEOUT (BehTime= behavior_time )?
                    {
                    identifier=(Token)match(input,TIMEOUT,FOLLOW_TIMEOUT_in_dispatch_trigger_condition2585); if (state.failed) return DisTriggCond;

                    if ( state.backtracking==0 ) { DisTriggCond = _fact.createDispatchRelativeTimeout() ;
                               setLocationReference(DisTriggCond, identifier) ;
                             }

                    // AadlBa.g:861:10: (BehTime= behavior_time )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==FALSE||LA27_0==IDENT||LA27_0==INTEGER_LIT||LA27_0==REAL_LIT||LA27_0==STRING_LITERAL||LA27_0==TRUE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // AadlBa.g:862:12: BehTime= behavior_time
                            {
                            pushFollow(FOLLOW_behavior_time_in_dispatch_trigger_condition2627);
                            BehTime=behavior_time();

                            state._fsp--;
                            if (state.failed) return DisTriggCond;

                            if ( state.backtracking==0 ) { 
                                         DisTriggCond = BehTime ;
                                       }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:869:8: DisTriggLogicalExpr= dispatch_trigger_logical_expression
                    {
                    pushFollow(FOLLOW_dispatch_trigger_logical_expression_in_dispatch_trigger_condition2680);
                    DisTriggLogicalExpr=dispatch_trigger_logical_expression();

                    state._fsp--;
                    if (state.failed) return DisTriggCond;

                    if ( state.backtracking==0 ) {
                             DisTriggCond = DisTriggLogicalExpr ;
                           }

                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisTriggCond;
    }
    // $ANTLR end "dispatch_trigger_condition"



    // $ANTLR start "dispatch_trigger_logical_expression"
    // AadlBa.g:882:1: dispatch_trigger_logical_expression returns [DispatchTriggerLogicalExpression\n DisTriggLogicalExpr] : DisConjunct= dispatch_conjunction ( OR DisConjunct= dispatch_conjunction )* ;
    public final DispatchTriggerLogicalExpression dispatch_trigger_logical_expression() throws RecognitionException {
        DispatchTriggerLogicalExpression DisTriggLogicalExpr = null;


        DispatchConjunction DisConjunct =null;



           DisTriggLogicalExpr = _fact.createDispatchTriggerLogicalExpression ();
         
        try {
            // AadlBa.g:887:4: (DisConjunct= dispatch_conjunction ( OR DisConjunct= dispatch_conjunction )* )
            // AadlBa.g:888:6: DisConjunct= dispatch_conjunction ( OR DisConjunct= dispatch_conjunction )*
            {
            pushFollow(FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2726);
            DisConjunct=dispatch_conjunction();

            state._fsp--;
            if (state.failed) return DisTriggLogicalExpr;

            if ( state.backtracking==0 ) {
                   DisTriggLogicalExpr.getDispatchConjunctions().add(DisConjunct) ;
                   DisTriggLogicalExpr.setLocationReference(
                     DisConjunct.getLocationReference());
                 }

            // AadlBa.g:894:6: ( OR DisConjunct= dispatch_conjunction )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==OR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // AadlBa.g:895:8: OR DisConjunct= dispatch_conjunction
            	    {
            	    match(input,OR,FOLLOW_OR_in_dispatch_trigger_logical_expression2749); if (state.failed) return DisTriggLogicalExpr;

            	    pushFollow(FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2753);
            	    DisConjunct=dispatch_conjunction();

            	    state._fsp--;
            	    if (state.failed) return DisTriggLogicalExpr;

            	    if ( state.backtracking==0 ) {
            	             DisTriggLogicalExpr.getDispatchConjunctions().add(DisConjunct) ;
            	           }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisTriggLogicalExpr;
    }
    // $ANTLR end "dispatch_trigger_logical_expression"



    // $ANTLR start "dispatch_conjunction"
    // AadlBa.g:913:1: dispatch_conjunction returns [DispatchConjunction DisConjunct] : ref= reference (keyword= AND ref= reference )* ;
    public final DispatchConjunction dispatch_conjunction() throws RecognitionException {
        DispatchConjunction DisConjunct = null;


        Token keyword=null;
        Reference ref =null;



           DisConjunct = _fact.createDispatchConjunction ();
         
        try {
            // AadlBa.g:918:4: (ref= reference (keyword= AND ref= reference )* )
            // AadlBa.g:919:6: ref= reference (keyword= AND ref= reference )*
            {
            pushFollow(FOLLOW_reference_in_dispatch_conjunction2812);
            ref=reference();

            state._fsp--;
            if (state.failed) return DisConjunct;

            if ( state.backtracking==0 ) {
                   DisConjunct.getDispatchTriggers().add(ref) ;
                   DisConjunct.setLocationReference(ref.getLocationReference());
                 }

            // AadlBa.g:924:6: (keyword= AND ref= reference )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==AND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // AadlBa.g:925:8: keyword= AND ref= reference
            	    {
            	    keyword=(Token)match(input,AND,FOLLOW_AND_in_dispatch_conjunction2837); if (state.failed) return DisConjunct;

            	    pushFollow(FOLLOW_reference_in_dispatch_conjunction2841);
            	    ref=reference();

            	    state._fsp--;
            	    if (state.failed) return DisConjunct;

            	    if ( state.backtracking==0 ) {
            	             DisConjunct.getDispatchTriggers().add(ref) ;
            	             highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
            	           }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisConjunct;
    }
    // $ANTLR end "dispatch_conjunction"



    // $ANTLR start "behavior_actions"
    // AadlBa.g:958:1: behavior_actions returns [BehaviorActions BehActs] : BehAction= behavior_action ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* ) ;
    public final BehaviorActions behavior_actions() throws RecognitionException {
        BehaviorActions BehActs = null;


        BehaviorAction BehAction =null;

        BehaviorAction BehAction2 =null;



           BehActs = null ;
           EList<BehaviorAction> tmpList = new BasicEList<BehaviorAction>() ;
           BehaviorActionCollection col = null ;
         
        try {
            // AadlBa.g:964:3: (BehAction= behavior_action ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* ) )
            // AadlBa.g:965:4: BehAction= behavior_action ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* )
            {
            pushFollow(FOLLOW_behavior_action_in_behavior_actions2909);
            BehAction=behavior_action();

            state._fsp--;
            if (state.failed) return BehActs;

            if ( state.backtracking==0 ) {
                 BehActs = BehAction ;
               }

            // AadlBa.g:970:4: ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* )
            int alt33=2;
            switch ( input.LA(1) ) {
            case SEMICOLON:
                {
                alt33=1;
                }
                break;
            case RCURLY:
                {
                int LA33_2 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;

                }
                }
                break;
            case ELSIF:
                {
                int LA33_3 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;

                }
                }
                break;
            case ELSE:
                {
                int LA33_4 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 4, input);

                    throw nvae;

                }
                }
                break;
            case END:
                {
                int LA33_5 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 5, input);

                    throw nvae;

                }
                }
                break;
            case UNTIL:
                {
                int LA33_6 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 6, input);

                    throw nvae;

                }
                }
                break;
            case EOF:
                {
                int LA33_7 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 7, input);

                    throw nvae;

                }
                }
                break;
            case CONCAT:
                {
                alt33=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return BehActs;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // AadlBa.g:971:9: ( SEMICOLON BehAction2= behavior_action )*
                    {
                    // AadlBa.g:971:9: ( SEMICOLON BehAction2= behavior_action )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==SEMICOLON) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // AadlBa.g:971:11: SEMICOLON BehAction2= behavior_action
                    	    {
                    	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_actions2935); if (state.failed) return BehActs;

                    	    pushFollow(FOLLOW_behavior_action_in_behavior_actions2939);
                    	    BehAction2=behavior_action();

                    	    state._fsp--;
                    	    if (state.failed) return BehActs;

                    	    if ( state.backtracking==0 ) {
                    	                  tmpList.add(BehAction2) ;
                    	                }

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { col = _fact.createBehaviorActionSequence() ; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:978:9: ( CONCAT BehAction2= behavior_action )*
                    {
                    // AadlBa.g:978:9: ( CONCAT BehAction2= behavior_action )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==CONCAT) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // AadlBa.g:978:11: CONCAT BehAction2= behavior_action
                    	    {
                    	    match(input,CONCAT,FOLLOW_CONCAT_in_behavior_actions2995); if (state.failed) return BehActs;

                    	    pushFollow(FOLLOW_behavior_action_in_behavior_actions2999);
                    	    BehAction2=behavior_action();

                    	    state._fsp--;
                    	    if (state.failed) return BehActs;

                    	    if ( state.backtracking==0 ) {
                    	                  tmpList.add(BehAction2) ;
                    	                }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { col = _fact.createBehaviorActionSet() ; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                  if (tmpList.size() != 0)
                  { 
                    col.getActions().add(BehAction);
                    col.getActions().addAll(tmpList);
                    col.setLocationReference(BehActs.getLocationReference());
                    BehActs = col ;
                  }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehActs;
    }
    // $ANTLR end "behavior_actions"



    // $ANTLR start "behavior_action"
    // AadlBa.g:1016:1: behavior_action returns [BehaviorAction BehAction] : ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) ) ;
    public final BehaviorAction behavior_action() throws RecognitionException {
        BehaviorAction BehAction = null;


        Token identifier1=null;
        Token identifier2=null;
        Token identifier=null;
        BasicAction BaAct =null;

        BehaviorActionBlock BehActionBlock =null;

        ValueExpression ValExpr =null;

        BehaviorActions BehActions =null;

        QualifiedNamedElement dt =null;

        ElementValues EltVal =null;



           BehAction = null;
           IfStatement IfStat = null ;
           IfStatement tmpIfStat = null ;
           ForOrForAllStatement ForStat = null ;
           IterativeVariable itVar = null ;
         
        try {
            // AadlBa.g:1024:3: ( ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) ) )
            // AadlBa.g:1025:4: ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) )
            {
            // AadlBa.g:1025:4: ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) )
            int alt36=7;
            switch ( input.LA(1) ) {
            case COMPUTATION:
            case IDENT:
            case STAR:
                {
                alt36=1;
                }
                break;
            case LCURLY:
                {
                alt36=2;
                }
                break;
            case IF:
                {
                alt36=3;
                }
                break;
            case FOR:
                {
                alt36=4;
                }
                break;
            case FORALL:
                {
                alt36=5;
                }
                break;
            case WHILE:
                {
                alt36=6;
                }
                break;
            case DO:
                {
                alt36=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return BehAction;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // AadlBa.g:1026:6: (BaAct= basic_action )
                    {
                    // AadlBa.g:1026:6: (BaAct= basic_action )
                    // AadlBa.g:1026:8: BaAct= basic_action
                    {
                    pushFollow(FOLLOW_basic_action_in_behavior_action3102);
                    BaAct=basic_action();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { BehAction = BaAct ;}

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1030:6: (BehActionBlock= behavior_action_block )
                    {
                    // AadlBa.g:1030:6: (BehActionBlock= behavior_action_block )
                    // AadlBa.g:1030:8: BehActionBlock= behavior_action_block
                    {
                    pushFollow(FOLLOW_behavior_action_block_in_behavior_action3135);
                    BehActionBlock=behavior_action_block();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                              BehAction = BehActionBlock ;
                           }

                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1037:6: (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF )
                    {
                    // AadlBa.g:1037:6: (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF )
                    // AadlBa.g:1037:8: identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF
                    {
                    identifier1=(Token)match(input,IF,FOLLOW_IF_in_behavior_action3173); if (state.failed) return BehAction;

                    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3177); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_value_expression_in_behavior_action3181);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3183); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3187);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                             IfStat = _fact.createIfStatement();
                             setLocationReference(IfStat, identifier1); 
                             setLocationReference(ValExpr, identifier2); 
                             IfStat.setLogicalValueExpression(ValExpr) ;
                             IfStat.setBehaviorActions(BehActions);
                             tmpIfStat = IfStat ;
                           }

                    // AadlBa.g:1046:8: (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==ELSIF) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // AadlBa.g:1047:10: identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions
                    	    {
                    	    identifier1=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_behavior_action3220); if (state.failed) return BehAction;

                    	    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3224); if (state.failed) return BehAction;

                    	    pushFollow(FOLLOW_value_expression_in_behavior_action3228);
                    	    ValExpr=value_expression();

                    	    state._fsp--;
                    	    if (state.failed) return BehAction;

                    	    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3230); if (state.failed) return BehAction;

                    	    pushFollow(FOLLOW_behavior_actions_in_behavior_action3234);
                    	    BehActions=behavior_actions();

                    	    state._fsp--;
                    	    if (state.failed) return BehAction;

                    	    if ( state.backtracking==0 ) {
                    	               IfStatement ElifStat = _fact.createIfStatement() ;
                    	               ElifStat.setElif(true);
                    	               
                    	               setLocationReference(ElifStat, identifier1);
                    	               setLocationReference(ValExpr, identifier2) ; 
                    	               ElifStat.setLogicalValueExpression(ValExpr) ;
                    	               ElifStat.setBehaviorActions(BehActions);
                    	               
                    	               tmpIfStat.setElseStatement(ElifStat) ;
                    	               tmpIfStat = ElifStat ;
                    	             }

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    // AadlBa.g:1061:8: (identifier= ELSE BehActions= behavior_actions )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ELSE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // AadlBa.g:1062:10: identifier= ELSE BehActions= behavior_actions
                            {
                            identifier=(Token)match(input,ELSE,FOLLOW_ELSE_in_behavior_action3277); if (state.failed) return BehAction;

                            pushFollow(FOLLOW_behavior_actions_in_behavior_action3281);
                            BehActions=behavior_actions();

                            state._fsp--;
                            if (state.failed) return BehAction;

                            if ( state.backtracking==0 ) {
                                       ElseStatement elseStat = _fact.createElseStatement();
                                       setLocationReference(elseStat, identifier);
                                       elseStat.setBehaviorActions(BehActions);
                                       tmpIfStat.setElseStatement(elseStat);
                                     }

                            }
                            break;

                    }


                    match(input,END,FOLLOW_END_in_behavior_action3311); if (state.failed) return BehAction;

                    match(input,IF,FOLLOW_IF_in_behavior_action3313); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                             BehAction = IfStat ;
                           }

                    }


                    }
                    break;
                case 4 :
                    // AadlBa.g:1077:6: (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    {
                    // AadlBa.g:1077:6: (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    // AadlBa.g:1077:8: identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY
                    {
                    identifier=(Token)match(input,FOR,FOLLOW_FOR_in_behavior_action3351); if (state.failed) return BehAction;

                    match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3353); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat = _fact.createForOrForAllStatement(); 
                                                   setLocationReference(ForStat, identifier); 
                                                 }

                    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_action3367); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {  
                                              itVar = _fact.createIterativeVariable(); 
                                              itVar.setName(identifier.getText());
                                              setLocationReference(itVar, identifier); 
                                              ForStat.setIterativeVariable(itVar); 
                                            }

                    match(input,COLON,FOLLOW_COLON_in_behavior_action3378); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_unique_component_classifier_reference_in_behavior_action3382);
                    dt=unique_component_classifier_reference();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             DeclarativeUtils.setEcontainer(_ba, dt);
                             itVar.setDataClassifier(dt);
                           }

                    match(input,IN,FOLLOW_IN_in_behavior_action3408); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_element_values_in_behavior_action3412);
                    EltVal=element_values();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3414); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setIteratedValues(EltVal); }

                    identifier=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action3427); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3431);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action3433); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setBehaviorActions(BehActions);
                             BehAction = ForStat ;
                           }

                    }


                    }
                    break;
                case 5 :
                    // AadlBa.g:1100:6: (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    {
                    // AadlBa.g:1100:6: (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    // AadlBa.g:1100:8: identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY
                    {
                    identifier=(Token)match(input,FORALL,FOLLOW_FORALL_in_behavior_action3472); if (state.failed) return BehAction;

                    match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3474); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                            ForStat = _fact.createForOrForAllStatement();
                            ForStat.setForAll(true);
                            setLocationReference(ForStat, identifier); 
                           }

                    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_action3495); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {  
                                              itVar = _fact.createIterativeVariable(); 
                                              itVar.setName(identifier.getText());
                                              setLocationReference(itVar, identifier); 
                                              ForStat.setIterativeVariable(itVar);
                                            }

                    match(input,COLON,FOLLOW_COLON_in_behavior_action3506); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_unique_component_classifier_reference_in_behavior_action3510);
                    dt=unique_component_classifier_reference();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             itVar.setDataClassifier(dt);
                           }

                    match(input,IN,FOLLOW_IN_in_behavior_action3537); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_element_values_in_behavior_action3541);
                    EltVal=element_values();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3543); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setIteratedValues(EltVal); }

                    identifier=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action3556); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3560);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action3562); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setBehaviorActions(BehActions) ;
                             BehAction = ForStat ;
                           }

                    }


                    }
                    break;
                case 6 :
                    // AadlBa.g:1125:6: (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY )
                    {
                    // AadlBa.g:1125:6: (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY )
                    // AadlBa.g:1125:8: identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY
                    {
                    identifier1=(Token)match(input,WHILE,FOLLOW_WHILE_in_behavior_action3600); if (state.failed) return BehAction;

                    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3604); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_value_expression_in_behavior_action3608);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3610); if (state.failed) return BehAction;

                    match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action3620); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3624);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action3626); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             WhileOrDoUntilStatement WhileStat = _fact.createWhileOrDoUntilStatement();
                             setLocationReference(WhileStat, identifier1); 
                             setLocationReference(ValExpr, identifier2) ;
                             WhileStat.setDoUntil(false);
                             WhileStat.setLogicalValueExpression(ValExpr);
                             WhileStat.setBehaviorActions(BehActions);
                             BehAction = WhileStat ; 
                           }

                    }


                    }
                    break;
                case 7 :
                    // AadlBa.g:1139:6: (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN )
                    {
                    // AadlBa.g:1139:6: (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN )
                    // AadlBa.g:1139:8: identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN
                    {
                    identifier1=(Token)match(input,DO,FOLLOW_DO_in_behavior_action3665); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3669);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,UNTIL,FOLLOW_UNTIL_in_behavior_action3671); if (state.failed) return BehAction;

                    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3684); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_value_expression_in_behavior_action3688);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3690); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             WhileOrDoUntilStatement doUntilStat = _fact.createWhileOrDoUntilStatement();
                             setLocationReference(doUntilStat, identifier1); 
                             setLocationReference(ValExpr, identifier2) ;
                             doUntilStat.setDoUntil(true);
                             doUntilStat.setLogicalValueExpression(ValExpr);
                             doUntilStat.setBehaviorActions(BehActions);
                             BehAction = doUntilStat ;
                           }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehAction;
    }
    // $ANTLR end "behavior_action"



    // $ANTLR start "element_values"
    // AadlBa.g:1163:1: element_values returns [ElementValues EltVal] : ( (IntRange= integer_range ) | (AdcRef= reference ) );
    public final ElementValues element_values() throws RecognitionException {
        ElementValues EltVal = null;


        IntegerRange IntRange =null;

        Reference AdcRef =null;



         
        try {
            // AadlBa.g:1166:3: ( (IntRange= integer_range ) | (AdcRef= reference ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IDENT) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred44_AadlBa()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return EltVal;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==FALSE||LA37_0==INTEGER_LIT||LA37_0==REAL_LIT||LA37_0==STRING_LITERAL||LA37_0==TRUE) ) {
                alt37=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return EltVal;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // AadlBa.g:1167:6: (IntRange= integer_range )
                    {
                    // AadlBa.g:1167:6: (IntRange= integer_range )
                    // AadlBa.g:1167:8: IntRange= integer_range
                    {
                    pushFollow(FOLLOW_integer_range_in_element_values3752);
                    IntRange=integer_range();

                    state._fsp--;
                    if (state.failed) return EltVal;

                    if ( state.backtracking==0 ) { EltVal = IntRange; }

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1169:6: (AdcRef= reference )
                    {
                    // AadlBa.g:1169:6: (AdcRef= reference )
                    // AadlBa.g:1169:8: AdcRef= reference
                    {
                    pushFollow(FOLLOW_reference_in_element_values3772);
                    AdcRef=reference();

                    state._fsp--;
                    if (state.failed) return EltVal;

                    if ( state.backtracking==0 ) { EltVal = (ElementValues) AdcRef; }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return EltVal;
    }
    // $ANTLR end "element_values"



    // $ANTLR start "basic_action"
    // AadlBa.g:1182:1: basic_action returns [BasicAction BaAction] : ( (AssAct= assignment_action ) | (CommAct= communication_action ) | (TimedAct= timed_action ) );
    public final BasicAction basic_action() throws RecognitionException {
        BasicAction BaAction = null;


        AssignmentAction AssAct =null;

        CommAction CommAct =null;

        TimedAction TimedAct =null;




        try {
            // AadlBa.g:1185:3: ( (AssAct= assignment_action ) | (CommAct= communication_action ) | (TimedAct= timed_action ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA38_1 = input.LA(2);

                if ( (synpred45_AadlBa()) ) {
                    alt38=1;
                }
                else if ( (synpred46_AadlBa()) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BaAction;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }
                }
                break;
            case STAR:
                {
                alt38=2;
                }
                break;
            case COMPUTATION:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return BaAction;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // AadlBa.g:1186:6: (AssAct= assignment_action )
                    {
                    // AadlBa.g:1186:6: (AssAct= assignment_action )
                    // AadlBa.g:1186:8: AssAct= assignment_action
                    {
                    pushFollow(FOLLOW_assignment_action_in_basic_action3816);
                    AssAct=assignment_action();

                    state._fsp--;
                    if (state.failed) return BaAction;

                    if ( state.backtracking==0 ) { BaAction = AssAct; }

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1188:6: (CommAct= communication_action )
                    {
                    // AadlBa.g:1188:6: (CommAct= communication_action )
                    // AadlBa.g:1188:8: CommAct= communication_action
                    {
                    pushFollow(FOLLOW_communication_action_in_basic_action3836);
                    CommAct=communication_action();

                    state._fsp--;
                    if (state.failed) return BaAction;

                    if ( state.backtracking==0 ) { BaAction = CommAct;}

                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1190:6: (TimedAct= timed_action )
                    {
                    // AadlBa.g:1190:6: (TimedAct= timed_action )
                    // AadlBa.g:1190:8: TimedAct= timed_action
                    {
                    pushFollow(FOLLOW_timed_action_in_basic_action3856);
                    TimedAct=timed_action();

                    state._fsp--;
                    if (state.failed) return BaAction;

                    if ( state.backtracking==0 ) { BaAction = TimedAct; }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BaAction;
    }
    // $ANTLR end "basic_action"



    // $ANTLR start "assignment_action"
    // AadlBa.g:1202:1: assignment_action returns [AssignmentAction AssAct] : Tar= target ASSIGN (ValExpr= value_expression |identifier= ANY ) ;
    public final AssignmentAction assignment_action() throws RecognitionException {
        AssignmentAction AssAct = null;


        Token identifier=null;
        Target Tar =null;

        ValueExpression ValExpr =null;



           AssAct = _fact.createAssignmentAction();
         
        try {
            // AadlBa.g:1206:3: (Tar= target ASSIGN (ValExpr= value_expression |identifier= ANY ) )
            // AadlBa.g:1207:4: Tar= target ASSIGN (ValExpr= value_expression |identifier= ANY )
            {
            pushFollow(FOLLOW_target_in_assignment_action3900);
            Tar=target();

            state._fsp--;
            if (state.failed) return AssAct;

            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_action3902); if (state.failed) return AssAct;

            // AadlBa.g:1207:22: (ValExpr= value_expression |identifier= ANY )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ABS||LA39_0==FALSE||LA39_0==IDENT||LA39_0==INTEGER_LIT||LA39_0==LPAREN||LA39_0==MINUS||LA39_0==NOT||LA39_0==PLUS||LA39_0==REAL_LIT||LA39_0==STRING_LITERAL||LA39_0==TRUE) ) {
                alt39=1;
            }
            else if ( (LA39_0==ANY) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return AssAct;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // AadlBa.g:1207:24: ValExpr= value_expression
                    {
                    pushFollow(FOLLOW_value_expression_in_assignment_action3908);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return AssAct;

                    }
                    break;
                case 2 :
                    // AadlBa.g:1207:51: identifier= ANY
                    {
                    identifier=(Token)match(input,ANY,FOLLOW_ANY_in_assignment_action3914); if (state.failed) return AssAct;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                 AssAct.setLocationReference(Tar.getLocationReference());
                 AssAct.setTarget(Tar);
                   
                 if (ValExpr != null)
                 {
                   AssAct.setValueExpression(ValExpr);
                 }
                 else
                 {
                   Any any = _fact.createAny() ;
                   setLocationReference(any, identifier);
                   highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                   AssAct.setValueExpression(any);
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return AssAct;
    }
    // $ANTLR end "assignment_action"



    // $ANTLR start "target"
    // AadlBa.g:1236:1: target returns [Target Tar] : dt= reference ;
    public final Target target() throws RecognitionException {
        Target Tar = null;


        Reference dt =null;



           Tar = null ;
         
        try {
            // AadlBa.g:1240:3: (dt= reference )
            // AadlBa.g:1240:5: dt= reference
            {
            pushFollow(FOLLOW_reference_in_target3954);
            dt=reference();

            state._fsp--;
            if (state.failed) return Tar;

            if ( state.backtracking==0 ) {Tar= (Target) dt ;}

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Tar;
    }
    // $ANTLR end "target"



    // $ANTLR start "qualified_named_element"
    // AadlBa.g:1249:1: qualified_named_element returns [QualifiedNamedElement qne] : ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? ) ;
    public final QualifiedNamedElement qualified_named_element() throws RecognitionException {
        QualifiedNamedElement qne = null;


        Token identifier1=null;
        Token identifier2=null;
        Token identifier3=null;


          String id1 = "";
          String id2 = "";

        try {
            // AadlBa.g:1255:3: ( ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? ) )
            // AadlBa.g:1256:4: ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? )
            {
            // AadlBa.g:1256:4: ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? )
            // AadlBa.g:1257:5: (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )?
            {
            // AadlBa.g:1257:5: (identifier1= IDENT DOUBLECOLON )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==IDENT) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==DOUBLECOLON) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // AadlBa.g:1257:7: identifier1= IDENT DOUBLECOLON
            	    {
            	    identifier1=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_named_element4038); if (state.failed) return qne;

            	    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_qualified_named_element4040); if (state.failed) return qne;

            	    if ( state.backtracking==0 ) { 
            	            id1=id1+(id1.length() == 0 ? "":"::")+identifier1.getText();
            	          }

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return qne;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            identifier2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_named_element4068); if (state.failed) return qne;

            if ( state.backtracking==0 ) { 
                  id2=identifier2.getText();
                }

            // AadlBa.g:1267:5: ( DOT identifier3= IDENT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==DOT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // AadlBa.g:1267:7: DOT identifier3= IDENT
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualified_named_element4082); if (state.failed) return qne;

                    identifier3=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_named_element4086); if (state.failed) return qne;

                    if ( state.backtracking==0 ) {
                            id2=id2+"."+identifier3.getText();
                          }

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
                 qne = _decl.createQualifiedNamedElement();
                 Identifier nameId = _decl.createIdentifier();
                 nameId.setId(id2);
                 setLocationReference(nameId, identifier2); 
                 qne.setBaName(nameId);
                
                 if (! id1.equals(""))
                 {
                   Identifier nameSpaceId = _decl.createIdentifier();
                   nameSpaceId.setId(id1);
                   setLocationReference(nameSpaceId, identifier1); 
                   qne.setBaNamespace(nameSpaceId);
                   setLocationReference(qne, identifier1);
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return qne;
    }
    // $ANTLR end "qualified_named_element"



    // $ANTLR start "communication_action"
    // AadlBa.g:1308:1: communication_action returns [CommAction ca] : ( (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) | (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) ) | (identifier= STAR ( EXCLLESS | EXCLGREATER ) ) );
    public final CommAction communication_action() throws RecognitionException {
        CommAction ca = null;


        Token identifier=null;
        QualifiedNamedElement qne =null;

        EList<ParameterLabel> SubpgmParamList =null;

        Reference ref =null;

        Target Tar =null;



          ca = _decl.createCommAction() ;

        try {
            // AadlBa.g:1313:3: ( (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) | (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) ) | (identifier= STAR ( EXCLLESS | EXCLGREATER ) ) )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENT) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==DOUBLECOLON) ) {
                    alt47=1;
                }
                else if ( (LA47_1==DOT||(LA47_1 >= EXCLAM && LA47_1 <= EXCLLESS)||LA47_1==GGREATER||LA47_1==INTERROG||LA47_1==LBRACK) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ca;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA47_0==STAR) ) {
                alt47=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ca;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // AadlBa.g:1327:7: (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                    {
                    // AadlBa.g:1327:7: (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                    // AadlBa.g:1328:9: qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                    {
                    pushFollow(FOLLOW_qualified_named_element_in_communication_action4238);
                    qne=qualified_named_element();

                    state._fsp--;
                    if (state.failed) return ca;

                    match(input,EXCLAM,FOLLOW_EXCLAM_in_communication_action4240); if (state.failed) return ca;

                    if ( state.backtracking==0 ) {
                              ca.setLocationReference(qne.getLocationReference());
                              ca.setQualifiedName(qne);
                            }

                    // AadlBa.g:1333:9: ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==LPAREN) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // AadlBa.g:1334:11: LPAREN SubpgmParamList= subprogram_parameter_list RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_communication_action4273); if (state.failed) return ca;

                            pushFollow(FOLLOW_subprogram_parameter_list_in_communication_action4277);
                            SubpgmParamList=subprogram_parameter_list();

                            state._fsp--;
                            if (state.failed) return ca;

                            match(input,RPAREN,FOLLOW_RPAREN_in_communication_action4279); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                        ca.getParameters().addAll(SubpgmParamList);
                                      }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1341:7: (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) )
                    {
                    // AadlBa.g:1341:7: (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) )
                    // AadlBa.g:1342:9: ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) )
                    {
                    pushFollow(FOLLOW_reference_in_communication_action4339);
                    ref=reference();

                    state._fsp--;
                    if (state.failed) return ca;

                    if ( state.backtracking==0 ) {
                              ca.setReference(ref);
                              ca.setLocationReference(ref.getLocationReference()) ;
                            }

                    // AadlBa.g:1347:9: ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) )
                    int alt45=5;
                    switch ( input.LA(1) ) {
                    case INTERROG:
                        {
                        alt45=1;
                        }
                        break;
                    case GGREATER:
                        {
                        alt45=2;
                        }
                        break;
                    case EXCLLESS:
                        {
                        alt45=3;
                        }
                        break;
                    case EXCLGREATER:
                        {
                        alt45=4;
                        }
                        break;
                    case EXCLAM:
                        {
                        alt45=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ca;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;

                    }

                    switch (alt45) {
                        case 1 :
                            // AadlBa.g:1348:13: ( INTERROG ( LPAREN Tar= target RPAREN )? )
                            {
                            // AadlBa.g:1348:13: ( INTERROG ( LPAREN Tar= target RPAREN )? )
                            // AadlBa.g:1349:15: INTERROG ( LPAREN Tar= target RPAREN )?
                            {
                            match(input,INTERROG,FOLLOW_INTERROG_in_communication_action4389); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                            ca.setPortDequeue(true);
                                          }

                            // AadlBa.g:1353:15: ( LPAREN Tar= target RPAREN )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==LPAREN) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // AadlBa.g:1354:17: LPAREN Tar= target RPAREN
                                    {
                                    match(input,LPAREN,FOLLOW_LPAREN_in_communication_action4439); if (state.failed) return ca;

                                    pushFollow(FOLLOW_target_in_communication_action4443);
                                    Tar=target();

                                    state._fsp--;
                                    if (state.failed) return ca;

                                    match(input,RPAREN,FOLLOW_RPAREN_in_communication_action4445); if (state.failed) return ca;

                                    if ( state.backtracking==0 ) {
                                                      ca.setTarget(Tar);
                                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // AadlBa.g:1361:13: ( GGREATER )
                            {
                            // AadlBa.g:1361:13: ( GGREATER )
                            // AadlBa.g:1362:15: GGREATER
                            {
                            match(input,GGREATER,FOLLOW_GGREATER_in_communication_action4536); if (state.failed) return ca;

                            if ( state.backtracking==0 ) { 
                                            ca.setPortFreeze(true);
                                          }

                            }


                            }
                            break;
                        case 3 :
                            // AadlBa.g:1368:13: ( EXCLLESS )
                            {
                            // AadlBa.g:1368:13: ( EXCLLESS )
                            // AadlBa.g:1369:15: EXCLLESS
                            {
                            match(input,EXCLLESS,FOLLOW_EXCLLESS_in_communication_action4608); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                            ca.setLock(true);
                                          }

                            }


                            }
                            break;
                        case 4 :
                            // AadlBa.g:1375:13: ( EXCLGREATER )
                            {
                            // AadlBa.g:1375:13: ( EXCLGREATER )
                            // AadlBa.g:1376:15: EXCLGREATER
                            {
                            match(input,EXCLGREATER,FOLLOW_EXCLGREATER_in_communication_action4680); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                            ca.setUnlock(true);
                                          }

                            }


                            }
                            break;
                        case 5 :
                            // AadlBa.g:1382:13: ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                            {
                            // AadlBa.g:1382:13: ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                            // AadlBa.g:1383:15: EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                            {
                            match(input,EXCLAM,FOLLOW_EXCLAM_in_communication_action4752); if (state.failed) return ca;

                            // AadlBa.g:1384:15: ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==LPAREN) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // AadlBa.g:1385:17: LPAREN SubpgmParamList= subprogram_parameter_list RPAREN
                                    {
                                    match(input,LPAREN,FOLLOW_LPAREN_in_communication_action4787); if (state.failed) return ca;

                                    pushFollow(FOLLOW_subprogram_parameter_list_in_communication_action4791);
                                    SubpgmParamList=subprogram_parameter_list();

                                    state._fsp--;
                                    if (state.failed) return ca;

                                    match(input,RPAREN,FOLLOW_RPAREN_in_communication_action4793); if (state.failed) return ca;

                                    if ( state.backtracking==0 ) {
                                                      ca.getParameters().addAll(SubpgmParamList);
                                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1394:7: (identifier= STAR ( EXCLLESS | EXCLGREATER ) )
                    {
                    // AadlBa.g:1394:7: (identifier= STAR ( EXCLLESS | EXCLGREATER ) )
                    // AadlBa.g:1395:9: identifier= STAR ( EXCLLESS | EXCLGREATER )
                    {
                    identifier=(Token)match(input,STAR,FOLLOW_STAR_in_communication_action4886); if (state.failed) return ca;

                    // AadlBa.g:1396:9: ( EXCLLESS | EXCLGREATER )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==EXCLLESS) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==EXCLGREATER) ) {
                        alt46=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ca;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;

                    }
                    switch (alt46) {
                        case 1 :
                            // AadlBa.g:1397:13: EXCLLESS
                            {
                            match(input,EXCLLESS,FOLLOW_EXCLLESS_in_communication_action4911); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                          ca.setLock(true);
                                        }

                            }
                            break;
                        case 2 :
                            // AadlBa.g:1402:13: EXCLGREATER
                            {
                            match(input,EXCLGREATER,FOLLOW_EXCLGREATER_in_communication_action4952); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                          ca.setUnlock(true);
                                        }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                              setLocationReference(ca, identifier);
                            }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ca;
    }
    // $ANTLR end "communication_action"



    // $ANTLR start "timed_action"
    // AadlBa.g:1420:1: timed_action returns [TimedAction TimedAct] : (identifier= COMPUTATION ) LPAREN BehTime= behavior_time ( DOTDOT BehTime= behavior_time )? RPAREN ;
    public final TimedAction timed_action() throws RecognitionException {
        TimedAction TimedAct = null;


        Token identifier=null;
        DeclarativeTime BehTime =null;



           TimedAct = _fact.createTimedAction();
         
        try {
            // AadlBa.g:1424:3: ( (identifier= COMPUTATION ) LPAREN BehTime= behavior_time ( DOTDOT BehTime= behavior_time )? RPAREN )
            // AadlBa.g:1425:4: (identifier= COMPUTATION ) LPAREN BehTime= behavior_time ( DOTDOT BehTime= behavior_time )? RPAREN
            {
            // AadlBa.g:1425:4: (identifier= COMPUTATION )
            // AadlBa.g:1425:6: identifier= COMPUTATION
            {
            identifier=(Token)match(input,COMPUTATION,FOLLOW_COMPUTATION_in_timed_action5029); if (state.failed) return TimedAct;

            if ( state.backtracking==0 ) {setLocationReference(TimedAct, identifier) ; }

            }


            match(input,LPAREN,FOLLOW_LPAREN_in_timed_action5045); if (state.failed) return TimedAct;

            pushFollow(FOLLOW_behavior_time_in_timed_action5054);
            BehTime=behavior_time();

            state._fsp--;
            if (state.failed) return TimedAct;

            if ( state.backtracking==0 ) {TimedAct.setLowerTime(BehTime); }

            // AadlBa.g:1429:6: ( DOTDOT BehTime= behavior_time )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DOTDOT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // AadlBa.g:1429:7: DOTDOT BehTime= behavior_time
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_timed_action5064); if (state.failed) return TimedAct;

                    pushFollow(FOLLOW_behavior_time_in_timed_action5068);
                    BehTime=behavior_time();

                    state._fsp--;
                    if (state.failed) return TimedAct;

                    if ( state.backtracking==0 ) {TimedAct.setUpperTime(BehTime);}

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_timed_action5084); if (state.failed) return TimedAct;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return TimedAct;
    }
    // $ANTLR end "timed_action"



    // $ANTLR start "subprogram_parameter_list"
    // AadlBa.g:1442:1: subprogram_parameter_list returns [EList<ParameterLabel> SpgParamList] : ParamLabel= parameter_label (identifier= COMMA ParamLabel= parameter_label )* ;
    public final EList<ParameterLabel> subprogram_parameter_list() throws RecognitionException {
        EList<ParameterLabel> SpgParamList = null;


        Token identifier=null;
        ParameterLabel ParamLabel =null;



           SpgParamList = new BasicEList<ParameterLabel>();
         
        try {
            // AadlBa.g:1446:3: (ParamLabel= parameter_label (identifier= COMMA ParamLabel= parameter_label )* )
            // AadlBa.g:1447:4: ParamLabel= parameter_label (identifier= COMMA ParamLabel= parameter_label )*
            {
            pushFollow(FOLLOW_parameter_label_in_subprogram_parameter_list5119);
            ParamLabel=parameter_label();

            state._fsp--;
            if (state.failed) return SpgParamList;

            if ( state.backtracking==0 ) { SpgParamList.add(ParamLabel);}

            // AadlBa.g:1448:4: (identifier= COMMA ParamLabel= parameter_label )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // AadlBa.g:1448:5: identifier= COMMA ParamLabel= parameter_label
            	    {
            	    identifier=(Token)match(input,COMMA,FOLLOW_COMMA_in_subprogram_parameter_list5130); if (state.failed) return SpgParamList;

            	    pushFollow(FOLLOW_parameter_label_in_subprogram_parameter_list5134);
            	    ParamLabel=parameter_label();

            	    state._fsp--;
            	    if (state.failed) return SpgParamList;

            	    if ( state.backtracking==0 ) { SpgParamList.add(ParamLabel);
            	                                                      if( ParamLabel.getLocationReference() == null) // SG case of an ValueExpr else Target is already set
            	                                                      {
            	                                                         setLocationReference(ParamLabel, identifier) ; 
            	                                                      }
            	                                                    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return SpgParamList;
    }
    // $ANTLR end "subprogram_parameter_list"



    // $ANTLR start "parameter_label"
    // AadlBa.g:1463:1: parameter_label returns [ParameterLabel ParamLabel] : (ValExpr= value_expression ) ;
    public final ParameterLabel parameter_label() throws RecognitionException {
        ParameterLabel ParamLabel = null;


        ValueExpression ValExpr =null;



         
        try {
            // AadlBa.g:1466:3: ( (ValExpr= value_expression ) )
            // AadlBa.g:1468:4: (ValExpr= value_expression )
            {
            // AadlBa.g:1468:4: (ValExpr= value_expression )
            // AadlBa.g:1469:8: ValExpr= value_expression
            {
            pushFollow(FOLLOW_value_expression_in_parameter_label5188);
            ValExpr=value_expression();

            state._fsp--;
            if (state.failed) return ParamLabel;

            if ( state.backtracking==0 ) { ParamLabel = ValExpr; }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ParamLabel;
    }
    // $ANTLR end "parameter_label"



    // $ANTLR start "reference"
    // AadlBa.g:1500:1: reference returns [Reference ref] : id= array_identifier ( DOT id= array_identifier )* ;
    public final Reference reference() throws RecognitionException {
        Reference ref = null;


        ArrayableIdentifier id =null;



            ref = _decl.createReference() ;
           
         
        try {
            // AadlBa.g:1505:3: (id= array_identifier ( DOT id= array_identifier )* )
            // AadlBa.g:1506:5: id= array_identifier ( DOT id= array_identifier )*
            {
            pushFollow(FOLLOW_array_identifier_in_reference5252);
            id=array_identifier();

            state._fsp--;
            if (state.failed) return ref;

            if ( state.backtracking==0 ) {
                  ref.getIds().add(id);
                  ref.setLocationReference(id.getLocationReference());
                }

            // AadlBa.g:1511:5: ( DOT id= array_identifier )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==DOT) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // AadlBa.g:1512:7: DOT id= array_identifier
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_reference5272); if (state.failed) return ref;

            	    pushFollow(FOLLOW_array_identifier_in_reference5276);
            	    id=array_identifier();

            	    state._fsp--;
            	    if (state.failed) return ref;

            	    if ( state.backtracking==0 ) {
            	            ref.getIds().add(id);
            	          }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ref;
    }
    // $ANTLR end "reference"



    // $ANTLR start "array_identifier"
    // AadlBa.g:1526:1: array_identifier returns [ArrayableIdentifier id] : identifier= IDENT ( LBRACK Val= integer_value RBRACK )* ;
    public final ArrayableIdentifier array_identifier() throws RecognitionException {
        ArrayableIdentifier id = null;


        Token identifier=null;
        IntegerValue Val =null;



          id = _decl.createArrayableIdentifier() ;

        try {
            // AadlBa.g:1531:3: (identifier= IDENT ( LBRACK Val= integer_value RBRACK )* )
            // AadlBa.g:1532:5: identifier= IDENT ( LBRACK Val= integer_value RBRACK )*
            {
            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_identifier5325); if (state.failed) return id;

            if ( state.backtracking==0 ) {
                  id.setId(identifier.getText());    
                  setLocationReference(id, identifier); 
                }

            // AadlBa.g:1537:5: ( LBRACK Val= integer_value RBRACK )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==LBRACK) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // AadlBa.g:1538:7: LBRACK Val= integer_value RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_array_identifier5345); if (state.failed) return id;

            	    pushFollow(FOLLOW_integer_value_in_array_identifier5349);
            	    Val=integer_value();

            	    state._fsp--;
            	    if (state.failed) return id;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_array_identifier5351); if (state.failed) return id;

            	    if ( state.backtracking==0 ) {
            	            id.getArrayIndexes().add(Val);
            	          }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return id;
    }
    // $ANTLR end "array_identifier"



    // $ANTLR start "fact_value"
    // AadlBa.g:1579:1: fact_value returns [Value Val] : ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal ) ;
    public final Value fact_value() throws RecognitionException {
        Value Val = null;


        Token id1=null;
        Token id2=null;
        ValueVariable ValueVar =null;

        BehaviorBooleanLiteral bl =null;

        NumericLiteral nl =null;

        BehaviorStringLiteral st =null;

        Enumeration lit =null;



           Val = null ;
         
        try {
            // AadlBa.g:1584:3: ( ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal ) )
            // AadlBa.g:1588:4: ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal )
            {
            // AadlBa.g:1588:4: ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal )
            int alt52=6;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case DOUBLECOLON:
                    {
                    int LA52_5 = input.LA(3);

                    if ( (LA52_5==IDENT) ) {
                        int LA52_8 = input.LA(4);

                        if ( (LA52_8==DOT||LA52_8==DOUBLECOLON) ) {
                            alt52=6;
                        }
                        else if ( (LA52_8==EOF||LA52_8==AND||LA52_8==COMMA||LA52_8==CONCAT||LA52_8==DIVIDE||LA52_8==DOTDOT||(LA52_8 >= ELSE && LA52_8 <= END)||LA52_8==EQUAL||(LA52_8 >= GREATEROREQUAL && LA52_8 <= GREATERTHAN)||LA52_8==IDENT||(LA52_8 >= LESSOREQUAL && LA52_8 <= LESSTHAN)||(LA52_8 >= MINUS && LA52_8 <= MOD)||LA52_8==NOTEQUAL||LA52_8==OR||(LA52_8 >= PLUS && LA52_8 <= RCURLY)||(LA52_8 >= REM && LA52_8 <= SEMICOLON)||(LA52_8 >= STAR && LA52_8 <= STARSTAR)||LA52_8==UNTIL||LA52_8==XOR) ) {
                            alt52=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return Val;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 52, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return Val;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case EOF:
                case AND:
                case COMMA:
                case CONCAT:
                case DIVIDE:
                case DOTDOT:
                case ELSE:
                case ELSIF:
                case END:
                case EQUAL:
                case GREATEROREQUAL:
                case GREATERTHAN:
                case IDENT:
                case INTERROG:
                case LBRACK:
                case LESSOREQUAL:
                case LESSTHAN:
                case MINUS:
                case MOD:
                case NOTEQUAL:
                case OR:
                case PLUS:
                case RBRACK:
                case RCURLY:
                case REM:
                case RPAREN:
                case RTRANS:
                case SEMICOLON:
                case STAR:
                case STARSTAR:
                case TICK:
                case UNTIL:
                case XOR:
                    {
                    alt52=2;
                    }
                    break;
                case DOT:
                    {
                    int LA52_7 = input.LA(3);

                    if ( (LA52_7==IDENT) ) {
                        int LA52_9 = input.LA(4);

                        if ( (LA52_9==DOT) ) {
                            int LA52_12 = input.LA(5);

                            if ( (LA52_12==ENUMERATOR) ) {
                                alt52=6;
                            }
                            else if ( (LA52_12==IDENT) ) {
                                alt52=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return Val;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 52, 12, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA52_9==EOF||LA52_9==AND||LA52_9==COMMA||LA52_9==CONCAT||LA52_9==DIVIDE||LA52_9==DOTDOT||(LA52_9 >= ELSE && LA52_9 <= END)||LA52_9==EQUAL||(LA52_9 >= GREATEROREQUAL && LA52_9 <= GREATERTHAN)||LA52_9==IDENT||LA52_9==INTERROG||LA52_9==LBRACK||(LA52_9 >= LESSOREQUAL && LA52_9 <= LESSTHAN)||(LA52_9 >= MINUS && LA52_9 <= MOD)||LA52_9==NOTEQUAL||LA52_9==OR||(LA52_9 >= PLUS && LA52_9 <= RCURLY)||(LA52_9 >= REM && LA52_9 <= SEMICOLON)||(LA52_9 >= STAR && LA52_9 <= STARSTAR)||LA52_9==TICK||LA52_9==UNTIL||LA52_9==XOR) ) {
                            alt52=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return Val;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 52, 9, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA52_7==ENUMERATOR) ) {
                        alt52=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return Val;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return Val;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;

                }

                }
                break;
            case FALSE:
            case TRUE:
                {
                alt52=3;
                }
                break;
            case INTEGER_LIT:
            case REAL_LIT:
                {
                alt52=4;
                }
                break;
            case STRING_LITERAL:
                {
                alt52=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return Val;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // AadlBa.g:1590:8: (id1= IDENT DOUBLECOLON id2= IDENT )
                    {
                    // AadlBa.g:1590:8: (id1= IDENT DOUBLECOLON id2= IDENT )
                    // AadlBa.g:1591:11: id1= IDENT DOUBLECOLON id2= IDENT
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fact_value5474); if (state.failed) return Val;

                    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_fact_value5476); if (state.failed) return Val;

                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_fact_value5480); if (state.failed) return Val;

                    if ( state.backtracking==0 ) {
                                QualifiedNamedElement property = _decl.
                                                                   createQualifiedNamedElement();
                                            
                                Identifier nameSpaceId = _decl.createIdentifier();
                                nameSpaceId.setId(id1.getText());
                                setLocationReference(nameSpaceId, id1);
                                property.setBaNamespace(nameSpaceId);
                                
                                setLocationReference(property, id1) ;
                                
                                Identifier nameId = _decl.createIdentifier();
                                nameId.setId(id2.getText());
                                setLocationReference(nameId, id2);
                                property.setBaName(nameId);
                                
                                Val = property ;
                              }

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1613:8: ValueVar= value_variable
                    {
                    pushFollow(FOLLOW_value_variable_in_fact_value5528);
                    ValueVar=value_variable();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = ValueVar ;}

                    }
                    break;
                case 3 :
                    // AadlBa.g:1616:8: bl= boolean_literal
                    {
                    pushFollow(FOLLOW_boolean_literal_in_fact_value5550);
                    bl=boolean_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = bl;}

                    }
                    break;
                case 4 :
                    // AadlBa.g:1618:8: nl= numeric_literal
                    {
                    pushFollow(FOLLOW_numeric_literal_in_fact_value5570);
                    nl=numeric_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = nl;}

                    }
                    break;
                case 5 :
                    // AadlBa.g:1620:8: st= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_fact_value5590);
                    st=string_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = st;}

                    }
                    break;
                case 6 :
                    // AadlBa.g:1622:8: lit= behavior_enumeration_literal
                    {
                    pushFollow(FOLLOW_behavior_enumeration_literal_in_fact_value5611);
                    lit=behavior_enumeration_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = lit ;}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Val;
    }
    // $ANTLR end "fact_value"



    // $ANTLR start "value"
    // AadlBa.g:1643:1: value returns [Value Val] : ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) ) ;
    public final Value value() throws RecognitionException {
        Value Val = null;


        Token identifier=null;
        Value ValTmp =null;

        ValueExpression ValExpr =null;



         
        try {
            // AadlBa.g:1646:3: ( ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) ) )
            // AadlBa.g:1647:4: ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) )
            {
            // AadlBa.g:1647:4: ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==FALSE||LA53_0==IDENT||LA53_0==INTEGER_LIT||LA53_0==REAL_LIT||LA53_0==STRING_LITERAL||LA53_0==TRUE) ) {
                alt53=1;
            }
            else if ( (LA53_0==LPAREN) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return Val;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // AadlBa.g:1648:8: (ValTmp= fact_value )
                    {
                    // AadlBa.g:1648:8: (ValTmp= fact_value )
                    // AadlBa.g:1648:10: ValTmp= fact_value
                    {
                    pushFollow(FOLLOW_fact_value_in_value5672);
                    ValTmp=fact_value();

                    state._fsp--;
                    if (state.failed) return Val;

                    }


                    if ( state.backtracking==0 ) {Val = ValTmp;}

                    }
                    break;
                case 2 :
                    // AadlBa.g:1650:8: (identifier= LPAREN ValExpr= value_expression RPAREN )
                    {
                    // AadlBa.g:1650:8: (identifier= LPAREN ValExpr= value_expression RPAREN )
                    // AadlBa.g:1650:10: identifier= LPAREN ValExpr= value_expression RPAREN
                    {
                    identifier=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value5696); if (state.failed) return Val;

                    pushFollow(FOLLOW_value_expression_in_value5700);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return Val;

                    match(input,RPAREN,FOLLOW_RPAREN_in_value5702); if (state.failed) return Val;

                    if ( state.backtracking==0 ) { setLocationReference(ValExpr, identifier) ; Val = ValExpr; }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Val;
    }
    // $ANTLR end "value"



    // $ANTLR start "value_variable"
    // AadlBa.g:1667:1: value_variable returns [ValueVariable ValueVar] : (ref= reference ( INTERROG | TICK ( COUNT | FRESH ) )? ) ;
    public final ValueVariable value_variable() throws RecognitionException {
        ValueVariable ValueVar = null;


        Reference ref =null;



           ValueVar = null ;
         
        try {
            // AadlBa.g:1672:3: ( (ref= reference ( INTERROG | TICK ( COUNT | FRESH ) )? ) )
            // AadlBa.g:1673:6: (ref= reference ( INTERROG | TICK ( COUNT | FRESH ) )? )
            {
            // AadlBa.g:1673:6: (ref= reference ( INTERROG | TICK ( COUNT | FRESH ) )? )
            // AadlBa.g:1674:8: ref= reference ( INTERROG | TICK ( COUNT | FRESH ) )?
            {
            pushFollow(FOLLOW_reference_in_value_variable5778);
            ref=reference();

            state._fsp--;
            if (state.failed) return ValueVar;

            // AadlBa.g:1676:8: ( INTERROG | TICK ( COUNT | FRESH ) )?
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==INTERROG) ) {
                alt55=1;
            }
            else if ( (LA55_0==TICK) ) {
                alt55=2;
            }
            switch (alt55) {
                case 1 :
                    // AadlBa.g:1677:12: INTERROG
                    {
                    match(input,INTERROG,FOLLOW_INTERROG_in_value_variable5808); if (state.failed) return ValueVar;

                    if ( state.backtracking==0 ) {
                                 NamedValue nv = _decl.createNamedValue();
                                 nv.setReference(ref) ;
                                 nv.setDequeue(true);
                                 nv.setLocationReference(ref.getLocationReference());
                                 ValueVar = nv ;
                               }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1686:12: TICK ( COUNT | FRESH )
                    {
                    match(input,TICK,FOLLOW_TICK_in_value_variable5845); if (state.failed) return ValueVar;

                    // AadlBa.g:1686:17: ( COUNT | FRESH )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==COUNT) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==FRESH) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ValueVar;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;

                    }
                    switch (alt54) {
                        case 1 :
                            // AadlBa.g:1687:21: COUNT
                            {
                            match(input,COUNT,FOLLOW_COUNT_in_value_variable5869); if (state.failed) return ValueVar;

                            if ( state.backtracking==0 ) { 
                                                  NamedValue nv = _decl.createNamedValue();
                                                  nv.setReference(ref) ;
                                                  nv.setCount(true);
                                                   nv.setLocationReference(ref.getLocationReference());
                                                  ValueVar = nv ;
                                                }

                            }
                            break;
                        case 2 :
                            // AadlBa.g:1696:21: FRESH
                            {
                            match(input,FRESH,FOLLOW_FRESH_in_value_variable5936); if (state.failed) return ValueVar;

                            if ( state.backtracking==0 ) {
                                                  NamedValue nv = _decl.createNamedValue();
                                                  nv.setReference(ref) ;
                                                  nv.setFresh(true);
                                                   nv.setLocationReference(ref.getLocationReference());
                                                  ValueVar = nv ;
                                                }

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                     if (ValueVar == null)
                     {
                       ValueVar = ref ;
                     }
                   }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ValueVar;
    }
    // $ANTLR end "value_variable"



    // $ANTLR start "value_expression"
    // AadlBa.g:1730:1: value_expression returns [ValueExpression ValueExpr] : (Rel= relation (LogicalOp= logical_operator Rel= relation )* ) ;
    public final ValueExpression value_expression() throws RecognitionException {
        ValueExpression ValueExpr = null;


        Relation Rel =null;

        LogicalOperator LogicalOp =null;



           ValueExpr = _fact.createValueExpression();
         
        try {
            // AadlBa.g:1734:3: ( (Rel= relation (LogicalOp= logical_operator Rel= relation )* ) )
            // AadlBa.g:1735:4: (Rel= relation (LogicalOp= logical_operator Rel= relation )* )
            {
            // AadlBa.g:1735:4: (Rel= relation (LogicalOp= logical_operator Rel= relation )* )
            // AadlBa.g:1736:6: Rel= relation (LogicalOp= logical_operator Rel= relation )*
            {
            pushFollow(FOLLOW_relation_in_value_expression6046);
            Rel=relation();

            state._fsp--;
            if (state.failed) return ValueExpr;

            if ( state.backtracking==0 ) { ValueExpr.getRelations().add(Rel);
                   ValueExpr.setLocationReference(Rel.getLocationReference());
                 }

            // AadlBa.g:1740:6: (LogicalOp= logical_operator Rel= relation )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==AND||LA56_0==OR||LA56_0==XOR) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // AadlBa.g:1741:8: LogicalOp= logical_operator Rel= relation
            	    {
            	    pushFollow(FOLLOW_logical_operator_in_value_expression6071);
            	    LogicalOp=logical_operator();

            	    state._fsp--;
            	    if (state.failed) return ValueExpr;

            	    pushFollow(FOLLOW_relation_in_value_expression6075);
            	    Rel=relation();

            	    state._fsp--;
            	    if (state.failed) return ValueExpr;

            	    if ( state.backtracking==0 ) {
            	            ValueExpr.getLogicalOperators().add(LogicalOp);
            	            ValueExpr.getRelations().add(Rel);
            	           }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ValueExpr;
    }
    // $ANTLR end "value_expression"



    // $ANTLR start "relation"
    // AadlBa.g:1758:1: relation returns [Relation Rel] : SimpleExpr= simple_expression (RelationalOp= relational_operator SimpleExpr= simple_expression )? ;
    public final Relation relation() throws RecognitionException {
        Relation Rel = null;


        SimpleExpression SimpleExpr =null;

        RelationalOperator RelationalOp =null;



           Rel = _fact.createRelation();
         
        try {
            // AadlBa.g:1762:3: (SimpleExpr= simple_expression (RelationalOp= relational_operator SimpleExpr= simple_expression )? )
            // AadlBa.g:1763:4: SimpleExpr= simple_expression (RelationalOp= relational_operator SimpleExpr= simple_expression )?
            {
            pushFollow(FOLLOW_simple_expression_in_relation6132);
            SimpleExpr=simple_expression();

            state._fsp--;
            if (state.failed) return Rel;

            if ( state.backtracking==0 ) { Rel.setFirstExpression(SimpleExpr);
                 Rel.setLocationReference(SimpleExpr.getLocationReference());  
               }

            // AadlBa.g:1767:4: (RelationalOp= relational_operator SimpleExpr= simple_expression )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==EQUAL||(LA57_0 >= GREATEROREQUAL && LA57_0 <= GREATERTHAN)||(LA57_0 >= LESSOREQUAL && LA57_0 <= LESSTHAN)||LA57_0==NOTEQUAL) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // AadlBa.g:1768:6: RelationalOp= relational_operator SimpleExpr= simple_expression
                    {
                    pushFollow(FOLLOW_relational_operator_in_relation6151);
                    RelationalOp=relational_operator();

                    state._fsp--;
                    if (state.failed) return Rel;

                    pushFollow(FOLLOW_simple_expression_in_relation6155);
                    SimpleExpr=simple_expression();

                    state._fsp--;
                    if (state.failed) return Rel;

                    if ( state.backtracking==0 ) {
                          Rel.setRelationalOperator(RelationalOp);
                          Rel.setSecondExpression(SimpleExpr);
                         }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Rel;
    }
    // $ANTLR end "relation"



    // $ANTLR start "simple_expression"
    // AadlBa.g:1784:1: simple_expression returns [SimpleExpression SimpleExpr] : (UnaryAddOp= unary_adding_operator )? tm= term (BinaryAddOp= binary_adding_operator tm= term )* ;
    public final SimpleExpression simple_expression() throws RecognitionException {
        SimpleExpression SimpleExpr = null;


        UnaryAddingOperator UnaryAddOp =null;

        Term tm =null;

        BinaryAddingOperator BinaryAddOp =null;



           SimpleExpr = _fact.createSimpleExpression();
         
        try {
            // AadlBa.g:1788:3: ( (UnaryAddOp= unary_adding_operator )? tm= term (BinaryAddOp= binary_adding_operator tm= term )* )
            // AadlBa.g:1789:4: (UnaryAddOp= unary_adding_operator )? tm= term (BinaryAddOp= binary_adding_operator tm= term )*
            {
            // AadlBa.g:1789:4: (UnaryAddOp= unary_adding_operator )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==MINUS||LA58_0==PLUS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // AadlBa.g:1790:6: UnaryAddOp= unary_adding_operator
                    {
                    pushFollow(FOLLOW_unary_adding_operator_in_simple_expression6210);
                    UnaryAddOp=unary_adding_operator();

                    state._fsp--;
                    if (state.failed) return SimpleExpr;

                    if ( state.backtracking==0 ) {
                          SimpleExpr.setUnaryAddingOperator(UnaryAddOp);
                         }

                    }
                    break;

            }


            pushFollow(FOLLOW_term_in_simple_expression6235);
            tm=term();

            state._fsp--;
            if (state.failed) return SimpleExpr;

            if ( state.backtracking==0 ) { 
                 SimpleExpr.getTerms().add(tm);
                 SimpleExpr.setLocationReference(tm.getLocationReference());
               }

            // AadlBa.g:1802:4: (BinaryAddOp= binary_adding_operator tm= term )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==MINUS||LA59_0==PLUS) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // AadlBa.g:1803:6: BinaryAddOp= binary_adding_operator tm= term
            	    {
            	    pushFollow(FOLLOW_binary_adding_operator_in_simple_expression6258);
            	    BinaryAddOp=binary_adding_operator();

            	    state._fsp--;
            	    if (state.failed) return SimpleExpr;

            	    pushFollow(FOLLOW_term_in_simple_expression6262);
            	    tm=term();

            	    state._fsp--;
            	    if (state.failed) return SimpleExpr;

            	    if ( state.backtracking==0 ) {
            	          SimpleExpr.getBinaryAddingOperators().add(BinaryAddOp);
            	          SimpleExpr.getTerms().add(tm);
            	         }

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return SimpleExpr;
    }
    // $ANTLR end "simple_expression"



    // $ANTLR start "term"
    // AadlBa.g:1818:1: term returns [Term tm] : fact= factor (MultiplyingOp= multiplying_operator fact= factor )* ;
    public final Term term() throws RecognitionException {
        Term tm = null;


        Factor fact =null;

        MultiplyingOperator MultiplyingOp =null;



           tm = _fact.createTerm();
         
        try {
            // AadlBa.g:1822:3: (fact= factor (MultiplyingOp= multiplying_operator fact= factor )* )
            // AadlBa.g:1823:4: fact= factor (MultiplyingOp= multiplying_operator fact= factor )*
            {
            pushFollow(FOLLOW_factor_in_term6309);
            fact=factor();

            state._fsp--;
            if (state.failed) return tm;

            if ( state.backtracking==0 ) { tm.getFactors().add(fact);
                 tm.setLocationReference(fact.getLocationReference());
               }

            // AadlBa.g:1827:4: (MultiplyingOp= multiplying_operator fact= factor )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==DIVIDE||LA60_0==MOD||LA60_0==REM||LA60_0==STAR) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // AadlBa.g:1828:6: MultiplyingOp= multiplying_operator fact= factor
            	    {
            	    pushFollow(FOLLOW_multiplying_operator_in_term6328);
            	    MultiplyingOp=multiplying_operator();

            	    state._fsp--;
            	    if (state.failed) return tm;

            	    pushFollow(FOLLOW_factor_in_term6332);
            	    fact=factor();

            	    state._fsp--;
            	    if (state.failed) return tm;

            	    if ( state.backtracking==0 ) {
            	          tm.getMultiplyingOperators().add(MultiplyingOp);
            	          tm.getFactors().add(fact);
            	         }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return tm;
    }
    // $ANTLR end "term"



    // $ANTLR start "factor"
    // AadlBa.g:1846:1: factor returns [Factor Fact] : ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) ) ;
    public final Factor factor() throws RecognitionException {
        Factor Fact = null;


        Value val =null;

        BinaryNumericOperator BinaryNumOp =null;

        Value val2 =null;

        UnaryNumericOperator UnaryNumOp =null;

        UnaryBooleanOperator UnaryBoolOp =null;



           Fact = _fact.createFactor();
         
        try {
            // AadlBa.g:1851:3: ( ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) ) )
            // AadlBa.g:1852:4: ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) )
            {
            // AadlBa.g:1852:4: ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case FALSE:
            case IDENT:
            case INTEGER_LIT:
            case LPAREN:
            case REAL_LIT:
            case STRING_LITERAL:
            case TRUE:
                {
                alt62=1;
                }
                break;
            case ABS:
                {
                alt62=2;
                }
                break;
            case NOT:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return Fact;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }

            switch (alt62) {
                case 1 :
                    // AadlBa.g:1853:5: (val= value (BinaryNumOp= binary_numeric_operator val2= value )? )
                    {
                    // AadlBa.g:1853:5: (val= value (BinaryNumOp= binary_numeric_operator val2= value )? )
                    // AadlBa.g:1853:7: val= value (BinaryNumOp= binary_numeric_operator val2= value )?
                    {
                    pushFollow(FOLLOW_value_in_factor6392);
                    val=value();

                    state._fsp--;
                    if (state.failed) return Fact;

                    if ( state.backtracking==0 ) {
                                      Fact.setLocationReference(val.getLocationReference()) ;
                                      Fact.setFirstValue(val);
                                    }

                    // AadlBa.g:1857:7: (BinaryNumOp= binary_numeric_operator val2= value )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==STARSTAR) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // AadlBa.g:1858:9: BinaryNumOp= binary_numeric_operator val2= value
                            {
                            pushFollow(FOLLOW_binary_numeric_operator_in_factor6415);
                            BinaryNumOp=binary_numeric_operator();

                            state._fsp--;
                            if (state.failed) return Fact;

                            pushFollow(FOLLOW_value_in_factor6419);
                            val2=value();

                            state._fsp--;
                            if (state.failed) return Fact;

                            if ( state.backtracking==0 ) {
                                      Fact.setBinaryNumericOperator(BinaryNumOp);
                                      Fact.setSecondValue(val2);
                                    }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1866:5: (UnaryNumOp= unary_numeric_operator val= value )
                    {
                    // AadlBa.g:1866:5: (UnaryNumOp= unary_numeric_operator val= value )
                    // AadlBa.g:1866:7: UnaryNumOp= unary_numeric_operator val= value
                    {
                    pushFollow(FOLLOW_unary_numeric_operator_in_factor6459);
                    UnaryNumOp=unary_numeric_operator();

                    state._fsp--;
                    if (state.failed) return Fact;

                    pushFollow(FOLLOW_value_in_factor6463);
                    val=value();

                    state._fsp--;
                    if (state.failed) return Fact;

                    if ( state.backtracking==0 ) {
                             Fact.setUnaryNumericOperator(UnaryNumOp);
                             Fact.setFirstValue(val);
                             Fact.setLocationReference(val.getLocationReference()) ;
                          }

                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1874:5: (UnaryBoolOp= unary_boolean_operator val= value )
                    {
                    // AadlBa.g:1874:5: (UnaryBoolOp= unary_boolean_operator val= value )
                    // AadlBa.g:1874:7: UnaryBoolOp= unary_boolean_operator val= value
                    {
                    pushFollow(FOLLOW_unary_boolean_operator_in_factor6492);
                    UnaryBoolOp=unary_boolean_operator();

                    state._fsp--;
                    if (state.failed) return Fact;

                    pushFollow(FOLLOW_value_in_factor6496);
                    val=value();

                    state._fsp--;
                    if (state.failed) return Fact;

                    if ( state.backtracking==0 ) {
                             Fact.setUnaryBooleanOperator(UnaryBoolOp);
                             Fact.setFirstValue(val);
                             Fact.setLocationReference(val.getLocationReference()) ;
                          }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Fact;
    }
    // $ANTLR end "factor"



    // $ANTLR start "logical_operator"
    // AadlBa.g:1890:1: logical_operator returns [LogicalOperator LogicalOp] : ( AND | OR | XOR ) ;
    public final LogicalOperator logical_operator() throws RecognitionException {
        LogicalOperator LogicalOp = null;



         // TODO location reference
           LogicalOp = null;
         
        try {
            // AadlBa.g:1895:3: ( ( AND | OR | XOR ) )
            // AadlBa.g:1896:4: ( AND | OR | XOR )
            {
            // AadlBa.g:1896:4: ( AND | OR | XOR )
            int alt63=3;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt63=1;
                }
                break;
            case OR:
                {
                alt63=2;
                }
                break;
            case XOR:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return LogicalOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // AadlBa.g:1897:6: AND
                    {
                    match(input,AND,FOLLOW_AND_in_logical_operator6552); if (state.failed) return LogicalOp;

                    if ( state.backtracking==0 ) { LogicalOp=LogicalOperator.AND; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1899:6: OR
                    {
                    match(input,OR,FOLLOW_OR_in_logical_operator6566); if (state.failed) return LogicalOp;

                    if ( state.backtracking==0 ) { LogicalOp=LogicalOperator.OR; }

                    }
                    break;
                case 3 :
                    // AadlBa.g:1901:6: XOR
                    {
                    match(input,XOR,FOLLOW_XOR_in_logical_operator6580); if (state.failed) return LogicalOp;

                    if ( state.backtracking==0 ) { LogicalOp=LogicalOperator.XOR; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return LogicalOp;
    }
    // $ANTLR end "logical_operator"



    // $ANTLR start "relational_operator"
    // AadlBa.g:1912:1: relational_operator returns [RelationalOperator RelationalOp] : ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL ) ;
    public final RelationalOperator relational_operator() throws RecognitionException {
        RelationalOperator RelationalOp = null;



         // TODO location reference
           RelationalOp = null;
         
        try {
            // AadlBa.g:1917:3: ( ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL ) )
            // AadlBa.g:1918:4: ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL )
            {
            // AadlBa.g:1918:4: ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL )
            int alt64=6;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt64=1;
                }
                break;
            case NOTEQUAL:
                {
                alt64=2;
                }
                break;
            case LESSTHAN:
                {
                alt64=3;
                }
                break;
            case LESSOREQUAL:
                {
                alt64=4;
                }
                break;
            case GREATERTHAN:
                {
                alt64=5;
                }
                break;
            case GREATEROREQUAL:
                {
                alt64=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return RelationalOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // AadlBa.g:1919:6: EQUAL
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_relational_operator6625); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.EQUAL; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1921:6: NOTEQUAL
                    {
                    match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_relational_operator6639); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.NOT_EQUAL; }

                    }
                    break;
                case 3 :
                    // AadlBa.g:1923:6: LESSTHAN
                    {
                    match(input,LESSTHAN,FOLLOW_LESSTHAN_in_relational_operator6653); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.LESS_THAN; }

                    }
                    break;
                case 4 :
                    // AadlBa.g:1925:6: LESSOREQUAL
                    {
                    match(input,LESSOREQUAL,FOLLOW_LESSOREQUAL_in_relational_operator6667); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.LESS_OR_EQUAL_THAN; }

                    }
                    break;
                case 5 :
                    // AadlBa.g:1927:6: GREATERTHAN
                    {
                    match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_relational_operator6681); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.GREATER_THAN; }

                    }
                    break;
                case 6 :
                    // AadlBa.g:1929:6: GREATEROREQUAL
                    {
                    match(input,GREATEROREQUAL,FOLLOW_GREATEROREQUAL_in_relational_operator6695); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.GREATER_OR_EQUAL_THAN; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return RelationalOp;
    }
    // $ANTLR end "relational_operator"



    // $ANTLR start "binary_adding_operator"
    // AadlBa.g:1940:1: binary_adding_operator returns [BinaryAddingOperator BinaryAddOp] : ( PLUS | MINUS ) ;
    public final BinaryAddingOperator binary_adding_operator() throws RecognitionException {
        BinaryAddingOperator BinaryAddOp = null;



         // TODO location reference
           //BinaryAddOp = _fact.createBinaryAddingOperator();
         
        try {
            // AadlBa.g:1945:3: ( ( PLUS | MINUS ) )
            // AadlBa.g:1946:4: ( PLUS | MINUS )
            {
            // AadlBa.g:1946:4: ( PLUS | MINUS )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==PLUS) ) {
                alt65=1;
            }
            else if ( (LA65_0==MINUS) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return BinaryAddOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // AadlBa.g:1947:6: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_binary_adding_operator6742); if (state.failed) return BinaryAddOp;

                    if ( state.backtracking==0 ) { BinaryAddOp = BinaryAddingOperator.PLUS; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1949:6: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_binary_adding_operator6756); if (state.failed) return BinaryAddOp;

                    if ( state.backtracking==0 ) { BinaryAddOp = BinaryAddingOperator.MINUS; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BinaryAddOp;
    }
    // $ANTLR end "binary_adding_operator"



    // $ANTLR start "unary_adding_operator"
    // AadlBa.g:1960:1: unary_adding_operator returns [UnaryAddingOperator UnaryAddOp] : ( PLUS | MINUS ) ;
    public final UnaryAddingOperator unary_adding_operator() throws RecognitionException {
        UnaryAddingOperator UnaryAddOp = null;



         // TODO location reference
         
        try {
            // AadlBa.g:1964:3: ( ( PLUS | MINUS ) )
            // AadlBa.g:1965:4: ( PLUS | MINUS )
            {
            // AadlBa.g:1965:4: ( PLUS | MINUS )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==PLUS) ) {
                alt66=1;
            }
            else if ( (LA66_0==MINUS) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return UnaryAddOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // AadlBa.g:1966:6: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unary_adding_operator6801); if (state.failed) return UnaryAddOp;

                    if ( state.backtracking==0 ) { UnaryAddOp = UnaryAddingOperator.PLUS; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1968:6: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unary_adding_operator6815); if (state.failed) return UnaryAddOp;

                    if ( state.backtracking==0 ) { UnaryAddOp = UnaryAddingOperator.MINUS; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return UnaryAddOp;
    }
    // $ANTLR end "unary_adding_operator"



    // $ANTLR start "multiplying_operator"
    // AadlBa.g:1979:1: multiplying_operator returns [MultiplyingOperator MultiplyingOp] : ( STAR | DIVIDE | MOD | REM ) ;
    public final MultiplyingOperator multiplying_operator() throws RecognitionException {
        MultiplyingOperator MultiplyingOp = null;



         // TODO location reference
          // MultiplyingOperator MultiplyingOp = null;
         
        try {
            // AadlBa.g:1984:3: ( ( STAR | DIVIDE | MOD | REM ) )
            // AadlBa.g:1985:4: ( STAR | DIVIDE | MOD | REM )
            {
            // AadlBa.g:1985:4: ( STAR | DIVIDE | MOD | REM )
            int alt67=4;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt67=1;
                }
                break;
            case DIVIDE:
                {
                alt67=2;
                }
                break;
            case MOD:
                {
                alt67=3;
                }
                break;
            case REM:
                {
                alt67=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return MultiplyingOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }

            switch (alt67) {
                case 1 :
                    // AadlBa.g:1986:6: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplying_operator6860); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.MULTIPLY; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1988:6: DIVIDE
                    {
                    match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplying_operator6874); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.DIVIDE; }

                    }
                    break;
                case 3 :
                    // AadlBa.g:1990:6: MOD
                    {
                    match(input,MOD,FOLLOW_MOD_in_multiplying_operator6888); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.MOD; }

                    }
                    break;
                case 4 :
                    // AadlBa.g:1992:6: REM
                    {
                    match(input,REM,FOLLOW_REM_in_multiplying_operator6902); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.REM; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return MultiplyingOp;
    }
    // $ANTLR end "multiplying_operator"



    // $ANTLR start "binary_numeric_operator"
    // AadlBa.g:2003:1: binary_numeric_operator returns [BinaryNumericOperator BinaryNumOp] : STARSTAR ;
    public final BinaryNumericOperator binary_numeric_operator() throws RecognitionException {
        BinaryNumericOperator BinaryNumOp = null;



         // TODO location reference
           //BinaryNumericOperator BinaryNumOp = null;
         
        try {
            // AadlBa.g:2008:3: ( STARSTAR )
            // AadlBa.g:2009:4: STARSTAR
            {
            match(input,STARSTAR,FOLLOW_STARSTAR_in_binary_numeric_operator6940); if (state.failed) return BinaryNumOp;

            if ( state.backtracking==0 ) { BinaryNumOp = BinaryNumericOperator.MULTIPLY_MULTIPLY; }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BinaryNumOp;
    }
    // $ANTLR end "binary_numeric_operator"



    // $ANTLR start "unary_numeric_operator"
    // AadlBa.g:2019:1: unary_numeric_operator returns [UnaryNumericOperator UnaryNumOp] : keyword= ABS ;
    public final UnaryNumericOperator unary_numeric_operator() throws RecognitionException {
        UnaryNumericOperator UnaryNumOp = null;


        Token keyword=null;


         // TODO location reference
           //UnaryNumericOperator UnaryNumOp = null;
         
        try {
            // AadlBa.g:2024:3: (keyword= ABS )
            // AadlBa.g:2025:4: keyword= ABS
            {
            keyword=(Token)match(input,ABS,FOLLOW_ABS_in_unary_numeric_operator6975); if (state.failed) return UnaryNumOp;

            if ( state.backtracking==0 ) { UnaryNumOp = UnaryNumericOperator.ABS; highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return UnaryNumOp;
    }
    // $ANTLR end "unary_numeric_operator"



    // $ANTLR start "unary_boolean_operator"
    // AadlBa.g:2035:1: unary_boolean_operator returns [UnaryBooleanOperator UnaryBoolOp] : NOT ;
    public final UnaryBooleanOperator unary_boolean_operator() throws RecognitionException {
        UnaryBooleanOperator UnaryBoolOp = null;



         // TODO location reference
           //UnaryBooleanOperator UnaryBoolOp = null;
         
        try {
            // AadlBa.g:2040:3: ( NOT )
            // AadlBa.g:2041:4: NOT
            {
            match(input,NOT,FOLLOW_NOT_in_unary_boolean_operator7008); if (state.failed) return UnaryBoolOp;

            if ( state.backtracking==0 ) { UnaryBoolOp = UnaryBooleanOperator.NOT; }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return UnaryBoolOp;
    }
    // $ANTLR end "unary_boolean_operator"



    // $ANTLR start "boolean_literal"
    // AadlBa.g:2050:1: boolean_literal returns [BehaviorBooleanLiteral BoolLit] : (identifier= TRUE |identifier= FALSE ) ;
    public final BehaviorBooleanLiteral boolean_literal() throws RecognitionException {
        BehaviorBooleanLiteral BoolLit = null;


        Token identifier=null;


           BoolLit = _fact.createBehaviorBooleanLiteral();
         
        try {
            // AadlBa.g:2054:3: ( (identifier= TRUE |identifier= FALSE ) )
            // AadlBa.g:2055:4: (identifier= TRUE |identifier= FALSE )
            {
            // AadlBa.g:2055:4: (identifier= TRUE |identifier= FALSE )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==TRUE) ) {
                alt68=1;
            }
            else if ( (LA68_0==FALSE) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return BoolLit;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // AadlBa.g:2056:8: identifier= TRUE
                    {
                    identifier=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolean_literal7051); if (state.failed) return BoolLit;

                    if ( state.backtracking==0 ) { BoolLit.setValue(true);}

                    }
                    break;
                case 2 :
                    // AadlBa.g:2058:8: identifier= FALSE
                    {
                    identifier=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolean_literal7071); if (state.failed) return BoolLit;

                    if ( state.backtracking==0 ) { BoolLit.setValue(false);}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {setLocationReference(BoolLit, identifier) ;}

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BoolLit;
    }
    // $ANTLR end "boolean_literal"



    // $ANTLR start "integer_range"
    // AadlBa.g:2069:1: integer_range returns [IntegerRange IntRange] : (IntValue= integer_value DOTDOT IntValue2= integer_value ) ;
    public final IntegerRange integer_range() throws RecognitionException {
        IntegerRange IntRange = null;


        IntegerValue IntValue =null;

        IntegerValue IntValue2 =null;



           IntRange = _fact.createIntegerRange();
         
        try {
            // AadlBa.g:2073:3: ( (IntValue= integer_value DOTDOT IntValue2= integer_value ) )
            // AadlBa.g:2074:4: (IntValue= integer_value DOTDOT IntValue2= integer_value )
            {
            // AadlBa.g:2074:4: (IntValue= integer_value DOTDOT IntValue2= integer_value )
            // AadlBa.g:2075:6: IntValue= integer_value DOTDOT IntValue2= integer_value
            {
            pushFollow(FOLLOW_integer_value_in_integer_range7123);
            IntValue=integer_value();

            state._fsp--;
            if (state.failed) return IntRange;

            match(input,DOTDOT,FOLLOW_DOTDOT_in_integer_range7125); if (state.failed) return IntRange;

            pushFollow(FOLLOW_integer_value_in_integer_range7129);
            IntValue2=integer_value();

            state._fsp--;
            if (state.failed) return IntRange;

            if ( state.backtracking==0 ) {
                   IntRange.setLowerIntegerValue(IntValue);
                   IntRange.setUpperIntegerValue(IntValue2);
                   IntRange.setLocationReference(IntValue.getLocationReference());
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return IntRange;
    }
    // $ANTLR end "integer_range"



    // $ANTLR start "integer_value"
    // AadlBa.g:2092:1: integer_value returns [IntegerValue IntVal] : (ValTmp= fact_value ) ;
    public final IntegerValue integer_value() throws RecognitionException {
        IntegerValue IntVal = null;


        Value ValTmp =null;



         
        try {
            // AadlBa.g:2095:3: ( (ValTmp= fact_value ) )
            // AadlBa.g:2097:4: (ValTmp= fact_value )
            {
            // AadlBa.g:2097:4: (ValTmp= fact_value )
            // AadlBa.g:2098:6: ValTmp= fact_value
            {
            pushFollow(FOLLOW_fact_value_in_integer_value7188);
            ValTmp=fact_value();

            state._fsp--;
            if (state.failed) return IntVal;

            if ( state.backtracking==0 ) { IntVal = (IntegerValue) ValTmp ;}

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return IntVal;
    }
    // $ANTLR end "integer_value"



    // $ANTLR start "behavior_time"
    // AadlBa.g:2109:1: behavior_time returns [DeclarativeTime BehTime] : (IntValue= integer_value UnitIdent= IDENT ) ;
    public final DeclarativeTime behavior_time() throws RecognitionException {
        DeclarativeTime BehTime = null;


        Token UnitIdent=null;
        IntegerValue IntValue =null;



           BehTime = _decl.createDeclarativeTime() ;
         
        try {
            // AadlBa.g:2113:3: ( (IntValue= integer_value UnitIdent= IDENT ) )
            // AadlBa.g:2114:4: (IntValue= integer_value UnitIdent= IDENT )
            {
            // AadlBa.g:2114:4: (IntValue= integer_value UnitIdent= IDENT )
            // AadlBa.g:2115:6: IntValue= integer_value UnitIdent= IDENT
            {
            pushFollow(FOLLOW_integer_value_in_behavior_time7252);
            IntValue=integer_value();

            state._fsp--;
            if (state.failed) return BehTime;

            UnitIdent=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_time7256); if (state.failed) return BehTime;

            if ( state.backtracking==0 ) {
                   BehTime.setIntegerValue(IntValue);
                   BehTime.setLocationReference(IntValue.getLocationReference());
                   
                   Identifier Id = _decl.createIdentifier() ;
                   Id.setId(UnitIdent.getText());
                   setLocationReference(Id, UnitIdent) ;
                   BehTime.setUnitId(Id);
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehTime;
    }
    // $ANTLR end "behavior_time"



    // $ANTLR start "property"
    // AadlBa.g:2146:1: property returns [QualifiedNamedElement property] : ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT ) ;
    public final QualifiedNamedElement property() throws RecognitionException {
        QualifiedNamedElement property = null;


        Token PropertySetId=null;
        Token PropertyId=null;


           property = _decl.createQualifiedNamedElement();
         
        try {
            // AadlBa.g:2150:3: ( ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT ) )
            // AadlBa.g:2151:4: ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT )
            {
            // AadlBa.g:2151:4: ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT )
            // AadlBa.g:2152:6: (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT
            {
            // AadlBa.g:2152:6: (PropertySetId= IDENT DOUBLECOLON )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==IDENT) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==DOUBLECOLON) ) {
                    alt69=1;
                }
            }
            switch (alt69) {
                case 1 :
                    // AadlBa.g:2152:8: PropertySetId= IDENT DOUBLECOLON
                    {
                    PropertySetId=(Token)match(input,IDENT,FOLLOW_IDENT_in_property7321); if (state.failed) return property;

                    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_property7323); if (state.failed) return property;

                    if ( state.backtracking==0 ) {
                             Identifier nameSpaceId = _decl.createIdentifier();
                             nameSpaceId.setId(PropertySetId.getText());
                             setLocationReference(nameSpaceId, PropertySetId); 
                             property.setBaNamespace(nameSpaceId);
                             setLocationReference(property, PropertySetId) ;
                           }

                    }
                    break;

            }


            PropertyId=(Token)match(input,IDENT,FOLLOW_IDENT_in_property7357); if (state.failed) return property;

            if ( state.backtracking==0 ) { 
                   Identifier nameId = _decl.createIdentifier();
                   nameId.setId(PropertyId.getText());
                   setLocationReference(nameId, PropertyId); 
                   property.setBaName(nameId);
                   
                   if (property.getLocationReference() == null )  
                   {
                     setLocationReference(property, PropertyId) ; 
                   }
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return property;
    }
    // $ANTLR end "property"



    // $ANTLR start "behavior_enumeration_literal"
    // AadlBa.g:2187:1: behavior_enumeration_literal returns [Enumeration enumeration] : ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT ) ;
    public final Enumeration behavior_enumeration_literal() throws RecognitionException {
        Enumeration enumeration = null;


        Token id1=null;
        Token id2=null;


                  enumeration = _decl.createEnumeration() ;
                
        try {
            // AadlBa.g:2191:3: ( ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT ) )
            // AadlBa.g:2192:3: ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT )
            {
            // AadlBa.g:2192:3: ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT )
            // AadlBa.g:2193:6: qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT
            {
            pushFollow(FOLLOW_qualifiable_named_element_in_behavior_enumeration_literal7411);
            qualifiable_named_element(enumeration);

            state._fsp--;
            if (state.failed) return enumeration;

            match(input,DOT,FOLLOW_DOT_in_behavior_enumeration_literal7425); if (state.failed) return enumeration;

            id1=(Token)match(input,ENUMERATOR,FOLLOW_ENUMERATOR_in_behavior_enumeration_literal7429); if (state.failed) return enumeration;

            match(input,HASH,FOLLOW_HASH_in_behavior_enumeration_literal7431); if (state.failed) return enumeration;

            id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_enumeration_literal7435); if (state.failed) return enumeration;

            if ( state.backtracking==0 ) {
                   Identifier lit = _decl.createIdentifier() ;
                   lit.setId(id2.getText());
                   setLocationReference(lit, id2) ;
                   Identifier prop = _decl.createIdentifier() ;
                   prop.setId(id1.getText()) ;
                   setLocationReference(prop, id1) ;
                   
                   enumeration.setProperty(prop);
                   enumeration.setLiteral(lit);
                   // enumeration's location reference is already set, see
                   // qualifiable_named_element.       
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return enumeration;
    }
    // $ANTLR end "behavior_enumeration_literal"



    // $ANTLR start "numeric_literal"
    // AadlBa.g:2219:1: numeric_literal returns [NumericLiteral nl] : (realval= REAL_LIT |intLit= integer_literal ) ;
    public final NumericLiteral numeric_literal() throws RecognitionException {
        NumericLiteral nl = null;


        Token realval=null;
        BehaviorIntegerLiteral intLit =null;


         
            nl=null;
            char sign = ' '; 
          
        try {
            // AadlBa.g:2224:3: ( (realval= REAL_LIT |intLit= integer_literal ) )
            // AadlBa.g:2225:3: (realval= REAL_LIT |intLit= integer_literal )
            {
            // AadlBa.g:2225:3: (realval= REAL_LIT |intLit= integer_literal )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==REAL_LIT) ) {
                alt70=1;
            }
            else if ( (LA70_0==INTEGER_LIT) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return nl;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // AadlBa.g:2226:7: realval= REAL_LIT
                    {
                    realval=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_numeric_literal7495); if (state.failed) return nl;

                    if ( state.backtracking==0 ) {
                            String str = realval.getText();
                            BehaviorRealLiteral tmp = _fact.createBehaviorRealLiteral();
                            str = str.replaceAll("_", "") ;
                            tmp.setValue(str);
                            setLocationReference(tmp, realval);
                            nl = tmp ;
                          }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2236:7: intLit= integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_numeric_literal7521);
                    intLit=integer_literal();

                    state._fsp--;
                    if (state.failed) return nl;

                    if ( state.backtracking==0 ) {
                            nl = intLit ;
                          }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return nl;
    }
    // $ANTLR end "numeric_literal"



    // $ANTLR start "integer_literal"
    // AadlBa.g:2248:1: integer_literal returns [BehaviorIntegerLiteral bil] : integerval= INTEGER_LIT ;
    public final BehaviorIntegerLiteral integer_literal() throws RecognitionException {
        BehaviorIntegerLiteral bil = null;


        Token integerval=null;

        try {
            // AadlBa.g:2250:2: (integerval= INTEGER_LIT )
            // AadlBa.g:2251:5: integerval= INTEGER_LIT
            {
            integerval=(Token)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_integer_literal7561); if (state.failed) return bil;

            if ( state.backtracking==0 ) {
                  try
                  {
                    String str = integerval.getText();
                    BehaviorIntegerLiteral tmp = _fact.createBehaviorIntegerLiteral();
                    tmp.setValue(str);
                    setLocationReference(tmp, integerval);
                    bil = tmp ;
                  }
                  catch (IllegalArgumentException e)
                  {
                      int line = integerval.getLine() ;
                      int col = integerval.getCharPositionInLine() ; 
                      String fileName = this.getFilename() ;
                      RecognitionException ex = new RecognitionException() ;
                      ex.line = line ;
                      ex.charPositionInLine = col ;
                      ex.input = input ;
                      throw ex ;
                  }
                }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return bil;
    }
    // $ANTLR end "integer_literal"



    // $ANTLR start "string_literal"
    // AadlBa.g:2282:1: string_literal returns [BehaviorStringLiteral StringLit] : (sl= STRING_LITERAL ) ;
    public final BehaviorStringLiteral string_literal() throws RecognitionException {
        BehaviorStringLiteral StringLit = null;


        Token sl=null;


           StringLit = _fact.createBehaviorStringLiteral();
         
        try {
            // AadlBa.g:2286:3: ( (sl= STRING_LITERAL ) )
            // AadlBa.g:2287:4: (sl= STRING_LITERAL )
            {
            // AadlBa.g:2287:4: (sl= STRING_LITERAL )
            // AadlBa.g:2288:6: sl= STRING_LITERAL
            {
            sl=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal7607); if (state.failed) return StringLit;

            if ( state.backtracking==0 ) {
                    String str = sl.getText();
                    // stripout the quotes
                    str = str.substring(1,str.length()-1);
                    StringLit.setValue(str);
                    setLocationReference(StringLit, sl); 
                  }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return StringLit;
    }
    // $ANTLR end "string_literal"



    // $ANTLR start "numeral"
    // AadlBa.g:2306:1: numeral returns [Integer Num] : (NumVal= INTEGER_LIT ) ;
    public final Integer numeral() throws RecognitionException {
        Integer Num = null;


        Token NumVal=null;

        try {
            // AadlBa.g:2308:3: ( (NumVal= INTEGER_LIT ) )
            // AadlBa.g:2309:4: (NumVal= INTEGER_LIT )
            {
            // AadlBa.g:2309:4: (NumVal= INTEGER_LIT )
            // AadlBa.g:2310:6: NumVal= INTEGER_LIT
            {
            NumVal=(Token)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_numeral7657); if (state.failed) return Num;

            if ( state.backtracking==0 ) { 
                   String tmp = NumVal.getText().replaceAll("_", "");
                   Num = Integer.parseInt(tmp) ;
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Num;
    }
    // $ANTLR end "numeral"

    // $ANTLR start synpred34_AadlBa
    public final void synpred34_AadlBa_fragment() throws RecognitionException {
        BehaviorAction BehAction2 =null;


        // AadlBa.g:971:9: ( ( SEMICOLON BehAction2= behavior_action )* )
        // AadlBa.g:971:9: ( SEMICOLON BehAction2= behavior_action )*
        {
        // AadlBa.g:971:9: ( SEMICOLON BehAction2= behavior_action )*
        loop77:
        do {
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==SEMICOLON) ) {
                alt77=1;
            }


            switch (alt77) {
        	case 1 :
        	    // AadlBa.g:971:11: SEMICOLON BehAction2= behavior_action
        	    {
        	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred34_AadlBa2935); if (state.failed) return ;

        	    pushFollow(FOLLOW_behavior_action_in_synpred34_AadlBa2939);
        	    BehAction2=behavior_action();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop77;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred34_AadlBa

    // $ANTLR start synpred44_AadlBa
    public final void synpred44_AadlBa_fragment() throws RecognitionException {
        IntegerRange IntRange =null;


        // AadlBa.g:1167:6: ( (IntRange= integer_range ) )
        // AadlBa.g:1167:6: (IntRange= integer_range )
        {
        // AadlBa.g:1167:6: (IntRange= integer_range )
        // AadlBa.g:1167:8: IntRange= integer_range
        {
        pushFollow(FOLLOW_integer_range_in_synpred44_AadlBa3752);
        IntRange=integer_range();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred44_AadlBa

    // $ANTLR start synpred45_AadlBa
    public final void synpred45_AadlBa_fragment() throws RecognitionException {
        AssignmentAction AssAct =null;


        // AadlBa.g:1186:6: ( (AssAct= assignment_action ) )
        // AadlBa.g:1186:6: (AssAct= assignment_action )
        {
        // AadlBa.g:1186:6: (AssAct= assignment_action )
        // AadlBa.g:1186:8: AssAct= assignment_action
        {
        pushFollow(FOLLOW_assignment_action_in_synpred45_AadlBa3816);
        AssAct=assignment_action();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred45_AadlBa

    // $ANTLR start synpred46_AadlBa
    public final void synpred46_AadlBa_fragment() throws RecognitionException {
        CommAction CommAct =null;


        // AadlBa.g:1188:6: ( (CommAct= communication_action ) )
        // AadlBa.g:1188:6: (CommAct= communication_action )
        {
        // AadlBa.g:1188:6: (CommAct= communication_action )
        // AadlBa.g:1188:8: CommAct= communication_action
        {
        pushFollow(FOLLOW_communication_action_in_synpred46_AadlBa3836);
        CommAct=communication_action();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred46_AadlBa

    // Delegated rules

    public final boolean synpred44_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_VARIABLES_in_behavior_annex1192 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_behavior_variable_list_in_behavior_annex1207 = new BitSet(new long[]{0x0000200000000002L,0x0000000000084000L});
    public static final BitSet FOLLOW_STATES_in_behavior_annex1230 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_behavior_state_list_in_behavior_annex1243 = new BitSet(new long[]{0x0000200000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_TRANSITIONS_in_behavior_annex1265 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_behavior_transition_in_behavior_annex1279 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_behavior_variable_in_behavior_variable_list1334 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COMMA_in_behavior_variable_list1351 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_behavior_variable_in_behavior_variable_list1355 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COLON_in_behavior_variable_list1378 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_unique_component_classifier_reference_in_behavior_variable_list1390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_variable_list1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behavior_variable1436 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_behavior_variable1446 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_integer_value_constant_in_behavior_variable1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRACK_in_behavior_variable1452 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualifiable_named_element1507 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_qualifiable_named_element1509 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiable_named_element1537 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_qualifiable_named_element1552 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiable_named_element1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiable_named_element_in_unique_component_classifier_reference1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behavior_state_list1657 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COMMA_in_behavior_state_list1673 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_state_list1677 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COLON_in_behavior_state_list1697 = new BitSet(new long[]{0x0001000800001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_INITIAL_in_behavior_state_list1713 = new BitSet(new long[]{0x0000000800001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMPLETE_in_behavior_state_list1730 = new BitSet(new long[]{0x0000000800000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_FINAL_in_behavior_state_list1746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STATE_in_behavior_state_list1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_state_list1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1814 = new BitSet(new long[]{0x0010000000000400L});
    public static final BitSet FOLLOW_LBRACK_in_behavior_transition1832 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_numeral_in_behavior_transition1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRACK_in_behavior_transition1838 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_behavior_transition1851 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1870 = new BitSet(new long[]{0x0400000000000800L});
    public static final BitSet FOLLOW_COMMA_in_behavior_transition1887 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1891 = new BitSet(new long[]{0x0400000000000800L});
    public static final BitSet FOLLOW_LTRANS_in_behavior_transition1919 = new BitSet(new long[]{0xAA02200400000010L,0x0000000000150126L});
    public static final BitSet FOLLOW_behavior_condition_in_behavior_transition1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RTRANS_in_behavior_transition1938 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1955 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_behavior_action_block_in_behavior_transition1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_transition2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action_block2036 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action_block2040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action_block2042 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_TIMEOUT_in_behavior_action_block2064 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_behavior_time_in_behavior_action_block2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_behavior_condition2126 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_dispatch_condition_in_behavior_condition2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_execute_condition_in_behavior_condition2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMEOUT_in_execute_condition2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_execute_condition2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_expression_in_execute_condition2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_integer_value_constant2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_integer_value_constant2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISPATCH_in_dispatch_condition2396 = new BitSet(new long[]{0x0000208000000002L,0x0000000000048000L});
    public static final BitSet FOLLOW_dispatch_trigger_condition_in_dispatch_condition2406 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_FROZEN_in_dispatch_condition2430 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_reference_in_dispatch_condition2434 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_dispatch_condition2450 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_reference_in_dispatch_condition2454 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_STOP_in_dispatch_trigger_condition2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMEOUT_in_dispatch_trigger_condition2585 = new BitSet(new long[]{0x0002200400000002L,0x0000000000110020L});
    public static final BitSet FOLLOW_behavior_time_in_dispatch_trigger_condition2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dispatch_trigger_logical_expression_in_dispatch_trigger_condition2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_OR_in_dispatch_trigger_logical_expression2749 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2753 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_reference_in_dispatch_conjunction2812 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_dispatch_conjunction2837 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_reference_in_dispatch_conjunction2841 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_behavior_action_in_behavior_actions2909 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_actions2935 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_action_in_behavior_actions2939 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_CONCAT_in_behavior_actions2995 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_action_in_behavior_actions2999 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_basic_action_in_behavior_action3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behavior_action_block_in_behavior_action3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_behavior_action3173 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3177 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3183 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3187 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ELSIF_in_behavior_action3220 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3224 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3230 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3234 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ELSE_in_behavior_action3277 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3281 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_END_in_behavior_action3311 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IF_in_behavior_action3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_behavior_action3351 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3353 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_action3367 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_behavior_action3378 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_unique_component_classifier_reference_in_behavior_action3382 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_behavior_action3408 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_element_values_in_behavior_action3412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3414 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action3427 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_behavior_action3472 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3474 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_action3495 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_behavior_action3506 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_unique_component_classifier_reference_in_behavior_action3510 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_behavior_action3537 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_element_values_in_behavior_action3541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3543 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action3556 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_behavior_action3600 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3604 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3610 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action3620 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_behavior_action3665 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_UNTIL_in_behavior_action3671 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3684 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_range_in_element_values3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_element_values3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_action_in_basic_action3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_communication_action_in_basic_action3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timed_action_in_basic_action3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_target_in_assignment_action3900 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_action3902 = new BitSet(new long[]{0x2A02200400000050L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_assignment_action3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_assignment_action3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_target3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualified_named_element4038 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_qualified_named_element4040 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualified_named_element4068 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_qualified_named_element4082 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualified_named_element4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_named_element_in_communication_action4238 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EXCLAM_in_communication_action4240 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_communication_action4273 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_subprogram_parameter_list_in_communication_action4277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_communication_action4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_communication_action4339 = new BitSet(new long[]{0x00040100E0000000L});
    public static final BitSet FOLLOW_INTERROG_in_communication_action4389 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_communication_action4439 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_target_in_communication_action4443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_communication_action4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GGREATER_in_communication_action4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLLESS_in_communication_action4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLGREATER_in_communication_action4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_communication_action4752 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_communication_action4787 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_subprogram_parameter_list_in_communication_action4791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_communication_action4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_communication_action4886 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_EXCLLESS_in_communication_action4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLGREATER_in_communication_action4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPUTATION_in_timed_action5029 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timed_action5045 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_behavior_time_in_timed_action5054 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DOTDOT_in_timed_action5064 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_behavior_time_in_timed_action5068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_timed_action5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_label_in_subprogram_parameter_list5119 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_subprogram_parameter_list5130 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_parameter_label_in_subprogram_parameter_list5134 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_value_expression_in_parameter_label5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_identifier_in_reference5252 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_reference5272 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_array_identifier_in_reference5276 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IDENT_in_array_identifier5325 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_identifier5345 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_integer_value_in_array_identifier5349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRACK_in_array_identifier5351 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fact_value5474 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_fact_value5476 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_fact_value5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_variable_in_fact_value5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_fact_value5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_fact_value5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_fact_value5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behavior_enumeration_literal_in_fact_value5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_value_in_value5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value5696 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_value5700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_value5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_value_variable5778 = new BitSet(new long[]{0x0004000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_INTERROG_in_value_variable5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TICK_in_value_variable5845 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_COUNT_in_value_variable5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRESH_in_value_variable5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_value_expression6046 = new BitSet(new long[]{0x0000000000000022L,0x0000000002000001L});
    public static final BitSet FOLLOW_logical_operator_in_value_expression6071 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_relation_in_value_expression6075 = new BitSet(new long[]{0x0000000000000022L,0x0000000002000001L});
    public static final BitSet FOLLOW_simple_expression_in_relation6132 = new BitSet(new long[]{0x40C0060008000002L});
    public static final BitSet FOLLOW_relational_operator_in_relation6151 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_simple_expression_in_relation6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_adding_operator_in_simple_expression6210 = new BitSet(new long[]{0x2202200400000010L,0x0000000000110020L});
    public static final BitSet FOLLOW_term_in_simple_expression6235 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_binary_adding_operator_in_simple_expression6258 = new BitSet(new long[]{0x2202200400000010L,0x0000000000110020L});
    public static final BitSet FOLLOW_term_in_simple_expression6262 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_term6309 = new BitSet(new long[]{0x1000000000040002L,0x0000000000000840L});
    public static final BitSet FOLLOW_multiplying_operator_in_term6328 = new BitSet(new long[]{0x2202200400000010L,0x0000000000110020L});
    public static final BitSet FOLLOW_factor_in_term6332 = new BitSet(new long[]{0x1000000000040002L,0x0000000000000840L});
    public static final BitSet FOLLOW_value_in_factor6392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_binary_numeric_operator_in_factor6415 = new BitSet(new long[]{0x0202200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_value_in_factor6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_numeric_operator_in_factor6459 = new BitSet(new long[]{0x0202200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_value_in_factor6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_boolean_operator_in_factor6492 = new BitSet(new long[]{0x0202200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_value_in_factor6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_logical_operator6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_operator6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XOR_in_logical_operator6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_relational_operator6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_relational_operator6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_relational_operator6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSOREQUAL_in_relational_operator6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHAN_in_relational_operator6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATEROREQUAL_in_relational_operator6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_binary_adding_operator6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_binary_adding_operator6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_adding_operator6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_adding_operator6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplying_operator6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplying_operator6874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_multiplying_operator6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_multiplying_operator6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSTAR_in_binary_numeric_operator6940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_unary_numeric_operator6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_boolean_operator7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolean_literal7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolean_literal7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_value_in_integer_range7123 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOTDOT_in_integer_range7125 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_integer_value_in_integer_range7129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_value_in_integer_value7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_value_in_behavior_time7252 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_time7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_property7321 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_property7323 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_property7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiable_named_element_in_behavior_enumeration_literal7411 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_behavior_enumeration_literal7425 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ENUMERATOR_in_behavior_enumeration_literal7429 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_HASH_in_behavior_enumeration_literal7431 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_enumeration_literal7435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_numeric_literal7495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_numeric_literal7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LIT_in_integer_literal7561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LIT_in_numeral7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred34_AadlBa2935 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_action_in_synpred34_AadlBa2939 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_integer_range_in_synpred44_AadlBa3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_action_in_synpred45_AadlBa3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_communication_action_in_synpred46_AadlBa3836 = new BitSet(new long[]{0x0000000000000002L});

}