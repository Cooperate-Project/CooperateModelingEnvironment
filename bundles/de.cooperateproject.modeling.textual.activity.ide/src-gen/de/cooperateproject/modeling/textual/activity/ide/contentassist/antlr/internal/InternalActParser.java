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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-actd'", "'@end-actd'", "'activityName'", "'rootPackage'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


    // $ANTLR start "entryRuleRootPackage"
    // InternalAct.g:78:1: entryRuleRootPackage : ruleRootPackage EOF ;
    public final void entryRuleRootPackage() throws RecognitionException {
        try {
            // InternalAct.g:79:1: ( ruleRootPackage EOF )
            // InternalAct.g:80:1: ruleRootPackage EOF
            {
             before(grammarAccess.getRootPackageRule()); 
            pushFollow(FOLLOW_1);
            ruleRootPackage();

            state._fsp--;

             after(grammarAccess.getRootPackageRule()); 
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
    // $ANTLR end "entryRuleRootPackage"


    // $ANTLR start "ruleRootPackage"
    // InternalAct.g:87:1: ruleRootPackage : ( ( rule__RootPackage__Group__0 ) ) ;
    public final void ruleRootPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:91:2: ( ( ( rule__RootPackage__Group__0 ) ) )
            // InternalAct.g:92:2: ( ( rule__RootPackage__Group__0 ) )
            {
            // InternalAct.g:92:2: ( ( rule__RootPackage__Group__0 ) )
            // InternalAct.g:93:3: ( rule__RootPackage__Group__0 )
            {
             before(grammarAccess.getRootPackageAccess().getGroup()); 
            // InternalAct.g:94:3: ( rule__RootPackage__Group__0 )
            // InternalAct.g:94:4: rule__RootPackage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootPackageAccess().getGroup()); 

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
    // $ANTLR end "ruleRootPackage"


    // $ANTLR start "entryRuleFQN"
    // InternalAct.g:103:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalAct.g:104:1: ( ruleFQN EOF )
            // InternalAct.g:105:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalAct.g:112:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:116:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalAct.g:117:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalAct.g:117:2: ( ( rule__FQN__Group__0 ) )
            // InternalAct.g:118:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalAct.g:119:3: ( rule__FQN__Group__0 )
            // InternalAct.g:119:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rule__ActivityDiagram__Group__0"
    // InternalAct.g:127:1: rule__ActivityDiagram__Group__0 : rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 ;
    public final void rule__ActivityDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:131:1: ( rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 )
            // InternalAct.g:132:2: rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1
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
    // InternalAct.g:139:1: rule__ActivityDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ActivityDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:143:1: ( ( () ) )
            // InternalAct.g:144:1: ( () )
            {
            // InternalAct.g:144:1: ( () )
            // InternalAct.g:145:2: ()
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); 
            // InternalAct.g:146:2: ()
            // InternalAct.g:146:3: 
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
    // InternalAct.g:154:1: rule__ActivityDiagram__Group__1 : rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 ;
    public final void rule__ActivityDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:158:1: ( rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 )
            // InternalAct.g:159:2: rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2
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
    // InternalAct.g:166:1: rule__ActivityDiagram__Group__1__Impl : ( '@start-actd' ) ;
    public final void rule__ActivityDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:170:1: ( ( '@start-actd' ) )
            // InternalAct.g:171:1: ( '@start-actd' )
            {
            // InternalAct.g:171:1: ( '@start-actd' )
            // InternalAct.g:172:2: '@start-actd'
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
    // InternalAct.g:181:1: rule__ActivityDiagram__Group__2 : rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 ;
    public final void rule__ActivityDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:185:1: ( rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 )
            // InternalAct.g:186:2: rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3
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
    // InternalAct.g:193:1: rule__ActivityDiagram__Group__2__Impl : ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ActivityDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:197:1: ( ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) )
            // InternalAct.g:198:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            {
            // InternalAct.g:198:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            // InternalAct.g:199:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2()); 
            // InternalAct.g:200:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            // InternalAct.g:200:3: rule__ActivityDiagram__TitleAssignment_2
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
    // InternalAct.g:208:1: rule__ActivityDiagram__Group__3 : rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 ;
    public final void rule__ActivityDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:212:1: ( rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 )
            // InternalAct.g:213:2: rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ActivityDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__4();

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
    // InternalAct.g:220:1: rule__ActivityDiagram__Group__3__Impl : ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__ActivityDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:224:1: ( ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) ) )
            // InternalAct.g:225:1: ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) )
            {
            // InternalAct.g:225:1: ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) )
            // InternalAct.g:226:2: ( rule__ActivityDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getActivityDiagramAccess().getRootPackageAssignment_3()); 
            // InternalAct.g:227:2: ( rule__ActivityDiagram__RootPackageAssignment_3 )
            // InternalAct.g:227:3: rule__ActivityDiagram__RootPackageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__RootPackageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getRootPackageAssignment_3()); 

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


    // $ANTLR start "rule__ActivityDiagram__Group__4"
    // InternalAct.g:235:1: rule__ActivityDiagram__Group__4 : rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 ;
    public final void rule__ActivityDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:239:1: ( rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 )
            // InternalAct.g:240:2: rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ActivityDiagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__5();

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
    // $ANTLR end "rule__ActivityDiagram__Group__4"


    // $ANTLR start "rule__ActivityDiagram__Group__4__Impl"
    // InternalAct.g:247:1: rule__ActivityDiagram__Group__4__Impl : ( ( rule__ActivityDiagram__Group_4__0 )? ) ;
    public final void rule__ActivityDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:251:1: ( ( ( rule__ActivityDiagram__Group_4__0 )? ) )
            // InternalAct.g:252:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            {
            // InternalAct.g:252:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            // InternalAct.g:253:2: ( rule__ActivityDiagram__Group_4__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_4()); 
            // InternalAct.g:254:2: ( rule__ActivityDiagram__Group_4__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAct.g:254:3: rule__ActivityDiagram__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityDiagramAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ActivityDiagram__Group__4__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__5"
    // InternalAct.g:262:1: rule__ActivityDiagram__Group__5 : rule__ActivityDiagram__Group__5__Impl ;
    public final void rule__ActivityDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:266:1: ( rule__ActivityDiagram__Group__5__Impl )
            // InternalAct.g:267:2: rule__ActivityDiagram__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__5__Impl();

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
    // $ANTLR end "rule__ActivityDiagram__Group__5"


    // $ANTLR start "rule__ActivityDiagram__Group__5__Impl"
    // InternalAct.g:273:1: rule__ActivityDiagram__Group__5__Impl : ( '@end-actd' ) ;
    public final void rule__ActivityDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:277:1: ( ( '@end-actd' ) )
            // InternalAct.g:278:1: ( '@end-actd' )
            {
            // InternalAct.g:278:1: ( '@end-actd' )
            // InternalAct.g:279:2: '@end-actd'
            {
             before(grammarAccess.getActivityDiagramAccess().getEndActdKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getEndActdKeyword_5()); 

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
    // $ANTLR end "rule__ActivityDiagram__Group__5__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_4__0"
    // InternalAct.g:289:1: rule__ActivityDiagram__Group_4__0 : rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 ;
    public final void rule__ActivityDiagram__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:293:1: ( rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 )
            // InternalAct.g:294:2: rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ActivityDiagram__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_4__1();

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
    // $ANTLR end "rule__ActivityDiagram__Group_4__0"


    // $ANTLR start "rule__ActivityDiagram__Group_4__0__Impl"
    // InternalAct.g:301:1: rule__ActivityDiagram__Group_4__0__Impl : ( 'activityName' ) ;
    public final void rule__ActivityDiagram__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:305:1: ( ( 'activityName' ) )
            // InternalAct.g:306:1: ( 'activityName' )
            {
            // InternalAct.g:306:1: ( 'activityName' )
            // InternalAct.g:307:2: 'activityName'
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNameKeyword_4_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getActivityNameKeyword_4_0()); 

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
    // $ANTLR end "rule__ActivityDiagram__Group_4__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_4__1"
    // InternalAct.g:316:1: rule__ActivityDiagram__Group_4__1 : rule__ActivityDiagram__Group_4__1__Impl ;
    public final void rule__ActivityDiagram__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:320:1: ( rule__ActivityDiagram__Group_4__1__Impl )
            // InternalAct.g:321:2: rule__ActivityDiagram__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_4__1__Impl();

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
    // $ANTLR end "rule__ActivityDiagram__Group_4__1"


    // $ANTLR start "rule__ActivityDiagram__Group_4__1__Impl"
    // InternalAct.g:327:1: rule__ActivityDiagram__Group_4__1__Impl : ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) ) ;
    public final void rule__ActivityDiagram__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:331:1: ( ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) ) )
            // InternalAct.g:332:1: ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) )
            {
            // InternalAct.g:332:1: ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) )
            // InternalAct.g:333:2: ( rule__ActivityDiagram__ActivityNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNameAssignment_4_1()); 
            // InternalAct.g:334:2: ( rule__ActivityDiagram__ActivityNameAssignment_4_1 )
            // InternalAct.g:334:3: rule__ActivityDiagram__ActivityNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__ActivityNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getActivityNameAssignment_4_1()); 

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
    // $ANTLR end "rule__ActivityDiagram__Group_4__1__Impl"


    // $ANTLR start "rule__RootPackage__Group__0"
    // InternalAct.g:343:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:347:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalAct.g:348:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RootPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__1();

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
    // $ANTLR end "rule__RootPackage__Group__0"


    // $ANTLR start "rule__RootPackage__Group__0__Impl"
    // InternalAct.g:355:1: rule__RootPackage__Group__0__Impl : ( () ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:359:1: ( ( () ) )
            // InternalAct.g:360:1: ( () )
            {
            // InternalAct.g:360:1: ( () )
            // InternalAct.g:361:2: ()
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageAction_0()); 
            // InternalAct.g:362:2: ()
            // InternalAct.g:362:3: 
            {
            }

             after(grammarAccess.getRootPackageAccess().getRootPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__0__Impl"


    // $ANTLR start "rule__RootPackage__Group__1"
    // InternalAct.g:370:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:374:1: ( rule__RootPackage__Group__1__Impl )
            // InternalAct.g:375:2: rule__RootPackage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__1__Impl();

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
    // $ANTLR end "rule__RootPackage__Group__1"


    // $ANTLR start "rule__RootPackage__Group__1__Impl"
    // InternalAct.g:381:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__Group_1__0 )? ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:385:1: ( ( ( rule__RootPackage__Group_1__0 )? ) )
            // InternalAct.g:386:1: ( ( rule__RootPackage__Group_1__0 )? )
            {
            // InternalAct.g:386:1: ( ( rule__RootPackage__Group_1__0 )? )
            // InternalAct.g:387:2: ( rule__RootPackage__Group_1__0 )?
            {
             before(grammarAccess.getRootPackageAccess().getGroup_1()); 
            // InternalAct.g:388:2: ( rule__RootPackage__Group_1__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAct.g:388:3: rule__RootPackage__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RootPackage__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootPackageAccess().getGroup_1()); 

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
    // $ANTLR end "rule__RootPackage__Group__1__Impl"


    // $ANTLR start "rule__RootPackage__Group_1__0"
    // InternalAct.g:397:1: rule__RootPackage__Group_1__0 : rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 ;
    public final void rule__RootPackage__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:401:1: ( rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 )
            // InternalAct.g:402:2: rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__RootPackage__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group_1__1();

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
    // $ANTLR end "rule__RootPackage__Group_1__0"


    // $ANTLR start "rule__RootPackage__Group_1__0__Impl"
    // InternalAct.g:409:1: rule__RootPackage__Group_1__0__Impl : ( 'rootPackage' ) ;
    public final void rule__RootPackage__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:413:1: ( ( 'rootPackage' ) )
            // InternalAct.g:414:1: ( 'rootPackage' )
            {
            // InternalAct.g:414:1: ( 'rootPackage' )
            // InternalAct.g:415:2: 'rootPackage'
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0()); 

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
    // $ANTLR end "rule__RootPackage__Group_1__0__Impl"


    // $ANTLR start "rule__RootPackage__Group_1__1"
    // InternalAct.g:424:1: rule__RootPackage__Group_1__1 : rule__RootPackage__Group_1__1__Impl ;
    public final void rule__RootPackage__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:428:1: ( rule__RootPackage__Group_1__1__Impl )
            // InternalAct.g:429:2: rule__RootPackage__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__Group_1__1__Impl();

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
    // $ANTLR end "rule__RootPackage__Group_1__1"


    // $ANTLR start "rule__RootPackage__Group_1__1__Impl"
    // InternalAct.g:435:1: rule__RootPackage__Group_1__1__Impl : ( ( rule__RootPackage__NameAssignment_1_1 ) ) ;
    public final void rule__RootPackage__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:439:1: ( ( ( rule__RootPackage__NameAssignment_1_1 ) ) )
            // InternalAct.g:440:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            {
            // InternalAct.g:440:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            // InternalAct.g:441:2: ( rule__RootPackage__NameAssignment_1_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1_1()); 
            // InternalAct.g:442:2: ( rule__RootPackage__NameAssignment_1_1 )
            // InternalAct.g:442:3: rule__RootPackage__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRootPackageAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end "rule__RootPackage__Group_1__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalAct.g:451:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:455:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalAct.g:456:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalAct.g:463:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:467:1: ( ( RULE_ID ) )
            // InternalAct.g:468:1: ( RULE_ID )
            {
            // InternalAct.g:468:1: ( RULE_ID )
            // InternalAct.g:469:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalAct.g:478:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:482:1: ( rule__FQN__Group__1__Impl )
            // InternalAct.g:483:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalAct.g:489:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:493:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalAct.g:494:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalAct.g:494:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalAct.g:495:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalAct.g:496:2: ( rule__FQN__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAct.g:496:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalAct.g:505:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:509:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalAct.g:510:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalAct.g:517:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:521:1: ( ( '.' ) )
            // InternalAct.g:522:1: ( '.' )
            {
            // InternalAct.g:522:1: ( '.' )
            // InternalAct.g:523:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalAct.g:532:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:536:1: ( rule__FQN__Group_1__1__Impl )
            // InternalAct.g:537:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalAct.g:543:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:547:1: ( ( RULE_ID ) )
            // InternalAct.g:548:1: ( RULE_ID )
            {
            // InternalAct.g:548:1: ( RULE_ID )
            // InternalAct.g:549:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__TitleAssignment_2"
    // InternalAct.g:559:1: rule__ActivityDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:563:1: ( ( RULE_STRING ) )
            // InternalAct.g:564:2: ( RULE_STRING )
            {
            // InternalAct.g:564:2: ( RULE_STRING )
            // InternalAct.g:565:3: RULE_STRING
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


    // $ANTLR start "rule__ActivityDiagram__RootPackageAssignment_3"
    // InternalAct.g:574:1: rule__ActivityDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__ActivityDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:578:1: ( ( ruleRootPackage ) )
            // InternalAct.g:579:2: ( ruleRootPackage )
            {
            // InternalAct.g:579:2: ( ruleRootPackage )
            // InternalAct.g:580:3: ruleRootPackage
            {
             before(grammarAccess.getActivityDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRootPackage();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ActivityDiagram__RootPackageAssignment_3"


    // $ANTLR start "rule__ActivityDiagram__ActivityNameAssignment_4_1"
    // InternalAct.g:589:1: rule__ActivityDiagram__ActivityNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__ActivityNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:593:1: ( ( RULE_STRING ) )
            // InternalAct.g:594:2: ( RULE_STRING )
            {
            // InternalAct.g:594:2: ( RULE_STRING )
            // InternalAct.g:595:3: RULE_STRING
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getActivityNameSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ActivityDiagram__ActivityNameAssignment_4_1"


    // $ANTLR start "rule__RootPackage__NameAssignment_1_1"
    // InternalAct.g:604:1: rule__RootPackage__NameAssignment_1_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:608:1: ( ( ruleFQN ) )
            // InternalAct.g:609:2: ( ruleFQN )
            {
            // InternalAct.g:609:2: ( ruleFQN )
            // InternalAct.g:610:3: ruleFQN
            {
             before(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__RootPackage__NameAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});

}