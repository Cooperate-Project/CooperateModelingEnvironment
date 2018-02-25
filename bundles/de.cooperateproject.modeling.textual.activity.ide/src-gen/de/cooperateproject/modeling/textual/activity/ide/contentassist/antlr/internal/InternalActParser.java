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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ini'", "'fin'", "'ffin'", "'decn'", "'mrgn'", "'@start-actd'", "'@end-actd'", "'activityName'", "'rootPackage'", "'actn'", "'as'", "'flw'", "'('", "','", "')'", "'['", "']'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalAct.g:112:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:116:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalAct.g:117:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalAct.g:117:2: ( ( rule__Node__Alternatives ) )
            // InternalAct.g:118:3: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // InternalAct.g:119:3: ( rule__Node__Alternatives )
            // InternalAct.g:119:4: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleActivityNode"
    // InternalAct.g:128:1: entryRuleActivityNode : ruleActivityNode EOF ;
    public final void entryRuleActivityNode() throws RecognitionException {
        try {
            // InternalAct.g:129:1: ( ruleActivityNode EOF )
            // InternalAct.g:130:1: ruleActivityNode EOF
            {
             before(grammarAccess.getActivityNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityNode();

            state._fsp--;

             after(grammarAccess.getActivityNodeRule()); 
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
    // $ANTLR end "entryRuleActivityNode"


    // $ANTLR start "ruleActivityNode"
    // InternalAct.g:137:1: ruleActivityNode : ( ( rule__ActivityNode__Group__0 ) ) ;
    public final void ruleActivityNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:141:2: ( ( ( rule__ActivityNode__Group__0 ) ) )
            // InternalAct.g:142:2: ( ( rule__ActivityNode__Group__0 ) )
            {
            // InternalAct.g:142:2: ( ( rule__ActivityNode__Group__0 ) )
            // InternalAct.g:143:3: ( rule__ActivityNode__Group__0 )
            {
             before(grammarAccess.getActivityNodeAccess().getGroup()); 
            // InternalAct.g:144:3: ( rule__ActivityNode__Group__0 )
            // InternalAct.g:144:4: rule__ActivityNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleActivityNode"


    // $ANTLR start "entryRuleControlNode"
    // InternalAct.g:153:1: entryRuleControlNode : ruleControlNode EOF ;
    public final void entryRuleControlNode() throws RecognitionException {
        try {
            // InternalAct.g:154:1: ( ruleControlNode EOF )
            // InternalAct.g:155:1: ruleControlNode EOF
            {
             before(grammarAccess.getControlNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleControlNode();

            state._fsp--;

             after(grammarAccess.getControlNodeRule()); 
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
    // $ANTLR end "entryRuleControlNode"


    // $ANTLR start "ruleControlNode"
    // InternalAct.g:162:1: ruleControlNode : ( ( rule__ControlNode__Group__0 ) ) ;
    public final void ruleControlNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:166:2: ( ( ( rule__ControlNode__Group__0 ) ) )
            // InternalAct.g:167:2: ( ( rule__ControlNode__Group__0 ) )
            {
            // InternalAct.g:167:2: ( ( rule__ControlNode__Group__0 ) )
            // InternalAct.g:168:3: ( rule__ControlNode__Group__0 )
            {
             before(grammarAccess.getControlNodeAccess().getGroup()); 
            // InternalAct.g:169:3: ( rule__ControlNode__Group__0 )
            // InternalAct.g:169:4: rule__ControlNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ControlNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControlNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleControlNode"


    // $ANTLR start "entryRuleFlow"
    // InternalAct.g:178:1: entryRuleFlow : ruleFlow EOF ;
    public final void entryRuleFlow() throws RecognitionException {
        try {
            // InternalAct.g:179:1: ( ruleFlow EOF )
            // InternalAct.g:180:1: ruleFlow EOF
            {
             before(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getFlowRule()); 
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
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // InternalAct.g:187:1: ruleFlow : ( ( rule__Flow__Group__0 ) ) ;
    public final void ruleFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:191:2: ( ( ( rule__Flow__Group__0 ) ) )
            // InternalAct.g:192:2: ( ( rule__Flow__Group__0 ) )
            {
            // InternalAct.g:192:2: ( ( rule__Flow__Group__0 ) )
            // InternalAct.g:193:3: ( rule__Flow__Group__0 )
            {
             before(grammarAccess.getFlowAccess().getGroup()); 
            // InternalAct.g:194:3: ( rule__Flow__Group__0 )
            // InternalAct.g:194:4: rule__Flow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Flow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getGroup()); 

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
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleFQN"
    // InternalAct.g:203:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalAct.g:204:1: ( ruleFQN EOF )
            // InternalAct.g:205:1: ruleFQN EOF
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
    // InternalAct.g:212:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:216:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalAct.g:217:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalAct.g:217:2: ( ( rule__FQN__Group__0 ) )
            // InternalAct.g:218:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalAct.g:219:3: ( rule__FQN__Group__0 )
            // InternalAct.g:219:4: rule__FQN__Group__0
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
    // InternalAct.g:228:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:232:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // InternalAct.g:233:2: ( ( rule__NodeType__Alternatives ) )
            {
            // InternalAct.g:233:2: ( ( rule__NodeType__Alternatives ) )
            // InternalAct.g:234:3: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // InternalAct.g:235:3: ( rule__NodeType__Alternatives )
            // InternalAct.g:235:4: rule__NodeType__Alternatives
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


    // $ANTLR start "rule__Node__Alternatives"
    // InternalAct.g:243:1: rule__Node__Alternatives : ( ( ruleActivityNode ) | ( ruleControlNode ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:247:1: ( ( ruleActivityNode ) | ( ruleControlNode ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=15)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAct.g:248:2: ( ruleActivityNode )
                    {
                    // InternalAct.g:248:2: ( ruleActivityNode )
                    // InternalAct.g:249:3: ruleActivityNode
                    {
                     before(grammarAccess.getNodeAccess().getActivityNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActivityNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getActivityNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAct.g:254:2: ( ruleControlNode )
                    {
                    // InternalAct.g:254:2: ( ruleControlNode )
                    // InternalAct.g:255:3: ruleControlNode
                    {
                     before(grammarAccess.getNodeAccess().getControlNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleControlNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getControlNodeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__ActivityNode__Alternatives_1"
    // InternalAct.g:264:1: rule__ActivityNode__Alternatives_1 : ( ( ( rule__ActivityNode__NameAssignment_1_0 ) ) | ( ( rule__ActivityNode__Group_1_1__0 ) ) );
    public final void rule__ActivityNode__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:268:1: ( ( ( rule__ActivityNode__NameAssignment_1_0 ) ) | ( ( rule__ActivityNode__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==21) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||(LA2_1>=11 && LA2_1<=15)||(LA2_1>=17 && LA2_1<=18)||LA2_1==20||LA2_1==22) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAct.g:269:2: ( ( rule__ActivityNode__NameAssignment_1_0 ) )
                    {
                    // InternalAct.g:269:2: ( ( rule__ActivityNode__NameAssignment_1_0 ) )
                    // InternalAct.g:270:3: ( rule__ActivityNode__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getActivityNodeAccess().getNameAssignment_1_0()); 
                    // InternalAct.g:271:3: ( rule__ActivityNode__NameAssignment_1_0 )
                    // InternalAct.g:271:4: rule__ActivityNode__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityNodeAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAct.g:275:2: ( ( rule__ActivityNode__Group_1_1__0 ) )
                    {
                    // InternalAct.g:275:2: ( ( rule__ActivityNode__Group_1_1__0 ) )
                    // InternalAct.g:276:3: ( rule__ActivityNode__Group_1_1__0 )
                    {
                     before(grammarAccess.getActivityNodeAccess().getGroup_1_1()); 
                    // InternalAct.g:277:3: ( rule__ActivityNode__Group_1_1__0 )
                    // InternalAct.g:277:4: rule__ActivityNode__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityNodeAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ActivityNode__Alternatives_1"


    // $ANTLR start "rule__NodeType__Alternatives"
    // InternalAct.g:285:1: rule__NodeType__Alternatives : ( ( ( 'ini' ) ) | ( ( 'fin' ) ) | ( ( 'ffin' ) ) | ( ( 'decn' ) ) | ( ( 'mrgn' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:289:1: ( ( ( 'ini' ) ) | ( ( 'fin' ) ) | ( ( 'ffin' ) ) | ( ( 'decn' ) ) | ( ( 'mrgn' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAct.g:290:2: ( ( 'ini' ) )
                    {
                    // InternalAct.g:290:2: ( ( 'ini' ) )
                    // InternalAct.g:291:3: ( 'ini' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getINITIALEnumLiteralDeclaration_0()); 
                    // InternalAct.g:292:3: ( 'ini' )
                    // InternalAct.g:292:4: 'ini'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getINITIALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAct.g:296:2: ( ( 'fin' ) )
                    {
                    // InternalAct.g:296:2: ( ( 'fin' ) )
                    // InternalAct.g:297:3: ( 'fin' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getFINALEnumLiteralDeclaration_1()); 
                    // InternalAct.g:298:3: ( 'fin' )
                    // InternalAct.g:298:4: 'fin'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getFINALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAct.g:302:2: ( ( 'ffin' ) )
                    {
                    // InternalAct.g:302:2: ( ( 'ffin' ) )
                    // InternalAct.g:303:3: ( 'ffin' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getFLOW_FINALEnumLiteralDeclaration_2()); 
                    // InternalAct.g:304:3: ( 'ffin' )
                    // InternalAct.g:304:4: 'ffin'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getFLOW_FINALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAct.g:308:2: ( ( 'decn' ) )
                    {
                    // InternalAct.g:308:2: ( ( 'decn' ) )
                    // InternalAct.g:309:3: ( 'decn' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDECISIONEnumLiteralDeclaration_3()); 
                    // InternalAct.g:310:3: ( 'decn' )
                    // InternalAct.g:310:4: 'decn'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDECISIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAct.g:314:2: ( ( 'mrgn' ) )
                    {
                    // InternalAct.g:314:2: ( ( 'mrgn' ) )
                    // InternalAct.g:315:3: ( 'mrgn' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMERGEEnumLiteralDeclaration_4()); 
                    // InternalAct.g:316:3: ( 'mrgn' )
                    // InternalAct.g:316:4: 'mrgn'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMERGEEnumLiteralDeclaration_4()); 

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
    // InternalAct.g:324:1: rule__ActivityDiagram__Group__0 : rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 ;
    public final void rule__ActivityDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:328:1: ( rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 )
            // InternalAct.g:329:2: rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1
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
    // InternalAct.g:336:1: rule__ActivityDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ActivityDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:340:1: ( ( () ) )
            // InternalAct.g:341:1: ( () )
            {
            // InternalAct.g:341:1: ( () )
            // InternalAct.g:342:2: ()
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); 
            // InternalAct.g:343:2: ()
            // InternalAct.g:343:3: 
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
    // InternalAct.g:351:1: rule__ActivityDiagram__Group__1 : rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 ;
    public final void rule__ActivityDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:355:1: ( rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 )
            // InternalAct.g:356:2: rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2
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
    // InternalAct.g:363:1: rule__ActivityDiagram__Group__1__Impl : ( '@start-actd' ) ;
    public final void rule__ActivityDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:367:1: ( ( '@start-actd' ) )
            // InternalAct.g:368:1: ( '@start-actd' )
            {
            // InternalAct.g:368:1: ( '@start-actd' )
            // InternalAct.g:369:2: '@start-actd'
            {
             before(grammarAccess.getActivityDiagramAccess().getStartActdKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalAct.g:378:1: rule__ActivityDiagram__Group__2 : rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 ;
    public final void rule__ActivityDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:382:1: ( rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 )
            // InternalAct.g:383:2: rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3
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
    // InternalAct.g:390:1: rule__ActivityDiagram__Group__2__Impl : ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ActivityDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:394:1: ( ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) )
            // InternalAct.g:395:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            {
            // InternalAct.g:395:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            // InternalAct.g:396:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2()); 
            // InternalAct.g:397:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            // InternalAct.g:397:3: rule__ActivityDiagram__TitleAssignment_2
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
    // InternalAct.g:405:1: rule__ActivityDiagram__Group__3 : rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 ;
    public final void rule__ActivityDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:409:1: ( rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 )
            // InternalAct.g:410:2: rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4
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
    // InternalAct.g:417:1: rule__ActivityDiagram__Group__3__Impl : ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__ActivityDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:421:1: ( ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) ) )
            // InternalAct.g:422:1: ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) )
            {
            // InternalAct.g:422:1: ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) )
            // InternalAct.g:423:2: ( rule__ActivityDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getActivityDiagramAccess().getRootPackageAssignment_3()); 
            // InternalAct.g:424:2: ( rule__ActivityDiagram__RootPackageAssignment_3 )
            // InternalAct.g:424:3: rule__ActivityDiagram__RootPackageAssignment_3
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
    // InternalAct.g:432:1: rule__ActivityDiagram__Group__4 : rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 ;
    public final void rule__ActivityDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:436:1: ( rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 )
            // InternalAct.g:437:2: rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5
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
    // InternalAct.g:444:1: rule__ActivityDiagram__Group__4__Impl : ( ( rule__ActivityDiagram__Group_4__0 )? ) ;
    public final void rule__ActivityDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:448:1: ( ( ( rule__ActivityDiagram__Group_4__0 )? ) )
            // InternalAct.g:449:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            {
            // InternalAct.g:449:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            // InternalAct.g:450:2: ( rule__ActivityDiagram__Group_4__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_4()); 
            // InternalAct.g:451:2: ( rule__ActivityDiagram__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAct.g:451:3: rule__ActivityDiagram__Group_4__0
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
    // InternalAct.g:459:1: rule__ActivityDiagram__Group__5 : rule__ActivityDiagram__Group__5__Impl ;
    public final void rule__ActivityDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:463:1: ( rule__ActivityDiagram__Group__5__Impl )
            // InternalAct.g:464:2: rule__ActivityDiagram__Group__5__Impl
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
    // InternalAct.g:470:1: rule__ActivityDiagram__Group__5__Impl : ( '@end-actd' ) ;
    public final void rule__ActivityDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:474:1: ( ( '@end-actd' ) )
            // InternalAct.g:475:1: ( '@end-actd' )
            {
            // InternalAct.g:475:1: ( '@end-actd' )
            // InternalAct.g:476:2: '@end-actd'
            {
             before(grammarAccess.getActivityDiagramAccess().getEndActdKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalAct.g:486:1: rule__ActivityDiagram__Group_4__0 : rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 ;
    public final void rule__ActivityDiagram__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:490:1: ( rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 )
            // InternalAct.g:491:2: rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1
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
    // InternalAct.g:498:1: rule__ActivityDiagram__Group_4__0__Impl : ( 'activityName' ) ;
    public final void rule__ActivityDiagram__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:502:1: ( ( 'activityName' ) )
            // InternalAct.g:503:1: ( 'activityName' )
            {
            // InternalAct.g:503:1: ( 'activityName' )
            // InternalAct.g:504:2: 'activityName'
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNameKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAct.g:513:1: rule__ActivityDiagram__Group_4__1 : rule__ActivityDiagram__Group_4__1__Impl ;
    public final void rule__ActivityDiagram__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:517:1: ( rule__ActivityDiagram__Group_4__1__Impl )
            // InternalAct.g:518:2: rule__ActivityDiagram__Group_4__1__Impl
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
    // InternalAct.g:524:1: rule__ActivityDiagram__Group_4__1__Impl : ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) ) ;
    public final void rule__ActivityDiagram__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:528:1: ( ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) ) )
            // InternalAct.g:529:1: ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) )
            {
            // InternalAct.g:529:1: ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) )
            // InternalAct.g:530:2: ( rule__ActivityDiagram__ActivityNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNameAssignment_4_1()); 
            // InternalAct.g:531:2: ( rule__ActivityDiagram__ActivityNameAssignment_4_1 )
            // InternalAct.g:531:3: rule__ActivityDiagram__ActivityNameAssignment_4_1
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
    // InternalAct.g:540:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:544:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalAct.g:545:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
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
    // InternalAct.g:552:1: rule__RootPackage__Group__0__Impl : ( () ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:556:1: ( ( () ) )
            // InternalAct.g:557:1: ( () )
            {
            // InternalAct.g:557:1: ( () )
            // InternalAct.g:558:2: ()
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageAction_0()); 
            // InternalAct.g:559:2: ()
            // InternalAct.g:559:3: 
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
    // InternalAct.g:567:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:571:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalAct.g:572:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
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
    // InternalAct.g:579:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__Group_1__0 )? ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:583:1: ( ( ( rule__RootPackage__Group_1__0 )? ) )
            // InternalAct.g:584:1: ( ( rule__RootPackage__Group_1__0 )? )
            {
            // InternalAct.g:584:1: ( ( rule__RootPackage__Group_1__0 )? )
            // InternalAct.g:585:2: ( rule__RootPackage__Group_1__0 )?
            {
             before(grammarAccess.getRootPackageAccess().getGroup_1()); 
            // InternalAct.g:586:2: ( rule__RootPackage__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAct.g:586:3: rule__RootPackage__Group_1__0
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
    // InternalAct.g:594:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:598:1: ( rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 )
            // InternalAct.g:599:2: rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RootPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__3();

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
    // InternalAct.g:606:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__NodesAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:610:1: ( ( ( rule__RootPackage__NodesAssignment_2 )* ) )
            // InternalAct.g:611:1: ( ( rule__RootPackage__NodesAssignment_2 )* )
            {
            // InternalAct.g:611:1: ( ( rule__RootPackage__NodesAssignment_2 )* )
            // InternalAct.g:612:2: ( rule__RootPackage__NodesAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getNodesAssignment_2()); 
            // InternalAct.g:613:2: ( rule__RootPackage__NodesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=15)||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAct.g:613:3: rule__RootPackage__NodesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RootPackage__NodesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "rule__RootPackage__Group__3"
    // InternalAct.g:621:1: rule__RootPackage__Group__3 : rule__RootPackage__Group__3__Impl ;
    public final void rule__RootPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:625:1: ( rule__RootPackage__Group__3__Impl )
            // InternalAct.g:626:2: rule__RootPackage__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__3__Impl();

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
    // $ANTLR end "rule__RootPackage__Group__3"


    // $ANTLR start "rule__RootPackage__Group__3__Impl"
    // InternalAct.g:632:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__RelationsAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:636:1: ( ( ( rule__RootPackage__RelationsAssignment_3 )* ) )
            // InternalAct.g:637:1: ( ( rule__RootPackage__RelationsAssignment_3 )* )
            {
            // InternalAct.g:637:1: ( ( rule__RootPackage__RelationsAssignment_3 )* )
            // InternalAct.g:638:2: ( rule__RootPackage__RelationsAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getRelationsAssignment_3()); 
            // InternalAct.g:639:2: ( rule__RootPackage__RelationsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAct.g:639:3: rule__RootPackage__RelationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RootPackage__RelationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRootPackageAccess().getRelationsAssignment_3()); 

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
    // $ANTLR end "rule__RootPackage__Group__3__Impl"


    // $ANTLR start "rule__RootPackage__Group_1__0"
    // InternalAct.g:648:1: rule__RootPackage__Group_1__0 : rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 ;
    public final void rule__RootPackage__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:652:1: ( rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 )
            // InternalAct.g:653:2: rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalAct.g:660:1: rule__RootPackage__Group_1__0__Impl : ( 'rootPackage' ) ;
    public final void rule__RootPackage__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:664:1: ( ( 'rootPackage' ) )
            // InternalAct.g:665:1: ( 'rootPackage' )
            {
            // InternalAct.g:665:1: ( 'rootPackage' )
            // InternalAct.g:666:2: 'rootPackage'
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAct.g:675:1: rule__RootPackage__Group_1__1 : rule__RootPackage__Group_1__1__Impl ;
    public final void rule__RootPackage__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:679:1: ( rule__RootPackage__Group_1__1__Impl )
            // InternalAct.g:680:2: rule__RootPackage__Group_1__1__Impl
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
    // InternalAct.g:686:1: rule__RootPackage__Group_1__1__Impl : ( ( rule__RootPackage__NameAssignment_1_1 ) ) ;
    public final void rule__RootPackage__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:690:1: ( ( ( rule__RootPackage__NameAssignment_1_1 ) ) )
            // InternalAct.g:691:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            {
            // InternalAct.g:691:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            // InternalAct.g:692:2: ( rule__RootPackage__NameAssignment_1_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1_1()); 
            // InternalAct.g:693:2: ( rule__RootPackage__NameAssignment_1_1 )
            // InternalAct.g:693:3: rule__RootPackage__NameAssignment_1_1
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


    // $ANTLR start "rule__ActivityNode__Group__0"
    // InternalAct.g:702:1: rule__ActivityNode__Group__0 : rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1 ;
    public final void rule__ActivityNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:706:1: ( rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1 )
            // InternalAct.g:707:2: rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ActivityNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__1();

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
    // $ANTLR end "rule__ActivityNode__Group__0"


    // $ANTLR start "rule__ActivityNode__Group__0__Impl"
    // InternalAct.g:714:1: rule__ActivityNode__Group__0__Impl : ( 'actn' ) ;
    public final void rule__ActivityNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:718:1: ( ( 'actn' ) )
            // InternalAct.g:719:1: ( 'actn' )
            {
            // InternalAct.g:719:1: ( 'actn' )
            // InternalAct.g:720:2: 'actn'
            {
             before(grammarAccess.getActivityNodeAccess().getActnKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getActnKeyword_0()); 

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
    // $ANTLR end "rule__ActivityNode__Group__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group__1"
    // InternalAct.g:729:1: rule__ActivityNode__Group__1 : rule__ActivityNode__Group__1__Impl ;
    public final void rule__ActivityNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:733:1: ( rule__ActivityNode__Group__1__Impl )
            // InternalAct.g:734:2: rule__ActivityNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__1__Impl();

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
    // $ANTLR end "rule__ActivityNode__Group__1"


    // $ANTLR start "rule__ActivityNode__Group__1__Impl"
    // InternalAct.g:740:1: rule__ActivityNode__Group__1__Impl : ( ( rule__ActivityNode__Alternatives_1 ) ) ;
    public final void rule__ActivityNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:744:1: ( ( ( rule__ActivityNode__Alternatives_1 ) ) )
            // InternalAct.g:745:1: ( ( rule__ActivityNode__Alternatives_1 ) )
            {
            // InternalAct.g:745:1: ( ( rule__ActivityNode__Alternatives_1 ) )
            // InternalAct.g:746:2: ( rule__ActivityNode__Alternatives_1 )
            {
             before(grammarAccess.getActivityNodeAccess().getAlternatives_1()); 
            // InternalAct.g:747:2: ( rule__ActivityNode__Alternatives_1 )
            // InternalAct.g:747:3: rule__ActivityNode__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__ActivityNode__Group__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group_1_1__0"
    // InternalAct.g:756:1: rule__ActivityNode__Group_1_1__0 : rule__ActivityNode__Group_1_1__0__Impl rule__ActivityNode__Group_1_1__1 ;
    public final void rule__ActivityNode__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:760:1: ( rule__ActivityNode__Group_1_1__0__Impl rule__ActivityNode__Group_1_1__1 )
            // InternalAct.g:761:2: rule__ActivityNode__Group_1_1__0__Impl rule__ActivityNode__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ActivityNode__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_1_1__1();

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
    // $ANTLR end "rule__ActivityNode__Group_1_1__0"


    // $ANTLR start "rule__ActivityNode__Group_1_1__0__Impl"
    // InternalAct.g:768:1: rule__ActivityNode__Group_1_1__0__Impl : ( ( rule__ActivityNode__NameAssignment_1_1_0 ) ) ;
    public final void rule__ActivityNode__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:772:1: ( ( ( rule__ActivityNode__NameAssignment_1_1_0 ) ) )
            // InternalAct.g:773:1: ( ( rule__ActivityNode__NameAssignment_1_1_0 ) )
            {
            // InternalAct.g:773:1: ( ( rule__ActivityNode__NameAssignment_1_1_0 ) )
            // InternalAct.g:774:2: ( rule__ActivityNode__NameAssignment_1_1_0 )
            {
             before(grammarAccess.getActivityNodeAccess().getNameAssignment_1_1_0()); 
            // InternalAct.g:775:2: ( rule__ActivityNode__NameAssignment_1_1_0 )
            // InternalAct.g:775:3: rule__ActivityNode__NameAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__NameAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getNameAssignment_1_1_0()); 

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
    // $ANTLR end "rule__ActivityNode__Group_1_1__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group_1_1__1"
    // InternalAct.g:783:1: rule__ActivityNode__Group_1_1__1 : rule__ActivityNode__Group_1_1__1__Impl rule__ActivityNode__Group_1_1__2 ;
    public final void rule__ActivityNode__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:787:1: ( rule__ActivityNode__Group_1_1__1__Impl rule__ActivityNode__Group_1_1__2 )
            // InternalAct.g:788:2: rule__ActivityNode__Group_1_1__1__Impl rule__ActivityNode__Group_1_1__2
            {
            pushFollow(FOLLOW_4);
            rule__ActivityNode__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_1_1__2();

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
    // $ANTLR end "rule__ActivityNode__Group_1_1__1"


    // $ANTLR start "rule__ActivityNode__Group_1_1__1__Impl"
    // InternalAct.g:795:1: rule__ActivityNode__Group_1_1__1__Impl : ( 'as' ) ;
    public final void rule__ActivityNode__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:799:1: ( ( 'as' ) )
            // InternalAct.g:800:1: ( 'as' )
            {
            // InternalAct.g:800:1: ( 'as' )
            // InternalAct.g:801:2: 'as'
            {
             before(grammarAccess.getActivityNodeAccess().getAsKeyword_1_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getAsKeyword_1_1_1()); 

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
    // $ANTLR end "rule__ActivityNode__Group_1_1__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group_1_1__2"
    // InternalAct.g:810:1: rule__ActivityNode__Group_1_1__2 : rule__ActivityNode__Group_1_1__2__Impl ;
    public final void rule__ActivityNode__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:814:1: ( rule__ActivityNode__Group_1_1__2__Impl )
            // InternalAct.g:815:2: rule__ActivityNode__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__ActivityNode__Group_1_1__2"


    // $ANTLR start "rule__ActivityNode__Group_1_1__2__Impl"
    // InternalAct.g:821:1: rule__ActivityNode__Group_1_1__2__Impl : ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) ) ;
    public final void rule__ActivityNode__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:825:1: ( ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) ) )
            // InternalAct.g:826:1: ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) )
            {
            // InternalAct.g:826:1: ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) )
            // InternalAct.g:827:2: ( rule__ActivityNode__AliasAssignment_1_1_2 )
            {
             before(grammarAccess.getActivityNodeAccess().getAliasAssignment_1_1_2()); 
            // InternalAct.g:828:2: ( rule__ActivityNode__AliasAssignment_1_1_2 )
            // InternalAct.g:828:3: rule__ActivityNode__AliasAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__AliasAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getAliasAssignment_1_1_2()); 

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
    // $ANTLR end "rule__ActivityNode__Group_1_1__2__Impl"


    // $ANTLR start "rule__ControlNode__Group__0"
    // InternalAct.g:837:1: rule__ControlNode__Group__0 : rule__ControlNode__Group__0__Impl rule__ControlNode__Group__1 ;
    public final void rule__ControlNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:841:1: ( rule__ControlNode__Group__0__Impl rule__ControlNode__Group__1 )
            // InternalAct.g:842:2: rule__ControlNode__Group__0__Impl rule__ControlNode__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ControlNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControlNode__Group__1();

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
    // $ANTLR end "rule__ControlNode__Group__0"


    // $ANTLR start "rule__ControlNode__Group__0__Impl"
    // InternalAct.g:849:1: rule__ControlNode__Group__0__Impl : ( ( rule__ControlNode__TypeAssignment_0 ) ) ;
    public final void rule__ControlNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:853:1: ( ( ( rule__ControlNode__TypeAssignment_0 ) ) )
            // InternalAct.g:854:1: ( ( rule__ControlNode__TypeAssignment_0 ) )
            {
            // InternalAct.g:854:1: ( ( rule__ControlNode__TypeAssignment_0 ) )
            // InternalAct.g:855:2: ( rule__ControlNode__TypeAssignment_0 )
            {
             before(grammarAccess.getControlNodeAccess().getTypeAssignment_0()); 
            // InternalAct.g:856:2: ( rule__ControlNode__TypeAssignment_0 )
            // InternalAct.g:856:3: rule__ControlNode__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ControlNode__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getControlNodeAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__ControlNode__Group__0__Impl"


    // $ANTLR start "rule__ControlNode__Group__1"
    // InternalAct.g:864:1: rule__ControlNode__Group__1 : rule__ControlNode__Group__1__Impl ;
    public final void rule__ControlNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:868:1: ( rule__ControlNode__Group__1__Impl )
            // InternalAct.g:869:2: rule__ControlNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ControlNode__Group__1__Impl();

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
    // $ANTLR end "rule__ControlNode__Group__1"


    // $ANTLR start "rule__ControlNode__Group__1__Impl"
    // InternalAct.g:875:1: rule__ControlNode__Group__1__Impl : ( ( rule__ControlNode__NameAssignment_1 )? ) ;
    public final void rule__ControlNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:879:1: ( ( ( rule__ControlNode__NameAssignment_1 )? ) )
            // InternalAct.g:880:1: ( ( rule__ControlNode__NameAssignment_1 )? )
            {
            // InternalAct.g:880:1: ( ( rule__ControlNode__NameAssignment_1 )? )
            // InternalAct.g:881:2: ( rule__ControlNode__NameAssignment_1 )?
            {
             before(grammarAccess.getControlNodeAccess().getNameAssignment_1()); 
            // InternalAct.g:882:2: ( rule__ControlNode__NameAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAct.g:882:3: rule__ControlNode__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ControlNode__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getControlNodeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ControlNode__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__0"
    // InternalAct.g:891:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:895:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // InternalAct.g:896:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Flow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flow__Group__1();

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
    // $ANTLR end "rule__Flow__Group__0"


    // $ANTLR start "rule__Flow__Group__0__Impl"
    // InternalAct.g:903:1: rule__Flow__Group__0__Impl : ( 'flw' ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:907:1: ( ( 'flw' ) )
            // InternalAct.g:908:1: ( 'flw' )
            {
            // InternalAct.g:908:1: ( 'flw' )
            // InternalAct.g:909:2: 'flw'
            {
             before(grammarAccess.getFlowAccess().getFlwKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFlowAccess().getFlwKeyword_0()); 

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
    // $ANTLR end "rule__Flow__Group__0__Impl"


    // $ANTLR start "rule__Flow__Group__1"
    // InternalAct.g:918:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:922:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // InternalAct.g:923:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Flow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flow__Group__2();

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
    // $ANTLR end "rule__Flow__Group__1"


    // $ANTLR start "rule__Flow__Group__1__Impl"
    // InternalAct.g:930:1: rule__Flow__Group__1__Impl : ( '(' ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:934:1: ( ( '(' ) )
            // InternalAct.g:935:1: ( '(' )
            {
            // InternalAct.g:935:1: ( '(' )
            // InternalAct.g:936:2: '('
            {
             before(grammarAccess.getFlowAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFlowAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Flow__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__2"
    // InternalAct.g:945:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl rule__Flow__Group__3 ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:949:1: ( rule__Flow__Group__2__Impl rule__Flow__Group__3 )
            // InternalAct.g:950:2: rule__Flow__Group__2__Impl rule__Flow__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Flow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flow__Group__3();

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
    // $ANTLR end "rule__Flow__Group__2"


    // $ANTLR start "rule__Flow__Group__2__Impl"
    // InternalAct.g:957:1: rule__Flow__Group__2__Impl : ( ( rule__Flow__RelatedElementsAssignment_2 ) ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:961:1: ( ( ( rule__Flow__RelatedElementsAssignment_2 ) ) )
            // InternalAct.g:962:1: ( ( rule__Flow__RelatedElementsAssignment_2 ) )
            {
            // InternalAct.g:962:1: ( ( rule__Flow__RelatedElementsAssignment_2 ) )
            // InternalAct.g:963:2: ( rule__Flow__RelatedElementsAssignment_2 )
            {
             before(grammarAccess.getFlowAccess().getRelatedElementsAssignment_2()); 
            // InternalAct.g:964:2: ( rule__Flow__RelatedElementsAssignment_2 )
            // InternalAct.g:964:3: rule__Flow__RelatedElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Flow__RelatedElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getRelatedElementsAssignment_2()); 

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
    // $ANTLR end "rule__Flow__Group__2__Impl"


    // $ANTLR start "rule__Flow__Group__3"
    // InternalAct.g:972:1: rule__Flow__Group__3 : rule__Flow__Group__3__Impl rule__Flow__Group__4 ;
    public final void rule__Flow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:976:1: ( rule__Flow__Group__3__Impl rule__Flow__Group__4 )
            // InternalAct.g:977:2: rule__Flow__Group__3__Impl rule__Flow__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Flow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flow__Group__4();

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
    // $ANTLR end "rule__Flow__Group__3"


    // $ANTLR start "rule__Flow__Group__3__Impl"
    // InternalAct.g:984:1: rule__Flow__Group__3__Impl : ( ',' ) ;
    public final void rule__Flow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:988:1: ( ( ',' ) )
            // InternalAct.g:989:1: ( ',' )
            {
            // InternalAct.g:989:1: ( ',' )
            // InternalAct.g:990:2: ','
            {
             before(grammarAccess.getFlowAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFlowAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Flow__Group__3__Impl"


    // $ANTLR start "rule__Flow__Group__4"
    // InternalAct.g:999:1: rule__Flow__Group__4 : rule__Flow__Group__4__Impl rule__Flow__Group__5 ;
    public final void rule__Flow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1003:1: ( rule__Flow__Group__4__Impl rule__Flow__Group__5 )
            // InternalAct.g:1004:2: rule__Flow__Group__4__Impl rule__Flow__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Flow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flow__Group__5();

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
    // $ANTLR end "rule__Flow__Group__4"


    // $ANTLR start "rule__Flow__Group__4__Impl"
    // InternalAct.g:1011:1: rule__Flow__Group__4__Impl : ( ( rule__Flow__RelatedElementsAssignment_4 ) ) ;
    public final void rule__Flow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1015:1: ( ( ( rule__Flow__RelatedElementsAssignment_4 ) ) )
            // InternalAct.g:1016:1: ( ( rule__Flow__RelatedElementsAssignment_4 ) )
            {
            // InternalAct.g:1016:1: ( ( rule__Flow__RelatedElementsAssignment_4 ) )
            // InternalAct.g:1017:2: ( rule__Flow__RelatedElementsAssignment_4 )
            {
             before(grammarAccess.getFlowAccess().getRelatedElementsAssignment_4()); 
            // InternalAct.g:1018:2: ( rule__Flow__RelatedElementsAssignment_4 )
            // InternalAct.g:1018:3: rule__Flow__RelatedElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Flow__RelatedElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getRelatedElementsAssignment_4()); 

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
    // $ANTLR end "rule__Flow__Group__4__Impl"


    // $ANTLR start "rule__Flow__Group__5"
    // InternalAct.g:1026:1: rule__Flow__Group__5 : rule__Flow__Group__5__Impl rule__Flow__Group__6 ;
    public final void rule__Flow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1030:1: ( rule__Flow__Group__5__Impl rule__Flow__Group__6 )
            // InternalAct.g:1031:2: rule__Flow__Group__5__Impl rule__Flow__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Flow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flow__Group__6();

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
    // $ANTLR end "rule__Flow__Group__5"


    // $ANTLR start "rule__Flow__Group__5__Impl"
    // InternalAct.g:1038:1: rule__Flow__Group__5__Impl : ( ')' ) ;
    public final void rule__Flow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1042:1: ( ( ')' ) )
            // InternalAct.g:1043:1: ( ')' )
            {
            // InternalAct.g:1043:1: ( ')' )
            // InternalAct.g:1044:2: ')'
            {
             before(grammarAccess.getFlowAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFlowAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Flow__Group__5__Impl"


    // $ANTLR start "rule__Flow__Group__6"
    // InternalAct.g:1053:1: rule__Flow__Group__6 : rule__Flow__Group__6__Impl ;
    public final void rule__Flow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1057:1: ( rule__Flow__Group__6__Impl )
            // InternalAct.g:1058:2: rule__Flow__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Flow__Group__6__Impl();

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
    // $ANTLR end "rule__Flow__Group__6"


    // $ANTLR start "rule__Flow__Group__6__Impl"
    // InternalAct.g:1064:1: rule__Flow__Group__6__Impl : ( ( rule__Flow__Group_6__0 )? ) ;
    public final void rule__Flow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1068:1: ( ( ( rule__Flow__Group_6__0 )? ) )
            // InternalAct.g:1069:1: ( ( rule__Flow__Group_6__0 )? )
            {
            // InternalAct.g:1069:1: ( ( rule__Flow__Group_6__0 )? )
            // InternalAct.g:1070:2: ( rule__Flow__Group_6__0 )?
            {
             before(grammarAccess.getFlowAccess().getGroup_6()); 
            // InternalAct.g:1071:2: ( rule__Flow__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAct.g:1071:3: rule__Flow__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Flow__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFlowAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Flow__Group__6__Impl"


    // $ANTLR start "rule__Flow__Group_6__0"
    // InternalAct.g:1080:1: rule__Flow__Group_6__0 : rule__Flow__Group_6__0__Impl rule__Flow__Group_6__1 ;
    public final void rule__Flow__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1084:1: ( rule__Flow__Group_6__0__Impl rule__Flow__Group_6__1 )
            // InternalAct.g:1085:2: rule__Flow__Group_6__0__Impl rule__Flow__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Flow__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flow__Group_6__1();

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
    // $ANTLR end "rule__Flow__Group_6__0"


    // $ANTLR start "rule__Flow__Group_6__0__Impl"
    // InternalAct.g:1092:1: rule__Flow__Group_6__0__Impl : ( '[' ) ;
    public final void rule__Flow__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1096:1: ( ( '[' ) )
            // InternalAct.g:1097:1: ( '[' )
            {
            // InternalAct.g:1097:1: ( '[' )
            // InternalAct.g:1098:2: '['
            {
             before(grammarAccess.getFlowAccess().getLeftSquareBracketKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFlowAccess().getLeftSquareBracketKeyword_6_0()); 

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
    // $ANTLR end "rule__Flow__Group_6__0__Impl"


    // $ANTLR start "rule__Flow__Group_6__1"
    // InternalAct.g:1107:1: rule__Flow__Group_6__1 : rule__Flow__Group_6__1__Impl rule__Flow__Group_6__2 ;
    public final void rule__Flow__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1111:1: ( rule__Flow__Group_6__1__Impl rule__Flow__Group_6__2 )
            // InternalAct.g:1112:2: rule__Flow__Group_6__1__Impl rule__Flow__Group_6__2
            {
            pushFollow(FOLLOW_15);
            rule__Flow__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flow__Group_6__2();

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
    // $ANTLR end "rule__Flow__Group_6__1"


    // $ANTLR start "rule__Flow__Group_6__1__Impl"
    // InternalAct.g:1119:1: rule__Flow__Group_6__1__Impl : ( ( rule__Flow__ConditionAssignment_6_1 ) ) ;
    public final void rule__Flow__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1123:1: ( ( ( rule__Flow__ConditionAssignment_6_1 ) ) )
            // InternalAct.g:1124:1: ( ( rule__Flow__ConditionAssignment_6_1 ) )
            {
            // InternalAct.g:1124:1: ( ( rule__Flow__ConditionAssignment_6_1 ) )
            // InternalAct.g:1125:2: ( rule__Flow__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getFlowAccess().getConditionAssignment_6_1()); 
            // InternalAct.g:1126:2: ( rule__Flow__ConditionAssignment_6_1 )
            // InternalAct.g:1126:3: rule__Flow__ConditionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Flow__ConditionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getConditionAssignment_6_1()); 

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
    // $ANTLR end "rule__Flow__Group_6__1__Impl"


    // $ANTLR start "rule__Flow__Group_6__2"
    // InternalAct.g:1134:1: rule__Flow__Group_6__2 : rule__Flow__Group_6__2__Impl ;
    public final void rule__Flow__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1138:1: ( rule__Flow__Group_6__2__Impl )
            // InternalAct.g:1139:2: rule__Flow__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Flow__Group_6__2__Impl();

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
    // $ANTLR end "rule__Flow__Group_6__2"


    // $ANTLR start "rule__Flow__Group_6__2__Impl"
    // InternalAct.g:1145:1: rule__Flow__Group_6__2__Impl : ( ']' ) ;
    public final void rule__Flow__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1149:1: ( ( ']' ) )
            // InternalAct.g:1150:1: ( ']' )
            {
            // InternalAct.g:1150:1: ( ']' )
            // InternalAct.g:1151:2: ']'
            {
             before(grammarAccess.getFlowAccess().getRightSquareBracketKeyword_6_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFlowAccess().getRightSquareBracketKeyword_6_2()); 

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
    // $ANTLR end "rule__Flow__Group_6__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalAct.g:1161:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1165:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalAct.g:1166:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAct.g:1173:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1177:1: ( ( RULE_ID ) )
            // InternalAct.g:1178:1: ( RULE_ID )
            {
            // InternalAct.g:1178:1: ( RULE_ID )
            // InternalAct.g:1179:2: RULE_ID
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
    // InternalAct.g:1188:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1192:1: ( rule__FQN__Group__1__Impl )
            // InternalAct.g:1193:2: rule__FQN__Group__1__Impl
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
    // InternalAct.g:1199:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1203:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalAct.g:1204:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalAct.g:1204:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalAct.g:1205:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalAct.g:1206:2: ( rule__FQN__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAct.g:1206:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalAct.g:1215:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1219:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalAct.g:1220:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalAct.g:1227:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1231:1: ( ( '.' ) )
            // InternalAct.g:1232:1: ( '.' )
            {
            // InternalAct.g:1232:1: ( '.' )
            // InternalAct.g:1233:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAct.g:1242:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1246:1: ( rule__FQN__Group_1__1__Impl )
            // InternalAct.g:1247:2: rule__FQN__Group_1__1__Impl
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
    // InternalAct.g:1253:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1257:1: ( ( RULE_ID ) )
            // InternalAct.g:1258:1: ( RULE_ID )
            {
            // InternalAct.g:1258:1: ( RULE_ID )
            // InternalAct.g:1259:2: RULE_ID
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
    // InternalAct.g:1269:1: rule__ActivityDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1273:1: ( ( RULE_STRING ) )
            // InternalAct.g:1274:2: ( RULE_STRING )
            {
            // InternalAct.g:1274:2: ( RULE_STRING )
            // InternalAct.g:1275:3: RULE_STRING
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
    // InternalAct.g:1284:1: rule__ActivityDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__ActivityDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1288:1: ( ( ruleRootPackage ) )
            // InternalAct.g:1289:2: ( ruleRootPackage )
            {
            // InternalAct.g:1289:2: ( ruleRootPackage )
            // InternalAct.g:1290:3: ruleRootPackage
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
    // InternalAct.g:1299:1: rule__ActivityDiagram__ActivityNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__ActivityNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1303:1: ( ( RULE_STRING ) )
            // InternalAct.g:1304:2: ( RULE_STRING )
            {
            // InternalAct.g:1304:2: ( RULE_STRING )
            // InternalAct.g:1305:3: RULE_STRING
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
    // InternalAct.g:1314:1: rule__RootPackage__NameAssignment_1_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1318:1: ( ( ruleFQN ) )
            // InternalAct.g:1319:2: ( ruleFQN )
            {
            // InternalAct.g:1319:2: ( ruleFQN )
            // InternalAct.g:1320:3: ruleFQN
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
    // InternalAct.g:1329:1: rule__RootPackage__NodesAssignment_2 : ( ruleNode ) ;
    public final void rule__RootPackage__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1333:1: ( ( ruleNode ) )
            // InternalAct.g:1334:2: ( ruleNode )
            {
            // InternalAct.g:1334:2: ( ruleNode )
            // InternalAct.g:1335:3: ruleNode
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


    // $ANTLR start "rule__RootPackage__RelationsAssignment_3"
    // InternalAct.g:1344:1: rule__RootPackage__RelationsAssignment_3 : ( ruleFlow ) ;
    public final void rule__RootPackage__RelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1348:1: ( ( ruleFlow ) )
            // InternalAct.g:1349:2: ( ruleFlow )
            {
            // InternalAct.g:1349:2: ( ruleFlow )
            // InternalAct.g:1350:3: ruleFlow
            {
             before(grammarAccess.getRootPackageAccess().getRelationsFlowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getRelationsFlowParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RootPackage__RelationsAssignment_3"


    // $ANTLR start "rule__ActivityNode__NameAssignment_1_0"
    // InternalAct.g:1359:1: rule__ActivityNode__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__ActivityNode__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1363:1: ( ( RULE_ID ) )
            // InternalAct.g:1364:2: ( RULE_ID )
            {
            // InternalAct.g:1364:2: ( RULE_ID )
            // InternalAct.g:1365:3: RULE_ID
            {
             before(grammarAccess.getActivityNodeAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getNameIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ActivityNode__NameAssignment_1_0"


    // $ANTLR start "rule__ActivityNode__NameAssignment_1_1_0"
    // InternalAct.g:1374:1: rule__ActivityNode__NameAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__ActivityNode__NameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1378:1: ( ( RULE_ID ) )
            // InternalAct.g:1379:2: ( RULE_ID )
            {
            // InternalAct.g:1379:2: ( RULE_ID )
            // InternalAct.g:1380:3: RULE_ID
            {
             before(grammarAccess.getActivityNodeAccess().getNameIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getNameIDTerminalRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__ActivityNode__NameAssignment_1_1_0"


    // $ANTLR start "rule__ActivityNode__AliasAssignment_1_1_2"
    // InternalAct.g:1389:1: rule__ActivityNode__AliasAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__ActivityNode__AliasAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1393:1: ( ( RULE_STRING ) )
            // InternalAct.g:1394:2: ( RULE_STRING )
            {
            // InternalAct.g:1394:2: ( RULE_STRING )
            // InternalAct.g:1395:3: RULE_STRING
            {
             before(grammarAccess.getActivityNodeAccess().getAliasSTRINGTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getAliasSTRINGTerminalRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__ActivityNode__AliasAssignment_1_1_2"


    // $ANTLR start "rule__ControlNode__TypeAssignment_0"
    // InternalAct.g:1404:1: rule__ControlNode__TypeAssignment_0 : ( ruleNodeType ) ;
    public final void rule__ControlNode__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1408:1: ( ( ruleNodeType ) )
            // InternalAct.g:1409:2: ( ruleNodeType )
            {
            // InternalAct.g:1409:2: ( ruleNodeType )
            // InternalAct.g:1410:3: ruleNodeType
            {
             before(grammarAccess.getControlNodeAccess().getTypeNodeTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeType();

            state._fsp--;

             after(grammarAccess.getControlNodeAccess().getTypeNodeTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__ControlNode__TypeAssignment_0"


    // $ANTLR start "rule__ControlNode__NameAssignment_1"
    // InternalAct.g:1419:1: rule__ControlNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ControlNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1423:1: ( ( RULE_ID ) )
            // InternalAct.g:1424:2: ( RULE_ID )
            {
            // InternalAct.g:1424:2: ( RULE_ID )
            // InternalAct.g:1425:3: RULE_ID
            {
             before(grammarAccess.getControlNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getControlNodeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ControlNode__NameAssignment_1"


    // $ANTLR start "rule__Flow__RelatedElementsAssignment_2"
    // InternalAct.g:1434:1: rule__Flow__RelatedElementsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Flow__RelatedElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1438:1: ( ( ( RULE_ID ) ) )
            // InternalAct.g:1439:2: ( ( RULE_ID ) )
            {
            // InternalAct.g:1439:2: ( ( RULE_ID ) )
            // InternalAct.g:1440:3: ( RULE_ID )
            {
             before(grammarAccess.getFlowAccess().getRelatedElementsNodeCrossReference_2_0()); 
            // InternalAct.g:1441:3: ( RULE_ID )
            // InternalAct.g:1442:4: RULE_ID
            {
             before(grammarAccess.getFlowAccess().getRelatedElementsNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFlowAccess().getRelatedElementsNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFlowAccess().getRelatedElementsNodeCrossReference_2_0()); 

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
    // $ANTLR end "rule__Flow__RelatedElementsAssignment_2"


    // $ANTLR start "rule__Flow__RelatedElementsAssignment_4"
    // InternalAct.g:1453:1: rule__Flow__RelatedElementsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Flow__RelatedElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1457:1: ( ( ( RULE_ID ) ) )
            // InternalAct.g:1458:2: ( ( RULE_ID ) )
            {
            // InternalAct.g:1458:2: ( ( RULE_ID ) )
            // InternalAct.g:1459:3: ( RULE_ID )
            {
             before(grammarAccess.getFlowAccess().getRelatedElementsNodeCrossReference_4_0()); 
            // InternalAct.g:1460:3: ( RULE_ID )
            // InternalAct.g:1461:4: RULE_ID
            {
             before(grammarAccess.getFlowAccess().getRelatedElementsNodeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFlowAccess().getRelatedElementsNodeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFlowAccess().getRelatedElementsNodeCrossReference_4_0()); 

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
    // $ANTLR end "rule__Flow__RelatedElementsAssignment_4"


    // $ANTLR start "rule__Flow__ConditionAssignment_6_1"
    // InternalAct.g:1472:1: rule__Flow__ConditionAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Flow__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1476:1: ( ( RULE_STRING ) )
            // InternalAct.g:1477:2: ( RULE_STRING )
            {
            // InternalAct.g:1477:2: ( RULE_STRING )
            // InternalAct.g:1478:3: RULE_STRING
            {
             before(grammarAccess.getFlowAccess().getConditionSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFlowAccess().getConditionSTRINGTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Flow__ConditionAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000058F800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000010F802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000002L});

}