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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sync'", "'async'", "'human'", "'machine'", "'@start-seqd'", "'@end-seqd'", "'rootElement'", "'act'", "':'", "'as'", "'role['", "']'", "'('", "','", "')'", "'found'", "'_'", "'lost'", "'dest'", "'.'"
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
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalSequence.g:112:1: ruleActor : ( ( rule__Actor__Alternatives ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:116:2: ( ( ( rule__Actor__Alternatives ) ) )
            // InternalSequence.g:117:2: ( ( rule__Actor__Alternatives ) )
            {
            // InternalSequence.g:117:2: ( ( rule__Actor__Alternatives ) )
            // InternalSequence.g:118:3: ( rule__Actor__Alternatives )
            {
             before(grammarAccess.getActorAccess().getAlternatives()); 
            // InternalSequence.g:119:3: ( rule__Actor__Alternatives )
            // InternalSequence.g:119:4: rule__Actor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalSequence.g:162:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:166:2: ( ( ( rule__Message__Alternatives ) ) )
            // InternalSequence.g:167:2: ( ( rule__Message__Alternatives ) )
            {
            // InternalSequence.g:167:2: ( ( rule__Message__Alternatives ) )
            // InternalSequence.g:168:3: ( rule__Message__Alternatives )
            {
             before(grammarAccess.getMessageAccess().getAlternatives()); 
            // InternalSequence.g:169:3: ( rule__Message__Alternatives )
            // InternalSequence.g:169:4: rule__Message__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Message__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFoundMessage"
    // InternalSequence.g:178:1: entryRuleFoundMessage : ruleFoundMessage EOF ;
    public final void entryRuleFoundMessage() throws RecognitionException {
        try {
            // InternalSequence.g:179:1: ( ruleFoundMessage EOF )
            // InternalSequence.g:180:1: ruleFoundMessage EOF
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
    // InternalSequence.g:187:1: ruleFoundMessage : ( ( rule__FoundMessage__Group__0 ) ) ;
    public final void ruleFoundMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:191:2: ( ( ( rule__FoundMessage__Group__0 ) ) )
            // InternalSequence.g:192:2: ( ( rule__FoundMessage__Group__0 ) )
            {
            // InternalSequence.g:192:2: ( ( rule__FoundMessage__Group__0 ) )
            // InternalSequence.g:193:3: ( rule__FoundMessage__Group__0 )
            {
             before(grammarAccess.getFoundMessageAccess().getGroup()); 
            // InternalSequence.g:194:3: ( rule__FoundMessage__Group__0 )
            // InternalSequence.g:194:4: rule__FoundMessage__Group__0
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
    // InternalSequence.g:203:1: entryRuleLostMessage : ruleLostMessage EOF ;
    public final void entryRuleLostMessage() throws RecognitionException {
        try {
            // InternalSequence.g:204:1: ( ruleLostMessage EOF )
            // InternalSequence.g:205:1: ruleLostMessage EOF
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
    // InternalSequence.g:212:1: ruleLostMessage : ( ( rule__LostMessage__Group__0 ) ) ;
    public final void ruleLostMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:216:2: ( ( ( rule__LostMessage__Group__0 ) ) )
            // InternalSequence.g:217:2: ( ( rule__LostMessage__Group__0 ) )
            {
            // InternalSequence.g:217:2: ( ( rule__LostMessage__Group__0 ) )
            // InternalSequence.g:218:3: ( rule__LostMessage__Group__0 )
            {
             before(grammarAccess.getLostMessageAccess().getGroup()); 
            // InternalSequence.g:219:3: ( rule__LostMessage__Group__0 )
            // InternalSequence.g:219:4: rule__LostMessage__Group__0
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


    // $ANTLR start "entryRuleOccurenceSpecification"
    // InternalSequence.g:228:1: entryRuleOccurenceSpecification : ruleOccurenceSpecification EOF ;
    public final void entryRuleOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:229:1: ( ruleOccurenceSpecification EOF )
            // InternalSequence.g:230:1: ruleOccurenceSpecification EOF
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
    // InternalSequence.g:237:1: ruleOccurenceSpecification : ( ruleDestructionOccurenceSpecification ) ;
    public final void ruleOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:241:2: ( ( ruleDestructionOccurenceSpecification ) )
            // InternalSequence.g:242:2: ( ruleDestructionOccurenceSpecification )
            {
            // InternalSequence.g:242:2: ( ruleDestructionOccurenceSpecification )
            // InternalSequence.g:243:3: ruleDestructionOccurenceSpecification
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
    // InternalSequence.g:253:1: entryRuleDestructionOccurenceSpecification : ruleDestructionOccurenceSpecification EOF ;
    public final void entryRuleDestructionOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:254:1: ( ruleDestructionOccurenceSpecification EOF )
            // InternalSequence.g:255:1: ruleDestructionOccurenceSpecification EOF
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
    // InternalSequence.g:262:1: ruleDestructionOccurenceSpecification : ( ( rule__DestructionOccurenceSpecification__Group__0 ) ) ;
    public final void ruleDestructionOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:266:2: ( ( ( rule__DestructionOccurenceSpecification__Group__0 ) ) )
            // InternalSequence.g:267:2: ( ( rule__DestructionOccurenceSpecification__Group__0 ) )
            {
            // InternalSequence.g:267:2: ( ( rule__DestructionOccurenceSpecification__Group__0 ) )
            // InternalSequence.g:268:3: ( rule__DestructionOccurenceSpecification__Group__0 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getGroup()); 
            // InternalSequence.g:269:3: ( rule__DestructionOccurenceSpecification__Group__0 )
            // InternalSequence.g:269:4: rule__DestructionOccurenceSpecification__Group__0
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


    // $ANTLR start "entryRuleFQN"
    // InternalSequence.g:278:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSequence.g:279:1: ( ruleFQN EOF )
            // InternalSequence.g:280:1: ruleFQN EOF
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
    // InternalSequence.g:287:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:291:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSequence.g:292:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSequence.g:292:2: ( ( rule__FQN__Group__0 ) )
            // InternalSequence.g:293:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalSequence.g:294:3: ( rule__FQN__Group__0 )
            // InternalSequence.g:294:4: rule__FQN__Group__0
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


    // $ANTLR start "entryRuleCommentBody"
    // InternalSequence.g:303:1: entryRuleCommentBody : ruleCommentBody EOF ;
    public final void entryRuleCommentBody() throws RecognitionException {
        try {
            // InternalSequence.g:304:1: ( ruleCommentBody EOF )
            // InternalSequence.g:305:1: ruleCommentBody EOF
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
    // InternalSequence.g:312:1: ruleCommentBody : ( RULE_STRING ) ;
    public final void ruleCommentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:316:2: ( ( RULE_STRING ) )
            // InternalSequence.g:317:2: ( RULE_STRING )
            {
            // InternalSequence.g:317:2: ( RULE_STRING )
            // InternalSequence.g:318:3: RULE_STRING
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
    // InternalSequence.g:328:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:332:1: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalSequence.g:333:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalSequence.g:333:2: ( ( rule__MessageType__Alternatives ) )
            // InternalSequence.g:334:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalSequence.g:335:3: ( rule__MessageType__Alternatives )
            // InternalSequence.g:335:4: rule__MessageType__Alternatives
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
    // InternalSequence.g:344:1: ruleActorType : ( ( rule__ActorType__Alternatives ) ) ;
    public final void ruleActorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:348:1: ( ( ( rule__ActorType__Alternatives ) ) )
            // InternalSequence.g:349:2: ( ( rule__ActorType__Alternatives ) )
            {
            // InternalSequence.g:349:2: ( ( rule__ActorType__Alternatives ) )
            // InternalSequence.g:350:3: ( rule__ActorType__Alternatives )
            {
             before(grammarAccess.getActorTypeAccess().getAlternatives()); 
            // InternalSequence.g:351:3: ( rule__ActorType__Alternatives )
            // InternalSequence.g:351:4: rule__ActorType__Alternatives
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


    // $ANTLR start "rule__Actor__Alternatives"
    // InternalSequence.g:359:1: rule__Actor__Alternatives : ( ( ( rule__Actor__Group_0__0 ) ) | ( ( rule__Actor__Group_1__0 ) ) | ( ( rule__Actor__Group_2__0 ) ) );
    public final void rule__Actor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:363:1: ( ( ( rule__Actor__Group_0__0 ) ) | ( ( rule__Actor__Group_1__0 ) ) | ( ( rule__Actor__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                alt1=2;
                }
                break;
            case 19:
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
                    // InternalSequence.g:364:2: ( ( rule__Actor__Group_0__0 ) )
                    {
                    // InternalSequence.g:364:2: ( ( rule__Actor__Group_0__0 ) )
                    // InternalSequence.g:365:3: ( rule__Actor__Group_0__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_0()); 
                    // InternalSequence.g:366:3: ( rule__Actor__Group_0__0 )
                    // InternalSequence.g:366:4: rule__Actor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:370:2: ( ( rule__Actor__Group_1__0 ) )
                    {
                    // InternalSequence.g:370:2: ( ( rule__Actor__Group_1__0 ) )
                    // InternalSequence.g:371:3: ( rule__Actor__Group_1__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_1()); 
                    // InternalSequence.g:372:3: ( rule__Actor__Group_1__0 )
                    // InternalSequence.g:372:4: rule__Actor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:376:2: ( ( rule__Actor__Group_2__0 ) )
                    {
                    // InternalSequence.g:376:2: ( ( rule__Actor__Group_2__0 ) )
                    // InternalSequence.g:377:3: ( rule__Actor__Group_2__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2()); 
                    // InternalSequence.g:378:3: ( rule__Actor__Group_2__0 )
                    // InternalSequence.g:378:4: rule__Actor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActorAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Actor__Alternatives"


    // $ANTLR start "rule__InteractionFragment__Alternatives"
    // InternalSequence.g:386:1: rule__InteractionFragment__Alternatives : ( ( ruleMessage ) | ( ruleOccurenceSpecification ) );
    public final void rule__InteractionFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:390:1: ( ( ruleMessage ) | ( ruleOccurenceSpecification ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)||LA2_0==26||LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSequence.g:391:2: ( ruleMessage )
                    {
                    // InternalSequence.g:391:2: ( ruleMessage )
                    // InternalSequence.g:392:3: ruleMessage
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
                    // InternalSequence.g:397:2: ( ruleOccurenceSpecification )
                    {
                    // InternalSequence.g:397:2: ( ruleOccurenceSpecification )
                    // InternalSequence.g:398:3: ruleOccurenceSpecification
                    {
                     before(grammarAccess.getInteractionFragmentAccess().getOccurenceSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOccurenceSpecification();

                    state._fsp--;

                     after(grammarAccess.getInteractionFragmentAccess().getOccurenceSpecificationParserRuleCall_1()); 

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


    // $ANTLR start "rule__Message__Alternatives"
    // InternalSequence.g:407:1: rule__Message__Alternatives : ( ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ( rule__Message__Group_2__0 ) ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:411:1: ( ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ( rule__Message__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 11:
            case 12:
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
                    // InternalSequence.g:412:2: ( ruleFoundMessage )
                    {
                    // InternalSequence.g:412:2: ( ruleFoundMessage )
                    // InternalSequence.g:413:3: ruleFoundMessage
                    {
                     before(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFoundMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:418:2: ( ruleLostMessage )
                    {
                    // InternalSequence.g:418:2: ( ruleLostMessage )
                    // InternalSequence.g:419:3: ruleLostMessage
                    {
                     before(grammarAccess.getMessageAccess().getLostMessageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLostMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getLostMessageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:424:2: ( ( rule__Message__Group_2__0 ) )
                    {
                    // InternalSequence.g:424:2: ( ( rule__Message__Group_2__0 ) )
                    // InternalSequence.g:425:3: ( rule__Message__Group_2__0 )
                    {
                     before(grammarAccess.getMessageAccess().getGroup_2()); 
                    // InternalSequence.g:426:3: ( rule__Message__Group_2__0 )
                    // InternalSequence.g:426:4: rule__Message__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Message__Alternatives"


    // $ANTLR start "rule__MessageType__Alternatives"
    // InternalSequence.g:434:1: rule__MessageType__Alternatives : ( ( ( 'sync' ) ) | ( ( 'async' ) ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:438:1: ( ( ( 'sync' ) ) | ( ( 'async' ) ) )
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
                    // InternalSequence.g:439:2: ( ( 'sync' ) )
                    {
                    // InternalSequence.g:439:2: ( ( 'sync' ) )
                    // InternalSequence.g:440:3: ( 'sync' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:441:3: ( 'sync' )
                    // InternalSequence.g:441:4: 'sync'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:445:2: ( ( 'async' ) )
                    {
                    // InternalSequence.g:445:2: ( ( 'async' ) )
                    // InternalSequence.g:446:3: ( 'async' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getASYNCEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:447:3: ( 'async' )
                    // InternalSequence.g:447:4: 'async'
                    {
                    match(input,12,FOLLOW_2); 

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
    // InternalSequence.g:455:1: rule__ActorType__Alternatives : ( ( ( 'human' ) ) | ( ( 'machine' ) ) );
    public final void rule__ActorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:459:1: ( ( ( 'human' ) ) | ( ( 'machine' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSequence.g:460:2: ( ( 'human' ) )
                    {
                    // InternalSequence.g:460:2: ( ( 'human' ) )
                    // InternalSequence.g:461:3: ( 'human' )
                    {
                     before(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:462:3: ( 'human' )
                    // InternalSequence.g:462:4: 'human'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:466:2: ( ( 'machine' ) )
                    {
                    // InternalSequence.g:466:2: ( ( 'machine' ) )
                    // InternalSequence.g:467:3: ( 'machine' )
                    {
                     before(grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:468:3: ( 'machine' )
                    // InternalSequence.g:468:4: 'machine'
                    {
                    match(input,14,FOLLOW_2); 

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


    // $ANTLR start "rule__SequenceDiagram__Group__0"
    // InternalSequence.g:476:1: rule__SequenceDiagram__Group__0 : rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 ;
    public final void rule__SequenceDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:480:1: ( rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 )
            // InternalSequence.g:481:2: rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1
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
    // InternalSequence.g:488:1: rule__SequenceDiagram__Group__0__Impl : ( () ) ;
    public final void rule__SequenceDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:492:1: ( ( () ) )
            // InternalSequence.g:493:1: ( () )
            {
            // InternalSequence.g:493:1: ( () )
            // InternalSequence.g:494:2: ()
            {
             before(grammarAccess.getSequenceDiagramAccess().getSequenceDiagramAction_0()); 
            // InternalSequence.g:495:2: ()
            // InternalSequence.g:495:3: 
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
    // InternalSequence.g:503:1: rule__SequenceDiagram__Group__1 : rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 ;
    public final void rule__SequenceDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:507:1: ( rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 )
            // InternalSequence.g:508:2: rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2
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
    // InternalSequence.g:515:1: rule__SequenceDiagram__Group__1__Impl : ( '@start-seqd' ) ;
    public final void rule__SequenceDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:519:1: ( ( '@start-seqd' ) )
            // InternalSequence.g:520:1: ( '@start-seqd' )
            {
            // InternalSequence.g:520:1: ( '@start-seqd' )
            // InternalSequence.g:521:2: '@start-seqd'
            {
             before(grammarAccess.getSequenceDiagramAccess().getStartSeqdKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSequence.g:530:1: rule__SequenceDiagram__Group__2 : rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 ;
    public final void rule__SequenceDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:534:1: ( rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 )
            // InternalSequence.g:535:2: rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3
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
    // InternalSequence.g:542:1: rule__SequenceDiagram__Group__2__Impl : ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) ;
    public final void rule__SequenceDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:546:1: ( ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) )
            // InternalSequence.g:547:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            {
            // InternalSequence.g:547:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            // InternalSequence.g:548:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getTitleAssignment_2()); 
            // InternalSequence.g:549:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            // InternalSequence.g:549:3: rule__SequenceDiagram__TitleAssignment_2
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
    // InternalSequence.g:557:1: rule__SequenceDiagram__Group__3 : rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 ;
    public final void rule__SequenceDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:561:1: ( rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 )
            // InternalSequence.g:562:2: rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4
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
    // InternalSequence.g:569:1: rule__SequenceDiagram__Group__3__Impl : ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__SequenceDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:573:1: ( ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) )
            // InternalSequence.g:574:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            {
            // InternalSequence.g:574:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            // InternalSequence.g:575:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getRootPackageAssignment_3()); 
            // InternalSequence.g:576:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            // InternalSequence.g:576:3: rule__SequenceDiagram__RootPackageAssignment_3
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
    // InternalSequence.g:584:1: rule__SequenceDiagram__Group__4 : rule__SequenceDiagram__Group__4__Impl ;
    public final void rule__SequenceDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:588:1: ( rule__SequenceDiagram__Group__4__Impl )
            // InternalSequence.g:589:2: rule__SequenceDiagram__Group__4__Impl
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
    // InternalSequence.g:595:1: rule__SequenceDiagram__Group__4__Impl : ( '@end-seqd' ) ;
    public final void rule__SequenceDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:599:1: ( ( '@end-seqd' ) )
            // InternalSequence.g:600:1: ( '@end-seqd' )
            {
            // InternalSequence.g:600:1: ( '@end-seqd' )
            // InternalSequence.g:601:2: '@end-seqd'
            {
             before(grammarAccess.getSequenceDiagramAccess().getEndSeqdKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSequence.g:611:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:615:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalSequence.g:616:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
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
    // InternalSequence.g:623:1: rule__RootPackage__Group__0__Impl : ( 'rootElement' ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:627:1: ( ( 'rootElement' ) )
            // InternalSequence.g:628:1: ( 'rootElement' )
            {
            // InternalSequence.g:628:1: ( 'rootElement' )
            // InternalSequence.g:629:2: 'rootElement'
            {
             before(grammarAccess.getRootPackageAccess().getRootElementKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSequence.g:638:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:642:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalSequence.g:643:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
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
    // InternalSequence.g:650:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__NameAssignment_1 ) ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:654:1: ( ( ( rule__RootPackage__NameAssignment_1 ) ) )
            // InternalSequence.g:655:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            {
            // InternalSequence.g:655:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            // InternalSequence.g:656:2: ( rule__RootPackage__NameAssignment_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 
            // InternalSequence.g:657:2: ( rule__RootPackage__NameAssignment_1 )
            // InternalSequence.g:657:3: rule__RootPackage__NameAssignment_1
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
    // InternalSequence.g:665:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:669:1: ( rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 )
            // InternalSequence.g:670:2: rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3
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
    // InternalSequence.g:677:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__ActorsAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:681:1: ( ( ( rule__RootPackage__ActorsAssignment_2 )* ) )
            // InternalSequence.g:682:1: ( ( rule__RootPackage__ActorsAssignment_2 )* )
            {
            // InternalSequence.g:682:1: ( ( rule__RootPackage__ActorsAssignment_2 )* )
            // InternalSequence.g:683:2: ( rule__RootPackage__ActorsAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getActorsAssignment_2()); 
            // InternalSequence.g:684:2: ( rule__RootPackage__ActorsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||(LA6_0>=18 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSequence.g:684:3: rule__RootPackage__ActorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RootPackage__ActorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalSequence.g:692:1: rule__RootPackage__Group__3 : rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 ;
    public final void rule__RootPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:696:1: ( rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 )
            // InternalSequence.g:697:2: rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__RootPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__4();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:704:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__InteractionFragmentsAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:708:1: ( ( ( rule__RootPackage__InteractionFragmentsAssignment_3 )* ) )
            // InternalSequence.g:709:1: ( ( rule__RootPackage__InteractionFragmentsAssignment_3 )* )
            {
            // InternalSequence.g:709:1: ( ( rule__RootPackage__InteractionFragmentsAssignment_3 )* )
            // InternalSequence.g:710:2: ( rule__RootPackage__InteractionFragmentsAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getInteractionFragmentsAssignment_3()); 
            // InternalSequence.g:711:2: ( rule__RootPackage__InteractionFragmentsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=12)||LA7_0==26||(LA7_0>=28 && LA7_0<=29)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSequence.g:711:3: rule__RootPackage__InteractionFragmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RootPackage__InteractionFragmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "rule__RootPackage__Group__4"
    // InternalSequence.g:719:1: rule__RootPackage__Group__4 : rule__RootPackage__Group__4__Impl ;
    public final void rule__RootPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:723:1: ( rule__RootPackage__Group__4__Impl )
            // InternalSequence.g:724:2: rule__RootPackage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__4"


    // $ANTLR start "rule__RootPackage__Group__4__Impl"
    // InternalSequence.g:730:1: rule__RootPackage__Group__4__Impl : ( ( rule__RootPackage__ClsAssignment_4 )* ) ;
    public final void rule__RootPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:734:1: ( ( ( rule__RootPackage__ClsAssignment_4 )* ) )
            // InternalSequence.g:735:1: ( ( rule__RootPackage__ClsAssignment_4 )* )
            {
            // InternalSequence.g:735:1: ( ( rule__RootPackage__ClsAssignment_4 )* )
            // InternalSequence.g:736:2: ( rule__RootPackage__ClsAssignment_4 )*
            {
             before(grammarAccess.getRootPackageAccess().getClsAssignment_4()); 
            // InternalSequence.g:737:2: ( rule__RootPackage__ClsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSequence.g:737:3: rule__RootPackage__ClsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RootPackage__ClsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRootPackageAccess().getClsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group_0__0"
    // InternalSequence.g:746:1: rule__Actor__Group_0__0 : rule__Actor__Group_0__0__Impl rule__Actor__Group_0__1 ;
    public final void rule__Actor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:750:1: ( rule__Actor__Group_0__0__Impl rule__Actor__Group_0__1 )
            // InternalSequence.g:751:2: rule__Actor__Group_0__0__Impl rule__Actor__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_0__0"


    // $ANTLR start "rule__Actor__Group_0__0__Impl"
    // InternalSequence.g:758:1: rule__Actor__Group_0__0__Impl : ( 'act' ) ;
    public final void rule__Actor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:762:1: ( ( 'act' ) )
            // InternalSequence.g:763:1: ( 'act' )
            {
            // InternalSequence.g:763:1: ( 'act' )
            // InternalSequence.g:764:2: 'act'
            {
             before(grammarAccess.getActorAccess().getActKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_0__0__Impl"


    // $ANTLR start "rule__Actor__Group_0__1"
    // InternalSequence.g:773:1: rule__Actor__Group_0__1 : rule__Actor__Group_0__1__Impl ;
    public final void rule__Actor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:777:1: ( rule__Actor__Group_0__1__Impl )
            // InternalSequence.g:778:2: rule__Actor__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_0__1"


    // $ANTLR start "rule__Actor__Group_0__1__Impl"
    // InternalSequence.g:784:1: rule__Actor__Group_0__1__Impl : ( ( rule__Actor__Group_0_1__0 ) ) ;
    public final void rule__Actor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:788:1: ( ( ( rule__Actor__Group_0_1__0 ) ) )
            // InternalSequence.g:789:1: ( ( rule__Actor__Group_0_1__0 ) )
            {
            // InternalSequence.g:789:1: ( ( rule__Actor__Group_0_1__0 ) )
            // InternalSequence.g:790:2: ( rule__Actor__Group_0_1__0 )
            {
             before(grammarAccess.getActorAccess().getGroup_0_1()); 
            // InternalSequence.g:791:2: ( rule__Actor__Group_0_1__0 )
            // InternalSequence.g:791:3: rule__Actor__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_0__1__Impl"


    // $ANTLR start "rule__Actor__Group_0_1__0"
    // InternalSequence.g:800:1: rule__Actor__Group_0_1__0 : rule__Actor__Group_0_1__0__Impl rule__Actor__Group_0_1__1 ;
    public final void rule__Actor__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:804:1: ( rule__Actor__Group_0_1__0__Impl rule__Actor__Group_0_1__1 )
            // InternalSequence.g:805:2: rule__Actor__Group_0_1__0__Impl rule__Actor__Group_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_0_1__0"


    // $ANTLR start "rule__Actor__Group_0_1__0__Impl"
    // InternalSequence.g:812:1: rule__Actor__Group_0_1__0__Impl : ( ( rule__Actor__NameAssignment_0_1_0 ) ) ;
    public final void rule__Actor__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:816:1: ( ( ( rule__Actor__NameAssignment_0_1_0 ) ) )
            // InternalSequence.g:817:1: ( ( rule__Actor__NameAssignment_0_1_0 ) )
            {
            // InternalSequence.g:817:1: ( ( rule__Actor__NameAssignment_0_1_0 ) )
            // InternalSequence.g:818:2: ( rule__Actor__NameAssignment_0_1_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_0_1_0()); 
            // InternalSequence.g:819:2: ( rule__Actor__NameAssignment_0_1_0 )
            // InternalSequence.g:819:3: rule__Actor__NameAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_0_1__0__Impl"


    // $ANTLR start "rule__Actor__Group_0_1__1"
    // InternalSequence.g:827:1: rule__Actor__Group_0_1__1 : rule__Actor__Group_0_1__1__Impl rule__Actor__Group_0_1__2 ;
    public final void rule__Actor__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:831:1: ( rule__Actor__Group_0_1__1__Impl rule__Actor__Group_0_1__2 )
            // InternalSequence.g:832:2: rule__Actor__Group_0_1__1__Impl rule__Actor__Group_0_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_0_1__1"


    // $ANTLR start "rule__Actor__Group_0_1__1__Impl"
    // InternalSequence.g:839:1: rule__Actor__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__Actor__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:843:1: ( ( ':' ) )
            // InternalSequence.g:844:1: ( ':' )
            {
            // InternalSequence.g:844:1: ( ':' )
            // InternalSequence.g:845:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_0_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_0_1__1__Impl"


    // $ANTLR start "rule__Actor__Group_0_1__2"
    // InternalSequence.g:854:1: rule__Actor__Group_0_1__2 : rule__Actor__Group_0_1__2__Impl ;
    public final void rule__Actor__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:858:1: ( rule__Actor__Group_0_1__2__Impl )
            // InternalSequence.g:859:2: rule__Actor__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_0_1__2"


    // $ANTLR start "rule__Actor__Group_0_1__2__Impl"
    // InternalSequence.g:865:1: rule__Actor__Group_0_1__2__Impl : ( ( rule__Actor__TypeAssignment_0_1_2 ) ) ;
    public final void rule__Actor__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:869:1: ( ( ( rule__Actor__TypeAssignment_0_1_2 ) ) )
            // InternalSequence.g:870:1: ( ( rule__Actor__TypeAssignment_0_1_2 ) )
            {
            // InternalSequence.g:870:1: ( ( rule__Actor__TypeAssignment_0_1_2 ) )
            // InternalSequence.g:871:2: ( rule__Actor__TypeAssignment_0_1_2 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_0_1_2()); 
            // InternalSequence.g:872:2: ( rule__Actor__TypeAssignment_0_1_2 )
            // InternalSequence.g:872:3: rule__Actor__TypeAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_0_1__2__Impl"


    // $ANTLR start "rule__Actor__Group_1__0"
    // InternalSequence.g:881:1: rule__Actor__Group_1__0 : rule__Actor__Group_1__0__Impl rule__Actor__Group_1__1 ;
    public final void rule__Actor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:885:1: ( rule__Actor__Group_1__0__Impl rule__Actor__Group_1__1 )
            // InternalSequence.g:886:2: rule__Actor__Group_1__0__Impl rule__Actor__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_1__0"


    // $ANTLR start "rule__Actor__Group_1__0__Impl"
    // InternalSequence.g:893:1: rule__Actor__Group_1__0__Impl : ( ( rule__Actor__NameAssignment_1_0 ) ) ;
    public final void rule__Actor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:897:1: ( ( ( rule__Actor__NameAssignment_1_0 ) ) )
            // InternalSequence.g:898:1: ( ( rule__Actor__NameAssignment_1_0 ) )
            {
            // InternalSequence.g:898:1: ( ( rule__Actor__NameAssignment_1_0 ) )
            // InternalSequence.g:899:2: ( rule__Actor__NameAssignment_1_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1_0()); 
            // InternalSequence.g:900:2: ( rule__Actor__NameAssignment_1_0 )
            // InternalSequence.g:900:3: rule__Actor__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_1__0__Impl"


    // $ANTLR start "rule__Actor__Group_1__1"
    // InternalSequence.g:908:1: rule__Actor__Group_1__1 : rule__Actor__Group_1__1__Impl rule__Actor__Group_1__2 ;
    public final void rule__Actor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:912:1: ( rule__Actor__Group_1__1__Impl rule__Actor__Group_1__2 )
            // InternalSequence.g:913:2: rule__Actor__Group_1__1__Impl rule__Actor__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_1__1"


    // $ANTLR start "rule__Actor__Group_1__1__Impl"
    // InternalSequence.g:920:1: rule__Actor__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Actor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:924:1: ( ( ':' ) )
            // InternalSequence.g:925:1: ( ':' )
            {
            // InternalSequence.g:925:1: ( ':' )
            // InternalSequence.g:926:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_1__1__Impl"


    // $ANTLR start "rule__Actor__Group_1__2"
    // InternalSequence.g:935:1: rule__Actor__Group_1__2 : rule__Actor__Group_1__2__Impl rule__Actor__Group_1__3 ;
    public final void rule__Actor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:939:1: ( rule__Actor__Group_1__2__Impl rule__Actor__Group_1__3 )
            // InternalSequence.g:940:2: rule__Actor__Group_1__2__Impl rule__Actor__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__Actor__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_1__2"


    // $ANTLR start "rule__Actor__Group_1__2__Impl"
    // InternalSequence.g:947:1: rule__Actor__Group_1__2__Impl : ( ( rule__Actor__TypeAssignment_1_2 ) ) ;
    public final void rule__Actor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:951:1: ( ( ( rule__Actor__TypeAssignment_1_2 ) ) )
            // InternalSequence.g:952:1: ( ( rule__Actor__TypeAssignment_1_2 ) )
            {
            // InternalSequence.g:952:1: ( ( rule__Actor__TypeAssignment_1_2 ) )
            // InternalSequence.g:953:2: ( rule__Actor__TypeAssignment_1_2 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_1_2()); 
            // InternalSequence.g:954:2: ( rule__Actor__TypeAssignment_1_2 )
            // InternalSequence.g:954:3: rule__Actor__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_1__2__Impl"


    // $ANTLR start "rule__Actor__Group_1__3"
    // InternalSequence.g:962:1: rule__Actor__Group_1__3 : rule__Actor__Group_1__3__Impl rule__Actor__Group_1__4 ;
    public final void rule__Actor__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:966:1: ( rule__Actor__Group_1__3__Impl rule__Actor__Group_1__4 )
            // InternalSequence.g:967:2: rule__Actor__Group_1__3__Impl rule__Actor__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_1__3"


    // $ANTLR start "rule__Actor__Group_1__3__Impl"
    // InternalSequence.g:974:1: rule__Actor__Group_1__3__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:978:1: ( ( 'as' ) )
            // InternalSequence.g:979:1: ( 'as' )
            {
            // InternalSequence.g:979:1: ( 'as' )
            // InternalSequence.g:980:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_1_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAsKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_1__3__Impl"


    // $ANTLR start "rule__Actor__Group_1__4"
    // InternalSequence.g:989:1: rule__Actor__Group_1__4 : rule__Actor__Group_1__4__Impl ;
    public final void rule__Actor__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:993:1: ( rule__Actor__Group_1__4__Impl )
            // InternalSequence.g:994:2: rule__Actor__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_1__4"


    // $ANTLR start "rule__Actor__Group_1__4__Impl"
    // InternalSequence.g:1000:1: rule__Actor__Group_1__4__Impl : ( ( rule__Actor__AliasAssignment_1_4 ) ) ;
    public final void rule__Actor__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1004:1: ( ( ( rule__Actor__AliasAssignment_1_4 ) ) )
            // InternalSequence.g:1005:1: ( ( rule__Actor__AliasAssignment_1_4 ) )
            {
            // InternalSequence.g:1005:1: ( ( rule__Actor__AliasAssignment_1_4 ) )
            // InternalSequence.g:1006:2: ( rule__Actor__AliasAssignment_1_4 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_1_4()); 
            // InternalSequence.g:1007:2: ( rule__Actor__AliasAssignment_1_4 )
            // InternalSequence.g:1007:3: rule__Actor__AliasAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Actor__AliasAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAliasAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_1__4__Impl"


    // $ANTLR start "rule__Actor__Group_2__0"
    // InternalSequence.g:1016:1: rule__Actor__Group_2__0 : rule__Actor__Group_2__0__Impl rule__Actor__Group_2__1 ;
    public final void rule__Actor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1020:1: ( rule__Actor__Group_2__0__Impl rule__Actor__Group_2__1 )
            // InternalSequence.g:1021:2: rule__Actor__Group_2__0__Impl rule__Actor__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Actor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2__0"


    // $ANTLR start "rule__Actor__Group_2__0__Impl"
    // InternalSequence.g:1028:1: rule__Actor__Group_2__0__Impl : ( ( rule__Actor__Group_2_0__0 ) ) ;
    public final void rule__Actor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1032:1: ( ( ( rule__Actor__Group_2_0__0 ) ) )
            // InternalSequence.g:1033:1: ( ( rule__Actor__Group_2_0__0 ) )
            {
            // InternalSequence.g:1033:1: ( ( rule__Actor__Group_2_0__0 ) )
            // InternalSequence.g:1034:2: ( rule__Actor__Group_2_0__0 )
            {
             before(grammarAccess.getActorAccess().getGroup_2_0()); 
            // InternalSequence.g:1035:2: ( rule__Actor__Group_2_0__0 )
            // InternalSequence.g:1035:3: rule__Actor__Group_2_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_0__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2__0__Impl"


    // $ANTLR start "rule__Actor__Group_2__1"
    // InternalSequence.g:1043:1: rule__Actor__Group_2__1 : rule__Actor__Group_2__1__Impl ;
    public final void rule__Actor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1047:1: ( rule__Actor__Group_2__1__Impl )
            // InternalSequence.g:1048:2: rule__Actor__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2__1"


    // $ANTLR start "rule__Actor__Group_2__1__Impl"
    // InternalSequence.g:1054:1: rule__Actor__Group_2__1__Impl : ( ( rule__Actor__Group_2_1__0 )? ) ;
    public final void rule__Actor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1058:1: ( ( ( rule__Actor__Group_2_1__0 )? ) )
            // InternalSequence.g:1059:1: ( ( rule__Actor__Group_2_1__0 )? )
            {
            // InternalSequence.g:1059:1: ( ( rule__Actor__Group_2_1__0 )? )
            // InternalSequence.g:1060:2: ( rule__Actor__Group_2_1__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_2_1()); 
            // InternalSequence.g:1061:2: ( rule__Actor__Group_2_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSequence.g:1061:3: rule__Actor__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2__1__Impl"


    // $ANTLR start "rule__Actor__Group_2_0__0"
    // InternalSequence.g:1070:1: rule__Actor__Group_2_0__0 : rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 ;
    public final void rule__Actor__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1074:1: ( rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 )
            // InternalSequence.g:1075:2: rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:1082:1: rule__Actor__Group_2_0__0__Impl : ( ':' ) ;
    public final void rule__Actor__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1086:1: ( ( ':' ) )
            // InternalSequence.g:1087:1: ( ':' )
            {
            // InternalSequence.g:1087:1: ( ':' )
            // InternalSequence.g:1088:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_2_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_2_0_0()); 

            }


            }

        }
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
    // InternalSequence.g:1097:1: rule__Actor__Group_2_0__1 : rule__Actor__Group_2_0__1__Impl rule__Actor__Group_2_0__2 ;
    public final void rule__Actor__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1101:1: ( rule__Actor__Group_2_0__1__Impl rule__Actor__Group_2_0__2 )
            // InternalSequence.g:1102:2: rule__Actor__Group_2_0__1__Impl rule__Actor__Group_2_0__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSequence.g:1109:1: rule__Actor__Group_2_0__1__Impl : ( ( rule__Actor__TypeAssignment_2_0_1 ) ) ;
    public final void rule__Actor__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1113:1: ( ( ( rule__Actor__TypeAssignment_2_0_1 ) ) )
            // InternalSequence.g:1114:1: ( ( rule__Actor__TypeAssignment_2_0_1 ) )
            {
            // InternalSequence.g:1114:1: ( ( rule__Actor__TypeAssignment_2_0_1 ) )
            // InternalSequence.g:1115:2: ( rule__Actor__TypeAssignment_2_0_1 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_2_0_1()); 
            // InternalSequence.g:1116:2: ( rule__Actor__TypeAssignment_2_0_1 )
            // InternalSequence.g:1116:3: rule__Actor__TypeAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_2_0_1()); 

            }


            }

        }
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
    // InternalSequence.g:1124:1: rule__Actor__Group_2_0__2 : rule__Actor__Group_2_0__2__Impl rule__Actor__Group_2_0__3 ;
    public final void rule__Actor__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1128:1: ( rule__Actor__Group_2_0__2__Impl rule__Actor__Group_2_0__3 )
            // InternalSequence.g:1129:2: rule__Actor__Group_2_0__2__Impl rule__Actor__Group_2_0__3
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_0__3();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:1136:1: rule__Actor__Group_2_0__2__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1140:1: ( ( 'as' ) )
            // InternalSequence.g:1141:1: ( 'as' )
            {
            // InternalSequence.g:1141:1: ( 'as' )
            // InternalSequence.g:1142:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_2_0_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAsKeyword_2_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Actor__Group_2_0__3"
    // InternalSequence.g:1151:1: rule__Actor__Group_2_0__3 : rule__Actor__Group_2_0__3__Impl ;
    public final void rule__Actor__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1155:1: ( rule__Actor__Group_2_0__3__Impl )
            // InternalSequence.g:1156:2: rule__Actor__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_0__3"


    // $ANTLR start "rule__Actor__Group_2_0__3__Impl"
    // InternalSequence.g:1162:1: rule__Actor__Group_2_0__3__Impl : ( ( rule__Actor__AliasAssignment_2_0_3 ) ) ;
    public final void rule__Actor__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1166:1: ( ( ( rule__Actor__AliasAssignment_2_0_3 ) ) )
            // InternalSequence.g:1167:1: ( ( rule__Actor__AliasAssignment_2_0_3 ) )
            {
            // InternalSequence.g:1167:1: ( ( rule__Actor__AliasAssignment_2_0_3 ) )
            // InternalSequence.g:1168:2: ( rule__Actor__AliasAssignment_2_0_3 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_0_3()); 
            // InternalSequence.g:1169:2: ( rule__Actor__AliasAssignment_2_0_3 )
            // InternalSequence.g:1169:3: rule__Actor__AliasAssignment_2_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Actor__AliasAssignment_2_0_3();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAliasAssignment_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2_0__3__Impl"


    // $ANTLR start "rule__Actor__Group_2_1__0"
    // InternalSequence.g:1178:1: rule__Actor__Group_2_1__0 : rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 ;
    public final void rule__Actor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1182:1: ( rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 )
            // InternalSequence.g:1183:2: rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSequence.g:1190:1: rule__Actor__Group_2_1__0__Impl : ( 'role[' ) ;
    public final void rule__Actor__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1194:1: ( ( 'role[' ) )
            // InternalSequence.g:1195:1: ( 'role[' )
            {
            // InternalSequence.g:1195:1: ( 'role[' )
            // InternalSequence.g:1196:2: 'role['
            {
             before(grammarAccess.getActorAccess().getRoleKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getRoleKeyword_2_1_0()); 

            }


            }

        }
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
    // InternalSequence.g:1205:1: rule__Actor__Group_2_1__1 : rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 ;
    public final void rule__Actor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1209:1: ( rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 )
            // InternalSequence.g:1210:2: rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSequence.g:1217:1: rule__Actor__Group_2_1__1__Impl : ( ( rule__Actor__ActorTypeAssignment_2_1_1 ) ) ;
    public final void rule__Actor__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1221:1: ( ( ( rule__Actor__ActorTypeAssignment_2_1_1 ) ) )
            // InternalSequence.g:1222:1: ( ( rule__Actor__ActorTypeAssignment_2_1_1 ) )
            {
            // InternalSequence.g:1222:1: ( ( rule__Actor__ActorTypeAssignment_2_1_1 ) )
            // InternalSequence.g:1223:2: ( rule__Actor__ActorTypeAssignment_2_1_1 )
            {
             before(grammarAccess.getActorAccess().getActorTypeAssignment_2_1_1()); 
            // InternalSequence.g:1224:2: ( rule__Actor__ActorTypeAssignment_2_1_1 )
            // InternalSequence.g:1224:3: rule__Actor__ActorTypeAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__ActorTypeAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getActorTypeAssignment_2_1_1()); 

            }


            }

        }
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
    // InternalSequence.g:1232:1: rule__Actor__Group_2_1__2 : rule__Actor__Group_2_1__2__Impl ;
    public final void rule__Actor__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1236:1: ( rule__Actor__Group_2_1__2__Impl )
            // InternalSequence.g:1237:2: rule__Actor__Group_2_1__2__Impl
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
    // InternalSequence.g:1243:1: rule__Actor__Group_2_1__2__Impl : ( ']' ) ;
    public final void rule__Actor__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1247:1: ( ( ']' ) )
            // InternalSequence.g:1248:1: ( ']' )
            {
            // InternalSequence.g:1248:1: ( ']' )
            // InternalSequence.g:1249:2: ']'
            {
             before(grammarAccess.getActorAccess().getRightSquareBracketKeyword_2_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getRightSquareBracketKeyword_2_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Message__Group_2__0"
    // InternalSequence.g:1259:1: rule__Message__Group_2__0 : rule__Message__Group_2__0__Impl rule__Message__Group_2__1 ;
    public final void rule__Message__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1263:1: ( rule__Message__Group_2__0__Impl rule__Message__Group_2__1 )
            // InternalSequence.g:1264:2: rule__Message__Group_2__0__Impl rule__Message__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Message__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__0"


    // $ANTLR start "rule__Message__Group_2__0__Impl"
    // InternalSequence.g:1271:1: rule__Message__Group_2__0__Impl : ( ( rule__Message__TypeAssignment_2_0 ) ) ;
    public final void rule__Message__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1275:1: ( ( ( rule__Message__TypeAssignment_2_0 ) ) )
            // InternalSequence.g:1276:1: ( ( rule__Message__TypeAssignment_2_0 ) )
            {
            // InternalSequence.g:1276:1: ( ( rule__Message__TypeAssignment_2_0 ) )
            // InternalSequence.g:1277:2: ( rule__Message__TypeAssignment_2_0 )
            {
             before(grammarAccess.getMessageAccess().getTypeAssignment_2_0()); 
            // InternalSequence.g:1278:2: ( rule__Message__TypeAssignment_2_0 )
            // InternalSequence.g:1278:3: rule__Message__TypeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Message__TypeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getTypeAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__0__Impl"


    // $ANTLR start "rule__Message__Group_2__1"
    // InternalSequence.g:1286:1: rule__Message__Group_2__1 : rule__Message__Group_2__1__Impl rule__Message__Group_2__2 ;
    public final void rule__Message__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1290:1: ( rule__Message__Group_2__1__Impl rule__Message__Group_2__2 )
            // InternalSequence.g:1291:2: rule__Message__Group_2__1__Impl rule__Message__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__Message__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__1"


    // $ANTLR start "rule__Message__Group_2__1__Impl"
    // InternalSequence.g:1298:1: rule__Message__Group_2__1__Impl : ( ( rule__Message__NameAssignment_2_1 ) ) ;
    public final void rule__Message__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1302:1: ( ( ( rule__Message__NameAssignment_2_1 ) ) )
            // InternalSequence.g:1303:1: ( ( rule__Message__NameAssignment_2_1 ) )
            {
            // InternalSequence.g:1303:1: ( ( rule__Message__NameAssignment_2_1 ) )
            // InternalSequence.g:1304:2: ( rule__Message__NameAssignment_2_1 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_2_1()); 
            // InternalSequence.g:1305:2: ( rule__Message__NameAssignment_2_1 )
            // InternalSequence.g:1305:3: rule__Message__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__1__Impl"


    // $ANTLR start "rule__Message__Group_2__2"
    // InternalSequence.g:1313:1: rule__Message__Group_2__2 : rule__Message__Group_2__2__Impl rule__Message__Group_2__3 ;
    public final void rule__Message__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1317:1: ( rule__Message__Group_2__2__Impl rule__Message__Group_2__3 )
            // InternalSequence.g:1318:2: rule__Message__Group_2__2__Impl rule__Message__Group_2__3
            {
            pushFollow(FOLLOW_7);
            rule__Message__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__2"


    // $ANTLR start "rule__Message__Group_2__2__Impl"
    // InternalSequence.g:1325:1: rule__Message__Group_2__2__Impl : ( '(' ) ;
    public final void rule__Message__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1329:1: ( ( '(' ) )
            // InternalSequence.g:1330:1: ( '(' )
            {
            // InternalSequence.g:1330:1: ( '(' )
            // InternalSequence.g:1331:2: '('
            {
             before(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__2__Impl"


    // $ANTLR start "rule__Message__Group_2__3"
    // InternalSequence.g:1340:1: rule__Message__Group_2__3 : rule__Message__Group_2__3__Impl rule__Message__Group_2__4 ;
    public final void rule__Message__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1344:1: ( rule__Message__Group_2__3__Impl rule__Message__Group_2__4 )
            // InternalSequence.g:1345:2: rule__Message__Group_2__3__Impl rule__Message__Group_2__4
            {
            pushFollow(FOLLOW_18);
            rule__Message__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__3"


    // $ANTLR start "rule__Message__Group_2__3__Impl"
    // InternalSequence.g:1352:1: rule__Message__Group_2__3__Impl : ( ( rule__Message__LeftAssignment_2_3 ) ) ;
    public final void rule__Message__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1356:1: ( ( ( rule__Message__LeftAssignment_2_3 ) ) )
            // InternalSequence.g:1357:1: ( ( rule__Message__LeftAssignment_2_3 ) )
            {
            // InternalSequence.g:1357:1: ( ( rule__Message__LeftAssignment_2_3 ) )
            // InternalSequence.g:1358:2: ( rule__Message__LeftAssignment_2_3 )
            {
             before(grammarAccess.getMessageAccess().getLeftAssignment_2_3()); 
            // InternalSequence.g:1359:2: ( rule__Message__LeftAssignment_2_3 )
            // InternalSequence.g:1359:3: rule__Message__LeftAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Message__LeftAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getLeftAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__3__Impl"


    // $ANTLR start "rule__Message__Group_2__4"
    // InternalSequence.g:1367:1: rule__Message__Group_2__4 : rule__Message__Group_2__4__Impl rule__Message__Group_2__5 ;
    public final void rule__Message__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1371:1: ( rule__Message__Group_2__4__Impl rule__Message__Group_2__5 )
            // InternalSequence.g:1372:2: rule__Message__Group_2__4__Impl rule__Message__Group_2__5
            {
            pushFollow(FOLLOW_7);
            rule__Message__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__4"


    // $ANTLR start "rule__Message__Group_2__4__Impl"
    // InternalSequence.g:1379:1: rule__Message__Group_2__4__Impl : ( ',' ) ;
    public final void rule__Message__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1383:1: ( ( ',' ) )
            // InternalSequence.g:1384:1: ( ',' )
            {
            // InternalSequence.g:1384:1: ( ',' )
            // InternalSequence.g:1385:2: ','
            {
             before(grammarAccess.getMessageAccess().getCommaKeyword_2_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getCommaKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__4__Impl"


    // $ANTLR start "rule__Message__Group_2__5"
    // InternalSequence.g:1394:1: rule__Message__Group_2__5 : rule__Message__Group_2__5__Impl rule__Message__Group_2__6 ;
    public final void rule__Message__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1398:1: ( rule__Message__Group_2__5__Impl rule__Message__Group_2__6 )
            // InternalSequence.g:1399:2: rule__Message__Group_2__5__Impl rule__Message__Group_2__6
            {
            pushFollow(FOLLOW_19);
            rule__Message__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__5"


    // $ANTLR start "rule__Message__Group_2__5__Impl"
    // InternalSequence.g:1406:1: rule__Message__Group_2__5__Impl : ( ( rule__Message__RightAssignment_2_5 ) ) ;
    public final void rule__Message__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1410:1: ( ( ( rule__Message__RightAssignment_2_5 ) ) )
            // InternalSequence.g:1411:1: ( ( rule__Message__RightAssignment_2_5 ) )
            {
            // InternalSequence.g:1411:1: ( ( rule__Message__RightAssignment_2_5 ) )
            // InternalSequence.g:1412:2: ( rule__Message__RightAssignment_2_5 )
            {
             before(grammarAccess.getMessageAccess().getRightAssignment_2_5()); 
            // InternalSequence.g:1413:2: ( rule__Message__RightAssignment_2_5 )
            // InternalSequence.g:1413:3: rule__Message__RightAssignment_2_5
            {
            pushFollow(FOLLOW_2);
            rule__Message__RightAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getRightAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__5__Impl"


    // $ANTLR start "rule__Message__Group_2__6"
    // InternalSequence.g:1421:1: rule__Message__Group_2__6 : rule__Message__Group_2__6__Impl ;
    public final void rule__Message__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1425:1: ( rule__Message__Group_2__6__Impl )
            // InternalSequence.g:1426:2: rule__Message__Group_2__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_2__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__6"


    // $ANTLR start "rule__Message__Group_2__6__Impl"
    // InternalSequence.g:1432:1: rule__Message__Group_2__6__Impl : ( ')' ) ;
    public final void rule__Message__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1436:1: ( ( ')' ) )
            // InternalSequence.g:1437:1: ( ')' )
            {
            // InternalSequence.g:1437:1: ( ')' )
            // InternalSequence.g:1438:2: ')'
            {
             before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_2_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRightParenthesisKeyword_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_2__6__Impl"


    // $ANTLR start "rule__FoundMessage__Group__0"
    // InternalSequence.g:1448:1: rule__FoundMessage__Group__0 : rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 ;
    public final void rule__FoundMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1452:1: ( rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 )
            // InternalSequence.g:1453:2: rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSequence.g:1460:1: rule__FoundMessage__Group__0__Impl : ( 'found' ) ;
    public final void rule__FoundMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1464:1: ( ( 'found' ) )
            // InternalSequence.g:1465:1: ( 'found' )
            {
            // InternalSequence.g:1465:1: ( 'found' )
            // InternalSequence.g:1466:2: 'found'
            {
             before(grammarAccess.getFoundMessageAccess().getFoundKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSequence.g:1475:1: rule__FoundMessage__Group__1 : rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 ;
    public final void rule__FoundMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1479:1: ( rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 )
            // InternalSequence.g:1480:2: rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2
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
    // InternalSequence.g:1487:1: rule__FoundMessage__Group__1__Impl : ( ( rule__FoundMessage__TypeAssignment_1 ) ) ;
    public final void rule__FoundMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1491:1: ( ( ( rule__FoundMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:1492:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:1492:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            // InternalSequence.g:1493:2: ( rule__FoundMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getFoundMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:1494:2: ( rule__FoundMessage__TypeAssignment_1 )
            // InternalSequence.g:1494:3: rule__FoundMessage__TypeAssignment_1
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
    // InternalSequence.g:1502:1: rule__FoundMessage__Group__2 : rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 ;
    public final void rule__FoundMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1506:1: ( rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 )
            // InternalSequence.g:1507:2: rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSequence.g:1514:1: rule__FoundMessage__Group__2__Impl : ( ( rule__FoundMessage__NameAssignment_2 ) ) ;
    public final void rule__FoundMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1518:1: ( ( ( rule__FoundMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:1519:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:1519:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            // InternalSequence.g:1520:2: ( rule__FoundMessage__NameAssignment_2 )
            {
             before(grammarAccess.getFoundMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:1521:2: ( rule__FoundMessage__NameAssignment_2 )
            // InternalSequence.g:1521:3: rule__FoundMessage__NameAssignment_2
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
    // InternalSequence.g:1529:1: rule__FoundMessage__Group__3 : rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 ;
    public final void rule__FoundMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1533:1: ( rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 )
            // InternalSequence.g:1534:2: rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSequence.g:1541:1: rule__FoundMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__FoundMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1545:1: ( ( '(' ) )
            // InternalSequence.g:1546:1: ( '(' )
            {
            // InternalSequence.g:1546:1: ( '(' )
            // InternalSequence.g:1547:2: '('
            {
             before(grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSequence.g:1556:1: rule__FoundMessage__Group__4 : rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 ;
    public final void rule__FoundMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1560:1: ( rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 )
            // InternalSequence.g:1561:2: rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalSequence.g:1568:1: rule__FoundMessage__Group__4__Impl : ( '_' ) ;
    public final void rule__FoundMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1572:1: ( ( '_' ) )
            // InternalSequence.g:1573:1: ( '_' )
            {
            // InternalSequence.g:1573:1: ( '_' )
            // InternalSequence.g:1574:2: '_'
            {
             before(grammarAccess.getFoundMessageAccess().get_Keyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSequence.g:1583:1: rule__FoundMessage__Group__5 : rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 ;
    public final void rule__FoundMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1587:1: ( rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 )
            // InternalSequence.g:1588:2: rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6
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
    // InternalSequence.g:1595:1: rule__FoundMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__FoundMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1599:1: ( ( ',' ) )
            // InternalSequence.g:1600:1: ( ',' )
            {
            // InternalSequence.g:1600:1: ( ',' )
            // InternalSequence.g:1601:2: ','
            {
             before(grammarAccess.getFoundMessageAccess().getCommaKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSequence.g:1610:1: rule__FoundMessage__Group__6 : rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 ;
    public final void rule__FoundMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1614:1: ( rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 )
            // InternalSequence.g:1615:2: rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalSequence.g:1622:1: rule__FoundMessage__Group__6__Impl : ( ( rule__FoundMessage__RightAssignment_6 ) ) ;
    public final void rule__FoundMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1626:1: ( ( ( rule__FoundMessage__RightAssignment_6 ) ) )
            // InternalSequence.g:1627:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            {
            // InternalSequence.g:1627:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            // InternalSequence.g:1628:2: ( rule__FoundMessage__RightAssignment_6 )
            {
             before(grammarAccess.getFoundMessageAccess().getRightAssignment_6()); 
            // InternalSequence.g:1629:2: ( rule__FoundMessage__RightAssignment_6 )
            // InternalSequence.g:1629:3: rule__FoundMessage__RightAssignment_6
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
    // InternalSequence.g:1637:1: rule__FoundMessage__Group__7 : rule__FoundMessage__Group__7__Impl ;
    public final void rule__FoundMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1641:1: ( rule__FoundMessage__Group__7__Impl )
            // InternalSequence.g:1642:2: rule__FoundMessage__Group__7__Impl
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
    // InternalSequence.g:1648:1: rule__FoundMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__FoundMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1652:1: ( ( ')' ) )
            // InternalSequence.g:1653:1: ( ')' )
            {
            // InternalSequence.g:1653:1: ( ')' )
            // InternalSequence.g:1654:2: ')'
            {
             before(grammarAccess.getFoundMessageAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSequence.g:1664:1: rule__LostMessage__Group__0 : rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 ;
    public final void rule__LostMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1668:1: ( rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 )
            // InternalSequence.g:1669:2: rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSequence.g:1676:1: rule__LostMessage__Group__0__Impl : ( 'lost' ) ;
    public final void rule__LostMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1680:1: ( ( 'lost' ) )
            // InternalSequence.g:1681:1: ( 'lost' )
            {
            // InternalSequence.g:1681:1: ( 'lost' )
            // InternalSequence.g:1682:2: 'lost'
            {
             before(grammarAccess.getLostMessageAccess().getLostKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSequence.g:1691:1: rule__LostMessage__Group__1 : rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 ;
    public final void rule__LostMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1695:1: ( rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 )
            // InternalSequence.g:1696:2: rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2
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
    // InternalSequence.g:1703:1: rule__LostMessage__Group__1__Impl : ( ( rule__LostMessage__TypeAssignment_1 ) ) ;
    public final void rule__LostMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1707:1: ( ( ( rule__LostMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:1708:1: ( ( rule__LostMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:1708:1: ( ( rule__LostMessage__TypeAssignment_1 ) )
            // InternalSequence.g:1709:2: ( rule__LostMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getLostMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:1710:2: ( rule__LostMessage__TypeAssignment_1 )
            // InternalSequence.g:1710:3: rule__LostMessage__TypeAssignment_1
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
    // InternalSequence.g:1718:1: rule__LostMessage__Group__2 : rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 ;
    public final void rule__LostMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1722:1: ( rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 )
            // InternalSequence.g:1723:2: rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSequence.g:1730:1: rule__LostMessage__Group__2__Impl : ( ( rule__LostMessage__NameAssignment_2 ) ) ;
    public final void rule__LostMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1734:1: ( ( ( rule__LostMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:1735:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:1735:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            // InternalSequence.g:1736:2: ( rule__LostMessage__NameAssignment_2 )
            {
             before(grammarAccess.getLostMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:1737:2: ( rule__LostMessage__NameAssignment_2 )
            // InternalSequence.g:1737:3: rule__LostMessage__NameAssignment_2
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
    // InternalSequence.g:1745:1: rule__LostMessage__Group__3 : rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 ;
    public final void rule__LostMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1749:1: ( rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 )
            // InternalSequence.g:1750:2: rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4
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
    // InternalSequence.g:1757:1: rule__LostMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__LostMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1761:1: ( ( '(' ) )
            // InternalSequence.g:1762:1: ( '(' )
            {
            // InternalSequence.g:1762:1: ( '(' )
            // InternalSequence.g:1763:2: '('
            {
             before(grammarAccess.getLostMessageAccess().getLeftParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSequence.g:1772:1: rule__LostMessage__Group__4 : rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 ;
    public final void rule__LostMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1776:1: ( rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 )
            // InternalSequence.g:1777:2: rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalSequence.g:1784:1: rule__LostMessage__Group__4__Impl : ( ( rule__LostMessage__LeftAssignment_4 ) ) ;
    public final void rule__LostMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1788:1: ( ( ( rule__LostMessage__LeftAssignment_4 ) ) )
            // InternalSequence.g:1789:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            {
            // InternalSequence.g:1789:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            // InternalSequence.g:1790:2: ( rule__LostMessage__LeftAssignment_4 )
            {
             before(grammarAccess.getLostMessageAccess().getLeftAssignment_4()); 
            // InternalSequence.g:1791:2: ( rule__LostMessage__LeftAssignment_4 )
            // InternalSequence.g:1791:3: rule__LostMessage__LeftAssignment_4
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
    // InternalSequence.g:1799:1: rule__LostMessage__Group__5 : rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 ;
    public final void rule__LostMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1803:1: ( rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 )
            // InternalSequence.g:1804:2: rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalSequence.g:1811:1: rule__LostMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__LostMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1815:1: ( ( ',' ) )
            // InternalSequence.g:1816:1: ( ',' )
            {
            // InternalSequence.g:1816:1: ( ',' )
            // InternalSequence.g:1817:2: ','
            {
             before(grammarAccess.getLostMessageAccess().getCommaKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSequence.g:1826:1: rule__LostMessage__Group__6 : rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 ;
    public final void rule__LostMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1830:1: ( rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 )
            // InternalSequence.g:1831:2: rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalSequence.g:1838:1: rule__LostMessage__Group__6__Impl : ( '_' ) ;
    public final void rule__LostMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1842:1: ( ( '_' ) )
            // InternalSequence.g:1843:1: ( '_' )
            {
            // InternalSequence.g:1843:1: ( '_' )
            // InternalSequence.g:1844:2: '_'
            {
             before(grammarAccess.getLostMessageAccess().get_Keyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSequence.g:1853:1: rule__LostMessage__Group__7 : rule__LostMessage__Group__7__Impl ;
    public final void rule__LostMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1857:1: ( rule__LostMessage__Group__7__Impl )
            // InternalSequence.g:1858:2: rule__LostMessage__Group__7__Impl
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
    // InternalSequence.g:1864:1: rule__LostMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__LostMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1868:1: ( ( ')' ) )
            // InternalSequence.g:1869:1: ( ')' )
            {
            // InternalSequence.g:1869:1: ( ')' )
            // InternalSequence.g:1870:2: ')'
            {
             before(grammarAccess.getLostMessageAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__DestructionOccurenceSpecification__Group__0"
    // InternalSequence.g:1880:1: rule__DestructionOccurenceSpecification__Group__0 : rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 ;
    public final void rule__DestructionOccurenceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1884:1: ( rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 )
            // InternalSequence.g:1885:2: rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1
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
    // InternalSequence.g:1892:1: rule__DestructionOccurenceSpecification__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionOccurenceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1896:1: ( ( 'dest' ) )
            // InternalSequence.g:1897:1: ( 'dest' )
            {
            // InternalSequence.g:1897:1: ( 'dest' )
            // InternalSequence.g:1898:2: 'dest'
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getDestKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSequence.g:1907:1: rule__DestructionOccurenceSpecification__Group__1 : rule__DestructionOccurenceSpecification__Group__1__Impl ;
    public final void rule__DestructionOccurenceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1911:1: ( rule__DestructionOccurenceSpecification__Group__1__Impl )
            // InternalSequence.g:1912:2: rule__DestructionOccurenceSpecification__Group__1__Impl
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
    // InternalSequence.g:1918:1: rule__DestructionOccurenceSpecification__Group__1__Impl : ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) ) ;
    public final void rule__DestructionOccurenceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1922:1: ( ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) ) )
            // InternalSequence.g:1923:1: ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) )
            {
            // InternalSequence.g:1923:1: ( ( rule__DestructionOccurenceSpecification__NameAssignment_1 ) )
            // InternalSequence.g:1924:2: ( rule__DestructionOccurenceSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getNameAssignment_1()); 
            // InternalSequence.g:1925:2: ( rule__DestructionOccurenceSpecification__NameAssignment_1 )
            // InternalSequence.g:1925:3: rule__DestructionOccurenceSpecification__NameAssignment_1
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


    // $ANTLR start "rule__FQN__Group__0"
    // InternalSequence.g:1934:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1938:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSequence.g:1939:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSequence.g:1946:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1950:1: ( ( RULE_ID ) )
            // InternalSequence.g:1951:1: ( RULE_ID )
            {
            // InternalSequence.g:1951:1: ( RULE_ID )
            // InternalSequence.g:1952:2: RULE_ID
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
    // InternalSequence.g:1961:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1965:1: ( rule__FQN__Group__1__Impl )
            // InternalSequence.g:1966:2: rule__FQN__Group__1__Impl
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
    // InternalSequence.g:1972:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1976:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSequence.g:1977:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSequence.g:1977:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSequence.g:1978:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSequence.g:1979:2: ( rule__FQN__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSequence.g:1979:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalSequence.g:1988:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1992:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSequence.g:1993:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalSequence.g:2000:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2004:1: ( ( '.' ) )
            // InternalSequence.g:2005:1: ( '.' )
            {
            // InternalSequence.g:2005:1: ( '.' )
            // InternalSequence.g:2006:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSequence.g:2015:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2019:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSequence.g:2020:2: rule__FQN__Group_1__1__Impl
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
    // InternalSequence.g:2026:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2030:1: ( ( RULE_ID ) )
            // InternalSequence.g:2031:1: ( RULE_ID )
            {
            // InternalSequence.g:2031:1: ( RULE_ID )
            // InternalSequence.g:2032:2: RULE_ID
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


    // $ANTLR start "rule__SequenceDiagram__TitleAssignment_2"
    // InternalSequence.g:2042:1: rule__SequenceDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SequenceDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2046:1: ( ( RULE_STRING ) )
            // InternalSequence.g:2047:2: ( RULE_STRING )
            {
            // InternalSequence.g:2047:2: ( RULE_STRING )
            // InternalSequence.g:2048:3: RULE_STRING
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
    // InternalSequence.g:2057:1: rule__SequenceDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__SequenceDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2061:1: ( ( ruleRootPackage ) )
            // InternalSequence.g:2062:2: ( ruleRootPackage )
            {
            // InternalSequence.g:2062:2: ( ruleRootPackage )
            // InternalSequence.g:2063:3: ruleRootPackage
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
    // InternalSequence.g:2072:1: rule__RootPackage__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2076:1: ( ( ruleFQN ) )
            // InternalSequence.g:2077:2: ( ruleFQN )
            {
            // InternalSequence.g:2077:2: ( ruleFQN )
            // InternalSequence.g:2078:3: ruleFQN
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
    // InternalSequence.g:2087:1: rule__RootPackage__ActorsAssignment_2 : ( ruleActor ) ;
    public final void rule__RootPackage__ActorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2091:1: ( ( ruleActor ) )
            // InternalSequence.g:2092:2: ( ruleActor )
            {
            // InternalSequence.g:2092:2: ( ruleActor )
            // InternalSequence.g:2093:3: ruleActor
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
    // InternalSequence.g:2102:1: rule__RootPackage__InteractionFragmentsAssignment_3 : ( ruleInteractionFragment ) ;
    public final void rule__RootPackage__InteractionFragmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2106:1: ( ( ruleInteractionFragment ) )
            // InternalSequence.g:2107:2: ( ruleInteractionFragment )
            {
            // InternalSequence.g:2107:2: ( ruleInteractionFragment )
            // InternalSequence.g:2108:3: ruleInteractionFragment
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


    // $ANTLR start "rule__RootPackage__ClsAssignment_4"
    // InternalSequence.g:2117:1: rule__RootPackage__ClsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__RootPackage__ClsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2121:1: ( ( ( RULE_ID ) ) )
            // InternalSequence.g:2122:2: ( ( RULE_ID ) )
            {
            // InternalSequence.g:2122:2: ( ( RULE_ID ) )
            // InternalSequence.g:2123:3: ( RULE_ID )
            {
             before(grammarAccess.getRootPackageAccess().getClsClassifierCrossReference_4_0()); 
            // InternalSequence.g:2124:3: ( RULE_ID )
            // InternalSequence.g:2125:4: RULE_ID
            {
             before(grammarAccess.getRootPackageAccess().getClsClassifierIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRootPackageAccess().getClsClassifierIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRootPackageAccess().getClsClassifierCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__ClsAssignment_4"


    // $ANTLR start "rule__Actor__NameAssignment_0_1_0"
    // InternalSequence.g:2136:1: rule__Actor__NameAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2140:1: ( ( RULE_ID ) )
            // InternalSequence.g:2141:2: ( RULE_ID )
            {
            // InternalSequence.g:2141:2: ( RULE_ID )
            // InternalSequence.g:2142:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_0_1_0"


    // $ANTLR start "rule__Actor__TypeAssignment_0_1_2"
    // InternalSequence.g:2151:1: rule__Actor__TypeAssignment_0_1_2 : ( ( ruleFQN ) ) ;
    public final void rule__Actor__TypeAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2155:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:2156:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:2156:2: ( ( ruleFQN ) )
            // InternalSequence.g:2157:3: ( ruleFQN )
            {
             before(grammarAccess.getActorAccess().getTypeClassifierCrossReference_0_1_2_0()); 
            // InternalSequence.g:2158:3: ( ruleFQN )
            // InternalSequence.g:2159:4: ruleFQN
            {
             before(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_0_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_0_1_2_0_1()); 

            }

             after(grammarAccess.getActorAccess().getTypeClassifierCrossReference_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeAssignment_0_1_2"


    // $ANTLR start "rule__Actor__NameAssignment_1_0"
    // InternalSequence.g:2170:1: rule__Actor__NameAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2174:1: ( ( RULE_STRING ) )
            // InternalSequence.g:2175:2: ( RULE_STRING )
            {
            // InternalSequence.g:2175:2: ( RULE_STRING )
            // InternalSequence.g:2176:3: RULE_STRING
            {
             before(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_1_0"


    // $ANTLR start "rule__Actor__TypeAssignment_1_2"
    // InternalSequence.g:2185:1: rule__Actor__TypeAssignment_1_2 : ( ( ruleFQN ) ) ;
    public final void rule__Actor__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2189:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:2190:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:2190:2: ( ( ruleFQN ) )
            // InternalSequence.g:2191:3: ( ruleFQN )
            {
             before(grammarAccess.getActorAccess().getTypeClassifierCrossReference_1_2_0()); 
            // InternalSequence.g:2192:3: ( ruleFQN )
            // InternalSequence.g:2193:4: ruleFQN
            {
             before(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getActorAccess().getTypeClassifierCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeAssignment_1_2"


    // $ANTLR start "rule__Actor__AliasAssignment_1_4"
    // InternalSequence.g:2204:1: rule__Actor__AliasAssignment_1_4 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2208:1: ( ( RULE_ID ) )
            // InternalSequence.g:2209:2: ( RULE_ID )
            {
            // InternalSequence.g:2209:2: ( RULE_ID )
            // InternalSequence.g:2210:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_1_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__AliasAssignment_1_4"


    // $ANTLR start "rule__Actor__TypeAssignment_2_0_1"
    // InternalSequence.g:2219:1: rule__Actor__TypeAssignment_2_0_1 : ( ( ruleFQN ) ) ;
    public final void rule__Actor__TypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2223:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:2224:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:2224:2: ( ( ruleFQN ) )
            // InternalSequence.g:2225:3: ( ruleFQN )
            {
             before(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_0_1_0()); 
            // InternalSequence.g:2226:3: ( ruleFQN )
            // InternalSequence.g:2227:4: ruleFQN
            {
             before(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActorAccess().getTypeClassifierFQNParserRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeAssignment_2_0_1"


    // $ANTLR start "rule__Actor__AliasAssignment_2_0_3"
    // InternalSequence.g:2238:1: rule__Actor__AliasAssignment_2_0_3 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2242:1: ( ( RULE_ID ) )
            // InternalSequence.g:2243:2: ( RULE_ID )
            {
            // InternalSequence.g:2243:2: ( RULE_ID )
            // InternalSequence.g:2244:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_0_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__AliasAssignment_2_0_3"


    // $ANTLR start "rule__Actor__ActorTypeAssignment_2_1_1"
    // InternalSequence.g:2253:1: rule__Actor__ActorTypeAssignment_2_1_1 : ( ruleActorType ) ;
    public final void rule__Actor__ActorTypeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2257:1: ( ( ruleActorType ) )
            // InternalSequence.g:2258:2: ( ruleActorType )
            {
            // InternalSequence.g:2258:2: ( ruleActorType )
            // InternalSequence.g:2259:3: ruleActorType
            {
             before(grammarAccess.getActorAccess().getActorTypeActorTypeEnumRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActorType();

            state._fsp--;

             after(grammarAccess.getActorAccess().getActorTypeActorTypeEnumRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__ActorTypeAssignment_2_1_1"


    // $ANTLR start "rule__Message__TypeAssignment_2_0"
    // InternalSequence.g:2268:1: rule__Message__TypeAssignment_2_0 : ( ruleMessageType ) ;
    public final void rule__Message__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2272:1: ( ( ruleMessageType ) )
            // InternalSequence.g:2273:2: ( ruleMessageType )
            {
            // InternalSequence.g:2273:2: ( ruleMessageType )
            // InternalSequence.g:2274:3: ruleMessageType
            {
             before(grammarAccess.getMessageAccess().getTypeMessageTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getTypeMessageTypeEnumRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__TypeAssignment_2_0"


    // $ANTLR start "rule__Message__NameAssignment_2_1"
    // InternalSequence.g:2283:1: rule__Message__NameAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Message__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2287:1: ( ( RULE_STRING ) )
            // InternalSequence.g:2288:2: ( RULE_STRING )
            {
            // InternalSequence.g:2288:2: ( RULE_STRING )
            // InternalSequence.g:2289:3: RULE_STRING
            {
             before(grammarAccess.getMessageAccess().getNameSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getNameSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__NameAssignment_2_1"


    // $ANTLR start "rule__Message__LeftAssignment_2_3"
    // InternalSequence.g:2298:1: rule__Message__LeftAssignment_2_3 : ( ( ruleFQN ) ) ;
    public final void rule__Message__LeftAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2302:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:2303:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:2303:2: ( ( ruleFQN ) )
            // InternalSequence.g:2304:3: ( ruleFQN )
            {
             before(grammarAccess.getMessageAccess().getLeftActorCrossReference_2_3_0()); 
            // InternalSequence.g:2305:3: ( ruleFQN )
            // InternalSequence.g:2306:4: ruleFQN
            {
             before(grammarAccess.getMessageAccess().getLeftActorFQNParserRuleCall_2_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getLeftActorFQNParserRuleCall_2_3_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getLeftActorCrossReference_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__LeftAssignment_2_3"


    // $ANTLR start "rule__Message__RightAssignment_2_5"
    // InternalSequence.g:2317:1: rule__Message__RightAssignment_2_5 : ( ( ruleFQN ) ) ;
    public final void rule__Message__RightAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2321:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:2322:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:2322:2: ( ( ruleFQN ) )
            // InternalSequence.g:2323:3: ( ruleFQN )
            {
             before(grammarAccess.getMessageAccess().getRightActorCrossReference_2_5_0()); 
            // InternalSequence.g:2324:3: ( ruleFQN )
            // InternalSequence.g:2325:4: ruleFQN
            {
             before(grammarAccess.getMessageAccess().getRightActorFQNParserRuleCall_2_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getRightActorFQNParserRuleCall_2_5_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getRightActorCrossReference_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__RightAssignment_2_5"


    // $ANTLR start "rule__FoundMessage__TypeAssignment_1"
    // InternalSequence.g:2336:1: rule__FoundMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__FoundMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2340:1: ( ( ruleMessageType ) )
            // InternalSequence.g:2341:2: ( ruleMessageType )
            {
            // InternalSequence.g:2341:2: ( ruleMessageType )
            // InternalSequence.g:2342:3: ruleMessageType
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
    // InternalSequence.g:2351:1: rule__FoundMessage__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FoundMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2355:1: ( ( RULE_STRING ) )
            // InternalSequence.g:2356:2: ( RULE_STRING )
            {
            // InternalSequence.g:2356:2: ( RULE_STRING )
            // InternalSequence.g:2357:3: RULE_STRING
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
    // InternalSequence.g:2366:1: rule__FoundMessage__RightAssignment_6 : ( ( ruleFQN ) ) ;
    public final void rule__FoundMessage__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2370:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:2371:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:2371:2: ( ( ruleFQN ) )
            // InternalSequence.g:2372:3: ( ruleFQN )
            {
             before(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0()); 
            // InternalSequence.g:2373:3: ( ruleFQN )
            // InternalSequence.g:2374:4: ruleFQN
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
    // InternalSequence.g:2385:1: rule__LostMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__LostMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2389:1: ( ( ruleMessageType ) )
            // InternalSequence.g:2390:2: ( ruleMessageType )
            {
            // InternalSequence.g:2390:2: ( ruleMessageType )
            // InternalSequence.g:2391:3: ruleMessageType
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
    // InternalSequence.g:2400:1: rule__LostMessage__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LostMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2404:1: ( ( RULE_STRING ) )
            // InternalSequence.g:2405:2: ( RULE_STRING )
            {
            // InternalSequence.g:2405:2: ( RULE_STRING )
            // InternalSequence.g:2406:3: RULE_STRING
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
    // InternalSequence.g:2415:1: rule__LostMessage__LeftAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__LostMessage__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2419:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:2420:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:2420:2: ( ( ruleFQN ) )
            // InternalSequence.g:2421:3: ( ruleFQN )
            {
             before(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0()); 
            // InternalSequence.g:2422:3: ( ruleFQN )
            // InternalSequence.g:2423:4: ruleFQN
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


    // $ANTLR start "rule__DestructionOccurenceSpecification__NameAssignment_1"
    // InternalSequence.g:2434:1: rule__DestructionOccurenceSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DestructionOccurenceSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2438:1: ( ( RULE_ID ) )
            // InternalSequence.g:2439:2: ( RULE_ID )
            {
            // InternalSequence.g:2439:2: ( RULE_ID )
            // InternalSequence.g:2440:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000340C1830L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000034001802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000014001800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});

}