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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXscope1Parser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g"; }


     
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




    // $ANTLR start "entryRuleProgram"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:61:1: ( ruleProgram EOF )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:69:1: ruleProgram : ( ( rule__Program__StatementsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:73:2: ( ( ( rule__Program__StatementsAssignment )* ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:74:1: ( ( rule__Program__StatementsAssignment )* )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:74:1: ( ( rule__Program__StatementsAssignment )* )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:75:1: ( rule__Program__StatementsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:76:1: ( rule__Program__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:76:2: rule__Program__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__StatementsAssignment_in_ruleProgram94);
            	    rule__Program__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:88:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:89:1: ( ruleStatement EOF )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:90:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement122);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:97:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:101:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:102:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:102:1: ( ( rule__Statement__Alternatives ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:103:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:104:1: ( rule__Statement__Alternatives )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:104:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement155);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariable"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:116:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:117:1: ( ruleVariable EOF )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:118:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable182);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:125:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:129:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:130:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:130:1: ( ( rule__Variable__Group__0 ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:131:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:132:1: ( rule__Variable__Group__0 )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:132:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable215);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAssignment"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:144:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:145:1: ( ruleAssignment EOF )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:146:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment242);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:153:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:157:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:158:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:158:1: ( ( rule__Assignment__Group__0 ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:159:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:160:1: ( rule__Assignment__Group__0 )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:160:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment275);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:172:1: rule__Statement__Alternatives : ( ( ruleVariable ) | ( ruleAssignment ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:176:1: ( ( ruleVariable ) | ( ruleAssignment ) )
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
                    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:177:1: ( ruleVariable )
                    {
                    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:177:1: ( ruleVariable )
                    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:178:1: ruleVariable
                    {
                     before(grammarAccess.getStatementAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__Statement__Alternatives311);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:183:6: ( ruleAssignment )
                    {
                    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:183:6: ( ruleAssignment )
                    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:184:1: ruleAssignment
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Statement__Alternatives328);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Variable__Group__0"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:196:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:200:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:201:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__0358);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__0361);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:208:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:212:1: ( ( 'var' ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:213:1: ( 'var' )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:213:1: ( 'var' )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:214:1: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Variable__Group__0__Impl389); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:227:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:231:1: ( rule__Variable__Group__1__Impl )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:232:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__1420);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:238:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:242:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:243:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:243:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:244:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:245:1: ( rule__Variable__NameAssignment_1 )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:245:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl447);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:259:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:263:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:264:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__0481);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__0484);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:271:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__LhsAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:275:1: ( ( ( rule__Assignment__LhsAssignment_0 ) ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:276:1: ( ( rule__Assignment__LhsAssignment_0 ) )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:276:1: ( ( rule__Assignment__LhsAssignment_0 ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:277:1: ( rule__Assignment__LhsAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLhsAssignment_0()); 
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:278:1: ( rule__Assignment__LhsAssignment_0 )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:278:2: rule__Assignment__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__LhsAssignment_0_in_rule__Assignment__Group__0__Impl511);
            rule__Assignment__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:288:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:292:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:293:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__1541);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__1544);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:300:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:304:1: ( ( '=' ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:305:1: ( '=' )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:305:1: ( '=' )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:306:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Assignment__Group__1__Impl572); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:319:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:323:1: ( rule__Assignment__Group__2__Impl )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:324:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__2603);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:330:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__RhsAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:334:1: ( ( ( rule__Assignment__RhsAssignment_2 ) ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:335:1: ( ( rule__Assignment__RhsAssignment_2 ) )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:335:1: ( ( rule__Assignment__RhsAssignment_2 ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:336:1: ( rule__Assignment__RhsAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getRhsAssignment_2()); 
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:337:1: ( rule__Assignment__RhsAssignment_2 )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:337:2: rule__Assignment__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__RhsAssignment_2_in_rule__Assignment__Group__2__Impl630);
            rule__Assignment__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Program__StatementsAssignment"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:354:1: rule__Program__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:358:1: ( ( ruleStatement ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:359:1: ( ruleStatement )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:359:1: ( ruleStatement )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:360:1: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Program__StatementsAssignment671);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementsAssignment"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:369:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:373:1: ( ( RULE_ID ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:374:1: ( RULE_ID )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:374:1: ( RULE_ID )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:375:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_1702); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Assignment__LhsAssignment_0"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:384:1: rule__Assignment__LhsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:388:1: ( ( ( RULE_ID ) ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:389:1: ( ( RULE_ID ) )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:389:1: ( ( RULE_ID ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:390:1: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getLhsVariableCrossReference_0_0()); 
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:391:1: ( RULE_ID )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:392:1: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getLhsVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__LhsAssignment_0737); 
             after(grammarAccess.getAssignmentAccess().getLhsVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getLhsVariableCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__LhsAssignment_0"


    // $ANTLR start "rule__Assignment__RhsAssignment_2"
    // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:403:1: rule__Assignment__RhsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:407:1: ( ( ( RULE_ID ) ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:408:1: ( ( RULE_ID ) )
            {
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:408:1: ( ( RULE_ID ) )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:409:1: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getRhsVariableCrossReference_2_0()); 
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:410:1: ( RULE_ID )
            // ../xtext.scoping.adventures.xscope1.ui/src-gen/xtext/scoping/adventures/ui/contentassist/antlr/internal/InternalXscope1.g:411:1: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getRhsVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__RhsAssignment_2776); 
             after(grammarAccess.getAssignmentAccess().getRhsVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getRhsVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__RhsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__StatementsAssignment_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Statement__Alternatives311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Statement__Alternatives328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__0358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__0361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Variable__Group__0__Impl389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__0481 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__0484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__LhsAssignment_0_in_rule__Assignment__Group__0__Impl511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__1541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Assignment__Group__1__Impl572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__RhsAssignment_2_in_rule__Assignment__Group__2__Impl630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Program__StatementsAssignment671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__LhsAssignment_0737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__RhsAssignment_2776 = new BitSet(new long[]{0x0000000000000002L});

}