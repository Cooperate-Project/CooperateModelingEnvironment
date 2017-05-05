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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'sync'", "'async'", "'human'", "'machine'", "'d'", "'t'", "'max'", "'diff'", "'@start-seqd'", "'@end-seqd'", "'rootElement'", "'act'", "':'", "'as'", "'role['", "']'", "'{'", "'}'", "'num['", "'time['", "'='", "'('", "','", "')'", "'resp'", "'found'", "'lost'", "'create'", "'dest'", "'alt'", "'opt'", "'par'", "'critical'", "'loop'", "'['", "'.'", "'deferred'"
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


    // $ANTLR start "entryRuleBehaviorFragment"
    // InternalSequence.g:128:1: entryRuleBehaviorFragment : ruleBehaviorFragment EOF ;
    public final void entryRuleBehaviorFragment() throws RecognitionException {
        try {
            // InternalSequence.g:129:1: ( ruleBehaviorFragment EOF )
            // InternalSequence.g:130:1: ruleBehaviorFragment EOF
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
    // InternalSequence.g:137:1: ruleBehaviorFragment : ( ( rule__BehaviorFragment__Alternatives ) ) ;
    public final void ruleBehaviorFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:141:2: ( ( ( rule__BehaviorFragment__Alternatives ) ) )
            // InternalSequence.g:142:2: ( ( rule__BehaviorFragment__Alternatives ) )
            {
            // InternalSequence.g:142:2: ( ( rule__BehaviorFragment__Alternatives ) )
            // InternalSequence.g:143:3: ( rule__BehaviorFragment__Alternatives )
            {
             before(grammarAccess.getBehaviorFragmentAccess().getAlternatives()); 
            // InternalSequence.g:144:3: ( rule__BehaviorFragment__Alternatives )
            // InternalSequence.g:144:4: rule__BehaviorFragment__Alternatives
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
    // InternalSequence.g:153:1: entryRuleBehaviorFragments : ruleBehaviorFragments EOF ;
    public final void entryRuleBehaviorFragments() throws RecognitionException {
        try {
            // InternalSequence.g:154:1: ( ruleBehaviorFragments EOF )
            // InternalSequence.g:155:1: ruleBehaviorFragments EOF
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
    // InternalSequence.g:162:1: ruleBehaviorFragments : ( ( rule__BehaviorFragments__Alternatives ) ) ;
    public final void ruleBehaviorFragments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:166:2: ( ( ( rule__BehaviorFragments__Alternatives ) ) )
            // InternalSequence.g:167:2: ( ( rule__BehaviorFragments__Alternatives ) )
            {
            // InternalSequence.g:167:2: ( ( rule__BehaviorFragments__Alternatives ) )
            // InternalSequence.g:168:3: ( rule__BehaviorFragments__Alternatives )
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getAlternatives()); 
            // InternalSequence.g:169:3: ( rule__BehaviorFragments__Alternatives )
            // InternalSequence.g:169:4: rule__BehaviorFragments__Alternatives
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
    // InternalSequence.g:178:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalSequence.g:179:1: ( ruleMessage EOF )
            // InternalSequence.g:180:1: ruleMessage EOF
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
    // InternalSequence.g:187:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:191:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalSequence.g:192:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalSequence.g:192:2: ( ( rule__Message__Group__0 ) )
            // InternalSequence.g:193:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalSequence.g:194:3: ( rule__Message__Group__0 )
            // InternalSequence.g:194:4: rule__Message__Group__0
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
    // InternalSequence.g:203:1: entryRuleTimeConstraint : ruleTimeConstraint EOF ;
    public final void entryRuleTimeConstraint() throws RecognitionException {
        try {
            // InternalSequence.g:204:1: ( ruleTimeConstraint EOF )
            // InternalSequence.g:205:1: ruleTimeConstraint EOF
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
    // InternalSequence.g:212:1: ruleTimeConstraint : ( ( rule__TimeConstraint__Group__0 ) ) ;
    public final void ruleTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:216:2: ( ( ( rule__TimeConstraint__Group__0 ) ) )
            // InternalSequence.g:217:2: ( ( rule__TimeConstraint__Group__0 ) )
            {
            // InternalSequence.g:217:2: ( ( rule__TimeConstraint__Group__0 ) )
            // InternalSequence.g:218:3: ( rule__TimeConstraint__Group__0 )
            {
             before(grammarAccess.getTimeConstraintAccess().getGroup()); 
            // InternalSequence.g:219:3: ( rule__TimeConstraint__Group__0 )
            // InternalSequence.g:219:4: rule__TimeConstraint__Group__0
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
    // InternalSequence.g:228:1: entryRuleInnerTimeConstraint : ruleInnerTimeConstraint EOF ;
    public final void entryRuleInnerTimeConstraint() throws RecognitionException {
        try {
            // InternalSequence.g:229:1: ( ruleInnerTimeConstraint EOF )
            // InternalSequence.g:230:1: ruleInnerTimeConstraint EOF
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
    // InternalSequence.g:237:1: ruleInnerTimeConstraint : ( ( rule__InnerTimeConstraint__Group__0 ) ) ;
    public final void ruleInnerTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:241:2: ( ( ( rule__InnerTimeConstraint__Group__0 ) ) )
            // InternalSequence.g:242:2: ( ( rule__InnerTimeConstraint__Group__0 ) )
            {
            // InternalSequence.g:242:2: ( ( rule__InnerTimeConstraint__Group__0 ) )
            // InternalSequence.g:243:3: ( rule__InnerTimeConstraint__Group__0 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getGroup()); 
            // InternalSequence.g:244:3: ( rule__InnerTimeConstraint__Group__0 )
            // InternalSequence.g:244:4: rule__InnerTimeConstraint__Group__0
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
    // InternalSequence.g:253:1: entryRuleStandardMessage : ruleStandardMessage EOF ;
    public final void entryRuleStandardMessage() throws RecognitionException {
        try {
            // InternalSequence.g:254:1: ( ruleStandardMessage EOF )
            // InternalSequence.g:255:1: ruleStandardMessage EOF
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
    // InternalSequence.g:262:1: ruleStandardMessage : ( ( rule__StandardMessage__Group__0 ) ) ;
    public final void ruleStandardMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:266:2: ( ( ( rule__StandardMessage__Group__0 ) ) )
            // InternalSequence.g:267:2: ( ( rule__StandardMessage__Group__0 ) )
            {
            // InternalSequence.g:267:2: ( ( rule__StandardMessage__Group__0 ) )
            // InternalSequence.g:268:3: ( rule__StandardMessage__Group__0 )
            {
             before(grammarAccess.getStandardMessageAccess().getGroup()); 
            // InternalSequence.g:269:3: ( rule__StandardMessage__Group__0 )
            // InternalSequence.g:269:4: rule__StandardMessage__Group__0
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
    // InternalSequence.g:278:1: entryRuleResponseMessage : ruleResponseMessage EOF ;
    public final void entryRuleResponseMessage() throws RecognitionException {
        try {
            // InternalSequence.g:279:1: ( ruleResponseMessage EOF )
            // InternalSequence.g:280:1: ruleResponseMessage EOF
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
    // InternalSequence.g:287:1: ruleResponseMessage : ( ( rule__ResponseMessage__Group__0 ) ) ;
    public final void ruleResponseMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:291:2: ( ( ( rule__ResponseMessage__Group__0 ) ) )
            // InternalSequence.g:292:2: ( ( rule__ResponseMessage__Group__0 ) )
            {
            // InternalSequence.g:292:2: ( ( rule__ResponseMessage__Group__0 ) )
            // InternalSequence.g:293:3: ( rule__ResponseMessage__Group__0 )
            {
             before(grammarAccess.getResponseMessageAccess().getGroup()); 
            // InternalSequence.g:294:3: ( rule__ResponseMessage__Group__0 )
            // InternalSequence.g:294:4: rule__ResponseMessage__Group__0
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
    // InternalSequence.g:303:1: entryRuleFoundMessage : ruleFoundMessage EOF ;
    public final void entryRuleFoundMessage() throws RecognitionException {
        try {
            // InternalSequence.g:304:1: ( ruleFoundMessage EOF )
            // InternalSequence.g:305:1: ruleFoundMessage EOF
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
    // InternalSequence.g:312:1: ruleFoundMessage : ( ( rule__FoundMessage__Group__0 ) ) ;
    public final void ruleFoundMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:316:2: ( ( ( rule__FoundMessage__Group__0 ) ) )
            // InternalSequence.g:317:2: ( ( rule__FoundMessage__Group__0 ) )
            {
            // InternalSequence.g:317:2: ( ( rule__FoundMessage__Group__0 ) )
            // InternalSequence.g:318:3: ( rule__FoundMessage__Group__0 )
            {
             before(grammarAccess.getFoundMessageAccess().getGroup()); 
            // InternalSequence.g:319:3: ( rule__FoundMessage__Group__0 )
            // InternalSequence.g:319:4: rule__FoundMessage__Group__0
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
    // InternalSequence.g:328:1: entryRuleLostMessage : ruleLostMessage EOF ;
    public final void entryRuleLostMessage() throws RecognitionException {
        try {
            // InternalSequence.g:329:1: ( ruleLostMessage EOF )
            // InternalSequence.g:330:1: ruleLostMessage EOF
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
    // InternalSequence.g:337:1: ruleLostMessage : ( ( rule__LostMessage__Group__0 ) ) ;
    public final void ruleLostMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:341:2: ( ( ( rule__LostMessage__Group__0 ) ) )
            // InternalSequence.g:342:2: ( ( rule__LostMessage__Group__0 ) )
            {
            // InternalSequence.g:342:2: ( ( rule__LostMessage__Group__0 ) )
            // InternalSequence.g:343:3: ( rule__LostMessage__Group__0 )
            {
             before(grammarAccess.getLostMessageAccess().getGroup()); 
            // InternalSequence.g:344:3: ( rule__LostMessage__Group__0 )
            // InternalSequence.g:344:4: rule__LostMessage__Group__0
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
    // InternalSequence.g:353:1: entryRuleCreateMessage : ruleCreateMessage EOF ;
    public final void entryRuleCreateMessage() throws RecognitionException {
        try {
            // InternalSequence.g:354:1: ( ruleCreateMessage EOF )
            // InternalSequence.g:355:1: ruleCreateMessage EOF
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
    // InternalSequence.g:362:1: ruleCreateMessage : ( ( rule__CreateMessage__Group__0 ) ) ;
    public final void ruleCreateMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:366:2: ( ( ( rule__CreateMessage__Group__0 ) ) )
            // InternalSequence.g:367:2: ( ( rule__CreateMessage__Group__0 ) )
            {
            // InternalSequence.g:367:2: ( ( rule__CreateMessage__Group__0 ) )
            // InternalSequence.g:368:3: ( rule__CreateMessage__Group__0 )
            {
             before(grammarAccess.getCreateMessageAccess().getGroup()); 
            // InternalSequence.g:369:3: ( rule__CreateMessage__Group__0 )
            // InternalSequence.g:369:4: rule__CreateMessage__Group__0
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
    // InternalSequence.g:378:1: entryRuleDestructionMessage : ruleDestructionMessage EOF ;
    public final void entryRuleDestructionMessage() throws RecognitionException {
        try {
            // InternalSequence.g:379:1: ( ruleDestructionMessage EOF )
            // InternalSequence.g:380:1: ruleDestructionMessage EOF
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
    // InternalSequence.g:387:1: ruleDestructionMessage : ( ( rule__DestructionMessage__Group__0 ) ) ;
    public final void ruleDestructionMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:391:2: ( ( ( rule__DestructionMessage__Group__0 ) ) )
            // InternalSequence.g:392:2: ( ( rule__DestructionMessage__Group__0 ) )
            {
            // InternalSequence.g:392:2: ( ( rule__DestructionMessage__Group__0 ) )
            // InternalSequence.g:393:3: ( rule__DestructionMessage__Group__0 )
            {
             before(grammarAccess.getDestructionMessageAccess().getGroup()); 
            // InternalSequence.g:394:3: ( rule__DestructionMessage__Group__0 )
            // InternalSequence.g:394:4: rule__DestructionMessage__Group__0
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
    // InternalSequence.g:403:1: entryRuleOccurenceSpecification : ruleOccurenceSpecification EOF ;
    public final void entryRuleOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:404:1: ( ruleOccurenceSpecification EOF )
            // InternalSequence.g:405:1: ruleOccurenceSpecification EOF
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
    // InternalSequence.g:412:1: ruleOccurenceSpecification : ( ruleDestructionOccurenceSpecification ) ;
    public final void ruleOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:416:2: ( ( ruleDestructionOccurenceSpecification ) )
            // InternalSequence.g:417:2: ( ruleDestructionOccurenceSpecification )
            {
            // InternalSequence.g:417:2: ( ruleDestructionOccurenceSpecification )
            // InternalSequence.g:418:3: ruleDestructionOccurenceSpecification
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
    // InternalSequence.g:428:1: entryRuleDestructionOccurenceSpecification : ruleDestructionOccurenceSpecification EOF ;
    public final void entryRuleDestructionOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:429:1: ( ruleDestructionOccurenceSpecification EOF )
            // InternalSequence.g:430:1: ruleDestructionOccurenceSpecification EOF
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
    // InternalSequence.g:437:1: ruleDestructionOccurenceSpecification : ( ( rule__DestructionOccurenceSpecification__Group__0 ) ) ;
    public final void ruleDestructionOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:441:2: ( ( ( rule__DestructionOccurenceSpecification__Group__0 ) ) )
            // InternalSequence.g:442:2: ( ( rule__DestructionOccurenceSpecification__Group__0 ) )
            {
            // InternalSequence.g:442:2: ( ( rule__DestructionOccurenceSpecification__Group__0 ) )
            // InternalSequence.g:443:3: ( rule__DestructionOccurenceSpecification__Group__0 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getGroup()); 
            // InternalSequence.g:444:3: ( rule__DestructionOccurenceSpecification__Group__0 )
            // InternalSequence.g:444:4: rule__DestructionOccurenceSpecification__Group__0
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
    // InternalSequence.g:453:1: entryRuleCombinedFragment : ruleCombinedFragment EOF ;
    public final void entryRuleCombinedFragment() throws RecognitionException {
        try {
            // InternalSequence.g:454:1: ( ruleCombinedFragment EOF )
            // InternalSequence.g:455:1: ruleCombinedFragment EOF
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
    // InternalSequence.g:462:1: ruleCombinedFragment : ( ( rule__CombinedFragment__Alternatives ) ) ;
    public final void ruleCombinedFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:466:2: ( ( ( rule__CombinedFragment__Alternatives ) ) )
            // InternalSequence.g:467:2: ( ( rule__CombinedFragment__Alternatives ) )
            {
            // InternalSequence.g:467:2: ( ( rule__CombinedFragment__Alternatives ) )
            // InternalSequence.g:468:3: ( rule__CombinedFragment__Alternatives )
            {
             before(grammarAccess.getCombinedFragmentAccess().getAlternatives()); 
            // InternalSequence.g:469:3: ( rule__CombinedFragment__Alternatives )
            // InternalSequence.g:469:4: rule__CombinedFragment__Alternatives
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
    // InternalSequence.g:478:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // InternalSequence.g:479:1: ( ruleAlternative EOF )
            // InternalSequence.g:480:1: ruleAlternative EOF
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
    // InternalSequence.g:487:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:491:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // InternalSequence.g:492:2: ( ( rule__Alternative__Group__0 ) )
            {
            // InternalSequence.g:492:2: ( ( rule__Alternative__Group__0 ) )
            // InternalSequence.g:493:3: ( rule__Alternative__Group__0 )
            {
             before(grammarAccess.getAlternativeAccess().getGroup()); 
            // InternalSequence.g:494:3: ( rule__Alternative__Group__0 )
            // InternalSequence.g:494:4: rule__Alternative__Group__0
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
    // InternalSequence.g:503:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalSequence.g:504:1: ( ruleOption EOF )
            // InternalSequence.g:505:1: ruleOption EOF
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
    // InternalSequence.g:512:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:516:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalSequence.g:517:2: ( ( rule__Option__Group__0 ) )
            {
            // InternalSequence.g:517:2: ( ( rule__Option__Group__0 ) )
            // InternalSequence.g:518:3: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalSequence.g:519:3: ( rule__Option__Group__0 )
            // InternalSequence.g:519:4: rule__Option__Group__0
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
    // InternalSequence.g:528:1: entryRuleParallel : ruleParallel EOF ;
    public final void entryRuleParallel() throws RecognitionException {
        try {
            // InternalSequence.g:529:1: ( ruleParallel EOF )
            // InternalSequence.g:530:1: ruleParallel EOF
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
    // InternalSequence.g:537:1: ruleParallel : ( ( rule__Parallel__Group__0 ) ) ;
    public final void ruleParallel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:541:2: ( ( ( rule__Parallel__Group__0 ) ) )
            // InternalSequence.g:542:2: ( ( rule__Parallel__Group__0 ) )
            {
            // InternalSequence.g:542:2: ( ( rule__Parallel__Group__0 ) )
            // InternalSequence.g:543:3: ( rule__Parallel__Group__0 )
            {
             before(grammarAccess.getParallelAccess().getGroup()); 
            // InternalSequence.g:544:3: ( rule__Parallel__Group__0 )
            // InternalSequence.g:544:4: rule__Parallel__Group__0
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
    // InternalSequence.g:553:1: entryRuleCritical : ruleCritical EOF ;
    public final void entryRuleCritical() throws RecognitionException {
        try {
            // InternalSequence.g:554:1: ( ruleCritical EOF )
            // InternalSequence.g:555:1: ruleCritical EOF
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
    // InternalSequence.g:562:1: ruleCritical : ( ( rule__Critical__Group__0 ) ) ;
    public final void ruleCritical() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:566:2: ( ( ( rule__Critical__Group__0 ) ) )
            // InternalSequence.g:567:2: ( ( rule__Critical__Group__0 ) )
            {
            // InternalSequence.g:567:2: ( ( rule__Critical__Group__0 ) )
            // InternalSequence.g:568:3: ( rule__Critical__Group__0 )
            {
             before(grammarAccess.getCriticalAccess().getGroup()); 
            // InternalSequence.g:569:3: ( rule__Critical__Group__0 )
            // InternalSequence.g:569:4: rule__Critical__Group__0
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
    // InternalSequence.g:578:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalSequence.g:579:1: ( ruleLoop EOF )
            // InternalSequence.g:580:1: ruleLoop EOF
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
    // InternalSequence.g:587:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:591:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalSequence.g:592:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalSequence.g:592:2: ( ( rule__Loop__Group__0 ) )
            // InternalSequence.g:593:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalSequence.g:594:3: ( rule__Loop__Group__0 )
            // InternalSequence.g:594:4: rule__Loop__Group__0
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
    // InternalSequence.g:603:1: entryRuleBehaviorFragmentsWithCondition : ruleBehaviorFragmentsWithCondition EOF ;
    public final void entryRuleBehaviorFragmentsWithCondition() throws RecognitionException {
        try {
            // InternalSequence.g:604:1: ( ruleBehaviorFragmentsWithCondition EOF )
            // InternalSequence.g:605:1: ruleBehaviorFragmentsWithCondition EOF
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
    // InternalSequence.g:612:1: ruleBehaviorFragmentsWithCondition : ( ( rule__BehaviorFragmentsWithCondition__Group__0 ) ) ;
    public final void ruleBehaviorFragmentsWithCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:616:2: ( ( ( rule__BehaviorFragmentsWithCondition__Group__0 ) ) )
            // InternalSequence.g:617:2: ( ( rule__BehaviorFragmentsWithCondition__Group__0 ) )
            {
            // InternalSequence.g:617:2: ( ( rule__BehaviorFragmentsWithCondition__Group__0 ) )
            // InternalSequence.g:618:3: ( rule__BehaviorFragmentsWithCondition__Group__0 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getGroup()); 
            // InternalSequence.g:619:3: ( rule__BehaviorFragmentsWithCondition__Group__0 )
            // InternalSequence.g:619:4: rule__BehaviorFragmentsWithCondition__Group__0
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
    // InternalSequence.g:628:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSequence.g:629:1: ( ruleFQN EOF )
            // InternalSequence.g:630:1: ruleFQN EOF
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
    // InternalSequence.g:637:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:641:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSequence.g:642:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSequence.g:642:2: ( ( rule__FQN__Group__0 ) )
            // InternalSequence.g:643:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalSequence.g:644:3: ( rule__FQN__Group__0 )
            // InternalSequence.g:644:4: rule__FQN__Group__0
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
    // InternalSequence.g:653:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalSequence.g:654:1: ( ruleOrder EOF )
            // InternalSequence.g:655:1: ruleOrder EOF
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
    // InternalSequence.g:662:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:666:2: ( ( ( rule__Order__Group__0 ) ) )
            // InternalSequence.g:667:2: ( ( rule__Order__Group__0 ) )
            {
            // InternalSequence.g:667:2: ( ( rule__Order__Group__0 ) )
            // InternalSequence.g:668:3: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // InternalSequence.g:669:3: ( rule__Order__Group__0 )
            // InternalSequence.g:669:4: rule__Order__Group__0
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
    // InternalSequence.g:678:1: entryRuleCommentBody : ruleCommentBody EOF ;
    public final void entryRuleCommentBody() throws RecognitionException {
        try {
            // InternalSequence.g:679:1: ( ruleCommentBody EOF )
            // InternalSequence.g:680:1: ruleCommentBody EOF
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
    // InternalSequence.g:687:1: ruleCommentBody : ( RULE_STRING ) ;
    public final void ruleCommentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:691:2: ( ( RULE_STRING ) )
            // InternalSequence.g:692:2: ( RULE_STRING )
            {
            // InternalSequence.g:692:2: ( RULE_STRING )
            // InternalSequence.g:693:3: RULE_STRING
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
    // InternalSequence.g:703:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:707:1: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalSequence.g:708:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalSequence.g:708:2: ( ( rule__MessageType__Alternatives ) )
            // InternalSequence.g:709:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalSequence.g:710:3: ( rule__MessageType__Alternatives )
            // InternalSequence.g:710:4: rule__MessageType__Alternatives
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
    // InternalSequence.g:719:1: ruleActorType : ( ( rule__ActorType__Alternatives ) ) ;
    public final void ruleActorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:723:1: ( ( ( rule__ActorType__Alternatives ) ) )
            // InternalSequence.g:724:2: ( ( rule__ActorType__Alternatives ) )
            {
            // InternalSequence.g:724:2: ( ( rule__ActorType__Alternatives ) )
            // InternalSequence.g:725:3: ( rule__ActorType__Alternatives )
            {
             before(grammarAccess.getActorTypeAccess().getAlternatives()); 
            // InternalSequence.g:726:3: ( rule__ActorType__Alternatives )
            // InternalSequence.g:726:4: rule__ActorType__Alternatives
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
    // InternalSequence.g:735:1: ruleTimeConstraintType : ( ( rule__TimeConstraintType__Alternatives ) ) ;
    public final void ruleTimeConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:739:1: ( ( ( rule__TimeConstraintType__Alternatives ) ) )
            // InternalSequence.g:740:2: ( ( rule__TimeConstraintType__Alternatives ) )
            {
            // InternalSequence.g:740:2: ( ( rule__TimeConstraintType__Alternatives ) )
            // InternalSequence.g:741:3: ( rule__TimeConstraintType__Alternatives )
            {
             before(grammarAccess.getTimeConstraintTypeAccess().getAlternatives()); 
            // InternalSequence.g:742:3: ( rule__TimeConstraintType__Alternatives )
            // InternalSequence.g:742:4: rule__TimeConstraintType__Alternatives
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
    // InternalSequence.g:750:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Group_2_0__0 ) ) | ( ( rule__Actor__Group_2_1__0 ) ) | ( ( rule__Actor__Group_2_2__0 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:754:1: ( ( ( rule__Actor__Group_2_0__0 ) ) | ( ( rule__Actor__Group_2_1__0 ) ) | ( ( rule__Actor__Group_2_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 24:
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
                    // InternalSequence.g:755:2: ( ( rule__Actor__Group_2_0__0 ) )
                    {
                    // InternalSequence.g:755:2: ( ( rule__Actor__Group_2_0__0 ) )
                    // InternalSequence.g:756:3: ( rule__Actor__Group_2_0__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_0()); 
                    // InternalSequence.g:757:3: ( rule__Actor__Group_2_0__0 )
                    // InternalSequence.g:757:4: rule__Actor__Group_2_0__0
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
                    // InternalSequence.g:761:2: ( ( rule__Actor__Group_2_1__0 ) )
                    {
                    // InternalSequence.g:761:2: ( ( rule__Actor__Group_2_1__0 ) )
                    // InternalSequence.g:762:3: ( rule__Actor__Group_2_1__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_1()); 
                    // InternalSequence.g:763:3: ( rule__Actor__Group_2_1__0 )
                    // InternalSequence.g:763:4: rule__Actor__Group_2_1__0
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
                    // InternalSequence.g:767:2: ( ( rule__Actor__Group_2_2__0 ) )
                    {
                    // InternalSequence.g:767:2: ( ( rule__Actor__Group_2_2__0 ) )
                    // InternalSequence.g:768:3: ( rule__Actor__Group_2_2__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_2()); 
                    // InternalSequence.g:769:3: ( rule__Actor__Group_2_2__0 )
                    // InternalSequence.g:769:4: rule__Actor__Group_2_2__0
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
    // InternalSequence.g:777:1: rule__BehaviorFragment__Alternatives : ( ( ruleMessage ) | ( ruleOccurenceSpecification ) | ( ruleCombinedFragment ) );
    public final void rule__BehaviorFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:781:1: ( ( ruleMessage ) | ( ruleOccurenceSpecification ) | ( ruleCombinedFragment ) )
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
                    alt2=2;
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
                    // InternalSequence.g:782:2: ( ruleMessage )
                    {
                    // InternalSequence.g:782:2: ( ruleMessage )
                    // InternalSequence.g:783:3: ruleMessage
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
                    // InternalSequence.g:788:2: ( ruleOccurenceSpecification )
                    {
                    // InternalSequence.g:788:2: ( ruleOccurenceSpecification )
                    // InternalSequence.g:789:3: ruleOccurenceSpecification
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
                    // InternalSequence.g:794:2: ( ruleCombinedFragment )
                    {
                    // InternalSequence.g:794:2: ( ruleCombinedFragment )
                    // InternalSequence.g:795:3: ruleCombinedFragment
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
    // InternalSequence.g:804:1: rule__BehaviorFragments__Alternatives : ( ( ( rule__BehaviorFragments__Group_0__0 ) ) | ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) ) );
    public final void rule__BehaviorFragments__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:808:1: ( ( ( rule__BehaviorFragments__Group_0__0 ) ) | ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) ) )
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
                    // InternalSequence.g:809:2: ( ( rule__BehaviorFragments__Group_0__0 ) )
                    {
                    // InternalSequence.g:809:2: ( ( rule__BehaviorFragments__Group_0__0 ) )
                    // InternalSequence.g:810:3: ( rule__BehaviorFragments__Group_0__0 )
                    {
                     before(grammarAccess.getBehaviorFragmentsAccess().getGroup_0()); 
                    // InternalSequence.g:811:3: ( rule__BehaviorFragments__Group_0__0 )
                    // InternalSequence.g:811:4: rule__BehaviorFragments__Group_0__0
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
                    // InternalSequence.g:815:2: ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) )
                    {
                    // InternalSequence.g:815:2: ( ( rule__BehaviorFragments__FragmentsAssignment_1 ) )
                    // InternalSequence.g:816:3: ( rule__BehaviorFragments__FragmentsAssignment_1 )
                    {
                     before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_1()); 
                    // InternalSequence.g:817:3: ( rule__BehaviorFragments__FragmentsAssignment_1 )
                    // InternalSequence.g:817:4: rule__BehaviorFragments__FragmentsAssignment_1
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
    // InternalSequence.g:825:1: rule__Message__Alternatives_0 : ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) );
    public final void rule__Message__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:829:1: ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSequence.g:830:2: ( ruleStandardMessage )
                    {
                    // InternalSequence.g:830:2: ( ruleStandardMessage )
                    // InternalSequence.g:831:3: ruleStandardMessage
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
                    // InternalSequence.g:836:2: ( ruleResponseMessage )
                    {
                    // InternalSequence.g:836:2: ( ruleResponseMessage )
                    // InternalSequence.g:837:3: ruleResponseMessage
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
                    // InternalSequence.g:842:2: ( ruleFoundMessage )
                    {
                    // InternalSequence.g:842:2: ( ruleFoundMessage )
                    // InternalSequence.g:843:3: ruleFoundMessage
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
                    // InternalSequence.g:848:2: ( ruleLostMessage )
                    {
                    // InternalSequence.g:848:2: ( ruleLostMessage )
                    // InternalSequence.g:849:3: ruleLostMessage
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
                    // InternalSequence.g:854:2: ( ruleCreateMessage )
                    {
                    // InternalSequence.g:854:2: ( ruleCreateMessage )
                    // InternalSequence.g:855:3: ruleCreateMessage
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
                    // InternalSequence.g:860:2: ( ruleDestructionMessage )
                    {
                    // InternalSequence.g:860:2: ( ruleDestructionMessage )
                    // InternalSequence.g:861:3: ruleDestructionMessage
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
    // InternalSequence.g:870:1: rule__ResponseMessage__Alternatives_3 : ( ( ( rule__ResponseMessage__LeftAssignment_3_0 ) ) | ( '_' ) );
    public final void rule__ResponseMessage__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:874:1: ( ( ( rule__ResponseMessage__LeftAssignment_3_0 ) ) | ( '_' ) )
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
                    // InternalSequence.g:875:2: ( ( rule__ResponseMessage__LeftAssignment_3_0 ) )
                    {
                    // InternalSequence.g:875:2: ( ( rule__ResponseMessage__LeftAssignment_3_0 ) )
                    // InternalSequence.g:876:3: ( rule__ResponseMessage__LeftAssignment_3_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getLeftAssignment_3_0()); 
                    // InternalSequence.g:877:3: ( rule__ResponseMessage__LeftAssignment_3_0 )
                    // InternalSequence.g:877:4: rule__ResponseMessage__LeftAssignment_3_0
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
                    // InternalSequence.g:881:2: ( '_' )
                    {
                    // InternalSequence.g:881:2: ( '_' )
                    // InternalSequence.g:882:3: '_'
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
    // InternalSequence.g:891:1: rule__ResponseMessage__Alternatives_5 : ( ( ( rule__ResponseMessage__RightAssignment_5_0 ) ) | ( '_' ) );
    public final void rule__ResponseMessage__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:895:1: ( ( ( rule__ResponseMessage__RightAssignment_5_0 ) ) | ( '_' ) )
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
                    // InternalSequence.g:896:2: ( ( rule__ResponseMessage__RightAssignment_5_0 ) )
                    {
                    // InternalSequence.g:896:2: ( ( rule__ResponseMessage__RightAssignment_5_0 ) )
                    // InternalSequence.g:897:3: ( rule__ResponseMessage__RightAssignment_5_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getRightAssignment_5_0()); 
                    // InternalSequence.g:898:3: ( rule__ResponseMessage__RightAssignment_5_0 )
                    // InternalSequence.g:898:4: rule__ResponseMessage__RightAssignment_5_0
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
                    // InternalSequence.g:902:2: ( '_' )
                    {
                    // InternalSequence.g:902:2: ( '_' )
                    // InternalSequence.g:903:3: '_'
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
    // InternalSequence.g:912:1: rule__CombinedFragment__Alternatives : ( ( ruleAlternative ) | ( ruleOption ) | ( ruleParallel ) | ( ruleCritical ) | ( ruleLoop ) );
    public final void rule__CombinedFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:916:1: ( ( ruleAlternative ) | ( ruleOption ) | ( ruleParallel ) | ( ruleCritical ) | ( ruleLoop ) )
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
                    // InternalSequence.g:917:2: ( ruleAlternative )
                    {
                    // InternalSequence.g:917:2: ( ruleAlternative )
                    // InternalSequence.g:918:3: ruleAlternative
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
                    // InternalSequence.g:923:2: ( ruleOption )
                    {
                    // InternalSequence.g:923:2: ( ruleOption )
                    // InternalSequence.g:924:3: ruleOption
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
                    // InternalSequence.g:929:2: ( ruleParallel )
                    {
                    // InternalSequence.g:929:2: ( ruleParallel )
                    // InternalSequence.g:930:3: ruleParallel
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
                    // InternalSequence.g:935:2: ( ruleCritical )
                    {
                    // InternalSequence.g:935:2: ( ruleCritical )
                    // InternalSequence.g:936:3: ruleCritical
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
                    // InternalSequence.g:941:2: ( ruleLoop )
                    {
                    // InternalSequence.g:941:2: ( ruleLoop )
                    // InternalSequence.g:942:3: ruleLoop
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
    // InternalSequence.g:951:1: rule__BehaviorFragmentsWithCondition__Alternatives_3 : ( ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) ) | ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) ) );
    public final void rule__BehaviorFragmentsWithCondition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:955:1: ( ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) ) | ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) ) )
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
                    // InternalSequence.g:956:2: ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) )
                    {
                    // InternalSequence.g:956:2: ( ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 ) )
                    // InternalSequence.g:957:3: ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 )
                    {
                     before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getGroup_3_0()); 
                    // InternalSequence.g:958:3: ( rule__BehaviorFragmentsWithCondition__Group_3_0__0 )
                    // InternalSequence.g:958:4: rule__BehaviorFragmentsWithCondition__Group_3_0__0
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
                    // InternalSequence.g:962:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) )
                    {
                    // InternalSequence.g:962:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 ) )
                    // InternalSequence.g:963:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 )
                    {
                     before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_1()); 
                    // InternalSequence.g:964:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 )
                    // InternalSequence.g:964:4: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1
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
    // InternalSequence.g:972:1: rule__MessageType__Alternatives : ( ( ( 'sync' ) ) | ( ( 'async' ) ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:976:1: ( ( ( 'sync' ) ) | ( ( 'async' ) ) )
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
                    // InternalSequence.g:977:2: ( ( 'sync' ) )
                    {
                    // InternalSequence.g:977:2: ( ( 'sync' ) )
                    // InternalSequence.g:978:3: ( 'sync' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:979:3: ( 'sync' )
                    // InternalSequence.g:979:4: 'sync'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:983:2: ( ( 'async' ) )
                    {
                    // InternalSequence.g:983:2: ( ( 'async' ) )
                    // InternalSequence.g:984:3: ( 'async' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getASYNCEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:985:3: ( 'async' )
                    // InternalSequence.g:985:4: 'async'
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
    // InternalSequence.g:993:1: rule__ActorType__Alternatives : ( ( ( 'human' ) ) | ( ( 'machine' ) ) );
    public final void rule__ActorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:997:1: ( ( ( 'human' ) ) | ( ( 'machine' ) ) )
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
                    // InternalSequence.g:998:2: ( ( 'human' ) )
                    {
                    // InternalSequence.g:998:2: ( ( 'human' ) )
                    // InternalSequence.g:999:3: ( 'human' )
                    {
                     before(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1000:3: ( 'human' )
                    // InternalSequence.g:1000:4: 'human'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1004:2: ( ( 'machine' ) )
                    {
                    // InternalSequence.g:1004:2: ( ( 'machine' ) )
                    // InternalSequence.g:1005:3: ( 'machine' )
                    {
                     before(grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1006:3: ( 'machine' )
                    // InternalSequence.g:1006:4: 'machine'
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
    // InternalSequence.g:1014:1: rule__TimeConstraintType__Alternatives : ( ( ( 'd' ) ) | ( ( 't' ) ) | ( ( 'max' ) ) | ( ( 'diff' ) ) );
    public final void rule__TimeConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1018:1: ( ( ( 'd' ) ) | ( ( 't' ) ) | ( ( 'max' ) ) | ( ( 'diff' ) ) )
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
                    // InternalSequence.g:1019:2: ( ( 'd' ) )
                    {
                    // InternalSequence.g:1019:2: ( ( 'd' ) )
                    // InternalSequence.g:1020:3: ( 'd' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getDURATIONEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1021:3: ( 'd' )
                    // InternalSequence.g:1021:4: 'd'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeConstraintTypeAccess().getDURATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1025:2: ( ( 't' ) )
                    {
                    // InternalSequence.g:1025:2: ( ( 't' ) )
                    // InternalSequence.g:1026:3: ( 't' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getTIMEEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1027:3: ( 't' )
                    // InternalSequence.g:1027:4: 't'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeConstraintTypeAccess().getTIMEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:1031:2: ( ( 'max' ) )
                    {
                    // InternalSequence.g:1031:2: ( ( 'max' ) )
                    // InternalSequence.g:1032:3: ( 'max' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getMAXIMUMEnumLiteralDeclaration_2()); 
                    // InternalSequence.g:1033:3: ( 'max' )
                    // InternalSequence.g:1033:4: 'max'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeConstraintTypeAccess().getMAXIMUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSequence.g:1037:2: ( ( 'diff' ) )
                    {
                    // InternalSequence.g:1037:2: ( ( 'diff' ) )
                    // InternalSequence.g:1038:3: ( 'diff' )
                    {
                     before(grammarAccess.getTimeConstraintTypeAccess().getDIFFERENCEEnumLiteralDeclaration_3()); 
                    // InternalSequence.g:1039:3: ( 'diff' )
                    // InternalSequence.g:1039:4: 'diff'
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
    // InternalSequence.g:1047:1: rule__SequenceDiagram__Group__0 : rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 ;
    public final void rule__SequenceDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1051:1: ( rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 )
            // InternalSequence.g:1052:2: rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1
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
    // InternalSequence.g:1059:1: rule__SequenceDiagram__Group__0__Impl : ( () ) ;
    public final void rule__SequenceDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1063:1: ( ( () ) )
            // InternalSequence.g:1064:1: ( () )
            {
            // InternalSequence.g:1064:1: ( () )
            // InternalSequence.g:1065:2: ()
            {
             before(grammarAccess.getSequenceDiagramAccess().getSequenceDiagramAction_0()); 
            // InternalSequence.g:1066:2: ()
            // InternalSequence.g:1066:3: 
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
    // InternalSequence.g:1074:1: rule__SequenceDiagram__Group__1 : rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 ;
    public final void rule__SequenceDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1078:1: ( rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 )
            // InternalSequence.g:1079:2: rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2
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
    // InternalSequence.g:1086:1: rule__SequenceDiagram__Group__1__Impl : ( '@start-seqd' ) ;
    public final void rule__SequenceDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1090:1: ( ( '@start-seqd' ) )
            // InternalSequence.g:1091:1: ( '@start-seqd' )
            {
            // InternalSequence.g:1091:1: ( '@start-seqd' )
            // InternalSequence.g:1092:2: '@start-seqd'
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
    // InternalSequence.g:1101:1: rule__SequenceDiagram__Group__2 : rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 ;
    public final void rule__SequenceDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1105:1: ( rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 )
            // InternalSequence.g:1106:2: rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3
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
    // InternalSequence.g:1113:1: rule__SequenceDiagram__Group__2__Impl : ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) ;
    public final void rule__SequenceDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1117:1: ( ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) )
            // InternalSequence.g:1118:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            {
            // InternalSequence.g:1118:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            // InternalSequence.g:1119:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getTitleAssignment_2()); 
            // InternalSequence.g:1120:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            // InternalSequence.g:1120:3: rule__SequenceDiagram__TitleAssignment_2
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
    // InternalSequence.g:1128:1: rule__SequenceDiagram__Group__3 : rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 ;
    public final void rule__SequenceDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1132:1: ( rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 )
            // InternalSequence.g:1133:2: rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4
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
    // InternalSequence.g:1140:1: rule__SequenceDiagram__Group__3__Impl : ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__SequenceDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1144:1: ( ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) )
            // InternalSequence.g:1145:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            {
            // InternalSequence.g:1145:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            // InternalSequence.g:1146:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getRootPackageAssignment_3()); 
            // InternalSequence.g:1147:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            // InternalSequence.g:1147:3: rule__SequenceDiagram__RootPackageAssignment_3
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
    // InternalSequence.g:1155:1: rule__SequenceDiagram__Group__4 : rule__SequenceDiagram__Group__4__Impl ;
    public final void rule__SequenceDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1159:1: ( rule__SequenceDiagram__Group__4__Impl )
            // InternalSequence.g:1160:2: rule__SequenceDiagram__Group__4__Impl
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
    // InternalSequence.g:1166:1: rule__SequenceDiagram__Group__4__Impl : ( '@end-seqd' ) ;
    public final void rule__SequenceDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1170:1: ( ( '@end-seqd' ) )
            // InternalSequence.g:1171:1: ( '@end-seqd' )
            {
            // InternalSequence.g:1171:1: ( '@end-seqd' )
            // InternalSequence.g:1172:2: '@end-seqd'
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
    // InternalSequence.g:1182:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1186:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalSequence.g:1187:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
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
    // InternalSequence.g:1194:1: rule__RootPackage__Group__0__Impl : ( 'rootElement' ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1198:1: ( ( 'rootElement' ) )
            // InternalSequence.g:1199:1: ( 'rootElement' )
            {
            // InternalSequence.g:1199:1: ( 'rootElement' )
            // InternalSequence.g:1200:2: 'rootElement'
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
    // InternalSequence.g:1209:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1213:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalSequence.g:1214:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
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
    // InternalSequence.g:1221:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__NameAssignment_1 ) ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1225:1: ( ( ( rule__RootPackage__NameAssignment_1 ) ) )
            // InternalSequence.g:1226:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            {
            // InternalSequence.g:1226:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            // InternalSequence.g:1227:2: ( rule__RootPackage__NameAssignment_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 
            // InternalSequence.g:1228:2: ( rule__RootPackage__NameAssignment_1 )
            // InternalSequence.g:1228:3: rule__RootPackage__NameAssignment_1
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
    // InternalSequence.g:1236:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1240:1: ( rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 )
            // InternalSequence.g:1241:2: rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3
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
    // InternalSequence.g:1248:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__ActorsAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1252:1: ( ( ( rule__RootPackage__ActorsAssignment_2 )* ) )
            // InternalSequence.g:1253:1: ( ( rule__RootPackage__ActorsAssignment_2 )* )
            {
            // InternalSequence.g:1253:1: ( ( rule__RootPackage__ActorsAssignment_2 )* )
            // InternalSequence.g:1254:2: ( rule__RootPackage__ActorsAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getActorsAssignment_2()); 
            // InternalSequence.g:1255:2: ( rule__RootPackage__ActorsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSequence.g:1255:3: rule__RootPackage__ActorsAssignment_2
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
    // InternalSequence.g:1263:1: rule__RootPackage__Group__3 : rule__RootPackage__Group__3__Impl ;
    public final void rule__RootPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1267:1: ( rule__RootPackage__Group__3__Impl )
            // InternalSequence.g:1268:2: rule__RootPackage__Group__3__Impl
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
    // InternalSequence.g:1274:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__BehaviorFragmentsAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1278:1: ( ( ( rule__RootPackage__BehaviorFragmentsAssignment_3 )* ) )
            // InternalSequence.g:1279:1: ( ( rule__RootPackage__BehaviorFragmentsAssignment_3 )* )
            {
            // InternalSequence.g:1279:1: ( ( rule__RootPackage__BehaviorFragmentsAssignment_3 )* )
            // InternalSequence.g:1280:2: ( rule__RootPackage__BehaviorFragmentsAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getBehaviorFragmentsAssignment_3()); 
            // InternalSequence.g:1281:2: ( rule__RootPackage__BehaviorFragmentsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=13)||(LA13_0>=36 && LA13_0<=45)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSequence.g:1281:3: rule__RootPackage__BehaviorFragmentsAssignment_3
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
    // InternalSequence.g:1290:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1294:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalSequence.g:1295:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
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
    // InternalSequence.g:1302:1: rule__Actor__Group__0__Impl : ( 'act' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1306:1: ( ( 'act' ) )
            // InternalSequence.g:1307:1: ( 'act' )
            {
            // InternalSequence.g:1307:1: ( 'act' )
            // InternalSequence.g:1308:2: 'act'
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
    // InternalSequence.g:1317:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1321:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalSequence.g:1322:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
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
    // InternalSequence.g:1329:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__DeferredAssignment_1 )? ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1333:1: ( ( ( rule__Actor__DeferredAssignment_1 )? ) )
            // InternalSequence.g:1334:1: ( ( rule__Actor__DeferredAssignment_1 )? )
            {
            // InternalSequence.g:1334:1: ( ( rule__Actor__DeferredAssignment_1 )? )
            // InternalSequence.g:1335:2: ( rule__Actor__DeferredAssignment_1 )?
            {
             before(grammarAccess.getActorAccess().getDeferredAssignment_1()); 
            // InternalSequence.g:1336:2: ( rule__Actor__DeferredAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSequence.g:1336:3: rule__Actor__DeferredAssignment_1
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
    // InternalSequence.g:1344:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1348:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalSequence.g:1349:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
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
    // InternalSequence.g:1356:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__Alternatives_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1360:1: ( ( ( rule__Actor__Alternatives_2 ) ) )
            // InternalSequence.g:1361:1: ( ( rule__Actor__Alternatives_2 ) )
            {
            // InternalSequence.g:1361:1: ( ( rule__Actor__Alternatives_2 ) )
            // InternalSequence.g:1362:2: ( rule__Actor__Alternatives_2 )
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // InternalSequence.g:1363:2: ( rule__Actor__Alternatives_2 )
            // InternalSequence.g:1363:3: rule__Actor__Alternatives_2
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
    // InternalSequence.g:1371:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1375:1: ( rule__Actor__Group__3__Impl )
            // InternalSequence.g:1376:2: rule__Actor__Group__3__Impl
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
    // InternalSequence.g:1382:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1386:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // InternalSequence.g:1387:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // InternalSequence.g:1387:1: ( ( rule__Actor__Group_3__0 )? )
            // InternalSequence.g:1388:2: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // InternalSequence.g:1389:2: ( rule__Actor__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSequence.g:1389:3: rule__Actor__Group_3__0
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
    // InternalSequence.g:1398:1: rule__Actor__Group_2_0__0 : rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 ;
    public final void rule__Actor__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1402:1: ( rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 )
            // InternalSequence.g:1403:2: rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1
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
    // InternalSequence.g:1410:1: rule__Actor__Group_2_0__0__Impl : ( ( rule__Actor__NameAssignment_2_0_0 ) ) ;
    public final void rule__Actor__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1414:1: ( ( ( rule__Actor__NameAssignment_2_0_0 ) ) )
            // InternalSequence.g:1415:1: ( ( rule__Actor__NameAssignment_2_0_0 ) )
            {
            // InternalSequence.g:1415:1: ( ( rule__Actor__NameAssignment_2_0_0 ) )
            // InternalSequence.g:1416:2: ( rule__Actor__NameAssignment_2_0_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_0_0()); 
            // InternalSequence.g:1417:2: ( rule__Actor__NameAssignment_2_0_0 )
            // InternalSequence.g:1417:3: rule__Actor__NameAssignment_2_0_0
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
    // InternalSequence.g:1425:1: rule__Actor__Group_2_0__1 : rule__Actor__Group_2_0__1__Impl ;
    public final void rule__Actor__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1429:1: ( rule__Actor__Group_2_0__1__Impl )
            // InternalSequence.g:1430:2: rule__Actor__Group_2_0__1__Impl
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
    // InternalSequence.g:1436:1: rule__Actor__Group_2_0__1__Impl : ( ( rule__Actor__Group_2_0_1__0 )? ) ;
    public final void rule__Actor__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1440:1: ( ( ( rule__Actor__Group_2_0_1__0 )? ) )
            // InternalSequence.g:1441:1: ( ( rule__Actor__Group_2_0_1__0 )? )
            {
            // InternalSequence.g:1441:1: ( ( rule__Actor__Group_2_0_1__0 )? )
            // InternalSequence.g:1442:2: ( rule__Actor__Group_2_0_1__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_2_0_1()); 
            // InternalSequence.g:1443:2: ( rule__Actor__Group_2_0_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSequence.g:1443:3: rule__Actor__Group_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_2_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_2_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Actor__Group_2_0_1__0"
    // InternalSequence.g:1452:1: rule__Actor__Group_2_0_1__0 : rule__Actor__Group_2_0_1__0__Impl rule__Actor__Group_2_0_1__1 ;
    public final void rule__Actor__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1456:1: ( rule__Actor__Group_2_0_1__0__Impl rule__Actor__Group_2_0_1__1 )
            // InternalSequence.g:1457:2: rule__Actor__Group_2_0_1__0__Impl rule__Actor__Group_2_0_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_0_1__0"


    // $ANTLR start "rule__Actor__Group_2_0_1__0__Impl"
    // InternalSequence.g:1464:1: rule__Actor__Group_2_0_1__0__Impl : ( ':' ) ;
    public final void rule__Actor__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1468:1: ( ( ':' ) )
            // InternalSequence.g:1469:1: ( ':' )
            {
            // InternalSequence.g:1469:1: ( ':' )
            // InternalSequence.g:1470:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_2_0_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__Actor__Group_2_0_1__1"
    // InternalSequence.g:1479:1: rule__Actor__Group_2_0_1__1 : rule__Actor__Group_2_0_1__1__Impl ;
    public final void rule__Actor__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1483:1: ( rule__Actor__Group_2_0_1__1__Impl )
            // InternalSequence.g:1484:2: rule__Actor__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_0_1__1"


    // $ANTLR start "rule__Actor__Group_2_0_1__1__Impl"
    // InternalSequence.g:1490:1: rule__Actor__Group_2_0_1__1__Impl : ( ( rule__Actor__TypeAssignment_2_0_1_1 ) ) ;
    public final void rule__Actor__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1494:1: ( ( ( rule__Actor__TypeAssignment_2_0_1_1 ) ) )
            // InternalSequence.g:1495:1: ( ( rule__Actor__TypeAssignment_2_0_1_1 ) )
            {
            // InternalSequence.g:1495:1: ( ( rule__Actor__TypeAssignment_2_0_1_1 ) )
            // InternalSequence.g:1496:2: ( rule__Actor__TypeAssignment_2_0_1_1 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_2_0_1_1()); 
            // InternalSequence.g:1497:2: ( rule__Actor__TypeAssignment_2_0_1_1 )
            // InternalSequence.g:1497:3: rule__Actor__TypeAssignment_2_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeAssignment_2_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__Actor__Group_2_1__0"
    // InternalSequence.g:1506:1: rule__Actor__Group_2_1__0 : rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 ;
    public final void rule__Actor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1510:1: ( rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 )
            // InternalSequence.g:1511:2: rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:1518:1: rule__Actor__Group_2_1__0__Impl : ( ':' ) ;
    public final void rule__Actor__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1522:1: ( ( ':' ) )
            // InternalSequence.g:1523:1: ( ':' )
            {
            // InternalSequence.g:1523:1: ( ':' )
            // InternalSequence.g:1524:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_2_1_0()); 

            }


            }

        }
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
    // InternalSequence.g:1533:1: rule__Actor__Group_2_1__1 : rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 ;
    public final void rule__Actor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1537:1: ( rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 )
            // InternalSequence.g:1538:2: rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSequence.g:1545:1: rule__Actor__Group_2_1__1__Impl : ( ( rule__Actor__TypeAssignment_2_1_1 ) ) ;
    public final void rule__Actor__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1549:1: ( ( ( rule__Actor__TypeAssignment_2_1_1 ) ) )
            // InternalSequence.g:1550:1: ( ( rule__Actor__TypeAssignment_2_1_1 ) )
            {
            // InternalSequence.g:1550:1: ( ( rule__Actor__TypeAssignment_2_1_1 ) )
            // InternalSequence.g:1551:2: ( rule__Actor__TypeAssignment_2_1_1 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_2_1_1()); 
            // InternalSequence.g:1552:2: ( rule__Actor__TypeAssignment_2_1_1 )
            // InternalSequence.g:1552:3: rule__Actor__TypeAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_2_1_1()); 

            }


            }

        }
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
    // InternalSequence.g:1560:1: rule__Actor__Group_2_1__2 : rule__Actor__Group_2_1__2__Impl rule__Actor__Group_2_1__3 ;
    public final void rule__Actor__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1564:1: ( rule__Actor__Group_2_1__2__Impl rule__Actor__Group_2_1__3 )
            // InternalSequence.g:1565:2: rule__Actor__Group_2_1__2__Impl rule__Actor__Group_2_1__3
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_1__3();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:1572:1: rule__Actor__Group_2_1__2__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1576:1: ( ( 'as' ) )
            // InternalSequence.g:1577:1: ( 'as' )
            {
            // InternalSequence.g:1577:1: ( 'as' )
            // InternalSequence.g:1578:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_2_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAsKeyword_2_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Actor__Group_2_1__3"
    // InternalSequence.g:1587:1: rule__Actor__Group_2_1__3 : rule__Actor__Group_2_1__3__Impl ;
    public final void rule__Actor__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1591:1: ( rule__Actor__Group_2_1__3__Impl )
            // InternalSequence.g:1592:2: rule__Actor__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_1__3"


    // $ANTLR start "rule__Actor__Group_2_1__3__Impl"
    // InternalSequence.g:1598:1: rule__Actor__Group_2_1__3__Impl : ( ( rule__Actor__AliasAssignment_2_1_3 ) ) ;
    public final void rule__Actor__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1602:1: ( ( ( rule__Actor__AliasAssignment_2_1_3 ) ) )
            // InternalSequence.g:1603:1: ( ( rule__Actor__AliasAssignment_2_1_3 ) )
            {
            // InternalSequence.g:1603:1: ( ( rule__Actor__AliasAssignment_2_1_3 ) )
            // InternalSequence.g:1604:2: ( rule__Actor__AliasAssignment_2_1_3 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_1_3()); 
            // InternalSequence.g:1605:2: ( rule__Actor__AliasAssignment_2_1_3 )
            // InternalSequence.g:1605:3: rule__Actor__AliasAssignment_2_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Actor__AliasAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAliasAssignment_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_1__3__Impl"


    // $ANTLR start "rule__Actor__Group_2_2__0"
    // InternalSequence.g:1614:1: rule__Actor__Group_2_2__0 : rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 ;
    public final void rule__Actor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1618:1: ( rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 )
            // InternalSequence.g:1619:2: rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1
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
    // InternalSequence.g:1626:1: rule__Actor__Group_2_2__0__Impl : ( ( rule__Actor__NameAssignment_2_2_0 ) ) ;
    public final void rule__Actor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1630:1: ( ( ( rule__Actor__NameAssignment_2_2_0 ) ) )
            // InternalSequence.g:1631:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            {
            // InternalSequence.g:1631:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            // InternalSequence.g:1632:2: ( rule__Actor__NameAssignment_2_2_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_2_0()); 
            // InternalSequence.g:1633:2: ( rule__Actor__NameAssignment_2_2_0 )
            // InternalSequence.g:1633:3: rule__Actor__NameAssignment_2_2_0
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
    // InternalSequence.g:1641:1: rule__Actor__Group_2_2__1 : rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 ;
    public final void rule__Actor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1645:1: ( rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 )
            // InternalSequence.g:1646:2: rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2
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
    // InternalSequence.g:1653:1: rule__Actor__Group_2_2__1__Impl : ( ( rule__Actor__Group_2_2_1__0 )? ) ;
    public final void rule__Actor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1657:1: ( ( ( rule__Actor__Group_2_2_1__0 )? ) )
            // InternalSequence.g:1658:1: ( ( rule__Actor__Group_2_2_1__0 )? )
            {
            // InternalSequence.g:1658:1: ( ( rule__Actor__Group_2_2_1__0 )? )
            // InternalSequence.g:1659:2: ( rule__Actor__Group_2_2_1__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_2_2_1()); 
            // InternalSequence.g:1660:2: ( rule__Actor__Group_2_2_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSequence.g:1660:3: rule__Actor__Group_2_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_2_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_2_2_1()); 

            }


            }

        }
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
    // InternalSequence.g:1668:1: rule__Actor__Group_2_2__2 : rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 ;
    public final void rule__Actor__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1672:1: ( rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 )
            // InternalSequence.g:1673:2: rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3
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
    // InternalSequence.g:1680:1: rule__Actor__Group_2_2__2__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1684:1: ( ( 'as' ) )
            // InternalSequence.g:1685:1: ( 'as' )
            {
            // InternalSequence.g:1685:1: ( 'as' )
            // InternalSequence.g:1686:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_2_2_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSequence.g:1695:1: rule__Actor__Group_2_2__3 : rule__Actor__Group_2_2__3__Impl ;
    public final void rule__Actor__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1699:1: ( rule__Actor__Group_2_2__3__Impl )
            // InternalSequence.g:1700:2: rule__Actor__Group_2_2__3__Impl
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
    // InternalSequence.g:1706:1: rule__Actor__Group_2_2__3__Impl : ( ( rule__Actor__AliasAssignment_2_2_3 ) ) ;
    public final void rule__Actor__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1710:1: ( ( ( rule__Actor__AliasAssignment_2_2_3 ) ) )
            // InternalSequence.g:1711:1: ( ( rule__Actor__AliasAssignment_2_2_3 ) )
            {
            // InternalSequence.g:1711:1: ( ( rule__Actor__AliasAssignment_2_2_3 ) )
            // InternalSequence.g:1712:2: ( rule__Actor__AliasAssignment_2_2_3 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_2_3()); 
            // InternalSequence.g:1713:2: ( rule__Actor__AliasAssignment_2_2_3 )
            // InternalSequence.g:1713:3: rule__Actor__AliasAssignment_2_2_3
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


    // $ANTLR start "rule__Actor__Group_2_2_1__0"
    // InternalSequence.g:1722:1: rule__Actor__Group_2_2_1__0 : rule__Actor__Group_2_2_1__0__Impl rule__Actor__Group_2_2_1__1 ;
    public final void rule__Actor__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1726:1: ( rule__Actor__Group_2_2_1__0__Impl rule__Actor__Group_2_2_1__1 )
            // InternalSequence.g:1727:2: rule__Actor__Group_2_2_1__0__Impl rule__Actor__Group_2_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group_2_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_2_1__0"


    // $ANTLR start "rule__Actor__Group_2_2_1__0__Impl"
    // InternalSequence.g:1734:1: rule__Actor__Group_2_2_1__0__Impl : ( ':' ) ;
    public final void rule__Actor__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1738:1: ( ( ':' ) )
            // InternalSequence.g:1739:1: ( ':' )
            {
            // InternalSequence.g:1739:1: ( ':' )
            // InternalSequence.g:1740:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_2_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_2_1__0__Impl"


    // $ANTLR start "rule__Actor__Group_2_2_1__1"
    // InternalSequence.g:1749:1: rule__Actor__Group_2_2_1__1 : rule__Actor__Group_2_2_1__1__Impl ;
    public final void rule__Actor__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1753:1: ( rule__Actor__Group_2_2_1__1__Impl )
            // InternalSequence.g:1754:2: rule__Actor__Group_2_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_2_1__1"


    // $ANTLR start "rule__Actor__Group_2_2_1__1__Impl"
    // InternalSequence.g:1760:1: rule__Actor__Group_2_2_1__1__Impl : ( ( rule__Actor__TypeAssignment_2_2_1_1 ) ) ;
    public final void rule__Actor__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1764:1: ( ( ( rule__Actor__TypeAssignment_2_2_1_1 ) ) )
            // InternalSequence.g:1765:1: ( ( rule__Actor__TypeAssignment_2_2_1_1 ) )
            {
            // InternalSequence.g:1765:1: ( ( rule__Actor__TypeAssignment_2_2_1_1 ) )
            // InternalSequence.g:1766:2: ( rule__Actor__TypeAssignment_2_2_1_1 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_2_2_1_1()); 
            // InternalSequence.g:1767:2: ( rule__Actor__TypeAssignment_2_2_1_1 )
            // InternalSequence.g:1767:3: rule__Actor__TypeAssignment_2_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeAssignment_2_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_2_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_2_1__1__Impl"


    // $ANTLR start "rule__Actor__Group_3__0"
    // InternalSequence.g:1776:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1780:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // InternalSequence.g:1781:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
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
    // InternalSequence.g:1788:1: rule__Actor__Group_3__0__Impl : ( 'role[' ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1792:1: ( ( 'role[' ) )
            // InternalSequence.g:1793:1: ( 'role[' )
            {
            // InternalSequence.g:1793:1: ( 'role[' )
            // InternalSequence.g:1794:2: 'role['
            {
             before(grammarAccess.getActorAccess().getRoleKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSequence.g:1803:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1807:1: ( rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 )
            // InternalSequence.g:1808:2: rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2
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
    // InternalSequence.g:1815:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1819:1: ( ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) )
            // InternalSequence.g:1820:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            {
            // InternalSequence.g:1820:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            // InternalSequence.g:1821:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            {
             before(grammarAccess.getActorAccess().getActorTypeAssignment_3_1()); 
            // InternalSequence.g:1822:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            // InternalSequence.g:1822:3: rule__Actor__ActorTypeAssignment_3_1
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
    // InternalSequence.g:1830:1: rule__Actor__Group_3__2 : rule__Actor__Group_3__2__Impl ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1834:1: ( rule__Actor__Group_3__2__Impl )
            // InternalSequence.g:1835:2: rule__Actor__Group_3__2__Impl
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
    // InternalSequence.g:1841:1: rule__Actor__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Actor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1845:1: ( ( ']' ) )
            // InternalSequence.g:1846:1: ( ']' )
            {
            // InternalSequence.g:1846:1: ( ']' )
            // InternalSequence.g:1847:2: ']'
            {
             before(grammarAccess.getActorAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__BehaviorFragments__Group_0__0"
    // InternalSequence.g:1857:1: rule__BehaviorFragments__Group_0__0 : rule__BehaviorFragments__Group_0__0__Impl rule__BehaviorFragments__Group_0__1 ;
    public final void rule__BehaviorFragments__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1861:1: ( rule__BehaviorFragments__Group_0__0__Impl rule__BehaviorFragments__Group_0__1 )
            // InternalSequence.g:1862:2: rule__BehaviorFragments__Group_0__0__Impl rule__BehaviorFragments__Group_0__1
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
    // InternalSequence.g:1869:1: rule__BehaviorFragments__Group_0__0__Impl : ( '{' ) ;
    public final void rule__BehaviorFragments__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1873:1: ( ( '{' ) )
            // InternalSequence.g:1874:1: ( '{' )
            {
            // InternalSequence.g:1874:1: ( '{' )
            // InternalSequence.g:1875:2: '{'
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
    // InternalSequence.g:1884:1: rule__BehaviorFragments__Group_0__1 : rule__BehaviorFragments__Group_0__1__Impl rule__BehaviorFragments__Group_0__2 ;
    public final void rule__BehaviorFragments__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1888:1: ( rule__BehaviorFragments__Group_0__1__Impl rule__BehaviorFragments__Group_0__2 )
            // InternalSequence.g:1889:2: rule__BehaviorFragments__Group_0__1__Impl rule__BehaviorFragments__Group_0__2
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
    // InternalSequence.g:1896:1: rule__BehaviorFragments__Group_0__1__Impl : ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) ) ;
    public final void rule__BehaviorFragments__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1900:1: ( ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) ) )
            // InternalSequence.g:1901:1: ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) )
            {
            // InternalSequence.g:1901:1: ( ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* ) )
            // InternalSequence.g:1902:2: ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) ) ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* )
            {
            // InternalSequence.g:1902:2: ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 ) )
            // InternalSequence.g:1903:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_0_1()); 
            // InternalSequence.g:1904:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )
            // InternalSequence.g:1904:4: rule__BehaviorFragments__FragmentsAssignment_0_1
            {
            pushFollow(FOLLOW_10);
            rule__BehaviorFragments__FragmentsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_0_1()); 

            }

            // InternalSequence.g:1907:2: ( ( rule__BehaviorFragments__FragmentsAssignment_0_1 )* )
            // InternalSequence.g:1908:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )*
            {
             before(grammarAccess.getBehaviorFragmentsAccess().getFragmentsAssignment_0_1()); 
            // InternalSequence.g:1909:3: ( rule__BehaviorFragments__FragmentsAssignment_0_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=13)||(LA18_0>=36 && LA18_0<=45)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSequence.g:1909:4: rule__BehaviorFragments__FragmentsAssignment_0_1
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
    // InternalSequence.g:1918:1: rule__BehaviorFragments__Group_0__2 : rule__BehaviorFragments__Group_0__2__Impl ;
    public final void rule__BehaviorFragments__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1922:1: ( rule__BehaviorFragments__Group_0__2__Impl )
            // InternalSequence.g:1923:2: rule__BehaviorFragments__Group_0__2__Impl
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
    // InternalSequence.g:1929:1: rule__BehaviorFragments__Group_0__2__Impl : ( '}' ) ;
    public final void rule__BehaviorFragments__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1933:1: ( ( '}' ) )
            // InternalSequence.g:1934:1: ( '}' )
            {
            // InternalSequence.g:1934:1: ( '}' )
            // InternalSequence.g:1935:2: '}'
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
    // InternalSequence.g:1945:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1949:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalSequence.g:1950:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalSequence.g:1957:1: rule__Message__Group__0__Impl : ( ( rule__Message__Alternatives_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1961:1: ( ( ( rule__Message__Alternatives_0 ) ) )
            // InternalSequence.g:1962:1: ( ( rule__Message__Alternatives_0 ) )
            {
            // InternalSequence.g:1962:1: ( ( rule__Message__Alternatives_0 ) )
            // InternalSequence.g:1963:2: ( rule__Message__Alternatives_0 )
            {
             before(grammarAccess.getMessageAccess().getAlternatives_0()); 
            // InternalSequence.g:1964:2: ( rule__Message__Alternatives_0 )
            // InternalSequence.g:1964:3: rule__Message__Alternatives_0
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
    // InternalSequence.g:1972:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1976:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalSequence.g:1977:2: rule__Message__Group__1__Impl rule__Message__Group__2
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
    // InternalSequence.g:1984:1: rule__Message__Group__1__Impl : ( ( rule__Message__Group_1__0 )? ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1988:1: ( ( ( rule__Message__Group_1__0 )? ) )
            // InternalSequence.g:1989:1: ( ( rule__Message__Group_1__0 )? )
            {
            // InternalSequence.g:1989:1: ( ( rule__Message__Group_1__0 )? )
            // InternalSequence.g:1990:2: ( rule__Message__Group_1__0 )?
            {
             before(grammarAccess.getMessageAccess().getGroup_1()); 
            // InternalSequence.g:1991:2: ( rule__Message__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSequence.g:1991:3: rule__Message__Group_1__0
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
    // InternalSequence.g:1999:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2003:1: ( rule__Message__Group__2__Impl )
            // InternalSequence.g:2004:2: rule__Message__Group__2__Impl
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
    // InternalSequence.g:2010:1: rule__Message__Group__2__Impl : ( ( rule__Message__TimeConstraintAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2014:1: ( ( ( rule__Message__TimeConstraintAssignment_2 )? ) )
            // InternalSequence.g:2015:1: ( ( rule__Message__TimeConstraintAssignment_2 )? )
            {
            // InternalSequence.g:2015:1: ( ( rule__Message__TimeConstraintAssignment_2 )? )
            // InternalSequence.g:2016:2: ( rule__Message__TimeConstraintAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getTimeConstraintAssignment_2()); 
            // InternalSequence.g:2017:2: ( rule__Message__TimeConstraintAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSequence.g:2017:3: rule__Message__TimeConstraintAssignment_2
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
    // InternalSequence.g:2026:1: rule__Message__Group_1__0 : rule__Message__Group_1__0__Impl rule__Message__Group_1__1 ;
    public final void rule__Message__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2030:1: ( rule__Message__Group_1__0__Impl rule__Message__Group_1__1 )
            // InternalSequence.g:2031:2: rule__Message__Group_1__0__Impl rule__Message__Group_1__1
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
    // InternalSequence.g:2038:1: rule__Message__Group_1__0__Impl : ( 'num[' ) ;
    public final void rule__Message__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2042:1: ( ( 'num[' ) )
            // InternalSequence.g:2043:1: ( 'num[' )
            {
            // InternalSequence.g:2043:1: ( 'num[' )
            // InternalSequence.g:2044:2: 'num['
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
    // InternalSequence.g:2053:1: rule__Message__Group_1__1 : rule__Message__Group_1__1__Impl rule__Message__Group_1__2 ;
    public final void rule__Message__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2057:1: ( rule__Message__Group_1__1__Impl rule__Message__Group_1__2 )
            // InternalSequence.g:2058:2: rule__Message__Group_1__1__Impl rule__Message__Group_1__2
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
    // InternalSequence.g:2065:1: rule__Message__Group_1__1__Impl : ( ( rule__Message__OrderAssignment_1_1 ) ) ;
    public final void rule__Message__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2069:1: ( ( ( rule__Message__OrderAssignment_1_1 ) ) )
            // InternalSequence.g:2070:1: ( ( rule__Message__OrderAssignment_1_1 ) )
            {
            // InternalSequence.g:2070:1: ( ( rule__Message__OrderAssignment_1_1 ) )
            // InternalSequence.g:2071:2: ( rule__Message__OrderAssignment_1_1 )
            {
             before(grammarAccess.getMessageAccess().getOrderAssignment_1_1()); 
            // InternalSequence.g:2072:2: ( rule__Message__OrderAssignment_1_1 )
            // InternalSequence.g:2072:3: rule__Message__OrderAssignment_1_1
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
    // InternalSequence.g:2080:1: rule__Message__Group_1__2 : rule__Message__Group_1__2__Impl ;
    public final void rule__Message__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2084:1: ( rule__Message__Group_1__2__Impl )
            // InternalSequence.g:2085:2: rule__Message__Group_1__2__Impl
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
    // InternalSequence.g:2091:1: rule__Message__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Message__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2095:1: ( ( ']' ) )
            // InternalSequence.g:2096:1: ( ']' )
            {
            // InternalSequence.g:2096:1: ( ']' )
            // InternalSequence.g:2097:2: ']'
            {
             before(grammarAccess.getMessageAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSequence.g:2107:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2111:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // InternalSequence.g:2112:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
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
    // InternalSequence.g:2119:1: rule__TimeConstraint__Group__0__Impl : ( 'time[' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2123:1: ( ( 'time[' ) )
            // InternalSequence.g:2124:1: ( 'time[' )
            {
            // InternalSequence.g:2124:1: ( 'time[' )
            // InternalSequence.g:2125:2: 'time['
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
    // InternalSequence.g:2134:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2138:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // InternalSequence.g:2139:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
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
    // InternalSequence.g:2146:1: rule__TimeConstraint__Group__1__Impl : ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2150:1: ( ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) ) )
            // InternalSequence.g:2151:1: ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) )
            {
            // InternalSequence.g:2151:1: ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) )
            // InternalSequence.g:2152:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* )
            {
            // InternalSequence.g:2152:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) )
            // InternalSequence.g:2153:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 
            // InternalSequence.g:2154:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )
            // InternalSequence.g:2154:4: rule__TimeConstraint__ConstraintsAssignment_1
            {
            pushFollow(FOLLOW_23);
            rule__TimeConstraint__ConstraintsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 

            }

            // InternalSequence.g:2157:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* )
            // InternalSequence.g:2158:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 
            // InternalSequence.g:2159:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=16 && LA21_0<=19)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSequence.g:2159:4: rule__TimeConstraint__ConstraintsAssignment_1
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
    // InternalSequence.g:2168:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2172:1: ( rule__TimeConstraint__Group__2__Impl )
            // InternalSequence.g:2173:2: rule__TimeConstraint__Group__2__Impl
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
    // InternalSequence.g:2179:1: rule__TimeConstraint__Group__2__Impl : ( ']' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2183:1: ( ( ']' ) )
            // InternalSequence.g:2184:1: ( ']' )
            {
            // InternalSequence.g:2184:1: ( ']' )
            // InternalSequence.g:2185:2: ']'
            {
             before(grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSequence.g:2195:1: rule__InnerTimeConstraint__Group__0 : rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1 ;
    public final void rule__InnerTimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2199:1: ( rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1 )
            // InternalSequence.g:2200:2: rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1
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
    // InternalSequence.g:2207:1: rule__InnerTimeConstraint__Group__0__Impl : ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) ) ;
    public final void rule__InnerTimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2211:1: ( ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) ) )
            // InternalSequence.g:2212:1: ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) )
            {
            // InternalSequence.g:2212:1: ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) )
            // InternalSequence.g:2213:2: ( rule__InnerTimeConstraint__TypeAssignment_0 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getTypeAssignment_0()); 
            // InternalSequence.g:2214:2: ( rule__InnerTimeConstraint__TypeAssignment_0 )
            // InternalSequence.g:2214:3: rule__InnerTimeConstraint__TypeAssignment_0
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
    // InternalSequence.g:2222:1: rule__InnerTimeConstraint__Group__1 : rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2 ;
    public final void rule__InnerTimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2226:1: ( rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2 )
            // InternalSequence.g:2227:2: rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2
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
    // InternalSequence.g:2234:1: rule__InnerTimeConstraint__Group__1__Impl : ( '=' ) ;
    public final void rule__InnerTimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2238:1: ( ( '=' ) )
            // InternalSequence.g:2239:1: ( '=' )
            {
            // InternalSequence.g:2239:1: ( '=' )
            // InternalSequence.g:2240:2: '='
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
    // InternalSequence.g:2249:1: rule__InnerTimeConstraint__Group__2 : rule__InnerTimeConstraint__Group__2__Impl ;
    public final void rule__InnerTimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2253:1: ( rule__InnerTimeConstraint__Group__2__Impl )
            // InternalSequence.g:2254:2: rule__InnerTimeConstraint__Group__2__Impl
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
    // InternalSequence.g:2260:1: rule__InnerTimeConstraint__Group__2__Impl : ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) ) ;
    public final void rule__InnerTimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2264:1: ( ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) ) )
            // InternalSequence.g:2265:1: ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) )
            {
            // InternalSequence.g:2265:1: ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) )
            // InternalSequence.g:2266:2: ( rule__InnerTimeConstraint__ValueAssignment_2 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getValueAssignment_2()); 
            // InternalSequence.g:2267:2: ( rule__InnerTimeConstraint__ValueAssignment_2 )
            // InternalSequence.g:2267:3: rule__InnerTimeConstraint__ValueAssignment_2
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
    // InternalSequence.g:2276:1: rule__StandardMessage__Group__0 : rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 ;
    public final void rule__StandardMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2280:1: ( rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 )
            // InternalSequence.g:2281:2: rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1
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
    // InternalSequence.g:2288:1: rule__StandardMessage__Group__0__Impl : ( ( rule__StandardMessage__TypeAssignment_0 ) ) ;
    public final void rule__StandardMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2292:1: ( ( ( rule__StandardMessage__TypeAssignment_0 ) ) )
            // InternalSequence.g:2293:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            {
            // InternalSequence.g:2293:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            // InternalSequence.g:2294:2: ( rule__StandardMessage__TypeAssignment_0 )
            {
             before(grammarAccess.getStandardMessageAccess().getTypeAssignment_0()); 
            // InternalSequence.g:2295:2: ( rule__StandardMessage__TypeAssignment_0 )
            // InternalSequence.g:2295:3: rule__StandardMessage__TypeAssignment_0
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
    // InternalSequence.g:2303:1: rule__StandardMessage__Group__1 : rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 ;
    public final void rule__StandardMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2307:1: ( rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 )
            // InternalSequence.g:2308:2: rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2
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
    // InternalSequence.g:2315:1: rule__StandardMessage__Group__1__Impl : ( ( rule__StandardMessage__NameAssignment_1 ) ) ;
    public final void rule__StandardMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2319:1: ( ( ( rule__StandardMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:2320:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:2320:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            // InternalSequence.g:2321:2: ( rule__StandardMessage__NameAssignment_1 )
            {
             before(grammarAccess.getStandardMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:2322:2: ( rule__StandardMessage__NameAssignment_1 )
            // InternalSequence.g:2322:3: rule__StandardMessage__NameAssignment_1
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
    // InternalSequence.g:2330:1: rule__StandardMessage__Group__2 : rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 ;
    public final void rule__StandardMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2334:1: ( rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 )
            // InternalSequence.g:2335:2: rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3
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
    // InternalSequence.g:2342:1: rule__StandardMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__StandardMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2346:1: ( ( '(' ) )
            // InternalSequence.g:2347:1: ( '(' )
            {
            // InternalSequence.g:2347:1: ( '(' )
            // InternalSequence.g:2348:2: '('
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
    // InternalSequence.g:2357:1: rule__StandardMessage__Group__3 : rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 ;
    public final void rule__StandardMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2361:1: ( rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 )
            // InternalSequence.g:2362:2: rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4
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
    // InternalSequence.g:2369:1: rule__StandardMessage__Group__3__Impl : ( ( rule__StandardMessage__LeftAssignment_3 ) ) ;
    public final void rule__StandardMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2373:1: ( ( ( rule__StandardMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:2374:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:2374:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            // InternalSequence.g:2375:2: ( rule__StandardMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:2376:2: ( rule__StandardMessage__LeftAssignment_3 )
            // InternalSequence.g:2376:3: rule__StandardMessage__LeftAssignment_3
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
    // InternalSequence.g:2384:1: rule__StandardMessage__Group__4 : rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 ;
    public final void rule__StandardMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2388:1: ( rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 )
            // InternalSequence.g:2389:2: rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5
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
    // InternalSequence.g:2396:1: rule__StandardMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__StandardMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2400:1: ( ( ',' ) )
            // InternalSequence.g:2401:1: ( ',' )
            {
            // InternalSequence.g:2401:1: ( ',' )
            // InternalSequence.g:2402:2: ','
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
    // InternalSequence.g:2411:1: rule__StandardMessage__Group__5 : rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 ;
    public final void rule__StandardMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2415:1: ( rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 )
            // InternalSequence.g:2416:2: rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6
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
    // InternalSequence.g:2423:1: rule__StandardMessage__Group__5__Impl : ( ( rule__StandardMessage__RightAssignment_5 ) ) ;
    public final void rule__StandardMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2427:1: ( ( ( rule__StandardMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:2428:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:2428:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            // InternalSequence.g:2429:2: ( rule__StandardMessage__RightAssignment_5 )
            {
             before(grammarAccess.getStandardMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:2430:2: ( rule__StandardMessage__RightAssignment_5 )
            // InternalSequence.g:2430:3: rule__StandardMessage__RightAssignment_5
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
    // InternalSequence.g:2438:1: rule__StandardMessage__Group__6 : rule__StandardMessage__Group__6__Impl ;
    public final void rule__StandardMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2442:1: ( rule__StandardMessage__Group__6__Impl )
            // InternalSequence.g:2443:2: rule__StandardMessage__Group__6__Impl
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
    // InternalSequence.g:2449:1: rule__StandardMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__StandardMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2453:1: ( ( ')' ) )
            // InternalSequence.g:2454:1: ( ')' )
            {
            // InternalSequence.g:2454:1: ( ')' )
            // InternalSequence.g:2455:2: ')'
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
    // InternalSequence.g:2465:1: rule__ResponseMessage__Group__0 : rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 ;
    public final void rule__ResponseMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2469:1: ( rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 )
            // InternalSequence.g:2470:2: rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1
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
    // InternalSequence.g:2477:1: rule__ResponseMessage__Group__0__Impl : ( 'resp' ) ;
    public final void rule__ResponseMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2481:1: ( ( 'resp' ) )
            // InternalSequence.g:2482:1: ( 'resp' )
            {
            // InternalSequence.g:2482:1: ( 'resp' )
            // InternalSequence.g:2483:2: 'resp'
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
    // InternalSequence.g:2492:1: rule__ResponseMessage__Group__1 : rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 ;
    public final void rule__ResponseMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2496:1: ( rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 )
            // InternalSequence.g:2497:2: rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2
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
    // InternalSequence.g:2504:1: rule__ResponseMessage__Group__1__Impl : ( ( rule__ResponseMessage__NameAssignment_1 ) ) ;
    public final void rule__ResponseMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2508:1: ( ( ( rule__ResponseMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:2509:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:2509:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            // InternalSequence.g:2510:2: ( rule__ResponseMessage__NameAssignment_1 )
            {
             before(grammarAccess.getResponseMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:2511:2: ( rule__ResponseMessage__NameAssignment_1 )
            // InternalSequence.g:2511:3: rule__ResponseMessage__NameAssignment_1
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
    // InternalSequence.g:2519:1: rule__ResponseMessage__Group__2 : rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 ;
    public final void rule__ResponseMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2523:1: ( rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 )
            // InternalSequence.g:2524:2: rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3
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
    // InternalSequence.g:2531:1: rule__ResponseMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__ResponseMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2535:1: ( ( '(' ) )
            // InternalSequence.g:2536:1: ( '(' )
            {
            // InternalSequence.g:2536:1: ( '(' )
            // InternalSequence.g:2537:2: '('
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
    // InternalSequence.g:2546:1: rule__ResponseMessage__Group__3 : rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 ;
    public final void rule__ResponseMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2550:1: ( rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 )
            // InternalSequence.g:2551:2: rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4
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
    // InternalSequence.g:2558:1: rule__ResponseMessage__Group__3__Impl : ( ( rule__ResponseMessage__Alternatives_3 ) ) ;
    public final void rule__ResponseMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2562:1: ( ( ( rule__ResponseMessage__Alternatives_3 ) ) )
            // InternalSequence.g:2563:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            {
            // InternalSequence.g:2563:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            // InternalSequence.g:2564:2: ( rule__ResponseMessage__Alternatives_3 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_3()); 
            // InternalSequence.g:2565:2: ( rule__ResponseMessage__Alternatives_3 )
            // InternalSequence.g:2565:3: rule__ResponseMessage__Alternatives_3
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
    // InternalSequence.g:2573:1: rule__ResponseMessage__Group__4 : rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 ;
    public final void rule__ResponseMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2577:1: ( rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 )
            // InternalSequence.g:2578:2: rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5
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
    // InternalSequence.g:2585:1: rule__ResponseMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__ResponseMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2589:1: ( ( ',' ) )
            // InternalSequence.g:2590:1: ( ',' )
            {
            // InternalSequence.g:2590:1: ( ',' )
            // InternalSequence.g:2591:2: ','
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
    // InternalSequence.g:2600:1: rule__ResponseMessage__Group__5 : rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 ;
    public final void rule__ResponseMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2604:1: ( rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 )
            // InternalSequence.g:2605:2: rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6
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
    // InternalSequence.g:2612:1: rule__ResponseMessage__Group__5__Impl : ( ( rule__ResponseMessage__Alternatives_5 ) ) ;
    public final void rule__ResponseMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2616:1: ( ( ( rule__ResponseMessage__Alternatives_5 ) ) )
            // InternalSequence.g:2617:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            {
            // InternalSequence.g:2617:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            // InternalSequence.g:2618:2: ( rule__ResponseMessage__Alternatives_5 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_5()); 
            // InternalSequence.g:2619:2: ( rule__ResponseMessage__Alternatives_5 )
            // InternalSequence.g:2619:3: rule__ResponseMessage__Alternatives_5
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
    // InternalSequence.g:2627:1: rule__ResponseMessage__Group__6 : rule__ResponseMessage__Group__6__Impl ;
    public final void rule__ResponseMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2631:1: ( rule__ResponseMessage__Group__6__Impl )
            // InternalSequence.g:2632:2: rule__ResponseMessage__Group__6__Impl
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
    // InternalSequence.g:2638:1: rule__ResponseMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__ResponseMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2642:1: ( ( ')' ) )
            // InternalSequence.g:2643:1: ( ')' )
            {
            // InternalSequence.g:2643:1: ( ')' )
            // InternalSequence.g:2644:2: ')'
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
    // InternalSequence.g:2654:1: rule__FoundMessage__Group__0 : rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 ;
    public final void rule__FoundMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2658:1: ( rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 )
            // InternalSequence.g:2659:2: rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1
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
    // InternalSequence.g:2666:1: rule__FoundMessage__Group__0__Impl : ( ( 'found' )? ) ;
    public final void rule__FoundMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2670:1: ( ( ( 'found' )? ) )
            // InternalSequence.g:2671:1: ( ( 'found' )? )
            {
            // InternalSequence.g:2671:1: ( ( 'found' )? )
            // InternalSequence.g:2672:2: ( 'found' )?
            {
             before(grammarAccess.getFoundMessageAccess().getFoundKeyword_0()); 
            // InternalSequence.g:2673:2: ( 'found' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSequence.g:2673:3: 'found'
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
    // InternalSequence.g:2681:1: rule__FoundMessage__Group__1 : rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 ;
    public final void rule__FoundMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2685:1: ( rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 )
            // InternalSequence.g:2686:2: rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2
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
    // InternalSequence.g:2693:1: rule__FoundMessage__Group__1__Impl : ( ( rule__FoundMessage__TypeAssignment_1 ) ) ;
    public final void rule__FoundMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2697:1: ( ( ( rule__FoundMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:2698:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:2698:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            // InternalSequence.g:2699:2: ( rule__FoundMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getFoundMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:2700:2: ( rule__FoundMessage__TypeAssignment_1 )
            // InternalSequence.g:2700:3: rule__FoundMessage__TypeAssignment_1
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
    // InternalSequence.g:2708:1: rule__FoundMessage__Group__2 : rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 ;
    public final void rule__FoundMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2712:1: ( rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 )
            // InternalSequence.g:2713:2: rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3
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
    // InternalSequence.g:2720:1: rule__FoundMessage__Group__2__Impl : ( ( rule__FoundMessage__NameAssignment_2 ) ) ;
    public final void rule__FoundMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2724:1: ( ( ( rule__FoundMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:2725:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:2725:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            // InternalSequence.g:2726:2: ( rule__FoundMessage__NameAssignment_2 )
            {
             before(grammarAccess.getFoundMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:2727:2: ( rule__FoundMessage__NameAssignment_2 )
            // InternalSequence.g:2727:3: rule__FoundMessage__NameAssignment_2
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
    // InternalSequence.g:2735:1: rule__FoundMessage__Group__3 : rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 ;
    public final void rule__FoundMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2739:1: ( rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 )
            // InternalSequence.g:2740:2: rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4
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
    // InternalSequence.g:2747:1: rule__FoundMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__FoundMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2751:1: ( ( '(' ) )
            // InternalSequence.g:2752:1: ( '(' )
            {
            // InternalSequence.g:2752:1: ( '(' )
            // InternalSequence.g:2753:2: '('
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
    // InternalSequence.g:2762:1: rule__FoundMessage__Group__4 : rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 ;
    public final void rule__FoundMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2766:1: ( rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 )
            // InternalSequence.g:2767:2: rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5
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
    // InternalSequence.g:2774:1: rule__FoundMessage__Group__4__Impl : ( '_' ) ;
    public final void rule__FoundMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2778:1: ( ( '_' ) )
            // InternalSequence.g:2779:1: ( '_' )
            {
            // InternalSequence.g:2779:1: ( '_' )
            // InternalSequence.g:2780:2: '_'
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
    // InternalSequence.g:2789:1: rule__FoundMessage__Group__5 : rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 ;
    public final void rule__FoundMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2793:1: ( rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 )
            // InternalSequence.g:2794:2: rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6
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
    // InternalSequence.g:2801:1: rule__FoundMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__FoundMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2805:1: ( ( ',' ) )
            // InternalSequence.g:2806:1: ( ',' )
            {
            // InternalSequence.g:2806:1: ( ',' )
            // InternalSequence.g:2807:2: ','
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
    // InternalSequence.g:2816:1: rule__FoundMessage__Group__6 : rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 ;
    public final void rule__FoundMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2820:1: ( rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 )
            // InternalSequence.g:2821:2: rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7
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
    // InternalSequence.g:2828:1: rule__FoundMessage__Group__6__Impl : ( ( rule__FoundMessage__RightAssignment_6 ) ) ;
    public final void rule__FoundMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2832:1: ( ( ( rule__FoundMessage__RightAssignment_6 ) ) )
            // InternalSequence.g:2833:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            {
            // InternalSequence.g:2833:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            // InternalSequence.g:2834:2: ( rule__FoundMessage__RightAssignment_6 )
            {
             before(grammarAccess.getFoundMessageAccess().getRightAssignment_6()); 
            // InternalSequence.g:2835:2: ( rule__FoundMessage__RightAssignment_6 )
            // InternalSequence.g:2835:3: rule__FoundMessage__RightAssignment_6
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
    // InternalSequence.g:2843:1: rule__FoundMessage__Group__7 : rule__FoundMessage__Group__7__Impl ;
    public final void rule__FoundMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2847:1: ( rule__FoundMessage__Group__7__Impl )
            // InternalSequence.g:2848:2: rule__FoundMessage__Group__7__Impl
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
    // InternalSequence.g:2854:1: rule__FoundMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__FoundMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2858:1: ( ( ')' ) )
            // InternalSequence.g:2859:1: ( ')' )
            {
            // InternalSequence.g:2859:1: ( ')' )
            // InternalSequence.g:2860:2: ')'
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
    // InternalSequence.g:2870:1: rule__LostMessage__Group__0 : rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 ;
    public final void rule__LostMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2874:1: ( rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 )
            // InternalSequence.g:2875:2: rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1
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
    // InternalSequence.g:2882:1: rule__LostMessage__Group__0__Impl : ( ( 'lost' )? ) ;
    public final void rule__LostMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2886:1: ( ( ( 'lost' )? ) )
            // InternalSequence.g:2887:1: ( ( 'lost' )? )
            {
            // InternalSequence.g:2887:1: ( ( 'lost' )? )
            // InternalSequence.g:2888:2: ( 'lost' )?
            {
             before(grammarAccess.getLostMessageAccess().getLostKeyword_0()); 
            // InternalSequence.g:2889:2: ( 'lost' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSequence.g:2889:3: 'lost'
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
    // InternalSequence.g:2897:1: rule__LostMessage__Group__1 : rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 ;
    public final void rule__LostMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2901:1: ( rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 )
            // InternalSequence.g:2902:2: rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2
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
    // InternalSequence.g:2909:1: rule__LostMessage__Group__1__Impl : ( ( rule__LostMessage__TypeAssignment_1 ) ) ;
    public final void rule__LostMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2913:1: ( ( ( rule__LostMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:2914:1: ( ( rule__LostMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:2914:1: ( ( rule__LostMessage__TypeAssignment_1 ) )
            // InternalSequence.g:2915:2: ( rule__LostMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getLostMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:2916:2: ( rule__LostMessage__TypeAssignment_1 )
            // InternalSequence.g:2916:3: rule__LostMessage__TypeAssignment_1
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
    // InternalSequence.g:2924:1: rule__LostMessage__Group__2 : rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 ;
    public final void rule__LostMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2928:1: ( rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 )
            // InternalSequence.g:2929:2: rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3
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
    // InternalSequence.g:2936:1: rule__LostMessage__Group__2__Impl : ( ( rule__LostMessage__NameAssignment_2 ) ) ;
    public final void rule__LostMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2940:1: ( ( ( rule__LostMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:2941:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:2941:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            // InternalSequence.g:2942:2: ( rule__LostMessage__NameAssignment_2 )
            {
             before(grammarAccess.getLostMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:2943:2: ( rule__LostMessage__NameAssignment_2 )
            // InternalSequence.g:2943:3: rule__LostMessage__NameAssignment_2
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
    // InternalSequence.g:2951:1: rule__LostMessage__Group__3 : rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 ;
    public final void rule__LostMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2955:1: ( rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 )
            // InternalSequence.g:2956:2: rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4
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
    // InternalSequence.g:2963:1: rule__LostMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__LostMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2967:1: ( ( '(' ) )
            // InternalSequence.g:2968:1: ( '(' )
            {
            // InternalSequence.g:2968:1: ( '(' )
            // InternalSequence.g:2969:2: '('
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
    // InternalSequence.g:2978:1: rule__LostMessage__Group__4 : rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 ;
    public final void rule__LostMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2982:1: ( rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 )
            // InternalSequence.g:2983:2: rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5
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
    // InternalSequence.g:2990:1: rule__LostMessage__Group__4__Impl : ( ( rule__LostMessage__LeftAssignment_4 ) ) ;
    public final void rule__LostMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2994:1: ( ( ( rule__LostMessage__LeftAssignment_4 ) ) )
            // InternalSequence.g:2995:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            {
            // InternalSequence.g:2995:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            // InternalSequence.g:2996:2: ( rule__LostMessage__LeftAssignment_4 )
            {
             before(grammarAccess.getLostMessageAccess().getLeftAssignment_4()); 
            // InternalSequence.g:2997:2: ( rule__LostMessage__LeftAssignment_4 )
            // InternalSequence.g:2997:3: rule__LostMessage__LeftAssignment_4
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
    // InternalSequence.g:3005:1: rule__LostMessage__Group__5 : rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 ;
    public final void rule__LostMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3009:1: ( rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 )
            // InternalSequence.g:3010:2: rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6
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
    // InternalSequence.g:3017:1: rule__LostMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__LostMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3021:1: ( ( ',' ) )
            // InternalSequence.g:3022:1: ( ',' )
            {
            // InternalSequence.g:3022:1: ( ',' )
            // InternalSequence.g:3023:2: ','
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
    // InternalSequence.g:3032:1: rule__LostMessage__Group__6 : rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 ;
    public final void rule__LostMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3036:1: ( rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 )
            // InternalSequence.g:3037:2: rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7
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
    // InternalSequence.g:3044:1: rule__LostMessage__Group__6__Impl : ( '_' ) ;
    public final void rule__LostMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3048:1: ( ( '_' ) )
            // InternalSequence.g:3049:1: ( '_' )
            {
            // InternalSequence.g:3049:1: ( '_' )
            // InternalSequence.g:3050:2: '_'
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
    // InternalSequence.g:3059:1: rule__LostMessage__Group__7 : rule__LostMessage__Group__7__Impl ;
    public final void rule__LostMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3063:1: ( rule__LostMessage__Group__7__Impl )
            // InternalSequence.g:3064:2: rule__LostMessage__Group__7__Impl
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
    // InternalSequence.g:3070:1: rule__LostMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__LostMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3074:1: ( ( ')' ) )
            // InternalSequence.g:3075:1: ( ')' )
            {
            // InternalSequence.g:3075:1: ( ')' )
            // InternalSequence.g:3076:2: ')'
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
    // InternalSequence.g:3086:1: rule__CreateMessage__Group__0 : rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 ;
    public final void rule__CreateMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3090:1: ( rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 )
            // InternalSequence.g:3091:2: rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1
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
    // InternalSequence.g:3098:1: rule__CreateMessage__Group__0__Impl : ( 'create' ) ;
    public final void rule__CreateMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3102:1: ( ( 'create' ) )
            // InternalSequence.g:3103:1: ( 'create' )
            {
            // InternalSequence.g:3103:1: ( 'create' )
            // InternalSequence.g:3104:2: 'create'
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
    // InternalSequence.g:3113:1: rule__CreateMessage__Group__1 : rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 ;
    public final void rule__CreateMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3117:1: ( rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 )
            // InternalSequence.g:3118:2: rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2
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
    // InternalSequence.g:3125:1: rule__CreateMessage__Group__1__Impl : ( ( rule__CreateMessage__NameAssignment_1 )? ) ;
    public final void rule__CreateMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3129:1: ( ( ( rule__CreateMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:3130:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:3130:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            // InternalSequence.g:3131:2: ( rule__CreateMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getCreateMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3132:2: ( rule__CreateMessage__NameAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSequence.g:3132:3: rule__CreateMessage__NameAssignment_1
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
    // InternalSequence.g:3140:1: rule__CreateMessage__Group__2 : rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 ;
    public final void rule__CreateMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3144:1: ( rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 )
            // InternalSequence.g:3145:2: rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3
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
    // InternalSequence.g:3152:1: rule__CreateMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__CreateMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3156:1: ( ( '(' ) )
            // InternalSequence.g:3157:1: ( '(' )
            {
            // InternalSequence.g:3157:1: ( '(' )
            // InternalSequence.g:3158:2: '('
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
    // InternalSequence.g:3167:1: rule__CreateMessage__Group__3 : rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 ;
    public final void rule__CreateMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3171:1: ( rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 )
            // InternalSequence.g:3172:2: rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4
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
    // InternalSequence.g:3179:1: rule__CreateMessage__Group__3__Impl : ( ( rule__CreateMessage__LeftAssignment_3 ) ) ;
    public final void rule__CreateMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3183:1: ( ( ( rule__CreateMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:3184:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:3184:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            // InternalSequence.g:3185:2: ( rule__CreateMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:3186:2: ( rule__CreateMessage__LeftAssignment_3 )
            // InternalSequence.g:3186:3: rule__CreateMessage__LeftAssignment_3
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
    // InternalSequence.g:3194:1: rule__CreateMessage__Group__4 : rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 ;
    public final void rule__CreateMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3198:1: ( rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 )
            // InternalSequence.g:3199:2: rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5
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
    // InternalSequence.g:3206:1: rule__CreateMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__CreateMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3210:1: ( ( ',' ) )
            // InternalSequence.g:3211:1: ( ',' )
            {
            // InternalSequence.g:3211:1: ( ',' )
            // InternalSequence.g:3212:2: ','
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
    // InternalSequence.g:3221:1: rule__CreateMessage__Group__5 : rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 ;
    public final void rule__CreateMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3225:1: ( rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 )
            // InternalSequence.g:3226:2: rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6
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
    // InternalSequence.g:3233:1: rule__CreateMessage__Group__5__Impl : ( ( rule__CreateMessage__RightAssignment_5 ) ) ;
    public final void rule__CreateMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3237:1: ( ( ( rule__CreateMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:3238:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:3238:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            // InternalSequence.g:3239:2: ( rule__CreateMessage__RightAssignment_5 )
            {
             before(grammarAccess.getCreateMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:3240:2: ( rule__CreateMessage__RightAssignment_5 )
            // InternalSequence.g:3240:3: rule__CreateMessage__RightAssignment_5
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
    // InternalSequence.g:3248:1: rule__CreateMessage__Group__6 : rule__CreateMessage__Group__6__Impl ;
    public final void rule__CreateMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3252:1: ( rule__CreateMessage__Group__6__Impl )
            // InternalSequence.g:3253:2: rule__CreateMessage__Group__6__Impl
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
    // InternalSequence.g:3259:1: rule__CreateMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__CreateMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3263:1: ( ( ')' ) )
            // InternalSequence.g:3264:1: ( ')' )
            {
            // InternalSequence.g:3264:1: ( ')' )
            // InternalSequence.g:3265:2: ')'
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
    // InternalSequence.g:3275:1: rule__DestructionMessage__Group__0 : rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 ;
    public final void rule__DestructionMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3279:1: ( rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 )
            // InternalSequence.g:3280:2: rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1
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
    // InternalSequence.g:3287:1: rule__DestructionMessage__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3291:1: ( ( 'dest' ) )
            // InternalSequence.g:3292:1: ( 'dest' )
            {
            // InternalSequence.g:3292:1: ( 'dest' )
            // InternalSequence.g:3293:2: 'dest'
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
    // InternalSequence.g:3302:1: rule__DestructionMessage__Group__1 : rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 ;
    public final void rule__DestructionMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3306:1: ( rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 )
            // InternalSequence.g:3307:2: rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2
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
    // InternalSequence.g:3314:1: rule__DestructionMessage__Group__1__Impl : ( ( rule__DestructionMessage__NameAssignment_1 )? ) ;
    public final void rule__DestructionMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3318:1: ( ( ( rule__DestructionMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:3319:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:3319:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            // InternalSequence.g:3320:2: ( rule__DestructionMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getDestructionMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3321:2: ( rule__DestructionMessage__NameAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSequence.g:3321:3: rule__DestructionMessage__NameAssignment_1
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
    // InternalSequence.g:3329:1: rule__DestructionMessage__Group__2 : rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 ;
    public final void rule__DestructionMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3333:1: ( rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 )
            // InternalSequence.g:3334:2: rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3
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
    // InternalSequence.g:3341:1: rule__DestructionMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__DestructionMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3345:1: ( ( '(' ) )
            // InternalSequence.g:3346:1: ( '(' )
            {
            // InternalSequence.g:3346:1: ( '(' )
            // InternalSequence.g:3347:2: '('
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
    // InternalSequence.g:3356:1: rule__DestructionMessage__Group__3 : rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 ;
    public final void rule__DestructionMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3360:1: ( rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 )
            // InternalSequence.g:3361:2: rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4
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
    // InternalSequence.g:3368:1: rule__DestructionMessage__Group__3__Impl : ( ( rule__DestructionMessage__LeftAssignment_3 ) ) ;
    public final void rule__DestructionMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3372:1: ( ( ( rule__DestructionMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:3373:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:3373:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            // InternalSequence.g:3374:2: ( rule__DestructionMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:3375:2: ( rule__DestructionMessage__LeftAssignment_3 )
            // InternalSequence.g:3375:3: rule__DestructionMessage__LeftAssignment_3
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
    // InternalSequence.g:3383:1: rule__DestructionMessage__Group__4 : rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 ;
    public final void rule__DestructionMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3387:1: ( rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 )
            // InternalSequence.g:3388:2: rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5
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
    // InternalSequence.g:3395:1: rule__DestructionMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__DestructionMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3399:1: ( ( ',' ) )
            // InternalSequence.g:3400:1: ( ',' )
            {
            // InternalSequence.g:3400:1: ( ',' )
            // InternalSequence.g:3401:2: ','
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
    // InternalSequence.g:3410:1: rule__DestructionMessage__Group__5 : rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 ;
    public final void rule__DestructionMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3414:1: ( rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 )
            // InternalSequence.g:3415:2: rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6
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
    // InternalSequence.g:3422:1: rule__DestructionMessage__Group__5__Impl : ( ( rule__DestructionMessage__RightAssignment_5 ) ) ;
    public final void rule__DestructionMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3426:1: ( ( ( rule__DestructionMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:3427:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:3427:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            // InternalSequence.g:3428:2: ( rule__DestructionMessage__RightAssignment_5 )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:3429:2: ( rule__DestructionMessage__RightAssignment_5 )
            // InternalSequence.g:3429:3: rule__DestructionMessage__RightAssignment_5
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
    // InternalSequence.g:3437:1: rule__DestructionMessage__Group__6 : rule__DestructionMessage__Group__6__Impl ;
    public final void rule__DestructionMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3441:1: ( rule__DestructionMessage__Group__6__Impl )
            // InternalSequence.g:3442:2: rule__DestructionMessage__Group__6__Impl
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
    // InternalSequence.g:3448:1: rule__DestructionMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__DestructionMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3452:1: ( ( ')' ) )
            // InternalSequence.g:3453:1: ( ')' )
            {
            // InternalSequence.g:3453:1: ( ')' )
            // InternalSequence.g:3454:2: ')'
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
    // InternalSequence.g:3464:1: rule__DestructionOccurenceSpecification__Group__0 : rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 ;
    public final void rule__DestructionOccurenceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3468:1: ( rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 )
            // InternalSequence.g:3469:2: rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1
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
    // InternalSequence.g:3476:1: rule__DestructionOccurenceSpecification__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionOccurenceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3480:1: ( ( 'dest' ) )
            // InternalSequence.g:3481:1: ( 'dest' )
            {
            // InternalSequence.g:3481:1: ( 'dest' )
            // InternalSequence.g:3482:2: 'dest'
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
    // InternalSequence.g:3491:1: rule__DestructionOccurenceSpecification__Group__1 : rule__DestructionOccurenceSpecification__Group__1__Impl ;
    public final void rule__DestructionOccurenceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3495:1: ( rule__DestructionOccurenceSpecification__Group__1__Impl )
            // InternalSequence.g:3496:2: rule__DestructionOccurenceSpecification__Group__1__Impl
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
    // InternalSequence.g:3502:1: rule__DestructionOccurenceSpecification__Group__1__Impl : ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) ) ;
    public final void rule__DestructionOccurenceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3506:1: ( ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) ) )
            // InternalSequence.g:3507:1: ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) )
            {
            // InternalSequence.g:3507:1: ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) )
            // InternalSequence.g:3508:2: ( rule__DestructionOccurenceSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getNameAssignment_1()); 
            // InternalSequence.g:3509:2: ( rule__DestructionOccurenceSpecification__NameAssignment_1 )
            // InternalSequence.g:3509:3: rule__DestructionOccurenceSpecification__NameAssignment_1
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
    // InternalSequence.g:3518:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3522:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // InternalSequence.g:3523:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
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
    // InternalSequence.g:3530:1: rule__Alternative__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3534:1: ( ( 'alt' ) )
            // InternalSequence.g:3535:1: ( 'alt' )
            {
            // InternalSequence.g:3535:1: ( 'alt' )
            // InternalSequence.g:3536:2: 'alt'
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
    // InternalSequence.g:3545:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3549:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // InternalSequence.g:3550:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
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
    // InternalSequence.g:3557:1: rule__Alternative__Group__1__Impl : ( '{' ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3561:1: ( ( '{' ) )
            // InternalSequence.g:3562:1: ( '{' )
            {
            // InternalSequence.g:3562:1: ( '{' )
            // InternalSequence.g:3563:2: '{'
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
    // InternalSequence.g:3572:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3576:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // InternalSequence.g:3577:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
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
    // InternalSequence.g:3584:1: rule__Alternative__Group__2__Impl : ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3588:1: ( ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) ) )
            // InternalSequence.g:3589:1: ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) )
            {
            // InternalSequence.g:3589:1: ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) )
            // InternalSequence.g:3590:2: ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* )
            {
            // InternalSequence.g:3590:2: ( ( rule__Alternative__AlternativesAssignment_2 ) )
            // InternalSequence.g:3591:3: ( rule__Alternative__AlternativesAssignment_2 )
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 
            // InternalSequence.g:3592:3: ( rule__Alternative__AlternativesAssignment_2 )
            // InternalSequence.g:3592:4: rule__Alternative__AlternativesAssignment_2
            {
            pushFollow(FOLLOW_35);
            rule__Alternative__AlternativesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 

            }

            // InternalSequence.g:3595:2: ( ( rule__Alternative__AlternativesAssignment_2 )* )
            // InternalSequence.g:3596:3: ( rule__Alternative__AlternativesAssignment_2 )*
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 
            // InternalSequence.g:3597:3: ( rule__Alternative__AlternativesAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==46) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSequence.g:3597:4: rule__Alternative__AlternativesAssignment_2
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
    // InternalSequence.g:3606:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3610:1: ( rule__Alternative__Group__3__Impl )
            // InternalSequence.g:3611:2: rule__Alternative__Group__3__Impl
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
    // InternalSequence.g:3617:1: rule__Alternative__Group__3__Impl : ( '}' ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3621:1: ( ( '}' ) )
            // InternalSequence.g:3622:1: ( '}' )
            {
            // InternalSequence.g:3622:1: ( '}' )
            // InternalSequence.g:3623:2: '}'
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
    // InternalSequence.g:3633:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3637:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalSequence.g:3638:2: rule__Option__Group__0__Impl rule__Option__Group__1
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
    // InternalSequence.g:3645:1: rule__Option__Group__0__Impl : ( 'opt' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3649:1: ( ( 'opt' ) )
            // InternalSequence.g:3650:1: ( 'opt' )
            {
            // InternalSequence.g:3650:1: ( 'opt' )
            // InternalSequence.g:3651:2: 'opt'
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
    // InternalSequence.g:3660:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3664:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // InternalSequence.g:3665:2: rule__Option__Group__1__Impl rule__Option__Group__2
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
    // InternalSequence.g:3672:1: rule__Option__Group__1__Impl : ( '{' ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3676:1: ( ( '{' ) )
            // InternalSequence.g:3677:1: ( '{' )
            {
            // InternalSequence.g:3677:1: ( '{' )
            // InternalSequence.g:3678:2: '{'
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
    // InternalSequence.g:3687:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3691:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // InternalSequence.g:3692:2: rule__Option__Group__2__Impl rule__Option__Group__3
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
    // InternalSequence.g:3699:1: rule__Option__Group__2__Impl : ( ( rule__Option__OptionalAssignment_2 ) ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3703:1: ( ( ( rule__Option__OptionalAssignment_2 ) ) )
            // InternalSequence.g:3704:1: ( ( rule__Option__OptionalAssignment_2 ) )
            {
            // InternalSequence.g:3704:1: ( ( rule__Option__OptionalAssignment_2 ) )
            // InternalSequence.g:3705:2: ( rule__Option__OptionalAssignment_2 )
            {
             before(grammarAccess.getOptionAccess().getOptionalAssignment_2()); 
            // InternalSequence.g:3706:2: ( rule__Option__OptionalAssignment_2 )
            // InternalSequence.g:3706:3: rule__Option__OptionalAssignment_2
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
    // InternalSequence.g:3714:1: rule__Option__Group__3 : rule__Option__Group__3__Impl ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3718:1: ( rule__Option__Group__3__Impl )
            // InternalSequence.g:3719:2: rule__Option__Group__3__Impl
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
    // InternalSequence.g:3725:1: rule__Option__Group__3__Impl : ( '}' ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3729:1: ( ( '}' ) )
            // InternalSequence.g:3730:1: ( '}' )
            {
            // InternalSequence.g:3730:1: ( '}' )
            // InternalSequence.g:3731:2: '}'
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
    // InternalSequence.g:3741:1: rule__Parallel__Group__0 : rule__Parallel__Group__0__Impl rule__Parallel__Group__1 ;
    public final void rule__Parallel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3745:1: ( rule__Parallel__Group__0__Impl rule__Parallel__Group__1 )
            // InternalSequence.g:3746:2: rule__Parallel__Group__0__Impl rule__Parallel__Group__1
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
    // InternalSequence.g:3753:1: rule__Parallel__Group__0__Impl : ( 'par' ) ;
    public final void rule__Parallel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3757:1: ( ( 'par' ) )
            // InternalSequence.g:3758:1: ( 'par' )
            {
            // InternalSequence.g:3758:1: ( 'par' )
            // InternalSequence.g:3759:2: 'par'
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
    // InternalSequence.g:3768:1: rule__Parallel__Group__1 : rule__Parallel__Group__1__Impl rule__Parallel__Group__2 ;
    public final void rule__Parallel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3772:1: ( rule__Parallel__Group__1__Impl rule__Parallel__Group__2 )
            // InternalSequence.g:3773:2: rule__Parallel__Group__1__Impl rule__Parallel__Group__2
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
    // InternalSequence.g:3780:1: rule__Parallel__Group__1__Impl : ( '{' ) ;
    public final void rule__Parallel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3784:1: ( ( '{' ) )
            // InternalSequence.g:3785:1: ( '{' )
            {
            // InternalSequence.g:3785:1: ( '{' )
            // InternalSequence.g:3786:2: '{'
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
    // InternalSequence.g:3795:1: rule__Parallel__Group__2 : rule__Parallel__Group__2__Impl rule__Parallel__Group__3 ;
    public final void rule__Parallel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3799:1: ( rule__Parallel__Group__2__Impl rule__Parallel__Group__3 )
            // InternalSequence.g:3800:2: rule__Parallel__Group__2__Impl rule__Parallel__Group__3
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
    // InternalSequence.g:3807:1: rule__Parallel__Group__2__Impl : ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) ) ;
    public final void rule__Parallel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3811:1: ( ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) ) )
            // InternalSequence.g:3812:1: ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) )
            {
            // InternalSequence.g:3812:1: ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) )
            // InternalSequence.g:3813:2: ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* )
            {
            // InternalSequence.g:3813:2: ( ( rule__Parallel__ParallelsAssignment_2 ) )
            // InternalSequence.g:3814:3: ( rule__Parallel__ParallelsAssignment_2 )
            {
             before(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 
            // InternalSequence.g:3815:3: ( rule__Parallel__ParallelsAssignment_2 )
            // InternalSequence.g:3815:4: rule__Parallel__ParallelsAssignment_2
            {
            pushFollow(FOLLOW_37);
            rule__Parallel__ParallelsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 

            }

            // InternalSequence.g:3818:2: ( ( rule__Parallel__ParallelsAssignment_2 )* )
            // InternalSequence.g:3819:3: ( rule__Parallel__ParallelsAssignment_2 )*
            {
             before(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 
            // InternalSequence.g:3820:3: ( rule__Parallel__ParallelsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=12 && LA27_0<=13)||LA27_0==28||(LA27_0>=36 && LA27_0<=45)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSequence.g:3820:4: rule__Parallel__ParallelsAssignment_2
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
    // InternalSequence.g:3829:1: rule__Parallel__Group__3 : rule__Parallel__Group__3__Impl ;
    public final void rule__Parallel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3833:1: ( rule__Parallel__Group__3__Impl )
            // InternalSequence.g:3834:2: rule__Parallel__Group__3__Impl
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
    // InternalSequence.g:3840:1: rule__Parallel__Group__3__Impl : ( '}' ) ;
    public final void rule__Parallel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3844:1: ( ( '}' ) )
            // InternalSequence.g:3845:1: ( '}' )
            {
            // InternalSequence.g:3845:1: ( '}' )
            // InternalSequence.g:3846:2: '}'
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
    // InternalSequence.g:3856:1: rule__Critical__Group__0 : rule__Critical__Group__0__Impl rule__Critical__Group__1 ;
    public final void rule__Critical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3860:1: ( rule__Critical__Group__0__Impl rule__Critical__Group__1 )
            // InternalSequence.g:3861:2: rule__Critical__Group__0__Impl rule__Critical__Group__1
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
    // InternalSequence.g:3868:1: rule__Critical__Group__0__Impl : ( 'critical' ) ;
    public final void rule__Critical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3872:1: ( ( 'critical' ) )
            // InternalSequence.g:3873:1: ( 'critical' )
            {
            // InternalSequence.g:3873:1: ( 'critical' )
            // InternalSequence.g:3874:2: 'critical'
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
    // InternalSequence.g:3883:1: rule__Critical__Group__1 : rule__Critical__Group__1__Impl rule__Critical__Group__2 ;
    public final void rule__Critical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3887:1: ( rule__Critical__Group__1__Impl rule__Critical__Group__2 )
            // InternalSequence.g:3888:2: rule__Critical__Group__1__Impl rule__Critical__Group__2
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
    // InternalSequence.g:3895:1: rule__Critical__Group__1__Impl : ( '{' ) ;
    public final void rule__Critical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3899:1: ( ( '{' ) )
            // InternalSequence.g:3900:1: ( '{' )
            {
            // InternalSequence.g:3900:1: ( '{' )
            // InternalSequence.g:3901:2: '{'
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
    // InternalSequence.g:3910:1: rule__Critical__Group__2 : rule__Critical__Group__2__Impl rule__Critical__Group__3 ;
    public final void rule__Critical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3914:1: ( rule__Critical__Group__2__Impl rule__Critical__Group__3 )
            // InternalSequence.g:3915:2: rule__Critical__Group__2__Impl rule__Critical__Group__3
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
    // InternalSequence.g:3922:1: rule__Critical__Group__2__Impl : ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) ) ;
    public final void rule__Critical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3926:1: ( ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) ) )
            // InternalSequence.g:3927:1: ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) )
            {
            // InternalSequence.g:3927:1: ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) )
            // InternalSequence.g:3928:2: ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* )
            {
            // InternalSequence.g:3928:2: ( ( rule__Critical__FragmentsAssignment_2 ) )
            // InternalSequence.g:3929:3: ( rule__Critical__FragmentsAssignment_2 )
            {
             before(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:3930:3: ( rule__Critical__FragmentsAssignment_2 )
            // InternalSequence.g:3930:4: rule__Critical__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_10);
            rule__Critical__FragmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 

            }

            // InternalSequence.g:3933:2: ( ( rule__Critical__FragmentsAssignment_2 )* )
            // InternalSequence.g:3934:3: ( rule__Critical__FragmentsAssignment_2 )*
            {
             before(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:3935:3: ( rule__Critical__FragmentsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=12 && LA28_0<=13)||(LA28_0>=36 && LA28_0<=45)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSequence.g:3935:4: rule__Critical__FragmentsAssignment_2
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
    // InternalSequence.g:3944:1: rule__Critical__Group__3 : rule__Critical__Group__3__Impl ;
    public final void rule__Critical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3948:1: ( rule__Critical__Group__3__Impl )
            // InternalSequence.g:3949:2: rule__Critical__Group__3__Impl
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
    // InternalSequence.g:3955:1: rule__Critical__Group__3__Impl : ( '}' ) ;
    public final void rule__Critical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3959:1: ( ( '}' ) )
            // InternalSequence.g:3960:1: ( '}' )
            {
            // InternalSequence.g:3960:1: ( '}' )
            // InternalSequence.g:3961:2: '}'
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
    // InternalSequence.g:3971:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3975:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalSequence.g:3976:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
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
    // InternalSequence.g:3983:1: rule__Loop__Group__0__Impl : ( 'loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3987:1: ( ( 'loop' ) )
            // InternalSequence.g:3988:1: ( 'loop' )
            {
            // InternalSequence.g:3988:1: ( 'loop' )
            // InternalSequence.g:3989:2: 'loop'
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
    // InternalSequence.g:3998:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4002:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalSequence.g:4003:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
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
    // InternalSequence.g:4010:1: rule__Loop__Group__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4014:1: ( ( '[' ) )
            // InternalSequence.g:4015:1: ( '[' )
            {
            // InternalSequence.g:4015:1: ( '[' )
            // InternalSequence.g:4016:2: '['
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
    // InternalSequence.g:4025:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4029:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalSequence.g:4030:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
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
    // InternalSequence.g:4037:1: rule__Loop__Group__2__Impl : ( ( rule__Loop__ConditionAssignment_2 ) ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4041:1: ( ( ( rule__Loop__ConditionAssignment_2 ) ) )
            // InternalSequence.g:4042:1: ( ( rule__Loop__ConditionAssignment_2 ) )
            {
            // InternalSequence.g:4042:1: ( ( rule__Loop__ConditionAssignment_2 ) )
            // InternalSequence.g:4043:2: ( rule__Loop__ConditionAssignment_2 )
            {
             before(grammarAccess.getLoopAccess().getConditionAssignment_2()); 
            // InternalSequence.g:4044:2: ( rule__Loop__ConditionAssignment_2 )
            // InternalSequence.g:4044:3: rule__Loop__ConditionAssignment_2
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
    // InternalSequence.g:4052:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4056:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalSequence.g:4057:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
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
    // InternalSequence.g:4064:1: rule__Loop__Group__3__Impl : ( ']' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4068:1: ( ( ']' ) )
            // InternalSequence.g:4069:1: ( ']' )
            {
            // InternalSequence.g:4069:1: ( ']' )
            // InternalSequence.g:4070:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSequence.g:4079:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4083:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalSequence.g:4084:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
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
    // InternalSequence.g:4091:1: rule__Loop__Group__4__Impl : ( '{' ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4095:1: ( ( '{' ) )
            // InternalSequence.g:4096:1: ( '{' )
            {
            // InternalSequence.g:4096:1: ( '{' )
            // InternalSequence.g:4097:2: '{'
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
    // InternalSequence.g:4106:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4110:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalSequence.g:4111:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
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
    // InternalSequence.g:4118:1: rule__Loop__Group__5__Impl : ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4122:1: ( ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) ) )
            // InternalSequence.g:4123:1: ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) )
            {
            // InternalSequence.g:4123:1: ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) )
            // InternalSequence.g:4124:2: ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* )
            {
            // InternalSequence.g:4124:2: ( ( rule__Loop__FragmentsAssignment_5 ) )
            // InternalSequence.g:4125:3: ( rule__Loop__FragmentsAssignment_5 )
            {
             before(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 
            // InternalSequence.g:4126:3: ( rule__Loop__FragmentsAssignment_5 )
            // InternalSequence.g:4126:4: rule__Loop__FragmentsAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Loop__FragmentsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 

            }

            // InternalSequence.g:4129:2: ( ( rule__Loop__FragmentsAssignment_5 )* )
            // InternalSequence.g:4130:3: ( rule__Loop__FragmentsAssignment_5 )*
            {
             before(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 
            // InternalSequence.g:4131:3: ( rule__Loop__FragmentsAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=12 && LA29_0<=13)||(LA29_0>=36 && LA29_0<=45)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSequence.g:4131:4: rule__Loop__FragmentsAssignment_5
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
    // InternalSequence.g:4140:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4144:1: ( rule__Loop__Group__6__Impl )
            // InternalSequence.g:4145:2: rule__Loop__Group__6__Impl
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
    // InternalSequence.g:4151:1: rule__Loop__Group__6__Impl : ( '}' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4155:1: ( ( '}' ) )
            // InternalSequence.g:4156:1: ( '}' )
            {
            // InternalSequence.g:4156:1: ( '}' )
            // InternalSequence.g:4157:2: '}'
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
    // InternalSequence.g:4167:1: rule__BehaviorFragmentsWithCondition__Group__0 : rule__BehaviorFragmentsWithCondition__Group__0__Impl rule__BehaviorFragmentsWithCondition__Group__1 ;
    public final void rule__BehaviorFragmentsWithCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4171:1: ( rule__BehaviorFragmentsWithCondition__Group__0__Impl rule__BehaviorFragmentsWithCondition__Group__1 )
            // InternalSequence.g:4172:2: rule__BehaviorFragmentsWithCondition__Group__0__Impl rule__BehaviorFragmentsWithCondition__Group__1
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
    // InternalSequence.g:4179:1: rule__BehaviorFragmentsWithCondition__Group__0__Impl : ( '[' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4183:1: ( ( '[' ) )
            // InternalSequence.g:4184:1: ( '[' )
            {
            // InternalSequence.g:4184:1: ( '[' )
            // InternalSequence.g:4185:2: '['
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
    // InternalSequence.g:4194:1: rule__BehaviorFragmentsWithCondition__Group__1 : rule__BehaviorFragmentsWithCondition__Group__1__Impl rule__BehaviorFragmentsWithCondition__Group__2 ;
    public final void rule__BehaviorFragmentsWithCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4198:1: ( rule__BehaviorFragmentsWithCondition__Group__1__Impl rule__BehaviorFragmentsWithCondition__Group__2 )
            // InternalSequence.g:4199:2: rule__BehaviorFragmentsWithCondition__Group__1__Impl rule__BehaviorFragmentsWithCondition__Group__2
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
    // InternalSequence.g:4206:1: rule__BehaviorFragmentsWithCondition__Group__1__Impl : ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4210:1: ( ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) ) )
            // InternalSequence.g:4211:1: ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) )
            {
            // InternalSequence.g:4211:1: ( ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 ) )
            // InternalSequence.g:4212:2: ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getConditionAssignment_1()); 
            // InternalSequence.g:4213:2: ( rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 )
            // InternalSequence.g:4213:3: rule__BehaviorFragmentsWithCondition__ConditionAssignment_1
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
    // InternalSequence.g:4221:1: rule__BehaviorFragmentsWithCondition__Group__2 : rule__BehaviorFragmentsWithCondition__Group__2__Impl rule__BehaviorFragmentsWithCondition__Group__3 ;
    public final void rule__BehaviorFragmentsWithCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4225:1: ( rule__BehaviorFragmentsWithCondition__Group__2__Impl rule__BehaviorFragmentsWithCondition__Group__3 )
            // InternalSequence.g:4226:2: rule__BehaviorFragmentsWithCondition__Group__2__Impl rule__BehaviorFragmentsWithCondition__Group__3
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
    // InternalSequence.g:4233:1: rule__BehaviorFragmentsWithCondition__Group__2__Impl : ( ']' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4237:1: ( ( ']' ) )
            // InternalSequence.g:4238:1: ( ']' )
            {
            // InternalSequence.g:4238:1: ( ']' )
            // InternalSequence.g:4239:2: ']'
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getRightSquareBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSequence.g:4248:1: rule__BehaviorFragmentsWithCondition__Group__3 : rule__BehaviorFragmentsWithCondition__Group__3__Impl ;
    public final void rule__BehaviorFragmentsWithCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4252:1: ( rule__BehaviorFragmentsWithCondition__Group__3__Impl )
            // InternalSequence.g:4253:2: rule__BehaviorFragmentsWithCondition__Group__3__Impl
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
    // InternalSequence.g:4259:1: rule__BehaviorFragmentsWithCondition__Group__3__Impl : ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4263:1: ( ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) ) )
            // InternalSequence.g:4264:1: ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) )
            {
            // InternalSequence.g:4264:1: ( ( rule__BehaviorFragmentsWithCondition__Alternatives_3 ) )
            // InternalSequence.g:4265:2: ( rule__BehaviorFragmentsWithCondition__Alternatives_3 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getAlternatives_3()); 
            // InternalSequence.g:4266:2: ( rule__BehaviorFragmentsWithCondition__Alternatives_3 )
            // InternalSequence.g:4266:3: rule__BehaviorFragmentsWithCondition__Alternatives_3
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
    // InternalSequence.g:4275:1: rule__BehaviorFragmentsWithCondition__Group_3_0__0 : rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__1 ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4279:1: ( rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__1 )
            // InternalSequence.g:4280:2: rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__1
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
    // InternalSequence.g:4287:1: rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl : ( '{' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4291:1: ( ( '{' ) )
            // InternalSequence.g:4292:1: ( '{' )
            {
            // InternalSequence.g:4292:1: ( '{' )
            // InternalSequence.g:4293:2: '{'
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
    // InternalSequence.g:4302:1: rule__BehaviorFragmentsWithCondition__Group_3_0__1 : rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__2 ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4306:1: ( rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__2 )
            // InternalSequence.g:4307:2: rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl rule__BehaviorFragmentsWithCondition__Group_3_0__2
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
    // InternalSequence.g:4314:1: rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl : ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4318:1: ( ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) ) )
            // InternalSequence.g:4319:1: ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) )
            {
            // InternalSequence.g:4319:1: ( ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* ) )
            // InternalSequence.g:4320:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) ) ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* )
            {
            // InternalSequence.g:4320:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 ) )
            // InternalSequence.g:4321:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_0_1()); 
            // InternalSequence.g:4322:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )
            // InternalSequence.g:4322:4: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1
            {
            pushFollow(FOLLOW_10);
            rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_0_1()); 

            }

            // InternalSequence.g:4325:2: ( ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )* )
            // InternalSequence.g:4326:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )*
            {
             before(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsAssignment_3_0_1()); 
            // InternalSequence.g:4327:3: ( rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=12 && LA30_0<=13)||(LA30_0>=36 && LA30_0<=45)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSequence.g:4327:4: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1
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
    // InternalSequence.g:4336:1: rule__BehaviorFragmentsWithCondition__Group_3_0__2 : rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4340:1: ( rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl )
            // InternalSequence.g:4341:2: rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl
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
    // InternalSequence.g:4347:1: rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl : ( '}' ) ;
    public final void rule__BehaviorFragmentsWithCondition__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4351:1: ( ( '}' ) )
            // InternalSequence.g:4352:1: ( '}' )
            {
            // InternalSequence.g:4352:1: ( '}' )
            // InternalSequence.g:4353:2: '}'
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
    // InternalSequence.g:4363:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4367:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSequence.g:4368:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalSequence.g:4375:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4379:1: ( ( RULE_ID ) )
            // InternalSequence.g:4380:1: ( RULE_ID )
            {
            // InternalSequence.g:4380:1: ( RULE_ID )
            // InternalSequence.g:4381:2: RULE_ID
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
    // InternalSequence.g:4390:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4394:1: ( rule__FQN__Group__1__Impl )
            // InternalSequence.g:4395:2: rule__FQN__Group__1__Impl
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
    // InternalSequence.g:4401:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4405:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSequence.g:4406:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSequence.g:4406:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSequence.g:4407:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSequence.g:4408:2: ( rule__FQN__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSequence.g:4408:3: rule__FQN__Group_1__0
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
    // InternalSequence.g:4417:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4421:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSequence.g:4422:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalSequence.g:4429:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4433:1: ( ( '.' ) )
            // InternalSequence.g:4434:1: ( '.' )
            {
            // InternalSequence.g:4434:1: ( '.' )
            // InternalSequence.g:4435:2: '.'
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
    // InternalSequence.g:4444:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4448:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSequence.g:4449:2: rule__FQN__Group_1__1__Impl
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
    // InternalSequence.g:4455:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4459:1: ( ( RULE_ID ) )
            // InternalSequence.g:4460:1: ( RULE_ID )
            {
            // InternalSequence.g:4460:1: ( RULE_ID )
            // InternalSequence.g:4461:2: RULE_ID
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
    // InternalSequence.g:4471:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4475:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalSequence.g:4476:2: rule__Order__Group__0__Impl rule__Order__Group__1
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
    // InternalSequence.g:4483:1: rule__Order__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4487:1: ( ( RULE_INT ) )
            // InternalSequence.g:4488:1: ( RULE_INT )
            {
            // InternalSequence.g:4488:1: ( RULE_INT )
            // InternalSequence.g:4489:2: RULE_INT
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
    // InternalSequence.g:4498:1: rule__Order__Group__1 : rule__Order__Group__1__Impl ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4502:1: ( rule__Order__Group__1__Impl )
            // InternalSequence.g:4503:2: rule__Order__Group__1__Impl
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
    // InternalSequence.g:4509:1: rule__Order__Group__1__Impl : ( ( rule__Order__Group_1__0 )* ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4513:1: ( ( ( rule__Order__Group_1__0 )* ) )
            // InternalSequence.g:4514:1: ( ( rule__Order__Group_1__0 )* )
            {
            // InternalSequence.g:4514:1: ( ( rule__Order__Group_1__0 )* )
            // InternalSequence.g:4515:2: ( rule__Order__Group_1__0 )*
            {
             before(grammarAccess.getOrderAccess().getGroup_1()); 
            // InternalSequence.g:4516:2: ( rule__Order__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSequence.g:4516:3: rule__Order__Group_1__0
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
    // InternalSequence.g:4525:1: rule__Order__Group_1__0 : rule__Order__Group_1__0__Impl rule__Order__Group_1__1 ;
    public final void rule__Order__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4529:1: ( rule__Order__Group_1__0__Impl rule__Order__Group_1__1 )
            // InternalSequence.g:4530:2: rule__Order__Group_1__0__Impl rule__Order__Group_1__1
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
    // InternalSequence.g:4537:1: rule__Order__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Order__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4541:1: ( ( '.' ) )
            // InternalSequence.g:4542:1: ( '.' )
            {
            // InternalSequence.g:4542:1: ( '.' )
            // InternalSequence.g:4543:2: '.'
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
    // InternalSequence.g:4552:1: rule__Order__Group_1__1 : rule__Order__Group_1__1__Impl ;
    public final void rule__Order__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4556:1: ( rule__Order__Group_1__1__Impl )
            // InternalSequence.g:4557:2: rule__Order__Group_1__1__Impl
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
    // InternalSequence.g:4563:1: rule__Order__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Order__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4567:1: ( ( RULE_INT ) )
            // InternalSequence.g:4568:1: ( RULE_INT )
            {
            // InternalSequence.g:4568:1: ( RULE_INT )
            // InternalSequence.g:4569:2: RULE_INT
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
    // InternalSequence.g:4579:1: rule__SequenceDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SequenceDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4583:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4584:2: ( RULE_STRING )
            {
            // InternalSequence.g:4584:2: ( RULE_STRING )
            // InternalSequence.g:4585:3: RULE_STRING
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
    // InternalSequence.g:4594:1: rule__SequenceDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__SequenceDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4598:1: ( ( ruleRootPackage ) )
            // InternalSequence.g:4599:2: ( ruleRootPackage )
            {
            // InternalSequence.g:4599:2: ( ruleRootPackage )
            // InternalSequence.g:4600:3: ruleRootPackage
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
    // InternalSequence.g:4609:1: rule__RootPackage__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4613:1: ( ( ruleFQN ) )
            // InternalSequence.g:4614:2: ( ruleFQN )
            {
            // InternalSequence.g:4614:2: ( ruleFQN )
            // InternalSequence.g:4615:3: ruleFQN
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
    // InternalSequence.g:4624:1: rule__RootPackage__ActorsAssignment_2 : ( ruleActor ) ;
    public final void rule__RootPackage__ActorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4628:1: ( ( ruleActor ) )
            // InternalSequence.g:4629:2: ( ruleActor )
            {
            // InternalSequence.g:4629:2: ( ruleActor )
            // InternalSequence.g:4630:3: ruleActor
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
    // InternalSequence.g:4639:1: rule__RootPackage__BehaviorFragmentsAssignment_3 : ( ruleBehaviorFragment ) ;
    public final void rule__RootPackage__BehaviorFragmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4643:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:4644:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:4644:2: ( ruleBehaviorFragment )
            // InternalSequence.g:4645:3: ruleBehaviorFragment
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
    // InternalSequence.g:4654:1: rule__Actor__DeferredAssignment_1 : ( ( 'deferred' ) ) ;
    public final void rule__Actor__DeferredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4658:1: ( ( ( 'deferred' ) ) )
            // InternalSequence.g:4659:2: ( ( 'deferred' ) )
            {
            // InternalSequence.g:4659:2: ( ( 'deferred' ) )
            // InternalSequence.g:4660:3: ( 'deferred' )
            {
             before(grammarAccess.getActorAccess().getDeferredDeferredKeyword_1_0()); 
            // InternalSequence.g:4661:3: ( 'deferred' )
            // InternalSequence.g:4662:4: 'deferred'
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
    // InternalSequence.g:4673:1: rule__Actor__NameAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4677:1: ( ( RULE_ID ) )
            // InternalSequence.g:4678:2: ( RULE_ID )
            {
            // InternalSequence.g:4678:2: ( RULE_ID )
            // InternalSequence.g:4679:3: RULE_ID
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


    // $ANTLR start "rule__Actor__TypeAssignment_2_0_1_1"
    // InternalSequence.g:4688:1: rule__Actor__TypeAssignment_2_0_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Actor__TypeAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4692:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4693:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4693:2: ( ( ruleFQN ) )
            // InternalSequence.g:4694:3: ( ruleFQN )
            {
             before(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_0_1_1_0()); 
            // InternalSequence.g:4695:3: ( ruleFQN )
            // InternalSequence.g:4696:4: ruleFQN
            {
             before(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_0_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_0_1_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeAssignment_2_0_1_1"


    // $ANTLR start "rule__Actor__TypeAssignment_2_1_1"
    // InternalSequence.g:4707:1: rule__Actor__TypeAssignment_2_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Actor__TypeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4711:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4712:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4712:2: ( ( ruleFQN ) )
            // InternalSequence.g:4713:3: ( ruleFQN )
            {
             before(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_1_1_0()); 
            // InternalSequence.g:4714:3: ( ruleFQN )
            // InternalSequence.g:4715:4: ruleFQN
            {
             before(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeAssignment_2_1_1"


    // $ANTLR start "rule__Actor__AliasAssignment_2_1_3"
    // InternalSequence.g:4726:1: rule__Actor__AliasAssignment_2_1_3 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4730:1: ( ( RULE_ID ) )
            // InternalSequence.g:4731:2: ( RULE_ID )
            {
            // InternalSequence.g:4731:2: ( RULE_ID )
            // InternalSequence.g:4732:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_1_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__AliasAssignment_2_1_3"


    // $ANTLR start "rule__Actor__NameAssignment_2_2_0"
    // InternalSequence.g:4741:1: rule__Actor__NameAssignment_2_2_0 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4745:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4746:2: ( RULE_STRING )
            {
            // InternalSequence.g:4746:2: ( RULE_STRING )
            // InternalSequence.g:4747:3: RULE_STRING
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


    // $ANTLR start "rule__Actor__TypeAssignment_2_2_1_1"
    // InternalSequence.g:4756:1: rule__Actor__TypeAssignment_2_2_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Actor__TypeAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4760:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4761:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4761:2: ( ( ruleFQN ) )
            // InternalSequence.g:4762:3: ( ruleFQN )
            {
             before(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_2_1_1_0()); 
            // InternalSequence.g:4763:3: ( ruleFQN )
            // InternalSequence.g:4764:4: ruleFQN
            {
             before(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_2_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_2_1_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeAssignment_2_2_1_1"


    // $ANTLR start "rule__Actor__AliasAssignment_2_2_3"
    // InternalSequence.g:4775:1: rule__Actor__AliasAssignment_2_2_3 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4779:1: ( ( RULE_ID ) )
            // InternalSequence.g:4780:2: ( RULE_ID )
            {
            // InternalSequence.g:4780:2: ( RULE_ID )
            // InternalSequence.g:4781:3: RULE_ID
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
    // InternalSequence.g:4790:1: rule__Actor__ActorTypeAssignment_3_1 : ( ruleActorType ) ;
    public final void rule__Actor__ActorTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4794:1: ( ( ruleActorType ) )
            // InternalSequence.g:4795:2: ( ruleActorType )
            {
            // InternalSequence.g:4795:2: ( ruleActorType )
            // InternalSequence.g:4796:3: ruleActorType
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


    // $ANTLR start "rule__BehaviorFragments__FragmentsAssignment_0_1"
    // InternalSequence.g:4805:1: rule__BehaviorFragments__FragmentsAssignment_0_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragments__FragmentsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4809:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:4810:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:4810:2: ( ruleBehaviorFragment )
            // InternalSequence.g:4811:3: ruleBehaviorFragment
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
    // InternalSequence.g:4820:1: rule__BehaviorFragments__FragmentsAssignment_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragments__FragmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4824:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:4825:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:4825:2: ( ruleBehaviorFragment )
            // InternalSequence.g:4826:3: ruleBehaviorFragment
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
    // InternalSequence.g:4835:1: rule__Message__OrderAssignment_1_1 : ( ruleOrder ) ;
    public final void rule__Message__OrderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4839:1: ( ( ruleOrder ) )
            // InternalSequence.g:4840:2: ( ruleOrder )
            {
            // InternalSequence.g:4840:2: ( ruleOrder )
            // InternalSequence.g:4841:3: ruleOrder
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
    // InternalSequence.g:4850:1: rule__Message__TimeConstraintAssignment_2 : ( ruleTimeConstraint ) ;
    public final void rule__Message__TimeConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4854:1: ( ( ruleTimeConstraint ) )
            // InternalSequence.g:4855:2: ( ruleTimeConstraint )
            {
            // InternalSequence.g:4855:2: ( ruleTimeConstraint )
            // InternalSequence.g:4856:3: ruleTimeConstraint
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
    // InternalSequence.g:4865:1: rule__TimeConstraint__ConstraintsAssignment_1 : ( ruleInnerTimeConstraint ) ;
    public final void rule__TimeConstraint__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4869:1: ( ( ruleInnerTimeConstraint ) )
            // InternalSequence.g:4870:2: ( ruleInnerTimeConstraint )
            {
            // InternalSequence.g:4870:2: ( ruleInnerTimeConstraint )
            // InternalSequence.g:4871:3: ruleInnerTimeConstraint
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
    // InternalSequence.g:4880:1: rule__InnerTimeConstraint__TypeAssignment_0 : ( ruleTimeConstraintType ) ;
    public final void rule__InnerTimeConstraint__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4884:1: ( ( ruleTimeConstraintType ) )
            // InternalSequence.g:4885:2: ( ruleTimeConstraintType )
            {
            // InternalSequence.g:4885:2: ( ruleTimeConstraintType )
            // InternalSequence.g:4886:3: ruleTimeConstraintType
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
    // InternalSequence.g:4895:1: rule__InnerTimeConstraint__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__InnerTimeConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4899:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4900:2: ( RULE_STRING )
            {
            // InternalSequence.g:4900:2: ( RULE_STRING )
            // InternalSequence.g:4901:3: RULE_STRING
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
    // InternalSequence.g:4910:1: rule__StandardMessage__TypeAssignment_0 : ( ruleMessageType ) ;
    public final void rule__StandardMessage__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4914:1: ( ( ruleMessageType ) )
            // InternalSequence.g:4915:2: ( ruleMessageType )
            {
            // InternalSequence.g:4915:2: ( ruleMessageType )
            // InternalSequence.g:4916:3: ruleMessageType
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
    // InternalSequence.g:4925:1: rule__StandardMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StandardMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4929:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4930:2: ( RULE_STRING )
            {
            // InternalSequence.g:4930:2: ( RULE_STRING )
            // InternalSequence.g:4931:3: RULE_STRING
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
    // InternalSequence.g:4940:1: rule__StandardMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4944:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4945:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4945:2: ( ( ruleFQN ) )
            // InternalSequence.g:4946:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:4947:3: ( ruleFQN )
            // InternalSequence.g:4948:4: ruleFQN
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
    // InternalSequence.g:4959:1: rule__StandardMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4963:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4964:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4964:2: ( ( ruleFQN ) )
            // InternalSequence.g:4965:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:4966:3: ( ruleFQN )
            // InternalSequence.g:4967:4: ruleFQN
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
    // InternalSequence.g:4978:1: rule__ResponseMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ResponseMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4982:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4983:2: ( RULE_STRING )
            {
            // InternalSequence.g:4983:2: ( RULE_STRING )
            // InternalSequence.g:4984:3: RULE_STRING
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
    // InternalSequence.g:4993:1: rule__ResponseMessage__LeftAssignment_3_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__LeftAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4997:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4998:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4998:2: ( ( ruleFQN ) )
            // InternalSequence.g:4999:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getLeftActorCrossReference_3_0_0()); 
            // InternalSequence.g:5000:3: ( ruleFQN )
            // InternalSequence.g:5001:4: ruleFQN
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
    // InternalSequence.g:5012:1: rule__ResponseMessage__RightAssignment_5_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__RightAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5016:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5017:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5017:2: ( ( ruleFQN ) )
            // InternalSequence.g:5018:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getRightActorCrossReference_5_0_0()); 
            // InternalSequence.g:5019:3: ( ruleFQN )
            // InternalSequence.g:5020:4: ruleFQN
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
    // InternalSequence.g:5031:1: rule__FoundMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__FoundMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5035:1: ( ( ruleMessageType ) )
            // InternalSequence.g:5036:2: ( ruleMessageType )
            {
            // InternalSequence.g:5036:2: ( ruleMessageType )
            // InternalSequence.g:5037:3: ruleMessageType
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
    // InternalSequence.g:5046:1: rule__FoundMessage__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FoundMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5050:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5051:2: ( RULE_STRING )
            {
            // InternalSequence.g:5051:2: ( RULE_STRING )
            // InternalSequence.g:5052:3: RULE_STRING
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
    // InternalSequence.g:5061:1: rule__FoundMessage__RightAssignment_6 : ( ( ruleFQN ) ) ;
    public final void rule__FoundMessage__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5065:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5066:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5066:2: ( ( ruleFQN ) )
            // InternalSequence.g:5067:3: ( ruleFQN )
            {
             before(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0()); 
            // InternalSequence.g:5068:3: ( ruleFQN )
            // InternalSequence.g:5069:4: ruleFQN
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
    // InternalSequence.g:5080:1: rule__LostMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__LostMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5084:1: ( ( ruleMessageType ) )
            // InternalSequence.g:5085:2: ( ruleMessageType )
            {
            // InternalSequence.g:5085:2: ( ruleMessageType )
            // InternalSequence.g:5086:3: ruleMessageType
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
    // InternalSequence.g:5095:1: rule__LostMessage__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LostMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5099:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5100:2: ( RULE_STRING )
            {
            // InternalSequence.g:5100:2: ( RULE_STRING )
            // InternalSequence.g:5101:3: RULE_STRING
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
    // InternalSequence.g:5110:1: rule__LostMessage__LeftAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__LostMessage__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5114:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5115:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5115:2: ( ( ruleFQN ) )
            // InternalSequence.g:5116:3: ( ruleFQN )
            {
             before(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0()); 
            // InternalSequence.g:5117:3: ( ruleFQN )
            // InternalSequence.g:5118:4: ruleFQN
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
    // InternalSequence.g:5129:1: rule__CreateMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CreateMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5133:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5134:2: ( RULE_STRING )
            {
            // InternalSequence.g:5134:2: ( RULE_STRING )
            // InternalSequence.g:5135:3: RULE_STRING
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
    // InternalSequence.g:5144:1: rule__CreateMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5148:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5149:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5149:2: ( ( ruleFQN ) )
            // InternalSequence.g:5150:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:5151:3: ( ruleFQN )
            // InternalSequence.g:5152:4: ruleFQN
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
    // InternalSequence.g:5163:1: rule__CreateMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5167:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5168:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5168:2: ( ( ruleFQN ) )
            // InternalSequence.g:5169:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:5170:3: ( ruleFQN )
            // InternalSequence.g:5171:4: ruleFQN
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
    // InternalSequence.g:5182:1: rule__DestructionMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DestructionMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5186:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5187:2: ( RULE_STRING )
            {
            // InternalSequence.g:5187:2: ( RULE_STRING )
            // InternalSequence.g:5188:3: RULE_STRING
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
    // InternalSequence.g:5197:1: rule__DestructionMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5201:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5202:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5202:2: ( ( ruleFQN ) )
            // InternalSequence.g:5203:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:5204:3: ( ruleFQN )
            // InternalSequence.g:5205:4: ruleFQN
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
    // InternalSequence.g:5216:1: rule__DestructionMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5220:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5221:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5221:2: ( ( ruleFQN ) )
            // InternalSequence.g:5222:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:5223:3: ( ruleFQN )
            // InternalSequence.g:5224:4: ruleFQN
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
    // InternalSequence.g:5235:1: rule__DestructionOccurenceSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DestructionOccurenceSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5239:1: ( ( RULE_ID ) )
            // InternalSequence.g:5240:2: ( RULE_ID )
            {
            // InternalSequence.g:5240:2: ( RULE_ID )
            // InternalSequence.g:5241:3: RULE_ID
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
    // InternalSequence.g:5250:1: rule__Alternative__AlternativesAssignment_2 : ( ruleBehaviorFragmentsWithCondition ) ;
    public final void rule__Alternative__AlternativesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5254:1: ( ( ruleBehaviorFragmentsWithCondition ) )
            // InternalSequence.g:5255:2: ( ruleBehaviorFragmentsWithCondition )
            {
            // InternalSequence.g:5255:2: ( ruleBehaviorFragmentsWithCondition )
            // InternalSequence.g:5256:3: ruleBehaviorFragmentsWithCondition
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
    // InternalSequence.g:5265:1: rule__Option__OptionalAssignment_2 : ( ruleBehaviorFragmentsWithCondition ) ;
    public final void rule__Option__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5269:1: ( ( ruleBehaviorFragmentsWithCondition ) )
            // InternalSequence.g:5270:2: ( ruleBehaviorFragmentsWithCondition )
            {
            // InternalSequence.g:5270:2: ( ruleBehaviorFragmentsWithCondition )
            // InternalSequence.g:5271:3: ruleBehaviorFragmentsWithCondition
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
    // InternalSequence.g:5280:1: rule__Parallel__ParallelsAssignment_2 : ( ruleBehaviorFragments ) ;
    public final void rule__Parallel__ParallelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5284:1: ( ( ruleBehaviorFragments ) )
            // InternalSequence.g:5285:2: ( ruleBehaviorFragments )
            {
            // InternalSequence.g:5285:2: ( ruleBehaviorFragments )
            // InternalSequence.g:5286:3: ruleBehaviorFragments
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
    // InternalSequence.g:5295:1: rule__Critical__FragmentsAssignment_2 : ( ruleBehaviorFragment ) ;
    public final void rule__Critical__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5299:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5300:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5300:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5301:3: ruleBehaviorFragment
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
    // InternalSequence.g:5310:1: rule__Loop__ConditionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Loop__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5314:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5315:2: ( RULE_STRING )
            {
            // InternalSequence.g:5315:2: ( RULE_STRING )
            // InternalSequence.g:5316:3: RULE_STRING
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
    // InternalSequence.g:5325:1: rule__Loop__FragmentsAssignment_5 : ( ruleBehaviorFragment ) ;
    public final void rule__Loop__FragmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5329:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5330:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5330:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5331:3: ruleBehaviorFragment
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
    // InternalSequence.g:5340:1: rule__BehaviorFragmentsWithCondition__ConditionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BehaviorFragmentsWithCondition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5344:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5345:2: ( RULE_STRING )
            {
            // InternalSequence.g:5345:2: ( RULE_STRING )
            // InternalSequence.g:5346:3: RULE_STRING
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
    // InternalSequence.g:5355:1: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5359:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5360:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5360:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5361:3: ruleBehaviorFragment
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
    // InternalSequence.g:5370:1: rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1 : ( ruleBehaviorFragment ) ;
    public final void rule__BehaviorFragmentsWithCondition__FragmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5374:1: ( ( ruleBehaviorFragment ) )
            // InternalSequence.g:5375:2: ( ruleBehaviorFragment )
            {
            // InternalSequence.g:5375:2: ( ruleBehaviorFragment )
            // InternalSequence.g:5376:3: ruleBehaviorFragment
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
            return "825:1: rule__Message__Alternatives_0 : ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) );";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000001000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
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