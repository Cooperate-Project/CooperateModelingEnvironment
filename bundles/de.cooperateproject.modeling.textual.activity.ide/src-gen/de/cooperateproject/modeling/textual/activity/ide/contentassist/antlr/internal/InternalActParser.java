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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ini'", "'fin'", "'ffin'", "'@start-actd'", "'@end-actd'", "'activityName'", "'rootPackage'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
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


    // $ANTLR start "entryRuleNode"
    // InternalAct.g:103:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalAct.g:104:1: ( ruleNode EOF )
            // InternalAct.g:105:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalAct.g:112:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:116:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalAct.g:117:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalAct.g:117:2: ( ( rule__Node__Group__0 ) )
            // InternalAct.g:118:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalAct.g:119:3: ( rule__Node__Group__0 )
            // InternalAct.g:119:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleFQN"
    // InternalAct.g:128:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalAct.g:129:1: ( ruleFQN EOF )
            // InternalAct.g:130:1: ruleFQN EOF
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
    // InternalAct.g:137:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:141:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalAct.g:142:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalAct.g:142:2: ( ( rule__FQN__Group__0 ) )
            // InternalAct.g:143:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalAct.g:144:3: ( rule__FQN__Group__0 )
            // InternalAct.g:144:4: rule__FQN__Group__0
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


    // $ANTLR start "ruleNodeType"
    // InternalAct.g:153:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:157:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // InternalAct.g:158:2: ( ( rule__NodeType__Alternatives ) )
            {
            // InternalAct.g:158:2: ( ( rule__NodeType__Alternatives ) )
            // InternalAct.g:159:3: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // InternalAct.g:160:3: ( rule__NodeType__Alternatives )
            // InternalAct.g:160:4: rule__NodeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "rule__NodeType__Alternatives"
    // InternalAct.g:168:1: rule__NodeType__Alternatives : ( ( ( 'ini' ) ) | ( ( 'fin' ) ) | ( ( 'ffin' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:172:1: ( ( ( 'ini' ) ) | ( ( 'fin' ) ) | ( ( 'ffin' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAct.g:173:2: ( ( 'ini' ) )
                    {
                    // InternalAct.g:173:2: ( ( 'ini' ) )
                    // InternalAct.g:174:3: ( 'ini' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getINITIALEnumLiteralDeclaration_0()); 
                    // InternalAct.g:175:3: ( 'ini' )
                    // InternalAct.g:175:4: 'ini'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getINITIALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAct.g:179:2: ( ( 'fin' ) )
                    {
                    // InternalAct.g:179:2: ( ( 'fin' ) )
                    // InternalAct.g:180:3: ( 'fin' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getFINALEnumLiteralDeclaration_1()); 
                    // InternalAct.g:181:3: ( 'fin' )
                    // InternalAct.g:181:4: 'fin'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getFINALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAct.g:185:2: ( ( 'ffin' ) )
                    {
                    // InternalAct.g:185:2: ( ( 'ffin' ) )
                    // InternalAct.g:186:3: ( 'ffin' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getFLOW_FINALEnumLiteralDeclaration_2()); 
                    // InternalAct.g:187:3: ( 'ffin' )
                    // InternalAct.g:187:4: 'ffin'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getFLOW_FINALEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__NodeType__Alternatives"


    // $ANTLR start "rule__ActivityDiagram__Group__0"
    // InternalAct.g:195:1: rule__ActivityDiagram__Group__0 : rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 ;
    public final void rule__ActivityDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:199:1: ( rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 )
            // InternalAct.g:200:2: rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1
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
    // InternalAct.g:207:1: rule__ActivityDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ActivityDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:211:1: ( ( () ) )
            // InternalAct.g:212:1: ( () )
            {
            // InternalAct.g:212:1: ( () )
            // InternalAct.g:213:2: ()
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); 
            // InternalAct.g:214:2: ()
            // InternalAct.g:214:3: 
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
    // InternalAct.g:222:1: rule__ActivityDiagram__Group__1 : rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 ;
    public final void rule__ActivityDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:226:1: ( rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 )
            // InternalAct.g:227:2: rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2
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
    // InternalAct.g:234:1: rule__ActivityDiagram__Group__1__Impl : ( '@start-actd' ) ;
    public final void rule__ActivityDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:238:1: ( ( '@start-actd' ) )
            // InternalAct.g:239:1: ( '@start-actd' )
            {
            // InternalAct.g:239:1: ( '@start-actd' )
            // InternalAct.g:240:2: '@start-actd'
            {
             before(grammarAccess.getActivityDiagramAccess().getStartActdKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalAct.g:249:1: rule__ActivityDiagram__Group__2 : rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 ;
    public final void rule__ActivityDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:253:1: ( rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 )
            // InternalAct.g:254:2: rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3
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
    // InternalAct.g:261:1: rule__ActivityDiagram__Group__2__Impl : ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ActivityDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:265:1: ( ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) )
            // InternalAct.g:266:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            {
            // InternalAct.g:266:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            // InternalAct.g:267:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2()); 
            // InternalAct.g:268:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            // InternalAct.g:268:3: rule__ActivityDiagram__TitleAssignment_2
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
    // InternalAct.g:276:1: rule__ActivityDiagram__Group__3 : rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 ;
    public final void rule__ActivityDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:280:1: ( rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 )
            // InternalAct.g:281:2: rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4
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
    // InternalAct.g:288:1: rule__ActivityDiagram__Group__3__Impl : ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__ActivityDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:292:1: ( ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) ) )
            // InternalAct.g:293:1: ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) )
            {
            // InternalAct.g:293:1: ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) )
            // InternalAct.g:294:2: ( rule__ActivityDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getActivityDiagramAccess().getRootPackageAssignment_3()); 
            // InternalAct.g:295:2: ( rule__ActivityDiagram__RootPackageAssignment_3 )
            // InternalAct.g:295:3: rule__ActivityDiagram__RootPackageAssignment_3
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
    // InternalAct.g:303:1: rule__ActivityDiagram__Group__4 : rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 ;
    public final void rule__ActivityDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:307:1: ( rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 )
            // InternalAct.g:308:2: rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5
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
    // InternalAct.g:315:1: rule__ActivityDiagram__Group__4__Impl : ( ( rule__ActivityDiagram__Group_4__0 )? ) ;
    public final void rule__ActivityDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:319:1: ( ( ( rule__ActivityDiagram__Group_4__0 )? ) )
            // InternalAct.g:320:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            {
            // InternalAct.g:320:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            // InternalAct.g:321:2: ( rule__ActivityDiagram__Group_4__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_4()); 
            // InternalAct.g:322:2: ( rule__ActivityDiagram__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAct.g:322:3: rule__ActivityDiagram__Group_4__0
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
    // InternalAct.g:330:1: rule__ActivityDiagram__Group__5 : rule__ActivityDiagram__Group__5__Impl ;
    public final void rule__ActivityDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:334:1: ( rule__ActivityDiagram__Group__5__Impl )
            // InternalAct.g:335:2: rule__ActivityDiagram__Group__5__Impl
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
    // InternalAct.g:341:1: rule__ActivityDiagram__Group__5__Impl : ( '@end-actd' ) ;
    public final void rule__ActivityDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:345:1: ( ( '@end-actd' ) )
            // InternalAct.g:346:1: ( '@end-actd' )
            {
            // InternalAct.g:346:1: ( '@end-actd' )
            // InternalAct.g:347:2: '@end-actd'
            {
             before(grammarAccess.getActivityDiagramAccess().getEndActdKeyword_5()); 
            match(input,15,FOLLOW_2); 
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
    // InternalAct.g:357:1: rule__ActivityDiagram__Group_4__0 : rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 ;
    public final void rule__ActivityDiagram__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:361:1: ( rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 )
            // InternalAct.g:362:2: rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1
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
    // InternalAct.g:369:1: rule__ActivityDiagram__Group_4__0__Impl : ( 'activityName' ) ;
    public final void rule__ActivityDiagram__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:373:1: ( ( 'activityName' ) )
            // InternalAct.g:374:1: ( 'activityName' )
            {
            // InternalAct.g:374:1: ( 'activityName' )
            // InternalAct.g:375:2: 'activityName'
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNameKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalAct.g:384:1: rule__ActivityDiagram__Group_4__1 : rule__ActivityDiagram__Group_4__1__Impl ;
    public final void rule__ActivityDiagram__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:388:1: ( rule__ActivityDiagram__Group_4__1__Impl )
            // InternalAct.g:389:2: rule__ActivityDiagram__Group_4__1__Impl
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
    // InternalAct.g:395:1: rule__ActivityDiagram__Group_4__1__Impl : ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) ) ;
    public final void rule__ActivityDiagram__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:399:1: ( ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) ) )
            // InternalAct.g:400:1: ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) )
            {
            // InternalAct.g:400:1: ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) )
            // InternalAct.g:401:2: ( rule__ActivityDiagram__ActivityNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNameAssignment_4_1()); 
            // InternalAct.g:402:2: ( rule__ActivityDiagram__ActivityNameAssignment_4_1 )
            // InternalAct.g:402:3: rule__ActivityDiagram__ActivityNameAssignment_4_1
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
    // InternalAct.g:411:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:415:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalAct.g:416:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
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
    // InternalAct.g:423:1: rule__RootPackage__Group__0__Impl : ( () ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:427:1: ( ( () ) )
            // InternalAct.g:428:1: ( () )
            {
            // InternalAct.g:428:1: ( () )
            // InternalAct.g:429:2: ()
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageAction_0()); 
            // InternalAct.g:430:2: ()
            // InternalAct.g:430:3: 
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
    // InternalAct.g:438:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:442:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalAct.g:443:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RootPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__2();

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
    // InternalAct.g:450:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__Group_1__0 )? ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:454:1: ( ( ( rule__RootPackage__Group_1__0 )? ) )
            // InternalAct.g:455:1: ( ( rule__RootPackage__Group_1__0 )? )
            {
            // InternalAct.g:455:1: ( ( rule__RootPackage__Group_1__0 )? )
            // InternalAct.g:456:2: ( rule__RootPackage__Group_1__0 )?
            {
             before(grammarAccess.getRootPackageAccess().getGroup_1()); 
            // InternalAct.g:457:2: ( rule__RootPackage__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAct.g:457:3: rule__RootPackage__Group_1__0
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


    // $ANTLR start "rule__RootPackage__Group__2"
    // InternalAct.g:465:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:469:1: ( rule__RootPackage__Group__2__Impl )
            // InternalAct.g:470:2: rule__RootPackage__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__2__Impl();

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
    // $ANTLR end "rule__RootPackage__Group__2"


    // $ANTLR start "rule__RootPackage__Group__2__Impl"
    // InternalAct.g:476:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__NodesAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:480:1: ( ( ( rule__RootPackage__NodesAssignment_2 )* ) )
            // InternalAct.g:481:1: ( ( rule__RootPackage__NodesAssignment_2 )* )
            {
            // InternalAct.g:481:1: ( ( rule__RootPackage__NodesAssignment_2 )* )
            // InternalAct.g:482:2: ( rule__RootPackage__NodesAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getNodesAssignment_2()); 
            // InternalAct.g:483:2: ( rule__RootPackage__NodesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAct.g:483:3: rule__RootPackage__NodesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RootPackage__NodesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRootPackageAccess().getNodesAssignment_2()); 

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
    // $ANTLR end "rule__RootPackage__Group__2__Impl"


    // $ANTLR start "rule__RootPackage__Group_1__0"
    // InternalAct.g:492:1: rule__RootPackage__Group_1__0 : rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 ;
    public final void rule__RootPackage__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:496:1: ( rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 )
            // InternalAct.g:497:2: rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAct.g:504:1: rule__RootPackage__Group_1__0__Impl : ( 'rootPackage' ) ;
    public final void rule__RootPackage__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:508:1: ( ( 'rootPackage' ) )
            // InternalAct.g:509:1: ( 'rootPackage' )
            {
            // InternalAct.g:509:1: ( 'rootPackage' )
            // InternalAct.g:510:2: 'rootPackage'
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalAct.g:519:1: rule__RootPackage__Group_1__1 : rule__RootPackage__Group_1__1__Impl ;
    public final void rule__RootPackage__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:523:1: ( rule__RootPackage__Group_1__1__Impl )
            // InternalAct.g:524:2: rule__RootPackage__Group_1__1__Impl
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
    // InternalAct.g:530:1: rule__RootPackage__Group_1__1__Impl : ( ( rule__RootPackage__NameAssignment_1_1 ) ) ;
    public final void rule__RootPackage__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:534:1: ( ( ( rule__RootPackage__NameAssignment_1_1 ) ) )
            // InternalAct.g:535:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            {
            // InternalAct.g:535:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            // InternalAct.g:536:2: ( rule__RootPackage__NameAssignment_1_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1_1()); 
            // InternalAct.g:537:2: ( rule__RootPackage__NameAssignment_1_1 )
            // InternalAct.g:537:3: rule__RootPackage__NameAssignment_1_1
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


    // $ANTLR start "rule__Node__Group__0"
    // InternalAct.g:546:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:550:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalAct.g:551:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

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
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalAct.g:558:1: rule__Node__Group__0__Impl : ( ( rule__Node__TypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:562:1: ( ( ( rule__Node__TypeAssignment_0 ) ) )
            // InternalAct.g:563:1: ( ( rule__Node__TypeAssignment_0 ) )
            {
            // InternalAct.g:563:1: ( ( rule__Node__TypeAssignment_0 ) )
            // InternalAct.g:564:2: ( rule__Node__TypeAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_0()); 
            // InternalAct.g:565:2: ( rule__Node__TypeAssignment_0 )
            // InternalAct.g:565:3: rule__Node__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalAct.g:573:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:577:1: ( rule__Node__Group__1__Impl )
            // InternalAct.g:578:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__1__Impl();

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
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalAct.g:584:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:588:1: ( ( ( rule__Node__NameAssignment_1 )? ) )
            // InternalAct.g:589:1: ( ( rule__Node__NameAssignment_1 )? )
            {
            // InternalAct.g:589:1: ( ( rule__Node__NameAssignment_1 )? )
            // InternalAct.g:590:2: ( rule__Node__NameAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalAct.g:591:2: ( rule__Node__NameAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAct.g:591:3: rule__Node__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalAct.g:600:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:604:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalAct.g:605:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalAct.g:612:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:616:1: ( ( RULE_ID ) )
            // InternalAct.g:617:1: ( RULE_ID )
            {
            // InternalAct.g:617:1: ( RULE_ID )
            // InternalAct.g:618:2: RULE_ID
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
    // InternalAct.g:627:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:631:1: ( rule__FQN__Group__1__Impl )
            // InternalAct.g:632:2: rule__FQN__Group__1__Impl
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
    // InternalAct.g:638:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:642:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalAct.g:643:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalAct.g:643:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalAct.g:644:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalAct.g:645:2: ( rule__FQN__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAct.g:645:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalAct.g:654:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:658:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalAct.g:659:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAct.g:666:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:670:1: ( ( '.' ) )
            // InternalAct.g:671:1: ( '.' )
            {
            // InternalAct.g:671:1: ( '.' )
            // InternalAct.g:672:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAct.g:681:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:685:1: ( rule__FQN__Group_1__1__Impl )
            // InternalAct.g:686:2: rule__FQN__Group_1__1__Impl
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
    // InternalAct.g:692:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:696:1: ( ( RULE_ID ) )
            // InternalAct.g:697:1: ( RULE_ID )
            {
            // InternalAct.g:697:1: ( RULE_ID )
            // InternalAct.g:698:2: RULE_ID
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
    // InternalAct.g:708:1: rule__ActivityDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:712:1: ( ( RULE_STRING ) )
            // InternalAct.g:713:2: ( RULE_STRING )
            {
            // InternalAct.g:713:2: ( RULE_STRING )
            // InternalAct.g:714:3: RULE_STRING
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
    // InternalAct.g:723:1: rule__ActivityDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__ActivityDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:727:1: ( ( ruleRootPackage ) )
            // InternalAct.g:728:2: ( ruleRootPackage )
            {
            // InternalAct.g:728:2: ( ruleRootPackage )
            // InternalAct.g:729:3: ruleRootPackage
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
    // InternalAct.g:738:1: rule__ActivityDiagram__ActivityNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__ActivityNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:742:1: ( ( RULE_STRING ) )
            // InternalAct.g:743:2: ( RULE_STRING )
            {
            // InternalAct.g:743:2: ( RULE_STRING )
            // InternalAct.g:744:3: RULE_STRING
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
    // InternalAct.g:753:1: rule__RootPackage__NameAssignment_1_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:757:1: ( ( ruleFQN ) )
            // InternalAct.g:758:2: ( ruleFQN )
            {
            // InternalAct.g:758:2: ( ruleFQN )
            // InternalAct.g:759:3: ruleFQN
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


    // $ANTLR start "rule__RootPackage__NodesAssignment_2"
    // InternalAct.g:768:1: rule__RootPackage__NodesAssignment_2 : ( ruleNode ) ;
    public final void rule__RootPackage__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:772:1: ( ( ruleNode ) )
            // InternalAct.g:773:2: ( ruleNode )
            {
            // InternalAct.g:773:2: ( ruleNode )
            // InternalAct.g:774:3: ruleNode
            {
             before(grammarAccess.getRootPackageAccess().getNodesNodeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getNodesNodeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RootPackage__NodesAssignment_2"


    // $ANTLR start "rule__Node__TypeAssignment_0"
    // InternalAct.g:783:1: rule__Node__TypeAssignment_0 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:787:1: ( ( ruleNodeType ) )
            // InternalAct.g:788:2: ( ruleNodeType )
            {
            // InternalAct.g:788:2: ( ruleNodeType )
            // InternalAct.g:789:3: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeType();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Node__TypeAssignment_0"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalAct.g:798:1: rule__Node__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:802:1: ( ( RULE_STRING ) )
            // InternalAct.g:803:2: ( RULE_STRING )
            {
            // InternalAct.g:803:2: ( RULE_STRING )
            // InternalAct.g:804:3: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Node__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000023800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});

}