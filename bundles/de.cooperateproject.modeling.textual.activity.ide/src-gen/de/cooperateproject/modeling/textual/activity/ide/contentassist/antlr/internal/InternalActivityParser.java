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
import de.cooperateproject.modeling.textual.activity.services.ActivityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start'", "'end'", "'@startactivity'", "'@endactivity'", "'action'", "'condition'", "':'", "'fork'", "'as'", "'-'", "'note['", "']'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalActivityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActivity.g"; }


     
     	private ActivityGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ActivityGrammarAccess grammarAccess) {
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
    // InternalActivity.g:60:1: entryRuleActivityDiagram : ruleActivityDiagram EOF ;
    public final void entryRuleActivityDiagram() throws RecognitionException {
        try {
            // InternalActivity.g:61:1: ( ruleActivityDiagram EOF )
            // InternalActivity.g:62:1: ruleActivityDiagram EOF
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
    // InternalActivity.g:69:1: ruleActivityDiagram : ( ( rule__ActivityDiagram__Group__0 ) ) ;
    public final void ruleActivityDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:73:2: ( ( ( rule__ActivityDiagram__Group__0 ) ) )
            // InternalActivity.g:74:1: ( ( rule__ActivityDiagram__Group__0 ) )
            {
            // InternalActivity.g:74:1: ( ( rule__ActivityDiagram__Group__0 ) )
            // InternalActivity.g:75:1: ( rule__ActivityDiagram__Group__0 )
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup()); 
            // InternalActivity.g:76:1: ( rule__ActivityDiagram__Group__0 )
            // InternalActivity.g:76:2: rule__ActivityDiagram__Group__0
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


    // $ANTLR start "entryRuleAction"
    // InternalActivity.g:88:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalActivity.g:89:1: ( ruleAction EOF )
            // InternalActivity.g:90:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalActivity.g:97:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:101:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalActivity.g:102:1: ( ( rule__Action__Group__0 ) )
            {
            // InternalActivity.g:102:1: ( ( rule__Action__Group__0 ) )
            // InternalActivity.g:103:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalActivity.g:104:1: ( rule__Action__Group__0 )
            // InternalActivity.g:104:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCondition"
    // InternalActivity.g:116:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalActivity.g:117:1: ( ruleCondition EOF )
            // InternalActivity.g:118:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalActivity.g:125:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:129:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalActivity.g:130:1: ( ( rule__Condition__Group__0 ) )
            {
            // InternalActivity.g:130:1: ( ( rule__Condition__Group__0 ) )
            // InternalActivity.g:131:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalActivity.g:132:1: ( rule__Condition__Group__0 )
            // InternalActivity.g:132:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionEnd"
    // InternalActivity.g:144:1: entryRuleConditionEnd : ruleConditionEnd EOF ;
    public final void entryRuleConditionEnd() throws RecognitionException {
        try {
            // InternalActivity.g:145:1: ( ruleConditionEnd EOF )
            // InternalActivity.g:146:1: ruleConditionEnd EOF
            {
             before(grammarAccess.getConditionEndRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionEnd();

            state._fsp--;

             after(grammarAccess.getConditionEndRule()); 
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
    // $ANTLR end "entryRuleConditionEnd"


    // $ANTLR start "ruleConditionEnd"
    // InternalActivity.g:153:1: ruleConditionEnd : ( ( rule__ConditionEnd__NameAssignment ) ) ;
    public final void ruleConditionEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:157:2: ( ( ( rule__ConditionEnd__NameAssignment ) ) )
            // InternalActivity.g:158:1: ( ( rule__ConditionEnd__NameAssignment ) )
            {
            // InternalActivity.g:158:1: ( ( rule__ConditionEnd__NameAssignment ) )
            // InternalActivity.g:159:1: ( rule__ConditionEnd__NameAssignment )
            {
             before(grammarAccess.getConditionEndAccess().getNameAssignment()); 
            // InternalActivity.g:160:1: ( rule__ConditionEnd__NameAssignment )
            // InternalActivity.g:160:2: rule__ConditionEnd__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConditionEnd__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConditionEndAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleConditionEnd"


    // $ANTLR start "entryRuleFork"
    // InternalActivity.g:172:1: entryRuleFork : ruleFork EOF ;
    public final void entryRuleFork() throws RecognitionException {
        try {
            // InternalActivity.g:173:1: ( ruleFork EOF )
            // InternalActivity.g:174:1: ruleFork EOF
            {
             before(grammarAccess.getForkRule()); 
            pushFollow(FOLLOW_1);
            ruleFork();

            state._fsp--;

             after(grammarAccess.getForkRule()); 
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
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // InternalActivity.g:181:1: ruleFork : ( ( rule__Fork__Group__0 ) ) ;
    public final void ruleFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:185:2: ( ( ( rule__Fork__Group__0 ) ) )
            // InternalActivity.g:186:1: ( ( rule__Fork__Group__0 ) )
            {
            // InternalActivity.g:186:1: ( ( rule__Fork__Group__0 ) )
            // InternalActivity.g:187:1: ( rule__Fork__Group__0 )
            {
             before(grammarAccess.getForkAccess().getGroup()); 
            // InternalActivity.g:188:1: ( rule__Fork__Group__0 )
            // InternalActivity.g:188:2: rule__Fork__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getGroup()); 

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
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleForkEnd"
    // InternalActivity.g:200:1: entryRuleForkEnd : ruleForkEnd EOF ;
    public final void entryRuleForkEnd() throws RecognitionException {
        try {
            // InternalActivity.g:201:1: ( ruleForkEnd EOF )
            // InternalActivity.g:202:1: ruleForkEnd EOF
            {
             before(grammarAccess.getForkEndRule()); 
            pushFollow(FOLLOW_1);
            ruleForkEnd();

            state._fsp--;

             after(grammarAccess.getForkEndRule()); 
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
    // $ANTLR end "entryRuleForkEnd"


    // $ANTLR start "ruleForkEnd"
    // InternalActivity.g:209:1: ruleForkEnd : ( ( rule__ForkEnd__NameAssignment ) ) ;
    public final void ruleForkEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:213:2: ( ( ( rule__ForkEnd__NameAssignment ) ) )
            // InternalActivity.g:214:1: ( ( rule__ForkEnd__NameAssignment ) )
            {
            // InternalActivity.g:214:1: ( ( rule__ForkEnd__NameAssignment ) )
            // InternalActivity.g:215:1: ( rule__ForkEnd__NameAssignment )
            {
             before(grammarAccess.getForkEndAccess().getNameAssignment()); 
            // InternalActivity.g:216:1: ( rule__ForkEnd__NameAssignment )
            // InternalActivity.g:216:2: rule__ForkEnd__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ForkEnd__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getForkEndAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleForkEnd"


    // $ANTLR start "entryRuleName"
    // InternalActivity.g:228:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalActivity.g:229:1: ( ruleName EOF )
            // InternalActivity.g:230:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalActivity.g:237:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:241:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalActivity.g:242:1: ( ( rule__Name__Group__0 ) )
            {
            // InternalActivity.g:242:1: ( ( rule__Name__Group__0 ) )
            // InternalActivity.g:243:1: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalActivity.g:244:1: ( rule__Name__Group__0 )
            // InternalActivity.g:244:2: rule__Name__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleAssociation"
    // InternalActivity.g:256:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalActivity.g:257:1: ( ruleAssociation EOF )
            // InternalActivity.g:258:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalActivity.g:265:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:269:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalActivity.g:270:1: ( ( rule__Association__Group__0 ) )
            {
            // InternalActivity.g:270:1: ( ( rule__Association__Group__0 ) )
            // InternalActivity.g:271:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalActivity.g:272:1: ( rule__Association__Group__0 )
            // InternalActivity.g:272:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleReference"
    // InternalActivity.g:284:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalActivity.g:285:1: ( ruleReference EOF )
            // InternalActivity.g:286:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalActivity.g:293:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:297:2: ( ( ( rule__Reference__Alternatives ) ) )
            // InternalActivity.g:298:1: ( ( rule__Reference__Alternatives ) )
            {
            // InternalActivity.g:298:1: ( ( rule__Reference__Alternatives ) )
            // InternalActivity.g:299:1: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // InternalActivity.g:300:1: ( rule__Reference__Alternatives )
            // InternalActivity.g:300:2: rule__Reference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleActivityElementReference"
    // InternalActivity.g:312:1: entryRuleActivityElementReference : ruleActivityElementReference EOF ;
    public final void entryRuleActivityElementReference() throws RecognitionException {
        try {
            // InternalActivity.g:313:1: ( ruleActivityElementReference EOF )
            // InternalActivity.g:314:1: ruleActivityElementReference EOF
            {
             before(grammarAccess.getActivityElementReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityElementReference();

            state._fsp--;

             after(grammarAccess.getActivityElementReferenceRule()); 
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
    // $ANTLR end "entryRuleActivityElementReference"


    // $ANTLR start "ruleActivityElementReference"
    // InternalActivity.g:321:1: ruleActivityElementReference : ( ( rule__ActivityElementReference__TypeAssignment ) ) ;
    public final void ruleActivityElementReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:325:2: ( ( ( rule__ActivityElementReference__TypeAssignment ) ) )
            // InternalActivity.g:326:1: ( ( rule__ActivityElementReference__TypeAssignment ) )
            {
            // InternalActivity.g:326:1: ( ( rule__ActivityElementReference__TypeAssignment ) )
            // InternalActivity.g:327:1: ( rule__ActivityElementReference__TypeAssignment )
            {
             before(grammarAccess.getActivityElementReferenceAccess().getTypeAssignment()); 
            // InternalActivity.g:328:1: ( rule__ActivityElementReference__TypeAssignment )
            // InternalActivity.g:328:2: rule__ActivityElementReference__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ActivityElementReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActivityElementReferenceAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleActivityElementReference"


    // $ANTLR start "entryRuleStartEndReference"
    // InternalActivity.g:340:1: entryRuleStartEndReference : ruleStartEndReference EOF ;
    public final void entryRuleStartEndReference() throws RecognitionException {
        try {
            // InternalActivity.g:341:1: ( ruleStartEndReference EOF )
            // InternalActivity.g:342:1: ruleStartEndReference EOF
            {
             before(grammarAccess.getStartEndReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleStartEndReference();

            state._fsp--;

             after(grammarAccess.getStartEndReferenceRule()); 
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
    // $ANTLR end "entryRuleStartEndReference"


    // $ANTLR start "ruleStartEndReference"
    // InternalActivity.g:349:1: ruleStartEndReference : ( ( rule__StartEndReference__TypeAssignment ) ) ;
    public final void ruleStartEndReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:353:2: ( ( ( rule__StartEndReference__TypeAssignment ) ) )
            // InternalActivity.g:354:1: ( ( rule__StartEndReference__TypeAssignment ) )
            {
            // InternalActivity.g:354:1: ( ( rule__StartEndReference__TypeAssignment ) )
            // InternalActivity.g:355:1: ( rule__StartEndReference__TypeAssignment )
            {
             before(grammarAccess.getStartEndReferenceAccess().getTypeAssignment()); 
            // InternalActivity.g:356:1: ( rule__StartEndReference__TypeAssignment )
            // InternalActivity.g:356:2: rule__StartEndReference__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StartEndReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStartEndReferenceAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleStartEndReference"


    // $ANTLR start "entryRuleComment"
    // InternalActivity.g:368:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalActivity.g:369:1: ( ruleComment EOF )
            // InternalActivity.g:370:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalActivity.g:377:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:381:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalActivity.g:382:1: ( ( rule__Comment__Group__0 ) )
            {
            // InternalActivity.g:382:1: ( ( rule__Comment__Group__0 ) )
            // InternalActivity.g:383:1: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // InternalActivity.g:384:1: ( rule__Comment__Group__0 )
            // InternalActivity.g:384:2: rule__Comment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getGroup()); 

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "ruleStartEndEnum"
    // InternalActivity.g:397:1: ruleStartEndEnum : ( ( rule__StartEndEnum__Alternatives ) ) ;
    public final void ruleStartEndEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:401:1: ( ( ( rule__StartEndEnum__Alternatives ) ) )
            // InternalActivity.g:402:1: ( ( rule__StartEndEnum__Alternatives ) )
            {
            // InternalActivity.g:402:1: ( ( rule__StartEndEnum__Alternatives ) )
            // InternalActivity.g:403:1: ( rule__StartEndEnum__Alternatives )
            {
             before(grammarAccess.getStartEndEnumAccess().getAlternatives()); 
            // InternalActivity.g:404:1: ( rule__StartEndEnum__Alternatives )
            // InternalActivity.g:404:2: rule__StartEndEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StartEndEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStartEndEnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStartEndEnum"


    // $ANTLR start "rule__ActivityDiagram__Alternatives_2"
    // InternalActivity.g:415:1: rule__ActivityDiagram__Alternatives_2 : ( ( ( rule__ActivityDiagram__ActionsAssignment_2_0 ) ) | ( ( rule__ActivityDiagram__ConditionsAssignment_2_1 ) ) | ( ( rule__ActivityDiagram__ForksAssignment_2_2 ) ) | ( ( rule__ActivityDiagram__AssociationsAssignment_2_3 ) ) );
    public final void rule__ActivityDiagram__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:419:1: ( ( ( rule__ActivityDiagram__ActionsAssignment_2_0 ) ) | ( ( rule__ActivityDiagram__ConditionsAssignment_2_1 ) ) | ( ( rule__ActivityDiagram__ForksAssignment_2_2 ) ) | ( ( rule__ActivityDiagram__AssociationsAssignment_2_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
            case 11:
            case 12:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalActivity.g:420:1: ( ( rule__ActivityDiagram__ActionsAssignment_2_0 ) )
                    {
                    // InternalActivity.g:420:1: ( ( rule__ActivityDiagram__ActionsAssignment_2_0 ) )
                    // InternalActivity.g:421:1: ( rule__ActivityDiagram__ActionsAssignment_2_0 )
                    {
                     before(grammarAccess.getActivityDiagramAccess().getActionsAssignment_2_0()); 
                    // InternalActivity.g:422:1: ( rule__ActivityDiagram__ActionsAssignment_2_0 )
                    // InternalActivity.g:422:2: rule__ActivityDiagram__ActionsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__ActionsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityDiagramAccess().getActionsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivity.g:426:6: ( ( rule__ActivityDiagram__ConditionsAssignment_2_1 ) )
                    {
                    // InternalActivity.g:426:6: ( ( rule__ActivityDiagram__ConditionsAssignment_2_1 ) )
                    // InternalActivity.g:427:1: ( rule__ActivityDiagram__ConditionsAssignment_2_1 )
                    {
                     before(grammarAccess.getActivityDiagramAccess().getConditionsAssignment_2_1()); 
                    // InternalActivity.g:428:1: ( rule__ActivityDiagram__ConditionsAssignment_2_1 )
                    // InternalActivity.g:428:2: rule__ActivityDiagram__ConditionsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__ConditionsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityDiagramAccess().getConditionsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActivity.g:432:6: ( ( rule__ActivityDiagram__ForksAssignment_2_2 ) )
                    {
                    // InternalActivity.g:432:6: ( ( rule__ActivityDiagram__ForksAssignment_2_2 ) )
                    // InternalActivity.g:433:1: ( rule__ActivityDiagram__ForksAssignment_2_2 )
                    {
                     before(grammarAccess.getActivityDiagramAccess().getForksAssignment_2_2()); 
                    // InternalActivity.g:434:1: ( rule__ActivityDiagram__ForksAssignment_2_2 )
                    // InternalActivity.g:434:2: rule__ActivityDiagram__ForksAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__ForksAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityDiagramAccess().getForksAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalActivity.g:438:6: ( ( rule__ActivityDiagram__AssociationsAssignment_2_3 ) )
                    {
                    // InternalActivity.g:438:6: ( ( rule__ActivityDiagram__AssociationsAssignment_2_3 ) )
                    // InternalActivity.g:439:1: ( rule__ActivityDiagram__AssociationsAssignment_2_3 )
                    {
                     before(grammarAccess.getActivityDiagramAccess().getAssociationsAssignment_2_3()); 
                    // InternalActivity.g:440:1: ( rule__ActivityDiagram__AssociationsAssignment_2_3 )
                    // InternalActivity.g:440:2: rule__ActivityDiagram__AssociationsAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__AssociationsAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityDiagramAccess().getAssociationsAssignment_2_3()); 

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
    // $ANTLR end "rule__ActivityDiagram__Alternatives_2"


    // $ANTLR start "rule__Name__LongNameAlternatives_0_0_0"
    // InternalActivity.g:449:1: rule__Name__LongNameAlternatives_0_0_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Name__LongNameAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:453:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
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
                    // InternalActivity.g:454:1: ( RULE_STRING )
                    {
                    // InternalActivity.g:454:1: ( RULE_STRING )
                    // InternalActivity.g:455:1: RULE_STRING
                    {
                     before(grammarAccess.getNameAccess().getLongNameSTRINGTerminalRuleCall_0_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getLongNameSTRINGTerminalRuleCall_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivity.g:460:6: ( RULE_ID )
                    {
                    // InternalActivity.g:460:6: ( RULE_ID )
                    // InternalActivity.g:461:1: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getLongNameIDTerminalRuleCall_0_0_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getLongNameIDTerminalRuleCall_0_0_0_1()); 

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
    // $ANTLR end "rule__Name__LongNameAlternatives_0_0_0"


    // $ANTLR start "rule__Reference__Alternatives"
    // InternalActivity.g:471:1: rule__Reference__Alternatives : ( ( ruleActivityElementReference ) | ( ruleStartEndReference ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:475:1: ( ( ruleActivityElementReference ) | ( ruleStartEndReference ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalActivity.g:476:1: ( ruleActivityElementReference )
                    {
                    // InternalActivity.g:476:1: ( ruleActivityElementReference )
                    // InternalActivity.g:477:1: ruleActivityElementReference
                    {
                     before(grammarAccess.getReferenceAccess().getActivityElementReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActivityElementReference();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getActivityElementReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivity.g:482:6: ( ruleStartEndReference )
                    {
                    // InternalActivity.g:482:6: ( ruleStartEndReference )
                    // InternalActivity.g:483:1: ruleStartEndReference
                    {
                     before(grammarAccess.getReferenceAccess().getStartEndReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStartEndReference();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getStartEndReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Reference__Alternatives"


    // $ANTLR start "rule__StartEndEnum__Alternatives"
    // InternalActivity.g:493:1: rule__StartEndEnum__Alternatives : ( ( ( 'start' ) ) | ( ( 'end' ) ) );
    public final void rule__StartEndEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:497:1: ( ( ( 'start' ) ) | ( ( 'end' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalActivity.g:498:1: ( ( 'start' ) )
                    {
                    // InternalActivity.g:498:1: ( ( 'start' ) )
                    // InternalActivity.g:499:1: ( 'start' )
                    {
                     before(grammarAccess.getStartEndEnumAccess().getSTARTEnumLiteralDeclaration_0()); 
                    // InternalActivity.g:500:1: ( 'start' )
                    // InternalActivity.g:500:3: 'start'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getStartEndEnumAccess().getSTARTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivity.g:505:6: ( ( 'end' ) )
                    {
                    // InternalActivity.g:505:6: ( ( 'end' ) )
                    // InternalActivity.g:506:1: ( 'end' )
                    {
                     before(grammarAccess.getStartEndEnumAccess().getENDEnumLiteralDeclaration_1()); 
                    // InternalActivity.g:507:1: ( 'end' )
                    // InternalActivity.g:507:3: 'end'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getStartEndEnumAccess().getENDEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__StartEndEnum__Alternatives"


    // $ANTLR start "rule__ActivityDiagram__Group__0"
    // InternalActivity.g:519:1: rule__ActivityDiagram__Group__0 : rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 ;
    public final void rule__ActivityDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:523:1: ( rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 )
            // InternalActivity.g:524:2: rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1
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
    // InternalActivity.g:531:1: rule__ActivityDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ActivityDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:535:1: ( ( () ) )
            // InternalActivity.g:536:1: ( () )
            {
            // InternalActivity.g:536:1: ( () )
            // InternalActivity.g:537:1: ()
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); 
            // InternalActivity.g:538:1: ()
            // InternalActivity.g:540:1: 
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
    // InternalActivity.g:550:1: rule__ActivityDiagram__Group__1 : rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 ;
    public final void rule__ActivityDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:554:1: ( rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 )
            // InternalActivity.g:555:2: rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2
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
    // InternalActivity.g:562:1: rule__ActivityDiagram__Group__1__Impl : ( '@startactivity' ) ;
    public final void rule__ActivityDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:566:1: ( ( '@startactivity' ) )
            // InternalActivity.g:567:1: ( '@startactivity' )
            {
            // InternalActivity.g:567:1: ( '@startactivity' )
            // InternalActivity.g:568:1: '@startactivity'
            {
             before(grammarAccess.getActivityDiagramAccess().getStartactivityKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getStartactivityKeyword_1()); 

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
    // InternalActivity.g:581:1: rule__ActivityDiagram__Group__2 : rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 ;
    public final void rule__ActivityDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:585:1: ( rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 )
            // InternalActivity.g:586:2: rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalActivity.g:593:1: rule__ActivityDiagram__Group__2__Impl : ( ( rule__ActivityDiagram__Alternatives_2 )* ) ;
    public final void rule__ActivityDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:597:1: ( ( ( rule__ActivityDiagram__Alternatives_2 )* ) )
            // InternalActivity.g:598:1: ( ( rule__ActivityDiagram__Alternatives_2 )* )
            {
            // InternalActivity.g:598:1: ( ( rule__ActivityDiagram__Alternatives_2 )* )
            // InternalActivity.g:599:1: ( rule__ActivityDiagram__Alternatives_2 )*
            {
             before(grammarAccess.getActivityDiagramAccess().getAlternatives_2()); 
            // InternalActivity.g:600:1: ( rule__ActivityDiagram__Alternatives_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=11 && LA5_0<=12)||(LA5_0>=15 && LA5_0<=16)||LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalActivity.g:600:2: rule__ActivityDiagram__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ActivityDiagram__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getActivityDiagramAccess().getAlternatives_2()); 

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
    // InternalActivity.g:610:1: rule__ActivityDiagram__Group__3 : rule__ActivityDiagram__Group__3__Impl ;
    public final void rule__ActivityDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:614:1: ( rule__ActivityDiagram__Group__3__Impl )
            // InternalActivity.g:615:2: rule__ActivityDiagram__Group__3__Impl
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
    // InternalActivity.g:621:1: rule__ActivityDiagram__Group__3__Impl : ( '@endactivity' ) ;
    public final void rule__ActivityDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:625:1: ( ( '@endactivity' ) )
            // InternalActivity.g:626:1: ( '@endactivity' )
            {
            // InternalActivity.g:626:1: ( '@endactivity' )
            // InternalActivity.g:627:1: '@endactivity'
            {
             before(grammarAccess.getActivityDiagramAccess().getEndactivityKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getEndactivityKeyword_3()); 

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


    // $ANTLR start "rule__Action__Group__0"
    // InternalActivity.g:648:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:652:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalActivity.g:653:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalActivity.g:660:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:664:1: ( ( 'action' ) )
            // InternalActivity.g:665:1: ( 'action' )
            {
            // InternalActivity.g:665:1: ( 'action' )
            // InternalActivity.g:666:1: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalActivity.g:679:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:683:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalActivity.g:684:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalActivity.g:691:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:695:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalActivity.g:696:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalActivity.g:696:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalActivity.g:697:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalActivity.g:698:1: ( rule__Action__NameAssignment_1 )
            // InternalActivity.g:698:2: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalActivity.g:708:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:712:1: ( rule__Action__Group__2__Impl )
            // InternalActivity.g:713:2: rule__Action__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__2__Impl();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalActivity.g:719:1: rule__Action__Group__2__Impl : ( ( rule__Action__CommentAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:723:1: ( ( ( rule__Action__CommentAssignment_2 )? ) )
            // InternalActivity.g:724:1: ( ( rule__Action__CommentAssignment_2 )? )
            {
            // InternalActivity.g:724:1: ( ( rule__Action__CommentAssignment_2 )? )
            // InternalActivity.g:725:1: ( rule__Action__CommentAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getCommentAssignment_2()); 
            // InternalActivity.g:726:1: ( rule__Action__CommentAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalActivity.g:726:2: rule__Action__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__CommentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getCommentAssignment_2()); 

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
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalActivity.g:742:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:746:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalActivity.g:747:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalActivity.g:754:1: rule__Condition__Group__0__Impl : ( 'condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:758:1: ( ( 'condition' ) )
            // InternalActivity.g:759:1: ( 'condition' )
            {
            // InternalActivity.g:759:1: ( 'condition' )
            // InternalActivity.g:760:1: 'condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalActivity.g:773:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:777:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalActivity.g:778:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalActivity.g:785:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ConditionStartAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:789:1: ( ( ( rule__Condition__ConditionStartAssignment_1 ) ) )
            // InternalActivity.g:790:1: ( ( rule__Condition__ConditionStartAssignment_1 ) )
            {
            // InternalActivity.g:790:1: ( ( rule__Condition__ConditionStartAssignment_1 ) )
            // InternalActivity.g:791:1: ( rule__Condition__ConditionStartAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getConditionStartAssignment_1()); 
            // InternalActivity.g:792:1: ( rule__Condition__ConditionStartAssignment_1 )
            // InternalActivity.g:792:2: rule__Condition__ConditionStartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionStartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionStartAssignment_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalActivity.g:802:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:806:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalActivity.g:807:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalActivity.g:814:1: rule__Condition__Group__2__Impl : ( ':' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:818:1: ( ( ':' ) )
            // InternalActivity.g:819:1: ( ':' )
            {
            // InternalActivity.g:819:1: ( ':' )
            // InternalActivity.g:820:1: ':'
            {
             before(grammarAccess.getConditionAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalActivity.g:833:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:837:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalActivity.g:838:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

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
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalActivity.g:845:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__ConditionEndAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:849:1: ( ( ( rule__Condition__ConditionEndAssignment_3 ) ) )
            // InternalActivity.g:850:1: ( ( rule__Condition__ConditionEndAssignment_3 ) )
            {
            // InternalActivity.g:850:1: ( ( rule__Condition__ConditionEndAssignment_3 ) )
            // InternalActivity.g:851:1: ( rule__Condition__ConditionEndAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getConditionEndAssignment_3()); 
            // InternalActivity.g:852:1: ( rule__Condition__ConditionEndAssignment_3 )
            // InternalActivity.g:852:2: rule__Condition__ConditionEndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionEndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionEndAssignment_3()); 

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
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalActivity.g:862:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:866:1: ( rule__Condition__Group__4__Impl )
            // InternalActivity.g:867:2: rule__Condition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__4__Impl();

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
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalActivity.g:873:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__CommentAssignment_4 )? ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:877:1: ( ( ( rule__Condition__CommentAssignment_4 )? ) )
            // InternalActivity.g:878:1: ( ( rule__Condition__CommentAssignment_4 )? )
            {
            // InternalActivity.g:878:1: ( ( rule__Condition__CommentAssignment_4 )? )
            // InternalActivity.g:879:1: ( rule__Condition__CommentAssignment_4 )?
            {
             before(grammarAccess.getConditionAccess().getCommentAssignment_4()); 
            // InternalActivity.g:880:1: ( rule__Condition__CommentAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalActivity.g:880:2: rule__Condition__CommentAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__CommentAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getCommentAssignment_4()); 

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
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Fork__Group__0"
    // InternalActivity.g:900:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:904:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // InternalActivity.g:905:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Fork__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fork__Group__1();

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
    // $ANTLR end "rule__Fork__Group__0"


    // $ANTLR start "rule__Fork__Group__0__Impl"
    // InternalActivity.g:912:1: rule__Fork__Group__0__Impl : ( 'fork' ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:916:1: ( ( 'fork' ) )
            // InternalActivity.g:917:1: ( 'fork' )
            {
            // InternalActivity.g:917:1: ( 'fork' )
            // InternalActivity.g:918:1: 'fork'
            {
             before(grammarAccess.getForkAccess().getForkKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getForkAccess().getForkKeyword_0()); 

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
    // $ANTLR end "rule__Fork__Group__0__Impl"


    // $ANTLR start "rule__Fork__Group__1"
    // InternalActivity.g:931:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:935:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // InternalActivity.g:936:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Fork__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fork__Group__2();

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
    // $ANTLR end "rule__Fork__Group__1"


    // $ANTLR start "rule__Fork__Group__1__Impl"
    // InternalActivity.g:943:1: rule__Fork__Group__1__Impl : ( ( rule__Fork__ForkStartAssignment_1 ) ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:947:1: ( ( ( rule__Fork__ForkStartAssignment_1 ) ) )
            // InternalActivity.g:948:1: ( ( rule__Fork__ForkStartAssignment_1 ) )
            {
            // InternalActivity.g:948:1: ( ( rule__Fork__ForkStartAssignment_1 ) )
            // InternalActivity.g:949:1: ( rule__Fork__ForkStartAssignment_1 )
            {
             before(grammarAccess.getForkAccess().getForkStartAssignment_1()); 
            // InternalActivity.g:950:1: ( rule__Fork__ForkStartAssignment_1 )
            // InternalActivity.g:950:2: rule__Fork__ForkStartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fork__ForkStartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getForkStartAssignment_1()); 

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
    // $ANTLR end "rule__Fork__Group__1__Impl"


    // $ANTLR start "rule__Fork__Group__2"
    // InternalActivity.g:960:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl rule__Fork__Group__3 ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:964:1: ( rule__Fork__Group__2__Impl rule__Fork__Group__3 )
            // InternalActivity.g:965:2: rule__Fork__Group__2__Impl rule__Fork__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Fork__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fork__Group__3();

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
    // $ANTLR end "rule__Fork__Group__2"


    // $ANTLR start "rule__Fork__Group__2__Impl"
    // InternalActivity.g:972:1: rule__Fork__Group__2__Impl : ( ':' ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:976:1: ( ( ':' ) )
            // InternalActivity.g:977:1: ( ':' )
            {
            // InternalActivity.g:977:1: ( ':' )
            // InternalActivity.g:978:1: ':'
            {
             before(grammarAccess.getForkAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getForkAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Fork__Group__2__Impl"


    // $ANTLR start "rule__Fork__Group__3"
    // InternalActivity.g:991:1: rule__Fork__Group__3 : rule__Fork__Group__3__Impl rule__Fork__Group__4 ;
    public final void rule__Fork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:995:1: ( rule__Fork__Group__3__Impl rule__Fork__Group__4 )
            // InternalActivity.g:996:2: rule__Fork__Group__3__Impl rule__Fork__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Fork__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fork__Group__4();

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
    // $ANTLR end "rule__Fork__Group__3"


    // $ANTLR start "rule__Fork__Group__3__Impl"
    // InternalActivity.g:1003:1: rule__Fork__Group__3__Impl : ( ( rule__Fork__ForkEndAssignment_3 ) ) ;
    public final void rule__Fork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1007:1: ( ( ( rule__Fork__ForkEndAssignment_3 ) ) )
            // InternalActivity.g:1008:1: ( ( rule__Fork__ForkEndAssignment_3 ) )
            {
            // InternalActivity.g:1008:1: ( ( rule__Fork__ForkEndAssignment_3 ) )
            // InternalActivity.g:1009:1: ( rule__Fork__ForkEndAssignment_3 )
            {
             before(grammarAccess.getForkAccess().getForkEndAssignment_3()); 
            // InternalActivity.g:1010:1: ( rule__Fork__ForkEndAssignment_3 )
            // InternalActivity.g:1010:2: rule__Fork__ForkEndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Fork__ForkEndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getForkEndAssignment_3()); 

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
    // $ANTLR end "rule__Fork__Group__3__Impl"


    // $ANTLR start "rule__Fork__Group__4"
    // InternalActivity.g:1020:1: rule__Fork__Group__4 : rule__Fork__Group__4__Impl ;
    public final void rule__Fork__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1024:1: ( rule__Fork__Group__4__Impl )
            // InternalActivity.g:1025:2: rule__Fork__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fork__Group__4__Impl();

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
    // $ANTLR end "rule__Fork__Group__4"


    // $ANTLR start "rule__Fork__Group__4__Impl"
    // InternalActivity.g:1031:1: rule__Fork__Group__4__Impl : ( ( rule__Fork__CommentAssignment_4 )? ) ;
    public final void rule__Fork__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1035:1: ( ( ( rule__Fork__CommentAssignment_4 )? ) )
            // InternalActivity.g:1036:1: ( ( rule__Fork__CommentAssignment_4 )? )
            {
            // InternalActivity.g:1036:1: ( ( rule__Fork__CommentAssignment_4 )? )
            // InternalActivity.g:1037:1: ( rule__Fork__CommentAssignment_4 )?
            {
             before(grammarAccess.getForkAccess().getCommentAssignment_4()); 
            // InternalActivity.g:1038:1: ( rule__Fork__CommentAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalActivity.g:1038:2: rule__Fork__CommentAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fork__CommentAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkAccess().getCommentAssignment_4()); 

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
    // $ANTLR end "rule__Fork__Group__4__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // InternalActivity.g:1058:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1062:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalActivity.g:1063:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__1();

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
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalActivity.g:1070:1: rule__Name__Group__0__Impl : ( ( rule__Name__Group_0__0 )? ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1074:1: ( ( ( rule__Name__Group_0__0 )? ) )
            // InternalActivity.g:1075:1: ( ( rule__Name__Group_0__0 )? )
            {
            // InternalActivity.g:1075:1: ( ( rule__Name__Group_0__0 )? )
            // InternalActivity.g:1076:1: ( rule__Name__Group_0__0 )?
            {
             before(grammarAccess.getNameAccess().getGroup_0()); 
            // InternalActivity.g:1077:1: ( rule__Name__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==19) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalActivity.g:1077:2: rule__Name__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Name__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNameAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // InternalActivity.g:1087:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1091:1: ( rule__Name__Group__1__Impl )
            // InternalActivity.g:1092:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__1__Impl();

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
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalActivity.g:1098:1: rule__Name__Group__1__Impl : ( ( rule__Name__NameAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1102:1: ( ( ( rule__Name__NameAssignment_1 ) ) )
            // InternalActivity.g:1103:1: ( ( rule__Name__NameAssignment_1 ) )
            {
            // InternalActivity.g:1103:1: ( ( rule__Name__NameAssignment_1 ) )
            // InternalActivity.g:1104:1: ( rule__Name__NameAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1()); 
            // InternalActivity.g:1105:1: ( rule__Name__NameAssignment_1 )
            // InternalActivity.g:1105:2: rule__Name__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Name__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__Name__Group_0__0"
    // InternalActivity.g:1119:1: rule__Name__Group_0__0 : rule__Name__Group_0__0__Impl rule__Name__Group_0__1 ;
    public final void rule__Name__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1123:1: ( rule__Name__Group_0__0__Impl rule__Name__Group_0__1 )
            // InternalActivity.g:1124:2: rule__Name__Group_0__0__Impl rule__Name__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Name__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group_0__1();

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
    // $ANTLR end "rule__Name__Group_0__0"


    // $ANTLR start "rule__Name__Group_0__0__Impl"
    // InternalActivity.g:1131:1: rule__Name__Group_0__0__Impl : ( ( rule__Name__LongNameAssignment_0_0 ) ) ;
    public final void rule__Name__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1135:1: ( ( ( rule__Name__LongNameAssignment_0_0 ) ) )
            // InternalActivity.g:1136:1: ( ( rule__Name__LongNameAssignment_0_0 ) )
            {
            // InternalActivity.g:1136:1: ( ( rule__Name__LongNameAssignment_0_0 ) )
            // InternalActivity.g:1137:1: ( rule__Name__LongNameAssignment_0_0 )
            {
             before(grammarAccess.getNameAccess().getLongNameAssignment_0_0()); 
            // InternalActivity.g:1138:1: ( rule__Name__LongNameAssignment_0_0 )
            // InternalActivity.g:1138:2: rule__Name__LongNameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Name__LongNameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getLongNameAssignment_0_0()); 

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
    // $ANTLR end "rule__Name__Group_0__0__Impl"


    // $ANTLR start "rule__Name__Group_0__1"
    // InternalActivity.g:1148:1: rule__Name__Group_0__1 : rule__Name__Group_0__1__Impl ;
    public final void rule__Name__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1152:1: ( rule__Name__Group_0__1__Impl )
            // InternalActivity.g:1153:2: rule__Name__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group_0__1__Impl();

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
    // $ANTLR end "rule__Name__Group_0__1"


    // $ANTLR start "rule__Name__Group_0__1__Impl"
    // InternalActivity.g:1159:1: rule__Name__Group_0__1__Impl : ( 'as' ) ;
    public final void rule__Name__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1163:1: ( ( 'as' ) )
            // InternalActivity.g:1164:1: ( 'as' )
            {
            // InternalActivity.g:1164:1: ( 'as' )
            // InternalActivity.g:1165:1: 'as'
            {
             before(grammarAccess.getNameAccess().getAsKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getAsKeyword_0_1()); 

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
    // $ANTLR end "rule__Name__Group_0__1__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // InternalActivity.g:1182:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1186:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalActivity.g:1187:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

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
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalActivity.g:1194:1: rule__Association__Group__0__Impl : ( ( rule__Association__LeftAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1198:1: ( ( ( rule__Association__LeftAssignment_0 ) ) )
            // InternalActivity.g:1199:1: ( ( rule__Association__LeftAssignment_0 ) )
            {
            // InternalActivity.g:1199:1: ( ( rule__Association__LeftAssignment_0 ) )
            // InternalActivity.g:1200:1: ( rule__Association__LeftAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getLeftAssignment_0()); 
            // InternalActivity.g:1201:1: ( rule__Association__LeftAssignment_0 )
            // InternalActivity.g:1201:2: rule__Association__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Association__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalActivity.g:1211:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1215:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalActivity.g:1216:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

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
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalActivity.g:1223:1: rule__Association__Group__1__Impl : ( '-' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1227:1: ( ( '-' ) )
            // InternalActivity.g:1228:1: ( '-' )
            {
            // InternalActivity.g:1228:1: ( '-' )
            // InternalActivity.g:1229:1: '-'
            {
             before(grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalActivity.g:1242:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1246:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalActivity.g:1247:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

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
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalActivity.g:1254:1: rule__Association__Group__2__Impl : ( ( rule__Association__RightAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1258:1: ( ( ( rule__Association__RightAssignment_2 ) ) )
            // InternalActivity.g:1259:1: ( ( rule__Association__RightAssignment_2 ) )
            {
            // InternalActivity.g:1259:1: ( ( rule__Association__RightAssignment_2 ) )
            // InternalActivity.g:1260:1: ( rule__Association__RightAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getRightAssignment_2()); 
            // InternalActivity.g:1261:1: ( rule__Association__RightAssignment_2 )
            // InternalActivity.g:1261:2: rule__Association__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // InternalActivity.g:1271:1: rule__Association__Group__3 : rule__Association__Group__3__Impl ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1275:1: ( rule__Association__Group__3__Impl )
            // InternalActivity.g:1276:2: rule__Association__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__3__Impl();

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
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalActivity.g:1282:1: rule__Association__Group__3__Impl : ( ( rule__Association__CommentAssignment_3 )? ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1286:1: ( ( ( rule__Association__CommentAssignment_3 )? ) )
            // InternalActivity.g:1287:1: ( ( rule__Association__CommentAssignment_3 )? )
            {
            // InternalActivity.g:1287:1: ( ( rule__Association__CommentAssignment_3 )? )
            // InternalActivity.g:1288:1: ( rule__Association__CommentAssignment_3 )?
            {
             before(grammarAccess.getAssociationAccess().getCommentAssignment_3()); 
            // InternalActivity.g:1289:1: ( rule__Association__CommentAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalActivity.g:1289:2: rule__Association__CommentAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__CommentAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getCommentAssignment_3()); 

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
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Comment__Group__0"
    // InternalActivity.g:1307:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1311:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalActivity.g:1312:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Comment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__1();

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
    // $ANTLR end "rule__Comment__Group__0"


    // $ANTLR start "rule__Comment__Group__0__Impl"
    // InternalActivity.g:1319:1: rule__Comment__Group__0__Impl : ( 'note[' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1323:1: ( ( 'note[' ) )
            // InternalActivity.g:1324:1: ( 'note[' )
            {
            // InternalActivity.g:1324:1: ( 'note[' )
            // InternalActivity.g:1325:1: 'note['
            {
             before(grammarAccess.getCommentAccess().getNoteKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getNoteKeyword_0()); 

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
    // $ANTLR end "rule__Comment__Group__0__Impl"


    // $ANTLR start "rule__Comment__Group__1"
    // InternalActivity.g:1338:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl rule__Comment__Group__2 ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1342:1: ( rule__Comment__Group__1__Impl rule__Comment__Group__2 )
            // InternalActivity.g:1343:2: rule__Comment__Group__1__Impl rule__Comment__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Comment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__2();

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
    // $ANTLR end "rule__Comment__Group__1"


    // $ANTLR start "rule__Comment__Group__1__Impl"
    // InternalActivity.g:1350:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__DescriptionAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1354:1: ( ( ( rule__Comment__DescriptionAssignment_1 ) ) )
            // InternalActivity.g:1355:1: ( ( rule__Comment__DescriptionAssignment_1 ) )
            {
            // InternalActivity.g:1355:1: ( ( rule__Comment__DescriptionAssignment_1 ) )
            // InternalActivity.g:1356:1: ( rule__Comment__DescriptionAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getDescriptionAssignment_1()); 
            // InternalActivity.g:1357:1: ( rule__Comment__DescriptionAssignment_1 )
            // InternalActivity.g:1357:2: rule__Comment__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comment__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__Comment__Group__1__Impl"


    // $ANTLR start "rule__Comment__Group__2"
    // InternalActivity.g:1367:1: rule__Comment__Group__2 : rule__Comment__Group__2__Impl ;
    public final void rule__Comment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1371:1: ( rule__Comment__Group__2__Impl )
            // InternalActivity.g:1372:2: rule__Comment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__2__Impl();

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
    // $ANTLR end "rule__Comment__Group__2"


    // $ANTLR start "rule__Comment__Group__2__Impl"
    // InternalActivity.g:1378:1: rule__Comment__Group__2__Impl : ( ']' ) ;
    public final void rule__Comment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1382:1: ( ( ']' ) )
            // InternalActivity.g:1383:1: ( ']' )
            {
            // InternalActivity.g:1383:1: ( ']' )
            // InternalActivity.g:1384:1: ']'
            {
             before(grammarAccess.getCommentAccess().getRightSquareBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Comment__Group__2__Impl"


    // $ANTLR start "rule__ActivityDiagram__ActionsAssignment_2_0"
    // InternalActivity.g:1404:1: rule__ActivityDiagram__ActionsAssignment_2_0 : ( ruleAction ) ;
    public final void rule__ActivityDiagram__ActionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1408:1: ( ( ruleAction ) )
            // InternalActivity.g:1409:1: ( ruleAction )
            {
            // InternalActivity.g:1409:1: ( ruleAction )
            // InternalActivity.g:1410:1: ruleAction
            {
             before(grammarAccess.getActivityDiagramAccess().getActionsActionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getActionsActionParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__ActivityDiagram__ActionsAssignment_2_0"


    // $ANTLR start "rule__ActivityDiagram__ConditionsAssignment_2_1"
    // InternalActivity.g:1419:1: rule__ActivityDiagram__ConditionsAssignment_2_1 : ( ruleCondition ) ;
    public final void rule__ActivityDiagram__ConditionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1423:1: ( ( ruleCondition ) )
            // InternalActivity.g:1424:1: ( ruleCondition )
            {
            // InternalActivity.g:1424:1: ( ruleCondition )
            // InternalActivity.g:1425:1: ruleCondition
            {
             before(grammarAccess.getActivityDiagramAccess().getConditionsConditionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getConditionsConditionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ActivityDiagram__ConditionsAssignment_2_1"


    // $ANTLR start "rule__ActivityDiagram__ForksAssignment_2_2"
    // InternalActivity.g:1434:1: rule__ActivityDiagram__ForksAssignment_2_2 : ( ruleFork ) ;
    public final void rule__ActivityDiagram__ForksAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1438:1: ( ( ruleFork ) )
            // InternalActivity.g:1439:1: ( ruleFork )
            {
            // InternalActivity.g:1439:1: ( ruleFork )
            // InternalActivity.g:1440:1: ruleFork
            {
             before(grammarAccess.getActivityDiagramAccess().getForksForkParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFork();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getForksForkParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__ActivityDiagram__ForksAssignment_2_2"


    // $ANTLR start "rule__ActivityDiagram__AssociationsAssignment_2_3"
    // InternalActivity.g:1449:1: rule__ActivityDiagram__AssociationsAssignment_2_3 : ( ruleAssociation ) ;
    public final void rule__ActivityDiagram__AssociationsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1453:1: ( ( ruleAssociation ) )
            // InternalActivity.g:1454:1: ( ruleAssociation )
            {
            // InternalActivity.g:1454:1: ( ruleAssociation )
            // InternalActivity.g:1455:1: ruleAssociation
            {
             before(grammarAccess.getActivityDiagramAccess().getAssociationsAssociationParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getAssociationsAssociationParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__ActivityDiagram__AssociationsAssignment_2_3"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // InternalActivity.g:1464:1: rule__Action__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1468:1: ( ( ruleName ) )
            // InternalActivity.g:1469:1: ( ruleName )
            {
            // InternalActivity.g:1469:1: ( ruleName )
            // InternalActivity.g:1470:1: ruleName
            {
             before(grammarAccess.getActionAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNameNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Action__NameAssignment_1"


    // $ANTLR start "rule__Action__CommentAssignment_2"
    // InternalActivity.g:1479:1: rule__Action__CommentAssignment_2 : ( ruleComment ) ;
    public final void rule__Action__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1483:1: ( ( ruleComment ) )
            // InternalActivity.g:1484:1: ( ruleComment )
            {
            // InternalActivity.g:1484:1: ( ruleComment )
            // InternalActivity.g:1485:1: ruleComment
            {
             before(grammarAccess.getActionAccess().getCommentCommentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getActionAccess().getCommentCommentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Action__CommentAssignment_2"


    // $ANTLR start "rule__Condition__ConditionStartAssignment_1"
    // InternalActivity.g:1494:1: rule__Condition__ConditionStartAssignment_1 : ( ruleConditionEnd ) ;
    public final void rule__Condition__ConditionStartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1498:1: ( ( ruleConditionEnd ) )
            // InternalActivity.g:1499:1: ( ruleConditionEnd )
            {
            // InternalActivity.g:1499:1: ( ruleConditionEnd )
            // InternalActivity.g:1500:1: ruleConditionEnd
            {
             before(grammarAccess.getConditionAccess().getConditionStartConditionEndParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionEnd();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getConditionStartConditionEndParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Condition__ConditionStartAssignment_1"


    // $ANTLR start "rule__Condition__ConditionEndAssignment_3"
    // InternalActivity.g:1509:1: rule__Condition__ConditionEndAssignment_3 : ( ruleConditionEnd ) ;
    public final void rule__Condition__ConditionEndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1513:1: ( ( ruleConditionEnd ) )
            // InternalActivity.g:1514:1: ( ruleConditionEnd )
            {
            // InternalActivity.g:1514:1: ( ruleConditionEnd )
            // InternalActivity.g:1515:1: ruleConditionEnd
            {
             before(grammarAccess.getConditionAccess().getConditionEndConditionEndParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionEnd();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getConditionEndConditionEndParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Condition__ConditionEndAssignment_3"


    // $ANTLR start "rule__Condition__CommentAssignment_4"
    // InternalActivity.g:1524:1: rule__Condition__CommentAssignment_4 : ( ruleComment ) ;
    public final void rule__Condition__CommentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1528:1: ( ( ruleComment ) )
            // InternalActivity.g:1529:1: ( ruleComment )
            {
            // InternalActivity.g:1529:1: ( ruleComment )
            // InternalActivity.g:1530:1: ruleComment
            {
             before(grammarAccess.getConditionAccess().getCommentCommentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getCommentCommentParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Condition__CommentAssignment_4"


    // $ANTLR start "rule__ConditionEnd__NameAssignment"
    // InternalActivity.g:1539:1: rule__ConditionEnd__NameAssignment : ( ruleName ) ;
    public final void rule__ConditionEnd__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1543:1: ( ( ruleName ) )
            // InternalActivity.g:1544:1: ( ruleName )
            {
            // InternalActivity.g:1544:1: ( ruleName )
            // InternalActivity.g:1545:1: ruleName
            {
             before(grammarAccess.getConditionEndAccess().getNameNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getConditionEndAccess().getNameNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__ConditionEnd__NameAssignment"


    // $ANTLR start "rule__Fork__ForkStartAssignment_1"
    // InternalActivity.g:1554:1: rule__Fork__ForkStartAssignment_1 : ( ruleForkEnd ) ;
    public final void rule__Fork__ForkStartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1558:1: ( ( ruleForkEnd ) )
            // InternalActivity.g:1559:1: ( ruleForkEnd )
            {
            // InternalActivity.g:1559:1: ( ruleForkEnd )
            // InternalActivity.g:1560:1: ruleForkEnd
            {
             before(grammarAccess.getForkAccess().getForkStartForkEndParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleForkEnd();

            state._fsp--;

             after(grammarAccess.getForkAccess().getForkStartForkEndParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fork__ForkStartAssignment_1"


    // $ANTLR start "rule__Fork__ForkEndAssignment_3"
    // InternalActivity.g:1569:1: rule__Fork__ForkEndAssignment_3 : ( ruleForkEnd ) ;
    public final void rule__Fork__ForkEndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1573:1: ( ( ruleForkEnd ) )
            // InternalActivity.g:1574:1: ( ruleForkEnd )
            {
            // InternalActivity.g:1574:1: ( ruleForkEnd )
            // InternalActivity.g:1575:1: ruleForkEnd
            {
             before(grammarAccess.getForkAccess().getForkEndForkEndParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleForkEnd();

            state._fsp--;

             after(grammarAccess.getForkAccess().getForkEndForkEndParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Fork__ForkEndAssignment_3"


    // $ANTLR start "rule__Fork__CommentAssignment_4"
    // InternalActivity.g:1584:1: rule__Fork__CommentAssignment_4 : ( ruleComment ) ;
    public final void rule__Fork__CommentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1588:1: ( ( ruleComment ) )
            // InternalActivity.g:1589:1: ( ruleComment )
            {
            // InternalActivity.g:1589:1: ( ruleComment )
            // InternalActivity.g:1590:1: ruleComment
            {
             before(grammarAccess.getForkAccess().getCommentCommentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getForkAccess().getCommentCommentParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Fork__CommentAssignment_4"


    // $ANTLR start "rule__ForkEnd__NameAssignment"
    // InternalActivity.g:1599:1: rule__ForkEnd__NameAssignment : ( ruleName ) ;
    public final void rule__ForkEnd__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1603:1: ( ( ruleName ) )
            // InternalActivity.g:1604:1: ( ruleName )
            {
            // InternalActivity.g:1604:1: ( ruleName )
            // InternalActivity.g:1605:1: ruleName
            {
             before(grammarAccess.getForkEndAccess().getNameNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getForkEndAccess().getNameNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__ForkEnd__NameAssignment"


    // $ANTLR start "rule__Name__LongNameAssignment_0_0"
    // InternalActivity.g:1614:1: rule__Name__LongNameAssignment_0_0 : ( ( rule__Name__LongNameAlternatives_0_0_0 ) ) ;
    public final void rule__Name__LongNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1618:1: ( ( ( rule__Name__LongNameAlternatives_0_0_0 ) ) )
            // InternalActivity.g:1619:1: ( ( rule__Name__LongNameAlternatives_0_0_0 ) )
            {
            // InternalActivity.g:1619:1: ( ( rule__Name__LongNameAlternatives_0_0_0 ) )
            // InternalActivity.g:1620:1: ( rule__Name__LongNameAlternatives_0_0_0 )
            {
             before(grammarAccess.getNameAccess().getLongNameAlternatives_0_0_0()); 
            // InternalActivity.g:1621:1: ( rule__Name__LongNameAlternatives_0_0_0 )
            // InternalActivity.g:1621:2: rule__Name__LongNameAlternatives_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Name__LongNameAlternatives_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getLongNameAlternatives_0_0_0()); 

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
    // $ANTLR end "rule__Name__LongNameAssignment_0_0"


    // $ANTLR start "rule__Name__NameAssignment_1"
    // InternalActivity.g:1630:1: rule__Name__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1634:1: ( ( RULE_ID ) )
            // InternalActivity.g:1635:1: ( RULE_ID )
            {
            // InternalActivity.g:1635:1: ( RULE_ID )
            // InternalActivity.g:1636:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Name__NameAssignment_1"


    // $ANTLR start "rule__Association__LeftAssignment_0"
    // InternalActivity.g:1645:1: rule__Association__LeftAssignment_0 : ( ruleReference ) ;
    public final void rule__Association__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1649:1: ( ( ruleReference ) )
            // InternalActivity.g:1650:1: ( ruleReference )
            {
            // InternalActivity.g:1650:1: ( ruleReference )
            // InternalActivity.g:1651:1: ruleReference
            {
             before(grammarAccess.getAssociationAccess().getLeftReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getLeftReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Association__LeftAssignment_0"


    // $ANTLR start "rule__Association__RightAssignment_2"
    // InternalActivity.g:1660:1: rule__Association__RightAssignment_2 : ( ruleReference ) ;
    public final void rule__Association__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1664:1: ( ( ruleReference ) )
            // InternalActivity.g:1665:1: ( ruleReference )
            {
            // InternalActivity.g:1665:1: ( ruleReference )
            // InternalActivity.g:1666:1: ruleReference
            {
             before(grammarAccess.getAssociationAccess().getRightReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRightReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Association__RightAssignment_2"


    // $ANTLR start "rule__Association__CommentAssignment_3"
    // InternalActivity.g:1675:1: rule__Association__CommentAssignment_3 : ( ruleComment ) ;
    public final void rule__Association__CommentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1679:1: ( ( ruleComment ) )
            // InternalActivity.g:1680:1: ( ruleComment )
            {
            // InternalActivity.g:1680:1: ( ruleComment )
            // InternalActivity.g:1681:1: ruleComment
            {
             before(grammarAccess.getAssociationAccess().getCommentCommentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getCommentCommentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Association__CommentAssignment_3"


    // $ANTLR start "rule__ActivityElementReference__TypeAssignment"
    // InternalActivity.g:1690:1: rule__ActivityElementReference__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ActivityElementReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1694:1: ( ( ( RULE_ID ) ) )
            // InternalActivity.g:1695:1: ( ( RULE_ID ) )
            {
            // InternalActivity.g:1695:1: ( ( RULE_ID ) )
            // InternalActivity.g:1696:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityElementReferenceAccess().getTypeNameCrossReference_0()); 
            // InternalActivity.g:1697:1: ( RULE_ID )
            // InternalActivity.g:1698:1: RULE_ID
            {
             before(grammarAccess.getActivityElementReferenceAccess().getTypeNameIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityElementReferenceAccess().getTypeNameIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getActivityElementReferenceAccess().getTypeNameCrossReference_0()); 

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
    // $ANTLR end "rule__ActivityElementReference__TypeAssignment"


    // $ANTLR start "rule__StartEndReference__TypeAssignment"
    // InternalActivity.g:1709:1: rule__StartEndReference__TypeAssignment : ( ruleStartEndEnum ) ;
    public final void rule__StartEndReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1713:1: ( ( ruleStartEndEnum ) )
            // InternalActivity.g:1714:1: ( ruleStartEndEnum )
            {
            // InternalActivity.g:1714:1: ( ruleStartEndEnum )
            // InternalActivity.g:1715:1: ruleStartEndEnum
            {
             before(grammarAccess.getStartEndReferenceAccess().getTypeStartEndEnumEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStartEndEnum();

            state._fsp--;

             after(grammarAccess.getStartEndReferenceAccess().getTypeStartEndEnumEnumRuleCall_0()); 

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
    // $ANTLR end "rule__StartEndReference__TypeAssignment"


    // $ANTLR start "rule__Comment__DescriptionAssignment_1"
    // InternalActivity.g:1724:1: rule__Comment__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Comment__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActivity.g:1728:1: ( ( RULE_STRING ) )
            // InternalActivity.g:1729:1: ( RULE_STRING )
            {
            // InternalActivity.g:1729:1: ( RULE_STRING )
            // InternalActivity.g:1730:1: RULE_STRING
            {
             before(grammarAccess.getCommentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Comment__DescriptionAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000005D820L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000059822L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000059820L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});

}