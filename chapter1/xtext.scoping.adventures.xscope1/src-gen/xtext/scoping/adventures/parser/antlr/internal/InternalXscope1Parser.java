package xtext.scoping.adventures.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.scoping.adventures.services.Xscope1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXscope1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalXscope1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXscope1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXscope1Parser.tokenNames; }
    public String getGrammarFileName() { return "../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g"; }



     	private Xscope1GrammarAccess grammarAccess;
     	
        public InternalXscope1Parser(TokenStream input, Xscope1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected Xscope1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:79:28: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:80:1: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:80:1: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:81:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:81:1: (lv_statements_0_0= ruleStatement )
            	    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:82:3: lv_statements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleProgram130);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_0_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:108:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:115:1: ruleStatement returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Assignment_1= ruleAssignment ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Assignment_1 = null;


         enterRule(); 
            
        try {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:118:28: ( (this_Variable_0= ruleVariable | this_Assignment_1= ruleAssignment ) )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:119:1: (this_Variable_0= ruleVariable | this_Assignment_1= ruleAssignment )
            {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:119:1: (this_Variable_0= ruleVariable | this_Assignment_1= ruleAssignment )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:120:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleStatement223);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:130:5: this_Assignment_1= ruleAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssignment_in_ruleStatement250);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;

                     
                            current = this_Assignment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariable"
    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:146:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:147:2: (iv_ruleVariable= ruleVariable EOF )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:148:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable285);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:155:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:158:28: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:159:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:159:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:159:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleVariable332); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
                
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:163:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:164:1: (lv_name_1_0= RULE_ID )
            {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:164:1: (lv_name_1_0= RULE_ID )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:165:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable349); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAssignment"
    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:189:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:190:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:191:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment390);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment400); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:198:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:201:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:202:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:202:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:202:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:202:2: ( (otherlv_0= RULE_ID ) )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:203:1: (otherlv_0= RULE_ID )
            {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:203:1: (otherlv_0= RULE_ID )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:204:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment445); 

            		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getLhsVariableCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAssignment457); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:219:1: ( (otherlv_2= RULE_ID ) )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:220:1: (otherlv_2= RULE_ID )
            {
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:220:1: (otherlv_2= RULE_ID )
            // ../xtext.scoping.adventures.xscope1/src-gen/xtext/scoping/adventures/parser/antlr/internal/InternalXscope1.g:221:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment477); 

            		newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getRhsVariableCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProgram130 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStatement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleStatement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleVariable332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment445 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssignment457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment477 = new BitSet(new long[]{0x0000000000000002L});

}