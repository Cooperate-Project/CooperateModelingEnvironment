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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_'", "'sync'", "'async'", "'human'", "'machine'", "'@start-seqd'", "'@end-seqd'", "'rootElement'", "'act'", "'as'", "'role['", "']'", "':'", "'{'", "'}'", "'['", "'arrives'", "'arrival'", "'('", "','", "')'", "'reply'", "'found'", "'lost'", "'create'", "'dest'", "'par'", "'alt'", "'loop'", "'opt'", "'critical'", "'ref'", "'cstr'", "'t'", "'d'", "'obs'", "'.'", "'note'", "'def'"
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
    public static final int T__49=49;
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


    // $ANTLR start "entryRuleFragment"
    // InternalSequence.g:153:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalSequence.g:154:1: ( ruleFragment EOF )
            // InternalSequence.g:155:1: ruleFragment EOF
            {
             before(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getFragmentRule()); 
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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalSequence.g:162:1: ruleFragment : ( ( rule__Fragment__Alternatives ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:166:2: ( ( ( rule__Fragment__Alternatives ) ) )
            // InternalSequence.g:167:2: ( ( rule__Fragment__Alternatives ) )
            {
            // InternalSequence.g:167:2: ( ( rule__Fragment__Alternatives ) )
            // InternalSequence.g:168:3: ( rule__Fragment__Alternatives )
            {
             before(grammarAccess.getFragmentAccess().getAlternatives()); 
            // InternalSequence.g:169:3: ( rule__Fragment__Alternatives )
            // InternalSequence.g:169:4: rule__Fragment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleOneFragment"
    // InternalSequence.g:178:1: entryRuleOneFragment : ruleOneFragment EOF ;
    public final void entryRuleOneFragment() throws RecognitionException {
        try {
            // InternalSequence.g:179:1: ( ruleOneFragment EOF )
            // InternalSequence.g:180:1: ruleOneFragment EOF
            {
             before(grammarAccess.getOneFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleOneFragment();

            state._fsp--;

             after(grammarAccess.getOneFragmentRule()); 
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
    // $ANTLR end "entryRuleOneFragment"


    // $ANTLR start "ruleOneFragment"
    // InternalSequence.g:187:1: ruleOneFragment : ( ( rule__OneFragment__FragmentsAssignment ) ) ;
    public final void ruleOneFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:191:2: ( ( ( rule__OneFragment__FragmentsAssignment ) ) )
            // InternalSequence.g:192:2: ( ( rule__OneFragment__FragmentsAssignment ) )
            {
            // InternalSequence.g:192:2: ( ( rule__OneFragment__FragmentsAssignment ) )
            // InternalSequence.g:193:3: ( rule__OneFragment__FragmentsAssignment )
            {
             before(grammarAccess.getOneFragmentAccess().getFragmentsAssignment()); 
            // InternalSequence.g:194:3: ( rule__OneFragment__FragmentsAssignment )
            // InternalSequence.g:194:4: rule__OneFragment__FragmentsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OneFragment__FragmentsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOneFragmentAccess().getFragmentsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneFragment"


    // $ANTLR start "entryRuleOneOrMultipleFragments"
    // InternalSequence.g:203:1: entryRuleOneOrMultipleFragments : ruleOneOrMultipleFragments EOF ;
    public final void entryRuleOneOrMultipleFragments() throws RecognitionException {
        try {
            // InternalSequence.g:204:1: ( ruleOneOrMultipleFragments EOF )
            // InternalSequence.g:205:1: ruleOneOrMultipleFragments EOF
            {
             before(grammarAccess.getOneOrMultipleFragmentsRule()); 
            pushFollow(FOLLOW_1);
            ruleOneOrMultipleFragments();

            state._fsp--;

             after(grammarAccess.getOneOrMultipleFragmentsRule()); 
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
    // $ANTLR end "entryRuleOneOrMultipleFragments"


    // $ANTLR start "ruleOneOrMultipleFragments"
    // InternalSequence.g:212:1: ruleOneOrMultipleFragments : ( ( ( rule__OneOrMultipleFragments__FragmentsAssignment ) ) ( ( rule__OneOrMultipleFragments__FragmentsAssignment )* ) ) ;
    public final void ruleOneOrMultipleFragments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:216:2: ( ( ( ( rule__OneOrMultipleFragments__FragmentsAssignment ) ) ( ( rule__OneOrMultipleFragments__FragmentsAssignment )* ) ) )
            // InternalSequence.g:217:2: ( ( ( rule__OneOrMultipleFragments__FragmentsAssignment ) ) ( ( rule__OneOrMultipleFragments__FragmentsAssignment )* ) )
            {
            // InternalSequence.g:217:2: ( ( ( rule__OneOrMultipleFragments__FragmentsAssignment ) ) ( ( rule__OneOrMultipleFragments__FragmentsAssignment )* ) )
            // InternalSequence.g:218:3: ( ( rule__OneOrMultipleFragments__FragmentsAssignment ) ) ( ( rule__OneOrMultipleFragments__FragmentsAssignment )* )
            {
            // InternalSequence.g:218:3: ( ( rule__OneOrMultipleFragments__FragmentsAssignment ) )
            // InternalSequence.g:219:4: ( rule__OneOrMultipleFragments__FragmentsAssignment )
            {
             before(grammarAccess.getOneOrMultipleFragmentsAccess().getFragmentsAssignment()); 
            // InternalSequence.g:220:4: ( rule__OneOrMultipleFragments__FragmentsAssignment )
            // InternalSequence.g:220:5: rule__OneOrMultipleFragments__FragmentsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__OneOrMultipleFragments__FragmentsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOneOrMultipleFragmentsAccess().getFragmentsAssignment()); 

            }

            // InternalSequence.g:223:3: ( ( rule__OneOrMultipleFragments__FragmentsAssignment )* )
            // InternalSequence.g:224:4: ( rule__OneOrMultipleFragments__FragmentsAssignment )*
            {
             before(grammarAccess.getOneOrMultipleFragmentsAccess().getFragmentsAssignment()); 
            // InternalSequence.g:225:4: ( rule__OneOrMultipleFragments__FragmentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==28||(LA1_0>=32 && LA1_0<=42)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSequence.g:225:5: rule__OneOrMultipleFragments__FragmentsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__OneOrMultipleFragments__FragmentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getOneOrMultipleFragmentsAccess().getFragmentsAssignment()); 

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
    // $ANTLR end "ruleOneOrMultipleFragments"


    // $ANTLR start "entryRuleOrderedFragmentContainer"
    // InternalSequence.g:235:1: entryRuleOrderedFragmentContainer : ruleOrderedFragmentContainer EOF ;
    public final void entryRuleOrderedFragmentContainer() throws RecognitionException {
        try {
            // InternalSequence.g:236:1: ( ruleOrderedFragmentContainer EOF )
            // InternalSequence.g:237:1: ruleOrderedFragmentContainer EOF
            {
             before(grammarAccess.getOrderedFragmentContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderedFragmentContainer();

            state._fsp--;

             after(grammarAccess.getOrderedFragmentContainerRule()); 
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
    // $ANTLR end "entryRuleOrderedFragmentContainer"


    // $ANTLR start "ruleOrderedFragmentContainer"
    // InternalSequence.g:244:1: ruleOrderedFragmentContainer : ( ( rule__OrderedFragmentContainer__Alternatives ) ) ;
    public final void ruleOrderedFragmentContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:248:2: ( ( ( rule__OrderedFragmentContainer__Alternatives ) ) )
            // InternalSequence.g:249:2: ( ( rule__OrderedFragmentContainer__Alternatives ) )
            {
            // InternalSequence.g:249:2: ( ( rule__OrderedFragmentContainer__Alternatives ) )
            // InternalSequence.g:250:3: ( rule__OrderedFragmentContainer__Alternatives )
            {
             before(grammarAccess.getOrderedFragmentContainerAccess().getAlternatives()); 
            // InternalSequence.g:251:3: ( rule__OrderedFragmentContainer__Alternatives )
            // InternalSequence.g:251:4: rule__OrderedFragmentContainer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderedFragmentContainerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderedFragmentContainer"


    // $ANTLR start "entryRuleCondition"
    // InternalSequence.g:260:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalSequence.g:261:1: ( ruleCondition EOF )
            // InternalSequence.g:262:1: ruleCondition EOF
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
    // InternalSequence.g:269:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:273:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalSequence.g:274:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalSequence.g:274:2: ( ( rule__Condition__Group__0 ) )
            // InternalSequence.g:275:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalSequence.g:276:3: ( rule__Condition__Group__0 )
            // InternalSequence.g:276:4: rule__Condition__Group__0
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


    // $ANTLR start "entryRuleOrderedFragmentContainerWithCondition"
    // InternalSequence.g:285:1: entryRuleOrderedFragmentContainerWithCondition : ruleOrderedFragmentContainerWithCondition EOF ;
    public final void entryRuleOrderedFragmentContainerWithCondition() throws RecognitionException {
        try {
            // InternalSequence.g:286:1: ( ruleOrderedFragmentContainerWithCondition EOF )
            // InternalSequence.g:287:1: ruleOrderedFragmentContainerWithCondition EOF
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderedFragmentContainerWithCondition();

            state._fsp--;

             after(grammarAccess.getOrderedFragmentContainerWithConditionRule()); 
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
    // $ANTLR end "entryRuleOrderedFragmentContainerWithCondition"


    // $ANTLR start "ruleOrderedFragmentContainerWithCondition"
    // InternalSequence.g:294:1: ruleOrderedFragmentContainerWithCondition : ( ( rule__OrderedFragmentContainerWithCondition__Group__0 ) ) ;
    public final void ruleOrderedFragmentContainerWithCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:298:2: ( ( ( rule__OrderedFragmentContainerWithCondition__Group__0 ) ) )
            // InternalSequence.g:299:2: ( ( rule__OrderedFragmentContainerWithCondition__Group__0 ) )
            {
            // InternalSequence.g:299:2: ( ( rule__OrderedFragmentContainerWithCondition__Group__0 ) )
            // InternalSequence.g:300:3: ( rule__OrderedFragmentContainerWithCondition__Group__0 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getGroup()); 
            // InternalSequence.g:301:3: ( rule__OrderedFragmentContainerWithCondition__Group__0 )
            // InternalSequence.g:301:4: rule__OrderedFragmentContainerWithCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderedFragmentContainerWithCondition"


    // $ANTLR start "entryRuleOrderedFragmentContainerWithConditionMandatoryBrackets"
    // InternalSequence.g:310:1: entryRuleOrderedFragmentContainerWithConditionMandatoryBrackets : ruleOrderedFragmentContainerWithConditionMandatoryBrackets EOF ;
    public final void entryRuleOrderedFragmentContainerWithConditionMandatoryBrackets() throws RecognitionException {
        try {
            // InternalSequence.g:311:1: ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets EOF )
            // InternalSequence.g:312:1: ruleOrderedFragmentContainerWithConditionMandatoryBrackets EOF
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderedFragmentContainerWithConditionMandatoryBrackets();

            state._fsp--;

             after(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsRule()); 
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
    // $ANTLR end "entryRuleOrderedFragmentContainerWithConditionMandatoryBrackets"


    // $ANTLR start "ruleOrderedFragmentContainerWithConditionMandatoryBrackets"
    // InternalSequence.g:319:1: ruleOrderedFragmentContainerWithConditionMandatoryBrackets : ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0 ) ) ;
    public final void ruleOrderedFragmentContainerWithConditionMandatoryBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:323:2: ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0 ) ) )
            // InternalSequence.g:324:2: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0 ) )
            {
            // InternalSequence.g:324:2: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0 ) )
            // InternalSequence.g:325:3: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getGroup()); 
            // InternalSequence.g:326:3: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0 )
            // InternalSequence.g:326:4: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderedFragmentContainerWithConditionMandatoryBrackets"


    // $ANTLR start "entryRuleMessage"
    // InternalSequence.g:335:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalSequence.g:336:1: ( ruleMessage EOF )
            // InternalSequence.g:337:1: ruleMessage EOF
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
    // InternalSequence.g:344:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:348:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalSequence.g:349:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalSequence.g:349:2: ( ( rule__Message__Group__0 ) )
            // InternalSequence.g:350:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalSequence.g:351:3: ( rule__Message__Group__0 )
            // InternalSequence.g:351:4: rule__Message__Group__0
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


    // $ANTLR start "entryRuleExplicitArrivalOccurenceReference"
    // InternalSequence.g:360:1: entryRuleExplicitArrivalOccurenceReference : ruleExplicitArrivalOccurenceReference EOF ;
    public final void entryRuleExplicitArrivalOccurenceReference() throws RecognitionException {
        try {
            // InternalSequence.g:361:1: ( ruleExplicitArrivalOccurenceReference EOF )
            // InternalSequence.g:362:1: ruleExplicitArrivalOccurenceReference EOF
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleExplicitArrivalOccurenceReference();

            state._fsp--;

             after(grammarAccess.getExplicitArrivalOccurenceReferenceRule()); 
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
    // $ANTLR end "entryRuleExplicitArrivalOccurenceReference"


    // $ANTLR start "ruleExplicitArrivalOccurenceReference"
    // InternalSequence.g:369:1: ruleExplicitArrivalOccurenceReference : ( ( rule__ExplicitArrivalOccurenceReference__Group__0 ) ) ;
    public final void ruleExplicitArrivalOccurenceReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:373:2: ( ( ( rule__ExplicitArrivalOccurenceReference__Group__0 ) ) )
            // InternalSequence.g:374:2: ( ( rule__ExplicitArrivalOccurenceReference__Group__0 ) )
            {
            // InternalSequence.g:374:2: ( ( rule__ExplicitArrivalOccurenceReference__Group__0 ) )
            // InternalSequence.g:375:3: ( rule__ExplicitArrivalOccurenceReference__Group__0 )
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getGroup()); 
            // InternalSequence.g:376:3: ( rule__ExplicitArrivalOccurenceReference__Group__0 )
            // InternalSequence.g:376:4: rule__ExplicitArrivalOccurenceReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExplicitArrivalOccurenceReference"


    // $ANTLR start "entryRuleExplicitArrivalOccurenceSpecification"
    // InternalSequence.g:385:1: entryRuleExplicitArrivalOccurenceSpecification : ruleExplicitArrivalOccurenceSpecification EOF ;
    public final void entryRuleExplicitArrivalOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:386:1: ( ruleExplicitArrivalOccurenceSpecification EOF )
            // InternalSequence.g:387:1: ruleExplicitArrivalOccurenceSpecification EOF
            {
             before(grammarAccess.getExplicitArrivalOccurenceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleExplicitArrivalOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getExplicitArrivalOccurenceSpecificationRule()); 
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
    // $ANTLR end "entryRuleExplicitArrivalOccurenceSpecification"


    // $ANTLR start "ruleExplicitArrivalOccurenceSpecification"
    // InternalSequence.g:394:1: ruleExplicitArrivalOccurenceSpecification : ( ( rule__ExplicitArrivalOccurenceSpecification__Group__0 ) ) ;
    public final void ruleExplicitArrivalOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:398:2: ( ( ( rule__ExplicitArrivalOccurenceSpecification__Group__0 ) ) )
            // InternalSequence.g:399:2: ( ( rule__ExplicitArrivalOccurenceSpecification__Group__0 ) )
            {
            // InternalSequence.g:399:2: ( ( rule__ExplicitArrivalOccurenceSpecification__Group__0 ) )
            // InternalSequence.g:400:3: ( rule__ExplicitArrivalOccurenceSpecification__Group__0 )
            {
             before(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getGroup()); 
            // InternalSequence.g:401:3: ( rule__ExplicitArrivalOccurenceSpecification__Group__0 )
            // InternalSequence.g:401:4: rule__ExplicitArrivalOccurenceSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExplicitArrivalOccurenceSpecification"


    // $ANTLR start "entryRuleStandardMessage"
    // InternalSequence.g:410:1: entryRuleStandardMessage : ruleStandardMessage EOF ;
    public final void entryRuleStandardMessage() throws RecognitionException {
        try {
            // InternalSequence.g:411:1: ( ruleStandardMessage EOF )
            // InternalSequence.g:412:1: ruleStandardMessage EOF
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
    // InternalSequence.g:419:1: ruleStandardMessage : ( ( rule__StandardMessage__Group__0 ) ) ;
    public final void ruleStandardMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:423:2: ( ( ( rule__StandardMessage__Group__0 ) ) )
            // InternalSequence.g:424:2: ( ( rule__StandardMessage__Group__0 ) )
            {
            // InternalSequence.g:424:2: ( ( rule__StandardMessage__Group__0 ) )
            // InternalSequence.g:425:3: ( rule__StandardMessage__Group__0 )
            {
             before(grammarAccess.getStandardMessageAccess().getGroup()); 
            // InternalSequence.g:426:3: ( rule__StandardMessage__Group__0 )
            // InternalSequence.g:426:4: rule__StandardMessage__Group__0
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
    // InternalSequence.g:435:1: entryRuleResponseMessage : ruleResponseMessage EOF ;
    public final void entryRuleResponseMessage() throws RecognitionException {
        try {
            // InternalSequence.g:436:1: ( ruleResponseMessage EOF )
            // InternalSequence.g:437:1: ruleResponseMessage EOF
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
    // InternalSequence.g:444:1: ruleResponseMessage : ( ( rule__ResponseMessage__Group__0 ) ) ;
    public final void ruleResponseMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:448:2: ( ( ( rule__ResponseMessage__Group__0 ) ) )
            // InternalSequence.g:449:2: ( ( rule__ResponseMessage__Group__0 ) )
            {
            // InternalSequence.g:449:2: ( ( rule__ResponseMessage__Group__0 ) )
            // InternalSequence.g:450:3: ( rule__ResponseMessage__Group__0 )
            {
             before(grammarAccess.getResponseMessageAccess().getGroup()); 
            // InternalSequence.g:451:3: ( rule__ResponseMessage__Group__0 )
            // InternalSequence.g:451:4: rule__ResponseMessage__Group__0
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
    // InternalSequence.g:460:1: entryRuleFoundMessage : ruleFoundMessage EOF ;
    public final void entryRuleFoundMessage() throws RecognitionException {
        try {
            // InternalSequence.g:461:1: ( ruleFoundMessage EOF )
            // InternalSequence.g:462:1: ruleFoundMessage EOF
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
    // InternalSequence.g:469:1: ruleFoundMessage : ( ( rule__FoundMessage__Group__0 ) ) ;
    public final void ruleFoundMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:473:2: ( ( ( rule__FoundMessage__Group__0 ) ) )
            // InternalSequence.g:474:2: ( ( rule__FoundMessage__Group__0 ) )
            {
            // InternalSequence.g:474:2: ( ( rule__FoundMessage__Group__0 ) )
            // InternalSequence.g:475:3: ( rule__FoundMessage__Group__0 )
            {
             before(grammarAccess.getFoundMessageAccess().getGroup()); 
            // InternalSequence.g:476:3: ( rule__FoundMessage__Group__0 )
            // InternalSequence.g:476:4: rule__FoundMessage__Group__0
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
    // InternalSequence.g:485:1: entryRuleLostMessage : ruleLostMessage EOF ;
    public final void entryRuleLostMessage() throws RecognitionException {
        try {
            // InternalSequence.g:486:1: ( ruleLostMessage EOF )
            // InternalSequence.g:487:1: ruleLostMessage EOF
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
    // InternalSequence.g:494:1: ruleLostMessage : ( ( rule__LostMessage__Group__0 ) ) ;
    public final void ruleLostMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:498:2: ( ( ( rule__LostMessage__Group__0 ) ) )
            // InternalSequence.g:499:2: ( ( rule__LostMessage__Group__0 ) )
            {
            // InternalSequence.g:499:2: ( ( rule__LostMessage__Group__0 ) )
            // InternalSequence.g:500:3: ( rule__LostMessage__Group__0 )
            {
             before(grammarAccess.getLostMessageAccess().getGroup()); 
            // InternalSequence.g:501:3: ( rule__LostMessage__Group__0 )
            // InternalSequence.g:501:4: rule__LostMessage__Group__0
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
    // InternalSequence.g:510:1: entryRuleCreateMessage : ruleCreateMessage EOF ;
    public final void entryRuleCreateMessage() throws RecognitionException {
        try {
            // InternalSequence.g:511:1: ( ruleCreateMessage EOF )
            // InternalSequence.g:512:1: ruleCreateMessage EOF
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
    // InternalSequence.g:519:1: ruleCreateMessage : ( ( rule__CreateMessage__Group__0 ) ) ;
    public final void ruleCreateMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:523:2: ( ( ( rule__CreateMessage__Group__0 ) ) )
            // InternalSequence.g:524:2: ( ( rule__CreateMessage__Group__0 ) )
            {
            // InternalSequence.g:524:2: ( ( rule__CreateMessage__Group__0 ) )
            // InternalSequence.g:525:3: ( rule__CreateMessage__Group__0 )
            {
             before(grammarAccess.getCreateMessageAccess().getGroup()); 
            // InternalSequence.g:526:3: ( rule__CreateMessage__Group__0 )
            // InternalSequence.g:526:4: rule__CreateMessage__Group__0
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
    // InternalSequence.g:535:1: entryRuleDestructionMessage : ruleDestructionMessage EOF ;
    public final void entryRuleDestructionMessage() throws RecognitionException {
        try {
            // InternalSequence.g:536:1: ( ruleDestructionMessage EOF )
            // InternalSequence.g:537:1: ruleDestructionMessage EOF
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
    // InternalSequence.g:544:1: ruleDestructionMessage : ( ( rule__DestructionMessage__Group__0 ) ) ;
    public final void ruleDestructionMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:548:2: ( ( ( rule__DestructionMessage__Group__0 ) ) )
            // InternalSequence.g:549:2: ( ( rule__DestructionMessage__Group__0 ) )
            {
            // InternalSequence.g:549:2: ( ( rule__DestructionMessage__Group__0 ) )
            // InternalSequence.g:550:3: ( rule__DestructionMessage__Group__0 )
            {
             before(grammarAccess.getDestructionMessageAccess().getGroup()); 
            // InternalSequence.g:551:3: ( rule__DestructionMessage__Group__0 )
            // InternalSequence.g:551:4: rule__DestructionMessage__Group__0
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
    // InternalSequence.g:560:1: entryRuleOccurenceSpecification : ruleOccurenceSpecification EOF ;
    public final void entryRuleOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:561:1: ( ruleOccurenceSpecification EOF )
            // InternalSequence.g:562:1: ruleOccurenceSpecification EOF
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
    // InternalSequence.g:569:1: ruleOccurenceSpecification : ( ( rule__OccurenceSpecification__Alternatives ) ) ;
    public final void ruleOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:573:2: ( ( ( rule__OccurenceSpecification__Alternatives ) ) )
            // InternalSequence.g:574:2: ( ( rule__OccurenceSpecification__Alternatives ) )
            {
            // InternalSequence.g:574:2: ( ( rule__OccurenceSpecification__Alternatives ) )
            // InternalSequence.g:575:3: ( rule__OccurenceSpecification__Alternatives )
            {
             before(grammarAccess.getOccurenceSpecificationAccess().getAlternatives()); 
            // InternalSequence.g:576:3: ( rule__OccurenceSpecification__Alternatives )
            // InternalSequence.g:576:4: rule__OccurenceSpecification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OccurenceSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceSpecificationAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalSequence.g:585:1: entryRuleDestructionOccurenceSpecification : ruleDestructionOccurenceSpecification EOF ;
    public final void entryRuleDestructionOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:586:1: ( ruleDestructionOccurenceSpecification EOF )
            // InternalSequence.g:587:1: ruleDestructionOccurenceSpecification EOF
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
    // InternalSequence.g:594:1: ruleDestructionOccurenceSpecification : ( ( rule__DestructionOccurenceSpecification__Group__0 ) ) ;
    public final void ruleDestructionOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:598:2: ( ( ( rule__DestructionOccurenceSpecification__Group__0 ) ) )
            // InternalSequence.g:599:2: ( ( rule__DestructionOccurenceSpecification__Group__0 ) )
            {
            // InternalSequence.g:599:2: ( ( rule__DestructionOccurenceSpecification__Group__0 ) )
            // InternalSequence.g:600:3: ( rule__DestructionOccurenceSpecification__Group__0 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getGroup()); 
            // InternalSequence.g:601:3: ( rule__DestructionOccurenceSpecification__Group__0 )
            // InternalSequence.g:601:4: rule__DestructionOccurenceSpecification__Group__0
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
    // InternalSequence.g:610:1: entryRuleCombinedFragment : ruleCombinedFragment EOF ;
    public final void entryRuleCombinedFragment() throws RecognitionException {
        try {
            // InternalSequence.g:611:1: ( ruleCombinedFragment EOF )
            // InternalSequence.g:612:1: ruleCombinedFragment EOF
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
    // InternalSequence.g:619:1: ruleCombinedFragment : ( ( rule__CombinedFragment__Alternatives ) ) ;
    public final void ruleCombinedFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:623:2: ( ( ( rule__CombinedFragment__Alternatives ) ) )
            // InternalSequence.g:624:2: ( ( rule__CombinedFragment__Alternatives ) )
            {
            // InternalSequence.g:624:2: ( ( rule__CombinedFragment__Alternatives ) )
            // InternalSequence.g:625:3: ( rule__CombinedFragment__Alternatives )
            {
             before(grammarAccess.getCombinedFragmentAccess().getAlternatives()); 
            // InternalSequence.g:626:3: ( rule__CombinedFragment__Alternatives )
            // InternalSequence.g:626:4: rule__CombinedFragment__Alternatives
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


    // $ANTLR start "entryRuleSingleRegionContainer"
    // InternalSequence.g:635:1: entryRuleSingleRegionContainer : ruleSingleRegionContainer EOF ;
    public final void entryRuleSingleRegionContainer() throws RecognitionException {
        try {
            // InternalSequence.g:636:1: ( ruleSingleRegionContainer EOF )
            // InternalSequence.g:637:1: ruleSingleRegionContainer EOF
            {
             before(grammarAccess.getSingleRegionContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleRegionContainer();

            state._fsp--;

             after(grammarAccess.getSingleRegionContainerRule()); 
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
    // $ANTLR end "entryRuleSingleRegionContainer"


    // $ANTLR start "ruleSingleRegionContainer"
    // InternalSequence.g:644:1: ruleSingleRegionContainer : ( ( rule__SingleRegionContainer__Alternatives ) ) ;
    public final void ruleSingleRegionContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:648:2: ( ( ( rule__SingleRegionContainer__Alternatives ) ) )
            // InternalSequence.g:649:2: ( ( rule__SingleRegionContainer__Alternatives ) )
            {
            // InternalSequence.g:649:2: ( ( rule__SingleRegionContainer__Alternatives ) )
            // InternalSequence.g:650:3: ( rule__SingleRegionContainer__Alternatives )
            {
             before(grammarAccess.getSingleRegionContainerAccess().getAlternatives()); 
            // InternalSequence.g:651:3: ( rule__SingleRegionContainer__Alternatives )
            // InternalSequence.g:651:4: rule__SingleRegionContainer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleRegionContainer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingleRegionContainerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleRegionContainer"


    // $ANTLR start "entryRuleMultipleRegionContainer"
    // InternalSequence.g:660:1: entryRuleMultipleRegionContainer : ruleMultipleRegionContainer EOF ;
    public final void entryRuleMultipleRegionContainer() throws RecognitionException {
        try {
            // InternalSequence.g:661:1: ( ruleMultipleRegionContainer EOF )
            // InternalSequence.g:662:1: ruleMultipleRegionContainer EOF
            {
             before(grammarAccess.getMultipleRegionContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleMultipleRegionContainer();

            state._fsp--;

             after(grammarAccess.getMultipleRegionContainerRule()); 
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
    // $ANTLR end "entryRuleMultipleRegionContainer"


    // $ANTLR start "ruleMultipleRegionContainer"
    // InternalSequence.g:669:1: ruleMultipleRegionContainer : ( ( rule__MultipleRegionContainer__Alternatives ) ) ;
    public final void ruleMultipleRegionContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:673:2: ( ( ( rule__MultipleRegionContainer__Alternatives ) ) )
            // InternalSequence.g:674:2: ( ( rule__MultipleRegionContainer__Alternatives ) )
            {
            // InternalSequence.g:674:2: ( ( rule__MultipleRegionContainer__Alternatives ) )
            // InternalSequence.g:675:3: ( rule__MultipleRegionContainer__Alternatives )
            {
             before(grammarAccess.getMultipleRegionContainerAccess().getAlternatives()); 
            // InternalSequence.g:676:3: ( rule__MultipleRegionContainer__Alternatives )
            // InternalSequence.g:676:4: rule__MultipleRegionContainer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultipleRegionContainer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultipleRegionContainerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleRegionContainer"


    // $ANTLR start "entryRuleParallel"
    // InternalSequence.g:685:1: entryRuleParallel : ruleParallel EOF ;
    public final void entryRuleParallel() throws RecognitionException {
        try {
            // InternalSequence.g:686:1: ( ruleParallel EOF )
            // InternalSequence.g:687:1: ruleParallel EOF
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
    // InternalSequence.g:694:1: ruleParallel : ( ( rule__Parallel__Group__0 ) ) ;
    public final void ruleParallel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:698:2: ( ( ( rule__Parallel__Group__0 ) ) )
            // InternalSequence.g:699:2: ( ( rule__Parallel__Group__0 ) )
            {
            // InternalSequence.g:699:2: ( ( rule__Parallel__Group__0 ) )
            // InternalSequence.g:700:3: ( rule__Parallel__Group__0 )
            {
             before(grammarAccess.getParallelAccess().getGroup()); 
            // InternalSequence.g:701:3: ( rule__Parallel__Group__0 )
            // InternalSequence.g:701:4: rule__Parallel__Group__0
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


    // $ANTLR start "entryRuleAlternative"
    // InternalSequence.g:710:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // InternalSequence.g:711:1: ( ruleAlternative EOF )
            // InternalSequence.g:712:1: ruleAlternative EOF
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
    // InternalSequence.g:719:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:723:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // InternalSequence.g:724:2: ( ( rule__Alternative__Group__0 ) )
            {
            // InternalSequence.g:724:2: ( ( rule__Alternative__Group__0 ) )
            // InternalSequence.g:725:3: ( rule__Alternative__Group__0 )
            {
             before(grammarAccess.getAlternativeAccess().getGroup()); 
            // InternalSequence.g:726:3: ( rule__Alternative__Group__0 )
            // InternalSequence.g:726:4: rule__Alternative__Group__0
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


    // $ANTLR start "entryRuleLoop"
    // InternalSequence.g:735:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalSequence.g:736:1: ( ruleLoop EOF )
            // InternalSequence.g:737:1: ruleLoop EOF
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
    // InternalSequence.g:744:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:748:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalSequence.g:749:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalSequence.g:749:2: ( ( rule__Loop__Group__0 ) )
            // InternalSequence.g:750:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalSequence.g:751:3: ( rule__Loop__Group__0 )
            // InternalSequence.g:751:4: rule__Loop__Group__0
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


    // $ANTLR start "entryRuleOption"
    // InternalSequence.g:760:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalSequence.g:761:1: ( ruleOption EOF )
            // InternalSequence.g:762:1: ruleOption EOF
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
    // InternalSequence.g:769:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:773:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalSequence.g:774:2: ( ( rule__Option__Group__0 ) )
            {
            // InternalSequence.g:774:2: ( ( rule__Option__Group__0 ) )
            // InternalSequence.g:775:3: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalSequence.g:776:3: ( rule__Option__Group__0 )
            // InternalSequence.g:776:4: rule__Option__Group__0
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


    // $ANTLR start "entryRuleCritical"
    // InternalSequence.g:785:1: entryRuleCritical : ruleCritical EOF ;
    public final void entryRuleCritical() throws RecognitionException {
        try {
            // InternalSequence.g:786:1: ( ruleCritical EOF )
            // InternalSequence.g:787:1: ruleCritical EOF
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
    // InternalSequence.g:794:1: ruleCritical : ( ( rule__Critical__Group__0 ) ) ;
    public final void ruleCritical() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:798:2: ( ( ( rule__Critical__Group__0 ) ) )
            // InternalSequence.g:799:2: ( ( rule__Critical__Group__0 ) )
            {
            // InternalSequence.g:799:2: ( ( rule__Critical__Group__0 ) )
            // InternalSequence.g:800:3: ( rule__Critical__Group__0 )
            {
             before(grammarAccess.getCriticalAccess().getGroup()); 
            // InternalSequence.g:801:3: ( rule__Critical__Group__0 )
            // InternalSequence.g:801:4: rule__Critical__Group__0
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


    // $ANTLR start "entryRuleReference"
    // InternalSequence.g:810:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalSequence.g:811:1: ( ruleReference EOF )
            // InternalSequence.g:812:1: ruleReference EOF
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
    // InternalSequence.g:819:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:823:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalSequence.g:824:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalSequence.g:824:2: ( ( rule__Reference__Group__0 ) )
            // InternalSequence.g:825:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalSequence.g:826:3: ( rule__Reference__Group__0 )
            // InternalSequence.g:826:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleConstraint"
    // InternalSequence.g:835:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalSequence.g:836:1: ( ruleConstraint EOF )
            // InternalSequence.g:837:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalSequence.g:844:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:848:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalSequence.g:849:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalSequence.g:849:2: ( ( rule__Constraint__Group__0 ) )
            // InternalSequence.g:850:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalSequence.g:851:3: ( rule__Constraint__Group__0 )
            // InternalSequence.g:851:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleTimeConstraint"
    // InternalSequence.g:860:1: entryRuleTimeConstraint : ruleTimeConstraint EOF ;
    public final void entryRuleTimeConstraint() throws RecognitionException {
        try {
            // InternalSequence.g:861:1: ( ruleTimeConstraint EOF )
            // InternalSequence.g:862:1: ruleTimeConstraint EOF
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
    // InternalSequence.g:869:1: ruleTimeConstraint : ( ( rule__TimeConstraint__Group__0 ) ) ;
    public final void ruleTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:873:2: ( ( ( rule__TimeConstraint__Group__0 ) ) )
            // InternalSequence.g:874:2: ( ( rule__TimeConstraint__Group__0 ) )
            {
            // InternalSequence.g:874:2: ( ( rule__TimeConstraint__Group__0 ) )
            // InternalSequence.g:875:3: ( rule__TimeConstraint__Group__0 )
            {
             before(grammarAccess.getTimeConstraintAccess().getGroup()); 
            // InternalSequence.g:876:3: ( rule__TimeConstraint__Group__0 )
            // InternalSequence.g:876:4: rule__TimeConstraint__Group__0
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


    // $ANTLR start "entryRuleDurationConstraint"
    // InternalSequence.g:885:1: entryRuleDurationConstraint : ruleDurationConstraint EOF ;
    public final void entryRuleDurationConstraint() throws RecognitionException {
        try {
            // InternalSequence.g:886:1: ( ruleDurationConstraint EOF )
            // InternalSequence.g:887:1: ruleDurationConstraint EOF
            {
             before(grammarAccess.getDurationConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleDurationConstraint();

            state._fsp--;

             after(grammarAccess.getDurationConstraintRule()); 
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
    // $ANTLR end "entryRuleDurationConstraint"


    // $ANTLR start "ruleDurationConstraint"
    // InternalSequence.g:894:1: ruleDurationConstraint : ( ( rule__DurationConstraint__Group__0 ) ) ;
    public final void ruleDurationConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:898:2: ( ( ( rule__DurationConstraint__Group__0 ) ) )
            // InternalSequence.g:899:2: ( ( rule__DurationConstraint__Group__0 ) )
            {
            // InternalSequence.g:899:2: ( ( rule__DurationConstraint__Group__0 ) )
            // InternalSequence.g:900:3: ( rule__DurationConstraint__Group__0 )
            {
             before(grammarAccess.getDurationConstraintAccess().getGroup()); 
            // InternalSequence.g:901:3: ( rule__DurationConstraint__Group__0 )
            // InternalSequence.g:901:4: rule__DurationConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DurationConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDurationConstraint"


    // $ANTLR start "entryRuleObservation"
    // InternalSequence.g:910:1: entryRuleObservation : ruleObservation EOF ;
    public final void entryRuleObservation() throws RecognitionException {
        try {
            // InternalSequence.g:911:1: ( ruleObservation EOF )
            // InternalSequence.g:912:1: ruleObservation EOF
            {
             before(grammarAccess.getObservationRule()); 
            pushFollow(FOLLOW_1);
            ruleObservation();

            state._fsp--;

             after(grammarAccess.getObservationRule()); 
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
    // $ANTLR end "entryRuleObservation"


    // $ANTLR start "ruleObservation"
    // InternalSequence.g:919:1: ruleObservation : ( ( rule__Observation__Group__0 ) ) ;
    public final void ruleObservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:923:2: ( ( ( rule__Observation__Group__0 ) ) )
            // InternalSequence.g:924:2: ( ( rule__Observation__Group__0 ) )
            {
            // InternalSequence.g:924:2: ( ( rule__Observation__Group__0 ) )
            // InternalSequence.g:925:3: ( rule__Observation__Group__0 )
            {
             before(grammarAccess.getObservationAccess().getGroup()); 
            // InternalSequence.g:926:3: ( rule__Observation__Group__0 )
            // InternalSequence.g:926:4: rule__Observation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Observation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObservationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObservation"


    // $ANTLR start "entryRuleTimeObservation"
    // InternalSequence.g:935:1: entryRuleTimeObservation : ruleTimeObservation EOF ;
    public final void entryRuleTimeObservation() throws RecognitionException {
        try {
            // InternalSequence.g:936:1: ( ruleTimeObservation EOF )
            // InternalSequence.g:937:1: ruleTimeObservation EOF
            {
             before(grammarAccess.getTimeObservationRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeObservation();

            state._fsp--;

             after(grammarAccess.getTimeObservationRule()); 
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
    // $ANTLR end "entryRuleTimeObservation"


    // $ANTLR start "ruleTimeObservation"
    // InternalSequence.g:944:1: ruleTimeObservation : ( ( rule__TimeObservation__Group__0 ) ) ;
    public final void ruleTimeObservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:948:2: ( ( ( rule__TimeObservation__Group__0 ) ) )
            // InternalSequence.g:949:2: ( ( rule__TimeObservation__Group__0 ) )
            {
            // InternalSequence.g:949:2: ( ( rule__TimeObservation__Group__0 ) )
            // InternalSequence.g:950:3: ( rule__TimeObservation__Group__0 )
            {
             before(grammarAccess.getTimeObservationAccess().getGroup()); 
            // InternalSequence.g:951:3: ( rule__TimeObservation__Group__0 )
            // InternalSequence.g:951:4: rule__TimeObservation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeObservation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeObservationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeObservation"


    // $ANTLR start "entryRuleDurationObservation"
    // InternalSequence.g:960:1: entryRuleDurationObservation : ruleDurationObservation EOF ;
    public final void entryRuleDurationObservation() throws RecognitionException {
        try {
            // InternalSequence.g:961:1: ( ruleDurationObservation EOF )
            // InternalSequence.g:962:1: ruleDurationObservation EOF
            {
             before(grammarAccess.getDurationObservationRule()); 
            pushFollow(FOLLOW_1);
            ruleDurationObservation();

            state._fsp--;

             after(grammarAccess.getDurationObservationRule()); 
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
    // $ANTLR end "entryRuleDurationObservation"


    // $ANTLR start "ruleDurationObservation"
    // InternalSequence.g:969:1: ruleDurationObservation : ( ( rule__DurationObservation__Group__0 ) ) ;
    public final void ruleDurationObservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:973:2: ( ( ( rule__DurationObservation__Group__0 ) ) )
            // InternalSequence.g:974:2: ( ( rule__DurationObservation__Group__0 ) )
            {
            // InternalSequence.g:974:2: ( ( rule__DurationObservation__Group__0 ) )
            // InternalSequence.g:975:3: ( rule__DurationObservation__Group__0 )
            {
             before(grammarAccess.getDurationObservationAccess().getGroup()); 
            // InternalSequence.g:976:3: ( rule__DurationObservation__Group__0 )
            // InternalSequence.g:976:4: rule__DurationObservation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DurationObservation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationObservationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDurationObservation"


    // $ANTLR start "entryRulePointInTimeSelector"
    // InternalSequence.g:985:1: entryRulePointInTimeSelector : rulePointInTimeSelector EOF ;
    public final void entryRulePointInTimeSelector() throws RecognitionException {
        try {
            // InternalSequence.g:986:1: ( rulePointInTimeSelector EOF )
            // InternalSequence.g:987:1: rulePointInTimeSelector EOF
            {
             before(grammarAccess.getPointInTimeSelectorRule()); 
            pushFollow(FOLLOW_1);
            rulePointInTimeSelector();

            state._fsp--;

             after(grammarAccess.getPointInTimeSelectorRule()); 
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
    // $ANTLR end "entryRulePointInTimeSelector"


    // $ANTLR start "rulePointInTimeSelector"
    // InternalSequence.g:994:1: rulePointInTimeSelector : ( ( rule__PointInTimeSelector__PointInTimeAssignment ) ) ;
    public final void rulePointInTimeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:998:2: ( ( ( rule__PointInTimeSelector__PointInTimeAssignment ) ) )
            // InternalSequence.g:999:2: ( ( rule__PointInTimeSelector__PointInTimeAssignment ) )
            {
            // InternalSequence.g:999:2: ( ( rule__PointInTimeSelector__PointInTimeAssignment ) )
            // InternalSequence.g:1000:3: ( rule__PointInTimeSelector__PointInTimeAssignment )
            {
             before(grammarAccess.getPointInTimeSelectorAccess().getPointInTimeAssignment()); 
            // InternalSequence.g:1001:3: ( rule__PointInTimeSelector__PointInTimeAssignment )
            // InternalSequence.g:1001:4: rule__PointInTimeSelector__PointInTimeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PointInTimeSelector__PointInTimeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPointInTimeSelectorAccess().getPointInTimeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePointInTimeSelector"


    // $ANTLR start "entryRuleTimeIntervalSelector"
    // InternalSequence.g:1010:1: entryRuleTimeIntervalSelector : ruleTimeIntervalSelector EOF ;
    public final void entryRuleTimeIntervalSelector() throws RecognitionException {
        try {
            // InternalSequence.g:1011:1: ( ruleTimeIntervalSelector EOF )
            // InternalSequence.g:1012:1: ruleTimeIntervalSelector EOF
            {
             before(grammarAccess.getTimeIntervalSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeIntervalSelector();

            state._fsp--;

             after(grammarAccess.getTimeIntervalSelectorRule()); 
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
    // $ANTLR end "entryRuleTimeIntervalSelector"


    // $ANTLR start "ruleTimeIntervalSelector"
    // InternalSequence.g:1019:1: ruleTimeIntervalSelector : ( ( rule__TimeIntervalSelector__Alternatives ) ) ;
    public final void ruleTimeIntervalSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1023:2: ( ( ( rule__TimeIntervalSelector__Alternatives ) ) )
            // InternalSequence.g:1024:2: ( ( rule__TimeIntervalSelector__Alternatives ) )
            {
            // InternalSequence.g:1024:2: ( ( rule__TimeIntervalSelector__Alternatives ) )
            // InternalSequence.g:1025:3: ( rule__TimeIntervalSelector__Alternatives )
            {
             before(grammarAccess.getTimeIntervalSelectorAccess().getAlternatives()); 
            // InternalSequence.g:1026:3: ( rule__TimeIntervalSelector__Alternatives )
            // InternalSequence.g:1026:4: rule__TimeIntervalSelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeIntervalSelector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeIntervalSelectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeIntervalSelector"


    // $ANTLR start "entryRuleBiPointInTimeTimeIntervalSelector"
    // InternalSequence.g:1035:1: entryRuleBiPointInTimeTimeIntervalSelector : ruleBiPointInTimeTimeIntervalSelector EOF ;
    public final void entryRuleBiPointInTimeTimeIntervalSelector() throws RecognitionException {
        try {
            // InternalSequence.g:1036:1: ( ruleBiPointInTimeTimeIntervalSelector EOF )
            // InternalSequence.g:1037:1: ruleBiPointInTimeTimeIntervalSelector EOF
            {
             before(grammarAccess.getBiPointInTimeTimeIntervalSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleBiPointInTimeTimeIntervalSelector();

            state._fsp--;

             after(grammarAccess.getBiPointInTimeTimeIntervalSelectorRule()); 
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
    // $ANTLR end "entryRuleBiPointInTimeTimeIntervalSelector"


    // $ANTLR start "ruleBiPointInTimeTimeIntervalSelector"
    // InternalSequence.g:1044:1: ruleBiPointInTimeTimeIntervalSelector : ( ( rule__BiPointInTimeTimeIntervalSelector__Group__0 ) ) ;
    public final void ruleBiPointInTimeTimeIntervalSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1048:2: ( ( ( rule__BiPointInTimeTimeIntervalSelector__Group__0 ) ) )
            // InternalSequence.g:1049:2: ( ( rule__BiPointInTimeTimeIntervalSelector__Group__0 ) )
            {
            // InternalSequence.g:1049:2: ( ( rule__BiPointInTimeTimeIntervalSelector__Group__0 ) )
            // InternalSequence.g:1050:3: ( rule__BiPointInTimeTimeIntervalSelector__Group__0 )
            {
             before(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getGroup()); 
            // InternalSequence.g:1051:3: ( rule__BiPointInTimeTimeIntervalSelector__Group__0 )
            // InternalSequence.g:1051:4: rule__BiPointInTimeTimeIntervalSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BiPointInTimeTimeIntervalSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBiPointInTimeTimeIntervalSelector"


    // $ANTLR start "entryRuleFragmentTimeIntervalSelector"
    // InternalSequence.g:1060:1: entryRuleFragmentTimeIntervalSelector : ruleFragmentTimeIntervalSelector EOF ;
    public final void entryRuleFragmentTimeIntervalSelector() throws RecognitionException {
        try {
            // InternalSequence.g:1061:1: ( ruleFragmentTimeIntervalSelector EOF )
            // InternalSequence.g:1062:1: ruleFragmentTimeIntervalSelector EOF
            {
             before(grammarAccess.getFragmentTimeIntervalSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleFragmentTimeIntervalSelector();

            state._fsp--;

             after(grammarAccess.getFragmentTimeIntervalSelectorRule()); 
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
    // $ANTLR end "entryRuleFragmentTimeIntervalSelector"


    // $ANTLR start "ruleFragmentTimeIntervalSelector"
    // InternalSequence.g:1069:1: ruleFragmentTimeIntervalSelector : ( ( rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment ) ) ;
    public final void ruleFragmentTimeIntervalSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1073:2: ( ( ( rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment ) ) )
            // InternalSequence.g:1074:2: ( ( rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment ) )
            {
            // InternalSequence.g:1074:2: ( ( rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment ) )
            // InternalSequence.g:1075:3: ( rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment )
            {
             before(grammarAccess.getFragmentTimeIntervalSelectorAccess().getNonInstantaneousFragmentAssignment()); 
            // InternalSequence.g:1076:3: ( rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment )
            // InternalSequence.g:1076:4: rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFragmentTimeIntervalSelectorAccess().getNonInstantaneousFragmentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFragmentTimeIntervalSelector"


    // $ANTLR start "entryRuleImplicitSendOccurenceSpecification"
    // InternalSequence.g:1085:1: entryRuleImplicitSendOccurenceSpecification : ruleImplicitSendOccurenceSpecification EOF ;
    public final void entryRuleImplicitSendOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:1086:1: ( ruleImplicitSendOccurenceSpecification EOF )
            // InternalSequence.g:1087:1: ruleImplicitSendOccurenceSpecification EOF
            {
             before(grammarAccess.getImplicitSendOccurenceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleImplicitSendOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getImplicitSendOccurenceSpecificationRule()); 
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
    // $ANTLR end "entryRuleImplicitSendOccurenceSpecification"


    // $ANTLR start "ruleImplicitSendOccurenceSpecification"
    // InternalSequence.g:1094:1: ruleImplicitSendOccurenceSpecification : ( () ) ;
    public final void ruleImplicitSendOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1098:2: ( ( () ) )
            // InternalSequence.g:1099:2: ( () )
            {
            // InternalSequence.g:1099:2: ( () )
            // InternalSequence.g:1100:3: ()
            {
             before(grammarAccess.getImplicitSendOccurenceSpecificationAccess().getImplicitSendOccurenceSpecificationAction()); 
            // InternalSequence.g:1101:3: ()
            // InternalSequence.g:1101:4: 
            {
            }

             after(grammarAccess.getImplicitSendOccurenceSpecificationAccess().getImplicitSendOccurenceSpecificationAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplicitSendOccurenceSpecification"


    // $ANTLR start "entryRuleImplicitArrivalOccurenceSpecification"
    // InternalSequence.g:1110:1: entryRuleImplicitArrivalOccurenceSpecification : ruleImplicitArrivalOccurenceSpecification EOF ;
    public final void entryRuleImplicitArrivalOccurenceSpecification() throws RecognitionException {
        try {
            // InternalSequence.g:1111:1: ( ruleImplicitArrivalOccurenceSpecification EOF )
            // InternalSequence.g:1112:1: ruleImplicitArrivalOccurenceSpecification EOF
            {
             before(grammarAccess.getImplicitArrivalOccurenceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleImplicitArrivalOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getImplicitArrivalOccurenceSpecificationRule()); 
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
    // $ANTLR end "entryRuleImplicitArrivalOccurenceSpecification"


    // $ANTLR start "ruleImplicitArrivalOccurenceSpecification"
    // InternalSequence.g:1119:1: ruleImplicitArrivalOccurenceSpecification : ( () ) ;
    public final void ruleImplicitArrivalOccurenceSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1123:2: ( ( () ) )
            // InternalSequence.g:1124:2: ( () )
            {
            // InternalSequence.g:1124:2: ( () )
            // InternalSequence.g:1125:3: ()
            {
             before(grammarAccess.getImplicitArrivalOccurenceSpecificationAccess().getImplicitArrivalOccurenceSpecificationAction()); 
            // InternalSequence.g:1126:3: ()
            // InternalSequence.g:1126:4: 
            {
            }

             after(grammarAccess.getImplicitArrivalOccurenceSpecificationAccess().getImplicitArrivalOccurenceSpecificationAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplicitArrivalOccurenceSpecification"


    // $ANTLR start "entryRuleFQN"
    // InternalSequence.g:1135:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSequence.g:1136:1: ( ruleFQN EOF )
            // InternalSequence.g:1137:1: ruleFQN EOF
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
    // InternalSequence.g:1144:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1148:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSequence.g:1149:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSequence.g:1149:2: ( ( rule__FQN__Group__0 ) )
            // InternalSequence.g:1150:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalSequence.g:1151:3: ( rule__FQN__Group__0 )
            // InternalSequence.g:1151:4: rule__FQN__Group__0
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


    // $ANTLR start "entryRuleInlineComment"
    // InternalSequence.g:1160:1: entryRuleInlineComment : ruleInlineComment EOF ;
    public final void entryRuleInlineComment() throws RecognitionException {
        try {
            // InternalSequence.g:1161:1: ( ruleInlineComment EOF )
            // InternalSequence.g:1162:1: ruleInlineComment EOF
            {
             before(grammarAccess.getInlineCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleInlineComment();

            state._fsp--;

             after(grammarAccess.getInlineCommentRule()); 
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
    // $ANTLR end "entryRuleInlineComment"


    // $ANTLR start "ruleInlineComment"
    // InternalSequence.g:1169:1: ruleInlineComment : ( ( rule__InlineComment__Group__0 ) ) ;
    public final void ruleInlineComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1173:2: ( ( ( rule__InlineComment__Group__0 ) ) )
            // InternalSequence.g:1174:2: ( ( rule__InlineComment__Group__0 ) )
            {
            // InternalSequence.g:1174:2: ( ( rule__InlineComment__Group__0 ) )
            // InternalSequence.g:1175:3: ( rule__InlineComment__Group__0 )
            {
             before(grammarAccess.getInlineCommentAccess().getGroup()); 
            // InternalSequence.g:1176:3: ( rule__InlineComment__Group__0 )
            // InternalSequence.g:1176:4: rule__InlineComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InlineComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInlineCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInlineComment"


    // $ANTLR start "entryRuleCommentBody"
    // InternalSequence.g:1185:1: entryRuleCommentBody : ruleCommentBody EOF ;
    public final void entryRuleCommentBody() throws RecognitionException {
        try {
            // InternalSequence.g:1186:1: ( ruleCommentBody EOF )
            // InternalSequence.g:1187:1: ruleCommentBody EOF
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
    // InternalSequence.g:1194:1: ruleCommentBody : ( RULE_STRING ) ;
    public final void ruleCommentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1198:2: ( ( RULE_STRING ) )
            // InternalSequence.g:1199:2: ( RULE_STRING )
            {
            // InternalSequence.g:1199:2: ( RULE_STRING )
            // InternalSequence.g:1200:3: RULE_STRING
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
    // InternalSequence.g:1210:1: entryRuleUnescapedString : ruleUnescapedString EOF ;
    public final void entryRuleUnescapedString() throws RecognitionException {
        try {
            // InternalSequence.g:1211:1: ( ruleUnescapedString EOF )
            // InternalSequence.g:1212:1: ruleUnescapedString EOF
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
    // InternalSequence.g:1219:1: ruleUnescapedString : ( ( rule__UnescapedString__Alternatives ) ) ;
    public final void ruleUnescapedString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1223:2: ( ( ( rule__UnescapedString__Alternatives ) ) )
            // InternalSequence.g:1224:2: ( ( rule__UnescapedString__Alternatives ) )
            {
            // InternalSequence.g:1224:2: ( ( rule__UnescapedString__Alternatives ) )
            // InternalSequence.g:1225:3: ( rule__UnescapedString__Alternatives )
            {
             before(grammarAccess.getUnescapedStringAccess().getAlternatives()); 
            // InternalSequence.g:1226:3: ( rule__UnescapedString__Alternatives )
            // InternalSequence.g:1226:4: rule__UnescapedString__Alternatives
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
    // InternalSequence.g:1235:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1239:1: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalSequence.g:1240:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalSequence.g:1240:2: ( ( rule__MessageType__Alternatives ) )
            // InternalSequence.g:1241:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalSequence.g:1242:3: ( rule__MessageType__Alternatives )
            // InternalSequence.g:1242:4: rule__MessageType__Alternatives
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
    // InternalSequence.g:1251:1: ruleActorType : ( ( rule__ActorType__Alternatives ) ) ;
    public final void ruleActorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1255:1: ( ( ( rule__ActorType__Alternatives ) ) )
            // InternalSequence.g:1256:2: ( ( rule__ActorType__Alternatives ) )
            {
            // InternalSequence.g:1256:2: ( ( rule__ActorType__Alternatives ) )
            // InternalSequence.g:1257:3: ( rule__ActorType__Alternatives )
            {
             before(grammarAccess.getActorTypeAccess().getAlternatives()); 
            // InternalSequence.g:1258:3: ( rule__ActorType__Alternatives )
            // InternalSequence.g:1258:4: rule__ActorType__Alternatives
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


    // $ANTLR start "rule__SequenceDiagram__FragmentsAlternatives_6_0"
    // InternalSequence.g:1266:1: rule__SequenceDiagram__FragmentsAlternatives_6_0 : ( ( ruleConstraint ) | ( ruleObservation ) );
    public final void rule__SequenceDiagram__FragmentsAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1270:1: ( ( ruleConstraint ) | ( ruleObservation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==43) ) {
                alt2=1;
            }
            else if ( (LA2_0==46) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSequence.g:1271:2: ( ruleConstraint )
                    {
                    // InternalSequence.g:1271:2: ( ruleConstraint )
                    // InternalSequence.g:1272:3: ruleConstraint
                    {
                     before(grammarAccess.getSequenceDiagramAccess().getFragmentsConstraintParserRuleCall_6_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getSequenceDiagramAccess().getFragmentsConstraintParserRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1277:2: ( ruleObservation )
                    {
                    // InternalSequence.g:1277:2: ( ruleObservation )
                    // InternalSequence.g:1278:3: ruleObservation
                    {
                     before(grammarAccess.getSequenceDiagramAccess().getFragmentsObservationParserRuleCall_6_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObservation();

                    state._fsp--;

                     after(grammarAccess.getSequenceDiagramAccess().getFragmentsObservationParserRuleCall_6_0_1()); 

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
    // $ANTLR end "rule__SequenceDiagram__FragmentsAlternatives_6_0"


    // $ANTLR start "rule__Actor__Alternatives_2"
    // InternalSequence.g:1287:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Group_2_0__0 ) ) | ( ( rule__Actor__Group_2_1__0 ) ) | ( ( rule__Actor__Group_2_2__0 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1291:1: ( ( ( rule__Actor__Group_2_0__0 ) ) | ( ( rule__Actor__Group_2_1__0 ) ) | ( ( rule__Actor__Group_2_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
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
                    // InternalSequence.g:1292:2: ( ( rule__Actor__Group_2_0__0 ) )
                    {
                    // InternalSequence.g:1292:2: ( ( rule__Actor__Group_2_0__0 ) )
                    // InternalSequence.g:1293:3: ( rule__Actor__Group_2_0__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_0()); 
                    // InternalSequence.g:1294:3: ( rule__Actor__Group_2_0__0 )
                    // InternalSequence.g:1294:4: rule__Actor__Group_2_0__0
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
                    // InternalSequence.g:1298:2: ( ( rule__Actor__Group_2_1__0 ) )
                    {
                    // InternalSequence.g:1298:2: ( ( rule__Actor__Group_2_1__0 ) )
                    // InternalSequence.g:1299:3: ( rule__Actor__Group_2_1__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_1()); 
                    // InternalSequence.g:1300:3: ( rule__Actor__Group_2_1__0 )
                    // InternalSequence.g:1300:4: rule__Actor__Group_2_1__0
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
                    // InternalSequence.g:1304:2: ( ( rule__Actor__Group_2_2__0 ) )
                    {
                    // InternalSequence.g:1304:2: ( ( rule__Actor__Group_2_2__0 ) )
                    // InternalSequence.g:1305:3: ( rule__Actor__Group_2_2__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_2()); 
                    // InternalSequence.g:1306:3: ( rule__Actor__Group_2_2__0 )
                    // InternalSequence.g:1306:4: rule__Actor__Group_2_2__0
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


    // $ANTLR start "rule__Fragment__Alternatives"
    // InternalSequence.g:1314:1: rule__Fragment__Alternatives : ( ( ruleMessage ) | ( ruleOccurenceSpecification ) | ( ruleCombinedFragment ) | ( ruleReference ) );
    public final void rule__Fragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1318:1: ( ( ruleMessage ) | ( ruleOccurenceSpecification ) | ( ruleCombinedFragment ) | ( ruleReference ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt4=1;
                }
                break;
            case 36:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_ID) ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==29) ) {
                        alt4=1;
                    }
                    else if ( (LA4_6==EOF||(LA4_6>=12 && LA4_6<=13)||LA4_6==17||(LA4_6>=24 && LA4_6<=26)||LA4_6==28||(LA4_6>=32 && LA4_6<=43)||(LA4_6>=46 && LA4_6<=47)) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==RULE_STRING||LA4_2==29) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt4=3;
                }
                break;
            case 42:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSequence.g:1319:2: ( ruleMessage )
                    {
                    // InternalSequence.g:1319:2: ( ruleMessage )
                    // InternalSequence.g:1320:3: ruleMessage
                    {
                     before(grammarAccess.getFragmentAccess().getMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getFragmentAccess().getMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1325:2: ( ruleOccurenceSpecification )
                    {
                    // InternalSequence.g:1325:2: ( ruleOccurenceSpecification )
                    // InternalSequence.g:1326:3: ruleOccurenceSpecification
                    {
                     before(grammarAccess.getFragmentAccess().getOccurenceSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOccurenceSpecification();

                    state._fsp--;

                     after(grammarAccess.getFragmentAccess().getOccurenceSpecificationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:1331:2: ( ruleCombinedFragment )
                    {
                    // InternalSequence.g:1331:2: ( ruleCombinedFragment )
                    // InternalSequence.g:1332:3: ruleCombinedFragment
                    {
                     before(grammarAccess.getFragmentAccess().getCombinedFragmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCombinedFragment();

                    state._fsp--;

                     after(grammarAccess.getFragmentAccess().getCombinedFragmentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSequence.g:1337:2: ( ruleReference )
                    {
                    // InternalSequence.g:1337:2: ( ruleReference )
                    // InternalSequence.g:1338:3: ruleReference
                    {
                     before(grammarAccess.getFragmentAccess().getReferenceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getFragmentAccess().getReferenceParserRuleCall_3()); 

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
    // $ANTLR end "rule__Fragment__Alternatives"


    // $ANTLR start "rule__OrderedFragmentContainer__Alternatives"
    // InternalSequence.g:1347:1: rule__OrderedFragmentContainer__Alternatives : ( ( ( rule__OrderedFragmentContainer__Group_0__0 ) ) | ( ruleOneFragment ) );
    public final void rule__OrderedFragmentContainer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1351:1: ( ( ( rule__OrderedFragmentContainer__Group_0__0 ) ) | ( ruleOneFragment ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=12 && LA5_0<=13)||LA5_0==28||(LA5_0>=32 && LA5_0<=42)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSequence.g:1352:2: ( ( rule__OrderedFragmentContainer__Group_0__0 ) )
                    {
                    // InternalSequence.g:1352:2: ( ( rule__OrderedFragmentContainer__Group_0__0 ) )
                    // InternalSequence.g:1353:3: ( rule__OrderedFragmentContainer__Group_0__0 )
                    {
                     before(grammarAccess.getOrderedFragmentContainerAccess().getGroup_0()); 
                    // InternalSequence.g:1354:3: ( rule__OrderedFragmentContainer__Group_0__0 )
                    // InternalSequence.g:1354:4: rule__OrderedFragmentContainer__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderedFragmentContainer__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOrderedFragmentContainerAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1358:2: ( ruleOneFragment )
                    {
                    // InternalSequence.g:1358:2: ( ruleOneFragment )
                    // InternalSequence.g:1359:3: ruleOneFragment
                    {
                     before(grammarAccess.getOrderedFragmentContainerAccess().getOneFragmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOneFragment();

                    state._fsp--;

                     after(grammarAccess.getOrderedFragmentContainerAccess().getOneFragmentParserRuleCall_1()); 

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
    // $ANTLR end "rule__OrderedFragmentContainer__Alternatives"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Alternatives_1"
    // InternalSequence.g:1368:1: rule__OrderedFragmentContainerWithCondition__Alternatives_1 : ( ( ( rule__OrderedFragmentContainerWithCondition__Group_1_0__0 ) ) | ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1 ) ) );
    public final void rule__OrderedFragmentContainerWithCondition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1372:1: ( ( ( rule__OrderedFragmentContainerWithCondition__Group_1_0__0 ) ) | ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=12 && LA6_0<=13)||LA6_0==28||(LA6_0>=32 && LA6_0<=42)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSequence.g:1373:2: ( ( rule__OrderedFragmentContainerWithCondition__Group_1_0__0 ) )
                    {
                    // InternalSequence.g:1373:2: ( ( rule__OrderedFragmentContainerWithCondition__Group_1_0__0 ) )
                    // InternalSequence.g:1374:3: ( rule__OrderedFragmentContainerWithCondition__Group_1_0__0 )
                    {
                     before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getGroup_1_0()); 
                    // InternalSequence.g:1375:3: ( rule__OrderedFragmentContainerWithCondition__Group_1_0__0 )
                    // InternalSequence.g:1375:4: rule__OrderedFragmentContainerWithCondition__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderedFragmentContainerWithCondition__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1379:2: ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1 ) )
                    {
                    // InternalSequence.g:1379:2: ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1 ) )
                    // InternalSequence.g:1380:3: ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1 )
                    {
                     before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_1()); 
                    // InternalSequence.g:1381:3: ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1 )
                    // InternalSequence.g:1381:4: rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_1()); 

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
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Alternatives_1"


    // $ANTLR start "rule__Message__Alternatives_0"
    // InternalSequence.g:1389:1: rule__Message__Alternatives_0 : ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) );
    public final void rule__Message__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1393:1: ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            case 35:
                {
                alt7=5;
                }
                break;
            case 36:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSequence.g:1394:2: ( ruleStandardMessage )
                    {
                    // InternalSequence.g:1394:2: ( ruleStandardMessage )
                    // InternalSequence.g:1395:3: ruleStandardMessage
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
                    // InternalSequence.g:1400:2: ( ruleResponseMessage )
                    {
                    // InternalSequence.g:1400:2: ( ruleResponseMessage )
                    // InternalSequence.g:1401:3: ruleResponseMessage
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
                    // InternalSequence.g:1406:2: ( ruleFoundMessage )
                    {
                    // InternalSequence.g:1406:2: ( ruleFoundMessage )
                    // InternalSequence.g:1407:3: ruleFoundMessage
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
                    // InternalSequence.g:1412:2: ( ruleLostMessage )
                    {
                    // InternalSequence.g:1412:2: ( ruleLostMessage )
                    // InternalSequence.g:1413:3: ruleLostMessage
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
                    // InternalSequence.g:1418:2: ( ruleCreateMessage )
                    {
                    // InternalSequence.g:1418:2: ( ruleCreateMessage )
                    // InternalSequence.g:1419:3: ruleCreateMessage
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
                    // InternalSequence.g:1424:2: ( ruleDestructionMessage )
                    {
                    // InternalSequence.g:1424:2: ( ruleDestructionMessage )
                    // InternalSequence.g:1425:3: ruleDestructionMessage
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


    // $ANTLR start "rule__Message__Alternatives_3"
    // InternalSequence.g:1434:1: rule__Message__Alternatives_3 : ( ( ( rule__Message__ArrivalEventAssignment_3_0 ) ) | ( ( rule__Message__ArrivalEventAssignment_3_1 ) ) );
    public final void rule__Message__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1438:1: ( ( ( rule__Message__ArrivalEventAssignment_3_0 ) ) | ( ( rule__Message__ArrivalEventAssignment_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==EOF||(LA8_0>=12 && LA8_0<=13)||LA8_0==17||(LA8_0>=24 && LA8_0<=26)||LA8_0==28||(LA8_0>=32 && LA8_0<=43)||LA8_0==46) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSequence.g:1439:2: ( ( rule__Message__ArrivalEventAssignment_3_0 ) )
                    {
                    // InternalSequence.g:1439:2: ( ( rule__Message__ArrivalEventAssignment_3_0 ) )
                    // InternalSequence.g:1440:3: ( rule__Message__ArrivalEventAssignment_3_0 )
                    {
                     before(grammarAccess.getMessageAccess().getArrivalEventAssignment_3_0()); 
                    // InternalSequence.g:1441:3: ( rule__Message__ArrivalEventAssignment_3_0 )
                    // InternalSequence.g:1441:4: rule__Message__ArrivalEventAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__ArrivalEventAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getArrivalEventAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1445:2: ( ( rule__Message__ArrivalEventAssignment_3_1 ) )
                    {
                    // InternalSequence.g:1445:2: ( ( rule__Message__ArrivalEventAssignment_3_1 ) )
                    // InternalSequence.g:1446:3: ( rule__Message__ArrivalEventAssignment_3_1 )
                    {
                     before(grammarAccess.getMessageAccess().getArrivalEventAssignment_3_1()); 
                    // InternalSequence.g:1447:3: ( rule__Message__ArrivalEventAssignment_3_1 )
                    // InternalSequence.g:1447:4: rule__Message__ArrivalEventAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__ArrivalEventAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getArrivalEventAssignment_3_1()); 

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
    // $ANTLR end "rule__Message__Alternatives_3"


    // $ANTLR start "rule__ResponseMessage__Alternatives_3"
    // InternalSequence.g:1455:1: rule__ResponseMessage__Alternatives_3 : ( ( ( rule__ResponseMessage__LeftAssignment_3_0 ) ) | ( '_' ) );
    public final void rule__ResponseMessage__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1459:1: ( ( ( rule__ResponseMessage__LeftAssignment_3_0 ) ) | ( '_' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==11) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSequence.g:1460:2: ( ( rule__ResponseMessage__LeftAssignment_3_0 ) )
                    {
                    // InternalSequence.g:1460:2: ( ( rule__ResponseMessage__LeftAssignment_3_0 ) )
                    // InternalSequence.g:1461:3: ( rule__ResponseMessage__LeftAssignment_3_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getLeftAssignment_3_0()); 
                    // InternalSequence.g:1462:3: ( rule__ResponseMessage__LeftAssignment_3_0 )
                    // InternalSequence.g:1462:4: rule__ResponseMessage__LeftAssignment_3_0
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
                    // InternalSequence.g:1466:2: ( '_' )
                    {
                    // InternalSequence.g:1466:2: ( '_' )
                    // InternalSequence.g:1467:3: '_'
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
    // InternalSequence.g:1476:1: rule__ResponseMessage__Alternatives_5 : ( ( ( rule__ResponseMessage__RightAssignment_5_0 ) ) | ( '_' ) );
    public final void rule__ResponseMessage__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1480:1: ( ( ( rule__ResponseMessage__RightAssignment_5_0 ) ) | ( '_' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==11) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSequence.g:1481:2: ( ( rule__ResponseMessage__RightAssignment_5_0 ) )
                    {
                    // InternalSequence.g:1481:2: ( ( rule__ResponseMessage__RightAssignment_5_0 ) )
                    // InternalSequence.g:1482:3: ( rule__ResponseMessage__RightAssignment_5_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getRightAssignment_5_0()); 
                    // InternalSequence.g:1483:3: ( rule__ResponseMessage__RightAssignment_5_0 )
                    // InternalSequence.g:1483:4: rule__ResponseMessage__RightAssignment_5_0
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
                    // InternalSequence.g:1487:2: ( '_' )
                    {
                    // InternalSequence.g:1487:2: ( '_' )
                    // InternalSequence.g:1488:3: '_'
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


    // $ANTLR start "rule__LostMessage__Alternatives_1"
    // InternalSequence.g:1497:1: rule__LostMessage__Alternatives_1 : ( ( ( rule__LostMessage__Group_1_0__0 ) ) | ( ( rule__LostMessage__Group_1_1__0 ) ) );
    public final void rule__LostMessage__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1501:1: ( ( ( rule__LostMessage__Group_1_0__0 ) ) | ( ( rule__LostMessage__Group_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSequence.g:1502:2: ( ( rule__LostMessage__Group_1_0__0 ) )
                    {
                    // InternalSequence.g:1502:2: ( ( rule__LostMessage__Group_1_0__0 ) )
                    // InternalSequence.g:1503:3: ( rule__LostMessage__Group_1_0__0 )
                    {
                     before(grammarAccess.getLostMessageAccess().getGroup_1_0()); 
                    // InternalSequence.g:1504:3: ( rule__LostMessage__Group_1_0__0 )
                    // InternalSequence.g:1504:4: rule__LostMessage__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LostMessage__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLostMessageAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1508:2: ( ( rule__LostMessage__Group_1_1__0 ) )
                    {
                    // InternalSequence.g:1508:2: ( ( rule__LostMessage__Group_1_1__0 ) )
                    // InternalSequence.g:1509:3: ( rule__LostMessage__Group_1_1__0 )
                    {
                     before(grammarAccess.getLostMessageAccess().getGroup_1_1()); 
                    // InternalSequence.g:1510:3: ( rule__LostMessage__Group_1_1__0 )
                    // InternalSequence.g:1510:4: rule__LostMessage__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LostMessage__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLostMessageAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__LostMessage__Alternatives_1"


    // $ANTLR start "rule__OccurenceSpecification__Alternatives"
    // InternalSequence.g:1518:1: rule__OccurenceSpecification__Alternatives : ( ( ruleDestructionOccurenceSpecification ) | ( ruleExplicitArrivalOccurenceSpecification ) );
    public final void rule__OccurenceSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1522:1: ( ( ruleDestructionOccurenceSpecification ) | ( ruleExplicitArrivalOccurenceSpecification ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSequence.g:1523:2: ( ruleDestructionOccurenceSpecification )
                    {
                    // InternalSequence.g:1523:2: ( ruleDestructionOccurenceSpecification )
                    // InternalSequence.g:1524:3: ruleDestructionOccurenceSpecification
                    {
                     before(grammarAccess.getOccurenceSpecificationAccess().getDestructionOccurenceSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDestructionOccurenceSpecification();

                    state._fsp--;

                     after(grammarAccess.getOccurenceSpecificationAccess().getDestructionOccurenceSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1529:2: ( ruleExplicitArrivalOccurenceSpecification )
                    {
                    // InternalSequence.g:1529:2: ( ruleExplicitArrivalOccurenceSpecification )
                    // InternalSequence.g:1530:3: ruleExplicitArrivalOccurenceSpecification
                    {
                     before(grammarAccess.getOccurenceSpecificationAccess().getExplicitArrivalOccurenceSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExplicitArrivalOccurenceSpecification();

                    state._fsp--;

                     after(grammarAccess.getOccurenceSpecificationAccess().getExplicitArrivalOccurenceSpecificationParserRuleCall_1()); 

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
    // $ANTLR end "rule__OccurenceSpecification__Alternatives"


    // $ANTLR start "rule__CombinedFragment__Alternatives"
    // InternalSequence.g:1539:1: rule__CombinedFragment__Alternatives : ( ( ruleMultipleRegionContainer ) | ( ruleSingleRegionContainer ) );
    public final void rule__CombinedFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1543:1: ( ( ruleMultipleRegionContainer ) | ( ruleSingleRegionContainer ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=37 && LA13_0<=38)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=39 && LA13_0<=41)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSequence.g:1544:2: ( ruleMultipleRegionContainer )
                    {
                    // InternalSequence.g:1544:2: ( ruleMultipleRegionContainer )
                    // InternalSequence.g:1545:3: ruleMultipleRegionContainer
                    {
                     before(grammarAccess.getCombinedFragmentAccess().getMultipleRegionContainerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMultipleRegionContainer();

                    state._fsp--;

                     after(grammarAccess.getCombinedFragmentAccess().getMultipleRegionContainerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1550:2: ( ruleSingleRegionContainer )
                    {
                    // InternalSequence.g:1550:2: ( ruleSingleRegionContainer )
                    // InternalSequence.g:1551:3: ruleSingleRegionContainer
                    {
                     before(grammarAccess.getCombinedFragmentAccess().getSingleRegionContainerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleRegionContainer();

                    state._fsp--;

                     after(grammarAccess.getCombinedFragmentAccess().getSingleRegionContainerParserRuleCall_1()); 

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


    // $ANTLR start "rule__SingleRegionContainer__Alternatives"
    // InternalSequence.g:1560:1: rule__SingleRegionContainer__Alternatives : ( ( ruleLoop ) | ( ruleOption ) | ( ruleCritical ) );
    public final void rule__SingleRegionContainer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1564:1: ( ( ruleLoop ) | ( ruleOption ) | ( ruleCritical ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSequence.g:1565:2: ( ruleLoop )
                    {
                    // InternalSequence.g:1565:2: ( ruleLoop )
                    // InternalSequence.g:1566:3: ruleLoop
                    {
                     before(grammarAccess.getSingleRegionContainerAccess().getLoopParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getSingleRegionContainerAccess().getLoopParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1571:2: ( ruleOption )
                    {
                    // InternalSequence.g:1571:2: ( ruleOption )
                    // InternalSequence.g:1572:3: ruleOption
                    {
                     before(grammarAccess.getSingleRegionContainerAccess().getOptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOption();

                    state._fsp--;

                     after(grammarAccess.getSingleRegionContainerAccess().getOptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:1577:2: ( ruleCritical )
                    {
                    // InternalSequence.g:1577:2: ( ruleCritical )
                    // InternalSequence.g:1578:3: ruleCritical
                    {
                     before(grammarAccess.getSingleRegionContainerAccess().getCriticalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCritical();

                    state._fsp--;

                     after(grammarAccess.getSingleRegionContainerAccess().getCriticalParserRuleCall_2()); 

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
    // $ANTLR end "rule__SingleRegionContainer__Alternatives"


    // $ANTLR start "rule__MultipleRegionContainer__Alternatives"
    // InternalSequence.g:1587:1: rule__MultipleRegionContainer__Alternatives : ( ( ruleParallel ) | ( ruleAlternative ) );
    public final void rule__MultipleRegionContainer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1591:1: ( ( ruleParallel ) | ( ruleAlternative ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            else if ( (LA15_0==38) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSequence.g:1592:2: ( ruleParallel )
                    {
                    // InternalSequence.g:1592:2: ( ruleParallel )
                    // InternalSequence.g:1593:3: ruleParallel
                    {
                     before(grammarAccess.getMultipleRegionContainerAccess().getParallelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParallel();

                    state._fsp--;

                     after(grammarAccess.getMultipleRegionContainerAccess().getParallelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1598:2: ( ruleAlternative )
                    {
                    // InternalSequence.g:1598:2: ( ruleAlternative )
                    // InternalSequence.g:1599:3: ruleAlternative
                    {
                     before(grammarAccess.getMultipleRegionContainerAccess().getAlternativeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAlternative();

                    state._fsp--;

                     after(grammarAccess.getMultipleRegionContainerAccess().getAlternativeParserRuleCall_1()); 

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
    // $ANTLR end "rule__MultipleRegionContainer__Alternatives"


    // $ANTLR start "rule__Constraint__Alternatives_1"
    // InternalSequence.g:1608:1: rule__Constraint__Alternatives_1 : ( ( ruleTimeConstraint ) | ( ruleDurationConstraint ) );
    public final void rule__Constraint__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1612:1: ( ( ruleTimeConstraint ) | ( ruleDurationConstraint ) )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalSequence.g:1613:2: ( ruleTimeConstraint )
                    {
                    // InternalSequence.g:1613:2: ( ruleTimeConstraint )
                    // InternalSequence.g:1614:3: ruleTimeConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getTimeConstraintParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getTimeConstraintParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1619:2: ( ruleDurationConstraint )
                    {
                    // InternalSequence.g:1619:2: ( ruleDurationConstraint )
                    // InternalSequence.g:1620:3: ruleDurationConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDurationConstraintParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDurationConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getDurationConstraintParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Constraint__Alternatives_1"


    // $ANTLR start "rule__Observation__Alternatives_1"
    // InternalSequence.g:1629:1: rule__Observation__Alternatives_1 : ( ( ruleTimeObservation ) | ( ruleDurationObservation ) );
    public final void rule__Observation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1633:1: ( ( ruleTimeObservation ) | ( ruleDurationObservation ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalSequence.g:1634:2: ( ruleTimeObservation )
                    {
                    // InternalSequence.g:1634:2: ( ruleTimeObservation )
                    // InternalSequence.g:1635:3: ruleTimeObservation
                    {
                     before(grammarAccess.getObservationAccess().getTimeObservationParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeObservation();

                    state._fsp--;

                     after(grammarAccess.getObservationAccess().getTimeObservationParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1640:2: ( ruleDurationObservation )
                    {
                    // InternalSequence.g:1640:2: ( ruleDurationObservation )
                    // InternalSequence.g:1641:3: ruleDurationObservation
                    {
                     before(grammarAccess.getObservationAccess().getDurationObservationParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDurationObservation();

                    state._fsp--;

                     after(grammarAccess.getObservationAccess().getDurationObservationParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Observation__Alternatives_1"


    // $ANTLR start "rule__TimeIntervalSelector__Alternatives"
    // InternalSequence.g:1650:1: rule__TimeIntervalSelector__Alternatives : ( ( ruleBiPointInTimeTimeIntervalSelector ) | ( ruleFragmentTimeIntervalSelector ) );
    public final void rule__TimeIntervalSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1654:1: ( ( ruleBiPointInTimeTimeIntervalSelector ) | ( ruleFragmentTimeIntervalSelector ) )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalSequence.g:1655:2: ( ruleBiPointInTimeTimeIntervalSelector )
                    {
                    // InternalSequence.g:1655:2: ( ruleBiPointInTimeTimeIntervalSelector )
                    // InternalSequence.g:1656:3: ruleBiPointInTimeTimeIntervalSelector
                    {
                     before(grammarAccess.getTimeIntervalSelectorAccess().getBiPointInTimeTimeIntervalSelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBiPointInTimeTimeIntervalSelector();

                    state._fsp--;

                     after(grammarAccess.getTimeIntervalSelectorAccess().getBiPointInTimeTimeIntervalSelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1661:2: ( ruleFragmentTimeIntervalSelector )
                    {
                    // InternalSequence.g:1661:2: ( ruleFragmentTimeIntervalSelector )
                    // InternalSequence.g:1662:3: ruleFragmentTimeIntervalSelector
                    {
                     before(grammarAccess.getTimeIntervalSelectorAccess().getFragmentTimeIntervalSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFragmentTimeIntervalSelector();

                    state._fsp--;

                     after(grammarAccess.getTimeIntervalSelectorAccess().getFragmentTimeIntervalSelectorParserRuleCall_1()); 

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
    // $ANTLR end "rule__TimeIntervalSelector__Alternatives"


    // $ANTLR start "rule__UnescapedString__Alternatives"
    // InternalSequence.g:1671:1: rule__UnescapedString__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__UnescapedString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1675:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSequence.g:1676:2: ( RULE_ID )
                    {
                    // InternalSequence.g:1676:2: ( RULE_ID )
                    // InternalSequence.g:1677:3: RULE_ID
                    {
                     before(grammarAccess.getUnescapedStringAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getUnescapedStringAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1682:2: ( RULE_STRING )
                    {
                    // InternalSequence.g:1682:2: ( RULE_STRING )
                    // InternalSequence.g:1683:3: RULE_STRING
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
    // InternalSequence.g:1692:1: rule__MessageType__Alternatives : ( ( ( 'sync' ) ) | ( ( 'async' ) ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1696:1: ( ( ( 'sync' ) ) | ( ( 'async' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            else if ( (LA20_0==13) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSequence.g:1697:2: ( ( 'sync' ) )
                    {
                    // InternalSequence.g:1697:2: ( ( 'sync' ) )
                    // InternalSequence.g:1698:3: ( 'sync' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1699:3: ( 'sync' )
                    // InternalSequence.g:1699:4: 'sync'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1703:2: ( ( 'async' ) )
                    {
                    // InternalSequence.g:1703:2: ( ( 'async' ) )
                    // InternalSequence.g:1704:3: ( 'async' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getASYNCEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1705:3: ( 'async' )
                    // InternalSequence.g:1705:4: 'async'
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
    // InternalSequence.g:1713:1: rule__ActorType__Alternatives : ( ( ( 'human' ) ) | ( ( 'machine' ) ) );
    public final void rule__ActorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1717:1: ( ( ( 'human' ) ) | ( ( 'machine' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            else if ( (LA21_0==15) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSequence.g:1718:2: ( ( 'human' ) )
                    {
                    // InternalSequence.g:1718:2: ( ( 'human' ) )
                    // InternalSequence.g:1719:3: ( 'human' )
                    {
                     before(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1720:3: ( 'human' )
                    // InternalSequence.g:1720:4: 'human'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1724:2: ( ( 'machine' ) )
                    {
                    // InternalSequence.g:1724:2: ( ( 'machine' ) )
                    // InternalSequence.g:1725:3: ( 'machine' )
                    {
                     before(grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1726:3: ( 'machine' )
                    // InternalSequence.g:1726:4: 'machine'
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


    // $ANTLR start "rule__SequenceDiagram__Group__0"
    // InternalSequence.g:1734:1: rule__SequenceDiagram__Group__0 : rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 ;
    public final void rule__SequenceDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1738:1: ( rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 )
            // InternalSequence.g:1739:2: rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSequence.g:1746:1: rule__SequenceDiagram__Group__0__Impl : ( () ) ;
    public final void rule__SequenceDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1750:1: ( ( () ) )
            // InternalSequence.g:1751:1: ( () )
            {
            // InternalSequence.g:1751:1: ( () )
            // InternalSequence.g:1752:2: ()
            {
             before(grammarAccess.getSequenceDiagramAccess().getSequenceDiagramAction_0()); 
            // InternalSequence.g:1753:2: ()
            // InternalSequence.g:1753:3: 
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
    // InternalSequence.g:1761:1: rule__SequenceDiagram__Group__1 : rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 ;
    public final void rule__SequenceDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1765:1: ( rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 )
            // InternalSequence.g:1766:2: rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSequence.g:1773:1: rule__SequenceDiagram__Group__1__Impl : ( '@start-seqd' ) ;
    public final void rule__SequenceDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1777:1: ( ( '@start-seqd' ) )
            // InternalSequence.g:1778:1: ( '@start-seqd' )
            {
            // InternalSequence.g:1778:1: ( '@start-seqd' )
            // InternalSequence.g:1779:2: '@start-seqd'
            {
             before(grammarAccess.getSequenceDiagramAccess().getStartSeqdKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSequence.g:1788:1: rule__SequenceDiagram__Group__2 : rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 ;
    public final void rule__SequenceDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1792:1: ( rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 )
            // InternalSequence.g:1793:2: rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSequence.g:1800:1: rule__SequenceDiagram__Group__2__Impl : ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) ;
    public final void rule__SequenceDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1804:1: ( ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) )
            // InternalSequence.g:1805:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            {
            // InternalSequence.g:1805:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            // InternalSequence.g:1806:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getTitleAssignment_2()); 
            // InternalSequence.g:1807:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            // InternalSequence.g:1807:3: rule__SequenceDiagram__TitleAssignment_2
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
    // InternalSequence.g:1815:1: rule__SequenceDiagram__Group__3 : rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 ;
    public final void rule__SequenceDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1819:1: ( rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 )
            // InternalSequence.g:1820:2: rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:1827:1: rule__SequenceDiagram__Group__3__Impl : ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__SequenceDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1831:1: ( ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) )
            // InternalSequence.g:1832:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            {
            // InternalSequence.g:1832:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            // InternalSequence.g:1833:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getRootPackageAssignment_3()); 
            // InternalSequence.g:1834:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            // InternalSequence.g:1834:3: rule__SequenceDiagram__RootPackageAssignment_3
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
    // InternalSequence.g:1842:1: rule__SequenceDiagram__Group__4 : rule__SequenceDiagram__Group__4__Impl rule__SequenceDiagram__Group__5 ;
    public final void rule__SequenceDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1846:1: ( rule__SequenceDiagram__Group__4__Impl rule__SequenceDiagram__Group__5 )
            // InternalSequence.g:1847:2: rule__SequenceDiagram__Group__4__Impl rule__SequenceDiagram__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:1854:1: rule__SequenceDiagram__Group__4__Impl : ( ( rule__SequenceDiagram__ActorsAssignment_4 )* ) ;
    public final void rule__SequenceDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1858:1: ( ( ( rule__SequenceDiagram__ActorsAssignment_4 )* ) )
            // InternalSequence.g:1859:1: ( ( rule__SequenceDiagram__ActorsAssignment_4 )* )
            {
            // InternalSequence.g:1859:1: ( ( rule__SequenceDiagram__ActorsAssignment_4 )* )
            // InternalSequence.g:1860:2: ( rule__SequenceDiagram__ActorsAssignment_4 )*
            {
             before(grammarAccess.getSequenceDiagramAccess().getActorsAssignment_4()); 
            // InternalSequence.g:1861:2: ( rule__SequenceDiagram__ActorsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19||LA22_0==49) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSequence.g:1861:3: rule__SequenceDiagram__ActorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SequenceDiagram__ActorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSequence.g:1869:1: rule__SequenceDiagram__Group__5 : rule__SequenceDiagram__Group__5__Impl rule__SequenceDiagram__Group__6 ;
    public final void rule__SequenceDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1873:1: ( rule__SequenceDiagram__Group__5__Impl rule__SequenceDiagram__Group__6 )
            // InternalSequence.g:1874:2: rule__SequenceDiagram__Group__5__Impl rule__SequenceDiagram__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalSequence.g:1881:1: rule__SequenceDiagram__Group__5__Impl : ( ( rule__SequenceDiagram__FragmentsAssignment_5 )* ) ;
    public final void rule__SequenceDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1885:1: ( ( ( rule__SequenceDiagram__FragmentsAssignment_5 )* ) )
            // InternalSequence.g:1886:1: ( ( rule__SequenceDiagram__FragmentsAssignment_5 )* )
            {
            // InternalSequence.g:1886:1: ( ( rule__SequenceDiagram__FragmentsAssignment_5 )* )
            // InternalSequence.g:1887:2: ( rule__SequenceDiagram__FragmentsAssignment_5 )*
            {
             before(grammarAccess.getSequenceDiagramAccess().getFragmentsAssignment_5()); 
            // InternalSequence.g:1888:2: ( rule__SequenceDiagram__FragmentsAssignment_5 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=12 && LA23_0<=13)||LA23_0==28||(LA23_0>=32 && LA23_0<=42)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSequence.g:1888:3: rule__SequenceDiagram__FragmentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SequenceDiagram__FragmentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSequenceDiagramAccess().getFragmentsAssignment_5()); 

            }


            }

        }
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
    // InternalSequence.g:1896:1: rule__SequenceDiagram__Group__6 : rule__SequenceDiagram__Group__6__Impl rule__SequenceDiagram__Group__7 ;
    public final void rule__SequenceDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1900:1: ( rule__SequenceDiagram__Group__6__Impl rule__SequenceDiagram__Group__7 )
            // InternalSequence.g:1901:2: rule__SequenceDiagram__Group__6__Impl rule__SequenceDiagram__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__SequenceDiagram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__7();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:1908:1: rule__SequenceDiagram__Group__6__Impl : ( ( rule__SequenceDiagram__FragmentsAssignment_6 )* ) ;
    public final void rule__SequenceDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1912:1: ( ( ( rule__SequenceDiagram__FragmentsAssignment_6 )* ) )
            // InternalSequence.g:1913:1: ( ( rule__SequenceDiagram__FragmentsAssignment_6 )* )
            {
            // InternalSequence.g:1913:1: ( ( rule__SequenceDiagram__FragmentsAssignment_6 )* )
            // InternalSequence.g:1914:2: ( rule__SequenceDiagram__FragmentsAssignment_6 )*
            {
             before(grammarAccess.getSequenceDiagramAccess().getFragmentsAssignment_6()); 
            // InternalSequence.g:1915:2: ( rule__SequenceDiagram__FragmentsAssignment_6 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==43||LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSequence.g:1915:3: rule__SequenceDiagram__FragmentsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SequenceDiagram__FragmentsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSequenceDiagramAccess().getFragmentsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__SequenceDiagram__Group__7"
    // InternalSequence.g:1923:1: rule__SequenceDiagram__Group__7 : rule__SequenceDiagram__Group__7__Impl ;
    public final void rule__SequenceDiagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1927:1: ( rule__SequenceDiagram__Group__7__Impl )
            // InternalSequence.g:1928:2: rule__SequenceDiagram__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__Group__7"


    // $ANTLR start "rule__SequenceDiagram__Group__7__Impl"
    // InternalSequence.g:1934:1: rule__SequenceDiagram__Group__7__Impl : ( '@end-seqd' ) ;
    public final void rule__SequenceDiagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1938:1: ( ( '@end-seqd' ) )
            // InternalSequence.g:1939:1: ( '@end-seqd' )
            {
            // InternalSequence.g:1939:1: ( '@end-seqd' )
            // InternalSequence.g:1940:2: '@end-seqd'
            {
             before(grammarAccess.getSequenceDiagramAccess().getEndSeqdKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSequenceDiagramAccess().getEndSeqdKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__Group__7__Impl"


    // $ANTLR start "rule__RootPackage__Group__0"
    // InternalSequence.g:1950:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1954:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalSequence.g:1955:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:1962:1: rule__RootPackage__Group__0__Impl : ( 'rootElement' ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1966:1: ( ( 'rootElement' ) )
            // InternalSequence.g:1967:1: ( 'rootElement' )
            {
            // InternalSequence.g:1967:1: ( 'rootElement' )
            // InternalSequence.g:1968:2: 'rootElement'
            {
             before(grammarAccess.getRootPackageAccess().getRootElementKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSequence.g:1977:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1981:1: ( rule__RootPackage__Group__1__Impl )
            // InternalSequence.g:1982:2: rule__RootPackage__Group__1__Impl
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
    // InternalSequence.g:1988:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__NameAssignment_1 ) ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1992:1: ( ( ( rule__RootPackage__NameAssignment_1 ) ) )
            // InternalSequence.g:1993:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            {
            // InternalSequence.g:1993:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            // InternalSequence.g:1994:2: ( rule__RootPackage__NameAssignment_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 
            // InternalSequence.g:1995:2: ( rule__RootPackage__NameAssignment_1 )
            // InternalSequence.g:1995:3: rule__RootPackage__NameAssignment_1
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
    // InternalSequence.g:2004:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2008:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalSequence.g:2009:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
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
    // InternalSequence.g:2016:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__DeferredAssignment_0 )? ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2020:1: ( ( ( rule__Actor__DeferredAssignment_0 )? ) )
            // InternalSequence.g:2021:1: ( ( rule__Actor__DeferredAssignment_0 )? )
            {
            // InternalSequence.g:2021:1: ( ( rule__Actor__DeferredAssignment_0 )? )
            // InternalSequence.g:2022:2: ( rule__Actor__DeferredAssignment_0 )?
            {
             before(grammarAccess.getActorAccess().getDeferredAssignment_0()); 
            // InternalSequence.g:2023:2: ( rule__Actor__DeferredAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSequence.g:2023:3: rule__Actor__DeferredAssignment_0
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
    // InternalSequence.g:2031:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2035:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalSequence.g:2036:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSequence.g:2043:1: rule__Actor__Group__1__Impl : ( 'act' ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2047:1: ( ( 'act' ) )
            // InternalSequence.g:2048:1: ( 'act' )
            {
            // InternalSequence.g:2048:1: ( 'act' )
            // InternalSequence.g:2049:2: 'act'
            {
             before(grammarAccess.getActorAccess().getActKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSequence.g:2058:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2062:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalSequence.g:2063:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSequence.g:2070:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__Alternatives_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2074:1: ( ( ( rule__Actor__Alternatives_2 ) ) )
            // InternalSequence.g:2075:1: ( ( rule__Actor__Alternatives_2 ) )
            {
            // InternalSequence.g:2075:1: ( ( rule__Actor__Alternatives_2 ) )
            // InternalSequence.g:2076:2: ( rule__Actor__Alternatives_2 )
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // InternalSequence.g:2077:2: ( rule__Actor__Alternatives_2 )
            // InternalSequence.g:2077:3: rule__Actor__Alternatives_2
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
    // InternalSequence.g:2085:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2089:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalSequence.g:2090:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Actor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__4();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:2097:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2101:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // InternalSequence.g:2102:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // InternalSequence.g:2102:1: ( ( rule__Actor__Group_3__0 )? )
            // InternalSequence.g:2103:2: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // InternalSequence.g:2104:2: ( rule__Actor__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSequence.g:2104:3: rule__Actor__Group_3__0
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


    // $ANTLR start "rule__Actor__Group__4"
    // InternalSequence.g:2112:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2116:1: ( rule__Actor__Group__4__Impl )
            // InternalSequence.g:2117:2: rule__Actor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4"


    // $ANTLR start "rule__Actor__Group__4__Impl"
    // InternalSequence.g:2123:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__CommentsAssignment_4 )? ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2127:1: ( ( ( rule__Actor__CommentsAssignment_4 )? ) )
            // InternalSequence.g:2128:1: ( ( rule__Actor__CommentsAssignment_4 )? )
            {
            // InternalSequence.g:2128:1: ( ( rule__Actor__CommentsAssignment_4 )? )
            // InternalSequence.g:2129:2: ( rule__Actor__CommentsAssignment_4 )?
            {
             before(grammarAccess.getActorAccess().getCommentsAssignment_4()); 
            // InternalSequence.g:2130:2: ( rule__Actor__CommentsAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSequence.g:2130:3: rule__Actor__CommentsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__CommentsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getCommentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group_2_0__0"
    // InternalSequence.g:2139:1: rule__Actor__Group_2_0__0 : rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 ;
    public final void rule__Actor__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2143:1: ( rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 )
            // InternalSequence.g:2144:2: rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSequence.g:2151:1: rule__Actor__Group_2_0__0__Impl : ( ( rule__Actor__NameAssignment_2_0_0 ) ) ;
    public final void rule__Actor__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2155:1: ( ( ( rule__Actor__NameAssignment_2_0_0 ) ) )
            // InternalSequence.g:2156:1: ( ( rule__Actor__NameAssignment_2_0_0 ) )
            {
            // InternalSequence.g:2156:1: ( ( rule__Actor__NameAssignment_2_0_0 ) )
            // InternalSequence.g:2157:2: ( rule__Actor__NameAssignment_2_0_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_0_0()); 
            // InternalSequence.g:2158:2: ( rule__Actor__NameAssignment_2_0_0 )
            // InternalSequence.g:2158:3: rule__Actor__NameAssignment_2_0_0
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
    // InternalSequence.g:2166:1: rule__Actor__Group_2_0__1 : rule__Actor__Group_2_0__1__Impl ;
    public final void rule__Actor__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2170:1: ( rule__Actor__Group_2_0__1__Impl )
            // InternalSequence.g:2171:2: rule__Actor__Group_2_0__1__Impl
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
    // InternalSequence.g:2177:1: rule__Actor__Group_2_0__1__Impl : ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? ) ;
    public final void rule__Actor__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2181:1: ( ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? ) )
            // InternalSequence.g:2182:1: ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? )
            {
            // InternalSequence.g:2182:1: ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? )
            // InternalSequence.g:2183:2: ( rule__Actor__TypeMappingAssignment_2_0_1 )?
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_0_1()); 
            // InternalSequence.g:2184:2: ( rule__Actor__TypeMappingAssignment_2_0_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSequence.g:2184:3: rule__Actor__TypeMappingAssignment_2_0_1
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
    // InternalSequence.g:2193:1: rule__Actor__Group_2_1__0 : rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 ;
    public final void rule__Actor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2197:1: ( rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 )
            // InternalSequence.g:2198:2: rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1
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
    // InternalSequence.g:2205:1: rule__Actor__Group_2_1__0__Impl : ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) ) ;
    public final void rule__Actor__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2209:1: ( ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) ) )
            // InternalSequence.g:2210:1: ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) )
            {
            // InternalSequence.g:2210:1: ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) )
            // InternalSequence.g:2211:2: ( rule__Actor__TypeMappingAssignment_2_1_0 )
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_1_0()); 
            // InternalSequence.g:2212:2: ( rule__Actor__TypeMappingAssignment_2_1_0 )
            // InternalSequence.g:2212:3: rule__Actor__TypeMappingAssignment_2_1_0
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
    // InternalSequence.g:2220:1: rule__Actor__Group_2_1__1 : rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 ;
    public final void rule__Actor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2224:1: ( rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 )
            // InternalSequence.g:2225:2: rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:2232:1: rule__Actor__Group_2_1__1__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2236:1: ( ( 'as' ) )
            // InternalSequence.g:2237:1: ( 'as' )
            {
            // InternalSequence.g:2237:1: ( 'as' )
            // InternalSequence.g:2238:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_2_1_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSequence.g:2247:1: rule__Actor__Group_2_1__2 : rule__Actor__Group_2_1__2__Impl ;
    public final void rule__Actor__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2251:1: ( rule__Actor__Group_2_1__2__Impl )
            // InternalSequence.g:2252:2: rule__Actor__Group_2_1__2__Impl
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
    // InternalSequence.g:2258:1: rule__Actor__Group_2_1__2__Impl : ( ( rule__Actor__AliasAssignment_2_1_2 ) ) ;
    public final void rule__Actor__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2262:1: ( ( ( rule__Actor__AliasAssignment_2_1_2 ) ) )
            // InternalSequence.g:2263:1: ( ( rule__Actor__AliasAssignment_2_1_2 ) )
            {
            // InternalSequence.g:2263:1: ( ( rule__Actor__AliasAssignment_2_1_2 ) )
            // InternalSequence.g:2264:2: ( rule__Actor__AliasAssignment_2_1_2 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_1_2()); 
            // InternalSequence.g:2265:2: ( rule__Actor__AliasAssignment_2_1_2 )
            // InternalSequence.g:2265:3: rule__Actor__AliasAssignment_2_1_2
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
    // InternalSequence.g:2274:1: rule__Actor__Group_2_2__0 : rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 ;
    public final void rule__Actor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2278:1: ( rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 )
            // InternalSequence.g:2279:2: rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSequence.g:2286:1: rule__Actor__Group_2_2__0__Impl : ( ( rule__Actor__NameAssignment_2_2_0 ) ) ;
    public final void rule__Actor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2290:1: ( ( ( rule__Actor__NameAssignment_2_2_0 ) ) )
            // InternalSequence.g:2291:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            {
            // InternalSequence.g:2291:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            // InternalSequence.g:2292:2: ( rule__Actor__NameAssignment_2_2_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_2_0()); 
            // InternalSequence.g:2293:2: ( rule__Actor__NameAssignment_2_2_0 )
            // InternalSequence.g:2293:3: rule__Actor__NameAssignment_2_2_0
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
    // InternalSequence.g:2301:1: rule__Actor__Group_2_2__1 : rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 ;
    public final void rule__Actor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2305:1: ( rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 )
            // InternalSequence.g:2306:2: rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSequence.g:2313:1: rule__Actor__Group_2_2__1__Impl : ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? ) ;
    public final void rule__Actor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2317:1: ( ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? ) )
            // InternalSequence.g:2318:1: ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? )
            {
            // InternalSequence.g:2318:1: ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? )
            // InternalSequence.g:2319:2: ( rule__Actor__TypeMappingAssignment_2_2_1 )?
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_2_1()); 
            // InternalSequence.g:2320:2: ( rule__Actor__TypeMappingAssignment_2_2_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSequence.g:2320:3: rule__Actor__TypeMappingAssignment_2_2_1
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
    // InternalSequence.g:2328:1: rule__Actor__Group_2_2__2 : rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 ;
    public final void rule__Actor__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2332:1: ( rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 )
            // InternalSequence.g:2333:2: rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:2340:1: rule__Actor__Group_2_2__2__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2344:1: ( ( 'as' ) )
            // InternalSequence.g:2345:1: ( 'as' )
            {
            // InternalSequence.g:2345:1: ( 'as' )
            // InternalSequence.g:2346:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_2_2_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSequence.g:2355:1: rule__Actor__Group_2_2__3 : rule__Actor__Group_2_2__3__Impl ;
    public final void rule__Actor__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2359:1: ( rule__Actor__Group_2_2__3__Impl )
            // InternalSequence.g:2360:2: rule__Actor__Group_2_2__3__Impl
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
    // InternalSequence.g:2366:1: rule__Actor__Group_2_2__3__Impl : ( ( rule__Actor__AliasAssignment_2_2_3 ) ) ;
    public final void rule__Actor__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2370:1: ( ( ( rule__Actor__AliasAssignment_2_2_3 ) ) )
            // InternalSequence.g:2371:1: ( ( rule__Actor__AliasAssignment_2_2_3 ) )
            {
            // InternalSequence.g:2371:1: ( ( rule__Actor__AliasAssignment_2_2_3 ) )
            // InternalSequence.g:2372:2: ( rule__Actor__AliasAssignment_2_2_3 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_2_3()); 
            // InternalSequence.g:2373:2: ( rule__Actor__AliasAssignment_2_2_3 )
            // InternalSequence.g:2373:3: rule__Actor__AliasAssignment_2_2_3
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
    // InternalSequence.g:2382:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2386:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // InternalSequence.g:2387:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSequence.g:2394:1: rule__Actor__Group_3__0__Impl : ( 'role[' ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2398:1: ( ( 'role[' ) )
            // InternalSequence.g:2399:1: ( 'role[' )
            {
            // InternalSequence.g:2399:1: ( 'role[' )
            // InternalSequence.g:2400:2: 'role['
            {
             before(grammarAccess.getActorAccess().getRoleKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSequence.g:2409:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2413:1: ( rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 )
            // InternalSequence.g:2414:2: rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSequence.g:2421:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2425:1: ( ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) )
            // InternalSequence.g:2426:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            {
            // InternalSequence.g:2426:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            // InternalSequence.g:2427:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            {
             before(grammarAccess.getActorAccess().getActorTypeAssignment_3_1()); 
            // InternalSequence.g:2428:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            // InternalSequence.g:2428:3: rule__Actor__ActorTypeAssignment_3_1
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
    // InternalSequence.g:2436:1: rule__Actor__Group_3__2 : rule__Actor__Group_3__2__Impl ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2440:1: ( rule__Actor__Group_3__2__Impl )
            // InternalSequence.g:2441:2: rule__Actor__Group_3__2__Impl
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
    // InternalSequence.g:2447:1: rule__Actor__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Actor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2451:1: ( ( ']' ) )
            // InternalSequence.g:2452:1: ( ']' )
            {
            // InternalSequence.g:2452:1: ( ']' )
            // InternalSequence.g:2453:2: ']'
            {
             before(grammarAccess.getActorAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSequence.g:2463:1: rule__ActorClassifierMapping__Group__0 : rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1 ;
    public final void rule__ActorClassifierMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2467:1: ( rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1 )
            // InternalSequence.g:2468:2: rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:2475:1: rule__ActorClassifierMapping__Group__0__Impl : ( ':' ) ;
    public final void rule__ActorClassifierMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2479:1: ( ( ':' ) )
            // InternalSequence.g:2480:1: ( ':' )
            {
            // InternalSequence.g:2480:1: ( ':' )
            // InternalSequence.g:2481:2: ':'
            {
             before(grammarAccess.getActorClassifierMappingAccess().getColonKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSequence.g:2490:1: rule__ActorClassifierMapping__Group__1 : rule__ActorClassifierMapping__Group__1__Impl ;
    public final void rule__ActorClassifierMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2494:1: ( rule__ActorClassifierMapping__Group__1__Impl )
            // InternalSequence.g:2495:2: rule__ActorClassifierMapping__Group__1__Impl
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
    // InternalSequence.g:2501:1: rule__ActorClassifierMapping__Group__1__Impl : ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) ) ;
    public final void rule__ActorClassifierMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2505:1: ( ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) ) )
            // InternalSequence.g:2506:1: ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) )
            {
            // InternalSequence.g:2506:1: ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) )
            // InternalSequence.g:2507:2: ( rule__ActorClassifierMapping__ClassifierAssignment_1 )
            {
             before(grammarAccess.getActorClassifierMappingAccess().getClassifierAssignment_1()); 
            // InternalSequence.g:2508:2: ( rule__ActorClassifierMapping__ClassifierAssignment_1 )
            // InternalSequence.g:2508:3: rule__ActorClassifierMapping__ClassifierAssignment_1
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


    // $ANTLR start "rule__OrderedFragmentContainer__Group_0__0"
    // InternalSequence.g:2517:1: rule__OrderedFragmentContainer__Group_0__0 : rule__OrderedFragmentContainer__Group_0__0__Impl rule__OrderedFragmentContainer__Group_0__1 ;
    public final void rule__OrderedFragmentContainer__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2521:1: ( rule__OrderedFragmentContainer__Group_0__0__Impl rule__OrderedFragmentContainer__Group_0__1 )
            // InternalSequence.g:2522:2: rule__OrderedFragmentContainer__Group_0__0__Impl rule__OrderedFragmentContainer__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__OrderedFragmentContainer__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainer__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainer__Group_0__0"


    // $ANTLR start "rule__OrderedFragmentContainer__Group_0__0__Impl"
    // InternalSequence.g:2529:1: rule__OrderedFragmentContainer__Group_0__0__Impl : ( '{' ) ;
    public final void rule__OrderedFragmentContainer__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2533:1: ( ( '{' ) )
            // InternalSequence.g:2534:1: ( '{' )
            {
            // InternalSequence.g:2534:1: ( '{' )
            // InternalSequence.g:2535:2: '{'
            {
             before(grammarAccess.getOrderedFragmentContainerAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderedFragmentContainerAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainer__Group_0__0__Impl"


    // $ANTLR start "rule__OrderedFragmentContainer__Group_0__1"
    // InternalSequence.g:2544:1: rule__OrderedFragmentContainer__Group_0__1 : rule__OrderedFragmentContainer__Group_0__1__Impl rule__OrderedFragmentContainer__Group_0__2 ;
    public final void rule__OrderedFragmentContainer__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2548:1: ( rule__OrderedFragmentContainer__Group_0__1__Impl rule__OrderedFragmentContainer__Group_0__2 )
            // InternalSequence.g:2549:2: rule__OrderedFragmentContainer__Group_0__1__Impl rule__OrderedFragmentContainer__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__OrderedFragmentContainer__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainer__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainer__Group_0__1"


    // $ANTLR start "rule__OrderedFragmentContainer__Group_0__1__Impl"
    // InternalSequence.g:2556:1: rule__OrderedFragmentContainer__Group_0__1__Impl : ( ruleOneOrMultipleFragments ) ;
    public final void rule__OrderedFragmentContainer__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2560:1: ( ( ruleOneOrMultipleFragments ) )
            // InternalSequence.g:2561:1: ( ruleOneOrMultipleFragments )
            {
            // InternalSequence.g:2561:1: ( ruleOneOrMultipleFragments )
            // InternalSequence.g:2562:2: ruleOneOrMultipleFragments
            {
             before(grammarAccess.getOrderedFragmentContainerAccess().getOneOrMultipleFragmentsParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleOneOrMultipleFragments();

            state._fsp--;

             after(grammarAccess.getOrderedFragmentContainerAccess().getOneOrMultipleFragmentsParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainer__Group_0__1__Impl"


    // $ANTLR start "rule__OrderedFragmentContainer__Group_0__2"
    // InternalSequence.g:2571:1: rule__OrderedFragmentContainer__Group_0__2 : rule__OrderedFragmentContainer__Group_0__2__Impl ;
    public final void rule__OrderedFragmentContainer__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2575:1: ( rule__OrderedFragmentContainer__Group_0__2__Impl )
            // InternalSequence.g:2576:2: rule__OrderedFragmentContainer__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainer__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainer__Group_0__2"


    // $ANTLR start "rule__OrderedFragmentContainer__Group_0__2__Impl"
    // InternalSequence.g:2582:1: rule__OrderedFragmentContainer__Group_0__2__Impl : ( '}' ) ;
    public final void rule__OrderedFragmentContainer__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2586:1: ( ( '}' ) )
            // InternalSequence.g:2587:1: ( '}' )
            {
            // InternalSequence.g:2587:1: ( '}' )
            // InternalSequence.g:2588:2: '}'
            {
             before(grammarAccess.getOrderedFragmentContainerAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOrderedFragmentContainerAccess().getRightCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainer__Group_0__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalSequence.g:2598:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2602:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalSequence.g:2603:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSequence.g:2610:1: rule__Condition__Group__0__Impl : ( '[' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2614:1: ( ( '[' ) )
            // InternalSequence.g:2615:1: ( '[' )
            {
            // InternalSequence.g:2615:1: ( '[' )
            // InternalSequence.g:2616:2: '['
            {
             before(grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
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
    // InternalSequence.g:2625:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2629:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalSequence.g:2630:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSequence.g:2637:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ConditionAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2641:1: ( ( ( rule__Condition__ConditionAssignment_1 ) ) )
            // InternalSequence.g:2642:1: ( ( rule__Condition__ConditionAssignment_1 ) )
            {
            // InternalSequence.g:2642:1: ( ( rule__Condition__ConditionAssignment_1 ) )
            // InternalSequence.g:2643:2: ( rule__Condition__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_1()); 
            // InternalSequence.g:2644:2: ( rule__Condition__ConditionAssignment_1 )
            // InternalSequence.g:2644:3: rule__Condition__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionAssignment_1()); 

            }


            }

        }
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
    // InternalSequence.g:2652:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2656:1: ( rule__Condition__Group__2__Impl )
            // InternalSequence.g:2657:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:2663:1: rule__Condition__Group__2__Impl : ( ']' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2667:1: ( ( ']' ) )
            // InternalSequence.g:2668:1: ( ']' )
            {
            // InternalSequence.g:2668:1: ( ']' )
            // InternalSequence.g:2669:2: ']'
            {
             before(grammarAccess.getConditionAccess().getRightSquareBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Group__0"
    // InternalSequence.g:2679:1: rule__OrderedFragmentContainerWithCondition__Group__0 : rule__OrderedFragmentContainerWithCondition__Group__0__Impl rule__OrderedFragmentContainerWithCondition__Group__1 ;
    public final void rule__OrderedFragmentContainerWithCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2683:1: ( rule__OrderedFragmentContainerWithCondition__Group__0__Impl rule__OrderedFragmentContainerWithCondition__Group__1 )
            // InternalSequence.g:2684:2: rule__OrderedFragmentContainerWithCondition__Group__0__Impl rule__OrderedFragmentContainerWithCondition__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__OrderedFragmentContainerWithCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Group__0"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Group__0__Impl"
    // InternalSequence.g:2691:1: rule__OrderedFragmentContainerWithCondition__Group__0__Impl : ( ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 ) ) ;
    public final void rule__OrderedFragmentContainerWithCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2695:1: ( ( ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 ) ) )
            // InternalSequence.g:2696:1: ( ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 ) )
            {
            // InternalSequence.g:2696:1: ( ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 ) )
            // InternalSequence.g:2697:2: ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getConditionAssignment_0()); 
            // InternalSequence.g:2698:2: ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 )
            // InternalSequence.g:2698:3: rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getConditionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Group__0__Impl"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Group__1"
    // InternalSequence.g:2706:1: rule__OrderedFragmentContainerWithCondition__Group__1 : rule__OrderedFragmentContainerWithCondition__Group__1__Impl ;
    public final void rule__OrderedFragmentContainerWithCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2710:1: ( rule__OrderedFragmentContainerWithCondition__Group__1__Impl )
            // InternalSequence.g:2711:2: rule__OrderedFragmentContainerWithCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Group__1"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Group__1__Impl"
    // InternalSequence.g:2717:1: rule__OrderedFragmentContainerWithCondition__Group__1__Impl : ( ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 ) ) ;
    public final void rule__OrderedFragmentContainerWithCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2721:1: ( ( ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 ) ) )
            // InternalSequence.g:2722:1: ( ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 ) )
            {
            // InternalSequence.g:2722:1: ( ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 ) )
            // InternalSequence.g:2723:2: ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getAlternatives_1()); 
            // InternalSequence.g:2724:2: ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 )
            // InternalSequence.g:2724:3: rule__OrderedFragmentContainerWithCondition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithCondition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Group__1__Impl"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Group_1_0__0"
    // InternalSequence.g:2733:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__0 : rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__1 ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2737:1: ( rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__1 )
            // InternalSequence.g:2738:2: rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__1
            {
            pushFollow(FOLLOW_19);
            rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithCondition__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Group_1_0__0"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl"
    // InternalSequence.g:2745:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2749:1: ( ( '{' ) )
            // InternalSequence.g:2750:1: ( '{' )
            {
            // InternalSequence.g:2750:1: ( '{' )
            // InternalSequence.g:2751:2: '{'
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getLeftCurlyBracketKeyword_1_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getLeftCurlyBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Group_1_0__1"
    // InternalSequence.g:2760:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__1 : rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__2 ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2764:1: ( rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__2 )
            // InternalSequence.g:2765:2: rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
            rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithCondition__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Group_1_0__1"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl"
    // InternalSequence.g:2772:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl : ( ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) ) ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* ) ) ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2776:1: ( ( ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) ) ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* ) ) )
            // InternalSequence.g:2777:1: ( ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) ) ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* ) )
            {
            // InternalSequence.g:2777:1: ( ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) ) ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* ) )
            // InternalSequence.g:2778:2: ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) ) ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* )
            {
            // InternalSequence.g:2778:2: ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) )
            // InternalSequence.g:2779:3: ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_0_1()); 
            // InternalSequence.g:2780:3: ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )
            // InternalSequence.g:2780:4: rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1
            {
            pushFollow(FOLLOW_3);
            rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_0_1()); 

            }

            // InternalSequence.g:2783:2: ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* )
            // InternalSequence.g:2784:3: ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )*
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_0_1()); 
            // InternalSequence.g:2785:3: ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=12 && LA30_0<=13)||LA30_0==28||(LA30_0>=32 && LA30_0<=42)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSequence.g:2785:4: rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_0_1()); 

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
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Group_1_0__2"
    // InternalSequence.g:2794:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__2 : rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2798:1: ( rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl )
            // InternalSequence.g:2799:2: rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Group_1_0__2"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl"
    // InternalSequence.g:2805:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2809:1: ( ( '}' ) )
            // InternalSequence.g:2810:1: ( '}' )
            {
            // InternalSequence.g:2810:1: ( '}' )
            // InternalSequence.g:2811:2: '}'
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getRightCurlyBracketKeyword_1_0_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getRightCurlyBracketKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl"


    // $ANTLR start "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0"
    // InternalSequence.g:2821:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0 : rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1 ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2825:1: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1 )
            // InternalSequence.g:2826:2: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0"


    // $ANTLR start "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl"
    // InternalSequence.g:2833:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl : ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 ) ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2837:1: ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 ) ) )
            // InternalSequence.g:2838:1: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 ) )
            {
            // InternalSequence.g:2838:1: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 ) )
            // InternalSequence.g:2839:2: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getConditionAssignment_0()); 
            // InternalSequence.g:2840:2: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 )
            // InternalSequence.g:2840:3: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getConditionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl"


    // $ANTLR start "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1"
    // InternalSequence.g:2848:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1 : rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2 ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2852:1: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2 )
            // InternalSequence.g:2853:2: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1"


    // $ANTLR start "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl"
    // InternalSequence.g:2860:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl : ( '{' ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2864:1: ( ( '{' ) )
            // InternalSequence.g:2865:1: ( '{' )
            {
            // InternalSequence.g:2865:1: ( '{' )
            // InternalSequence.g:2866:2: '{'
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl"


    // $ANTLR start "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2"
    // InternalSequence.g:2875:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2 : rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3 ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2879:1: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3 )
            // InternalSequence.g:2880:2: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2"


    // $ANTLR start "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl"
    // InternalSequence.g:2887:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl : ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) ) ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* ) ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2891:1: ( ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) ) ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* ) ) )
            // InternalSequence.g:2892:1: ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) ) ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* ) )
            {
            // InternalSequence.g:2892:1: ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) ) ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* ) )
            // InternalSequence.g:2893:2: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) ) ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* )
            {
            // InternalSequence.g:2893:2: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) )
            // InternalSequence.g:2894:3: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:2895:3: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )
            // InternalSequence.g:2895:4: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_3);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsAssignment_2()); 

            }

            // InternalSequence.g:2898:2: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* )
            // InternalSequence.g:2899:3: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )*
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:2900:3: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=12 && LA31_0<=13)||LA31_0==28||(LA31_0>=32 && LA31_0<=42)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSequence.g:2900:4: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsAssignment_2()); 

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
    // $ANTLR end "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl"


    // $ANTLR start "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3"
    // InternalSequence.g:2909:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3 : rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2913:1: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl )
            // InternalSequence.g:2914:2: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3"


    // $ANTLR start "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl"
    // InternalSequence.g:2920:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl : ( '}' ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2924:1: ( ( '}' ) )
            // InternalSequence.g:2925:1: ( '}' )
            {
            // InternalSequence.g:2925:1: ( '}' )
            // InternalSequence.g:2926:2: '}'
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalSequence.g:2936:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2940:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalSequence.g:2941:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSequence.g:2948:1: rule__Message__Group__0__Impl : ( ( rule__Message__Alternatives_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2952:1: ( ( ( rule__Message__Alternatives_0 ) ) )
            // InternalSequence.g:2953:1: ( ( rule__Message__Alternatives_0 ) )
            {
            // InternalSequence.g:2953:1: ( ( rule__Message__Alternatives_0 ) )
            // InternalSequence.g:2954:2: ( rule__Message__Alternatives_0 )
            {
             before(grammarAccess.getMessageAccess().getAlternatives_0()); 
            // InternalSequence.g:2955:2: ( rule__Message__Alternatives_0 )
            // InternalSequence.g:2955:3: rule__Message__Alternatives_0
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
    // InternalSequence.g:2963:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2967:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalSequence.g:2968:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSequence.g:2975:1: rule__Message__Group__1__Impl : ( ( rule__Message__Group_1__0 )? ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2979:1: ( ( ( rule__Message__Group_1__0 )? ) )
            // InternalSequence.g:2980:1: ( ( rule__Message__Group_1__0 )? )
            {
            // InternalSequence.g:2980:1: ( ( rule__Message__Group_1__0 )? )
            // InternalSequence.g:2981:2: ( rule__Message__Group_1__0 )?
            {
             before(grammarAccess.getMessageAccess().getGroup_1()); 
            // InternalSequence.g:2982:2: ( rule__Message__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSequence.g:2982:3: rule__Message__Group_1__0
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
    // InternalSequence.g:2990:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2994:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalSequence.g:2995:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Message__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:3002:1: rule__Message__Group__2__Impl : ( ( rule__Message__SendEventAssignment_2 ) ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3006:1: ( ( ( rule__Message__SendEventAssignment_2 ) ) )
            // InternalSequence.g:3007:1: ( ( rule__Message__SendEventAssignment_2 ) )
            {
            // InternalSequence.g:3007:1: ( ( rule__Message__SendEventAssignment_2 ) )
            // InternalSequence.g:3008:2: ( rule__Message__SendEventAssignment_2 )
            {
             before(grammarAccess.getMessageAccess().getSendEventAssignment_2()); 
            // InternalSequence.g:3009:2: ( rule__Message__SendEventAssignment_2 )
            // InternalSequence.g:3009:3: rule__Message__SendEventAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Message__SendEventAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getSendEventAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Message__Group__3"
    // InternalSequence.g:3017:1: rule__Message__Group__3 : rule__Message__Group__3__Impl ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3021:1: ( rule__Message__Group__3__Impl )
            // InternalSequence.g:3022:2: rule__Message__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // InternalSequence.g:3028:1: rule__Message__Group__3__Impl : ( ( rule__Message__Alternatives_3 ) ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3032:1: ( ( ( rule__Message__Alternatives_3 ) ) )
            // InternalSequence.g:3033:1: ( ( rule__Message__Alternatives_3 ) )
            {
            // InternalSequence.g:3033:1: ( ( rule__Message__Alternatives_3 ) )
            // InternalSequence.g:3034:2: ( rule__Message__Alternatives_3 )
            {
             before(grammarAccess.getMessageAccess().getAlternatives_3()); 
            // InternalSequence.g:3035:2: ( rule__Message__Alternatives_3 )
            // InternalSequence.g:3035:3: rule__Message__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Message__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group_1__0"
    // InternalSequence.g:3044:1: rule__Message__Group_1__0 : rule__Message__Group_1__0__Impl rule__Message__Group_1__1 ;
    public final void rule__Message__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3048:1: ( rule__Message__Group_1__0__Impl rule__Message__Group_1__1 )
            // InternalSequence.g:3049:2: rule__Message__Group_1__0__Impl rule__Message__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:3056:1: rule__Message__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__Message__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3060:1: ( ( 'as' ) )
            // InternalSequence.g:3061:1: ( 'as' )
            {
            // InternalSequence.g:3061:1: ( 'as' )
            // InternalSequence.g:3062:2: 'as'
            {
             before(grammarAccess.getMessageAccess().getAsKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getAsKeyword_1_0()); 

            }


            }

        }
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
    // InternalSequence.g:3071:1: rule__Message__Group_1__1 : rule__Message__Group_1__1__Impl ;
    public final void rule__Message__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3075:1: ( rule__Message__Group_1__1__Impl )
            // InternalSequence.g:3076:2: rule__Message__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:3082:1: rule__Message__Group_1__1__Impl : ( ( rule__Message__AliasAssignment_1_1 ) ) ;
    public final void rule__Message__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3086:1: ( ( ( rule__Message__AliasAssignment_1_1 ) ) )
            // InternalSequence.g:3087:1: ( ( rule__Message__AliasAssignment_1_1 ) )
            {
            // InternalSequence.g:3087:1: ( ( rule__Message__AliasAssignment_1_1 ) )
            // InternalSequence.g:3088:2: ( rule__Message__AliasAssignment_1_1 )
            {
             before(grammarAccess.getMessageAccess().getAliasAssignment_1_1()); 
            // InternalSequence.g:3089:2: ( rule__Message__AliasAssignment_1_1 )
            // InternalSequence.g:3089:3: rule__Message__AliasAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__AliasAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getAliasAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__Group__0"
    // InternalSequence.g:3098:1: rule__ExplicitArrivalOccurenceReference__Group__0 : rule__ExplicitArrivalOccurenceReference__Group__0__Impl rule__ExplicitArrivalOccurenceReference__Group__1 ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3102:1: ( rule__ExplicitArrivalOccurenceReference__Group__0__Impl rule__ExplicitArrivalOccurenceReference__Group__1 )
            // InternalSequence.g:3103:2: rule__ExplicitArrivalOccurenceReference__Group__0__Impl rule__ExplicitArrivalOccurenceReference__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ExplicitArrivalOccurenceReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceReference__Group__0"


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__Group__0__Impl"
    // InternalSequence.g:3110:1: rule__ExplicitArrivalOccurenceReference__Group__0__Impl : ( 'arrives' ) ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3114:1: ( ( 'arrives' ) )
            // InternalSequence.g:3115:1: ( 'arrives' )
            {
            // InternalSequence.g:3115:1: ( 'arrives' )
            // InternalSequence.g:3116:2: 'arrives'
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getArrivesKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getArrivesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceReference__Group__0__Impl"


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__Group__1"
    // InternalSequence.g:3125:1: rule__ExplicitArrivalOccurenceReference__Group__1 : rule__ExplicitArrivalOccurenceReference__Group__1__Impl rule__ExplicitArrivalOccurenceReference__Group__2 ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3129:1: ( rule__ExplicitArrivalOccurenceReference__Group__1__Impl rule__ExplicitArrivalOccurenceReference__Group__2 )
            // InternalSequence.g:3130:2: rule__ExplicitArrivalOccurenceReference__Group__1__Impl rule__ExplicitArrivalOccurenceReference__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ExplicitArrivalOccurenceReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceReference__Group__1"


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__Group__1__Impl"
    // InternalSequence.g:3137:1: rule__ExplicitArrivalOccurenceReference__Group__1__Impl : ( '[' ) ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3141:1: ( ( '[' ) )
            // InternalSequence.g:3142:1: ( '[' )
            {
            // InternalSequence.g:3142:1: ( '[' )
            // InternalSequence.g:3143:2: '['
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceReference__Group__1__Impl"


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__Group__2"
    // InternalSequence.g:3152:1: rule__ExplicitArrivalOccurenceReference__Group__2 : rule__ExplicitArrivalOccurenceReference__Group__2__Impl rule__ExplicitArrivalOccurenceReference__Group__3 ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3156:1: ( rule__ExplicitArrivalOccurenceReference__Group__2__Impl rule__ExplicitArrivalOccurenceReference__Group__3 )
            // InternalSequence.g:3157:2: rule__ExplicitArrivalOccurenceReference__Group__2__Impl rule__ExplicitArrivalOccurenceReference__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ExplicitArrivalOccurenceReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceReference__Group__2"


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__Group__2__Impl"
    // InternalSequence.g:3164:1: rule__ExplicitArrivalOccurenceReference__Group__2__Impl : ( ( rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2 ) ) ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3168:1: ( ( ( rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2 ) ) )
            // InternalSequence.g:3169:1: ( ( rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2 ) )
            {
            // InternalSequence.g:3169:1: ( ( rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2 ) )
            // InternalSequence.g:3170:2: ( rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2 )
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getOccurenceSpecificationAssignment_2()); 
            // InternalSequence.g:3171:2: ( rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2 )
            // InternalSequence.g:3171:3: rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getOccurenceSpecificationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceReference__Group__2__Impl"


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__Group__3"
    // InternalSequence.g:3179:1: rule__ExplicitArrivalOccurenceReference__Group__3 : rule__ExplicitArrivalOccurenceReference__Group__3__Impl ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3183:1: ( rule__ExplicitArrivalOccurenceReference__Group__3__Impl )
            // InternalSequence.g:3184:2: rule__ExplicitArrivalOccurenceReference__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceReference__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceReference__Group__3"


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__Group__3__Impl"
    // InternalSequence.g:3190:1: rule__ExplicitArrivalOccurenceReference__Group__3__Impl : ( ']' ) ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3194:1: ( ( ']' ) )
            // InternalSequence.g:3195:1: ( ']' )
            {
            // InternalSequence.g:3195:1: ( ']' )
            // InternalSequence.g:3196:2: ']'
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getRightSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceReference__Group__3__Impl"


    // $ANTLR start "rule__ExplicitArrivalOccurenceSpecification__Group__0"
    // InternalSequence.g:3206:1: rule__ExplicitArrivalOccurenceSpecification__Group__0 : rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl rule__ExplicitArrivalOccurenceSpecification__Group__1 ;
    public final void rule__ExplicitArrivalOccurenceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3210:1: ( rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl rule__ExplicitArrivalOccurenceSpecification__Group__1 )
            // InternalSequence.g:3211:2: rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl rule__ExplicitArrivalOccurenceSpecification__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceSpecification__Group__0"


    // $ANTLR start "rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl"
    // InternalSequence.g:3218:1: rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl : ( 'arrival' ) ;
    public final void rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3222:1: ( ( 'arrival' ) )
            // InternalSequence.g:3223:1: ( 'arrival' )
            {
            // InternalSequence.g:3223:1: ( 'arrival' )
            // InternalSequence.g:3224:2: 'arrival'
            {
             before(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getArrivalKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getArrivalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl"


    // $ANTLR start "rule__ExplicitArrivalOccurenceSpecification__Group__1"
    // InternalSequence.g:3233:1: rule__ExplicitArrivalOccurenceSpecification__Group__1 : rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl ;
    public final void rule__ExplicitArrivalOccurenceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3237:1: ( rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl )
            // InternalSequence.g:3238:2: rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceSpecification__Group__1"


    // $ANTLR start "rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl"
    // InternalSequence.g:3244:1: rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl : ( ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 ) ) ;
    public final void rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3248:1: ( ( ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 ) ) )
            // InternalSequence.g:3249:1: ( ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 ) )
            {
            // InternalSequence.g:3249:1: ( ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 ) )
            // InternalSequence.g:3250:2: ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getNameAssignment_1()); 
            // InternalSequence.g:3251:2: ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 )
            // InternalSequence.g:3251:3: rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl"


    // $ANTLR start "rule__StandardMessage__Group__0"
    // InternalSequence.g:3260:1: rule__StandardMessage__Group__0 : rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 ;
    public final void rule__StandardMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3264:1: ( rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 )
            // InternalSequence.g:3265:2: rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSequence.g:3272:1: rule__StandardMessage__Group__0__Impl : ( ( rule__StandardMessage__TypeAssignment_0 ) ) ;
    public final void rule__StandardMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3276:1: ( ( ( rule__StandardMessage__TypeAssignment_0 ) ) )
            // InternalSequence.g:3277:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            {
            // InternalSequence.g:3277:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            // InternalSequence.g:3278:2: ( rule__StandardMessage__TypeAssignment_0 )
            {
             before(grammarAccess.getStandardMessageAccess().getTypeAssignment_0()); 
            // InternalSequence.g:3279:2: ( rule__StandardMessage__TypeAssignment_0 )
            // InternalSequence.g:3279:3: rule__StandardMessage__TypeAssignment_0
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
    // InternalSequence.g:3287:1: rule__StandardMessage__Group__1 : rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 ;
    public final void rule__StandardMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3291:1: ( rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 )
            // InternalSequence.g:3292:2: rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2
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
    // InternalSequence.g:3299:1: rule__StandardMessage__Group__1__Impl : ( ( rule__StandardMessage__NameAssignment_1 ) ) ;
    public final void rule__StandardMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3303:1: ( ( ( rule__StandardMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:3304:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:3304:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            // InternalSequence.g:3305:2: ( rule__StandardMessage__NameAssignment_1 )
            {
             before(grammarAccess.getStandardMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3306:2: ( rule__StandardMessage__NameAssignment_1 )
            // InternalSequence.g:3306:3: rule__StandardMessage__NameAssignment_1
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
    // InternalSequence.g:3314:1: rule__StandardMessage__Group__2 : rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 ;
    public final void rule__StandardMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3318:1: ( rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 )
            // InternalSequence.g:3319:2: rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:3326:1: rule__StandardMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__StandardMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3330:1: ( ( '(' ) )
            // InternalSequence.g:3331:1: ( '(' )
            {
            // InternalSequence.g:3331:1: ( '(' )
            // InternalSequence.g:3332:2: '('
            {
             before(grammarAccess.getStandardMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSequence.g:3341:1: rule__StandardMessage__Group__3 : rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 ;
    public final void rule__StandardMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3345:1: ( rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 )
            // InternalSequence.g:3346:2: rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4
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
    // InternalSequence.g:3353:1: rule__StandardMessage__Group__3__Impl : ( ( rule__StandardMessage__LeftAssignment_3 ) ) ;
    public final void rule__StandardMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3357:1: ( ( ( rule__StandardMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:3358:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:3358:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            // InternalSequence.g:3359:2: ( rule__StandardMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:3360:2: ( rule__StandardMessage__LeftAssignment_3 )
            // InternalSequence.g:3360:3: rule__StandardMessage__LeftAssignment_3
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
    // InternalSequence.g:3368:1: rule__StandardMessage__Group__4 : rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 ;
    public final void rule__StandardMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3372:1: ( rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 )
            // InternalSequence.g:3373:2: rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:3380:1: rule__StandardMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__StandardMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3384:1: ( ( ',' ) )
            // InternalSequence.g:3385:1: ( ',' )
            {
            // InternalSequence.g:3385:1: ( ',' )
            // InternalSequence.g:3386:2: ','
            {
             before(grammarAccess.getStandardMessageAccess().getCommaKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSequence.g:3395:1: rule__StandardMessage__Group__5 : rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 ;
    public final void rule__StandardMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3399:1: ( rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 )
            // InternalSequence.g:3400:2: rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6
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
    // InternalSequence.g:3407:1: rule__StandardMessage__Group__5__Impl : ( ( rule__StandardMessage__RightAssignment_5 ) ) ;
    public final void rule__StandardMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3411:1: ( ( ( rule__StandardMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:3412:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:3412:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            // InternalSequence.g:3413:2: ( rule__StandardMessage__RightAssignment_5 )
            {
             before(grammarAccess.getStandardMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:3414:2: ( rule__StandardMessage__RightAssignment_5 )
            // InternalSequence.g:3414:3: rule__StandardMessage__RightAssignment_5
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
    // InternalSequence.g:3422:1: rule__StandardMessage__Group__6 : rule__StandardMessage__Group__6__Impl ;
    public final void rule__StandardMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3426:1: ( rule__StandardMessage__Group__6__Impl )
            // InternalSequence.g:3427:2: rule__StandardMessage__Group__6__Impl
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
    // InternalSequence.g:3433:1: rule__StandardMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__StandardMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3437:1: ( ( ')' ) )
            // InternalSequence.g:3438:1: ( ')' )
            {
            // InternalSequence.g:3438:1: ( ')' )
            // InternalSequence.g:3439:2: ')'
            {
             before(grammarAccess.getStandardMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:3449:1: rule__ResponseMessage__Group__0 : rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 ;
    public final void rule__ResponseMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3453:1: ( rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 )
            // InternalSequence.g:3454:2: rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSequence.g:3461:1: rule__ResponseMessage__Group__0__Impl : ( 'reply' ) ;
    public final void rule__ResponseMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3465:1: ( ( 'reply' ) )
            // InternalSequence.g:3466:1: ( 'reply' )
            {
            // InternalSequence.g:3466:1: ( 'reply' )
            // InternalSequence.g:3467:2: 'reply'
            {
             before(grammarAccess.getResponseMessageAccess().getReplyKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSequence.g:3476:1: rule__ResponseMessage__Group__1 : rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 ;
    public final void rule__ResponseMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3480:1: ( rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 )
            // InternalSequence.g:3481:2: rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2
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
    // InternalSequence.g:3488:1: rule__ResponseMessage__Group__1__Impl : ( ( rule__ResponseMessage__NameAssignment_1 ) ) ;
    public final void rule__ResponseMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3492:1: ( ( ( rule__ResponseMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:3493:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:3493:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            // InternalSequence.g:3494:2: ( rule__ResponseMessage__NameAssignment_1 )
            {
             before(grammarAccess.getResponseMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3495:2: ( rule__ResponseMessage__NameAssignment_1 )
            // InternalSequence.g:3495:3: rule__ResponseMessage__NameAssignment_1
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
    // InternalSequence.g:3503:1: rule__ResponseMessage__Group__2 : rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 ;
    public final void rule__ResponseMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3507:1: ( rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 )
            // InternalSequence.g:3508:2: rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3
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
    // InternalSequence.g:3515:1: rule__ResponseMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__ResponseMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3519:1: ( ( '(' ) )
            // InternalSequence.g:3520:1: ( '(' )
            {
            // InternalSequence.g:3520:1: ( '(' )
            // InternalSequence.g:3521:2: '('
            {
             before(grammarAccess.getResponseMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSequence.g:3530:1: rule__ResponseMessage__Group__3 : rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 ;
    public final void rule__ResponseMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3534:1: ( rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 )
            // InternalSequence.g:3535:2: rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4
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
    // InternalSequence.g:3542:1: rule__ResponseMessage__Group__3__Impl : ( ( rule__ResponseMessage__Alternatives_3 ) ) ;
    public final void rule__ResponseMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3546:1: ( ( ( rule__ResponseMessage__Alternatives_3 ) ) )
            // InternalSequence.g:3547:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            {
            // InternalSequence.g:3547:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            // InternalSequence.g:3548:2: ( rule__ResponseMessage__Alternatives_3 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_3()); 
            // InternalSequence.g:3549:2: ( rule__ResponseMessage__Alternatives_3 )
            // InternalSequence.g:3549:3: rule__ResponseMessage__Alternatives_3
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
    // InternalSequence.g:3557:1: rule__ResponseMessage__Group__4 : rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 ;
    public final void rule__ResponseMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3561:1: ( rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 )
            // InternalSequence.g:3562:2: rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5
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
    // InternalSequence.g:3569:1: rule__ResponseMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__ResponseMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3573:1: ( ( ',' ) )
            // InternalSequence.g:3574:1: ( ',' )
            {
            // InternalSequence.g:3574:1: ( ',' )
            // InternalSequence.g:3575:2: ','
            {
             before(grammarAccess.getResponseMessageAccess().getCommaKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSequence.g:3584:1: rule__ResponseMessage__Group__5 : rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 ;
    public final void rule__ResponseMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3588:1: ( rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 )
            // InternalSequence.g:3589:2: rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6
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
    // InternalSequence.g:3596:1: rule__ResponseMessage__Group__5__Impl : ( ( rule__ResponseMessage__Alternatives_5 ) ) ;
    public final void rule__ResponseMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3600:1: ( ( ( rule__ResponseMessage__Alternatives_5 ) ) )
            // InternalSequence.g:3601:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            {
            // InternalSequence.g:3601:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            // InternalSequence.g:3602:2: ( rule__ResponseMessage__Alternatives_5 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_5()); 
            // InternalSequence.g:3603:2: ( rule__ResponseMessage__Alternatives_5 )
            // InternalSequence.g:3603:3: rule__ResponseMessage__Alternatives_5
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
    // InternalSequence.g:3611:1: rule__ResponseMessage__Group__6 : rule__ResponseMessage__Group__6__Impl ;
    public final void rule__ResponseMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3615:1: ( rule__ResponseMessage__Group__6__Impl )
            // InternalSequence.g:3616:2: rule__ResponseMessage__Group__6__Impl
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
    // InternalSequence.g:3622:1: rule__ResponseMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__ResponseMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3626:1: ( ( ')' ) )
            // InternalSequence.g:3627:1: ( ')' )
            {
            // InternalSequence.g:3627:1: ( ')' )
            // InternalSequence.g:3628:2: ')'
            {
             before(grammarAccess.getResponseMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:3638:1: rule__FoundMessage__Group__0 : rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 ;
    public final void rule__FoundMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3642:1: ( rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 )
            // InternalSequence.g:3643:2: rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1
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
    // InternalSequence.g:3650:1: rule__FoundMessage__Group__0__Impl : ( 'found' ) ;
    public final void rule__FoundMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3654:1: ( ( 'found' ) )
            // InternalSequence.g:3655:1: ( 'found' )
            {
            // InternalSequence.g:3655:1: ( 'found' )
            // InternalSequence.g:3656:2: 'found'
            {
             before(grammarAccess.getFoundMessageAccess().getFoundKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSequence.g:3665:1: rule__FoundMessage__Group__1 : rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 ;
    public final void rule__FoundMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3669:1: ( rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 )
            // InternalSequence.g:3670:2: rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSequence.g:3677:1: rule__FoundMessage__Group__1__Impl : ( ( rule__FoundMessage__TypeAssignment_1 ) ) ;
    public final void rule__FoundMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3681:1: ( ( ( rule__FoundMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:3682:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:3682:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            // InternalSequence.g:3683:2: ( rule__FoundMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getFoundMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:3684:2: ( rule__FoundMessage__TypeAssignment_1 )
            // InternalSequence.g:3684:3: rule__FoundMessage__TypeAssignment_1
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
    // InternalSequence.g:3692:1: rule__FoundMessage__Group__2 : rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 ;
    public final void rule__FoundMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3696:1: ( rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 )
            // InternalSequence.g:3697:2: rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3
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
    // InternalSequence.g:3704:1: rule__FoundMessage__Group__2__Impl : ( ( rule__FoundMessage__NameAssignment_2 ) ) ;
    public final void rule__FoundMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3708:1: ( ( ( rule__FoundMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:3709:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:3709:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            // InternalSequence.g:3710:2: ( rule__FoundMessage__NameAssignment_2 )
            {
             before(grammarAccess.getFoundMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:3711:2: ( rule__FoundMessage__NameAssignment_2 )
            // InternalSequence.g:3711:3: rule__FoundMessage__NameAssignment_2
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
    // InternalSequence.g:3719:1: rule__FoundMessage__Group__3 : rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 ;
    public final void rule__FoundMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3723:1: ( rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 )
            // InternalSequence.g:3724:2: rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4
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
    // InternalSequence.g:3731:1: rule__FoundMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__FoundMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3735:1: ( ( '(' ) )
            // InternalSequence.g:3736:1: ( '(' )
            {
            // InternalSequence.g:3736:1: ( '(' )
            // InternalSequence.g:3737:2: '('
            {
             before(grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSequence.g:3746:1: rule__FoundMessage__Group__4 : rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 ;
    public final void rule__FoundMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3750:1: ( rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 )
            // InternalSequence.g:3751:2: rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5
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
    // InternalSequence.g:3758:1: rule__FoundMessage__Group__4__Impl : ( '_' ) ;
    public final void rule__FoundMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3762:1: ( ( '_' ) )
            // InternalSequence.g:3763:1: ( '_' )
            {
            // InternalSequence.g:3763:1: ( '_' )
            // InternalSequence.g:3764:2: '_'
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
    // InternalSequence.g:3773:1: rule__FoundMessage__Group__5 : rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 ;
    public final void rule__FoundMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3777:1: ( rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 )
            // InternalSequence.g:3778:2: rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:3785:1: rule__FoundMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__FoundMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3789:1: ( ( ',' ) )
            // InternalSequence.g:3790:1: ( ',' )
            {
            // InternalSequence.g:3790:1: ( ',' )
            // InternalSequence.g:3791:2: ','
            {
             before(grammarAccess.getFoundMessageAccess().getCommaKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSequence.g:3800:1: rule__FoundMessage__Group__6 : rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 ;
    public final void rule__FoundMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3804:1: ( rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 )
            // InternalSequence.g:3805:2: rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7
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
    // InternalSequence.g:3812:1: rule__FoundMessage__Group__6__Impl : ( ( rule__FoundMessage__RightAssignment_6 ) ) ;
    public final void rule__FoundMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3816:1: ( ( ( rule__FoundMessage__RightAssignment_6 ) ) )
            // InternalSequence.g:3817:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            {
            // InternalSequence.g:3817:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            // InternalSequence.g:3818:2: ( rule__FoundMessage__RightAssignment_6 )
            {
             before(grammarAccess.getFoundMessageAccess().getRightAssignment_6()); 
            // InternalSequence.g:3819:2: ( rule__FoundMessage__RightAssignment_6 )
            // InternalSequence.g:3819:3: rule__FoundMessage__RightAssignment_6
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
    // InternalSequence.g:3827:1: rule__FoundMessage__Group__7 : rule__FoundMessage__Group__7__Impl ;
    public final void rule__FoundMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3831:1: ( rule__FoundMessage__Group__7__Impl )
            // InternalSequence.g:3832:2: rule__FoundMessage__Group__7__Impl
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
    // InternalSequence.g:3838:1: rule__FoundMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__FoundMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3842:1: ( ( ')' ) )
            // InternalSequence.g:3843:1: ( ')' )
            {
            // InternalSequence.g:3843:1: ( ')' )
            // InternalSequence.g:3844:2: ')'
            {
             before(grammarAccess.getFoundMessageAccess().getRightParenthesisKeyword_7()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:3854:1: rule__LostMessage__Group__0 : rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 ;
    public final void rule__LostMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3858:1: ( rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 )
            // InternalSequence.g:3859:2: rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSequence.g:3866:1: rule__LostMessage__Group__0__Impl : ( 'lost' ) ;
    public final void rule__LostMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3870:1: ( ( 'lost' ) )
            // InternalSequence.g:3871:1: ( 'lost' )
            {
            // InternalSequence.g:3871:1: ( 'lost' )
            // InternalSequence.g:3872:2: 'lost'
            {
             before(grammarAccess.getLostMessageAccess().getLostKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSequence.g:3881:1: rule__LostMessage__Group__1 : rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 ;
    public final void rule__LostMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3885:1: ( rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 )
            // InternalSequence.g:3886:2: rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSequence.g:3893:1: rule__LostMessage__Group__1__Impl : ( ( rule__LostMessage__Alternatives_1 ) ) ;
    public final void rule__LostMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3897:1: ( ( ( rule__LostMessage__Alternatives_1 ) ) )
            // InternalSequence.g:3898:1: ( ( rule__LostMessage__Alternatives_1 ) )
            {
            // InternalSequence.g:3898:1: ( ( rule__LostMessage__Alternatives_1 ) )
            // InternalSequence.g:3899:2: ( rule__LostMessage__Alternatives_1 )
            {
             before(grammarAccess.getLostMessageAccess().getAlternatives_1()); 
            // InternalSequence.g:3900:2: ( rule__LostMessage__Alternatives_1 )
            // InternalSequence.g:3900:3: rule__LostMessage__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLostMessageAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalSequence.g:3908:1: rule__LostMessage__Group__2 : rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 ;
    public final void rule__LostMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3912:1: ( rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 )
            // InternalSequence.g:3913:2: rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3
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
    // InternalSequence.g:3920:1: rule__LostMessage__Group__2__Impl : ( ( rule__LostMessage__NameAssignment_2 ) ) ;
    public final void rule__LostMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3924:1: ( ( ( rule__LostMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:3925:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:3925:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            // InternalSequence.g:3926:2: ( rule__LostMessage__NameAssignment_2 )
            {
             before(grammarAccess.getLostMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:3927:2: ( rule__LostMessage__NameAssignment_2 )
            // InternalSequence.g:3927:3: rule__LostMessage__NameAssignment_2
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
    // InternalSequence.g:3935:1: rule__LostMessage__Group__3 : rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 ;
    public final void rule__LostMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3939:1: ( rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 )
            // InternalSequence.g:3940:2: rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:3947:1: rule__LostMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__LostMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3951:1: ( ( '(' ) )
            // InternalSequence.g:3952:1: ( '(' )
            {
            // InternalSequence.g:3952:1: ( '(' )
            // InternalSequence.g:3953:2: '('
            {
             before(grammarAccess.getLostMessageAccess().getLeftParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSequence.g:3962:1: rule__LostMessage__Group__4 : rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 ;
    public final void rule__LostMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3966:1: ( rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 )
            // InternalSequence.g:3967:2: rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5
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
    // InternalSequence.g:3974:1: rule__LostMessage__Group__4__Impl : ( ( rule__LostMessage__LeftAssignment_4 ) ) ;
    public final void rule__LostMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3978:1: ( ( ( rule__LostMessage__LeftAssignment_4 ) ) )
            // InternalSequence.g:3979:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            {
            // InternalSequence.g:3979:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            // InternalSequence.g:3980:2: ( rule__LostMessage__LeftAssignment_4 )
            {
             before(grammarAccess.getLostMessageAccess().getLeftAssignment_4()); 
            // InternalSequence.g:3981:2: ( rule__LostMessage__LeftAssignment_4 )
            // InternalSequence.g:3981:3: rule__LostMessage__LeftAssignment_4
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
    // InternalSequence.g:3989:1: rule__LostMessage__Group__5 : rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 ;
    public final void rule__LostMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3993:1: ( rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 )
            // InternalSequence.g:3994:2: rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6
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
    // InternalSequence.g:4001:1: rule__LostMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__LostMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4005:1: ( ( ',' ) )
            // InternalSequence.g:4006:1: ( ',' )
            {
            // InternalSequence.g:4006:1: ( ',' )
            // InternalSequence.g:4007:2: ','
            {
             before(grammarAccess.getLostMessageAccess().getCommaKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSequence.g:4016:1: rule__LostMessage__Group__6 : rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 ;
    public final void rule__LostMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4020:1: ( rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 )
            // InternalSequence.g:4021:2: rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7
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
    // InternalSequence.g:4028:1: rule__LostMessage__Group__6__Impl : ( '_' ) ;
    public final void rule__LostMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4032:1: ( ( '_' ) )
            // InternalSequence.g:4033:1: ( '_' )
            {
            // InternalSequence.g:4033:1: ( '_' )
            // InternalSequence.g:4034:2: '_'
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
    // InternalSequence.g:4043:1: rule__LostMessage__Group__7 : rule__LostMessage__Group__7__Impl ;
    public final void rule__LostMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4047:1: ( rule__LostMessage__Group__7__Impl )
            // InternalSequence.g:4048:2: rule__LostMessage__Group__7__Impl
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
    // InternalSequence.g:4054:1: rule__LostMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__LostMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4058:1: ( ( ')' ) )
            // InternalSequence.g:4059:1: ( ')' )
            {
            // InternalSequence.g:4059:1: ( ')' )
            // InternalSequence.g:4060:2: ')'
            {
             before(grammarAccess.getLostMessageAccess().getRightParenthesisKeyword_7()); 
            match(input,31,FOLLOW_2); 
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


    // $ANTLR start "rule__LostMessage__Group_1_0__0"
    // InternalSequence.g:4070:1: rule__LostMessage__Group_1_0__0 : rule__LostMessage__Group_1_0__0__Impl rule__LostMessage__Group_1_0__1 ;
    public final void rule__LostMessage__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4074:1: ( rule__LostMessage__Group_1_0__0__Impl rule__LostMessage__Group_1_0__1 )
            // InternalSequence.g:4075:2: rule__LostMessage__Group_1_0__0__Impl rule__LostMessage__Group_1_0__1
            {
            pushFollow(FOLLOW_1);
            rule__LostMessage__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_1_0__0"


    // $ANTLR start "rule__LostMessage__Group_1_0__0__Impl"
    // InternalSequence.g:4082:1: rule__LostMessage__Group_1_0__0__Impl : ( 'reply' ) ;
    public final void rule__LostMessage__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4086:1: ( ( 'reply' ) )
            // InternalSequence.g:4087:1: ( 'reply' )
            {
            // InternalSequence.g:4087:1: ( 'reply' )
            // InternalSequence.g:4088:2: 'reply'
            {
             before(grammarAccess.getLostMessageAccess().getReplyKeyword_1_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLostMessageAccess().getReplyKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_1_0__0__Impl"


    // $ANTLR start "rule__LostMessage__Group_1_0__1"
    // InternalSequence.g:4097:1: rule__LostMessage__Group_1_0__1 : rule__LostMessage__Group_1_0__1__Impl ;
    public final void rule__LostMessage__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4101:1: ( rule__LostMessage__Group_1_0__1__Impl )
            // InternalSequence.g:4102:2: rule__LostMessage__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_1_0__1"


    // $ANTLR start "rule__LostMessage__Group_1_0__1__Impl"
    // InternalSequence.g:4108:1: rule__LostMessage__Group_1_0__1__Impl : ( () ) ;
    public final void rule__LostMessage__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4112:1: ( ( () ) )
            // InternalSequence.g:4113:1: ( () )
            {
            // InternalSequence.g:4113:1: ( () )
            // InternalSequence.g:4114:2: ()
            {
             before(grammarAccess.getLostMessageAccess().getResponseMessageAction_1_0_1()); 
            // InternalSequence.g:4115:2: ()
            // InternalSequence.g:4115:3: 
            {
            }

             after(grammarAccess.getLostMessageAccess().getResponseMessageAction_1_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_1_0__1__Impl"


    // $ANTLR start "rule__LostMessage__Group_1_1__0"
    // InternalSequence.g:4124:1: rule__LostMessage__Group_1_1__0 : rule__LostMessage__Group_1_1__0__Impl rule__LostMessage__Group_1_1__1 ;
    public final void rule__LostMessage__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4128:1: ( rule__LostMessage__Group_1_1__0__Impl rule__LostMessage__Group_1_1__1 )
            // InternalSequence.g:4129:2: rule__LostMessage__Group_1_1__0__Impl rule__LostMessage__Group_1_1__1
            {
            pushFollow(FOLLOW_32);
            rule__LostMessage__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_1_1__0"


    // $ANTLR start "rule__LostMessage__Group_1_1__0__Impl"
    // InternalSequence.g:4136:1: rule__LostMessage__Group_1_1__0__Impl : ( () ) ;
    public final void rule__LostMessage__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4140:1: ( ( () ) )
            // InternalSequence.g:4141:1: ( () )
            {
            // InternalSequence.g:4141:1: ( () )
            // InternalSequence.g:4142:2: ()
            {
             before(grammarAccess.getLostMessageAccess().getStandardMessageAction_1_1_0()); 
            // InternalSequence.g:4143:2: ()
            // InternalSequence.g:4143:3: 
            {
            }

             after(grammarAccess.getLostMessageAccess().getStandardMessageAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_1_1__0__Impl"


    // $ANTLR start "rule__LostMessage__Group_1_1__1"
    // InternalSequence.g:4151:1: rule__LostMessage__Group_1_1__1 : rule__LostMessage__Group_1_1__1__Impl ;
    public final void rule__LostMessage__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4155:1: ( rule__LostMessage__Group_1_1__1__Impl )
            // InternalSequence.g:4156:2: rule__LostMessage__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_1_1__1"


    // $ANTLR start "rule__LostMessage__Group_1_1__1__Impl"
    // InternalSequence.g:4162:1: rule__LostMessage__Group_1_1__1__Impl : ( ( rule__LostMessage__TypeAssignment_1_1_1 ) ) ;
    public final void rule__LostMessage__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4166:1: ( ( ( rule__LostMessage__TypeAssignment_1_1_1 ) ) )
            // InternalSequence.g:4167:1: ( ( rule__LostMessage__TypeAssignment_1_1_1 ) )
            {
            // InternalSequence.g:4167:1: ( ( rule__LostMessage__TypeAssignment_1_1_1 ) )
            // InternalSequence.g:4168:2: ( rule__LostMessage__TypeAssignment_1_1_1 )
            {
             before(grammarAccess.getLostMessageAccess().getTypeAssignment_1_1_1()); 
            // InternalSequence.g:4169:2: ( rule__LostMessage__TypeAssignment_1_1_1 )
            // InternalSequence.g:4169:3: rule__LostMessage__TypeAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__TypeAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLostMessageAccess().getTypeAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_1_1__1__Impl"


    // $ANTLR start "rule__CreateMessage__Group__0"
    // InternalSequence.g:4178:1: rule__CreateMessage__Group__0 : rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 ;
    public final void rule__CreateMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4182:1: ( rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 )
            // InternalSequence.g:4183:2: rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSequence.g:4190:1: rule__CreateMessage__Group__0__Impl : ( 'create' ) ;
    public final void rule__CreateMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4194:1: ( ( 'create' ) )
            // InternalSequence.g:4195:1: ( 'create' )
            {
            // InternalSequence.g:4195:1: ( 'create' )
            // InternalSequence.g:4196:2: 'create'
            {
             before(grammarAccess.getCreateMessageAccess().getCreateKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSequence.g:4205:1: rule__CreateMessage__Group__1 : rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 ;
    public final void rule__CreateMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4209:1: ( rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 )
            // InternalSequence.g:4210:2: rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSequence.g:4217:1: rule__CreateMessage__Group__1__Impl : ( ( rule__CreateMessage__NameAssignment_1 )? ) ;
    public final void rule__CreateMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4221:1: ( ( ( rule__CreateMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:4222:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:4222:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            // InternalSequence.g:4223:2: ( rule__CreateMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getCreateMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:4224:2: ( rule__CreateMessage__NameAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSequence.g:4224:3: rule__CreateMessage__NameAssignment_1
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
    // InternalSequence.g:4232:1: rule__CreateMessage__Group__2 : rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 ;
    public final void rule__CreateMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4236:1: ( rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 )
            // InternalSequence.g:4237:2: rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:4244:1: rule__CreateMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__CreateMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4248:1: ( ( '(' ) )
            // InternalSequence.g:4249:1: ( '(' )
            {
            // InternalSequence.g:4249:1: ( '(' )
            // InternalSequence.g:4250:2: '('
            {
             before(grammarAccess.getCreateMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSequence.g:4259:1: rule__CreateMessage__Group__3 : rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 ;
    public final void rule__CreateMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4263:1: ( rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 )
            // InternalSequence.g:4264:2: rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4
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
    // InternalSequence.g:4271:1: rule__CreateMessage__Group__3__Impl : ( ( rule__CreateMessage__LeftAssignment_3 ) ) ;
    public final void rule__CreateMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4275:1: ( ( ( rule__CreateMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:4276:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:4276:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            // InternalSequence.g:4277:2: ( rule__CreateMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:4278:2: ( rule__CreateMessage__LeftAssignment_3 )
            // InternalSequence.g:4278:3: rule__CreateMessage__LeftAssignment_3
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
    // InternalSequence.g:4286:1: rule__CreateMessage__Group__4 : rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 ;
    public final void rule__CreateMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4290:1: ( rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 )
            // InternalSequence.g:4291:2: rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:4298:1: rule__CreateMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__CreateMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4302:1: ( ( ',' ) )
            // InternalSequence.g:4303:1: ( ',' )
            {
            // InternalSequence.g:4303:1: ( ',' )
            // InternalSequence.g:4304:2: ','
            {
             before(grammarAccess.getCreateMessageAccess().getCommaKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSequence.g:4313:1: rule__CreateMessage__Group__5 : rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 ;
    public final void rule__CreateMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4317:1: ( rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 )
            // InternalSequence.g:4318:2: rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6
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
    // InternalSequence.g:4325:1: rule__CreateMessage__Group__5__Impl : ( ( rule__CreateMessage__RightAssignment_5 ) ) ;
    public final void rule__CreateMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4329:1: ( ( ( rule__CreateMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:4330:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:4330:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            // InternalSequence.g:4331:2: ( rule__CreateMessage__RightAssignment_5 )
            {
             before(grammarAccess.getCreateMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:4332:2: ( rule__CreateMessage__RightAssignment_5 )
            // InternalSequence.g:4332:3: rule__CreateMessage__RightAssignment_5
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
    // InternalSequence.g:4340:1: rule__CreateMessage__Group__6 : rule__CreateMessage__Group__6__Impl ;
    public final void rule__CreateMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4344:1: ( rule__CreateMessage__Group__6__Impl )
            // InternalSequence.g:4345:2: rule__CreateMessage__Group__6__Impl
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
    // InternalSequence.g:4351:1: rule__CreateMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__CreateMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4355:1: ( ( ')' ) )
            // InternalSequence.g:4356:1: ( ')' )
            {
            // InternalSequence.g:4356:1: ( ')' )
            // InternalSequence.g:4357:2: ')'
            {
             before(grammarAccess.getCreateMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:4367:1: rule__DestructionMessage__Group__0 : rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 ;
    public final void rule__DestructionMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4371:1: ( rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 )
            // InternalSequence.g:4372:2: rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSequence.g:4379:1: rule__DestructionMessage__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4383:1: ( ( 'dest' ) )
            // InternalSequence.g:4384:1: ( 'dest' )
            {
            // InternalSequence.g:4384:1: ( 'dest' )
            // InternalSequence.g:4385:2: 'dest'
            {
             before(grammarAccess.getDestructionMessageAccess().getDestKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSequence.g:4394:1: rule__DestructionMessage__Group__1 : rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 ;
    public final void rule__DestructionMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4398:1: ( rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 )
            // InternalSequence.g:4399:2: rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSequence.g:4406:1: rule__DestructionMessage__Group__1__Impl : ( ( rule__DestructionMessage__NameAssignment_1 )? ) ;
    public final void rule__DestructionMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4410:1: ( ( ( rule__DestructionMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:4411:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:4411:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            // InternalSequence.g:4412:2: ( rule__DestructionMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getDestructionMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:4413:2: ( rule__DestructionMessage__NameAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSequence.g:4413:3: rule__DestructionMessage__NameAssignment_1
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
    // InternalSequence.g:4421:1: rule__DestructionMessage__Group__2 : rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 ;
    public final void rule__DestructionMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4425:1: ( rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 )
            // InternalSequence.g:4426:2: rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:4433:1: rule__DestructionMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__DestructionMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4437:1: ( ( '(' ) )
            // InternalSequence.g:4438:1: ( '(' )
            {
            // InternalSequence.g:4438:1: ( '(' )
            // InternalSequence.g:4439:2: '('
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSequence.g:4448:1: rule__DestructionMessage__Group__3 : rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 ;
    public final void rule__DestructionMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4452:1: ( rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 )
            // InternalSequence.g:4453:2: rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4
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
    // InternalSequence.g:4460:1: rule__DestructionMessage__Group__3__Impl : ( ( rule__DestructionMessage__LeftAssignment_3 ) ) ;
    public final void rule__DestructionMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4464:1: ( ( ( rule__DestructionMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:4465:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:4465:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            // InternalSequence.g:4466:2: ( rule__DestructionMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:4467:2: ( rule__DestructionMessage__LeftAssignment_3 )
            // InternalSequence.g:4467:3: rule__DestructionMessage__LeftAssignment_3
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
    // InternalSequence.g:4475:1: rule__DestructionMessage__Group__4 : rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 ;
    public final void rule__DestructionMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4479:1: ( rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 )
            // InternalSequence.g:4480:2: rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:4487:1: rule__DestructionMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__DestructionMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4491:1: ( ( ',' ) )
            // InternalSequence.g:4492:1: ( ',' )
            {
            // InternalSequence.g:4492:1: ( ',' )
            // InternalSequence.g:4493:2: ','
            {
             before(grammarAccess.getDestructionMessageAccess().getCommaKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSequence.g:4502:1: rule__DestructionMessage__Group__5 : rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 ;
    public final void rule__DestructionMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4506:1: ( rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 )
            // InternalSequence.g:4507:2: rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6
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
    // InternalSequence.g:4514:1: rule__DestructionMessage__Group__5__Impl : ( ( rule__DestructionMessage__RightAssignment_5 ) ) ;
    public final void rule__DestructionMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4518:1: ( ( ( rule__DestructionMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:4519:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:4519:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            // InternalSequence.g:4520:2: ( rule__DestructionMessage__RightAssignment_5 )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:4521:2: ( rule__DestructionMessage__RightAssignment_5 )
            // InternalSequence.g:4521:3: rule__DestructionMessage__RightAssignment_5
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
    // InternalSequence.g:4529:1: rule__DestructionMessage__Group__6 : rule__DestructionMessage__Group__6__Impl ;
    public final void rule__DestructionMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4533:1: ( rule__DestructionMessage__Group__6__Impl )
            // InternalSequence.g:4534:2: rule__DestructionMessage__Group__6__Impl
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
    // InternalSequence.g:4540:1: rule__DestructionMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__DestructionMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4544:1: ( ( ')' ) )
            // InternalSequence.g:4545:1: ( ')' )
            {
            // InternalSequence.g:4545:1: ( ')' )
            // InternalSequence.g:4546:2: ')'
            {
             before(grammarAccess.getDestructionMessageAccess().getRightParenthesisKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSequence.g:4556:1: rule__DestructionOccurenceSpecification__Group__0 : rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 ;
    public final void rule__DestructionOccurenceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4560:1: ( rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 )
            // InternalSequence.g:4561:2: rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:4568:1: rule__DestructionOccurenceSpecification__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionOccurenceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4572:1: ( ( 'dest' ) )
            // InternalSequence.g:4573:1: ( 'dest' )
            {
            // InternalSequence.g:4573:1: ( 'dest' )
            // InternalSequence.g:4574:2: 'dest'
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getDestKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSequence.g:4583:1: rule__DestructionOccurenceSpecification__Group__1 : rule__DestructionOccurenceSpecification__Group__1__Impl ;
    public final void rule__DestructionOccurenceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4587:1: ( rule__DestructionOccurenceSpecification__Group__1__Impl )
            // InternalSequence.g:4588:2: rule__DestructionOccurenceSpecification__Group__1__Impl
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
    // InternalSequence.g:4594:1: rule__DestructionOccurenceSpecification__Group__1__Impl : ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) ) ;
    public final void rule__DestructionOccurenceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4598:1: ( ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) ) )
            // InternalSequence.g:4599:1: ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) )
            {
            // InternalSequence.g:4599:1: ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) )
            // InternalSequence.g:4600:2: ( rule__DestructionOccurenceSpecification__TargetAssignment_1 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetAssignment_1()); 
            // InternalSequence.g:4601:2: ( rule__DestructionOccurenceSpecification__TargetAssignment_1 )
            // InternalSequence.g:4601:3: rule__DestructionOccurenceSpecification__TargetAssignment_1
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


    // $ANTLR start "rule__Parallel__Group__0"
    // InternalSequence.g:4610:1: rule__Parallel__Group__0 : rule__Parallel__Group__0__Impl rule__Parallel__Group__1 ;
    public final void rule__Parallel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4614:1: ( rule__Parallel__Group__0__Impl rule__Parallel__Group__1 )
            // InternalSequence.g:4615:2: rule__Parallel__Group__0__Impl rule__Parallel__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSequence.g:4622:1: rule__Parallel__Group__0__Impl : ( 'par' ) ;
    public final void rule__Parallel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4626:1: ( ( 'par' ) )
            // InternalSequence.g:4627:1: ( 'par' )
            {
            // InternalSequence.g:4627:1: ( 'par' )
            // InternalSequence.g:4628:2: 'par'
            {
             before(grammarAccess.getParallelAccess().getParKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSequence.g:4637:1: rule__Parallel__Group__1 : rule__Parallel__Group__1__Impl rule__Parallel__Group__2 ;
    public final void rule__Parallel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4641:1: ( rule__Parallel__Group__1__Impl rule__Parallel__Group__2 )
            // InternalSequence.g:4642:2: rule__Parallel__Group__1__Impl rule__Parallel__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSequence.g:4649:1: rule__Parallel__Group__1__Impl : ( '{' ) ;
    public final void rule__Parallel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4653:1: ( ( '{' ) )
            // InternalSequence.g:4654:1: ( '{' )
            {
            // InternalSequence.g:4654:1: ( '{' )
            // InternalSequence.g:4655:2: '{'
            {
             before(grammarAccess.getParallelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSequence.g:4664:1: rule__Parallel__Group__2 : rule__Parallel__Group__2__Impl rule__Parallel__Group__3 ;
    public final void rule__Parallel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4668:1: ( rule__Parallel__Group__2__Impl rule__Parallel__Group__3 )
            // InternalSequence.g:4669:2: rule__Parallel__Group__2__Impl rule__Parallel__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSequence.g:4676:1: rule__Parallel__Group__2__Impl : ( ( ( rule__Parallel__RegionsAssignment_2 ) ) ( ( rule__Parallel__RegionsAssignment_2 )* ) ) ;
    public final void rule__Parallel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4680:1: ( ( ( ( rule__Parallel__RegionsAssignment_2 ) ) ( ( rule__Parallel__RegionsAssignment_2 )* ) ) )
            // InternalSequence.g:4681:1: ( ( ( rule__Parallel__RegionsAssignment_2 ) ) ( ( rule__Parallel__RegionsAssignment_2 )* ) )
            {
            // InternalSequence.g:4681:1: ( ( ( rule__Parallel__RegionsAssignment_2 ) ) ( ( rule__Parallel__RegionsAssignment_2 )* ) )
            // InternalSequence.g:4682:2: ( ( rule__Parallel__RegionsAssignment_2 ) ) ( ( rule__Parallel__RegionsAssignment_2 )* )
            {
            // InternalSequence.g:4682:2: ( ( rule__Parallel__RegionsAssignment_2 ) )
            // InternalSequence.g:4683:3: ( rule__Parallel__RegionsAssignment_2 )
            {
             before(grammarAccess.getParallelAccess().getRegionsAssignment_2()); 
            // InternalSequence.g:4684:3: ( rule__Parallel__RegionsAssignment_2 )
            // InternalSequence.g:4684:4: rule__Parallel__RegionsAssignment_2
            {
            pushFollow(FOLLOW_34);
            rule__Parallel__RegionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParallelAccess().getRegionsAssignment_2()); 

            }

            // InternalSequence.g:4687:2: ( ( rule__Parallel__RegionsAssignment_2 )* )
            // InternalSequence.g:4688:3: ( rule__Parallel__RegionsAssignment_2 )*
            {
             before(grammarAccess.getParallelAccess().getRegionsAssignment_2()); 
            // InternalSequence.g:4689:3: ( rule__Parallel__RegionsAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=12 && LA35_0<=13)||LA35_0==24||LA35_0==28||(LA35_0>=32 && LA35_0<=42)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSequence.g:4689:4: rule__Parallel__RegionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Parallel__RegionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getParallelAccess().getRegionsAssignment_2()); 

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
    // InternalSequence.g:4698:1: rule__Parallel__Group__3 : rule__Parallel__Group__3__Impl ;
    public final void rule__Parallel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4702:1: ( rule__Parallel__Group__3__Impl )
            // InternalSequence.g:4703:2: rule__Parallel__Group__3__Impl
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
    // InternalSequence.g:4709:1: rule__Parallel__Group__3__Impl : ( '}' ) ;
    public final void rule__Parallel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4713:1: ( ( '}' ) )
            // InternalSequence.g:4714:1: ( '}' )
            {
            // InternalSequence.g:4714:1: ( '}' )
            // InternalSequence.g:4715:2: '}'
            {
             before(grammarAccess.getParallelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__Alternative__Group__0"
    // InternalSequence.g:4725:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4729:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // InternalSequence.g:4730:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSequence.g:4737:1: rule__Alternative__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4741:1: ( ( 'alt' ) )
            // InternalSequence.g:4742:1: ( 'alt' )
            {
            // InternalSequence.g:4742:1: ( 'alt' )
            // InternalSequence.g:4743:2: 'alt'
            {
             before(grammarAccess.getAlternativeAccess().getAltKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSequence.g:4752:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4756:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // InternalSequence.g:4757:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:4764:1: rule__Alternative__Group__1__Impl : ( '{' ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4768:1: ( ( '{' ) )
            // InternalSequence.g:4769:1: ( '{' )
            {
            // InternalSequence.g:4769:1: ( '{' )
            // InternalSequence.g:4770:2: '{'
            {
             before(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSequence.g:4779:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4783:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // InternalSequence.g:4784:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSequence.g:4791:1: rule__Alternative__Group__2__Impl : ( ( ( rule__Alternative__RegionsAssignment_2 ) ) ( ( rule__Alternative__RegionsAssignment_2 )* ) ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4795:1: ( ( ( ( rule__Alternative__RegionsAssignment_2 ) ) ( ( rule__Alternative__RegionsAssignment_2 )* ) ) )
            // InternalSequence.g:4796:1: ( ( ( rule__Alternative__RegionsAssignment_2 ) ) ( ( rule__Alternative__RegionsAssignment_2 )* ) )
            {
            // InternalSequence.g:4796:1: ( ( ( rule__Alternative__RegionsAssignment_2 ) ) ( ( rule__Alternative__RegionsAssignment_2 )* ) )
            // InternalSequence.g:4797:2: ( ( rule__Alternative__RegionsAssignment_2 ) ) ( ( rule__Alternative__RegionsAssignment_2 )* )
            {
            // InternalSequence.g:4797:2: ( ( rule__Alternative__RegionsAssignment_2 ) )
            // InternalSequence.g:4798:3: ( rule__Alternative__RegionsAssignment_2 )
            {
             before(grammarAccess.getAlternativeAccess().getRegionsAssignment_2()); 
            // InternalSequence.g:4799:3: ( rule__Alternative__RegionsAssignment_2 )
            // InternalSequence.g:4799:4: rule__Alternative__RegionsAssignment_2
            {
            pushFollow(FOLLOW_35);
            rule__Alternative__RegionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getRegionsAssignment_2()); 

            }

            // InternalSequence.g:4802:2: ( ( rule__Alternative__RegionsAssignment_2 )* )
            // InternalSequence.g:4803:3: ( rule__Alternative__RegionsAssignment_2 )*
            {
             before(grammarAccess.getAlternativeAccess().getRegionsAssignment_2()); 
            // InternalSequence.g:4804:3: ( rule__Alternative__RegionsAssignment_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==26) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSequence.g:4804:4: rule__Alternative__RegionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Alternative__RegionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getAlternativeAccess().getRegionsAssignment_2()); 

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
    // InternalSequence.g:4813:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4817:1: ( rule__Alternative__Group__3__Impl )
            // InternalSequence.g:4818:2: rule__Alternative__Group__3__Impl
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
    // InternalSequence.g:4824:1: rule__Alternative__Group__3__Impl : ( '}' ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4828:1: ( ( '}' ) )
            // InternalSequence.g:4829:1: ( '}' )
            {
            // InternalSequence.g:4829:1: ( '}' )
            // InternalSequence.g:4830:2: '}'
            {
             before(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__Loop__Group__0"
    // InternalSequence.g:4840:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4844:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalSequence.g:4845:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:4852:1: rule__Loop__Group__0__Impl : ( 'loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4856:1: ( ( 'loop' ) )
            // InternalSequence.g:4857:1: ( 'loop' )
            {
            // InternalSequence.g:4857:1: ( 'loop' )
            // InternalSequence.g:4858:2: 'loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSequence.g:4867:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4871:1: ( rule__Loop__Group__1__Impl )
            // InternalSequence.g:4872:2: rule__Loop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:4878:1: rule__Loop__Group__1__Impl : ( ( rule__Loop__RegionAssignment_1 ) ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4882:1: ( ( ( rule__Loop__RegionAssignment_1 ) ) )
            // InternalSequence.g:4883:1: ( ( rule__Loop__RegionAssignment_1 ) )
            {
            // InternalSequence.g:4883:1: ( ( rule__Loop__RegionAssignment_1 ) )
            // InternalSequence.g:4884:2: ( rule__Loop__RegionAssignment_1 )
            {
             before(grammarAccess.getLoopAccess().getRegionAssignment_1()); 
            // InternalSequence.g:4885:2: ( rule__Loop__RegionAssignment_1 )
            // InternalSequence.g:4885:3: rule__Loop__RegionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__RegionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getRegionAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Option__Group__0"
    // InternalSequence.g:4894:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4898:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalSequence.g:4899:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:4906:1: rule__Option__Group__0__Impl : ( 'opt' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4910:1: ( ( 'opt' ) )
            // InternalSequence.g:4911:1: ( 'opt' )
            {
            // InternalSequence.g:4911:1: ( 'opt' )
            // InternalSequence.g:4912:2: 'opt'
            {
             before(grammarAccess.getOptionAccess().getOptKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSequence.g:4921:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4925:1: ( rule__Option__Group__1__Impl )
            // InternalSequence.g:4926:2: rule__Option__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:4932:1: rule__Option__Group__1__Impl : ( ( rule__Option__RegionAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4936:1: ( ( ( rule__Option__RegionAssignment_1 ) ) )
            // InternalSequence.g:4937:1: ( ( rule__Option__RegionAssignment_1 ) )
            {
            // InternalSequence.g:4937:1: ( ( rule__Option__RegionAssignment_1 ) )
            // InternalSequence.g:4938:2: ( rule__Option__RegionAssignment_1 )
            {
             before(grammarAccess.getOptionAccess().getRegionAssignment_1()); 
            // InternalSequence.g:4939:2: ( rule__Option__RegionAssignment_1 )
            // InternalSequence.g:4939:3: rule__Option__RegionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Option__RegionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getRegionAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Critical__Group__0"
    // InternalSequence.g:4948:1: rule__Critical__Group__0 : rule__Critical__Group__0__Impl rule__Critical__Group__1 ;
    public final void rule__Critical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4952:1: ( rule__Critical__Group__0__Impl rule__Critical__Group__1 )
            // InternalSequence.g:4953:2: rule__Critical__Group__0__Impl rule__Critical__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSequence.g:4960:1: rule__Critical__Group__0__Impl : ( 'critical' ) ;
    public final void rule__Critical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4964:1: ( ( 'critical' ) )
            // InternalSequence.g:4965:1: ( 'critical' )
            {
            // InternalSequence.g:4965:1: ( 'critical' )
            // InternalSequence.g:4966:2: 'critical'
            {
             before(grammarAccess.getCriticalAccess().getCriticalKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSequence.g:4975:1: rule__Critical__Group__1 : rule__Critical__Group__1__Impl rule__Critical__Group__2 ;
    public final void rule__Critical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4979:1: ( rule__Critical__Group__1__Impl rule__Critical__Group__2 )
            // InternalSequence.g:4980:2: rule__Critical__Group__1__Impl rule__Critical__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSequence.g:4987:1: rule__Critical__Group__1__Impl : ( '{' ) ;
    public final void rule__Critical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4991:1: ( ( '{' ) )
            // InternalSequence.g:4992:1: ( '{' )
            {
            // InternalSequence.g:4992:1: ( '{' )
            // InternalSequence.g:4993:2: '{'
            {
             before(grammarAccess.getCriticalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSequence.g:5002:1: rule__Critical__Group__2 : rule__Critical__Group__2__Impl rule__Critical__Group__3 ;
    public final void rule__Critical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5006:1: ( rule__Critical__Group__2__Impl rule__Critical__Group__3 )
            // InternalSequence.g:5007:2: rule__Critical__Group__2__Impl rule__Critical__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSequence.g:5014:1: rule__Critical__Group__2__Impl : ( ( rule__Critical__RegionAssignment_2 ) ) ;
    public final void rule__Critical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5018:1: ( ( ( rule__Critical__RegionAssignment_2 ) ) )
            // InternalSequence.g:5019:1: ( ( rule__Critical__RegionAssignment_2 ) )
            {
            // InternalSequence.g:5019:1: ( ( rule__Critical__RegionAssignment_2 ) )
            // InternalSequence.g:5020:2: ( rule__Critical__RegionAssignment_2 )
            {
             before(grammarAccess.getCriticalAccess().getRegionAssignment_2()); 
            // InternalSequence.g:5021:2: ( rule__Critical__RegionAssignment_2 )
            // InternalSequence.g:5021:3: rule__Critical__RegionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Critical__RegionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCriticalAccess().getRegionAssignment_2()); 

            }


            }

        }
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
    // InternalSequence.g:5029:1: rule__Critical__Group__3 : rule__Critical__Group__3__Impl ;
    public final void rule__Critical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5033:1: ( rule__Critical__Group__3__Impl )
            // InternalSequence.g:5034:2: rule__Critical__Group__3__Impl
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
    // InternalSequence.g:5040:1: rule__Critical__Group__3__Impl : ( '}' ) ;
    public final void rule__Critical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5044:1: ( ( '}' ) )
            // InternalSequence.g:5045:1: ( '}' )
            {
            // InternalSequence.g:5045:1: ( '}' )
            // InternalSequence.g:5046:2: '}'
            {
             before(grammarAccess.getCriticalAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__Reference__Group__0"
    // InternalSequence.g:5056:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5060:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalSequence.g:5061:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalSequence.g:5068:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5072:1: ( ( 'ref' ) )
            // InternalSequence.g:5073:1: ( 'ref' )
            {
            // InternalSequence.g:5073:1: ( 'ref' )
            // InternalSequence.g:5074:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalSequence.g:5083:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5087:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalSequence.g:5088:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalSequence.g:5095:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ReferenceAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5099:1: ( ( ( rule__Reference__ReferenceAssignment_1 ) ) )
            // InternalSequence.g:5100:1: ( ( rule__Reference__ReferenceAssignment_1 ) )
            {
            // InternalSequence.g:5100:1: ( ( rule__Reference__ReferenceAssignment_1 ) )
            // InternalSequence.g:5101:2: ( rule__Reference__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getReferenceAssignment_1()); 
            // InternalSequence.g:5102:2: ( rule__Reference__ReferenceAssignment_1 )
            // InternalSequence.g:5102:3: rule__Reference__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalSequence.g:5110:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5114:1: ( rule__Reference__Group__2__Impl )
            // InternalSequence.g:5115:2: rule__Reference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalSequence.g:5121:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__Group_2__0 )? ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5125:1: ( ( ( rule__Reference__Group_2__0 )? ) )
            // InternalSequence.g:5126:1: ( ( rule__Reference__Group_2__0 )? )
            {
            // InternalSequence.g:5126:1: ( ( rule__Reference__Group_2__0 )? )
            // InternalSequence.g:5127:2: ( rule__Reference__Group_2__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_2()); 
            // InternalSequence.g:5128:2: ( rule__Reference__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSequence.g:5128:3: rule__Reference__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group_2__0"
    // InternalSequence.g:5137:1: rule__Reference__Group_2__0 : rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1 ;
    public final void rule__Reference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5141:1: ( rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1 )
            // InternalSequence.g:5142:2: rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Reference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__0"


    // $ANTLR start "rule__Reference__Group_2__0__Impl"
    // InternalSequence.g:5149:1: rule__Reference__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__Reference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5153:1: ( ( 'as' ) )
            // InternalSequence.g:5154:1: ( 'as' )
            {
            // InternalSequence.g:5154:1: ( 'as' )
            // InternalSequence.g:5155:2: 'as'
            {
             before(grammarAccess.getReferenceAccess().getAsKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__0__Impl"


    // $ANTLR start "rule__Reference__Group_2__1"
    // InternalSequence.g:5164:1: rule__Reference__Group_2__1 : rule__Reference__Group_2__1__Impl ;
    public final void rule__Reference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5168:1: ( rule__Reference__Group_2__1__Impl )
            // InternalSequence.g:5169:2: rule__Reference__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__1"


    // $ANTLR start "rule__Reference__Group_2__1__Impl"
    // InternalSequence.g:5175:1: rule__Reference__Group_2__1__Impl : ( ( rule__Reference__AliasAssignment_2_1 ) ) ;
    public final void rule__Reference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5179:1: ( ( ( rule__Reference__AliasAssignment_2_1 ) ) )
            // InternalSequence.g:5180:1: ( ( rule__Reference__AliasAssignment_2_1 ) )
            {
            // InternalSequence.g:5180:1: ( ( rule__Reference__AliasAssignment_2_1 ) )
            // InternalSequence.g:5181:2: ( rule__Reference__AliasAssignment_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getAliasAssignment_2_1()); 
            // InternalSequence.g:5182:2: ( rule__Reference__AliasAssignment_2_1 )
            // InternalSequence.g:5182:3: rule__Reference__AliasAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAliasAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalSequence.g:5191:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5195:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalSequence.g:5196:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalSequence.g:5203:1: rule__Constraint__Group__0__Impl : ( 'cstr' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5207:1: ( ( 'cstr' ) )
            // InternalSequence.g:5208:1: ( 'cstr' )
            {
            // InternalSequence.g:5208:1: ( 'cstr' )
            // InternalSequence.g:5209:2: 'cstr'
            {
             before(grammarAccess.getConstraintAccess().getCstrKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getCstrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalSequence.g:5218:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5222:1: ( rule__Constraint__Group__1__Impl )
            // InternalSequence.g:5223:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalSequence.g:5229:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__Alternatives_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5233:1: ( ( ( rule__Constraint__Alternatives_1 ) ) )
            // InternalSequence.g:5234:1: ( ( rule__Constraint__Alternatives_1 ) )
            {
            // InternalSequence.g:5234:1: ( ( rule__Constraint__Alternatives_1 ) )
            // InternalSequence.g:5235:2: ( rule__Constraint__Alternatives_1 )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives_1()); 
            // InternalSequence.g:5236:2: ( rule__Constraint__Alternatives_1 )
            // InternalSequence.g:5236:3: rule__Constraint__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__0"
    // InternalSequence.g:5245:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5249:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // InternalSequence.g:5250:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:5257:1: rule__TimeConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5261:1: ( ( '(' ) )
            // InternalSequence.g:5262:1: ( '(' )
            {
            // InternalSequence.g:5262:1: ( '(' )
            // InternalSequence.g:5263:2: '('
            {
             before(grammarAccess.getTimeConstraintAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTimeConstraintAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
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
    // InternalSequence.g:5272:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5276:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // InternalSequence.g:5277:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSequence.g:5284:1: rule__TimeConstraint__Group__1__Impl : ( ( rule__TimeConstraint__EventAssignment_1 ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5288:1: ( ( ( rule__TimeConstraint__EventAssignment_1 ) ) )
            // InternalSequence.g:5289:1: ( ( rule__TimeConstraint__EventAssignment_1 ) )
            {
            // InternalSequence.g:5289:1: ( ( rule__TimeConstraint__EventAssignment_1 ) )
            // InternalSequence.g:5290:2: ( rule__TimeConstraint__EventAssignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getEventAssignment_1()); 
            // InternalSequence.g:5291:2: ( rule__TimeConstraint__EventAssignment_1 )
            // InternalSequence.g:5291:3: rule__TimeConstraint__EventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeConstraint__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getEventAssignment_1()); 

            }


            }

        }
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
    // InternalSequence.g:5299:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3 ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5303:1: ( rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3 )
            // InternalSequence.g:5304:2: rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__TimeConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConstraint__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:5311:1: rule__TimeConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5315:1: ( ( ')' ) )
            // InternalSequence.g:5316:1: ( ')' )
            {
            // InternalSequence.g:5316:1: ( ')' )
            // InternalSequence.g:5317:2: ')'
            {
             before(grammarAccess.getTimeConstraintAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTimeConstraintAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__TimeConstraint__Group__3"
    // InternalSequence.g:5326:1: rule__TimeConstraint__Group__3 : rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4 ;
    public final void rule__TimeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5330:1: ( rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4 )
            // InternalSequence.g:5331:2: rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__TimeConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__3"


    // $ANTLR start "rule__TimeConstraint__Group__3__Impl"
    // InternalSequence.g:5338:1: rule__TimeConstraint__Group__3__Impl : ( 't' ) ;
    public final void rule__TimeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5342:1: ( ( 't' ) )
            // InternalSequence.g:5343:1: ( 't' )
            {
            // InternalSequence.g:5343:1: ( 't' )
            // InternalSequence.g:5344:2: 't'
            {
             before(grammarAccess.getTimeConstraintAccess().getTKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTimeConstraintAccess().getTKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__3__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__4"
    // InternalSequence.g:5353:1: rule__TimeConstraint__Group__4 : rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5 ;
    public final void rule__TimeConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5357:1: ( rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5 )
            // InternalSequence.g:5358:2: rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__TimeConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConstraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__4"


    // $ANTLR start "rule__TimeConstraint__Group__4__Impl"
    // InternalSequence.g:5365:1: rule__TimeConstraint__Group__4__Impl : ( '[' ) ;
    public final void rule__TimeConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5369:1: ( ( '[' ) )
            // InternalSequence.g:5370:1: ( '[' )
            {
            // InternalSequence.g:5370:1: ( '[' )
            // InternalSequence.g:5371:2: '['
            {
             before(grammarAccess.getTimeConstraintAccess().getLeftSquareBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTimeConstraintAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__4__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__5"
    // InternalSequence.g:5380:1: rule__TimeConstraint__Group__5 : rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6 ;
    public final void rule__TimeConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5384:1: ( rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6 )
            // InternalSequence.g:5385:2: rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__TimeConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConstraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__5"


    // $ANTLR start "rule__TimeConstraint__Group__5__Impl"
    // InternalSequence.g:5392:1: rule__TimeConstraint__Group__5__Impl : ( ( rule__TimeConstraint__TimeAssignment_5 ) ) ;
    public final void rule__TimeConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5396:1: ( ( ( rule__TimeConstraint__TimeAssignment_5 ) ) )
            // InternalSequence.g:5397:1: ( ( rule__TimeConstraint__TimeAssignment_5 ) )
            {
            // InternalSequence.g:5397:1: ( ( rule__TimeConstraint__TimeAssignment_5 ) )
            // InternalSequence.g:5398:2: ( rule__TimeConstraint__TimeAssignment_5 )
            {
             before(grammarAccess.getTimeConstraintAccess().getTimeAssignment_5()); 
            // InternalSequence.g:5399:2: ( rule__TimeConstraint__TimeAssignment_5 )
            // InternalSequence.g:5399:3: rule__TimeConstraint__TimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TimeConstraint__TimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__5__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__6"
    // InternalSequence.g:5407:1: rule__TimeConstraint__Group__6 : rule__TimeConstraint__Group__6__Impl ;
    public final void rule__TimeConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5411:1: ( rule__TimeConstraint__Group__6__Impl )
            // InternalSequence.g:5412:2: rule__TimeConstraint__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeConstraint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__6"


    // $ANTLR start "rule__TimeConstraint__Group__6__Impl"
    // InternalSequence.g:5418:1: rule__TimeConstraint__Group__6__Impl : ( ']' ) ;
    public final void rule__TimeConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5422:1: ( ( ']' ) )
            // InternalSequence.g:5423:1: ( ']' )
            {
            // InternalSequence.g:5423:1: ( ']' )
            // InternalSequence.g:5424:2: ']'
            {
             before(grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__6__Impl"


    // $ANTLR start "rule__DurationConstraint__Group__0"
    // InternalSequence.g:5434:1: rule__DurationConstraint__Group__0 : rule__DurationConstraint__Group__0__Impl rule__DurationConstraint__Group__1 ;
    public final void rule__DurationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5438:1: ( rule__DurationConstraint__Group__0__Impl rule__DurationConstraint__Group__1 )
            // InternalSequence.g:5439:2: rule__DurationConstraint__Group__0__Impl rule__DurationConstraint__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DurationConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__0"


    // $ANTLR start "rule__DurationConstraint__Group__0__Impl"
    // InternalSequence.g:5446:1: rule__DurationConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__DurationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5450:1: ( ( '(' ) )
            // InternalSequence.g:5451:1: ( '(' )
            {
            // InternalSequence.g:5451:1: ( '(' )
            // InternalSequence.g:5452:2: '('
            {
             before(grammarAccess.getDurationConstraintAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDurationConstraintAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__0__Impl"


    // $ANTLR start "rule__DurationConstraint__Group__1"
    // InternalSequence.g:5461:1: rule__DurationConstraint__Group__1 : rule__DurationConstraint__Group__1__Impl rule__DurationConstraint__Group__2 ;
    public final void rule__DurationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5465:1: ( rule__DurationConstraint__Group__1__Impl rule__DurationConstraint__Group__2 )
            // InternalSequence.g:5466:2: rule__DurationConstraint__Group__1__Impl rule__DurationConstraint__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__DurationConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__1"


    // $ANTLR start "rule__DurationConstraint__Group__1__Impl"
    // InternalSequence.g:5473:1: rule__DurationConstraint__Group__1__Impl : ( ( rule__DurationConstraint__IntervalAssignment_1 ) ) ;
    public final void rule__DurationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5477:1: ( ( ( rule__DurationConstraint__IntervalAssignment_1 ) ) )
            // InternalSequence.g:5478:1: ( ( rule__DurationConstraint__IntervalAssignment_1 ) )
            {
            // InternalSequence.g:5478:1: ( ( rule__DurationConstraint__IntervalAssignment_1 ) )
            // InternalSequence.g:5479:2: ( rule__DurationConstraint__IntervalAssignment_1 )
            {
             before(grammarAccess.getDurationConstraintAccess().getIntervalAssignment_1()); 
            // InternalSequence.g:5480:2: ( rule__DurationConstraint__IntervalAssignment_1 )
            // InternalSequence.g:5480:3: rule__DurationConstraint__IntervalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DurationConstraint__IntervalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationConstraintAccess().getIntervalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__1__Impl"


    // $ANTLR start "rule__DurationConstraint__Group__2"
    // InternalSequence.g:5488:1: rule__DurationConstraint__Group__2 : rule__DurationConstraint__Group__2__Impl rule__DurationConstraint__Group__3 ;
    public final void rule__DurationConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5492:1: ( rule__DurationConstraint__Group__2__Impl rule__DurationConstraint__Group__3 )
            // InternalSequence.g:5493:2: rule__DurationConstraint__Group__2__Impl rule__DurationConstraint__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__DurationConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__2"


    // $ANTLR start "rule__DurationConstraint__Group__2__Impl"
    // InternalSequence.g:5500:1: rule__DurationConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__DurationConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5504:1: ( ( ')' ) )
            // InternalSequence.g:5505:1: ( ')' )
            {
            // InternalSequence.g:5505:1: ( ')' )
            // InternalSequence.g:5506:2: ')'
            {
             before(grammarAccess.getDurationConstraintAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDurationConstraintAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__2__Impl"


    // $ANTLR start "rule__DurationConstraint__Group__3"
    // InternalSequence.g:5515:1: rule__DurationConstraint__Group__3 : rule__DurationConstraint__Group__3__Impl rule__DurationConstraint__Group__4 ;
    public final void rule__DurationConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5519:1: ( rule__DurationConstraint__Group__3__Impl rule__DurationConstraint__Group__4 )
            // InternalSequence.g:5520:2: rule__DurationConstraint__Group__3__Impl rule__DurationConstraint__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__DurationConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__3"


    // $ANTLR start "rule__DurationConstraint__Group__3__Impl"
    // InternalSequence.g:5527:1: rule__DurationConstraint__Group__3__Impl : ( 'd' ) ;
    public final void rule__DurationConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5531:1: ( ( 'd' ) )
            // InternalSequence.g:5532:1: ( 'd' )
            {
            // InternalSequence.g:5532:1: ( 'd' )
            // InternalSequence.g:5533:2: 'd'
            {
             before(grammarAccess.getDurationConstraintAccess().getDKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDurationConstraintAccess().getDKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__3__Impl"


    // $ANTLR start "rule__DurationConstraint__Group__4"
    // InternalSequence.g:5542:1: rule__DurationConstraint__Group__4 : rule__DurationConstraint__Group__4__Impl rule__DurationConstraint__Group__5 ;
    public final void rule__DurationConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5546:1: ( rule__DurationConstraint__Group__4__Impl rule__DurationConstraint__Group__5 )
            // InternalSequence.g:5547:2: rule__DurationConstraint__Group__4__Impl rule__DurationConstraint__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__DurationConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationConstraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__4"


    // $ANTLR start "rule__DurationConstraint__Group__4__Impl"
    // InternalSequence.g:5554:1: rule__DurationConstraint__Group__4__Impl : ( '[' ) ;
    public final void rule__DurationConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5558:1: ( ( '[' ) )
            // InternalSequence.g:5559:1: ( '[' )
            {
            // InternalSequence.g:5559:1: ( '[' )
            // InternalSequence.g:5560:2: '['
            {
             before(grammarAccess.getDurationConstraintAccess().getLeftSquareBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDurationConstraintAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__4__Impl"


    // $ANTLR start "rule__DurationConstraint__Group__5"
    // InternalSequence.g:5569:1: rule__DurationConstraint__Group__5 : rule__DurationConstraint__Group__5__Impl rule__DurationConstraint__Group__6 ;
    public final void rule__DurationConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5573:1: ( rule__DurationConstraint__Group__5__Impl rule__DurationConstraint__Group__6 )
            // InternalSequence.g:5574:2: rule__DurationConstraint__Group__5__Impl rule__DurationConstraint__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__DurationConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationConstraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__5"


    // $ANTLR start "rule__DurationConstraint__Group__5__Impl"
    // InternalSequence.g:5581:1: rule__DurationConstraint__Group__5__Impl : ( ( rule__DurationConstraint__DurationAssignment_5 ) ) ;
    public final void rule__DurationConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5585:1: ( ( ( rule__DurationConstraint__DurationAssignment_5 ) ) )
            // InternalSequence.g:5586:1: ( ( rule__DurationConstraint__DurationAssignment_5 ) )
            {
            // InternalSequence.g:5586:1: ( ( rule__DurationConstraint__DurationAssignment_5 ) )
            // InternalSequence.g:5587:2: ( rule__DurationConstraint__DurationAssignment_5 )
            {
             before(grammarAccess.getDurationConstraintAccess().getDurationAssignment_5()); 
            // InternalSequence.g:5588:2: ( rule__DurationConstraint__DurationAssignment_5 )
            // InternalSequence.g:5588:3: rule__DurationConstraint__DurationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DurationConstraint__DurationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDurationConstraintAccess().getDurationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__5__Impl"


    // $ANTLR start "rule__DurationConstraint__Group__6"
    // InternalSequence.g:5596:1: rule__DurationConstraint__Group__6 : rule__DurationConstraint__Group__6__Impl ;
    public final void rule__DurationConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5600:1: ( rule__DurationConstraint__Group__6__Impl )
            // InternalSequence.g:5601:2: rule__DurationConstraint__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DurationConstraint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__6"


    // $ANTLR start "rule__DurationConstraint__Group__6__Impl"
    // InternalSequence.g:5607:1: rule__DurationConstraint__Group__6__Impl : ( ']' ) ;
    public final void rule__DurationConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5611:1: ( ( ']' ) )
            // InternalSequence.g:5612:1: ( ']' )
            {
            // InternalSequence.g:5612:1: ( ']' )
            // InternalSequence.g:5613:2: ']'
            {
             before(grammarAccess.getDurationConstraintAccess().getRightSquareBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDurationConstraintAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__Group__6__Impl"


    // $ANTLR start "rule__Observation__Group__0"
    // InternalSequence.g:5623:1: rule__Observation__Group__0 : rule__Observation__Group__0__Impl rule__Observation__Group__1 ;
    public final void rule__Observation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5627:1: ( rule__Observation__Group__0__Impl rule__Observation__Group__1 )
            // InternalSequence.g:5628:2: rule__Observation__Group__0__Impl rule__Observation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Observation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__Group__0"


    // $ANTLR start "rule__Observation__Group__0__Impl"
    // InternalSequence.g:5635:1: rule__Observation__Group__0__Impl : ( 'obs' ) ;
    public final void rule__Observation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5639:1: ( ( 'obs' ) )
            // InternalSequence.g:5640:1: ( 'obs' )
            {
            // InternalSequence.g:5640:1: ( 'obs' )
            // InternalSequence.g:5641:2: 'obs'
            {
             before(grammarAccess.getObservationAccess().getObsKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getObservationAccess().getObsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__Group__0__Impl"


    // $ANTLR start "rule__Observation__Group__1"
    // InternalSequence.g:5650:1: rule__Observation__Group__1 : rule__Observation__Group__1__Impl ;
    public final void rule__Observation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5654:1: ( rule__Observation__Group__1__Impl )
            // InternalSequence.g:5655:2: rule__Observation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__Group__1"


    // $ANTLR start "rule__Observation__Group__1__Impl"
    // InternalSequence.g:5661:1: rule__Observation__Group__1__Impl : ( ( rule__Observation__Alternatives_1 ) ) ;
    public final void rule__Observation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5665:1: ( ( ( rule__Observation__Alternatives_1 ) ) )
            // InternalSequence.g:5666:1: ( ( rule__Observation__Alternatives_1 ) )
            {
            // InternalSequence.g:5666:1: ( ( rule__Observation__Alternatives_1 ) )
            // InternalSequence.g:5667:2: ( rule__Observation__Alternatives_1 )
            {
             before(grammarAccess.getObservationAccess().getAlternatives_1()); 
            // InternalSequence.g:5668:2: ( rule__Observation__Alternatives_1 )
            // InternalSequence.g:5668:3: rule__Observation__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Observation__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getObservationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observation__Group__1__Impl"


    // $ANTLR start "rule__TimeObservation__Group__0"
    // InternalSequence.g:5677:1: rule__TimeObservation__Group__0 : rule__TimeObservation__Group__0__Impl rule__TimeObservation__Group__1 ;
    public final void rule__TimeObservation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5681:1: ( rule__TimeObservation__Group__0__Impl rule__TimeObservation__Group__1 )
            // InternalSequence.g:5682:2: rule__TimeObservation__Group__0__Impl rule__TimeObservation__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TimeObservation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeObservation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__0"


    // $ANTLR start "rule__TimeObservation__Group__0__Impl"
    // InternalSequence.g:5689:1: rule__TimeObservation__Group__0__Impl : ( '(' ) ;
    public final void rule__TimeObservation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5693:1: ( ( '(' ) )
            // InternalSequence.g:5694:1: ( '(' )
            {
            // InternalSequence.g:5694:1: ( '(' )
            // InternalSequence.g:5695:2: '('
            {
             before(grammarAccess.getTimeObservationAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTimeObservationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__0__Impl"


    // $ANTLR start "rule__TimeObservation__Group__1"
    // InternalSequence.g:5704:1: rule__TimeObservation__Group__1 : rule__TimeObservation__Group__1__Impl rule__TimeObservation__Group__2 ;
    public final void rule__TimeObservation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5708:1: ( rule__TimeObservation__Group__1__Impl rule__TimeObservation__Group__2 )
            // InternalSequence.g:5709:2: rule__TimeObservation__Group__1__Impl rule__TimeObservation__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__TimeObservation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeObservation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__1"


    // $ANTLR start "rule__TimeObservation__Group__1__Impl"
    // InternalSequence.g:5716:1: rule__TimeObservation__Group__1__Impl : ( ( rule__TimeObservation__EventAssignment_1 ) ) ;
    public final void rule__TimeObservation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5720:1: ( ( ( rule__TimeObservation__EventAssignment_1 ) ) )
            // InternalSequence.g:5721:1: ( ( rule__TimeObservation__EventAssignment_1 ) )
            {
            // InternalSequence.g:5721:1: ( ( rule__TimeObservation__EventAssignment_1 ) )
            // InternalSequence.g:5722:2: ( rule__TimeObservation__EventAssignment_1 )
            {
             before(grammarAccess.getTimeObservationAccess().getEventAssignment_1()); 
            // InternalSequence.g:5723:2: ( rule__TimeObservation__EventAssignment_1 )
            // InternalSequence.g:5723:3: rule__TimeObservation__EventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeObservation__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeObservationAccess().getEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__1__Impl"


    // $ANTLR start "rule__TimeObservation__Group__2"
    // InternalSequence.g:5731:1: rule__TimeObservation__Group__2 : rule__TimeObservation__Group__2__Impl rule__TimeObservation__Group__3 ;
    public final void rule__TimeObservation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5735:1: ( rule__TimeObservation__Group__2__Impl rule__TimeObservation__Group__3 )
            // InternalSequence.g:5736:2: rule__TimeObservation__Group__2__Impl rule__TimeObservation__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__TimeObservation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeObservation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__2"


    // $ANTLR start "rule__TimeObservation__Group__2__Impl"
    // InternalSequence.g:5743:1: rule__TimeObservation__Group__2__Impl : ( ')' ) ;
    public final void rule__TimeObservation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5747:1: ( ( ')' ) )
            // InternalSequence.g:5748:1: ( ')' )
            {
            // InternalSequence.g:5748:1: ( ')' )
            // InternalSequence.g:5749:2: ')'
            {
             before(grammarAccess.getTimeObservationAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTimeObservationAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__2__Impl"


    // $ANTLR start "rule__TimeObservation__Group__3"
    // InternalSequence.g:5758:1: rule__TimeObservation__Group__3 : rule__TimeObservation__Group__3__Impl rule__TimeObservation__Group__4 ;
    public final void rule__TimeObservation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5762:1: ( rule__TimeObservation__Group__3__Impl rule__TimeObservation__Group__4 )
            // InternalSequence.g:5763:2: rule__TimeObservation__Group__3__Impl rule__TimeObservation__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__TimeObservation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeObservation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__3"


    // $ANTLR start "rule__TimeObservation__Group__3__Impl"
    // InternalSequence.g:5770:1: rule__TimeObservation__Group__3__Impl : ( 't' ) ;
    public final void rule__TimeObservation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5774:1: ( ( 't' ) )
            // InternalSequence.g:5775:1: ( 't' )
            {
            // InternalSequence.g:5775:1: ( 't' )
            // InternalSequence.g:5776:2: 't'
            {
             before(grammarAccess.getTimeObservationAccess().getTKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTimeObservationAccess().getTKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__3__Impl"


    // $ANTLR start "rule__TimeObservation__Group__4"
    // InternalSequence.g:5785:1: rule__TimeObservation__Group__4 : rule__TimeObservation__Group__4__Impl rule__TimeObservation__Group__5 ;
    public final void rule__TimeObservation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5789:1: ( rule__TimeObservation__Group__4__Impl rule__TimeObservation__Group__5 )
            // InternalSequence.g:5790:2: rule__TimeObservation__Group__4__Impl rule__TimeObservation__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__TimeObservation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeObservation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__4"


    // $ANTLR start "rule__TimeObservation__Group__4__Impl"
    // InternalSequence.g:5797:1: rule__TimeObservation__Group__4__Impl : ( '[' ) ;
    public final void rule__TimeObservation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5801:1: ( ( '[' ) )
            // InternalSequence.g:5802:1: ( '[' )
            {
            // InternalSequence.g:5802:1: ( '[' )
            // InternalSequence.g:5803:2: '['
            {
             before(grammarAccess.getTimeObservationAccess().getLeftSquareBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTimeObservationAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__4__Impl"


    // $ANTLR start "rule__TimeObservation__Group__5"
    // InternalSequence.g:5812:1: rule__TimeObservation__Group__5 : rule__TimeObservation__Group__5__Impl rule__TimeObservation__Group__6 ;
    public final void rule__TimeObservation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5816:1: ( rule__TimeObservation__Group__5__Impl rule__TimeObservation__Group__6 )
            // InternalSequence.g:5817:2: rule__TimeObservation__Group__5__Impl rule__TimeObservation__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__TimeObservation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeObservation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__5"


    // $ANTLR start "rule__TimeObservation__Group__5__Impl"
    // InternalSequence.g:5824:1: rule__TimeObservation__Group__5__Impl : ( ( rule__TimeObservation__TimeAssignment_5 ) ) ;
    public final void rule__TimeObservation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5828:1: ( ( ( rule__TimeObservation__TimeAssignment_5 ) ) )
            // InternalSequence.g:5829:1: ( ( rule__TimeObservation__TimeAssignment_5 ) )
            {
            // InternalSequence.g:5829:1: ( ( rule__TimeObservation__TimeAssignment_5 ) )
            // InternalSequence.g:5830:2: ( rule__TimeObservation__TimeAssignment_5 )
            {
             before(grammarAccess.getTimeObservationAccess().getTimeAssignment_5()); 
            // InternalSequence.g:5831:2: ( rule__TimeObservation__TimeAssignment_5 )
            // InternalSequence.g:5831:3: rule__TimeObservation__TimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TimeObservation__TimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTimeObservationAccess().getTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__5__Impl"


    // $ANTLR start "rule__TimeObservation__Group__6"
    // InternalSequence.g:5839:1: rule__TimeObservation__Group__6 : rule__TimeObservation__Group__6__Impl ;
    public final void rule__TimeObservation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5843:1: ( rule__TimeObservation__Group__6__Impl )
            // InternalSequence.g:5844:2: rule__TimeObservation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeObservation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__6"


    // $ANTLR start "rule__TimeObservation__Group__6__Impl"
    // InternalSequence.g:5850:1: rule__TimeObservation__Group__6__Impl : ( ']' ) ;
    public final void rule__TimeObservation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5854:1: ( ( ']' ) )
            // InternalSequence.g:5855:1: ( ']' )
            {
            // InternalSequence.g:5855:1: ( ']' )
            // InternalSequence.g:5856:2: ']'
            {
             before(grammarAccess.getTimeObservationAccess().getRightSquareBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTimeObservationAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__Group__6__Impl"


    // $ANTLR start "rule__DurationObservation__Group__0"
    // InternalSequence.g:5866:1: rule__DurationObservation__Group__0 : rule__DurationObservation__Group__0__Impl rule__DurationObservation__Group__1 ;
    public final void rule__DurationObservation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5870:1: ( rule__DurationObservation__Group__0__Impl rule__DurationObservation__Group__1 )
            // InternalSequence.g:5871:2: rule__DurationObservation__Group__0__Impl rule__DurationObservation__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DurationObservation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationObservation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__0"


    // $ANTLR start "rule__DurationObservation__Group__0__Impl"
    // InternalSequence.g:5878:1: rule__DurationObservation__Group__0__Impl : ( '(' ) ;
    public final void rule__DurationObservation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5882:1: ( ( '(' ) )
            // InternalSequence.g:5883:1: ( '(' )
            {
            // InternalSequence.g:5883:1: ( '(' )
            // InternalSequence.g:5884:2: '('
            {
             before(grammarAccess.getDurationObservationAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDurationObservationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__0__Impl"


    // $ANTLR start "rule__DurationObservation__Group__1"
    // InternalSequence.g:5893:1: rule__DurationObservation__Group__1 : rule__DurationObservation__Group__1__Impl rule__DurationObservation__Group__2 ;
    public final void rule__DurationObservation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5897:1: ( rule__DurationObservation__Group__1__Impl rule__DurationObservation__Group__2 )
            // InternalSequence.g:5898:2: rule__DurationObservation__Group__1__Impl rule__DurationObservation__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__DurationObservation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationObservation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__1"


    // $ANTLR start "rule__DurationObservation__Group__1__Impl"
    // InternalSequence.g:5905:1: rule__DurationObservation__Group__1__Impl : ( ( rule__DurationObservation__IntervalAssignment_1 ) ) ;
    public final void rule__DurationObservation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5909:1: ( ( ( rule__DurationObservation__IntervalAssignment_1 ) ) )
            // InternalSequence.g:5910:1: ( ( rule__DurationObservation__IntervalAssignment_1 ) )
            {
            // InternalSequence.g:5910:1: ( ( rule__DurationObservation__IntervalAssignment_1 ) )
            // InternalSequence.g:5911:2: ( rule__DurationObservation__IntervalAssignment_1 )
            {
             before(grammarAccess.getDurationObservationAccess().getIntervalAssignment_1()); 
            // InternalSequence.g:5912:2: ( rule__DurationObservation__IntervalAssignment_1 )
            // InternalSequence.g:5912:3: rule__DurationObservation__IntervalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DurationObservation__IntervalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationObservationAccess().getIntervalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__1__Impl"


    // $ANTLR start "rule__DurationObservation__Group__2"
    // InternalSequence.g:5920:1: rule__DurationObservation__Group__2 : rule__DurationObservation__Group__2__Impl rule__DurationObservation__Group__3 ;
    public final void rule__DurationObservation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5924:1: ( rule__DurationObservation__Group__2__Impl rule__DurationObservation__Group__3 )
            // InternalSequence.g:5925:2: rule__DurationObservation__Group__2__Impl rule__DurationObservation__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__DurationObservation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationObservation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__2"


    // $ANTLR start "rule__DurationObservation__Group__2__Impl"
    // InternalSequence.g:5932:1: rule__DurationObservation__Group__2__Impl : ( ')' ) ;
    public final void rule__DurationObservation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5936:1: ( ( ')' ) )
            // InternalSequence.g:5937:1: ( ')' )
            {
            // InternalSequence.g:5937:1: ( ')' )
            // InternalSequence.g:5938:2: ')'
            {
             before(grammarAccess.getDurationObservationAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDurationObservationAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__2__Impl"


    // $ANTLR start "rule__DurationObservation__Group__3"
    // InternalSequence.g:5947:1: rule__DurationObservation__Group__3 : rule__DurationObservation__Group__3__Impl rule__DurationObservation__Group__4 ;
    public final void rule__DurationObservation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5951:1: ( rule__DurationObservation__Group__3__Impl rule__DurationObservation__Group__4 )
            // InternalSequence.g:5952:2: rule__DurationObservation__Group__3__Impl rule__DurationObservation__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__DurationObservation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationObservation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__3"


    // $ANTLR start "rule__DurationObservation__Group__3__Impl"
    // InternalSequence.g:5959:1: rule__DurationObservation__Group__3__Impl : ( 'd' ) ;
    public final void rule__DurationObservation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5963:1: ( ( 'd' ) )
            // InternalSequence.g:5964:1: ( 'd' )
            {
            // InternalSequence.g:5964:1: ( 'd' )
            // InternalSequence.g:5965:2: 'd'
            {
             before(grammarAccess.getDurationObservationAccess().getDKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDurationObservationAccess().getDKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__3__Impl"


    // $ANTLR start "rule__DurationObservation__Group__4"
    // InternalSequence.g:5974:1: rule__DurationObservation__Group__4 : rule__DurationObservation__Group__4__Impl rule__DurationObservation__Group__5 ;
    public final void rule__DurationObservation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5978:1: ( rule__DurationObservation__Group__4__Impl rule__DurationObservation__Group__5 )
            // InternalSequence.g:5979:2: rule__DurationObservation__Group__4__Impl rule__DurationObservation__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__DurationObservation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationObservation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__4"


    // $ANTLR start "rule__DurationObservation__Group__4__Impl"
    // InternalSequence.g:5986:1: rule__DurationObservation__Group__4__Impl : ( '[' ) ;
    public final void rule__DurationObservation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5990:1: ( ( '[' ) )
            // InternalSequence.g:5991:1: ( '[' )
            {
            // InternalSequence.g:5991:1: ( '[' )
            // InternalSequence.g:5992:2: '['
            {
             before(grammarAccess.getDurationObservationAccess().getLeftSquareBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDurationObservationAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__4__Impl"


    // $ANTLR start "rule__DurationObservation__Group__5"
    // InternalSequence.g:6001:1: rule__DurationObservation__Group__5 : rule__DurationObservation__Group__5__Impl rule__DurationObservation__Group__6 ;
    public final void rule__DurationObservation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6005:1: ( rule__DurationObservation__Group__5__Impl rule__DurationObservation__Group__6 )
            // InternalSequence.g:6006:2: rule__DurationObservation__Group__5__Impl rule__DurationObservation__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__DurationObservation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DurationObservation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__5"


    // $ANTLR start "rule__DurationObservation__Group__5__Impl"
    // InternalSequence.g:6013:1: rule__DurationObservation__Group__5__Impl : ( ( rule__DurationObservation__DurationAssignment_5 ) ) ;
    public final void rule__DurationObservation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6017:1: ( ( ( rule__DurationObservation__DurationAssignment_5 ) ) )
            // InternalSequence.g:6018:1: ( ( rule__DurationObservation__DurationAssignment_5 ) )
            {
            // InternalSequence.g:6018:1: ( ( rule__DurationObservation__DurationAssignment_5 ) )
            // InternalSequence.g:6019:2: ( rule__DurationObservation__DurationAssignment_5 )
            {
             before(grammarAccess.getDurationObservationAccess().getDurationAssignment_5()); 
            // InternalSequence.g:6020:2: ( rule__DurationObservation__DurationAssignment_5 )
            // InternalSequence.g:6020:3: rule__DurationObservation__DurationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DurationObservation__DurationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDurationObservationAccess().getDurationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__5__Impl"


    // $ANTLR start "rule__DurationObservation__Group__6"
    // InternalSequence.g:6028:1: rule__DurationObservation__Group__6 : rule__DurationObservation__Group__6__Impl ;
    public final void rule__DurationObservation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6032:1: ( rule__DurationObservation__Group__6__Impl )
            // InternalSequence.g:6033:2: rule__DurationObservation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DurationObservation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__6"


    // $ANTLR start "rule__DurationObservation__Group__6__Impl"
    // InternalSequence.g:6039:1: rule__DurationObservation__Group__6__Impl : ( ']' ) ;
    public final void rule__DurationObservation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6043:1: ( ( ']' ) )
            // InternalSequence.g:6044:1: ( ']' )
            {
            // InternalSequence.g:6044:1: ( ']' )
            // InternalSequence.g:6045:2: ']'
            {
             before(grammarAccess.getDurationObservationAccess().getRightSquareBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDurationObservationAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__Group__6__Impl"


    // $ANTLR start "rule__BiPointInTimeTimeIntervalSelector__Group__0"
    // InternalSequence.g:6055:1: rule__BiPointInTimeTimeIntervalSelector__Group__0 : rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl rule__BiPointInTimeTimeIntervalSelector__Group__1 ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6059:1: ( rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl rule__BiPointInTimeTimeIntervalSelector__Group__1 )
            // InternalSequence.g:6060:2: rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl rule__BiPointInTimeTimeIntervalSelector__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiPointInTimeTimeIntervalSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiPointInTimeTimeIntervalSelector__Group__0"


    // $ANTLR start "rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl"
    // InternalSequence.g:6067:1: rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl : ( ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 ) ) ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6071:1: ( ( ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 ) ) )
            // InternalSequence.g:6072:1: ( ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 ) )
            {
            // InternalSequence.g:6072:1: ( ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 ) )
            // InternalSequence.g:6073:2: ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 )
            {
             before(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getStartAssignment_0()); 
            // InternalSequence.g:6074:2: ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 )
            // InternalSequence.g:6074:3: rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl"


    // $ANTLR start "rule__BiPointInTimeTimeIntervalSelector__Group__1"
    // InternalSequence.g:6082:1: rule__BiPointInTimeTimeIntervalSelector__Group__1 : rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl rule__BiPointInTimeTimeIntervalSelector__Group__2 ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6086:1: ( rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl rule__BiPointInTimeTimeIntervalSelector__Group__2 )
            // InternalSequence.g:6087:2: rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl rule__BiPointInTimeTimeIntervalSelector__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiPointInTimeTimeIntervalSelector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiPointInTimeTimeIntervalSelector__Group__1"


    // $ANTLR start "rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl"
    // InternalSequence.g:6094:1: rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl : ( ',' ) ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6098:1: ( ( ',' ) )
            // InternalSequence.g:6099:1: ( ',' )
            {
            // InternalSequence.g:6099:1: ( ',' )
            // InternalSequence.g:6100:2: ','
            {
             before(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getCommaKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl"


    // $ANTLR start "rule__BiPointInTimeTimeIntervalSelector__Group__2"
    // InternalSequence.g:6109:1: rule__BiPointInTimeTimeIntervalSelector__Group__2 : rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6113:1: ( rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl )
            // InternalSequence.g:6114:2: rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiPointInTimeTimeIntervalSelector__Group__2"


    // $ANTLR start "rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl"
    // InternalSequence.g:6120:1: rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl : ( ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 ) ) ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6124:1: ( ( ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 ) ) )
            // InternalSequence.g:6125:1: ( ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 ) )
            {
            // InternalSequence.g:6125:1: ( ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 ) )
            // InternalSequence.g:6126:2: ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 )
            {
             before(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getEndAssignment_2()); 
            // InternalSequence.g:6127:2: ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 )
            // InternalSequence.g:6127:3: rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalSequence.g:6136:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6140:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSequence.g:6141:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalSequence.g:6148:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6152:1: ( ( RULE_ID ) )
            // InternalSequence.g:6153:1: ( RULE_ID )
            {
            // InternalSequence.g:6153:1: ( RULE_ID )
            // InternalSequence.g:6154:2: RULE_ID
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
    // InternalSequence.g:6163:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6167:1: ( rule__FQN__Group__1__Impl )
            // InternalSequence.g:6168:2: rule__FQN__Group__1__Impl
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
    // InternalSequence.g:6174:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6178:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSequence.g:6179:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSequence.g:6179:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSequence.g:6180:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSequence.g:6181:2: ( rule__FQN__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==47) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSequence.g:6181:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalSequence.g:6190:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6194:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSequence.g:6195:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSequence.g:6202:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6206:1: ( ( '.' ) )
            // InternalSequence.g:6207:1: ( '.' )
            {
            // InternalSequence.g:6207:1: ( '.' )
            // InternalSequence.g:6208:2: '.'
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
    // InternalSequence.g:6217:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6221:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSequence.g:6222:2: rule__FQN__Group_1__1__Impl
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
    // InternalSequence.g:6228:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6232:1: ( ( RULE_ID ) )
            // InternalSequence.g:6233:1: ( RULE_ID )
            {
            // InternalSequence.g:6233:1: ( RULE_ID )
            // InternalSequence.g:6234:2: RULE_ID
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


    // $ANTLR start "rule__InlineComment__Group__0"
    // InternalSequence.g:6244:1: rule__InlineComment__Group__0 : rule__InlineComment__Group__0__Impl rule__InlineComment__Group__1 ;
    public final void rule__InlineComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6248:1: ( rule__InlineComment__Group__0__Impl rule__InlineComment__Group__1 )
            // InternalSequence.g:6249:2: rule__InlineComment__Group__0__Impl rule__InlineComment__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__InlineComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineComment__Group__0"


    // $ANTLR start "rule__InlineComment__Group__0__Impl"
    // InternalSequence.g:6256:1: rule__InlineComment__Group__0__Impl : ( 'note' ) ;
    public final void rule__InlineComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6260:1: ( ( 'note' ) )
            // InternalSequence.g:6261:1: ( 'note' )
            {
            // InternalSequence.g:6261:1: ( 'note' )
            // InternalSequence.g:6262:2: 'note'
            {
             before(grammarAccess.getInlineCommentAccess().getNoteKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInlineCommentAccess().getNoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineComment__Group__0__Impl"


    // $ANTLR start "rule__InlineComment__Group__1"
    // InternalSequence.g:6271:1: rule__InlineComment__Group__1 : rule__InlineComment__Group__1__Impl rule__InlineComment__Group__2 ;
    public final void rule__InlineComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6275:1: ( rule__InlineComment__Group__1__Impl rule__InlineComment__Group__2 )
            // InternalSequence.g:6276:2: rule__InlineComment__Group__1__Impl rule__InlineComment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__InlineComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineComment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineComment__Group__1"


    // $ANTLR start "rule__InlineComment__Group__1__Impl"
    // InternalSequence.g:6283:1: rule__InlineComment__Group__1__Impl : ( '[' ) ;
    public final void rule__InlineComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6287:1: ( ( '[' ) )
            // InternalSequence.g:6288:1: ( '[' )
            {
            // InternalSequence.g:6288:1: ( '[' )
            // InternalSequence.g:6289:2: '['
            {
             before(grammarAccess.getInlineCommentAccess().getLeftSquareBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInlineCommentAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineComment__Group__1__Impl"


    // $ANTLR start "rule__InlineComment__Group__2"
    // InternalSequence.g:6298:1: rule__InlineComment__Group__2 : rule__InlineComment__Group__2__Impl rule__InlineComment__Group__3 ;
    public final void rule__InlineComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6302:1: ( rule__InlineComment__Group__2__Impl rule__InlineComment__Group__3 )
            // InternalSequence.g:6303:2: rule__InlineComment__Group__2__Impl rule__InlineComment__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__InlineComment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineComment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineComment__Group__2"


    // $ANTLR start "rule__InlineComment__Group__2__Impl"
    // InternalSequence.g:6310:1: rule__InlineComment__Group__2__Impl : ( ( rule__InlineComment__BodyAssignment_2 ) ) ;
    public final void rule__InlineComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6314:1: ( ( ( rule__InlineComment__BodyAssignment_2 ) ) )
            // InternalSequence.g:6315:1: ( ( rule__InlineComment__BodyAssignment_2 ) )
            {
            // InternalSequence.g:6315:1: ( ( rule__InlineComment__BodyAssignment_2 ) )
            // InternalSequence.g:6316:2: ( rule__InlineComment__BodyAssignment_2 )
            {
             before(grammarAccess.getInlineCommentAccess().getBodyAssignment_2()); 
            // InternalSequence.g:6317:2: ( rule__InlineComment__BodyAssignment_2 )
            // InternalSequence.g:6317:3: rule__InlineComment__BodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InlineComment__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInlineCommentAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineComment__Group__2__Impl"


    // $ANTLR start "rule__InlineComment__Group__3"
    // InternalSequence.g:6325:1: rule__InlineComment__Group__3 : rule__InlineComment__Group__3__Impl ;
    public final void rule__InlineComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6329:1: ( rule__InlineComment__Group__3__Impl )
            // InternalSequence.g:6330:2: rule__InlineComment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InlineComment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineComment__Group__3"


    // $ANTLR start "rule__InlineComment__Group__3__Impl"
    // InternalSequence.g:6336:1: rule__InlineComment__Group__3__Impl : ( ']' ) ;
    public final void rule__InlineComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6340:1: ( ( ']' ) )
            // InternalSequence.g:6341:1: ( ']' )
            {
            // InternalSequence.g:6341:1: ( ']' )
            // InternalSequence.g:6342:2: ']'
            {
             before(grammarAccess.getInlineCommentAccess().getRightSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInlineCommentAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineComment__Group__3__Impl"


    // $ANTLR start "rule__SequenceDiagram__TitleAssignment_2"
    // InternalSequence.g:6352:1: rule__SequenceDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SequenceDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6356:1: ( ( RULE_STRING ) )
            // InternalSequence.g:6357:2: ( RULE_STRING )
            {
            // InternalSequence.g:6357:2: ( RULE_STRING )
            // InternalSequence.g:6358:3: RULE_STRING
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
    // InternalSequence.g:6367:1: rule__SequenceDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__SequenceDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6371:1: ( ( ruleRootPackage ) )
            // InternalSequence.g:6372:2: ( ruleRootPackage )
            {
            // InternalSequence.g:6372:2: ( ruleRootPackage )
            // InternalSequence.g:6373:3: ruleRootPackage
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
    // InternalSequence.g:6382:1: rule__SequenceDiagram__ActorsAssignment_4 : ( ruleActor ) ;
    public final void rule__SequenceDiagram__ActorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6386:1: ( ( ruleActor ) )
            // InternalSequence.g:6387:2: ( ruleActor )
            {
            // InternalSequence.g:6387:2: ( ruleActor )
            // InternalSequence.g:6388:3: ruleActor
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


    // $ANTLR start "rule__SequenceDiagram__FragmentsAssignment_5"
    // InternalSequence.g:6397:1: rule__SequenceDiagram__FragmentsAssignment_5 : ( ruleFragment ) ;
    public final void rule__SequenceDiagram__FragmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6401:1: ( ( ruleFragment ) )
            // InternalSequence.g:6402:2: ( ruleFragment )
            {
            // InternalSequence.g:6402:2: ( ruleFragment )
            // InternalSequence.g:6403:3: ruleFragment
            {
             before(grammarAccess.getSequenceDiagramAccess().getFragmentsFragmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getSequenceDiagramAccess().getFragmentsFragmentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__FragmentsAssignment_5"


    // $ANTLR start "rule__SequenceDiagram__FragmentsAssignment_6"
    // InternalSequence.g:6412:1: rule__SequenceDiagram__FragmentsAssignment_6 : ( ( rule__SequenceDiagram__FragmentsAlternatives_6_0 ) ) ;
    public final void rule__SequenceDiagram__FragmentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6416:1: ( ( ( rule__SequenceDiagram__FragmentsAlternatives_6_0 ) ) )
            // InternalSequence.g:6417:2: ( ( rule__SequenceDiagram__FragmentsAlternatives_6_0 ) )
            {
            // InternalSequence.g:6417:2: ( ( rule__SequenceDiagram__FragmentsAlternatives_6_0 ) )
            // InternalSequence.g:6418:3: ( rule__SequenceDiagram__FragmentsAlternatives_6_0 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getFragmentsAlternatives_6_0()); 
            // InternalSequence.g:6419:3: ( rule__SequenceDiagram__FragmentsAlternatives_6_0 )
            // InternalSequence.g:6419:4: rule__SequenceDiagram__FragmentsAlternatives_6_0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceDiagram__FragmentsAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceDiagramAccess().getFragmentsAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceDiagram__FragmentsAssignment_6"


    // $ANTLR start "rule__RootPackage__NameAssignment_1"
    // InternalSequence.g:6427:1: rule__RootPackage__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6431:1: ( ( ruleFQN ) )
            // InternalSequence.g:6432:2: ( ruleFQN )
            {
            // InternalSequence.g:6432:2: ( ruleFQN )
            // InternalSequence.g:6433:3: ruleFQN
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
    // InternalSequence.g:6442:1: rule__Actor__DeferredAssignment_0 : ( ( 'def' ) ) ;
    public final void rule__Actor__DeferredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6446:1: ( ( ( 'def' ) ) )
            // InternalSequence.g:6447:2: ( ( 'def' ) )
            {
            // InternalSequence.g:6447:2: ( ( 'def' ) )
            // InternalSequence.g:6448:3: ( 'def' )
            {
             before(grammarAccess.getActorAccess().getDeferredDefKeyword_0_0()); 
            // InternalSequence.g:6449:3: ( 'def' )
            // InternalSequence.g:6450:4: 'def'
            {
             before(grammarAccess.getActorAccess().getDeferredDefKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSequence.g:6461:1: rule__Actor__NameAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6465:1: ( ( RULE_ID ) )
            // InternalSequence.g:6466:2: ( RULE_ID )
            {
            // InternalSequence.g:6466:2: ( RULE_ID )
            // InternalSequence.g:6467:3: RULE_ID
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
    // InternalSequence.g:6476:1: rule__Actor__TypeMappingAssignment_2_0_1 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6480:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:6481:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:6481:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:6482:3: ruleActorClassifierMapping
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
    // InternalSequence.g:6491:1: rule__Actor__TypeMappingAssignment_2_1_0 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6495:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:6496:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:6496:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:6497:3: ruleActorClassifierMapping
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
    // InternalSequence.g:6506:1: rule__Actor__AliasAssignment_2_1_2 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6510:1: ( ( RULE_ID ) )
            // InternalSequence.g:6511:2: ( RULE_ID )
            {
            // InternalSequence.g:6511:2: ( RULE_ID )
            // InternalSequence.g:6512:3: RULE_ID
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
    // InternalSequence.g:6521:1: rule__Actor__NameAssignment_2_2_0 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6525:1: ( ( RULE_STRING ) )
            // InternalSequence.g:6526:2: ( RULE_STRING )
            {
            // InternalSequence.g:6526:2: ( RULE_STRING )
            // InternalSequence.g:6527:3: RULE_STRING
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
    // InternalSequence.g:6536:1: rule__Actor__TypeMappingAssignment_2_2_1 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6540:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:6541:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:6541:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:6542:3: ruleActorClassifierMapping
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
    // InternalSequence.g:6551:1: rule__Actor__AliasAssignment_2_2_3 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6555:1: ( ( RULE_ID ) )
            // InternalSequence.g:6556:2: ( RULE_ID )
            {
            // InternalSequence.g:6556:2: ( RULE_ID )
            // InternalSequence.g:6557:3: RULE_ID
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
    // InternalSequence.g:6566:1: rule__Actor__ActorTypeAssignment_3_1 : ( ruleActorType ) ;
    public final void rule__Actor__ActorTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6570:1: ( ( ruleActorType ) )
            // InternalSequence.g:6571:2: ( ruleActorType )
            {
            // InternalSequence.g:6571:2: ( ruleActorType )
            // InternalSequence.g:6572:3: ruleActorType
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


    // $ANTLR start "rule__Actor__CommentsAssignment_4"
    // InternalSequence.g:6581:1: rule__Actor__CommentsAssignment_4 : ( ruleInlineComment ) ;
    public final void rule__Actor__CommentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6585:1: ( ( ruleInlineComment ) )
            // InternalSequence.g:6586:2: ( ruleInlineComment )
            {
            // InternalSequence.g:6586:2: ( ruleInlineComment )
            // InternalSequence.g:6587:3: ruleInlineComment
            {
             before(grammarAccess.getActorAccess().getCommentsInlineCommentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInlineComment();

            state._fsp--;

             after(grammarAccess.getActorAccess().getCommentsInlineCommentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__CommentsAssignment_4"


    // $ANTLR start "rule__ActorClassifierMapping__ClassifierAssignment_1"
    // InternalSequence.g:6596:1: rule__ActorClassifierMapping__ClassifierAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ActorClassifierMapping__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6600:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:6601:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:6601:2: ( ( ruleFQN ) )
            // InternalSequence.g:6602:3: ( ruleFQN )
            {
             before(grammarAccess.getActorClassifierMappingAccess().getClassifierClassifierCrossReference_1_0()); 
            // InternalSequence.g:6603:3: ( ruleFQN )
            // InternalSequence.g:6604:4: ruleFQN
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


    // $ANTLR start "rule__OneFragment__FragmentsAssignment"
    // InternalSequence.g:6615:1: rule__OneFragment__FragmentsAssignment : ( ruleFragment ) ;
    public final void rule__OneFragment__FragmentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6619:1: ( ( ruleFragment ) )
            // InternalSequence.g:6620:2: ( ruleFragment )
            {
            // InternalSequence.g:6620:2: ( ruleFragment )
            // InternalSequence.g:6621:3: ruleFragment
            {
             before(grammarAccess.getOneFragmentAccess().getFragmentsFragmentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getOneFragmentAccess().getFragmentsFragmentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneFragment__FragmentsAssignment"


    // $ANTLR start "rule__OneOrMultipleFragments__FragmentsAssignment"
    // InternalSequence.g:6630:1: rule__OneOrMultipleFragments__FragmentsAssignment : ( ruleFragment ) ;
    public final void rule__OneOrMultipleFragments__FragmentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6634:1: ( ( ruleFragment ) )
            // InternalSequence.g:6635:2: ( ruleFragment )
            {
            // InternalSequence.g:6635:2: ( ruleFragment )
            // InternalSequence.g:6636:3: ruleFragment
            {
             before(grammarAccess.getOneOrMultipleFragmentsAccess().getFragmentsFragmentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getOneOrMultipleFragmentsAccess().getFragmentsFragmentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneOrMultipleFragments__FragmentsAssignment"


    // $ANTLR start "rule__Condition__ConditionAssignment_1"
    // InternalSequence.g:6645:1: rule__Condition__ConditionAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__Condition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6649:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:6650:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:6650:2: ( ruleUnescapedString )
            // InternalSequence.g:6651:3: ruleUnescapedString
            {
             before(grammarAccess.getConditionAccess().getConditionUnescapedStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getConditionUnescapedStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConditionAssignment_1"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0"
    // InternalSequence.g:6660:1: rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 : ( ruleCondition ) ;
    public final void rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6664:1: ( ( ruleCondition ) )
            // InternalSequence.g:6665:2: ( ruleCondition )
            {
            // InternalSequence.g:6665:2: ( ruleCondition )
            // InternalSequence.g:6666:3: ruleCondition
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getConditionConditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getConditionConditionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1"
    // InternalSequence.g:6675:1: rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 : ( ruleFragment ) ;
    public final void rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6679:1: ( ( ruleFragment ) )
            // InternalSequence.g:6680:2: ( ruleFragment )
            {
            // InternalSequence.g:6680:2: ( ruleFragment )
            // InternalSequence.g:6681:3: ruleFragment
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsFragmentParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsFragmentParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1"


    // $ANTLR start "rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1"
    // InternalSequence.g:6690:1: rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1 : ( ruleFragment ) ;
    public final void rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6694:1: ( ( ruleFragment ) )
            // InternalSequence.g:6695:2: ( ruleFragment )
            {
            // InternalSequence.g:6695:2: ( ruleFragment )
            // InternalSequence.g:6696:3: ruleFragment
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsFragmentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsFragmentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1"


    // $ANTLR start "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0"
    // InternalSequence.g:6705:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 : ( ruleCondition ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6709:1: ( ( ruleCondition ) )
            // InternalSequence.g:6710:2: ( ruleCondition )
            {
            // InternalSequence.g:6710:2: ( ruleCondition )
            // InternalSequence.g:6711:3: ruleCondition
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getConditionConditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getConditionConditionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0"


    // $ANTLR start "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2"
    // InternalSequence.g:6720:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 : ( ruleFragment ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6724:1: ( ( ruleFragment ) )
            // InternalSequence.g:6725:2: ( ruleFragment )
            {
            // InternalSequence.g:6725:2: ( ruleFragment )
            // InternalSequence.g:6726:3: ruleFragment
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsFragmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsFragmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2"


    // $ANTLR start "rule__Message__AliasAssignment_1_1"
    // InternalSequence.g:6735:1: rule__Message__AliasAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Message__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6739:1: ( ( RULE_ID ) )
            // InternalSequence.g:6740:2: ( RULE_ID )
            {
            // InternalSequence.g:6740:2: ( RULE_ID )
            // InternalSequence.g:6741:3: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getAliasIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getAliasIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__AliasAssignment_1_1"


    // $ANTLR start "rule__Message__SendEventAssignment_2"
    // InternalSequence.g:6750:1: rule__Message__SendEventAssignment_2 : ( ruleImplicitSendOccurenceSpecification ) ;
    public final void rule__Message__SendEventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6754:1: ( ( ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:6755:2: ( ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:6755:2: ( ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:6756:3: ruleImplicitSendOccurenceSpecification
            {
             before(grammarAccess.getMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitSendOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__SendEventAssignment_2"


    // $ANTLR start "rule__Message__ArrivalEventAssignment_3_0"
    // InternalSequence.g:6765:1: rule__Message__ArrivalEventAssignment_3_0 : ( ruleExplicitArrivalOccurenceReference ) ;
    public final void rule__Message__ArrivalEventAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6769:1: ( ( ruleExplicitArrivalOccurenceReference ) )
            // InternalSequence.g:6770:2: ( ruleExplicitArrivalOccurenceReference )
            {
            // InternalSequence.g:6770:2: ( ruleExplicitArrivalOccurenceReference )
            // InternalSequence.g:6771:3: ruleExplicitArrivalOccurenceReference
            {
             before(grammarAccess.getMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExplicitArrivalOccurenceReference();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ArrivalEventAssignment_3_0"


    // $ANTLR start "rule__Message__ArrivalEventAssignment_3_1"
    // InternalSequence.g:6780:1: rule__Message__ArrivalEventAssignment_3_1 : ( ruleImplicitArrivalOccurenceSpecification ) ;
    public final void rule__Message__ArrivalEventAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6784:1: ( ( ruleImplicitArrivalOccurenceSpecification ) )
            // InternalSequence.g:6785:2: ( ruleImplicitArrivalOccurenceSpecification )
            {
            // InternalSequence.g:6785:2: ( ruleImplicitArrivalOccurenceSpecification )
            // InternalSequence.g:6786:3: ruleImplicitArrivalOccurenceSpecification
            {
             before(grammarAccess.getMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitArrivalOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ArrivalEventAssignment_3_1"


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2"
    // InternalSequence.g:6795:1: rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6799:1: ( ( ( RULE_ID ) ) )
            // InternalSequence.g:6800:2: ( ( RULE_ID ) )
            {
            // InternalSequence.g:6800:2: ( ( RULE_ID ) )
            // InternalSequence.g:6801:3: ( RULE_ID )
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getOccurenceSpecificationExplicitArrivalOccurenceSpecificationCrossReference_2_0()); 
            // InternalSequence.g:6802:3: ( RULE_ID )
            // InternalSequence.g:6803:4: RULE_ID
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getOccurenceSpecificationExplicitArrivalOccurenceSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getOccurenceSpecificationExplicitArrivalOccurenceSpecificationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getOccurenceSpecificationExplicitArrivalOccurenceSpecificationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2"


    // $ANTLR start "rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1"
    // InternalSequence.g:6814:1: rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6818:1: ( ( RULE_ID ) )
            // InternalSequence.g:6819:2: ( RULE_ID )
            {
            // InternalSequence.g:6819:2: ( RULE_ID )
            // InternalSequence.g:6820:3: RULE_ID
            {
             before(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1"


    // $ANTLR start "rule__StandardMessage__TypeAssignment_0"
    // InternalSequence.g:6829:1: rule__StandardMessage__TypeAssignment_0 : ( ruleMessageType ) ;
    public final void rule__StandardMessage__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6833:1: ( ( ruleMessageType ) )
            // InternalSequence.g:6834:2: ( ruleMessageType )
            {
            // InternalSequence.g:6834:2: ( ruleMessageType )
            // InternalSequence.g:6835:3: ruleMessageType
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
    // InternalSequence.g:6844:1: rule__StandardMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__StandardMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6848:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:6849:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:6849:2: ( ruleUnescapedString )
            // InternalSequence.g:6850:3: ruleUnescapedString
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
    // InternalSequence.g:6859:1: rule__StandardMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6863:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:6864:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:6864:2: ( ( ruleFQN ) )
            // InternalSequence.g:6865:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:6866:3: ( ruleFQN )
            // InternalSequence.g:6867:4: ruleFQN
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
    // InternalSequence.g:6878:1: rule__StandardMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6882:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:6883:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:6883:2: ( ( ruleFQN ) )
            // InternalSequence.g:6884:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:6885:3: ( ruleFQN )
            // InternalSequence.g:6886:4: ruleFQN
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
    // InternalSequence.g:6897:1: rule__ResponseMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__ResponseMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6901:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:6902:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:6902:2: ( ruleUnescapedString )
            // InternalSequence.g:6903:3: ruleUnescapedString
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
    // InternalSequence.g:6912:1: rule__ResponseMessage__LeftAssignment_3_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__LeftAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6916:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:6917:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:6917:2: ( ( ruleFQN ) )
            // InternalSequence.g:6918:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getLeftActorCrossReference_3_0_0()); 
            // InternalSequence.g:6919:3: ( ruleFQN )
            // InternalSequence.g:6920:4: ruleFQN
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
    // InternalSequence.g:6931:1: rule__ResponseMessage__RightAssignment_5_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__RightAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6935:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:6936:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:6936:2: ( ( ruleFQN ) )
            // InternalSequence.g:6937:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getRightActorCrossReference_5_0_0()); 
            // InternalSequence.g:6938:3: ( ruleFQN )
            // InternalSequence.g:6939:4: ruleFQN
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
    // InternalSequence.g:6950:1: rule__FoundMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__FoundMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6954:1: ( ( ruleMessageType ) )
            // InternalSequence.g:6955:2: ( ruleMessageType )
            {
            // InternalSequence.g:6955:2: ( ruleMessageType )
            // InternalSequence.g:6956:3: ruleMessageType
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
    // InternalSequence.g:6965:1: rule__FoundMessage__NameAssignment_2 : ( ruleUnescapedString ) ;
    public final void rule__FoundMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6969:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:6970:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:6970:2: ( ruleUnescapedString )
            // InternalSequence.g:6971:3: ruleUnescapedString
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
    // InternalSequence.g:6980:1: rule__FoundMessage__RightAssignment_6 : ( ( ruleFQN ) ) ;
    public final void rule__FoundMessage__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6984:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:6985:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:6985:2: ( ( ruleFQN ) )
            // InternalSequence.g:6986:3: ( ruleFQN )
            {
             before(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0()); 
            // InternalSequence.g:6987:3: ( ruleFQN )
            // InternalSequence.g:6988:4: ruleFQN
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


    // $ANTLR start "rule__LostMessage__TypeAssignment_1_1_1"
    // InternalSequence.g:6999:1: rule__LostMessage__TypeAssignment_1_1_1 : ( ruleMessageType ) ;
    public final void rule__LostMessage__TypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7003:1: ( ( ruleMessageType ) )
            // InternalSequence.g:7004:2: ( ruleMessageType )
            {
            // InternalSequence.g:7004:2: ( ruleMessageType )
            // InternalSequence.g:7005:3: ruleMessageType
            {
             before(grammarAccess.getLostMessageAccess().getTypeMessageTypeEnumRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getLostMessageAccess().getTypeMessageTypeEnumRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__TypeAssignment_1_1_1"


    // $ANTLR start "rule__LostMessage__NameAssignment_2"
    // InternalSequence.g:7014:1: rule__LostMessage__NameAssignment_2 : ( ruleUnescapedString ) ;
    public final void rule__LostMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7018:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7019:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7019:2: ( ruleUnescapedString )
            // InternalSequence.g:7020:3: ruleUnescapedString
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
    // InternalSequence.g:7029:1: rule__LostMessage__LeftAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__LostMessage__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7033:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7034:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7034:2: ( ( ruleFQN ) )
            // InternalSequence.g:7035:3: ( ruleFQN )
            {
             before(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0()); 
            // InternalSequence.g:7036:3: ( ruleFQN )
            // InternalSequence.g:7037:4: ruleFQN
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
    // InternalSequence.g:7048:1: rule__CreateMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__CreateMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7052:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7053:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7053:2: ( ruleUnescapedString )
            // InternalSequence.g:7054:3: ruleUnescapedString
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
    // InternalSequence.g:7063:1: rule__CreateMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7067:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7068:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7068:2: ( ( ruleFQN ) )
            // InternalSequence.g:7069:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:7070:3: ( ruleFQN )
            // InternalSequence.g:7071:4: ruleFQN
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
    // InternalSequence.g:7082:1: rule__CreateMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7086:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7087:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7087:2: ( ( ruleFQN ) )
            // InternalSequence.g:7088:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:7089:3: ( ruleFQN )
            // InternalSequence.g:7090:4: ruleFQN
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
    // InternalSequence.g:7101:1: rule__DestructionMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__DestructionMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7105:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7106:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7106:2: ( ruleUnescapedString )
            // InternalSequence.g:7107:3: ruleUnescapedString
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
    // InternalSequence.g:7116:1: rule__DestructionMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7120:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7121:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7121:2: ( ( ruleFQN ) )
            // InternalSequence.g:7122:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:7123:3: ( ruleFQN )
            // InternalSequence.g:7124:4: ruleFQN
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
    // InternalSequence.g:7135:1: rule__DestructionMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7139:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7140:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7140:2: ( ( ruleFQN ) )
            // InternalSequence.g:7141:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:7142:3: ( ruleFQN )
            // InternalSequence.g:7143:4: ruleFQN
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
    // InternalSequence.g:7154:1: rule__DestructionOccurenceSpecification__TargetAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionOccurenceSpecification__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7158:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7159:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7159:2: ( ( ruleFQN ) )
            // InternalSequence.g:7160:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetActorCrossReference_1_0()); 
            // InternalSequence.g:7161:3: ( ruleFQN )
            // InternalSequence.g:7162:4: ruleFQN
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


    // $ANTLR start "rule__Parallel__RegionsAssignment_2"
    // InternalSequence.g:7173:1: rule__Parallel__RegionsAssignment_2 : ( ruleOrderedFragmentContainer ) ;
    public final void rule__Parallel__RegionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7177:1: ( ( ruleOrderedFragmentContainer ) )
            // InternalSequence.g:7178:2: ( ruleOrderedFragmentContainer )
            {
            // InternalSequence.g:7178:2: ( ruleOrderedFragmentContainer )
            // InternalSequence.g:7179:3: ruleOrderedFragmentContainer
            {
             before(grammarAccess.getParallelAccess().getRegionsOrderedFragmentContainerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderedFragmentContainer();

            state._fsp--;

             after(grammarAccess.getParallelAccess().getRegionsOrderedFragmentContainerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__RegionsAssignment_2"


    // $ANTLR start "rule__Alternative__RegionsAssignment_2"
    // InternalSequence.g:7188:1: rule__Alternative__RegionsAssignment_2 : ( ruleOrderedFragmentContainerWithCondition ) ;
    public final void rule__Alternative__RegionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7192:1: ( ( ruleOrderedFragmentContainerWithCondition ) )
            // InternalSequence.g:7193:2: ( ruleOrderedFragmentContainerWithCondition )
            {
            // InternalSequence.g:7193:2: ( ruleOrderedFragmentContainerWithCondition )
            // InternalSequence.g:7194:3: ruleOrderedFragmentContainerWithCondition
            {
             before(grammarAccess.getAlternativeAccess().getRegionsOrderedFragmentContainerWithConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderedFragmentContainerWithCondition();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getRegionsOrderedFragmentContainerWithConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__RegionsAssignment_2"


    // $ANTLR start "rule__Loop__RegionAssignment_1"
    // InternalSequence.g:7203:1: rule__Loop__RegionAssignment_1 : ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ;
    public final void rule__Loop__RegionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7207:1: ( ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) )
            // InternalSequence.g:7208:2: ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            {
            // InternalSequence.g:7208:2: ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            // InternalSequence.g:7209:3: ruleOrderedFragmentContainerWithConditionMandatoryBrackets
            {
             before(grammarAccess.getLoopAccess().getRegionOrderedFragmentContainerWithConditionMandatoryBracketsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderedFragmentContainerWithConditionMandatoryBrackets();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getRegionOrderedFragmentContainerWithConditionMandatoryBracketsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__RegionAssignment_1"


    // $ANTLR start "rule__Option__RegionAssignment_1"
    // InternalSequence.g:7218:1: rule__Option__RegionAssignment_1 : ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ;
    public final void rule__Option__RegionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7222:1: ( ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) )
            // InternalSequence.g:7223:2: ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            {
            // InternalSequence.g:7223:2: ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            // InternalSequence.g:7224:3: ruleOrderedFragmentContainerWithConditionMandatoryBrackets
            {
             before(grammarAccess.getOptionAccess().getRegionOrderedFragmentContainerWithConditionMandatoryBracketsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderedFragmentContainerWithConditionMandatoryBrackets();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getRegionOrderedFragmentContainerWithConditionMandatoryBracketsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__RegionAssignment_1"


    // $ANTLR start "rule__Critical__RegionAssignment_2"
    // InternalSequence.g:7233:1: rule__Critical__RegionAssignment_2 : ( ruleOneOrMultipleFragments ) ;
    public final void rule__Critical__RegionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7237:1: ( ( ruleOneOrMultipleFragments ) )
            // InternalSequence.g:7238:2: ( ruleOneOrMultipleFragments )
            {
            // InternalSequence.g:7238:2: ( ruleOneOrMultipleFragments )
            // InternalSequence.g:7239:3: ruleOneOrMultipleFragments
            {
             before(grammarAccess.getCriticalAccess().getRegionOneOrMultipleFragmentsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOneOrMultipleFragments();

            state._fsp--;

             after(grammarAccess.getCriticalAccess().getRegionOneOrMultipleFragmentsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Critical__RegionAssignment_2"


    // $ANTLR start "rule__Reference__ReferenceAssignment_1"
    // InternalSequence.g:7248:1: rule__Reference__ReferenceAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Reference__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7252:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7253:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7253:2: ( ( ruleFQN ) )
            // InternalSequence.g:7254:3: ( ruleFQN )
            {
             before(grammarAccess.getReferenceAccess().getReferenceInteractionCrossReference_1_0()); 
            // InternalSequence.g:7255:3: ( ruleFQN )
            // InternalSequence.g:7256:4: ruleFQN
            {
             before(grammarAccess.getReferenceAccess().getReferenceInteractionFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getReferenceInteractionFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getReferenceInteractionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ReferenceAssignment_1"


    // $ANTLR start "rule__Reference__AliasAssignment_2_1"
    // InternalSequence.g:7267:1: rule__Reference__AliasAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Reference__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7271:1: ( ( RULE_ID ) )
            // InternalSequence.g:7272:2: ( RULE_ID )
            {
            // InternalSequence.g:7272:2: ( RULE_ID )
            // InternalSequence.g:7273:3: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getAliasIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getAliasIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__AliasAssignment_2_1"


    // $ANTLR start "rule__TimeConstraint__EventAssignment_1"
    // InternalSequence.g:7282:1: rule__TimeConstraint__EventAssignment_1 : ( rulePointInTimeSelector ) ;
    public final void rule__TimeConstraint__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7286:1: ( ( rulePointInTimeSelector ) )
            // InternalSequence.g:7287:2: ( rulePointInTimeSelector )
            {
            // InternalSequence.g:7287:2: ( rulePointInTimeSelector )
            // InternalSequence.g:7288:3: rulePointInTimeSelector
            {
             before(grammarAccess.getTimeConstraintAccess().getEventPointInTimeSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePointInTimeSelector();

            state._fsp--;

             after(grammarAccess.getTimeConstraintAccess().getEventPointInTimeSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__EventAssignment_1"


    // $ANTLR start "rule__TimeConstraint__TimeAssignment_5"
    // InternalSequence.g:7297:1: rule__TimeConstraint__TimeAssignment_5 : ( ruleUnescapedString ) ;
    public final void rule__TimeConstraint__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7301:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7302:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7302:2: ( ruleUnescapedString )
            // InternalSequence.g:7303:3: ruleUnescapedString
            {
             before(grammarAccess.getTimeConstraintAccess().getTimeUnescapedStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getTimeConstraintAccess().getTimeUnescapedStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__TimeAssignment_5"


    // $ANTLR start "rule__DurationConstraint__IntervalAssignment_1"
    // InternalSequence.g:7312:1: rule__DurationConstraint__IntervalAssignment_1 : ( ruleTimeIntervalSelector ) ;
    public final void rule__DurationConstraint__IntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7316:1: ( ( ruleTimeIntervalSelector ) )
            // InternalSequence.g:7317:2: ( ruleTimeIntervalSelector )
            {
            // InternalSequence.g:7317:2: ( ruleTimeIntervalSelector )
            // InternalSequence.g:7318:3: ruleTimeIntervalSelector
            {
             before(grammarAccess.getDurationConstraintAccess().getIntervalTimeIntervalSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeIntervalSelector();

            state._fsp--;

             after(grammarAccess.getDurationConstraintAccess().getIntervalTimeIntervalSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__IntervalAssignment_1"


    // $ANTLR start "rule__DurationConstraint__DurationAssignment_5"
    // InternalSequence.g:7327:1: rule__DurationConstraint__DurationAssignment_5 : ( ruleUnescapedString ) ;
    public final void rule__DurationConstraint__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7331:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7332:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7332:2: ( ruleUnescapedString )
            // InternalSequence.g:7333:3: ruleUnescapedString
            {
             before(grammarAccess.getDurationConstraintAccess().getDurationUnescapedStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getDurationConstraintAccess().getDurationUnescapedStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationConstraint__DurationAssignment_5"


    // $ANTLR start "rule__TimeObservation__EventAssignment_1"
    // InternalSequence.g:7342:1: rule__TimeObservation__EventAssignment_1 : ( rulePointInTimeSelector ) ;
    public final void rule__TimeObservation__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7346:1: ( ( rulePointInTimeSelector ) )
            // InternalSequence.g:7347:2: ( rulePointInTimeSelector )
            {
            // InternalSequence.g:7347:2: ( rulePointInTimeSelector )
            // InternalSequence.g:7348:3: rulePointInTimeSelector
            {
             before(grammarAccess.getTimeObservationAccess().getEventPointInTimeSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePointInTimeSelector();

            state._fsp--;

             after(grammarAccess.getTimeObservationAccess().getEventPointInTimeSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__EventAssignment_1"


    // $ANTLR start "rule__TimeObservation__TimeAssignment_5"
    // InternalSequence.g:7357:1: rule__TimeObservation__TimeAssignment_5 : ( ruleUnescapedString ) ;
    public final void rule__TimeObservation__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7361:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7362:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7362:2: ( ruleUnescapedString )
            // InternalSequence.g:7363:3: ruleUnescapedString
            {
             before(grammarAccess.getTimeObservationAccess().getTimeUnescapedStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getTimeObservationAccess().getTimeUnescapedStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeObservation__TimeAssignment_5"


    // $ANTLR start "rule__DurationObservation__IntervalAssignment_1"
    // InternalSequence.g:7372:1: rule__DurationObservation__IntervalAssignment_1 : ( ruleTimeIntervalSelector ) ;
    public final void rule__DurationObservation__IntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7376:1: ( ( ruleTimeIntervalSelector ) )
            // InternalSequence.g:7377:2: ( ruleTimeIntervalSelector )
            {
            // InternalSequence.g:7377:2: ( ruleTimeIntervalSelector )
            // InternalSequence.g:7378:3: ruleTimeIntervalSelector
            {
             before(grammarAccess.getDurationObservationAccess().getIntervalTimeIntervalSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeIntervalSelector();

            state._fsp--;

             after(grammarAccess.getDurationObservationAccess().getIntervalTimeIntervalSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__IntervalAssignment_1"


    // $ANTLR start "rule__DurationObservation__DurationAssignment_5"
    // InternalSequence.g:7387:1: rule__DurationObservation__DurationAssignment_5 : ( ruleUnescapedString ) ;
    public final void rule__DurationObservation__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7391:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7392:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7392:2: ( ruleUnescapedString )
            // InternalSequence.g:7393:3: ruleUnescapedString
            {
             before(grammarAccess.getDurationObservationAccess().getDurationUnescapedStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUnescapedString();

            state._fsp--;

             after(grammarAccess.getDurationObservationAccess().getDurationUnescapedStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DurationObservation__DurationAssignment_5"


    // $ANTLR start "rule__PointInTimeSelector__PointInTimeAssignment"
    // InternalSequence.g:7402:1: rule__PointInTimeSelector__PointInTimeAssignment : ( ( ruleFQN ) ) ;
    public final void rule__PointInTimeSelector__PointInTimeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7406:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7407:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7407:2: ( ( ruleFQN ) )
            // InternalSequence.g:7408:3: ( ruleFQN )
            {
             before(grammarAccess.getPointInTimeSelectorAccess().getPointInTimeAliasedPointInTimeCrossReference_0()); 
            // InternalSequence.g:7409:3: ( ruleFQN )
            // InternalSequence.g:7410:4: ruleFQN
            {
             before(grammarAccess.getPointInTimeSelectorAccess().getPointInTimeAliasedPointInTimeFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPointInTimeSelectorAccess().getPointInTimeAliasedPointInTimeFQNParserRuleCall_0_1()); 

            }

             after(grammarAccess.getPointInTimeSelectorAccess().getPointInTimeAliasedPointInTimeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointInTimeSelector__PointInTimeAssignment"


    // $ANTLR start "rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0"
    // InternalSequence.g:7421:1: rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 : ( rulePointInTimeSelector ) ;
    public final void rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7425:1: ( ( rulePointInTimeSelector ) )
            // InternalSequence.g:7426:2: ( rulePointInTimeSelector )
            {
            // InternalSequence.g:7426:2: ( rulePointInTimeSelector )
            // InternalSequence.g:7427:3: rulePointInTimeSelector
            {
             before(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getStartPointInTimeSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePointInTimeSelector();

            state._fsp--;

             after(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getStartPointInTimeSelectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0"


    // $ANTLR start "rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2"
    // InternalSequence.g:7436:1: rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 : ( rulePointInTimeSelector ) ;
    public final void rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7440:1: ( ( rulePointInTimeSelector ) )
            // InternalSequence.g:7441:2: ( rulePointInTimeSelector )
            {
            // InternalSequence.g:7441:2: ( rulePointInTimeSelector )
            // InternalSequence.g:7442:3: rulePointInTimeSelector
            {
             before(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getEndPointInTimeSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePointInTimeSelector();

            state._fsp--;

             after(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getEndPointInTimeSelectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2"


    // $ANTLR start "rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment"
    // InternalSequence.g:7451:1: rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment : ( ( ruleFQN ) ) ;
    public final void rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7455:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7456:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7456:2: ( ( ruleFQN ) )
            // InternalSequence.g:7457:3: ( ruleFQN )
            {
             before(grammarAccess.getFragmentTimeIntervalSelectorAccess().getNonInstantaneousFragmentNonInstantaneousFragmentCrossReference_0()); 
            // InternalSequence.g:7458:3: ( ruleFQN )
            // InternalSequence.g:7459:4: ruleFQN
            {
             before(grammarAccess.getFragmentTimeIntervalSelectorAccess().getNonInstantaneousFragmentNonInstantaneousFragmentFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFragmentTimeIntervalSelectorAccess().getNonInstantaneousFragmentNonInstantaneousFragmentFQNParserRuleCall_0_1()); 

            }

             after(grammarAccess.getFragmentTimeIntervalSelectorAccess().getNonInstantaneousFragmentNonInstantaneousFragmentCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment"


    // $ANTLR start "rule__InlineComment__BodyAssignment_2"
    // InternalSequence.g:7470:1: rule__InlineComment__BodyAssignment_2 : ( ruleCommentBody ) ;
    public final void rule__InlineComment__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7474:1: ( ( ruleCommentBody ) )
            // InternalSequence.g:7475:2: ( ruleCommentBody )
            {
            // InternalSequence.g:7475:2: ( ruleCommentBody )
            // InternalSequence.g:7476:3: ruleCommentBody
            {
             before(grammarAccess.getInlineCommentAccess().getBodyCommentBodyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCommentBody();

            state._fsp--;

             after(grammarAccess.getInlineCommentAccess().getBodyCommentBodyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineComment__BodyAssignment_2"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\35\1\5\1\36\1\5\1\54\1\uffff\1\36\1\uffff";
    static final String dfa_3s = "\1\35\1\5\1\57\1\5\1\55\1\uffff\1\57\1\uffff";
    static final String dfa_4s = "\5\uffff\1\2\1\uffff\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\5\1\4\17\uffff\1\3",
            "\1\6",
            "\1\7\1\5",
            "",
            "\1\5\1\4\17\uffff\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1608:1: rule__Constraint__Alternatives_1 : ( ( ruleTimeConstraint ) | ( ruleDurationConstraint ) );";
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1629:1: rule__Observation__Alternatives_1 : ( ( ruleTimeObservation ) | ( ruleDurationObservation ) );";
        }
    }
    static final String dfa_7s = "\6\uffff";
    static final String dfa_8s = "\1\uffff\1\4\3\uffff\1\4";
    static final String dfa_9s = "\1\5\1\36\1\5\2\uffff\1\36";
    static final String dfa_10s = "\1\5\1\57\1\5\2\uffff\1\57";
    static final String dfa_11s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_12s = "\6\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\3\1\4\17\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\3\1\4\17\uffff\1\2"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1650:1: rule__TimeIntervalSelector__Alternatives : ( ( ruleBiPointInTimeTimeIntervalSelector ) | ( ruleFragmentTimeIntervalSelector ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000007FF10003002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00024FFF100A3000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000480000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000007FF10003000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000007FF11003000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100003000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000007FF11003002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000002L});

}