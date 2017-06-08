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
    // InternalSequence.g:344:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:348:2: ( ( ( rule__Message__Alternatives ) ) )
            // InternalSequence.g:349:2: ( ( rule__Message__Alternatives ) )
            {
            // InternalSequence.g:349:2: ( ( rule__Message__Alternatives ) )
            // InternalSequence.g:350:3: ( rule__Message__Alternatives )
            {
             before(grammarAccess.getMessageAccess().getAlternatives()); 
            // InternalSequence.g:351:3: ( rule__Message__Alternatives )
            // InternalSequence.g:351:4: rule__Message__Alternatives
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
             before(grammarAccess.getImplicitSendOccurenceSpecificationAccess().getImplicitMessageOccurenceSpecificationAction()); 
            // InternalSequence.g:1101:3: ()
            // InternalSequence.g:1101:4: 
            {
            }

             after(grammarAccess.getImplicitSendOccurenceSpecificationAccess().getImplicitMessageOccurenceSpecificationAction()); 

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
             before(grammarAccess.getImplicitArrivalOccurenceSpecificationAccess().getImplicitMessageOccurenceSpecificationAction()); 
            // InternalSequence.g:1126:3: ()
            // InternalSequence.g:1126:4: 
            {
            }

             after(grammarAccess.getImplicitArrivalOccurenceSpecificationAccess().getImplicitMessageOccurenceSpecificationAction()); 

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

                    if ( (LA4_6==EOF||(LA4_6>=12 && LA4_6<=13)||LA4_6==17||(LA4_6>=24 && LA4_6<=26)||LA4_6==28||(LA4_6>=32 && LA4_6<=43)||(LA4_6>=46 && LA4_6<=47)) ) {
                        alt4=2;
                    }
                    else if ( (LA4_6==29) ) {
                        alt4=1;
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


    // $ANTLR start "rule__Message__Alternatives"
    // InternalSequence.g:1389:1: rule__Message__Alternatives : ( ( ruleStandardMessage ) | ( ruleResponseMessage ) | ( ruleFoundMessage ) | ( ruleLostMessage ) | ( ruleCreateMessage ) | ( ruleDestructionMessage ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

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
                     before(grammarAccess.getMessageAccess().getStandardMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStandardMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getStandardMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1400:2: ( ruleResponseMessage )
                    {
                    // InternalSequence.g:1400:2: ( ruleResponseMessage )
                    // InternalSequence.g:1401:3: ruleResponseMessage
                    {
                     before(grammarAccess.getMessageAccess().getResponseMessageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleResponseMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getResponseMessageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:1406:2: ( ruleFoundMessage )
                    {
                    // InternalSequence.g:1406:2: ( ruleFoundMessage )
                    // InternalSequence.g:1407:3: ruleFoundMessage
                    {
                     before(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFoundMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSequence.g:1412:2: ( ruleLostMessage )
                    {
                    // InternalSequence.g:1412:2: ( ruleLostMessage )
                    // InternalSequence.g:1413:3: ruleLostMessage
                    {
                     before(grammarAccess.getMessageAccess().getLostMessageParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLostMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getLostMessageParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSequence.g:1418:2: ( ruleCreateMessage )
                    {
                    // InternalSequence.g:1418:2: ( ruleCreateMessage )
                    // InternalSequence.g:1419:3: ruleCreateMessage
                    {
                     before(grammarAccess.getMessageAccess().getCreateMessageParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getCreateMessageParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSequence.g:1424:2: ( ruleDestructionMessage )
                    {
                    // InternalSequence.g:1424:2: ( ruleDestructionMessage )
                    // InternalSequence.g:1425:3: ruleDestructionMessage
                    {
                     before(grammarAccess.getMessageAccess().getDestructionMessageParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDestructionMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageAccess().getDestructionMessageParserRuleCall_5()); 

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


    // $ANTLR start "rule__StandardMessage__Alternatives_9"
    // InternalSequence.g:1434:1: rule__StandardMessage__Alternatives_9 : ( ( ( rule__StandardMessage__ArrivalEventAssignment_9_0 ) ) | ( ( rule__StandardMessage__ArrivalEventAssignment_9_1 ) ) );
    public final void rule__StandardMessage__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1438:1: ( ( ( rule__StandardMessage__ArrivalEventAssignment_9_0 ) ) | ( ( rule__StandardMessage__ArrivalEventAssignment_9_1 ) ) )
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
                    // InternalSequence.g:1439:2: ( ( rule__StandardMessage__ArrivalEventAssignment_9_0 ) )
                    {
                    // InternalSequence.g:1439:2: ( ( rule__StandardMessage__ArrivalEventAssignment_9_0 ) )
                    // InternalSequence.g:1440:3: ( rule__StandardMessage__ArrivalEventAssignment_9_0 )
                    {
                     before(grammarAccess.getStandardMessageAccess().getArrivalEventAssignment_9_0()); 
                    // InternalSequence.g:1441:3: ( rule__StandardMessage__ArrivalEventAssignment_9_0 )
                    // InternalSequence.g:1441:4: rule__StandardMessage__ArrivalEventAssignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StandardMessage__ArrivalEventAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStandardMessageAccess().getArrivalEventAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1445:2: ( ( rule__StandardMessage__ArrivalEventAssignment_9_1 ) )
                    {
                    // InternalSequence.g:1445:2: ( ( rule__StandardMessage__ArrivalEventAssignment_9_1 ) )
                    // InternalSequence.g:1446:3: ( rule__StandardMessage__ArrivalEventAssignment_9_1 )
                    {
                     before(grammarAccess.getStandardMessageAccess().getArrivalEventAssignment_9_1()); 
                    // InternalSequence.g:1447:3: ( rule__StandardMessage__ArrivalEventAssignment_9_1 )
                    // InternalSequence.g:1447:4: rule__StandardMessage__ArrivalEventAssignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StandardMessage__ArrivalEventAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStandardMessageAccess().getArrivalEventAssignment_9_1()); 

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
    // $ANTLR end "rule__StandardMessage__Alternatives_9"


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


    // $ANTLR start "rule__ResponseMessage__Alternatives_9"
    // InternalSequence.g:1497:1: rule__ResponseMessage__Alternatives_9 : ( ( ( rule__ResponseMessage__ArrivalEventAssignment_9_0 ) ) | ( ( rule__ResponseMessage__ArrivalEventAssignment_9_1 ) ) );
    public final void rule__ResponseMessage__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1501:1: ( ( ( rule__ResponseMessage__ArrivalEventAssignment_9_0 ) ) | ( ( rule__ResponseMessage__ArrivalEventAssignment_9_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==EOF||(LA11_0>=12 && LA11_0<=13)||LA11_0==17||(LA11_0>=24 && LA11_0<=26)||LA11_0==28||(LA11_0>=32 && LA11_0<=43)||LA11_0==46) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSequence.g:1502:2: ( ( rule__ResponseMessage__ArrivalEventAssignment_9_0 ) )
                    {
                    // InternalSequence.g:1502:2: ( ( rule__ResponseMessage__ArrivalEventAssignment_9_0 ) )
                    // InternalSequence.g:1503:3: ( rule__ResponseMessage__ArrivalEventAssignment_9_0 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getArrivalEventAssignment_9_0()); 
                    // InternalSequence.g:1504:3: ( rule__ResponseMessage__ArrivalEventAssignment_9_0 )
                    // InternalSequence.g:1504:4: rule__ResponseMessage__ArrivalEventAssignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseMessage__ArrivalEventAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseMessageAccess().getArrivalEventAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1508:2: ( ( rule__ResponseMessage__ArrivalEventAssignment_9_1 ) )
                    {
                    // InternalSequence.g:1508:2: ( ( rule__ResponseMessage__ArrivalEventAssignment_9_1 ) )
                    // InternalSequence.g:1509:3: ( rule__ResponseMessage__ArrivalEventAssignment_9_1 )
                    {
                     before(grammarAccess.getResponseMessageAccess().getArrivalEventAssignment_9_1()); 
                    // InternalSequence.g:1510:3: ( rule__ResponseMessage__ArrivalEventAssignment_9_1 )
                    // InternalSequence.g:1510:4: rule__ResponseMessage__ArrivalEventAssignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseMessage__ArrivalEventAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseMessageAccess().getArrivalEventAssignment_9_1()); 

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
    // $ANTLR end "rule__ResponseMessage__Alternatives_9"


    // $ANTLR start "rule__LostMessage__Alternatives_1"
    // InternalSequence.g:1518:1: rule__LostMessage__Alternatives_1 : ( ( ( rule__LostMessage__Group_1_0__0 ) ) | ( ( rule__LostMessage__Group_1_1__0 ) ) );
    public final void rule__LostMessage__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1522:1: ( ( ( rule__LostMessage__Group_1_0__0 ) ) | ( ( rule__LostMessage__Group_1_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=12 && LA12_0<=13)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSequence.g:1523:2: ( ( rule__LostMessage__Group_1_0__0 ) )
                    {
                    // InternalSequence.g:1523:2: ( ( rule__LostMessage__Group_1_0__0 ) )
                    // InternalSequence.g:1524:3: ( rule__LostMessage__Group_1_0__0 )
                    {
                     before(grammarAccess.getLostMessageAccess().getGroup_1_0()); 
                    // InternalSequence.g:1525:3: ( rule__LostMessage__Group_1_0__0 )
                    // InternalSequence.g:1525:4: rule__LostMessage__Group_1_0__0
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
                    // InternalSequence.g:1529:2: ( ( rule__LostMessage__Group_1_1__0 ) )
                    {
                    // InternalSequence.g:1529:2: ( ( rule__LostMessage__Group_1_1__0 ) )
                    // InternalSequence.g:1530:3: ( rule__LostMessage__Group_1_1__0 )
                    {
                     before(grammarAccess.getLostMessageAccess().getGroup_1_1()); 
                    // InternalSequence.g:1531:3: ( rule__LostMessage__Group_1_1__0 )
                    // InternalSequence.g:1531:4: rule__LostMessage__Group_1_1__0
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


    // $ANTLR start "rule__CreateMessage__Alternatives_9"
    // InternalSequence.g:1539:1: rule__CreateMessage__Alternatives_9 : ( ( ( rule__CreateMessage__ArrivalEventAssignment_9_0 ) ) | ( ( rule__CreateMessage__ArrivalEventAssignment_9_1 ) ) );
    public final void rule__CreateMessage__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1543:1: ( ( ( rule__CreateMessage__ArrivalEventAssignment_9_0 ) ) | ( ( rule__CreateMessage__ArrivalEventAssignment_9_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==EOF||(LA13_0>=12 && LA13_0<=13)||LA13_0==17||(LA13_0>=24 && LA13_0<=26)||LA13_0==28||(LA13_0>=32 && LA13_0<=43)||LA13_0==46) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSequence.g:1544:2: ( ( rule__CreateMessage__ArrivalEventAssignment_9_0 ) )
                    {
                    // InternalSequence.g:1544:2: ( ( rule__CreateMessage__ArrivalEventAssignment_9_0 ) )
                    // InternalSequence.g:1545:3: ( rule__CreateMessage__ArrivalEventAssignment_9_0 )
                    {
                     before(grammarAccess.getCreateMessageAccess().getArrivalEventAssignment_9_0()); 
                    // InternalSequence.g:1546:3: ( rule__CreateMessage__ArrivalEventAssignment_9_0 )
                    // InternalSequence.g:1546:4: rule__CreateMessage__ArrivalEventAssignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreateMessage__ArrivalEventAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCreateMessageAccess().getArrivalEventAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1550:2: ( ( rule__CreateMessage__ArrivalEventAssignment_9_1 ) )
                    {
                    // InternalSequence.g:1550:2: ( ( rule__CreateMessage__ArrivalEventAssignment_9_1 ) )
                    // InternalSequence.g:1551:3: ( rule__CreateMessage__ArrivalEventAssignment_9_1 )
                    {
                     before(grammarAccess.getCreateMessageAccess().getArrivalEventAssignment_9_1()); 
                    // InternalSequence.g:1552:3: ( rule__CreateMessage__ArrivalEventAssignment_9_1 )
                    // InternalSequence.g:1552:4: rule__CreateMessage__ArrivalEventAssignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreateMessage__ArrivalEventAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCreateMessageAccess().getArrivalEventAssignment_9_1()); 

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
    // $ANTLR end "rule__CreateMessage__Alternatives_9"


    // $ANTLR start "rule__DestructionMessage__Alternatives_9"
    // InternalSequence.g:1560:1: rule__DestructionMessage__Alternatives_9 : ( ( ( rule__DestructionMessage__ArrivalEventAssignment_9_0 ) ) | ( ( rule__DestructionMessage__ArrivalEventAssignment_9_1 ) ) );
    public final void rule__DestructionMessage__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1564:1: ( ( ( rule__DestructionMessage__ArrivalEventAssignment_9_0 ) ) | ( ( rule__DestructionMessage__ArrivalEventAssignment_9_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||(LA14_0>=12 && LA14_0<=13)||LA14_0==17||(LA14_0>=24 && LA14_0<=26)||LA14_0==28||(LA14_0>=32 && LA14_0<=43)||LA14_0==46) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSequence.g:1565:2: ( ( rule__DestructionMessage__ArrivalEventAssignment_9_0 ) )
                    {
                    // InternalSequence.g:1565:2: ( ( rule__DestructionMessage__ArrivalEventAssignment_9_0 ) )
                    // InternalSequence.g:1566:3: ( rule__DestructionMessage__ArrivalEventAssignment_9_0 )
                    {
                     before(grammarAccess.getDestructionMessageAccess().getArrivalEventAssignment_9_0()); 
                    // InternalSequence.g:1567:3: ( rule__DestructionMessage__ArrivalEventAssignment_9_0 )
                    // InternalSequence.g:1567:4: rule__DestructionMessage__ArrivalEventAssignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DestructionMessage__ArrivalEventAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDestructionMessageAccess().getArrivalEventAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1571:2: ( ( rule__DestructionMessage__ArrivalEventAssignment_9_1 ) )
                    {
                    // InternalSequence.g:1571:2: ( ( rule__DestructionMessage__ArrivalEventAssignment_9_1 ) )
                    // InternalSequence.g:1572:3: ( rule__DestructionMessage__ArrivalEventAssignment_9_1 )
                    {
                     before(grammarAccess.getDestructionMessageAccess().getArrivalEventAssignment_9_1()); 
                    // InternalSequence.g:1573:3: ( rule__DestructionMessage__ArrivalEventAssignment_9_1 )
                    // InternalSequence.g:1573:4: rule__DestructionMessage__ArrivalEventAssignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DestructionMessage__ArrivalEventAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDestructionMessageAccess().getArrivalEventAssignment_9_1()); 

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
    // $ANTLR end "rule__DestructionMessage__Alternatives_9"


    // $ANTLR start "rule__OccurenceSpecification__Alternatives"
    // InternalSequence.g:1581:1: rule__OccurenceSpecification__Alternatives : ( ( ruleDestructionOccurenceSpecification ) | ( ruleExplicitArrivalOccurenceSpecification ) );
    public final void rule__OccurenceSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1585:1: ( ( ruleDestructionOccurenceSpecification ) | ( ruleExplicitArrivalOccurenceSpecification ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSequence.g:1586:2: ( ruleDestructionOccurenceSpecification )
                    {
                    // InternalSequence.g:1586:2: ( ruleDestructionOccurenceSpecification )
                    // InternalSequence.g:1587:3: ruleDestructionOccurenceSpecification
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
                    // InternalSequence.g:1592:2: ( ruleExplicitArrivalOccurenceSpecification )
                    {
                    // InternalSequence.g:1592:2: ( ruleExplicitArrivalOccurenceSpecification )
                    // InternalSequence.g:1593:3: ruleExplicitArrivalOccurenceSpecification
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
    // InternalSequence.g:1602:1: rule__CombinedFragment__Alternatives : ( ( ruleMultipleRegionContainer ) | ( ruleSingleRegionContainer ) );
    public final void rule__CombinedFragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1606:1: ( ( ruleMultipleRegionContainer ) | ( ruleSingleRegionContainer ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=37 && LA16_0<=38)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=39 && LA16_0<=41)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSequence.g:1607:2: ( ruleMultipleRegionContainer )
                    {
                    // InternalSequence.g:1607:2: ( ruleMultipleRegionContainer )
                    // InternalSequence.g:1608:3: ruleMultipleRegionContainer
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
                    // InternalSequence.g:1613:2: ( ruleSingleRegionContainer )
                    {
                    // InternalSequence.g:1613:2: ( ruleSingleRegionContainer )
                    // InternalSequence.g:1614:3: ruleSingleRegionContainer
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
    // InternalSequence.g:1623:1: rule__SingleRegionContainer__Alternatives : ( ( ruleLoop ) | ( ruleOption ) | ( ruleCritical ) );
    public final void rule__SingleRegionContainer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1627:1: ( ( ruleLoop ) | ( ruleOption ) | ( ruleCritical ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSequence.g:1628:2: ( ruleLoop )
                    {
                    // InternalSequence.g:1628:2: ( ruleLoop )
                    // InternalSequence.g:1629:3: ruleLoop
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
                    // InternalSequence.g:1634:2: ( ruleOption )
                    {
                    // InternalSequence.g:1634:2: ( ruleOption )
                    // InternalSequence.g:1635:3: ruleOption
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
                    // InternalSequence.g:1640:2: ( ruleCritical )
                    {
                    // InternalSequence.g:1640:2: ( ruleCritical )
                    // InternalSequence.g:1641:3: ruleCritical
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
    // InternalSequence.g:1650:1: rule__MultipleRegionContainer__Alternatives : ( ( ruleParallel ) | ( ruleAlternative ) );
    public final void rule__MultipleRegionContainer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1654:1: ( ( ruleParallel ) | ( ruleAlternative ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSequence.g:1655:2: ( ruleParallel )
                    {
                    // InternalSequence.g:1655:2: ( ruleParallel )
                    // InternalSequence.g:1656:3: ruleParallel
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
                    // InternalSequence.g:1661:2: ( ruleAlternative )
                    {
                    // InternalSequence.g:1661:2: ( ruleAlternative )
                    // InternalSequence.g:1662:3: ruleAlternative
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
    // InternalSequence.g:1671:1: rule__Constraint__Alternatives_1 : ( ( ruleTimeConstraint ) | ( ruleDurationConstraint ) );
    public final void rule__Constraint__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1675:1: ( ( ruleTimeConstraint ) | ( ruleDurationConstraint ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalSequence.g:1676:2: ( ruleTimeConstraint )
                    {
                    // InternalSequence.g:1676:2: ( ruleTimeConstraint )
                    // InternalSequence.g:1677:3: ruleTimeConstraint
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
                    // InternalSequence.g:1682:2: ( ruleDurationConstraint )
                    {
                    // InternalSequence.g:1682:2: ( ruleDurationConstraint )
                    // InternalSequence.g:1683:3: ruleDurationConstraint
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
    // InternalSequence.g:1692:1: rule__Observation__Alternatives_1 : ( ( ruleTimeObservation ) | ( ruleDurationObservation ) );
    public final void rule__Observation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1696:1: ( ( ruleTimeObservation ) | ( ruleDurationObservation ) )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalSequence.g:1697:2: ( ruleTimeObservation )
                    {
                    // InternalSequence.g:1697:2: ( ruleTimeObservation )
                    // InternalSequence.g:1698:3: ruleTimeObservation
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
                    // InternalSequence.g:1703:2: ( ruleDurationObservation )
                    {
                    // InternalSequence.g:1703:2: ( ruleDurationObservation )
                    // InternalSequence.g:1704:3: ruleDurationObservation
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
    // InternalSequence.g:1713:1: rule__TimeIntervalSelector__Alternatives : ( ( ruleBiPointInTimeTimeIntervalSelector ) | ( ruleFragmentTimeIntervalSelector ) );
    public final void rule__TimeIntervalSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1717:1: ( ( ruleBiPointInTimeTimeIntervalSelector ) | ( ruleFragmentTimeIntervalSelector ) )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalSequence.g:1718:2: ( ruleBiPointInTimeTimeIntervalSelector )
                    {
                    // InternalSequence.g:1718:2: ( ruleBiPointInTimeTimeIntervalSelector )
                    // InternalSequence.g:1719:3: ruleBiPointInTimeTimeIntervalSelector
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
                    // InternalSequence.g:1724:2: ( ruleFragmentTimeIntervalSelector )
                    {
                    // InternalSequence.g:1724:2: ( ruleFragmentTimeIntervalSelector )
                    // InternalSequence.g:1725:3: ruleFragmentTimeIntervalSelector
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
    // InternalSequence.g:1734:1: rule__UnescapedString__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__UnescapedString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1738:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_STRING) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSequence.g:1739:2: ( RULE_ID )
                    {
                    // InternalSequence.g:1739:2: ( RULE_ID )
                    // InternalSequence.g:1740:3: RULE_ID
                    {
                     before(grammarAccess.getUnescapedStringAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getUnescapedStringAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1745:2: ( RULE_STRING )
                    {
                    // InternalSequence.g:1745:2: ( RULE_STRING )
                    // InternalSequence.g:1746:3: RULE_STRING
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
    // InternalSequence.g:1755:1: rule__MessageType__Alternatives : ( ( ( 'sync' ) ) | ( ( 'async' ) ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1759:1: ( ( ( 'sync' ) ) | ( ( 'async' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12) ) {
                alt23=1;
            }
            else if ( (LA23_0==13) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSequence.g:1760:2: ( ( 'sync' ) )
                    {
                    // InternalSequence.g:1760:2: ( ( 'sync' ) )
                    // InternalSequence.g:1761:3: ( 'sync' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1762:3: ( 'sync' )
                    // InternalSequence.g:1762:4: 'sync'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1766:2: ( ( 'async' ) )
                    {
                    // InternalSequence.g:1766:2: ( ( 'async' ) )
                    // InternalSequence.g:1767:3: ( 'async' )
                    {
                     before(grammarAccess.getMessageTypeAccess().getASYNCEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1768:3: ( 'async' )
                    // InternalSequence.g:1768:4: 'async'
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
    // InternalSequence.g:1776:1: rule__ActorType__Alternatives : ( ( ( 'human' ) ) | ( ( 'machine' ) ) );
    public final void rule__ActorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1780:1: ( ( ( 'human' ) ) | ( ( 'machine' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==14) ) {
                alt24=1;
            }
            else if ( (LA24_0==15) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSequence.g:1781:2: ( ( 'human' ) )
                    {
                    // InternalSequence.g:1781:2: ( ( 'human' ) )
                    // InternalSequence.g:1782:3: ( 'human' )
                    {
                     before(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 
                    // InternalSequence.g:1783:3: ( 'human' )
                    // InternalSequence.g:1783:4: 'human'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1787:2: ( ( 'machine' ) )
                    {
                    // InternalSequence.g:1787:2: ( ( 'machine' ) )
                    // InternalSequence.g:1788:3: ( 'machine' )
                    {
                     before(grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // InternalSequence.g:1789:3: ( 'machine' )
                    // InternalSequence.g:1789:4: 'machine'
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
    // InternalSequence.g:1797:1: rule__SequenceDiagram__Group__0 : rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 ;
    public final void rule__SequenceDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1801:1: ( rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1 )
            // InternalSequence.g:1802:2: rule__SequenceDiagram__Group__0__Impl rule__SequenceDiagram__Group__1
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
    // InternalSequence.g:1809:1: rule__SequenceDiagram__Group__0__Impl : ( () ) ;
    public final void rule__SequenceDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1813:1: ( ( () ) )
            // InternalSequence.g:1814:1: ( () )
            {
            // InternalSequence.g:1814:1: ( () )
            // InternalSequence.g:1815:2: ()
            {
             before(grammarAccess.getSequenceDiagramAccess().getSequenceDiagramAction_0()); 
            // InternalSequence.g:1816:2: ()
            // InternalSequence.g:1816:3: 
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
    // InternalSequence.g:1824:1: rule__SequenceDiagram__Group__1 : rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 ;
    public final void rule__SequenceDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1828:1: ( rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2 )
            // InternalSequence.g:1829:2: rule__SequenceDiagram__Group__1__Impl rule__SequenceDiagram__Group__2
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
    // InternalSequence.g:1836:1: rule__SequenceDiagram__Group__1__Impl : ( '@start-seqd' ) ;
    public final void rule__SequenceDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1840:1: ( ( '@start-seqd' ) )
            // InternalSequence.g:1841:1: ( '@start-seqd' )
            {
            // InternalSequence.g:1841:1: ( '@start-seqd' )
            // InternalSequence.g:1842:2: '@start-seqd'
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
    // InternalSequence.g:1851:1: rule__SequenceDiagram__Group__2 : rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 ;
    public final void rule__SequenceDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1855:1: ( rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3 )
            // InternalSequence.g:1856:2: rule__SequenceDiagram__Group__2__Impl rule__SequenceDiagram__Group__3
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
    // InternalSequence.g:1863:1: rule__SequenceDiagram__Group__2__Impl : ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) ;
    public final void rule__SequenceDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1867:1: ( ( ( rule__SequenceDiagram__TitleAssignment_2 ) ) )
            // InternalSequence.g:1868:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            {
            // InternalSequence.g:1868:1: ( ( rule__SequenceDiagram__TitleAssignment_2 ) )
            // InternalSequence.g:1869:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getTitleAssignment_2()); 
            // InternalSequence.g:1870:2: ( rule__SequenceDiagram__TitleAssignment_2 )
            // InternalSequence.g:1870:3: rule__SequenceDiagram__TitleAssignment_2
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
    // InternalSequence.g:1878:1: rule__SequenceDiagram__Group__3 : rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 ;
    public final void rule__SequenceDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1882:1: ( rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4 )
            // InternalSequence.g:1883:2: rule__SequenceDiagram__Group__3__Impl rule__SequenceDiagram__Group__4
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
    // InternalSequence.g:1890:1: rule__SequenceDiagram__Group__3__Impl : ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__SequenceDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1894:1: ( ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) ) )
            // InternalSequence.g:1895:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            {
            // InternalSequence.g:1895:1: ( ( rule__SequenceDiagram__RootPackageAssignment_3 ) )
            // InternalSequence.g:1896:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getRootPackageAssignment_3()); 
            // InternalSequence.g:1897:2: ( rule__SequenceDiagram__RootPackageAssignment_3 )
            // InternalSequence.g:1897:3: rule__SequenceDiagram__RootPackageAssignment_3
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
    // InternalSequence.g:1905:1: rule__SequenceDiagram__Group__4 : rule__SequenceDiagram__Group__4__Impl rule__SequenceDiagram__Group__5 ;
    public final void rule__SequenceDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1909:1: ( rule__SequenceDiagram__Group__4__Impl rule__SequenceDiagram__Group__5 )
            // InternalSequence.g:1910:2: rule__SequenceDiagram__Group__4__Impl rule__SequenceDiagram__Group__5
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
    // InternalSequence.g:1917:1: rule__SequenceDiagram__Group__4__Impl : ( ( rule__SequenceDiagram__ActorsAssignment_4 )* ) ;
    public final void rule__SequenceDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1921:1: ( ( ( rule__SequenceDiagram__ActorsAssignment_4 )* ) )
            // InternalSequence.g:1922:1: ( ( rule__SequenceDiagram__ActorsAssignment_4 )* )
            {
            // InternalSequence.g:1922:1: ( ( rule__SequenceDiagram__ActorsAssignment_4 )* )
            // InternalSequence.g:1923:2: ( rule__SequenceDiagram__ActorsAssignment_4 )*
            {
             before(grammarAccess.getSequenceDiagramAccess().getActorsAssignment_4()); 
            // InternalSequence.g:1924:2: ( rule__SequenceDiagram__ActorsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19||LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSequence.g:1924:3: rule__SequenceDiagram__ActorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SequenceDiagram__ActorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalSequence.g:1932:1: rule__SequenceDiagram__Group__5 : rule__SequenceDiagram__Group__5__Impl rule__SequenceDiagram__Group__6 ;
    public final void rule__SequenceDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1936:1: ( rule__SequenceDiagram__Group__5__Impl rule__SequenceDiagram__Group__6 )
            // InternalSequence.g:1937:2: rule__SequenceDiagram__Group__5__Impl rule__SequenceDiagram__Group__6
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
    // InternalSequence.g:1944:1: rule__SequenceDiagram__Group__5__Impl : ( ( rule__SequenceDiagram__FragmentsAssignment_5 )* ) ;
    public final void rule__SequenceDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1948:1: ( ( ( rule__SequenceDiagram__FragmentsAssignment_5 )* ) )
            // InternalSequence.g:1949:1: ( ( rule__SequenceDiagram__FragmentsAssignment_5 )* )
            {
            // InternalSequence.g:1949:1: ( ( rule__SequenceDiagram__FragmentsAssignment_5 )* )
            // InternalSequence.g:1950:2: ( rule__SequenceDiagram__FragmentsAssignment_5 )*
            {
             before(grammarAccess.getSequenceDiagramAccess().getFragmentsAssignment_5()); 
            // InternalSequence.g:1951:2: ( rule__SequenceDiagram__FragmentsAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=12 && LA26_0<=13)||LA26_0==28||(LA26_0>=32 && LA26_0<=42)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSequence.g:1951:3: rule__SequenceDiagram__FragmentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SequenceDiagram__FragmentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalSequence.g:1959:1: rule__SequenceDiagram__Group__6 : rule__SequenceDiagram__Group__6__Impl rule__SequenceDiagram__Group__7 ;
    public final void rule__SequenceDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1963:1: ( rule__SequenceDiagram__Group__6__Impl rule__SequenceDiagram__Group__7 )
            // InternalSequence.g:1964:2: rule__SequenceDiagram__Group__6__Impl rule__SequenceDiagram__Group__7
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
    // InternalSequence.g:1971:1: rule__SequenceDiagram__Group__6__Impl : ( ( rule__SequenceDiagram__FragmentsAssignment_6 )* ) ;
    public final void rule__SequenceDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1975:1: ( ( ( rule__SequenceDiagram__FragmentsAssignment_6 )* ) )
            // InternalSequence.g:1976:1: ( ( rule__SequenceDiagram__FragmentsAssignment_6 )* )
            {
            // InternalSequence.g:1976:1: ( ( rule__SequenceDiagram__FragmentsAssignment_6 )* )
            // InternalSequence.g:1977:2: ( rule__SequenceDiagram__FragmentsAssignment_6 )*
            {
             before(grammarAccess.getSequenceDiagramAccess().getFragmentsAssignment_6()); 
            // InternalSequence.g:1978:2: ( rule__SequenceDiagram__FragmentsAssignment_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43||LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSequence.g:1978:3: rule__SequenceDiagram__FragmentsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SequenceDiagram__FragmentsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalSequence.g:1986:1: rule__SequenceDiagram__Group__7 : rule__SequenceDiagram__Group__7__Impl ;
    public final void rule__SequenceDiagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:1990:1: ( rule__SequenceDiagram__Group__7__Impl )
            // InternalSequence.g:1991:2: rule__SequenceDiagram__Group__7__Impl
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
    // InternalSequence.g:1997:1: rule__SequenceDiagram__Group__7__Impl : ( '@end-seqd' ) ;
    public final void rule__SequenceDiagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2001:1: ( ( '@end-seqd' ) )
            // InternalSequence.g:2002:1: ( '@end-seqd' )
            {
            // InternalSequence.g:2002:1: ( '@end-seqd' )
            // InternalSequence.g:2003:2: '@end-seqd'
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
    // InternalSequence.g:2013:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2017:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalSequence.g:2018:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
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
    // InternalSequence.g:2025:1: rule__RootPackage__Group__0__Impl : ( 'rootElement' ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2029:1: ( ( 'rootElement' ) )
            // InternalSequence.g:2030:1: ( 'rootElement' )
            {
            // InternalSequence.g:2030:1: ( 'rootElement' )
            // InternalSequence.g:2031:2: 'rootElement'
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
    // InternalSequence.g:2040:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2044:1: ( rule__RootPackage__Group__1__Impl )
            // InternalSequence.g:2045:2: rule__RootPackage__Group__1__Impl
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
    // InternalSequence.g:2051:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__NameAssignment_1 ) ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2055:1: ( ( ( rule__RootPackage__NameAssignment_1 ) ) )
            // InternalSequence.g:2056:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            {
            // InternalSequence.g:2056:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            // InternalSequence.g:2057:2: ( rule__RootPackage__NameAssignment_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 
            // InternalSequence.g:2058:2: ( rule__RootPackage__NameAssignment_1 )
            // InternalSequence.g:2058:3: rule__RootPackage__NameAssignment_1
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
    // InternalSequence.g:2067:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2071:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalSequence.g:2072:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
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
    // InternalSequence.g:2079:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__DeferredAssignment_0 )? ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2083:1: ( ( ( rule__Actor__DeferredAssignment_0 )? ) )
            // InternalSequence.g:2084:1: ( ( rule__Actor__DeferredAssignment_0 )? )
            {
            // InternalSequence.g:2084:1: ( ( rule__Actor__DeferredAssignment_0 )? )
            // InternalSequence.g:2085:2: ( rule__Actor__DeferredAssignment_0 )?
            {
             before(grammarAccess.getActorAccess().getDeferredAssignment_0()); 
            // InternalSequence.g:2086:2: ( rule__Actor__DeferredAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSequence.g:2086:3: rule__Actor__DeferredAssignment_0
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
    // InternalSequence.g:2094:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2098:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalSequence.g:2099:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
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
    // InternalSequence.g:2106:1: rule__Actor__Group__1__Impl : ( 'act' ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2110:1: ( ( 'act' ) )
            // InternalSequence.g:2111:1: ( 'act' )
            {
            // InternalSequence.g:2111:1: ( 'act' )
            // InternalSequence.g:2112:2: 'act'
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
    // InternalSequence.g:2121:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2125:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalSequence.g:2126:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
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
    // InternalSequence.g:2133:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__Alternatives_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2137:1: ( ( ( rule__Actor__Alternatives_2 ) ) )
            // InternalSequence.g:2138:1: ( ( rule__Actor__Alternatives_2 ) )
            {
            // InternalSequence.g:2138:1: ( ( rule__Actor__Alternatives_2 ) )
            // InternalSequence.g:2139:2: ( rule__Actor__Alternatives_2 )
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // InternalSequence.g:2140:2: ( rule__Actor__Alternatives_2 )
            // InternalSequence.g:2140:3: rule__Actor__Alternatives_2
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
    // InternalSequence.g:2148:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2152:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalSequence.g:2153:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
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
    // InternalSequence.g:2160:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2164:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // InternalSequence.g:2165:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // InternalSequence.g:2165:1: ( ( rule__Actor__Group_3__0 )? )
            // InternalSequence.g:2166:2: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // InternalSequence.g:2167:2: ( rule__Actor__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSequence.g:2167:3: rule__Actor__Group_3__0
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
    // InternalSequence.g:2175:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2179:1: ( rule__Actor__Group__4__Impl )
            // InternalSequence.g:2180:2: rule__Actor__Group__4__Impl
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
    // InternalSequence.g:2186:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__CommentsAssignment_4 )? ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2190:1: ( ( ( rule__Actor__CommentsAssignment_4 )? ) )
            // InternalSequence.g:2191:1: ( ( rule__Actor__CommentsAssignment_4 )? )
            {
            // InternalSequence.g:2191:1: ( ( rule__Actor__CommentsAssignment_4 )? )
            // InternalSequence.g:2192:2: ( rule__Actor__CommentsAssignment_4 )?
            {
             before(grammarAccess.getActorAccess().getCommentsAssignment_4()); 
            // InternalSequence.g:2193:2: ( rule__Actor__CommentsAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSequence.g:2193:3: rule__Actor__CommentsAssignment_4
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
    // InternalSequence.g:2202:1: rule__Actor__Group_2_0__0 : rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 ;
    public final void rule__Actor__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2206:1: ( rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1 )
            // InternalSequence.g:2207:2: rule__Actor__Group_2_0__0__Impl rule__Actor__Group_2_0__1
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
    // InternalSequence.g:2214:1: rule__Actor__Group_2_0__0__Impl : ( ( rule__Actor__NameAssignment_2_0_0 ) ) ;
    public final void rule__Actor__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2218:1: ( ( ( rule__Actor__NameAssignment_2_0_0 ) ) )
            // InternalSequence.g:2219:1: ( ( rule__Actor__NameAssignment_2_0_0 ) )
            {
            // InternalSequence.g:2219:1: ( ( rule__Actor__NameAssignment_2_0_0 ) )
            // InternalSequence.g:2220:2: ( rule__Actor__NameAssignment_2_0_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_0_0()); 
            // InternalSequence.g:2221:2: ( rule__Actor__NameAssignment_2_0_0 )
            // InternalSequence.g:2221:3: rule__Actor__NameAssignment_2_0_0
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
    // InternalSequence.g:2229:1: rule__Actor__Group_2_0__1 : rule__Actor__Group_2_0__1__Impl ;
    public final void rule__Actor__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2233:1: ( rule__Actor__Group_2_0__1__Impl )
            // InternalSequence.g:2234:2: rule__Actor__Group_2_0__1__Impl
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
    // InternalSequence.g:2240:1: rule__Actor__Group_2_0__1__Impl : ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? ) ;
    public final void rule__Actor__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2244:1: ( ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? ) )
            // InternalSequence.g:2245:1: ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? )
            {
            // InternalSequence.g:2245:1: ( ( rule__Actor__TypeMappingAssignment_2_0_1 )? )
            // InternalSequence.g:2246:2: ( rule__Actor__TypeMappingAssignment_2_0_1 )?
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_0_1()); 
            // InternalSequence.g:2247:2: ( rule__Actor__TypeMappingAssignment_2_0_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSequence.g:2247:3: rule__Actor__TypeMappingAssignment_2_0_1
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
    // InternalSequence.g:2256:1: rule__Actor__Group_2_1__0 : rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 ;
    public final void rule__Actor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2260:1: ( rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 )
            // InternalSequence.g:2261:2: rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1
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
    // InternalSequence.g:2268:1: rule__Actor__Group_2_1__0__Impl : ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) ) ;
    public final void rule__Actor__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2272:1: ( ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) ) )
            // InternalSequence.g:2273:1: ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) )
            {
            // InternalSequence.g:2273:1: ( ( rule__Actor__TypeMappingAssignment_2_1_0 ) )
            // InternalSequence.g:2274:2: ( rule__Actor__TypeMappingAssignment_2_1_0 )
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_1_0()); 
            // InternalSequence.g:2275:2: ( rule__Actor__TypeMappingAssignment_2_1_0 )
            // InternalSequence.g:2275:3: rule__Actor__TypeMappingAssignment_2_1_0
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
    // InternalSequence.g:2283:1: rule__Actor__Group_2_1__1 : rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 ;
    public final void rule__Actor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2287:1: ( rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 )
            // InternalSequence.g:2288:2: rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2
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
    // InternalSequence.g:2295:1: rule__Actor__Group_2_1__1__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2299:1: ( ( 'as' ) )
            // InternalSequence.g:2300:1: ( 'as' )
            {
            // InternalSequence.g:2300:1: ( 'as' )
            // InternalSequence.g:2301:2: 'as'
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
    // InternalSequence.g:2310:1: rule__Actor__Group_2_1__2 : rule__Actor__Group_2_1__2__Impl ;
    public final void rule__Actor__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2314:1: ( rule__Actor__Group_2_1__2__Impl )
            // InternalSequence.g:2315:2: rule__Actor__Group_2_1__2__Impl
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
    // InternalSequence.g:2321:1: rule__Actor__Group_2_1__2__Impl : ( ( rule__Actor__AliasAssignment_2_1_2 ) ) ;
    public final void rule__Actor__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2325:1: ( ( ( rule__Actor__AliasAssignment_2_1_2 ) ) )
            // InternalSequence.g:2326:1: ( ( rule__Actor__AliasAssignment_2_1_2 ) )
            {
            // InternalSequence.g:2326:1: ( ( rule__Actor__AliasAssignment_2_1_2 ) )
            // InternalSequence.g:2327:2: ( rule__Actor__AliasAssignment_2_1_2 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_1_2()); 
            // InternalSequence.g:2328:2: ( rule__Actor__AliasAssignment_2_1_2 )
            // InternalSequence.g:2328:3: rule__Actor__AliasAssignment_2_1_2
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
    // InternalSequence.g:2337:1: rule__Actor__Group_2_2__0 : rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 ;
    public final void rule__Actor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2341:1: ( rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1 )
            // InternalSequence.g:2342:2: rule__Actor__Group_2_2__0__Impl rule__Actor__Group_2_2__1
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
    // InternalSequence.g:2349:1: rule__Actor__Group_2_2__0__Impl : ( ( rule__Actor__NameAssignment_2_2_0 ) ) ;
    public final void rule__Actor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2353:1: ( ( ( rule__Actor__NameAssignment_2_2_0 ) ) )
            // InternalSequence.g:2354:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            {
            // InternalSequence.g:2354:1: ( ( rule__Actor__NameAssignment_2_2_0 ) )
            // InternalSequence.g:2355:2: ( rule__Actor__NameAssignment_2_2_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2_2_0()); 
            // InternalSequence.g:2356:2: ( rule__Actor__NameAssignment_2_2_0 )
            // InternalSequence.g:2356:3: rule__Actor__NameAssignment_2_2_0
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
    // InternalSequence.g:2364:1: rule__Actor__Group_2_2__1 : rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 ;
    public final void rule__Actor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2368:1: ( rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2 )
            // InternalSequence.g:2369:2: rule__Actor__Group_2_2__1__Impl rule__Actor__Group_2_2__2
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
    // InternalSequence.g:2376:1: rule__Actor__Group_2_2__1__Impl : ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? ) ;
    public final void rule__Actor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2380:1: ( ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? ) )
            // InternalSequence.g:2381:1: ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? )
            {
            // InternalSequence.g:2381:1: ( ( rule__Actor__TypeMappingAssignment_2_2_1 )? )
            // InternalSequence.g:2382:2: ( rule__Actor__TypeMappingAssignment_2_2_1 )?
            {
             before(grammarAccess.getActorAccess().getTypeMappingAssignment_2_2_1()); 
            // InternalSequence.g:2383:2: ( rule__Actor__TypeMappingAssignment_2_2_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSequence.g:2383:3: rule__Actor__TypeMappingAssignment_2_2_1
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
    // InternalSequence.g:2391:1: rule__Actor__Group_2_2__2 : rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 ;
    public final void rule__Actor__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2395:1: ( rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3 )
            // InternalSequence.g:2396:2: rule__Actor__Group_2_2__2__Impl rule__Actor__Group_2_2__3
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
    // InternalSequence.g:2403:1: rule__Actor__Group_2_2__2__Impl : ( 'as' ) ;
    public final void rule__Actor__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2407:1: ( ( 'as' ) )
            // InternalSequence.g:2408:1: ( 'as' )
            {
            // InternalSequence.g:2408:1: ( 'as' )
            // InternalSequence.g:2409:2: 'as'
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
    // InternalSequence.g:2418:1: rule__Actor__Group_2_2__3 : rule__Actor__Group_2_2__3__Impl ;
    public final void rule__Actor__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2422:1: ( rule__Actor__Group_2_2__3__Impl )
            // InternalSequence.g:2423:2: rule__Actor__Group_2_2__3__Impl
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
    // InternalSequence.g:2429:1: rule__Actor__Group_2_2__3__Impl : ( ( rule__Actor__AliasAssignment_2_2_3 ) ) ;
    public final void rule__Actor__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2433:1: ( ( ( rule__Actor__AliasAssignment_2_2_3 ) ) )
            // InternalSequence.g:2434:1: ( ( rule__Actor__AliasAssignment_2_2_3 ) )
            {
            // InternalSequence.g:2434:1: ( ( rule__Actor__AliasAssignment_2_2_3 ) )
            // InternalSequence.g:2435:2: ( rule__Actor__AliasAssignment_2_2_3 )
            {
             before(grammarAccess.getActorAccess().getAliasAssignment_2_2_3()); 
            // InternalSequence.g:2436:2: ( rule__Actor__AliasAssignment_2_2_3 )
            // InternalSequence.g:2436:3: rule__Actor__AliasAssignment_2_2_3
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
    // InternalSequence.g:2445:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2449:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // InternalSequence.g:2450:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
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
    // InternalSequence.g:2457:1: rule__Actor__Group_3__0__Impl : ( 'role[' ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2461:1: ( ( 'role[' ) )
            // InternalSequence.g:2462:1: ( 'role[' )
            {
            // InternalSequence.g:2462:1: ( 'role[' )
            // InternalSequence.g:2463:2: 'role['
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
    // InternalSequence.g:2472:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2476:1: ( rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 )
            // InternalSequence.g:2477:2: rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2
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
    // InternalSequence.g:2484:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2488:1: ( ( ( rule__Actor__ActorTypeAssignment_3_1 ) ) )
            // InternalSequence.g:2489:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            {
            // InternalSequence.g:2489:1: ( ( rule__Actor__ActorTypeAssignment_3_1 ) )
            // InternalSequence.g:2490:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            {
             before(grammarAccess.getActorAccess().getActorTypeAssignment_3_1()); 
            // InternalSequence.g:2491:2: ( rule__Actor__ActorTypeAssignment_3_1 )
            // InternalSequence.g:2491:3: rule__Actor__ActorTypeAssignment_3_1
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
    // InternalSequence.g:2499:1: rule__Actor__Group_3__2 : rule__Actor__Group_3__2__Impl ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2503:1: ( rule__Actor__Group_3__2__Impl )
            // InternalSequence.g:2504:2: rule__Actor__Group_3__2__Impl
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
    // InternalSequence.g:2510:1: rule__Actor__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Actor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2514:1: ( ( ']' ) )
            // InternalSequence.g:2515:1: ( ']' )
            {
            // InternalSequence.g:2515:1: ( ']' )
            // InternalSequence.g:2516:2: ']'
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
    // InternalSequence.g:2526:1: rule__ActorClassifierMapping__Group__0 : rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1 ;
    public final void rule__ActorClassifierMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2530:1: ( rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1 )
            // InternalSequence.g:2531:2: rule__ActorClassifierMapping__Group__0__Impl rule__ActorClassifierMapping__Group__1
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
    // InternalSequence.g:2538:1: rule__ActorClassifierMapping__Group__0__Impl : ( ':' ) ;
    public final void rule__ActorClassifierMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2542:1: ( ( ':' ) )
            // InternalSequence.g:2543:1: ( ':' )
            {
            // InternalSequence.g:2543:1: ( ':' )
            // InternalSequence.g:2544:2: ':'
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
    // InternalSequence.g:2553:1: rule__ActorClassifierMapping__Group__1 : rule__ActorClassifierMapping__Group__1__Impl ;
    public final void rule__ActorClassifierMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2557:1: ( rule__ActorClassifierMapping__Group__1__Impl )
            // InternalSequence.g:2558:2: rule__ActorClassifierMapping__Group__1__Impl
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
    // InternalSequence.g:2564:1: rule__ActorClassifierMapping__Group__1__Impl : ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) ) ;
    public final void rule__ActorClassifierMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2568:1: ( ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) ) )
            // InternalSequence.g:2569:1: ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) )
            {
            // InternalSequence.g:2569:1: ( ( rule__ActorClassifierMapping__ClassifierAssignment_1 ) )
            // InternalSequence.g:2570:2: ( rule__ActorClassifierMapping__ClassifierAssignment_1 )
            {
             before(grammarAccess.getActorClassifierMappingAccess().getClassifierAssignment_1()); 
            // InternalSequence.g:2571:2: ( rule__ActorClassifierMapping__ClassifierAssignment_1 )
            // InternalSequence.g:2571:3: rule__ActorClassifierMapping__ClassifierAssignment_1
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
    // InternalSequence.g:2580:1: rule__OrderedFragmentContainer__Group_0__0 : rule__OrderedFragmentContainer__Group_0__0__Impl rule__OrderedFragmentContainer__Group_0__1 ;
    public final void rule__OrderedFragmentContainer__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2584:1: ( rule__OrderedFragmentContainer__Group_0__0__Impl rule__OrderedFragmentContainer__Group_0__1 )
            // InternalSequence.g:2585:2: rule__OrderedFragmentContainer__Group_0__0__Impl rule__OrderedFragmentContainer__Group_0__1
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
    // InternalSequence.g:2592:1: rule__OrderedFragmentContainer__Group_0__0__Impl : ( '{' ) ;
    public final void rule__OrderedFragmentContainer__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2596:1: ( ( '{' ) )
            // InternalSequence.g:2597:1: ( '{' )
            {
            // InternalSequence.g:2597:1: ( '{' )
            // InternalSequence.g:2598:2: '{'
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
    // InternalSequence.g:2607:1: rule__OrderedFragmentContainer__Group_0__1 : rule__OrderedFragmentContainer__Group_0__1__Impl rule__OrderedFragmentContainer__Group_0__2 ;
    public final void rule__OrderedFragmentContainer__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2611:1: ( rule__OrderedFragmentContainer__Group_0__1__Impl rule__OrderedFragmentContainer__Group_0__2 )
            // InternalSequence.g:2612:2: rule__OrderedFragmentContainer__Group_0__1__Impl rule__OrderedFragmentContainer__Group_0__2
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
    // InternalSequence.g:2619:1: rule__OrderedFragmentContainer__Group_0__1__Impl : ( ruleOneOrMultipleFragments ) ;
    public final void rule__OrderedFragmentContainer__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2623:1: ( ( ruleOneOrMultipleFragments ) )
            // InternalSequence.g:2624:1: ( ruleOneOrMultipleFragments )
            {
            // InternalSequence.g:2624:1: ( ruleOneOrMultipleFragments )
            // InternalSequence.g:2625:2: ruleOneOrMultipleFragments
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
    // InternalSequence.g:2634:1: rule__OrderedFragmentContainer__Group_0__2 : rule__OrderedFragmentContainer__Group_0__2__Impl ;
    public final void rule__OrderedFragmentContainer__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2638:1: ( rule__OrderedFragmentContainer__Group_0__2__Impl )
            // InternalSequence.g:2639:2: rule__OrderedFragmentContainer__Group_0__2__Impl
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
    // InternalSequence.g:2645:1: rule__OrderedFragmentContainer__Group_0__2__Impl : ( '}' ) ;
    public final void rule__OrderedFragmentContainer__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2649:1: ( ( '}' ) )
            // InternalSequence.g:2650:1: ( '}' )
            {
            // InternalSequence.g:2650:1: ( '}' )
            // InternalSequence.g:2651:2: '}'
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
    // InternalSequence.g:2661:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2665:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalSequence.g:2666:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalSequence.g:2673:1: rule__Condition__Group__0__Impl : ( '[' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2677:1: ( ( '[' ) )
            // InternalSequence.g:2678:1: ( '[' )
            {
            // InternalSequence.g:2678:1: ( '[' )
            // InternalSequence.g:2679:2: '['
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
    // InternalSequence.g:2688:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2692:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalSequence.g:2693:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalSequence.g:2700:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ConditionAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2704:1: ( ( ( rule__Condition__ConditionAssignment_1 ) ) )
            // InternalSequence.g:2705:1: ( ( rule__Condition__ConditionAssignment_1 ) )
            {
            // InternalSequence.g:2705:1: ( ( rule__Condition__ConditionAssignment_1 ) )
            // InternalSequence.g:2706:2: ( rule__Condition__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_1()); 
            // InternalSequence.g:2707:2: ( rule__Condition__ConditionAssignment_1 )
            // InternalSequence.g:2707:3: rule__Condition__ConditionAssignment_1
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
    // InternalSequence.g:2715:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2719:1: ( rule__Condition__Group__2__Impl )
            // InternalSequence.g:2720:2: rule__Condition__Group__2__Impl
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
    // InternalSequence.g:2726:1: rule__Condition__Group__2__Impl : ( ']' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2730:1: ( ( ']' ) )
            // InternalSequence.g:2731:1: ( ']' )
            {
            // InternalSequence.g:2731:1: ( ']' )
            // InternalSequence.g:2732:2: ']'
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
    // InternalSequence.g:2742:1: rule__OrderedFragmentContainerWithCondition__Group__0 : rule__OrderedFragmentContainerWithCondition__Group__0__Impl rule__OrderedFragmentContainerWithCondition__Group__1 ;
    public final void rule__OrderedFragmentContainerWithCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2746:1: ( rule__OrderedFragmentContainerWithCondition__Group__0__Impl rule__OrderedFragmentContainerWithCondition__Group__1 )
            // InternalSequence.g:2747:2: rule__OrderedFragmentContainerWithCondition__Group__0__Impl rule__OrderedFragmentContainerWithCondition__Group__1
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
    // InternalSequence.g:2754:1: rule__OrderedFragmentContainerWithCondition__Group__0__Impl : ( ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 ) ) ;
    public final void rule__OrderedFragmentContainerWithCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2758:1: ( ( ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 ) ) )
            // InternalSequence.g:2759:1: ( ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 ) )
            {
            // InternalSequence.g:2759:1: ( ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 ) )
            // InternalSequence.g:2760:2: ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getConditionAssignment_0()); 
            // InternalSequence.g:2761:2: ( rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 )
            // InternalSequence.g:2761:3: rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0
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
    // InternalSequence.g:2769:1: rule__OrderedFragmentContainerWithCondition__Group__1 : rule__OrderedFragmentContainerWithCondition__Group__1__Impl ;
    public final void rule__OrderedFragmentContainerWithCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2773:1: ( rule__OrderedFragmentContainerWithCondition__Group__1__Impl )
            // InternalSequence.g:2774:2: rule__OrderedFragmentContainerWithCondition__Group__1__Impl
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
    // InternalSequence.g:2780:1: rule__OrderedFragmentContainerWithCondition__Group__1__Impl : ( ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 ) ) ;
    public final void rule__OrderedFragmentContainerWithCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2784:1: ( ( ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 ) ) )
            // InternalSequence.g:2785:1: ( ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 ) )
            {
            // InternalSequence.g:2785:1: ( ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 ) )
            // InternalSequence.g:2786:2: ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getAlternatives_1()); 
            // InternalSequence.g:2787:2: ( rule__OrderedFragmentContainerWithCondition__Alternatives_1 )
            // InternalSequence.g:2787:3: rule__OrderedFragmentContainerWithCondition__Alternatives_1
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
    // InternalSequence.g:2796:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__0 : rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__1 ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2800:1: ( rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__1 )
            // InternalSequence.g:2801:2: rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__1
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
    // InternalSequence.g:2808:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2812:1: ( ( '{' ) )
            // InternalSequence.g:2813:1: ( '{' )
            {
            // InternalSequence.g:2813:1: ( '{' )
            // InternalSequence.g:2814:2: '{'
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
    // InternalSequence.g:2823:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__1 : rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__2 ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2827:1: ( rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__2 )
            // InternalSequence.g:2828:2: rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl rule__OrderedFragmentContainerWithCondition__Group_1_0__2
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
    // InternalSequence.g:2835:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl : ( ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) ) ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* ) ) ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2839:1: ( ( ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) ) ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* ) ) )
            // InternalSequence.g:2840:1: ( ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) ) ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* ) )
            {
            // InternalSequence.g:2840:1: ( ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) ) ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* ) )
            // InternalSequence.g:2841:2: ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) ) ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* )
            {
            // InternalSequence.g:2841:2: ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 ) )
            // InternalSequence.g:2842:3: ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_0_1()); 
            // InternalSequence.g:2843:3: ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )
            // InternalSequence.g:2843:4: rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1
            {
            pushFollow(FOLLOW_3);
            rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_0_1()); 

            }

            // InternalSequence.g:2846:2: ( ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )* )
            // InternalSequence.g:2847:3: ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )*
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_0_1()); 
            // InternalSequence.g:2848:3: ( rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=12 && LA33_0<=13)||LA33_0==28||(LA33_0>=32 && LA33_0<=42)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSequence.g:2848:4: rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalSequence.g:2857:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__2 : rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2861:1: ( rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl )
            // InternalSequence.g:2862:2: rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl
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
    // InternalSequence.g:2868:1: rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__OrderedFragmentContainerWithCondition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2872:1: ( ( '}' ) )
            // InternalSequence.g:2873:1: ( '}' )
            {
            // InternalSequence.g:2873:1: ( '}' )
            // InternalSequence.g:2874:2: '}'
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
    // InternalSequence.g:2884:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0 : rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1 ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2888:1: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1 )
            // InternalSequence.g:2889:2: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1
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
    // InternalSequence.g:2896:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl : ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 ) ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2900:1: ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 ) ) )
            // InternalSequence.g:2901:1: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 ) )
            {
            // InternalSequence.g:2901:1: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 ) )
            // InternalSequence.g:2902:2: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getConditionAssignment_0()); 
            // InternalSequence.g:2903:2: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 )
            // InternalSequence.g:2903:3: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0
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
    // InternalSequence.g:2911:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1 : rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2 ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2915:1: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2 )
            // InternalSequence.g:2916:2: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2
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
    // InternalSequence.g:2923:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl : ( '{' ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2927:1: ( ( '{' ) )
            // InternalSequence.g:2928:1: ( '{' )
            {
            // InternalSequence.g:2928:1: ( '{' )
            // InternalSequence.g:2929:2: '{'
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
    // InternalSequence.g:2938:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2 : rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3 ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2942:1: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3 )
            // InternalSequence.g:2943:2: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3
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
    // InternalSequence.g:2950:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl : ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) ) ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* ) ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2954:1: ( ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) ) ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* ) ) )
            // InternalSequence.g:2955:1: ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) ) ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* ) )
            {
            // InternalSequence.g:2955:1: ( ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) ) ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* ) )
            // InternalSequence.g:2956:2: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) ) ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* )
            {
            // InternalSequence.g:2956:2: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 ) )
            // InternalSequence.g:2957:3: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:2958:3: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )
            // InternalSequence.g:2958:4: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_3);
            rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsAssignment_2()); 

            }

            // InternalSequence.g:2961:2: ( ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )* )
            // InternalSequence.g:2962:3: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )*
            {
             before(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsAssignment_2()); 
            // InternalSequence.g:2963:3: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=12 && LA34_0<=13)||LA34_0==28||(LA34_0>=32 && LA34_0<=42)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSequence.g:2963:4: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalSequence.g:2972:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3 : rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2976:1: ( rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl )
            // InternalSequence.g:2977:2: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl
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
    // InternalSequence.g:2983:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl : ( '}' ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:2987:1: ( ( '}' ) )
            // InternalSequence.g:2988:1: ( '}' )
            {
            // InternalSequence.g:2988:1: ( '}' )
            // InternalSequence.g:2989:2: '}'
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


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__Group__0"
    // InternalSequence.g:2999:1: rule__ExplicitArrivalOccurenceReference__Group__0 : rule__ExplicitArrivalOccurenceReference__Group__0__Impl rule__ExplicitArrivalOccurenceReference__Group__1 ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3003:1: ( rule__ExplicitArrivalOccurenceReference__Group__0__Impl rule__ExplicitArrivalOccurenceReference__Group__1 )
            // InternalSequence.g:3004:2: rule__ExplicitArrivalOccurenceReference__Group__0__Impl rule__ExplicitArrivalOccurenceReference__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:3011:1: rule__ExplicitArrivalOccurenceReference__Group__0__Impl : ( 'arrives' ) ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3015:1: ( ( 'arrives' ) )
            // InternalSequence.g:3016:1: ( 'arrives' )
            {
            // InternalSequence.g:3016:1: ( 'arrives' )
            // InternalSequence.g:3017:2: 'arrives'
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
    // InternalSequence.g:3026:1: rule__ExplicitArrivalOccurenceReference__Group__1 : rule__ExplicitArrivalOccurenceReference__Group__1__Impl rule__ExplicitArrivalOccurenceReference__Group__2 ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3030:1: ( rule__ExplicitArrivalOccurenceReference__Group__1__Impl rule__ExplicitArrivalOccurenceReference__Group__2 )
            // InternalSequence.g:3031:2: rule__ExplicitArrivalOccurenceReference__Group__1__Impl rule__ExplicitArrivalOccurenceReference__Group__2
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
    // InternalSequence.g:3038:1: rule__ExplicitArrivalOccurenceReference__Group__1__Impl : ( '[' ) ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3042:1: ( ( '[' ) )
            // InternalSequence.g:3043:1: ( '[' )
            {
            // InternalSequence.g:3043:1: ( '[' )
            // InternalSequence.g:3044:2: '['
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
    // InternalSequence.g:3053:1: rule__ExplicitArrivalOccurenceReference__Group__2 : rule__ExplicitArrivalOccurenceReference__Group__2__Impl rule__ExplicitArrivalOccurenceReference__Group__3 ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3057:1: ( rule__ExplicitArrivalOccurenceReference__Group__2__Impl rule__ExplicitArrivalOccurenceReference__Group__3 )
            // InternalSequence.g:3058:2: rule__ExplicitArrivalOccurenceReference__Group__2__Impl rule__ExplicitArrivalOccurenceReference__Group__3
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
    // InternalSequence.g:3065:1: rule__ExplicitArrivalOccurenceReference__Group__2__Impl : ( ( rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2 ) ) ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3069:1: ( ( ( rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2 ) ) )
            // InternalSequence.g:3070:1: ( ( rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2 ) )
            {
            // InternalSequence.g:3070:1: ( ( rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2 ) )
            // InternalSequence.g:3071:2: ( rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2 )
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getExplicitOccurenceSpecificationAssignment_2()); 
            // InternalSequence.g:3072:2: ( rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2 )
            // InternalSequence.g:3072:3: rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getExplicitOccurenceSpecificationAssignment_2()); 

            }


            }

        }
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
    // InternalSequence.g:3080:1: rule__ExplicitArrivalOccurenceReference__Group__3 : rule__ExplicitArrivalOccurenceReference__Group__3__Impl ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3084:1: ( rule__ExplicitArrivalOccurenceReference__Group__3__Impl )
            // InternalSequence.g:3085:2: rule__ExplicitArrivalOccurenceReference__Group__3__Impl
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
    // InternalSequence.g:3091:1: rule__ExplicitArrivalOccurenceReference__Group__3__Impl : ( ']' ) ;
    public final void rule__ExplicitArrivalOccurenceReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3095:1: ( ( ']' ) )
            // InternalSequence.g:3096:1: ( ']' )
            {
            // InternalSequence.g:3096:1: ( ']' )
            // InternalSequence.g:3097:2: ']'
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
    // InternalSequence.g:3107:1: rule__ExplicitArrivalOccurenceSpecification__Group__0 : rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl rule__ExplicitArrivalOccurenceSpecification__Group__1 ;
    public final void rule__ExplicitArrivalOccurenceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3111:1: ( rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl rule__ExplicitArrivalOccurenceSpecification__Group__1 )
            // InternalSequence.g:3112:2: rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl rule__ExplicitArrivalOccurenceSpecification__Group__1
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
    // InternalSequence.g:3119:1: rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl : ( 'arrival' ) ;
    public final void rule__ExplicitArrivalOccurenceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3123:1: ( ( 'arrival' ) )
            // InternalSequence.g:3124:1: ( 'arrival' )
            {
            // InternalSequence.g:3124:1: ( 'arrival' )
            // InternalSequence.g:3125:2: 'arrival'
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
    // InternalSequence.g:3134:1: rule__ExplicitArrivalOccurenceSpecification__Group__1 : rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl ;
    public final void rule__ExplicitArrivalOccurenceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3138:1: ( rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl )
            // InternalSequence.g:3139:2: rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl
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
    // InternalSequence.g:3145:1: rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl : ( ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 ) ) ;
    public final void rule__ExplicitArrivalOccurenceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3149:1: ( ( ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 ) ) )
            // InternalSequence.g:3150:1: ( ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 ) )
            {
            // InternalSequence.g:3150:1: ( ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 ) )
            // InternalSequence.g:3151:2: ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getNameAssignment_1()); 
            // InternalSequence.g:3152:2: ( rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 )
            // InternalSequence.g:3152:3: rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1
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
    // InternalSequence.g:3161:1: rule__StandardMessage__Group__0 : rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 ;
    public final void rule__StandardMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3165:1: ( rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1 )
            // InternalSequence.g:3166:2: rule__StandardMessage__Group__0__Impl rule__StandardMessage__Group__1
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
    // InternalSequence.g:3173:1: rule__StandardMessage__Group__0__Impl : ( ( rule__StandardMessage__TypeAssignment_0 ) ) ;
    public final void rule__StandardMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3177:1: ( ( ( rule__StandardMessage__TypeAssignment_0 ) ) )
            // InternalSequence.g:3178:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            {
            // InternalSequence.g:3178:1: ( ( rule__StandardMessage__TypeAssignment_0 ) )
            // InternalSequence.g:3179:2: ( rule__StandardMessage__TypeAssignment_0 )
            {
             before(grammarAccess.getStandardMessageAccess().getTypeAssignment_0()); 
            // InternalSequence.g:3180:2: ( rule__StandardMessage__TypeAssignment_0 )
            // InternalSequence.g:3180:3: rule__StandardMessage__TypeAssignment_0
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
    // InternalSequence.g:3188:1: rule__StandardMessage__Group__1 : rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 ;
    public final void rule__StandardMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3192:1: ( rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2 )
            // InternalSequence.g:3193:2: rule__StandardMessage__Group__1__Impl rule__StandardMessage__Group__2
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
    // InternalSequence.g:3200:1: rule__StandardMessage__Group__1__Impl : ( ( rule__StandardMessage__NameAssignment_1 ) ) ;
    public final void rule__StandardMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3204:1: ( ( ( rule__StandardMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:3205:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:3205:1: ( ( rule__StandardMessage__NameAssignment_1 ) )
            // InternalSequence.g:3206:2: ( rule__StandardMessage__NameAssignment_1 )
            {
             before(grammarAccess.getStandardMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3207:2: ( rule__StandardMessage__NameAssignment_1 )
            // InternalSequence.g:3207:3: rule__StandardMessage__NameAssignment_1
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
    // InternalSequence.g:3215:1: rule__StandardMessage__Group__2 : rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 ;
    public final void rule__StandardMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3219:1: ( rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3 )
            // InternalSequence.g:3220:2: rule__StandardMessage__Group__2__Impl rule__StandardMessage__Group__3
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
    // InternalSequence.g:3227:1: rule__StandardMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__StandardMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3231:1: ( ( '(' ) )
            // InternalSequence.g:3232:1: ( '(' )
            {
            // InternalSequence.g:3232:1: ( '(' )
            // InternalSequence.g:3233:2: '('
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
    // InternalSequence.g:3242:1: rule__StandardMessage__Group__3 : rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 ;
    public final void rule__StandardMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3246:1: ( rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4 )
            // InternalSequence.g:3247:2: rule__StandardMessage__Group__3__Impl rule__StandardMessage__Group__4
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
    // InternalSequence.g:3254:1: rule__StandardMessage__Group__3__Impl : ( ( rule__StandardMessage__LeftAssignment_3 ) ) ;
    public final void rule__StandardMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3258:1: ( ( ( rule__StandardMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:3259:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:3259:1: ( ( rule__StandardMessage__LeftAssignment_3 ) )
            // InternalSequence.g:3260:2: ( rule__StandardMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:3261:2: ( rule__StandardMessage__LeftAssignment_3 )
            // InternalSequence.g:3261:3: rule__StandardMessage__LeftAssignment_3
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
    // InternalSequence.g:3269:1: rule__StandardMessage__Group__4 : rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 ;
    public final void rule__StandardMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3273:1: ( rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5 )
            // InternalSequence.g:3274:2: rule__StandardMessage__Group__4__Impl rule__StandardMessage__Group__5
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
    // InternalSequence.g:3281:1: rule__StandardMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__StandardMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3285:1: ( ( ',' ) )
            // InternalSequence.g:3286:1: ( ',' )
            {
            // InternalSequence.g:3286:1: ( ',' )
            // InternalSequence.g:3287:2: ','
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
    // InternalSequence.g:3296:1: rule__StandardMessage__Group__5 : rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 ;
    public final void rule__StandardMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3300:1: ( rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6 )
            // InternalSequence.g:3301:2: rule__StandardMessage__Group__5__Impl rule__StandardMessage__Group__6
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
    // InternalSequence.g:3308:1: rule__StandardMessage__Group__5__Impl : ( ( rule__StandardMessage__RightAssignment_5 ) ) ;
    public final void rule__StandardMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3312:1: ( ( ( rule__StandardMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:3313:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:3313:1: ( ( rule__StandardMessage__RightAssignment_5 ) )
            // InternalSequence.g:3314:2: ( rule__StandardMessage__RightAssignment_5 )
            {
             before(grammarAccess.getStandardMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:3315:2: ( rule__StandardMessage__RightAssignment_5 )
            // InternalSequence.g:3315:3: rule__StandardMessage__RightAssignment_5
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
    // InternalSequence.g:3323:1: rule__StandardMessage__Group__6 : rule__StandardMessage__Group__6__Impl rule__StandardMessage__Group__7 ;
    public final void rule__StandardMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3327:1: ( rule__StandardMessage__Group__6__Impl rule__StandardMessage__Group__7 )
            // InternalSequence.g:3328:2: rule__StandardMessage__Group__6__Impl rule__StandardMessage__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__StandardMessage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__7();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:3335:1: rule__StandardMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__StandardMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3339:1: ( ( ')' ) )
            // InternalSequence.g:3340:1: ( ')' )
            {
            // InternalSequence.g:3340:1: ( ')' )
            // InternalSequence.g:3341:2: ')'
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


    // $ANTLR start "rule__StandardMessage__Group__7"
    // InternalSequence.g:3350:1: rule__StandardMessage__Group__7 : rule__StandardMessage__Group__7__Impl rule__StandardMessage__Group__8 ;
    public final void rule__StandardMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3354:1: ( rule__StandardMessage__Group__7__Impl rule__StandardMessage__Group__8 )
            // InternalSequence.g:3355:2: rule__StandardMessage__Group__7__Impl rule__StandardMessage__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__StandardMessage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__7"


    // $ANTLR start "rule__StandardMessage__Group__7__Impl"
    // InternalSequence.g:3362:1: rule__StandardMessage__Group__7__Impl : ( ( rule__StandardMessage__Group_7__0 )? ) ;
    public final void rule__StandardMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3366:1: ( ( ( rule__StandardMessage__Group_7__0 )? ) )
            // InternalSequence.g:3367:1: ( ( rule__StandardMessage__Group_7__0 )? )
            {
            // InternalSequence.g:3367:1: ( ( rule__StandardMessage__Group_7__0 )? )
            // InternalSequence.g:3368:2: ( rule__StandardMessage__Group_7__0 )?
            {
             before(grammarAccess.getStandardMessageAccess().getGroup_7()); 
            // InternalSequence.g:3369:2: ( rule__StandardMessage__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSequence.g:3369:3: rule__StandardMessage__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StandardMessage__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStandardMessageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__7__Impl"


    // $ANTLR start "rule__StandardMessage__Group__8"
    // InternalSequence.g:3377:1: rule__StandardMessage__Group__8 : rule__StandardMessage__Group__8__Impl rule__StandardMessage__Group__9 ;
    public final void rule__StandardMessage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3381:1: ( rule__StandardMessage__Group__8__Impl rule__StandardMessage__Group__9 )
            // InternalSequence.g:3382:2: rule__StandardMessage__Group__8__Impl rule__StandardMessage__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__StandardMessage__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__8"


    // $ANTLR start "rule__StandardMessage__Group__8__Impl"
    // InternalSequence.g:3389:1: rule__StandardMessage__Group__8__Impl : ( ( rule__StandardMessage__SendEventAssignment_8 ) ) ;
    public final void rule__StandardMessage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3393:1: ( ( ( rule__StandardMessage__SendEventAssignment_8 ) ) )
            // InternalSequence.g:3394:1: ( ( rule__StandardMessage__SendEventAssignment_8 ) )
            {
            // InternalSequence.g:3394:1: ( ( rule__StandardMessage__SendEventAssignment_8 ) )
            // InternalSequence.g:3395:2: ( rule__StandardMessage__SendEventAssignment_8 )
            {
             before(grammarAccess.getStandardMessageAccess().getSendEventAssignment_8()); 
            // InternalSequence.g:3396:2: ( rule__StandardMessage__SendEventAssignment_8 )
            // InternalSequence.g:3396:3: rule__StandardMessage__SendEventAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__SendEventAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStandardMessageAccess().getSendEventAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__8__Impl"


    // $ANTLR start "rule__StandardMessage__Group__9"
    // InternalSequence.g:3404:1: rule__StandardMessage__Group__9 : rule__StandardMessage__Group__9__Impl ;
    public final void rule__StandardMessage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3408:1: ( rule__StandardMessage__Group__9__Impl )
            // InternalSequence.g:3409:2: rule__StandardMessage__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__9"


    // $ANTLR start "rule__StandardMessage__Group__9__Impl"
    // InternalSequence.g:3415:1: rule__StandardMessage__Group__9__Impl : ( ( rule__StandardMessage__Alternatives_9 ) ) ;
    public final void rule__StandardMessage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3419:1: ( ( ( rule__StandardMessage__Alternatives_9 ) ) )
            // InternalSequence.g:3420:1: ( ( rule__StandardMessage__Alternatives_9 ) )
            {
            // InternalSequence.g:3420:1: ( ( rule__StandardMessage__Alternatives_9 ) )
            // InternalSequence.g:3421:2: ( rule__StandardMessage__Alternatives_9 )
            {
             before(grammarAccess.getStandardMessageAccess().getAlternatives_9()); 
            // InternalSequence.g:3422:2: ( rule__StandardMessage__Alternatives_9 )
            // InternalSequence.g:3422:3: rule__StandardMessage__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getStandardMessageAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group__9__Impl"


    // $ANTLR start "rule__StandardMessage__Group_7__0"
    // InternalSequence.g:3431:1: rule__StandardMessage__Group_7__0 : rule__StandardMessage__Group_7__0__Impl rule__StandardMessage__Group_7__1 ;
    public final void rule__StandardMessage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3435:1: ( rule__StandardMessage__Group_7__0__Impl rule__StandardMessage__Group_7__1 )
            // InternalSequence.g:3436:2: rule__StandardMessage__Group_7__0__Impl rule__StandardMessage__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__StandardMessage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group_7__0"


    // $ANTLR start "rule__StandardMessage__Group_7__0__Impl"
    // InternalSequence.g:3443:1: rule__StandardMessage__Group_7__0__Impl : ( 'as' ) ;
    public final void rule__StandardMessage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3447:1: ( ( 'as' ) )
            // InternalSequence.g:3448:1: ( 'as' )
            {
            // InternalSequence.g:3448:1: ( 'as' )
            // InternalSequence.g:3449:2: 'as'
            {
             before(grammarAccess.getStandardMessageAccess().getAsKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStandardMessageAccess().getAsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group_7__0__Impl"


    // $ANTLR start "rule__StandardMessage__Group_7__1"
    // InternalSequence.g:3458:1: rule__StandardMessage__Group_7__1 : rule__StandardMessage__Group_7__1__Impl ;
    public final void rule__StandardMessage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3462:1: ( rule__StandardMessage__Group_7__1__Impl )
            // InternalSequence.g:3463:2: rule__StandardMessage__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group_7__1"


    // $ANTLR start "rule__StandardMessage__Group_7__1__Impl"
    // InternalSequence.g:3469:1: rule__StandardMessage__Group_7__1__Impl : ( ( rule__StandardMessage__AliasAssignment_7_1 ) ) ;
    public final void rule__StandardMessage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3473:1: ( ( ( rule__StandardMessage__AliasAssignment_7_1 ) ) )
            // InternalSequence.g:3474:1: ( ( rule__StandardMessage__AliasAssignment_7_1 ) )
            {
            // InternalSequence.g:3474:1: ( ( rule__StandardMessage__AliasAssignment_7_1 ) )
            // InternalSequence.g:3475:2: ( rule__StandardMessage__AliasAssignment_7_1 )
            {
             before(grammarAccess.getStandardMessageAccess().getAliasAssignment_7_1()); 
            // InternalSequence.g:3476:2: ( rule__StandardMessage__AliasAssignment_7_1 )
            // InternalSequence.g:3476:3: rule__StandardMessage__AliasAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__StandardMessage__AliasAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStandardMessageAccess().getAliasAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__Group_7__1__Impl"


    // $ANTLR start "rule__ResponseMessage__Group__0"
    // InternalSequence.g:3485:1: rule__ResponseMessage__Group__0 : rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 ;
    public final void rule__ResponseMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3489:1: ( rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1 )
            // InternalSequence.g:3490:2: rule__ResponseMessage__Group__0__Impl rule__ResponseMessage__Group__1
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
    // InternalSequence.g:3497:1: rule__ResponseMessage__Group__0__Impl : ( 'reply' ) ;
    public final void rule__ResponseMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3501:1: ( ( 'reply' ) )
            // InternalSequence.g:3502:1: ( 'reply' )
            {
            // InternalSequence.g:3502:1: ( 'reply' )
            // InternalSequence.g:3503:2: 'reply'
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
    // InternalSequence.g:3512:1: rule__ResponseMessage__Group__1 : rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 ;
    public final void rule__ResponseMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3516:1: ( rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2 )
            // InternalSequence.g:3517:2: rule__ResponseMessage__Group__1__Impl rule__ResponseMessage__Group__2
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
    // InternalSequence.g:3524:1: rule__ResponseMessage__Group__1__Impl : ( ( rule__ResponseMessage__NameAssignment_1 ) ) ;
    public final void rule__ResponseMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3528:1: ( ( ( rule__ResponseMessage__NameAssignment_1 ) ) )
            // InternalSequence.g:3529:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            {
            // InternalSequence.g:3529:1: ( ( rule__ResponseMessage__NameAssignment_1 ) )
            // InternalSequence.g:3530:2: ( rule__ResponseMessage__NameAssignment_1 )
            {
             before(grammarAccess.getResponseMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:3531:2: ( rule__ResponseMessage__NameAssignment_1 )
            // InternalSequence.g:3531:3: rule__ResponseMessage__NameAssignment_1
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
    // InternalSequence.g:3539:1: rule__ResponseMessage__Group__2 : rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 ;
    public final void rule__ResponseMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3543:1: ( rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3 )
            // InternalSequence.g:3544:2: rule__ResponseMessage__Group__2__Impl rule__ResponseMessage__Group__3
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
    // InternalSequence.g:3551:1: rule__ResponseMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__ResponseMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3555:1: ( ( '(' ) )
            // InternalSequence.g:3556:1: ( '(' )
            {
            // InternalSequence.g:3556:1: ( '(' )
            // InternalSequence.g:3557:2: '('
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
    // InternalSequence.g:3566:1: rule__ResponseMessage__Group__3 : rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 ;
    public final void rule__ResponseMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3570:1: ( rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4 )
            // InternalSequence.g:3571:2: rule__ResponseMessage__Group__3__Impl rule__ResponseMessage__Group__4
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
    // InternalSequence.g:3578:1: rule__ResponseMessage__Group__3__Impl : ( ( rule__ResponseMessage__Alternatives_3 ) ) ;
    public final void rule__ResponseMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3582:1: ( ( ( rule__ResponseMessage__Alternatives_3 ) ) )
            // InternalSequence.g:3583:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            {
            // InternalSequence.g:3583:1: ( ( rule__ResponseMessage__Alternatives_3 ) )
            // InternalSequence.g:3584:2: ( rule__ResponseMessage__Alternatives_3 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_3()); 
            // InternalSequence.g:3585:2: ( rule__ResponseMessage__Alternatives_3 )
            // InternalSequence.g:3585:3: rule__ResponseMessage__Alternatives_3
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
    // InternalSequence.g:3593:1: rule__ResponseMessage__Group__4 : rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 ;
    public final void rule__ResponseMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3597:1: ( rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5 )
            // InternalSequence.g:3598:2: rule__ResponseMessage__Group__4__Impl rule__ResponseMessage__Group__5
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
    // InternalSequence.g:3605:1: rule__ResponseMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__ResponseMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3609:1: ( ( ',' ) )
            // InternalSequence.g:3610:1: ( ',' )
            {
            // InternalSequence.g:3610:1: ( ',' )
            // InternalSequence.g:3611:2: ','
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
    // InternalSequence.g:3620:1: rule__ResponseMessage__Group__5 : rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 ;
    public final void rule__ResponseMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3624:1: ( rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6 )
            // InternalSequence.g:3625:2: rule__ResponseMessage__Group__5__Impl rule__ResponseMessage__Group__6
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
    // InternalSequence.g:3632:1: rule__ResponseMessage__Group__5__Impl : ( ( rule__ResponseMessage__Alternatives_5 ) ) ;
    public final void rule__ResponseMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3636:1: ( ( ( rule__ResponseMessage__Alternatives_5 ) ) )
            // InternalSequence.g:3637:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            {
            // InternalSequence.g:3637:1: ( ( rule__ResponseMessage__Alternatives_5 ) )
            // InternalSequence.g:3638:2: ( rule__ResponseMessage__Alternatives_5 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_5()); 
            // InternalSequence.g:3639:2: ( rule__ResponseMessage__Alternatives_5 )
            // InternalSequence.g:3639:3: rule__ResponseMessage__Alternatives_5
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
    // InternalSequence.g:3647:1: rule__ResponseMessage__Group__6 : rule__ResponseMessage__Group__6__Impl rule__ResponseMessage__Group__7 ;
    public final void rule__ResponseMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3651:1: ( rule__ResponseMessage__Group__6__Impl rule__ResponseMessage__Group__7 )
            // InternalSequence.g:3652:2: rule__ResponseMessage__Group__6__Impl rule__ResponseMessage__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__ResponseMessage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__7();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:3659:1: rule__ResponseMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__ResponseMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3663:1: ( ( ')' ) )
            // InternalSequence.g:3664:1: ( ')' )
            {
            // InternalSequence.g:3664:1: ( ')' )
            // InternalSequence.g:3665:2: ')'
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


    // $ANTLR start "rule__ResponseMessage__Group__7"
    // InternalSequence.g:3674:1: rule__ResponseMessage__Group__7 : rule__ResponseMessage__Group__7__Impl rule__ResponseMessage__Group__8 ;
    public final void rule__ResponseMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3678:1: ( rule__ResponseMessage__Group__7__Impl rule__ResponseMessage__Group__8 )
            // InternalSequence.g:3679:2: rule__ResponseMessage__Group__7__Impl rule__ResponseMessage__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__ResponseMessage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__7"


    // $ANTLR start "rule__ResponseMessage__Group__7__Impl"
    // InternalSequence.g:3686:1: rule__ResponseMessage__Group__7__Impl : ( ( rule__ResponseMessage__Group_7__0 )? ) ;
    public final void rule__ResponseMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3690:1: ( ( ( rule__ResponseMessage__Group_7__0 )? ) )
            // InternalSequence.g:3691:1: ( ( rule__ResponseMessage__Group_7__0 )? )
            {
            // InternalSequence.g:3691:1: ( ( rule__ResponseMessage__Group_7__0 )? )
            // InternalSequence.g:3692:2: ( rule__ResponseMessage__Group_7__0 )?
            {
             before(grammarAccess.getResponseMessageAccess().getGroup_7()); 
            // InternalSequence.g:3693:2: ( rule__ResponseMessage__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSequence.g:3693:3: rule__ResponseMessage__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResponseMessage__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseMessageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__7__Impl"


    // $ANTLR start "rule__ResponseMessage__Group__8"
    // InternalSequence.g:3701:1: rule__ResponseMessage__Group__8 : rule__ResponseMessage__Group__8__Impl rule__ResponseMessage__Group__9 ;
    public final void rule__ResponseMessage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3705:1: ( rule__ResponseMessage__Group__8__Impl rule__ResponseMessage__Group__9 )
            // InternalSequence.g:3706:2: rule__ResponseMessage__Group__8__Impl rule__ResponseMessage__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__ResponseMessage__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__8"


    // $ANTLR start "rule__ResponseMessage__Group__8__Impl"
    // InternalSequence.g:3713:1: rule__ResponseMessage__Group__8__Impl : ( ( rule__ResponseMessage__SendEventAssignment_8 ) ) ;
    public final void rule__ResponseMessage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3717:1: ( ( ( rule__ResponseMessage__SendEventAssignment_8 ) ) )
            // InternalSequence.g:3718:1: ( ( rule__ResponseMessage__SendEventAssignment_8 ) )
            {
            // InternalSequence.g:3718:1: ( ( rule__ResponseMessage__SendEventAssignment_8 ) )
            // InternalSequence.g:3719:2: ( rule__ResponseMessage__SendEventAssignment_8 )
            {
             before(grammarAccess.getResponseMessageAccess().getSendEventAssignment_8()); 
            // InternalSequence.g:3720:2: ( rule__ResponseMessage__SendEventAssignment_8 )
            // InternalSequence.g:3720:3: rule__ResponseMessage__SendEventAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ResponseMessage__SendEventAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getResponseMessageAccess().getSendEventAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__8__Impl"


    // $ANTLR start "rule__ResponseMessage__Group__9"
    // InternalSequence.g:3728:1: rule__ResponseMessage__Group__9 : rule__ResponseMessage__Group__9__Impl ;
    public final void rule__ResponseMessage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3732:1: ( rule__ResponseMessage__Group__9__Impl )
            // InternalSequence.g:3733:2: rule__ResponseMessage__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__9"


    // $ANTLR start "rule__ResponseMessage__Group__9__Impl"
    // InternalSequence.g:3739:1: rule__ResponseMessage__Group__9__Impl : ( ( rule__ResponseMessage__Alternatives_9 ) ) ;
    public final void rule__ResponseMessage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3743:1: ( ( ( rule__ResponseMessage__Alternatives_9 ) ) )
            // InternalSequence.g:3744:1: ( ( rule__ResponseMessage__Alternatives_9 ) )
            {
            // InternalSequence.g:3744:1: ( ( rule__ResponseMessage__Alternatives_9 ) )
            // InternalSequence.g:3745:2: ( rule__ResponseMessage__Alternatives_9 )
            {
             before(grammarAccess.getResponseMessageAccess().getAlternatives_9()); 
            // InternalSequence.g:3746:2: ( rule__ResponseMessage__Alternatives_9 )
            // InternalSequence.g:3746:3: rule__ResponseMessage__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getResponseMessageAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group__9__Impl"


    // $ANTLR start "rule__ResponseMessage__Group_7__0"
    // InternalSequence.g:3755:1: rule__ResponseMessage__Group_7__0 : rule__ResponseMessage__Group_7__0__Impl rule__ResponseMessage__Group_7__1 ;
    public final void rule__ResponseMessage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3759:1: ( rule__ResponseMessage__Group_7__0__Impl rule__ResponseMessage__Group_7__1 )
            // InternalSequence.g:3760:2: rule__ResponseMessage__Group_7__0__Impl rule__ResponseMessage__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__ResponseMessage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group_7__0"


    // $ANTLR start "rule__ResponseMessage__Group_7__0__Impl"
    // InternalSequence.g:3767:1: rule__ResponseMessage__Group_7__0__Impl : ( 'as' ) ;
    public final void rule__ResponseMessage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3771:1: ( ( 'as' ) )
            // InternalSequence.g:3772:1: ( 'as' )
            {
            // InternalSequence.g:3772:1: ( 'as' )
            // InternalSequence.g:3773:2: 'as'
            {
             before(grammarAccess.getResponseMessageAccess().getAsKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getResponseMessageAccess().getAsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group_7__0__Impl"


    // $ANTLR start "rule__ResponseMessage__Group_7__1"
    // InternalSequence.g:3782:1: rule__ResponseMessage__Group_7__1 : rule__ResponseMessage__Group_7__1__Impl ;
    public final void rule__ResponseMessage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3786:1: ( rule__ResponseMessage__Group_7__1__Impl )
            // InternalSequence.g:3787:2: rule__ResponseMessage__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResponseMessage__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group_7__1"


    // $ANTLR start "rule__ResponseMessage__Group_7__1__Impl"
    // InternalSequence.g:3793:1: rule__ResponseMessage__Group_7__1__Impl : ( ( rule__ResponseMessage__AliasAssignment_7_1 ) ) ;
    public final void rule__ResponseMessage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3797:1: ( ( ( rule__ResponseMessage__AliasAssignment_7_1 ) ) )
            // InternalSequence.g:3798:1: ( ( rule__ResponseMessage__AliasAssignment_7_1 ) )
            {
            // InternalSequence.g:3798:1: ( ( rule__ResponseMessage__AliasAssignment_7_1 ) )
            // InternalSequence.g:3799:2: ( rule__ResponseMessage__AliasAssignment_7_1 )
            {
             before(grammarAccess.getResponseMessageAccess().getAliasAssignment_7_1()); 
            // InternalSequence.g:3800:2: ( rule__ResponseMessage__AliasAssignment_7_1 )
            // InternalSequence.g:3800:3: rule__ResponseMessage__AliasAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ResponseMessage__AliasAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseMessageAccess().getAliasAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__Group_7__1__Impl"


    // $ANTLR start "rule__FoundMessage__Group__0"
    // InternalSequence.g:3809:1: rule__FoundMessage__Group__0 : rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 ;
    public final void rule__FoundMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3813:1: ( rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1 )
            // InternalSequence.g:3814:2: rule__FoundMessage__Group__0__Impl rule__FoundMessage__Group__1
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
    // InternalSequence.g:3821:1: rule__FoundMessage__Group__0__Impl : ( 'found' ) ;
    public final void rule__FoundMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3825:1: ( ( 'found' ) )
            // InternalSequence.g:3826:1: ( 'found' )
            {
            // InternalSequence.g:3826:1: ( 'found' )
            // InternalSequence.g:3827:2: 'found'
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
    // InternalSequence.g:3836:1: rule__FoundMessage__Group__1 : rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 ;
    public final void rule__FoundMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3840:1: ( rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2 )
            // InternalSequence.g:3841:2: rule__FoundMessage__Group__1__Impl rule__FoundMessage__Group__2
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
    // InternalSequence.g:3848:1: rule__FoundMessage__Group__1__Impl : ( ( rule__FoundMessage__TypeAssignment_1 ) ) ;
    public final void rule__FoundMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3852:1: ( ( ( rule__FoundMessage__TypeAssignment_1 ) ) )
            // InternalSequence.g:3853:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            {
            // InternalSequence.g:3853:1: ( ( rule__FoundMessage__TypeAssignment_1 ) )
            // InternalSequence.g:3854:2: ( rule__FoundMessage__TypeAssignment_1 )
            {
             before(grammarAccess.getFoundMessageAccess().getTypeAssignment_1()); 
            // InternalSequence.g:3855:2: ( rule__FoundMessage__TypeAssignment_1 )
            // InternalSequence.g:3855:3: rule__FoundMessage__TypeAssignment_1
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
    // InternalSequence.g:3863:1: rule__FoundMessage__Group__2 : rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 ;
    public final void rule__FoundMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3867:1: ( rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3 )
            // InternalSequence.g:3868:2: rule__FoundMessage__Group__2__Impl rule__FoundMessage__Group__3
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
    // InternalSequence.g:3875:1: rule__FoundMessage__Group__2__Impl : ( ( rule__FoundMessage__NameAssignment_2 ) ) ;
    public final void rule__FoundMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3879:1: ( ( ( rule__FoundMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:3880:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:3880:1: ( ( rule__FoundMessage__NameAssignment_2 ) )
            // InternalSequence.g:3881:2: ( rule__FoundMessage__NameAssignment_2 )
            {
             before(grammarAccess.getFoundMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:3882:2: ( rule__FoundMessage__NameAssignment_2 )
            // InternalSequence.g:3882:3: rule__FoundMessage__NameAssignment_2
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
    // InternalSequence.g:3890:1: rule__FoundMessage__Group__3 : rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 ;
    public final void rule__FoundMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3894:1: ( rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4 )
            // InternalSequence.g:3895:2: rule__FoundMessage__Group__3__Impl rule__FoundMessage__Group__4
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
    // InternalSequence.g:3902:1: rule__FoundMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__FoundMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3906:1: ( ( '(' ) )
            // InternalSequence.g:3907:1: ( '(' )
            {
            // InternalSequence.g:3907:1: ( '(' )
            // InternalSequence.g:3908:2: '('
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
    // InternalSequence.g:3917:1: rule__FoundMessage__Group__4 : rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 ;
    public final void rule__FoundMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3921:1: ( rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5 )
            // InternalSequence.g:3922:2: rule__FoundMessage__Group__4__Impl rule__FoundMessage__Group__5
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
    // InternalSequence.g:3929:1: rule__FoundMessage__Group__4__Impl : ( '_' ) ;
    public final void rule__FoundMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3933:1: ( ( '_' ) )
            // InternalSequence.g:3934:1: ( '_' )
            {
            // InternalSequence.g:3934:1: ( '_' )
            // InternalSequence.g:3935:2: '_'
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
    // InternalSequence.g:3944:1: rule__FoundMessage__Group__5 : rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 ;
    public final void rule__FoundMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3948:1: ( rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6 )
            // InternalSequence.g:3949:2: rule__FoundMessage__Group__5__Impl rule__FoundMessage__Group__6
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
    // InternalSequence.g:3956:1: rule__FoundMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__FoundMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3960:1: ( ( ',' ) )
            // InternalSequence.g:3961:1: ( ',' )
            {
            // InternalSequence.g:3961:1: ( ',' )
            // InternalSequence.g:3962:2: ','
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
    // InternalSequence.g:3971:1: rule__FoundMessage__Group__6 : rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 ;
    public final void rule__FoundMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3975:1: ( rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7 )
            // InternalSequence.g:3976:2: rule__FoundMessage__Group__6__Impl rule__FoundMessage__Group__7
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
    // InternalSequence.g:3983:1: rule__FoundMessage__Group__6__Impl : ( ( rule__FoundMessage__RightAssignment_6 ) ) ;
    public final void rule__FoundMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:3987:1: ( ( ( rule__FoundMessage__RightAssignment_6 ) ) )
            // InternalSequence.g:3988:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            {
            // InternalSequence.g:3988:1: ( ( rule__FoundMessage__RightAssignment_6 ) )
            // InternalSequence.g:3989:2: ( rule__FoundMessage__RightAssignment_6 )
            {
             before(grammarAccess.getFoundMessageAccess().getRightAssignment_6()); 
            // InternalSequence.g:3990:2: ( rule__FoundMessage__RightAssignment_6 )
            // InternalSequence.g:3990:3: rule__FoundMessage__RightAssignment_6
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
    // InternalSequence.g:3998:1: rule__FoundMessage__Group__7 : rule__FoundMessage__Group__7__Impl rule__FoundMessage__Group__8 ;
    public final void rule__FoundMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4002:1: ( rule__FoundMessage__Group__7__Impl rule__FoundMessage__Group__8 )
            // InternalSequence.g:4003:2: rule__FoundMessage__Group__7__Impl rule__FoundMessage__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__FoundMessage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__8();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:4010:1: rule__FoundMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__FoundMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4014:1: ( ( ')' ) )
            // InternalSequence.g:4015:1: ( ')' )
            {
            // InternalSequence.g:4015:1: ( ')' )
            // InternalSequence.g:4016:2: ')'
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


    // $ANTLR start "rule__FoundMessage__Group__8"
    // InternalSequence.g:4025:1: rule__FoundMessage__Group__8 : rule__FoundMessage__Group__8__Impl rule__FoundMessage__Group__9 ;
    public final void rule__FoundMessage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4029:1: ( rule__FoundMessage__Group__8__Impl rule__FoundMessage__Group__9 )
            // InternalSequence.g:4030:2: rule__FoundMessage__Group__8__Impl rule__FoundMessage__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__FoundMessage__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__8"


    // $ANTLR start "rule__FoundMessage__Group__8__Impl"
    // InternalSequence.g:4037:1: rule__FoundMessage__Group__8__Impl : ( ( rule__FoundMessage__Group_8__0 )? ) ;
    public final void rule__FoundMessage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4041:1: ( ( ( rule__FoundMessage__Group_8__0 )? ) )
            // InternalSequence.g:4042:1: ( ( rule__FoundMessage__Group_8__0 )? )
            {
            // InternalSequence.g:4042:1: ( ( rule__FoundMessage__Group_8__0 )? )
            // InternalSequence.g:4043:2: ( rule__FoundMessage__Group_8__0 )?
            {
             before(grammarAccess.getFoundMessageAccess().getGroup_8()); 
            // InternalSequence.g:4044:2: ( rule__FoundMessage__Group_8__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSequence.g:4044:3: rule__FoundMessage__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FoundMessage__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFoundMessageAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__8__Impl"


    // $ANTLR start "rule__FoundMessage__Group__9"
    // InternalSequence.g:4052:1: rule__FoundMessage__Group__9 : rule__FoundMessage__Group__9__Impl ;
    public final void rule__FoundMessage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4056:1: ( rule__FoundMessage__Group__9__Impl )
            // InternalSequence.g:4057:2: rule__FoundMessage__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__9"


    // $ANTLR start "rule__FoundMessage__Group__9__Impl"
    // InternalSequence.g:4063:1: rule__FoundMessage__Group__9__Impl : ( ( rule__FoundMessage__ArrivalEventAssignment_9 ) ) ;
    public final void rule__FoundMessage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4067:1: ( ( ( rule__FoundMessage__ArrivalEventAssignment_9 ) ) )
            // InternalSequence.g:4068:1: ( ( rule__FoundMessage__ArrivalEventAssignment_9 ) )
            {
            // InternalSequence.g:4068:1: ( ( rule__FoundMessage__ArrivalEventAssignment_9 ) )
            // InternalSequence.g:4069:2: ( rule__FoundMessage__ArrivalEventAssignment_9 )
            {
             before(grammarAccess.getFoundMessageAccess().getArrivalEventAssignment_9()); 
            // InternalSequence.g:4070:2: ( rule__FoundMessage__ArrivalEventAssignment_9 )
            // InternalSequence.g:4070:3: rule__FoundMessage__ArrivalEventAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FoundMessage__ArrivalEventAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFoundMessageAccess().getArrivalEventAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group__9__Impl"


    // $ANTLR start "rule__FoundMessage__Group_8__0"
    // InternalSequence.g:4079:1: rule__FoundMessage__Group_8__0 : rule__FoundMessage__Group_8__0__Impl rule__FoundMessage__Group_8__1 ;
    public final void rule__FoundMessage__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4083:1: ( rule__FoundMessage__Group_8__0__Impl rule__FoundMessage__Group_8__1 )
            // InternalSequence.g:4084:2: rule__FoundMessage__Group_8__0__Impl rule__FoundMessage__Group_8__1
            {
            pushFollow(FOLLOW_10);
            rule__FoundMessage__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group_8__0"


    // $ANTLR start "rule__FoundMessage__Group_8__0__Impl"
    // InternalSequence.g:4091:1: rule__FoundMessage__Group_8__0__Impl : ( 'as' ) ;
    public final void rule__FoundMessage__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4095:1: ( ( 'as' ) )
            // InternalSequence.g:4096:1: ( 'as' )
            {
            // InternalSequence.g:4096:1: ( 'as' )
            // InternalSequence.g:4097:2: 'as'
            {
             before(grammarAccess.getFoundMessageAccess().getAsKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFoundMessageAccess().getAsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group_8__0__Impl"


    // $ANTLR start "rule__FoundMessage__Group_8__1"
    // InternalSequence.g:4106:1: rule__FoundMessage__Group_8__1 : rule__FoundMessage__Group_8__1__Impl ;
    public final void rule__FoundMessage__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4110:1: ( rule__FoundMessage__Group_8__1__Impl )
            // InternalSequence.g:4111:2: rule__FoundMessage__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FoundMessage__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group_8__1"


    // $ANTLR start "rule__FoundMessage__Group_8__1__Impl"
    // InternalSequence.g:4117:1: rule__FoundMessage__Group_8__1__Impl : ( ( rule__FoundMessage__AliasAssignment_8_1 ) ) ;
    public final void rule__FoundMessage__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4121:1: ( ( ( rule__FoundMessage__AliasAssignment_8_1 ) ) )
            // InternalSequence.g:4122:1: ( ( rule__FoundMessage__AliasAssignment_8_1 ) )
            {
            // InternalSequence.g:4122:1: ( ( rule__FoundMessage__AliasAssignment_8_1 ) )
            // InternalSequence.g:4123:2: ( rule__FoundMessage__AliasAssignment_8_1 )
            {
             before(grammarAccess.getFoundMessageAccess().getAliasAssignment_8_1()); 
            // InternalSequence.g:4124:2: ( rule__FoundMessage__AliasAssignment_8_1 )
            // InternalSequence.g:4124:3: rule__FoundMessage__AliasAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__FoundMessage__AliasAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getFoundMessageAccess().getAliasAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__Group_8__1__Impl"


    // $ANTLR start "rule__LostMessage__Group__0"
    // InternalSequence.g:4133:1: rule__LostMessage__Group__0 : rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 ;
    public final void rule__LostMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4137:1: ( rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1 )
            // InternalSequence.g:4138:2: rule__LostMessage__Group__0__Impl rule__LostMessage__Group__1
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
    // InternalSequence.g:4145:1: rule__LostMessage__Group__0__Impl : ( 'lost' ) ;
    public final void rule__LostMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4149:1: ( ( 'lost' ) )
            // InternalSequence.g:4150:1: ( 'lost' )
            {
            // InternalSequence.g:4150:1: ( 'lost' )
            // InternalSequence.g:4151:2: 'lost'
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
    // InternalSequence.g:4160:1: rule__LostMessage__Group__1 : rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 ;
    public final void rule__LostMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4164:1: ( rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2 )
            // InternalSequence.g:4165:2: rule__LostMessage__Group__1__Impl rule__LostMessage__Group__2
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
    // InternalSequence.g:4172:1: rule__LostMessage__Group__1__Impl : ( ( rule__LostMessage__Alternatives_1 ) ) ;
    public final void rule__LostMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4176:1: ( ( ( rule__LostMessage__Alternatives_1 ) ) )
            // InternalSequence.g:4177:1: ( ( rule__LostMessage__Alternatives_1 ) )
            {
            // InternalSequence.g:4177:1: ( ( rule__LostMessage__Alternatives_1 ) )
            // InternalSequence.g:4178:2: ( rule__LostMessage__Alternatives_1 )
            {
             before(grammarAccess.getLostMessageAccess().getAlternatives_1()); 
            // InternalSequence.g:4179:2: ( rule__LostMessage__Alternatives_1 )
            // InternalSequence.g:4179:3: rule__LostMessage__Alternatives_1
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
    // InternalSequence.g:4187:1: rule__LostMessage__Group__2 : rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 ;
    public final void rule__LostMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4191:1: ( rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3 )
            // InternalSequence.g:4192:2: rule__LostMessage__Group__2__Impl rule__LostMessage__Group__3
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
    // InternalSequence.g:4199:1: rule__LostMessage__Group__2__Impl : ( ( rule__LostMessage__NameAssignment_2 ) ) ;
    public final void rule__LostMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4203:1: ( ( ( rule__LostMessage__NameAssignment_2 ) ) )
            // InternalSequence.g:4204:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            {
            // InternalSequence.g:4204:1: ( ( rule__LostMessage__NameAssignment_2 ) )
            // InternalSequence.g:4205:2: ( rule__LostMessage__NameAssignment_2 )
            {
             before(grammarAccess.getLostMessageAccess().getNameAssignment_2()); 
            // InternalSequence.g:4206:2: ( rule__LostMessage__NameAssignment_2 )
            // InternalSequence.g:4206:3: rule__LostMessage__NameAssignment_2
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
    // InternalSequence.g:4214:1: rule__LostMessage__Group__3 : rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 ;
    public final void rule__LostMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4218:1: ( rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4 )
            // InternalSequence.g:4219:2: rule__LostMessage__Group__3__Impl rule__LostMessage__Group__4
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
    // InternalSequence.g:4226:1: rule__LostMessage__Group__3__Impl : ( '(' ) ;
    public final void rule__LostMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4230:1: ( ( '(' ) )
            // InternalSequence.g:4231:1: ( '(' )
            {
            // InternalSequence.g:4231:1: ( '(' )
            // InternalSequence.g:4232:2: '('
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
    // InternalSequence.g:4241:1: rule__LostMessage__Group__4 : rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 ;
    public final void rule__LostMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4245:1: ( rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5 )
            // InternalSequence.g:4246:2: rule__LostMessage__Group__4__Impl rule__LostMessage__Group__5
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
    // InternalSequence.g:4253:1: rule__LostMessage__Group__4__Impl : ( ( rule__LostMessage__LeftAssignment_4 ) ) ;
    public final void rule__LostMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4257:1: ( ( ( rule__LostMessage__LeftAssignment_4 ) ) )
            // InternalSequence.g:4258:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            {
            // InternalSequence.g:4258:1: ( ( rule__LostMessage__LeftAssignment_4 ) )
            // InternalSequence.g:4259:2: ( rule__LostMessage__LeftAssignment_4 )
            {
             before(grammarAccess.getLostMessageAccess().getLeftAssignment_4()); 
            // InternalSequence.g:4260:2: ( rule__LostMessage__LeftAssignment_4 )
            // InternalSequence.g:4260:3: rule__LostMessage__LeftAssignment_4
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
    // InternalSequence.g:4268:1: rule__LostMessage__Group__5 : rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 ;
    public final void rule__LostMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4272:1: ( rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6 )
            // InternalSequence.g:4273:2: rule__LostMessage__Group__5__Impl rule__LostMessage__Group__6
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
    // InternalSequence.g:4280:1: rule__LostMessage__Group__5__Impl : ( ',' ) ;
    public final void rule__LostMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4284:1: ( ( ',' ) )
            // InternalSequence.g:4285:1: ( ',' )
            {
            // InternalSequence.g:4285:1: ( ',' )
            // InternalSequence.g:4286:2: ','
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
    // InternalSequence.g:4295:1: rule__LostMessage__Group__6 : rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 ;
    public final void rule__LostMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4299:1: ( rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7 )
            // InternalSequence.g:4300:2: rule__LostMessage__Group__6__Impl rule__LostMessage__Group__7
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
    // InternalSequence.g:4307:1: rule__LostMessage__Group__6__Impl : ( '_' ) ;
    public final void rule__LostMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4311:1: ( ( '_' ) )
            // InternalSequence.g:4312:1: ( '_' )
            {
            // InternalSequence.g:4312:1: ( '_' )
            // InternalSequence.g:4313:2: '_'
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
    // InternalSequence.g:4322:1: rule__LostMessage__Group__7 : rule__LostMessage__Group__7__Impl rule__LostMessage__Group__8 ;
    public final void rule__LostMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4326:1: ( rule__LostMessage__Group__7__Impl rule__LostMessage__Group__8 )
            // InternalSequence.g:4327:2: rule__LostMessage__Group__7__Impl rule__LostMessage__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__LostMessage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__8();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:4334:1: rule__LostMessage__Group__7__Impl : ( ')' ) ;
    public final void rule__LostMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4338:1: ( ( ')' ) )
            // InternalSequence.g:4339:1: ( ')' )
            {
            // InternalSequence.g:4339:1: ( ')' )
            // InternalSequence.g:4340:2: ')'
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


    // $ANTLR start "rule__LostMessage__Group__8"
    // InternalSequence.g:4349:1: rule__LostMessage__Group__8 : rule__LostMessage__Group__8__Impl rule__LostMessage__Group__9 ;
    public final void rule__LostMessage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4353:1: ( rule__LostMessage__Group__8__Impl rule__LostMessage__Group__9 )
            // InternalSequence.g:4354:2: rule__LostMessage__Group__8__Impl rule__LostMessage__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__LostMessage__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__8"


    // $ANTLR start "rule__LostMessage__Group__8__Impl"
    // InternalSequence.g:4361:1: rule__LostMessage__Group__8__Impl : ( ( rule__LostMessage__Group_8__0 )? ) ;
    public final void rule__LostMessage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4365:1: ( ( ( rule__LostMessage__Group_8__0 )? ) )
            // InternalSequence.g:4366:1: ( ( rule__LostMessage__Group_8__0 )? )
            {
            // InternalSequence.g:4366:1: ( ( rule__LostMessage__Group_8__0 )? )
            // InternalSequence.g:4367:2: ( rule__LostMessage__Group_8__0 )?
            {
             before(grammarAccess.getLostMessageAccess().getGroup_8()); 
            // InternalSequence.g:4368:2: ( rule__LostMessage__Group_8__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSequence.g:4368:3: rule__LostMessage__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LostMessage__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLostMessageAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__8__Impl"


    // $ANTLR start "rule__LostMessage__Group__9"
    // InternalSequence.g:4376:1: rule__LostMessage__Group__9 : rule__LostMessage__Group__9__Impl ;
    public final void rule__LostMessage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4380:1: ( rule__LostMessage__Group__9__Impl )
            // InternalSequence.g:4381:2: rule__LostMessage__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__9"


    // $ANTLR start "rule__LostMessage__Group__9__Impl"
    // InternalSequence.g:4387:1: rule__LostMessage__Group__9__Impl : ( ( rule__LostMessage__SendEventAssignment_9 ) ) ;
    public final void rule__LostMessage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4391:1: ( ( ( rule__LostMessage__SendEventAssignment_9 ) ) )
            // InternalSequence.g:4392:1: ( ( rule__LostMessage__SendEventAssignment_9 ) )
            {
            // InternalSequence.g:4392:1: ( ( rule__LostMessage__SendEventAssignment_9 ) )
            // InternalSequence.g:4393:2: ( rule__LostMessage__SendEventAssignment_9 )
            {
             before(grammarAccess.getLostMessageAccess().getSendEventAssignment_9()); 
            // InternalSequence.g:4394:2: ( rule__LostMessage__SendEventAssignment_9 )
            // InternalSequence.g:4394:3: rule__LostMessage__SendEventAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__SendEventAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getLostMessageAccess().getSendEventAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group__9__Impl"


    // $ANTLR start "rule__LostMessage__Group_1_0__0"
    // InternalSequence.g:4403:1: rule__LostMessage__Group_1_0__0 : rule__LostMessage__Group_1_0__0__Impl rule__LostMessage__Group_1_0__1 ;
    public final void rule__LostMessage__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4407:1: ( rule__LostMessage__Group_1_0__0__Impl rule__LostMessage__Group_1_0__1 )
            // InternalSequence.g:4408:2: rule__LostMessage__Group_1_0__0__Impl rule__LostMessage__Group_1_0__1
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
    // InternalSequence.g:4415:1: rule__LostMessage__Group_1_0__0__Impl : ( 'reply' ) ;
    public final void rule__LostMessage__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4419:1: ( ( 'reply' ) )
            // InternalSequence.g:4420:1: ( 'reply' )
            {
            // InternalSequence.g:4420:1: ( 'reply' )
            // InternalSequence.g:4421:2: 'reply'
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
    // InternalSequence.g:4430:1: rule__LostMessage__Group_1_0__1 : rule__LostMessage__Group_1_0__1__Impl ;
    public final void rule__LostMessage__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4434:1: ( rule__LostMessage__Group_1_0__1__Impl )
            // InternalSequence.g:4435:2: rule__LostMessage__Group_1_0__1__Impl
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
    // InternalSequence.g:4441:1: rule__LostMessage__Group_1_0__1__Impl : ( () ) ;
    public final void rule__LostMessage__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4445:1: ( ( () ) )
            // InternalSequence.g:4446:1: ( () )
            {
            // InternalSequence.g:4446:1: ( () )
            // InternalSequence.g:4447:2: ()
            {
             before(grammarAccess.getLostMessageAccess().getResponseMessageAction_1_0_1()); 
            // InternalSequence.g:4448:2: ()
            // InternalSequence.g:4448:3: 
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
    // InternalSequence.g:4457:1: rule__LostMessage__Group_1_1__0 : rule__LostMessage__Group_1_1__0__Impl rule__LostMessage__Group_1_1__1 ;
    public final void rule__LostMessage__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4461:1: ( rule__LostMessage__Group_1_1__0__Impl rule__LostMessage__Group_1_1__1 )
            // InternalSequence.g:4462:2: rule__LostMessage__Group_1_1__0__Impl rule__LostMessage__Group_1_1__1
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
    // InternalSequence.g:4469:1: rule__LostMessage__Group_1_1__0__Impl : ( () ) ;
    public final void rule__LostMessage__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4473:1: ( ( () ) )
            // InternalSequence.g:4474:1: ( () )
            {
            // InternalSequence.g:4474:1: ( () )
            // InternalSequence.g:4475:2: ()
            {
             before(grammarAccess.getLostMessageAccess().getStandardMessageAction_1_1_0()); 
            // InternalSequence.g:4476:2: ()
            // InternalSequence.g:4476:3: 
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
    // InternalSequence.g:4484:1: rule__LostMessage__Group_1_1__1 : rule__LostMessage__Group_1_1__1__Impl ;
    public final void rule__LostMessage__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4488:1: ( rule__LostMessage__Group_1_1__1__Impl )
            // InternalSequence.g:4489:2: rule__LostMessage__Group_1_1__1__Impl
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
    // InternalSequence.g:4495:1: rule__LostMessage__Group_1_1__1__Impl : ( ( rule__LostMessage__TypeAssignment_1_1_1 ) ) ;
    public final void rule__LostMessage__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4499:1: ( ( ( rule__LostMessage__TypeAssignment_1_1_1 ) ) )
            // InternalSequence.g:4500:1: ( ( rule__LostMessage__TypeAssignment_1_1_1 ) )
            {
            // InternalSequence.g:4500:1: ( ( rule__LostMessage__TypeAssignment_1_1_1 ) )
            // InternalSequence.g:4501:2: ( rule__LostMessage__TypeAssignment_1_1_1 )
            {
             before(grammarAccess.getLostMessageAccess().getTypeAssignment_1_1_1()); 
            // InternalSequence.g:4502:2: ( rule__LostMessage__TypeAssignment_1_1_1 )
            // InternalSequence.g:4502:3: rule__LostMessage__TypeAssignment_1_1_1
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


    // $ANTLR start "rule__LostMessage__Group_8__0"
    // InternalSequence.g:4511:1: rule__LostMessage__Group_8__0 : rule__LostMessage__Group_8__0__Impl rule__LostMessage__Group_8__1 ;
    public final void rule__LostMessage__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4515:1: ( rule__LostMessage__Group_8__0__Impl rule__LostMessage__Group_8__1 )
            // InternalSequence.g:4516:2: rule__LostMessage__Group_8__0__Impl rule__LostMessage__Group_8__1
            {
            pushFollow(FOLLOW_10);
            rule__LostMessage__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LostMessage__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_8__0"


    // $ANTLR start "rule__LostMessage__Group_8__0__Impl"
    // InternalSequence.g:4523:1: rule__LostMessage__Group_8__0__Impl : ( 'as' ) ;
    public final void rule__LostMessage__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4527:1: ( ( 'as' ) )
            // InternalSequence.g:4528:1: ( 'as' )
            {
            // InternalSequence.g:4528:1: ( 'as' )
            // InternalSequence.g:4529:2: 'as'
            {
             before(grammarAccess.getLostMessageAccess().getAsKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLostMessageAccess().getAsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_8__0__Impl"


    // $ANTLR start "rule__LostMessage__Group_8__1"
    // InternalSequence.g:4538:1: rule__LostMessage__Group_8__1 : rule__LostMessage__Group_8__1__Impl ;
    public final void rule__LostMessage__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4542:1: ( rule__LostMessage__Group_8__1__Impl )
            // InternalSequence.g:4543:2: rule__LostMessage__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_8__1"


    // $ANTLR start "rule__LostMessage__Group_8__1__Impl"
    // InternalSequence.g:4549:1: rule__LostMessage__Group_8__1__Impl : ( ( rule__LostMessage__AliasAssignment_8_1 ) ) ;
    public final void rule__LostMessage__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4553:1: ( ( ( rule__LostMessage__AliasAssignment_8_1 ) ) )
            // InternalSequence.g:4554:1: ( ( rule__LostMessage__AliasAssignment_8_1 ) )
            {
            // InternalSequence.g:4554:1: ( ( rule__LostMessage__AliasAssignment_8_1 ) )
            // InternalSequence.g:4555:2: ( rule__LostMessage__AliasAssignment_8_1 )
            {
             before(grammarAccess.getLostMessageAccess().getAliasAssignment_8_1()); 
            // InternalSequence.g:4556:2: ( rule__LostMessage__AliasAssignment_8_1 )
            // InternalSequence.g:4556:3: rule__LostMessage__AliasAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__LostMessage__AliasAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getLostMessageAccess().getAliasAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__Group_8__1__Impl"


    // $ANTLR start "rule__CreateMessage__Group__0"
    // InternalSequence.g:4565:1: rule__CreateMessage__Group__0 : rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 ;
    public final void rule__CreateMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4569:1: ( rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1 )
            // InternalSequence.g:4570:2: rule__CreateMessage__Group__0__Impl rule__CreateMessage__Group__1
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
    // InternalSequence.g:4577:1: rule__CreateMessage__Group__0__Impl : ( 'create' ) ;
    public final void rule__CreateMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4581:1: ( ( 'create' ) )
            // InternalSequence.g:4582:1: ( 'create' )
            {
            // InternalSequence.g:4582:1: ( 'create' )
            // InternalSequence.g:4583:2: 'create'
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
    // InternalSequence.g:4592:1: rule__CreateMessage__Group__1 : rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 ;
    public final void rule__CreateMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4596:1: ( rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2 )
            // InternalSequence.g:4597:2: rule__CreateMessage__Group__1__Impl rule__CreateMessage__Group__2
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
    // InternalSequence.g:4604:1: rule__CreateMessage__Group__1__Impl : ( ( rule__CreateMessage__NameAssignment_1 )? ) ;
    public final void rule__CreateMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4608:1: ( ( ( rule__CreateMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:4609:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:4609:1: ( ( rule__CreateMessage__NameAssignment_1 )? )
            // InternalSequence.g:4610:2: ( rule__CreateMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getCreateMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:4611:2: ( rule__CreateMessage__NameAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSequence.g:4611:3: rule__CreateMessage__NameAssignment_1
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
    // InternalSequence.g:4619:1: rule__CreateMessage__Group__2 : rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 ;
    public final void rule__CreateMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4623:1: ( rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3 )
            // InternalSequence.g:4624:2: rule__CreateMessage__Group__2__Impl rule__CreateMessage__Group__3
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
    // InternalSequence.g:4631:1: rule__CreateMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__CreateMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4635:1: ( ( '(' ) )
            // InternalSequence.g:4636:1: ( '(' )
            {
            // InternalSequence.g:4636:1: ( '(' )
            // InternalSequence.g:4637:2: '('
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
    // InternalSequence.g:4646:1: rule__CreateMessage__Group__3 : rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 ;
    public final void rule__CreateMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4650:1: ( rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4 )
            // InternalSequence.g:4651:2: rule__CreateMessage__Group__3__Impl rule__CreateMessage__Group__4
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
    // InternalSequence.g:4658:1: rule__CreateMessage__Group__3__Impl : ( ( rule__CreateMessage__LeftAssignment_3 ) ) ;
    public final void rule__CreateMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4662:1: ( ( ( rule__CreateMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:4663:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:4663:1: ( ( rule__CreateMessage__LeftAssignment_3 ) )
            // InternalSequence.g:4664:2: ( rule__CreateMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:4665:2: ( rule__CreateMessage__LeftAssignment_3 )
            // InternalSequence.g:4665:3: rule__CreateMessage__LeftAssignment_3
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
    // InternalSequence.g:4673:1: rule__CreateMessage__Group__4 : rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 ;
    public final void rule__CreateMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4677:1: ( rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5 )
            // InternalSequence.g:4678:2: rule__CreateMessage__Group__4__Impl rule__CreateMessage__Group__5
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
    // InternalSequence.g:4685:1: rule__CreateMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__CreateMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4689:1: ( ( ',' ) )
            // InternalSequence.g:4690:1: ( ',' )
            {
            // InternalSequence.g:4690:1: ( ',' )
            // InternalSequence.g:4691:2: ','
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
    // InternalSequence.g:4700:1: rule__CreateMessage__Group__5 : rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 ;
    public final void rule__CreateMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4704:1: ( rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6 )
            // InternalSequence.g:4705:2: rule__CreateMessage__Group__5__Impl rule__CreateMessage__Group__6
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
    // InternalSequence.g:4712:1: rule__CreateMessage__Group__5__Impl : ( ( rule__CreateMessage__RightAssignment_5 ) ) ;
    public final void rule__CreateMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4716:1: ( ( ( rule__CreateMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:4717:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:4717:1: ( ( rule__CreateMessage__RightAssignment_5 ) )
            // InternalSequence.g:4718:2: ( rule__CreateMessage__RightAssignment_5 )
            {
             before(grammarAccess.getCreateMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:4719:2: ( rule__CreateMessage__RightAssignment_5 )
            // InternalSequence.g:4719:3: rule__CreateMessage__RightAssignment_5
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
    // InternalSequence.g:4727:1: rule__CreateMessage__Group__6 : rule__CreateMessage__Group__6__Impl rule__CreateMessage__Group__7 ;
    public final void rule__CreateMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4731:1: ( rule__CreateMessage__Group__6__Impl rule__CreateMessage__Group__7 )
            // InternalSequence.g:4732:2: rule__CreateMessage__Group__6__Impl rule__CreateMessage__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__CreateMessage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__7();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:4739:1: rule__CreateMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__CreateMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4743:1: ( ( ')' ) )
            // InternalSequence.g:4744:1: ( ')' )
            {
            // InternalSequence.g:4744:1: ( ')' )
            // InternalSequence.g:4745:2: ')'
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


    // $ANTLR start "rule__CreateMessage__Group__7"
    // InternalSequence.g:4754:1: rule__CreateMessage__Group__7 : rule__CreateMessage__Group__7__Impl rule__CreateMessage__Group__8 ;
    public final void rule__CreateMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4758:1: ( rule__CreateMessage__Group__7__Impl rule__CreateMessage__Group__8 )
            // InternalSequence.g:4759:2: rule__CreateMessage__Group__7__Impl rule__CreateMessage__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__CreateMessage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__7"


    // $ANTLR start "rule__CreateMessage__Group__7__Impl"
    // InternalSequence.g:4766:1: rule__CreateMessage__Group__7__Impl : ( ( rule__CreateMessage__Group_7__0 )? ) ;
    public final void rule__CreateMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4770:1: ( ( ( rule__CreateMessage__Group_7__0 )? ) )
            // InternalSequence.g:4771:1: ( ( rule__CreateMessage__Group_7__0 )? )
            {
            // InternalSequence.g:4771:1: ( ( rule__CreateMessage__Group_7__0 )? )
            // InternalSequence.g:4772:2: ( rule__CreateMessage__Group_7__0 )?
            {
             before(grammarAccess.getCreateMessageAccess().getGroup_7()); 
            // InternalSequence.g:4773:2: ( rule__CreateMessage__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSequence.g:4773:3: rule__CreateMessage__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreateMessage__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreateMessageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__7__Impl"


    // $ANTLR start "rule__CreateMessage__Group__8"
    // InternalSequence.g:4781:1: rule__CreateMessage__Group__8 : rule__CreateMessage__Group__8__Impl rule__CreateMessage__Group__9 ;
    public final void rule__CreateMessage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4785:1: ( rule__CreateMessage__Group__8__Impl rule__CreateMessage__Group__9 )
            // InternalSequence.g:4786:2: rule__CreateMessage__Group__8__Impl rule__CreateMessage__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__CreateMessage__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__8"


    // $ANTLR start "rule__CreateMessage__Group__8__Impl"
    // InternalSequence.g:4793:1: rule__CreateMessage__Group__8__Impl : ( ( rule__CreateMessage__SendEventAssignment_8 ) ) ;
    public final void rule__CreateMessage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4797:1: ( ( ( rule__CreateMessage__SendEventAssignment_8 ) ) )
            // InternalSequence.g:4798:1: ( ( rule__CreateMessage__SendEventAssignment_8 ) )
            {
            // InternalSequence.g:4798:1: ( ( rule__CreateMessage__SendEventAssignment_8 ) )
            // InternalSequence.g:4799:2: ( rule__CreateMessage__SendEventAssignment_8 )
            {
             before(grammarAccess.getCreateMessageAccess().getSendEventAssignment_8()); 
            // InternalSequence.g:4800:2: ( rule__CreateMessage__SendEventAssignment_8 )
            // InternalSequence.g:4800:3: rule__CreateMessage__SendEventAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__SendEventAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getSendEventAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__8__Impl"


    // $ANTLR start "rule__CreateMessage__Group__9"
    // InternalSequence.g:4808:1: rule__CreateMessage__Group__9 : rule__CreateMessage__Group__9__Impl ;
    public final void rule__CreateMessage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4812:1: ( rule__CreateMessage__Group__9__Impl )
            // InternalSequence.g:4813:2: rule__CreateMessage__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__9"


    // $ANTLR start "rule__CreateMessage__Group__9__Impl"
    // InternalSequence.g:4819:1: rule__CreateMessage__Group__9__Impl : ( ( rule__CreateMessage__Alternatives_9 ) ) ;
    public final void rule__CreateMessage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4823:1: ( ( ( rule__CreateMessage__Alternatives_9 ) ) )
            // InternalSequence.g:4824:1: ( ( rule__CreateMessage__Alternatives_9 ) )
            {
            // InternalSequence.g:4824:1: ( ( rule__CreateMessage__Alternatives_9 ) )
            // InternalSequence.g:4825:2: ( rule__CreateMessage__Alternatives_9 )
            {
             before(grammarAccess.getCreateMessageAccess().getAlternatives_9()); 
            // InternalSequence.g:4826:2: ( rule__CreateMessage__Alternatives_9 )
            // InternalSequence.g:4826:3: rule__CreateMessage__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group__9__Impl"


    // $ANTLR start "rule__CreateMessage__Group_7__0"
    // InternalSequence.g:4835:1: rule__CreateMessage__Group_7__0 : rule__CreateMessage__Group_7__0__Impl rule__CreateMessage__Group_7__1 ;
    public final void rule__CreateMessage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4839:1: ( rule__CreateMessage__Group_7__0__Impl rule__CreateMessage__Group_7__1 )
            // InternalSequence.g:4840:2: rule__CreateMessage__Group_7__0__Impl rule__CreateMessage__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__CreateMessage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group_7__0"


    // $ANTLR start "rule__CreateMessage__Group_7__0__Impl"
    // InternalSequence.g:4847:1: rule__CreateMessage__Group_7__0__Impl : ( 'as' ) ;
    public final void rule__CreateMessage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4851:1: ( ( 'as' ) )
            // InternalSequence.g:4852:1: ( 'as' )
            {
            // InternalSequence.g:4852:1: ( 'as' )
            // InternalSequence.g:4853:2: 'as'
            {
             before(grammarAccess.getCreateMessageAccess().getAsKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getAsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group_7__0__Impl"


    // $ANTLR start "rule__CreateMessage__Group_7__1"
    // InternalSequence.g:4862:1: rule__CreateMessage__Group_7__1 : rule__CreateMessage__Group_7__1__Impl ;
    public final void rule__CreateMessage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4866:1: ( rule__CreateMessage__Group_7__1__Impl )
            // InternalSequence.g:4867:2: rule__CreateMessage__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group_7__1"


    // $ANTLR start "rule__CreateMessage__Group_7__1__Impl"
    // InternalSequence.g:4873:1: rule__CreateMessage__Group_7__1__Impl : ( ( rule__CreateMessage__AliasAssignment_7_1 ) ) ;
    public final void rule__CreateMessage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4877:1: ( ( ( rule__CreateMessage__AliasAssignment_7_1 ) ) )
            // InternalSequence.g:4878:1: ( ( rule__CreateMessage__AliasAssignment_7_1 ) )
            {
            // InternalSequence.g:4878:1: ( ( rule__CreateMessage__AliasAssignment_7_1 ) )
            // InternalSequence.g:4879:2: ( rule__CreateMessage__AliasAssignment_7_1 )
            {
             before(grammarAccess.getCreateMessageAccess().getAliasAssignment_7_1()); 
            // InternalSequence.g:4880:2: ( rule__CreateMessage__AliasAssignment_7_1 )
            // InternalSequence.g:4880:3: rule__CreateMessage__AliasAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CreateMessage__AliasAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateMessageAccess().getAliasAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__Group_7__1__Impl"


    // $ANTLR start "rule__DestructionMessage__Group__0"
    // InternalSequence.g:4889:1: rule__DestructionMessage__Group__0 : rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 ;
    public final void rule__DestructionMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4893:1: ( rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1 )
            // InternalSequence.g:4894:2: rule__DestructionMessage__Group__0__Impl rule__DestructionMessage__Group__1
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
    // InternalSequence.g:4901:1: rule__DestructionMessage__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4905:1: ( ( 'dest' ) )
            // InternalSequence.g:4906:1: ( 'dest' )
            {
            // InternalSequence.g:4906:1: ( 'dest' )
            // InternalSequence.g:4907:2: 'dest'
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
    // InternalSequence.g:4916:1: rule__DestructionMessage__Group__1 : rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 ;
    public final void rule__DestructionMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4920:1: ( rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2 )
            // InternalSequence.g:4921:2: rule__DestructionMessage__Group__1__Impl rule__DestructionMessage__Group__2
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
    // InternalSequence.g:4928:1: rule__DestructionMessage__Group__1__Impl : ( ( rule__DestructionMessage__NameAssignment_1 )? ) ;
    public final void rule__DestructionMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4932:1: ( ( ( rule__DestructionMessage__NameAssignment_1 )? ) )
            // InternalSequence.g:4933:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            {
            // InternalSequence.g:4933:1: ( ( rule__DestructionMessage__NameAssignment_1 )? )
            // InternalSequence.g:4934:2: ( rule__DestructionMessage__NameAssignment_1 )?
            {
             before(grammarAccess.getDestructionMessageAccess().getNameAssignment_1()); 
            // InternalSequence.g:4935:2: ( rule__DestructionMessage__NameAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSequence.g:4935:3: rule__DestructionMessage__NameAssignment_1
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
    // InternalSequence.g:4943:1: rule__DestructionMessage__Group__2 : rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 ;
    public final void rule__DestructionMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4947:1: ( rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3 )
            // InternalSequence.g:4948:2: rule__DestructionMessage__Group__2__Impl rule__DestructionMessage__Group__3
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
    // InternalSequence.g:4955:1: rule__DestructionMessage__Group__2__Impl : ( '(' ) ;
    public final void rule__DestructionMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4959:1: ( ( '(' ) )
            // InternalSequence.g:4960:1: ( '(' )
            {
            // InternalSequence.g:4960:1: ( '(' )
            // InternalSequence.g:4961:2: '('
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
    // InternalSequence.g:4970:1: rule__DestructionMessage__Group__3 : rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 ;
    public final void rule__DestructionMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4974:1: ( rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4 )
            // InternalSequence.g:4975:2: rule__DestructionMessage__Group__3__Impl rule__DestructionMessage__Group__4
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
    // InternalSequence.g:4982:1: rule__DestructionMessage__Group__3__Impl : ( ( rule__DestructionMessage__LeftAssignment_3 ) ) ;
    public final void rule__DestructionMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:4986:1: ( ( ( rule__DestructionMessage__LeftAssignment_3 ) ) )
            // InternalSequence.g:4987:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            {
            // InternalSequence.g:4987:1: ( ( rule__DestructionMessage__LeftAssignment_3 ) )
            // InternalSequence.g:4988:2: ( rule__DestructionMessage__LeftAssignment_3 )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftAssignment_3()); 
            // InternalSequence.g:4989:2: ( rule__DestructionMessage__LeftAssignment_3 )
            // InternalSequence.g:4989:3: rule__DestructionMessage__LeftAssignment_3
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
    // InternalSequence.g:4997:1: rule__DestructionMessage__Group__4 : rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 ;
    public final void rule__DestructionMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5001:1: ( rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5 )
            // InternalSequence.g:5002:2: rule__DestructionMessage__Group__4__Impl rule__DestructionMessage__Group__5
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
    // InternalSequence.g:5009:1: rule__DestructionMessage__Group__4__Impl : ( ',' ) ;
    public final void rule__DestructionMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5013:1: ( ( ',' ) )
            // InternalSequence.g:5014:1: ( ',' )
            {
            // InternalSequence.g:5014:1: ( ',' )
            // InternalSequence.g:5015:2: ','
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
    // InternalSequence.g:5024:1: rule__DestructionMessage__Group__5 : rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 ;
    public final void rule__DestructionMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5028:1: ( rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6 )
            // InternalSequence.g:5029:2: rule__DestructionMessage__Group__5__Impl rule__DestructionMessage__Group__6
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
    // InternalSequence.g:5036:1: rule__DestructionMessage__Group__5__Impl : ( ( rule__DestructionMessage__RightAssignment_5 ) ) ;
    public final void rule__DestructionMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5040:1: ( ( ( rule__DestructionMessage__RightAssignment_5 ) ) )
            // InternalSequence.g:5041:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            {
            // InternalSequence.g:5041:1: ( ( rule__DestructionMessage__RightAssignment_5 ) )
            // InternalSequence.g:5042:2: ( rule__DestructionMessage__RightAssignment_5 )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightAssignment_5()); 
            // InternalSequence.g:5043:2: ( rule__DestructionMessage__RightAssignment_5 )
            // InternalSequence.g:5043:3: rule__DestructionMessage__RightAssignment_5
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
    // InternalSequence.g:5051:1: rule__DestructionMessage__Group__6 : rule__DestructionMessage__Group__6__Impl rule__DestructionMessage__Group__7 ;
    public final void rule__DestructionMessage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5055:1: ( rule__DestructionMessage__Group__6__Impl rule__DestructionMessage__Group__7 )
            // InternalSequence.g:5056:2: rule__DestructionMessage__Group__6__Impl rule__DestructionMessage__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__DestructionMessage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__7();

            state._fsp--;


            }

        }
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
    // InternalSequence.g:5063:1: rule__DestructionMessage__Group__6__Impl : ( ')' ) ;
    public final void rule__DestructionMessage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5067:1: ( ( ')' ) )
            // InternalSequence.g:5068:1: ( ')' )
            {
            // InternalSequence.g:5068:1: ( ')' )
            // InternalSequence.g:5069:2: ')'
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


    // $ANTLR start "rule__DestructionMessage__Group__7"
    // InternalSequence.g:5078:1: rule__DestructionMessage__Group__7 : rule__DestructionMessage__Group__7__Impl rule__DestructionMessage__Group__8 ;
    public final void rule__DestructionMessage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5082:1: ( rule__DestructionMessage__Group__7__Impl rule__DestructionMessage__Group__8 )
            // InternalSequence.g:5083:2: rule__DestructionMessage__Group__7__Impl rule__DestructionMessage__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__DestructionMessage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__7"


    // $ANTLR start "rule__DestructionMessage__Group__7__Impl"
    // InternalSequence.g:5090:1: rule__DestructionMessage__Group__7__Impl : ( ( rule__DestructionMessage__Group_7__0 )? ) ;
    public final void rule__DestructionMessage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5094:1: ( ( ( rule__DestructionMessage__Group_7__0 )? ) )
            // InternalSequence.g:5095:1: ( ( rule__DestructionMessage__Group_7__0 )? )
            {
            // InternalSequence.g:5095:1: ( ( rule__DestructionMessage__Group_7__0 )? )
            // InternalSequence.g:5096:2: ( rule__DestructionMessage__Group_7__0 )?
            {
             before(grammarAccess.getDestructionMessageAccess().getGroup_7()); 
            // InternalSequence.g:5097:2: ( rule__DestructionMessage__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSequence.g:5097:3: rule__DestructionMessage__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DestructionMessage__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDestructionMessageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__7__Impl"


    // $ANTLR start "rule__DestructionMessage__Group__8"
    // InternalSequence.g:5105:1: rule__DestructionMessage__Group__8 : rule__DestructionMessage__Group__8__Impl rule__DestructionMessage__Group__9 ;
    public final void rule__DestructionMessage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5109:1: ( rule__DestructionMessage__Group__8__Impl rule__DestructionMessage__Group__9 )
            // InternalSequence.g:5110:2: rule__DestructionMessage__Group__8__Impl rule__DestructionMessage__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__DestructionMessage__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__8"


    // $ANTLR start "rule__DestructionMessage__Group__8__Impl"
    // InternalSequence.g:5117:1: rule__DestructionMessage__Group__8__Impl : ( ( rule__DestructionMessage__SendEventAssignment_8 ) ) ;
    public final void rule__DestructionMessage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5121:1: ( ( ( rule__DestructionMessage__SendEventAssignment_8 ) ) )
            // InternalSequence.g:5122:1: ( ( rule__DestructionMessage__SendEventAssignment_8 ) )
            {
            // InternalSequence.g:5122:1: ( ( rule__DestructionMessage__SendEventAssignment_8 ) )
            // InternalSequence.g:5123:2: ( rule__DestructionMessage__SendEventAssignment_8 )
            {
             before(grammarAccess.getDestructionMessageAccess().getSendEventAssignment_8()); 
            // InternalSequence.g:5124:2: ( rule__DestructionMessage__SendEventAssignment_8 )
            // InternalSequence.g:5124:3: rule__DestructionMessage__SendEventAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__DestructionMessage__SendEventAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDestructionMessageAccess().getSendEventAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__8__Impl"


    // $ANTLR start "rule__DestructionMessage__Group__9"
    // InternalSequence.g:5132:1: rule__DestructionMessage__Group__9 : rule__DestructionMessage__Group__9__Impl ;
    public final void rule__DestructionMessage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5136:1: ( rule__DestructionMessage__Group__9__Impl )
            // InternalSequence.g:5137:2: rule__DestructionMessage__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__9"


    // $ANTLR start "rule__DestructionMessage__Group__9__Impl"
    // InternalSequence.g:5143:1: rule__DestructionMessage__Group__9__Impl : ( ( rule__DestructionMessage__Alternatives_9 ) ) ;
    public final void rule__DestructionMessage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5147:1: ( ( ( rule__DestructionMessage__Alternatives_9 ) ) )
            // InternalSequence.g:5148:1: ( ( rule__DestructionMessage__Alternatives_9 ) )
            {
            // InternalSequence.g:5148:1: ( ( rule__DestructionMessage__Alternatives_9 ) )
            // InternalSequence.g:5149:2: ( rule__DestructionMessage__Alternatives_9 )
            {
             before(grammarAccess.getDestructionMessageAccess().getAlternatives_9()); 
            // InternalSequence.g:5150:2: ( rule__DestructionMessage__Alternatives_9 )
            // InternalSequence.g:5150:3: rule__DestructionMessage__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getDestructionMessageAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group__9__Impl"


    // $ANTLR start "rule__DestructionMessage__Group_7__0"
    // InternalSequence.g:5159:1: rule__DestructionMessage__Group_7__0 : rule__DestructionMessage__Group_7__0__Impl rule__DestructionMessage__Group_7__1 ;
    public final void rule__DestructionMessage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5163:1: ( rule__DestructionMessage__Group_7__0__Impl rule__DestructionMessage__Group_7__1 )
            // InternalSequence.g:5164:2: rule__DestructionMessage__Group_7__0__Impl rule__DestructionMessage__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__DestructionMessage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group_7__0"


    // $ANTLR start "rule__DestructionMessage__Group_7__0__Impl"
    // InternalSequence.g:5171:1: rule__DestructionMessage__Group_7__0__Impl : ( 'as' ) ;
    public final void rule__DestructionMessage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5175:1: ( ( 'as' ) )
            // InternalSequence.g:5176:1: ( 'as' )
            {
            // InternalSequence.g:5176:1: ( 'as' )
            // InternalSequence.g:5177:2: 'as'
            {
             before(grammarAccess.getDestructionMessageAccess().getAsKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDestructionMessageAccess().getAsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group_7__0__Impl"


    // $ANTLR start "rule__DestructionMessage__Group_7__1"
    // InternalSequence.g:5186:1: rule__DestructionMessage__Group_7__1 : rule__DestructionMessage__Group_7__1__Impl ;
    public final void rule__DestructionMessage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5190:1: ( rule__DestructionMessage__Group_7__1__Impl )
            // InternalSequence.g:5191:2: rule__DestructionMessage__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestructionMessage__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group_7__1"


    // $ANTLR start "rule__DestructionMessage__Group_7__1__Impl"
    // InternalSequence.g:5197:1: rule__DestructionMessage__Group_7__1__Impl : ( ( rule__DestructionMessage__AliasAssignment_7_1 ) ) ;
    public final void rule__DestructionMessage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5201:1: ( ( ( rule__DestructionMessage__AliasAssignment_7_1 ) ) )
            // InternalSequence.g:5202:1: ( ( rule__DestructionMessage__AliasAssignment_7_1 ) )
            {
            // InternalSequence.g:5202:1: ( ( rule__DestructionMessage__AliasAssignment_7_1 ) )
            // InternalSequence.g:5203:2: ( rule__DestructionMessage__AliasAssignment_7_1 )
            {
             before(grammarAccess.getDestructionMessageAccess().getAliasAssignment_7_1()); 
            // InternalSequence.g:5204:2: ( rule__DestructionMessage__AliasAssignment_7_1 )
            // InternalSequence.g:5204:3: rule__DestructionMessage__AliasAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DestructionMessage__AliasAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDestructionMessageAccess().getAliasAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__Group_7__1__Impl"


    // $ANTLR start "rule__DestructionOccurenceSpecification__Group__0"
    // InternalSequence.g:5213:1: rule__DestructionOccurenceSpecification__Group__0 : rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 ;
    public final void rule__DestructionOccurenceSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5217:1: ( rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1 )
            // InternalSequence.g:5218:2: rule__DestructionOccurenceSpecification__Group__0__Impl rule__DestructionOccurenceSpecification__Group__1
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
    // InternalSequence.g:5225:1: rule__DestructionOccurenceSpecification__Group__0__Impl : ( 'dest' ) ;
    public final void rule__DestructionOccurenceSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5229:1: ( ( 'dest' ) )
            // InternalSequence.g:5230:1: ( 'dest' )
            {
            // InternalSequence.g:5230:1: ( 'dest' )
            // InternalSequence.g:5231:2: 'dest'
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
    // InternalSequence.g:5240:1: rule__DestructionOccurenceSpecification__Group__1 : rule__DestructionOccurenceSpecification__Group__1__Impl ;
    public final void rule__DestructionOccurenceSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5244:1: ( rule__DestructionOccurenceSpecification__Group__1__Impl )
            // InternalSequence.g:5245:2: rule__DestructionOccurenceSpecification__Group__1__Impl
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
    // InternalSequence.g:5251:1: rule__DestructionOccurenceSpecification__Group__1__Impl : ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) ) ;
    public final void rule__DestructionOccurenceSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5255:1: ( ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) ) )
            // InternalSequence.g:5256:1: ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) )
            {
            // InternalSequence.g:5256:1: ( ( rule__DestructionOccurenceSpecification__TargetAssignment_1 ) )
            // InternalSequence.g:5257:2: ( rule__DestructionOccurenceSpecification__TargetAssignment_1 )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetAssignment_1()); 
            // InternalSequence.g:5258:2: ( rule__DestructionOccurenceSpecification__TargetAssignment_1 )
            // InternalSequence.g:5258:3: rule__DestructionOccurenceSpecification__TargetAssignment_1
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
    // InternalSequence.g:5267:1: rule__Parallel__Group__0 : rule__Parallel__Group__0__Impl rule__Parallel__Group__1 ;
    public final void rule__Parallel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5271:1: ( rule__Parallel__Group__0__Impl rule__Parallel__Group__1 )
            // InternalSequence.g:5272:2: rule__Parallel__Group__0__Impl rule__Parallel__Group__1
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
    // InternalSequence.g:5279:1: rule__Parallel__Group__0__Impl : ( 'par' ) ;
    public final void rule__Parallel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5283:1: ( ( 'par' ) )
            // InternalSequence.g:5284:1: ( 'par' )
            {
            // InternalSequence.g:5284:1: ( 'par' )
            // InternalSequence.g:5285:2: 'par'
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
    // InternalSequence.g:5294:1: rule__Parallel__Group__1 : rule__Parallel__Group__1__Impl rule__Parallel__Group__2 ;
    public final void rule__Parallel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5298:1: ( rule__Parallel__Group__1__Impl rule__Parallel__Group__2 )
            // InternalSequence.g:5299:2: rule__Parallel__Group__1__Impl rule__Parallel__Group__2
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
    // InternalSequence.g:5306:1: rule__Parallel__Group__1__Impl : ( '{' ) ;
    public final void rule__Parallel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5310:1: ( ( '{' ) )
            // InternalSequence.g:5311:1: ( '{' )
            {
            // InternalSequence.g:5311:1: ( '{' )
            // InternalSequence.g:5312:2: '{'
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
    // InternalSequence.g:5321:1: rule__Parallel__Group__2 : rule__Parallel__Group__2__Impl rule__Parallel__Group__3 ;
    public final void rule__Parallel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5325:1: ( rule__Parallel__Group__2__Impl rule__Parallel__Group__3 )
            // InternalSequence.g:5326:2: rule__Parallel__Group__2__Impl rule__Parallel__Group__3
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
    // InternalSequence.g:5333:1: rule__Parallel__Group__2__Impl : ( ( ( rule__Parallel__RegionsAssignment_2 ) ) ( ( rule__Parallel__RegionsAssignment_2 )* ) ) ;
    public final void rule__Parallel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5337:1: ( ( ( ( rule__Parallel__RegionsAssignment_2 ) ) ( ( rule__Parallel__RegionsAssignment_2 )* ) ) )
            // InternalSequence.g:5338:1: ( ( ( rule__Parallel__RegionsAssignment_2 ) ) ( ( rule__Parallel__RegionsAssignment_2 )* ) )
            {
            // InternalSequence.g:5338:1: ( ( ( rule__Parallel__RegionsAssignment_2 ) ) ( ( rule__Parallel__RegionsAssignment_2 )* ) )
            // InternalSequence.g:5339:2: ( ( rule__Parallel__RegionsAssignment_2 ) ) ( ( rule__Parallel__RegionsAssignment_2 )* )
            {
            // InternalSequence.g:5339:2: ( ( rule__Parallel__RegionsAssignment_2 ) )
            // InternalSequence.g:5340:3: ( rule__Parallel__RegionsAssignment_2 )
            {
             before(grammarAccess.getParallelAccess().getRegionsAssignment_2()); 
            // InternalSequence.g:5341:3: ( rule__Parallel__RegionsAssignment_2 )
            // InternalSequence.g:5341:4: rule__Parallel__RegionsAssignment_2
            {
            pushFollow(FOLLOW_34);
            rule__Parallel__RegionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParallelAccess().getRegionsAssignment_2()); 

            }

            // InternalSequence.g:5344:2: ( ( rule__Parallel__RegionsAssignment_2 )* )
            // InternalSequence.g:5345:3: ( rule__Parallel__RegionsAssignment_2 )*
            {
             before(grammarAccess.getParallelAccess().getRegionsAssignment_2()); 
            // InternalSequence.g:5346:3: ( rule__Parallel__RegionsAssignment_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=12 && LA43_0<=13)||LA43_0==24||LA43_0==28||(LA43_0>=32 && LA43_0<=42)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSequence.g:5346:4: rule__Parallel__RegionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Parallel__RegionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalSequence.g:5355:1: rule__Parallel__Group__3 : rule__Parallel__Group__3__Impl ;
    public final void rule__Parallel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5359:1: ( rule__Parallel__Group__3__Impl )
            // InternalSequence.g:5360:2: rule__Parallel__Group__3__Impl
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
    // InternalSequence.g:5366:1: rule__Parallel__Group__3__Impl : ( '}' ) ;
    public final void rule__Parallel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5370:1: ( ( '}' ) )
            // InternalSequence.g:5371:1: ( '}' )
            {
            // InternalSequence.g:5371:1: ( '}' )
            // InternalSequence.g:5372:2: '}'
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
    // InternalSequence.g:5382:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5386:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // InternalSequence.g:5387:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
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
    // InternalSequence.g:5394:1: rule__Alternative__Group__0__Impl : ( 'alt' ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5398:1: ( ( 'alt' ) )
            // InternalSequence.g:5399:1: ( 'alt' )
            {
            // InternalSequence.g:5399:1: ( 'alt' )
            // InternalSequence.g:5400:2: 'alt'
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
    // InternalSequence.g:5409:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5413:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // InternalSequence.g:5414:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:5421:1: rule__Alternative__Group__1__Impl : ( '{' ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5425:1: ( ( '{' ) )
            // InternalSequence.g:5426:1: ( '{' )
            {
            // InternalSequence.g:5426:1: ( '{' )
            // InternalSequence.g:5427:2: '{'
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
    // InternalSequence.g:5436:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5440:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // InternalSequence.g:5441:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
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
    // InternalSequence.g:5448:1: rule__Alternative__Group__2__Impl : ( ( ( rule__Alternative__RegionsAssignment_2 ) ) ( ( rule__Alternative__RegionsAssignment_2 )* ) ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5452:1: ( ( ( ( rule__Alternative__RegionsAssignment_2 ) ) ( ( rule__Alternative__RegionsAssignment_2 )* ) ) )
            // InternalSequence.g:5453:1: ( ( ( rule__Alternative__RegionsAssignment_2 ) ) ( ( rule__Alternative__RegionsAssignment_2 )* ) )
            {
            // InternalSequence.g:5453:1: ( ( ( rule__Alternative__RegionsAssignment_2 ) ) ( ( rule__Alternative__RegionsAssignment_2 )* ) )
            // InternalSequence.g:5454:2: ( ( rule__Alternative__RegionsAssignment_2 ) ) ( ( rule__Alternative__RegionsAssignment_2 )* )
            {
            // InternalSequence.g:5454:2: ( ( rule__Alternative__RegionsAssignment_2 ) )
            // InternalSequence.g:5455:3: ( rule__Alternative__RegionsAssignment_2 )
            {
             before(grammarAccess.getAlternativeAccess().getRegionsAssignment_2()); 
            // InternalSequence.g:5456:3: ( rule__Alternative__RegionsAssignment_2 )
            // InternalSequence.g:5456:4: rule__Alternative__RegionsAssignment_2
            {
            pushFollow(FOLLOW_35);
            rule__Alternative__RegionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getRegionsAssignment_2()); 

            }

            // InternalSequence.g:5459:2: ( ( rule__Alternative__RegionsAssignment_2 )* )
            // InternalSequence.g:5460:3: ( rule__Alternative__RegionsAssignment_2 )*
            {
             before(grammarAccess.getAlternativeAccess().getRegionsAssignment_2()); 
            // InternalSequence.g:5461:3: ( rule__Alternative__RegionsAssignment_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==26) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSequence.g:5461:4: rule__Alternative__RegionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Alternative__RegionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalSequence.g:5470:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5474:1: ( rule__Alternative__Group__3__Impl )
            // InternalSequence.g:5475:2: rule__Alternative__Group__3__Impl
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
    // InternalSequence.g:5481:1: rule__Alternative__Group__3__Impl : ( '}' ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5485:1: ( ( '}' ) )
            // InternalSequence.g:5486:1: ( '}' )
            {
            // InternalSequence.g:5486:1: ( '}' )
            // InternalSequence.g:5487:2: '}'
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
    // InternalSequence.g:5497:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5501:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalSequence.g:5502:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:5509:1: rule__Loop__Group__0__Impl : ( 'loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5513:1: ( ( 'loop' ) )
            // InternalSequence.g:5514:1: ( 'loop' )
            {
            // InternalSequence.g:5514:1: ( 'loop' )
            // InternalSequence.g:5515:2: 'loop'
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
    // InternalSequence.g:5524:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5528:1: ( rule__Loop__Group__1__Impl )
            // InternalSequence.g:5529:2: rule__Loop__Group__1__Impl
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
    // InternalSequence.g:5535:1: rule__Loop__Group__1__Impl : ( ( rule__Loop__RegionAssignment_1 ) ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5539:1: ( ( ( rule__Loop__RegionAssignment_1 ) ) )
            // InternalSequence.g:5540:1: ( ( rule__Loop__RegionAssignment_1 ) )
            {
            // InternalSequence.g:5540:1: ( ( rule__Loop__RegionAssignment_1 ) )
            // InternalSequence.g:5541:2: ( rule__Loop__RegionAssignment_1 )
            {
             before(grammarAccess.getLoopAccess().getRegionAssignment_1()); 
            // InternalSequence.g:5542:2: ( rule__Loop__RegionAssignment_1 )
            // InternalSequence.g:5542:3: rule__Loop__RegionAssignment_1
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
    // InternalSequence.g:5551:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5555:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalSequence.g:5556:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:5563:1: rule__Option__Group__0__Impl : ( 'opt' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5567:1: ( ( 'opt' ) )
            // InternalSequence.g:5568:1: ( 'opt' )
            {
            // InternalSequence.g:5568:1: ( 'opt' )
            // InternalSequence.g:5569:2: 'opt'
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
    // InternalSequence.g:5578:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5582:1: ( rule__Option__Group__1__Impl )
            // InternalSequence.g:5583:2: rule__Option__Group__1__Impl
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
    // InternalSequence.g:5589:1: rule__Option__Group__1__Impl : ( ( rule__Option__RegionAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5593:1: ( ( ( rule__Option__RegionAssignment_1 ) ) )
            // InternalSequence.g:5594:1: ( ( rule__Option__RegionAssignment_1 ) )
            {
            // InternalSequence.g:5594:1: ( ( rule__Option__RegionAssignment_1 ) )
            // InternalSequence.g:5595:2: ( rule__Option__RegionAssignment_1 )
            {
             before(grammarAccess.getOptionAccess().getRegionAssignment_1()); 
            // InternalSequence.g:5596:2: ( rule__Option__RegionAssignment_1 )
            // InternalSequence.g:5596:3: rule__Option__RegionAssignment_1
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
    // InternalSequence.g:5605:1: rule__Critical__Group__0 : rule__Critical__Group__0__Impl rule__Critical__Group__1 ;
    public final void rule__Critical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5609:1: ( rule__Critical__Group__0__Impl rule__Critical__Group__1 )
            // InternalSequence.g:5610:2: rule__Critical__Group__0__Impl rule__Critical__Group__1
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
    // InternalSequence.g:5617:1: rule__Critical__Group__0__Impl : ( 'critical' ) ;
    public final void rule__Critical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5621:1: ( ( 'critical' ) )
            // InternalSequence.g:5622:1: ( 'critical' )
            {
            // InternalSequence.g:5622:1: ( 'critical' )
            // InternalSequence.g:5623:2: 'critical'
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
    // InternalSequence.g:5632:1: rule__Critical__Group__1 : rule__Critical__Group__1__Impl rule__Critical__Group__2 ;
    public final void rule__Critical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5636:1: ( rule__Critical__Group__1__Impl rule__Critical__Group__2 )
            // InternalSequence.g:5637:2: rule__Critical__Group__1__Impl rule__Critical__Group__2
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
    // InternalSequence.g:5644:1: rule__Critical__Group__1__Impl : ( '{' ) ;
    public final void rule__Critical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5648:1: ( ( '{' ) )
            // InternalSequence.g:5649:1: ( '{' )
            {
            // InternalSequence.g:5649:1: ( '{' )
            // InternalSequence.g:5650:2: '{'
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
    // InternalSequence.g:5659:1: rule__Critical__Group__2 : rule__Critical__Group__2__Impl rule__Critical__Group__3 ;
    public final void rule__Critical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5663:1: ( rule__Critical__Group__2__Impl rule__Critical__Group__3 )
            // InternalSequence.g:5664:2: rule__Critical__Group__2__Impl rule__Critical__Group__3
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
    // InternalSequence.g:5671:1: rule__Critical__Group__2__Impl : ( ( rule__Critical__RegionAssignment_2 ) ) ;
    public final void rule__Critical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5675:1: ( ( ( rule__Critical__RegionAssignment_2 ) ) )
            // InternalSequence.g:5676:1: ( ( rule__Critical__RegionAssignment_2 ) )
            {
            // InternalSequence.g:5676:1: ( ( rule__Critical__RegionAssignment_2 ) )
            // InternalSequence.g:5677:2: ( rule__Critical__RegionAssignment_2 )
            {
             before(grammarAccess.getCriticalAccess().getRegionAssignment_2()); 
            // InternalSequence.g:5678:2: ( rule__Critical__RegionAssignment_2 )
            // InternalSequence.g:5678:3: rule__Critical__RegionAssignment_2
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
    // InternalSequence.g:5686:1: rule__Critical__Group__3 : rule__Critical__Group__3__Impl ;
    public final void rule__Critical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5690:1: ( rule__Critical__Group__3__Impl )
            // InternalSequence.g:5691:2: rule__Critical__Group__3__Impl
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
    // InternalSequence.g:5697:1: rule__Critical__Group__3__Impl : ( '}' ) ;
    public final void rule__Critical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5701:1: ( ( '}' ) )
            // InternalSequence.g:5702:1: ( '}' )
            {
            // InternalSequence.g:5702:1: ( '}' )
            // InternalSequence.g:5703:2: '}'
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
    // InternalSequence.g:5713:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5717:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalSequence.g:5718:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
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
    // InternalSequence.g:5725:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5729:1: ( ( 'ref' ) )
            // InternalSequence.g:5730:1: ( 'ref' )
            {
            // InternalSequence.g:5730:1: ( 'ref' )
            // InternalSequence.g:5731:2: 'ref'
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
    // InternalSequence.g:5740:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5744:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalSequence.g:5745:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
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
    // InternalSequence.g:5752:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ReferenceAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5756:1: ( ( ( rule__Reference__ReferenceAssignment_1 ) ) )
            // InternalSequence.g:5757:1: ( ( rule__Reference__ReferenceAssignment_1 ) )
            {
            // InternalSequence.g:5757:1: ( ( rule__Reference__ReferenceAssignment_1 ) )
            // InternalSequence.g:5758:2: ( rule__Reference__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getReferenceAssignment_1()); 
            // InternalSequence.g:5759:2: ( rule__Reference__ReferenceAssignment_1 )
            // InternalSequence.g:5759:3: rule__Reference__ReferenceAssignment_1
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
    // InternalSequence.g:5767:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5771:1: ( rule__Reference__Group__2__Impl )
            // InternalSequence.g:5772:2: rule__Reference__Group__2__Impl
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
    // InternalSequence.g:5778:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__Group_2__0 )? ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5782:1: ( ( ( rule__Reference__Group_2__0 )? ) )
            // InternalSequence.g:5783:1: ( ( rule__Reference__Group_2__0 )? )
            {
            // InternalSequence.g:5783:1: ( ( rule__Reference__Group_2__0 )? )
            // InternalSequence.g:5784:2: ( rule__Reference__Group_2__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_2()); 
            // InternalSequence.g:5785:2: ( rule__Reference__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSequence.g:5785:3: rule__Reference__Group_2__0
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
    // InternalSequence.g:5794:1: rule__Reference__Group_2__0 : rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1 ;
    public final void rule__Reference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5798:1: ( rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1 )
            // InternalSequence.g:5799:2: rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1
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
    // InternalSequence.g:5806:1: rule__Reference__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__Reference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5810:1: ( ( 'as' ) )
            // InternalSequence.g:5811:1: ( 'as' )
            {
            // InternalSequence.g:5811:1: ( 'as' )
            // InternalSequence.g:5812:2: 'as'
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
    // InternalSequence.g:5821:1: rule__Reference__Group_2__1 : rule__Reference__Group_2__1__Impl ;
    public final void rule__Reference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5825:1: ( rule__Reference__Group_2__1__Impl )
            // InternalSequence.g:5826:2: rule__Reference__Group_2__1__Impl
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
    // InternalSequence.g:5832:1: rule__Reference__Group_2__1__Impl : ( ( rule__Reference__AliasAssignment_2_1 ) ) ;
    public final void rule__Reference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5836:1: ( ( ( rule__Reference__AliasAssignment_2_1 ) ) )
            // InternalSequence.g:5837:1: ( ( rule__Reference__AliasAssignment_2_1 ) )
            {
            // InternalSequence.g:5837:1: ( ( rule__Reference__AliasAssignment_2_1 ) )
            // InternalSequence.g:5838:2: ( rule__Reference__AliasAssignment_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getAliasAssignment_2_1()); 
            // InternalSequence.g:5839:2: ( rule__Reference__AliasAssignment_2_1 )
            // InternalSequence.g:5839:3: rule__Reference__AliasAssignment_2_1
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
    // InternalSequence.g:5848:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5852:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalSequence.g:5853:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:5860:1: rule__Constraint__Group__0__Impl : ( 'cstr' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5864:1: ( ( 'cstr' ) )
            // InternalSequence.g:5865:1: ( 'cstr' )
            {
            // InternalSequence.g:5865:1: ( 'cstr' )
            // InternalSequence.g:5866:2: 'cstr'
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
    // InternalSequence.g:5875:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5879:1: ( rule__Constraint__Group__1__Impl )
            // InternalSequence.g:5880:2: rule__Constraint__Group__1__Impl
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
    // InternalSequence.g:5886:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__Alternatives_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5890:1: ( ( ( rule__Constraint__Alternatives_1 ) ) )
            // InternalSequence.g:5891:1: ( ( rule__Constraint__Alternatives_1 ) )
            {
            // InternalSequence.g:5891:1: ( ( rule__Constraint__Alternatives_1 ) )
            // InternalSequence.g:5892:2: ( rule__Constraint__Alternatives_1 )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives_1()); 
            // InternalSequence.g:5893:2: ( rule__Constraint__Alternatives_1 )
            // InternalSequence.g:5893:3: rule__Constraint__Alternatives_1
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
    // InternalSequence.g:5902:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5906:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // InternalSequence.g:5907:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
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
    // InternalSequence.g:5914:1: rule__TimeConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5918:1: ( ( '(' ) )
            // InternalSequence.g:5919:1: ( '(' )
            {
            // InternalSequence.g:5919:1: ( '(' )
            // InternalSequence.g:5920:2: '('
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
    // InternalSequence.g:5929:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5933:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // InternalSequence.g:5934:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:5941:1: rule__TimeConstraint__Group__1__Impl : ( ( rule__TimeConstraint__EventAssignment_1 ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5945:1: ( ( ( rule__TimeConstraint__EventAssignment_1 ) ) )
            // InternalSequence.g:5946:1: ( ( rule__TimeConstraint__EventAssignment_1 ) )
            {
            // InternalSequence.g:5946:1: ( ( rule__TimeConstraint__EventAssignment_1 ) )
            // InternalSequence.g:5947:2: ( rule__TimeConstraint__EventAssignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getEventAssignment_1()); 
            // InternalSequence.g:5948:2: ( rule__TimeConstraint__EventAssignment_1 )
            // InternalSequence.g:5948:3: rule__TimeConstraint__EventAssignment_1
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
    // InternalSequence.g:5956:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3 ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5960:1: ( rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3 )
            // InternalSequence.g:5961:2: rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3
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
    // InternalSequence.g:5968:1: rule__TimeConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5972:1: ( ( ')' ) )
            // InternalSequence.g:5973:1: ( ')' )
            {
            // InternalSequence.g:5973:1: ( ')' )
            // InternalSequence.g:5974:2: ')'
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
    // InternalSequence.g:5983:1: rule__TimeConstraint__Group__3 : rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4 ;
    public final void rule__TimeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5987:1: ( rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4 )
            // InternalSequence.g:5988:2: rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:5995:1: rule__TimeConstraint__Group__3__Impl : ( 't' ) ;
    public final void rule__TimeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:5999:1: ( ( 't' ) )
            // InternalSequence.g:6000:1: ( 't' )
            {
            // InternalSequence.g:6000:1: ( 't' )
            // InternalSequence.g:6001:2: 't'
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
    // InternalSequence.g:6010:1: rule__TimeConstraint__Group__4 : rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5 ;
    public final void rule__TimeConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6014:1: ( rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5 )
            // InternalSequence.g:6015:2: rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5
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
    // InternalSequence.g:6022:1: rule__TimeConstraint__Group__4__Impl : ( '[' ) ;
    public final void rule__TimeConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6026:1: ( ( '[' ) )
            // InternalSequence.g:6027:1: ( '[' )
            {
            // InternalSequence.g:6027:1: ( '[' )
            // InternalSequence.g:6028:2: '['
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
    // InternalSequence.g:6037:1: rule__TimeConstraint__Group__5 : rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6 ;
    public final void rule__TimeConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6041:1: ( rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6 )
            // InternalSequence.g:6042:2: rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6
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
    // InternalSequence.g:6049:1: rule__TimeConstraint__Group__5__Impl : ( ( rule__TimeConstraint__TimeAssignment_5 ) ) ;
    public final void rule__TimeConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6053:1: ( ( ( rule__TimeConstraint__TimeAssignment_5 ) ) )
            // InternalSequence.g:6054:1: ( ( rule__TimeConstraint__TimeAssignment_5 ) )
            {
            // InternalSequence.g:6054:1: ( ( rule__TimeConstraint__TimeAssignment_5 ) )
            // InternalSequence.g:6055:2: ( rule__TimeConstraint__TimeAssignment_5 )
            {
             before(grammarAccess.getTimeConstraintAccess().getTimeAssignment_5()); 
            // InternalSequence.g:6056:2: ( rule__TimeConstraint__TimeAssignment_5 )
            // InternalSequence.g:6056:3: rule__TimeConstraint__TimeAssignment_5
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
    // InternalSequence.g:6064:1: rule__TimeConstraint__Group__6 : rule__TimeConstraint__Group__6__Impl ;
    public final void rule__TimeConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6068:1: ( rule__TimeConstraint__Group__6__Impl )
            // InternalSequence.g:6069:2: rule__TimeConstraint__Group__6__Impl
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
    // InternalSequence.g:6075:1: rule__TimeConstraint__Group__6__Impl : ( ']' ) ;
    public final void rule__TimeConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6079:1: ( ( ']' ) )
            // InternalSequence.g:6080:1: ( ']' )
            {
            // InternalSequence.g:6080:1: ( ']' )
            // InternalSequence.g:6081:2: ']'
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
    // InternalSequence.g:6091:1: rule__DurationConstraint__Group__0 : rule__DurationConstraint__Group__0__Impl rule__DurationConstraint__Group__1 ;
    public final void rule__DurationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6095:1: ( rule__DurationConstraint__Group__0__Impl rule__DurationConstraint__Group__1 )
            // InternalSequence.g:6096:2: rule__DurationConstraint__Group__0__Impl rule__DurationConstraint__Group__1
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
    // InternalSequence.g:6103:1: rule__DurationConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__DurationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6107:1: ( ( '(' ) )
            // InternalSequence.g:6108:1: ( '(' )
            {
            // InternalSequence.g:6108:1: ( '(' )
            // InternalSequence.g:6109:2: '('
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
    // InternalSequence.g:6118:1: rule__DurationConstraint__Group__1 : rule__DurationConstraint__Group__1__Impl rule__DurationConstraint__Group__2 ;
    public final void rule__DurationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6122:1: ( rule__DurationConstraint__Group__1__Impl rule__DurationConstraint__Group__2 )
            // InternalSequence.g:6123:2: rule__DurationConstraint__Group__1__Impl rule__DurationConstraint__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:6130:1: rule__DurationConstraint__Group__1__Impl : ( ( rule__DurationConstraint__IntervalAssignment_1 ) ) ;
    public final void rule__DurationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6134:1: ( ( ( rule__DurationConstraint__IntervalAssignment_1 ) ) )
            // InternalSequence.g:6135:1: ( ( rule__DurationConstraint__IntervalAssignment_1 ) )
            {
            // InternalSequence.g:6135:1: ( ( rule__DurationConstraint__IntervalAssignment_1 ) )
            // InternalSequence.g:6136:2: ( rule__DurationConstraint__IntervalAssignment_1 )
            {
             before(grammarAccess.getDurationConstraintAccess().getIntervalAssignment_1()); 
            // InternalSequence.g:6137:2: ( rule__DurationConstraint__IntervalAssignment_1 )
            // InternalSequence.g:6137:3: rule__DurationConstraint__IntervalAssignment_1
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
    // InternalSequence.g:6145:1: rule__DurationConstraint__Group__2 : rule__DurationConstraint__Group__2__Impl rule__DurationConstraint__Group__3 ;
    public final void rule__DurationConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6149:1: ( rule__DurationConstraint__Group__2__Impl rule__DurationConstraint__Group__3 )
            // InternalSequence.g:6150:2: rule__DurationConstraint__Group__2__Impl rule__DurationConstraint__Group__3
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
    // InternalSequence.g:6157:1: rule__DurationConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__DurationConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6161:1: ( ( ')' ) )
            // InternalSequence.g:6162:1: ( ')' )
            {
            // InternalSequence.g:6162:1: ( ')' )
            // InternalSequence.g:6163:2: ')'
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
    // InternalSequence.g:6172:1: rule__DurationConstraint__Group__3 : rule__DurationConstraint__Group__3__Impl rule__DurationConstraint__Group__4 ;
    public final void rule__DurationConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6176:1: ( rule__DurationConstraint__Group__3__Impl rule__DurationConstraint__Group__4 )
            // InternalSequence.g:6177:2: rule__DurationConstraint__Group__3__Impl rule__DurationConstraint__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:6184:1: rule__DurationConstraint__Group__3__Impl : ( 'd' ) ;
    public final void rule__DurationConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6188:1: ( ( 'd' ) )
            // InternalSequence.g:6189:1: ( 'd' )
            {
            // InternalSequence.g:6189:1: ( 'd' )
            // InternalSequence.g:6190:2: 'd'
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
    // InternalSequence.g:6199:1: rule__DurationConstraint__Group__4 : rule__DurationConstraint__Group__4__Impl rule__DurationConstraint__Group__5 ;
    public final void rule__DurationConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6203:1: ( rule__DurationConstraint__Group__4__Impl rule__DurationConstraint__Group__5 )
            // InternalSequence.g:6204:2: rule__DurationConstraint__Group__4__Impl rule__DurationConstraint__Group__5
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
    // InternalSequence.g:6211:1: rule__DurationConstraint__Group__4__Impl : ( '[' ) ;
    public final void rule__DurationConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6215:1: ( ( '[' ) )
            // InternalSequence.g:6216:1: ( '[' )
            {
            // InternalSequence.g:6216:1: ( '[' )
            // InternalSequence.g:6217:2: '['
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
    // InternalSequence.g:6226:1: rule__DurationConstraint__Group__5 : rule__DurationConstraint__Group__5__Impl rule__DurationConstraint__Group__6 ;
    public final void rule__DurationConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6230:1: ( rule__DurationConstraint__Group__5__Impl rule__DurationConstraint__Group__6 )
            // InternalSequence.g:6231:2: rule__DurationConstraint__Group__5__Impl rule__DurationConstraint__Group__6
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
    // InternalSequence.g:6238:1: rule__DurationConstraint__Group__5__Impl : ( ( rule__DurationConstraint__DurationAssignment_5 ) ) ;
    public final void rule__DurationConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6242:1: ( ( ( rule__DurationConstraint__DurationAssignment_5 ) ) )
            // InternalSequence.g:6243:1: ( ( rule__DurationConstraint__DurationAssignment_5 ) )
            {
            // InternalSequence.g:6243:1: ( ( rule__DurationConstraint__DurationAssignment_5 ) )
            // InternalSequence.g:6244:2: ( rule__DurationConstraint__DurationAssignment_5 )
            {
             before(grammarAccess.getDurationConstraintAccess().getDurationAssignment_5()); 
            // InternalSequence.g:6245:2: ( rule__DurationConstraint__DurationAssignment_5 )
            // InternalSequence.g:6245:3: rule__DurationConstraint__DurationAssignment_5
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
    // InternalSequence.g:6253:1: rule__DurationConstraint__Group__6 : rule__DurationConstraint__Group__6__Impl ;
    public final void rule__DurationConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6257:1: ( rule__DurationConstraint__Group__6__Impl )
            // InternalSequence.g:6258:2: rule__DurationConstraint__Group__6__Impl
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
    // InternalSequence.g:6264:1: rule__DurationConstraint__Group__6__Impl : ( ']' ) ;
    public final void rule__DurationConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6268:1: ( ( ']' ) )
            // InternalSequence.g:6269:1: ( ']' )
            {
            // InternalSequence.g:6269:1: ( ']' )
            // InternalSequence.g:6270:2: ']'
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
    // InternalSequence.g:6280:1: rule__Observation__Group__0 : rule__Observation__Group__0__Impl rule__Observation__Group__1 ;
    public final void rule__Observation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6284:1: ( rule__Observation__Group__0__Impl rule__Observation__Group__1 )
            // InternalSequence.g:6285:2: rule__Observation__Group__0__Impl rule__Observation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSequence.g:6292:1: rule__Observation__Group__0__Impl : ( 'obs' ) ;
    public final void rule__Observation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6296:1: ( ( 'obs' ) )
            // InternalSequence.g:6297:1: ( 'obs' )
            {
            // InternalSequence.g:6297:1: ( 'obs' )
            // InternalSequence.g:6298:2: 'obs'
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
    // InternalSequence.g:6307:1: rule__Observation__Group__1 : rule__Observation__Group__1__Impl ;
    public final void rule__Observation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6311:1: ( rule__Observation__Group__1__Impl )
            // InternalSequence.g:6312:2: rule__Observation__Group__1__Impl
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
    // InternalSequence.g:6318:1: rule__Observation__Group__1__Impl : ( ( rule__Observation__Alternatives_1 ) ) ;
    public final void rule__Observation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6322:1: ( ( ( rule__Observation__Alternatives_1 ) ) )
            // InternalSequence.g:6323:1: ( ( rule__Observation__Alternatives_1 ) )
            {
            // InternalSequence.g:6323:1: ( ( rule__Observation__Alternatives_1 ) )
            // InternalSequence.g:6324:2: ( rule__Observation__Alternatives_1 )
            {
             before(grammarAccess.getObservationAccess().getAlternatives_1()); 
            // InternalSequence.g:6325:2: ( rule__Observation__Alternatives_1 )
            // InternalSequence.g:6325:3: rule__Observation__Alternatives_1
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
    // InternalSequence.g:6334:1: rule__TimeObservation__Group__0 : rule__TimeObservation__Group__0__Impl rule__TimeObservation__Group__1 ;
    public final void rule__TimeObservation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6338:1: ( rule__TimeObservation__Group__0__Impl rule__TimeObservation__Group__1 )
            // InternalSequence.g:6339:2: rule__TimeObservation__Group__0__Impl rule__TimeObservation__Group__1
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
    // InternalSequence.g:6346:1: rule__TimeObservation__Group__0__Impl : ( '(' ) ;
    public final void rule__TimeObservation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6350:1: ( ( '(' ) )
            // InternalSequence.g:6351:1: ( '(' )
            {
            // InternalSequence.g:6351:1: ( '(' )
            // InternalSequence.g:6352:2: '('
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
    // InternalSequence.g:6361:1: rule__TimeObservation__Group__1 : rule__TimeObservation__Group__1__Impl rule__TimeObservation__Group__2 ;
    public final void rule__TimeObservation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6365:1: ( rule__TimeObservation__Group__1__Impl rule__TimeObservation__Group__2 )
            // InternalSequence.g:6366:2: rule__TimeObservation__Group__1__Impl rule__TimeObservation__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:6373:1: rule__TimeObservation__Group__1__Impl : ( ( rule__TimeObservation__EventAssignment_1 ) ) ;
    public final void rule__TimeObservation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6377:1: ( ( ( rule__TimeObservation__EventAssignment_1 ) ) )
            // InternalSequence.g:6378:1: ( ( rule__TimeObservation__EventAssignment_1 ) )
            {
            // InternalSequence.g:6378:1: ( ( rule__TimeObservation__EventAssignment_1 ) )
            // InternalSequence.g:6379:2: ( rule__TimeObservation__EventAssignment_1 )
            {
             before(grammarAccess.getTimeObservationAccess().getEventAssignment_1()); 
            // InternalSequence.g:6380:2: ( rule__TimeObservation__EventAssignment_1 )
            // InternalSequence.g:6380:3: rule__TimeObservation__EventAssignment_1
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
    // InternalSequence.g:6388:1: rule__TimeObservation__Group__2 : rule__TimeObservation__Group__2__Impl rule__TimeObservation__Group__3 ;
    public final void rule__TimeObservation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6392:1: ( rule__TimeObservation__Group__2__Impl rule__TimeObservation__Group__3 )
            // InternalSequence.g:6393:2: rule__TimeObservation__Group__2__Impl rule__TimeObservation__Group__3
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
    // InternalSequence.g:6400:1: rule__TimeObservation__Group__2__Impl : ( ')' ) ;
    public final void rule__TimeObservation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6404:1: ( ( ')' ) )
            // InternalSequence.g:6405:1: ( ')' )
            {
            // InternalSequence.g:6405:1: ( ')' )
            // InternalSequence.g:6406:2: ')'
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
    // InternalSequence.g:6415:1: rule__TimeObservation__Group__3 : rule__TimeObservation__Group__3__Impl rule__TimeObservation__Group__4 ;
    public final void rule__TimeObservation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6419:1: ( rule__TimeObservation__Group__3__Impl rule__TimeObservation__Group__4 )
            // InternalSequence.g:6420:2: rule__TimeObservation__Group__3__Impl rule__TimeObservation__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:6427:1: rule__TimeObservation__Group__3__Impl : ( 't' ) ;
    public final void rule__TimeObservation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6431:1: ( ( 't' ) )
            // InternalSequence.g:6432:1: ( 't' )
            {
            // InternalSequence.g:6432:1: ( 't' )
            // InternalSequence.g:6433:2: 't'
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
    // InternalSequence.g:6442:1: rule__TimeObservation__Group__4 : rule__TimeObservation__Group__4__Impl rule__TimeObservation__Group__5 ;
    public final void rule__TimeObservation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6446:1: ( rule__TimeObservation__Group__4__Impl rule__TimeObservation__Group__5 )
            // InternalSequence.g:6447:2: rule__TimeObservation__Group__4__Impl rule__TimeObservation__Group__5
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
    // InternalSequence.g:6454:1: rule__TimeObservation__Group__4__Impl : ( '[' ) ;
    public final void rule__TimeObservation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6458:1: ( ( '[' ) )
            // InternalSequence.g:6459:1: ( '[' )
            {
            // InternalSequence.g:6459:1: ( '[' )
            // InternalSequence.g:6460:2: '['
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
    // InternalSequence.g:6469:1: rule__TimeObservation__Group__5 : rule__TimeObservation__Group__5__Impl rule__TimeObservation__Group__6 ;
    public final void rule__TimeObservation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6473:1: ( rule__TimeObservation__Group__5__Impl rule__TimeObservation__Group__6 )
            // InternalSequence.g:6474:2: rule__TimeObservation__Group__5__Impl rule__TimeObservation__Group__6
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
    // InternalSequence.g:6481:1: rule__TimeObservation__Group__5__Impl : ( ( rule__TimeObservation__TimeAssignment_5 ) ) ;
    public final void rule__TimeObservation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6485:1: ( ( ( rule__TimeObservation__TimeAssignment_5 ) ) )
            // InternalSequence.g:6486:1: ( ( rule__TimeObservation__TimeAssignment_5 ) )
            {
            // InternalSequence.g:6486:1: ( ( rule__TimeObservation__TimeAssignment_5 ) )
            // InternalSequence.g:6487:2: ( rule__TimeObservation__TimeAssignment_5 )
            {
             before(grammarAccess.getTimeObservationAccess().getTimeAssignment_5()); 
            // InternalSequence.g:6488:2: ( rule__TimeObservation__TimeAssignment_5 )
            // InternalSequence.g:6488:3: rule__TimeObservation__TimeAssignment_5
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
    // InternalSequence.g:6496:1: rule__TimeObservation__Group__6 : rule__TimeObservation__Group__6__Impl ;
    public final void rule__TimeObservation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6500:1: ( rule__TimeObservation__Group__6__Impl )
            // InternalSequence.g:6501:2: rule__TimeObservation__Group__6__Impl
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
    // InternalSequence.g:6507:1: rule__TimeObservation__Group__6__Impl : ( ']' ) ;
    public final void rule__TimeObservation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6511:1: ( ( ']' ) )
            // InternalSequence.g:6512:1: ( ']' )
            {
            // InternalSequence.g:6512:1: ( ']' )
            // InternalSequence.g:6513:2: ']'
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
    // InternalSequence.g:6523:1: rule__DurationObservation__Group__0 : rule__DurationObservation__Group__0__Impl rule__DurationObservation__Group__1 ;
    public final void rule__DurationObservation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6527:1: ( rule__DurationObservation__Group__0__Impl rule__DurationObservation__Group__1 )
            // InternalSequence.g:6528:2: rule__DurationObservation__Group__0__Impl rule__DurationObservation__Group__1
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
    // InternalSequence.g:6535:1: rule__DurationObservation__Group__0__Impl : ( '(' ) ;
    public final void rule__DurationObservation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6539:1: ( ( '(' ) )
            // InternalSequence.g:6540:1: ( '(' )
            {
            // InternalSequence.g:6540:1: ( '(' )
            // InternalSequence.g:6541:2: '('
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
    // InternalSequence.g:6550:1: rule__DurationObservation__Group__1 : rule__DurationObservation__Group__1__Impl rule__DurationObservation__Group__2 ;
    public final void rule__DurationObservation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6554:1: ( rule__DurationObservation__Group__1__Impl rule__DurationObservation__Group__2 )
            // InternalSequence.g:6555:2: rule__DurationObservation__Group__1__Impl rule__DurationObservation__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSequence.g:6562:1: rule__DurationObservation__Group__1__Impl : ( ( rule__DurationObservation__IntervalAssignment_1 ) ) ;
    public final void rule__DurationObservation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6566:1: ( ( ( rule__DurationObservation__IntervalAssignment_1 ) ) )
            // InternalSequence.g:6567:1: ( ( rule__DurationObservation__IntervalAssignment_1 ) )
            {
            // InternalSequence.g:6567:1: ( ( rule__DurationObservation__IntervalAssignment_1 ) )
            // InternalSequence.g:6568:2: ( rule__DurationObservation__IntervalAssignment_1 )
            {
             before(grammarAccess.getDurationObservationAccess().getIntervalAssignment_1()); 
            // InternalSequence.g:6569:2: ( rule__DurationObservation__IntervalAssignment_1 )
            // InternalSequence.g:6569:3: rule__DurationObservation__IntervalAssignment_1
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
    // InternalSequence.g:6577:1: rule__DurationObservation__Group__2 : rule__DurationObservation__Group__2__Impl rule__DurationObservation__Group__3 ;
    public final void rule__DurationObservation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6581:1: ( rule__DurationObservation__Group__2__Impl rule__DurationObservation__Group__3 )
            // InternalSequence.g:6582:2: rule__DurationObservation__Group__2__Impl rule__DurationObservation__Group__3
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
    // InternalSequence.g:6589:1: rule__DurationObservation__Group__2__Impl : ( ')' ) ;
    public final void rule__DurationObservation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6593:1: ( ( ')' ) )
            // InternalSequence.g:6594:1: ( ')' )
            {
            // InternalSequence.g:6594:1: ( ')' )
            // InternalSequence.g:6595:2: ')'
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
    // InternalSequence.g:6604:1: rule__DurationObservation__Group__3 : rule__DurationObservation__Group__3__Impl rule__DurationObservation__Group__4 ;
    public final void rule__DurationObservation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6608:1: ( rule__DurationObservation__Group__3__Impl rule__DurationObservation__Group__4 )
            // InternalSequence.g:6609:2: rule__DurationObservation__Group__3__Impl rule__DurationObservation__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:6616:1: rule__DurationObservation__Group__3__Impl : ( 'd' ) ;
    public final void rule__DurationObservation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6620:1: ( ( 'd' ) )
            // InternalSequence.g:6621:1: ( 'd' )
            {
            // InternalSequence.g:6621:1: ( 'd' )
            // InternalSequence.g:6622:2: 'd'
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
    // InternalSequence.g:6631:1: rule__DurationObservation__Group__4 : rule__DurationObservation__Group__4__Impl rule__DurationObservation__Group__5 ;
    public final void rule__DurationObservation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6635:1: ( rule__DurationObservation__Group__4__Impl rule__DurationObservation__Group__5 )
            // InternalSequence.g:6636:2: rule__DurationObservation__Group__4__Impl rule__DurationObservation__Group__5
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
    // InternalSequence.g:6643:1: rule__DurationObservation__Group__4__Impl : ( '[' ) ;
    public final void rule__DurationObservation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6647:1: ( ( '[' ) )
            // InternalSequence.g:6648:1: ( '[' )
            {
            // InternalSequence.g:6648:1: ( '[' )
            // InternalSequence.g:6649:2: '['
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
    // InternalSequence.g:6658:1: rule__DurationObservation__Group__5 : rule__DurationObservation__Group__5__Impl rule__DurationObservation__Group__6 ;
    public final void rule__DurationObservation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6662:1: ( rule__DurationObservation__Group__5__Impl rule__DurationObservation__Group__6 )
            // InternalSequence.g:6663:2: rule__DurationObservation__Group__5__Impl rule__DurationObservation__Group__6
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
    // InternalSequence.g:6670:1: rule__DurationObservation__Group__5__Impl : ( ( rule__DurationObservation__DurationAssignment_5 ) ) ;
    public final void rule__DurationObservation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6674:1: ( ( ( rule__DurationObservation__DurationAssignment_5 ) ) )
            // InternalSequence.g:6675:1: ( ( rule__DurationObservation__DurationAssignment_5 ) )
            {
            // InternalSequence.g:6675:1: ( ( rule__DurationObservation__DurationAssignment_5 ) )
            // InternalSequence.g:6676:2: ( rule__DurationObservation__DurationAssignment_5 )
            {
             before(grammarAccess.getDurationObservationAccess().getDurationAssignment_5()); 
            // InternalSequence.g:6677:2: ( rule__DurationObservation__DurationAssignment_5 )
            // InternalSequence.g:6677:3: rule__DurationObservation__DurationAssignment_5
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
    // InternalSequence.g:6685:1: rule__DurationObservation__Group__6 : rule__DurationObservation__Group__6__Impl ;
    public final void rule__DurationObservation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6689:1: ( rule__DurationObservation__Group__6__Impl )
            // InternalSequence.g:6690:2: rule__DurationObservation__Group__6__Impl
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
    // InternalSequence.g:6696:1: rule__DurationObservation__Group__6__Impl : ( ']' ) ;
    public final void rule__DurationObservation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6700:1: ( ( ']' ) )
            // InternalSequence.g:6701:1: ( ']' )
            {
            // InternalSequence.g:6701:1: ( ']' )
            // InternalSequence.g:6702:2: ']'
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
    // InternalSequence.g:6712:1: rule__BiPointInTimeTimeIntervalSelector__Group__0 : rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl rule__BiPointInTimeTimeIntervalSelector__Group__1 ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6716:1: ( rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl rule__BiPointInTimeTimeIntervalSelector__Group__1 )
            // InternalSequence.g:6717:2: rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl rule__BiPointInTimeTimeIntervalSelector__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSequence.g:6724:1: rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl : ( ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 ) ) ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6728:1: ( ( ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 ) ) )
            // InternalSequence.g:6729:1: ( ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 ) )
            {
            // InternalSequence.g:6729:1: ( ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 ) )
            // InternalSequence.g:6730:2: ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 )
            {
             before(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getStartAssignment_0()); 
            // InternalSequence.g:6731:2: ( rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 )
            // InternalSequence.g:6731:3: rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0
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
    // InternalSequence.g:6739:1: rule__BiPointInTimeTimeIntervalSelector__Group__1 : rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl rule__BiPointInTimeTimeIntervalSelector__Group__2 ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6743:1: ( rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl rule__BiPointInTimeTimeIntervalSelector__Group__2 )
            // InternalSequence.g:6744:2: rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl rule__BiPointInTimeTimeIntervalSelector__Group__2
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
    // InternalSequence.g:6751:1: rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl : ( ',' ) ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6755:1: ( ( ',' ) )
            // InternalSequence.g:6756:1: ( ',' )
            {
            // InternalSequence.g:6756:1: ( ',' )
            // InternalSequence.g:6757:2: ','
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
    // InternalSequence.g:6766:1: rule__BiPointInTimeTimeIntervalSelector__Group__2 : rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6770:1: ( rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl )
            // InternalSequence.g:6771:2: rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl
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
    // InternalSequence.g:6777:1: rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl : ( ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 ) ) ;
    public final void rule__BiPointInTimeTimeIntervalSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6781:1: ( ( ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 ) ) )
            // InternalSequence.g:6782:1: ( ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 ) )
            {
            // InternalSequence.g:6782:1: ( ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 ) )
            // InternalSequence.g:6783:2: ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 )
            {
             before(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getEndAssignment_2()); 
            // InternalSequence.g:6784:2: ( rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 )
            // InternalSequence.g:6784:3: rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2
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
    // InternalSequence.g:6793:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6797:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSequence.g:6798:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalSequence.g:6805:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6809:1: ( ( RULE_ID ) )
            // InternalSequence.g:6810:1: ( RULE_ID )
            {
            // InternalSequence.g:6810:1: ( RULE_ID )
            // InternalSequence.g:6811:2: RULE_ID
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
    // InternalSequence.g:6820:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6824:1: ( rule__FQN__Group__1__Impl )
            // InternalSequence.g:6825:2: rule__FQN__Group__1__Impl
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
    // InternalSequence.g:6831:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6835:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSequence.g:6836:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSequence.g:6836:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSequence.g:6837:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSequence.g:6838:2: ( rule__FQN__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==47) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSequence.g:6838:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalSequence.g:6847:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6851:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSequence.g:6852:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalSequence.g:6859:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6863:1: ( ( '.' ) )
            // InternalSequence.g:6864:1: ( '.' )
            {
            // InternalSequence.g:6864:1: ( '.' )
            // InternalSequence.g:6865:2: '.'
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
    // InternalSequence.g:6874:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6878:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSequence.g:6879:2: rule__FQN__Group_1__1__Impl
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
    // InternalSequence.g:6885:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6889:1: ( ( RULE_ID ) )
            // InternalSequence.g:6890:1: ( RULE_ID )
            {
            // InternalSequence.g:6890:1: ( RULE_ID )
            // InternalSequence.g:6891:2: RULE_ID
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
    // InternalSequence.g:6901:1: rule__InlineComment__Group__0 : rule__InlineComment__Group__0__Impl rule__InlineComment__Group__1 ;
    public final void rule__InlineComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6905:1: ( rule__InlineComment__Group__0__Impl rule__InlineComment__Group__1 )
            // InternalSequence.g:6906:2: rule__InlineComment__Group__0__Impl rule__InlineComment__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSequence.g:6913:1: rule__InlineComment__Group__0__Impl : ( 'note' ) ;
    public final void rule__InlineComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6917:1: ( ( 'note' ) )
            // InternalSequence.g:6918:1: ( 'note' )
            {
            // InternalSequence.g:6918:1: ( 'note' )
            // InternalSequence.g:6919:2: 'note'
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
    // InternalSequence.g:6928:1: rule__InlineComment__Group__1 : rule__InlineComment__Group__1__Impl rule__InlineComment__Group__2 ;
    public final void rule__InlineComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6932:1: ( rule__InlineComment__Group__1__Impl rule__InlineComment__Group__2 )
            // InternalSequence.g:6933:2: rule__InlineComment__Group__1__Impl rule__InlineComment__Group__2
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
    // InternalSequence.g:6940:1: rule__InlineComment__Group__1__Impl : ( '[' ) ;
    public final void rule__InlineComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6944:1: ( ( '[' ) )
            // InternalSequence.g:6945:1: ( '[' )
            {
            // InternalSequence.g:6945:1: ( '[' )
            // InternalSequence.g:6946:2: '['
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
    // InternalSequence.g:6955:1: rule__InlineComment__Group__2 : rule__InlineComment__Group__2__Impl rule__InlineComment__Group__3 ;
    public final void rule__InlineComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6959:1: ( rule__InlineComment__Group__2__Impl rule__InlineComment__Group__3 )
            // InternalSequence.g:6960:2: rule__InlineComment__Group__2__Impl rule__InlineComment__Group__3
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
    // InternalSequence.g:6967:1: rule__InlineComment__Group__2__Impl : ( ( rule__InlineComment__BodyAssignment_2 ) ) ;
    public final void rule__InlineComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6971:1: ( ( ( rule__InlineComment__BodyAssignment_2 ) ) )
            // InternalSequence.g:6972:1: ( ( rule__InlineComment__BodyAssignment_2 ) )
            {
            // InternalSequence.g:6972:1: ( ( rule__InlineComment__BodyAssignment_2 ) )
            // InternalSequence.g:6973:2: ( rule__InlineComment__BodyAssignment_2 )
            {
             before(grammarAccess.getInlineCommentAccess().getBodyAssignment_2()); 
            // InternalSequence.g:6974:2: ( rule__InlineComment__BodyAssignment_2 )
            // InternalSequence.g:6974:3: rule__InlineComment__BodyAssignment_2
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
    // InternalSequence.g:6982:1: rule__InlineComment__Group__3 : rule__InlineComment__Group__3__Impl ;
    public final void rule__InlineComment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6986:1: ( rule__InlineComment__Group__3__Impl )
            // InternalSequence.g:6987:2: rule__InlineComment__Group__3__Impl
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
    // InternalSequence.g:6993:1: rule__InlineComment__Group__3__Impl : ( ']' ) ;
    public final void rule__InlineComment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:6997:1: ( ( ']' ) )
            // InternalSequence.g:6998:1: ( ']' )
            {
            // InternalSequence.g:6998:1: ( ']' )
            // InternalSequence.g:6999:2: ']'
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
    // InternalSequence.g:7009:1: rule__SequenceDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SequenceDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7013:1: ( ( RULE_STRING ) )
            // InternalSequence.g:7014:2: ( RULE_STRING )
            {
            // InternalSequence.g:7014:2: ( RULE_STRING )
            // InternalSequence.g:7015:3: RULE_STRING
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
    // InternalSequence.g:7024:1: rule__SequenceDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__SequenceDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7028:1: ( ( ruleRootPackage ) )
            // InternalSequence.g:7029:2: ( ruleRootPackage )
            {
            // InternalSequence.g:7029:2: ( ruleRootPackage )
            // InternalSequence.g:7030:3: ruleRootPackage
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
    // InternalSequence.g:7039:1: rule__SequenceDiagram__ActorsAssignment_4 : ( ruleActor ) ;
    public final void rule__SequenceDiagram__ActorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7043:1: ( ( ruleActor ) )
            // InternalSequence.g:7044:2: ( ruleActor )
            {
            // InternalSequence.g:7044:2: ( ruleActor )
            // InternalSequence.g:7045:3: ruleActor
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
    // InternalSequence.g:7054:1: rule__SequenceDiagram__FragmentsAssignment_5 : ( ruleFragment ) ;
    public final void rule__SequenceDiagram__FragmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7058:1: ( ( ruleFragment ) )
            // InternalSequence.g:7059:2: ( ruleFragment )
            {
            // InternalSequence.g:7059:2: ( ruleFragment )
            // InternalSequence.g:7060:3: ruleFragment
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
    // InternalSequence.g:7069:1: rule__SequenceDiagram__FragmentsAssignment_6 : ( ( rule__SequenceDiagram__FragmentsAlternatives_6_0 ) ) ;
    public final void rule__SequenceDiagram__FragmentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7073:1: ( ( ( rule__SequenceDiagram__FragmentsAlternatives_6_0 ) ) )
            // InternalSequence.g:7074:2: ( ( rule__SequenceDiagram__FragmentsAlternatives_6_0 ) )
            {
            // InternalSequence.g:7074:2: ( ( rule__SequenceDiagram__FragmentsAlternatives_6_0 ) )
            // InternalSequence.g:7075:3: ( rule__SequenceDiagram__FragmentsAlternatives_6_0 )
            {
             before(grammarAccess.getSequenceDiagramAccess().getFragmentsAlternatives_6_0()); 
            // InternalSequence.g:7076:3: ( rule__SequenceDiagram__FragmentsAlternatives_6_0 )
            // InternalSequence.g:7076:4: rule__SequenceDiagram__FragmentsAlternatives_6_0
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
    // InternalSequence.g:7084:1: rule__RootPackage__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7088:1: ( ( ruleFQN ) )
            // InternalSequence.g:7089:2: ( ruleFQN )
            {
            // InternalSequence.g:7089:2: ( ruleFQN )
            // InternalSequence.g:7090:3: ruleFQN
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
    // InternalSequence.g:7099:1: rule__Actor__DeferredAssignment_0 : ( ( 'def' ) ) ;
    public final void rule__Actor__DeferredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7103:1: ( ( ( 'def' ) ) )
            // InternalSequence.g:7104:2: ( ( 'def' ) )
            {
            // InternalSequence.g:7104:2: ( ( 'def' ) )
            // InternalSequence.g:7105:3: ( 'def' )
            {
             before(grammarAccess.getActorAccess().getDeferredDefKeyword_0_0()); 
            // InternalSequence.g:7106:3: ( 'def' )
            // InternalSequence.g:7107:4: 'def'
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
    // InternalSequence.g:7118:1: rule__Actor__NameAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7122:1: ( ( RULE_ID ) )
            // InternalSequence.g:7123:2: ( RULE_ID )
            {
            // InternalSequence.g:7123:2: ( RULE_ID )
            // InternalSequence.g:7124:3: RULE_ID
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
    // InternalSequence.g:7133:1: rule__Actor__TypeMappingAssignment_2_0_1 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7137:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:7138:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:7138:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:7139:3: ruleActorClassifierMapping
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
    // InternalSequence.g:7148:1: rule__Actor__TypeMappingAssignment_2_1_0 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7152:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:7153:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:7153:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:7154:3: ruleActorClassifierMapping
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
    // InternalSequence.g:7163:1: rule__Actor__AliasAssignment_2_1_2 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7167:1: ( ( RULE_ID ) )
            // InternalSequence.g:7168:2: ( RULE_ID )
            {
            // InternalSequence.g:7168:2: ( RULE_ID )
            // InternalSequence.g:7169:3: RULE_ID
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
    // InternalSequence.g:7178:1: rule__Actor__NameAssignment_2_2_0 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7182:1: ( ( RULE_STRING ) )
            // InternalSequence.g:7183:2: ( RULE_STRING )
            {
            // InternalSequence.g:7183:2: ( RULE_STRING )
            // InternalSequence.g:7184:3: RULE_STRING
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
    // InternalSequence.g:7193:1: rule__Actor__TypeMappingAssignment_2_2_1 : ( ruleActorClassifierMapping ) ;
    public final void rule__Actor__TypeMappingAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7197:1: ( ( ruleActorClassifierMapping ) )
            // InternalSequence.g:7198:2: ( ruleActorClassifierMapping )
            {
            // InternalSequence.g:7198:2: ( ruleActorClassifierMapping )
            // InternalSequence.g:7199:3: ruleActorClassifierMapping
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
    // InternalSequence.g:7208:1: rule__Actor__AliasAssignment_2_2_3 : ( RULE_ID ) ;
    public final void rule__Actor__AliasAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7212:1: ( ( RULE_ID ) )
            // InternalSequence.g:7213:2: ( RULE_ID )
            {
            // InternalSequence.g:7213:2: ( RULE_ID )
            // InternalSequence.g:7214:3: RULE_ID
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
    // InternalSequence.g:7223:1: rule__Actor__ActorTypeAssignment_3_1 : ( ruleActorType ) ;
    public final void rule__Actor__ActorTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7227:1: ( ( ruleActorType ) )
            // InternalSequence.g:7228:2: ( ruleActorType )
            {
            // InternalSequence.g:7228:2: ( ruleActorType )
            // InternalSequence.g:7229:3: ruleActorType
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
    // InternalSequence.g:7238:1: rule__Actor__CommentsAssignment_4 : ( ruleInlineComment ) ;
    public final void rule__Actor__CommentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7242:1: ( ( ruleInlineComment ) )
            // InternalSequence.g:7243:2: ( ruleInlineComment )
            {
            // InternalSequence.g:7243:2: ( ruleInlineComment )
            // InternalSequence.g:7244:3: ruleInlineComment
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
    // InternalSequence.g:7253:1: rule__ActorClassifierMapping__ClassifierAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ActorClassifierMapping__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7257:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7258:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7258:2: ( ( ruleFQN ) )
            // InternalSequence.g:7259:3: ( ruleFQN )
            {
             before(grammarAccess.getActorClassifierMappingAccess().getClassifierClassifierCrossReference_1_0()); 
            // InternalSequence.g:7260:3: ( ruleFQN )
            // InternalSequence.g:7261:4: ruleFQN
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
    // InternalSequence.g:7272:1: rule__OneFragment__FragmentsAssignment : ( ruleFragment ) ;
    public final void rule__OneFragment__FragmentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7276:1: ( ( ruleFragment ) )
            // InternalSequence.g:7277:2: ( ruleFragment )
            {
            // InternalSequence.g:7277:2: ( ruleFragment )
            // InternalSequence.g:7278:3: ruleFragment
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
    // InternalSequence.g:7287:1: rule__OneOrMultipleFragments__FragmentsAssignment : ( ruleFragment ) ;
    public final void rule__OneOrMultipleFragments__FragmentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7291:1: ( ( ruleFragment ) )
            // InternalSequence.g:7292:2: ( ruleFragment )
            {
            // InternalSequence.g:7292:2: ( ruleFragment )
            // InternalSequence.g:7293:3: ruleFragment
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
    // InternalSequence.g:7302:1: rule__Condition__ConditionAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__Condition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7306:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7307:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7307:2: ( ruleUnescapedString )
            // InternalSequence.g:7308:3: ruleUnescapedString
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
    // InternalSequence.g:7317:1: rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0 : ( ruleCondition ) ;
    public final void rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7321:1: ( ( ruleCondition ) )
            // InternalSequence.g:7322:2: ( ruleCondition )
            {
            // InternalSequence.g:7322:2: ( ruleCondition )
            // InternalSequence.g:7323:3: ruleCondition
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
    // InternalSequence.g:7332:1: rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1 : ( ruleFragment ) ;
    public final void rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7336:1: ( ( ruleFragment ) )
            // InternalSequence.g:7337:2: ( ruleFragment )
            {
            // InternalSequence.g:7337:2: ( ruleFragment )
            // InternalSequence.g:7338:3: ruleFragment
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
    // InternalSequence.g:7347:1: rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1 : ( ruleFragment ) ;
    public final void rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7351:1: ( ( ruleFragment ) )
            // InternalSequence.g:7352:2: ( ruleFragment )
            {
            // InternalSequence.g:7352:2: ( ruleFragment )
            // InternalSequence.g:7353:3: ruleFragment
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
    // InternalSequence.g:7362:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0 : ( ruleCondition ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7366:1: ( ( ruleCondition ) )
            // InternalSequence.g:7367:2: ( ruleCondition )
            {
            // InternalSequence.g:7367:2: ( ruleCondition )
            // InternalSequence.g:7368:3: ruleCondition
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
    // InternalSequence.g:7377:1: rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2 : ( ruleFragment ) ;
    public final void rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7381:1: ( ( ruleFragment ) )
            // InternalSequence.g:7382:2: ( ruleFragment )
            {
            // InternalSequence.g:7382:2: ( ruleFragment )
            // InternalSequence.g:7383:3: ruleFragment
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


    // $ANTLR start "rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2"
    // InternalSequence.g:7392:1: rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7396:1: ( ( ( RULE_ID ) ) )
            // InternalSequence.g:7397:2: ( ( RULE_ID ) )
            {
            // InternalSequence.g:7397:2: ( ( RULE_ID ) )
            // InternalSequence.g:7398:3: ( RULE_ID )
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getExplicitOccurenceSpecificationExplicitArrivalOccurenceSpecificationCrossReference_2_0()); 
            // InternalSequence.g:7399:3: ( RULE_ID )
            // InternalSequence.g:7400:4: RULE_ID
            {
             before(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getExplicitOccurenceSpecificationExplicitArrivalOccurenceSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getExplicitOccurenceSpecificationExplicitArrivalOccurenceSpecificationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getExplicitOccurenceSpecificationExplicitArrivalOccurenceSpecificationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplicitArrivalOccurenceReference__ExplicitOccurenceSpecificationAssignment_2"


    // $ANTLR start "rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1"
    // InternalSequence.g:7411:1: rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7415:1: ( ( RULE_ID ) )
            // InternalSequence.g:7416:2: ( RULE_ID )
            {
            // InternalSequence.g:7416:2: ( RULE_ID )
            // InternalSequence.g:7417:3: RULE_ID
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
    // InternalSequence.g:7426:1: rule__StandardMessage__TypeAssignment_0 : ( ruleMessageType ) ;
    public final void rule__StandardMessage__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7430:1: ( ( ruleMessageType ) )
            // InternalSequence.g:7431:2: ( ruleMessageType )
            {
            // InternalSequence.g:7431:2: ( ruleMessageType )
            // InternalSequence.g:7432:3: ruleMessageType
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
    // InternalSequence.g:7441:1: rule__StandardMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__StandardMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7445:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7446:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7446:2: ( ruleUnescapedString )
            // InternalSequence.g:7447:3: ruleUnescapedString
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
    // InternalSequence.g:7456:1: rule__StandardMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7460:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7461:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7461:2: ( ( ruleFQN ) )
            // InternalSequence.g:7462:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:7463:3: ( ruleFQN )
            // InternalSequence.g:7464:4: ruleFQN
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
    // InternalSequence.g:7475:1: rule__StandardMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__StandardMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7479:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7480:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7480:2: ( ( ruleFQN ) )
            // InternalSequence.g:7481:3: ( ruleFQN )
            {
             before(grammarAccess.getStandardMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:7482:3: ( ruleFQN )
            // InternalSequence.g:7483:4: ruleFQN
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


    // $ANTLR start "rule__StandardMessage__AliasAssignment_7_1"
    // InternalSequence.g:7494:1: rule__StandardMessage__AliasAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__StandardMessage__AliasAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7498:1: ( ( RULE_ID ) )
            // InternalSequence.g:7499:2: ( RULE_ID )
            {
            // InternalSequence.g:7499:2: ( RULE_ID )
            // InternalSequence.g:7500:3: RULE_ID
            {
             before(grammarAccess.getStandardMessageAccess().getAliasIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStandardMessageAccess().getAliasIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__AliasAssignment_7_1"


    // $ANTLR start "rule__StandardMessage__SendEventAssignment_8"
    // InternalSequence.g:7509:1: rule__StandardMessage__SendEventAssignment_8 : ( ruleImplicitSendOccurenceSpecification ) ;
    public final void rule__StandardMessage__SendEventAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7513:1: ( ( ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:7514:2: ( ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:7514:2: ( ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:7515:3: ruleImplicitSendOccurenceSpecification
            {
             before(grammarAccess.getStandardMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitSendOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getStandardMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__SendEventAssignment_8"


    // $ANTLR start "rule__StandardMessage__ArrivalEventAssignment_9_0"
    // InternalSequence.g:7524:1: rule__StandardMessage__ArrivalEventAssignment_9_0 : ( ruleExplicitArrivalOccurenceReference ) ;
    public final void rule__StandardMessage__ArrivalEventAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7528:1: ( ( ruleExplicitArrivalOccurenceReference ) )
            // InternalSequence.g:7529:2: ( ruleExplicitArrivalOccurenceReference )
            {
            // InternalSequence.g:7529:2: ( ruleExplicitArrivalOccurenceReference )
            // InternalSequence.g:7530:3: ruleExplicitArrivalOccurenceReference
            {
             before(grammarAccess.getStandardMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExplicitArrivalOccurenceReference();

            state._fsp--;

             after(grammarAccess.getStandardMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__ArrivalEventAssignment_9_0"


    // $ANTLR start "rule__StandardMessage__ArrivalEventAssignment_9_1"
    // InternalSequence.g:7539:1: rule__StandardMessage__ArrivalEventAssignment_9_1 : ( ruleImplicitArrivalOccurenceSpecification ) ;
    public final void rule__StandardMessage__ArrivalEventAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7543:1: ( ( ruleImplicitArrivalOccurenceSpecification ) )
            // InternalSequence.g:7544:2: ( ruleImplicitArrivalOccurenceSpecification )
            {
            // InternalSequence.g:7544:2: ( ruleImplicitArrivalOccurenceSpecification )
            // InternalSequence.g:7545:3: ruleImplicitArrivalOccurenceSpecification
            {
             before(grammarAccess.getStandardMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitArrivalOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getStandardMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardMessage__ArrivalEventAssignment_9_1"


    // $ANTLR start "rule__ResponseMessage__NameAssignment_1"
    // InternalSequence.g:7554:1: rule__ResponseMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__ResponseMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7558:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7559:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7559:2: ( ruleUnescapedString )
            // InternalSequence.g:7560:3: ruleUnescapedString
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
    // InternalSequence.g:7569:1: rule__ResponseMessage__LeftAssignment_3_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__LeftAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7573:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7574:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7574:2: ( ( ruleFQN ) )
            // InternalSequence.g:7575:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getLeftActorCrossReference_3_0_0()); 
            // InternalSequence.g:7576:3: ( ruleFQN )
            // InternalSequence.g:7577:4: ruleFQN
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
    // InternalSequence.g:7588:1: rule__ResponseMessage__RightAssignment_5_0 : ( ( ruleFQN ) ) ;
    public final void rule__ResponseMessage__RightAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7592:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7593:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7593:2: ( ( ruleFQN ) )
            // InternalSequence.g:7594:3: ( ruleFQN )
            {
             before(grammarAccess.getResponseMessageAccess().getRightActorCrossReference_5_0_0()); 
            // InternalSequence.g:7595:3: ( ruleFQN )
            // InternalSequence.g:7596:4: ruleFQN
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


    // $ANTLR start "rule__ResponseMessage__AliasAssignment_7_1"
    // InternalSequence.g:7607:1: rule__ResponseMessage__AliasAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__ResponseMessage__AliasAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7611:1: ( ( RULE_ID ) )
            // InternalSequence.g:7612:2: ( RULE_ID )
            {
            // InternalSequence.g:7612:2: ( RULE_ID )
            // InternalSequence.g:7613:3: RULE_ID
            {
             before(grammarAccess.getResponseMessageAccess().getAliasIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResponseMessageAccess().getAliasIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__AliasAssignment_7_1"


    // $ANTLR start "rule__ResponseMessage__SendEventAssignment_8"
    // InternalSequence.g:7622:1: rule__ResponseMessage__SendEventAssignment_8 : ( ruleImplicitSendOccurenceSpecification ) ;
    public final void rule__ResponseMessage__SendEventAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7626:1: ( ( ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:7627:2: ( ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:7627:2: ( ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:7628:3: ruleImplicitSendOccurenceSpecification
            {
             before(grammarAccess.getResponseMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitSendOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getResponseMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__SendEventAssignment_8"


    // $ANTLR start "rule__ResponseMessage__ArrivalEventAssignment_9_0"
    // InternalSequence.g:7637:1: rule__ResponseMessage__ArrivalEventAssignment_9_0 : ( ruleExplicitArrivalOccurenceReference ) ;
    public final void rule__ResponseMessage__ArrivalEventAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7641:1: ( ( ruleExplicitArrivalOccurenceReference ) )
            // InternalSequence.g:7642:2: ( ruleExplicitArrivalOccurenceReference )
            {
            // InternalSequence.g:7642:2: ( ruleExplicitArrivalOccurenceReference )
            // InternalSequence.g:7643:3: ruleExplicitArrivalOccurenceReference
            {
             before(grammarAccess.getResponseMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExplicitArrivalOccurenceReference();

            state._fsp--;

             after(grammarAccess.getResponseMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__ArrivalEventAssignment_9_0"


    // $ANTLR start "rule__ResponseMessage__ArrivalEventAssignment_9_1"
    // InternalSequence.g:7652:1: rule__ResponseMessage__ArrivalEventAssignment_9_1 : ( ruleImplicitArrivalOccurenceSpecification ) ;
    public final void rule__ResponseMessage__ArrivalEventAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7656:1: ( ( ruleImplicitArrivalOccurenceSpecification ) )
            // InternalSequence.g:7657:2: ( ruleImplicitArrivalOccurenceSpecification )
            {
            // InternalSequence.g:7657:2: ( ruleImplicitArrivalOccurenceSpecification )
            // InternalSequence.g:7658:3: ruleImplicitArrivalOccurenceSpecification
            {
             before(grammarAccess.getResponseMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitArrivalOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getResponseMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseMessage__ArrivalEventAssignment_9_1"


    // $ANTLR start "rule__FoundMessage__TypeAssignment_1"
    // InternalSequence.g:7667:1: rule__FoundMessage__TypeAssignment_1 : ( ruleMessageType ) ;
    public final void rule__FoundMessage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7671:1: ( ( ruleMessageType ) )
            // InternalSequence.g:7672:2: ( ruleMessageType )
            {
            // InternalSequence.g:7672:2: ( ruleMessageType )
            // InternalSequence.g:7673:3: ruleMessageType
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
    // InternalSequence.g:7682:1: rule__FoundMessage__NameAssignment_2 : ( ruleUnescapedString ) ;
    public final void rule__FoundMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7686:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7687:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7687:2: ( ruleUnescapedString )
            // InternalSequence.g:7688:3: ruleUnescapedString
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
    // InternalSequence.g:7697:1: rule__FoundMessage__RightAssignment_6 : ( ( ruleFQN ) ) ;
    public final void rule__FoundMessage__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7701:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7702:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7702:2: ( ( ruleFQN ) )
            // InternalSequence.g:7703:3: ( ruleFQN )
            {
             before(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0()); 
            // InternalSequence.g:7704:3: ( ruleFQN )
            // InternalSequence.g:7705:4: ruleFQN
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


    // $ANTLR start "rule__FoundMessage__AliasAssignment_8_1"
    // InternalSequence.g:7716:1: rule__FoundMessage__AliasAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__FoundMessage__AliasAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7720:1: ( ( RULE_ID ) )
            // InternalSequence.g:7721:2: ( RULE_ID )
            {
            // InternalSequence.g:7721:2: ( RULE_ID )
            // InternalSequence.g:7722:3: RULE_ID
            {
             before(grammarAccess.getFoundMessageAccess().getAliasIDTerminalRuleCall_8_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFoundMessageAccess().getAliasIDTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__AliasAssignment_8_1"


    // $ANTLR start "rule__FoundMessage__ArrivalEventAssignment_9"
    // InternalSequence.g:7731:1: rule__FoundMessage__ArrivalEventAssignment_9 : ( ruleImplicitArrivalOccurenceSpecification ) ;
    public final void rule__FoundMessage__ArrivalEventAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7735:1: ( ( ruleImplicitArrivalOccurenceSpecification ) )
            // InternalSequence.g:7736:2: ( ruleImplicitArrivalOccurenceSpecification )
            {
            // InternalSequence.g:7736:2: ( ruleImplicitArrivalOccurenceSpecification )
            // InternalSequence.g:7737:3: ruleImplicitArrivalOccurenceSpecification
            {
             before(grammarAccess.getFoundMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitArrivalOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getFoundMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoundMessage__ArrivalEventAssignment_9"


    // $ANTLR start "rule__LostMessage__TypeAssignment_1_1_1"
    // InternalSequence.g:7746:1: rule__LostMessage__TypeAssignment_1_1_1 : ( ruleMessageType ) ;
    public final void rule__LostMessage__TypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7750:1: ( ( ruleMessageType ) )
            // InternalSequence.g:7751:2: ( ruleMessageType )
            {
            // InternalSequence.g:7751:2: ( ruleMessageType )
            // InternalSequence.g:7752:3: ruleMessageType
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
    // InternalSequence.g:7761:1: rule__LostMessage__NameAssignment_2 : ( ruleUnescapedString ) ;
    public final void rule__LostMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7765:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7766:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7766:2: ( ruleUnescapedString )
            // InternalSequence.g:7767:3: ruleUnescapedString
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
    // InternalSequence.g:7776:1: rule__LostMessage__LeftAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__LostMessage__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7780:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7781:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7781:2: ( ( ruleFQN ) )
            // InternalSequence.g:7782:3: ( ruleFQN )
            {
             before(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0()); 
            // InternalSequence.g:7783:3: ( ruleFQN )
            // InternalSequence.g:7784:4: ruleFQN
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


    // $ANTLR start "rule__LostMessage__AliasAssignment_8_1"
    // InternalSequence.g:7795:1: rule__LostMessage__AliasAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__LostMessage__AliasAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7799:1: ( ( RULE_ID ) )
            // InternalSequence.g:7800:2: ( RULE_ID )
            {
            // InternalSequence.g:7800:2: ( RULE_ID )
            // InternalSequence.g:7801:3: RULE_ID
            {
             before(grammarAccess.getLostMessageAccess().getAliasIDTerminalRuleCall_8_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLostMessageAccess().getAliasIDTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__AliasAssignment_8_1"


    // $ANTLR start "rule__LostMessage__SendEventAssignment_9"
    // InternalSequence.g:7810:1: rule__LostMessage__SendEventAssignment_9 : ( ruleImplicitSendOccurenceSpecification ) ;
    public final void rule__LostMessage__SendEventAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7814:1: ( ( ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:7815:2: ( ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:7815:2: ( ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:7816:3: ruleImplicitSendOccurenceSpecification
            {
             before(grammarAccess.getLostMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitSendOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getLostMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LostMessage__SendEventAssignment_9"


    // $ANTLR start "rule__CreateMessage__NameAssignment_1"
    // InternalSequence.g:7825:1: rule__CreateMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__CreateMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7829:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7830:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7830:2: ( ruleUnescapedString )
            // InternalSequence.g:7831:3: ruleUnescapedString
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
    // InternalSequence.g:7840:1: rule__CreateMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7844:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7845:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7845:2: ( ( ruleFQN ) )
            // InternalSequence.g:7846:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:7847:3: ( ruleFQN )
            // InternalSequence.g:7848:4: ruleFQN
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
    // InternalSequence.g:7859:1: rule__CreateMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__CreateMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7863:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7864:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7864:2: ( ( ruleFQN ) )
            // InternalSequence.g:7865:3: ( ruleFQN )
            {
             before(grammarAccess.getCreateMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:7866:3: ( ruleFQN )
            // InternalSequence.g:7867:4: ruleFQN
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


    // $ANTLR start "rule__CreateMessage__AliasAssignment_7_1"
    // InternalSequence.g:7878:1: rule__CreateMessage__AliasAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__CreateMessage__AliasAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7882:1: ( ( RULE_ID ) )
            // InternalSequence.g:7883:2: ( RULE_ID )
            {
            // InternalSequence.g:7883:2: ( RULE_ID )
            // InternalSequence.g:7884:3: RULE_ID
            {
             before(grammarAccess.getCreateMessageAccess().getAliasIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCreateMessageAccess().getAliasIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__AliasAssignment_7_1"


    // $ANTLR start "rule__CreateMessage__SendEventAssignment_8"
    // InternalSequence.g:7893:1: rule__CreateMessage__SendEventAssignment_8 : ( ruleImplicitSendOccurenceSpecification ) ;
    public final void rule__CreateMessage__SendEventAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7897:1: ( ( ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:7898:2: ( ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:7898:2: ( ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:7899:3: ruleImplicitSendOccurenceSpecification
            {
             before(grammarAccess.getCreateMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitSendOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getCreateMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__SendEventAssignment_8"


    // $ANTLR start "rule__CreateMessage__ArrivalEventAssignment_9_0"
    // InternalSequence.g:7908:1: rule__CreateMessage__ArrivalEventAssignment_9_0 : ( ruleExplicitArrivalOccurenceReference ) ;
    public final void rule__CreateMessage__ArrivalEventAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7912:1: ( ( ruleExplicitArrivalOccurenceReference ) )
            // InternalSequence.g:7913:2: ( ruleExplicitArrivalOccurenceReference )
            {
            // InternalSequence.g:7913:2: ( ruleExplicitArrivalOccurenceReference )
            // InternalSequence.g:7914:3: ruleExplicitArrivalOccurenceReference
            {
             before(grammarAccess.getCreateMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExplicitArrivalOccurenceReference();

            state._fsp--;

             after(grammarAccess.getCreateMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__ArrivalEventAssignment_9_0"


    // $ANTLR start "rule__CreateMessage__ArrivalEventAssignment_9_1"
    // InternalSequence.g:7923:1: rule__CreateMessage__ArrivalEventAssignment_9_1 : ( ruleImplicitArrivalOccurenceSpecification ) ;
    public final void rule__CreateMessage__ArrivalEventAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7927:1: ( ( ruleImplicitArrivalOccurenceSpecification ) )
            // InternalSequence.g:7928:2: ( ruleImplicitArrivalOccurenceSpecification )
            {
            // InternalSequence.g:7928:2: ( ruleImplicitArrivalOccurenceSpecification )
            // InternalSequence.g:7929:3: ruleImplicitArrivalOccurenceSpecification
            {
             before(grammarAccess.getCreateMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitArrivalOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getCreateMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateMessage__ArrivalEventAssignment_9_1"


    // $ANTLR start "rule__DestructionMessage__NameAssignment_1"
    // InternalSequence.g:7938:1: rule__DestructionMessage__NameAssignment_1 : ( ruleUnescapedString ) ;
    public final void rule__DestructionMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7942:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:7943:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:7943:2: ( ruleUnescapedString )
            // InternalSequence.g:7944:3: ruleUnescapedString
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
    // InternalSequence.g:7953:1: rule__DestructionMessage__LeftAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7957:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7958:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7958:2: ( ( ruleFQN ) )
            // InternalSequence.g:7959:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getLeftActorCrossReference_3_0()); 
            // InternalSequence.g:7960:3: ( ruleFQN )
            // InternalSequence.g:7961:4: ruleFQN
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
    // InternalSequence.g:7972:1: rule__DestructionMessage__RightAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionMessage__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7976:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:7977:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:7977:2: ( ( ruleFQN ) )
            // InternalSequence.g:7978:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionMessageAccess().getRightActorCrossReference_5_0()); 
            // InternalSequence.g:7979:3: ( ruleFQN )
            // InternalSequence.g:7980:4: ruleFQN
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


    // $ANTLR start "rule__DestructionMessage__AliasAssignment_7_1"
    // InternalSequence.g:7991:1: rule__DestructionMessage__AliasAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__DestructionMessage__AliasAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:7995:1: ( ( RULE_ID ) )
            // InternalSequence.g:7996:2: ( RULE_ID )
            {
            // InternalSequence.g:7996:2: ( RULE_ID )
            // InternalSequence.g:7997:3: RULE_ID
            {
             before(grammarAccess.getDestructionMessageAccess().getAliasIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestructionMessageAccess().getAliasIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__AliasAssignment_7_1"


    // $ANTLR start "rule__DestructionMessage__SendEventAssignment_8"
    // InternalSequence.g:8006:1: rule__DestructionMessage__SendEventAssignment_8 : ( ruleImplicitSendOccurenceSpecification ) ;
    public final void rule__DestructionMessage__SendEventAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8010:1: ( ( ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:8011:2: ( ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:8011:2: ( ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:8012:3: ruleImplicitSendOccurenceSpecification
            {
             before(grammarAccess.getDestructionMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitSendOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getDestructionMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__SendEventAssignment_8"


    // $ANTLR start "rule__DestructionMessage__ArrivalEventAssignment_9_0"
    // InternalSequence.g:8021:1: rule__DestructionMessage__ArrivalEventAssignment_9_0 : ( ruleExplicitArrivalOccurenceReference ) ;
    public final void rule__DestructionMessage__ArrivalEventAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8025:1: ( ( ruleExplicitArrivalOccurenceReference ) )
            // InternalSequence.g:8026:2: ( ruleExplicitArrivalOccurenceReference )
            {
            // InternalSequence.g:8026:2: ( ruleExplicitArrivalOccurenceReference )
            // InternalSequence.g:8027:3: ruleExplicitArrivalOccurenceReference
            {
             before(grammarAccess.getDestructionMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExplicitArrivalOccurenceReference();

            state._fsp--;

             after(grammarAccess.getDestructionMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__ArrivalEventAssignment_9_0"


    // $ANTLR start "rule__DestructionMessage__ArrivalEventAssignment_9_1"
    // InternalSequence.g:8036:1: rule__DestructionMessage__ArrivalEventAssignment_9_1 : ( ruleImplicitArrivalOccurenceSpecification ) ;
    public final void rule__DestructionMessage__ArrivalEventAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8040:1: ( ( ruleImplicitArrivalOccurenceSpecification ) )
            // InternalSequence.g:8041:2: ( ruleImplicitArrivalOccurenceSpecification )
            {
            // InternalSequence.g:8041:2: ( ruleImplicitArrivalOccurenceSpecification )
            // InternalSequence.g:8042:3: ruleImplicitArrivalOccurenceSpecification
            {
             before(grammarAccess.getDestructionMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImplicitArrivalOccurenceSpecification();

            state._fsp--;

             after(grammarAccess.getDestructionMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestructionMessage__ArrivalEventAssignment_9_1"


    // $ANTLR start "rule__DestructionOccurenceSpecification__TargetAssignment_1"
    // InternalSequence.g:8051:1: rule__DestructionOccurenceSpecification__TargetAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DestructionOccurenceSpecification__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8055:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:8056:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:8056:2: ( ( ruleFQN ) )
            // InternalSequence.g:8057:3: ( ruleFQN )
            {
             before(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetActorCrossReference_1_0()); 
            // InternalSequence.g:8058:3: ( ruleFQN )
            // InternalSequence.g:8059:4: ruleFQN
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
    // InternalSequence.g:8070:1: rule__Parallel__RegionsAssignment_2 : ( ruleOrderedFragmentContainer ) ;
    public final void rule__Parallel__RegionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8074:1: ( ( ruleOrderedFragmentContainer ) )
            // InternalSequence.g:8075:2: ( ruleOrderedFragmentContainer )
            {
            // InternalSequence.g:8075:2: ( ruleOrderedFragmentContainer )
            // InternalSequence.g:8076:3: ruleOrderedFragmentContainer
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
    // InternalSequence.g:8085:1: rule__Alternative__RegionsAssignment_2 : ( ruleOrderedFragmentContainerWithCondition ) ;
    public final void rule__Alternative__RegionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8089:1: ( ( ruleOrderedFragmentContainerWithCondition ) )
            // InternalSequence.g:8090:2: ( ruleOrderedFragmentContainerWithCondition )
            {
            // InternalSequence.g:8090:2: ( ruleOrderedFragmentContainerWithCondition )
            // InternalSequence.g:8091:3: ruleOrderedFragmentContainerWithCondition
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
    // InternalSequence.g:8100:1: rule__Loop__RegionAssignment_1 : ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ;
    public final void rule__Loop__RegionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8104:1: ( ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) )
            // InternalSequence.g:8105:2: ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            {
            // InternalSequence.g:8105:2: ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            // InternalSequence.g:8106:3: ruleOrderedFragmentContainerWithConditionMandatoryBrackets
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
    // InternalSequence.g:8115:1: rule__Option__RegionAssignment_1 : ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ;
    public final void rule__Option__RegionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8119:1: ( ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) )
            // InternalSequence.g:8120:2: ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            {
            // InternalSequence.g:8120:2: ( ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            // InternalSequence.g:8121:3: ruleOrderedFragmentContainerWithConditionMandatoryBrackets
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
    // InternalSequence.g:8130:1: rule__Critical__RegionAssignment_2 : ( ruleOneOrMultipleFragments ) ;
    public final void rule__Critical__RegionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8134:1: ( ( ruleOneOrMultipleFragments ) )
            // InternalSequence.g:8135:2: ( ruleOneOrMultipleFragments )
            {
            // InternalSequence.g:8135:2: ( ruleOneOrMultipleFragments )
            // InternalSequence.g:8136:3: ruleOneOrMultipleFragments
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
    // InternalSequence.g:8145:1: rule__Reference__ReferenceAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Reference__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8149:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:8150:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:8150:2: ( ( ruleFQN ) )
            // InternalSequence.g:8151:3: ( ruleFQN )
            {
             before(grammarAccess.getReferenceAccess().getReferenceInteractionCrossReference_1_0()); 
            // InternalSequence.g:8152:3: ( ruleFQN )
            // InternalSequence.g:8153:4: ruleFQN
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
    // InternalSequence.g:8164:1: rule__Reference__AliasAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Reference__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8168:1: ( ( RULE_ID ) )
            // InternalSequence.g:8169:2: ( RULE_ID )
            {
            // InternalSequence.g:8169:2: ( RULE_ID )
            // InternalSequence.g:8170:3: RULE_ID
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
    // InternalSequence.g:8179:1: rule__TimeConstraint__EventAssignment_1 : ( rulePointInTimeSelector ) ;
    public final void rule__TimeConstraint__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8183:1: ( ( rulePointInTimeSelector ) )
            // InternalSequence.g:8184:2: ( rulePointInTimeSelector )
            {
            // InternalSequence.g:8184:2: ( rulePointInTimeSelector )
            // InternalSequence.g:8185:3: rulePointInTimeSelector
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
    // InternalSequence.g:8194:1: rule__TimeConstraint__TimeAssignment_5 : ( ruleUnescapedString ) ;
    public final void rule__TimeConstraint__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8198:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:8199:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:8199:2: ( ruleUnescapedString )
            // InternalSequence.g:8200:3: ruleUnescapedString
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
    // InternalSequence.g:8209:1: rule__DurationConstraint__IntervalAssignment_1 : ( ruleTimeIntervalSelector ) ;
    public final void rule__DurationConstraint__IntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8213:1: ( ( ruleTimeIntervalSelector ) )
            // InternalSequence.g:8214:2: ( ruleTimeIntervalSelector )
            {
            // InternalSequence.g:8214:2: ( ruleTimeIntervalSelector )
            // InternalSequence.g:8215:3: ruleTimeIntervalSelector
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
    // InternalSequence.g:8224:1: rule__DurationConstraint__DurationAssignment_5 : ( ruleUnescapedString ) ;
    public final void rule__DurationConstraint__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8228:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:8229:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:8229:2: ( ruleUnescapedString )
            // InternalSequence.g:8230:3: ruleUnescapedString
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
    // InternalSequence.g:8239:1: rule__TimeObservation__EventAssignment_1 : ( rulePointInTimeSelector ) ;
    public final void rule__TimeObservation__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8243:1: ( ( rulePointInTimeSelector ) )
            // InternalSequence.g:8244:2: ( rulePointInTimeSelector )
            {
            // InternalSequence.g:8244:2: ( rulePointInTimeSelector )
            // InternalSequence.g:8245:3: rulePointInTimeSelector
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
    // InternalSequence.g:8254:1: rule__TimeObservation__TimeAssignment_5 : ( ruleUnescapedString ) ;
    public final void rule__TimeObservation__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8258:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:8259:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:8259:2: ( ruleUnescapedString )
            // InternalSequence.g:8260:3: ruleUnescapedString
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
    // InternalSequence.g:8269:1: rule__DurationObservation__IntervalAssignment_1 : ( ruleTimeIntervalSelector ) ;
    public final void rule__DurationObservation__IntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8273:1: ( ( ruleTimeIntervalSelector ) )
            // InternalSequence.g:8274:2: ( ruleTimeIntervalSelector )
            {
            // InternalSequence.g:8274:2: ( ruleTimeIntervalSelector )
            // InternalSequence.g:8275:3: ruleTimeIntervalSelector
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
    // InternalSequence.g:8284:1: rule__DurationObservation__DurationAssignment_5 : ( ruleUnescapedString ) ;
    public final void rule__DurationObservation__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8288:1: ( ( ruleUnescapedString ) )
            // InternalSequence.g:8289:2: ( ruleUnescapedString )
            {
            // InternalSequence.g:8289:2: ( ruleUnescapedString )
            // InternalSequence.g:8290:3: ruleUnescapedString
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
    // InternalSequence.g:8299:1: rule__PointInTimeSelector__PointInTimeAssignment : ( ( ruleFQN ) ) ;
    public final void rule__PointInTimeSelector__PointInTimeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8303:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:8304:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:8304:2: ( ( ruleFQN ) )
            // InternalSequence.g:8305:3: ( ruleFQN )
            {
             before(grammarAccess.getPointInTimeSelectorAccess().getPointInTimeAliasedPointInTimeCrossReference_0()); 
            // InternalSequence.g:8306:3: ( ruleFQN )
            // InternalSequence.g:8307:4: ruleFQN
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
    // InternalSequence.g:8318:1: rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0 : ( rulePointInTimeSelector ) ;
    public final void rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8322:1: ( ( rulePointInTimeSelector ) )
            // InternalSequence.g:8323:2: ( rulePointInTimeSelector )
            {
            // InternalSequence.g:8323:2: ( rulePointInTimeSelector )
            // InternalSequence.g:8324:3: rulePointInTimeSelector
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
    // InternalSequence.g:8333:1: rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2 : ( rulePointInTimeSelector ) ;
    public final void rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8337:1: ( ( rulePointInTimeSelector ) )
            // InternalSequence.g:8338:2: ( rulePointInTimeSelector )
            {
            // InternalSequence.g:8338:2: ( rulePointInTimeSelector )
            // InternalSequence.g:8339:3: rulePointInTimeSelector
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
    // InternalSequence.g:8348:1: rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment : ( ( ruleFQN ) ) ;
    public final void rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8352:1: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:8353:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:8353:2: ( ( ruleFQN ) )
            // InternalSequence.g:8354:3: ( ruleFQN )
            {
             before(grammarAccess.getFragmentTimeIntervalSelectorAccess().getNonInstantaneousFragmentNonInstantaneousFragmentCrossReference_0()); 
            // InternalSequence.g:8355:3: ( ruleFQN )
            // InternalSequence.g:8356:4: ruleFQN
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
    // InternalSequence.g:8367:1: rule__InlineComment__BodyAssignment_2 : ( ruleCommentBody ) ;
    public final void rule__InlineComment__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSequence.g:8371:1: ( ( ruleCommentBody ) )
            // InternalSequence.g:8372:2: ( ruleCommentBody )
            {
            // InternalSequence.g:8372:2: ( ruleCommentBody )
            // InternalSequence.g:8373:3: ruleCommentBody
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


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\35\1\5\1\36\1\5\1\uffff\1\54\1\36\1\uffff";
    static final String dfa_3s = "\1\35\1\5\1\57\1\5\1\uffff\1\55\1\57\1\uffff";
    static final String dfa_4s = "\4\uffff\1\2\2\uffff\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\5\17\uffff\1\3",
            "\1\6",
            "",
            "\1\7\1\4",
            "\1\4\1\5\17\uffff\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1671:1: rule__Constraint__Alternatives_1 : ( ( ruleTimeConstraint ) | ( ruleDurationConstraint ) );";
        }
    }
    static final String dfa_7s = "\1\35\1\5\1\36\1\5\1\54\1\uffff\1\36\1\uffff";
    static final String dfa_8s = "\1\35\1\5\1\57\1\5\1\55\1\uffff\1\57\1\uffff";
    static final String dfa_9s = "\5\uffff\1\2\1\uffff\1\1";
    static final String[] dfa_10s = {
            "\1\1",
            "\1\2",
            "\1\5\1\4\17\uffff\1\3",
            "\1\6",
            "\1\7\1\5",
            "",
            "\1\5\1\4\17\uffff\1\3",
            ""
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "1692:1: rule__Observation__Alternatives_1 : ( ( ruleTimeObservation ) | ( ruleDurationObservation ) );";
        }
    }
    static final String dfa_11s = "\6\uffff";
    static final String dfa_12s = "\1\uffff\1\3\3\uffff\1\3";
    static final String dfa_13s = "\1\5\1\36\1\5\2\uffff\1\36";
    static final String dfa_14s = "\1\5\1\57\1\5\2\uffff\1\57";
    static final String dfa_15s = "\3\uffff\1\2\1\1\1\uffff";
    static final String dfa_16s = "\6\uffff}>";
    static final String[] dfa_17s = {
            "\1\1",
            "\1\4\1\3\17\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\4\1\3\17\uffff\1\2"
    };

    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_11;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1713:1: rule__TimeIntervalSelector__Alternatives : ( ( ruleBiPointInTimeTimeIntervalSelector ) | ( ruleFragmentTimeIntervalSelector ) );";
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
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
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