package de.cooperateproject.modeling.textual.activity.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.cooperateproject.modeling.textual.activity.services.ActGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-actd'", "'@end-actd'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalActParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAct.g"; }


    	private ActGrammarAccess grammarAccess;

    	public void setGrammarAccess(ActGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleActivityDiagram"
    // InternalAct.g:53:1: entryRuleActivityDiagram : ruleActivityDiagram EOF ;
    public final void entryRuleActivityDiagram() throws RecognitionException {
        try {
            // InternalAct.g:54:1: ( ruleActivityDiagram EOF )
            // InternalAct.g:55:1: ruleActivityDiagram EOF
            {
             before(grammarAccess.getActivityDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityDiagram();

            state._fsp--;

             after(grammarAccess.getActivityDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivityDiagram"


    // $ANTLR start "ruleActivityDiagram"
    // InternalAct.g:62:1: ruleActivityDiagram : ( ( rule__ActivityDiagram__Group__0 ) ) ;
    public final void ruleActivityDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:66:2: ( ( ( rule__ActivityDiagram__Group__0 ) ) )
            // InternalAct.g:67:2: ( ( rule__ActivityDiagram__Group__0 ) )
            {
            // InternalAct.g:67:2: ( ( rule__ActivityDiagram__Group__0 ) )
            // InternalAct.g:68:3: ( rule__ActivityDiagram__Group__0 )
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup()); 
            // InternalAct.g:69:3: ( rule__ActivityDiagram__Group__0 )
            // InternalAct.g:69:4: rule__ActivityDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getGroup()); 

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
    // $ANTLR end "ruleActivityDiagram"


    // $ANTLR start "rule__ActivityDiagram__Group__0"
    // InternalAct.g:77:1: rule__ActivityDiagram__Group__0 : rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 ;
    public final void rule__ActivityDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:81:1: ( rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 )
            // InternalAct.g:82:2: rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ActivityDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__1();

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
    // $ANTLR end "rule__ActivityDiagram__Group__0"


    // $ANTLR start "rule__ActivityDiagram__Group__0__Impl"
    // InternalAct.g:89:1: rule__ActivityDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ActivityDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:93:1: ( ( () ) )
            // InternalAct.g:94:1: ( () )
            {
            // InternalAct.g:94:1: ( () )
            // InternalAct.g:95:2: ()
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); 
            // InternalAct.g:96:2: ()
            // InternalAct.g:96:3: 
            {
            }

             after(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__1"
    // InternalAct.g:104:1: rule__ActivityDiagram__Group__1 : rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 ;
    public final void rule__ActivityDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:108:1: ( rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 )
            // InternalAct.g:109:2: rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ActivityDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__2();

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
    // $ANTLR end "rule__ActivityDiagram__Group__1"


    // $ANTLR start "rule__ActivityDiagram__Group__1__Impl"
    // InternalAct.g:116:1: rule__ActivityDiagram__Group__1__Impl : ( '@start-actd' ) ;
    public final void rule__ActivityDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:120:1: ( ( '@start-actd' ) )
            // InternalAct.g:121:1: ( '@start-actd' )
            {
            // InternalAct.g:121:1: ( '@start-actd' )
            // InternalAct.g:122:2: '@start-actd'
            {
             before(grammarAccess.getActivityDiagramAccess().getStartActdKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getStartActdKeyword_1()); 

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
    // $ANTLR end "rule__ActivityDiagram__Group__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__2"
    // InternalAct.g:131:1: rule__ActivityDiagram__Group__2 : rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 ;
    public final void rule__ActivityDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:135:1: ( rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 )
            // InternalAct.g:136:2: rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ActivityDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__3();

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
    // $ANTLR end "rule__ActivityDiagram__Group__2"


    // $ANTLR start "rule__ActivityDiagram__Group__2__Impl"
    // InternalAct.g:143:1: rule__ActivityDiagram__Group__2__Impl : ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ActivityDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:147:1: ( ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) )
            // InternalAct.g:148:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            {
            // InternalAct.g:148:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            // InternalAct.g:149:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2()); 
            // InternalAct.g:150:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            // InternalAct.g:150:3: rule__ActivityDiagram__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2()); 

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
    // $ANTLR end "rule__ActivityDiagram__Group__2__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__3"
    // InternalAct.g:158:1: rule__ActivityDiagram__Group__3 : rule__ActivityDiagram__Group__3__Impl ;
    public final void rule__ActivityDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:162:1: ( rule__ActivityDiagram__Group__3__Impl )
            // InternalAct.g:163:2: rule__ActivityDiagram__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__3__Impl();

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
    // $ANTLR end "rule__ActivityDiagram__Group__3"


    // $ANTLR start "rule__ActivityDiagram__Group__3__Impl"
    // InternalAct.g:169:1: rule__ActivityDiagram__Group__3__Impl : ( '@end-actd' ) ;
    public final void rule__ActivityDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:173:1: ( ( '@end-actd' ) )
            // InternalAct.g:174:1: ( '@end-actd' )
            {
            // InternalAct.g:174:1: ( '@end-actd' )
            // InternalAct.g:175:2: '@end-actd'
            {
             before(grammarAccess.getActivityDiagramAccess().getEndActdKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getEndActdKeyword_3()); 

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
    // $ANTLR end "rule__ActivityDiagram__Group__3__Impl"


    // $ANTLR start "rule__ActivityDiagram__TitleAssignment_2"
    // InternalAct.g:185:1: rule__ActivityDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:189:1: ( ( RULE_STRING ) )
            // InternalAct.g:190:2: ( RULE_STRING )
            {
            // InternalAct.g:190:2: ( RULE_STRING )
            // InternalAct.g:191:3: RULE_STRING
            {
             before(grammarAccess.getActivityDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ActivityDiagram__TitleAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});

}