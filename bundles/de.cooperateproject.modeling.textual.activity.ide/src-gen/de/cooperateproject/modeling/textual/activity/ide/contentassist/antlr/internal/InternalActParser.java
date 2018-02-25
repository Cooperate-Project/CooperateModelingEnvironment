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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ini'", "'fin'", "'ffin'", "'@start-actd'", "'@end-actd'", "'activityName'", "'rootPackage'", "'actn'", "'as'", "'flw'", "'('", "','", "')'", "'.'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=13)) ) {
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

                if ( (LA2_1==EOF||(LA2_1>=11 && LA2_1<=13)||(LA2_1>=15 && LA2_1<=16)||LA2_1==18||LA2_1==20) ) {
                    alt2=1;
                }
                else if ( (LA2_1==19) ) {
                    alt2=2;
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
    // InternalAct.g:285:1: rule__NodeType__Alternatives : ( ( ( 'ini' ) ) | ( ( 'fin' ) ) | ( ( 'ffin' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:289:1: ( ( ( 'ini' ) ) | ( ( 'fin' ) ) | ( ( 'ffin' ) ) )
            int alt3=3;
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
    // InternalAct.g:312:1: rule__ActivityDiagram__Group__0 : rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 ;
    public final void rule__ActivityDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:316:1: ( rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 )
            // InternalAct.g:317:2: rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1
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
    // InternalAct.g:324:1: rule__ActivityDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ActivityDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:328:1: ( ( () ) )
            // InternalAct.g:329:1: ( () )
            {
            // InternalAct.g:329:1: ( () )
            // InternalAct.g:330:2: ()
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); 
            // InternalAct.g:331:2: ()
            // InternalAct.g:331:3: 
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
    // InternalAct.g:339:1: rule__ActivityDiagram__Group__1 : rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 ;
    public final void rule__ActivityDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:343:1: ( rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 )
            // InternalAct.g:344:2: rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2
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
    // InternalAct.g:351:1: rule__ActivityDiagram__Group__1__Impl : ( '@start-actd' ) ;
    public final void rule__ActivityDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:355:1: ( ( '@start-actd' ) )
            // InternalAct.g:356:1: ( '@start-actd' )
            {
            // InternalAct.g:356:1: ( '@start-actd' )
            // InternalAct.g:357:2: '@start-actd'
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
    // InternalAct.g:366:1: rule__ActivityDiagram__Group__2 : rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 ;
    public final void rule__ActivityDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:370:1: ( rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 )
            // InternalAct.g:371:2: rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3
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
    // InternalAct.g:378:1: rule__ActivityDiagram__Group__2__Impl : ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ActivityDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:382:1: ( ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) )
            // InternalAct.g:383:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            {
            // InternalAct.g:383:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            // InternalAct.g:384:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2()); 
            // InternalAct.g:385:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            // InternalAct.g:385:3: rule__ActivityDiagram__TitleAssignment_2
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
    // InternalAct.g:393:1: rule__ActivityDiagram__Group__3 : rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 ;
    public final void rule__ActivityDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:397:1: ( rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 )
            // InternalAct.g:398:2: rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4
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
    // InternalAct.g:405:1: rule__ActivityDiagram__Group__3__Impl : ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__ActivityDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:409:1: ( ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) ) )
            // InternalAct.g:410:1: ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) )
            {
            // InternalAct.g:410:1: ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) )
            // InternalAct.g:411:2: ( rule__ActivityDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getActivityDiagramAccess().getRootPackageAssignment_3()); 
            // InternalAct.g:412:2: ( rule__ActivityDiagram__RootPackageAssignment_3 )
            // InternalAct.g:412:3: rule__ActivityDiagram__RootPackageAssignment_3
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
    // InternalAct.g:420:1: rule__ActivityDiagram__Group__4 : rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 ;
    public final void rule__ActivityDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:424:1: ( rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 )
            // InternalAct.g:425:2: rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5
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
    // InternalAct.g:432:1: rule__ActivityDiagram__Group__4__Impl : ( ( rule__ActivityDiagram__Group_4__0 )? ) ;
    public final void rule__ActivityDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:436:1: ( ( ( rule__ActivityDiagram__Group_4__0 )? ) )
            // InternalAct.g:437:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            {
            // InternalAct.g:437:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            // InternalAct.g:438:2: ( rule__ActivityDiagram__Group_4__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_4()); 
            // InternalAct.g:439:2: ( rule__ActivityDiagram__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAct.g:439:3: rule__ActivityDiagram__Group_4__0
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
    // InternalAct.g:447:1: rule__ActivityDiagram__Group__5 : rule__ActivityDiagram__Group__5__Impl ;
    public final void rule__ActivityDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:451:1: ( rule__ActivityDiagram__Group__5__Impl )
            // InternalAct.g:452:2: rule__ActivityDiagram__Group__5__Impl
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
    // InternalAct.g:458:1: rule__ActivityDiagram__Group__5__Impl : ( '@end-actd' ) ;
    public final void rule__ActivityDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:462:1: ( ( '@end-actd' ) )
            // InternalAct.g:463:1: ( '@end-actd' )
            {
            // InternalAct.g:463:1: ( '@end-actd' )
            // InternalAct.g:464:2: '@end-actd'
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
    // InternalAct.g:474:1: rule__ActivityDiagram__Group_4__0 : rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 ;
    public final void rule__ActivityDiagram__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:478:1: ( rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 )
            // InternalAct.g:479:2: rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1
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
    // InternalAct.g:486:1: rule__ActivityDiagram__Group_4__0__Impl : ( 'activityName' ) ;
    public final void rule__ActivityDiagram__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:490:1: ( ( 'activityName' ) )
            // InternalAct.g:491:1: ( 'activityName' )
            {
            // InternalAct.g:491:1: ( 'activityName' )
            // InternalAct.g:492:2: 'activityName'
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
    // InternalAct.g:501:1: rule__ActivityDiagram__Group_4__1 : rule__ActivityDiagram__Group_4__1__Impl ;
    public final void rule__ActivityDiagram__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:505:1: ( rule__ActivityDiagram__Group_4__1__Impl )
            // InternalAct.g:506:2: rule__ActivityDiagram__Group_4__1__Impl
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
    // InternalAct.g:512:1: rule__ActivityDiagram__Group_4__1__Impl : ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) ) ;
    public final void rule__ActivityDiagram__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:516:1: ( ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) ) )
            // InternalAct.g:517:1: ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) )
            {
            // InternalAct.g:517:1: ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) )
            // InternalAct.g:518:2: ( rule__ActivityDiagram__ActivityNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNameAssignment_4_1()); 
            // InternalAct.g:519:2: ( rule__ActivityDiagram__ActivityNameAssignment_4_1 )
            // InternalAct.g:519:3: rule__ActivityDiagram__ActivityNameAssignment_4_1
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
    // InternalAct.g:528:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:532:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalAct.g:533:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
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
    // InternalAct.g:540:1: rule__RootPackage__Group__0__Impl : ( () ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:544:1: ( ( () ) )
            // InternalAct.g:545:1: ( () )
            {
            // InternalAct.g:545:1: ( () )
            // InternalAct.g:546:2: ()
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageAction_0()); 
            // InternalAct.g:547:2: ()
            // InternalAct.g:547:3: 
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
    // InternalAct.g:555:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:559:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalAct.g:560:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
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
    // InternalAct.g:567:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__Group_1__0 )? ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:571:1: ( ( ( rule__RootPackage__Group_1__0 )? ) )
            // InternalAct.g:572:1: ( ( rule__RootPackage__Group_1__0 )? )
            {
            // InternalAct.g:572:1: ( ( rule__RootPackage__Group_1__0 )? )
            // InternalAct.g:573:2: ( rule__RootPackage__Group_1__0 )?
            {
             before(grammarAccess.getRootPackageAccess().getGroup_1()); 
            // InternalAct.g:574:2: ( rule__RootPackage__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAct.g:574:3: rule__RootPackage__Group_1__0
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
    // InternalAct.g:582:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:586:1: ( rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 )
            // InternalAct.g:587:2: rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3
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
    // InternalAct.g:594:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__NodesAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:598:1: ( ( ( rule__RootPackage__NodesAssignment_2 )* ) )
            // InternalAct.g:599:1: ( ( rule__RootPackage__NodesAssignment_2 )* )
            {
            // InternalAct.g:599:1: ( ( rule__RootPackage__NodesAssignment_2 )* )
            // InternalAct.g:600:2: ( rule__RootPackage__NodesAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getNodesAssignment_2()); 
            // InternalAct.g:601:2: ( rule__RootPackage__NodesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=13)||LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAct.g:601:3: rule__RootPackage__NodesAssignment_2
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
    // InternalAct.g:609:1: rule__RootPackage__Group__3 : rule__RootPackage__Group__3__Impl ;
    public final void rule__RootPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:613:1: ( rule__RootPackage__Group__3__Impl )
            // InternalAct.g:614:2: rule__RootPackage__Group__3__Impl
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
    // InternalAct.g:620:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__RelationsAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:624:1: ( ( ( rule__RootPackage__RelationsAssignment_3 )* ) )
            // InternalAct.g:625:1: ( ( rule__RootPackage__RelationsAssignment_3 )* )
            {
            // InternalAct.g:625:1: ( ( rule__RootPackage__RelationsAssignment_3 )* )
            // InternalAct.g:626:2: ( rule__RootPackage__RelationsAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getRelationsAssignment_3()); 
            // InternalAct.g:627:2: ( rule__RootPackage__RelationsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAct.g:627:3: rule__RootPackage__RelationsAssignment_3
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
    // InternalAct.g:636:1: rule__RootPackage__Group_1__0 : rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 ;
    public final void rule__RootPackage__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:640:1: ( rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 )
            // InternalAct.g:641:2: rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1
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
    // InternalAct.g:648:1: rule__RootPackage__Group_1__0__Impl : ( 'rootPackage' ) ;
    public final void rule__RootPackage__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:652:1: ( ( 'rootPackage' ) )
            // InternalAct.g:653:1: ( 'rootPackage' )
            {
            // InternalAct.g:653:1: ( 'rootPackage' )
            // InternalAct.g:654:2: 'rootPackage'
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
    // InternalAct.g:663:1: rule__RootPackage__Group_1__1 : rule__RootPackage__Group_1__1__Impl ;
    public final void rule__RootPackage__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:667:1: ( rule__RootPackage__Group_1__1__Impl )
            // InternalAct.g:668:2: rule__RootPackage__Group_1__1__Impl
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
    // InternalAct.g:674:1: rule__RootPackage__Group_1__1__Impl : ( ( rule__RootPackage__NameAssignment_1_1 ) ) ;
    public final void rule__RootPackage__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:678:1: ( ( ( rule__RootPackage__NameAssignment_1_1 ) ) )
            // InternalAct.g:679:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            {
            // InternalAct.g:679:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            // InternalAct.g:680:2: ( rule__RootPackage__NameAssignment_1_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1_1()); 
            // InternalAct.g:681:2: ( rule__RootPackage__NameAssignment_1_1 )
            // InternalAct.g:681:3: rule__RootPackage__NameAssignment_1_1
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
    // InternalAct.g:690:1: rule__ActivityNode__Group__0 : rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1 ;
    public final void rule__ActivityNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:694:1: ( rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1 )
            // InternalAct.g:695:2: rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1
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
    // InternalAct.g:702:1: rule__ActivityNode__Group__0__Impl : ( 'actn' ) ;
    public final void rule__ActivityNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:706:1: ( ( 'actn' ) )
            // InternalAct.g:707:1: ( 'actn' )
            {
            // InternalAct.g:707:1: ( 'actn' )
            // InternalAct.g:708:2: 'actn'
            {
             before(grammarAccess.getActivityNodeAccess().getActnKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAct.g:717:1: rule__ActivityNode__Group__1 : rule__ActivityNode__Group__1__Impl ;
    public final void rule__ActivityNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:721:1: ( rule__ActivityNode__Group__1__Impl )
            // InternalAct.g:722:2: rule__ActivityNode__Group__1__Impl
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
    // InternalAct.g:728:1: rule__ActivityNode__Group__1__Impl : ( ( rule__ActivityNode__Alternatives_1 ) ) ;
    public final void rule__ActivityNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:732:1: ( ( ( rule__ActivityNode__Alternatives_1 ) ) )
            // InternalAct.g:733:1: ( ( rule__ActivityNode__Alternatives_1 ) )
            {
            // InternalAct.g:733:1: ( ( rule__ActivityNode__Alternatives_1 ) )
            // InternalAct.g:734:2: ( rule__ActivityNode__Alternatives_1 )
            {
             before(grammarAccess.getActivityNodeAccess().getAlternatives_1()); 
            // InternalAct.g:735:2: ( rule__ActivityNode__Alternatives_1 )
            // InternalAct.g:735:3: rule__ActivityNode__Alternatives_1
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
    // InternalAct.g:744:1: rule__ActivityNode__Group_1_1__0 : rule__ActivityNode__Group_1_1__0__Impl rule__ActivityNode__Group_1_1__1 ;
    public final void rule__ActivityNode__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:748:1: ( rule__ActivityNode__Group_1_1__0__Impl rule__ActivityNode__Group_1_1__1 )
            // InternalAct.g:749:2: rule__ActivityNode__Group_1_1__0__Impl rule__ActivityNode__Group_1_1__1
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
    // InternalAct.g:756:1: rule__ActivityNode__Group_1_1__0__Impl : ( ( rule__ActivityNode__NameAssignment_1_1_0 ) ) ;
    public final void rule__ActivityNode__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:760:1: ( ( ( rule__ActivityNode__NameAssignment_1_1_0 ) ) )
            // InternalAct.g:761:1: ( ( rule__ActivityNode__NameAssignment_1_1_0 ) )
            {
            // InternalAct.g:761:1: ( ( rule__ActivityNode__NameAssignment_1_1_0 ) )
            // InternalAct.g:762:2: ( rule__ActivityNode__NameAssignment_1_1_0 )
            {
             before(grammarAccess.getActivityNodeAccess().getNameAssignment_1_1_0()); 
            // InternalAct.g:763:2: ( rule__ActivityNode__NameAssignment_1_1_0 )
            // InternalAct.g:763:3: rule__ActivityNode__NameAssignment_1_1_0
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
    // InternalAct.g:771:1: rule__ActivityNode__Group_1_1__1 : rule__ActivityNode__Group_1_1__1__Impl rule__ActivityNode__Group_1_1__2 ;
    public final void rule__ActivityNode__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:775:1: ( rule__ActivityNode__Group_1_1__1__Impl rule__ActivityNode__Group_1_1__2 )
            // InternalAct.g:776:2: rule__ActivityNode__Group_1_1__1__Impl rule__ActivityNode__Group_1_1__2
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
    // InternalAct.g:783:1: rule__ActivityNode__Group_1_1__1__Impl : ( 'as' ) ;
    public final void rule__ActivityNode__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:787:1: ( ( 'as' ) )
            // InternalAct.g:788:1: ( 'as' )
            {
            // InternalAct.g:788:1: ( 'as' )
            // InternalAct.g:789:2: 'as'
            {
             before(grammarAccess.getActivityNodeAccess().getAsKeyword_1_1_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAct.g:798:1: rule__ActivityNode__Group_1_1__2 : rule__ActivityNode__Group_1_1__2__Impl ;
    public final void rule__ActivityNode__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:802:1: ( rule__ActivityNode__Group_1_1__2__Impl )
            // InternalAct.g:803:2: rule__ActivityNode__Group_1_1__2__Impl
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
    // InternalAct.g:809:1: rule__ActivityNode__Group_1_1__2__Impl : ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) ) ;
    public final void rule__ActivityNode__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:813:1: ( ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) ) )
            // InternalAct.g:814:1: ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) )
            {
            // InternalAct.g:814:1: ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) )
            // InternalAct.g:815:2: ( rule__ActivityNode__AliasAssignment_1_1_2 )
            {
             before(grammarAccess.getActivityNodeAccess().getAliasAssignment_1_1_2()); 
            // InternalAct.g:816:2: ( rule__ActivityNode__AliasAssignment_1_1_2 )
            // InternalAct.g:816:3: rule__ActivityNode__AliasAssignment_1_1_2
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
    // InternalAct.g:825:1: rule__ControlNode__Group__0 : rule__ControlNode__Group__0__Impl rule__ControlNode__Group__1 ;
    public final void rule__ControlNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:829:1: ( rule__ControlNode__Group__0__Impl rule__ControlNode__Group__1 )
            // InternalAct.g:830:2: rule__ControlNode__Group__0__Impl rule__ControlNode__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalAct.g:837:1: rule__ControlNode__Group__0__Impl : ( ( rule__ControlNode__TypeAssignment_0 ) ) ;
    public final void rule__ControlNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:841:1: ( ( ( rule__ControlNode__TypeAssignment_0 ) ) )
            // InternalAct.g:842:1: ( ( rule__ControlNode__TypeAssignment_0 ) )
            {
            // InternalAct.g:842:1: ( ( rule__ControlNode__TypeAssignment_0 ) )
            // InternalAct.g:843:2: ( rule__ControlNode__TypeAssignment_0 )
            {
             before(grammarAccess.getControlNodeAccess().getTypeAssignment_0()); 
            // InternalAct.g:844:2: ( rule__ControlNode__TypeAssignment_0 )
            // InternalAct.g:844:3: rule__ControlNode__TypeAssignment_0
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
    // InternalAct.g:852:1: rule__ControlNode__Group__1 : rule__ControlNode__Group__1__Impl ;
    public final void rule__ControlNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:856:1: ( rule__ControlNode__Group__1__Impl )
            // InternalAct.g:857:2: rule__ControlNode__Group__1__Impl
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
    // InternalAct.g:863:1: rule__ControlNode__Group__1__Impl : ( ( rule__ControlNode__NameAssignment_1 )? ) ;
    public final void rule__ControlNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:867:1: ( ( ( rule__ControlNode__NameAssignment_1 )? ) )
            // InternalAct.g:868:1: ( ( rule__ControlNode__NameAssignment_1 )? )
            {
            // InternalAct.g:868:1: ( ( rule__ControlNode__NameAssignment_1 )? )
            // InternalAct.g:869:2: ( rule__ControlNode__NameAssignment_1 )?
            {
             before(grammarAccess.getControlNodeAccess().getNameAssignment_1()); 
            // InternalAct.g:870:2: ( rule__ControlNode__NameAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAct.g:870:3: rule__ControlNode__NameAssignment_1
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
    // InternalAct.g:879:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:883:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // InternalAct.g:884:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
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
    // InternalAct.g:891:1: rule__Flow__Group__0__Impl : ( 'flw' ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:895:1: ( ( 'flw' ) )
            // InternalAct.g:896:1: ( 'flw' )
            {
            // InternalAct.g:896:1: ( 'flw' )
            // InternalAct.g:897:2: 'flw'
            {
             before(grammarAccess.getFlowAccess().getFlwKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAct.g:906:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:910:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // InternalAct.g:911:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
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
    // InternalAct.g:918:1: rule__Flow__Group__1__Impl : ( '(' ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:922:1: ( ( '(' ) )
            // InternalAct.g:923:1: ( '(' )
            {
            // InternalAct.g:923:1: ( '(' )
            // InternalAct.g:924:2: '('
            {
             before(grammarAccess.getFlowAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAct.g:933:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl rule__Flow__Group__3 ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:937:1: ( rule__Flow__Group__2__Impl rule__Flow__Group__3 )
            // InternalAct.g:938:2: rule__Flow__Group__2__Impl rule__Flow__Group__3
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
    // InternalAct.g:945:1: rule__Flow__Group__2__Impl : ( ( rule__Flow__RelatedElementsAssignment_2 ) ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:949:1: ( ( ( rule__Flow__RelatedElementsAssignment_2 ) ) )
            // InternalAct.g:950:1: ( ( rule__Flow__RelatedElementsAssignment_2 ) )
            {
            // InternalAct.g:950:1: ( ( rule__Flow__RelatedElementsAssignment_2 ) )
            // InternalAct.g:951:2: ( rule__Flow__RelatedElementsAssignment_2 )
            {
             before(grammarAccess.getFlowAccess().getRelatedElementsAssignment_2()); 
            // InternalAct.g:952:2: ( rule__Flow__RelatedElementsAssignment_2 )
            // InternalAct.g:952:3: rule__Flow__RelatedElementsAssignment_2
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
    // InternalAct.g:960:1: rule__Flow__Group__3 : rule__Flow__Group__3__Impl rule__Flow__Group__4 ;
    public final void rule__Flow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:964:1: ( rule__Flow__Group__3__Impl rule__Flow__Group__4 )
            // InternalAct.g:965:2: rule__Flow__Group__3__Impl rule__Flow__Group__4
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
    // InternalAct.g:972:1: rule__Flow__Group__3__Impl : ( ',' ) ;
    public final void rule__Flow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:976:1: ( ( ',' ) )
            // InternalAct.g:977:1: ( ',' )
            {
            // InternalAct.g:977:1: ( ',' )
            // InternalAct.g:978:2: ','
            {
             before(grammarAccess.getFlowAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAct.g:987:1: rule__Flow__Group__4 : rule__Flow__Group__4__Impl rule__Flow__Group__5 ;
    public final void rule__Flow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:991:1: ( rule__Flow__Group__4__Impl rule__Flow__Group__5 )
            // InternalAct.g:992:2: rule__Flow__Group__4__Impl rule__Flow__Group__5
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
    // InternalAct.g:999:1: rule__Flow__Group__4__Impl : ( ( rule__Flow__RelatedElementsAssignment_4 ) ) ;
    public final void rule__Flow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1003:1: ( ( ( rule__Flow__RelatedElementsAssignment_4 ) ) )
            // InternalAct.g:1004:1: ( ( rule__Flow__RelatedElementsAssignment_4 ) )
            {
            // InternalAct.g:1004:1: ( ( rule__Flow__RelatedElementsAssignment_4 ) )
            // InternalAct.g:1005:2: ( rule__Flow__RelatedElementsAssignment_4 )
            {
             before(grammarAccess.getFlowAccess().getRelatedElementsAssignment_4()); 
            // InternalAct.g:1006:2: ( rule__Flow__RelatedElementsAssignment_4 )
            // InternalAct.g:1006:3: rule__Flow__RelatedElementsAssignment_4
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
    // InternalAct.g:1014:1: rule__Flow__Group__5 : rule__Flow__Group__5__Impl ;
    public final void rule__Flow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1018:1: ( rule__Flow__Group__5__Impl )
            // InternalAct.g:1019:2: rule__Flow__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Flow__Group__5__Impl();

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
    // InternalAct.g:1025:1: rule__Flow__Group__5__Impl : ( ')' ) ;
    public final void rule__Flow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1029:1: ( ( ')' ) )
            // InternalAct.g:1030:1: ( ')' )
            {
            // InternalAct.g:1030:1: ( ')' )
            // InternalAct.g:1031:2: ')'
            {
             before(grammarAccess.getFlowAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__FQN__Group__0"
    // InternalAct.g:1041:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1045:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalAct.g:1046:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAct.g:1053:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1057:1: ( ( RULE_ID ) )
            // InternalAct.g:1058:1: ( RULE_ID )
            {
            // InternalAct.g:1058:1: ( RULE_ID )
            // InternalAct.g:1059:2: RULE_ID
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
    // InternalAct.g:1068:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1072:1: ( rule__FQN__Group__1__Impl )
            // InternalAct.g:1073:2: rule__FQN__Group__1__Impl
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
    // InternalAct.g:1079:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1083:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalAct.g:1084:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalAct.g:1084:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalAct.g:1085:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalAct.g:1086:2: ( rule__FQN__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAct.g:1086:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalAct.g:1095:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1099:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalAct.g:1100:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalAct.g:1107:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1111:1: ( ( '.' ) )
            // InternalAct.g:1112:1: ( '.' )
            {
            // InternalAct.g:1112:1: ( '.' )
            // InternalAct.g:1113:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAct.g:1122:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1126:1: ( rule__FQN__Group_1__1__Impl )
            // InternalAct.g:1127:2: rule__FQN__Group_1__1__Impl
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
    // InternalAct.g:1133:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1137:1: ( ( RULE_ID ) )
            // InternalAct.g:1138:1: ( RULE_ID )
            {
            // InternalAct.g:1138:1: ( RULE_ID )
            // InternalAct.g:1139:2: RULE_ID
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
    // InternalAct.g:1149:1: rule__ActivityDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1153:1: ( ( RULE_STRING ) )
            // InternalAct.g:1154:2: ( RULE_STRING )
            {
            // InternalAct.g:1154:2: ( RULE_STRING )
            // InternalAct.g:1155:3: RULE_STRING
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
    // InternalAct.g:1164:1: rule__ActivityDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__ActivityDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1168:1: ( ( ruleRootPackage ) )
            // InternalAct.g:1169:2: ( ruleRootPackage )
            {
            // InternalAct.g:1169:2: ( ruleRootPackage )
            // InternalAct.g:1170:3: ruleRootPackage
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
    // InternalAct.g:1179:1: rule__ActivityDiagram__ActivityNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__ActivityNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1183:1: ( ( RULE_STRING ) )
            // InternalAct.g:1184:2: ( RULE_STRING )
            {
            // InternalAct.g:1184:2: ( RULE_STRING )
            // InternalAct.g:1185:3: RULE_STRING
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
    // InternalAct.g:1194:1: rule__RootPackage__NameAssignment_1_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1198:1: ( ( ruleFQN ) )
            // InternalAct.g:1199:2: ( ruleFQN )
            {
            // InternalAct.g:1199:2: ( ruleFQN )
            // InternalAct.g:1200:3: ruleFQN
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
    // InternalAct.g:1209:1: rule__RootPackage__NodesAssignment_2 : ( ruleNode ) ;
    public final void rule__RootPackage__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1213:1: ( ( ruleNode ) )
            // InternalAct.g:1214:2: ( ruleNode )
            {
            // InternalAct.g:1214:2: ( ruleNode )
            // InternalAct.g:1215:3: ruleNode
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
    // InternalAct.g:1224:1: rule__RootPackage__RelationsAssignment_3 : ( ruleFlow ) ;
    public final void rule__RootPackage__RelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1228:1: ( ( ruleFlow ) )
            // InternalAct.g:1229:2: ( ruleFlow )
            {
            // InternalAct.g:1229:2: ( ruleFlow )
            // InternalAct.g:1230:3: ruleFlow
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
    // InternalAct.g:1239:1: rule__ActivityNode__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__ActivityNode__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1243:1: ( ( RULE_ID ) )
            // InternalAct.g:1244:2: ( RULE_ID )
            {
            // InternalAct.g:1244:2: ( RULE_ID )
            // InternalAct.g:1245:3: RULE_ID
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
    // InternalAct.g:1254:1: rule__ActivityNode__NameAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__ActivityNode__NameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1258:1: ( ( RULE_ID ) )
            // InternalAct.g:1259:2: ( RULE_ID )
            {
            // InternalAct.g:1259:2: ( RULE_ID )
            // InternalAct.g:1260:3: RULE_ID
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
    // InternalAct.g:1269:1: rule__ActivityNode__AliasAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__ActivityNode__AliasAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1273:1: ( ( RULE_STRING ) )
            // InternalAct.g:1274:2: ( RULE_STRING )
            {
            // InternalAct.g:1274:2: ( RULE_STRING )
            // InternalAct.g:1275:3: RULE_STRING
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
    // InternalAct.g:1284:1: rule__ControlNode__TypeAssignment_0 : ( ruleNodeType ) ;
    public final void rule__ControlNode__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1288:1: ( ( ruleNodeType ) )
            // InternalAct.g:1289:2: ( ruleNodeType )
            {
            // InternalAct.g:1289:2: ( ruleNodeType )
            // InternalAct.g:1290:3: ruleNodeType
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
    // InternalAct.g:1299:1: rule__ControlNode__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ControlNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1303:1: ( ( RULE_STRING ) )
            // InternalAct.g:1304:2: ( RULE_STRING )
            {
            // InternalAct.g:1304:2: ( RULE_STRING )
            // InternalAct.g:1305:3: RULE_STRING
            {
             before(grammarAccess.getControlNodeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getControlNodeAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // InternalAct.g:1314:1: rule__Flow__RelatedElementsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Flow__RelatedElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1318:1: ( ( ( RULE_ID ) ) )
            // InternalAct.g:1319:2: ( ( RULE_ID ) )
            {
            // InternalAct.g:1319:2: ( ( RULE_ID ) )
            // InternalAct.g:1320:3: ( RULE_ID )
            {
             before(grammarAccess.getFlowAccess().getRelatedElementsNodeCrossReference_2_0()); 
            // InternalAct.g:1321:3: ( RULE_ID )
            // InternalAct.g:1322:4: RULE_ID
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
    // InternalAct.g:1333:1: rule__Flow__RelatedElementsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Flow__RelatedElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1337:1: ( ( ( RULE_ID ) ) )
            // InternalAct.g:1338:2: ( ( RULE_ID ) )
            {
            // InternalAct.g:1338:2: ( ( RULE_ID ) )
            // InternalAct.g:1339:3: ( RULE_ID )
            {
             before(grammarAccess.getFlowAccess().getRelatedElementsNodeCrossReference_4_0()); 
            // InternalAct.g:1340:3: ( RULE_ID )
            // InternalAct.g:1341:4: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000163800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000043802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});

}