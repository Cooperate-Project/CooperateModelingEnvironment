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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'sync'", "'async'", "'human'", "'machine'", "'d'", "'t'", "'max'", "'diff'", "'@start-seqd'", "'@end-seqd'", "'rootElement'", "'act'", "'as'", "'role['", "']'", "':'", "'{'", "'}'", "'num['", "'time['", "'='", "'('", "','", "')'", "'resp'", "'found'", "'lost'", "'create'", "'dest'", "'alt'", "'opt'", "'par'", "'critical'", "'loop'", "'['", "'.'", "'deferred'"
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


    // $ANTLR start "ruleMessageType"
    // InternalSequence.g:728:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:732:1: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalSequence.g:733:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalSequence.g:733:2: ( ( rule__MessageType__Alternatives ) )
            // InternalSequence.g:734:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalSequence.g:735:3: ( rule__MessageType__Alternatives )
            // InternalSequence.g:735:4: rule__MessageType__Alternatives
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
    // InternalSequence.g:744:1: ruleActorType : ( ( rule__ActorType__Alternatives ) ) ;
    public final void ruleActorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:748:1: ( ( ( rule__ActorType__Alternatives ) ) )
            // InternalSequence.g:749:2: ( ( rule__ActorType__Alternatives ) )
            {
            // InternalSequence.g:749:2: ( ( rule__ActorType__Alternatives ) )
            // InternalSequence.g:750:3: ( rule__ActorType__Alternatives )
            {
             before(grammarAccess.getActorTypeAccess().getAlternatives()); 
            // InternalSequence.g:751:3: ( rule__ActorType__Alternatives )
            // InternalSequence.g:751:4: rule__ActorType__Alternatives
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
    // InternalSequence.g:760:1: ruleTimeConstraintType : ( ( rule__TimeConstraintType__Alternatives ) ) ;
    public final void ruleTimeConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:764:1: ( ( ( rule__TimeConstraintType__Alternatives ) ) )
            // InternalSequence.g:765:2: ( ( rule__TimeConstraintType__Alternatives ) )
            {
            // InternalSequence.g:765:2: ( ( rule__TimeConstraintType__Alternatives ) )
            // InternalSequence.g:766:3: ( rule__TimeConstraintType__Alternatives )
            {
             before(grammarAccess.getTimeConstraintTypeAccess().getAlternatives()); 
            // InternalSequence.g:767:3: ( rule__TimeConstraintType__Alternatives )
            // InternalSequence.g:767:4: rule__TimeConstraintType__Alternatives
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
    // InternalSequence.g:775:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Group_2_0__0 ) ) | ( ( rule__Actor__Group_2_1__0 ) ) | ( ( rule__Actor__Group_2_2__0 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:779:1: ( ( ( rule__Actor__Group_2_0__0 ) ) | ( ( rule__Actor__Group_2_1__0 ) ) | ( ( rule__Actor__Group_2_2__0 ) ) )
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
                    // InternalSequence.g:780:2: ( ( rule__Actor__Group_2_0__0 ) )
                    {
                    // InternalSequence.g:780:2: ( ( rule__Actor__Group_2_0__0 ) )
                    // InternalSequence.g:781:3: ( rule__Actor__Group_2_0__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_0()); 
                    // InternalSequence.g:782:3: ( rule__Actor__Group_2_0__0 )
                    // InternalSequence.g:782:4: rule__Actor__Group_2_0__0
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
                    // InternalSequence.g:786:2: ( ( rule__Actor__Group_2_1__0 ) )
                    {
                    // InternalSequence.g:786:2: ( ( rule__Actor__Group_2_1__0 ) )
                    // InternalSequence.g:787:3: ( rule__Actor__Group_2_1__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_1()); 
                    // InternalSequence.g:788:3: ( rule__Actor__Group_2_1__0 )
                    // InternalSequence.g:788:4: rule__Actor__Group_2_1__0
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
                    // InternalSequence.g:792:2: ( ( rule__Actor__Group_2_2__0 ) )
                    {
                    // InternalSequence.g:792:2: ( ( rule__Actor__Group_2_2__0 ) )
                    // InternalSequence.g:793:3: ( rule__Actor__Group_2_2__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_2()); 
                    // InternalSequence.g:794:3: ( rule__Actor__Group_2_2__0 )
                    // InternalSequence.g:794:4: rule__Actor__Group_2_2__0
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
    // InternalSequence.g:802:1: rule__BehaviorFragment__Alternatives : ( ( ruleMessage ) | ( ruleOccurenceSpecification ) | ( ruleCombinedFragment ) );
    public final void rule__BehaviorFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:806:1: ( ( ruleMessage ) | ( ruleOccurenceSpecification ) | ( ruleCombinedFragment ) )
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

                if ( (LA2_2==RULE_STRING||LA2_2==33) ) {
                    alt2=1;
                }
                else if ( (LA2_2==RULE_ID) ) {
                    alt2=2;
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
                    // InternalSequence.g:807:2: ( ruleMessage )
                    {
                    // InternalSequence.g:807:2: ( ruleMessage )
                    // InternalSequence.g:808:3: ruleMessage
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
                    // InternalSequence.g:813:2: ( ruleOccurenceSpecification )
                    {
                    // InternalSequence.g:813:2: ( ruleOccurenceSpecification )
                    // InternalSequence.g:814:3: ruleOccurenceSpecification
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
                    // InternalSequence.g:819:2: ( ruleCombinedFragment )
                    {
                    // InternalSequence.g:819:2: ( ruleCombinedFragment )
                    // InternalSequence.g:820:3: ruleCombinedFragment
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
    // InternalSequence.g:829:1: rule__BehaviorFragments__Alternatives : ( ( ( rule__BehaviorFragments__Group_0__0 ) ) | ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) ) );
    public final void rule__BehaviorFragments__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:833:1: ( ( ( rule__BehaviorFragments__Group_0__0 ) ) | ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) ) )
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
                    // InternalSequence.g:834:2: ( ( rule__BehaviorFragments__Group_0__0 ) )
                    {
                    // InternalSequence.g:834:2: ( ( rule__BehaviorFragments__Group_0__0 ) )
                    // InternalSequence.g:835:3: ( rule__BehaviorFragments__Group_0__0 )
                    {
                     before(grammarAccess.getBehaviorFragmentsAccess().getGroup_0()); 
                    // InternalSequence.g:836:3: ( rule__BehaviorFragments__Group_0__0 )
                    // InternalSequence.g:836:4: rule__BehaviorFragments__Group_0__0
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
                    // InternalSequence.g:840:2: ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) )
                    {
                    // InternalSequence.g:840:2: ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) )
                    // InternalSequence.g:841:3: ( rule__BehaviorFragments__FragmentsAssignment_1 )
                    {
                     before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_1()); 
                    // InternalSequence.g:842:3: ( rule__BehaviorFragments__FragmentsAssignment_1 )
                    // InternalSequence.g:842:4: rule__BehaviorFragments__FragmentsAssignment_1
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
    // InternalSequence.g:850:1: rule__Message__Alternatives_0 : ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) );
    public final void rule__Message__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:854:1: ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSequence.g:855:2: ( ruleStandardMessage )
                    {
                    // InternalSequence.g:855:2: ( ruleStandardMessage )
                    // InternalSequence.g:856:3: ruleStandardMessage
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
                    // InternalSequence.g:861:2: ( ruleResponseMessage )
                    {
                    // InternalSequence.g:861:2: ( ruleResponseMessage )
                    // InternalSequence.g:862:3: ruleResponseMessage
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
                    // InternalSequence.g:867:2: ( ruleFoundMessage )
                    {
                    // InternalSequence.g:867:2: ( ruleFoundMessage )
                    // InternalSequence.g:868:3: ruleFoundMessage
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
                    // InternalSequence.g:873:2: ( ruleLostMessage )
                    {
                    // InternalSequence.g:873:2: ( ruleLostMessage )
                    // InternalSequence.g:874:3: ruleLostMessage
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
                    // InternalSequence.g:879:2: ( ruleCreateMessage )
                    {
                    // InternalSequence.g:879:2: ( ruleCreateMessage )
                    // InternalSequence.g:880:3: ruleCreateMessage
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
                    // InternalSequence.g:885:2: ( ruleDestructionMessage )
                    {
                    // InternalSequence.g:885:2: ( ruleDestructionMessage )
                    // InternalSequence.g:886:3: ruleDestructionMessage
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
    // InternalSequence.g:895:1: rule__ResponseMessage__Alternatives_3 : ( ( ( rule__ResponseMessage__LeftAssignment_3_0 ) ) | ( '_' ) );
    public final void rule__ResponseMessage__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:899:1: ( ( ( rule__ResponseMessage__LeftAssignment_3_0 ) ) | ( '_' ) )
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
                    // InternalSequence.g:900:2: ( ( rule__ResponseMessage__LeftAssignment_3_0 ) )
                    {
                    // InternalSequence.g:900:2: ( ( rule__ResponseMessage__LeftAssignment_3_0 ) )
                    // InternalSequence.g:901:3: ( rule__ResponseMessage__LeftAssignment_3_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getLeftAssignment_3_0()); 
                    // InternalSequence.g:902:3: ( rule__ResponseMessage__LeftAssignment_3_0 )
                    // InternalSequence.g:902:4: rule__ResponseMessage__LeftAssignment_3_0
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
                    // InternalSequence.g:906:2: ( '_' )
                    {
                    // InternalSequence.g:906:2: ( '_' )
                    // InternalSequence.g:907:3: '_'
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
    // InternalSequence.g:916:1: rule__ResponseMessage__Alternatives_5 : ( ( ( rule__ResponseMessage__RightAssignment_5_0 ) ) | ( '_' ) );
    public final void rule__ResponseMessage__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:920:1: ( ( ( rule__ResponseMessage__RightAssignment_5_0 ) ) | ( '_' ) )
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
                    // InternalSequence.g:921:2: ( ( rule__ResponseMessage__RightAssignment_5_0 ) )
                    {
                    // InternalSequence.g:921:2: ( ( rule__ResponseMessage__RightAssignment_5_0 ) )
                    // InternalSequence.g:922:3: ( rule__ResponseMessage__RightAssignment_5_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getRightAssignment_5_0()); 
                    // InternalSequence.g:923:3: ( rule__ResponseMessage__RightAssignment_5_0 )
                    // InternalSequence.g:923:4: rule__ResponseMessage__RightAssignment_5_0
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
                    // InternalSequence.g:927:2: ( '_' )
                    {
                    // InternalSequence.g:927:2: ( '_' )
                    // InternalSequence.g:928:3: '_'
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
    // InternalSequence.g:937:1: rule__CombinedFragment__Alternatives : ( ( ruleAlternative ) | ( ruleOption ) | ( ruleParallel ) | ( ruleCritical ) | ( ruleLoop ) );
    public final void rule__CombinedFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:941:1: ( ( ruleAlternative ) | ( ruleOption ) | ( ruleParallel ) | ( ruleCritical ) | ( ruleLoop ) )
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
                    // InternalSequence.g:942:2: ( ruleAlternative )
                    {
                    // InternalSequence.g:942:2: ( ruleAlternative )
                    // InternalSequence.g:943:3: ruleAlternative
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
                    // InternalSequence.g:948:2: ( ruleOption )
                    {
                    // InternalSequence.g:948:2: ( ruleOption )
                    // InternalSequence.g:949:3: ruleOption
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
                    // InternalSequence.g:954:2: ( ruleParallel )
                    {
                    // InternalSequence.g:954:2: ( ruleParallel )
                    // InternalSequence.g:955:3: ruleParallel
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
                    // InternalSequence.g:960:2: ( ruleCritical )
                    {
                    // InternalSequence.g:960:2: ( ruleCritical )
                    // InternalSequence.g:961:3: ruleCritical
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
                    // InternalSequence.g:966:2: ( ruleLoop )
                    {
                    // InternalSequence.g:966:2: ( ruleLoop )
                    // InternalSequence.g:967:3: ruleLoop
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
    // InternalSequence.g:976:1: rule__BehaviorFragmentsWithCondition__Alternatives_3 : ( ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) ) | ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) ) );
    public final void rule__BehaviorFragmentsWithCondition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:980:1: ( ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) ) | ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) ) )
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
                    // InternalSequence.g:981:2: ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) )
                    {
                    // InternalSequence.g:981:2: ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) )
                    // InternalSequence.g:982:3: ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 )
                    {
                     before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getGroup_3_0()); 
                    // InternalSequence.g:983:3: ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 )
                    // InternalSequence.g:983:4: rule__BehaviorFragmentsWithCondition__Group_3_0__0
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
                    // InternalSequence.g:987:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) )
                    {
                    // InternalSequence.g:987:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) )
                    // InternalSequence.g:988:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 )
                    {
                     before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_1()); 
                    // InternalSequence.g:989:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 )
                    // InternalSequence.g:989:4: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1
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


    // $ANTLR start "rule__MessageType__Alternatives"
    // InternalSequence.g:997:1: rule__MessageType__Alternatives : ( ( ( 'sync' ) ) | ( ( 'async' ) ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1001:1: ( ( ( 'sync' ) ) | ( ( 'async' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSequence.g:1002:2: ( ( 'sync' ) )
                    {
                    // InternalSequence.g:1002:2: ( ( 'sync' ) )
                    // InternalSequence.g:1003:3: ( 'sync' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1004:3: ( 'sync' )
                    // InternalSequence.g:1004:4: 'sync'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1008:2: ( ( 'async' ) )
                    {
                    // InternalSequence.g:1008:2: ( ( 'async' ) )
                    // InternalSequence.g:1009:3: ( 'async' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getASYNCEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1010:3: ( 'async' )
                    // InternalSequence.g:1010:4: 'async'
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
    // InternalSequence.g:1018:1: rule__ActorType__Alternatives : ( ( ( 'human' ) ) | ( ( 'machine' ) ) );
    public final void rule__ActorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1022:1: ( ( ( 'human' ) ) | ( ( 'machine' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSequence.g:1023:2: ( ( 'human' ) )
                    {
                    // InternalSequence.g:1023:2: ( ( 'human' ) )
                    // InternalSequence.g:1024:3: ( 'human' )
                    {
                     before(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1025:3: ( 'human' )
                    // InternalSequence.g:1025:4: 'human'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1029:2: ( ( 'machine' ) )
                    {
                    // InternalSequence.g:1029:2: ( ( 'machine' ) )
                    // InternalSequence.g:1030:3: ( 'machine' )
                    {
                     before(grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1031:3: ( 'machine' )
                    // InternalSequence.g:1031:4: 'machine'
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
    // InternalSequence.g:1039:1: rule__TimeConstraintType__Alternatives : ( ( ( 'd' ) ) | ( ( 't' ) ) | ( ( 'max' ) ) | ( ( 'diff' ) ) );
    public final void rule__TimeConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1043:1: ( ( ( 'd' ) ) | ( ( 't' ) ) | ( ( 'max' ) ) | ( ( 'diff' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 18:
                {
                alt11=3;
                }
                break;
            case 19:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSequence.g:1044:2: ( ( 'd' ) )
                    {
                    // InternalSequence.g:1044:2: ( ( 'd' ) )
                    // InternalSequence.g:1045:3: ( 'd' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getDURATIONEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1046:3: ( 'd' )
                    // InternalSequence.g:1046:4: 'd'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeConstraintTypeAccess().getDURATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1050:2: ( ( 't' ) )
                    {
                    // InternalSequence.g:1050:2: ( ( 't' ) )
                    // InternalSequence.g:1051:3: ( 't' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getTIMEEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1052:3: ( 't' )
                    // InternalSequence.g:1052:4: 't'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeConstraintTypeAccess().getTIMEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:1056:2: ( ( 'max' ) )
                    {
                    // InternalSequence.g:1056:2: ( ( 'max' ) )
                    // InternalSequence.g:1057:3: ( 'max' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getMAXIMUMEnumLiteralDeclaration_2()); 
                    // InternalSequence.g:1058:3: ( 'max' )
                    // InternalSequence.g:1058:4: 'max'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeConstraintTypeAccess().getMAXIMUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSequence.g:1062:2: ( ( 'diff' ) )
                    {
                    // InternalSequence.g:1062:2: ( ( 'diff' ) )
                    // InternalSequence.g:1063:3: ( 'diff' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getDIFFERENCEEnumLiteralDeclaration_3()); 
                    // InternalSequence.g:1064:3: ( 'diff' )
                    // InternalSequence.g:1064:4: 'diff'
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
    // InternalSequence.g:1072:1: rule__SequenceDiagram__Group__0 : rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 ;
    public final void rule__SequenceDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1076:1: ( rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 )
            // InternalSequence.g:1077:2: rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1
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
    // InternalSequence.g:1084:1: rule__SequenceDiagram__Group__0__Impl : ( () ) ;
    public final void rule__SequenceDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1088:1: ( ( () ) )
            // InternalSequence.g:1089:1: ( () )
            {
            // InternalSequence.g:1089:1: ( () )
            // InternalSequence.g:1090:2: ()
            {
             before(grammarAccess.getSequenceDiagramAccess().getSequenceDiagramAction_0()); 
            // InternalSequence.g:1091:2: ()
            // InternalSequence.g:1091:3: 
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
    // InternalSequence.g:1099:1: rule__SequenceDiagram__Group__1 : rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 ;
    public final void rule__SequenceDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1103:1: ( rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 )
            // InternalSequence.g:1104:2: rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2
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
    // InternalSequence.g:1111:1: rule__SequenceDiagram__Group__1__Impl : ( '@start-seqd' ) ;
    public final void rule__SequenceDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1115:1: ( ( '@start-seqd' ) )
            // InternalSequence.g:1116:1: ( '@start-seqd' )
            {
            // InternalSequence.g:1116:1: ( '@start-seqd' )
            // InternalSequence.g:1117:2: '@start-seqd'
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
    // InternalSequence.g:1126:1: rule__SequenceDiagram__Group__2 : rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 ;
    public final void rule__SequenceDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1130:1: ( rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 )
            // InternalSequence.g:1131:2: rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3
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
    // InternalSequence.g:1138:1: rule__SequenceDiagram__Group__2__Impl : ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) ;
    public final void rule__SequenceDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1142:1: ( ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) )
            // InternalSequence.g:1143:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            {
            // InternalSequence.g:1143:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            // InternalSequence.g:1144:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getTitleAssignment_2()); 
            // InternalSequence.g:1145:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            // InternalSequence.g:1145:3: rule__SequenceDiagram__TitleAssignment_2
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
    // InternalSequence.g:1153:1: rule__SequenceDiagram__Group__3 : rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 ;
    public final void rule__SequenceDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1157:1: ( rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 )
            // InternalSequence.g:1158:2: rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4
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
    // InternalSequence.g:1165:1: rule__SequenceDiagram__Group__3__Impl : ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__SequenceDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1169:1: ( ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) )
            // InternalSequence.g:1170:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            {
            // InternalSequence.g:1170:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            // InternalSequence.g:1171:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getRootPackageAssignment_3()); 
            // InternalSequence.g:1172:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            // InternalSequence.g:1172:3: rule__SequenceDiagram__RootPackageAssignment_3
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
    // InternalSequence.g:1180:1: rule__SequenceDiagram__Group__4 : rule__SequenceDiagram__Group__4__Impl ;
    public final void rule__SequenceDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1184:1: ( rule__SequenceDiagram__Group__4__Impl )
            // InternalSequence.g:1185:2: rule__SequenceDiagram__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:1191:1: rule__SequenceDiagram__Group__4__Impl : ( '@end-seqd' ) ;
    public final void rule__SequenceDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1195:1: ( ( '@end-seqd' ) )
            // InternalSequence.g:1196:1: ( '@end-seqd' )
            {
            // InternalSequence.g:1196:1: ( '@end-seqd' )
            // InternalSequence.g:1197:2: '@end-seqd'
            {
             before(grammarAccess.getSequenceDiagramAccess().getEndSeqdKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSequenceDiagramAccess().getEndSeqdKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__RootPackage__Group__0"
    // InternalSequence.g:1207:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1211:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalSequence.g:1212:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:1219:1: rule__RootPackage__Group__0__Impl : ( 'rootElement' ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1223:1: ( ( 'rootElement' ) )
            // InternalSequence.g:1224:1: ( 'rootElement' )
            {
            // InternalSequence.g:1224:1: ( 'rootElement' )
            // InternalSequence.g:1225:2: 'rootElement'
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
    // InternalSequence.g:1234:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1238:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalSequence.g:1239:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSequence.g:1246:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__NameAssignment_1 ) ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1250:1: ( ( ( rule__RootPackage__NameAssignment_1 ) ) )
            // InternalSequence.g:1251:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            {
            // InternalSequence.g:1251:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            // InternalSequence.g:1252:2: ( rule__RootPackage__NameAssignment_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 
            // InternalSequence.g:1253:2: ( rule__RootPackage__NameAssignment_1 )
            // InternalSequence.g:1253:3: rule__RootPackage__NameAssignment_1
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


    // $ANTLR start "rule__RootPackage__Group__2"
    // InternalSequence.g:1261:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1265:1: ( rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 )
            // InternalSequence.g:1266:2: rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalSequence.g:1273:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__ActorsAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1277:1: ( ( ( rule__RootPackage__ActorsAssignment_2 )* ) )
            // InternalSequence.g:1278:1: ( ( rule__RootPackage__ActorsAssignment_2 )* )
            {
            // InternalSequence.g:1278:1: ( ( rule__RootPackage__ActorsAssignment_2 )* )
            // InternalSequence.g:1279:2: ( rule__RootPackage__ActorsAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getActorsAssignment_2()); 
            // InternalSequence.g:1280:2: ( rule__RootPackage__ActorsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSequence.g:1280:3: rule__RootPackage__ActorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RootPackage__ActorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRootPackageAccess().getActorsAssignment_2()); 

            }


            }

        }
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
    // InternalSequence.g:1288:1: rule__RootPackage__Group__3 : rule__RootPackage__Group__3__Impl ;
    public final void rule__RootPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1292:1: ( rule__RootPackage__Group__3__Impl )
            // InternalSequence.g:1293:2: rule__RootPackage__Group__3__Impl
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
    // InternalSequence.g:1299:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__BehaviorFragmentsAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1303:1: ( ( ( rule__RootPackage__BehaviorFragmentsAssignment_3 )* ) )
            // InternalSequence.g:1304:1: ( ( rule__RootPackage__BehaviorFragmentsAssignment_3 )* )
            {
            // InternalSequence.g:1304:1: ( ( rule__RootPackage__BehaviorFragmentsAssignment_3 )* )
            // InternalSequence.g:1305:2: ( rule__RootPackage__BehaviorFragmentsAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getBehaviorFragmentsAssignment_3()); 
            // InternalSequence.g:1306:2: ( rule__RootPackage__BehaviorFragmentsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=13)||(LA13_0>=36 && LA13_0<=45)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSequence.g:1306:3: rule__RootPackage__BehaviorFragmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RootPackage__BehaviorFragmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRootPackageAccess().getBehaviorFragmentsAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Actor__Group__0"
    // InternalSequence.g:1315:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1319:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalSequence.g:1320:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSequence.g:1327:1: rule__Actor__Group__0__Impl : ( 'act' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1331:1: ( ( 'act' ) )
            // InternalSequence.g:1332:1: ( 'act' )
            {
            // InternalSequence.g:1332:1: ( 'act' )
            // InternalSequence.g:1333:2: 'act'
            {
             before(grammarAccess.getActorAccess().getActKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActKeyword_0()); 

            }


            }

        }
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
    // InternalSequence.g:1342:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1346:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalSequence.g:1347:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
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
    // InternalSequence.g:1354:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__DeferredAssignment_1 )? ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1358:1: ( ( ( rule__Actor__DeferredAssignment_1 )? ) )
            // InternalSequence.g:1359:1: ( ( rule__Actor__DeferredAssignment_1 )? )
            {
            // InternalSequence.g:1359:1: ( ( rule__Actor__DeferredAssignment_1 )? )
            // InternalSequence.g:1360:2: ( rule__Actor__DeferredAssignment_1 )?
            {
             before(grammarAccess.getActorAccess().getDeferredAssignment_1()); 
            // InternalSequence.g:1361:2: ( rule__Actor__DeferredAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSequence.g:1361:3: rule__Actor__DeferredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__DeferredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getDeferredAssignment_1()); 

            }


            }

        }
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
    // InternalSequence.g:1369:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1373:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalSequence.g:1374:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
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
    // InternalSequence.g:1381:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__Alternatives_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1385:1: ( ( ( rule__Actor__Alternatives_2 ) ) )
            // InternalSequence.g:1386:1: ( ( rule__Actor__Alternatives_2 ) )
            {
            // InternalSequence.g:1386:1: ( ( rule__Actor__Alternatives_2 ) )
            // InternalSequence.g:1387:2: ( rule__Actor__Alternatives_2 )
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // InternalSequence.g:1388:2: ( rule__Actor__Alternatives_2 )
            // InternalSequence.g:1388:3: rule__Actor__Alternatives_2
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
    // InternalSequence.g:1396:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1400:1: ( rule__Actor__Group__3__Impl )
            // InternalSequence.g:1401:2: rule__Actor__Group__3__Impl
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
    // InternalSequence.g:1407:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1411:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // InternalSequence.g:1412:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // InternalSequence.g:1412:1: ( ( rule__Actor__Group_3__0 )? )
            // InternalSequence.g:1413:2: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // InternalSequence.g:1414:2: ( rule__Actor__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSequence.g:1414:3: rule__Actor__Group_3__0
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
    // InternalSequence.g:1423:1: rule__Actor__Group_2_0__0 : rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 ;
    public final void rule__Actor__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1427:1: ( rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 )
            // InternalSequence.g:1428:2: rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1
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
    // InternalSequence.g:1435:1: rule__Actor__Group_2_0__0__Impl : ( ( rule__Actor__NameAssignment_2_0_0 ) ) ;
    public final void rule__Actor__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1439:1: ( ( ( rule__Actor__NameAssignment_2_0_0 ) ) )
            // InternalSequence.g:1440:1: ( ( rule__Actor__NameAssignment_2_0_0 ) )
            {
            // InternalSequence.g:1440:1: ( ( rule__Actor__NameAssignment_2_0_0 ) )
            // InternalSequence.g:1441:2: ( rule__Actor__NameAssignment_2_0_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_0_0()); 
            // InternalSequence.g:1442:2: ( rule__Actor__NameAssignment_2_0_0 )
            // InternalSequence.g:1442:3: rule__Actor__NameAssignment_2_0_0
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
    // InternalSequence.g:1450:1: rule__Actor__Group_2_0__1 : rule__Actor__Group_2_0__1__Impl ;
    public final void rule__Actor__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1454:1: ( rule__Actor__Group_2_0__1__Impl )
            // InternalSequence.g:1455:2: rule__Actor__Group_2_0__1__Impl
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
    // InternalSequence.g:1461:1: rule__Actor__Group_2_0__1__Impl : ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? ) ;
    public final void rule__Actor__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1465:1: ( ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? ) )
            // InternalSequence.g:1466:1: ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? )
            {
            // InternalSequence.g:1466:1: ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? )
            // InternalSequence.g:1467:2: ( rule__Actor__TypeMappingAssignment_2_0_1 )?
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_0_1()); 
            // InternalSequence.g:1468:2: ( rule__Actor__TypeMappingAssignment_2_0_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSequence.g:1468:3: rule__Actor__TypeMappingAssignment_2_0_1
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
    // InternalSequence.g:1477:1: rule__Actor__Group_2_1__0 : rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 ;
    public final void rule__Actor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1481:1: ( rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 )
            // InternalSequence.g:1482:2: rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1
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
    // InternalSequence.g:1489:1: rule__Actor__Group_2_1__0__Impl : ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) ) ;
    public final void rule__Actor__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1493:1: ( ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) ) )
            // InternalSequence.g:1494:1: ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) )
            {
            // InternalSequence.g:1494:1: ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) )
            // InternalSequence.g:1495:2: ( rule__Actor__TypeMappingAssignment_2_1_0 )
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_1_0()); 
            // InternalSequence.g:1496:2: ( rule__Actor__TypeMappingAssignment_2_1_0 )
            // InternalSequence.g:1496:3: rule__Actor__TypeMappingAssignment_2_1_0
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
    // InternalSequence.g:1504:1: rule__Actor__Group_2_1__1 : rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 ;
    public final void rule__Actor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1508:1: ( rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 )
            // InternalSequence.g:1509:2: rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:1516:1: rule__Actor__Group_2_1__1__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1520:1: ( ( 'as' ) )
            // InternalSequence.g:1521:1: ( 'as' )
            {
            // InternalSequence.g:1521:1: ( 'as' )
            // InternalSequence.g:1522:2: 'as'
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
    // InternalSequence.g:1531:1: rule__Actor__Group_2_1__2 : rule__Actor__Group_2_1__2__Impl ;
    public final void rule__Actor__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1535:1: ( rule__Actor__Group_2_1__2__Impl )
            // InternalSequence.g:1536:2: rule__Actor__Group_2_1__2__Impl
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
    // InternalSequence.g:1542:1: rule__Actor__Group_2_1__2__Impl : ( ( rule__Actor__AliasAssignment_2_1_2 ) ) ;
    public final void rule__Actor__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1546:1: ( ( ( rule__Actor__AliasAssignment_2_1_2 ) ) )
            // InternalSequence.g:1547:1: ( ( rule__Actor__AliasAssignment_2_1_2 ) )
            {
            // InternalSequence.g:1547:1: ( ( rule__Actor__AliasAssignment_2_1_2 ) )
            // InternalSequence.g:1548:2: ( rule__Actor__AliasAssignment_2_1_2 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_1_2()); 
            // InternalSequence.g:1549:2: ( rule__Actor__AliasAssignment_2_1_2 )
            // InternalSequence.g:1549:3: rule__Actor__AliasAssignment_2_1_2
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
    // InternalSequence.g:1558:1: rule__Actor__Group_2_2__0 : rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 ;
    public final void rule__Actor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1562:1: ( rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 )
            // InternalSequence.g:1563:2: rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1
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
    // InternalSequence.g:1570:1: rule__Actor__Group_2_2__0__Impl : ( ( rule__Actor__NameAssignment_2_2_0 ) ) ;
    public final void rule__Actor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1574:1: ( ( ( rule__Actor__NameAssignment_2_2_0 ) ) )
            // InternalSequence.g:1575:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            {
            // InternalSequence.g:1575:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            // InternalSequence.g:1576:2: ( rule__Actor__NameAssignment_2_2_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_2_0()); 
            // InternalSequence.g:1577:2: ( rule__Actor__NameAssignment_2_2_0 )
            // InternalSequence.g:1577:3: rule__Actor__NameAssignment_2_2_0
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
    // InternalSequence.g:1585:1: rule__Actor__Group_2_2__1 : rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 ;
    public final void rule__Actor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1589:1: ( rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 )
            // InternalSequence.g:1590:2: rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2
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
    // InternalSequence.g:1597:1: rule__Actor__Group_2_2__1__Impl : ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? ) ;
    public final void rule__Actor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1601:1: ( ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? ) )
            // InternalSequence.g:1602:1: ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? )
            {
            // InternalSequence.g:1602:1: ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? )
            // InternalSequence.g:1603:2: ( rule__Actor__TypeMappingAssignment_2_2_1 )?
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_2_1()); 
            // InternalSequence.g:1604:2: ( rule__Actor__TypeMappingAssignment_2_2_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSequence.g:1604:3: rule__Actor__TypeMappingAssignment_2_2_1
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
    // InternalSequence.g:1612:1: rule__Actor__Group_2_2__2 : rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 ;
    public final void rule__Actor__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1616:1: ( rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 )
            // InternalSequence.g:1617:2: rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:1624:1: rule__Actor__Group_2_2__2__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1628:1: ( ( 'as' ) )
            // InternalSequence.g:1629:1: ( 'as' )
            {
            // InternalSequence.g:1629:1: ( 'as' )
            // InternalSequence.g:1630:2: 'as'
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
    // InternalSequence.g:1639:1: rule__Actor__Group_2_2__3 : rule__Actor__Group_2_2__3__Impl ;
    public final void rule__Actor__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1643:1: ( rule__Actor__Group_2_2__3__Impl )
            // InternalSequence.g:1644:2: rule__Actor__Group_2_2__3__Impl
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
    // InternalSequence.g:1650:1: rule__Actor__Group_2_2__3__Impl : ( ( rule__Actor__AliasAssignment_2_2_3 ) ) ;
    public final void rule__Actor__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1654:1: ( ( ( rule__Actor__AliasAssignment_2_2_3 ) ) )
            // InternalSequence.g:1655:1: ( ( rule__Actor__AliasAssignment_2_2_3 ) )
            {
            // InternalSequence.g:1655:1: ( ( rule__Actor__AliasAssignment_2_2_3 ) )
            // InternalSequence.g:1656:2: ( rule__Actor__AliasAssignment_2_2_3 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_2_3()); 
            // InternalSequence.g:1657:2: ( rule__Actor__AliasAssignment_2_2_3 )
            // InternalSequence.g:1657:3: rule__Actor__AliasAssignment_2_2_3
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
    // InternalSequence.g:1666:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1670:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // InternalSequence.g:1671:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
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
    // InternalSequence.g:1678:1: rule__Actor__Group_3__0__Impl : ( 'role[' ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1682:1: ( ( 'role[' ) )
            // InternalSequence.g:1683:1: ( 'role[' )
            {
            // InternalSequence.g:1683:1: ( 'role[' )
            // InternalSequence.g:1684:2: 'role['
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
    // InternalSequence.g:1693:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1697:1: ( rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 )
            // InternalSequence.g:1698:2: rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2
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
    // InternalSequence.g:1705:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1709:1: ( ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) )
            // InternalSequence.g:1710:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            {
            // InternalSequence.g:1710:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            // InternalSequence.g:1711:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            {
             before(grammarAccess.getActorAccess().getActorTypeAssignment_3_1()); 
            // InternalSequence.g:1712:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            // InternalSequence.g:1712:3: rule__Actor__ActorTypeAssignment_3_1
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
    // InternalSequence.g:1720:1: rule__Actor__Group_3__2 : rule__Actor__Group_3__2__Impl ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1724:1: ( rule__Actor__Group_3__2__Impl )
            // InternalSequence.g:1725:2: rule__Actor__Group_3__2__Impl
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
    // InternalSequence.g:1731:1: rule__Actor__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Actor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1735:1: ( ( ']' ) )
            // InternalSequence.g:1736:1: ( ']' )
            {
            // InternalSequence.g:1736:1: ( ']' )
            // InternalSequence.g:1737:2: ']'
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
    // InternalSequence.g:1747:1: rule__ActorClassifierMapping__Group__0 : rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1 ;
    public final void rule__ActorClassifierMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1751:1: ( rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1 )
            // InternalSequence.g:1752:2: rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:1759:1: rule__ActorClassifierMapping__Group__0__Impl : ( ':' ) ;
    public final void rule__ActorClassifierMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1763:1: ( ( ':' ) )
            // InternalSequence.g:1764:1: ( ':' )
            {
            // InternalSequence.g:1764:1: ( ':' )
            // InternalSequence.g:1765:2: ':'
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
    // InternalSequence.g:1774:1: rule__ActorClassifierMapping__Group__1 : rule__ActorClassifierMapping__Group__1__Impl ;
    public final void rule__ActorClassifierMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1778:1: ( rule__ActorClassifierMapping__Group__1__Impl )
            // InternalSequence.g:1779:2: rule__ActorClassifierMapping__Group__1__Impl
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
    // InternalSequence.g:1785:1: rule__ActorClassifierMapping__Group__1__Impl : ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) ) ;
    public final void rule__ActorClassifierMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1789:1: ( ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) ) )
            // InternalSequence.g:1790:1: ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) )
            {
            // InternalSequence.g:1790:1: ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) )
            // InternalSequence.g:1791:2: ( rule__ActorClassifierMapping__ClassifierAssignment_1 )
            {
             before(grammarAccess.getActorClassifierMappingAccess().getClassifierAssignment_1()); 
            // InternalSequence.g:1792:2: ( rule__ActorClassifierMapping__ClassifierAssignment_1 )
            // InternalSequence.g:1792:3: rule__ActorClassifierMapping__ClassifierAssignment_1
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
    // InternalSequence.g:1801:1: rule__BehaviorFragments__Group_0__0 : rule__BehaviorFragments__Group_0__0__Impl rule__BehaviorFragments__Group_0__1 ;
    public final void rule__BehaviorFragments__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1805:1: ( rule__BehaviorFragments__Group_0__0__Impl rule__BehaviorFragments__Group_0__1 )
            // InternalSequence.g:1806:2: rule__BehaviorFragments__Group_0__0__Impl rule__BehaviorFragments__Group_0__1
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
    // InternalSequence.g:1813:1: rule__BehaviorFragments__Group_0__0__Impl : ( '{' ) ;
    public final void rule__BehaviorFragments__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1817:1: ( ( '{' ) )
            // InternalSequence.g:1818:1: ( '{' )
            {
            // InternalSequence.g:1818:1: ( '{' )
            // InternalSequence.g:1819:2: '{'
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
    // InternalSequence.g:1828:1: rule__BehaviorFragments__Group_0__1 : rule__BehaviorFragments__Group_0__1__Impl rule__BehaviorFragments__Group_0__2 ;
    public final void rule__BehaviorFragments__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1832:1: ( rule__BehaviorFragments__Group_0__1__Impl rule__BehaviorFragments__Group_0__2 )
            // InternalSequence.g:1833:2: rule__BehaviorFragments__Group_0__1__Impl rule__BehaviorFragments__Group_0__2
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
    // InternalSequence.g:1840:1: rule__BehaviorFragments__Group_0__1__Impl : ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) ) ;
    public final void rule__BehaviorFragments__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1844:1: ( ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) ) )
            // InternalSequence.g:1845:1: ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) )
            {
            // InternalSequence.g:1845:1: ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) )
            // InternalSequence.g:1846:2: ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* )
            {
            // InternalSequence.g:1846:2: ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) )
            // InternalSequence.g:1847:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_0_1()); 
            // InternalSequence.g:1848:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )
            // InternalSequence.g:1848:4: rule__BehaviorFragments__FragmentsAssignment_0_1
            {
            pushFollow(FOLLOW_10);
            rule__BehaviorFragments__FragmentsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_0_1()); 

            }

            // InternalSequence.g:1851:2: ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* )
            // InternalSequence.g:1852:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )*
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_0_1()); 
            // InternalSequence.g:1853:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=13)||(LA18_0>=36 && LA18_0<=45)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSequence.g:1853:4: rule__BehaviorFragments__FragmentsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BehaviorFragments__FragmentsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalSequence.g:1862:1: rule__BehaviorFragments__Group_0__2 : rule__BehaviorFragments__Group_0__2__Impl ;
    public final void rule__BehaviorFragments__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1866:1: ( rule__BehaviorFragments__Group_0__2__Impl )
            // InternalSequence.g:1867:2: rule__BehaviorFragments__Group_0__2__Impl
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
    // InternalSequence.g:1873:1: rule__BehaviorFragments__Group_0__2__Impl : ( '}' ) ;
    public final void rule__BehaviorFragments__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1877:1: ( ( '}' ) )
            // InternalSequence.g:1878:1: ( '}' )
            {
            // InternalSequence.g:1878:1: ( '}' )
            // InternalSequence.g:1879:2: '}'
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
    // InternalSequence.g:1889:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1893:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalSequence.g:1894:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalSequence.g:1901:1: rule__Message__Group__0__Impl : ( ( rule__Message__Alternatives_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1905:1: ( ( ( rule__Message__Alternatives_0 ) ) )
            // InternalSequence.g:1906:1: ( ( rule__Message__Alternatives_0 ) )
            {
            // InternalSequence.g:1906:1: ( ( rule__Message__Alternatives_0 ) )
            // InternalSequence.g:1907:2: ( rule__Message__Alternatives_0 )
            {
             before(grammarAccess.getMessageAccess().getAlternatives_0()); 
            // InternalSequence.g:1908:2: ( rule__Message__Alternatives_0 )
            // InternalSequence.g:1908:3: rule__Message__Alternatives_0
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
    // InternalSequence.g:1916:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1920:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalSequence.g:1921:2: rule__Message__Group__1__Impl rule__Message__Group__2
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
    // InternalSequence.g:1928:1: rule__Message__Group__1__Impl : ( ( rule__Message__Group_1__0 )? ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1932:1: ( ( ( rule__Message__Group_1__0 )? ) )
            // InternalSequence.g:1933:1: ( ( rule__Message__Group_1__0 )? )
            {
            // InternalSequence.g:1933:1: ( ( rule__Message__Group_1__0 )? )
            // InternalSequence.g:1934:2: ( rule__Message__Group_1__0 )?
            {
             before(grammarAccess.getMessageAccess().getGroup_1()); 
            // InternalSequence.g:1935:2: ( rule__Message__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSequence.g:1935:3: rule__Message__Group_1__0
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
    // InternalSequence.g:1943:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1947:1: ( rule__Message__Group__2__Impl )
            // InternalSequence.g:1948:2: rule__Message__Group__2__Impl
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
    // InternalSequence.g:1954:1: rule__Message__Group__2__Impl : ( ( rule__Message__TimeConstraintAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1958:1: ( ( ( rule__Message__TimeConstraintAssignment_2 )? ) )
            // InternalSequence.g:1959:1: ( ( rule__Message__TimeConstraintAssignment_2 )? )
            {
            // InternalSequence.g:1959:1: ( ( rule__Message__TimeConstraintAssignment_2 )? )
            // InternalSequence.g:1960:2: ( rule__Message__TimeConstraintAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getTimeConstraintAssignment_2()); 
            // InternalSequence.g:1961:2: ( rule__Message__TimeConstraintAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSequence.g:1961:3: rule__Message__TimeConstraintAssignment_2
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
    // InternalSequence.g:1970:1: rule__Message__Group_1__0 : rule__Message__Group_1__0__Impl rule__Message__Group_1__1 ;
    public final void rule__Message__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1974:1: ( rule__Message__Group_1__0__Impl rule__Message__Group_1__1 )
            // InternalSequence.g:1975:2: rule__Message__Group_1__0__Impl rule__Message__Group_1__1
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
    // InternalSequence.g:1982:1: rule__Message__Group_1__0__Impl : ( 'num[' ) ;
    public final void rule__Message__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1986:1: ( ( 'num[' ) )
            // InternalSequence.g:1987:1: ( 'num[' )
            {
            // InternalSequence.g:1987:1: ( 'num[' )
            // InternalSequence.g:1988:2: 'num['
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
    // InternalSequence.g:1997:1: rule__Message__Group_1__1 : rule__Message__Group_1__1__Impl rule__Message__Group_1__2 ;
    public final void rule__Message__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2001:1: ( rule__Message__Group_1__1__Impl rule__Message__Group_1__2 )
            // InternalSequence.g:2002:2: rule__Message__Group_1__1__Impl rule__Message__Group_1__2
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
    // InternalSequence.g:2009:1: rule__Message__Group_1__1__Impl : ( ( rule__Message__OrderAssignment_1_1 ) ) ;
    public final void rule__Message__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2013:1: ( ( ( rule__Message__OrderAssignment_1_1 ) ) )
            // InternalSequence.g:2014:1: ( ( rule__Message__OrderAssignment_1_1 ) )
            {
            // InternalSequence.g:2014:1: ( ( rule__Message__OrderAssignment_1_1 ) )
            // InternalSequence.g:2015:2: ( rule__Message__OrderAssignment_1_1 )
            {
             before(grammarAccess.getMessageAccess().getOrderAssignment_1_1()); 
            // InternalSequence.g:2016:2: ( rule__Message__OrderAssignment_1_1 )
            // InternalSequence.g:2016:3: rule__Message__OrderAssignment_1_1
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
    // InternalSequence.g:2024:1: rule__Message__Group_1__2 : rule__Message__Group_1__2__Impl ;
    public final void rule__Message__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2028:1: ( rule__Message__Group_1__2__Impl )
            // InternalSequence.g:2029:2: rule__Message__Group_1__2__Impl
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
    // InternalSequence.g:2035:1: rule__Message__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Message__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2039:1: ( ( ']' ) )
            // InternalSequence.g:2040:1: ( ']' )
            {
            // InternalSequence.g:2040:1: ( ']' )
            // InternalSequence.g:2041:2: ']'
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
    // InternalSequence.g:2051:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2055:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // InternalSequence.g:2056:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
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
    // InternalSequence.g:2063:1: rule__TimeConstraint__Group__0__Impl : ( 'time[' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2067:1: ( ( 'time[' ) )
            // InternalSequence.g:2068:1: ( 'time[' )
            {
            // InternalSequence.g:2068:1: ( 'time[' )
            // InternalSequence.g:2069:2: 'time['
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
    // InternalSequence.g:2078:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2082:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // InternalSequence.g:2083:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
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
    // InternalSequence.g:2090:1: rule__TimeConstraint__Group__1__Impl : ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2094:1: ( ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) ) )
            // InternalSequence.g:2095:1: ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) )
            {
            // InternalSequence.g:2095:1: ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) )
            // InternalSequence.g:2096:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* )
            {
            // InternalSequence.g:2096:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) )
            // InternalSequence.g:2097:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 
            // InternalSequence.g:2098:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )
            // InternalSequence.g:2098:4: rule__TimeConstraint__ConstraintsAssignment_1
            {
            pushFollow(FOLLOW_23);
            rule__TimeConstraint__ConstraintsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 

            }

            // InternalSequence.g:2101:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* )
            // InternalSequence.g:2102:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 
            // InternalSequence.g:2103:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=16 && LA21_0<=19)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSequence.g:2103:4: rule__TimeConstraint__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__TimeConstraint__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalSequence.g:2112:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2116:1: ( rule__TimeConstraint__Group__2__Impl )
            // InternalSequence.g:2117:2: rule__TimeConstraint__Group__2__Impl
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
    // InternalSequence.g:2123:1: rule__TimeConstraint__Group__2__Impl : ( ']' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2127:1: ( ( ']' ) )
            // InternalSequence.g:2128:1: ( ']' )
            {
            // InternalSequence.g:2128:1: ( ']' )
            // InternalSequence.g:2129:2: ']'
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
    // InternalSequence.g:2139:1: rule__InnerTimeConstraint__Group__0 : rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1 ;
    public final void rule__InnerTimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2143:1: ( rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1 )
            // InternalSequence.g:2144:2: rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1
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
    // InternalSequence.g:2151:1: rule__InnerTimeConstraint__Group__0__Impl : ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) ) ;
    public final void rule__InnerTimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2155:1: ( ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) ) )
            // InternalSequence.g:2156:1: ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) )
            {
            // InternalSequence.g:2156:1: ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) )
            // InternalSequence.g:2157:2: ( rule__InnerTimeConstraint__TypeAssignment_0 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getTypeAssignment_0()); 
            // InternalSequence.g:2158:2: ( rule__InnerTimeConstraint__TypeAssignment_0 )
            // InternalSequence.g:2158:3: rule__InnerTimeConstraint__TypeAssignment_0
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
    // InternalSequence.g:2166:1: rule__InnerTimeConstraint__Group__1 : rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2 ;
    public final void rule__InnerTimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2170:1: ( rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2 )
            // InternalSequence.g:2171:2: rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2
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
    // InternalSequence.g:2178:1: rule__InnerTimeConstraint__Group__1__Impl : ( '=' ) ;
    public final void rule__InnerTimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2182:1: ( ( '=' ) )
            // InternalSequence.g:2183:1: ( '=' )
            {
            // InternalSequence.g:2183:1: ( '=' )
            // InternalSequence.g:2184:2: '='
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
    // InternalSequence.g:2193:1: rule__InnerTimeConstraint__Group__2 : rule__InnerTimeConstraint__Group__2__Impl ;
    public final void rule__InnerTimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2197:1: ( rule__InnerTimeConstraint__Group__2__Impl )
            // InternalSequence.g:2198:2: rule__InnerTimeConstraint__Group__2__Impl
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
    // InternalSequence.g:2204:1: rule__InnerTimeConstraint__Group__2__Impl : ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) ) ;
    public final void rule__InnerTimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2208:1: ( ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) ) )
            // InternalSequence.g:2209:1: ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) )
            {
            // InternalSequence.g:2209:1: ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) )
            // InternalSequence.g:2210:2: ( rule__InnerTimeConstraint__ValueAssignment_2 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getValueAssignment_2()); 
            // InternalSequence.g:2211:2: ( rule__InnerTimeConstraint__ValueAssignment_2 )
            // InternalSequence.g:2211:3: rule__InnerTimeConstraint__ValueAssignment_2
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
    // InternalSequence.g:2220:1: rule__StandardMessage__Group__0 : rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 ;
    public final void rule__StandardMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2224:1: ( rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 )
            // InternalSequence.g:2225:2: rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSequence.g:2232:1: rule__StandardMessage__Group__0__Impl : ( ( rule__StandardMessage__TypeAssignment_0 ) ) ;
    public final void rule__StandardMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2236:1: ( ( ( rule__StandardMessage__TypeAssignment_0 ) ) )
            // InternalSequence.g:2237:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            {
            // InternalSequence.g:2237:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            // InternalSequence.g:2238:2: ( rule__StandardMessage__TypeAssignment_0 )
            {
             before(grammarAccess.getStandardMessageAccess().getTypeAssignment_0()); 
            // InternalSequence.g:2239:2: ( rule__StandardMessage__TypeAssignment_0 )
            // InternalSequence.g:2239:3: rule__StandardMessage__TypeAssignment_0
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
    // InternalSequence.g:2247:1: rule__StandardMessage__Group__1 : rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 ;
    public final void rule__StandardMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2251:1: ( rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 )
            // InternalSequence.g:2252:2: rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:2259:1: rule__StandardMessage__Group__1__Impl : ( ( rule__StandardMessage__NameAssignment_1 ) ) ;
    public final void rule__StandardMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2263:1: ( ( ( rule__StandardMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:2264:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:2264:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            // InternalSequence.g:2265:2: ( rule__StandardMessage__NameAssignment_1 )
            {
             before(grammarAccess.getStandardMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:2266:2: ( rule__StandardMessage__NameAssignment_1 )
            // InternalSequence.g:2266:3: rule__StandardMessage__NameAssignment_1
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
    // InternalSequence.g:2274:1: rule__StandardMessage__Group__2 : rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 ;
    public final void rule__StandardMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2278:1: ( rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 )
            // InternalSequence.g:2279:2: rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:2286:1: rule__StandardMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__StandardMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2290:1: ( ( '(' ) )
            // InternalSequence.g:2291:1: ( '(' )
            {
            // InternalSequence.g:2291:1: ( '(' )
            // InternalSequence.g:2292:2: '('
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
    // InternalSequence.g:2301:1: rule__StandardMessage__Group__3 : rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 ;
    public final void rule__StandardMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2305:1: ( rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 )
            // InternalSequence.g:2306:2: rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSequence.g:2313:1: rule__StandardMessage__Group__3__Impl : ( ( rule__StandardMessage__LeftAssignment_3 ) ) ;
    public final void rule__StandardMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2317:1: ( ( ( rule__StandardMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:2318:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:2318:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            // InternalSequence.g:2319:2: ( rule__StandardMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:2320:2: ( rule__StandardMessage__LeftAssignment_3 )
            // InternalSequence.g:2320:3: rule__StandardMessage__LeftAssignment_3
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
    // InternalSequence.g:2328:1: rule__StandardMessage__Group__4 : rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 ;
    public final void rule__StandardMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2332:1: ( rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 )
            // InternalSequence.g:2333:2: rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:2340:1: rule__StandardMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__StandardMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2344:1: ( ( ',' ) )
            // InternalSequence.g:2345:1: ( ',' )
            {
            // InternalSequence.g:2345:1: ( ',' )
            // InternalSequence.g:2346:2: ','
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
    // InternalSequence.g:2355:1: rule__StandardMessage__Group__5 : rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 ;
    public final void rule__StandardMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2359:1: ( rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 )
            // InternalSequence.g:2360:2: rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:2367:1: rule__StandardMessage__Group__5__Impl : ( ( rule__StandardMessage__RightAssignment_5 ) ) ;
    public final void rule__StandardMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2371:1: ( ( ( rule__StandardMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:2372:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:2372:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            // InternalSequence.g:2373:2: ( rule__StandardMessage__RightAssignment_5 )
            {
             before(grammarAccess.getStandardMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:2374:2: ( rule__StandardMessage__RightAssignment_5 )
            // InternalSequence.g:2374:3: rule__StandardMessage__RightAssignment_5
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
    // InternalSequence.g:2382:1: rule__StandardMessage__Group__6 : rule__StandardMessage__Group__6__Impl ;
    public final void rule__StandardMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2386:1: ( rule__StandardMessage__Group__6__Impl )
            // InternalSequence.g:2387:2: rule__StandardMessage__Group__6__Impl
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
    // InternalSequence.g:2393:1: rule__StandardMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__StandardMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2397:1: ( ( ')' ) )
            // InternalSequence.g:2398:1: ( ')' )
            {
            // InternalSequence.g:2398:1: ( ')' )
            // InternalSequence.g:2399:2: ')'
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
    // InternalSequence.g:2409:1: rule__ResponseMessage__Group__0 : rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 ;
    public final void rule__ResponseMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2413:1: ( rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 )
            // InternalSequence.g:2414:2: rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSequence.g:2421:1: rule__ResponseMessage__Group__0__Impl : ( 'resp' ) ;
    public final void rule__ResponseMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2425:1: ( ( 'resp' ) )
            // InternalSequence.g:2426:1: ( 'resp' )
            {
            // InternalSequence.g:2426:1: ( 'resp' )
            // InternalSequence.g:2427:2: 'resp'
            {
             before(grammarAccess.getResponseMessageAccess().getRespKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getResponseMessageAccess().getRespKeyword_0()); 

            }


            }

        }
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
    // InternalSequence.g:2436:1: rule__ResponseMessage__Group__1 : rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 ;
    public final void rule__ResponseMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2440:1: ( rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 )
            // InternalSequence.g:2441:2: rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:2448:1: rule__ResponseMessage__Group__1__Impl : ( ( rule__ResponseMessage__NameAssignment_1 ) ) ;
    public final void rule__ResponseMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2452:1: ( ( ( rule__ResponseMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:2453:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:2453:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            // InternalSequence.g:2454:2: ( rule__ResponseMessage__NameAssignment_1 )
            {
             before(grammarAccess.getResponseMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:2455:2: ( rule__ResponseMessage__NameAssignment_1 )
            // InternalSequence.g:2455:3: rule__ResponseMessage__NameAssignment_1
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
    // InternalSequence.g:2463:1: rule__ResponseMessage__Group__2 : rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 ;
    public final void rule__ResponseMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2467:1: ( rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 )
            // InternalSequence.g:2468:2: rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalSequence.g:2475:1: rule__ResponseMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__ResponseMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2479:1: ( ( '(' ) )
            // InternalSequence.g:2480:1: ( '(' )
            {
            // InternalSequence.g:2480:1: ( '(' )
            // InternalSequence.g:2481:2: '('
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
    // InternalSequence.g:2490:1: rule__ResponseMessage__Group__3 : rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 ;
    public final void rule__ResponseMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2494:1: ( rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 )
            // InternalSequence.g:2495:2: rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSequence.g:2502:1: rule__ResponseMessage__Group__3__Impl : ( ( rule__ResponseMessage__Alternatives_3 ) ) ;
    public final void rule__ResponseMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2506:1: ( ( ( rule__ResponseMessage__Alternatives_3 ) ) )
            // InternalSequence.g:2507:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            {
            // InternalSequence.g:2507:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            // InternalSequence.g:2508:2: ( rule__ResponseMessage__Alternatives_3 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_3()); 
            // InternalSequence.g:2509:2: ( rule__ResponseMessage__Alternatives_3 )
            // InternalSequence.g:2509:3: rule__ResponseMessage__Alternatives_3
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
    // InternalSequence.g:2517:1: rule__ResponseMessage__Group__4 : rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 ;
    public final void rule__ResponseMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2521:1: ( rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 )
            // InternalSequence.g:2522:2: rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalSequence.g:2529:1: rule__ResponseMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__ResponseMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2533:1: ( ( ',' ) )
            // InternalSequence.g:2534:1: ( ',' )
            {
            // InternalSequence.g:2534:1: ( ',' )
            // InternalSequence.g:2535:2: ','
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
    // InternalSequence.g:2544:1: rule__ResponseMessage__Group__5 : rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 ;
    public final void rule__ResponseMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2548:1: ( rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 )
            // InternalSequence.g:2549:2: rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:2556:1: rule__ResponseMessage__Group__5__Impl : ( ( rule__ResponseMessage__Alternatives_5 ) ) ;
    public final void rule__ResponseMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2560:1: ( ( ( rule__ResponseMessage__Alternatives_5 ) ) )
            // InternalSequence.g:2561:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            {
            // InternalSequence.g:2561:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            // InternalSequence.g:2562:2: ( rule__ResponseMessage__Alternatives_5 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_5()); 
            // InternalSequence.g:2563:2: ( rule__ResponseMessage__Alternatives_5 )
            // InternalSequence.g:2563:3: rule__ResponseMessage__Alternatives_5
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
    // InternalSequence.g:2571:1: rule__ResponseMessage__Group__6 : rule__ResponseMessage__Group__6__Impl ;
    public final void rule__ResponseMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2575:1: ( rule__ResponseMessage__Group__6__Impl )
            // InternalSequence.g:2576:2: rule__ResponseMessage__Group__6__Impl
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
    // InternalSequence.g:2582:1: rule__ResponseMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__ResponseMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2586:1: ( ( ')' ) )
            // InternalSequence.g:2587:1: ( ')' )
            {
            // InternalSequence.g:2587:1: ( ')' )
            // InternalSequence.g:2588:2: ')'
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
    // InternalSequence.g:2598:1: rule__FoundMessage__Group__0 : rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 ;
    public final void rule__FoundMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2602:1: ( rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 )
            // InternalSequence.g:2603:2: rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSequence.g:2610:1: rule__FoundMessage__Group__0__Impl : ( ( 'found' )? ) ;
    public final void rule__FoundMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2614:1: ( ( ( 'found' )? ) )
            // InternalSequence.g:2615:1: ( ( 'found' )? )
            {
            // InternalSequence.g:2615:1: ( ( 'found' )? )
            // InternalSequence.g:2616:2: ( 'found' )?
            {
             before(grammarAccess.getFoundMessageAccess().getFoundKeyword_0()); 
            // InternalSequence.g:2617:2: ( 'found' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSequence.g:2617:3: 'found'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalSequence.g:2625:1: rule__FoundMessage__Group__1 : rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 ;
    public final void rule__FoundMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2629:1: ( rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 )
            // InternalSequence.g:2630:2: rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSequence.g:2637:1: rule__FoundMessage__Group__1__Impl : ( ( rule__FoundMessage__TypeAssignment_1 ) ) ;
    public final void rule__FoundMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2641:1: ( ( ( rule__FoundMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:2642:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:2642:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            // InternalSequence.g:2643:2: ( rule__FoundMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getFoundMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:2644:2: ( rule__FoundMessage__TypeAssignment_1 )
            // InternalSequence.g:2644:3: rule__FoundMessage__TypeAssignment_1
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
    // InternalSequence.g:2652:1: rule__FoundMessage__Group__2 : rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 ;
    public final void rule__FoundMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2656:1: ( rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 )
            // InternalSequence.g:2657:2: rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:2664:1: rule__FoundMessage__Group__2__Impl : ( ( rule__FoundMessage__NameAssignment_2 ) ) ;
    public final void rule__FoundMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2668:1: ( ( ( rule__FoundMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:2669:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:2669:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            // InternalSequence.g:2670:2: ( rule__FoundMessage__NameAssignment_2 )
            {
             before(grammarAccess.getFoundMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:2671:2: ( rule__FoundMessage__NameAssignment_2 )
            // InternalSequence.g:2671:3: rule__FoundMessage__NameAssignment_2
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
    // InternalSequence.g:2679:1: rule__FoundMessage__Group__3 : rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 ;
    public final void rule__FoundMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2683:1: ( rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 )
            // InternalSequence.g:2684:2: rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalSequence.g:2691:1: rule__FoundMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__FoundMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2695:1: ( ( '(' ) )
            // InternalSequence.g:2696:1: ( '(' )
            {
            // InternalSequence.g:2696:1: ( '(' )
            // InternalSequence.g:2697:2: '('
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
    // InternalSequence.g:2706:1: rule__FoundMessage__Group__4 : rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 ;
    public final void rule__FoundMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2710:1: ( rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 )
            // InternalSequence.g:2711:2: rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalSequence.g:2718:1: rule__FoundMessage__Group__4__Impl : ( '_' ) ;
    public final void rule__FoundMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2722:1: ( ( '_' ) )
            // InternalSequence.g:2723:1: ( '_' )
            {
            // InternalSequence.g:2723:1: ( '_' )
            // InternalSequence.g:2724:2: '_'
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
    // InternalSequence.g:2733:1: rule__FoundMessage__Group__5 : rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 ;
    public final void rule__FoundMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2737:1: ( rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 )
            // InternalSequence.g:2738:2: rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:2745:1: rule__FoundMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__FoundMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2749:1: ( ( ',' ) )
            // InternalSequence.g:2750:1: ( ',' )
            {
            // InternalSequence.g:2750:1: ( ',' )
            // InternalSequence.g:2751:2: ','
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
    // InternalSequence.g:2760:1: rule__FoundMessage__Group__6 : rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 ;
    public final void rule__FoundMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2764:1: ( rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 )
            // InternalSequence.g:2765:2: rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:2772:1: rule__FoundMessage__Group__6__Impl : ( ( rule__FoundMessage__RightAssignment_6 ) ) ;
    public final void rule__FoundMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2776:1: ( ( ( rule__FoundMessage__RightAssignment_6 ) ) )
            // InternalSequence.g:2777:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            {
            // InternalSequence.g:2777:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            // InternalSequence.g:2778:2: ( rule__FoundMessage__RightAssignment_6 )
            {
             before(grammarAccess.getFoundMessageAccess().getRightAssignment_6()); 
            // InternalSequence.g:2779:2: ( rule__FoundMessage__RightAssignment_6 )
            // InternalSequence.g:2779:3: rule__FoundMessage__RightAssignment_6
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
    // InternalSequence.g:2787:1: rule__FoundMessage__Group__7 : rule__FoundMessage__Group__7__Impl ;
    public final void rule__FoundMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2791:1: ( rule__FoundMessage__Group__7__Impl )
            // InternalSequence.g:2792:2: rule__FoundMessage__Group__7__Impl
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
    // InternalSequence.g:2798:1: rule__FoundMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__FoundMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2802:1: ( ( ')' ) )
            // InternalSequence.g:2803:1: ( ')' )
            {
            // InternalSequence.g:2803:1: ( ')' )
            // InternalSequence.g:2804:2: ')'
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
    // InternalSequence.g:2814:1: rule__LostMessage__Group__0 : rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 ;
    public final void rule__LostMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2818:1: ( rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 )
            // InternalSequence.g:2819:2: rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSequence.g:2826:1: rule__LostMessage__Group__0__Impl : ( ( 'lost' )? ) ;
    public final void rule__LostMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2830:1: ( ( ( 'lost' )? ) )
            // InternalSequence.g:2831:1: ( ( 'lost' )? )
            {
            // InternalSequence.g:2831:1: ( ( 'lost' )? )
            // InternalSequence.g:2832:2: ( 'lost' )?
            {
             before(grammarAccess.getLostMessageAccess().getLostKeyword_0()); 
            // InternalSequence.g:2833:2: ( 'lost' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSequence.g:2833:3: 'lost'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalSequence.g:2841:1: rule__LostMessage__Group__1 : rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 ;
    public final void rule__LostMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2845:1: ( rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 )
            // InternalSequence.g:2846:2: rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSequence.g:2853:1: rule__LostMessage__Group__1__Impl : ( ( rule__LostMessage__TypeAssignment_1 ) ) ;
    public final void rule__LostMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2857:1: ( ( ( rule__LostMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:2858:1: ( ( rule__LostMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:2858:1: ( ( rule__LostMessage__TypeAssignment_1 ) )
            // InternalSequence.g:2859:2: ( rule__LostMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getLostMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:2860:2: ( rule__LostMessage__TypeAssignment_1 )
            // InternalSequence.g:2860:3: rule__LostMessage__TypeAssignment_1
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
    // InternalSequence.g:2868:1: rule__LostMessage__Group__2 : rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 ;
    public final void rule__LostMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2872:1: ( rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 )
            // InternalSequence.g:2873:2: rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:2880:1: rule__LostMessage__Group__2__Impl : ( ( rule__LostMessage__NameAssignment_2 ) ) ;
    public final void rule__LostMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2884:1: ( ( ( rule__LostMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:2885:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:2885:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            // InternalSequence.g:2886:2: ( rule__LostMessage__NameAssignment_2 )
            {
             before(grammarAccess.getLostMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:2887:2: ( rule__LostMessage__NameAssignment_2 )
            // InternalSequence.g:2887:3: rule__LostMessage__NameAssignment_2
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
    // InternalSequence.g:2895:1: rule__LostMessage__Group__3 : rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 ;
    public final void rule__LostMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2899:1: ( rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 )
            // InternalSequence.g:2900:2: rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:2907:1: rule__LostMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__LostMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2911:1: ( ( '(' ) )
            // InternalSequence.g:2912:1: ( '(' )
            {
            // InternalSequence.g:2912:1: ( '(' )
            // InternalSequence.g:2913:2: '('
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
    // InternalSequence.g:2922:1: rule__LostMessage__Group__4 : rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 ;
    public final void rule__LostMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2926:1: ( rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 )
            // InternalSequence.g:2927:2: rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalSequence.g:2934:1: rule__LostMessage__Group__4__Impl : ( ( rule__LostMessage__LeftAssignment_4 ) ) ;
    public final void rule__LostMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2938:1: ( ( ( rule__LostMessage__LeftAssignment_4 ) ) )
            // InternalSequence.g:2939:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            {
            // InternalSequence.g:2939:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            // InternalSequence.g:2940:2: ( rule__LostMessage__LeftAssignment_4 )
            {
             before(grammarAccess.getLostMessageAccess().getLeftAssignment_4()); 
            // InternalSequence.g:2941:2: ( rule__LostMessage__LeftAssignment_4 )
            // InternalSequence.g:2941:3: rule__LostMessage__LeftAssignment_4
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
    // InternalSequence.g:2949:1: rule__LostMessage__Group__5 : rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 ;
    public final void rule__LostMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2953:1: ( rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 )
            // InternalSequence.g:2954:2: rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalSequence.g:2961:1: rule__LostMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__LostMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2965:1: ( ( ',' ) )
            // InternalSequence.g:2966:1: ( ',' )
            {
            // InternalSequence.g:2966:1: ( ',' )
            // InternalSequence.g:2967:2: ','
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
    // InternalSequence.g:2976:1: rule__LostMessage__Group__6 : rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 ;
    public final void rule__LostMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2980:1: ( rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 )
            // InternalSequence.g:2981:2: rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:2988:1: rule__LostMessage__Group__6__Impl : ( '_' ) ;
    public final void rule__LostMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2992:1: ( ( '_' ) )
            // InternalSequence.g:2993:1: ( '_' )
            {
            // InternalSequence.g:2993:1: ( '_' )
            // InternalSequence.g:2994:2: '_'
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
    // InternalSequence.g:3003:1: rule__LostMessage__Group__7 : rule__LostMessage__Group__7__Impl ;
    public final void rule__LostMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3007:1: ( rule__LostMessage__Group__7__Impl )
            // InternalSequence.g:3008:2: rule__LostMessage__Group__7__Impl
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
    // InternalSequence.g:3014:1: rule__LostMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__LostMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3018:1: ( ( ')' ) )
            // InternalSequence.g:3019:1: ( ')' )
            {
            // InternalSequence.g:3019:1: ( ')' )
            // InternalSequence.g:3020:2: ')'
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
    // InternalSequence.g:3030:1: rule__CreateMessage__Group__0 : rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 ;
    public final void rule__CreateMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3034:1: ( rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 )
            // InternalSequence.g:3035:2: rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1
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
    // InternalSequence.g:3042:1: rule__CreateMessage__Group__0__Impl : ( 'create' ) ;
    public final void rule__CreateMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3046:1: ( ( 'create' ) )
            // InternalSequence.g:3047:1: ( 'create' )
            {
            // InternalSequence.g:3047:1: ( 'create' )
            // InternalSequence.g:3048:2: 'create'
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
    // InternalSequence.g:3057:1: rule__CreateMessage__Group__1 : rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 ;
    public final void rule__CreateMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3061:1: ( rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 )
            // InternalSequence.g:3062:2: rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2
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
    // InternalSequence.g:3069:1: rule__CreateMessage__Group__1__Impl : ( ( rule__CreateMessage__NameAssignment_1 )? ) ;
    public final void rule__CreateMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3073:1: ( ( ( rule__CreateMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:3074:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:3074:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            // InternalSequence.g:3075:2: ( rule__CreateMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getCreateMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3076:2: ( rule__CreateMessage__NameAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSequence.g:3076:3: rule__CreateMessage__NameAssignment_1
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
    // InternalSequence.g:3084:1: rule__CreateMessage__Group__2 : rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 ;
    public final void rule__CreateMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3088:1: ( rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 )
            // InternalSequence.g:3089:2: rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:3096:1: rule__CreateMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__CreateMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3100:1: ( ( '(' ) )
            // InternalSequence.g:3101:1: ( '(' )
            {
            // InternalSequence.g:3101:1: ( '(' )
            // InternalSequence.g:3102:2: '('
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
    // InternalSequence.g:3111:1: rule__CreateMessage__Group__3 : rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 ;
    public final void rule__CreateMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3115:1: ( rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 )
            // InternalSequence.g:3116:2: rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSequence.g:3123:1: rule__CreateMessage__Group__3__Impl : ( ( rule__CreateMessage__LeftAssignment_3 ) ) ;
    public final void rule__CreateMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3127:1: ( ( ( rule__CreateMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:3128:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:3128:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            // InternalSequence.g:3129:2: ( rule__CreateMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:3130:2: ( rule__CreateMessage__LeftAssignment_3 )
            // InternalSequence.g:3130:3: rule__CreateMessage__LeftAssignment_3
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
    // InternalSequence.g:3138:1: rule__CreateMessage__Group__4 : rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 ;
    public final void rule__CreateMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3142:1: ( rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 )
            // InternalSequence.g:3143:2: rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:3150:1: rule__CreateMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__CreateMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3154:1: ( ( ',' ) )
            // InternalSequence.g:3155:1: ( ',' )
            {
            // InternalSequence.g:3155:1: ( ',' )
            // InternalSequence.g:3156:2: ','
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
    // InternalSequence.g:3165:1: rule__CreateMessage__Group__5 : rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 ;
    public final void rule__CreateMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3169:1: ( rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 )
            // InternalSequence.g:3170:2: rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:3177:1: rule__CreateMessage__Group__5__Impl : ( ( rule__CreateMessage__RightAssignment_5 ) ) ;
    public final void rule__CreateMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3181:1: ( ( ( rule__CreateMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:3182:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:3182:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            // InternalSequence.g:3183:2: ( rule__CreateMessage__RightAssignment_5 )
            {
             before(grammarAccess.getCreateMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:3184:2: ( rule__CreateMessage__RightAssignment_5 )
            // InternalSequence.g:3184:3: rule__CreateMessage__RightAssignment_5
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
    // InternalSequence.g:3192:1: rule__CreateMessage__Group__6 : rule__CreateMessage__Group__6__Impl ;
    public final void rule__CreateMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3196:1: ( rule__CreateMessage__Group__6__Impl )
            // InternalSequence.g:3197:2: rule__CreateMessage__Group__6__Impl
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
    // InternalSequence.g:3203:1: rule__CreateMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__CreateMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3207:1: ( ( ')' ) )
            // InternalSequence.g:3208:1: ( ')' )
            {
            // InternalSequence.g:3208:1: ( ')' )
            // InternalSequence.g:3209:2: ')'
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
    // InternalSequence.g:3219:1: rule__DestructionMessage__Group__0 : rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 ;
    public final void rule__DestructionMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3223:1: ( rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 )
            // InternalSequence.g:3224:2: rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1
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
    // InternalSequence.g:3231:1: rule__DestructionMessage__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3235:1: ( ( 'dest' ) )
            // InternalSequence.g:3236:1: ( 'dest' )
            {
            // InternalSequence.g:3236:1: ( 'dest' )
            // InternalSequence.g:3237:2: 'dest'
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
    // InternalSequence.g:3246:1: rule__DestructionMessage__Group__1 : rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 ;
    public final void rule__DestructionMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3250:1: ( rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 )
            // InternalSequence.g:3251:2: rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2
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
    // InternalSequence.g:3258:1: rule__DestructionMessage__Group__1__Impl : ( ( rule__DestructionMessage__NameAssignment_1 )? ) ;
    public final void rule__DestructionMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3262:1: ( ( ( rule__DestructionMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:3263:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:3263:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            // InternalSequence.g:3264:2: ( rule__DestructionMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getDestructionMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3265:2: ( rule__DestructionMessage__NameAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSequence.g:3265:3: rule__DestructionMessage__NameAssignment_1
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
    // InternalSequence.g:3273:1: rule__DestructionMessage__Group__2 : rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 ;
    public final void rule__DestructionMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3277:1: ( rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 )
            // InternalSequence.g:3278:2: rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:3285:1: rule__DestructionMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__DestructionMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3289:1: ( ( '(' ) )
            // InternalSequence.g:3290:1: ( '(' )
            {
            // InternalSequence.g:3290:1: ( '(' )
            // InternalSequence.g:3291:2: '('
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
    // InternalSequence.g:3300:1: rule__DestructionMessage__Group__3 : rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 ;
    public final void rule__DestructionMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3304:1: ( rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 )
            // InternalSequence.g:3305:2: rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSequence.g:3312:1: rule__DestructionMessage__Group__3__Impl : ( ( rule__DestructionMessage__LeftAssignment_3 ) ) ;
    public final void rule__DestructionMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3316:1: ( ( ( rule__DestructionMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:3317:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:3317:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            // InternalSequence.g:3318:2: ( rule__DestructionMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:3319:2: ( rule__DestructionMessage__LeftAssignment_3 )
            // InternalSequence.g:3319:3: rule__DestructionMessage__LeftAssignment_3
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
    // InternalSequence.g:3327:1: rule__DestructionMessage__Group__4 : rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 ;
    public final void rule__DestructionMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3331:1: ( rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 )
            // InternalSequence.g:3332:2: rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:3339:1: rule__DestructionMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__DestructionMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3343:1: ( ( ',' ) )
            // InternalSequence.g:3344:1: ( ',' )
            {
            // InternalSequence.g:3344:1: ( ',' )
            // InternalSequence.g:3345:2: ','
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
    // InternalSequence.g:3354:1: rule__DestructionMessage__Group__5 : rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 ;
    public final void rule__DestructionMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3358:1: ( rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 )
            // InternalSequence.g:3359:2: rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:3366:1: rule__DestructionMessage__Group__5__Impl : ( ( rule__DestructionMessage__RightAssignment_5 ) ) ;
    public final void rule__DestructionMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3370:1: ( ( ( rule__DestructionMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:3371:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:3371:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            // InternalSequence.g:3372:2: ( rule__DestructionMessage__RightAssignment_5 )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:3373:2: ( rule__DestructionMessage__RightAssignment_5 )
            // InternalSequence.g:3373:3: rule__DestructionMessage__RightAssignment_5
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
    // InternalSequence.g:3381:1: rule__DestructionMessage__Group__6 : rule__DestructionMessage__Group__6__Impl ;
    public final void rule__DestructionMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3385:1: ( rule__DestructionMessage__Group__6__Impl )
            // InternalSequence.g:3386:2: rule__DestructionMessage__Group__6__Impl
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
    // InternalSequence.g:3392:1: rule__DestructionMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__DestructionMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3396:1: ( ( ')' ) )
            // InternalSequence.g:3397:1: ( ')' )
            {
            // InternalSequence.g:3397:1: ( ')' )
            // InternalSequence.g:3398:2: ')'
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
    // InternalSequence.g:3408:1: rule__DestructionOccurenceSpecification__Group__0 : rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 ;
    public final void rule__DestructionOccurenceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3412:1: ( rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 )
            // InternalSequence.g:3413:2: rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:3420:1: rule__DestructionOccurenceSpecification__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionOccurenceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3424:1: ( ( 'dest' ) )
            // InternalSequence.g:3425:1: ( 'dest' )
            {
            // InternalSequence.g:3425:1: ( 'dest' )
            // InternalSequence.g:3426:2: 'dest'
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
    // InternalSequence.g:3435:1: rule__DestructionOccurenceSpecification__Group__1 : rule__DestructionOccurenceSpecification__Group__1__Impl ;
    public final void rule__DestructionOccurenceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3439:1: ( rule__DestructionOccurenceSpecification__Group__1__Impl )
            // InternalSequence.g:3440:2: rule__DestructionOccurenceSpecification__Group__1__Impl
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
    // InternalSequence.g:3446:1: rule__DestructionOccurenceSpecification__Group__1__Impl : ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) ) ;
    public final void rule__DestructionOccurenceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3450:1: ( ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) ) )
            // InternalSequence.g:3451:1: ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) )
            {
            // InternalSequence.g:3451:1: ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) )
            // InternalSequence.g:3452:2: ( rule__DestructionOccurenceSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getNameAssignment_1()); 
            // InternalSequence.g:3453:2: ( rule__DestructionOccurenceSpecification__NameAssignment_1 )
            // InternalSequence.g:3453:3: rule__DestructionOccurenceSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DestructionOccurenceSpecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDestructionOccurenceSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalSequence.g:3462:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3466:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // InternalSequence.g:3467:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
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
    // InternalSequence.g:3474:1: rule__Alternative__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3478:1: ( ( 'alt' ) )
            // InternalSequence.g:3479:1: ( 'alt' )
            {
            // InternalSequence.g:3479:1: ( 'alt' )
            // InternalSequence.g:3480:2: 'alt'
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
    // InternalSequence.g:3489:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3493:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // InternalSequence.g:3494:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
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
    // InternalSequence.g:3501:1: rule__Alternative__Group__1__Impl : ( '{' ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3505:1: ( ( '{' ) )
            // InternalSequence.g:3506:1: ( '{' )
            {
            // InternalSequence.g:3506:1: ( '{' )
            // InternalSequence.g:3507:2: '{'
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
    // InternalSequence.g:3516:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3520:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // InternalSequence.g:3521:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
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
    // InternalSequence.g:3528:1: rule__Alternative__Group__2__Impl : ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3532:1: ( ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) ) )
            // InternalSequence.g:3533:1: ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) )
            {
            // InternalSequence.g:3533:1: ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) )
            // InternalSequence.g:3534:2: ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* )
            {
            // InternalSequence.g:3534:2: ( ( rule__Alternative__AlternativesAssignment_2 ) )
            // InternalSequence.g:3535:3: ( rule__Alternative__AlternativesAssignment_2 )
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 
            // InternalSequence.g:3536:3: ( rule__Alternative__AlternativesAssignment_2 )
            // InternalSequence.g:3536:4: rule__Alternative__AlternativesAssignment_2
            {
            pushFollow(FOLLOW_35);
            rule__Alternative__AlternativesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 

            }

            // InternalSequence.g:3539:2: ( ( rule__Alternative__AlternativesAssignment_2 )* )
            // InternalSequence.g:3540:3: ( rule__Alternative__AlternativesAssignment_2 )*
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 
            // InternalSequence.g:3541:3: ( rule__Alternative__AlternativesAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==46) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSequence.g:3541:4: rule__Alternative__AlternativesAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Alternative__AlternativesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalSequence.g:3550:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3554:1: ( rule__Alternative__Group__3__Impl )
            // InternalSequence.g:3555:2: rule__Alternative__Group__3__Impl
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
    // InternalSequence.g:3561:1: rule__Alternative__Group__3__Impl : ( '}' ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3565:1: ( ( '}' ) )
            // InternalSequence.g:3566:1: ( '}' )
            {
            // InternalSequence.g:3566:1: ( '}' )
            // InternalSequence.g:3567:2: '}'
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
    // InternalSequence.g:3577:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3581:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalSequence.g:3582:2: rule__Option__Group__0__Impl rule__Option__Group__1
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
    // InternalSequence.g:3589:1: rule__Option__Group__0__Impl : ( 'opt' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3593:1: ( ( 'opt' ) )
            // InternalSequence.g:3594:1: ( 'opt' )
            {
            // InternalSequence.g:3594:1: ( 'opt' )
            // InternalSequence.g:3595:2: 'opt'
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
    // InternalSequence.g:3604:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3608:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // InternalSequence.g:3609:2: rule__Option__Group__1__Impl rule__Option__Group__2
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
    // InternalSequence.g:3616:1: rule__Option__Group__1__Impl : ( '{' ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3620:1: ( ( '{' ) )
            // InternalSequence.g:3621:1: ( '{' )
            {
            // InternalSequence.g:3621:1: ( '{' )
            // InternalSequence.g:3622:2: '{'
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
    // InternalSequence.g:3631:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3635:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // InternalSequence.g:3636:2: rule__Option__Group__2__Impl rule__Option__Group__3
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
    // InternalSequence.g:3643:1: rule__Option__Group__2__Impl : ( ( rule__Option__OptionalAssignment_2 ) ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3647:1: ( ( ( rule__Option__OptionalAssignment_2 ) ) )
            // InternalSequence.g:3648:1: ( ( rule__Option__OptionalAssignment_2 ) )
            {
            // InternalSequence.g:3648:1: ( ( rule__Option__OptionalAssignment_2 ) )
            // InternalSequence.g:3649:2: ( rule__Option__OptionalAssignment_2 )
            {
             before(grammarAccess.getOptionAccess().getOptionalAssignment_2()); 
            // InternalSequence.g:3650:2: ( rule__Option__OptionalAssignment_2 )
            // InternalSequence.g:3650:3: rule__Option__OptionalAssignment_2
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
    // InternalSequence.g:3658:1: rule__Option__Group__3 : rule__Option__Group__3__Impl ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3662:1: ( rule__Option__Group__3__Impl )
            // InternalSequence.g:3663:2: rule__Option__Group__3__Impl
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
    // InternalSequence.g:3669:1: rule__Option__Group__3__Impl : ( '}' ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3673:1: ( ( '}' ) )
            // InternalSequence.g:3674:1: ( '}' )
            {
            // InternalSequence.g:3674:1: ( '}' )
            // InternalSequence.g:3675:2: '}'
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
    // InternalSequence.g:3685:1: rule__Parallel__Group__0 : rule__Parallel__Group__0__Impl rule__Parallel__Group__1 ;
    public final void rule__Parallel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3689:1: ( rule__Parallel__Group__0__Impl rule__Parallel__Group__1 )
            // InternalSequence.g:3690:2: rule__Parallel__Group__0__Impl rule__Parallel__Group__1
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
    // InternalSequence.g:3697:1: rule__Parallel__Group__0__Impl : ( 'par' ) ;
    public final void rule__Parallel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3701:1: ( ( 'par' ) )
            // InternalSequence.g:3702:1: ( 'par' )
            {
            // InternalSequence.g:3702:1: ( 'par' )
            // InternalSequence.g:3703:2: 'par'
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
    // InternalSequence.g:3712:1: rule__Parallel__Group__1 : rule__Parallel__Group__1__Impl rule__Parallel__Group__2 ;
    public final void rule__Parallel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3716:1: ( rule__Parallel__Group__1__Impl rule__Parallel__Group__2 )
            // InternalSequence.g:3717:2: rule__Parallel__Group__1__Impl rule__Parallel__Group__2
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
    // InternalSequence.g:3724:1: rule__Parallel__Group__1__Impl : ( '{' ) ;
    public final void rule__Parallel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3728:1: ( ( '{' ) )
            // InternalSequence.g:3729:1: ( '{' )
            {
            // InternalSequence.g:3729:1: ( '{' )
            // InternalSequence.g:3730:2: '{'
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
    // InternalSequence.g:3739:1: rule__Parallel__Group__2 : rule__Parallel__Group__2__Impl rule__Parallel__Group__3 ;
    public final void rule__Parallel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3743:1: ( rule__Parallel__Group__2__Impl rule__Parallel__Group__3 )
            // InternalSequence.g:3744:2: rule__Parallel__Group__2__Impl rule__Parallel__Group__3
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
    // InternalSequence.g:3751:1: rule__Parallel__Group__2__Impl : ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) ) ;
    public final void rule__Parallel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3755:1: ( ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) ) )
            // InternalSequence.g:3756:1: ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) )
            {
            // InternalSequence.g:3756:1: ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) )
            // InternalSequence.g:3757:2: ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* )
            {
            // InternalSequence.g:3757:2: ( ( rule__Parallel__ParallelsAssignment_2 ) )
            // InternalSequence.g:3758:3: ( rule__Parallel__ParallelsAssignment_2 )
            {
             before(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 
            // InternalSequence.g:3759:3: ( rule__Parallel__ParallelsAssignment_2 )
            // InternalSequence.g:3759:4: rule__Parallel__ParallelsAssignment_2
            {
            pushFollow(FOLLOW_37);
            rule__Parallel__ParallelsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 

            }

            // InternalSequence.g:3762:2: ( ( rule__Parallel__ParallelsAssignment_2 )* )
            // InternalSequence.g:3763:3: ( rule__Parallel__ParallelsAssignment_2 )*
            {
             before(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 
            // InternalSequence.g:3764:3: ( rule__Parallel__ParallelsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=12 && LA27_0<=13)||LA27_0==28||(LA27_0>=36 && LA27_0<=45)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSequence.g:3764:4: rule__Parallel__ParallelsAssignment_2
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Parallel__ParallelsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalSequence.g:3773:1: rule__Parallel__Group__3 : rule__Parallel__Group__3__Impl ;
    public final void rule__Parallel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3777:1: ( rule__Parallel__Group__3__Impl )
            // InternalSequence.g:3778:2: rule__Parallel__Group__3__Impl
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
    // InternalSequence.g:3784:1: rule__Parallel__Group__3__Impl : ( '}' ) ;
    public final void rule__Parallel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3788:1: ( ( '}' ) )
            // InternalSequence.g:3789:1: ( '}' )
            {
            // InternalSequence.g:3789:1: ( '}' )
            // InternalSequence.g:3790:2: '}'
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
    // InternalSequence.g:3800:1: rule__Critical__Group__0 : rule__Critical__Group__0__Impl rule__Critical__Group__1 ;
    public final void rule__Critical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3804:1: ( rule__Critical__Group__0__Impl rule__Critical__Group__1 )
            // InternalSequence.g:3805:2: rule__Critical__Group__0__Impl rule__Critical__Group__1
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
    // InternalSequence.g:3812:1: rule__Critical__Group__0__Impl : ( 'critical' ) ;
    public final void rule__Critical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3816:1: ( ( 'critical' ) )
            // InternalSequence.g:3817:1: ( 'critical' )
            {
            // InternalSequence.g:3817:1: ( 'critical' )
            // InternalSequence.g:3818:2: 'critical'
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
    // InternalSequence.g:3827:1: rule__Critical__Group__1 : rule__Critical__Group__1__Impl rule__Critical__Group__2 ;
    public final void rule__Critical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3831:1: ( rule__Critical__Group__1__Impl rule__Critical__Group__2 )
            // InternalSequence.g:3832:2: rule__Critical__Group__1__Impl rule__Critical__Group__2
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
    // InternalSequence.g:3839:1: rule__Critical__Group__1__Impl : ( '{' ) ;
    public final void rule__Critical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3843:1: ( ( '{' ) )
            // InternalSequence.g:3844:1: ( '{' )
            {
            // InternalSequence.g:3844:1: ( '{' )
            // InternalSequence.g:3845:2: '{'
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
    // InternalSequence.g:3854:1: rule__Critical__Group__2 : rule__Critical__Group__2__Impl rule__Critical__Group__3 ;
    public final void rule__Critical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3858:1: ( rule__Critical__Group__2__Impl rule__Critical__Group__3 )
            // InternalSequence.g:3859:2: rule__Critical__Group__2__Impl rule__Critical__Group__3
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
    // InternalSequence.g:3866:1: rule__Critical__Group__2__Impl : ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) ) ;
    public final void rule__Critical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3870:1: ( ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) ) )
            // InternalSequence.g:3871:1: ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) )
            {
            // InternalSequence.g:3871:1: ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) )
            // InternalSequence.g:3872:2: ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* )
            {
            // InternalSequence.g:3872:2: ( ( rule__Critical__FragmentsAssignment_2 ) )
            // InternalSequence.g:3873:3: ( rule__Critical__FragmentsAssignment_2 )
            {
             before(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:3874:3: ( rule__Critical__FragmentsAssignment_2 )
            // InternalSequence.g:3874:4: rule__Critical__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_10);
            rule__Critical__FragmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 

            }

            // InternalSequence.g:3877:2: ( ( rule__Critical__FragmentsAssignment_2 )* )
            // InternalSequence.g:3878:3: ( rule__Critical__FragmentsAssignment_2 )*
            {
             before(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:3879:3: ( rule__Critical__FragmentsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=12 && LA28_0<=13)||(LA28_0>=36 && LA28_0<=45)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSequence.g:3879:4: rule__Critical__FragmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Critical__FragmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalSequence.g:3888:1: rule__Critical__Group__3 : rule__Critical__Group__3__Impl ;
    public final void rule__Critical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3892:1: ( rule__Critical__Group__3__Impl )
            // InternalSequence.g:3893:2: rule__Critical__Group__3__Impl
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
    // InternalSequence.g:3899:1: rule__Critical__Group__3__Impl : ( '}' ) ;
    public final void rule__Critical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3903:1: ( ( '}' ) )
            // InternalSequence.g:3904:1: ( '}' )
            {
            // InternalSequence.g:3904:1: ( '}' )
            // InternalSequence.g:3905:2: '}'
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
    // InternalSequence.g:3915:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3919:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalSequence.g:3920:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
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
    // InternalSequence.g:3927:1: rule__Loop__Group__0__Impl : ( 'loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3931:1: ( ( 'loop' ) )
            // InternalSequence.g:3932:1: ( 'loop' )
            {
            // InternalSequence.g:3932:1: ( 'loop' )
            // InternalSequence.g:3933:2: 'loop'
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
    // InternalSequence.g:3942:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3946:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalSequence.g:3947:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
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
    // InternalSequence.g:3954:1: rule__Loop__Group__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3958:1: ( ( '[' ) )
            // InternalSequence.g:3959:1: ( '[' )
            {
            // InternalSequence.g:3959:1: ( '[' )
            // InternalSequence.g:3960:2: '['
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
    // InternalSequence.g:3969:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3973:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalSequence.g:3974:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
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
    // InternalSequence.g:3981:1: rule__Loop__Group__2__Impl : ( ( rule__Loop__ConditionAssignment_2 ) ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3985:1: ( ( ( rule__Loop__ConditionAssignment_2 ) ) )
            // InternalSequence.g:3986:1: ( ( rule__Loop__ConditionAssignment_2 ) )
            {
            // InternalSequence.g:3986:1: ( ( rule__Loop__ConditionAssignment_2 ) )
            // InternalSequence.g:3987:2: ( rule__Loop__ConditionAssignment_2 )
            {
             before(grammarAccess.getLoopAccess().getConditionAssignment_2()); 
            // InternalSequence.g:3988:2: ( rule__Loop__ConditionAssignment_2 )
            // InternalSequence.g:3988:3: rule__Loop__ConditionAssignment_2
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
    // InternalSequence.g:3996:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4000:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalSequence.g:4001:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
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
    // InternalSequence.g:4008:1: rule__Loop__Group__3__Impl : ( ']' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4012:1: ( ( ']' ) )
            // InternalSequence.g:4013:1: ( ']' )
            {
            // InternalSequence.g:4013:1: ( ']' )
            // InternalSequence.g:4014:2: ']'
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
    // InternalSequence.g:4023:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4027:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalSequence.g:4028:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
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
    // InternalSequence.g:4035:1: rule__Loop__Group__4__Impl : ( '{' ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4039:1: ( ( '{' ) )
            // InternalSequence.g:4040:1: ( '{' )
            {
            // InternalSequence.g:4040:1: ( '{' )
            // InternalSequence.g:4041:2: '{'
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
    // InternalSequence.g:4050:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4054:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalSequence.g:4055:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
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
    // InternalSequence.g:4062:1: rule__Loop__Group__5__Impl : ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4066:1: ( ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) ) )
            // InternalSequence.g:4067:1: ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) )
            {
            // InternalSequence.g:4067:1: ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) )
            // InternalSequence.g:4068:2: ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* )
            {
            // InternalSequence.g:4068:2: ( ( rule__Loop__FragmentsAssignment_5 ) )
            // InternalSequence.g:4069:3: ( rule__Loop__FragmentsAssignment_5 )
            {
             before(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 
            // InternalSequence.g:4070:3: ( rule__Loop__FragmentsAssignment_5 )
            // InternalSequence.g:4070:4: rule__Loop__FragmentsAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Loop__FragmentsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 

            }

            // InternalSequence.g:4073:2: ( ( rule__Loop__FragmentsAssignment_5 )* )
            // InternalSequence.g:4074:3: ( rule__Loop__FragmentsAssignment_5 )*
            {
             before(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 
            // InternalSequence.g:4075:3: ( rule__Loop__FragmentsAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=12 && LA29_0<=13)||(LA29_0>=36 && LA29_0<=45)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSequence.g:4075:4: rule__Loop__FragmentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Loop__FragmentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSequence.g:4084:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4088:1: ( rule__Loop__Group__6__Impl )
            // InternalSequence.g:4089:2: rule__Loop__Group__6__Impl
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
    // InternalSequence.g:4095:1: rule__Loop__Group__6__Impl : ( '}' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4099:1: ( ( '}' ) )
            // InternalSequence.g:4100:1: ( '}' )
            {
            // InternalSequence.g:4100:1: ( '}' )
            // InternalSequence.g:4101:2: '}'
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
    // InternalSequence.g:4111:1: rule__BehaviorFragmentsWithCondition__Group__0 : rule__BehaviorFragmentsWithCondition__Group__0__Impl rule__BehaviorFragmentsWithCondition__Group__1 ;
    public final void rule__BehaviorFragmentsWithCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4115:1: ( rule__BehaviorFragmentsWithCondition__Group__0__Impl rule__BehaviorFragmentsWithCondition__Group__1 )
            // InternalSequence.g:4116:2: rule__BehaviorFragmentsWithCondition__Group__0__Impl rule__BehaviorFragmentsWithCondition__Group__1
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
    // InternalSequence.g:4123:1: rule__BehaviorFragmentsWithCondition__Group__0__Impl : ( '[' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4127:1: ( ( '[' ) )
            // InternalSequence.g:4128:1: ( '[' )
            {
            // InternalSequence.g:4128:1: ( '[' )
            // InternalSequence.g:4129:2: '['
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
    // InternalSequence.g:4138:1: rule__BehaviorFragmentsWithCondition__Group__1 : rule__BehaviorFragmentsWithCondition__Group__1__Impl rule__BehaviorFragmentsWithCondition__Group__2 ;
    public final void rule__BehaviorFragmentsWithCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4142:1: ( rule__BehaviorFragmentsWithCondition__Group__1__Impl rule__BehaviorFragmentsWithCondition__Group__2 )
            // InternalSequence.g:4143:2: rule__BehaviorFragmentsWithCondition__Group__1__Impl rule__BehaviorFragmentsWithCondition__Group__2
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
    // InternalSequence.g:4150:1: rule__BehaviorFragmentsWithCondition__Group__1__Impl : ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4154:1: ( ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) ) )
            // InternalSequence.g:4155:1: ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) )
            {
            // InternalSequence.g:4155:1: ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) )
            // InternalSequence.g:4156:2: ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getConditionAssignment_1()); 
            // InternalSequence.g:4157:2: ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 )
            // InternalSequence.g:4157:3: rule__BehaviorFragmentsWithCondition__ConditionAssignment_1
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
    // InternalSequence.g:4165:1: rule__BehaviorFragmentsWithCondition__Group__2 : rule__BehaviorFragmentsWithCondition__Group__2__Impl rule__BehaviorFragmentsWithCondition__Group__3 ;
    public final void rule__BehaviorFragmentsWithCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4169:1: ( rule__BehaviorFragmentsWithCondition__Group__2__Impl rule__BehaviorFragmentsWithCondition__Group__3 )
            // InternalSequence.g:4170:2: rule__BehaviorFragmentsWithCondition__Group__2__Impl rule__BehaviorFragmentsWithCondition__Group__3
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
    // InternalSequence.g:4177:1: rule__BehaviorFragmentsWithCondition__Group__2__Impl : ( ']' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4181:1: ( ( ']' ) )
            // InternalSequence.g:4182:1: ( ']' )
            {
            // InternalSequence.g:4182:1: ( ']' )
            // InternalSequence.g:4183:2: ']'
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
    // InternalSequence.g:4192:1: rule__BehaviorFragmentsWithCondition__Group__3 : rule__BehaviorFragmentsWithCondition__Group__3__Impl ;
    public final void rule__BehaviorFragmentsWithCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4196:1: ( rule__BehaviorFragmentsWithCondition__Group__3__Impl )
            // InternalSequence.g:4197:2: rule__BehaviorFragmentsWithCondition__Group__3__Impl
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
    // InternalSequence.g:4203:1: rule__BehaviorFragmentsWithCondition__Group__3__Impl : ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4207:1: ( ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) ) )
            // InternalSequence.g:4208:1: ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) )
            {
            // InternalSequence.g:4208:1: ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) )
            // InternalSequence.g:4209:2: ( rule__BehaviorFragmentsWithCondition__Alternatives_3 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getAlternatives_3()); 
            // InternalSequence.g:4210:2: ( rule__BehaviorFragmentsWithCondition__Alternatives_3 )
            // InternalSequence.g:4210:3: rule__BehaviorFragmentsWithCondition__Alternatives_3
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
    // InternalSequence.g:4219:1: rule__BehaviorFragmentsWithCondition__Group_3_0__0 : rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__1 ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4223:1: ( rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__1 )
            // InternalSequence.g:4224:2: rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__1
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
    // InternalSequence.g:4231:1: rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl : ( '{' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4235:1: ( ( '{' ) )
            // InternalSequence.g:4236:1: ( '{' )
            {
            // InternalSequence.g:4236:1: ( '{' )
            // InternalSequence.g:4237:2: '{'
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
    // InternalSequence.g:4246:1: rule__BehaviorFragmentsWithCondition__Group_3_0__1 : rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__2 ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4250:1: ( rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__2 )
            // InternalSequence.g:4251:2: rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__2
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
    // InternalSequence.g:4258:1: rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl : ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4262:1: ( ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) ) )
            // InternalSequence.g:4263:1: ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) )
            {
            // InternalSequence.g:4263:1: ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) )
            // InternalSequence.g:4264:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* )
            {
            // InternalSequence.g:4264:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) )
            // InternalSequence.g:4265:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_0_1()); 
            // InternalSequence.g:4266:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )
            // InternalSequence.g:4266:4: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1
            {
            pushFollow(FOLLOW_10);
            rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_0_1()); 

            }

            // InternalSequence.g:4269:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* )
            // InternalSequence.g:4270:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )*
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_0_1()); 
            // InternalSequence.g:4271:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=12 && LA30_0<=13)||(LA30_0>=36 && LA30_0<=45)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSequence.g:4271:4: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSequence.g:4280:1: rule__BehaviorFragmentsWithCondition__Group_3_0__2 : rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4284:1: ( rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl )
            // InternalSequence.g:4285:2: rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl
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
    // InternalSequence.g:4291:1: rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl : ( '}' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4295:1: ( ( '}' ) )
            // InternalSequence.g:4296:1: ( '}' )
            {
            // InternalSequence.g:4296:1: ( '}' )
            // InternalSequence.g:4297:2: '}'
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
    // InternalSequence.g:4307:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4311:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSequence.g:4312:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalSequence.g:4319:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4323:1: ( ( RULE_ID ) )
            // InternalSequence.g:4324:1: ( RULE_ID )
            {
            // InternalSequence.g:4324:1: ( RULE_ID )
            // InternalSequence.g:4325:2: RULE_ID
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
    // InternalSequence.g:4334:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4338:1: ( rule__FQN__Group__1__Impl )
            // InternalSequence.g:4339:2: rule__FQN__Group__1__Impl
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
    // InternalSequence.g:4345:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4349:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSequence.g:4350:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSequence.g:4350:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSequence.g:4351:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSequence.g:4352:2: ( rule__FQN__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSequence.g:4352:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalSequence.g:4361:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4365:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSequence.g:4366:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalSequence.g:4373:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4377:1: ( ( '.' ) )
            // InternalSequence.g:4378:1: ( '.' )
            {
            // InternalSequence.g:4378:1: ( '.' )
            // InternalSequence.g:4379:2: '.'
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
    // InternalSequence.g:4388:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4392:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSequence.g:4393:2: rule__FQN__Group_1__1__Impl
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
    // InternalSequence.g:4399:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4403:1: ( ( RULE_ID ) )
            // InternalSequence.g:4404:1: ( RULE_ID )
            {
            // InternalSequence.g:4404:1: ( RULE_ID )
            // InternalSequence.g:4405:2: RULE_ID
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
    // InternalSequence.g:4415:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4419:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalSequence.g:4420:2: rule__Order__Group__0__Impl rule__Order__Group__1
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
    // InternalSequence.g:4427:1: rule__Order__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4431:1: ( ( RULE_INT ) )
            // InternalSequence.g:4432:1: ( RULE_INT )
            {
            // InternalSequence.g:4432:1: ( RULE_INT )
            // InternalSequence.g:4433:2: RULE_INT
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
    // InternalSequence.g:4442:1: rule__Order__Group__1 : rule__Order__Group__1__Impl ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4446:1: ( rule__Order__Group__1__Impl )
            // InternalSequence.g:4447:2: rule__Order__Group__1__Impl
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
    // InternalSequence.g:4453:1: rule__Order__Group__1__Impl : ( ( rule__Order__Group_1__0 )* ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4457:1: ( ( ( rule__Order__Group_1__0 )* ) )
            // InternalSequence.g:4458:1: ( ( rule__Order__Group_1__0 )* )
            {
            // InternalSequence.g:4458:1: ( ( rule__Order__Group_1__0 )* )
            // InternalSequence.g:4459:2: ( rule__Order__Group_1__0 )*
            {
             before(grammarAccess.getOrderAccess().getGroup_1()); 
            // InternalSequence.g:4460:2: ( rule__Order__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSequence.g:4460:3: rule__Order__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Order__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalSequence.g:4469:1: rule__Order__Group_1__0 : rule__Order__Group_1__0__Impl rule__Order__Group_1__1 ;
    public final void rule__Order__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4473:1: ( rule__Order__Group_1__0__Impl rule__Order__Group_1__1 )
            // InternalSequence.g:4474:2: rule__Order__Group_1__0__Impl rule__Order__Group_1__1
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
    // InternalSequence.g:4481:1: rule__Order__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Order__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4485:1: ( ( '.' ) )
            // InternalSequence.g:4486:1: ( '.' )
            {
            // InternalSequence.g:4486:1: ( '.' )
            // InternalSequence.g:4487:2: '.'
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
    // InternalSequence.g:4496:1: rule__Order__Group_1__1 : rule__Order__Group_1__1__Impl ;
    public final void rule__Order__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4500:1: ( rule__Order__Group_1__1__Impl )
            // InternalSequence.g:4501:2: rule__Order__Group_1__1__Impl
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
    // InternalSequence.g:4507:1: rule__Order__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Order__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4511:1: ( ( RULE_INT ) )
            // InternalSequence.g:4512:1: ( RULE_INT )
            {
            // InternalSequence.g:4512:1: ( RULE_INT )
            // InternalSequence.g:4513:2: RULE_INT
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
    // InternalSequence.g:4523:1: rule__SequenceDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SequenceDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4527:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4528:2: ( RULE_STRING )
            {
            // InternalSequence.g:4528:2: ( RULE_STRING )
            // InternalSequence.g:4529:3: RULE_STRING
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
    // InternalSequence.g:4538:1: rule__SequenceDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__SequenceDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4542:1: ( ( ruleRootPackage ) )
            // InternalSequence.g:4543:2: ( ruleRootPackage )
            {
            // InternalSequence.g:4543:2: ( ruleRootPackage )
            // InternalSequence.g:4544:3: ruleRootPackage
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


    // $ANTLR start "rule__RootPackage__NameAssignment_1"
    // InternalSequence.g:4553:1: rule__RootPackage__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4557:1: ( ( ruleFQN ) )
            // InternalSequence.g:4558:2: ( ruleFQN )
            {
            // InternalSequence.g:4558:2: ( ruleFQN )
            // InternalSequence.g:4559:3: ruleFQN
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


    // $ANTLR start "rule__RootPackage__ActorsAssignment_2"
    // InternalSequence.g:4568:1: rule__RootPackage__ActorsAssignment_2 : ( ruleActor ) ;
    public final void rule__RootPackage__ActorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4572:1: ( ( ruleActor ) )
            // InternalSequence.g:4573:2: ( ruleActor )
            {
            // InternalSequence.g:4573:2: ( ruleActor )
            // InternalSequence.g:4574:3: ruleActor
            {
             before(grammarAccess.getRootPackageAccess().getActorsActorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getActorsActorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__ActorsAssignment_2"


    // $ANTLR start "rule__RootPackage__BehaviorFragmentsAssignment_3"
    // InternalSequence.g:4583:1: rule__RootPackage__BehaviorFragmentsAssignment_3 : ( ruleBehaviorFragment ) ;
    public final void rule__RootPackage__BehaviorFragmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4587:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:4588:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:4588:2: ( ruleBehaviorFragment )
            // InternalSequence.g:4589:3: ruleBehaviorFragment
            {
             before(grammarAccess.getRootPackageAccess().getBehaviorFragmentsBehaviorFragmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorFragment();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getBehaviorFragmentsBehaviorFragmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__BehaviorFragmentsAssignment_3"


    // $ANTLR start "rule__Actor__DeferredAssignment_1"
    // InternalSequence.g:4598:1: rule__Actor__DeferredAssignment_1 : ( ( 'deferred' ) ) ;
    public final void rule__Actor__DeferredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4602:1: ( ( ( 'deferred' ) ) )
            // InternalSequence.g:4603:2: ( ( 'deferred' ) )
            {
            // InternalSequence.g:4603:2: ( ( 'deferred' ) )
            // InternalSequence.g:4604:3: ( 'deferred' )
            {
             before(grammarAccess.getActorAccess().getDeferredDeferredKeyword_1_0()); 
            // InternalSequence.g:4605:3: ( 'deferred' )
            // InternalSequence.g:4606:4: 'deferred'
            {
             before(grammarAccess.getActorAccess().getDeferredDeferredKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getDeferredDeferredKeyword_1_0()); 

            }

             after(grammarAccess.getActorAccess().getDeferredDeferredKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__DeferredAssignment_1"


    // $ANTLR start "rule__Actor__NameAssignment_2_0_0"
    // InternalSequence.g:4617:1: rule__Actor__NameAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4621:1: ( ( RULE_ID ) )
            // InternalSequence.g:4622:2: ( RULE_ID )
            {
            // InternalSequence.g:4622:2: ( RULE_ID )
            // InternalSequence.g:4623:3: RULE_ID
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
    // InternalSequence.g:4632:1: rule__Actor__TypeMappingAssignment_2_0_1 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4636:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:4637:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:4637:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:4638:3: ruleActorClassifierMapping
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
    // InternalSequence.g:4647:1: rule__Actor__TypeMappingAssignment_2_1_0 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4651:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:4652:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:4652:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:4653:3: ruleActorClassifierMapping
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
    // InternalSequence.g:4662:1: rule__Actor__AliasAssignment_2_1_2 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4666:1: ( ( RULE_ID ) )
            // InternalSequence.g:4667:2: ( RULE_ID )
            {
            // InternalSequence.g:4667:2: ( RULE_ID )
            // InternalSequence.g:4668:3: RULE_ID
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
    // InternalSequence.g:4677:1: rule__Actor__NameAssignment_2_2_0 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4681:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4682:2: ( RULE_STRING )
            {
            // InternalSequence.g:4682:2: ( RULE_STRING )
            // InternalSequence.g:4683:3: RULE_STRING
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
    // InternalSequence.g:4692:1: rule__Actor__TypeMappingAssignment_2_2_1 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4696:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:4697:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:4697:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:4698:3: ruleActorClassifierMapping
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
    // InternalSequence.g:4707:1: rule__Actor__AliasAssignment_2_2_3 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4711:1: ( ( RULE_ID ) )
            // InternalSequence.g:4712:2: ( RULE_ID )
            {
            // InternalSequence.g:4712:2: ( RULE_ID )
            // InternalSequence.g:4713:3: RULE_ID
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
    // InternalSequence.g:4722:1: rule__Actor__ActorTypeAssignment_3_1 : ( ruleActorType ) ;
    public final void rule__Actor__ActorTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4726:1: ( ( ruleActorType ) )
            // InternalSequence.g:4727:2: ( ruleActorType )
            {
            // InternalSequence.g:4727:2: ( ruleActorType )
            // InternalSequence.g:4728:3: ruleActorType
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
    // InternalSequence.g:4737:1: rule__ActorClassifierMapping__ClassifierAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ActorClassifierMapping__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4741:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4742:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4742:2: ( ( ruleFQN ) )
            // InternalSequence.g:4743:3: ( ruleFQN )
            {
             before(grammarAccess.getActorClassifierMappingAccess().getClassifierClassifierCrossReference_1_0()); 
            // InternalSequence.g:4744:3: ( ruleFQN )
            // InternalSequence.g:4745:4: ruleFQN
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
    // InternalSequence.g:4756:1: rule__BehaviorFragments__FragmentsAssignment_0_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragments__FragmentsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4760:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:4761:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:4761:2: ( ruleBehaviorFragment )
            // InternalSequence.g:4762:3: ruleBehaviorFragment
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
    // InternalSequence.g:4771:1: rule__BehaviorFragments__FragmentsAssignment_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragments__FragmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4775:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:4776:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:4776:2: ( ruleBehaviorFragment )
            // InternalSequence.g:4777:3: ruleBehaviorFragment
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
    // InternalSequence.g:4786:1: rule__Message__OrderAssignment_1_1 : ( ruleOrder ) ;
    public final void rule__Message__OrderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4790:1: ( ( ruleOrder ) )
            // InternalSequence.g:4791:2: ( ruleOrder )
            {
            // InternalSequence.g:4791:2: ( ruleOrder )
            // InternalSequence.g:4792:3: ruleOrder
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
    // InternalSequence.g:4801:1: rule__Message__TimeConstraintAssignment_2 : ( ruleTimeConstraint ) ;
    public final void rule__Message__TimeConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4805:1: ( ( ruleTimeConstraint ) )
            // InternalSequence.g:4806:2: ( ruleTimeConstraint )
            {
            // InternalSequence.g:4806:2: ( ruleTimeConstraint )
            // InternalSequence.g:4807:3: ruleTimeConstraint
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
    // InternalSequence.g:4816:1: rule__TimeConstraint__ConstraintsAssignment_1 : ( ruleInnerTimeConstraint ) ;
    public final void rule__TimeConstraint__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4820:1: ( ( ruleInnerTimeConstraint ) )
            // InternalSequence.g:4821:2: ( ruleInnerTimeConstraint )
            {
            // InternalSequence.g:4821:2: ( ruleInnerTimeConstraint )
            // InternalSequence.g:4822:3: ruleInnerTimeConstraint
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
    // InternalSequence.g:4831:1: rule__InnerTimeConstraint__TypeAssignment_0 : ( ruleTimeConstraintType ) ;
    public final void rule__InnerTimeConstraint__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4835:1: ( ( ruleTimeConstraintType ) )
            // InternalSequence.g:4836:2: ( ruleTimeConstraintType )
            {
            // InternalSequence.g:4836:2: ( ruleTimeConstraintType )
            // InternalSequence.g:4837:3: ruleTimeConstraintType
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
    // InternalSequence.g:4846:1: rule__InnerTimeConstraint__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__InnerTimeConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4850:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4851:2: ( RULE_STRING )
            {
            // InternalSequence.g:4851:2: ( RULE_STRING )
            // InternalSequence.g:4852:3: RULE_STRING
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
    // InternalSequence.g:4861:1: rule__StandardMessage__TypeAssignment_0 : ( ruleMessageType ) ;
    public final void rule__StandardMessage__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4865:1: ( ( ruleMessageType ) )
            // InternalSequence.g:4866:2: ( ruleMessageType )
            {
            // InternalSequence.g:4866:2: ( ruleMessageType )
            // InternalSequence.g:4867:3: ruleMessageType
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
    // InternalSequence.g:4876:1: rule__StandardMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StandardMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4880:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4881:2: ( RULE_STRING )
            {
            // InternalSequence.g:4881:2: ( RULE_STRING )
            // InternalSequence.g:4882:3: RULE_STRING
            {
             before(grammarAccess.getStandardMessageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStandardMessageAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalSequence.g:4891:1: rule__StandardMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4895:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4896:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4896:2: ( ( ruleFQN ) )
            // InternalSequence.g:4897:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:4898:3: ( ruleFQN )
            // InternalSequence.g:4899:4: ruleFQN
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
    // InternalSequence.g:4910:1: rule__StandardMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4914:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4915:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4915:2: ( ( ruleFQN ) )
            // InternalSequence.g:4916:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:4917:3: ( ruleFQN )
            // InternalSequence.g:4918:4: ruleFQN
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
    // InternalSequence.g:4929:1: rule__ResponseMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ResponseMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4933:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4934:2: ( RULE_STRING )
            {
            // InternalSequence.g:4934:2: ( RULE_STRING )
            // InternalSequence.g:4935:3: RULE_STRING
            {
             before(grammarAccess.getResponseMessageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResponseMessageAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalSequence.g:4944:1: rule__ResponseMessage__LeftAssignment_3_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__LeftAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4948:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4949:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4949:2: ( ( ruleFQN ) )
            // InternalSequence.g:4950:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getLeftActorCrossReference_3_0_0()); 
            // InternalSequence.g:4951:3: ( ruleFQN )
            // InternalSequence.g:4952:4: ruleFQN
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
    // InternalSequence.g:4963:1: rule__ResponseMessage__RightAssignment_5_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__RightAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4967:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4968:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4968:2: ( ( ruleFQN ) )
            // InternalSequence.g:4969:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getRightActorCrossReference_5_0_0()); 
            // InternalSequence.g:4970:3: ( ruleFQN )
            // InternalSequence.g:4971:4: ruleFQN
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
    // InternalSequence.g:4982:1: rule__FoundMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__FoundMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4986:1: ( ( ruleMessageType ) )
            // InternalSequence.g:4987:2: ( ruleMessageType )
            {
            // InternalSequence.g:4987:2: ( ruleMessageType )
            // InternalSequence.g:4988:3: ruleMessageType
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
    // InternalSequence.g:4997:1: rule__FoundMessage__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FoundMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5001:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5002:2: ( RULE_STRING )
            {
            // InternalSequence.g:5002:2: ( RULE_STRING )
            // InternalSequence.g:5003:3: RULE_STRING
            {
             before(grammarAccess.getFoundMessageAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFoundMessageAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalSequence.g:5012:1: rule__FoundMessage__RightAssignment_6 : ( ( ruleFQN ) ) ;
    public final void rule__FoundMessage__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5016:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5017:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5017:2: ( ( ruleFQN ) )
            // InternalSequence.g:5018:3: ( ruleFQN )
            {
             before(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0()); 
            // InternalSequence.g:5019:3: ( ruleFQN )
            // InternalSequence.g:5020:4: ruleFQN
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
    // InternalSequence.g:5031:1: rule__LostMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__LostMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5035:1: ( ( ruleMessageType ) )
            // InternalSequence.g:5036:2: ( ruleMessageType )
            {
            // InternalSequence.g:5036:2: ( ruleMessageType )
            // InternalSequence.g:5037:3: ruleMessageType
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
    // InternalSequence.g:5046:1: rule__LostMessage__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LostMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5050:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5051:2: ( RULE_STRING )
            {
            // InternalSequence.g:5051:2: ( RULE_STRING )
            // InternalSequence.g:5052:3: RULE_STRING
            {
             before(grammarAccess.getLostMessageAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLostMessageAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalSequence.g:5061:1: rule__LostMessage__LeftAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__LostMessage__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5065:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5066:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5066:2: ( ( ruleFQN ) )
            // InternalSequence.g:5067:3: ( ruleFQN )
            {
             before(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0()); 
            // InternalSequence.g:5068:3: ( ruleFQN )
            // InternalSequence.g:5069:4: ruleFQN
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
    // InternalSequence.g:5080:1: rule__CreateMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CreateMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5084:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5085:2: ( RULE_STRING )
            {
            // InternalSequence.g:5085:2: ( RULE_STRING )
            // InternalSequence.g:5086:3: RULE_STRING
            {
             before(grammarAccess.getCreateMessageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalSequence.g:5095:1: rule__CreateMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5099:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5100:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5100:2: ( ( ruleFQN ) )
            // InternalSequence.g:5101:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:5102:3: ( ruleFQN )
            // InternalSequence.g:5103:4: ruleFQN
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
    // InternalSequence.g:5114:1: rule__CreateMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5118:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5119:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5119:2: ( ( ruleFQN ) )
            // InternalSequence.g:5120:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:5121:3: ( ruleFQN )
            // InternalSequence.g:5122:4: ruleFQN
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
    // InternalSequence.g:5133:1: rule__DestructionMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DestructionMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5137:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5138:2: ( RULE_STRING )
            {
            // InternalSequence.g:5138:2: ( RULE_STRING )
            // InternalSequence.g:5139:3: RULE_STRING
            {
             before(grammarAccess.getDestructionMessageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDestructionMessageAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalSequence.g:5148:1: rule__DestructionMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5152:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5153:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5153:2: ( ( ruleFQN ) )
            // InternalSequence.g:5154:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:5155:3: ( ruleFQN )
            // InternalSequence.g:5156:4: ruleFQN
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
    // InternalSequence.g:5167:1: rule__DestructionMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5171:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5172:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5172:2: ( ( ruleFQN ) )
            // InternalSequence.g:5173:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:5174:3: ( ruleFQN )
            // InternalSequence.g:5175:4: ruleFQN
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


    // $ANTLR start "rule__DestructionOccurenceSpecification__NameAssignment_1"
    // InternalSequence.g:5186:1: rule__DestructionOccurenceSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DestructionOccurenceSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5190:1: ( ( RULE_ID ) )
            // InternalSequence.g:5191:2: ( RULE_ID )
            {
            // InternalSequence.g:5191:2: ( RULE_ID )
            // InternalSequence.g:5192:3: RULE_ID
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestructionOccurenceSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionOccurenceSpecification__NameAssignment_1"


    // $ANTLR start "rule__Alternative__AlternativesAssignment_2"
    // InternalSequence.g:5201:1: rule__Alternative__AlternativesAssignment_2 : ( ruleBehaviorFragmentsWithCondition ) ;
    public final void rule__Alternative__AlternativesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5205:1: ( ( ruleBehaviorFragmentsWithCondition ) )
            // InternalSequence.g:5206:2: ( ruleBehaviorFragmentsWithCondition )
            {
            // InternalSequence.g:5206:2: ( ruleBehaviorFragmentsWithCondition )
            // InternalSequence.g:5207:3: ruleBehaviorFragmentsWithCondition
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
    // InternalSequence.g:5216:1: rule__Option__OptionalAssignment_2 : ( ruleBehaviorFragmentsWithCondition ) ;
    public final void rule__Option__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5220:1: ( ( ruleBehaviorFragmentsWithCondition ) )
            // InternalSequence.g:5221:2: ( ruleBehaviorFragmentsWithCondition )
            {
            // InternalSequence.g:5221:2: ( ruleBehaviorFragmentsWithCondition )
            // InternalSequence.g:5222:3: ruleBehaviorFragmentsWithCondition
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
    // InternalSequence.g:5231:1: rule__Parallel__ParallelsAssignment_2 : ( ruleBehaviorFragments ) ;
    public final void rule__Parallel__ParallelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5235:1: ( ( ruleBehaviorFragments ) )
            // InternalSequence.g:5236:2: ( ruleBehaviorFragments )
            {
            // InternalSequence.g:5236:2: ( ruleBehaviorFragments )
            // InternalSequence.g:5237:3: ruleBehaviorFragments
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
    // InternalSequence.g:5246:1: rule__Critical__FragmentsAssignment_2 : ( ruleBehaviorFragment ) ;
    public final void rule__Critical__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5250:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5251:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5251:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5252:3: ruleBehaviorFragment
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
    // InternalSequence.g:5261:1: rule__Loop__ConditionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Loop__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5265:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5266:2: ( RULE_STRING )
            {
            // InternalSequence.g:5266:2: ( RULE_STRING )
            // InternalSequence.g:5267:3: RULE_STRING
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
    // InternalSequence.g:5276:1: rule__Loop__FragmentsAssignment_5 : ( ruleBehaviorFragment ) ;
    public final void rule__Loop__FragmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5280:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5281:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5281:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5282:3: ruleBehaviorFragment
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
    // InternalSequence.g:5291:1: rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BehaviorFragmentsWithCondition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5295:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5296:2: ( RULE_STRING )
            {
            // InternalSequence.g:5296:2: ( RULE_STRING )
            // InternalSequence.g:5297:3: RULE_STRING
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
    // InternalSequence.g:5306:1: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5310:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5311:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5311:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5312:3: ruleBehaviorFragment
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
    // InternalSequence.g:5321:1: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5325:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5326:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5326:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5327:3: ruleBehaviorFragment
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\14\2\4\5\uffff\1\41\1\5\1\42\2\5\1\42\1\uffff";
    static final String dfa_3s = "\1\50\2\4\5\uffff\1\41\1\13\1\57\1\5\1\13\1\57\1\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\3\1\4\1\5\1\6\6\uffff\1\1";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\26\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\10",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\11",
            "\1\12\5\uffff\1\4",
            "\1\14\14\uffff\1\13",
            "\1\15",
            "\1\16\5\uffff\1\5",
            "\1\14\14\uffff\1\13",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "850:1: rule__Message__Alternatives_0 : ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00003FF000803000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00003FF000003002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000008000030L});
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
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000003000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000003000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00003FF010003000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00003FF010003002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000002L});

}