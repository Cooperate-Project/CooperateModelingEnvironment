package de.cooperateproject.modeling.textual.sequence.ide.contentassist.antlr.internal;

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
import de.cooperateproject.modeling.textual.sequence.services.SequenceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSequenceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'sync'", "'async'", "'human'", "'machine'", "'d'", "'t'", "'max'", "'diff'", "'@start-seqd'", "'@end-seqd'", "'rootElement'", "'act'", "'as'", "'role['", "']'", "':'", "'{'", "'}'", "'num['", "'time['", "'='", "'('", "','", "')'", "'reply'", "'found'", "'lost'", "'create'", "'dest'", "'alt'", "'opt'", "'par'", "'critical'", "'loop'", "'['", "'.'", "'def'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSequenceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSequenceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSequenceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSequence.g"; }


    	private SequenceGrammarAccess grammarAccess;

    	public void setGrammarAccess(SequenceGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSequenceDiagram"
    // InternalSequence.g:53:1: entryRuleSequenceDiagram : ruleSequenceDiagram EOF ;
    public final void entryRuleSequenceDiagram() throws RecognitionException {
        try {
            // InternalSequence.g:54:1: ( ruleSequenceDiagram EOF )
            // InternalSequence.g:55:1: ruleSequenceDiagram EOF
            {
             before(grammarAccess.getSequenceDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceDiagram();

            state._fsp--;

             after(grammarAccess.getSequenceDiagramRule()); 
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
    // $ANTLR end "entryRuleSequenceDiagram"


    // $ANTLR start "ruleSequenceDiagram"
    // InternalSequence.g:62:1: ruleSequenceDiagram : ( ( rule__SequenceDiagram__Group__0 ) ) ;
    public final void ruleSequenceDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:66:2: ( ( ( rule__SequenceDiagram__Group__0 ) ) )
            // InternalSequence.g:67:2: ( ( rule__SequenceDiagram__Group__0 ) )
            {
            // InternalSequence.g:67:2: ( ( rule__SequenceDiagram__Group__0 ) )
            // InternalSequence.g:68:3: ( rule__SequenceDiagram__Group__0 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getGroup()); 
            // InternalSequence.g:69:3: ( rule__SequenceDiagram__Group__0 )
            // InternalSequence.g:69:4: rule__SequenceDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceDiagram"


    // $ANTLR start "entryRuleRootPackage"
    // InternalSequence.g:78:1: entryRuleRootPackage : ruleRootPackage EOF ;
    public final void entryRuleRootPackage() throws RecognitionException {
        try {
            // InternalSequence.g:79:1: ( ruleRootPackage EOF )
            // InternalSequence.g:80:1: ruleRootPackage EOF
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
    // InternalSequence.g:87:1: ruleRootPackage : ( ( rule__RootPackage__Group__0 ) ) ;
    public final void ruleRootPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:91:2: ( ( ( rule__RootPackage__Group__0 ) ) )
            // InternalSequence.g:92:2: ( ( rule__RootPackage__Group__0 ) )
            {
            // InternalSequence.g:92:2: ( ( rule__RootPackage__Group__0 ) )
            // InternalSequence.g:93:3: ( rule__RootPackage__Group__0 )
            {
             before(grammarAccess.getRootPackageAccess().getGroup()); 
            // InternalSequence.g:94:3: ( rule__RootPackage__Group__0 )
            // InternalSequence.g:94:4: rule__RootPackage__Group__0
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


    // $ANTLR start "entryRuleActor"
    // InternalSequence.g:103:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalSequence.g:104:1: ( ruleActor EOF )
            // InternalSequence.g:105:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalSequence.g:112:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:116:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalSequence.g:117:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalSequence.g:117:2: ( ( rule__Actor__Group__0 ) )
            // InternalSequence.g:118:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalSequence.g:119:3: ( rule__Actor__Group__0 )
            // InternalSequence.g:119:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleActorClassifierMapping"
    // InternalSequence.g:128:1: entryRuleActorClassifierMapping : ruleActorClassifierMapping EOF ;
    public final void entryRuleActorClassifierMapping() throws RecognitionException {
        try {
            // InternalSequence.g:129:1: ( ruleActorClassifierMapping EOF )
            // InternalSequence.g:130:1: ruleActorClassifierMapping EOF
            {
             before(grammarAccess.getActorClassifierMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleActorClassifierMapping();

            state._fsp--;

             after(grammarAccess.getActorClassifierMappingRule()); 
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
    // $ANTLR end "entryRuleActorClassifierMapping"


    // $ANTLR start "ruleActorClassifierMapping"
    // InternalSequence.g:137:1: ruleActorClassifierMapping : ( ( rule__ActorClassifierMapping__Group__0 ) ) ;
    public final void ruleActorClassifierMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:141:2: ( ( ( rule__ActorClassifierMapping__Group__0 ) ) )
            // InternalSequence.g:142:2: ( ( rule__ActorClassifierMapping__Group__0 ) )
            {
            // InternalSequence.g:142:2: ( ( rule__ActorClassifierMapping__Group__0 ) )
            // InternalSequence.g:143:3: ( rule__ActorClassifierMapping__Group__0 )
            {
             before(grammarAccess.getActorClassifierMappingAccess().getGroup()); 
            // InternalSequence.g:144:3: ( rule__ActorClassifierMapping__Group__0 )
            // InternalSequence.g:144:4: rule__ActorClassifierMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActorClassifierMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorClassifierMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActorClassifierMapping"


    // $ANTLR start "entryRuleBehaviorFragment"
    // InternalSequence.g:153:1: entryRuleBehaviorFragment : ruleBehaviorFragment EOF ;
    public final void entryRuleBehaviorFragment() throws RecognitionException {
        try {
            // InternalSequence.g:154:1: ( ruleBehaviorFragment EOF )
            // InternalSequence.g:155:1: ruleBehaviorFragment EOF
            {
             before(grammarAccess.getBehaviorFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviorFragment();

            state._fsp--;

             after(grammarAccess.getBehaviorFragmentRule()); 
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
    // $ANTLR end "entryRuleBehaviorFragment"


    // $ANTLR start "ruleBehaviorFragment"
    // InternalSequence.g:162:1: ruleBehaviorFragment : ( ( rule__BehaviorFragment__Alternatives ) ) ;
    public final void ruleBehaviorFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:166:2: ( ( ( rule__BehaviorFragment__Alternatives ) ) )
            // InternalSequence.g:167:2: ( ( rule__BehaviorFragment__Alternatives ) )
            {
            // InternalSequence.g:167:2: ( ( rule__BehaviorFragment__Alternatives ) )
            // InternalSequence.g:168:3: ( rule__BehaviorFragment__Alternatives )
            {
             before(grammarAccess.getBehaviorFragmentAccess().getAlternatives()); 
            // InternalSequence.g:169:3: ( rule__BehaviorFragment__Alternatives )
            // InternalSequence.g:169:4: rule__BehaviorFragment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorFragment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviorFragment"


    // $ANTLR start "entryRuleBehaviorFragments"
    // InternalSequence.g:178:1: entryRuleBehaviorFragments : ruleBehaviorFragments EOF ;
    public final void entryRuleBehaviorFragments() throws RecognitionException {
        try {
            // InternalSequence.g:179:1: ( ruleBehaviorFragments EOF )
            // InternalSequence.g:180:1: ruleBehaviorFragments EOF
            {
             before(grammarAccess.getBehaviorFragmentsRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviorFragments();

            state._fsp--;

             after(grammarAccess.getBehaviorFragmentsRule()); 
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
    // $ANTLR end "entryRuleBehaviorFragments"


    // $ANTLR start "ruleBehaviorFragments"
    // InternalSequence.g:187:1: ruleBehaviorFragments : ( ( rule__BehaviorFragments__Alternatives ) ) ;
    public final void ruleBehaviorFragments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:191:2: ( ( ( rule__BehaviorFragments__Alternatives ) ) )
            // InternalSequence.g:192:2: ( ( rule__BehaviorFragments__Alternatives ) )
            {
            // InternalSequence.g:192:2: ( ( rule__BehaviorFragments__Alternatives ) )
            // InternalSequence.g:193:3: ( rule__BehaviorFragments__Alternatives )
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getAlternatives()); 
            // InternalSequence.g:194:3: ( rule__BehaviorFragments__Alternatives )
            // InternalSequence.g:194:4: rule__BehaviorFragments__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorFragments__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviorFragments"


    // $ANTLR start "entryRuleMessage"
    // InternalSequence.g:203:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalSequence.g:204:1: ( ruleMessage EOF )
            // InternalSequence.g:205:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalSequence.g:212:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:216:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalSequence.g:217:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalSequence.g:217:2: ( ( rule__Message__Group__0 ) )
            // InternalSequence.g:218:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalSequence.g:219:3: ( rule__Message__Group__0 )
            // InternalSequence.g:219:4: rule__Message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleTimeConstraint"
    // InternalSequence.g:228:1: entryRuleTimeConstraint : ruleTimeConstraint EOF ;
    public final void entryRuleTimeConstraint() throws RecognitionException {
        try {
            // InternalSequence.g:229:1: ( ruleTimeConstraint EOF )
            // InternalSequence.g:230:1: ruleTimeConstraint EOF
            {
             before(grammarAccess.getTimeConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeConstraint();

            state._fsp--;

             after(grammarAccess.getTimeConstraintRule()); 
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
    // $ANTLR end "entryRuleTimeConstraint"


    // $ANTLR start "ruleTimeConstraint"
    // InternalSequence.g:237:1: ruleTimeConstraint : ( ( rule__TimeConstraint__Group__0 ) ) ;
    public final void ruleTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:241:2: ( ( ( rule__TimeConstraint__Group__0 ) ) )
            // InternalSequence.g:242:2: ( ( rule__TimeConstraint__Group__0 ) )
            {
            // InternalSequence.g:242:2: ( ( rule__TimeConstraint__Group__0 ) )
            // InternalSequence.g:243:3: ( rule__TimeConstraint__Group__0 )
            {
             before(grammarAccess.getTimeConstraintAccess().getGroup()); 
            // InternalSequence.g:244:3: ( rule__TimeConstraint__Group__0 )
            // InternalSequence.g:244:4: rule__TimeConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeConstraint"


    // $ANTLR start "entryRuleInnerTimeConstraint"
    // InternalSequence.g:253:1: entryRuleInnerTimeConstraint : ruleInnerTimeConstraint EOF ;
    public final void entryRuleInnerTimeConstraint() throws RecognitionException {
        try {
            // InternalSequence.g:254:1: ( ruleInnerTimeConstraint EOF )
            // InternalSequence.g:255:1: ruleInnerTimeConstraint EOF
            {
             before(grammarAccess.getInnerTimeConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerTimeConstraint();

            state._fsp--;

             after(grammarAccess.getInnerTimeConstraintRule()); 
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
    // $ANTLR end "entryRuleInnerTimeConstraint"


    // $ANTLR start "ruleInnerTimeConstraint"
    // InternalSequence.g:262:1: ruleInnerTimeConstraint : ( ( rule__InnerTimeConstraint__Group__0 ) ) ;
    public final void ruleInnerTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:266:2: ( ( ( rule__InnerTimeConstraint__Group__0 ) ) )
            // InternalSequence.g:267:2: ( ( rule__InnerTimeConstraint__Group__0 ) )
            {
            // InternalSequence.g:267:2: ( ( rule__InnerTimeConstraint__Group__0 ) )
            // InternalSequence.g:268:3: ( rule__InnerTimeConstraint__Group__0 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getGroup()); 
            // InternalSequence.g:269:3: ( rule__InnerTimeConstraint__Group__0 )
            // InternalSequence.g:269:4: rule__InnerTimeConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerTimeConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerTimeConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerTimeConstraint"


    // $ANTLR start "entryRuleStandardMessage"
    // InternalSequence.g:278:1: entryRuleStandardMessage : ruleStandardMessage EOF ;
    public final void entryRuleStandardMessage() throws RecognitionException {
        try {
            // InternalSequence.g:279:1: ( ruleStandardMessage EOF )
            // InternalSequence.g:280:1: ruleStandardMessage EOF
            {
             before(grammarAccess.getStandardMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleStandardMessage();

            state._fsp--;

             after(grammarAccess.getStandardMessageRule()); 
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
    // $ANTLR end "entryRuleStandardMessage"


    // $ANTLR start "ruleStandardMessage"
    // InternalSequence.g:287:1: ruleStandardMessage : ( ( rule__StandardMessage__Group__0 ) ) ;
    public final void ruleStandardMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:291:2: ( ( ( rule__StandardMessage__Group__0 ) ) )
            // InternalSequence.g:292:2: ( ( rule__StandardMessage__Group__0 ) )
            {
            // InternalSequence.g:292:2: ( ( rule__StandardMessage__Group__0 ) )
            // InternalSequence.g:293:3: ( rule__StandardMessage__Group__0 )
            {
             before(grammarAccess.getStandardMessageAccess().getGroup()); 
            // InternalSequence.g:294:3: ( rule__StandardMessage__Group__0 )
            // InternalSequence.g:294:4: rule__StandardMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStandardMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStandardMessage"


    // $ANTLR start "entryRuleResponseMessage"
    // InternalSequence.g:303:1: entryRuleResponseMessage : ruleResponseMessage EOF ;
    public final void entryRuleResponseMessage() throws RecognitionException {
        try {
            // InternalSequence.g:304:1: ( ruleResponseMessage EOF )
            // InternalSequence.g:305:1: ruleResponseMessage EOF
            {
             before(grammarAccess.getResponseMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleResponseMessage();

            state._fsp--;

             after(grammarAccess.getResponseMessageRule()); 
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
    // $ANTLR end "entryRuleResponseMessage"


    // $ANTLR start "ruleResponseMessage"
    // InternalSequence.g:312:1: ruleResponseMessage : ( ( rule__ResponseMessage__Group__0 ) ) ;
    public final void ruleResponseMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:316:2: ( ( ( rule__ResponseMessage__Group__0 ) ) )
            // InternalSequence.g:317:2: ( ( rule__ResponseMessage__Group__0 ) )
            {
            // InternalSequence.g:317:2: ( ( rule__ResponseMessage__Group__0 ) )
            // InternalSequence.g:318:3: ( rule__ResponseMessage__Group__0 )
            {
             before(grammarAccess.getResponseMessageAccess().getGroup()); 
            // InternalSequence.g:319:3: ( rule__ResponseMessage__Group__0 )
            // InternalSequence.g:319:4: rule__ResponseMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponseMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponseMessage"


    // $ANTLR start "entryRuleFoundMessage"
    // InternalSequence.g:328:1: entryRuleFoundMessage : ruleFoundMessage EOF ;
    public final void entryRuleFoundMessage() throws RecognitionException {
        try {
            // InternalSequence.g:329:1: ( ruleFoundMessage EOF )
            // InternalSequence.g:330:1: ruleFoundMessage EOF
            {
             before(grammarAccess.getFoundMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleFoundMessage();

            state._fsp--;

             after(grammarAccess.getFoundMessageRule()); 
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
    // $ANTLR end "entryRuleFoundMessage"


    // $ANTLR start "ruleFoundMessage"
    // InternalSequence.g:337:1: ruleFoundMessage : ( ( rule__FoundMessage__Group__0 ) ) ;
    public final void ruleFoundMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:341:2: ( ( ( rule__FoundMessage__Group__0 ) ) )
            // InternalSequence.g:342:2: ( ( rule__FoundMessage__Group__0 ) )
            {
            // InternalSequence.g:342:2: ( ( rule__FoundMessage__Group__0 ) )
            // InternalSequence.g:343:3: ( rule__FoundMessage__Group__0 )
            {
             before(grammarAccess.getFoundMessageAccess().getGroup()); 
            // InternalSequence.g:344:3: ( rule__FoundMessage__Group__0 )
            // InternalSequence.g:344:4: rule__FoundMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFoundMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoundMessage"


    // $ANTLR start "entryRuleLostMessage"
    // InternalSequence.g:353:1: entryRuleLostMessage : ruleLostMessage EOF ;
    public final void entryRuleLostMessage() throws RecognitionException {
        try {
            // InternalSequence.g:354:1: ( ruleLostMessage EOF )
            // InternalSequence.g:355:1: ruleLostMessage EOF
            {
             before(grammarAccess.getLostMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleLostMessage();

            state._fsp--;

             after(grammarAccess.getLostMessageRule()); 
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
    // $ANTLR end "entryRuleLostMessage"


    // $ANTLR start "ruleLostMessage"
    // InternalSequence.g:362:1: ruleLostMessage : ( ( rule__LostMessage__Group__0 ) ) ;
    public final void ruleLostMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:366:2: ( ( ( rule__LostMessage__Group__0 ) ) )
            // InternalSequence.g:367:2: ( ( rule__LostMessage__Group__0 ) )
            {
            // InternalSequence.g:367:2: ( ( rule__LostMessage__Group__0 ) )
            // InternalSequence.g:368:3: ( rule__LostMessage__Group__0 )
            {
             before(grammarAccess.getLostMessageAccess().getGroup()); 
            // InternalSequence.g:369:3: ( rule__LostMessage__Group__0 )
            // InternalSequence.g:369:4: rule__LostMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLostMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLostMessage"


    // $ANTLR start "entryRuleCreateMessage"
    // InternalSequence.g:378:1: entryRuleCreateMessage : ruleCreateMessage EOF ;
    public final void entryRuleCreateMessage() throws RecognitionException {
        try {
            // InternalSequence.g:379:1: ( ruleCreateMessage EOF )
            // InternalSequence.g:380:1: ruleCreateMessage EOF
            {
             before(grammarAccess.getCreateMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateMessage();

            state._fsp--;

             after(grammarAccess.getCreateMessageRule()); 
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
    // $ANTLR end "entryRuleCreateMessage"


    // $ANTLR start "ruleCreateMessage"
    // InternalSequence.g:387:1: ruleCreateMessage : ( ( rule__CreateMessage__Group__0 ) ) ;
    public final void ruleCreateMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:391:2: ( ( ( rule__CreateMessage__Group__0 ) ) )
            // InternalSequence.g:392:2: ( ( rule__CreateMessage__Group__0 ) )
            {
            // InternalSequence.g:392:2: ( ( rule__CreateMessage__Group__0 ) )
            // InternalSequence.g:393:3: ( rule__CreateMessage__Group__0 )
            {
             before(grammarAccess.getCreateMessageAccess().getGroup()); 
            // InternalSequence.g:394:3: ( rule__CreateMessage__Group__0 )
            // InternalSequence.g:394:4: rule__CreateMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateMessage"


    // $ANTLR start "entryRuleDestructionMessage"
    // InternalSequence.g:403:1: entryRuleDestructionMessage : ruleDestructionMessage EOF ;
    public final void entryRuleDestructionMessage() throws RecognitionException {
        try {
            // InternalSequence.g:404:1: ( ruleDestructionMessage EOF )
            // InternalSequence.g:405:1: ruleDestructionMessage EOF
            {
             before(grammarAccess.getDestructionMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleDestructionMessage();

            state._fsp--;

             after(grammarAccess.getDestructionMessageRule()); 
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
    // $ANTLR end "entryRuleDestructionMessage"


    // $ANTLR start "ruleDestructionMessage"
    // InternalSequence.g:412:1: ruleDestructionMessage : ( ( rule__DestructionMessage__Group__0 ) ) ;
    public final void ruleDestructionMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:416:2: ( ( ( rule__DestructionMessage__Group__0 ) ) )
            // InternalSequence.g:417:2: ( ( rule__DestructionMessage__Group__0 ) )
            {
            // InternalSequence.g:417:2: ( ( rule__DestructionMessage__Group__0 ) )
            // InternalSequence.g:418:3: ( rule__DestructionMessage__Group__0 )
            {
             before(grammarAccess.getDestructionMessageAccess().getGroup()); 
            // InternalSequence.g:419:3: ( rule__DestructionMessage__Group__0 )
            // InternalSequence.g:419:4: rule__DestructionMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestructionMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestructionMessage"


    // $ANTLR start "entryRuleOccurenceSpecification"
    // InternalSequence.g:428:1: entryRuleOccurenceSpecification : ruleOccurenceSpecification EOF ;
    public final void entryRuleOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:429:1: ( ruleOccurenceSpecification EOF )
            // InternalSequence.g:430:1: ruleOccurenceSpecification EOF
            {
             before(grammarAccess.getOccurenceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getOccurenceSpecificationRule()); 
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
    // $ANTLR end "entryRuleOccurenceSpecification"


    // $ANTLR start "ruleOccurenceSpecification"
    // InternalSequence.g:437:1: ruleOccurenceSpecification : ( ruleDestructionOccurenceSpecification ) ;
    public final void ruleOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:441:2: ( ( ruleDestructionOccurenceSpecification ) )
            // InternalSequence.g:442:2: ( ruleDestructionOccurenceSpecification )
            {
            // InternalSequence.g:442:2: ( ruleDestructionOccurenceSpecification )
            // InternalSequence.g:443:3: ruleDestructionOccurenceSpecification
            {
             before(grammarAccess.getOccurenceSpecificationAccess().getDestructionOccurenceSpecificationParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleDestructionOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getOccurenceSpecificationAccess().getDestructionOccurenceSpecificationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOccurenceSpecification"


    // $ANTLR start "entryRuleDestructionOccurenceSpecification"
    // InternalSequence.g:453:1: entryRuleDestructionOccurenceSpecification : ruleDestructionOccurenceSpecification EOF ;
    public final void entryRuleDestructionOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:454:1: ( ruleDestructionOccurenceSpecification EOF )
            // InternalSequence.g:455:1: ruleDestructionOccurenceSpecification EOF
            {
             before(grammarAccess.getDestructionOccurenceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleDestructionOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getDestructionOccurenceSpecificationRule()); 
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
    // $ANTLR end "entryRuleDestructionOccurenceSpecification"


    // $ANTLR start "ruleDestructionOccurenceSpecification"
    // InternalSequence.g:462:1: ruleDestructionOccurenceSpecification : ( ( rule__DestructionOccurenceSpecification__Group__0 ) ) ;
    public final void ruleDestructionOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:466:2: ( ( ( rule__DestructionOccurenceSpecification__Group__0 ) ) )
            // InternalSequence.g:467:2: ( ( rule__DestructionOccurenceSpecification__Group__0 ) )
            {
            // InternalSequence.g:467:2: ( ( rule__DestructionOccurenceSpecification__Group__0 ) )
            // InternalSequence.g:468:3: ( rule__DestructionOccurenceSpecification__Group__0 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getGroup()); 
            // InternalSequence.g:469:3: ( rule__DestructionOccurenceSpecification__Group__0 )
            // InternalSequence.g:469:4: rule__DestructionOccurenceSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DestructionOccurenceSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestructionOccurenceSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestructionOccurenceSpecification"


    // $ANTLR start "entryRuleCombinedFragment"
    // InternalSequence.g:478:1: entryRuleCombinedFragment : ruleCombinedFragment EOF ;
    public final void entryRuleCombinedFragment() throws RecognitionException {
        try {
            // InternalSequence.g:479:1: ( ruleCombinedFragment EOF )
            // InternalSequence.g:480:1: ruleCombinedFragment EOF
            {
             before(grammarAccess.getCombinedFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleCombinedFragment();

            state._fsp--;

             after(grammarAccess.getCombinedFragmentRule()); 
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
    // $ANTLR end "entryRuleCombinedFragment"


    // $ANTLR start "ruleCombinedFragment"
    // InternalSequence.g:487:1: ruleCombinedFragment : ( ( rule__CombinedFragment__Alternatives ) ) ;
    public final void ruleCombinedFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:491:2: ( ( ( rule__CombinedFragment__Alternatives ) ) )
            // InternalSequence.g:492:2: ( ( rule__CombinedFragment__Alternatives ) )
            {
            // InternalSequence.g:492:2: ( ( rule__CombinedFragment__Alternatives ) )
            // InternalSequence.g:493:3: ( rule__CombinedFragment__Alternatives )
            {
             before(grammarAccess.getCombinedFragmentAccess().getAlternatives()); 
            // InternalSequence.g:494:3: ( rule__CombinedFragment__Alternatives )
            // InternalSequence.g:494:4: rule__CombinedFragment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CombinedFragment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCombinedFragmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCombinedFragment"


    // $ANTLR start "entryRuleAlternative"
    // InternalSequence.g:503:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // InternalSequence.g:504:1: ( ruleAlternative EOF )
            // InternalSequence.g:505:1: ruleAlternative EOF
            {
             before(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getAlternativeRule()); 
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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalSequence.g:512:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:516:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // InternalSequence.g:517:2: ( ( rule__Alternative__Group__0 ) )
            {
            // InternalSequence.g:517:2: ( ( rule__Alternative__Group__0 ) )
            // InternalSequence.g:518:3: ( rule__Alternative__Group__0 )
            {
             before(grammarAccess.getAlternativeAccess().getGroup()); 
            // InternalSequence.g:519:3: ( rule__Alternative__Group__0 )
            // InternalSequence.g:519:4: rule__Alternative__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleOption"
    // InternalSequence.g:528:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalSequence.g:529:1: ( ruleOption EOF )
            // InternalSequence.g:530:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalSequence.g:537:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:541:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalSequence.g:542:2: ( ( rule__Option__Group__0 ) )
            {
            // InternalSequence.g:542:2: ( ( rule__Option__Group__0 ) )
            // InternalSequence.g:543:3: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalSequence.g:544:3: ( rule__Option__Group__0 )
            // InternalSequence.g:544:4: rule__Option__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleParallel"
    // InternalSequence.g:553:1: entryRuleParallel : ruleParallel EOF ;
    public final void entryRuleParallel() throws RecognitionException {
        try {
            // InternalSequence.g:554:1: ( ruleParallel EOF )
            // InternalSequence.g:555:1: ruleParallel EOF
            {
             before(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_1);
            ruleParallel();

            state._fsp--;

             after(grammarAccess.getParallelRule()); 
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
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // InternalSequence.g:562:1: ruleParallel : ( ( rule__Parallel__Group__0 ) ) ;
    public final void ruleParallel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:566:2: ( ( ( rule__Parallel__Group__0 ) ) )
            // InternalSequence.g:567:2: ( ( rule__Parallel__Group__0 ) )
            {
            // InternalSequence.g:567:2: ( ( rule__Parallel__Group__0 ) )
            // InternalSequence.g:568:3: ( rule__Parallel__Group__0 )
            {
             before(grammarAccess.getParallelAccess().getGroup()); 
            // InternalSequence.g:569:3: ( rule__Parallel__Group__0 )
            // InternalSequence.g:569:4: rule__Parallel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parallel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParallelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleCritical"
    // InternalSequence.g:578:1: entryRuleCritical : ruleCritical EOF ;
    public final void entryRuleCritical() throws RecognitionException {
        try {
            // InternalSequence.g:579:1: ( ruleCritical EOF )
            // InternalSequence.g:580:1: ruleCritical EOF
            {
             before(grammarAccess.getCriticalRule()); 
            pushFollow(FOLLOW_1);
            ruleCritical();

            state._fsp--;

             after(grammarAccess.getCriticalRule()); 
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
    // $ANTLR end "entryRuleCritical"


    // $ANTLR start "ruleCritical"
    // InternalSequence.g:587:1: ruleCritical : ( ( rule__Critical__Group__0 ) ) ;
    public final void ruleCritical() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:591:2: ( ( ( rule__Critical__Group__0 ) ) )
            // InternalSequence.g:592:2: ( ( rule__Critical__Group__0 ) )
            {
            // InternalSequence.g:592:2: ( ( rule__Critical__Group__0 ) )
            // InternalSequence.g:593:3: ( rule__Critical__Group__0 )
            {
             before(grammarAccess.getCriticalAccess().getGroup()); 
            // InternalSequence.g:594:3: ( rule__Critical__Group__0 )
            // InternalSequence.g:594:4: rule__Critical__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Critical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCriticalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCritical"


    // $ANTLR start "entryRuleLoop"
    // InternalSequence.g:603:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalSequence.g:604:1: ( ruleLoop EOF )
            // InternalSequence.g:605:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalSequence.g:612:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:616:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalSequence.g:617:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalSequence.g:617:2: ( ( rule__Loop__Group__0 ) )
            // InternalSequence.g:618:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalSequence.g:619:3: ( rule__Loop__Group__0 )
            // InternalSequence.g:619:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBehaviorFragmentsWithCondition"
    // InternalSequence.g:628:1: entryRuleBehaviorFragmentsWithCondition : ruleBehaviorFragmentsWithCondition EOF ;
    public final void entryRuleBehaviorFragmentsWithCondition() throws RecognitionException {
        try {
            // InternalSequence.g:629:1: ( ruleBehaviorFragmentsWithCondition EOF )
            // InternalSequence.g:630:1: ruleBehaviorFragmentsWithCondition EOF
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviorFragmentsWithCondition();

            state._fsp--;

             after(grammarAccess.getBehaviorFragmentsWithConditionRule()); 
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
    // $ANTLR end "entryRuleBehaviorFragmentsWithCondition"


    // $ANTLR start "ruleBehaviorFragmentsWithCondition"
    // InternalSequence.g:637:1: ruleBehaviorFragmentsWithCondition : ( ( rule__BehaviorFragmentsWithCondition__Group__0 ) ) ;
    public final void ruleBehaviorFragmentsWithCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:641:2: ( ( ( rule__BehaviorFragmentsWithCondition__Group__0 ) ) )
            // InternalSequence.g:642:2: ( ( rule__BehaviorFragmentsWithCondition__Group__0 ) )
            {
            // InternalSequence.g:642:2: ( ( rule__BehaviorFragmentsWithCondition__Group__0 ) )
            // InternalSequence.g:643:3: ( rule__BehaviorFragmentsWithCondition__Group__0 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getGroup()); 
            // InternalSequence.g:644:3: ( rule__BehaviorFragmentsWithCondition__Group__0 )
            // InternalSequence.g:644:4: rule__BehaviorFragmentsWithCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorFragmentsWithCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviorFragmentsWithCondition"


    // $ANTLR start "entryRuleFQN"
    // InternalSequence.g:653:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSequence.g:654:1: ( ruleFQN EOF )
            // InternalSequence.g:655:1: ruleFQN EOF
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
    // InternalSequence.g:662:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:666:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSequence.g:667:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSequence.g:667:2: ( ( rule__FQN__Group__0 ) )
            // InternalSequence.g:668:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalSequence.g:669:3: ( rule__FQN__Group__0 )
            // InternalSequence.g:669:4: rule__FQN__Group__0
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


    // $ANTLR start "entryRuleOrder"
    // InternalSequence.g:678:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalSequence.g:679:1: ( ruleOrder EOF )
            // InternalSequence.g:680:1: ruleOrder EOF
            {
             before(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getOrderRule()); 
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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalSequence.g:687:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:691:2: ( ( ( rule__Order__Group__0 ) ) )
            // InternalSequence.g:692:2: ( ( rule__Order__Group__0 ) )
            {
            // InternalSequence.g:692:2: ( ( rule__Order__Group__0 ) )
            // InternalSequence.g:693:3: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // InternalSequence.g:694:3: ( rule__Order__Group__0 )
            // InternalSequence.g:694:4: rule__Order__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleCommentBody"
    // InternalSequence.g:703:1: entryRuleCommentBody : ruleCommentBody EOF ;
    public final void entryRuleCommentBody() throws RecognitionException {
        try {
            // InternalSequence.g:704:1: ( ruleCommentBody EOF )
            // InternalSequence.g:705:1: ruleCommentBody EOF
            {
             before(grammarAccess.getCommentBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleCommentBody();

            state._fsp--;

             after(grammarAccess.getCommentBodyRule()); 
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
    // $ANTLR end "entryRuleCommentBody"


    // $ANTLR start "ruleCommentBody"
    // InternalSequence.g:712:1: ruleCommentBody : ( RULE_STRING ) ;
    public final void ruleCommentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:716:2: ( ( RULE_STRING ) )
            // InternalSequence.g:717:2: ( RULE_STRING )
            {
            // InternalSequence.g:717:2: ( RULE_STRING )
            // InternalSequence.g:718:3: RULE_STRING
            {
             before(grammarAccess.getCommentBodyAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommentBodyAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentBody"


    // $ANTLR start "entryRuleUnescapedString"
    // InternalSequence.g:728:1: entryRuleUnescapedString : ruleUnescapedString EOF ;
    public final void entryRuleUnescapedString() throws RecognitionException {
        try {
            // InternalSequence.g:729:1: ( ruleUnescapedString EOF )
            // InternalSequence.g:730:1: ruleUnescapedString EOF
            {
             before(grammarAccess.getUnescapedStringRule()); 
            pushFollow(FOLLOW_1);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getUnescapedStringRule()); 
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
    // $ANTLR end "entryRuleUnescapedString"


    // $ANTLR start "ruleUnescapedString"
    // InternalSequence.g:737:1: ruleUnescapedString : ( ( rule__UnescapedString__Alternatives ) ) ;
    public final void ruleUnescapedString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:741:2: ( ( ( rule__UnescapedString__Alternatives ) ) )
            // InternalSequence.g:742:2: ( ( rule__UnescapedString__Alternatives ) )
            {
            // InternalSequence.g:742:2: ( ( rule__UnescapedString__Alternatives ) )
            // InternalSequence.g:743:3: ( rule__UnescapedString__Alternatives )
            {
             before(grammarAccess.getUnescapedStringAccess().getAlternatives()); 
            // InternalSequence.g:744:3: ( rule__UnescapedString__Alternatives )
            // InternalSequence.g:744:4: rule__UnescapedString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnescapedString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnescapedStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnescapedString"


    // $ANTLR start "ruleMessageType"
    // InternalSequence.g:753:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:757:1: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalSequence.g:758:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalSequence.g:758:2: ( ( rule__MessageType__Alternatives ) )
            // InternalSequence.g:759:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalSequence.g:760:3: ( rule__MessageType__Alternatives )
            // InternalSequence.g:760:4: rule__MessageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MessageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageType"


    // $ANTLR start "ruleActorType"
    // InternalSequence.g:769:1: ruleActorType : ( ( rule__ActorType__Alternatives ) ) ;
    public final void ruleActorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:773:1: ( ( ( rule__ActorType__Alternatives ) ) )
            // InternalSequence.g:774:2: ( ( rule__ActorType__Alternatives ) )
            {
            // InternalSequence.g:774:2: ( ( rule__ActorType__Alternatives ) )
            // InternalSequence.g:775:3: ( rule__ActorType__Alternatives )
            {
             before(grammarAccess.getActorTypeAccess().getAlternatives()); 
            // InternalSequence.g:776:3: ( rule__ActorType__Alternatives )
            // InternalSequence.g:776:4: rule__ActorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActorType"


    // $ANTLR start "ruleTimeConstraintType"
    // InternalSequence.g:785:1: ruleTimeConstraintType : ( ( rule__TimeConstraintType__Alternatives ) ) ;
    public final void ruleTimeConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:789:1: ( ( ( rule__TimeConstraintType__Alternatives ) ) )
            // InternalSequence.g:790:2: ( ( rule__TimeConstraintType__Alternatives ) )
            {
            // InternalSequence.g:790:2: ( ( rule__TimeConstraintType__Alternatives ) )
            // InternalSequence.g:791:3: ( rule__TimeConstraintType__Alternatives )
            {
             before(grammarAccess.getTimeConstraintTypeAccess().getAlternatives()); 
            // InternalSequence.g:792:3: ( rule__TimeConstraintType__Alternatives )
            // InternalSequence.g:792:4: rule__TimeConstraintType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeConstraintType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeConstraintType"


    // $ANTLR start "rule__Actor__Alternatives_2"
    // InternalSequence.g:800:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Group_2_0__0 ) ) | ( ( rule__Actor__Group_2_1__0 ) ) | ( ( rule__Actor__Group_2_2__0 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:804:1: ( ( ( rule__Actor__Group_2_0__0 ) ) | ( ( rule__Actor__Group_2_1__0 ) ) | ( ( rule__Actor__Group_2_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
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
                    // InternalSequence.g:805:2: ( ( rule__Actor__Group_2_0__0 ) )
                    {
                    // InternalSequence.g:805:2: ( ( rule__Actor__Group_2_0__0 ) )
                    // InternalSequence.g:806:3: ( rule__Actor__Group_2_0__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_0()); 
                    // InternalSequence.g:807:3: ( rule__Actor__Group_2_0__0 )
                    // InternalSequence.g:807:4: rule__Actor__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActorAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:811:2: ( ( rule__Actor__Group_2_1__0 ) )
                    {
                    // InternalSequence.g:811:2: ( ( rule__Actor__Group_2_1__0 ) )
                    // InternalSequence.g:812:3: ( rule__Actor__Group_2_1__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_1()); 
                    // InternalSequence.g:813:3: ( rule__Actor__Group_2_1__0 )
                    // InternalSequence.g:813:4: rule__Actor__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActorAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:817:2: ( ( rule__Actor__Group_2_2__0 ) )
                    {
                    // InternalSequence.g:817:2: ( ( rule__Actor__Group_2_2__0 ) )
                    // InternalSequence.g:818:3: ( rule__Actor__Group_2_2__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_2()); 
                    // InternalSequence.g:819:3: ( rule__Actor__Group_2_2__0 )
                    // InternalSequence.g:819:4: rule__Actor__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActorAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Actor__Alternatives_2"


    // $ANTLR start "rule__BehaviorFragment__Alternatives"
    // InternalSequence.g:827:1: rule__BehaviorFragment__Alternatives : ( ( ruleMessage ) | ( ruleOccurenceSpecification ) | ( ruleCombinedFragment ) );
    public final void rule__BehaviorFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:831:1: ( ( ruleMessage ) | ( ruleOccurenceSpecification ) | ( ruleCombinedFragment ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==33) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==EOF||(LA2_4>=12 && LA2_4<=13)||LA2_4==21||(LA2_4>=28 && LA2_4<=29)||(LA2_4>=36 && LA2_4<=47)) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_2==RULE_STRING||LA2_2==33) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSequence.g:832:2: ( ruleMessage )
                    {
                    // InternalSequence.g:832:2: ( ruleMessage )
                    // InternalSequence.g:833:3: ruleMessage
                    {
                     before(grammarAccess.getBehaviorFragmentAccess().getMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getBehaviorFragmentAccess().getMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:838:2: ( ruleOccurenceSpecification )
                    {
                    // InternalSequence.g:838:2: ( ruleOccurenceSpecification )
                    // InternalSequence.g:839:3: ruleOccurenceSpecification
                    {
                     before(grammarAccess.getBehaviorFragmentAccess().getOccurenceSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOccurenceSpecification();

                    state._fsp--;

                     after(grammarAccess.getBehaviorFragmentAccess().getOccurenceSpecificationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:844:2: ( ruleCombinedFragment )
                    {
                    // InternalSequence.g:844:2: ( ruleCombinedFragment )
                    // InternalSequence.g:845:3: ruleCombinedFragment
                    {
                     before(grammarAccess.getBehaviorFragmentAccess().getCombinedFragmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCombinedFragment();

                    state._fsp--;

                     after(grammarAccess.getBehaviorFragmentAccess().getCombinedFragmentParserRuleCall_2()); 

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
    // $ANTLR end "rule__BehaviorFragment__Alternatives"


    // $ANTLR start "rule__BehaviorFragments__Alternatives"
    // InternalSequence.g:854:1: rule__BehaviorFragments__Alternatives : ( ( ( rule__BehaviorFragments__Group_0__0 ) ) | ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) ) );
    public final void rule__BehaviorFragments__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:858:1: ( ( ( rule__BehaviorFragments__Group_0__0 ) ) | ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=12 && LA3_0<=13)||(LA3_0>=36 && LA3_0<=45)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSequence.g:859:2: ( ( rule__BehaviorFragments__Group_0__0 ) )
                    {
                    // InternalSequence.g:859:2: ( ( rule__BehaviorFragments__Group_0__0 ) )
                    // InternalSequence.g:860:3: ( rule__BehaviorFragments__Group_0__0 )
                    {
                     before(grammarAccess.getBehaviorFragmentsAccess().getGroup_0()); 
                    // InternalSequence.g:861:3: ( rule__BehaviorFragments__Group_0__0 )
                    // InternalSequence.g:861:4: rule__BehaviorFragments__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviorFragments__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBehaviorFragmentsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:865:2: ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) )
                    {
                    // InternalSequence.g:865:2: ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) )
                    // InternalSequence.g:866:3: ( rule__BehaviorFragments__FragmentsAssignment_1 )
                    {
                     before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_1()); 
                    // InternalSequence.g:867:3: ( rule__BehaviorFragments__FragmentsAssignment_1 )
                    // InternalSequence.g:867:4: rule__BehaviorFragments__FragmentsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviorFragments__FragmentsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_1()); 

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
    // $ANTLR end "rule__BehaviorFragments__Alternatives"


    // $ANTLR start "rule__Message__Alternatives_0"
    // InternalSequence.g:875:1: rule__Message__Alternatives_0 : ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) );
    public final void rule__Message__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:879:1: ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt4=1;
                }
                break;
            case 36:
                {
                alt4=2;
                }
                break;
            case 37:
                {
                alt4=3;
                }
                break;
            case 38:
                {
                alt4=4;
                }
                break;
            case 39:
                {
                alt4=5;
                }
                break;
            case 40:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSequence.g:880:2: ( ruleStandardMessage )
                    {
                    // InternalSequence.g:880:2: ( ruleStandardMessage )
                    // InternalSequence.g:881:3: ruleStandardMessage
                    {
                     before(grammarAccess.getMessageAccess().getStandardMessageParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStandardMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getStandardMessageParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:886:2: ( ruleResponseMessage )
                    {
                    // InternalSequence.g:886:2: ( ruleResponseMessage )
                    // InternalSequence.g:887:3: ruleResponseMessage
                    {
                     before(grammarAccess.getMessageAccess().getResponseMessageParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleResponseMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getResponseMessageParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:892:2: ( ruleFoundMessage )
                    {
                    // InternalSequence.g:892:2: ( ruleFoundMessage )
                    // InternalSequence.g:893:3: ruleFoundMessage
                    {
                     before(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFoundMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSequence.g:898:2: ( ruleLostMessage )
                    {
                    // InternalSequence.g:898:2: ( ruleLostMessage )
                    // InternalSequence.g:899:3: ruleLostMessage
                    {
                     before(grammarAccess.getMessageAccess().getLostMessageParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLostMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getLostMessageParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSequence.g:904:2: ( ruleCreateMessage )
                    {
                    // InternalSequence.g:904:2: ( ruleCreateMessage )
                    // InternalSequence.g:905:3: ruleCreateMessage
                    {
                     before(grammarAccess.getMessageAccess().getCreateMessageParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getCreateMessageParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSequence.g:910:2: ( ruleDestructionMessage )
                    {
                    // InternalSequence.g:910:2: ( ruleDestructionMessage )
                    // InternalSequence.g:911:3: ruleDestructionMessage
                    {
                     before(grammarAccess.getMessageAccess().getDestructionMessageParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDestructionMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getDestructionMessageParserRuleCall_0_5()); 

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
    // $ANTLR end "rule__Message__Alternatives_0"


    // $ANTLR start "rule__ResponseMessage__Alternatives_3"
    // InternalSequence.g:920:1: rule__ResponseMessage__Alternatives_3 : ( ( ( rule__ResponseMessage__LeftAssignment_3_0 ) ) | ( '_' ) );
    public final void rule__ResponseMessage__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:924:1: ( ( ( rule__ResponseMessage__LeftAssignment_3_0 ) ) | ( '_' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSequence.g:925:2: ( ( rule__ResponseMessage__LeftAssignment_3_0 ) )
                    {
                    // InternalSequence.g:925:2: ( ( rule__ResponseMessage__LeftAssignment_3_0 ) )
                    // InternalSequence.g:926:3: ( rule__ResponseMessage__LeftAssignment_3_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getLeftAssignment_3_0()); 
                    // InternalSequence.g:927:3: ( rule__ResponseMessage__LeftAssignment_3_0 )
                    // InternalSequence.g:927:4: rule__ResponseMessage__LeftAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseMessage__LeftAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseMessageAccess().getLeftAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:931:2: ( '_' )
                    {
                    // InternalSequence.g:931:2: ( '_' )
                    // InternalSequence.g:932:3: '_'
                    {
                     before(grammarAccess.getResponseMessageAccess().get_Keyword_3_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getResponseMessageAccess().get_Keyword_3_1()); 

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
    // $ANTLR end "rule__ResponseMessage__Alternatives_3"


    // $ANTLR start "rule__ResponseMessage__Alternatives_5"
    // InternalSequence.g:941:1: rule__ResponseMessage__Alternatives_5 : ( ( ( rule__ResponseMessage__RightAssignment_5_0 ) ) | ( '_' ) );
    public final void rule__ResponseMessage__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:945:1: ( ( ( rule__ResponseMessage__RightAssignment_5_0 ) ) | ( '_' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSequence.g:946:2: ( ( rule__ResponseMessage__RightAssignment_5_0 ) )
                    {
                    // InternalSequence.g:946:2: ( ( rule__ResponseMessage__RightAssignment_5_0 ) )
                    // InternalSequence.g:947:3: ( rule__ResponseMessage__RightAssignment_5_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getRightAssignment_5_0()); 
                    // InternalSequence.g:948:3: ( rule__ResponseMessage__RightAssignment_5_0 )
                    // InternalSequence.g:948:4: rule__ResponseMessage__RightAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseMessage__RightAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseMessageAccess().getRightAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:952:2: ( '_' )
                    {
                    // InternalSequence.g:952:2: ( '_' )
                    // InternalSequence.g:953:3: '_'
                    {
                     before(grammarAccess.getResponseMessageAccess().get_Keyword_5_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getResponseMessageAccess().get_Keyword_5_1()); 

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
    // $ANTLR end "rule__ResponseMessage__Alternatives_5"


    // $ANTLR start "rule__CombinedFragment__Alternatives"
    // InternalSequence.g:962:1: rule__CombinedFragment__Alternatives : ( ( ruleAlternative ) | ( ruleOption ) | ( ruleParallel ) | ( ruleCritical ) | ( ruleLoop ) );
    public final void rule__CombinedFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:966:1: ( ( ruleAlternative ) | ( ruleOption ) | ( ruleParallel ) | ( ruleCritical ) | ( ruleLoop ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt7=1;
                }
                break;
            case 42:
                {
                alt7=2;
                }
                break;
            case 43:
                {
                alt7=3;
                }
                break;
            case 44:
                {
                alt7=4;
                }
                break;
            case 45:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSequence.g:967:2: ( ruleAlternative )
                    {
                    // InternalSequence.g:967:2: ( ruleAlternative )
                    // InternalSequence.g:968:3: ruleAlternative
                    {
                     before(grammarAccess.getCombinedFragmentAccess().getAlternativeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAlternative();

                    state._fsp--;

                     after(grammarAccess.getCombinedFragmentAccess().getAlternativeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:973:2: ( ruleOption )
                    {
                    // InternalSequence.g:973:2: ( ruleOption )
                    // InternalSequence.g:974:3: ruleOption
                    {
                     before(grammarAccess.getCombinedFragmentAccess().getOptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOption();

                    state._fsp--;

                     after(grammarAccess.getCombinedFragmentAccess().getOptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:979:2: ( ruleParallel )
                    {
                    // InternalSequence.g:979:2: ( ruleParallel )
                    // InternalSequence.g:980:3: ruleParallel
                    {
                     before(grammarAccess.getCombinedFragmentAccess().getParallelParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParallel();

                    state._fsp--;

                     after(grammarAccess.getCombinedFragmentAccess().getParallelParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSequence.g:985:2: ( ruleCritical )
                    {
                    // InternalSequence.g:985:2: ( ruleCritical )
                    // InternalSequence.g:986:3: ruleCritical
                    {
                     before(grammarAccess.getCombinedFragmentAccess().getCriticalParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCritical();

                    state._fsp--;

                     after(grammarAccess.getCombinedFragmentAccess().getCriticalParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSequence.g:991:2: ( ruleLoop )
                    {
                    // InternalSequence.g:991:2: ( ruleLoop )
                    // InternalSequence.g:992:3: ruleLoop
                    {
                     before(grammarAccess.getCombinedFragmentAccess().getLoopParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getCombinedFragmentAccess().getLoopParserRuleCall_4()); 

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
    // $ANTLR end "rule__CombinedFragment__Alternatives"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Alternatives_3"
    // InternalSequence.g:1001:1: rule__BehaviorFragmentsWithCondition__Alternatives_3 : ( ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) ) | ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) ) );
    public final void rule__BehaviorFragmentsWithCondition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1005:1: ( ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) ) | ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=12 && LA8_0<=13)||(LA8_0>=36 && LA8_0<=45)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSequence.g:1006:2: ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) )
                    {
                    // InternalSequence.g:1006:2: ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) )
                    // InternalSequence.g:1007:3: ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 )
                    {
                     before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getGroup_3_0()); 
                    // InternalSequence.g:1008:3: ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 )
                    // InternalSequence.g:1008:4: rule__BehaviorFragmentsWithCondition__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviorFragmentsWithCondition__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1012:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) )
                    {
                    // InternalSequence.g:1012:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) )
                    // InternalSequence.g:1013:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 )
                    {
                     before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_1()); 
                    // InternalSequence.g:1014:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 )
                    // InternalSequence.g:1014:4: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_1()); 

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
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Alternatives_3"


    // $ANTLR start "rule__UnescapedString__Alternatives"
    // InternalSequence.g:1022:1: rule__UnescapedString__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__UnescapedString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1026:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSequence.g:1027:2: ( RULE_ID )
                    {
                    // InternalSequence.g:1027:2: ( RULE_ID )
                    // InternalSequence.g:1028:3: RULE_ID
                    {
                     before(grammarAccess.getUnescapedStringAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getUnescapedStringAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1033:2: ( RULE_STRING )
                    {
                    // InternalSequence.g:1033:2: ( RULE_STRING )
                    // InternalSequence.g:1034:3: RULE_STRING
                    {
                     before(grammarAccess.getUnescapedStringAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getUnescapedStringAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__UnescapedString__Alternatives"


    // $ANTLR start "rule__MessageType__Alternatives"
    // InternalSequence.g:1043:1: rule__MessageType__Alternatives : ( ( ( 'sync' ) ) | ( ( 'async' ) ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1047:1: ( ( ( 'sync' ) ) | ( ( 'async' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            else if ( (LA10_0==13) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSequence.g:1048:2: ( ( 'sync' ) )
                    {
                    // InternalSequence.g:1048:2: ( ( 'sync' ) )
                    // InternalSequence.g:1049:3: ( 'sync' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1050:3: ( 'sync' )
                    // InternalSequence.g:1050:4: 'sync'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1054:2: ( ( 'async' ) )
                    {
                    // InternalSequence.g:1054:2: ( ( 'async' ) )
                    // InternalSequence.g:1055:3: ( 'async' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getASYNCEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1056:3: ( 'async' )
                    // InternalSequence.g:1056:4: 'async'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMessageTypeAccess().getASYNCEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__MessageType__Alternatives"


    // $ANTLR start "rule__ActorType__Alternatives"
    // InternalSequence.g:1064:1: rule__ActorType__Alternatives : ( ( ( 'human' ) ) | ( ( 'machine' ) ) );
    public final void rule__ActorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1068:1: ( ( ( 'human' ) ) | ( ( 'machine' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSequence.g:1069:2: ( ( 'human' ) )
                    {
                    // InternalSequence.g:1069:2: ( ( 'human' ) )
                    // InternalSequence.g:1070:3: ( 'human' )
                    {
                     before(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1071:3: ( 'human' )
                    // InternalSequence.g:1071:4: 'human'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1075:2: ( ( 'machine' ) )
                    {
                    // InternalSequence.g:1075:2: ( ( 'machine' ) )
                    // InternalSequence.g:1076:3: ( 'machine' )
                    {
                     before(grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1077:3: ( 'machine' )
                    // InternalSequence.g:1077:4: 'machine'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ActorType__Alternatives"


    // $ANTLR start "rule__TimeConstraintType__Alternatives"
    // InternalSequence.g:1085:1: rule__TimeConstraintType__Alternatives : ( ( ( 'd' ) ) | ( ( 't' ) ) | ( ( 'max' ) ) | ( ( 'diff' ) ) );
    public final void rule__TimeConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1089:1: ( ( ( 'd' ) ) | ( ( 't' ) ) | ( ( 'max' ) ) | ( ( 'diff' ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt12=1;
                }
                break;
            case 17:
                {
                alt12=2;
                }
                break;
            case 18:
                {
                alt12=3;
                }
                break;
            case 19:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSequence.g:1090:2: ( ( 'd' ) )
                    {
                    // InternalSequence.g:1090:2: ( ( 'd' ) )
                    // InternalSequence.g:1091:3: ( 'd' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getDURATIONEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1092:3: ( 'd' )
                    // InternalSequence.g:1092:4: 'd'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeConstraintTypeAccess().getDURATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1096:2: ( ( 't' ) )
                    {
                    // InternalSequence.g:1096:2: ( ( 't' ) )
                    // InternalSequence.g:1097:3: ( 't' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getTIMEEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1098:3: ( 't' )
                    // InternalSequence.g:1098:4: 't'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeConstraintTypeAccess().getTIMEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:1102:2: ( ( 'max' ) )
                    {
                    // InternalSequence.g:1102:2: ( ( 'max' ) )
                    // InternalSequence.g:1103:3: ( 'max' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getMAXIMUMEnumLiteralDeclaration_2()); 
                    // InternalSequence.g:1104:3: ( 'max' )
                    // InternalSequence.g:1104:4: 'max'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeConstraintTypeAccess().getMAXIMUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSequence.g:1108:2: ( ( 'diff' ) )
                    {
                    // InternalSequence.g:1108:2: ( ( 'diff' ) )
                    // InternalSequence.g:1109:3: ( 'diff' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getDIFFERENCEEnumLiteralDeclaration_3()); 
                    // InternalSequence.g:1110:3: ( 'diff' )
                    // InternalSequence.g:1110:4: 'diff'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeConstraintTypeAccess().getDIFFERENCEEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__TimeConstraintType__Alternatives"


    // $ANTLR start "rule__SequenceDiagram__Group__0"
    // InternalSequence.g:1118:1: rule__SequenceDiagram__Group__0 : rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 ;
    public final void rule__SequenceDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1122:1: ( rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 )
            // InternalSequence.g:1123:2: rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SequenceDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__1();

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
    // $ANTLR end "rule__SequenceDiagram__Group__0"


    // $ANTLR start "rule__SequenceDiagram__Group__0__Impl"
    // InternalSequence.g:1130:1: rule__SequenceDiagram__Group__0__Impl : ( () ) ;
    public final void rule__SequenceDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1134:1: ( ( () ) )
            // InternalSequence.g:1135:1: ( () )
            {
            // InternalSequence.g:1135:1: ( () )
            // InternalSequence.g:1136:2: ()
            {
             before(grammarAccess.getSequenceDiagramAccess().getSequenceDiagramAction_0()); 
            // InternalSequence.g:1137:2: ()
            // InternalSequence.g:1137:3: 
            {
            }

             after(grammarAccess.getSequenceDiagramAccess().getSequenceDiagramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__Group__0__Impl"


    // $ANTLR start "rule__SequenceDiagram__Group__1"
    // InternalSequence.g:1145:1: rule__SequenceDiagram__Group__1 : rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 ;
    public final void rule__SequenceDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1149:1: ( rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 )
            // InternalSequence.g:1150:2: rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SequenceDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__2();

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
    // $ANTLR end "rule__SequenceDiagram__Group__1"


    // $ANTLR start "rule__SequenceDiagram__Group__1__Impl"
    // InternalSequence.g:1157:1: rule__SequenceDiagram__Group__1__Impl : ( '@start-seqd' ) ;
    public final void rule__SequenceDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1161:1: ( ( '@start-seqd' ) )
            // InternalSequence.g:1162:1: ( '@start-seqd' )
            {
            // InternalSequence.g:1162:1: ( '@start-seqd' )
            // InternalSequence.g:1163:2: '@start-seqd'
            {
             before(grammarAccess.getSequenceDiagramAccess().getStartSeqdKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSequenceDiagramAccess().getStartSeqdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__Group__1__Impl"


    // $ANTLR start "rule__SequenceDiagram__Group__2"
    // InternalSequence.g:1172:1: rule__SequenceDiagram__Group__2 : rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 ;
    public final void rule__SequenceDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1176:1: ( rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 )
            // InternalSequence.g:1177:2: rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SequenceDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__3();

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
    // $ANTLR end "rule__SequenceDiagram__Group__2"


    // $ANTLR start "rule__SequenceDiagram__Group__2__Impl"
    // InternalSequence.g:1184:1: rule__SequenceDiagram__Group__2__Impl : ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) ;
    public final void rule__SequenceDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1188:1: ( ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) )
            // InternalSequence.g:1189:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            {
            // InternalSequence.g:1189:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            // InternalSequence.g:1190:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getTitleAssignment_2()); 
            // InternalSequence.g:1191:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            // InternalSequence.g:1191:3: rule__SequenceDiagram__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDiagramAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__Group__2__Impl"


    // $ANTLR start "rule__SequenceDiagram__Group__3"
    // InternalSequence.g:1199:1: rule__SequenceDiagram__Group__3 : rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 ;
    public final void rule__SequenceDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1203:1: ( rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 )
            // InternalSequence.g:1204:2: rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SequenceDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__4();

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
    // $ANTLR end "rule__SequenceDiagram__Group__3"


    // $ANTLR start "rule__SequenceDiagram__Group__3__Impl"
    // InternalSequence.g:1211:1: rule__SequenceDiagram__Group__3__Impl : ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__SequenceDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1215:1: ( ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) )
            // InternalSequence.g:1216:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            {
            // InternalSequence.g:1216:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            // InternalSequence.g:1217:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getRootPackageAssignment_3()); 
            // InternalSequence.g:1218:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            // InternalSequence.g:1218:3: rule__SequenceDiagram__RootPackageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__RootPackageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDiagramAccess().getRootPackageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__Group__3__Impl"


    // $ANTLR start "rule__SequenceDiagram__Group__4"
    // InternalSequence.g:1226:1: rule__SequenceDiagram__Group__4 : rule__SequenceDiagram__Group__4__Impl rule__SequenceDiagram__Group__5 ;
    public final void rule__SequenceDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1230:1: ( rule__SequenceDiagram__Group__4__Impl rule__SequenceDiagram__Group__5 )
            // InternalSequence.g:1231:2: rule__SequenceDiagram__Group__4__Impl rule__SequenceDiagram__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SequenceDiagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__5();

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
    // $ANTLR end "rule__SequenceDiagram__Group__4"


    // $ANTLR start "rule__SequenceDiagram__Group__4__Impl"
    // InternalSequence.g:1238:1: rule__SequenceDiagram__Group__4__Impl : ( ( rule__SequenceDiagram__ActorsAssignment_4 )* ) ;
    public final void rule__SequenceDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1242:1: ( ( ( rule__SequenceDiagram__ActorsAssignment_4 )* ) )
            // InternalSequence.g:1243:1: ( ( rule__SequenceDiagram__ActorsAssignment_4 )* )
            {
            // InternalSequence.g:1243:1: ( ( rule__SequenceDiagram__ActorsAssignment_4 )* )
            // InternalSequence.g:1244:2: ( rule__SequenceDiagram__ActorsAssignment_4 )*
            {
             before(grammarAccess.getSequenceDiagramAccess().getActorsAssignment_4()); 
            // InternalSequence.g:1245:2: ( rule__SequenceDiagram__ActorsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23||LA13_0==48) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSequence.g:1245:3: rule__SequenceDiagram__ActorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SequenceDiagram__ActorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSequenceDiagramAccess().getActorsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__Group__4__Impl"


    // $ANTLR start "rule__SequenceDiagram__Group__5"
    // InternalSequence.g:1253:1: rule__SequenceDiagram__Group__5 : rule__SequenceDiagram__Group__5__Impl rule__SequenceDiagram__Group__6 ;
    public final void rule__SequenceDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1257:1: ( rule__SequenceDiagram__Group__5__Impl rule__SequenceDiagram__Group__6 )
            // InternalSequence.g:1258:2: rule__SequenceDiagram__Group__5__Impl rule__SequenceDiagram__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__SequenceDiagram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__6();

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
    // $ANTLR end "rule__SequenceDiagram__Group__5"


    // $ANTLR start "rule__SequenceDiagram__Group__5__Impl"
    // InternalSequence.g:1265:1: rule__SequenceDiagram__Group__5__Impl : ( ( rule__SequenceDiagram__BehaviorFragmentsAssignment_5 )* ) ;
    public final void rule__SequenceDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1269:1: ( ( ( rule__SequenceDiagram__BehaviorFragmentsAssignment_5 )* ) )
            // InternalSequence.g:1270:1: ( ( rule__SequenceDiagram__BehaviorFragmentsAssignment_5 )* )
            {
            // InternalSequence.g:1270:1: ( ( rule__SequenceDiagram__BehaviorFragmentsAssignment_5 )* )
            // InternalSequence.g:1271:2: ( rule__SequenceDiagram__BehaviorFragmentsAssignment_5 )*
            {
             before(grammarAccess.getSequenceDiagramAccess().getBehaviorFragmentsAssignment_5()); 
            // InternalSequence.g:1272:2: ( rule__SequenceDiagram__BehaviorFragmentsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=12 && LA14_0<=13)||(LA14_0>=36 && LA14_0<=45)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSequence.g:1272:3: rule__SequenceDiagram__BehaviorFragmentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SequenceDiagram__BehaviorFragmentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSequenceDiagramAccess().getBehaviorFragmentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__Group__5__Impl"


    // $ANTLR start "rule__SequenceDiagram__Group__6"
    // InternalSequence.g:1280:1: rule__SequenceDiagram__Group__6 : rule__SequenceDiagram__Group__6__Impl ;
    public final void rule__SequenceDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1284:1: ( rule__SequenceDiagram__Group__6__Impl )
            // InternalSequence.g:1285:2: rule__SequenceDiagram__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__6__Impl();

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
    // $ANTLR end "rule__SequenceDiagram__Group__6"


    // $ANTLR start "rule__SequenceDiagram__Group__6__Impl"
    // InternalSequence.g:1291:1: rule__SequenceDiagram__Group__6__Impl : ( '@end-seqd' ) ;
    public final void rule__SequenceDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1295:1: ( ( '@end-seqd' ) )
            // InternalSequence.g:1296:1: ( '@end-seqd' )
            {
            // InternalSequence.g:1296:1: ( '@end-seqd' )
            // InternalSequence.g:1297:2: '@end-seqd'
            {
             before(grammarAccess.getSequenceDiagramAccess().getEndSeqdKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSequenceDiagramAccess().getEndSeqdKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__Group__6__Impl"


    // $ANTLR start "rule__RootPackage__Group__0"
    // InternalSequence.g:1307:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1311:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalSequence.g:1312:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSequence.g:1319:1: rule__RootPackage__Group__0__Impl : ( 'rootElement' ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1323:1: ( ( 'rootElement' ) )
            // InternalSequence.g:1324:1: ( 'rootElement' )
            {
            // InternalSequence.g:1324:1: ( 'rootElement' )
            // InternalSequence.g:1325:2: 'rootElement'
            {
             before(grammarAccess.getRootPackageAccess().getRootElementKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRootPackageAccess().getRootElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__0__Impl"


    // $ANTLR start "rule__RootPackage__Group__1"
    // InternalSequence.g:1334:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1338:1: ( rule__RootPackage__Group__1__Impl )
            // InternalSequence.g:1339:2: rule__RootPackage__Group__1__Impl
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
    // InternalSequence.g:1345:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__NameAssignment_1 ) ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1349:1: ( ( ( rule__RootPackage__NameAssignment_1 ) ) )
            // InternalSequence.g:1350:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            {
            // InternalSequence.g:1350:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            // InternalSequence.g:1351:2: ( rule__RootPackage__NameAssignment_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 
            // InternalSequence.g:1352:2: ( rule__RootPackage__NameAssignment_1 )
            // InternalSequence.g:1352:3: rule__RootPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Actor__Group__0"
    // InternalSequence.g:1361:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1365:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalSequence.g:1366:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

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
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalSequence.g:1373:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__DeferredAssignment_0 )? ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1377:1: ( ( ( rule__Actor__DeferredAssignment_0 )? ) )
            // InternalSequence.g:1378:1: ( ( rule__Actor__DeferredAssignment_0 )? )
            {
            // InternalSequence.g:1378:1: ( ( rule__Actor__DeferredAssignment_0 )? )
            // InternalSequence.g:1379:2: ( rule__Actor__DeferredAssignment_0 )?
            {
             before(grammarAccess.getActorAccess().getDeferredAssignment_0()); 
            // InternalSequence.g:1380:2: ( rule__Actor__DeferredAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSequence.g:1380:3: rule__Actor__DeferredAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__DeferredAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getDeferredAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalSequence.g:1388:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1392:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalSequence.g:1393:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

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
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalSequence.g:1400:1: rule__Actor__Group__1__Impl : ( 'act' ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1404:1: ( ( 'act' ) )
            // InternalSequence.g:1405:1: ( 'act' )
            {
            // InternalSequence.g:1405:1: ( 'act' )
            // InternalSequence.g:1406:2: 'act'
            {
             before(grammarAccess.getActorAccess().getActKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalSequence.g:1415:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1419:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalSequence.g:1420:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

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
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalSequence.g:1427:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__Alternatives_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1431:1: ( ( ( rule__Actor__Alternatives_2 ) ) )
            // InternalSequence.g:1432:1: ( ( rule__Actor__Alternatives_2 ) )
            {
            // InternalSequence.g:1432:1: ( ( rule__Actor__Alternatives_2 ) )
            // InternalSequence.g:1433:2: ( rule__Actor__Alternatives_2 )
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // InternalSequence.g:1434:2: ( rule__Actor__Alternatives_2 )
            // InternalSequence.g:1434:3: rule__Actor__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalSequence.g:1442:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1446:1: ( rule__Actor__Group__3__Impl )
            // InternalSequence.g:1447:2: rule__Actor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__3__Impl();

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
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalSequence.g:1453:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1457:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // InternalSequence.g:1458:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // InternalSequence.g:1458:1: ( ( rule__Actor__Group_3__0 )? )
            // InternalSequence.g:1459:2: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // InternalSequence.g:1460:2: ( rule__Actor__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSequence.g:1460:3: rule__Actor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Actor__Group_2_0__0"
    // InternalSequence.g:1469:1: rule__Actor__Group_2_0__0 : rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 ;
    public final void rule__Actor__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1473:1: ( rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 )
            // InternalSequence.g:1474:2: rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Actor__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_0__1();

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
    // $ANTLR end "rule__Actor__Group_2_0__0"


    // $ANTLR start "rule__Actor__Group_2_0__0__Impl"
    // InternalSequence.g:1481:1: rule__Actor__Group_2_0__0__Impl : ( ( rule__Actor__NameAssignment_2_0_0 ) ) ;
    public final void rule__Actor__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1485:1: ( ( ( rule__Actor__NameAssignment_2_0_0 ) ) )
            // InternalSequence.g:1486:1: ( ( rule__Actor__NameAssignment_2_0_0 ) )
            {
            // InternalSequence.g:1486:1: ( ( rule__Actor__NameAssignment_2_0_0 ) )
            // InternalSequence.g:1487:2: ( rule__Actor__NameAssignment_2_0_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_0_0()); 
            // InternalSequence.g:1488:2: ( rule__Actor__NameAssignment_2_0_0 )
            // InternalSequence.g:1488:3: rule__Actor__NameAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_0__0__Impl"


    // $ANTLR start "rule__Actor__Group_2_0__1"
    // InternalSequence.g:1496:1: rule__Actor__Group_2_0__1 : rule__Actor__Group_2_0__1__Impl ;
    public final void rule__Actor__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1500:1: ( rule__Actor__Group_2_0__1__Impl )
            // InternalSequence.g:1501:2: rule__Actor__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__Actor__Group_2_0__1"


    // $ANTLR start "rule__Actor__Group_2_0__1__Impl"
    // InternalSequence.g:1507:1: rule__Actor__Group_2_0__1__Impl : ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? ) ;
    public final void rule__Actor__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1511:1: ( ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? ) )
            // InternalSequence.g:1512:1: ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? )
            {
            // InternalSequence.g:1512:1: ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? )
            // InternalSequence.g:1513:2: ( rule__Actor__TypeMappingAssignment_2_0_1 )?
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_0_1()); 
            // InternalSequence.g:1514:2: ( rule__Actor__TypeMappingAssignment_2_0_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSequence.g:1514:3: rule__Actor__TypeMappingAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__TypeMappingAssignment_2_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getTypeMappingAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_0__1__Impl"


    // $ANTLR start "rule__Actor__Group_2_1__0"
    // InternalSequence.g:1523:1: rule__Actor__Group_2_1__0 : rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 ;
    public final void rule__Actor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1527:1: ( rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 )
            // InternalSequence.g:1528:2: rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Actor__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_1__1();

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
    // $ANTLR end "rule__Actor__Group_2_1__0"


    // $ANTLR start "rule__Actor__Group_2_1__0__Impl"
    // InternalSequence.g:1535:1: rule__Actor__Group_2_1__0__Impl : ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) ) ;
    public final void rule__Actor__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1539:1: ( ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) ) )
            // InternalSequence.g:1540:1: ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) )
            {
            // InternalSequence.g:1540:1: ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) )
            // InternalSequence.g:1541:2: ( rule__Actor__TypeMappingAssignment_2_1_0 )
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_1_0()); 
            // InternalSequence.g:1542:2: ( rule__Actor__TypeMappingAssignment_2_1_0 )
            // InternalSequence.g:1542:3: rule__Actor__TypeMappingAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeMappingAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeMappingAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_1__0__Impl"


    // $ANTLR start "rule__Actor__Group_2_1__1"
    // InternalSequence.g:1550:1: rule__Actor__Group_2_1__1 : rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 ;
    public final void rule__Actor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1554:1: ( rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 )
            // InternalSequence.g:1555:2: rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Actor__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_1__2();

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
    // $ANTLR end "rule__Actor__Group_2_1__1"


    // $ANTLR start "rule__Actor__Group_2_1__1__Impl"
    // InternalSequence.g:1562:1: rule__Actor__Group_2_1__1__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1566:1: ( ( 'as' ) )
            // InternalSequence.g:1567:1: ( 'as' )
            {
            // InternalSequence.g:1567:1: ( 'as' )
            // InternalSequence.g:1568:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_2_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAsKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_1__1__Impl"


    // $ANTLR start "rule__Actor__Group_2_1__2"
    // InternalSequence.g:1577:1: rule__Actor__Group_2_1__2 : rule__Actor__Group_2_1__2__Impl ;
    public final void rule__Actor__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1581:1: ( rule__Actor__Group_2_1__2__Impl )
            // InternalSequence.g:1582:2: rule__Actor__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__Actor__Group_2_1__2"


    // $ANTLR start "rule__Actor__Group_2_1__2__Impl"
    // InternalSequence.g:1588:1: rule__Actor__Group_2_1__2__Impl : ( ( rule__Actor__AliasAssignment_2_1_2 ) ) ;
    public final void rule__Actor__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1592:1: ( ( ( rule__Actor__AliasAssignment_2_1_2 ) ) )
            // InternalSequence.g:1593:1: ( ( rule__Actor__AliasAssignment_2_1_2 ) )
            {
            // InternalSequence.g:1593:1: ( ( rule__Actor__AliasAssignment_2_1_2 ) )
            // InternalSequence.g:1594:2: ( rule__Actor__AliasAssignment_2_1_2 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_1_2()); 
            // InternalSequence.g:1595:2: ( rule__Actor__AliasAssignment_2_1_2 )
            // InternalSequence.g:1595:3: rule__Actor__AliasAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor__AliasAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAliasAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_1__2__Impl"


    // $ANTLR start "rule__Actor__Group_2_2__0"
    // InternalSequence.g:1604:1: rule__Actor__Group_2_2__0 : rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 ;
    public final void rule__Actor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1608:1: ( rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 )
            // InternalSequence.g:1609:2: rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Actor__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_2__1();

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
    // $ANTLR end "rule__Actor__Group_2_2__0"


    // $ANTLR start "rule__Actor__Group_2_2__0__Impl"
    // InternalSequence.g:1616:1: rule__Actor__Group_2_2__0__Impl : ( ( rule__Actor__NameAssignment_2_2_0 ) ) ;
    public final void rule__Actor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1620:1: ( ( ( rule__Actor__NameAssignment_2_2_0 ) ) )
            // InternalSequence.g:1621:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            {
            // InternalSequence.g:1621:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            // InternalSequence.g:1622:2: ( rule__Actor__NameAssignment_2_2_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_2_0()); 
            // InternalSequence.g:1623:2: ( rule__Actor__NameAssignment_2_2_0 )
            // InternalSequence.g:1623:3: rule__Actor__NameAssignment_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_2__0__Impl"


    // $ANTLR start "rule__Actor__Group_2_2__1"
    // InternalSequence.g:1631:1: rule__Actor__Group_2_2__1 : rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 ;
    public final void rule__Actor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1635:1: ( rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 )
            // InternalSequence.g:1636:2: rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2
            {
            pushFollow(FOLLOW_15);
            rule__Actor__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_2__2();

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
    // $ANTLR end "rule__Actor__Group_2_2__1"


    // $ANTLR start "rule__Actor__Group_2_2__1__Impl"
    // InternalSequence.g:1643:1: rule__Actor__Group_2_2__1__Impl : ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? ) ;
    public final void rule__Actor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1647:1: ( ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? ) )
            // InternalSequence.g:1648:1: ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? )
            {
            // InternalSequence.g:1648:1: ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? )
            // InternalSequence.g:1649:2: ( rule__Actor__TypeMappingAssignment_2_2_1 )?
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_2_1()); 
            // InternalSequence.g:1650:2: ( rule__Actor__TypeMappingAssignment_2_2_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSequence.g:1650:3: rule__Actor__TypeMappingAssignment_2_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__TypeMappingAssignment_2_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getTypeMappingAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_2__1__Impl"


    // $ANTLR start "rule__Actor__Group_2_2__2"
    // InternalSequence.g:1658:1: rule__Actor__Group_2_2__2 : rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 ;
    public final void rule__Actor__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1662:1: ( rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 )
            // InternalSequence.g:1663:2: rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3
            {
            pushFollow(FOLLOW_9);
            rule__Actor__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_2__3();

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
    // $ANTLR end "rule__Actor__Group_2_2__2"


    // $ANTLR start "rule__Actor__Group_2_2__2__Impl"
    // InternalSequence.g:1670:1: rule__Actor__Group_2_2__2__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1674:1: ( ( 'as' ) )
            // InternalSequence.g:1675:1: ( 'as' )
            {
            // InternalSequence.g:1675:1: ( 'as' )
            // InternalSequence.g:1676:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_2_2_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAsKeyword_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_2__2__Impl"


    // $ANTLR start "rule__Actor__Group_2_2__3"
    // InternalSequence.g:1685:1: rule__Actor__Group_2_2__3 : rule__Actor__Group_2_2__3__Impl ;
    public final void rule__Actor__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1689:1: ( rule__Actor__Group_2_2__3__Impl )
            // InternalSequence.g:1690:2: rule__Actor__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_2__3__Impl();

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
    // $ANTLR end "rule__Actor__Group_2_2__3"


    // $ANTLR start "rule__Actor__Group_2_2__3__Impl"
    // InternalSequence.g:1696:1: rule__Actor__Group_2_2__3__Impl : ( ( rule__Actor__AliasAssignment_2_2_3 ) ) ;
    public final void rule__Actor__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1700:1: ( ( ( rule__Actor__AliasAssignment_2_2_3 ) ) )
            // InternalSequence.g:1701:1: ( ( rule__Actor__AliasAssignment_2_2_3 ) )
            {
            // InternalSequence.g:1701:1: ( ( rule__Actor__AliasAssignment_2_2_3 ) )
            // InternalSequence.g:1702:2: ( rule__Actor__AliasAssignment_2_2_3 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_2_3()); 
            // InternalSequence.g:1703:2: ( rule__Actor__AliasAssignment_2_2_3 )
            // InternalSequence.g:1703:3: rule__Actor__AliasAssignment_2_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Actor__AliasAssignment_2_2_3();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAliasAssignment_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_2__3__Impl"


    // $ANTLR start "rule__Actor__Group_3__0"
    // InternalSequence.g:1712:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1716:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // InternalSequence.g:1717:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Actor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_3__1();

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
    // $ANTLR end "rule__Actor__Group_3__0"


    // $ANTLR start "rule__Actor__Group_3__0__Impl"
    // InternalSequence.g:1724:1: rule__Actor__Group_3__0__Impl : ( 'role[' ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1728:1: ( ( 'role[' ) )
            // InternalSequence.g:1729:1: ( 'role[' )
            {
            // InternalSequence.g:1729:1: ( 'role[' )
            // InternalSequence.g:1730:2: 'role['
            {
             before(grammarAccess.getActorAccess().getRoleKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getRoleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_3__0__Impl"


    // $ANTLR start "rule__Actor__Group_3__1"
    // InternalSequence.g:1739:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1743:1: ( rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 )
            // InternalSequence.g:1744:2: rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__Actor__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_3__2();

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
    // $ANTLR end "rule__Actor__Group_3__1"


    // $ANTLR start "rule__Actor__Group_3__1__Impl"
    // InternalSequence.g:1751:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1755:1: ( ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) )
            // InternalSequence.g:1756:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            {
            // InternalSequence.g:1756:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            // InternalSequence.g:1757:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            {
             before(grammarAccess.getActorAccess().getActorTypeAssignment_3_1()); 
            // InternalSequence.g:1758:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            // InternalSequence.g:1758:3: rule__Actor__ActorTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__ActorTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getActorTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_3__1__Impl"


    // $ANTLR start "rule__Actor__Group_3__2"
    // InternalSequence.g:1766:1: rule__Actor__Group_3__2 : rule__Actor__Group_3__2__Impl ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1770:1: ( rule__Actor__Group_3__2__Impl )
            // InternalSequence.g:1771:2: rule__Actor__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_3__2__Impl();

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
    // $ANTLR end "rule__Actor__Group_3__2"


    // $ANTLR start "rule__Actor__Group_3__2__Impl"
    // InternalSequence.g:1777:1: rule__Actor__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Actor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1781:1: ( ( ']' ) )
            // InternalSequence.g:1782:1: ( ']' )
            {
            // InternalSequence.g:1782:1: ( ']' )
            // InternalSequence.g:1783:2: ']'
            {
             before(grammarAccess.getActorAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getRightSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_3__2__Impl"


    // $ANTLR start "rule__ActorClassifierMapping__Group__0"
    // InternalSequence.g:1793:1: rule__ActorClassifierMapping__Group__0 : rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1 ;
    public final void rule__ActorClassifierMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1797:1: ( rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1 )
            // InternalSequence.g:1798:2: rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ActorClassifierMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorClassifierMapping__Group__1();

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
    // $ANTLR end "rule__ActorClassifierMapping__Group__0"


    // $ANTLR start "rule__ActorClassifierMapping__Group__0__Impl"
    // InternalSequence.g:1805:1: rule__ActorClassifierMapping__Group__0__Impl : ( ':' ) ;
    public final void rule__ActorClassifierMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1809:1: ( ( ':' ) )
            // InternalSequence.g:1810:1: ( ':' )
            {
            // InternalSequence.g:1810:1: ( ':' )
            // InternalSequence.g:1811:2: ':'
            {
             before(grammarAccess.getActorClassifierMappingAccess().getColonKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActorClassifierMappingAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorClassifierMapping__Group__0__Impl"


    // $ANTLR start "rule__ActorClassifierMapping__Group__1"
    // InternalSequence.g:1820:1: rule__ActorClassifierMapping__Group__1 : rule__ActorClassifierMapping__Group__1__Impl ;
    public final void rule__ActorClassifierMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1824:1: ( rule__ActorClassifierMapping__Group__1__Impl )
            // InternalSequence.g:1825:2: rule__ActorClassifierMapping__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActorClassifierMapping__Group__1__Impl();

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
    // $ANTLR end "rule__ActorClassifierMapping__Group__1"


    // $ANTLR start "rule__ActorClassifierMapping__Group__1__Impl"
    // InternalSequence.g:1831:1: rule__ActorClassifierMapping__Group__1__Impl : ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) ) ;
    public final void rule__ActorClassifierMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1835:1: ( ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) ) )
            // InternalSequence.g:1836:1: ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) )
            {
            // InternalSequence.g:1836:1: ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) )
            // InternalSequence.g:1837:2: ( rule__ActorClassifierMapping__ClassifierAssignment_1 )
            {
             before(grammarAccess.getActorClassifierMappingAccess().getClassifierAssignment_1()); 
            // InternalSequence.g:1838:2: ( rule__ActorClassifierMapping__ClassifierAssignment_1 )
            // InternalSequence.g:1838:3: rule__ActorClassifierMapping__ClassifierAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActorClassifierMapping__ClassifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorClassifierMappingAccess().getClassifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorClassifierMapping__Group__1__Impl"


    // $ANTLR start "rule__BehaviorFragments__Group_0__0"
    // InternalSequence.g:1847:1: rule__BehaviorFragments__Group_0__0 : rule__BehaviorFragments__Group_0__0__Impl rule__BehaviorFragments__Group_0__1 ;
    public final void rule__BehaviorFragments__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1851:1: ( rule__BehaviorFragments__Group_0__0__Impl rule__BehaviorFragments__Group_0__1 )
            // InternalSequence.g:1852:2: rule__BehaviorFragments__Group_0__0__Impl rule__BehaviorFragments__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__BehaviorFragments__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorFragments__Group_0__1();

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
    // $ANTLR end "rule__BehaviorFragments__Group_0__0"


    // $ANTLR start "rule__BehaviorFragments__Group_0__0__Impl"
    // InternalSequence.g:1859:1: rule__BehaviorFragments__Group_0__0__Impl : ( '{' ) ;
    public final void rule__BehaviorFragments__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1863:1: ( ( '{' ) )
            // InternalSequence.g:1864:1: ( '{' )
            {
            // InternalSequence.g:1864:1: ( '{' )
            // InternalSequence.g:1865:2: '{'
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBehaviorFragmentsAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragments__Group_0__0__Impl"


    // $ANTLR start "rule__BehaviorFragments__Group_0__1"
    // InternalSequence.g:1874:1: rule__BehaviorFragments__Group_0__1 : rule__BehaviorFragments__Group_0__1__Impl rule__BehaviorFragments__Group_0__2 ;
    public final void rule__BehaviorFragments__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1878:1: ( rule__BehaviorFragments__Group_0__1__Impl rule__BehaviorFragments__Group_0__2 )
            // InternalSequence.g:1879:2: rule__BehaviorFragments__Group_0__1__Impl rule__BehaviorFragments__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__BehaviorFragments__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorFragments__Group_0__2();

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
    // $ANTLR end "rule__BehaviorFragments__Group_0__1"


    // $ANTLR start "rule__BehaviorFragments__Group_0__1__Impl"
    // InternalSequence.g:1886:1: rule__BehaviorFragments__Group_0__1__Impl : ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) ) ;
    public final void rule__BehaviorFragments__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1890:1: ( ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) ) )
            // InternalSequence.g:1891:1: ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) )
            {
            // InternalSequence.g:1891:1: ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) )
            // InternalSequence.g:1892:2: ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* )
            {
            // InternalSequence.g:1892:2: ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) )
            // InternalSequence.g:1893:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_0_1()); 
            // InternalSequence.g:1894:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )
            // InternalSequence.g:1894:4: rule__BehaviorFragments__FragmentsAssignment_0_1
            {
            pushFollow(FOLLOW_8);
            rule__BehaviorFragments__FragmentsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_0_1()); 

            }

            // InternalSequence.g:1897:2: ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* )
            // InternalSequence.g:1898:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )*
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_0_1()); 
            // InternalSequence.g:1899:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=12 && LA19_0<=13)||(LA19_0>=36 && LA19_0<=45)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSequence.g:1899:4: rule__BehaviorFragments__FragmentsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BehaviorFragments__FragmentsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragments__Group_0__1__Impl"


    // $ANTLR start "rule__BehaviorFragments__Group_0__2"
    // InternalSequence.g:1908:1: rule__BehaviorFragments__Group_0__2 : rule__BehaviorFragments__Group_0__2__Impl ;
    public final void rule__BehaviorFragments__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1912:1: ( rule__BehaviorFragments__Group_0__2__Impl )
            // InternalSequence.g:1913:2: rule__BehaviorFragments__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorFragments__Group_0__2__Impl();

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
    // $ANTLR end "rule__BehaviorFragments__Group_0__2"


    // $ANTLR start "rule__BehaviorFragments__Group_0__2__Impl"
    // InternalSequence.g:1919:1: rule__BehaviorFragments__Group_0__2__Impl : ( '}' ) ;
    public final void rule__BehaviorFragments__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1923:1: ( ( '}' ) )
            // InternalSequence.g:1924:1: ( '}' )
            {
            // InternalSequence.g:1924:1: ( '}' )
            // InternalSequence.g:1925:2: '}'
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBehaviorFragmentsAccess().getRightCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragments__Group_0__2__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalSequence.g:1935:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1939:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalSequence.g:1940:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__1();

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
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalSequence.g:1947:1: rule__Message__Group__0__Impl : ( ( rule__Message__Alternatives_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1951:1: ( ( ( rule__Message__Alternatives_0 ) ) )
            // InternalSequence.g:1952:1: ( ( rule__Message__Alternatives_0 ) )
            {
            // InternalSequence.g:1952:1: ( ( rule__Message__Alternatives_0 ) )
            // InternalSequence.g:1953:2: ( rule__Message__Alternatives_0 )
            {
             before(grammarAccess.getMessageAccess().getAlternatives_0()); 
            // InternalSequence.g:1954:2: ( rule__Message__Alternatives_0 )
            // InternalSequence.g:1954:3: rule__Message__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // InternalSequence.g:1962:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1966:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalSequence.g:1967:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__2();

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
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalSequence.g:1974:1: rule__Message__Group__1__Impl : ( ( rule__Message__Group_1__0 )? ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1978:1: ( ( ( rule__Message__Group_1__0 )? ) )
            // InternalSequence.g:1979:1: ( ( rule__Message__Group_1__0 )? )
            {
            // InternalSequence.g:1979:1: ( ( rule__Message__Group_1__0 )? )
            // InternalSequence.g:1980:2: ( rule__Message__Group_1__0 )?
            {
             before(grammarAccess.getMessageAccess().getGroup_1()); 
            // InternalSequence.g:1981:2: ( rule__Message__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSequence.g:1981:3: rule__Message__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // InternalSequence.g:1989:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1993:1: ( rule__Message__Group__2__Impl )
            // InternalSequence.g:1994:2: rule__Message__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__2__Impl();

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
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalSequence.g:2000:1: rule__Message__Group__2__Impl : ( ( rule__Message__TimeConstraintAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2004:1: ( ( ( rule__Message__TimeConstraintAssignment_2 )? ) )
            // InternalSequence.g:2005:1: ( ( rule__Message__TimeConstraintAssignment_2 )? )
            {
            // InternalSequence.g:2005:1: ( ( rule__Message__TimeConstraintAssignment_2 )? )
            // InternalSequence.g:2006:2: ( rule__Message__TimeConstraintAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getTimeConstraintAssignment_2()); 
            // InternalSequence.g:2007:2: ( rule__Message__TimeConstraintAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSequence.g:2007:3: rule__Message__TimeConstraintAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__TimeConstraintAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getTimeConstraintAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group_1__0"
    // InternalSequence.g:2016:1: rule__Message__Group_1__0 : rule__Message__Group_1__0__Impl rule__Message__Group_1__1 ;
    public final void rule__Message__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2020:1: ( rule__Message__Group_1__0__Impl rule__Message__Group_1__1 )
            // InternalSequence.g:2021:2: rule__Message__Group_1__0__Impl rule__Message__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Message__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_1__1();

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
    // $ANTLR end "rule__Message__Group_1__0"


    // $ANTLR start "rule__Message__Group_1__0__Impl"
    // InternalSequence.g:2028:1: rule__Message__Group_1__0__Impl : ( 'num[' ) ;
    public final void rule__Message__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2032:1: ( ( 'num[' ) )
            // InternalSequence.g:2033:1: ( 'num[' )
            {
            // InternalSequence.g:2033:1: ( 'num[' )
            // InternalSequence.g:2034:2: 'num['
            {
             before(grammarAccess.getMessageAccess().getNumKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getNumKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__0__Impl"


    // $ANTLR start "rule__Message__Group_1__1"
    // InternalSequence.g:2043:1: rule__Message__Group_1__1 : rule__Message__Group_1__1__Impl rule__Message__Group_1__2 ;
    public final void rule__Message__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2047:1: ( rule__Message__Group_1__1__Impl rule__Message__Group_1__2 )
            // InternalSequence.g:2048:2: rule__Message__Group_1__1__Impl rule__Message__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Message__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_1__2();

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
    // $ANTLR end "rule__Message__Group_1__1"


    // $ANTLR start "rule__Message__Group_1__1__Impl"
    // InternalSequence.g:2055:1: rule__Message__Group_1__1__Impl : ( ( rule__Message__OrderAssignment_1_1 ) ) ;
    public final void rule__Message__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2059:1: ( ( ( rule__Message__OrderAssignment_1_1 ) ) )
            // InternalSequence.g:2060:1: ( ( rule__Message__OrderAssignment_1_1 ) )
            {
            // InternalSequence.g:2060:1: ( ( rule__Message__OrderAssignment_1_1 ) )
            // InternalSequence.g:2061:2: ( rule__Message__OrderAssignment_1_1 )
            {
             before(grammarAccess.getMessageAccess().getOrderAssignment_1_1()); 
            // InternalSequence.g:2062:2: ( rule__Message__OrderAssignment_1_1 )
            // InternalSequence.g:2062:3: rule__Message__OrderAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__OrderAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getOrderAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__1__Impl"


    // $ANTLR start "rule__Message__Group_1__2"
    // InternalSequence.g:2070:1: rule__Message__Group_1__2 : rule__Message__Group_1__2__Impl ;
    public final void rule__Message__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2074:1: ( rule__Message__Group_1__2__Impl )
            // InternalSequence.g:2075:2: rule__Message__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_1__2__Impl();

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
    // $ANTLR end "rule__Message__Group_1__2"


    // $ANTLR start "rule__Message__Group_1__2__Impl"
    // InternalSequence.g:2081:1: rule__Message__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Message__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2085:1: ( ( ']' ) )
            // InternalSequence.g:2086:1: ( ']' )
            {
            // InternalSequence.g:2086:1: ( ']' )
            // InternalSequence.g:2087:2: ']'
            {
             before(grammarAccess.getMessageAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__2__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__0"
    // InternalSequence.g:2097:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2101:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // InternalSequence.g:2102:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TimeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConstraint__Group__1();

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
    // $ANTLR end "rule__TimeConstraint__Group__0"


    // $ANTLR start "rule__TimeConstraint__Group__0__Impl"
    // InternalSequence.g:2109:1: rule__TimeConstraint__Group__0__Impl : ( 'time[' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2113:1: ( ( 'time[' ) )
            // InternalSequence.g:2114:1: ( 'time[' )
            {
            // InternalSequence.g:2114:1: ( 'time[' )
            // InternalSequence.g:2115:2: 'time['
            {
             before(grammarAccess.getTimeConstraintAccess().getTimeKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTimeConstraintAccess().getTimeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__0__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__1"
    // InternalSequence.g:2124:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2128:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // InternalSequence.g:2129:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__TimeConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConstraint__Group__2();

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
    // $ANTLR end "rule__TimeConstraint__Group__1"


    // $ANTLR start "rule__TimeConstraint__Group__1__Impl"
    // InternalSequence.g:2136:1: rule__TimeConstraint__Group__1__Impl : ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2140:1: ( ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) ) )
            // InternalSequence.g:2141:1: ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) )
            {
            // InternalSequence.g:2141:1: ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) )
            // InternalSequence.g:2142:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* )
            {
            // InternalSequence.g:2142:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) )
            // InternalSequence.g:2143:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 
            // InternalSequence.g:2144:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )
            // InternalSequence.g:2144:4: rule__TimeConstraint__ConstraintsAssignment_1
            {
            pushFollow(FOLLOW_23);
            rule__TimeConstraint__ConstraintsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 

            }

            // InternalSequence.g:2147:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* )
            // InternalSequence.g:2148:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 
            // InternalSequence.g:2149:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=16 && LA22_0<=19)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSequence.g:2149:4: rule__TimeConstraint__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__TimeConstraint__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__1__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__2"
    // InternalSequence.g:2158:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2162:1: ( rule__TimeConstraint__Group__2__Impl )
            // InternalSequence.g:2163:2: rule__TimeConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeConstraint__Group__2__Impl();

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
    // $ANTLR end "rule__TimeConstraint__Group__2"


    // $ANTLR start "rule__TimeConstraint__Group__2__Impl"
    // InternalSequence.g:2169:1: rule__TimeConstraint__Group__2__Impl : ( ']' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2173:1: ( ( ']' ) )
            // InternalSequence.g:2174:1: ( ']' )
            {
            // InternalSequence.g:2174:1: ( ']' )
            // InternalSequence.g:2175:2: ']'
            {
             before(grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__2__Impl"


    // $ANTLR start "rule__InnerTimeConstraint__Group__0"
    // InternalSequence.g:2185:1: rule__InnerTimeConstraint__Group__0 : rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1 ;
    public final void rule__InnerTimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2189:1: ( rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1 )
            // InternalSequence.g:2190:2: rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__InnerTimeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerTimeConstraint__Group__1();

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
    // $ANTLR end "rule__InnerTimeConstraint__Group__0"


    // $ANTLR start "rule__InnerTimeConstraint__Group__0__Impl"
    // InternalSequence.g:2197:1: rule__InnerTimeConstraint__Group__0__Impl : ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) ) ;
    public final void rule__InnerTimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2201:1: ( ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) ) )
            // InternalSequence.g:2202:1: ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) )
            {
            // InternalSequence.g:2202:1: ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) )
            // InternalSequence.g:2203:2: ( rule__InnerTimeConstraint__TypeAssignment_0 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getTypeAssignment_0()); 
            // InternalSequence.g:2204:2: ( rule__InnerTimeConstraint__TypeAssignment_0 )
            // InternalSequence.g:2204:3: rule__InnerTimeConstraint__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InnerTimeConstraint__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerTimeConstraintAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerTimeConstraint__Group__0__Impl"


    // $ANTLR start "rule__InnerTimeConstraint__Group__1"
    // InternalSequence.g:2212:1: rule__InnerTimeConstraint__Group__1 : rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2 ;
    public final void rule__InnerTimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2216:1: ( rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2 )
            // InternalSequence.g:2217:2: rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InnerTimeConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerTimeConstraint__Group__2();

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
    // $ANTLR end "rule__InnerTimeConstraint__Group__1"


    // $ANTLR start "rule__InnerTimeConstraint__Group__1__Impl"
    // InternalSequence.g:2224:1: rule__InnerTimeConstraint__Group__1__Impl : ( '=' ) ;
    public final void rule__InnerTimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2228:1: ( ( '=' ) )
            // InternalSequence.g:2229:1: ( '=' )
            {
            // InternalSequence.g:2229:1: ( '=' )
            // InternalSequence.g:2230:2: '='
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInnerTimeConstraintAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerTimeConstraint__Group__1__Impl"


    // $ANTLR start "rule__InnerTimeConstraint__Group__2"
    // InternalSequence.g:2239:1: rule__InnerTimeConstraint__Group__2 : rule__InnerTimeConstraint__Group__2__Impl ;
    public final void rule__InnerTimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2243:1: ( rule__InnerTimeConstraint__Group__2__Impl )
            // InternalSequence.g:2244:2: rule__InnerTimeConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerTimeConstraint__Group__2__Impl();

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
    // $ANTLR end "rule__InnerTimeConstraint__Group__2"


    // $ANTLR start "rule__InnerTimeConstraint__Group__2__Impl"
    // InternalSequence.g:2250:1: rule__InnerTimeConstraint__Group__2__Impl : ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) ) ;
    public final void rule__InnerTimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2254:1: ( ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) ) )
            // InternalSequence.g:2255:1: ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) )
            {
            // InternalSequence.g:2255:1: ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) )
            // InternalSequence.g:2256:2: ( rule__InnerTimeConstraint__ValueAssignment_2 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getValueAssignment_2()); 
            // InternalSequence.g:2257:2: ( rule__InnerTimeConstraint__ValueAssignment_2 )
            // InternalSequence.g:2257:3: rule__InnerTimeConstraint__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InnerTimeConstraint__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInnerTimeConstraintAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerTimeConstraint__Group__2__Impl"


    // $ANTLR start "rule__StandardMessage__Group__0"
    // InternalSequence.g:2266:1: rule__StandardMessage__Group__0 : rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 ;
    public final void rule__StandardMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2270:1: ( rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 )
            // InternalSequence.g:2271:2: rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__StandardMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__1();

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
    // $ANTLR end "rule__StandardMessage__Group__0"


    // $ANTLR start "rule__StandardMessage__Group__0__Impl"
    // InternalSequence.g:2278:1: rule__StandardMessage__Group__0__Impl : ( ( rule__StandardMessage__TypeAssignment_0 ) ) ;
    public final void rule__StandardMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2282:1: ( ( ( rule__StandardMessage__TypeAssignment_0 ) ) )
            // InternalSequence.g:2283:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            {
            // InternalSequence.g:2283:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            // InternalSequence.g:2284:2: ( rule__StandardMessage__TypeAssignment_0 )
            {
             before(grammarAccess.getStandardMessageAccess().getTypeAssignment_0()); 
            // InternalSequence.g:2285:2: ( rule__StandardMessage__TypeAssignment_0 )
            // InternalSequence.g:2285:3: rule__StandardMessage__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStandardMessageAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__0__Impl"


    // $ANTLR start "rule__StandardMessage__Group__1"
    // InternalSequence.g:2293:1: rule__StandardMessage__Group__1 : rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 ;
    public final void rule__StandardMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2297:1: ( rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 )
            // InternalSequence.g:2298:2: rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__StandardMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__2();

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
    // $ANTLR end "rule__StandardMessage__Group__1"


    // $ANTLR start "rule__StandardMessage__Group__1__Impl"
    // InternalSequence.g:2305:1: rule__StandardMessage__Group__1__Impl : ( ( rule__StandardMessage__NameAssignment_1 ) ) ;
    public final void rule__StandardMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2309:1: ( ( ( rule__StandardMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:2310:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:2310:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            // InternalSequence.g:2311:2: ( rule__StandardMessage__NameAssignment_1 )
            {
             before(grammarAccess.getStandardMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:2312:2: ( rule__StandardMessage__NameAssignment_1 )
            // InternalSequence.g:2312:3: rule__StandardMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStandardMessageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__1__Impl"


    // $ANTLR start "rule__StandardMessage__Group__2"
    // InternalSequence.g:2320:1: rule__StandardMessage__Group__2 : rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 ;
    public final void rule__StandardMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2324:1: ( rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 )
            // InternalSequence.g:2325:2: rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__StandardMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__3();

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
    // $ANTLR end "rule__StandardMessage__Group__2"


    // $ANTLR start "rule__StandardMessage__Group__2__Impl"
    // InternalSequence.g:2332:1: rule__StandardMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__StandardMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2336:1: ( ( '(' ) )
            // InternalSequence.g:2337:1: ( '(' )
            {
            // InternalSequence.g:2337:1: ( '(' )
            // InternalSequence.g:2338:2: '('
            {
             before(grammarAccess.getStandardMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStandardMessageAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__2__Impl"


    // $ANTLR start "rule__StandardMessage__Group__3"
    // InternalSequence.g:2347:1: rule__StandardMessage__Group__3 : rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 ;
    public final void rule__StandardMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2351:1: ( rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 )
            // InternalSequence.g:2352:2: rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__StandardMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__4();

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
    // $ANTLR end "rule__StandardMessage__Group__3"


    // $ANTLR start "rule__StandardMessage__Group__3__Impl"
    // InternalSequence.g:2359:1: rule__StandardMessage__Group__3__Impl : ( ( rule__StandardMessage__LeftAssignment_3 ) ) ;
    public final void rule__StandardMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2363:1: ( ( ( rule__StandardMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:2364:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:2364:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            // InternalSequence.g:2365:2: ( rule__StandardMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:2366:2: ( rule__StandardMessage__LeftAssignment_3 )
            // InternalSequence.g:2366:3: rule__StandardMessage__LeftAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__LeftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStandardMessageAccess().getLeftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__3__Impl"


    // $ANTLR start "rule__StandardMessage__Group__4"
    // InternalSequence.g:2374:1: rule__StandardMessage__Group__4 : rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 ;
    public final void rule__StandardMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2378:1: ( rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 )
            // InternalSequence.g:2379:2: rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__StandardMessage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__5();

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
    // $ANTLR end "rule__StandardMessage__Group__4"


    // $ANTLR start "rule__StandardMessage__Group__4__Impl"
    // InternalSequence.g:2386:1: rule__StandardMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__StandardMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2390:1: ( ( ',' ) )
            // InternalSequence.g:2391:1: ( ',' )
            {
            // InternalSequence.g:2391:1: ( ',' )
            // InternalSequence.g:2392:2: ','
            {
             before(grammarAccess.getStandardMessageAccess().getCommaKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStandardMessageAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__4__Impl"


    // $ANTLR start "rule__StandardMessage__Group__5"
    // InternalSequence.g:2401:1: rule__StandardMessage__Group__5 : rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 ;
    public final void rule__StandardMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2405:1: ( rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 )
            // InternalSequence.g:2406:2: rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__StandardMessage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__6();

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
    // $ANTLR end "rule__StandardMessage__Group__5"


    // $ANTLR start "rule__StandardMessage__Group__5__Impl"
    // InternalSequence.g:2413:1: rule__StandardMessage__Group__5__Impl : ( ( rule__StandardMessage__RightAssignment_5 ) ) ;
    public final void rule__StandardMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2417:1: ( ( ( rule__StandardMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:2418:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:2418:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            // InternalSequence.g:2419:2: ( rule__StandardMessage__RightAssignment_5 )
            {
             before(grammarAccess.getStandardMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:2420:2: ( rule__StandardMessage__RightAssignment_5 )
            // InternalSequence.g:2420:3: rule__StandardMessage__RightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStandardMessageAccess().getRightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__5__Impl"


    // $ANTLR start "rule__StandardMessage__Group__6"
    // InternalSequence.g:2428:1: rule__StandardMessage__Group__6 : rule__StandardMessage__Group__6__Impl ;
    public final void rule__StandardMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2432:1: ( rule__StandardMessage__Group__6__Impl )
            // InternalSequence.g:2433:2: rule__StandardMessage__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__6__Impl();

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
    // $ANTLR end "rule__StandardMessage__Group__6"


    // $ANTLR start "rule__StandardMessage__Group__6__Impl"
    // InternalSequence.g:2439:1: rule__StandardMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__StandardMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2443:1: ( ( ')' ) )
            // InternalSequence.g:2444:1: ( ')' )
            {
            // InternalSequence.g:2444:1: ( ')' )
            // InternalSequence.g:2445:2: ')'
            {
             before(grammarAccess.getStandardMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStandardMessageAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__6__Impl"


    // $ANTLR start "rule__ResponseMessage__Group__0"
    // InternalSequence.g:2455:1: rule__ResponseMessage__Group__0 : rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 ;
    public final void rule__ResponseMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2459:1: ( rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 )
            // InternalSequence.g:2460:2: rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ResponseMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__1();

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
    // $ANTLR end "rule__ResponseMessage__Group__0"


    // $ANTLR start "rule__ResponseMessage__Group__0__Impl"
    // InternalSequence.g:2467:1: rule__ResponseMessage__Group__0__Impl : ( 'reply' ) ;
    public final void rule__ResponseMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2471:1: ( ( 'reply' ) )
            // InternalSequence.g:2472:1: ( 'reply' )
            {
            // InternalSequence.g:2472:1: ( 'reply' )
            // InternalSequence.g:2473:2: 'reply'
            {
             before(grammarAccess.getResponseMessageAccess().getReplyKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getResponseMessageAccess().getReplyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__0__Impl"


    // $ANTLR start "rule__ResponseMessage__Group__1"
    // InternalSequence.g:2482:1: rule__ResponseMessage__Group__1 : rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 ;
    public final void rule__ResponseMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2486:1: ( rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 )
            // InternalSequence.g:2487:2: rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ResponseMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__2();

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
    // $ANTLR end "rule__ResponseMessage__Group__1"


    // $ANTLR start "rule__ResponseMessage__Group__1__Impl"
    // InternalSequence.g:2494:1: rule__ResponseMessage__Group__1__Impl : ( ( rule__ResponseMessage__NameAssignment_1 ) ) ;
    public final void rule__ResponseMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2498:1: ( ( ( rule__ResponseMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:2499:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:2499:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            // InternalSequence.g:2500:2: ( rule__ResponseMessage__NameAssignment_1 )
            {
             before(grammarAccess.getResponseMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:2501:2: ( rule__ResponseMessage__NameAssignment_1 )
            // InternalSequence.g:2501:3: rule__ResponseMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ResponseMessage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseMessageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__1__Impl"


    // $ANTLR start "rule__ResponseMessage__Group__2"
    // InternalSequence.g:2509:1: rule__ResponseMessage__Group__2 : rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 ;
    public final void rule__ResponseMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2513:1: ( rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 )
            // InternalSequence.g:2514:2: rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ResponseMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__3();

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
    // $ANTLR end "rule__ResponseMessage__Group__2"


    // $ANTLR start "rule__ResponseMessage__Group__2__Impl"
    // InternalSequence.g:2521:1: rule__ResponseMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__ResponseMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2525:1: ( ( '(' ) )
            // InternalSequence.g:2526:1: ( '(' )
            {
            // InternalSequence.g:2526:1: ( '(' )
            // InternalSequence.g:2527:2: '('
            {
             before(grammarAccess.getResponseMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getResponseMessageAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__2__Impl"


    // $ANTLR start "rule__ResponseMessage__Group__3"
    // InternalSequence.g:2536:1: rule__ResponseMessage__Group__3 : rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 ;
    public final void rule__ResponseMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2540:1: ( rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 )
            // InternalSequence.g:2541:2: rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__ResponseMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__4();

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
    // $ANTLR end "rule__ResponseMessage__Group__3"


    // $ANTLR start "rule__ResponseMessage__Group__3__Impl"
    // InternalSequence.g:2548:1: rule__ResponseMessage__Group__3__Impl : ( ( rule__ResponseMessage__Alternatives_3 ) ) ;
    public final void rule__ResponseMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2552:1: ( ( ( rule__ResponseMessage__Alternatives_3 ) ) )
            // InternalSequence.g:2553:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            {
            // InternalSequence.g:2553:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            // InternalSequence.g:2554:2: ( rule__ResponseMessage__Alternatives_3 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_3()); 
            // InternalSequence.g:2555:2: ( rule__ResponseMessage__Alternatives_3 )
            // InternalSequence.g:2555:3: rule__ResponseMessage__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getResponseMessageAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__3__Impl"


    // $ANTLR start "rule__ResponseMessage__Group__4"
    // InternalSequence.g:2563:1: rule__ResponseMessage__Group__4 : rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 ;
    public final void rule__ResponseMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2567:1: ( rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 )
            // InternalSequence.g:2568:2: rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__ResponseMessage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__5();

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
    // $ANTLR end "rule__ResponseMessage__Group__4"


    // $ANTLR start "rule__ResponseMessage__Group__4__Impl"
    // InternalSequence.g:2575:1: rule__ResponseMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__ResponseMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2579:1: ( ( ',' ) )
            // InternalSequence.g:2580:1: ( ',' )
            {
            // InternalSequence.g:2580:1: ( ',' )
            // InternalSequence.g:2581:2: ','
            {
             before(grammarAccess.getResponseMessageAccess().getCommaKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getResponseMessageAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__4__Impl"


    // $ANTLR start "rule__ResponseMessage__Group__5"
    // InternalSequence.g:2590:1: rule__ResponseMessage__Group__5 : rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 ;
    public final void rule__ResponseMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2594:1: ( rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 )
            // InternalSequence.g:2595:2: rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__ResponseMessage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__6();

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
    // $ANTLR end "rule__ResponseMessage__Group__5"


    // $ANTLR start "rule__ResponseMessage__Group__5__Impl"
    // InternalSequence.g:2602:1: rule__ResponseMessage__Group__5__Impl : ( ( rule__ResponseMessage__Alternatives_5 ) ) ;
    public final void rule__ResponseMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2606:1: ( ( ( rule__ResponseMessage__Alternatives_5 ) ) )
            // InternalSequence.g:2607:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            {
            // InternalSequence.g:2607:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            // InternalSequence.g:2608:2: ( rule__ResponseMessage__Alternatives_5 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_5()); 
            // InternalSequence.g:2609:2: ( rule__ResponseMessage__Alternatives_5 )
            // InternalSequence.g:2609:3: rule__ResponseMessage__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getResponseMessageAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__5__Impl"


    // $ANTLR start "rule__ResponseMessage__Group__6"
    // InternalSequence.g:2617:1: rule__ResponseMessage__Group__6 : rule__ResponseMessage__Group__6__Impl ;
    public final void rule__ResponseMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2621:1: ( rule__ResponseMessage__Group__6__Impl )
            // InternalSequence.g:2622:2: rule__ResponseMessage__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__6__Impl();

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
    // $ANTLR end "rule__ResponseMessage__Group__6"


    // $ANTLR start "rule__ResponseMessage__Group__6__Impl"
    // InternalSequence.g:2628:1: rule__ResponseMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__ResponseMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2632:1: ( ( ')' ) )
            // InternalSequence.g:2633:1: ( ')' )
            {
            // InternalSequence.g:2633:1: ( ')' )
            // InternalSequence.g:2634:2: ')'
            {
             before(grammarAccess.getResponseMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getResponseMessageAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__6__Impl"


    // $ANTLR start "rule__FoundMessage__Group__0"
    // InternalSequence.g:2644:1: rule__FoundMessage__Group__0 : rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 ;
    public final void rule__FoundMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2648:1: ( rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 )
            // InternalSequence.g:2649:2: rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__FoundMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__1();

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
    // $ANTLR end "rule__FoundMessage__Group__0"


    // $ANTLR start "rule__FoundMessage__Group__0__Impl"
    // InternalSequence.g:2656:1: rule__FoundMessage__Group__0__Impl : ( 'found' ) ;
    public final void rule__FoundMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2660:1: ( ( 'found' ) )
            // InternalSequence.g:2661:1: ( 'found' )
            {
            // InternalSequence.g:2661:1: ( 'found' )
            // InternalSequence.g:2662:2: 'found'
            {
             before(grammarAccess.getFoundMessageAccess().getFoundKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFoundMessageAccess().getFoundKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__0__Impl"


    // $ANTLR start "rule__FoundMessage__Group__1"
    // InternalSequence.g:2671:1: rule__FoundMessage__Group__1 : rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 ;
    public final void rule__FoundMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2675:1: ( rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 )
            // InternalSequence.g:2676:2: rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__FoundMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__2();

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
    // $ANTLR end "rule__FoundMessage__Group__1"


    // $ANTLR start "rule__FoundMessage__Group__1__Impl"
    // InternalSequence.g:2683:1: rule__FoundMessage__Group__1__Impl : ( ( rule__FoundMessage__TypeAssignment_1 ) ) ;
    public final void rule__FoundMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2687:1: ( ( ( rule__FoundMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:2688:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:2688:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            // InternalSequence.g:2689:2: ( rule__FoundMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getFoundMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:2690:2: ( rule__FoundMessage__TypeAssignment_1 )
            // InternalSequence.g:2690:3: rule__FoundMessage__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FoundMessage__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFoundMessageAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__1__Impl"


    // $ANTLR start "rule__FoundMessage__Group__2"
    // InternalSequence.g:2698:1: rule__FoundMessage__Group__2 : rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 ;
    public final void rule__FoundMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2702:1: ( rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 )
            // InternalSequence.g:2703:2: rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__FoundMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__3();

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
    // $ANTLR end "rule__FoundMessage__Group__2"


    // $ANTLR start "rule__FoundMessage__Group__2__Impl"
    // InternalSequence.g:2710:1: rule__FoundMessage__Group__2__Impl : ( ( rule__FoundMessage__NameAssignment_2 ) ) ;
    public final void rule__FoundMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2714:1: ( ( ( rule__FoundMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:2715:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:2715:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            // InternalSequence.g:2716:2: ( rule__FoundMessage__NameAssignment_2 )
            {
             before(grammarAccess.getFoundMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:2717:2: ( rule__FoundMessage__NameAssignment_2 )
            // InternalSequence.g:2717:3: rule__FoundMessage__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FoundMessage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFoundMessageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__2__Impl"


    // $ANTLR start "rule__FoundMessage__Group__3"
    // InternalSequence.g:2725:1: rule__FoundMessage__Group__3 : rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 ;
    public final void rule__FoundMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2729:1: ( rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 )
            // InternalSequence.g:2730:2: rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__FoundMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__4();

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
    // $ANTLR end "rule__FoundMessage__Group__3"


    // $ANTLR start "rule__FoundMessage__Group__3__Impl"
    // InternalSequence.g:2737:1: rule__FoundMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__FoundMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2741:1: ( ( '(' ) )
            // InternalSequence.g:2742:1: ( '(' )
            {
            // InternalSequence.g:2742:1: ( '(' )
            // InternalSequence.g:2743:2: '('
            {
             before(grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__3__Impl"


    // $ANTLR start "rule__FoundMessage__Group__4"
    // InternalSequence.g:2752:1: rule__FoundMessage__Group__4 : rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 ;
    public final void rule__FoundMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2756:1: ( rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 )
            // InternalSequence.g:2757:2: rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__FoundMessage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__5();

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
    // $ANTLR end "rule__FoundMessage__Group__4"


    // $ANTLR start "rule__FoundMessage__Group__4__Impl"
    // InternalSequence.g:2764:1: rule__FoundMessage__Group__4__Impl : ( '_' ) ;
    public final void rule__FoundMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2768:1: ( ( '_' ) )
            // InternalSequence.g:2769:1: ( '_' )
            {
            // InternalSequence.g:2769:1: ( '_' )
            // InternalSequence.g:2770:2: '_'
            {
             before(grammarAccess.getFoundMessageAccess().get_Keyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFoundMessageAccess().get_Keyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__4__Impl"


    // $ANTLR start "rule__FoundMessage__Group__5"
    // InternalSequence.g:2779:1: rule__FoundMessage__Group__5 : rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 ;
    public final void rule__FoundMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2783:1: ( rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 )
            // InternalSequence.g:2784:2: rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__FoundMessage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__6();

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
    // $ANTLR end "rule__FoundMessage__Group__5"


    // $ANTLR start "rule__FoundMessage__Group__5__Impl"
    // InternalSequence.g:2791:1: rule__FoundMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__FoundMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2795:1: ( ( ',' ) )
            // InternalSequence.g:2796:1: ( ',' )
            {
            // InternalSequence.g:2796:1: ( ',' )
            // InternalSequence.g:2797:2: ','
            {
             before(grammarAccess.getFoundMessageAccess().getCommaKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFoundMessageAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__5__Impl"


    // $ANTLR start "rule__FoundMessage__Group__6"
    // InternalSequence.g:2806:1: rule__FoundMessage__Group__6 : rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 ;
    public final void rule__FoundMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2810:1: ( rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 )
            // InternalSequence.g:2811:2: rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__FoundMessage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__7();

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
    // $ANTLR end "rule__FoundMessage__Group__6"


    // $ANTLR start "rule__FoundMessage__Group__6__Impl"
    // InternalSequence.g:2818:1: rule__FoundMessage__Group__6__Impl : ( ( rule__FoundMessage__RightAssignment_6 ) ) ;
    public final void rule__FoundMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2822:1: ( ( ( rule__FoundMessage__RightAssignment_6 ) ) )
            // InternalSequence.g:2823:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            {
            // InternalSequence.g:2823:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            // InternalSequence.g:2824:2: ( rule__FoundMessage__RightAssignment_6 )
            {
             before(grammarAccess.getFoundMessageAccess().getRightAssignment_6()); 
            // InternalSequence.g:2825:2: ( rule__FoundMessage__RightAssignment_6 )
            // InternalSequence.g:2825:3: rule__FoundMessage__RightAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FoundMessage__RightAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFoundMessageAccess().getRightAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__6__Impl"


    // $ANTLR start "rule__FoundMessage__Group__7"
    // InternalSequence.g:2833:1: rule__FoundMessage__Group__7 : rule__FoundMessage__Group__7__Impl ;
    public final void rule__FoundMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2837:1: ( rule__FoundMessage__Group__7__Impl )
            // InternalSequence.g:2838:2: rule__FoundMessage__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__7__Impl();

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
    // $ANTLR end "rule__FoundMessage__Group__7"


    // $ANTLR start "rule__FoundMessage__Group__7__Impl"
    // InternalSequence.g:2844:1: rule__FoundMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__FoundMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2848:1: ( ( ')' ) )
            // InternalSequence.g:2849:1: ( ')' )
            {
            // InternalSequence.g:2849:1: ( ')' )
            // InternalSequence.g:2850:2: ')'
            {
             before(grammarAccess.getFoundMessageAccess().getRightParenthesisKeyword_7()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFoundMessageAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__7__Impl"


    // $ANTLR start "rule__LostMessage__Group__0"
    // InternalSequence.g:2860:1: rule__LostMessage__Group__0 : rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 ;
    public final void rule__LostMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2864:1: ( rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 )
            // InternalSequence.g:2865:2: rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__LostMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__1();

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
    // $ANTLR end "rule__LostMessage__Group__0"


    // $ANTLR start "rule__LostMessage__Group__0__Impl"
    // InternalSequence.g:2872:1: rule__LostMessage__Group__0__Impl : ( 'lost' ) ;
    public final void rule__LostMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2876:1: ( ( 'lost' ) )
            // InternalSequence.g:2877:1: ( 'lost' )
            {
            // InternalSequence.g:2877:1: ( 'lost' )
            // InternalSequence.g:2878:2: 'lost'
            {
             before(grammarAccess.getLostMessageAccess().getLostKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLostMessageAccess().getLostKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__0__Impl"


    // $ANTLR start "rule__LostMessage__Group__1"
    // InternalSequence.g:2887:1: rule__LostMessage__Group__1 : rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 ;
    public final void rule__LostMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2891:1: ( rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 )
            // InternalSequence.g:2892:2: rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__LostMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__2();

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
    // $ANTLR end "rule__LostMessage__Group__1"


    // $ANTLR start "rule__LostMessage__Group__1__Impl"
    // InternalSequence.g:2899:1: rule__LostMessage__Group__1__Impl : ( ( rule__LostMessage__TypeAssignment_1 ) ) ;
    public final void rule__LostMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2903:1: ( ( ( rule__LostMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:2904:1: ( ( rule__LostMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:2904:1: ( ( rule__LostMessage__TypeAssignment_1 ) )
            // InternalSequence.g:2905:2: ( rule__LostMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getLostMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:2906:2: ( rule__LostMessage__TypeAssignment_1 )
            // InternalSequence.g:2906:3: rule__LostMessage__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLostMessageAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__1__Impl"


    // $ANTLR start "rule__LostMessage__Group__2"
    // InternalSequence.g:2914:1: rule__LostMessage__Group__2 : rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 ;
    public final void rule__LostMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2918:1: ( rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 )
            // InternalSequence.g:2919:2: rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__LostMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__3();

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
    // $ANTLR end "rule__LostMessage__Group__2"


    // $ANTLR start "rule__LostMessage__Group__2__Impl"
    // InternalSequence.g:2926:1: rule__LostMessage__Group__2__Impl : ( ( rule__LostMessage__NameAssignment_2 ) ) ;
    public final void rule__LostMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2930:1: ( ( ( rule__LostMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:2931:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:2931:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            // InternalSequence.g:2932:2: ( rule__LostMessage__NameAssignment_2 )
            {
             before(grammarAccess.getLostMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:2933:2: ( rule__LostMessage__NameAssignment_2 )
            // InternalSequence.g:2933:3: rule__LostMessage__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLostMessageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__2__Impl"


    // $ANTLR start "rule__LostMessage__Group__3"
    // InternalSequence.g:2941:1: rule__LostMessage__Group__3 : rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 ;
    public final void rule__LostMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2945:1: ( rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 )
            // InternalSequence.g:2946:2: rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__LostMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__4();

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
    // $ANTLR end "rule__LostMessage__Group__3"


    // $ANTLR start "rule__LostMessage__Group__3__Impl"
    // InternalSequence.g:2953:1: rule__LostMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__LostMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2957:1: ( ( '(' ) )
            // InternalSequence.g:2958:1: ( '(' )
            {
            // InternalSequence.g:2958:1: ( '(' )
            // InternalSequence.g:2959:2: '('
            {
             before(grammarAccess.getLostMessageAccess().getLeftParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLostMessageAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__3__Impl"


    // $ANTLR start "rule__LostMessage__Group__4"
    // InternalSequence.g:2968:1: rule__LostMessage__Group__4 : rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 ;
    public final void rule__LostMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2972:1: ( rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 )
            // InternalSequence.g:2973:2: rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__LostMessage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__5();

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
    // $ANTLR end "rule__LostMessage__Group__4"


    // $ANTLR start "rule__LostMessage__Group__4__Impl"
    // InternalSequence.g:2980:1: rule__LostMessage__Group__4__Impl : ( ( rule__LostMessage__LeftAssignment_4 ) ) ;
    public final void rule__LostMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2984:1: ( ( ( rule__LostMessage__LeftAssignment_4 ) ) )
            // InternalSequence.g:2985:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            {
            // InternalSequence.g:2985:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            // InternalSequence.g:2986:2: ( rule__LostMessage__LeftAssignment_4 )
            {
             before(grammarAccess.getLostMessageAccess().getLeftAssignment_4()); 
            // InternalSequence.g:2987:2: ( rule__LostMessage__LeftAssignment_4 )
            // InternalSequence.g:2987:3: rule__LostMessage__LeftAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__LeftAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLostMessageAccess().getLeftAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__4__Impl"


    // $ANTLR start "rule__LostMessage__Group__5"
    // InternalSequence.g:2995:1: rule__LostMessage__Group__5 : rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 ;
    public final void rule__LostMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2999:1: ( rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 )
            // InternalSequence.g:3000:2: rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__LostMessage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__6();

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
    // $ANTLR end "rule__LostMessage__Group__5"


    // $ANTLR start "rule__LostMessage__Group__5__Impl"
    // InternalSequence.g:3007:1: rule__LostMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__LostMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3011:1: ( ( ',' ) )
            // InternalSequence.g:3012:1: ( ',' )
            {
            // InternalSequence.g:3012:1: ( ',' )
            // InternalSequence.g:3013:2: ','
            {
             before(grammarAccess.getLostMessageAccess().getCommaKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLostMessageAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__5__Impl"


    // $ANTLR start "rule__LostMessage__Group__6"
    // InternalSequence.g:3022:1: rule__LostMessage__Group__6 : rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 ;
    public final void rule__LostMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3026:1: ( rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 )
            // InternalSequence.g:3027:2: rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__LostMessage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__7();

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
    // $ANTLR end "rule__LostMessage__Group__6"


    // $ANTLR start "rule__LostMessage__Group__6__Impl"
    // InternalSequence.g:3034:1: rule__LostMessage__Group__6__Impl : ( '_' ) ;
    public final void rule__LostMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3038:1: ( ( '_' ) )
            // InternalSequence.g:3039:1: ( '_' )
            {
            // InternalSequence.g:3039:1: ( '_' )
            // InternalSequence.g:3040:2: '_'
            {
             before(grammarAccess.getLostMessageAccess().get_Keyword_6()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLostMessageAccess().get_Keyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__6__Impl"


    // $ANTLR start "rule__LostMessage__Group__7"
    // InternalSequence.g:3049:1: rule__LostMessage__Group__7 : rule__LostMessage__Group__7__Impl ;
    public final void rule__LostMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3053:1: ( rule__LostMessage__Group__7__Impl )
            // InternalSequence.g:3054:2: rule__LostMessage__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__7__Impl();

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
    // $ANTLR end "rule__LostMessage__Group__7"


    // $ANTLR start "rule__LostMessage__Group__7__Impl"
    // InternalSequence.g:3060:1: rule__LostMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__LostMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3064:1: ( ( ')' ) )
            // InternalSequence.g:3065:1: ( ')' )
            {
            // InternalSequence.g:3065:1: ( ')' )
            // InternalSequence.g:3066:2: ')'
            {
             before(grammarAccess.getLostMessageAccess().getRightParenthesisKeyword_7()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLostMessageAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__7__Impl"


    // $ANTLR start "rule__CreateMessage__Group__0"
    // InternalSequence.g:3076:1: rule__CreateMessage__Group__0 : rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 ;
    public final void rule__CreateMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3080:1: ( rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 )
            // InternalSequence.g:3081:2: rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__CreateMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__1();

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
    // $ANTLR end "rule__CreateMessage__Group__0"


    // $ANTLR start "rule__CreateMessage__Group__0__Impl"
    // InternalSequence.g:3088:1: rule__CreateMessage__Group__0__Impl : ( 'create' ) ;
    public final void rule__CreateMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3092:1: ( ( 'create' ) )
            // InternalSequence.g:3093:1: ( 'create' )
            {
            // InternalSequence.g:3093:1: ( 'create' )
            // InternalSequence.g:3094:2: 'create'
            {
             before(grammarAccess.getCreateMessageAccess().getCreateKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__0__Impl"


    // $ANTLR start "rule__CreateMessage__Group__1"
    // InternalSequence.g:3103:1: rule__CreateMessage__Group__1 : rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 ;
    public final void rule__CreateMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3107:1: ( rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 )
            // InternalSequence.g:3108:2: rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__CreateMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__2();

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
    // $ANTLR end "rule__CreateMessage__Group__1"


    // $ANTLR start "rule__CreateMessage__Group__1__Impl"
    // InternalSequence.g:3115:1: rule__CreateMessage__Group__1__Impl : ( ( rule__CreateMessage__NameAssignment_1 )? ) ;
    public final void rule__CreateMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3119:1: ( ( ( rule__CreateMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:3120:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:3120:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            // InternalSequence.g:3121:2: ( rule__CreateMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getCreateMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3122:2: ( rule__CreateMessage__NameAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSequence.g:3122:3: rule__CreateMessage__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreateMessage__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreateMessageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__1__Impl"


    // $ANTLR start "rule__CreateMessage__Group__2"
    // InternalSequence.g:3130:1: rule__CreateMessage__Group__2 : rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 ;
    public final void rule__CreateMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3134:1: ( rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 )
            // InternalSequence.g:3135:2: rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CreateMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__3();

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
    // $ANTLR end "rule__CreateMessage__Group__2"


    // $ANTLR start "rule__CreateMessage__Group__2__Impl"
    // InternalSequence.g:3142:1: rule__CreateMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__CreateMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3146:1: ( ( '(' ) )
            // InternalSequence.g:3147:1: ( '(' )
            {
            // InternalSequence.g:3147:1: ( '(' )
            // InternalSequence.g:3148:2: '('
            {
             before(grammarAccess.getCreateMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__2__Impl"


    // $ANTLR start "rule__CreateMessage__Group__3"
    // InternalSequence.g:3157:1: rule__CreateMessage__Group__3 : rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 ;
    public final void rule__CreateMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3161:1: ( rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 )
            // InternalSequence.g:3162:2: rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__CreateMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__4();

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
    // $ANTLR end "rule__CreateMessage__Group__3"


    // $ANTLR start "rule__CreateMessage__Group__3__Impl"
    // InternalSequence.g:3169:1: rule__CreateMessage__Group__3__Impl : ( ( rule__CreateMessage__LeftAssignment_3 ) ) ;
    public final void rule__CreateMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3173:1: ( ( ( rule__CreateMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:3174:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:3174:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            // InternalSequence.g:3175:2: ( rule__CreateMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:3176:2: ( rule__CreateMessage__LeftAssignment_3 )
            // InternalSequence.g:3176:3: rule__CreateMessage__LeftAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__LeftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getLeftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__3__Impl"


    // $ANTLR start "rule__CreateMessage__Group__4"
    // InternalSequence.g:3184:1: rule__CreateMessage__Group__4 : rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 ;
    public final void rule__CreateMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3188:1: ( rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 )
            // InternalSequence.g:3189:2: rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__CreateMessage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__5();

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
    // $ANTLR end "rule__CreateMessage__Group__4"


    // $ANTLR start "rule__CreateMessage__Group__4__Impl"
    // InternalSequence.g:3196:1: rule__CreateMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__CreateMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3200:1: ( ( ',' ) )
            // InternalSequence.g:3201:1: ( ',' )
            {
            // InternalSequence.g:3201:1: ( ',' )
            // InternalSequence.g:3202:2: ','
            {
             before(grammarAccess.getCreateMessageAccess().getCommaKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__4__Impl"


    // $ANTLR start "rule__CreateMessage__Group__5"
    // InternalSequence.g:3211:1: rule__CreateMessage__Group__5 : rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 ;
    public final void rule__CreateMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3215:1: ( rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 )
            // InternalSequence.g:3216:2: rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__CreateMessage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__6();

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
    // $ANTLR end "rule__CreateMessage__Group__5"


    // $ANTLR start "rule__CreateMessage__Group__5__Impl"
    // InternalSequence.g:3223:1: rule__CreateMessage__Group__5__Impl : ( ( rule__CreateMessage__RightAssignment_5 ) ) ;
    public final void rule__CreateMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3227:1: ( ( ( rule__CreateMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:3228:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:3228:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            // InternalSequence.g:3229:2: ( rule__CreateMessage__RightAssignment_5 )
            {
             before(grammarAccess.getCreateMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:3230:2: ( rule__CreateMessage__RightAssignment_5 )
            // InternalSequence.g:3230:3: rule__CreateMessage__RightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getRightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__5__Impl"


    // $ANTLR start "rule__CreateMessage__Group__6"
    // InternalSequence.g:3238:1: rule__CreateMessage__Group__6 : rule__CreateMessage__Group__6__Impl ;
    public final void rule__CreateMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3242:1: ( rule__CreateMessage__Group__6__Impl )
            // InternalSequence.g:3243:2: rule__CreateMessage__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__6__Impl();

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
    // $ANTLR end "rule__CreateMessage__Group__6"


    // $ANTLR start "rule__CreateMessage__Group__6__Impl"
    // InternalSequence.g:3249:1: rule__CreateMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__CreateMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3253:1: ( ( ')' ) )
            // InternalSequence.g:3254:1: ( ')' )
            {
            // InternalSequence.g:3254:1: ( ')' )
            // InternalSequence.g:3255:2: ')'
            {
             before(grammarAccess.getCreateMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__6__Impl"


    // $ANTLR start "rule__DestructionMessage__Group__0"
    // InternalSequence.g:3265:1: rule__DestructionMessage__Group__0 : rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 ;
    public final void rule__DestructionMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3269:1: ( rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 )
            // InternalSequence.g:3270:2: rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__DestructionMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__1();

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
    // $ANTLR end "rule__DestructionMessage__Group__0"


    // $ANTLR start "rule__DestructionMessage__Group__0__Impl"
    // InternalSequence.g:3277:1: rule__DestructionMessage__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3281:1: ( ( 'dest' ) )
            // InternalSequence.g:3282:1: ( 'dest' )
            {
            // InternalSequence.g:3282:1: ( 'dest' )
            // InternalSequence.g:3283:2: 'dest'
            {
             before(grammarAccess.getDestructionMessageAccess().getDestKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDestructionMessageAccess().getDestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__0__Impl"


    // $ANTLR start "rule__DestructionMessage__Group__1"
    // InternalSequence.g:3292:1: rule__DestructionMessage__Group__1 : rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 ;
    public final void rule__DestructionMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3296:1: ( rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 )
            // InternalSequence.g:3297:2: rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__DestructionMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__2();

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
    // $ANTLR end "rule__DestructionMessage__Group__1"


    // $ANTLR start "rule__DestructionMessage__Group__1__Impl"
    // InternalSequence.g:3304:1: rule__DestructionMessage__Group__1__Impl : ( ( rule__DestructionMessage__NameAssignment_1 )? ) ;
    public final void rule__DestructionMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3308:1: ( ( ( rule__DestructionMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:3309:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:3309:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            // InternalSequence.g:3310:2: ( rule__DestructionMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getDestructionMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3311:2: ( rule__DestructionMessage__NameAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSequence.g:3311:3: rule__DestructionMessage__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DestructionMessage__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDestructionMessageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__1__Impl"


    // $ANTLR start "rule__DestructionMessage__Group__2"
    // InternalSequence.g:3319:1: rule__DestructionMessage__Group__2 : rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 ;
    public final void rule__DestructionMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3323:1: ( rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 )
            // InternalSequence.g:3324:2: rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__DestructionMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__3();

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
    // $ANTLR end "rule__DestructionMessage__Group__2"


    // $ANTLR start "rule__DestructionMessage__Group__2__Impl"
    // InternalSequence.g:3331:1: rule__DestructionMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__DestructionMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3335:1: ( ( '(' ) )
            // InternalSequence.g:3336:1: ( '(' )
            {
            // InternalSequence.g:3336:1: ( '(' )
            // InternalSequence.g:3337:2: '('
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDestructionMessageAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__2__Impl"


    // $ANTLR start "rule__DestructionMessage__Group__3"
    // InternalSequence.g:3346:1: rule__DestructionMessage__Group__3 : rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 ;
    public final void rule__DestructionMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3350:1: ( rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 )
            // InternalSequence.g:3351:2: rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__DestructionMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__4();

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
    // $ANTLR end "rule__DestructionMessage__Group__3"


    // $ANTLR start "rule__DestructionMessage__Group__3__Impl"
    // InternalSequence.g:3358:1: rule__DestructionMessage__Group__3__Impl : ( ( rule__DestructionMessage__LeftAssignment_3 ) ) ;
    public final void rule__DestructionMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3362:1: ( ( ( rule__DestructionMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:3363:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:3363:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            // InternalSequence.g:3364:2: ( rule__DestructionMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:3365:2: ( rule__DestructionMessage__LeftAssignment_3 )
            // InternalSequence.g:3365:3: rule__DestructionMessage__LeftAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DestructionMessage__LeftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDestructionMessageAccess().getLeftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__3__Impl"


    // $ANTLR start "rule__DestructionMessage__Group__4"
    // InternalSequence.g:3373:1: rule__DestructionMessage__Group__4 : rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 ;
    public final void rule__DestructionMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3377:1: ( rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 )
            // InternalSequence.g:3378:2: rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__DestructionMessage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__5();

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
    // $ANTLR end "rule__DestructionMessage__Group__4"


    // $ANTLR start "rule__DestructionMessage__Group__4__Impl"
    // InternalSequence.g:3385:1: rule__DestructionMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__DestructionMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3389:1: ( ( ',' ) )
            // InternalSequence.g:3390:1: ( ',' )
            {
            // InternalSequence.g:3390:1: ( ',' )
            // InternalSequence.g:3391:2: ','
            {
             before(grammarAccess.getDestructionMessageAccess().getCommaKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDestructionMessageAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__4__Impl"


    // $ANTLR start "rule__DestructionMessage__Group__5"
    // InternalSequence.g:3400:1: rule__DestructionMessage__Group__5 : rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 ;
    public final void rule__DestructionMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3404:1: ( rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 )
            // InternalSequence.g:3405:2: rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__DestructionMessage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__6();

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
    // $ANTLR end "rule__DestructionMessage__Group__5"


    // $ANTLR start "rule__DestructionMessage__Group__5__Impl"
    // InternalSequence.g:3412:1: rule__DestructionMessage__Group__5__Impl : ( ( rule__DestructionMessage__RightAssignment_5 ) ) ;
    public final void rule__DestructionMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3416:1: ( ( ( rule__DestructionMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:3417:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:3417:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            // InternalSequence.g:3418:2: ( rule__DestructionMessage__RightAssignment_5 )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:3419:2: ( rule__DestructionMessage__RightAssignment_5 )
            // InternalSequence.g:3419:3: rule__DestructionMessage__RightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DestructionMessage__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDestructionMessageAccess().getRightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__5__Impl"


    // $ANTLR start "rule__DestructionMessage__Group__6"
    // InternalSequence.g:3427:1: rule__DestructionMessage__Group__6 : rule__DestructionMessage__Group__6__Impl ;
    public final void rule__DestructionMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3431:1: ( rule__DestructionMessage__Group__6__Impl )
            // InternalSequence.g:3432:2: rule__DestructionMessage__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__6__Impl();

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
    // $ANTLR end "rule__DestructionMessage__Group__6"


    // $ANTLR start "rule__DestructionMessage__Group__6__Impl"
    // InternalSequence.g:3438:1: rule__DestructionMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__DestructionMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3442:1: ( ( ')' ) )
            // InternalSequence.g:3443:1: ( ')' )
            {
            // InternalSequence.g:3443:1: ( ')' )
            // InternalSequence.g:3444:2: ')'
            {
             before(grammarAccess.getDestructionMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDestructionMessageAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__6__Impl"


    // $ANTLR start "rule__DestructionOccurenceSpecification__Group__0"
    // InternalSequence.g:3454:1: rule__DestructionOccurenceSpecification__Group__0 : rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 ;
    public final void rule__DestructionOccurenceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3458:1: ( rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 )
            // InternalSequence.g:3459:2: rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DestructionOccurenceSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionOccurenceSpecification__Group__1();

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
    // $ANTLR end "rule__DestructionOccurenceSpecification__Group__0"


    // $ANTLR start "rule__DestructionOccurenceSpecification__Group__0__Impl"
    // InternalSequence.g:3466:1: rule__DestructionOccurenceSpecification__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionOccurenceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3470:1: ( ( 'dest' ) )
            // InternalSequence.g:3471:1: ( 'dest' )
            {
            // InternalSequence.g:3471:1: ( 'dest' )
            // InternalSequence.g:3472:2: 'dest'
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getDestKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDestructionOccurenceSpecificationAccess().getDestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionOccurenceSpecification__Group__0__Impl"


    // $ANTLR start "rule__DestructionOccurenceSpecification__Group__1"
    // InternalSequence.g:3481:1: rule__DestructionOccurenceSpecification__Group__1 : rule__DestructionOccurenceSpecification__Group__1__Impl ;
    public final void rule__DestructionOccurenceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3485:1: ( rule__DestructionOccurenceSpecification__Group__1__Impl )
            // InternalSequence.g:3486:2: rule__DestructionOccurenceSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestructionOccurenceSpecification__Group__1__Impl();

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
    // $ANTLR end "rule__DestructionOccurenceSpecification__Group__1"


    // $ANTLR start "rule__DestructionOccurenceSpecification__Group__1__Impl"
    // InternalSequence.g:3492:1: rule__DestructionOccurenceSpecification__Group__1__Impl : ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) ) ;
    public final void rule__DestructionOccurenceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3496:1: ( ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) ) )
            // InternalSequence.g:3497:1: ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) )
            {
            // InternalSequence.g:3497:1: ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) )
            // InternalSequence.g:3498:2: ( rule__DestructionOccurenceSpecification__TargetAssignment_1 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetAssignment_1()); 
            // InternalSequence.g:3499:2: ( rule__DestructionOccurenceSpecification__TargetAssignment_1 )
            // InternalSequence.g:3499:3: rule__DestructionOccurenceSpecification__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DestructionOccurenceSpecification__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionOccurenceSpecification__Group__1__Impl"


    // $ANTLR start "rule__Alternative__Group__0"
    // InternalSequence.g:3508:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3512:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // InternalSequence.g:3513:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Alternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__1();

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
    // $ANTLR end "rule__Alternative__Group__0"


    // $ANTLR start "rule__Alternative__Group__0__Impl"
    // InternalSequence.g:3520:1: rule__Alternative__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3524:1: ( ( 'alt' ) )
            // InternalSequence.g:3525:1: ( 'alt' )
            {
            // InternalSequence.g:3525:1: ( 'alt' )
            // InternalSequence.g:3526:2: 'alt'
            {
             before(grammarAccess.getAlternativeAccess().getAltKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getAltKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__0__Impl"


    // $ANTLR start "rule__Alternative__Group__1"
    // InternalSequence.g:3535:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3539:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // InternalSequence.g:3540:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Alternative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__2();

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
    // $ANTLR end "rule__Alternative__Group__1"


    // $ANTLR start "rule__Alternative__Group__1__Impl"
    // InternalSequence.g:3547:1: rule__Alternative__Group__1__Impl : ( '{' ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3551:1: ( ( '{' ) )
            // InternalSequence.g:3552:1: ( '{' )
            {
            // InternalSequence.g:3552:1: ( '{' )
            // InternalSequence.g:3553:2: '{'
            {
             before(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__1__Impl"


    // $ANTLR start "rule__Alternative__Group__2"
    // InternalSequence.g:3562:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3566:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // InternalSequence.g:3567:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Alternative__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__3();

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
    // $ANTLR end "rule__Alternative__Group__2"


    // $ANTLR start "rule__Alternative__Group__2__Impl"
    // InternalSequence.g:3574:1: rule__Alternative__Group__2__Impl : ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3578:1: ( ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) ) )
            // InternalSequence.g:3579:1: ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) )
            {
            // InternalSequence.g:3579:1: ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) )
            // InternalSequence.g:3580:2: ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* )
            {
            // InternalSequence.g:3580:2: ( ( rule__Alternative__AlternativesAssignment_2 ) )
            // InternalSequence.g:3581:3: ( rule__Alternative__AlternativesAssignment_2 )
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 
            // InternalSequence.g:3582:3: ( rule__Alternative__AlternativesAssignment_2 )
            // InternalSequence.g:3582:4: rule__Alternative__AlternativesAssignment_2
            {
            pushFollow(FOLLOW_35);
            rule__Alternative__AlternativesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 

            }

            // InternalSequence.g:3585:2: ( ( rule__Alternative__AlternativesAssignment_2 )* )
            // InternalSequence.g:3586:3: ( rule__Alternative__AlternativesAssignment_2 )*
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 
            // InternalSequence.g:3587:3: ( rule__Alternative__AlternativesAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSequence.g:3587:4: rule__Alternative__AlternativesAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Alternative__AlternativesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__2__Impl"


    // $ANTLR start "rule__Alternative__Group__3"
    // InternalSequence.g:3596:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3600:1: ( rule__Alternative__Group__3__Impl )
            // InternalSequence.g:3601:2: rule__Alternative__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__3__Impl();

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
    // $ANTLR end "rule__Alternative__Group__3"


    // $ANTLR start "rule__Alternative__Group__3__Impl"
    // InternalSequence.g:3607:1: rule__Alternative__Group__3__Impl : ( '}' ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3611:1: ( ( '}' ) )
            // InternalSequence.g:3612:1: ( '}' )
            {
            // InternalSequence.g:3612:1: ( '}' )
            // InternalSequence.g:3613:2: '}'
            {
             before(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__3__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // InternalSequence.g:3623:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3627:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalSequence.g:3628:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__1();

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
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // InternalSequence.g:3635:1: rule__Option__Group__0__Impl : ( 'opt' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3639:1: ( ( 'opt' ) )
            // InternalSequence.g:3640:1: ( 'opt' )
            {
            // InternalSequence.g:3640:1: ( 'opt' )
            // InternalSequence.g:3641:2: 'opt'
            {
             before(grammarAccess.getOptionAccess().getOptKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getOptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // InternalSequence.g:3650:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3654:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // InternalSequence.g:3655:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Option__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__2();

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
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // InternalSequence.g:3662:1: rule__Option__Group__1__Impl : ( '{' ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3666:1: ( ( '{' ) )
            // InternalSequence.g:3667:1: ( '{' )
            {
            // InternalSequence.g:3667:1: ( '{' )
            // InternalSequence.g:3668:2: '{'
            {
             before(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group__2"
    // InternalSequence.g:3677:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3681:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // InternalSequence.g:3682:2: rule__Option__Group__2__Impl rule__Option__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Option__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__3();

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
    // $ANTLR end "rule__Option__Group__2"


    // $ANTLR start "rule__Option__Group__2__Impl"
    // InternalSequence.g:3689:1: rule__Option__Group__2__Impl : ( ( rule__Option__OptionalAssignment_2 ) ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3693:1: ( ( ( rule__Option__OptionalAssignment_2 ) ) )
            // InternalSequence.g:3694:1: ( ( rule__Option__OptionalAssignment_2 ) )
            {
            // InternalSequence.g:3694:1: ( ( rule__Option__OptionalAssignment_2 ) )
            // InternalSequence.g:3695:2: ( rule__Option__OptionalAssignment_2 )
            {
             before(grammarAccess.getOptionAccess().getOptionalAssignment_2()); 
            // InternalSequence.g:3696:2: ( rule__Option__OptionalAssignment_2 )
            // InternalSequence.g:3696:3: rule__Option__OptionalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Option__OptionalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2__Impl"


    // $ANTLR start "rule__Option__Group__3"
    // InternalSequence.g:3704:1: rule__Option__Group__3 : rule__Option__Group__3__Impl ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3708:1: ( rule__Option__Group__3__Impl )
            // InternalSequence.g:3709:2: rule__Option__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__3__Impl();

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
    // $ANTLR end "rule__Option__Group__3"


    // $ANTLR start "rule__Option__Group__3__Impl"
    // InternalSequence.g:3715:1: rule__Option__Group__3__Impl : ( '}' ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3719:1: ( ( '}' ) )
            // InternalSequence.g:3720:1: ( '}' )
            {
            // InternalSequence.g:3720:1: ( '}' )
            // InternalSequence.g:3721:2: '}'
            {
             before(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__3__Impl"


    // $ANTLR start "rule__Parallel__Group__0"
    // InternalSequence.g:3731:1: rule__Parallel__Group__0 : rule__Parallel__Group__0__Impl rule__Parallel__Group__1 ;
    public final void rule__Parallel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3735:1: ( rule__Parallel__Group__0__Impl rule__Parallel__Group__1 )
            // InternalSequence.g:3736:2: rule__Parallel__Group__0__Impl rule__Parallel__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallel__Group__1();

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
    // $ANTLR end "rule__Parallel__Group__0"


    // $ANTLR start "rule__Parallel__Group__0__Impl"
    // InternalSequence.g:3743:1: rule__Parallel__Group__0__Impl : ( 'par' ) ;
    public final void rule__Parallel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3747:1: ( ( 'par' ) )
            // InternalSequence.g:3748:1: ( 'par' )
            {
            // InternalSequence.g:3748:1: ( 'par' )
            // InternalSequence.g:3749:2: 'par'
            {
             before(grammarAccess.getParallelAccess().getParKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getParallelAccess().getParKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group__0__Impl"


    // $ANTLR start "rule__Parallel__Group__1"
    // InternalSequence.g:3758:1: rule__Parallel__Group__1 : rule__Parallel__Group__1__Impl rule__Parallel__Group__2 ;
    public final void rule__Parallel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3762:1: ( rule__Parallel__Group__1__Impl rule__Parallel__Group__2 )
            // InternalSequence.g:3763:2: rule__Parallel__Group__1__Impl rule__Parallel__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Parallel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallel__Group__2();

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
    // $ANTLR end "rule__Parallel__Group__1"


    // $ANTLR start "rule__Parallel__Group__1__Impl"
    // InternalSequence.g:3770:1: rule__Parallel__Group__1__Impl : ( '{' ) ;
    public final void rule__Parallel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3774:1: ( ( '{' ) )
            // InternalSequence.g:3775:1: ( '{' )
            {
            // InternalSequence.g:3775:1: ( '{' )
            // InternalSequence.g:3776:2: '{'
            {
             before(grammarAccess.getParallelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getParallelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group__1__Impl"


    // $ANTLR start "rule__Parallel__Group__2"
    // InternalSequence.g:3785:1: rule__Parallel__Group__2 : rule__Parallel__Group__2__Impl rule__Parallel__Group__3 ;
    public final void rule__Parallel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3789:1: ( rule__Parallel__Group__2__Impl rule__Parallel__Group__3 )
            // InternalSequence.g:3790:2: rule__Parallel__Group__2__Impl rule__Parallel__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Parallel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallel__Group__3();

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
    // $ANTLR end "rule__Parallel__Group__2"


    // $ANTLR start "rule__Parallel__Group__2__Impl"
    // InternalSequence.g:3797:1: rule__Parallel__Group__2__Impl : ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) ) ;
    public final void rule__Parallel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3801:1: ( ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) ) )
            // InternalSequence.g:3802:1: ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) )
            {
            // InternalSequence.g:3802:1: ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) )
            // InternalSequence.g:3803:2: ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* )
            {
            // InternalSequence.g:3803:2: ( ( rule__Parallel__ParallelsAssignment_2 ) )
            // InternalSequence.g:3804:3: ( rule__Parallel__ParallelsAssignment_2 )
            {
             before(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 
            // InternalSequence.g:3805:3: ( rule__Parallel__ParallelsAssignment_2 )
            // InternalSequence.g:3805:4: rule__Parallel__ParallelsAssignment_2
            {
            pushFollow(FOLLOW_37);
            rule__Parallel__ParallelsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 

            }

            // InternalSequence.g:3808:2: ( ( rule__Parallel__ParallelsAssignment_2 )* )
            // InternalSequence.g:3809:3: ( rule__Parallel__ParallelsAssignment_2 )*
            {
             before(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 
            // InternalSequence.g:3810:3: ( rule__Parallel__ParallelsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=12 && LA26_0<=13)||LA26_0==28||(LA26_0>=36 && LA26_0<=45)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSequence.g:3810:4: rule__Parallel__ParallelsAssignment_2
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Parallel__ParallelsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group__2__Impl"


    // $ANTLR start "rule__Parallel__Group__3"
    // InternalSequence.g:3819:1: rule__Parallel__Group__3 : rule__Parallel__Group__3__Impl ;
    public final void rule__Parallel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3823:1: ( rule__Parallel__Group__3__Impl )
            // InternalSequence.g:3824:2: rule__Parallel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallel__Group__3__Impl();

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
    // $ANTLR end "rule__Parallel__Group__3"


    // $ANTLR start "rule__Parallel__Group__3__Impl"
    // InternalSequence.g:3830:1: rule__Parallel__Group__3__Impl : ( '}' ) ;
    public final void rule__Parallel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3834:1: ( ( '}' ) )
            // InternalSequence.g:3835:1: ( '}' )
            {
            // InternalSequence.g:3835:1: ( '}' )
            // InternalSequence.g:3836:2: '}'
            {
             before(grammarAccess.getParallelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getParallelAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group__3__Impl"


    // $ANTLR start "rule__Critical__Group__0"
    // InternalSequence.g:3846:1: rule__Critical__Group__0 : rule__Critical__Group__0__Impl rule__Critical__Group__1 ;
    public final void rule__Critical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3850:1: ( rule__Critical__Group__0__Impl rule__Critical__Group__1 )
            // InternalSequence.g:3851:2: rule__Critical__Group__0__Impl rule__Critical__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Critical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Critical__Group__1();

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
    // $ANTLR end "rule__Critical__Group__0"


    // $ANTLR start "rule__Critical__Group__0__Impl"
    // InternalSequence.g:3858:1: rule__Critical__Group__0__Impl : ( 'critical' ) ;
    public final void rule__Critical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3862:1: ( ( 'critical' ) )
            // InternalSequence.g:3863:1: ( 'critical' )
            {
            // InternalSequence.g:3863:1: ( 'critical' )
            // InternalSequence.g:3864:2: 'critical'
            {
             before(grammarAccess.getCriticalAccess().getCriticalKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCriticalAccess().getCriticalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Critical__Group__0__Impl"


    // $ANTLR start "rule__Critical__Group__1"
    // InternalSequence.g:3873:1: rule__Critical__Group__1 : rule__Critical__Group__1__Impl rule__Critical__Group__2 ;
    public final void rule__Critical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3877:1: ( rule__Critical__Group__1__Impl rule__Critical__Group__2 )
            // InternalSequence.g:3878:2: rule__Critical__Group__1__Impl rule__Critical__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Critical__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Critical__Group__2();

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
    // $ANTLR end "rule__Critical__Group__1"


    // $ANTLR start "rule__Critical__Group__1__Impl"
    // InternalSequence.g:3885:1: rule__Critical__Group__1__Impl : ( '{' ) ;
    public final void rule__Critical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3889:1: ( ( '{' ) )
            // InternalSequence.g:3890:1: ( '{' )
            {
            // InternalSequence.g:3890:1: ( '{' )
            // InternalSequence.g:3891:2: '{'
            {
             before(grammarAccess.getCriticalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCriticalAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Critical__Group__1__Impl"


    // $ANTLR start "rule__Critical__Group__2"
    // InternalSequence.g:3900:1: rule__Critical__Group__2 : rule__Critical__Group__2__Impl rule__Critical__Group__3 ;
    public final void rule__Critical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3904:1: ( rule__Critical__Group__2__Impl rule__Critical__Group__3 )
            // InternalSequence.g:3905:2: rule__Critical__Group__2__Impl rule__Critical__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Critical__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Critical__Group__3();

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
    // $ANTLR end "rule__Critical__Group__2"


    // $ANTLR start "rule__Critical__Group__2__Impl"
    // InternalSequence.g:3912:1: rule__Critical__Group__2__Impl : ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) ) ;
    public final void rule__Critical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3916:1: ( ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) ) )
            // InternalSequence.g:3917:1: ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) )
            {
            // InternalSequence.g:3917:1: ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) )
            // InternalSequence.g:3918:2: ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* )
            {
            // InternalSequence.g:3918:2: ( ( rule__Critical__FragmentsAssignment_2 ) )
            // InternalSequence.g:3919:3: ( rule__Critical__FragmentsAssignment_2 )
            {
             before(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:3920:3: ( rule__Critical__FragmentsAssignment_2 )
            // InternalSequence.g:3920:4: rule__Critical__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Critical__FragmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 

            }

            // InternalSequence.g:3923:2: ( ( rule__Critical__FragmentsAssignment_2 )* )
            // InternalSequence.g:3924:3: ( rule__Critical__FragmentsAssignment_2 )*
            {
             before(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:3925:3: ( rule__Critical__FragmentsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=12 && LA27_0<=13)||(LA27_0>=36 && LA27_0<=45)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSequence.g:3925:4: rule__Critical__FragmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Critical__FragmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Critical__Group__2__Impl"


    // $ANTLR start "rule__Critical__Group__3"
    // InternalSequence.g:3934:1: rule__Critical__Group__3 : rule__Critical__Group__3__Impl ;
    public final void rule__Critical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3938:1: ( rule__Critical__Group__3__Impl )
            // InternalSequence.g:3939:2: rule__Critical__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Critical__Group__3__Impl();

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
    // $ANTLR end "rule__Critical__Group__3"


    // $ANTLR start "rule__Critical__Group__3__Impl"
    // InternalSequence.g:3945:1: rule__Critical__Group__3__Impl : ( '}' ) ;
    public final void rule__Critical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3949:1: ( ( '}' ) )
            // InternalSequence.g:3950:1: ( '}' )
            {
            // InternalSequence.g:3950:1: ( '}' )
            // InternalSequence.g:3951:2: '}'
            {
             before(grammarAccess.getCriticalAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCriticalAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Critical__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalSequence.g:3961:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3965:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalSequence.g:3966:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

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
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalSequence.g:3973:1: rule__Loop__Group__0__Impl : ( 'loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3977:1: ( ( 'loop' ) )
            // InternalSequence.g:3978:1: ( 'loop' )
            {
            // InternalSequence.g:3978:1: ( 'loop' )
            // InternalSequence.g:3979:2: 'loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalSequence.g:3988:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3992:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalSequence.g:3993:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

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
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalSequence.g:4000:1: rule__Loop__Group__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4004:1: ( ( '[' ) )
            // InternalSequence.g:4005:1: ( '[' )
            {
            // InternalSequence.g:4005:1: ( '[' )
            // InternalSequence.g:4006:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalSequence.g:4015:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4019:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalSequence.g:4020:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

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
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalSequence.g:4027:1: rule__Loop__Group__2__Impl : ( ( rule__Loop__ConditionAssignment_2 ) ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4031:1: ( ( ( rule__Loop__ConditionAssignment_2 ) ) )
            // InternalSequence.g:4032:1: ( ( rule__Loop__ConditionAssignment_2 ) )
            {
            // InternalSequence.g:4032:1: ( ( rule__Loop__ConditionAssignment_2 ) )
            // InternalSequence.g:4033:2: ( rule__Loop__ConditionAssignment_2 )
            {
             before(grammarAccess.getLoopAccess().getConditionAssignment_2()); 
            // InternalSequence.g:4034:2: ( rule__Loop__ConditionAssignment_2 )
            // InternalSequence.g:4034:3: rule__Loop__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalSequence.g:4042:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4046:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalSequence.g:4047:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

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
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalSequence.g:4054:1: rule__Loop__Group__3__Impl : ( ']' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4058:1: ( ( ']' ) )
            // InternalSequence.g:4059:1: ( ']' )
            {
            // InternalSequence.g:4059:1: ( ']' )
            // InternalSequence.g:4060:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // InternalSequence.g:4069:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4073:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalSequence.g:4074:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Loop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__5();

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
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalSequence.g:4081:1: rule__Loop__Group__4__Impl : ( '{' ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4085:1: ( ( '{' ) )
            // InternalSequence.g:4086:1: ( '{' )
            {
            // InternalSequence.g:4086:1: ( '{' )
            // InternalSequence.g:4087:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group__5"
    // InternalSequence.g:4096:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4100:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalSequence.g:4101:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Loop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__6();

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
    // $ANTLR end "rule__Loop__Group__5"


    // $ANTLR start "rule__Loop__Group__5__Impl"
    // InternalSequence.g:4108:1: rule__Loop__Group__5__Impl : ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4112:1: ( ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) ) )
            // InternalSequence.g:4113:1: ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) )
            {
            // InternalSequence.g:4113:1: ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) )
            // InternalSequence.g:4114:2: ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* )
            {
            // InternalSequence.g:4114:2: ( ( rule__Loop__FragmentsAssignment_5 ) )
            // InternalSequence.g:4115:3: ( rule__Loop__FragmentsAssignment_5 )
            {
             before(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 
            // InternalSequence.g:4116:3: ( rule__Loop__FragmentsAssignment_5 )
            // InternalSequence.g:4116:4: rule__Loop__FragmentsAssignment_5
            {
            pushFollow(FOLLOW_8);
            rule__Loop__FragmentsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 

            }

            // InternalSequence.g:4119:2: ( ( rule__Loop__FragmentsAssignment_5 )* )
            // InternalSequence.g:4120:3: ( rule__Loop__FragmentsAssignment_5 )*
            {
             before(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 
            // InternalSequence.g:4121:3: ( rule__Loop__FragmentsAssignment_5 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=12 && LA28_0<=13)||(LA28_0>=36 && LA28_0<=45)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSequence.g:4121:4: rule__Loop__FragmentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Loop__FragmentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__5__Impl"


    // $ANTLR start "rule__Loop__Group__6"
    // InternalSequence.g:4130:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4134:1: ( rule__Loop__Group__6__Impl )
            // InternalSequence.g:4135:2: rule__Loop__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__6__Impl();

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
    // $ANTLR end "rule__Loop__Group__6"


    // $ANTLR start "rule__Loop__Group__6__Impl"
    // InternalSequence.g:4141:1: rule__Loop__Group__6__Impl : ( '}' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4145:1: ( ( '}' ) )
            // InternalSequence.g:4146:1: ( '}' )
            {
            // InternalSequence.g:4146:1: ( '}' )
            // InternalSequence.g:4147:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__6__Impl"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group__0"
    // InternalSequence.g:4157:1: rule__BehaviorFragmentsWithCondition__Group__0 : rule__BehaviorFragmentsWithCondition__Group__0__Impl rule__BehaviorFragmentsWithCondition__Group__1 ;
    public final void rule__BehaviorFragmentsWithCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4161:1: ( rule__BehaviorFragmentsWithCondition__Group__0__Impl rule__BehaviorFragmentsWithCondition__Group__1 )
            // InternalSequence.g:4162:2: rule__BehaviorFragmentsWithCondition__Group__0__Impl rule__BehaviorFragmentsWithCondition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BehaviorFragmentsWithCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorFragmentsWithCondition__Group__1();

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
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group__0"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group__0__Impl"
    // InternalSequence.g:4169:1: rule__BehaviorFragmentsWithCondition__Group__0__Impl : ( '[' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4173:1: ( ( '[' ) )
            // InternalSequence.g:4174:1: ( '[' )
            {
            // InternalSequence.g:4174:1: ( '[' )
            // InternalSequence.g:4175:2: '['
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group__0__Impl"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group__1"
    // InternalSequence.g:4184:1: rule__BehaviorFragmentsWithCondition__Group__1 : rule__BehaviorFragmentsWithCondition__Group__1__Impl rule__BehaviorFragmentsWithCondition__Group__2 ;
    public final void rule__BehaviorFragmentsWithCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4188:1: ( rule__BehaviorFragmentsWithCondition__Group__1__Impl rule__BehaviorFragmentsWithCondition__Group__2 )
            // InternalSequence.g:4189:2: rule__BehaviorFragmentsWithCondition__Group__1__Impl rule__BehaviorFragmentsWithCondition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__BehaviorFragmentsWithCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorFragmentsWithCondition__Group__2();

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
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group__1"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group__1__Impl"
    // InternalSequence.g:4196:1: rule__BehaviorFragmentsWithCondition__Group__1__Impl : ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4200:1: ( ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) ) )
            // InternalSequence.g:4201:1: ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) )
            {
            // InternalSequence.g:4201:1: ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) )
            // InternalSequence.g:4202:2: ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getConditionAssignment_1()); 
            // InternalSequence.g:4203:2: ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 )
            // InternalSequence.g:4203:3: rule__BehaviorFragmentsWithCondition__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorFragmentsWithCondition__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group__1__Impl"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group__2"
    // InternalSequence.g:4211:1: rule__BehaviorFragmentsWithCondition__Group__2 : rule__BehaviorFragmentsWithCondition__Group__2__Impl rule__BehaviorFragmentsWithCondition__Group__3 ;
    public final void rule__BehaviorFragmentsWithCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4215:1: ( rule__BehaviorFragmentsWithCondition__Group__2__Impl rule__BehaviorFragmentsWithCondition__Group__3 )
            // InternalSequence.g:4216:2: rule__BehaviorFragmentsWithCondition__Group__2__Impl rule__BehaviorFragmentsWithCondition__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__BehaviorFragmentsWithCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorFragmentsWithCondition__Group__3();

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
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group__2"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group__2__Impl"
    // InternalSequence.g:4223:1: rule__BehaviorFragmentsWithCondition__Group__2__Impl : ( ']' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4227:1: ( ( ']' ) )
            // InternalSequence.g:4228:1: ( ']' )
            {
            // InternalSequence.g:4228:1: ( ']' )
            // InternalSequence.g:4229:2: ']'
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getRightSquareBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group__2__Impl"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group__3"
    // InternalSequence.g:4238:1: rule__BehaviorFragmentsWithCondition__Group__3 : rule__BehaviorFragmentsWithCondition__Group__3__Impl ;
    public final void rule__BehaviorFragmentsWithCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4242:1: ( rule__BehaviorFragmentsWithCondition__Group__3__Impl )
            // InternalSequence.g:4243:2: rule__BehaviorFragmentsWithCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorFragmentsWithCondition__Group__3__Impl();

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
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group__3"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group__3__Impl"
    // InternalSequence.g:4249:1: rule__BehaviorFragmentsWithCondition__Group__3__Impl : ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4253:1: ( ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) ) )
            // InternalSequence.g:4254:1: ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) )
            {
            // InternalSequence.g:4254:1: ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) )
            // InternalSequence.g:4255:2: ( rule__BehaviorFragmentsWithCondition__Alternatives_3 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getAlternatives_3()); 
            // InternalSequence.g:4256:2: ( rule__BehaviorFragmentsWithCondition__Alternatives_3 )
            // InternalSequence.g:4256:3: rule__BehaviorFragmentsWithCondition__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorFragmentsWithCondition__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group__3__Impl"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group_3_0__0"
    // InternalSequence.g:4265:1: rule__BehaviorFragmentsWithCondition__Group_3_0__0 : rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__1 ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4269:1: ( rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__1 )
            // InternalSequence.g:4270:2: rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__1
            {
            pushFollow(FOLLOW_18);
            rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorFragmentsWithCondition__Group_3_0__1();

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
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group_3_0__0"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl"
    // InternalSequence.g:4277:1: rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl : ( '{' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4281:1: ( ( '{' ) )
            // InternalSequence.g:4282:1: ( '{' )
            {
            // InternalSequence.g:4282:1: ( '{' )
            // InternalSequence.g:4283:2: '{'
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getLeftCurlyBracketKeyword_3_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getLeftCurlyBracketKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group_3_0__1"
    // InternalSequence.g:4292:1: rule__BehaviorFragmentsWithCondition__Group_3_0__1 : rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__2 ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4296:1: ( rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__2 )
            // InternalSequence.g:4297:2: rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__2
            {
            pushFollow(FOLLOW_19);
            rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorFragmentsWithCondition__Group_3_0__2();

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
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group_3_0__1"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl"
    // InternalSequence.g:4304:1: rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl : ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4308:1: ( ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) ) )
            // InternalSequence.g:4309:1: ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) )
            {
            // InternalSequence.g:4309:1: ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) )
            // InternalSequence.g:4310:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* )
            {
            // InternalSequence.g:4310:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) )
            // InternalSequence.g:4311:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_0_1()); 
            // InternalSequence.g:4312:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )
            // InternalSequence.g:4312:4: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1
            {
            pushFollow(FOLLOW_8);
            rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_0_1()); 

            }

            // InternalSequence.g:4315:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* )
            // InternalSequence.g:4316:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )*
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_0_1()); 
            // InternalSequence.g:4317:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=12 && LA29_0<=13)||(LA29_0>=36 && LA29_0<=45)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSequence.g:4317:4: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group_3_0__2"
    // InternalSequence.g:4326:1: rule__BehaviorFragmentsWithCondition__Group_3_0__2 : rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4330:1: ( rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl )
            // InternalSequence.g:4331:2: rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group_3_0__2"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl"
    // InternalSequence.g:4337:1: rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl : ( '}' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4341:1: ( ( '}' ) )
            // InternalSequence.g:4342:1: ( '}' )
            {
            // InternalSequence.g:4342:1: ( '}' )
            // InternalSequence.g:4343:2: '}'
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getRightCurlyBracketKeyword_3_0_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getRightCurlyBracketKeyword_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalSequence.g:4353:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4357:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSequence.g:4358:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSequence.g:4365:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4369:1: ( ( RULE_ID ) )
            // InternalSequence.g:4370:1: ( RULE_ID )
            {
            // InternalSequence.g:4370:1: ( RULE_ID )
            // InternalSequence.g:4371:2: RULE_ID
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
    // InternalSequence.g:4380:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4384:1: ( rule__FQN__Group__1__Impl )
            // InternalSequence.g:4385:2: rule__FQN__Group__1__Impl
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
    // InternalSequence.g:4391:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4395:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSequence.g:4396:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSequence.g:4396:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSequence.g:4397:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSequence.g:4398:2: ( rule__FQN__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSequence.g:4398:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSequence.g:4407:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4411:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSequence.g:4412:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalSequence.g:4419:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4423:1: ( ( '.' ) )
            // InternalSequence.g:4424:1: ( '.' )
            {
            // InternalSequence.g:4424:1: ( '.' )
            // InternalSequence.g:4425:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSequence.g:4434:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4438:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSequence.g:4439:2: rule__FQN__Group_1__1__Impl
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
    // InternalSequence.g:4445:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4449:1: ( ( RULE_ID ) )
            // InternalSequence.g:4450:1: ( RULE_ID )
            {
            // InternalSequence.g:4450:1: ( RULE_ID )
            // InternalSequence.g:4451:2: RULE_ID
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


    // $ANTLR start "rule__Order__Group__0"
    // InternalSequence.g:4461:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4465:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalSequence.g:4466:2: rule__Order__Group__0__Impl rule__Order__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Order__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__1();

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
    // $ANTLR end "rule__Order__Group__0"


    // $ANTLR start "rule__Order__Group__0__Impl"
    // InternalSequence.g:4473:1: rule__Order__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4477:1: ( ( RULE_INT ) )
            // InternalSequence.g:4478:1: ( RULE_INT )
            {
            // InternalSequence.g:4478:1: ( RULE_INT )
            // InternalSequence.g:4479:2: RULE_INT
            {
             before(grammarAccess.getOrderAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__0__Impl"


    // $ANTLR start "rule__Order__Group__1"
    // InternalSequence.g:4488:1: rule__Order__Group__1 : rule__Order__Group__1__Impl ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4492:1: ( rule__Order__Group__1__Impl )
            // InternalSequence.g:4493:2: rule__Order__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group__1__Impl();

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
    // $ANTLR end "rule__Order__Group__1"


    // $ANTLR start "rule__Order__Group__1__Impl"
    // InternalSequence.g:4499:1: rule__Order__Group__1__Impl : ( ( rule__Order__Group_1__0 )* ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4503:1: ( ( ( rule__Order__Group_1__0 )* ) )
            // InternalSequence.g:4504:1: ( ( rule__Order__Group_1__0 )* )
            {
            // InternalSequence.g:4504:1: ( ( rule__Order__Group_1__0 )* )
            // InternalSequence.g:4505:2: ( rule__Order__Group_1__0 )*
            {
             before(grammarAccess.getOrderAccess().getGroup_1()); 
            // InternalSequence.g:4506:2: ( rule__Order__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSequence.g:4506:3: rule__Order__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Order__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getOrderAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__1__Impl"


    // $ANTLR start "rule__Order__Group_1__0"
    // InternalSequence.g:4515:1: rule__Order__Group_1__0 : rule__Order__Group_1__0__Impl rule__Order__Group_1__1 ;
    public final void rule__Order__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4519:1: ( rule__Order__Group_1__0__Impl rule__Order__Group_1__1 )
            // InternalSequence.g:4520:2: rule__Order__Group_1__0__Impl rule__Order__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Order__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group_1__1();

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
    // $ANTLR end "rule__Order__Group_1__0"


    // $ANTLR start "rule__Order__Group_1__0__Impl"
    // InternalSequence.g:4527:1: rule__Order__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Order__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4531:1: ( ( '.' ) )
            // InternalSequence.g:4532:1: ( '.' )
            {
            // InternalSequence.g:4532:1: ( '.' )
            // InternalSequence.g:4533:2: '.'
            {
             before(grammarAccess.getOrderAccess().getFullStopKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group_1__0__Impl"


    // $ANTLR start "rule__Order__Group_1__1"
    // InternalSequence.g:4542:1: rule__Order__Group_1__1 : rule__Order__Group_1__1__Impl ;
    public final void rule__Order__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4546:1: ( rule__Order__Group_1__1__Impl )
            // InternalSequence.g:4547:2: rule__Order__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group_1__1__Impl();

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
    // $ANTLR end "rule__Order__Group_1__1"


    // $ANTLR start "rule__Order__Group_1__1__Impl"
    // InternalSequence.g:4553:1: rule__Order__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Order__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4557:1: ( ( RULE_INT ) )
            // InternalSequence.g:4558:1: ( RULE_INT )
            {
            // InternalSequence.g:4558:1: ( RULE_INT )
            // InternalSequence.g:4559:2: RULE_INT
            {
             before(grammarAccess.getOrderAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group_1__1__Impl"


    // $ANTLR start "rule__SequenceDiagram__TitleAssignment_2"
    // InternalSequence.g:4569:1: rule__SequenceDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SequenceDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4573:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4574:2: ( RULE_STRING )
            {
            // InternalSequence.g:4574:2: ( RULE_STRING )
            // InternalSequence.g:4575:3: RULE_STRING
            {
             before(grammarAccess.getSequenceDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSequenceDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__TitleAssignment_2"


    // $ANTLR start "rule__SequenceDiagram__RootPackageAssignment_3"
    // InternalSequence.g:4584:1: rule__SequenceDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__SequenceDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4588:1: ( ( ruleRootPackage ) )
            // InternalSequence.g:4589:2: ( ruleRootPackage )
            {
            // InternalSequence.g:4589:2: ( ruleRootPackage )
            // InternalSequence.g:4590:3: ruleRootPackage
            {
             before(grammarAccess.getSequenceDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRootPackage();

            state._fsp--;

             after(grammarAccess.getSequenceDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__RootPackageAssignment_3"


    // $ANTLR start "rule__SequenceDiagram__ActorsAssignment_4"
    // InternalSequence.g:4599:1: rule__SequenceDiagram__ActorsAssignment_4 : ( ruleActor ) ;
    public final void rule__SequenceDiagram__ActorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4603:1: ( ( ruleActor ) )
            // InternalSequence.g:4604:2: ( ruleActor )
            {
            // InternalSequence.g:4604:2: ( ruleActor )
            // InternalSequence.g:4605:3: ruleActor
            {
             before(grammarAccess.getSequenceDiagramAccess().getActorsActorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getSequenceDiagramAccess().getActorsActorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__ActorsAssignment_4"


    // $ANTLR start "rule__SequenceDiagram__BehaviorFragmentsAssignment_5"
    // InternalSequence.g:4614:1: rule__SequenceDiagram__BehaviorFragmentsAssignment_5 : ( ruleBehaviorFragment ) ;
    public final void rule__SequenceDiagram__BehaviorFragmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4618:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:4619:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:4619:2: ( ruleBehaviorFragment )
            // InternalSequence.g:4620:3: ruleBehaviorFragment
            {
             before(grammarAccess.getSequenceDiagramAccess().getBehaviorFragmentsBehaviorFragmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragment();

            state._fsp--;

             after(grammarAccess.getSequenceDiagramAccess().getBehaviorFragmentsBehaviorFragmentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__BehaviorFragmentsAssignment_5"


    // $ANTLR start "rule__RootPackage__NameAssignment_1"
    // InternalSequence.g:4629:1: rule__RootPackage__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4633:1: ( ( ruleFQN ) )
            // InternalSequence.g:4634:2: ( ruleFQN )
            {
            // InternalSequence.g:4634:2: ( ruleFQN )
            // InternalSequence.g:4635:3: ruleFQN
            {
             before(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__NameAssignment_1"


    // $ANTLR start "rule__Actor__DeferredAssignment_0"
    // InternalSequence.g:4644:1: rule__Actor__DeferredAssignment_0 : ( ( 'def' ) ) ;
    public final void rule__Actor__DeferredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4648:1: ( ( ( 'def' ) ) )
            // InternalSequence.g:4649:2: ( ( 'def' ) )
            {
            // InternalSequence.g:4649:2: ( ( 'def' ) )
            // InternalSequence.g:4650:3: ( 'def' )
            {
             before(grammarAccess.getActorAccess().getDeferredDefKeyword_0_0()); 
            // InternalSequence.g:4651:3: ( 'def' )
            // InternalSequence.g:4652:4: 'def'
            {
             before(grammarAccess.getActorAccess().getDeferredDefKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getDeferredDefKeyword_0_0()); 

            }

             after(grammarAccess.getActorAccess().getDeferredDefKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__DeferredAssignment_0"


    // $ANTLR start "rule__Actor__NameAssignment_2_0_0"
    // InternalSequence.g:4663:1: rule__Actor__NameAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4667:1: ( ( RULE_ID ) )
            // InternalSequence.g:4668:2: ( RULE_ID )
            {
            // InternalSequence.g:4668:2: ( RULE_ID )
            // InternalSequence.g:4669:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_2_0_0"


    // $ANTLR start "rule__Actor__TypeMappingAssignment_2_0_1"
    // InternalSequence.g:4678:1: rule__Actor__TypeMappingAssignment_2_0_1 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4682:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:4683:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:4683:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:4684:3: ruleActorClassifierMapping
            {
             before(grammarAccess.getActorAccess().getTypeMappingActorClassifierMappingParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActorClassifierMapping();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeMappingActorClassifierMappingParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeMappingAssignment_2_0_1"


    // $ANTLR start "rule__Actor__TypeMappingAssignment_2_1_0"
    // InternalSequence.g:4693:1: rule__Actor__TypeMappingAssignment_2_1_0 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4697:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:4698:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:4698:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:4699:3: ruleActorClassifierMapping
            {
             before(grammarAccess.getActorAccess().getTypeMappingActorClassifierMappingParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActorClassifierMapping();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeMappingActorClassifierMappingParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeMappingAssignment_2_1_0"


    // $ANTLR start "rule__Actor__AliasAssignment_2_1_2"
    // InternalSequence.g:4708:1: rule__Actor__AliasAssignment_2_1_2 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4712:1: ( ( RULE_ID ) )
            // InternalSequence.g:4713:2: ( RULE_ID )
            {
            // InternalSequence.g:4713:2: ( RULE_ID )
            // InternalSequence.g:4714:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__AliasAssignment_2_1_2"


    // $ANTLR start "rule__Actor__NameAssignment_2_2_0"
    // InternalSequence.g:4723:1: rule__Actor__NameAssignment_2_2_0 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4727:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4728:2: ( RULE_STRING )
            {
            // InternalSequence.g:4728:2: ( RULE_STRING )
            // InternalSequence.g:4729:3: RULE_STRING
            {
             before(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_2_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_2_2_0"


    // $ANTLR start "rule__Actor__TypeMappingAssignment_2_2_1"
    // InternalSequence.g:4738:1: rule__Actor__TypeMappingAssignment_2_2_1 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4742:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:4743:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:4743:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:4744:3: ruleActorClassifierMapping
            {
             before(grammarAccess.getActorAccess().getTypeMappingActorClassifierMappingParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActorClassifierMapping();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeMappingActorClassifierMappingParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeMappingAssignment_2_2_1"


    // $ANTLR start "rule__Actor__AliasAssignment_2_2_3"
    // InternalSequence.g:4753:1: rule__Actor__AliasAssignment_2_2_3 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4757:1: ( ( RULE_ID ) )
            // InternalSequence.g:4758:2: ( RULE_ID )
            {
            // InternalSequence.g:4758:2: ( RULE_ID )
            // InternalSequence.g:4759:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_2_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__AliasAssignment_2_2_3"


    // $ANTLR start "rule__Actor__ActorTypeAssignment_3_1"
    // InternalSequence.g:4768:1: rule__Actor__ActorTypeAssignment_3_1 : ( ruleActorType ) ;
    public final void rule__Actor__ActorTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4772:1: ( ( ruleActorType ) )
            // InternalSequence.g:4773:2: ( ruleActorType )
            {
            // InternalSequence.g:4773:2: ( ruleActorType )
            // InternalSequence.g:4774:3: ruleActorType
            {
             before(grammarAccess.getActorAccess().getActorTypeActorTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActorType();

            state._fsp--;

             after(grammarAccess.getActorAccess().getActorTypeActorTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__ActorTypeAssignment_3_1"


    // $ANTLR start "rule__ActorClassifierMapping__ClassifierAssignment_1"
    // InternalSequence.g:4783:1: rule__ActorClassifierMapping__ClassifierAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ActorClassifierMapping__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4787:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4788:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4788:2: ( ( ruleFQN ) )
            // InternalSequence.g:4789:3: ( ruleFQN )
            {
             before(grammarAccess.getActorClassifierMappingAccess().getClassifierClassifierCrossReference_1_0()); 
            // InternalSequence.g:4790:3: ( ruleFQN )
            // InternalSequence.g:4791:4: ruleFQN
            {
             before(grammarAccess.getActorClassifierMappingAccess().getClassifierClassifierFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActorClassifierMappingAccess().getClassifierClassifierFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActorClassifierMappingAccess().getClassifierClassifierCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorClassifierMapping__ClassifierAssignment_1"


    // $ANTLR start "rule__BehaviorFragments__FragmentsAssignment_0_1"
    // InternalSequence.g:4802:1: rule__BehaviorFragments__FragmentsAssignment_0_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragments__FragmentsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4806:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:4807:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:4807:2: ( ruleBehaviorFragment )
            // InternalSequence.g:4808:3: ruleBehaviorFragment
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsBehaviorFragmentParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragment();

            state._fsp--;

             after(grammarAccess.getBehaviorFragmentsAccess().getFragmentsBehaviorFragmentParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragments__FragmentsAssignment_0_1"


    // $ANTLR start "rule__BehaviorFragments__FragmentsAssignment_1"
    // InternalSequence.g:4817:1: rule__BehaviorFragments__FragmentsAssignment_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragments__FragmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4821:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:4822:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:4822:2: ( ruleBehaviorFragment )
            // InternalSequence.g:4823:3: ruleBehaviorFragment
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsBehaviorFragmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragment();

            state._fsp--;

             after(grammarAccess.getBehaviorFragmentsAccess().getFragmentsBehaviorFragmentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragments__FragmentsAssignment_1"


    // $ANTLR start "rule__Message__OrderAssignment_1_1"
    // InternalSequence.g:4832:1: rule__Message__OrderAssignment_1_1 : ( ruleOrder ) ;
    public final void rule__Message__OrderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4836:1: ( ( ruleOrder ) )
            // InternalSequence.g:4837:2: ( ruleOrder )
            {
            // InternalSequence.g:4837:2: ( ruleOrder )
            // InternalSequence.g:4838:3: ruleOrder
            {
             before(grammarAccess.getMessageAccess().getOrderOrderParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getOrderOrderParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__OrderAssignment_1_1"


    // $ANTLR start "rule__Message__TimeConstraintAssignment_2"
    // InternalSequence.g:4847:1: rule__Message__TimeConstraintAssignment_2 : ( ruleTimeConstraint ) ;
    public final void rule__Message__TimeConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4851:1: ( ( ruleTimeConstraint ) )
            // InternalSequence.g:4852:2: ( ruleTimeConstraint )
            {
            // InternalSequence.g:4852:2: ( ruleTimeConstraint )
            // InternalSequence.g:4853:3: ruleTimeConstraint
            {
             before(grammarAccess.getMessageAccess().getTimeConstraintTimeConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeConstraint();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getTimeConstraintTimeConstraintParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__TimeConstraintAssignment_2"


    // $ANTLR start "rule__TimeConstraint__ConstraintsAssignment_1"
    // InternalSequence.g:4862:1: rule__TimeConstraint__ConstraintsAssignment_1 : ( ruleInnerTimeConstraint ) ;
    public final void rule__TimeConstraint__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4866:1: ( ( ruleInnerTimeConstraint ) )
            // InternalSequence.g:4867:2: ( ruleInnerTimeConstraint )
            {
            // InternalSequence.g:4867:2: ( ruleInnerTimeConstraint )
            // InternalSequence.g:4868:3: ruleInnerTimeConstraint
            {
             before(grammarAccess.getTimeConstraintAccess().getConstraintsInnerTimeConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerTimeConstraint();

            state._fsp--;

             after(grammarAccess.getTimeConstraintAccess().getConstraintsInnerTimeConstraintParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__ConstraintsAssignment_1"


    // $ANTLR start "rule__InnerTimeConstraint__TypeAssignment_0"
    // InternalSequence.g:4877:1: rule__InnerTimeConstraint__TypeAssignment_0 : ( ruleTimeConstraintType ) ;
    public final void rule__InnerTimeConstraint__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4881:1: ( ( ruleTimeConstraintType ) )
            // InternalSequence.g:4882:2: ( ruleTimeConstraintType )
            {
            // InternalSequence.g:4882:2: ( ruleTimeConstraintType )
            // InternalSequence.g:4883:3: ruleTimeConstraintType
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getTypeTimeConstraintTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeConstraintType();

            state._fsp--;

             after(grammarAccess.getInnerTimeConstraintAccess().getTypeTimeConstraintTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerTimeConstraint__TypeAssignment_0"


    // $ANTLR start "rule__InnerTimeConstraint__ValueAssignment_2"
    // InternalSequence.g:4892:1: rule__InnerTimeConstraint__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__InnerTimeConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4896:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4897:2: ( RULE_STRING )
            {
            // InternalSequence.g:4897:2: ( RULE_STRING )
            // InternalSequence.g:4898:3: RULE_STRING
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInnerTimeConstraintAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerTimeConstraint__ValueAssignment_2"


    // $ANTLR start "rule__StandardMessage__TypeAssignment_0"
    // InternalSequence.g:4907:1: rule__StandardMessage__TypeAssignment_0 : ( ruleMessageType ) ;
    public final void rule__StandardMessage__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4911:1: ( ( ruleMessageType ) )
            // InternalSequence.g:4912:2: ( ruleMessageType )
            {
            // InternalSequence.g:4912:2: ( ruleMessageType )
            // InternalSequence.g:4913:3: ruleMessageType
            {
             before(grammarAccess.getStandardMessageAccess().getTypeMessageTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getStandardMessageAccess().getTypeMessageTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__TypeAssignment_0"


    // $ANTLR start "rule__StandardMessage__NameAssignment_1"
    // InternalSequence.g:4922:1: rule__StandardMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__StandardMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4926:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:4927:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:4927:2: ( ruleUnescapedString )
            // InternalSequence.g:4928:3: ruleUnescapedString
            {
             before(grammarAccess.getStandardMessageAccess().getNameUnescapedStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getStandardMessageAccess().getNameUnescapedStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__NameAssignment_1"


    // $ANTLR start "rule__StandardMessage__LeftAssignment_3"
    // InternalSequence.g:4937:1: rule__StandardMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4941:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4942:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4942:2: ( ( ruleFQN ) )
            // InternalSequence.g:4943:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:4944:3: ( ruleFQN )
            // InternalSequence.g:4945:4: ruleFQN
            {
             before(grammarAccess.getStandardMessageAccess().getLeftActorFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getStandardMessageAccess().getLeftActorFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getStandardMessageAccess().getLeftActorCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__LeftAssignment_3"


    // $ANTLR start "rule__StandardMessage__RightAssignment_5"
    // InternalSequence.g:4956:1: rule__StandardMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4960:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4961:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4961:2: ( ( ruleFQN ) )
            // InternalSequence.g:4962:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:4963:3: ( ruleFQN )
            // InternalSequence.g:4964:4: ruleFQN
            {
             before(grammarAccess.getStandardMessageAccess().getRightActorFQNParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getStandardMessageAccess().getRightActorFQNParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getStandardMessageAccess().getRightActorCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__RightAssignment_5"


    // $ANTLR start "rule__ResponseMessage__NameAssignment_1"
    // InternalSequence.g:4975:1: rule__ResponseMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__ResponseMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4979:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:4980:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:4980:2: ( ruleUnescapedString )
            // InternalSequence.g:4981:3: ruleUnescapedString
            {
             before(grammarAccess.getResponseMessageAccess().getNameUnescapedStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getResponseMessageAccess().getNameUnescapedStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__NameAssignment_1"


    // $ANTLR start "rule__ResponseMessage__LeftAssignment_3_0"
    // InternalSequence.g:4990:1: rule__ResponseMessage__LeftAssignment_3_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__LeftAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4994:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4995:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4995:2: ( ( ruleFQN ) )
            // InternalSequence.g:4996:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getLeftActorCrossReference_3_0_0()); 
            // InternalSequence.g:4997:3: ( ruleFQN )
            // InternalSequence.g:4998:4: ruleFQN
            {
             before(grammarAccess.getResponseMessageAccess().getLeftActorFQNParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getResponseMessageAccess().getLeftActorFQNParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getResponseMessageAccess().getLeftActorCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__LeftAssignment_3_0"


    // $ANTLR start "rule__ResponseMessage__RightAssignment_5_0"
    // InternalSequence.g:5009:1: rule__ResponseMessage__RightAssignment_5_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__RightAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5013:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5014:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5014:2: ( ( ruleFQN ) )
            // InternalSequence.g:5015:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getRightActorCrossReference_5_0_0()); 
            // InternalSequence.g:5016:3: ( ruleFQN )
            // InternalSequence.g:5017:4: ruleFQN
            {
             before(grammarAccess.getResponseMessageAccess().getRightActorFQNParserRuleCall_5_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getResponseMessageAccess().getRightActorFQNParserRuleCall_5_0_0_1()); 

            }

             after(grammarAccess.getResponseMessageAccess().getRightActorCrossReference_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__RightAssignment_5_0"


    // $ANTLR start "rule__FoundMessage__TypeAssignment_1"
    // InternalSequence.g:5028:1: rule__FoundMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__FoundMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5032:1: ( ( ruleMessageType ) )
            // InternalSequence.g:5033:2: ( ruleMessageType )
            {
            // InternalSequence.g:5033:2: ( ruleMessageType )
            // InternalSequence.g:5034:3: ruleMessageType
            {
             before(grammarAccess.getFoundMessageAccess().getTypeMessageTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getFoundMessageAccess().getTypeMessageTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__TypeAssignment_1"


    // $ANTLR start "rule__FoundMessage__NameAssignment_2"
    // InternalSequence.g:5043:1: rule__FoundMessage__NameAssignment_2 : ( ruleUnescapedString ) ;
    public final void rule__FoundMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5047:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:5048:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:5048:2: ( ruleUnescapedString )
            // InternalSequence.g:5049:3: ruleUnescapedString
            {
             before(grammarAccess.getFoundMessageAccess().getNameUnescapedStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getFoundMessageAccess().getNameUnescapedStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__NameAssignment_2"


    // $ANTLR start "rule__FoundMessage__RightAssignment_6"
    // InternalSequence.g:5058:1: rule__FoundMessage__RightAssignment_6 : ( ( ruleFQN ) ) ;
    public final void rule__FoundMessage__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5062:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5063:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5063:2: ( ( ruleFQN ) )
            // InternalSequence.g:5064:3: ( ruleFQN )
            {
             before(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0()); 
            // InternalSequence.g:5065:3: ( ruleFQN )
            // InternalSequence.g:5066:4: ruleFQN
            {
             before(grammarAccess.getFoundMessageAccess().getRightActorFQNParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFoundMessageAccess().getRightActorFQNParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__RightAssignment_6"


    // $ANTLR start "rule__LostMessage__TypeAssignment_1"
    // InternalSequence.g:5077:1: rule__LostMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__LostMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5081:1: ( ( ruleMessageType ) )
            // InternalSequence.g:5082:2: ( ruleMessageType )
            {
            // InternalSequence.g:5082:2: ( ruleMessageType )
            // InternalSequence.g:5083:3: ruleMessageType
            {
             before(grammarAccess.getLostMessageAccess().getTypeMessageTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getLostMessageAccess().getTypeMessageTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__TypeAssignment_1"


    // $ANTLR start "rule__LostMessage__NameAssignment_2"
    // InternalSequence.g:5092:1: rule__LostMessage__NameAssignment_2 : ( ruleUnescapedString ) ;
    public final void rule__LostMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5096:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:5097:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:5097:2: ( ruleUnescapedString )
            // InternalSequence.g:5098:3: ruleUnescapedString
            {
             before(grammarAccess.getLostMessageAccess().getNameUnescapedStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getLostMessageAccess().getNameUnescapedStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__NameAssignment_2"


    // $ANTLR start "rule__LostMessage__LeftAssignment_4"
    // InternalSequence.g:5107:1: rule__LostMessage__LeftAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__LostMessage__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5111:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5112:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5112:2: ( ( ruleFQN ) )
            // InternalSequence.g:5113:3: ( ruleFQN )
            {
             before(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0()); 
            // InternalSequence.g:5114:3: ( ruleFQN )
            // InternalSequence.g:5115:4: ruleFQN
            {
             before(grammarAccess.getLostMessageAccess().getLeftActorFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getLostMessageAccess().getLeftActorFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__LeftAssignment_4"


    // $ANTLR start "rule__CreateMessage__NameAssignment_1"
    // InternalSequence.g:5126:1: rule__CreateMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__CreateMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5130:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:5131:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:5131:2: ( ruleUnescapedString )
            // InternalSequence.g:5132:3: ruleUnescapedString
            {
             before(grammarAccess.getCreateMessageAccess().getNameUnescapedStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getCreateMessageAccess().getNameUnescapedStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__NameAssignment_1"


    // $ANTLR start "rule__CreateMessage__LeftAssignment_3"
    // InternalSequence.g:5141:1: rule__CreateMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5145:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5146:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5146:2: ( ( ruleFQN ) )
            // InternalSequence.g:5147:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:5148:3: ( ruleFQN )
            // InternalSequence.g:5149:4: ruleFQN
            {
             before(grammarAccess.getCreateMessageAccess().getLeftActorFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCreateMessageAccess().getLeftActorFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCreateMessageAccess().getLeftActorCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__LeftAssignment_3"


    // $ANTLR start "rule__CreateMessage__RightAssignment_5"
    // InternalSequence.g:5160:1: rule__CreateMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5164:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5165:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5165:2: ( ( ruleFQN ) )
            // InternalSequence.g:5166:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:5167:3: ( ruleFQN )
            // InternalSequence.g:5168:4: ruleFQN
            {
             before(grammarAccess.getCreateMessageAccess().getRightActorFQNParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCreateMessageAccess().getRightActorFQNParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCreateMessageAccess().getRightActorCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__RightAssignment_5"


    // $ANTLR start "rule__DestructionMessage__NameAssignment_1"
    // InternalSequence.g:5179:1: rule__DestructionMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__DestructionMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5183:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:5184:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:5184:2: ( ruleUnescapedString )
            // InternalSequence.g:5185:3: ruleUnescapedString
            {
             before(grammarAccess.getDestructionMessageAccess().getNameUnescapedStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getDestructionMessageAccess().getNameUnescapedStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__NameAssignment_1"


    // $ANTLR start "rule__DestructionMessage__LeftAssignment_3"
    // InternalSequence.g:5194:1: rule__DestructionMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5198:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5199:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5199:2: ( ( ruleFQN ) )
            // InternalSequence.g:5200:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:5201:3: ( ruleFQN )
            // InternalSequence.g:5202:4: ruleFQN
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftActorFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDestructionMessageAccess().getLeftActorFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDestructionMessageAccess().getLeftActorCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__LeftAssignment_3"


    // $ANTLR start "rule__DestructionMessage__RightAssignment_5"
    // InternalSequence.g:5213:1: rule__DestructionMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5217:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5218:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5218:2: ( ( ruleFQN ) )
            // InternalSequence.g:5219:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:5220:3: ( ruleFQN )
            // InternalSequence.g:5221:4: ruleFQN
            {
             before(grammarAccess.getDestructionMessageAccess().getRightActorFQNParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDestructionMessageAccess().getRightActorFQNParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDestructionMessageAccess().getRightActorCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__RightAssignment_5"


    // $ANTLR start "rule__DestructionOccurenceSpecification__TargetAssignment_1"
    // InternalSequence.g:5232:1: rule__DestructionOccurenceSpecification__TargetAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionOccurenceSpecification__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5236:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5237:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5237:2: ( ( ruleFQN ) )
            // InternalSequence.g:5238:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetActorCrossReference_1_0()); 
            // InternalSequence.g:5239:3: ( ruleFQN )
            // InternalSequence.g:5240:4: ruleFQN
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetActorFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetActorFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetActorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionOccurenceSpecification__TargetAssignment_1"


    // $ANTLR start "rule__Alternative__AlternativesAssignment_2"
    // InternalSequence.g:5251:1: rule__Alternative__AlternativesAssignment_2 : ( ruleBehaviorFragmentsWithCondition ) ;
    public final void rule__Alternative__AlternativesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5255:1: ( ( ruleBehaviorFragmentsWithCondition ) )
            // InternalSequence.g:5256:2: ( ruleBehaviorFragmentsWithCondition )
            {
            // InternalSequence.g:5256:2: ( ruleBehaviorFragmentsWithCondition )
            // InternalSequence.g:5257:3: ruleBehaviorFragmentsWithCondition
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesBehaviorFragmentsWithConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragmentsWithCondition();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getAlternativesBehaviorFragmentsWithConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__AlternativesAssignment_2"


    // $ANTLR start "rule__Option__OptionalAssignment_2"
    // InternalSequence.g:5266:1: rule__Option__OptionalAssignment_2 : ( ruleBehaviorFragmentsWithCondition ) ;
    public final void rule__Option__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5270:1: ( ( ruleBehaviorFragmentsWithCondition ) )
            // InternalSequence.g:5271:2: ( ruleBehaviorFragmentsWithCondition )
            {
            // InternalSequence.g:5271:2: ( ruleBehaviorFragmentsWithCondition )
            // InternalSequence.g:5272:3: ruleBehaviorFragmentsWithCondition
            {
             before(grammarAccess.getOptionAccess().getOptionalBehaviorFragmentsWithConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragmentsWithCondition();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getOptionalBehaviorFragmentsWithConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__OptionalAssignment_2"


    // $ANTLR start "rule__Parallel__ParallelsAssignment_2"
    // InternalSequence.g:5281:1: rule__Parallel__ParallelsAssignment_2 : ( ruleBehaviorFragments ) ;
    public final void rule__Parallel__ParallelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5285:1: ( ( ruleBehaviorFragments ) )
            // InternalSequence.g:5286:2: ( ruleBehaviorFragments )
            {
            // InternalSequence.g:5286:2: ( ruleBehaviorFragments )
            // InternalSequence.g:5287:3: ruleBehaviorFragments
            {
             before(grammarAccess.getParallelAccess().getParallelsBehaviorFragmentsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragments();

            state._fsp--;

             after(grammarAccess.getParallelAccess().getParallelsBehaviorFragmentsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__ParallelsAssignment_2"


    // $ANTLR start "rule__Critical__FragmentsAssignment_2"
    // InternalSequence.g:5296:1: rule__Critical__FragmentsAssignment_2 : ( ruleBehaviorFragment ) ;
    public final void rule__Critical__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5300:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5301:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5301:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5302:3: ruleBehaviorFragment
            {
             before(grammarAccess.getCriticalAccess().getFragmentsBehaviorFragmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragment();

            state._fsp--;

             after(grammarAccess.getCriticalAccess().getFragmentsBehaviorFragmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Critical__FragmentsAssignment_2"


    // $ANTLR start "rule__Loop__ConditionAssignment_2"
    // InternalSequence.g:5311:1: rule__Loop__ConditionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Loop__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5315:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5316:2: ( RULE_STRING )
            {
            // InternalSequence.g:5316:2: ( RULE_STRING )
            // InternalSequence.g:5317:3: RULE_STRING
            {
             before(grammarAccess.getLoopAccess().getConditionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getConditionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__ConditionAssignment_2"


    // $ANTLR start "rule__Loop__FragmentsAssignment_5"
    // InternalSequence.g:5326:1: rule__Loop__FragmentsAssignment_5 : ( ruleBehaviorFragment ) ;
    public final void rule__Loop__FragmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5330:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5331:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5331:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5332:3: ruleBehaviorFragment
            {
             before(grammarAccess.getLoopAccess().getFragmentsBehaviorFragmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragment();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getFragmentsBehaviorFragmentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__FragmentsAssignment_5"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__ConditionAssignment_1"
    // InternalSequence.g:5341:1: rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BehaviorFragmentsWithCondition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5345:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5346:2: ( RULE_STRING )
            {
            // InternalSequence.g:5346:2: ( RULE_STRING )
            // InternalSequence.g:5347:3: RULE_STRING
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__ConditionAssignment_1"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1"
    // InternalSequence.g:5356:1: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5360:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5361:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5361:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5362:3: ruleBehaviorFragment
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsBehaviorFragmentParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragment();

            state._fsp--;

             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsBehaviorFragmentParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1"


    // $ANTLR start "rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1"
    // InternalSequence.g:5371:1: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5375:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5376:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5376:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5377:3: ruleBehaviorFragment
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsBehaviorFragmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragment();

            state._fsp--;

             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsBehaviorFragmentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00013FF000A03000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00003FF000003002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00003FF000003000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00003FF010003000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00003FF010003002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000002L});

}