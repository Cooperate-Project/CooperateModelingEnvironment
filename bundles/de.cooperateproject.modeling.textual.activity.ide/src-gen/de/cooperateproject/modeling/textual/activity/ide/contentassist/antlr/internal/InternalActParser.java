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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ini'", "'fin'", "'ffin'", "'@start-actd'", "'@end-actd'", "'activityName'", "'rootPackage'", "'actn'", "'as'", "'.'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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


    // $ANTLR start "entryRuleFQN"
    // InternalAct.g:178:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalAct.g:179:1: ( ruleFQN EOF )
            // InternalAct.g:180:1: ruleFQN EOF
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
    // InternalAct.g:187:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:191:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalAct.g:192:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalAct.g:192:2: ( ( rule__FQN__Group__0 ) )
            // InternalAct.g:193:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalAct.g:194:3: ( rule__FQN__Group__0 )
            // InternalAct.g:194:4: rule__FQN__Group__0
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
    // InternalAct.g:203:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:207:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // InternalAct.g:208:2: ( ( rule__NodeType__Alternatives ) )
            {
            // InternalAct.g:208:2: ( ( rule__NodeType__Alternatives ) )
            // InternalAct.g:209:3: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // InternalAct.g:210:3: ( rule__NodeType__Alternatives )
            // InternalAct.g:210:4: rule__NodeType__Alternatives
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
    // InternalAct.g:218:1: rule__Node__Alternatives : ( ( ruleActivityNode ) | ( ruleControlNode ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:222:1: ( ( ruleActivityNode ) | ( ruleControlNode ) )
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
                    // InternalAct.g:223:2: ( ruleActivityNode )
                    {
                    // InternalAct.g:223:2: ( ruleActivityNode )
                    // InternalAct.g:224:3: ruleActivityNode
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
                    // InternalAct.g:229:2: ( ruleControlNode )
                    {
                    // InternalAct.g:229:2: ( ruleControlNode )
                    // InternalAct.g:230:3: ruleControlNode
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
    // InternalAct.g:239:1: rule__ActivityNode__Alternatives_1 : ( ( ( rule__ActivityNode__NameAssignment_1_0 ) ) | ( ( rule__ActivityNode__Group_1_1__0 ) ) );
    public final void rule__ActivityNode__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:243:1: ( ( ( rule__ActivityNode__NameAssignment_1_0 ) ) | ( ( rule__ActivityNode__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=11 && LA2_1<=13)||(LA2_1>=15 && LA2_1<=16)||LA2_1==18) ) {
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
                    // InternalAct.g:244:2: ( ( rule__ActivityNode__NameAssignment_1_0 ) )
                    {
                    // InternalAct.g:244:2: ( ( rule__ActivityNode__NameAssignment_1_0 ) )
                    // InternalAct.g:245:3: ( rule__ActivityNode__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getActivityNodeAccess().getNameAssignment_1_0()); 
                    // InternalAct.g:246:3: ( rule__ActivityNode__NameAssignment_1_0 )
                    // InternalAct.g:246:4: rule__ActivityNode__NameAssignment_1_0
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
                    // InternalAct.g:250:2: ( ( rule__ActivityNode__Group_1_1__0 ) )
                    {
                    // InternalAct.g:250:2: ( ( rule__ActivityNode__Group_1_1__0 ) )
                    // InternalAct.g:251:3: ( rule__ActivityNode__Group_1_1__0 )
                    {
                     before(grammarAccess.getActivityNodeAccess().getGroup_1_1()); 
                    // InternalAct.g:252:3: ( rule__ActivityNode__Group_1_1__0 )
                    // InternalAct.g:252:4: rule__ActivityNode__Group_1_1__0
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
    // InternalAct.g:260:1: rule__NodeType__Alternatives : ( ( ( 'ini' ) ) | ( ( 'fin' ) ) | ( ( 'ffin' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:264:1: ( ( ( 'ini' ) ) | ( ( 'fin' ) ) | ( ( 'ffin' ) ) )
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
                    // InternalAct.g:265:2: ( ( 'ini' ) )
                    {
                    // InternalAct.g:265:2: ( ( 'ini' ) )
                    // InternalAct.g:266:3: ( 'ini' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getINITIALEnumLiteralDeclaration_0()); 
                    // InternalAct.g:267:3: ( 'ini' )
                    // InternalAct.g:267:4: 'ini'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getINITIALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAct.g:271:2: ( ( 'fin' ) )
                    {
                    // InternalAct.g:271:2: ( ( 'fin' ) )
                    // InternalAct.g:272:3: ( 'fin' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getFINALEnumLiteralDeclaration_1()); 
                    // InternalAct.g:273:3: ( 'fin' )
                    // InternalAct.g:273:4: 'fin'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getFINALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAct.g:277:2: ( ( 'ffin' ) )
                    {
                    // InternalAct.g:277:2: ( ( 'ffin' ) )
                    // InternalAct.g:278:3: ( 'ffin' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getFLOW_FINALEnumLiteralDeclaration_2()); 
                    // InternalAct.g:279:3: ( 'ffin' )
                    // InternalAct.g:279:4: 'ffin'
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
    // InternalAct.g:287:1: rule__ActivityDiagram__Group__0 : rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 ;
    public final void rule__ActivityDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:291:1: ( rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 )
            // InternalAct.g:292:2: rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1
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
    // InternalAct.g:299:1: rule__ActivityDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ActivityDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:303:1: ( ( () ) )
            // InternalAct.g:304:1: ( () )
            {
            // InternalAct.g:304:1: ( () )
            // InternalAct.g:305:2: ()
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); 
            // InternalAct.g:306:2: ()
            // InternalAct.g:306:3: 
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
    // InternalAct.g:314:1: rule__ActivityDiagram__Group__1 : rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 ;
    public final void rule__ActivityDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:318:1: ( rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 )
            // InternalAct.g:319:2: rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2
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
    // InternalAct.g:326:1: rule__ActivityDiagram__Group__1__Impl : ( '@start-actd' ) ;
    public final void rule__ActivityDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:330:1: ( ( '@start-actd' ) )
            // InternalAct.g:331:1: ( '@start-actd' )
            {
            // InternalAct.g:331:1: ( '@start-actd' )
            // InternalAct.g:332:2: '@start-actd'
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
    // InternalAct.g:341:1: rule__ActivityDiagram__Group__2 : rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 ;
    public final void rule__ActivityDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:345:1: ( rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 )
            // InternalAct.g:346:2: rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3
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
    // InternalAct.g:353:1: rule__ActivityDiagram__Group__2__Impl : ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ActivityDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:357:1: ( ( ( rule__ActivityDiagram__TitleAssignment_2 ) ) )
            // InternalAct.g:358:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            {
            // InternalAct.g:358:1: ( ( rule__ActivityDiagram__TitleAssignment_2 ) )
            // InternalAct.g:359:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2()); 
            // InternalAct.g:360:2: ( rule__ActivityDiagram__TitleAssignment_2 )
            // InternalAct.g:360:3: rule__ActivityDiagram__TitleAssignment_2
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
    // InternalAct.g:368:1: rule__ActivityDiagram__Group__3 : rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 ;
    public final void rule__ActivityDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:372:1: ( rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 )
            // InternalAct.g:373:2: rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4
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
    // InternalAct.g:380:1: rule__ActivityDiagram__Group__3__Impl : ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__ActivityDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:384:1: ( ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) ) )
            // InternalAct.g:385:1: ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) )
            {
            // InternalAct.g:385:1: ( ( rule__ActivityDiagram__RootPackageAssignment_3 ) )
            // InternalAct.g:386:2: ( rule__ActivityDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getActivityDiagramAccess().getRootPackageAssignment_3()); 
            // InternalAct.g:387:2: ( rule__ActivityDiagram__RootPackageAssignment_3 )
            // InternalAct.g:387:3: rule__ActivityDiagram__RootPackageAssignment_3
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
    // InternalAct.g:395:1: rule__ActivityDiagram__Group__4 : rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 ;
    public final void rule__ActivityDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:399:1: ( rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 )
            // InternalAct.g:400:2: rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5
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
    // InternalAct.g:407:1: rule__ActivityDiagram__Group__4__Impl : ( ( rule__ActivityDiagram__Group_4__0 )? ) ;
    public final void rule__ActivityDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:411:1: ( ( ( rule__ActivityDiagram__Group_4__0 )? ) )
            // InternalAct.g:412:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            {
            // InternalAct.g:412:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            // InternalAct.g:413:2: ( rule__ActivityDiagram__Group_4__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_4()); 
            // InternalAct.g:414:2: ( rule__ActivityDiagram__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAct.g:414:3: rule__ActivityDiagram__Group_4__0
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
    // InternalAct.g:422:1: rule__ActivityDiagram__Group__5 : rule__ActivityDiagram__Group__5__Impl ;
    public final void rule__ActivityDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:426:1: ( rule__ActivityDiagram__Group__5__Impl )
            // InternalAct.g:427:2: rule__ActivityDiagram__Group__5__Impl
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
    // InternalAct.g:433:1: rule__ActivityDiagram__Group__5__Impl : ( '@end-actd' ) ;
    public final void rule__ActivityDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:437:1: ( ( '@end-actd' ) )
            // InternalAct.g:438:1: ( '@end-actd' )
            {
            // InternalAct.g:438:1: ( '@end-actd' )
            // InternalAct.g:439:2: '@end-actd'
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
    // InternalAct.g:449:1: rule__ActivityDiagram__Group_4__0 : rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 ;
    public final void rule__ActivityDiagram__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:453:1: ( rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 )
            // InternalAct.g:454:2: rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1
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
    // InternalAct.g:461:1: rule__ActivityDiagram__Group_4__0__Impl : ( 'activityName' ) ;
    public final void rule__ActivityDiagram__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:465:1: ( ( 'activityName' ) )
            // InternalAct.g:466:1: ( 'activityName' )
            {
            // InternalAct.g:466:1: ( 'activityName' )
            // InternalAct.g:467:2: 'activityName'
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
    // InternalAct.g:476:1: rule__ActivityDiagram__Group_4__1 : rule__ActivityDiagram__Group_4__1__Impl ;
    public final void rule__ActivityDiagram__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:480:1: ( rule__ActivityDiagram__Group_4__1__Impl )
            // InternalAct.g:481:2: rule__ActivityDiagram__Group_4__1__Impl
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
    // InternalAct.g:487:1: rule__ActivityDiagram__Group_4__1__Impl : ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) ) ;
    public final void rule__ActivityDiagram__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:491:1: ( ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) ) )
            // InternalAct.g:492:1: ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) )
            {
            // InternalAct.g:492:1: ( ( rule__ActivityDiagram__ActivityNameAssignment_4_1 ) )
            // InternalAct.g:493:2: ( rule__ActivityDiagram__ActivityNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNameAssignment_4_1()); 
            // InternalAct.g:494:2: ( rule__ActivityDiagram__ActivityNameAssignment_4_1 )
            // InternalAct.g:494:3: rule__ActivityDiagram__ActivityNameAssignment_4_1
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
    // InternalAct.g:503:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:507:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalAct.g:508:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
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
    // InternalAct.g:515:1: rule__RootPackage__Group__0__Impl : ( () ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:519:1: ( ( () ) )
            // InternalAct.g:520:1: ( () )
            {
            // InternalAct.g:520:1: ( () )
            // InternalAct.g:521:2: ()
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageAction_0()); 
            // InternalAct.g:522:2: ()
            // InternalAct.g:522:3: 
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
    // InternalAct.g:530:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:534:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalAct.g:535:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
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
    // InternalAct.g:542:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__Group_1__0 )? ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:546:1: ( ( ( rule__RootPackage__Group_1__0 )? ) )
            // InternalAct.g:547:1: ( ( rule__RootPackage__Group_1__0 )? )
            {
            // InternalAct.g:547:1: ( ( rule__RootPackage__Group_1__0 )? )
            // InternalAct.g:548:2: ( rule__RootPackage__Group_1__0 )?
            {
             before(grammarAccess.getRootPackageAccess().getGroup_1()); 
            // InternalAct.g:549:2: ( rule__RootPackage__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAct.g:549:3: rule__RootPackage__Group_1__0
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
    // InternalAct.g:557:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:561:1: ( rule__RootPackage__Group__2__Impl )
            // InternalAct.g:562:2: rule__RootPackage__Group__2__Impl
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
    // InternalAct.g:568:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__NodesAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:572:1: ( ( ( rule__RootPackage__NodesAssignment_2 )* ) )
            // InternalAct.g:573:1: ( ( rule__RootPackage__NodesAssignment_2 )* )
            {
            // InternalAct.g:573:1: ( ( rule__RootPackage__NodesAssignment_2 )* )
            // InternalAct.g:574:2: ( rule__RootPackage__NodesAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getNodesAssignment_2()); 
            // InternalAct.g:575:2: ( rule__RootPackage__NodesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=13)||LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAct.g:575:3: rule__RootPackage__NodesAssignment_2
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


    // $ANTLR start "rule__RootPackage__Group_1__0"
    // InternalAct.g:584:1: rule__RootPackage__Group_1__0 : rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 ;
    public final void rule__RootPackage__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:588:1: ( rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 )
            // InternalAct.g:589:2: rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1
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
    // InternalAct.g:596:1: rule__RootPackage__Group_1__0__Impl : ( 'rootPackage' ) ;
    public final void rule__RootPackage__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:600:1: ( ( 'rootPackage' ) )
            // InternalAct.g:601:1: ( 'rootPackage' )
            {
            // InternalAct.g:601:1: ( 'rootPackage' )
            // InternalAct.g:602:2: 'rootPackage'
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
    // InternalAct.g:611:1: rule__RootPackage__Group_1__1 : rule__RootPackage__Group_1__1__Impl ;
    public final void rule__RootPackage__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:615:1: ( rule__RootPackage__Group_1__1__Impl )
            // InternalAct.g:616:2: rule__RootPackage__Group_1__1__Impl
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
    // InternalAct.g:622:1: rule__RootPackage__Group_1__1__Impl : ( ( rule__RootPackage__NameAssignment_1_1 ) ) ;
    public final void rule__RootPackage__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:626:1: ( ( ( rule__RootPackage__NameAssignment_1_1 ) ) )
            // InternalAct.g:627:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            {
            // InternalAct.g:627:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            // InternalAct.g:628:2: ( rule__RootPackage__NameAssignment_1_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1_1()); 
            // InternalAct.g:629:2: ( rule__RootPackage__NameAssignment_1_1 )
            // InternalAct.g:629:3: rule__RootPackage__NameAssignment_1_1
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
    // InternalAct.g:638:1: rule__ActivityNode__Group__0 : rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1 ;
    public final void rule__ActivityNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:642:1: ( rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1 )
            // InternalAct.g:643:2: rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAct.g:650:1: rule__ActivityNode__Group__0__Impl : ( 'actn' ) ;
    public final void rule__ActivityNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:654:1: ( ( 'actn' ) )
            // InternalAct.g:655:1: ( 'actn' )
            {
            // InternalAct.g:655:1: ( 'actn' )
            // InternalAct.g:656:2: 'actn'
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
    // InternalAct.g:665:1: rule__ActivityNode__Group__1 : rule__ActivityNode__Group__1__Impl ;
    public final void rule__ActivityNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:669:1: ( rule__ActivityNode__Group__1__Impl )
            // InternalAct.g:670:2: rule__ActivityNode__Group__1__Impl
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
    // InternalAct.g:676:1: rule__ActivityNode__Group__1__Impl : ( ( rule__ActivityNode__Alternatives_1 ) ) ;
    public final void rule__ActivityNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:680:1: ( ( ( rule__ActivityNode__Alternatives_1 ) ) )
            // InternalAct.g:681:1: ( ( rule__ActivityNode__Alternatives_1 ) )
            {
            // InternalAct.g:681:1: ( ( rule__ActivityNode__Alternatives_1 ) )
            // InternalAct.g:682:2: ( rule__ActivityNode__Alternatives_1 )
            {
             before(grammarAccess.getActivityNodeAccess().getAlternatives_1()); 
            // InternalAct.g:683:2: ( rule__ActivityNode__Alternatives_1 )
            // InternalAct.g:683:3: rule__ActivityNode__Alternatives_1
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
    // InternalAct.g:692:1: rule__ActivityNode__Group_1_1__0 : rule__ActivityNode__Group_1_1__0__Impl rule__ActivityNode__Group_1_1__1 ;
    public final void rule__ActivityNode__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:696:1: ( rule__ActivityNode__Group_1_1__0__Impl rule__ActivityNode__Group_1_1__1 )
            // InternalAct.g:697:2: rule__ActivityNode__Group_1_1__0__Impl rule__ActivityNode__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalAct.g:704:1: rule__ActivityNode__Group_1_1__0__Impl : ( ( rule__ActivityNode__NameAssignment_1_1_0 ) ) ;
    public final void rule__ActivityNode__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:708:1: ( ( ( rule__ActivityNode__NameAssignment_1_1_0 ) ) )
            // InternalAct.g:709:1: ( ( rule__ActivityNode__NameAssignment_1_1_0 ) )
            {
            // InternalAct.g:709:1: ( ( rule__ActivityNode__NameAssignment_1_1_0 ) )
            // InternalAct.g:710:2: ( rule__ActivityNode__NameAssignment_1_1_0 )
            {
             before(grammarAccess.getActivityNodeAccess().getNameAssignment_1_1_0()); 
            // InternalAct.g:711:2: ( rule__ActivityNode__NameAssignment_1_1_0 )
            // InternalAct.g:711:3: rule__ActivityNode__NameAssignment_1_1_0
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
    // InternalAct.g:719:1: rule__ActivityNode__Group_1_1__1 : rule__ActivityNode__Group_1_1__1__Impl rule__ActivityNode__Group_1_1__2 ;
    public final void rule__ActivityNode__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:723:1: ( rule__ActivityNode__Group_1_1__1__Impl rule__ActivityNode__Group_1_1__2 )
            // InternalAct.g:724:2: rule__ActivityNode__Group_1_1__1__Impl rule__ActivityNode__Group_1_1__2
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
    // InternalAct.g:731:1: rule__ActivityNode__Group_1_1__1__Impl : ( 'as' ) ;
    public final void rule__ActivityNode__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:735:1: ( ( 'as' ) )
            // InternalAct.g:736:1: ( 'as' )
            {
            // InternalAct.g:736:1: ( 'as' )
            // InternalAct.g:737:2: 'as'
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
    // InternalAct.g:746:1: rule__ActivityNode__Group_1_1__2 : rule__ActivityNode__Group_1_1__2__Impl ;
    public final void rule__ActivityNode__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:750:1: ( rule__ActivityNode__Group_1_1__2__Impl )
            // InternalAct.g:751:2: rule__ActivityNode__Group_1_1__2__Impl
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
    // InternalAct.g:757:1: rule__ActivityNode__Group_1_1__2__Impl : ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) ) ;
    public final void rule__ActivityNode__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:761:1: ( ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) ) )
            // InternalAct.g:762:1: ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) )
            {
            // InternalAct.g:762:1: ( ( rule__ActivityNode__AliasAssignment_1_1_2 ) )
            // InternalAct.g:763:2: ( rule__ActivityNode__AliasAssignment_1_1_2 )
            {
             before(grammarAccess.getActivityNodeAccess().getAliasAssignment_1_1_2()); 
            // InternalAct.g:764:2: ( rule__ActivityNode__AliasAssignment_1_1_2 )
            // InternalAct.g:764:3: rule__ActivityNode__AliasAssignment_1_1_2
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
    // InternalAct.g:773:1: rule__ControlNode__Group__0 : rule__ControlNode__Group__0__Impl rule__ControlNode__Group__1 ;
    public final void rule__ControlNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:777:1: ( rule__ControlNode__Group__0__Impl rule__ControlNode__Group__1 )
            // InternalAct.g:778:2: rule__ControlNode__Group__0__Impl rule__ControlNode__Group__1
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
    // InternalAct.g:785:1: rule__ControlNode__Group__0__Impl : ( ( rule__ControlNode__TypeAssignment_0 ) ) ;
    public final void rule__ControlNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:789:1: ( ( ( rule__ControlNode__TypeAssignment_0 ) ) )
            // InternalAct.g:790:1: ( ( rule__ControlNode__TypeAssignment_0 ) )
            {
            // InternalAct.g:790:1: ( ( rule__ControlNode__TypeAssignment_0 ) )
            // InternalAct.g:791:2: ( rule__ControlNode__TypeAssignment_0 )
            {
             before(grammarAccess.getControlNodeAccess().getTypeAssignment_0()); 
            // InternalAct.g:792:2: ( rule__ControlNode__TypeAssignment_0 )
            // InternalAct.g:792:3: rule__ControlNode__TypeAssignment_0
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
    // InternalAct.g:800:1: rule__ControlNode__Group__1 : rule__ControlNode__Group__1__Impl ;
    public final void rule__ControlNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:804:1: ( rule__ControlNode__Group__1__Impl )
            // InternalAct.g:805:2: rule__ControlNode__Group__1__Impl
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
    // InternalAct.g:811:1: rule__ControlNode__Group__1__Impl : ( ( rule__ControlNode__NameAssignment_1 )? ) ;
    public final void rule__ControlNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:815:1: ( ( ( rule__ControlNode__NameAssignment_1 )? ) )
            // InternalAct.g:816:1: ( ( rule__ControlNode__NameAssignment_1 )? )
            {
            // InternalAct.g:816:1: ( ( rule__ControlNode__NameAssignment_1 )? )
            // InternalAct.g:817:2: ( rule__ControlNode__NameAssignment_1 )?
            {
             before(grammarAccess.getControlNodeAccess().getNameAssignment_1()); 
            // InternalAct.g:818:2: ( rule__ControlNode__NameAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAct.g:818:3: rule__ControlNode__NameAssignment_1
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


    // $ANTLR start "rule__FQN__Group__0"
    // InternalAct.g:827:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:831:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalAct.g:832:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalAct.g:839:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:843:1: ( ( RULE_ID ) )
            // InternalAct.g:844:1: ( RULE_ID )
            {
            // InternalAct.g:844:1: ( RULE_ID )
            // InternalAct.g:845:2: RULE_ID
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
    // InternalAct.g:854:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:858:1: ( rule__FQN__Group__1__Impl )
            // InternalAct.g:859:2: rule__FQN__Group__1__Impl
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
    // InternalAct.g:865:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:869:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalAct.g:870:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalAct.g:870:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalAct.g:871:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalAct.g:872:2: ( rule__FQN__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAct.g:872:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalAct.g:881:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:885:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalAct.g:886:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalAct.g:893:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:897:1: ( ( '.' ) )
            // InternalAct.g:898:1: ( '.' )
            {
            // InternalAct.g:898:1: ( '.' )
            // InternalAct.g:899:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAct.g:908:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:912:1: ( rule__FQN__Group_1__1__Impl )
            // InternalAct.g:913:2: rule__FQN__Group_1__1__Impl
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
    // InternalAct.g:919:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:923:1: ( ( RULE_ID ) )
            // InternalAct.g:924:1: ( RULE_ID )
            {
            // InternalAct.g:924:1: ( RULE_ID )
            // InternalAct.g:925:2: RULE_ID
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
    // InternalAct.g:935:1: rule__ActivityDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:939:1: ( ( RULE_STRING ) )
            // InternalAct.g:940:2: ( RULE_STRING )
            {
            // InternalAct.g:940:2: ( RULE_STRING )
            // InternalAct.g:941:3: RULE_STRING
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
    // InternalAct.g:950:1: rule__ActivityDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__ActivityDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:954:1: ( ( ruleRootPackage ) )
            // InternalAct.g:955:2: ( ruleRootPackage )
            {
            // InternalAct.g:955:2: ( ruleRootPackage )
            // InternalAct.g:956:3: ruleRootPackage
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
    // InternalAct.g:965:1: rule__ActivityDiagram__ActivityNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ActivityDiagram__ActivityNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:969:1: ( ( RULE_STRING ) )
            // InternalAct.g:970:2: ( RULE_STRING )
            {
            // InternalAct.g:970:2: ( RULE_STRING )
            // InternalAct.g:971:3: RULE_STRING
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
    // InternalAct.g:980:1: rule__RootPackage__NameAssignment_1_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:984:1: ( ( ruleFQN ) )
            // InternalAct.g:985:2: ( ruleFQN )
            {
            // InternalAct.g:985:2: ( ruleFQN )
            // InternalAct.g:986:3: ruleFQN
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
    // InternalAct.g:995:1: rule__RootPackage__NodesAssignment_2 : ( ruleNode ) ;
    public final void rule__RootPackage__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:999:1: ( ( ruleNode ) )
            // InternalAct.g:1000:2: ( ruleNode )
            {
            // InternalAct.g:1000:2: ( ruleNode )
            // InternalAct.g:1001:3: ruleNode
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


    // $ANTLR start "rule__ActivityNode__NameAssignment_1_0"
    // InternalAct.g:1010:1: rule__ActivityNode__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__ActivityNode__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1014:1: ( ( RULE_ID ) )
            // InternalAct.g:1015:2: ( RULE_ID )
            {
            // InternalAct.g:1015:2: ( RULE_ID )
            // InternalAct.g:1016:3: RULE_ID
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
    // InternalAct.g:1025:1: rule__ActivityNode__NameAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__ActivityNode__NameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1029:1: ( ( RULE_ID ) )
            // InternalAct.g:1030:2: ( RULE_ID )
            {
            // InternalAct.g:1030:2: ( RULE_ID )
            // InternalAct.g:1031:3: RULE_ID
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
    // InternalAct.g:1040:1: rule__ActivityNode__AliasAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__ActivityNode__AliasAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1044:1: ( ( RULE_STRING ) )
            // InternalAct.g:1045:2: ( RULE_STRING )
            {
            // InternalAct.g:1045:2: ( RULE_STRING )
            // InternalAct.g:1046:3: RULE_STRING
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
    // InternalAct.g:1055:1: rule__ControlNode__TypeAssignment_0 : ( ruleNodeType ) ;
    public final void rule__ControlNode__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1059:1: ( ( ruleNodeType ) )
            // InternalAct.g:1060:2: ( ruleNodeType )
            {
            // InternalAct.g:1060:2: ( ruleNodeType )
            // InternalAct.g:1061:3: ruleNodeType
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
    // InternalAct.g:1070:1: rule__ControlNode__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ControlNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAct.g:1074:1: ( ( RULE_STRING ) )
            // InternalAct.g:1075:2: ( RULE_STRING )
            {
            // InternalAct.g:1075:2: ( RULE_STRING )
            // InternalAct.g:1076:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000063800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000043802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});

}