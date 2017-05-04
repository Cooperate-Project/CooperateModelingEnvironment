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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'sync'", "'async'", "'human'", "'machine'", "'d'", "'t'", "'max'", "'diff'", "'@start-seqd'", "'@end-seqd'", "'rootElement'", "'act'", "':'", "'as'", "'role['", "']'", "'num['", "'time['", "'='", "'('", "','", "')'", "'resp'", "'found'", "'lost'", "'create'", "'dest'", "'alt'", "'{'", "'}'", "'opt'", "'par'", "'critical'", "'loop'", "'['", "'.'", "'deferred'"
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


    // $ANTLR start "entryRuleInteractionFragment"
    // InternalSequence.g:128:1: entryRuleInteractionFragment : ruleInteractionFragment EOF ;
    public final void entryRuleInteractionFragment() throws RecognitionException {
        try {
            // InternalSequence.g:129:1: ( ruleInteractionFragment EOF )
            // InternalSequence.g:130:1: ruleInteractionFragment EOF
            {
             before(grammarAccess.getInteractionFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleInteractionFragment();

            state._fsp--;

             after(grammarAccess.getInteractionFragmentRule()); 
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
    // $ANTLR end "entryRuleInteractionFragment"


    // $ANTLR start "ruleInteractionFragment"
    // InternalSequence.g:137:1: ruleInteractionFragment : ( ( rule__InteractionFragment__Alternatives ) ) ;
    public final void ruleInteractionFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:141:2: ( ( ( rule__InteractionFragment__Alternatives ) ) )
            // InternalSequence.g:142:2: ( ( rule__InteractionFragment__Alternatives ) )
            {
            // InternalSequence.g:142:2: ( ( rule__InteractionFragment__Alternatives ) )
            // InternalSequence.g:143:3: ( rule__InteractionFragment__Alternatives )
            {
             before(grammarAccess.getInteractionFragmentAccess().getAlternatives()); 
            // InternalSequence.g:144:3: ( rule__InteractionFragment__Alternatives )
            // InternalSequence.g:144:4: rule__InteractionFragment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InteractionFragment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInteractionFragmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteractionFragment"


    // $ANTLR start "entryRuleMessage"
    // InternalSequence.g:153:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalSequence.g:154:1: ( ruleMessage EOF )
            // InternalSequence.g:155:1: ruleMessage EOF
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
    // InternalSequence.g:162:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:166:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalSequence.g:167:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalSequence.g:167:2: ( ( rule__Message__Group__0 ) )
            // InternalSequence.g:168:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalSequence.g:169:3: ( rule__Message__Group__0 )
            // InternalSequence.g:169:4: rule__Message__Group__0
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
    // InternalSequence.g:178:1: entryRuleTimeConstraint : ruleTimeConstraint EOF ;
    public final void entryRuleTimeConstraint() throws RecognitionException {
        try {
            // InternalSequence.g:179:1: ( ruleTimeConstraint EOF )
            // InternalSequence.g:180:1: ruleTimeConstraint EOF
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
    // InternalSequence.g:187:1: ruleTimeConstraint : ( ( rule__TimeConstraint__Group__0 ) ) ;
    public final void ruleTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:191:2: ( ( ( rule__TimeConstraint__Group__0 ) ) )
            // InternalSequence.g:192:2: ( ( rule__TimeConstraint__Group__0 ) )
            {
            // InternalSequence.g:192:2: ( ( rule__TimeConstraint__Group__0 ) )
            // InternalSequence.g:193:3: ( rule__TimeConstraint__Group__0 )
            {
             before(grammarAccess.getTimeConstraintAccess().getGroup()); 
            // InternalSequence.g:194:3: ( rule__TimeConstraint__Group__0 )
            // InternalSequence.g:194:4: rule__TimeConstraint__Group__0
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
    // InternalSequence.g:203:1: entryRuleInnerTimeConstraint : ruleInnerTimeConstraint EOF ;
    public final void entryRuleInnerTimeConstraint() throws RecognitionException {
        try {
            // InternalSequence.g:204:1: ( ruleInnerTimeConstraint EOF )
            // InternalSequence.g:205:1: ruleInnerTimeConstraint EOF
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
    // InternalSequence.g:212:1: ruleInnerTimeConstraint : ( ( rule__InnerTimeConstraint__Group__0 ) ) ;
    public final void ruleInnerTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:216:2: ( ( ( rule__InnerTimeConstraint__Group__0 ) ) )
            // InternalSequence.g:217:2: ( ( rule__InnerTimeConstraint__Group__0 ) )
            {
            // InternalSequence.g:217:2: ( ( rule__InnerTimeConstraint__Group__0 ) )
            // InternalSequence.g:218:3: ( rule__InnerTimeConstraint__Group__0 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getGroup()); 
            // InternalSequence.g:219:3: ( rule__InnerTimeConstraint__Group__0 )
            // InternalSequence.g:219:4: rule__InnerTimeConstraint__Group__0
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
    // InternalSequence.g:228:1: entryRuleStandardMessage : ruleStandardMessage EOF ;
    public final void entryRuleStandardMessage() throws RecognitionException {
        try {
            // InternalSequence.g:229:1: ( ruleStandardMessage EOF )
            // InternalSequence.g:230:1: ruleStandardMessage EOF
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
    // InternalSequence.g:237:1: ruleStandardMessage : ( ( rule__StandardMessage__Group__0 ) ) ;
    public final void ruleStandardMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:241:2: ( ( ( rule__StandardMessage__Group__0 ) ) )
            // InternalSequence.g:242:2: ( ( rule__StandardMessage__Group__0 ) )
            {
            // InternalSequence.g:242:2: ( ( rule__StandardMessage__Group__0 ) )
            // InternalSequence.g:243:3: ( rule__StandardMessage__Group__0 )
            {
             before(grammarAccess.getStandardMessageAccess().getGroup()); 
            // InternalSequence.g:244:3: ( rule__StandardMessage__Group__0 )
            // InternalSequence.g:244:4: rule__StandardMessage__Group__0
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
    // InternalSequence.g:253:1: entryRuleResponseMessage : ruleResponseMessage EOF ;
    public final void entryRuleResponseMessage() throws RecognitionException {
        try {
            // InternalSequence.g:254:1: ( ruleResponseMessage EOF )
            // InternalSequence.g:255:1: ruleResponseMessage EOF
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
    // InternalSequence.g:262:1: ruleResponseMessage : ( ( rule__ResponseMessage__Group__0 ) ) ;
    public final void ruleResponseMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:266:2: ( ( ( rule__ResponseMessage__Group__0 ) ) )
            // InternalSequence.g:267:2: ( ( rule__ResponseMessage__Group__0 ) )
            {
            // InternalSequence.g:267:2: ( ( rule__ResponseMessage__Group__0 ) )
            // InternalSequence.g:268:3: ( rule__ResponseMessage__Group__0 )
            {
             before(grammarAccess.getResponseMessageAccess().getGroup()); 
            // InternalSequence.g:269:3: ( rule__ResponseMessage__Group__0 )
            // InternalSequence.g:269:4: rule__ResponseMessage__Group__0
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
    // InternalSequence.g:278:1: entryRuleFoundMessage : ruleFoundMessage EOF ;
    public final void entryRuleFoundMessage() throws RecognitionException {
        try {
            // InternalSequence.g:279:1: ( ruleFoundMessage EOF )
            // InternalSequence.g:280:1: ruleFoundMessage EOF
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
    // InternalSequence.g:287:1: ruleFoundMessage : ( ( rule__FoundMessage__Group__0 ) ) ;
    public final void ruleFoundMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:291:2: ( ( ( rule__FoundMessage__Group__0 ) ) )
            // InternalSequence.g:292:2: ( ( rule__FoundMessage__Group__0 ) )
            {
            // InternalSequence.g:292:2: ( ( rule__FoundMessage__Group__0 ) )
            // InternalSequence.g:293:3: ( rule__FoundMessage__Group__0 )
            {
             before(grammarAccess.getFoundMessageAccess().getGroup()); 
            // InternalSequence.g:294:3: ( rule__FoundMessage__Group__0 )
            // InternalSequence.g:294:4: rule__FoundMessage__Group__0
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
    // InternalSequence.g:303:1: entryRuleLostMessage : ruleLostMessage EOF ;
    public final void entryRuleLostMessage() throws RecognitionException {
        try {
            // InternalSequence.g:304:1: ( ruleLostMessage EOF )
            // InternalSequence.g:305:1: ruleLostMessage EOF
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
    // InternalSequence.g:312:1: ruleLostMessage : ( ( rule__LostMessage__Group__0 ) ) ;
    public final void ruleLostMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:316:2: ( ( ( rule__LostMessage__Group__0 ) ) )
            // InternalSequence.g:317:2: ( ( rule__LostMessage__Group__0 ) )
            {
            // InternalSequence.g:317:2: ( ( rule__LostMessage__Group__0 ) )
            // InternalSequence.g:318:3: ( rule__LostMessage__Group__0 )
            {
             before(grammarAccess.getLostMessageAccess().getGroup()); 
            // InternalSequence.g:319:3: ( rule__LostMessage__Group__0 )
            // InternalSequence.g:319:4: rule__LostMessage__Group__0
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
    // InternalSequence.g:328:1: entryRuleCreateMessage : ruleCreateMessage EOF ;
    public final void entryRuleCreateMessage() throws RecognitionException {
        try {
            // InternalSequence.g:329:1: ( ruleCreateMessage EOF )
            // InternalSequence.g:330:1: ruleCreateMessage EOF
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
    // InternalSequence.g:337:1: ruleCreateMessage : ( ( rule__CreateMessage__Group__0 ) ) ;
    public final void ruleCreateMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:341:2: ( ( ( rule__CreateMessage__Group__0 ) ) )
            // InternalSequence.g:342:2: ( ( rule__CreateMessage__Group__0 ) )
            {
            // InternalSequence.g:342:2: ( ( rule__CreateMessage__Group__0 ) )
            // InternalSequence.g:343:3: ( rule__CreateMessage__Group__0 )
            {
             before(grammarAccess.getCreateMessageAccess().getGroup()); 
            // InternalSequence.g:344:3: ( rule__CreateMessage__Group__0 )
            // InternalSequence.g:344:4: rule__CreateMessage__Group__0
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
    // InternalSequence.g:353:1: entryRuleDestructionMessage : ruleDestructionMessage EOF ;
    public final void entryRuleDestructionMessage() throws RecognitionException {
        try {
            // InternalSequence.g:354:1: ( ruleDestructionMessage EOF )
            // InternalSequence.g:355:1: ruleDestructionMessage EOF
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
    // InternalSequence.g:362:1: ruleDestructionMessage : ( ( rule__DestructionMessage__Group__0 ) ) ;
    public final void ruleDestructionMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:366:2: ( ( ( rule__DestructionMessage__Group__0 ) ) )
            // InternalSequence.g:367:2: ( ( rule__DestructionMessage__Group__0 ) )
            {
            // InternalSequence.g:367:2: ( ( rule__DestructionMessage__Group__0 ) )
            // InternalSequence.g:368:3: ( rule__DestructionMessage__Group__0 )
            {
             before(grammarAccess.getDestructionMessageAccess().getGroup()); 
            // InternalSequence.g:369:3: ( rule__DestructionMessage__Group__0 )
            // InternalSequence.g:369:4: rule__DestructionMessage__Group__0
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
    // InternalSequence.g:378:1: entryRuleOccurenceSpecification : ruleOccurenceSpecification EOF ;
    public final void entryRuleOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:379:1: ( ruleOccurenceSpecification EOF )
            // InternalSequence.g:380:1: ruleOccurenceSpecification EOF
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
    // InternalSequence.g:387:1: ruleOccurenceSpecification : ( ruleDestructionOccurenceSpecification ) ;
    public final void ruleOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:391:2: ( ( ruleDestructionOccurenceSpecification ) )
            // InternalSequence.g:392:2: ( ruleDestructionOccurenceSpecification )
            {
            // InternalSequence.g:392:2: ( ruleDestructionOccurenceSpecification )
            // InternalSequence.g:393:3: ruleDestructionOccurenceSpecification
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
    // InternalSequence.g:403:1: entryRuleDestructionOccurenceSpecification : ruleDestructionOccurenceSpecification EOF ;
    public final void entryRuleDestructionOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:404:1: ( ruleDestructionOccurenceSpecification EOF )
            // InternalSequence.g:405:1: ruleDestructionOccurenceSpecification EOF
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
    // InternalSequence.g:412:1: ruleDestructionOccurenceSpecification : ( ( rule__DestructionOccurenceSpecification__Group__0 ) ) ;
    public final void ruleDestructionOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:416:2: ( ( ( rule__DestructionOccurenceSpecification__Group__0 ) ) )
            // InternalSequence.g:417:2: ( ( rule__DestructionOccurenceSpecification__Group__0 ) )
            {
            // InternalSequence.g:417:2: ( ( rule__DestructionOccurenceSpecification__Group__0 ) )
            // InternalSequence.g:418:3: ( rule__DestructionOccurenceSpecification__Group__0 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getGroup()); 
            // InternalSequence.g:419:3: ( rule__DestructionOccurenceSpecification__Group__0 )
            // InternalSequence.g:419:4: rule__DestructionOccurenceSpecification__Group__0
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
    // InternalSequence.g:428:1: entryRuleCombinedFragment : ruleCombinedFragment EOF ;
    public final void entryRuleCombinedFragment() throws RecognitionException {
        try {
            // InternalSequence.g:429:1: ( ruleCombinedFragment EOF )
            // InternalSequence.g:430:1: ruleCombinedFragment EOF
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
    // InternalSequence.g:437:1: ruleCombinedFragment : ( ( rule__CombinedFragment__Alternatives ) ) ;
    public final void ruleCombinedFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:441:2: ( ( ( rule__CombinedFragment__Alternatives ) ) )
            // InternalSequence.g:442:2: ( ( rule__CombinedFragment__Alternatives ) )
            {
            // InternalSequence.g:442:2: ( ( rule__CombinedFragment__Alternatives ) )
            // InternalSequence.g:443:3: ( rule__CombinedFragment__Alternatives )
            {
             before(grammarAccess.getCombinedFragmentAccess().getAlternatives()); 
            // InternalSequence.g:444:3: ( rule__CombinedFragment__Alternatives )
            // InternalSequence.g:444:4: rule__CombinedFragment__Alternatives
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
    // InternalSequence.g:453:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // InternalSequence.g:454:1: ( ruleAlternative EOF )
            // InternalSequence.g:455:1: ruleAlternative EOF
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
    // InternalSequence.g:462:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:466:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // InternalSequence.g:467:2: ( ( rule__Alternative__Group__0 ) )
            {
            // InternalSequence.g:467:2: ( ( rule__Alternative__Group__0 ) )
            // InternalSequence.g:468:3: ( rule__Alternative__Group__0 )
            {
             before(grammarAccess.getAlternativeAccess().getGroup()); 
            // InternalSequence.g:469:3: ( rule__Alternative__Group__0 )
            // InternalSequence.g:469:4: rule__Alternative__Group__0
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
    // InternalSequence.g:478:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalSequence.g:479:1: ( ruleOption EOF )
            // InternalSequence.g:480:1: ruleOption EOF
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
    // InternalSequence.g:487:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:491:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalSequence.g:492:2: ( ( rule__Option__Group__0 ) )
            {
            // InternalSequence.g:492:2: ( ( rule__Option__Group__0 ) )
            // InternalSequence.g:493:3: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalSequence.g:494:3: ( rule__Option__Group__0 )
            // InternalSequence.g:494:4: rule__Option__Group__0
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
    // InternalSequence.g:503:1: entryRuleParallel : ruleParallel EOF ;
    public final void entryRuleParallel() throws RecognitionException {
        try {
            // InternalSequence.g:504:1: ( ruleParallel EOF )
            // InternalSequence.g:505:1: ruleParallel EOF
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
    // InternalSequence.g:512:1: ruleParallel : ( ( rule__Parallel__Group__0 ) ) ;
    public final void ruleParallel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:516:2: ( ( ( rule__Parallel__Group__0 ) ) )
            // InternalSequence.g:517:2: ( ( rule__Parallel__Group__0 ) )
            {
            // InternalSequence.g:517:2: ( ( rule__Parallel__Group__0 ) )
            // InternalSequence.g:518:3: ( rule__Parallel__Group__0 )
            {
             before(grammarAccess.getParallelAccess().getGroup()); 
            // InternalSequence.g:519:3: ( rule__Parallel__Group__0 )
            // InternalSequence.g:519:4: rule__Parallel__Group__0
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
    // InternalSequence.g:528:1: entryRuleCritical : ruleCritical EOF ;
    public final void entryRuleCritical() throws RecognitionException {
        try {
            // InternalSequence.g:529:1: ( ruleCritical EOF )
            // InternalSequence.g:530:1: ruleCritical EOF
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
    // InternalSequence.g:537:1: ruleCritical : ( ( rule__Critical__Group__0 ) ) ;
    public final void ruleCritical() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:541:2: ( ( ( rule__Critical__Group__0 ) ) )
            // InternalSequence.g:542:2: ( ( rule__Critical__Group__0 ) )
            {
            // InternalSequence.g:542:2: ( ( rule__Critical__Group__0 ) )
            // InternalSequence.g:543:3: ( rule__Critical__Group__0 )
            {
             before(grammarAccess.getCriticalAccess().getGroup()); 
            // InternalSequence.g:544:3: ( rule__Critical__Group__0 )
            // InternalSequence.g:544:4: rule__Critical__Group__0
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
    // InternalSequence.g:553:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalSequence.g:554:1: ( ruleLoop EOF )
            // InternalSequence.g:555:1: ruleLoop EOF
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
    // InternalSequence.g:562:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:566:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalSequence.g:567:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalSequence.g:567:2: ( ( rule__Loop__Group__0 ) )
            // InternalSequence.g:568:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalSequence.g:569:3: ( rule__Loop__Group__0 )
            // InternalSequence.g:569:4: rule__Loop__Group__0
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


    // $ANTLR start "entryRuleParallelFragment"
    // InternalSequence.g:578:1: entryRuleParallelFragment : ruleParallelFragment EOF ;
    public final void entryRuleParallelFragment() throws RecognitionException {
        try {
            // InternalSequence.g:579:1: ( ruleParallelFragment EOF )
            // InternalSequence.g:580:1: ruleParallelFragment EOF
            {
             before(grammarAccess.getParallelFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleParallelFragment();

            state._fsp--;

             after(grammarAccess.getParallelFragmentRule()); 
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
    // $ANTLR end "entryRuleParallelFragment"


    // $ANTLR start "ruleParallelFragment"
    // InternalSequence.g:587:1: ruleParallelFragment : ( ( rule__ParallelFragment__Alternatives ) ) ;
    public final void ruleParallelFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:591:2: ( ( ( rule__ParallelFragment__Alternatives ) ) )
            // InternalSequence.g:592:2: ( ( rule__ParallelFragment__Alternatives ) )
            {
            // InternalSequence.g:592:2: ( ( rule__ParallelFragment__Alternatives ) )
            // InternalSequence.g:593:3: ( rule__ParallelFragment__Alternatives )
            {
             before(grammarAccess.getParallelFragmentAccess().getAlternatives()); 
            // InternalSequence.g:594:3: ( rule__ParallelFragment__Alternatives )
            // InternalSequence.g:594:4: rule__ParallelFragment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParallelFragment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParallelFragmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParallelFragment"


    // $ANTLR start "entryRuleConditionedFragment"
    // InternalSequence.g:603:1: entryRuleConditionedFragment : ruleConditionedFragment EOF ;
    public final void entryRuleConditionedFragment() throws RecognitionException {
        try {
            // InternalSequence.g:604:1: ( ruleConditionedFragment EOF )
            // InternalSequence.g:605:1: ruleConditionedFragment EOF
            {
             before(grammarAccess.getConditionedFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionedFragment();

            state._fsp--;

             after(grammarAccess.getConditionedFragmentRule()); 
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
    // $ANTLR end "entryRuleConditionedFragment"


    // $ANTLR start "ruleConditionedFragment"
    // InternalSequence.g:612:1: ruleConditionedFragment : ( ( rule__ConditionedFragment__Group__0 ) ) ;
    public final void ruleConditionedFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:616:2: ( ( ( rule__ConditionedFragment__Group__0 ) ) )
            // InternalSequence.g:617:2: ( ( rule__ConditionedFragment__Group__0 ) )
            {
            // InternalSequence.g:617:2: ( ( rule__ConditionedFragment__Group__0 ) )
            // InternalSequence.g:618:3: ( rule__ConditionedFragment__Group__0 )
            {
             before(grammarAccess.getConditionedFragmentAccess().getGroup()); 
            // InternalSequence.g:619:3: ( rule__ConditionedFragment__Group__0 )
            // InternalSequence.g:619:4: rule__ConditionedFragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionedFragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionedFragmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionedFragment"


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


    // $ANTLR start "rule__InteractionFragment__Alternatives"
    // InternalSequence.g:777:1: rule__InteractionFragment__Alternatives : ( ( ruleMessage ) | ( ruleOccurenceSpecification ) | ( ruleCombinedFragment ) );
    public final void rule__InteractionFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:781:1: ( ( ruleMessage ) | ( ruleOccurenceSpecification ) | ( ruleCombinedFragment ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt2=1;
                }
                break;
            case 38:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_STRING||LA2_2==31) ) {
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
            case 39:
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
                     before(grammarAccess.getInteractionFragmentAccess().getMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getInteractionFragmentAccess().getMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:788:2: ( ruleOccurenceSpecification )
                    {
                    // InternalSequence.g:788:2: ( ruleOccurenceSpecification )
                    // InternalSequence.g:789:3: ruleOccurenceSpecification
                    {
                     before(grammarAccess.getInteractionFragmentAccess().getOccurenceSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOccurenceSpecification();

                    state._fsp--;

                     after(grammarAccess.getInteractionFragmentAccess().getOccurenceSpecificationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:794:2: ( ruleCombinedFragment )
                    {
                    // InternalSequence.g:794:2: ( ruleCombinedFragment )
                    // InternalSequence.g:795:3: ruleCombinedFragment
                    {
                     before(grammarAccess.getInteractionFragmentAccess().getCombinedFragmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCombinedFragment();

                    state._fsp--;

                     after(grammarAccess.getInteractionFragmentAccess().getCombinedFragmentParserRuleCall_2()); 

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
    // $ANTLR end "rule__InteractionFragment__Alternatives"


    // $ANTLR start "rule__Message__Alternatives_0"
    // InternalSequence.g:804:1: rule__Message__Alternatives_0 : ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) );
    public final void rule__Message__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:808:1: ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSequence.g:809:2: ( ruleStandardMessage )
                    {
                    // InternalSequence.g:809:2: ( ruleStandardMessage )
                    // InternalSequence.g:810:3: ruleStandardMessage
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
                    // InternalSequence.g:815:2: ( ruleResponseMessage )
                    {
                    // InternalSequence.g:815:2: ( ruleResponseMessage )
                    // InternalSequence.g:816:3: ruleResponseMessage
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
                    // InternalSequence.g:821:2: ( ruleFoundMessage )
                    {
                    // InternalSequence.g:821:2: ( ruleFoundMessage )
                    // InternalSequence.g:822:3: ruleFoundMessage
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
                    // InternalSequence.g:827:2: ( ruleLostMessage )
                    {
                    // InternalSequence.g:827:2: ( ruleLostMessage )
                    // InternalSequence.g:828:3: ruleLostMessage
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
                    // InternalSequence.g:833:2: ( ruleCreateMessage )
                    {
                    // InternalSequence.g:833:2: ( ruleCreateMessage )
                    // InternalSequence.g:834:3: ruleCreateMessage
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
                    // InternalSequence.g:839:2: ( ruleDestructionMessage )
                    {
                    // InternalSequence.g:839:2: ( ruleDestructionMessage )
                    // InternalSequence.g:840:3: ruleDestructionMessage
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
    // InternalSequence.g:849:1: rule__ResponseMessage__Alternatives_3 : ( ( ( rule__ResponseMessage__LeftAssignment_3_0 ) ) | ( '_' ) );
    public final void rule__ResponseMessage__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:853:1: ( ( ( rule__ResponseMessage__LeftAssignment_3_0 ) ) | ( '_' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSequence.g:854:2: ( ( rule__ResponseMessage__LeftAssignment_3_0 ) )
                    {
                    // InternalSequence.g:854:2: ( ( rule__ResponseMessage__LeftAssignment_3_0 ) )
                    // InternalSequence.g:855:3: ( rule__ResponseMessage__LeftAssignment_3_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getLeftAssignment_3_0()); 
                    // InternalSequence.g:856:3: ( rule__ResponseMessage__LeftAssignment_3_0 )
                    // InternalSequence.g:856:4: rule__ResponseMessage__LeftAssignment_3_0
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
                    // InternalSequence.g:860:2: ( '_' )
                    {
                    // InternalSequence.g:860:2: ( '_' )
                    // InternalSequence.g:861:3: '_'
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
    // InternalSequence.g:870:1: rule__ResponseMessage__Alternatives_5 : ( ( ( rule__ResponseMessage__RightAssignment_5_0 ) ) | ( '_' ) );
    public final void rule__ResponseMessage__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:874:1: ( ( ( rule__ResponseMessage__RightAssignment_5_0 ) ) | ( '_' ) )
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
                    // InternalSequence.g:875:2: ( ( rule__ResponseMessage__RightAssignment_5_0 ) )
                    {
                    // InternalSequence.g:875:2: ( ( rule__ResponseMessage__RightAssignment_5_0 ) )
                    // InternalSequence.g:876:3: ( rule__ResponseMessage__RightAssignment_5_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getRightAssignment_5_0()); 
                    // InternalSequence.g:877:3: ( rule__ResponseMessage__RightAssignment_5_0 )
                    // InternalSequence.g:877:4: rule__ResponseMessage__RightAssignment_5_0
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
                    // InternalSequence.g:881:2: ( '_' )
                    {
                    // InternalSequence.g:881:2: ( '_' )
                    // InternalSequence.g:882:3: '_'
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
    // InternalSequence.g:891:1: rule__CombinedFragment__Alternatives : ( ( ruleAlternative ) | ( ruleOption ) | ( ruleParallel ) | ( ruleCritical ) | ( ruleLoop ) );
    public final void rule__CombinedFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:895:1: ( ( ruleAlternative ) | ( ruleOption ) | ( ruleParallel ) | ( ruleCritical ) | ( ruleLoop ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt6=1;
                }
                break;
            case 42:
                {
                alt6=2;
                }
                break;
            case 43:
                {
                alt6=3;
                }
                break;
            case 44:
                {
                alt6=4;
                }
                break;
            case 45:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSequence.g:896:2: ( ruleAlternative )
                    {
                    // InternalSequence.g:896:2: ( ruleAlternative )
                    // InternalSequence.g:897:3: ruleAlternative
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
                    // InternalSequence.g:902:2: ( ruleOption )
                    {
                    // InternalSequence.g:902:2: ( ruleOption )
                    // InternalSequence.g:903:3: ruleOption
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
                    // InternalSequence.g:908:2: ( ruleParallel )
                    {
                    // InternalSequence.g:908:2: ( ruleParallel )
                    // InternalSequence.g:909:3: ruleParallel
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
                    // InternalSequence.g:914:2: ( ruleCritical )
                    {
                    // InternalSequence.g:914:2: ( ruleCritical )
                    // InternalSequence.g:915:3: ruleCritical
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
                    // InternalSequence.g:920:2: ( ruleLoop )
                    {
                    // InternalSequence.g:920:2: ( ruleLoop )
                    // InternalSequence.g:921:3: ruleLoop
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


    // $ANTLR start "rule__ParallelFragment__Alternatives"
    // InternalSequence.g:930:1: rule__ParallelFragment__Alternatives : ( ( ( rule__ParallelFragment__Group_0__0 ) ) | ( ( rule__ParallelFragment__FragmentsAssignment_1 ) ) );
    public final void rule__ParallelFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:934:1: ( ( ( rule__ParallelFragment__Group_0__0 ) ) | ( ( rule__ParallelFragment__FragmentsAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==40) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=12 && LA7_0<=13)||(LA7_0>=34 && LA7_0<=39)||(LA7_0>=42 && LA7_0<=45)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSequence.g:935:2: ( ( rule__ParallelFragment__Group_0__0 ) )
                    {
                    // InternalSequence.g:935:2: ( ( rule__ParallelFragment__Group_0__0 ) )
                    // InternalSequence.g:936:3: ( rule__ParallelFragment__Group_0__0 )
                    {
                     before(grammarAccess.getParallelFragmentAccess().getGroup_0()); 
                    // InternalSequence.g:937:3: ( rule__ParallelFragment__Group_0__0 )
                    // InternalSequence.g:937:4: rule__ParallelFragment__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParallelFragment__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallelFragmentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:941:2: ( ( rule__ParallelFragment__FragmentsAssignment_1 ) )
                    {
                    // InternalSequence.g:941:2: ( ( rule__ParallelFragment__FragmentsAssignment_1 ) )
                    // InternalSequence.g:942:3: ( rule__ParallelFragment__FragmentsAssignment_1 )
                    {
                     before(grammarAccess.getParallelFragmentAccess().getFragmentsAssignment_1()); 
                    // InternalSequence.g:943:3: ( rule__ParallelFragment__FragmentsAssignment_1 )
                    // InternalSequence.g:943:4: rule__ParallelFragment__FragmentsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParallelFragment__FragmentsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallelFragmentAccess().getFragmentsAssignment_1()); 

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
    // $ANTLR end "rule__ParallelFragment__Alternatives"


    // $ANTLR start "rule__ConditionedFragment__Alternatives_3"
    // InternalSequence.g:951:1: rule__ConditionedFragment__Alternatives_3 : ( ( ( rule__ConditionedFragment__Group_3_0__0 ) ) | ( ( rule__ConditionedFragment__FragmentsAssignment_3_1 ) ) );
    public final void rule__ConditionedFragment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:955:1: ( ( ( rule__ConditionedFragment__Group_3_0__0 ) ) | ( ( rule__ConditionedFragment__FragmentsAssignment_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=12 && LA8_0<=13)||(LA8_0>=34 && LA8_0<=39)||(LA8_0>=42 && LA8_0<=45)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSequence.g:956:2: ( ( rule__ConditionedFragment__Group_3_0__0 ) )
                    {
                    // InternalSequence.g:956:2: ( ( rule__ConditionedFragment__Group_3_0__0 ) )
                    // InternalSequence.g:957:3: ( rule__ConditionedFragment__Group_3_0__0 )
                    {
                     before(grammarAccess.getConditionedFragmentAccess().getGroup_3_0()); 
                    // InternalSequence.g:958:3: ( rule__ConditionedFragment__Group_3_0__0 )
                    // InternalSequence.g:958:4: rule__ConditionedFragment__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionedFragment__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionedFragmentAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:962:2: ( ( rule__ConditionedFragment__FragmentsAssignment_3_1 ) )
                    {
                    // InternalSequence.g:962:2: ( ( rule__ConditionedFragment__FragmentsAssignment_3_1 ) )
                    // InternalSequence.g:963:3: ( rule__ConditionedFragment__FragmentsAssignment_3_1 )
                    {
                     before(grammarAccess.getConditionedFragmentAccess().getFragmentsAssignment_3_1()); 
                    // InternalSequence.g:964:3: ( rule__ConditionedFragment__FragmentsAssignment_3_1 )
                    // InternalSequence.g:964:4: rule__ConditionedFragment__FragmentsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionedFragment__FragmentsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionedFragmentAccess().getFragmentsAssignment_3_1()); 

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
    // $ANTLR end "rule__ConditionedFragment__Alternatives_3"


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
    // InternalSequence.g:1274:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__InteractionFragmentsAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1278:1: ( ( ( rule__RootPackage__InteractionFragmentsAssignment_3 )* ) )
            // InternalSequence.g:1279:1: ( ( rule__RootPackage__InteractionFragmentsAssignment_3 )* )
            {
            // InternalSequence.g:1279:1: ( ( rule__RootPackage__InteractionFragmentsAssignment_3 )* )
            // InternalSequence.g:1280:2: ( rule__RootPackage__InteractionFragmentsAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getInteractionFragmentsAssignment_3()); 
            // InternalSequence.g:1281:2: ( rule__RootPackage__InteractionFragmentsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=13)||(LA13_0>=34 && LA13_0<=39)||(LA13_0>=42 && LA13_0<=45)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSequence.g:1281:3: rule__RootPackage__InteractionFragmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RootPackage__InteractionFragmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRootPackageAccess().getInteractionFragmentsAssignment_3()); 

            }


            }

        }
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
    // InternalSequence.g:1425:1: rule__Actor__Group_2_0__1 : rule__Actor__Group_2_0__1__Impl rule__Actor__Group_2_0__2 ;
    public final void rule__Actor__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1429:1: ( rule__Actor__Group_2_0__1__Impl rule__Actor__Group_2_0__2 )
            // InternalSequence.g:1430:2: rule__Actor__Group_2_0__1__Impl rule__Actor__Group_2_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_0__2();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:1437:1: rule__Actor__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__Actor__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1441:1: ( ( ':' ) )
            // InternalSequence.g:1442:1: ( ':' )
            {
            // InternalSequence.g:1442:1: ( ':' )
            // InternalSequence.g:1443:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_2_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_2_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Actor__Group_2_0__2"
    // InternalSequence.g:1452:1: rule__Actor__Group_2_0__2 : rule__Actor__Group_2_0__2__Impl ;
    public final void rule__Actor__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1456:1: ( rule__Actor__Group_2_0__2__Impl )
            // InternalSequence.g:1457:2: rule__Actor__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_0__2"


    // $ANTLR start "rule__Actor__Group_2_0__2__Impl"
    // InternalSequence.g:1463:1: rule__Actor__Group_2_0__2__Impl : ( ( rule__Actor__TypeAssignment_2_0_2 ) ) ;
    public final void rule__Actor__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1467:1: ( ( ( rule__Actor__TypeAssignment_2_0_2 ) ) )
            // InternalSequence.g:1468:1: ( ( rule__Actor__TypeAssignment_2_0_2 ) )
            {
            // InternalSequence.g:1468:1: ( ( rule__Actor__TypeAssignment_2_0_2 ) )
            // InternalSequence.g:1469:2: ( rule__Actor__TypeAssignment_2_0_2 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_2_0_2()); 
            // InternalSequence.g:1470:2: ( rule__Actor__TypeAssignment_2_0_2 )
            // InternalSequence.g:1470:3: rule__Actor__TypeAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_0__2__Impl"


    // $ANTLR start "rule__Actor__Group_2_1__0"
    // InternalSequence.g:1479:1: rule__Actor__Group_2_1__0 : rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 ;
    public final void rule__Actor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1483:1: ( rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 )
            // InternalSequence.g:1484:2: rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1
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
    // InternalSequence.g:1491:1: rule__Actor__Group_2_1__0__Impl : ( ':' ) ;
    public final void rule__Actor__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1495:1: ( ( ':' ) )
            // InternalSequence.g:1496:1: ( ':' )
            {
            // InternalSequence.g:1496:1: ( ':' )
            // InternalSequence.g:1497:2: ':'
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
    // InternalSequence.g:1506:1: rule__Actor__Group_2_1__1 : rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 ;
    public final void rule__Actor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1510:1: ( rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 )
            // InternalSequence.g:1511:2: rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2
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
    // InternalSequence.g:1518:1: rule__Actor__Group_2_1__1__Impl : ( ( rule__Actor__TypeAssignment_2_1_1 ) ) ;
    public final void rule__Actor__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1522:1: ( ( ( rule__Actor__TypeAssignment_2_1_1 ) ) )
            // InternalSequence.g:1523:1: ( ( rule__Actor__TypeAssignment_2_1_1 ) )
            {
            // InternalSequence.g:1523:1: ( ( rule__Actor__TypeAssignment_2_1_1 ) )
            // InternalSequence.g:1524:2: ( rule__Actor__TypeAssignment_2_1_1 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_2_1_1()); 
            // InternalSequence.g:1525:2: ( rule__Actor__TypeAssignment_2_1_1 )
            // InternalSequence.g:1525:3: rule__Actor__TypeAssignment_2_1_1
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
    // InternalSequence.g:1533:1: rule__Actor__Group_2_1__2 : rule__Actor__Group_2_1__2__Impl rule__Actor__Group_2_1__3 ;
    public final void rule__Actor__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1537:1: ( rule__Actor__Group_2_1__2__Impl rule__Actor__Group_2_1__3 )
            // InternalSequence.g:1538:2: rule__Actor__Group_2_1__2__Impl rule__Actor__Group_2_1__3
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
    // InternalSequence.g:1545:1: rule__Actor__Group_2_1__2__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1549:1: ( ( 'as' ) )
            // InternalSequence.g:1550:1: ( 'as' )
            {
            // InternalSequence.g:1550:1: ( 'as' )
            // InternalSequence.g:1551:2: 'as'
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
    // InternalSequence.g:1560:1: rule__Actor__Group_2_1__3 : rule__Actor__Group_2_1__3__Impl ;
    public final void rule__Actor__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1564:1: ( rule__Actor__Group_2_1__3__Impl )
            // InternalSequence.g:1565:2: rule__Actor__Group_2_1__3__Impl
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
    // InternalSequence.g:1571:1: rule__Actor__Group_2_1__3__Impl : ( ( rule__Actor__AliasAssignment_2_1_3 ) ) ;
    public final void rule__Actor__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1575:1: ( ( ( rule__Actor__AliasAssignment_2_1_3 ) ) )
            // InternalSequence.g:1576:1: ( ( rule__Actor__AliasAssignment_2_1_3 ) )
            {
            // InternalSequence.g:1576:1: ( ( rule__Actor__AliasAssignment_2_1_3 ) )
            // InternalSequence.g:1577:2: ( rule__Actor__AliasAssignment_2_1_3 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_1_3()); 
            // InternalSequence.g:1578:2: ( rule__Actor__AliasAssignment_2_1_3 )
            // InternalSequence.g:1578:3: rule__Actor__AliasAssignment_2_1_3
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
    // InternalSequence.g:1587:1: rule__Actor__Group_2_2__0 : rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 ;
    public final void rule__Actor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1591:1: ( rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 )
            // InternalSequence.g:1592:2: rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSequence.g:1599:1: rule__Actor__Group_2_2__0__Impl : ( ( rule__Actor__NameAssignment_2_2_0 ) ) ;
    public final void rule__Actor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1603:1: ( ( ( rule__Actor__NameAssignment_2_2_0 ) ) )
            // InternalSequence.g:1604:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            {
            // InternalSequence.g:1604:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            // InternalSequence.g:1605:2: ( rule__Actor__NameAssignment_2_2_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_2_0()); 
            // InternalSequence.g:1606:2: ( rule__Actor__NameAssignment_2_2_0 )
            // InternalSequence.g:1606:3: rule__Actor__NameAssignment_2_2_0
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
    // InternalSequence.g:1614:1: rule__Actor__Group_2_2__1 : rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 ;
    public final void rule__Actor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1618:1: ( rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 )
            // InternalSequence.g:1619:2: rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:1626:1: rule__Actor__Group_2_2__1__Impl : ( ':' ) ;
    public final void rule__Actor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1630:1: ( ( ':' ) )
            // InternalSequence.g:1631:1: ( ':' )
            {
            // InternalSequence.g:1631:1: ( ':' )
            // InternalSequence.g:1632:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_2_2_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_2_2_1()); 

            }


            }

        }
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
    // InternalSequence.g:1641:1: rule__Actor__Group_2_2__2 : rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 ;
    public final void rule__Actor__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1645:1: ( rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 )
            // InternalSequence.g:1646:2: rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSequence.g:1653:1: rule__Actor__Group_2_2__2__Impl : ( ( rule__Actor__TypeAssignment_2_2_2 ) ) ;
    public final void rule__Actor__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1657:1: ( ( ( rule__Actor__TypeAssignment_2_2_2 ) ) )
            // InternalSequence.g:1658:1: ( ( rule__Actor__TypeAssignment_2_2_2 ) )
            {
            // InternalSequence.g:1658:1: ( ( rule__Actor__TypeAssignment_2_2_2 ) )
            // InternalSequence.g:1659:2: ( rule__Actor__TypeAssignment_2_2_2 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_2_2_2()); 
            // InternalSequence.g:1660:2: ( rule__Actor__TypeAssignment_2_2_2 )
            // InternalSequence.g:1660:3: rule__Actor__TypeAssignment_2_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeAssignment_2_2_2();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_2_2_2()); 

            }


            }

        }
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
    // InternalSequence.g:1668:1: rule__Actor__Group_2_2__3 : rule__Actor__Group_2_2__3__Impl rule__Actor__Group_2_2__4 ;
    public final void rule__Actor__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1672:1: ( rule__Actor__Group_2_2__3__Impl rule__Actor__Group_2_2__4 )
            // InternalSequence.g:1673:2: rule__Actor__Group_2_2__3__Impl rule__Actor__Group_2_2__4
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group_2_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_2__4();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:1680:1: rule__Actor__Group_2_2__3__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1684:1: ( ( 'as' ) )
            // InternalSequence.g:1685:1: ( 'as' )
            {
            // InternalSequence.g:1685:1: ( 'as' )
            // InternalSequence.g:1686:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_2_2_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAsKeyword_2_2_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Actor__Group_2_2__4"
    // InternalSequence.g:1695:1: rule__Actor__Group_2_2__4 : rule__Actor__Group_2_2__4__Impl ;
    public final void rule__Actor__Group_2_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1699:1: ( rule__Actor__Group_2_2__4__Impl )
            // InternalSequence.g:1700:2: rule__Actor__Group_2_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_2__4"


    // $ANTLR start "rule__Actor__Group_2_2__4__Impl"
    // InternalSequence.g:1706:1: rule__Actor__Group_2_2__4__Impl : ( ( rule__Actor__AliasAssignment_2_2_4 ) ) ;
    public final void rule__Actor__Group_2_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1710:1: ( ( ( rule__Actor__AliasAssignment_2_2_4 ) ) )
            // InternalSequence.g:1711:1: ( ( rule__Actor__AliasAssignment_2_2_4 ) )
            {
            // InternalSequence.g:1711:1: ( ( rule__Actor__AliasAssignment_2_2_4 ) )
            // InternalSequence.g:1712:2: ( rule__Actor__AliasAssignment_2_2_4 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_2_4()); 
            // InternalSequence.g:1713:2: ( rule__Actor__AliasAssignment_2_2_4 )
            // InternalSequence.g:1713:3: rule__Actor__AliasAssignment_2_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Actor__AliasAssignment_2_2_4();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAliasAssignment_2_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_2__4__Impl"


    // $ANTLR start "rule__Actor__Group_3__0"
    // InternalSequence.g:1722:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1726:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // InternalSequence.g:1727:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSequence.g:1734:1: rule__Actor__Group_3__0__Impl : ( 'role[' ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1738:1: ( ( 'role[' ) )
            // InternalSequence.g:1739:1: ( 'role[' )
            {
            // InternalSequence.g:1739:1: ( 'role[' )
            // InternalSequence.g:1740:2: 'role['
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
    // InternalSequence.g:1749:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1753:1: ( rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 )
            // InternalSequence.g:1754:2: rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSequence.g:1761:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1765:1: ( ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) )
            // InternalSequence.g:1766:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            {
            // InternalSequence.g:1766:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            // InternalSequence.g:1767:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            {
             before(grammarAccess.getActorAccess().getActorTypeAssignment_3_1()); 
            // InternalSequence.g:1768:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            // InternalSequence.g:1768:3: rule__Actor__ActorTypeAssignment_3_1
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
    // InternalSequence.g:1776:1: rule__Actor__Group_3__2 : rule__Actor__Group_3__2__Impl ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1780:1: ( rule__Actor__Group_3__2__Impl )
            // InternalSequence.g:1781:2: rule__Actor__Group_3__2__Impl
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
    // InternalSequence.g:1787:1: rule__Actor__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Actor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1791:1: ( ( ']' ) )
            // InternalSequence.g:1792:1: ( ']' )
            {
            // InternalSequence.g:1792:1: ( ']' )
            // InternalSequence.g:1793:2: ']'
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


    // $ANTLR start "rule__Message__Group__0"
    // InternalSequence.g:1803:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1807:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalSequence.g:1808:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSequence.g:1815:1: rule__Message__Group__0__Impl : ( ( rule__Message__Alternatives_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1819:1: ( ( ( rule__Message__Alternatives_0 ) ) )
            // InternalSequence.g:1820:1: ( ( rule__Message__Alternatives_0 ) )
            {
            // InternalSequence.g:1820:1: ( ( rule__Message__Alternatives_0 ) )
            // InternalSequence.g:1821:2: ( rule__Message__Alternatives_0 )
            {
             before(grammarAccess.getMessageAccess().getAlternatives_0()); 
            // InternalSequence.g:1822:2: ( rule__Message__Alternatives_0 )
            // InternalSequence.g:1822:3: rule__Message__Alternatives_0
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
    // InternalSequence.g:1830:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1834:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalSequence.g:1835:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSequence.g:1842:1: rule__Message__Group__1__Impl : ( ( rule__Message__Group_1__0 )? ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1846:1: ( ( ( rule__Message__Group_1__0 )? ) )
            // InternalSequence.g:1847:1: ( ( rule__Message__Group_1__0 )? )
            {
            // InternalSequence.g:1847:1: ( ( rule__Message__Group_1__0 )? )
            // InternalSequence.g:1848:2: ( rule__Message__Group_1__0 )?
            {
             before(grammarAccess.getMessageAccess().getGroup_1()); 
            // InternalSequence.g:1849:2: ( rule__Message__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSequence.g:1849:3: rule__Message__Group_1__0
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
    // InternalSequence.g:1857:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1861:1: ( rule__Message__Group__2__Impl )
            // InternalSequence.g:1862:2: rule__Message__Group__2__Impl
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
    // InternalSequence.g:1868:1: rule__Message__Group__2__Impl : ( ( rule__Message__TimeConstraintAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1872:1: ( ( ( rule__Message__TimeConstraintAssignment_2 )? ) )
            // InternalSequence.g:1873:1: ( ( rule__Message__TimeConstraintAssignment_2 )? )
            {
            // InternalSequence.g:1873:1: ( ( rule__Message__TimeConstraintAssignment_2 )? )
            // InternalSequence.g:1874:2: ( rule__Message__TimeConstraintAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getTimeConstraintAssignment_2()); 
            // InternalSequence.g:1875:2: ( rule__Message__TimeConstraintAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSequence.g:1875:3: rule__Message__TimeConstraintAssignment_2
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
    // InternalSequence.g:1884:1: rule__Message__Group_1__0 : rule__Message__Group_1__0__Impl rule__Message__Group_1__1 ;
    public final void rule__Message__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1888:1: ( rule__Message__Group_1__0__Impl rule__Message__Group_1__1 )
            // InternalSequence.g:1889:2: rule__Message__Group_1__0__Impl rule__Message__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSequence.g:1896:1: rule__Message__Group_1__0__Impl : ( 'num[' ) ;
    public final void rule__Message__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1900:1: ( ( 'num[' ) )
            // InternalSequence.g:1901:1: ( 'num[' )
            {
            // InternalSequence.g:1901:1: ( 'num[' )
            // InternalSequence.g:1902:2: 'num['
            {
             before(grammarAccess.getMessageAccess().getNumKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSequence.g:1911:1: rule__Message__Group_1__1 : rule__Message__Group_1__1__Impl rule__Message__Group_1__2 ;
    public final void rule__Message__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1915:1: ( rule__Message__Group_1__1__Impl rule__Message__Group_1__2 )
            // InternalSequence.g:1916:2: rule__Message__Group_1__1__Impl rule__Message__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSequence.g:1923:1: rule__Message__Group_1__1__Impl : ( ( rule__Message__OrderAssignment_1_1 ) ) ;
    public final void rule__Message__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1927:1: ( ( ( rule__Message__OrderAssignment_1_1 ) ) )
            // InternalSequence.g:1928:1: ( ( rule__Message__OrderAssignment_1_1 ) )
            {
            // InternalSequence.g:1928:1: ( ( rule__Message__OrderAssignment_1_1 ) )
            // InternalSequence.g:1929:2: ( rule__Message__OrderAssignment_1_1 )
            {
             before(grammarAccess.getMessageAccess().getOrderAssignment_1_1()); 
            // InternalSequence.g:1930:2: ( rule__Message__OrderAssignment_1_1 )
            // InternalSequence.g:1930:3: rule__Message__OrderAssignment_1_1
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
    // InternalSequence.g:1938:1: rule__Message__Group_1__2 : rule__Message__Group_1__2__Impl ;
    public final void rule__Message__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1942:1: ( rule__Message__Group_1__2__Impl )
            // InternalSequence.g:1943:2: rule__Message__Group_1__2__Impl
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
    // InternalSequence.g:1949:1: rule__Message__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Message__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1953:1: ( ( ']' ) )
            // InternalSequence.g:1954:1: ( ']' )
            {
            // InternalSequence.g:1954:1: ( ']' )
            // InternalSequence.g:1955:2: ']'
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
    // InternalSequence.g:1965:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1969:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // InternalSequence.g:1970:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSequence.g:1977:1: rule__TimeConstraint__Group__0__Impl : ( 'time[' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1981:1: ( ( 'time[' ) )
            // InternalSequence.g:1982:1: ( 'time[' )
            {
            // InternalSequence.g:1982:1: ( 'time[' )
            // InternalSequence.g:1983:2: 'time['
            {
             before(grammarAccess.getTimeConstraintAccess().getTimeKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSequence.g:1992:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1996:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // InternalSequence.g:1997:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSequence.g:2004:1: rule__TimeConstraint__Group__1__Impl : ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2008:1: ( ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) ) )
            // InternalSequence.g:2009:1: ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) )
            {
            // InternalSequence.g:2009:1: ( ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* ) )
            // InternalSequence.g:2010:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) ) ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* )
            {
            // InternalSequence.g:2010:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 ) )
            // InternalSequence.g:2011:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 
            // InternalSequence.g:2012:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )
            // InternalSequence.g:2012:4: rule__TimeConstraint__ConstraintsAssignment_1
            {
            pushFollow(FOLLOW_20);
            rule__TimeConstraint__ConstraintsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 

            }

            // InternalSequence.g:2015:2: ( ( rule__TimeConstraint__ConstraintsAssignment_1 )* )
            // InternalSequence.g:2016:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getTimeConstraintAccess().getConstraintsAssignment_1()); 
            // InternalSequence.g:2017:3: ( rule__TimeConstraint__ConstraintsAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=16 && LA18_0<=19)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSequence.g:2017:4: rule__TimeConstraint__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__TimeConstraint__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalSequence.g:2026:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2030:1: ( rule__TimeConstraint__Group__2__Impl )
            // InternalSequence.g:2031:2: rule__TimeConstraint__Group__2__Impl
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
    // InternalSequence.g:2037:1: rule__TimeConstraint__Group__2__Impl : ( ']' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2041:1: ( ( ']' ) )
            // InternalSequence.g:2042:1: ( ']' )
            {
            // InternalSequence.g:2042:1: ( ']' )
            // InternalSequence.g:2043:2: ']'
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
    // InternalSequence.g:2053:1: rule__InnerTimeConstraint__Group__0 : rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1 ;
    public final void rule__InnerTimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2057:1: ( rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1 )
            // InternalSequence.g:2058:2: rule__InnerTimeConstraint__Group__0__Impl rule__InnerTimeConstraint__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSequence.g:2065:1: rule__InnerTimeConstraint__Group__0__Impl : ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) ) ;
    public final void rule__InnerTimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2069:1: ( ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) ) )
            // InternalSequence.g:2070:1: ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) )
            {
            // InternalSequence.g:2070:1: ( ( rule__InnerTimeConstraint__TypeAssignment_0 ) )
            // InternalSequence.g:2071:2: ( rule__InnerTimeConstraint__TypeAssignment_0 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getTypeAssignment_0()); 
            // InternalSequence.g:2072:2: ( rule__InnerTimeConstraint__TypeAssignment_0 )
            // InternalSequence.g:2072:3: rule__InnerTimeConstraint__TypeAssignment_0
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
    // InternalSequence.g:2080:1: rule__InnerTimeConstraint__Group__1 : rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2 ;
    public final void rule__InnerTimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2084:1: ( rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2 )
            // InternalSequence.g:2085:2: rule__InnerTimeConstraint__Group__1__Impl rule__InnerTimeConstraint__Group__2
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
    // InternalSequence.g:2092:1: rule__InnerTimeConstraint__Group__1__Impl : ( '=' ) ;
    public final void rule__InnerTimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2096:1: ( ( '=' ) )
            // InternalSequence.g:2097:1: ( '=' )
            {
            // InternalSequence.g:2097:1: ( '=' )
            // InternalSequence.g:2098:2: '='
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSequence.g:2107:1: rule__InnerTimeConstraint__Group__2 : rule__InnerTimeConstraint__Group__2__Impl ;
    public final void rule__InnerTimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2111:1: ( rule__InnerTimeConstraint__Group__2__Impl )
            // InternalSequence.g:2112:2: rule__InnerTimeConstraint__Group__2__Impl
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
    // InternalSequence.g:2118:1: rule__InnerTimeConstraint__Group__2__Impl : ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) ) ;
    public final void rule__InnerTimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2122:1: ( ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) ) )
            // InternalSequence.g:2123:1: ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) )
            {
            // InternalSequence.g:2123:1: ( ( rule__InnerTimeConstraint__ValueAssignment_2 ) )
            // InternalSequence.g:2124:2: ( rule__InnerTimeConstraint__ValueAssignment_2 )
            {
             before(grammarAccess.getInnerTimeConstraintAccess().getValueAssignment_2()); 
            // InternalSequence.g:2125:2: ( rule__InnerTimeConstraint__ValueAssignment_2 )
            // InternalSequence.g:2125:3: rule__InnerTimeConstraint__ValueAssignment_2
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
    // InternalSequence.g:2134:1: rule__StandardMessage__Group__0 : rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 ;
    public final void rule__StandardMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2138:1: ( rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 )
            // InternalSequence.g:2139:2: rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1
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
    // InternalSequence.g:2146:1: rule__StandardMessage__Group__0__Impl : ( ( rule__StandardMessage__TypeAssignment_0 ) ) ;
    public final void rule__StandardMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2150:1: ( ( ( rule__StandardMessage__TypeAssignment_0 ) ) )
            // InternalSequence.g:2151:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            {
            // InternalSequence.g:2151:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            // InternalSequence.g:2152:2: ( rule__StandardMessage__TypeAssignment_0 )
            {
             before(grammarAccess.getStandardMessageAccess().getTypeAssignment_0()); 
            // InternalSequence.g:2153:2: ( rule__StandardMessage__TypeAssignment_0 )
            // InternalSequence.g:2153:3: rule__StandardMessage__TypeAssignment_0
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
    // InternalSequence.g:2161:1: rule__StandardMessage__Group__1 : rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 ;
    public final void rule__StandardMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2165:1: ( rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 )
            // InternalSequence.g:2166:2: rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSequence.g:2173:1: rule__StandardMessage__Group__1__Impl : ( ( rule__StandardMessage__NameAssignment_1 ) ) ;
    public final void rule__StandardMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2177:1: ( ( ( rule__StandardMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:2178:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:2178:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            // InternalSequence.g:2179:2: ( rule__StandardMessage__NameAssignment_1 )
            {
             before(grammarAccess.getStandardMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:2180:2: ( rule__StandardMessage__NameAssignment_1 )
            // InternalSequence.g:2180:3: rule__StandardMessage__NameAssignment_1
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
    // InternalSequence.g:2188:1: rule__StandardMessage__Group__2 : rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 ;
    public final void rule__StandardMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2192:1: ( rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 )
            // InternalSequence.g:2193:2: rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3
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
    // InternalSequence.g:2200:1: rule__StandardMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__StandardMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2204:1: ( ( '(' ) )
            // InternalSequence.g:2205:1: ( '(' )
            {
            // InternalSequence.g:2205:1: ( '(' )
            // InternalSequence.g:2206:2: '('
            {
             before(grammarAccess.getStandardMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:2215:1: rule__StandardMessage__Group__3 : rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 ;
    public final void rule__StandardMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2219:1: ( rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 )
            // InternalSequence.g:2220:2: rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalSequence.g:2227:1: rule__StandardMessage__Group__3__Impl : ( ( rule__StandardMessage__LeftAssignment_3 ) ) ;
    public final void rule__StandardMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2231:1: ( ( ( rule__StandardMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:2232:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:2232:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            // InternalSequence.g:2233:2: ( rule__StandardMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:2234:2: ( rule__StandardMessage__LeftAssignment_3 )
            // InternalSequence.g:2234:3: rule__StandardMessage__LeftAssignment_3
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
    // InternalSequence.g:2242:1: rule__StandardMessage__Group__4 : rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 ;
    public final void rule__StandardMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2246:1: ( rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 )
            // InternalSequence.g:2247:2: rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5
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
    // InternalSequence.g:2254:1: rule__StandardMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__StandardMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2258:1: ( ( ',' ) )
            // InternalSequence.g:2259:1: ( ',' )
            {
            // InternalSequence.g:2259:1: ( ',' )
            // InternalSequence.g:2260:2: ','
            {
             before(grammarAccess.getStandardMessageAccess().getCommaKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSequence.g:2269:1: rule__StandardMessage__Group__5 : rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 ;
    public final void rule__StandardMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2273:1: ( rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 )
            // InternalSequence.g:2274:2: rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:2281:1: rule__StandardMessage__Group__5__Impl : ( ( rule__StandardMessage__RightAssignment_5 ) ) ;
    public final void rule__StandardMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2285:1: ( ( ( rule__StandardMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:2286:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:2286:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            // InternalSequence.g:2287:2: ( rule__StandardMessage__RightAssignment_5 )
            {
             before(grammarAccess.getStandardMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:2288:2: ( rule__StandardMessage__RightAssignment_5 )
            // InternalSequence.g:2288:3: rule__StandardMessage__RightAssignment_5
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
    // InternalSequence.g:2296:1: rule__StandardMessage__Group__6 : rule__StandardMessage__Group__6__Impl ;
    public final void rule__StandardMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2300:1: ( rule__StandardMessage__Group__6__Impl )
            // InternalSequence.g:2301:2: rule__StandardMessage__Group__6__Impl
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
    // InternalSequence.g:2307:1: rule__StandardMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__StandardMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2311:1: ( ( ')' ) )
            // InternalSequence.g:2312:1: ( ')' )
            {
            // InternalSequence.g:2312:1: ( ')' )
            // InternalSequence.g:2313:2: ')'
            {
             before(grammarAccess.getStandardMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSequence.g:2323:1: rule__ResponseMessage__Group__0 : rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 ;
    public final void rule__ResponseMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2327:1: ( rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 )
            // InternalSequence.g:2328:2: rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1
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
    // InternalSequence.g:2335:1: rule__ResponseMessage__Group__0__Impl : ( 'resp' ) ;
    public final void rule__ResponseMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2339:1: ( ( 'resp' ) )
            // InternalSequence.g:2340:1: ( 'resp' )
            {
            // InternalSequence.g:2340:1: ( 'resp' )
            // InternalSequence.g:2341:2: 'resp'
            {
             before(grammarAccess.getResponseMessageAccess().getRespKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSequence.g:2350:1: rule__ResponseMessage__Group__1 : rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 ;
    public final void rule__ResponseMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2354:1: ( rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 )
            // InternalSequence.g:2355:2: rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSequence.g:2362:1: rule__ResponseMessage__Group__1__Impl : ( ( rule__ResponseMessage__NameAssignment_1 ) ) ;
    public final void rule__ResponseMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2366:1: ( ( ( rule__ResponseMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:2367:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:2367:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            // InternalSequence.g:2368:2: ( rule__ResponseMessage__NameAssignment_1 )
            {
             before(grammarAccess.getResponseMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:2369:2: ( rule__ResponseMessage__NameAssignment_1 )
            // InternalSequence.g:2369:3: rule__ResponseMessage__NameAssignment_1
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
    // InternalSequence.g:2377:1: rule__ResponseMessage__Group__2 : rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 ;
    public final void rule__ResponseMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2381:1: ( rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 )
            // InternalSequence.g:2382:2: rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:2389:1: rule__ResponseMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__ResponseMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2393:1: ( ( '(' ) )
            // InternalSequence.g:2394:1: ( '(' )
            {
            // InternalSequence.g:2394:1: ( '(' )
            // InternalSequence.g:2395:2: '('
            {
             before(grammarAccess.getResponseMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:2404:1: rule__ResponseMessage__Group__3 : rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 ;
    public final void rule__ResponseMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2408:1: ( rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 )
            // InternalSequence.g:2409:2: rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalSequence.g:2416:1: rule__ResponseMessage__Group__3__Impl : ( ( rule__ResponseMessage__Alternatives_3 ) ) ;
    public final void rule__ResponseMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2420:1: ( ( ( rule__ResponseMessage__Alternatives_3 ) ) )
            // InternalSequence.g:2421:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            {
            // InternalSequence.g:2421:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            // InternalSequence.g:2422:2: ( rule__ResponseMessage__Alternatives_3 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_3()); 
            // InternalSequence.g:2423:2: ( rule__ResponseMessage__Alternatives_3 )
            // InternalSequence.g:2423:3: rule__ResponseMessage__Alternatives_3
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
    // InternalSequence.g:2431:1: rule__ResponseMessage__Group__4 : rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 ;
    public final void rule__ResponseMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2435:1: ( rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 )
            // InternalSequence.g:2436:2: rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:2443:1: rule__ResponseMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__ResponseMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2447:1: ( ( ',' ) )
            // InternalSequence.g:2448:1: ( ',' )
            {
            // InternalSequence.g:2448:1: ( ',' )
            // InternalSequence.g:2449:2: ','
            {
             before(grammarAccess.getResponseMessageAccess().getCommaKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSequence.g:2458:1: rule__ResponseMessage__Group__5 : rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 ;
    public final void rule__ResponseMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2462:1: ( rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 )
            // InternalSequence.g:2463:2: rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:2470:1: rule__ResponseMessage__Group__5__Impl : ( ( rule__ResponseMessage__Alternatives_5 ) ) ;
    public final void rule__ResponseMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2474:1: ( ( ( rule__ResponseMessage__Alternatives_5 ) ) )
            // InternalSequence.g:2475:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            {
            // InternalSequence.g:2475:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            // InternalSequence.g:2476:2: ( rule__ResponseMessage__Alternatives_5 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_5()); 
            // InternalSequence.g:2477:2: ( rule__ResponseMessage__Alternatives_5 )
            // InternalSequence.g:2477:3: rule__ResponseMessage__Alternatives_5
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
    // InternalSequence.g:2485:1: rule__ResponseMessage__Group__6 : rule__ResponseMessage__Group__6__Impl ;
    public final void rule__ResponseMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2489:1: ( rule__ResponseMessage__Group__6__Impl )
            // InternalSequence.g:2490:2: rule__ResponseMessage__Group__6__Impl
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
    // InternalSequence.g:2496:1: rule__ResponseMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__ResponseMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2500:1: ( ( ')' ) )
            // InternalSequence.g:2501:1: ( ')' )
            {
            // InternalSequence.g:2501:1: ( ')' )
            // InternalSequence.g:2502:2: ')'
            {
             before(grammarAccess.getResponseMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSequence.g:2512:1: rule__FoundMessage__Group__0 : rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 ;
    public final void rule__FoundMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2516:1: ( rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 )
            // InternalSequence.g:2517:2: rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSequence.g:2524:1: rule__FoundMessage__Group__0__Impl : ( ( 'found' )? ) ;
    public final void rule__FoundMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2528:1: ( ( ( 'found' )? ) )
            // InternalSequence.g:2529:1: ( ( 'found' )? )
            {
            // InternalSequence.g:2529:1: ( ( 'found' )? )
            // InternalSequence.g:2530:2: ( 'found' )?
            {
             before(grammarAccess.getFoundMessageAccess().getFoundKeyword_0()); 
            // InternalSequence.g:2531:2: ( 'found' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSequence.g:2531:3: 'found'
                    {
                    match(input,35,FOLLOW_2); 

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
    // InternalSequence.g:2539:1: rule__FoundMessage__Group__1 : rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 ;
    public final void rule__FoundMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2543:1: ( rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 )
            // InternalSequence.g:2544:2: rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2
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
    // InternalSequence.g:2551:1: rule__FoundMessage__Group__1__Impl : ( ( rule__FoundMessage__TypeAssignment_1 ) ) ;
    public final void rule__FoundMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2555:1: ( ( ( rule__FoundMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:2556:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:2556:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            // InternalSequence.g:2557:2: ( rule__FoundMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getFoundMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:2558:2: ( rule__FoundMessage__TypeAssignment_1 )
            // InternalSequence.g:2558:3: rule__FoundMessage__TypeAssignment_1
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
    // InternalSequence.g:2566:1: rule__FoundMessage__Group__2 : rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 ;
    public final void rule__FoundMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2570:1: ( rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 )
            // InternalSequence.g:2571:2: rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSequence.g:2578:1: rule__FoundMessage__Group__2__Impl : ( ( rule__FoundMessage__NameAssignment_2 ) ) ;
    public final void rule__FoundMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2582:1: ( ( ( rule__FoundMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:2583:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:2583:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            // InternalSequence.g:2584:2: ( rule__FoundMessage__NameAssignment_2 )
            {
             before(grammarAccess.getFoundMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:2585:2: ( rule__FoundMessage__NameAssignment_2 )
            // InternalSequence.g:2585:3: rule__FoundMessage__NameAssignment_2
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
    // InternalSequence.g:2593:1: rule__FoundMessage__Group__3 : rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 ;
    public final void rule__FoundMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2597:1: ( rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 )
            // InternalSequence.g:2598:2: rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:2605:1: rule__FoundMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__FoundMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2609:1: ( ( '(' ) )
            // InternalSequence.g:2610:1: ( '(' )
            {
            // InternalSequence.g:2610:1: ( '(' )
            // InternalSequence.g:2611:2: '('
            {
             before(grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:2620:1: rule__FoundMessage__Group__4 : rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 ;
    public final void rule__FoundMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2624:1: ( rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 )
            // InternalSequence.g:2625:2: rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalSequence.g:2632:1: rule__FoundMessage__Group__4__Impl : ( '_' ) ;
    public final void rule__FoundMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2636:1: ( ( '_' ) )
            // InternalSequence.g:2637:1: ( '_' )
            {
            // InternalSequence.g:2637:1: ( '_' )
            // InternalSequence.g:2638:2: '_'
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
    // InternalSequence.g:2647:1: rule__FoundMessage__Group__5 : rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 ;
    public final void rule__FoundMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2651:1: ( rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 )
            // InternalSequence.g:2652:2: rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6
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
    // InternalSequence.g:2659:1: rule__FoundMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__FoundMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2663:1: ( ( ',' ) )
            // InternalSequence.g:2664:1: ( ',' )
            {
            // InternalSequence.g:2664:1: ( ',' )
            // InternalSequence.g:2665:2: ','
            {
             before(grammarAccess.getFoundMessageAccess().getCommaKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSequence.g:2674:1: rule__FoundMessage__Group__6 : rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 ;
    public final void rule__FoundMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2678:1: ( rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 )
            // InternalSequence.g:2679:2: rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:2686:1: rule__FoundMessage__Group__6__Impl : ( ( rule__FoundMessage__RightAssignment_6 ) ) ;
    public final void rule__FoundMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2690:1: ( ( ( rule__FoundMessage__RightAssignment_6 ) ) )
            // InternalSequence.g:2691:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            {
            // InternalSequence.g:2691:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            // InternalSequence.g:2692:2: ( rule__FoundMessage__RightAssignment_6 )
            {
             before(grammarAccess.getFoundMessageAccess().getRightAssignment_6()); 
            // InternalSequence.g:2693:2: ( rule__FoundMessage__RightAssignment_6 )
            // InternalSequence.g:2693:3: rule__FoundMessage__RightAssignment_6
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
    // InternalSequence.g:2701:1: rule__FoundMessage__Group__7 : rule__FoundMessage__Group__7__Impl ;
    public final void rule__FoundMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2705:1: ( rule__FoundMessage__Group__7__Impl )
            // InternalSequence.g:2706:2: rule__FoundMessage__Group__7__Impl
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
    // InternalSequence.g:2712:1: rule__FoundMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__FoundMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2716:1: ( ( ')' ) )
            // InternalSequence.g:2717:1: ( ')' )
            {
            // InternalSequence.g:2717:1: ( ')' )
            // InternalSequence.g:2718:2: ')'
            {
             before(grammarAccess.getFoundMessageAccess().getRightParenthesisKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSequence.g:2728:1: rule__LostMessage__Group__0 : rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 ;
    public final void rule__LostMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2732:1: ( rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 )
            // InternalSequence.g:2733:2: rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSequence.g:2740:1: rule__LostMessage__Group__0__Impl : ( ( 'lost' )? ) ;
    public final void rule__LostMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2744:1: ( ( ( 'lost' )? ) )
            // InternalSequence.g:2745:1: ( ( 'lost' )? )
            {
            // InternalSequence.g:2745:1: ( ( 'lost' )? )
            // InternalSequence.g:2746:2: ( 'lost' )?
            {
             before(grammarAccess.getLostMessageAccess().getLostKeyword_0()); 
            // InternalSequence.g:2747:2: ( 'lost' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSequence.g:2747:3: 'lost'
                    {
                    match(input,36,FOLLOW_2); 

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
    // InternalSequence.g:2755:1: rule__LostMessage__Group__1 : rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 ;
    public final void rule__LostMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2759:1: ( rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 )
            // InternalSequence.g:2760:2: rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2
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
    // InternalSequence.g:2767:1: rule__LostMessage__Group__1__Impl : ( ( rule__LostMessage__TypeAssignment_1 ) ) ;
    public final void rule__LostMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2771:1: ( ( ( rule__LostMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:2772:1: ( ( rule__LostMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:2772:1: ( ( rule__LostMessage__TypeAssignment_1 ) )
            // InternalSequence.g:2773:2: ( rule__LostMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getLostMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:2774:2: ( rule__LostMessage__TypeAssignment_1 )
            // InternalSequence.g:2774:3: rule__LostMessage__TypeAssignment_1
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
    // InternalSequence.g:2782:1: rule__LostMessage__Group__2 : rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 ;
    public final void rule__LostMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2786:1: ( rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 )
            // InternalSequence.g:2787:2: rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSequence.g:2794:1: rule__LostMessage__Group__2__Impl : ( ( rule__LostMessage__NameAssignment_2 ) ) ;
    public final void rule__LostMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2798:1: ( ( ( rule__LostMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:2799:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:2799:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            // InternalSequence.g:2800:2: ( rule__LostMessage__NameAssignment_2 )
            {
             before(grammarAccess.getLostMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:2801:2: ( rule__LostMessage__NameAssignment_2 )
            // InternalSequence.g:2801:3: rule__LostMessage__NameAssignment_2
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
    // InternalSequence.g:2809:1: rule__LostMessage__Group__3 : rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 ;
    public final void rule__LostMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2813:1: ( rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 )
            // InternalSequence.g:2814:2: rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4
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
    // InternalSequence.g:2821:1: rule__LostMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__LostMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2825:1: ( ( '(' ) )
            // InternalSequence.g:2826:1: ( '(' )
            {
            // InternalSequence.g:2826:1: ( '(' )
            // InternalSequence.g:2827:2: '('
            {
             before(grammarAccess.getLostMessageAccess().getLeftParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:2836:1: rule__LostMessage__Group__4 : rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 ;
    public final void rule__LostMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2840:1: ( rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 )
            // InternalSequence.g:2841:2: rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalSequence.g:2848:1: rule__LostMessage__Group__4__Impl : ( ( rule__LostMessage__LeftAssignment_4 ) ) ;
    public final void rule__LostMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2852:1: ( ( ( rule__LostMessage__LeftAssignment_4 ) ) )
            // InternalSequence.g:2853:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            {
            // InternalSequence.g:2853:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            // InternalSequence.g:2854:2: ( rule__LostMessage__LeftAssignment_4 )
            {
             before(grammarAccess.getLostMessageAccess().getLeftAssignment_4()); 
            // InternalSequence.g:2855:2: ( rule__LostMessage__LeftAssignment_4 )
            // InternalSequence.g:2855:3: rule__LostMessage__LeftAssignment_4
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
    // InternalSequence.g:2863:1: rule__LostMessage__Group__5 : rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 ;
    public final void rule__LostMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2867:1: ( rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 )
            // InternalSequence.g:2868:2: rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:2875:1: rule__LostMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__LostMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2879:1: ( ( ',' ) )
            // InternalSequence.g:2880:1: ( ',' )
            {
            // InternalSequence.g:2880:1: ( ',' )
            // InternalSequence.g:2881:2: ','
            {
             before(grammarAccess.getLostMessageAccess().getCommaKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSequence.g:2890:1: rule__LostMessage__Group__6 : rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 ;
    public final void rule__LostMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2894:1: ( rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 )
            // InternalSequence.g:2895:2: rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:2902:1: rule__LostMessage__Group__6__Impl : ( '_' ) ;
    public final void rule__LostMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2906:1: ( ( '_' ) )
            // InternalSequence.g:2907:1: ( '_' )
            {
            // InternalSequence.g:2907:1: ( '_' )
            // InternalSequence.g:2908:2: '_'
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
    // InternalSequence.g:2917:1: rule__LostMessage__Group__7 : rule__LostMessage__Group__7__Impl ;
    public final void rule__LostMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2921:1: ( rule__LostMessage__Group__7__Impl )
            // InternalSequence.g:2922:2: rule__LostMessage__Group__7__Impl
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
    // InternalSequence.g:2928:1: rule__LostMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__LostMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2932:1: ( ( ')' ) )
            // InternalSequence.g:2933:1: ( ')' )
            {
            // InternalSequence.g:2933:1: ( ')' )
            // InternalSequence.g:2934:2: ')'
            {
             before(grammarAccess.getLostMessageAccess().getRightParenthesisKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSequence.g:2944:1: rule__CreateMessage__Group__0 : rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 ;
    public final void rule__CreateMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2948:1: ( rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 )
            // InternalSequence.g:2949:2: rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSequence.g:2956:1: rule__CreateMessage__Group__0__Impl : ( 'create' ) ;
    public final void rule__CreateMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2960:1: ( ( 'create' ) )
            // InternalSequence.g:2961:1: ( 'create' )
            {
            // InternalSequence.g:2961:1: ( 'create' )
            // InternalSequence.g:2962:2: 'create'
            {
             before(grammarAccess.getCreateMessageAccess().getCreateKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSequence.g:2971:1: rule__CreateMessage__Group__1 : rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 ;
    public final void rule__CreateMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2975:1: ( rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 )
            // InternalSequence.g:2976:2: rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSequence.g:2983:1: rule__CreateMessage__Group__1__Impl : ( ( rule__CreateMessage__NameAssignment_1 )? ) ;
    public final void rule__CreateMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2987:1: ( ( ( rule__CreateMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:2988:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:2988:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            // InternalSequence.g:2989:2: ( rule__CreateMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getCreateMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:2990:2: ( rule__CreateMessage__NameAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSequence.g:2990:3: rule__CreateMessage__NameAssignment_1
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
    // InternalSequence.g:2998:1: rule__CreateMessage__Group__2 : rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 ;
    public final void rule__CreateMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3002:1: ( rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 )
            // InternalSequence.g:3003:2: rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3
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
    // InternalSequence.g:3010:1: rule__CreateMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__CreateMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3014:1: ( ( '(' ) )
            // InternalSequence.g:3015:1: ( '(' )
            {
            // InternalSequence.g:3015:1: ( '(' )
            // InternalSequence.g:3016:2: '('
            {
             before(grammarAccess.getCreateMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:3025:1: rule__CreateMessage__Group__3 : rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 ;
    public final void rule__CreateMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3029:1: ( rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 )
            // InternalSequence.g:3030:2: rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalSequence.g:3037:1: rule__CreateMessage__Group__3__Impl : ( ( rule__CreateMessage__LeftAssignment_3 ) ) ;
    public final void rule__CreateMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3041:1: ( ( ( rule__CreateMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:3042:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:3042:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            // InternalSequence.g:3043:2: ( rule__CreateMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:3044:2: ( rule__CreateMessage__LeftAssignment_3 )
            // InternalSequence.g:3044:3: rule__CreateMessage__LeftAssignment_3
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
    // InternalSequence.g:3052:1: rule__CreateMessage__Group__4 : rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 ;
    public final void rule__CreateMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3056:1: ( rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 )
            // InternalSequence.g:3057:2: rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5
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
    // InternalSequence.g:3064:1: rule__CreateMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__CreateMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3068:1: ( ( ',' ) )
            // InternalSequence.g:3069:1: ( ',' )
            {
            // InternalSequence.g:3069:1: ( ',' )
            // InternalSequence.g:3070:2: ','
            {
             before(grammarAccess.getCreateMessageAccess().getCommaKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSequence.g:3079:1: rule__CreateMessage__Group__5 : rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 ;
    public final void rule__CreateMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3083:1: ( rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 )
            // InternalSequence.g:3084:2: rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:3091:1: rule__CreateMessage__Group__5__Impl : ( ( rule__CreateMessage__RightAssignment_5 ) ) ;
    public final void rule__CreateMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3095:1: ( ( ( rule__CreateMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:3096:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:3096:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            // InternalSequence.g:3097:2: ( rule__CreateMessage__RightAssignment_5 )
            {
             before(grammarAccess.getCreateMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:3098:2: ( rule__CreateMessage__RightAssignment_5 )
            // InternalSequence.g:3098:3: rule__CreateMessage__RightAssignment_5
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
    // InternalSequence.g:3106:1: rule__CreateMessage__Group__6 : rule__CreateMessage__Group__6__Impl ;
    public final void rule__CreateMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3110:1: ( rule__CreateMessage__Group__6__Impl )
            // InternalSequence.g:3111:2: rule__CreateMessage__Group__6__Impl
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
    // InternalSequence.g:3117:1: rule__CreateMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__CreateMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3121:1: ( ( ')' ) )
            // InternalSequence.g:3122:1: ( ')' )
            {
            // InternalSequence.g:3122:1: ( ')' )
            // InternalSequence.g:3123:2: ')'
            {
             before(grammarAccess.getCreateMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSequence.g:3133:1: rule__DestructionMessage__Group__0 : rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 ;
    public final void rule__DestructionMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3137:1: ( rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 )
            // InternalSequence.g:3138:2: rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSequence.g:3145:1: rule__DestructionMessage__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3149:1: ( ( 'dest' ) )
            // InternalSequence.g:3150:1: ( 'dest' )
            {
            // InternalSequence.g:3150:1: ( 'dest' )
            // InternalSequence.g:3151:2: 'dest'
            {
             before(grammarAccess.getDestructionMessageAccess().getDestKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSequence.g:3160:1: rule__DestructionMessage__Group__1 : rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 ;
    public final void rule__DestructionMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3164:1: ( rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 )
            // InternalSequence.g:3165:2: rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSequence.g:3172:1: rule__DestructionMessage__Group__1__Impl : ( ( rule__DestructionMessage__NameAssignment_1 )? ) ;
    public final void rule__DestructionMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3176:1: ( ( ( rule__DestructionMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:3177:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:3177:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            // InternalSequence.g:3178:2: ( rule__DestructionMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getDestructionMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3179:2: ( rule__DestructionMessage__NameAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSequence.g:3179:3: rule__DestructionMessage__NameAssignment_1
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
    // InternalSequence.g:3187:1: rule__DestructionMessage__Group__2 : rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 ;
    public final void rule__DestructionMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3191:1: ( rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 )
            // InternalSequence.g:3192:2: rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3
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
    // InternalSequence.g:3199:1: rule__DestructionMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__DestructionMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3203:1: ( ( '(' ) )
            // InternalSequence.g:3204:1: ( '(' )
            {
            // InternalSequence.g:3204:1: ( '(' )
            // InternalSequence.g:3205:2: '('
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:3214:1: rule__DestructionMessage__Group__3 : rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 ;
    public final void rule__DestructionMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3218:1: ( rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 )
            // InternalSequence.g:3219:2: rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalSequence.g:3226:1: rule__DestructionMessage__Group__3__Impl : ( ( rule__DestructionMessage__LeftAssignment_3 ) ) ;
    public final void rule__DestructionMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3230:1: ( ( ( rule__DestructionMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:3231:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:3231:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            // InternalSequence.g:3232:2: ( rule__DestructionMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:3233:2: ( rule__DestructionMessage__LeftAssignment_3 )
            // InternalSequence.g:3233:3: rule__DestructionMessage__LeftAssignment_3
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
    // InternalSequence.g:3241:1: rule__DestructionMessage__Group__4 : rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 ;
    public final void rule__DestructionMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3245:1: ( rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 )
            // InternalSequence.g:3246:2: rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5
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
    // InternalSequence.g:3253:1: rule__DestructionMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__DestructionMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3257:1: ( ( ',' ) )
            // InternalSequence.g:3258:1: ( ',' )
            {
            // InternalSequence.g:3258:1: ( ',' )
            // InternalSequence.g:3259:2: ','
            {
             before(grammarAccess.getDestructionMessageAccess().getCommaKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSequence.g:3268:1: rule__DestructionMessage__Group__5 : rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 ;
    public final void rule__DestructionMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3272:1: ( rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 )
            // InternalSequence.g:3273:2: rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:3280:1: rule__DestructionMessage__Group__5__Impl : ( ( rule__DestructionMessage__RightAssignment_5 ) ) ;
    public final void rule__DestructionMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3284:1: ( ( ( rule__DestructionMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:3285:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:3285:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            // InternalSequence.g:3286:2: ( rule__DestructionMessage__RightAssignment_5 )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:3287:2: ( rule__DestructionMessage__RightAssignment_5 )
            // InternalSequence.g:3287:3: rule__DestructionMessage__RightAssignment_5
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
    // InternalSequence.g:3295:1: rule__DestructionMessage__Group__6 : rule__DestructionMessage__Group__6__Impl ;
    public final void rule__DestructionMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3299:1: ( rule__DestructionMessage__Group__6__Impl )
            // InternalSequence.g:3300:2: rule__DestructionMessage__Group__6__Impl
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
    // InternalSequence.g:3306:1: rule__DestructionMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__DestructionMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3310:1: ( ( ')' ) )
            // InternalSequence.g:3311:1: ( ')' )
            {
            // InternalSequence.g:3311:1: ( ')' )
            // InternalSequence.g:3312:2: ')'
            {
             before(grammarAccess.getDestructionMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSequence.g:3322:1: rule__DestructionOccurenceSpecification__Group__0 : rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 ;
    public final void rule__DestructionOccurenceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3326:1: ( rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 )
            // InternalSequence.g:3327:2: rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1
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
    // InternalSequence.g:3334:1: rule__DestructionOccurenceSpecification__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionOccurenceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3338:1: ( ( 'dest' ) )
            // InternalSequence.g:3339:1: ( 'dest' )
            {
            // InternalSequence.g:3339:1: ( 'dest' )
            // InternalSequence.g:3340:2: 'dest'
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getDestKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSequence.g:3349:1: rule__DestructionOccurenceSpecification__Group__1 : rule__DestructionOccurenceSpecification__Group__1__Impl ;
    public final void rule__DestructionOccurenceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3353:1: ( rule__DestructionOccurenceSpecification__Group__1__Impl )
            // InternalSequence.g:3354:2: rule__DestructionOccurenceSpecification__Group__1__Impl
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
    // InternalSequence.g:3360:1: rule__DestructionOccurenceSpecification__Group__1__Impl : ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) ) ;
    public final void rule__DestructionOccurenceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3364:1: ( ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) ) )
            // InternalSequence.g:3365:1: ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) )
            {
            // InternalSequence.g:3365:1: ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) )
            // InternalSequence.g:3366:2: ( rule__DestructionOccurenceSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getNameAssignment_1()); 
            // InternalSequence.g:3367:2: ( rule__DestructionOccurenceSpecification__NameAssignment_1 )
            // InternalSequence.g:3367:3: rule__DestructionOccurenceSpecification__NameAssignment_1
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
    // InternalSequence.g:3376:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3380:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // InternalSequence.g:3381:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSequence.g:3388:1: rule__Alternative__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3392:1: ( ( 'alt' ) )
            // InternalSequence.g:3393:1: ( 'alt' )
            {
            // InternalSequence.g:3393:1: ( 'alt' )
            // InternalSequence.g:3394:2: 'alt'
            {
             before(grammarAccess.getAlternativeAccess().getAltKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSequence.g:3403:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3407:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // InternalSequence.g:3408:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSequence.g:3415:1: rule__Alternative__Group__1__Impl : ( '{' ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3419:1: ( ( '{' ) )
            // InternalSequence.g:3420:1: ( '{' )
            {
            // InternalSequence.g:3420:1: ( '{' )
            // InternalSequence.g:3421:2: '{'
            {
             before(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSequence.g:3430:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3434:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // InternalSequence.g:3435:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalSequence.g:3442:1: rule__Alternative__Group__2__Impl : ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3446:1: ( ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) ) )
            // InternalSequence.g:3447:1: ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) )
            {
            // InternalSequence.g:3447:1: ( ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* ) )
            // InternalSequence.g:3448:2: ( ( rule__Alternative__AlternativesAssignment_2 ) ) ( ( rule__Alternative__AlternativesAssignment_2 )* )
            {
            // InternalSequence.g:3448:2: ( ( rule__Alternative__AlternativesAssignment_2 ) )
            // InternalSequence.g:3449:3: ( rule__Alternative__AlternativesAssignment_2 )
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 
            // InternalSequence.g:3450:3: ( rule__Alternative__AlternativesAssignment_2 )
            // InternalSequence.g:3450:4: rule__Alternative__AlternativesAssignment_2
            {
            pushFollow(FOLLOW_33);
            rule__Alternative__AlternativesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 

            }

            // InternalSequence.g:3453:2: ( ( rule__Alternative__AlternativesAssignment_2 )* )
            // InternalSequence.g:3454:3: ( rule__Alternative__AlternativesAssignment_2 )*
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesAssignment_2()); 
            // InternalSequence.g:3455:3: ( rule__Alternative__AlternativesAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==46) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSequence.g:3455:4: rule__Alternative__AlternativesAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Alternative__AlternativesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalSequence.g:3464:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3468:1: ( rule__Alternative__Group__3__Impl )
            // InternalSequence.g:3469:2: rule__Alternative__Group__3__Impl
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
    // InternalSequence.g:3475:1: rule__Alternative__Group__3__Impl : ( '}' ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3479:1: ( ( '}' ) )
            // InternalSequence.g:3480:1: ( '}' )
            {
            // InternalSequence.g:3480:1: ( '}' )
            // InternalSequence.g:3481:2: '}'
            {
             before(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSequence.g:3491:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3495:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalSequence.g:3496:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSequence.g:3503:1: rule__Option__Group__0__Impl : ( 'opt' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3507:1: ( ( 'opt' ) )
            // InternalSequence.g:3508:1: ( 'opt' )
            {
            // InternalSequence.g:3508:1: ( 'opt' )
            // InternalSequence.g:3509:2: 'opt'
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
    // InternalSequence.g:3518:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3522:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // InternalSequence.g:3523:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSequence.g:3530:1: rule__Option__Group__1__Impl : ( '{' ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3534:1: ( ( '{' ) )
            // InternalSequence.g:3535:1: ( '{' )
            {
            // InternalSequence.g:3535:1: ( '{' )
            // InternalSequence.g:3536:2: '{'
            {
             before(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSequence.g:3545:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3549:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // InternalSequence.g:3550:2: rule__Option__Group__2__Impl rule__Option__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalSequence.g:3557:1: rule__Option__Group__2__Impl : ( ( rule__Option__OptionAssignment_2 ) ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3561:1: ( ( ( rule__Option__OptionAssignment_2 ) ) )
            // InternalSequence.g:3562:1: ( ( rule__Option__OptionAssignment_2 ) )
            {
            // InternalSequence.g:3562:1: ( ( rule__Option__OptionAssignment_2 ) )
            // InternalSequence.g:3563:2: ( rule__Option__OptionAssignment_2 )
            {
             before(grammarAccess.getOptionAccess().getOptionAssignment_2()); 
            // InternalSequence.g:3564:2: ( rule__Option__OptionAssignment_2 )
            // InternalSequence.g:3564:3: rule__Option__OptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Option__OptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getOptionAssignment_2()); 

            }


            }

        }
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
    // InternalSequence.g:3572:1: rule__Option__Group__3 : rule__Option__Group__3__Impl ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3576:1: ( rule__Option__Group__3__Impl )
            // InternalSequence.g:3577:2: rule__Option__Group__3__Impl
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
    // InternalSequence.g:3583:1: rule__Option__Group__3__Impl : ( '}' ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3587:1: ( ( '}' ) )
            // InternalSequence.g:3588:1: ( '}' )
            {
            // InternalSequence.g:3588:1: ( '}' )
            // InternalSequence.g:3589:2: '}'
            {
             before(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSequence.g:3599:1: rule__Parallel__Group__0 : rule__Parallel__Group__0__Impl rule__Parallel__Group__1 ;
    public final void rule__Parallel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3603:1: ( rule__Parallel__Group__0__Impl rule__Parallel__Group__1 )
            // InternalSequence.g:3604:2: rule__Parallel__Group__0__Impl rule__Parallel__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSequence.g:3611:1: rule__Parallel__Group__0__Impl : ( 'par' ) ;
    public final void rule__Parallel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3615:1: ( ( 'par' ) )
            // InternalSequence.g:3616:1: ( 'par' )
            {
            // InternalSequence.g:3616:1: ( 'par' )
            // InternalSequence.g:3617:2: 'par'
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
    // InternalSequence.g:3626:1: rule__Parallel__Group__1 : rule__Parallel__Group__1__Impl rule__Parallel__Group__2 ;
    public final void rule__Parallel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3630:1: ( rule__Parallel__Group__1__Impl rule__Parallel__Group__2 )
            // InternalSequence.g:3631:2: rule__Parallel__Group__1__Impl rule__Parallel__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalSequence.g:3638:1: rule__Parallel__Group__1__Impl : ( '{' ) ;
    public final void rule__Parallel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3642:1: ( ( '{' ) )
            // InternalSequence.g:3643:1: ( '{' )
            {
            // InternalSequence.g:3643:1: ( '{' )
            // InternalSequence.g:3644:2: '{'
            {
             before(grammarAccess.getParallelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSequence.g:3653:1: rule__Parallel__Group__2 : rule__Parallel__Group__2__Impl rule__Parallel__Group__3 ;
    public final void rule__Parallel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3657:1: ( rule__Parallel__Group__2__Impl rule__Parallel__Group__3 )
            // InternalSequence.g:3658:2: rule__Parallel__Group__2__Impl rule__Parallel__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalSequence.g:3665:1: rule__Parallel__Group__2__Impl : ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) ) ;
    public final void rule__Parallel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3669:1: ( ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) ) )
            // InternalSequence.g:3670:1: ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) )
            {
            // InternalSequence.g:3670:1: ( ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* ) )
            // InternalSequence.g:3671:2: ( ( rule__Parallel__ParallelsAssignment_2 ) ) ( ( rule__Parallel__ParallelsAssignment_2 )* )
            {
            // InternalSequence.g:3671:2: ( ( rule__Parallel__ParallelsAssignment_2 ) )
            // InternalSequence.g:3672:3: ( rule__Parallel__ParallelsAssignment_2 )
            {
             before(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 
            // InternalSequence.g:3673:3: ( rule__Parallel__ParallelsAssignment_2 )
            // InternalSequence.g:3673:4: rule__Parallel__ParallelsAssignment_2
            {
            pushFollow(FOLLOW_35);
            rule__Parallel__ParallelsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 

            }

            // InternalSequence.g:3676:2: ( ( rule__Parallel__ParallelsAssignment_2 )* )
            // InternalSequence.g:3677:3: ( rule__Parallel__ParallelsAssignment_2 )*
            {
             before(grammarAccess.getParallelAccess().getParallelsAssignment_2()); 
            // InternalSequence.g:3678:3: ( rule__Parallel__ParallelsAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=12 && LA24_0<=13)||(LA24_0>=34 && LA24_0<=40)||(LA24_0>=42 && LA24_0<=45)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSequence.g:3678:4: rule__Parallel__ParallelsAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Parallel__ParallelsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalSequence.g:3687:1: rule__Parallel__Group__3 : rule__Parallel__Group__3__Impl ;
    public final void rule__Parallel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3691:1: ( rule__Parallel__Group__3__Impl )
            // InternalSequence.g:3692:2: rule__Parallel__Group__3__Impl
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
    // InternalSequence.g:3698:1: rule__Parallel__Group__3__Impl : ( '}' ) ;
    public final void rule__Parallel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3702:1: ( ( '}' ) )
            // InternalSequence.g:3703:1: ( '}' )
            {
            // InternalSequence.g:3703:1: ( '}' )
            // InternalSequence.g:3704:2: '}'
            {
             before(grammarAccess.getParallelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSequence.g:3714:1: rule__Critical__Group__0 : rule__Critical__Group__0__Impl rule__Critical__Group__1 ;
    public final void rule__Critical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3718:1: ( rule__Critical__Group__0__Impl rule__Critical__Group__1 )
            // InternalSequence.g:3719:2: rule__Critical__Group__0__Impl rule__Critical__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSequence.g:3726:1: rule__Critical__Group__0__Impl : ( 'critical' ) ;
    public final void rule__Critical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3730:1: ( ( 'critical' ) )
            // InternalSequence.g:3731:1: ( 'critical' )
            {
            // InternalSequence.g:3731:1: ( 'critical' )
            // InternalSequence.g:3732:2: 'critical'
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
    // InternalSequence.g:3741:1: rule__Critical__Group__1 : rule__Critical__Group__1__Impl rule__Critical__Group__2 ;
    public final void rule__Critical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3745:1: ( rule__Critical__Group__1__Impl rule__Critical__Group__2 )
            // InternalSequence.g:3746:2: rule__Critical__Group__1__Impl rule__Critical__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSequence.g:3753:1: rule__Critical__Group__1__Impl : ( '{' ) ;
    public final void rule__Critical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3757:1: ( ( '{' ) )
            // InternalSequence.g:3758:1: ( '{' )
            {
            // InternalSequence.g:3758:1: ( '{' )
            // InternalSequence.g:3759:2: '{'
            {
             before(grammarAccess.getCriticalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSequence.g:3768:1: rule__Critical__Group__2 : rule__Critical__Group__2__Impl rule__Critical__Group__3 ;
    public final void rule__Critical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3772:1: ( rule__Critical__Group__2__Impl rule__Critical__Group__3 )
            // InternalSequence.g:3773:2: rule__Critical__Group__2__Impl rule__Critical__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalSequence.g:3780:1: rule__Critical__Group__2__Impl : ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) ) ;
    public final void rule__Critical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3784:1: ( ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) ) )
            // InternalSequence.g:3785:1: ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) )
            {
            // InternalSequence.g:3785:1: ( ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* ) )
            // InternalSequence.g:3786:2: ( ( rule__Critical__FragmentsAssignment_2 ) ) ( ( rule__Critical__FragmentsAssignment_2 )* )
            {
            // InternalSequence.g:3786:2: ( ( rule__Critical__FragmentsAssignment_2 ) )
            // InternalSequence.g:3787:3: ( rule__Critical__FragmentsAssignment_2 )
            {
             before(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:3788:3: ( rule__Critical__FragmentsAssignment_2 )
            // InternalSequence.g:3788:4: rule__Critical__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_10);
            rule__Critical__FragmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 

            }

            // InternalSequence.g:3791:2: ( ( rule__Critical__FragmentsAssignment_2 )* )
            // InternalSequence.g:3792:3: ( rule__Critical__FragmentsAssignment_2 )*
            {
             before(grammarAccess.getCriticalAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:3793:3: ( rule__Critical__FragmentsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=12 && LA25_0<=13)||(LA25_0>=34 && LA25_0<=39)||(LA25_0>=42 && LA25_0<=45)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSequence.g:3793:4: rule__Critical__FragmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Critical__FragmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalSequence.g:3802:1: rule__Critical__Group__3 : rule__Critical__Group__3__Impl ;
    public final void rule__Critical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3806:1: ( rule__Critical__Group__3__Impl )
            // InternalSequence.g:3807:2: rule__Critical__Group__3__Impl
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
    // InternalSequence.g:3813:1: rule__Critical__Group__3__Impl : ( '}' ) ;
    public final void rule__Critical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3817:1: ( ( '}' ) )
            // InternalSequence.g:3818:1: ( '}' )
            {
            // InternalSequence.g:3818:1: ( '}' )
            // InternalSequence.g:3819:2: '}'
            {
             before(grammarAccess.getCriticalAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSequence.g:3829:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3833:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalSequence.g:3834:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSequence.g:3841:1: rule__Loop__Group__0__Impl : ( 'loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3845:1: ( ( 'loop' ) )
            // InternalSequence.g:3846:1: ( 'loop' )
            {
            // InternalSequence.g:3846:1: ( 'loop' )
            // InternalSequence.g:3847:2: 'loop'
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
    // InternalSequence.g:3856:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3860:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalSequence.g:3861:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
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
    // InternalSequence.g:3868:1: rule__Loop__Group__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3872:1: ( ( '[' ) )
            // InternalSequence.g:3873:1: ( '[' )
            {
            // InternalSequence.g:3873:1: ( '[' )
            // InternalSequence.g:3874:2: '['
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
    // InternalSequence.g:3883:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3887:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalSequence.g:3888:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalSequence.g:3895:1: rule__Loop__Group__2__Impl : ( ( rule__Loop__ConditionAssignment_2 ) ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3899:1: ( ( ( rule__Loop__ConditionAssignment_2 ) ) )
            // InternalSequence.g:3900:1: ( ( rule__Loop__ConditionAssignment_2 ) )
            {
            // InternalSequence.g:3900:1: ( ( rule__Loop__ConditionAssignment_2 ) )
            // InternalSequence.g:3901:2: ( rule__Loop__ConditionAssignment_2 )
            {
             before(grammarAccess.getLoopAccess().getConditionAssignment_2()); 
            // InternalSequence.g:3902:2: ( rule__Loop__ConditionAssignment_2 )
            // InternalSequence.g:3902:3: rule__Loop__ConditionAssignment_2
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
    // InternalSequence.g:3910:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3914:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalSequence.g:3915:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalSequence.g:3922:1: rule__Loop__Group__3__Impl : ( ']' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3926:1: ( ( ']' ) )
            // InternalSequence.g:3927:1: ( ']' )
            {
            // InternalSequence.g:3927:1: ( ']' )
            // InternalSequence.g:3928:2: ']'
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
    // InternalSequence.g:3937:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3941:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalSequence.g:3942:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalSequence.g:3949:1: rule__Loop__Group__4__Impl : ( '{' ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3953:1: ( ( '{' ) )
            // InternalSequence.g:3954:1: ( '{' )
            {
            // InternalSequence.g:3954:1: ( '{' )
            // InternalSequence.g:3955:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSequence.g:3964:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3968:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalSequence.g:3969:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalSequence.g:3976:1: rule__Loop__Group__5__Impl : ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3980:1: ( ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) ) )
            // InternalSequence.g:3981:1: ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) )
            {
            // InternalSequence.g:3981:1: ( ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* ) )
            // InternalSequence.g:3982:2: ( ( rule__Loop__FragmentsAssignment_5 ) ) ( ( rule__Loop__FragmentsAssignment_5 )* )
            {
            // InternalSequence.g:3982:2: ( ( rule__Loop__FragmentsAssignment_5 ) )
            // InternalSequence.g:3983:3: ( rule__Loop__FragmentsAssignment_5 )
            {
             before(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 
            // InternalSequence.g:3984:3: ( rule__Loop__FragmentsAssignment_5 )
            // InternalSequence.g:3984:4: rule__Loop__FragmentsAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Loop__FragmentsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 

            }

            // InternalSequence.g:3987:2: ( ( rule__Loop__FragmentsAssignment_5 )* )
            // InternalSequence.g:3988:3: ( rule__Loop__FragmentsAssignment_5 )*
            {
             before(grammarAccess.getLoopAccess().getFragmentsAssignment_5()); 
            // InternalSequence.g:3989:3: ( rule__Loop__FragmentsAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=12 && LA26_0<=13)||(LA26_0>=34 && LA26_0<=39)||(LA26_0>=42 && LA26_0<=45)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSequence.g:3989:4: rule__Loop__FragmentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Loop__FragmentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalSequence.g:3998:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4002:1: ( rule__Loop__Group__6__Impl )
            // InternalSequence.g:4003:2: rule__Loop__Group__6__Impl
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
    // InternalSequence.g:4009:1: rule__Loop__Group__6__Impl : ( '}' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4013:1: ( ( '}' ) )
            // InternalSequence.g:4014:1: ( '}' )
            {
            // InternalSequence.g:4014:1: ( '}' )
            // InternalSequence.g:4015:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FOLLOW_2); 
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


    // $ANTLR start "rule__ParallelFragment__Group_0__0"
    // InternalSequence.g:4025:1: rule__ParallelFragment__Group_0__0 : rule__ParallelFragment__Group_0__0__Impl rule__ParallelFragment__Group_0__1 ;
    public final void rule__ParallelFragment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4029:1: ( rule__ParallelFragment__Group_0__0__Impl rule__ParallelFragment__Group_0__1 )
            // InternalSequence.g:4030:2: rule__ParallelFragment__Group_0__0__Impl rule__ParallelFragment__Group_0__1
            {
            pushFollow(FOLLOW_37);
            rule__ParallelFragment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelFragment__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFragment__Group_0__0"


    // $ANTLR start "rule__ParallelFragment__Group_0__0__Impl"
    // InternalSequence.g:4037:1: rule__ParallelFragment__Group_0__0__Impl : ( '{' ) ;
    public final void rule__ParallelFragment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4041:1: ( ( '{' ) )
            // InternalSequence.g:4042:1: ( '{' )
            {
            // InternalSequence.g:4042:1: ( '{' )
            // InternalSequence.g:4043:2: '{'
            {
             before(grammarAccess.getParallelFragmentAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getParallelFragmentAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFragment__Group_0__0__Impl"


    // $ANTLR start "rule__ParallelFragment__Group_0__1"
    // InternalSequence.g:4052:1: rule__ParallelFragment__Group_0__1 : rule__ParallelFragment__Group_0__1__Impl rule__ParallelFragment__Group_0__2 ;
    public final void rule__ParallelFragment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4056:1: ( rule__ParallelFragment__Group_0__1__Impl rule__ParallelFragment__Group_0__2 )
            // InternalSequence.g:4057:2: rule__ParallelFragment__Group_0__1__Impl rule__ParallelFragment__Group_0__2
            {
            pushFollow(FOLLOW_37);
            rule__ParallelFragment__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelFragment__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFragment__Group_0__1"


    // $ANTLR start "rule__ParallelFragment__Group_0__1__Impl"
    // InternalSequence.g:4064:1: rule__ParallelFragment__Group_0__1__Impl : ( ( rule__ParallelFragment__FragmentsAssignment_0_1 )* ) ;
    public final void rule__ParallelFragment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4068:1: ( ( ( rule__ParallelFragment__FragmentsAssignment_0_1 )* ) )
            // InternalSequence.g:4069:1: ( ( rule__ParallelFragment__FragmentsAssignment_0_1 )* )
            {
            // InternalSequence.g:4069:1: ( ( rule__ParallelFragment__FragmentsAssignment_0_1 )* )
            // InternalSequence.g:4070:2: ( rule__ParallelFragment__FragmentsAssignment_0_1 )*
            {
             before(grammarAccess.getParallelFragmentAccess().getFragmentsAssignment_0_1()); 
            // InternalSequence.g:4071:2: ( rule__ParallelFragment__FragmentsAssignment_0_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=12 && LA27_0<=13)||(LA27_0>=34 && LA27_0<=39)||(LA27_0>=42 && LA27_0<=45)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSequence.g:4071:3: rule__ParallelFragment__FragmentsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ParallelFragment__FragmentsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getParallelFragmentAccess().getFragmentsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFragment__Group_0__1__Impl"


    // $ANTLR start "rule__ParallelFragment__Group_0__2"
    // InternalSequence.g:4079:1: rule__ParallelFragment__Group_0__2 : rule__ParallelFragment__Group_0__2__Impl ;
    public final void rule__ParallelFragment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4083:1: ( rule__ParallelFragment__Group_0__2__Impl )
            // InternalSequence.g:4084:2: rule__ParallelFragment__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelFragment__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFragment__Group_0__2"


    // $ANTLR start "rule__ParallelFragment__Group_0__2__Impl"
    // InternalSequence.g:4090:1: rule__ParallelFragment__Group_0__2__Impl : ( '}' ) ;
    public final void rule__ParallelFragment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4094:1: ( ( '}' ) )
            // InternalSequence.g:4095:1: ( '}' )
            {
            // InternalSequence.g:4095:1: ( '}' )
            // InternalSequence.g:4096:2: '}'
            {
             before(grammarAccess.getParallelFragmentAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getParallelFragmentAccess().getRightCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFragment__Group_0__2__Impl"


    // $ANTLR start "rule__ConditionedFragment__Group__0"
    // InternalSequence.g:4106:1: rule__ConditionedFragment__Group__0 : rule__ConditionedFragment__Group__0__Impl rule__ConditionedFragment__Group__1 ;
    public final void rule__ConditionedFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4110:1: ( rule__ConditionedFragment__Group__0__Impl rule__ConditionedFragment__Group__1 )
            // InternalSequence.g:4111:2: rule__ConditionedFragment__Group__0__Impl rule__ConditionedFragment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ConditionedFragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionedFragment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group__0"


    // $ANTLR start "rule__ConditionedFragment__Group__0__Impl"
    // InternalSequence.g:4118:1: rule__ConditionedFragment__Group__0__Impl : ( '[' ) ;
    public final void rule__ConditionedFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4122:1: ( ( '[' ) )
            // InternalSequence.g:4123:1: ( '[' )
            {
            // InternalSequence.g:4123:1: ( '[' )
            // InternalSequence.g:4124:2: '['
            {
             before(grammarAccess.getConditionedFragmentAccess().getLeftSquareBracketKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getConditionedFragmentAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group__0__Impl"


    // $ANTLR start "rule__ConditionedFragment__Group__1"
    // InternalSequence.g:4133:1: rule__ConditionedFragment__Group__1 : rule__ConditionedFragment__Group__1__Impl rule__ConditionedFragment__Group__2 ;
    public final void rule__ConditionedFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4137:1: ( rule__ConditionedFragment__Group__1__Impl rule__ConditionedFragment__Group__2 )
            // InternalSequence.g:4138:2: rule__ConditionedFragment__Group__1__Impl rule__ConditionedFragment__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ConditionedFragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionedFragment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group__1"


    // $ANTLR start "rule__ConditionedFragment__Group__1__Impl"
    // InternalSequence.g:4145:1: rule__ConditionedFragment__Group__1__Impl : ( ( rule__ConditionedFragment__ConditionAssignment_1 ) ) ;
    public final void rule__ConditionedFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4149:1: ( ( ( rule__ConditionedFragment__ConditionAssignment_1 ) ) )
            // InternalSequence.g:4150:1: ( ( rule__ConditionedFragment__ConditionAssignment_1 ) )
            {
            // InternalSequence.g:4150:1: ( ( rule__ConditionedFragment__ConditionAssignment_1 ) )
            // InternalSequence.g:4151:2: ( rule__ConditionedFragment__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionedFragmentAccess().getConditionAssignment_1()); 
            // InternalSequence.g:4152:2: ( rule__ConditionedFragment__ConditionAssignment_1 )
            // InternalSequence.g:4152:3: rule__ConditionedFragment__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionedFragment__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionedFragmentAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group__1__Impl"


    // $ANTLR start "rule__ConditionedFragment__Group__2"
    // InternalSequence.g:4160:1: rule__ConditionedFragment__Group__2 : rule__ConditionedFragment__Group__2__Impl rule__ConditionedFragment__Group__3 ;
    public final void rule__ConditionedFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4164:1: ( rule__ConditionedFragment__Group__2__Impl rule__ConditionedFragment__Group__3 )
            // InternalSequence.g:4165:2: rule__ConditionedFragment__Group__2__Impl rule__ConditionedFragment__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__ConditionedFragment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionedFragment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group__2"


    // $ANTLR start "rule__ConditionedFragment__Group__2__Impl"
    // InternalSequence.g:4172:1: rule__ConditionedFragment__Group__2__Impl : ( ']' ) ;
    public final void rule__ConditionedFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4176:1: ( ( ']' ) )
            // InternalSequence.g:4177:1: ( ']' )
            {
            // InternalSequence.g:4177:1: ( ']' )
            // InternalSequence.g:4178:2: ']'
            {
             before(grammarAccess.getConditionedFragmentAccess().getRightSquareBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConditionedFragmentAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group__2__Impl"


    // $ANTLR start "rule__ConditionedFragment__Group__3"
    // InternalSequence.g:4187:1: rule__ConditionedFragment__Group__3 : rule__ConditionedFragment__Group__3__Impl ;
    public final void rule__ConditionedFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4191:1: ( rule__ConditionedFragment__Group__3__Impl )
            // InternalSequence.g:4192:2: rule__ConditionedFragment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionedFragment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group__3"


    // $ANTLR start "rule__ConditionedFragment__Group__3__Impl"
    // InternalSequence.g:4198:1: rule__ConditionedFragment__Group__3__Impl : ( ( rule__ConditionedFragment__Alternatives_3 ) ) ;
    public final void rule__ConditionedFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4202:1: ( ( ( rule__ConditionedFragment__Alternatives_3 ) ) )
            // InternalSequence.g:4203:1: ( ( rule__ConditionedFragment__Alternatives_3 ) )
            {
            // InternalSequence.g:4203:1: ( ( rule__ConditionedFragment__Alternatives_3 ) )
            // InternalSequence.g:4204:2: ( rule__ConditionedFragment__Alternatives_3 )
            {
             before(grammarAccess.getConditionedFragmentAccess().getAlternatives_3()); 
            // InternalSequence.g:4205:2: ( rule__ConditionedFragment__Alternatives_3 )
            // InternalSequence.g:4205:3: rule__ConditionedFragment__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionedFragment__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionedFragmentAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group__3__Impl"


    // $ANTLR start "rule__ConditionedFragment__Group_3_0__0"
    // InternalSequence.g:4214:1: rule__ConditionedFragment__Group_3_0__0 : rule__ConditionedFragment__Group_3_0__0__Impl rule__ConditionedFragment__Group_3_0__1 ;
    public final void rule__ConditionedFragment__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4218:1: ( rule__ConditionedFragment__Group_3_0__0__Impl rule__ConditionedFragment__Group_3_0__1 )
            // InternalSequence.g:4219:2: rule__ConditionedFragment__Group_3_0__0__Impl rule__ConditionedFragment__Group_3_0__1
            {
            pushFollow(FOLLOW_37);
            rule__ConditionedFragment__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionedFragment__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group_3_0__0"


    // $ANTLR start "rule__ConditionedFragment__Group_3_0__0__Impl"
    // InternalSequence.g:4226:1: rule__ConditionedFragment__Group_3_0__0__Impl : ( '{' ) ;
    public final void rule__ConditionedFragment__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4230:1: ( ( '{' ) )
            // InternalSequence.g:4231:1: ( '{' )
            {
            // InternalSequence.g:4231:1: ( '{' )
            // InternalSequence.g:4232:2: '{'
            {
             before(grammarAccess.getConditionedFragmentAccess().getLeftCurlyBracketKeyword_3_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConditionedFragmentAccess().getLeftCurlyBracketKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group_3_0__0__Impl"


    // $ANTLR start "rule__ConditionedFragment__Group_3_0__1"
    // InternalSequence.g:4241:1: rule__ConditionedFragment__Group_3_0__1 : rule__ConditionedFragment__Group_3_0__1__Impl rule__ConditionedFragment__Group_3_0__2 ;
    public final void rule__ConditionedFragment__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4245:1: ( rule__ConditionedFragment__Group_3_0__1__Impl rule__ConditionedFragment__Group_3_0__2 )
            // InternalSequence.g:4246:2: rule__ConditionedFragment__Group_3_0__1__Impl rule__ConditionedFragment__Group_3_0__2
            {
            pushFollow(FOLLOW_37);
            rule__ConditionedFragment__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionedFragment__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group_3_0__1"


    // $ANTLR start "rule__ConditionedFragment__Group_3_0__1__Impl"
    // InternalSequence.g:4253:1: rule__ConditionedFragment__Group_3_0__1__Impl : ( ( rule__ConditionedFragment__FragmentsAssignment_3_0_1 )* ) ;
    public final void rule__ConditionedFragment__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4257:1: ( ( ( rule__ConditionedFragment__FragmentsAssignment_3_0_1 )* ) )
            // InternalSequence.g:4258:1: ( ( rule__ConditionedFragment__FragmentsAssignment_3_0_1 )* )
            {
            // InternalSequence.g:4258:1: ( ( rule__ConditionedFragment__FragmentsAssignment_3_0_1 )* )
            // InternalSequence.g:4259:2: ( rule__ConditionedFragment__FragmentsAssignment_3_0_1 )*
            {
             before(grammarAccess.getConditionedFragmentAccess().getFragmentsAssignment_3_0_1()); 
            // InternalSequence.g:4260:2: ( rule__ConditionedFragment__FragmentsAssignment_3_0_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=12 && LA28_0<=13)||(LA28_0>=34 && LA28_0<=39)||(LA28_0>=42 && LA28_0<=45)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSequence.g:4260:3: rule__ConditionedFragment__FragmentsAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ConditionedFragment__FragmentsAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getConditionedFragmentAccess().getFragmentsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group_3_0__1__Impl"


    // $ANTLR start "rule__ConditionedFragment__Group_3_0__2"
    // InternalSequence.g:4268:1: rule__ConditionedFragment__Group_3_0__2 : rule__ConditionedFragment__Group_3_0__2__Impl ;
    public final void rule__ConditionedFragment__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4272:1: ( rule__ConditionedFragment__Group_3_0__2__Impl )
            // InternalSequence.g:4273:2: rule__ConditionedFragment__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionedFragment__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group_3_0__2"


    // $ANTLR start "rule__ConditionedFragment__Group_3_0__2__Impl"
    // InternalSequence.g:4279:1: rule__ConditionedFragment__Group_3_0__2__Impl : ( '}' ) ;
    public final void rule__ConditionedFragment__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4283:1: ( ( '}' ) )
            // InternalSequence.g:4284:1: ( '}' )
            {
            // InternalSequence.g:4284:1: ( '}' )
            // InternalSequence.g:4285:2: '}'
            {
             before(grammarAccess.getConditionedFragmentAccess().getRightCurlyBracketKeyword_3_0_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConditionedFragmentAccess().getRightCurlyBracketKeyword_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__Group_3_0__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalSequence.g:4295:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4299:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSequence.g:4300:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalSequence.g:4307:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4311:1: ( ( RULE_ID ) )
            // InternalSequence.g:4312:1: ( RULE_ID )
            {
            // InternalSequence.g:4312:1: ( RULE_ID )
            // InternalSequence.g:4313:2: RULE_ID
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
    // InternalSequence.g:4322:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4326:1: ( rule__FQN__Group__1__Impl )
            // InternalSequence.g:4327:2: rule__FQN__Group__1__Impl
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
    // InternalSequence.g:4333:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4337:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSequence.g:4338:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSequence.g:4338:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSequence.g:4339:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSequence.g:4340:2: ( rule__FQN__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==47) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSequence.g:4340:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSequence.g:4349:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4353:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSequence.g:4354:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalSequence.g:4361:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4365:1: ( ( '.' ) )
            // InternalSequence.g:4366:1: ( '.' )
            {
            // InternalSequence.g:4366:1: ( '.' )
            // InternalSequence.g:4367:2: '.'
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
    // InternalSequence.g:4376:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4380:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSequence.g:4381:2: rule__FQN__Group_1__1__Impl
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
    // InternalSequence.g:4387:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4391:1: ( ( RULE_ID ) )
            // InternalSequence.g:4392:1: ( RULE_ID )
            {
            // InternalSequence.g:4392:1: ( RULE_ID )
            // InternalSequence.g:4393:2: RULE_ID
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
    // InternalSequence.g:4403:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4407:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalSequence.g:4408:2: rule__Order__Group__0__Impl rule__Order__Group__1
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
    // InternalSequence.g:4415:1: rule__Order__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4419:1: ( ( RULE_INT ) )
            // InternalSequence.g:4420:1: ( RULE_INT )
            {
            // InternalSequence.g:4420:1: ( RULE_INT )
            // InternalSequence.g:4421:2: RULE_INT
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
    // InternalSequence.g:4430:1: rule__Order__Group__1 : rule__Order__Group__1__Impl ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4434:1: ( rule__Order__Group__1__Impl )
            // InternalSequence.g:4435:2: rule__Order__Group__1__Impl
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
    // InternalSequence.g:4441:1: rule__Order__Group__1__Impl : ( ( rule__Order__Group_1__0 )* ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4445:1: ( ( ( rule__Order__Group_1__0 )* ) )
            // InternalSequence.g:4446:1: ( ( rule__Order__Group_1__0 )* )
            {
            // InternalSequence.g:4446:1: ( ( rule__Order__Group_1__0 )* )
            // InternalSequence.g:4447:2: ( rule__Order__Group_1__0 )*
            {
             before(grammarAccess.getOrderAccess().getGroup_1()); 
            // InternalSequence.g:4448:2: ( rule__Order__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSequence.g:4448:3: rule__Order__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Order__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSequence.g:4457:1: rule__Order__Group_1__0 : rule__Order__Group_1__0__Impl rule__Order__Group_1__1 ;
    public final void rule__Order__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4461:1: ( rule__Order__Group_1__0__Impl rule__Order__Group_1__1 )
            // InternalSequence.g:4462:2: rule__Order__Group_1__0__Impl rule__Order__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSequence.g:4469:1: rule__Order__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Order__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4473:1: ( ( '.' ) )
            // InternalSequence.g:4474:1: ( '.' )
            {
            // InternalSequence.g:4474:1: ( '.' )
            // InternalSequence.g:4475:2: '.'
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
    // InternalSequence.g:4484:1: rule__Order__Group_1__1 : rule__Order__Group_1__1__Impl ;
    public final void rule__Order__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4488:1: ( rule__Order__Group_1__1__Impl )
            // InternalSequence.g:4489:2: rule__Order__Group_1__1__Impl
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
    // InternalSequence.g:4495:1: rule__Order__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Order__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4499:1: ( ( RULE_INT ) )
            // InternalSequence.g:4500:1: ( RULE_INT )
            {
            // InternalSequence.g:4500:1: ( RULE_INT )
            // InternalSequence.g:4501:2: RULE_INT
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
    // InternalSequence.g:4511:1: rule__SequenceDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SequenceDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4515:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4516:2: ( RULE_STRING )
            {
            // InternalSequence.g:4516:2: ( RULE_STRING )
            // InternalSequence.g:4517:3: RULE_STRING
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
    // InternalSequence.g:4526:1: rule__SequenceDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__SequenceDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4530:1: ( ( ruleRootPackage ) )
            // InternalSequence.g:4531:2: ( ruleRootPackage )
            {
            // InternalSequence.g:4531:2: ( ruleRootPackage )
            // InternalSequence.g:4532:3: ruleRootPackage
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
    // InternalSequence.g:4541:1: rule__RootPackage__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4545:1: ( ( ruleFQN ) )
            // InternalSequence.g:4546:2: ( ruleFQN )
            {
            // InternalSequence.g:4546:2: ( ruleFQN )
            // InternalSequence.g:4547:3: ruleFQN
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
    // InternalSequence.g:4556:1: rule__RootPackage__ActorsAssignment_2 : ( ruleActor ) ;
    public final void rule__RootPackage__ActorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4560:1: ( ( ruleActor ) )
            // InternalSequence.g:4561:2: ( ruleActor )
            {
            // InternalSequence.g:4561:2: ( ruleActor )
            // InternalSequence.g:4562:3: ruleActor
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


    // $ANTLR start "rule__RootPackage__InteractionFragmentsAssignment_3"
    // InternalSequence.g:4571:1: rule__RootPackage__InteractionFragmentsAssignment_3 : ( ruleInteractionFragment ) ;
    public final void rule__RootPackage__InteractionFragmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4575:1: ( ( ruleInteractionFragment ) )
            // InternalSequence.g:4576:2: ( ruleInteractionFragment )
            {
            // InternalSequence.g:4576:2: ( ruleInteractionFragment )
            // InternalSequence.g:4577:3: ruleInteractionFragment
            {
             before(grammarAccess.getRootPackageAccess().getInteractionFragmentsInteractionFragmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionFragment();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getInteractionFragmentsInteractionFragmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__InteractionFragmentsAssignment_3"


    // $ANTLR start "rule__Actor__DeferredAssignment_1"
    // InternalSequence.g:4586:1: rule__Actor__DeferredAssignment_1 : ( ( 'deferred' ) ) ;
    public final void rule__Actor__DeferredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4590:1: ( ( ( 'deferred' ) ) )
            // InternalSequence.g:4591:2: ( ( 'deferred' ) )
            {
            // InternalSequence.g:4591:2: ( ( 'deferred' ) )
            // InternalSequence.g:4592:3: ( 'deferred' )
            {
             before(grammarAccess.getActorAccess().getDeferredDeferredKeyword_1_0()); 
            // InternalSequence.g:4593:3: ( 'deferred' )
            // InternalSequence.g:4594:4: 'deferred'
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
    // InternalSequence.g:4605:1: rule__Actor__NameAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4609:1: ( ( RULE_ID ) )
            // InternalSequence.g:4610:2: ( RULE_ID )
            {
            // InternalSequence.g:4610:2: ( RULE_ID )
            // InternalSequence.g:4611:3: RULE_ID
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


    // $ANTLR start "rule__Actor__TypeAssignment_2_0_2"
    // InternalSequence.g:4620:1: rule__Actor__TypeAssignment_2_0_2 : ( ( ruleFQN ) ) ;
    public final void rule__Actor__TypeAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4624:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4625:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4625:2: ( ( ruleFQN ) )
            // InternalSequence.g:4626:3: ( ruleFQN )
            {
             before(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_0_2_0()); 
            // InternalSequence.g:4627:3: ( ruleFQN )
            // InternalSequence.g:4628:4: ruleFQN
            {
             before(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_0_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_0_2_0_1()); 

            }

             after(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeAssignment_2_0_2"


    // $ANTLR start "rule__Actor__TypeAssignment_2_1_1"
    // InternalSequence.g:4639:1: rule__Actor__TypeAssignment_2_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Actor__TypeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4643:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4644:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4644:2: ( ( ruleFQN ) )
            // InternalSequence.g:4645:3: ( ruleFQN )
            {
             before(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_1_1_0()); 
            // InternalSequence.g:4646:3: ( ruleFQN )
            // InternalSequence.g:4647:4: ruleFQN
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
    // InternalSequence.g:4658:1: rule__Actor__AliasAssignment_2_1_3 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4662:1: ( ( RULE_ID ) )
            // InternalSequence.g:4663:2: ( RULE_ID )
            {
            // InternalSequence.g:4663:2: ( RULE_ID )
            // InternalSequence.g:4664:3: RULE_ID
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
    // InternalSequence.g:4673:1: rule__Actor__NameAssignment_2_2_0 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4677:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4678:2: ( RULE_STRING )
            {
            // InternalSequence.g:4678:2: ( RULE_STRING )
            // InternalSequence.g:4679:3: RULE_STRING
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


    // $ANTLR start "rule__Actor__TypeAssignment_2_2_2"
    // InternalSequence.g:4688:1: rule__Actor__TypeAssignment_2_2_2 : ( ( ruleFQN ) ) ;
    public final void rule__Actor__TypeAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4692:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4693:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4693:2: ( ( ruleFQN ) )
            // InternalSequence.g:4694:3: ( ruleFQN )
            {
             before(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_2_2_0()); 
            // InternalSequence.g:4695:3: ( ruleFQN )
            // InternalSequence.g:4696:4: ruleFQN
            {
             before(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_2_2_0_1()); 

            }

             after(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeAssignment_2_2_2"


    // $ANTLR start "rule__Actor__AliasAssignment_2_2_4"
    // InternalSequence.g:4707:1: rule__Actor__AliasAssignment_2_2_4 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4711:1: ( ( RULE_ID ) )
            // InternalSequence.g:4712:2: ( RULE_ID )
            {
            // InternalSequence.g:4712:2: ( RULE_ID )
            // InternalSequence.g:4713:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_2_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__AliasAssignment_2_2_4"


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


    // $ANTLR start "rule__Message__OrderAssignment_1_1"
    // InternalSequence.g:4737:1: rule__Message__OrderAssignment_1_1 : ( ruleOrder ) ;
    public final void rule__Message__OrderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4741:1: ( ( ruleOrder ) )
            // InternalSequence.g:4742:2: ( ruleOrder )
            {
            // InternalSequence.g:4742:2: ( ruleOrder )
            // InternalSequence.g:4743:3: ruleOrder
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
    // InternalSequence.g:4752:1: rule__Message__TimeConstraintAssignment_2 : ( ruleTimeConstraint ) ;
    public final void rule__Message__TimeConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4756:1: ( ( ruleTimeConstraint ) )
            // InternalSequence.g:4757:2: ( ruleTimeConstraint )
            {
            // InternalSequence.g:4757:2: ( ruleTimeConstraint )
            // InternalSequence.g:4758:3: ruleTimeConstraint
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
    // InternalSequence.g:4767:1: rule__TimeConstraint__ConstraintsAssignment_1 : ( ruleInnerTimeConstraint ) ;
    public final void rule__TimeConstraint__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4771:1: ( ( ruleInnerTimeConstraint ) )
            // InternalSequence.g:4772:2: ( ruleInnerTimeConstraint )
            {
            // InternalSequence.g:4772:2: ( ruleInnerTimeConstraint )
            // InternalSequence.g:4773:3: ruleInnerTimeConstraint
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
    // InternalSequence.g:4782:1: rule__InnerTimeConstraint__TypeAssignment_0 : ( ruleTimeConstraintType ) ;
    public final void rule__InnerTimeConstraint__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4786:1: ( ( ruleTimeConstraintType ) )
            // InternalSequence.g:4787:2: ( ruleTimeConstraintType )
            {
            // InternalSequence.g:4787:2: ( ruleTimeConstraintType )
            // InternalSequence.g:4788:3: ruleTimeConstraintType
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
    // InternalSequence.g:4797:1: rule__InnerTimeConstraint__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__InnerTimeConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4801:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4802:2: ( RULE_STRING )
            {
            // InternalSequence.g:4802:2: ( RULE_STRING )
            // InternalSequence.g:4803:3: RULE_STRING
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
    // InternalSequence.g:4812:1: rule__StandardMessage__TypeAssignment_0 : ( ruleMessageType ) ;
    public final void rule__StandardMessage__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4816:1: ( ( ruleMessageType ) )
            // InternalSequence.g:4817:2: ( ruleMessageType )
            {
            // InternalSequence.g:4817:2: ( ruleMessageType )
            // InternalSequence.g:4818:3: ruleMessageType
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
    // InternalSequence.g:4827:1: rule__StandardMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StandardMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4831:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4832:2: ( RULE_STRING )
            {
            // InternalSequence.g:4832:2: ( RULE_STRING )
            // InternalSequence.g:4833:3: RULE_STRING
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
    // InternalSequence.g:4842:1: rule__StandardMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4846:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4847:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4847:2: ( ( ruleFQN ) )
            // InternalSequence.g:4848:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:4849:3: ( ruleFQN )
            // InternalSequence.g:4850:4: ruleFQN
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
    // InternalSequence.g:4861:1: rule__StandardMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4865:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4866:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4866:2: ( ( ruleFQN ) )
            // InternalSequence.g:4867:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:4868:3: ( ruleFQN )
            // InternalSequence.g:4869:4: ruleFQN
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
    // InternalSequence.g:4880:1: rule__ResponseMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ResponseMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4884:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4885:2: ( RULE_STRING )
            {
            // InternalSequence.g:4885:2: ( RULE_STRING )
            // InternalSequence.g:4886:3: RULE_STRING
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
    // InternalSequence.g:4895:1: rule__ResponseMessage__LeftAssignment_3_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__LeftAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4899:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4900:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4900:2: ( ( ruleFQN ) )
            // InternalSequence.g:4901:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getLeftActorCrossReference_3_0_0()); 
            // InternalSequence.g:4902:3: ( ruleFQN )
            // InternalSequence.g:4903:4: ruleFQN
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
    // InternalSequence.g:4914:1: rule__ResponseMessage__RightAssignment_5_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__RightAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4918:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4919:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4919:2: ( ( ruleFQN ) )
            // InternalSequence.g:4920:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getRightActorCrossReference_5_0_0()); 
            // InternalSequence.g:4921:3: ( ruleFQN )
            // InternalSequence.g:4922:4: ruleFQN
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
    // InternalSequence.g:4933:1: rule__FoundMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__FoundMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4937:1: ( ( ruleMessageType ) )
            // InternalSequence.g:4938:2: ( ruleMessageType )
            {
            // InternalSequence.g:4938:2: ( ruleMessageType )
            // InternalSequence.g:4939:3: ruleMessageType
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
    // InternalSequence.g:4948:1: rule__FoundMessage__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FoundMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4952:1: ( ( RULE_STRING ) )
            // InternalSequence.g:4953:2: ( RULE_STRING )
            {
            // InternalSequence.g:4953:2: ( RULE_STRING )
            // InternalSequence.g:4954:3: RULE_STRING
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
    // InternalSequence.g:4963:1: rule__FoundMessage__RightAssignment_6 : ( ( ruleFQN ) ) ;
    public final void rule__FoundMessage__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4967:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:4968:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:4968:2: ( ( ruleFQN ) )
            // InternalSequence.g:4969:3: ( ruleFQN )
            {
             before(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0()); 
            // InternalSequence.g:4970:3: ( ruleFQN )
            // InternalSequence.g:4971:4: ruleFQN
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
    // InternalSequence.g:4982:1: rule__LostMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__LostMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4986:1: ( ( ruleMessageType ) )
            // InternalSequence.g:4987:2: ( ruleMessageType )
            {
            // InternalSequence.g:4987:2: ( ruleMessageType )
            // InternalSequence.g:4988:3: ruleMessageType
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
    // InternalSequence.g:4997:1: rule__LostMessage__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LostMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5001:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5002:2: ( RULE_STRING )
            {
            // InternalSequence.g:5002:2: ( RULE_STRING )
            // InternalSequence.g:5003:3: RULE_STRING
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
    // InternalSequence.g:5012:1: rule__LostMessage__LeftAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__LostMessage__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5016:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5017:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5017:2: ( ( ruleFQN ) )
            // InternalSequence.g:5018:3: ( ruleFQN )
            {
             before(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0()); 
            // InternalSequence.g:5019:3: ( ruleFQN )
            // InternalSequence.g:5020:4: ruleFQN
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
    // InternalSequence.g:5031:1: rule__CreateMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CreateMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5035:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5036:2: ( RULE_STRING )
            {
            // InternalSequence.g:5036:2: ( RULE_STRING )
            // InternalSequence.g:5037:3: RULE_STRING
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
    // InternalSequence.g:5046:1: rule__CreateMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5050:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5051:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5051:2: ( ( ruleFQN ) )
            // InternalSequence.g:5052:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:5053:3: ( ruleFQN )
            // InternalSequence.g:5054:4: ruleFQN
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
    // InternalSequence.g:5065:1: rule__CreateMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5069:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5070:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5070:2: ( ( ruleFQN ) )
            // InternalSequence.g:5071:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:5072:3: ( ruleFQN )
            // InternalSequence.g:5073:4: ruleFQN
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
    // InternalSequence.g:5084:1: rule__DestructionMessage__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DestructionMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5088:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5089:2: ( RULE_STRING )
            {
            // InternalSequence.g:5089:2: ( RULE_STRING )
            // InternalSequence.g:5090:3: RULE_STRING
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
    // InternalSequence.g:5099:1: rule__DestructionMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5103:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5104:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5104:2: ( ( ruleFQN ) )
            // InternalSequence.g:5105:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:5106:3: ( ruleFQN )
            // InternalSequence.g:5107:4: ruleFQN
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
    // InternalSequence.g:5118:1: rule__DestructionMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5122:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:5123:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:5123:2: ( ( ruleFQN ) )
            // InternalSequence.g:5124:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:5125:3: ( ruleFQN )
            // InternalSequence.g:5126:4: ruleFQN
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
    // InternalSequence.g:5137:1: rule__DestructionOccurenceSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DestructionOccurenceSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5141:1: ( ( RULE_ID ) )
            // InternalSequence.g:5142:2: ( RULE_ID )
            {
            // InternalSequence.g:5142:2: ( RULE_ID )
            // InternalSequence.g:5143:3: RULE_ID
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
    // InternalSequence.g:5152:1: rule__Alternative__AlternativesAssignment_2 : ( ruleConditionedFragment ) ;
    public final void rule__Alternative__AlternativesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5156:1: ( ( ruleConditionedFragment ) )
            // InternalSequence.g:5157:2: ( ruleConditionedFragment )
            {
            // InternalSequence.g:5157:2: ( ruleConditionedFragment )
            // InternalSequence.g:5158:3: ruleConditionedFragment
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesConditionedFragmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionedFragment();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getAlternativesConditionedFragmentParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Option__OptionAssignment_2"
    // InternalSequence.g:5167:1: rule__Option__OptionAssignment_2 : ( ruleConditionedFragment ) ;
    public final void rule__Option__OptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5171:1: ( ( ruleConditionedFragment ) )
            // InternalSequence.g:5172:2: ( ruleConditionedFragment )
            {
            // InternalSequence.g:5172:2: ( ruleConditionedFragment )
            // InternalSequence.g:5173:3: ruleConditionedFragment
            {
             before(grammarAccess.getOptionAccess().getOptionConditionedFragmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionedFragment();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getOptionConditionedFragmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__OptionAssignment_2"


    // $ANTLR start "rule__Parallel__ParallelsAssignment_2"
    // InternalSequence.g:5182:1: rule__Parallel__ParallelsAssignment_2 : ( ruleParallelFragment ) ;
    public final void rule__Parallel__ParallelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5186:1: ( ( ruleParallelFragment ) )
            // InternalSequence.g:5187:2: ( ruleParallelFragment )
            {
            // InternalSequence.g:5187:2: ( ruleParallelFragment )
            // InternalSequence.g:5188:3: ruleParallelFragment
            {
             before(grammarAccess.getParallelAccess().getParallelsParallelFragmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParallelFragment();

            state._fsp--;

             after(grammarAccess.getParallelAccess().getParallelsParallelFragmentParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalSequence.g:5197:1: rule__Critical__FragmentsAssignment_2 : ( ruleInteractionFragment ) ;
    public final void rule__Critical__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5201:1: ( ( ruleInteractionFragment ) )
            // InternalSequence.g:5202:2: ( ruleInteractionFragment )
            {
            // InternalSequence.g:5202:2: ( ruleInteractionFragment )
            // InternalSequence.g:5203:3: ruleInteractionFragment
            {
             before(grammarAccess.getCriticalAccess().getFragmentsInteractionFragmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionFragment();

            state._fsp--;

             after(grammarAccess.getCriticalAccess().getFragmentsInteractionFragmentParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalSequence.g:5212:1: rule__Loop__ConditionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Loop__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5216:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5217:2: ( RULE_STRING )
            {
            // InternalSequence.g:5217:2: ( RULE_STRING )
            // InternalSequence.g:5218:3: RULE_STRING
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
    // InternalSequence.g:5227:1: rule__Loop__FragmentsAssignment_5 : ( ruleInteractionFragment ) ;
    public final void rule__Loop__FragmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5231:1: ( ( ruleInteractionFragment ) )
            // InternalSequence.g:5232:2: ( ruleInteractionFragment )
            {
            // InternalSequence.g:5232:2: ( ruleInteractionFragment )
            // InternalSequence.g:5233:3: ruleInteractionFragment
            {
             before(grammarAccess.getLoopAccess().getFragmentsInteractionFragmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionFragment();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getFragmentsInteractionFragmentParserRuleCall_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParallelFragment__FragmentsAssignment_0_1"
    // InternalSequence.g:5242:1: rule__ParallelFragment__FragmentsAssignment_0_1 : ( ruleInteractionFragment ) ;
    public final void rule__ParallelFragment__FragmentsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5246:1: ( ( ruleInteractionFragment ) )
            // InternalSequence.g:5247:2: ( ruleInteractionFragment )
            {
            // InternalSequence.g:5247:2: ( ruleInteractionFragment )
            // InternalSequence.g:5248:3: ruleInteractionFragment
            {
             before(grammarAccess.getParallelFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionFragment();

            state._fsp--;

             after(grammarAccess.getParallelFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFragment__FragmentsAssignment_0_1"


    // $ANTLR start "rule__ParallelFragment__FragmentsAssignment_1"
    // InternalSequence.g:5257:1: rule__ParallelFragment__FragmentsAssignment_1 : ( ruleInteractionFragment ) ;
    public final void rule__ParallelFragment__FragmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5261:1: ( ( ruleInteractionFragment ) )
            // InternalSequence.g:5262:2: ( ruleInteractionFragment )
            {
            // InternalSequence.g:5262:2: ( ruleInteractionFragment )
            // InternalSequence.g:5263:3: ruleInteractionFragment
            {
             before(grammarAccess.getParallelFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionFragment();

            state._fsp--;

             after(grammarAccess.getParallelFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFragment__FragmentsAssignment_1"


    // $ANTLR start "rule__ConditionedFragment__ConditionAssignment_1"
    // InternalSequence.g:5272:1: rule__ConditionedFragment__ConditionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ConditionedFragment__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5276:1: ( ( RULE_STRING ) )
            // InternalSequence.g:5277:2: ( RULE_STRING )
            {
            // InternalSequence.g:5277:2: ( RULE_STRING )
            // InternalSequence.g:5278:3: RULE_STRING
            {
             before(grammarAccess.getConditionedFragmentAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionedFragmentAccess().getConditionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__ConditionAssignment_1"


    // $ANTLR start "rule__ConditionedFragment__FragmentsAssignment_3_0_1"
    // InternalSequence.g:5287:1: rule__ConditionedFragment__FragmentsAssignment_3_0_1 : ( ruleInteractionFragment ) ;
    public final void rule__ConditionedFragment__FragmentsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5291:1: ( ( ruleInteractionFragment ) )
            // InternalSequence.g:5292:2: ( ruleInteractionFragment )
            {
            // InternalSequence.g:5292:2: ( ruleInteractionFragment )
            // InternalSequence.g:5293:3: ruleInteractionFragment
            {
             before(grammarAccess.getConditionedFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionFragment();

            state._fsp--;

             after(grammarAccess.getConditionedFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__FragmentsAssignment_3_0_1"


    // $ANTLR start "rule__ConditionedFragment__FragmentsAssignment_3_1"
    // InternalSequence.g:5302:1: rule__ConditionedFragment__FragmentsAssignment_3_1 : ( ruleInteractionFragment ) ;
    public final void rule__ConditionedFragment__FragmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5306:1: ( ( ruleInteractionFragment ) )
            // InternalSequence.g:5307:2: ( ruleInteractionFragment )
            {
            // InternalSequence.g:5307:2: ( ruleInteractionFragment )
            // InternalSequence.g:5308:3: ruleInteractionFragment
            {
             before(grammarAccess.getConditionedFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionFragment();

            state._fsp--;

             after(grammarAccess.getConditionedFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionedFragment__FragmentsAssignment_3_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\14\2\4\5\uffff\1\37\1\5\1\40\2\5\1\40\1\uffff";
    static final String dfa_3s = "\1\46\2\4\5\uffff\1\37\1\13\1\57\1\5\1\13\1\57\1\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\3\1\4\1\5\1\6\6\uffff\1\1";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\24\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\10",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\11",
            "\1\12\5\uffff\1\4",
            "\1\14\16\uffff\1\13",
            "\1\15",
            "\1\16\5\uffff\1\5",
            "\1\14\16\uffff\1\13",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "804:1: rule__Message__Alternatives_0 : ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00003CFC00803000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00003CFC00003002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000001000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800003000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000003000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00003DFC00003000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00003DFC00003002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00003CFC00003000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00003EFC00003000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000002L});

}