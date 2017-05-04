package de.cooperateproject.modeling.textual.sequence.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cooperateproject.modeling.textual.sequence.services.SequenceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSequenceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-seqd'", "'@end-seqd'", "'rootElement'", "'act'", "'deferred'", "':'", "'as'", "'role['", "']'", "'num['", "'time['", "'='", "'('", "','", "')'", "'resp'", "'_'", "'found'", "'lost'", "'create'", "'dest'", "'alt'", "'{'", "'}'", "'opt'", "'par'", "'critical'", "'loop'", "'['", "'.'", "'sync'", "'async'", "'human'", "'machine'", "'d'", "'t'", "'max'", "'diff'"
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

        public InternalSequenceParser(TokenStream input, SequenceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SequenceDiagram";
       	}

       	@Override
       	protected SequenceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSequenceDiagram"
    // InternalSequence.g:65:1: entryRuleSequenceDiagram returns [EObject current=null] : iv_ruleSequenceDiagram= ruleSequenceDiagram EOF ;
    public final EObject entryRuleSequenceDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceDiagram = null;


        try {
            // InternalSequence.g:65:56: (iv_ruleSequenceDiagram= ruleSequenceDiagram EOF )
            // InternalSequence.g:66:2: iv_ruleSequenceDiagram= ruleSequenceDiagram EOF
            {
             newCompositeNode(grammarAccess.getSequenceDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceDiagram=ruleSequenceDiagram();

            state._fsp--;

             current =iv_ruleSequenceDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceDiagram"


    // $ANTLR start "ruleSequenceDiagram"
    // InternalSequence.g:72:1: ruleSequenceDiagram returns [EObject current=null] : ( () otherlv_1= '@start-seqd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-seqd' ) ;
    public final EObject ruleSequenceDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_4=null;
        EObject lv_rootPackage_3_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:78:2: ( ( () otherlv_1= '@start-seqd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-seqd' ) )
            // InternalSequence.g:79:2: ( () otherlv_1= '@start-seqd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-seqd' )
            {
            // InternalSequence.g:79:2: ( () otherlv_1= '@start-seqd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-seqd' )
            // InternalSequence.g:80:3: () otherlv_1= '@start-seqd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-seqd'
            {
            // InternalSequence.g:80:3: ()
            // InternalSequence.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceDiagramAccess().getSequenceDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceDiagramAccess().getStartSeqdKeyword_1());
            		
            // InternalSequence.g:91:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalSequence.g:92:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalSequence.g:92:4: (lv_title_2_0= RULE_STRING )
            // InternalSequence.g:93:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_2_0, grammarAccess.getSequenceDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSequence.g:109:3: ( (lv_rootPackage_3_0= ruleRootPackage ) )
            // InternalSequence.g:110:4: (lv_rootPackage_3_0= ruleRootPackage )
            {
            // InternalSequence.g:110:4: (lv_rootPackage_3_0= ruleRootPackage )
            // InternalSequence.g:111:5: lv_rootPackage_3_0= ruleRootPackage
            {

            					newCompositeNode(grammarAccess.getSequenceDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_rootPackage_3_0=ruleRootPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceDiagramRule());
            					}
            					set(
            						current,
            						"rootPackage",
            						lv_rootPackage_3_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.RootPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSequenceDiagramAccess().getEndSeqdKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceDiagram"


    // $ANTLR start "entryRuleRootPackage"
    // InternalSequence.g:136:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalSequence.g:136:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalSequence.g:137:2: iv_ruleRootPackage= ruleRootPackage EOF
            {
             newCompositeNode(grammarAccess.getRootPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootPackage=ruleRootPackage();

            state._fsp--;

             current =iv_ruleRootPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootPackage"


    // $ANTLR start "ruleRootPackage"
    // InternalSequence.g:143:1: ruleRootPackage returns [EObject current=null] : (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actors_2_0 = null;

        EObject lv_interactionFragments_3_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:149:2: ( (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )* ) )
            // InternalSequence.g:150:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )* )
            {
            // InternalSequence.g:150:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )* )
            // InternalSequence.g:151:3: otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRootPackageAccess().getRootElementKeyword_0());
            		
            // InternalSequence.g:155:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalSequence.g:156:4: (lv_name_1_0= ruleFQN )
            {
            // InternalSequence.g:156:4: (lv_name_1_0= ruleFQN )
            // InternalSequence.g:157:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSequence.g:174:3: ( (lv_actors_2_0= ruleActor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSequence.g:175:4: (lv_actors_2_0= ruleActor )
            	    {
            	    // InternalSequence.g:175:4: (lv_actors_2_0= ruleActor )
            	    // InternalSequence.g:176:5: lv_actors_2_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getActorsActorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_actors_2_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_2_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSequence.g:193:3: ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26||(LA2_0>=28 && LA2_0<=32)||(LA2_0>=35 && LA2_0<=38)||(LA2_0>=41 && LA2_0<=42)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSequence.g:194:4: (lv_interactionFragments_3_0= ruleInteractionFragment )
            	    {
            	    // InternalSequence.g:194:4: (lv_interactionFragments_3_0= ruleInteractionFragment )
            	    // InternalSequence.g:195:5: lv_interactionFragments_3_0= ruleInteractionFragment
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getInteractionFragmentsInteractionFragmentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_interactionFragments_3_0=ruleInteractionFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interactionFragments",
            	    						lv_interactionFragments_3_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.InteractionFragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootPackage"


    // $ANTLR start "entryRuleActor"
    // InternalSequence.g:216:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalSequence.g:216:46: (iv_ruleActor= ruleActor EOF )
            // InternalSequence.g:217:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalSequence.g:223:1: ruleActor returns [EObject current=null] : (otherlv_0= 'act' ( (lv_deferred_1_0= 'deferred' ) )? ( ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) | (otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) ) | ( ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ':' ( ( ruleFQN ) ) otherlv_12= 'as' ( (lv_alias_13_0= RULE_ID ) ) ) ) (otherlv_14= 'role[' ( (lv_actorType_15_0= ruleActorType ) ) otherlv_16= ']' )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_deferred_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_alias_8_0=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_alias_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Enumerator lv_actorType_15_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:229:2: ( (otherlv_0= 'act' ( (lv_deferred_1_0= 'deferred' ) )? ( ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) | (otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) ) | ( ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ':' ( ( ruleFQN ) ) otherlv_12= 'as' ( (lv_alias_13_0= RULE_ID ) ) ) ) (otherlv_14= 'role[' ( (lv_actorType_15_0= ruleActorType ) ) otherlv_16= ']' )? ) )
            // InternalSequence.g:230:2: (otherlv_0= 'act' ( (lv_deferred_1_0= 'deferred' ) )? ( ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) | (otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) ) | ( ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ':' ( ( ruleFQN ) ) otherlv_12= 'as' ( (lv_alias_13_0= RULE_ID ) ) ) ) (otherlv_14= 'role[' ( (lv_actorType_15_0= ruleActorType ) ) otherlv_16= ']' )? )
            {
            // InternalSequence.g:230:2: (otherlv_0= 'act' ( (lv_deferred_1_0= 'deferred' ) )? ( ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) | (otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) ) | ( ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ':' ( ( ruleFQN ) ) otherlv_12= 'as' ( (lv_alias_13_0= RULE_ID ) ) ) ) (otherlv_14= 'role[' ( (lv_actorType_15_0= ruleActorType ) ) otherlv_16= ']' )? )
            // InternalSequence.g:231:3: otherlv_0= 'act' ( (lv_deferred_1_0= 'deferred' ) )? ( ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) | (otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) ) | ( ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ':' ( ( ruleFQN ) ) otherlv_12= 'as' ( (lv_alias_13_0= RULE_ID ) ) ) ) (otherlv_14= 'role[' ( (lv_actorType_15_0= ruleActorType ) ) otherlv_16= ']' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActKeyword_0());
            		
            // InternalSequence.g:235:3: ( (lv_deferred_1_0= 'deferred' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSequence.g:236:4: (lv_deferred_1_0= 'deferred' )
                    {
                    // InternalSequence.g:236:4: (lv_deferred_1_0= 'deferred' )
                    // InternalSequence.g:237:5: lv_deferred_1_0= 'deferred'
                    {
                    lv_deferred_1_0=(Token)match(input,15,FOLLOW_10); 

                    					newLeafNode(lv_deferred_1_0, grammarAccess.getActorAccess().getDeferredDeferredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActorRule());
                    					}
                    					setWithLastConsumed(current, "deferred", true, "deferred");
                    				

                    }


                    }
                    break;

            }

            // InternalSequence.g:249:3: ( ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) | (otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) ) | ( ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ':' ( ( ruleFQN ) ) otherlv_12= 'as' ( (lv_alias_13_0= RULE_ID ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSequence.g:250:4: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
                    {
                    // InternalSequence.g:250:4: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
                    // InternalSequence.g:251:5: ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    // InternalSequence.g:251:5: ( (lv_name_2_0= RULE_ID ) )
                    // InternalSequence.g:252:6: (lv_name_2_0= RULE_ID )
                    {
                    // InternalSequence.g:252:6: (lv_name_2_0= RULE_ID )
                    // InternalSequence.g:253:7: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    							newLeafNode(lv_name_2_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getActorAccess().getColonKeyword_2_0_1());
                    				
                    // InternalSequence.g:273:5: ( ( ruleFQN ) )
                    // InternalSequence.g:274:6: ( ruleFQN )
                    {
                    // InternalSequence.g:274:6: ( ruleFQN )
                    // InternalSequence.g:275:7: ruleFQN
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_0_2_0());
                    						
                    pushFollow(FOLLOW_12);
                    ruleFQN();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:291:4: (otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )
                    {
                    // InternalSequence.g:291:4: (otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )
                    // InternalSequence.g:292:5: otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getActorAccess().getColonKeyword_2_1_0());
                    				
                    // InternalSequence.g:296:5: ( ( ruleFQN ) )
                    // InternalSequence.g:297:6: ( ruleFQN )
                    {
                    // InternalSequence.g:297:6: ( ruleFQN )
                    // InternalSequence.g:298:7: ruleFQN
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_1_1_0());
                    						
                    pushFollow(FOLLOW_13);
                    ruleFQN();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_6); 

                    					newLeafNode(otherlv_7, grammarAccess.getActorAccess().getAsKeyword_2_1_2());
                    				
                    // InternalSequence.g:316:5: ( (lv_alias_8_0= RULE_ID ) )
                    // InternalSequence.g:317:6: (lv_alias_8_0= RULE_ID )
                    {
                    // InternalSequence.g:317:6: (lv_alias_8_0= RULE_ID )
                    // InternalSequence.g:318:7: lv_alias_8_0= RULE_ID
                    {
                    lv_alias_8_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    							newLeafNode(lv_alias_8_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_1_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_8_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:336:4: ( ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ':' ( ( ruleFQN ) ) otherlv_12= 'as' ( (lv_alias_13_0= RULE_ID ) ) )
                    {
                    // InternalSequence.g:336:4: ( ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ':' ( ( ruleFQN ) ) otherlv_12= 'as' ( (lv_alias_13_0= RULE_ID ) ) )
                    // InternalSequence.g:337:5: ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= ':' ( ( ruleFQN ) ) otherlv_12= 'as' ( (lv_alias_13_0= RULE_ID ) )
                    {
                    // InternalSequence.g:337:5: ( (lv_name_9_0= RULE_STRING ) )
                    // InternalSequence.g:338:6: (lv_name_9_0= RULE_STRING )
                    {
                    // InternalSequence.g:338:6: (lv_name_9_0= RULE_STRING )
                    // InternalSequence.g:339:7: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    							newLeafNode(lv_name_9_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_2_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_9_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getActorAccess().getColonKeyword_2_2_1());
                    				
                    // InternalSequence.g:359:5: ( ( ruleFQN ) )
                    // InternalSequence.g:360:6: ( ruleFQN )
                    {
                    // InternalSequence.g:360:6: ( ruleFQN )
                    // InternalSequence.g:361:7: ruleFQN
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_2_2_0());
                    						
                    pushFollow(FOLLOW_13);
                    ruleFQN();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_6); 

                    					newLeafNode(otherlv_12, grammarAccess.getActorAccess().getAsKeyword_2_2_3());
                    				
                    // InternalSequence.g:379:5: ( (lv_alias_13_0= RULE_ID ) )
                    // InternalSequence.g:380:6: (lv_alias_13_0= RULE_ID )
                    {
                    // InternalSequence.g:380:6: (lv_alias_13_0= RULE_ID )
                    // InternalSequence.g:381:7: lv_alias_13_0= RULE_ID
                    {
                    lv_alias_13_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    							newLeafNode(lv_alias_13_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_2_4_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_13_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSequence.g:399:3: (otherlv_14= 'role[' ( (lv_actorType_15_0= ruleActorType ) ) otherlv_16= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSequence.g:400:4: otherlv_14= 'role[' ( (lv_actorType_15_0= ruleActorType ) ) otherlv_16= ']'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getActorAccess().getRoleKeyword_3_0());
                    			
                    // InternalSequence.g:404:4: ( (lv_actorType_15_0= ruleActorType ) )
                    // InternalSequence.g:405:5: (lv_actorType_15_0= ruleActorType )
                    {
                    // InternalSequence.g:405:5: (lv_actorType_15_0= ruleActorType )
                    // InternalSequence.g:406:6: lv_actorType_15_0= ruleActorType
                    {

                    						newCompositeNode(grammarAccess.getActorAccess().getActorTypeActorTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_actorType_15_0=ruleActorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActorRule());
                    						}
                    						set(
                    							current,
                    							"actorType",
                    							lv_actorType_15_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.ActorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getActorAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleInteractionFragment"
    // InternalSequence.g:432:1: entryRuleInteractionFragment returns [EObject current=null] : iv_ruleInteractionFragment= ruleInteractionFragment EOF ;
    public final EObject entryRuleInteractionFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionFragment = null;


        try {
            // InternalSequence.g:432:60: (iv_ruleInteractionFragment= ruleInteractionFragment EOF )
            // InternalSequence.g:433:2: iv_ruleInteractionFragment= ruleInteractionFragment EOF
            {
             newCompositeNode(grammarAccess.getInteractionFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteractionFragment=ruleInteractionFragment();

            state._fsp--;

             current =iv_ruleInteractionFragment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractionFragment"


    // $ANTLR start "ruleInteractionFragment"
    // InternalSequence.g:439:1: ruleInteractionFragment returns [EObject current=null] : (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment ) ;
    public final EObject ruleInteractionFragment() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_OccurenceSpecification_1 = null;

        EObject this_CombinedFragment_2 = null;



        	enterRule();

        try {
            // InternalSequence.g:445:2: ( (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment ) )
            // InternalSequence.g:446:2: (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment )
            {
            // InternalSequence.g:446:2: (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 26:
            case 28:
            case 29:
            case 30:
            case 41:
            case 42:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_STRING||LA6_2==23) ) {
                    alt6=1;
                }
                else if ( (LA6_2==RULE_ID) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 32:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSequence.g:447:3: this_Message_0= ruleMessage
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Message_0=ruleMessage();

                    state._fsp--;


                    			current = this_Message_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:456:3: this_OccurenceSpecification_1= ruleOccurenceSpecification
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getOccurenceSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OccurenceSpecification_1=ruleOccurenceSpecification();

                    state._fsp--;


                    			current = this_OccurenceSpecification_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSequence.g:465:3: this_CombinedFragment_2= ruleCombinedFragment
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getCombinedFragmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CombinedFragment_2=ruleCombinedFragment();

                    state._fsp--;


                    			current = this_CombinedFragment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteractionFragment"


    // $ANTLR start "entryRuleMessage"
    // InternalSequence.g:477:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalSequence.g:477:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalSequence.g:478:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalSequence.g:484:1: ruleMessage returns [EObject current=null] : ( (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )? ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )? ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_StandardMessage_0 = null;

        EObject this_ResponseMessage_1 = null;

        EObject this_FoundMessage_2 = null;

        EObject this_LostMessage_3 = null;

        EObject this_CreateMessage_4 = null;

        EObject this_DestructionMessage_5 = null;

        AntlrDatatypeRuleToken lv_order_7_0 = null;

        EObject lv_timeConstraint_9_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:490:2: ( ( (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )? ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )? ) )
            // InternalSequence.g:491:2: ( (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )? ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )? )
            {
            // InternalSequence.g:491:2: ( (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )? ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )? )
            // InternalSequence.g:492:3: (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )? ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )?
            {
            // InternalSequence.g:492:3: (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage )
            int alt7=6;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSequence.g:493:4: this_StandardMessage_0= ruleStandardMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getStandardMessageParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_16);
                    this_StandardMessage_0=ruleStandardMessage();

                    state._fsp--;


                    				current = this_StandardMessage_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSequence.g:502:4: this_ResponseMessage_1= ruleResponseMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getResponseMessageParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_ResponseMessage_1=ruleResponseMessage();

                    state._fsp--;


                    				current = this_ResponseMessage_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalSequence.g:511:4: this_FoundMessage_2= ruleFoundMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_16);
                    this_FoundMessage_2=ruleFoundMessage();

                    state._fsp--;


                    				current = this_FoundMessage_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalSequence.g:520:4: this_LostMessage_3= ruleLostMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getLostMessageParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_16);
                    this_LostMessage_3=ruleLostMessage();

                    state._fsp--;


                    				current = this_LostMessage_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalSequence.g:529:4: this_CreateMessage_4= ruleCreateMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getCreateMessageParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_16);
                    this_CreateMessage_4=ruleCreateMessage();

                    state._fsp--;


                    				current = this_CreateMessage_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalSequence.g:538:4: this_DestructionMessage_5= ruleDestructionMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getDestructionMessageParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_16);
                    this_DestructionMessage_5=ruleDestructionMessage();

                    state._fsp--;


                    				current = this_DestructionMessage_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalSequence.g:547:3: (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSequence.g:548:4: otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getNumKeyword_1_0());
                    			
                    // InternalSequence.g:552:4: ( (lv_order_7_0= ruleOrder ) )
                    // InternalSequence.g:553:5: (lv_order_7_0= ruleOrder )
                    {
                    // InternalSequence.g:553:5: (lv_order_7_0= ruleOrder )
                    // InternalSequence.g:554:6: lv_order_7_0= ruleOrder
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getOrderOrderParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_order_7_0=ruleOrder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageRule());
                    						}
                    						set(
                    							current,
                    							"order",
                    							lv_order_7_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.Order");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalSequence.g:576:3: ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSequence.g:577:4: (lv_timeConstraint_9_0= ruleTimeConstraint )
                    {
                    // InternalSequence.g:577:4: (lv_timeConstraint_9_0= ruleTimeConstraint )
                    // InternalSequence.g:578:5: lv_timeConstraint_9_0= ruleTimeConstraint
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getTimeConstraintTimeConstraintParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_timeConstraint_9_0=ruleTimeConstraint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageRule());
                    					}
                    					set(
                    						current,
                    						"timeConstraint",
                    						lv_timeConstraint_9_0,
                    						"de.cooperateproject.modeling.textual.sequence.Sequence.TimeConstraint");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleTimeConstraint"
    // InternalSequence.g:599:1: entryRuleTimeConstraint returns [EObject current=null] : iv_ruleTimeConstraint= ruleTimeConstraint EOF ;
    public final EObject entryRuleTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeConstraint = null;


        try {
            // InternalSequence.g:599:55: (iv_ruleTimeConstraint= ruleTimeConstraint EOF )
            // InternalSequence.g:600:2: iv_ruleTimeConstraint= ruleTimeConstraint EOF
            {
             newCompositeNode(grammarAccess.getTimeConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeConstraint=ruleTimeConstraint();

            state._fsp--;

             current =iv_ruleTimeConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeConstraint"


    // $ANTLR start "ruleTimeConstraint"
    // InternalSequence.g:606:1: ruleTimeConstraint returns [EObject current=null] : (otherlv_0= 'time[' ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+ otherlv_2= ']' ) ;
    public final EObject ruleTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:612:2: ( (otherlv_0= 'time[' ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+ otherlv_2= ']' ) )
            // InternalSequence.g:613:2: (otherlv_0= 'time[' ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+ otherlv_2= ']' )
            {
            // InternalSequence.g:613:2: (otherlv_0= 'time[' ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+ otherlv_2= ']' )
            // InternalSequence.g:614:3: otherlv_0= 'time[' ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeConstraintAccess().getTimeKeyword_0());
            		
            // InternalSequence.g:618:3: ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=45 && LA10_0<=48)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSequence.g:619:4: (lv_constraints_1_0= ruleInnerTimeConstraint )
            	    {
            	    // InternalSequence.g:619:4: (lv_constraints_1_0= ruleInnerTimeConstraint )
            	    // InternalSequence.g:620:5: lv_constraints_1_0= ruleInnerTimeConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getTimeConstraintAccess().getConstraintsInnerTimeConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_constraints_1_0=ruleInnerTimeConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTimeConstraintRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_1_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.InnerTimeConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeConstraint"


    // $ANTLR start "entryRuleInnerTimeConstraint"
    // InternalSequence.g:645:1: entryRuleInnerTimeConstraint returns [EObject current=null] : iv_ruleInnerTimeConstraint= ruleInnerTimeConstraint EOF ;
    public final EObject entryRuleInnerTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerTimeConstraint = null;


        try {
            // InternalSequence.g:645:60: (iv_ruleInnerTimeConstraint= ruleInnerTimeConstraint EOF )
            // InternalSequence.g:646:2: iv_ruleInnerTimeConstraint= ruleInnerTimeConstraint EOF
            {
             newCompositeNode(grammarAccess.getInnerTimeConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerTimeConstraint=ruleInnerTimeConstraint();

            state._fsp--;

             current =iv_ruleInnerTimeConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInnerTimeConstraint"


    // $ANTLR start "ruleInnerTimeConstraint"
    // InternalSequence.g:652:1: ruleInnerTimeConstraint returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeConstraintType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInnerTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:658:2: ( ( ( (lv_type_0_0= ruleTimeConstraintType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalSequence.g:659:2: ( ( (lv_type_0_0= ruleTimeConstraintType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalSequence.g:659:2: ( ( (lv_type_0_0= ruleTimeConstraintType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalSequence.g:660:3: ( (lv_type_0_0= ruleTimeConstraintType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalSequence.g:660:3: ( (lv_type_0_0= ruleTimeConstraintType ) )
            // InternalSequence.g:661:4: (lv_type_0_0= ruleTimeConstraintType )
            {
            // InternalSequence.g:661:4: (lv_type_0_0= ruleTimeConstraintType )
            // InternalSequence.g:662:5: lv_type_0_0= ruleTimeConstraintType
            {

            					newCompositeNode(grammarAccess.getInnerTimeConstraintAccess().getTypeTimeConstraintTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_type_0_0=ruleTimeConstraintType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInnerTimeConstraintRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.TimeConstraintType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInnerTimeConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalSequence.g:683:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalSequence.g:684:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalSequence.g:684:4: (lv_value_2_0= RULE_STRING )
            // InternalSequence.g:685:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getInnerTimeConstraintAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInnerTimeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInnerTimeConstraint"


    // $ANTLR start "entryRuleStandardMessage"
    // InternalSequence.g:705:1: entryRuleStandardMessage returns [EObject current=null] : iv_ruleStandardMessage= ruleStandardMessage EOF ;
    public final EObject entryRuleStandardMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardMessage = null;


        try {
            // InternalSequence.g:705:56: (iv_ruleStandardMessage= ruleStandardMessage EOF )
            // InternalSequence.g:706:2: iv_ruleStandardMessage= ruleStandardMessage EOF
            {
             newCompositeNode(grammarAccess.getStandardMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStandardMessage=ruleStandardMessage();

            state._fsp--;

             current =iv_ruleStandardMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStandardMessage"


    // $ANTLR start "ruleStandardMessage"
    // InternalSequence.g:712:1: ruleStandardMessage returns [EObject current=null] : ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) ;
    public final EObject ruleStandardMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:718:2: ( ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) )
            // InternalSequence.g:719:2: ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            {
            // InternalSequence.g:719:2: ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            // InternalSequence.g:720:3: ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')'
            {
            // InternalSequence.g:720:3: ( (lv_type_0_0= ruleMessageType ) )
            // InternalSequence.g:721:4: (lv_type_0_0= ruleMessageType )
            {
            // InternalSequence.g:721:4: (lv_type_0_0= ruleMessageType )
            // InternalSequence.g:722:5: lv_type_0_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getStandardMessageAccess().getTypeMessageTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStandardMessageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.MessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSequence.g:739:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSequence.g:740:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSequence.g:740:4: (lv_name_1_0= RULE_STRING )
            // InternalSequence.g:741:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStandardMessageAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStandardMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:761:3: ( ( ruleFQN ) )
            // InternalSequence.g:762:4: ( ruleFQN )
            {
            // InternalSequence.g:762:4: ( ruleFQN )
            // InternalSequence.g:763:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStandardMessageAccess().getLeftActorCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getStandardMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:781:3: ( ( ruleFQN ) )
            // InternalSequence.g:782:4: ( ruleFQN )
            {
            // InternalSequence.g:782:4: ( ruleFQN )
            // InternalSequence.g:783:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStandardMessageAccess().getRightActorCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStandardMessageAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStandardMessage"


    // $ANTLR start "entryRuleResponseMessage"
    // InternalSequence.g:805:1: entryRuleResponseMessage returns [EObject current=null] : iv_ruleResponseMessage= ruleResponseMessage EOF ;
    public final EObject entryRuleResponseMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseMessage = null;


        try {
            // InternalSequence.g:805:56: (iv_ruleResponseMessage= ruleResponseMessage EOF )
            // InternalSequence.g:806:2: iv_ruleResponseMessage= ruleResponseMessage EOF
            {
             newCompositeNode(grammarAccess.getResponseMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponseMessage=ruleResponseMessage();

            state._fsp--;

             current =iv_ruleResponseMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponseMessage"


    // $ANTLR start "ruleResponseMessage"
    // InternalSequence.g:812:1: ruleResponseMessage returns [EObject current=null] : (otherlv_0= 'resp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' ) ;
    public final EObject ruleResponseMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalSequence.g:818:2: ( (otherlv_0= 'resp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' ) )
            // InternalSequence.g:819:2: (otherlv_0= 'resp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' )
            {
            // InternalSequence.g:819:2: (otherlv_0= 'resp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' )
            // InternalSequence.g:820:3: otherlv_0= 'resp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseMessageAccess().getRespKeyword_0());
            		
            // InternalSequence.g:824:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSequence.g:825:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSequence.g:825:4: (lv_name_1_0= RULE_STRING )
            // InternalSequence.g:826:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getResponseMessageAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResponseMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getResponseMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:846:3: ( ( ( ruleFQN ) ) | otherlv_4= '_' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSequence.g:847:4: ( ( ruleFQN ) )
                    {
                    // InternalSequence.g:847:4: ( ( ruleFQN ) )
                    // InternalSequence.g:848:5: ( ruleFQN )
                    {
                    // InternalSequence.g:848:5: ( ruleFQN )
                    // InternalSequence.g:849:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResponseMessageAccess().getLeftActorCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:864:4: otherlv_4= '_'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getResponseMessageAccess().get_Keyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getResponseMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:873:3: ( ( ( ruleFQN ) ) | otherlv_7= '_' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSequence.g:874:4: ( ( ruleFQN ) )
                    {
                    // InternalSequence.g:874:4: ( ( ruleFQN ) )
                    // InternalSequence.g:875:5: ( ruleFQN )
                    {
                    // InternalSequence.g:875:5: ( ruleFQN )
                    // InternalSequence.g:876:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResponseMessageAccess().getRightActorCrossReference_5_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:891:4: otherlv_7= '_'
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getResponseMessageAccess().get_Keyword_5_1());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getResponseMessageAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponseMessage"


    // $ANTLR start "entryRuleFoundMessage"
    // InternalSequence.g:904:1: entryRuleFoundMessage returns [EObject current=null] : iv_ruleFoundMessage= ruleFoundMessage EOF ;
    public final EObject entryRuleFoundMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoundMessage = null;


        try {
            // InternalSequence.g:904:53: (iv_ruleFoundMessage= ruleFoundMessage EOF )
            // InternalSequence.g:905:2: iv_ruleFoundMessage= ruleFoundMessage EOF
            {
             newCompositeNode(grammarAccess.getFoundMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoundMessage=ruleFoundMessage();

            state._fsp--;

             current =iv_ruleFoundMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFoundMessage"


    // $ANTLR start "ruleFoundMessage"
    // InternalSequence.g:911:1: ruleFoundMessage returns [EObject current=null] : ( (otherlv_0= 'found' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' ) ;
    public final EObject ruleFoundMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:917:2: ( ( (otherlv_0= 'found' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' ) )
            // InternalSequence.g:918:2: ( (otherlv_0= 'found' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' )
            {
            // InternalSequence.g:918:2: ( (otherlv_0= 'found' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' )
            // InternalSequence.g:919:3: (otherlv_0= 'found' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')'
            {
            // InternalSequence.g:919:3: (otherlv_0= 'found' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSequence.g:920:4: otherlv_0= 'found'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getFoundMessageAccess().getFoundKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSequence.g:925:3: ( (lv_type_1_0= ruleMessageType ) )
            // InternalSequence.g:926:4: (lv_type_1_0= ruleMessageType )
            {
            // InternalSequence.g:926:4: (lv_type_1_0= ruleMessageType )
            // InternalSequence.g:927:5: lv_type_1_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getFoundMessageAccess().getTypeMessageTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFoundMessageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.MessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSequence.g:944:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSequence.g:945:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSequence.g:945:4: (lv_name_2_0= RULE_STRING )
            // InternalSequence.g:946:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFoundMessageAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoundMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getFoundMessageAccess().get_Keyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getFoundMessageAccess().getCommaKeyword_5());
            		
            // InternalSequence.g:974:3: ( ( ruleFQN ) )
            // InternalSequence.g:975:4: ( ruleFQN )
            {
            // InternalSequence.g:975:4: ( ruleFQN )
            // InternalSequence.g:976:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoundMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0());
            				
            pushFollow(FOLLOW_24);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFoundMessageAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoundMessage"


    // $ANTLR start "entryRuleLostMessage"
    // InternalSequence.g:998:1: entryRuleLostMessage returns [EObject current=null] : iv_ruleLostMessage= ruleLostMessage EOF ;
    public final EObject entryRuleLostMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLostMessage = null;


        try {
            // InternalSequence.g:998:52: (iv_ruleLostMessage= ruleLostMessage EOF )
            // InternalSequence.g:999:2: iv_ruleLostMessage= ruleLostMessage EOF
            {
             newCompositeNode(grammarAccess.getLostMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLostMessage=ruleLostMessage();

            state._fsp--;

             current =iv_ruleLostMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLostMessage"


    // $ANTLR start "ruleLostMessage"
    // InternalSequence.g:1005:1: ruleLostMessage returns [EObject current=null] : ( (otherlv_0= 'lost' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' ) ;
    public final EObject ruleLostMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1011:2: ( ( (otherlv_0= 'lost' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' ) )
            // InternalSequence.g:1012:2: ( (otherlv_0= 'lost' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' )
            {
            // InternalSequence.g:1012:2: ( (otherlv_0= 'lost' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' )
            // InternalSequence.g:1013:3: (otherlv_0= 'lost' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')'
            {
            // InternalSequence.g:1013:3: (otherlv_0= 'lost' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSequence.g:1014:4: otherlv_0= 'lost'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getLostMessageAccess().getLostKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSequence.g:1019:3: ( (lv_type_1_0= ruleMessageType ) )
            // InternalSequence.g:1020:4: (lv_type_1_0= ruleMessageType )
            {
            // InternalSequence.g:1020:4: (lv_type_1_0= ruleMessageType )
            // InternalSequence.g:1021:5: lv_type_1_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getLostMessageAccess().getTypeMessageTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLostMessageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.MessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSequence.g:1038:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSequence.g:1039:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSequence.g:1039:4: (lv_name_2_0= RULE_STRING )
            // InternalSequence.g:1040:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLostMessageAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLostMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLostMessageAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSequence.g:1060:3: ( ( ruleFQN ) )
            // InternalSequence.g:1061:4: ( ruleFQN )
            {
            // InternalSequence.g:1061:4: ( ruleFQN )
            // InternalSequence.g:1062:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLostMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0());
            				
            pushFollow(FOLLOW_23);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getLostMessageAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getLostMessageAccess().get_Keyword_6());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLostMessageAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLostMessage"


    // $ANTLR start "entryRuleCreateMessage"
    // InternalSequence.g:1092:1: entryRuleCreateMessage returns [EObject current=null] : iv_ruleCreateMessage= ruleCreateMessage EOF ;
    public final EObject entryRuleCreateMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMessage = null;


        try {
            // InternalSequence.g:1092:54: (iv_ruleCreateMessage= ruleCreateMessage EOF )
            // InternalSequence.g:1093:2: iv_ruleCreateMessage= ruleCreateMessage EOF
            {
             newCompositeNode(grammarAccess.getCreateMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateMessage=ruleCreateMessage();

            state._fsp--;

             current =iv_ruleCreateMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateMessage"


    // $ANTLR start "ruleCreateMessage"
    // InternalSequence.g:1099:1: ruleCreateMessage returns [EObject current=null] : (otherlv_0= 'create' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) ;
    public final EObject ruleCreateMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSequence.g:1105:2: ( (otherlv_0= 'create' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) )
            // InternalSequence.g:1106:2: (otherlv_0= 'create' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            {
            // InternalSequence.g:1106:2: (otherlv_0= 'create' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            // InternalSequence.g:1107:3: otherlv_0= 'create' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMessageAccess().getCreateKeyword_0());
            		
            // InternalSequence.g:1111:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSequence.g:1112:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalSequence.g:1112:4: (lv_name_1_0= RULE_STRING )
                    // InternalSequence.g:1113:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getCreateMessageAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCreateMessageRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:1133:3: ( ( ruleFQN ) )
            // InternalSequence.g:1134:4: ( ruleFQN )
            {
            // InternalSequence.g:1134:4: ( ruleFQN )
            // InternalSequence.g:1135:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCreateMessageAccess().getLeftActorCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCreateMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:1153:3: ( ( ruleFQN ) )
            // InternalSequence.g:1154:4: ( ruleFQN )
            {
            // InternalSequence.g:1154:4: ( ruleFQN )
            // InternalSequence.g:1155:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCreateMessageAccess().getRightActorCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCreateMessageAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateMessage"


    // $ANTLR start "entryRuleDestructionMessage"
    // InternalSequence.g:1177:1: entryRuleDestructionMessage returns [EObject current=null] : iv_ruleDestructionMessage= ruleDestructionMessage EOF ;
    public final EObject entryRuleDestructionMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructionMessage = null;


        try {
            // InternalSequence.g:1177:59: (iv_ruleDestructionMessage= ruleDestructionMessage EOF )
            // InternalSequence.g:1178:2: iv_ruleDestructionMessage= ruleDestructionMessage EOF
            {
             newCompositeNode(grammarAccess.getDestructionMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestructionMessage=ruleDestructionMessage();

            state._fsp--;

             current =iv_ruleDestructionMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestructionMessage"


    // $ANTLR start "ruleDestructionMessage"
    // InternalSequence.g:1184:1: ruleDestructionMessage returns [EObject current=null] : (otherlv_0= 'dest' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) ;
    public final EObject ruleDestructionMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSequence.g:1190:2: ( (otherlv_0= 'dest' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) )
            // InternalSequence.g:1191:2: (otherlv_0= 'dest' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            {
            // InternalSequence.g:1191:2: (otherlv_0= 'dest' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            // InternalSequence.g:1192:3: otherlv_0= 'dest' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getDestructionMessageAccess().getDestKeyword_0());
            		
            // InternalSequence.g:1196:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSequence.g:1197:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalSequence.g:1197:4: (lv_name_1_0= RULE_STRING )
                    // InternalSequence.g:1198:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getDestructionMessageAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDestructionMessageRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDestructionMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:1218:3: ( ( ruleFQN ) )
            // InternalSequence.g:1219:4: ( ruleFQN )
            {
            // InternalSequence.g:1219:4: ( ruleFQN )
            // InternalSequence.g:1220:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructionMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDestructionMessageAccess().getLeftActorCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDestructionMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:1238:3: ( ( ruleFQN ) )
            // InternalSequence.g:1239:4: ( ruleFQN )
            {
            // InternalSequence.g:1239:4: ( ruleFQN )
            // InternalSequence.g:1240:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructionMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDestructionMessageAccess().getRightActorCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDestructionMessageAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestructionMessage"


    // $ANTLR start "entryRuleOccurenceSpecification"
    // InternalSequence.g:1262:1: entryRuleOccurenceSpecification returns [EObject current=null] : iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF ;
    public final EObject entryRuleOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurenceSpecification = null;


        try {
            // InternalSequence.g:1262:63: (iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF )
            // InternalSequence.g:1263:2: iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF
            {
             newCompositeNode(grammarAccess.getOccurenceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOccurenceSpecification=ruleOccurenceSpecification();

            state._fsp--;

             current =iv_ruleOccurenceSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOccurenceSpecification"


    // $ANTLR start "ruleOccurenceSpecification"
    // InternalSequence.g:1269:1: ruleOccurenceSpecification returns [EObject current=null] : this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification ;
    public final EObject ruleOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_DestructionOccurenceSpecification_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1275:2: (this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification )
            // InternalSequence.g:1276:2: this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification
            {

            		newCompositeNode(grammarAccess.getOccurenceSpecificationAccess().getDestructionOccurenceSpecificationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_DestructionOccurenceSpecification_0=ruleDestructionOccurenceSpecification();

            state._fsp--;


            		current = this_DestructionOccurenceSpecification_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOccurenceSpecification"


    // $ANTLR start "entryRuleDestructionOccurenceSpecification"
    // InternalSequence.g:1287:1: entryRuleDestructionOccurenceSpecification returns [EObject current=null] : iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF ;
    public final EObject entryRuleDestructionOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructionOccurenceSpecification = null;


        try {
            // InternalSequence.g:1287:74: (iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF )
            // InternalSequence.g:1288:2: iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF
            {
             newCompositeNode(grammarAccess.getDestructionOccurenceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestructionOccurenceSpecification=ruleDestructionOccurenceSpecification();

            state._fsp--;

             current =iv_ruleDestructionOccurenceSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestructionOccurenceSpecification"


    // $ANTLR start "ruleDestructionOccurenceSpecification"
    // InternalSequence.g:1294:1: ruleDestructionOccurenceSpecification returns [EObject current=null] : (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDestructionOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSequence.g:1300:2: ( (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSequence.g:1301:2: (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSequence.g:1301:2: (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSequence.g:1302:3: otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDestructionOccurenceSpecificationAccess().getDestKeyword_0());
            		
            // InternalSequence.g:1306:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSequence.g:1307:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSequence.g:1307:4: (lv_name_1_0= RULE_ID )
            // InternalSequence.g:1308:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDestructionOccurenceSpecificationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructionOccurenceSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestructionOccurenceSpecification"


    // $ANTLR start "entryRuleCombinedFragment"
    // InternalSequence.g:1328:1: entryRuleCombinedFragment returns [EObject current=null] : iv_ruleCombinedFragment= ruleCombinedFragment EOF ;
    public final EObject entryRuleCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinedFragment = null;


        try {
            // InternalSequence.g:1328:57: (iv_ruleCombinedFragment= ruleCombinedFragment EOF )
            // InternalSequence.g:1329:2: iv_ruleCombinedFragment= ruleCombinedFragment EOF
            {
             newCompositeNode(grammarAccess.getCombinedFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCombinedFragment=ruleCombinedFragment();

            state._fsp--;

             current =iv_ruleCombinedFragment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCombinedFragment"


    // $ANTLR start "ruleCombinedFragment"
    // InternalSequence.g:1335:1: ruleCombinedFragment returns [EObject current=null] : (this_Alternative_0= ruleAlternative | this_Option_1= ruleOption | this_Parallel_2= ruleParallel | this_Critical_3= ruleCritical | this_Loop_4= ruleLoop ) ;
    public final EObject ruleCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject this_Alternative_0 = null;

        EObject this_Option_1 = null;

        EObject this_Parallel_2 = null;

        EObject this_Critical_3 = null;

        EObject this_Loop_4 = null;



        	enterRule();

        try {
            // InternalSequence.g:1341:2: ( (this_Alternative_0= ruleAlternative | this_Option_1= ruleOption | this_Parallel_2= ruleParallel | this_Critical_3= ruleCritical | this_Loop_4= ruleLoop ) )
            // InternalSequence.g:1342:2: (this_Alternative_0= ruleAlternative | this_Option_1= ruleOption | this_Parallel_2= ruleParallel | this_Critical_3= ruleCritical | this_Loop_4= ruleLoop )
            {
            // InternalSequence.g:1342:2: (this_Alternative_0= ruleAlternative | this_Option_1= ruleOption | this_Parallel_2= ruleParallel | this_Critical_3= ruleCritical | this_Loop_4= ruleLoop )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 35:
                {
                alt17=2;
                }
                break;
            case 36:
                {
                alt17=3;
                }
                break;
            case 37:
                {
                alt17=4;
                }
                break;
            case 38:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSequence.g:1343:3: this_Alternative_0= ruleAlternative
                    {

                    			newCompositeNode(grammarAccess.getCombinedFragmentAccess().getAlternativeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alternative_0=ruleAlternative();

                    state._fsp--;


                    			current = this_Alternative_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:1352:3: this_Option_1= ruleOption
                    {

                    			newCompositeNode(grammarAccess.getCombinedFragmentAccess().getOptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Option_1=ruleOption();

                    state._fsp--;


                    			current = this_Option_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSequence.g:1361:3: this_Parallel_2= ruleParallel
                    {

                    			newCompositeNode(grammarAccess.getCombinedFragmentAccess().getParallelParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parallel_2=ruleParallel();

                    state._fsp--;


                    			current = this_Parallel_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSequence.g:1370:3: this_Critical_3= ruleCritical
                    {

                    			newCompositeNode(grammarAccess.getCombinedFragmentAccess().getCriticalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Critical_3=ruleCritical();

                    state._fsp--;


                    			current = this_Critical_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSequence.g:1379:3: this_Loop_4= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getCombinedFragmentAccess().getLoopParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_4=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCombinedFragment"


    // $ANTLR start "entryRuleAlternative"
    // InternalSequence.g:1391:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalSequence.g:1391:52: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalSequence.g:1392:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalSequence.g:1398:1: ruleAlternative returns [EObject current=null] : (otherlv_0= 'alt' otherlv_1= '{' ( (lv_alternatives_2_0= ruleConditionedFragment ) )+ otherlv_3= '}' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_alternatives_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1404:2: ( (otherlv_0= 'alt' otherlv_1= '{' ( (lv_alternatives_2_0= ruleConditionedFragment ) )+ otherlv_3= '}' ) )
            // InternalSequence.g:1405:2: (otherlv_0= 'alt' otherlv_1= '{' ( (lv_alternatives_2_0= ruleConditionedFragment ) )+ otherlv_3= '}' )
            {
            // InternalSequence.g:1405:2: (otherlv_0= 'alt' otherlv_1= '{' ( (lv_alternatives_2_0= ruleConditionedFragment ) )+ otherlv_3= '}' )
            // InternalSequence.g:1406:3: otherlv_0= 'alt' otherlv_1= '{' ( (lv_alternatives_2_0= ruleConditionedFragment ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getAltKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:1414:3: ( (lv_alternatives_2_0= ruleConditionedFragment ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSequence.g:1415:4: (lv_alternatives_2_0= ruleConditionedFragment )
            	    {
            	    // InternalSequence.g:1415:4: (lv_alternatives_2_0= ruleConditionedFragment )
            	    // InternalSequence.g:1416:5: lv_alternatives_2_0= ruleConditionedFragment
            	    {

            	    					newCompositeNode(grammarAccess.getAlternativeAccess().getAlternativesConditionedFragmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_alternatives_2_0=ruleConditionedFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"alternatives",
            	    						lv_alternatives_2_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.ConditionedFragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleOption"
    // InternalSequence.g:1441:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalSequence.g:1441:47: (iv_ruleOption= ruleOption EOF )
            // InternalSequence.g:1442:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalSequence.g:1448:1: ruleOption returns [EObject current=null] : (otherlv_0= 'opt' otherlv_1= '{' ( (lv_option_2_0= ruleConditionedFragment ) ) otherlv_3= '}' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_option_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1454:2: ( (otherlv_0= 'opt' otherlv_1= '{' ( (lv_option_2_0= ruleConditionedFragment ) ) otherlv_3= '}' ) )
            // InternalSequence.g:1455:2: (otherlv_0= 'opt' otherlv_1= '{' ( (lv_option_2_0= ruleConditionedFragment ) ) otherlv_3= '}' )
            {
            // InternalSequence.g:1455:2: (otherlv_0= 'opt' otherlv_1= '{' ( (lv_option_2_0= ruleConditionedFragment ) ) otherlv_3= '}' )
            // InternalSequence.g:1456:3: otherlv_0= 'opt' otherlv_1= '{' ( (lv_option_2_0= ruleConditionedFragment ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:1464:3: ( (lv_option_2_0= ruleConditionedFragment ) )
            // InternalSequence.g:1465:4: (lv_option_2_0= ruleConditionedFragment )
            {
            // InternalSequence.g:1465:4: (lv_option_2_0= ruleConditionedFragment )
            // InternalSequence.g:1466:5: lv_option_2_0= ruleConditionedFragment
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getOptionConditionedFragmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_option_2_0=ruleConditionedFragment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					add(
            						current,
            						"option",
            						lv_option_2_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.ConditionedFragment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleParallel"
    // InternalSequence.g:1491:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // InternalSequence.g:1491:49: (iv_ruleParallel= ruleParallel EOF )
            // InternalSequence.g:1492:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // InternalSequence.g:1498:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'par' otherlv_1= '{' ( (lv_parallels_2_0= ruleParallelFragment ) )+ otherlv_3= '}' ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parallels_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1504:2: ( (otherlv_0= 'par' otherlv_1= '{' ( (lv_parallels_2_0= ruleParallelFragment ) )+ otherlv_3= '}' ) )
            // InternalSequence.g:1505:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parallels_2_0= ruleParallelFragment ) )+ otherlv_3= '}' )
            {
            // InternalSequence.g:1505:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parallels_2_0= ruleParallelFragment ) )+ otherlv_3= '}' )
            // InternalSequence.g:1506:3: otherlv_0= 'par' otherlv_1= '{' ( (lv_parallels_2_0= ruleParallelFragment ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getParKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:1514:3: ( (lv_parallels_2_0= ruleParallelFragment ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26||(LA19_0>=28 && LA19_0<=33)||(LA19_0>=35 && LA19_0<=38)||(LA19_0>=41 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSequence.g:1515:4: (lv_parallels_2_0= ruleParallelFragment )
            	    {
            	    // InternalSequence.g:1515:4: (lv_parallels_2_0= ruleParallelFragment )
            	    // InternalSequence.g:1516:5: lv_parallels_2_0= ruleParallelFragment
            	    {

            	    					newCompositeNode(grammarAccess.getParallelAccess().getParallelsParallelFragmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_parallels_2_0=ruleParallelFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParallelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parallels",
            	    						lv_parallels_2_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.ParallelFragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParallelAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleCritical"
    // InternalSequence.g:1541:1: entryRuleCritical returns [EObject current=null] : iv_ruleCritical= ruleCritical EOF ;
    public final EObject entryRuleCritical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCritical = null;


        try {
            // InternalSequence.g:1541:49: (iv_ruleCritical= ruleCritical EOF )
            // InternalSequence.g:1542:2: iv_ruleCritical= ruleCritical EOF
            {
             newCompositeNode(grammarAccess.getCriticalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCritical=ruleCritical();

            state._fsp--;

             current =iv_ruleCritical; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCritical"


    // $ANTLR start "ruleCritical"
    // InternalSequence.g:1548:1: ruleCritical returns [EObject current=null] : (otherlv_0= 'critical' otherlv_1= '{' ( (lv_fragments_2_0= ruleInteractionFragment ) )+ otherlv_3= '}' ) ;
    public final EObject ruleCritical() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fragments_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1554:2: ( (otherlv_0= 'critical' otherlv_1= '{' ( (lv_fragments_2_0= ruleInteractionFragment ) )+ otherlv_3= '}' ) )
            // InternalSequence.g:1555:2: (otherlv_0= 'critical' otherlv_1= '{' ( (lv_fragments_2_0= ruleInteractionFragment ) )+ otherlv_3= '}' )
            {
            // InternalSequence.g:1555:2: (otherlv_0= 'critical' otherlv_1= '{' ( (lv_fragments_2_0= ruleInteractionFragment ) )+ otherlv_3= '}' )
            // InternalSequence.g:1556:3: otherlv_0= 'critical' otherlv_1= '{' ( (lv_fragments_2_0= ruleInteractionFragment ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getCriticalAccess().getCriticalKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getCriticalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:1564:3: ( (lv_fragments_2_0= ruleInteractionFragment ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26||(LA20_0>=28 && LA20_0<=32)||(LA20_0>=35 && LA20_0<=38)||(LA20_0>=41 && LA20_0<=42)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSequence.g:1565:4: (lv_fragments_2_0= ruleInteractionFragment )
            	    {
            	    // InternalSequence.g:1565:4: (lv_fragments_2_0= ruleInteractionFragment )
            	    // InternalSequence.g:1566:5: lv_fragments_2_0= ruleInteractionFragment
            	    {

            	    					newCompositeNode(grammarAccess.getCriticalAccess().getFragmentsInteractionFragmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_fragments_2_0=ruleInteractionFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCriticalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fragments",
            	    						lv_fragments_2_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.InteractionFragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCriticalAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCritical"


    // $ANTLR start "entryRuleLoop"
    // InternalSequence.g:1591:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalSequence.g:1591:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalSequence.g:1592:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalSequence.g:1598:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop' otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) )+ otherlv_6= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_condition_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fragments_5_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1604:2: ( (otherlv_0= 'loop' otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) )+ otherlv_6= '}' ) )
            // InternalSequence.g:1605:2: (otherlv_0= 'loop' otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) )+ otherlv_6= '}' )
            {
            // InternalSequence.g:1605:2: (otherlv_0= 'loop' otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) )+ otherlv_6= '}' )
            // InternalSequence.g:1606:3: otherlv_0= 'loop' otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_fragments_5_0= ruleInteractionFragment ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSequence.g:1614:3: ( (lv_condition_2_0= RULE_STRING ) )
            // InternalSequence.g:1615:4: (lv_condition_2_0= RULE_STRING )
            {
            // InternalSequence.g:1615:4: (lv_condition_2_0= RULE_STRING )
            // InternalSequence.g:1616:5: lv_condition_2_0= RULE_STRING
            {
            lv_condition_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_condition_2_0, grammarAccess.getLoopAccess().getConditionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSequence.g:1640:3: ( (lv_fragments_5_0= ruleInteractionFragment ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26||(LA21_0>=28 && LA21_0<=32)||(LA21_0>=35 && LA21_0<=38)||(LA21_0>=41 && LA21_0<=42)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSequence.g:1641:4: (lv_fragments_5_0= ruleInteractionFragment )
            	    {
            	    // InternalSequence.g:1641:4: (lv_fragments_5_0= ruleInteractionFragment )
            	    // InternalSequence.g:1642:5: lv_fragments_5_0= ruleInteractionFragment
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getFragmentsInteractionFragmentParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_fragments_5_0=ruleInteractionFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fragments",
            	    						lv_fragments_5_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.InteractionFragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleParallelFragment"
    // InternalSequence.g:1667:1: entryRuleParallelFragment returns [EObject current=null] : iv_ruleParallelFragment= ruleParallelFragment EOF ;
    public final EObject entryRuleParallelFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelFragment = null;


        try {
            // InternalSequence.g:1667:57: (iv_ruleParallelFragment= ruleParallelFragment EOF )
            // InternalSequence.g:1668:2: iv_ruleParallelFragment= ruleParallelFragment EOF
            {
             newCompositeNode(grammarAccess.getParallelFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelFragment=ruleParallelFragment();

            state._fsp--;

             current =iv_ruleParallelFragment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallelFragment"


    // $ANTLR start "ruleParallelFragment"
    // InternalSequence.g:1674:1: ruleParallelFragment returns [EObject current=null] : ( (otherlv_0= '{' ( (lv_fragments_1_0= ruleInteractionFragment ) )* otherlv_2= '}' ) | ( (lv_fragments_3_0= ruleInteractionFragment ) ) ) ;
    public final EObject ruleParallelFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fragments_1_0 = null;

        EObject lv_fragments_3_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1680:2: ( ( (otherlv_0= '{' ( (lv_fragments_1_0= ruleInteractionFragment ) )* otherlv_2= '}' ) | ( (lv_fragments_3_0= ruleInteractionFragment ) ) ) )
            // InternalSequence.g:1681:2: ( (otherlv_0= '{' ( (lv_fragments_1_0= ruleInteractionFragment ) )* otherlv_2= '}' ) | ( (lv_fragments_3_0= ruleInteractionFragment ) ) )
            {
            // InternalSequence.g:1681:2: ( (otherlv_0= '{' ( (lv_fragments_1_0= ruleInteractionFragment ) )* otherlv_2= '}' ) | ( (lv_fragments_3_0= ruleInteractionFragment ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            else if ( (LA23_0==26||(LA23_0>=28 && LA23_0<=32)||(LA23_0>=35 && LA23_0<=38)||(LA23_0>=41 && LA23_0<=42)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSequence.g:1682:3: (otherlv_0= '{' ( (lv_fragments_1_0= ruleInteractionFragment ) )* otherlv_2= '}' )
                    {
                    // InternalSequence.g:1682:3: (otherlv_0= '{' ( (lv_fragments_1_0= ruleInteractionFragment ) )* otherlv_2= '}' )
                    // InternalSequence.g:1683:4: otherlv_0= '{' ( (lv_fragments_1_0= ruleInteractionFragment ) )* otherlv_2= '}'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_36); 

                    				newLeafNode(otherlv_0, grammarAccess.getParallelFragmentAccess().getLeftCurlyBracketKeyword_0_0());
                    			
                    // InternalSequence.g:1687:4: ( (lv_fragments_1_0= ruleInteractionFragment ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==26||(LA22_0>=28 && LA22_0<=32)||(LA22_0>=35 && LA22_0<=38)||(LA22_0>=41 && LA22_0<=42)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSequence.g:1688:5: (lv_fragments_1_0= ruleInteractionFragment )
                    	    {
                    	    // InternalSequence.g:1688:5: (lv_fragments_1_0= ruleInteractionFragment )
                    	    // InternalSequence.g:1689:6: lv_fragments_1_0= ruleInteractionFragment
                    	    {

                    	    						newCompositeNode(grammarAccess.getParallelFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_36);
                    	    lv_fragments_1_0=ruleInteractionFragment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getParallelFragmentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fragments",
                    	    							lv_fragments_1_0,
                    	    							"de.cooperateproject.modeling.textual.sequence.Sequence.InteractionFragment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getParallelFragmentAccess().getRightCurlyBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1712:3: ( (lv_fragments_3_0= ruleInteractionFragment ) )
                    {
                    // InternalSequence.g:1712:3: ( (lv_fragments_3_0= ruleInteractionFragment ) )
                    // InternalSequence.g:1713:4: (lv_fragments_3_0= ruleInteractionFragment )
                    {
                    // InternalSequence.g:1713:4: (lv_fragments_3_0= ruleInteractionFragment )
                    // InternalSequence.g:1714:5: lv_fragments_3_0= ruleInteractionFragment
                    {

                    					newCompositeNode(grammarAccess.getParallelFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fragments_3_0=ruleInteractionFragment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParallelFragmentRule());
                    					}
                    					add(
                    						current,
                    						"fragments",
                    						lv_fragments_3_0,
                    						"de.cooperateproject.modeling.textual.sequence.Sequence.InteractionFragment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallelFragment"


    // $ANTLR start "entryRuleConditionedFragment"
    // InternalSequence.g:1735:1: entryRuleConditionedFragment returns [EObject current=null] : iv_ruleConditionedFragment= ruleConditionedFragment EOF ;
    public final EObject entryRuleConditionedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionedFragment = null;


        try {
            // InternalSequence.g:1735:60: (iv_ruleConditionedFragment= ruleConditionedFragment EOF )
            // InternalSequence.g:1736:2: iv_ruleConditionedFragment= ruleConditionedFragment EOF
            {
             newCompositeNode(grammarAccess.getConditionedFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionedFragment=ruleConditionedFragment();

            state._fsp--;

             current =iv_ruleConditionedFragment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionedFragment"


    // $ANTLR start "ruleConditionedFragment"
    // InternalSequence.g:1742:1: ruleConditionedFragment returns [EObject current=null] : (otherlv_0= '[' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= ']' ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) )* otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleInteractionFragment ) ) ) ) ;
    public final EObject ruleConditionedFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_condition_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fragments_4_0 = null;

        EObject lv_fragments_6_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1748:2: ( (otherlv_0= '[' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= ']' ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) )* otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleInteractionFragment ) ) ) ) )
            // InternalSequence.g:1749:2: (otherlv_0= '[' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= ']' ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) )* otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleInteractionFragment ) ) ) )
            {
            // InternalSequence.g:1749:2: (otherlv_0= '[' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= ']' ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) )* otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleInteractionFragment ) ) ) )
            // InternalSequence.g:1750:3: otherlv_0= '[' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= ']' ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) )* otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleInteractionFragment ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionedFragmentAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSequence.g:1754:3: ( (lv_condition_1_0= RULE_STRING ) )
            // InternalSequence.g:1755:4: (lv_condition_1_0= RULE_STRING )
            {
            // InternalSequence.g:1755:4: (lv_condition_1_0= RULE_STRING )
            // InternalSequence.g:1756:5: lv_condition_1_0= RULE_STRING
            {
            lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_condition_1_0, grammarAccess.getConditionedFragmentAccess().getConditionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionedFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionedFragmentAccess().getRightSquareBracketKeyword_2());
            		
            // InternalSequence.g:1776:3: ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) )* otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleInteractionFragment ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            else if ( (LA25_0==26||(LA25_0>=28 && LA25_0<=32)||(LA25_0>=35 && LA25_0<=38)||(LA25_0>=41 && LA25_0<=42)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSequence.g:1777:4: (otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) )* otherlv_5= '}' )
                    {
                    // InternalSequence.g:1777:4: (otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) )* otherlv_5= '}' )
                    // InternalSequence.g:1778:5: otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_36); 

                    					newLeafNode(otherlv_3, grammarAccess.getConditionedFragmentAccess().getLeftCurlyBracketKeyword_3_0_0());
                    				
                    // InternalSequence.g:1782:5: ( (lv_fragments_4_0= ruleInteractionFragment ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==26||(LA24_0>=28 && LA24_0<=32)||(LA24_0>=35 && LA24_0<=38)||(LA24_0>=41 && LA24_0<=42)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSequence.g:1783:6: (lv_fragments_4_0= ruleInteractionFragment )
                    	    {
                    	    // InternalSequence.g:1783:6: (lv_fragments_4_0= ruleInteractionFragment )
                    	    // InternalSequence.g:1784:7: lv_fragments_4_0= ruleInteractionFragment
                    	    {

                    	    							newCompositeNode(grammarAccess.getConditionedFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_3_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_fragments_4_0=ruleInteractionFragment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConditionedFragmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fragments",
                    	    								lv_fragments_4_0,
                    	    								"de.cooperateproject.modeling.textual.sequence.Sequence.InteractionFragment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getConditionedFragmentAccess().getRightCurlyBracketKeyword_3_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1807:4: ( (lv_fragments_6_0= ruleInteractionFragment ) )
                    {
                    // InternalSequence.g:1807:4: ( (lv_fragments_6_0= ruleInteractionFragment ) )
                    // InternalSequence.g:1808:5: (lv_fragments_6_0= ruleInteractionFragment )
                    {
                    // InternalSequence.g:1808:5: (lv_fragments_6_0= ruleInteractionFragment )
                    // InternalSequence.g:1809:6: lv_fragments_6_0= ruleInteractionFragment
                    {

                    						newCompositeNode(grammarAccess.getConditionedFragmentAccess().getFragmentsInteractionFragmentParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fragments_6_0=ruleInteractionFragment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionedFragmentRule());
                    						}
                    						add(
                    							current,
                    							"fragments",
                    							lv_fragments_6_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.InteractionFragment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionedFragment"


    // $ANTLR start "entryRuleFQN"
    // InternalSequence.g:1831:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSequence.g:1831:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSequence.g:1832:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalSequence.g:1838:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSequence.g:1844:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSequence.g:1845:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSequence.g:1845:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSequence.g:1846:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSequence.g:1853:3: (kw= '.' this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSequence.g:1854:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_37); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleOrder"
    // InternalSequence.g:1871:1: entryRuleOrder returns [String current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final String entryRuleOrder() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrder = null;


        try {
            // InternalSequence.g:1871:45: (iv_ruleOrder= ruleOrder EOF )
            // InternalSequence.g:1872:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalSequence.g:1878:1: ruleOrder returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleOrder() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSequence.g:1884:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) )
            // InternalSequence.g:1885:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            {
            // InternalSequence.g:1885:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            // InternalSequence.g:1886:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )*
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getOrderAccess().getINTTerminalRuleCall_0());
            		
            // InternalSequence.g:1893:3: (kw= '.' this_INT_2= RULE_INT )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSequence.g:1894:4: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,40,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getOrderAccess().getFullStopKeyword_1_0());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_37); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getOrderAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleCommentBody"
    // InternalSequence.g:1911:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalSequence.g:1911:51: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalSequence.g:1912:2: iv_ruleCommentBody= ruleCommentBody EOF
            {
             newCompositeNode(grammarAccess.getCommentBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentBody=ruleCommentBody();

            state._fsp--;

             current =iv_ruleCommentBody.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentBody"


    // $ANTLR start "ruleCommentBody"
    // InternalSequence.g:1918:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSequence.g:1924:2: (this_STRING_0= RULE_STRING )
            // InternalSequence.g:1925:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getCommentBodyAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentBody"


    // $ANTLR start "ruleMessageType"
    // InternalSequence.g:1935:1: ruleMessageType returns [Enumerator current=null] : ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) ) ;
    public final Enumerator ruleMessageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSequence.g:1941:2: ( ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) ) )
            // InternalSequence.g:1942:2: ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) )
            {
            // InternalSequence.g:1942:2: ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            else if ( (LA28_0==42) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSequence.g:1943:3: (enumLiteral_0= 'sync' )
                    {
                    // InternalSequence.g:1943:3: (enumLiteral_0= 'sync' )
                    // InternalSequence.g:1944:4: enumLiteral_0= 'sync'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1951:3: (enumLiteral_1= 'async' )
                    {
                    // InternalSequence.g:1951:3: (enumLiteral_1= 'async' )
                    // InternalSequence.g:1952:4: enumLiteral_1= 'async'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMessageTypeAccess().getASYNCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMessageTypeAccess().getASYNCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageType"


    // $ANTLR start "ruleActorType"
    // InternalSequence.g:1962:1: ruleActorType returns [Enumerator current=null] : ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) ;
    public final Enumerator ruleActorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSequence.g:1968:2: ( ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) )
            // InternalSequence.g:1969:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            {
            // InternalSequence.g:1969:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            else if ( (LA29_0==44) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSequence.g:1970:3: (enumLiteral_0= 'human' )
                    {
                    // InternalSequence.g:1970:3: (enumLiteral_0= 'human' )
                    // InternalSequence.g:1971:4: enumLiteral_0= 'human'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1978:3: (enumLiteral_1= 'machine' )
                    {
                    // InternalSequence.g:1978:3: (enumLiteral_1= 'machine' )
                    // InternalSequence.g:1979:4: enumLiteral_1= 'machine'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActorType"


    // $ANTLR start "ruleTimeConstraintType"
    // InternalSequence.g:1989:1: ruleTimeConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'd' ) | (enumLiteral_1= 't' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'diff' ) ) ;
    public final Enumerator ruleTimeConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSequence.g:1995:2: ( ( (enumLiteral_0= 'd' ) | (enumLiteral_1= 't' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'diff' ) ) )
            // InternalSequence.g:1996:2: ( (enumLiteral_0= 'd' ) | (enumLiteral_1= 't' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'diff' ) )
            {
            // InternalSequence.g:1996:2: ( (enumLiteral_0= 'd' ) | (enumLiteral_1= 't' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'diff' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt30=1;
                }
                break;
            case 46:
                {
                alt30=2;
                }
                break;
            case 47:
                {
                alt30=3;
                }
                break;
            case 48:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalSequence.g:1997:3: (enumLiteral_0= 'd' )
                    {
                    // InternalSequence.g:1997:3: (enumLiteral_0= 'd' )
                    // InternalSequence.g:1998:4: enumLiteral_0= 'd'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTimeConstraintTypeAccess().getDURATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeConstraintTypeAccess().getDURATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:2005:3: (enumLiteral_1= 't' )
                    {
                    // InternalSequence.g:2005:3: (enumLiteral_1= 't' )
                    // InternalSequence.g:2006:4: enumLiteral_1= 't'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTimeConstraintTypeAccess().getTIMEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeConstraintTypeAccess().getTIMEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:2013:3: (enumLiteral_2= 'max' )
                    {
                    // InternalSequence.g:2013:3: (enumLiteral_2= 'max' )
                    // InternalSequence.g:2014:4: enumLiteral_2= 'max'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTimeConstraintTypeAccess().getMAXIMUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeConstraintTypeAccess().getMAXIMUMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSequence.g:2021:3: (enumLiteral_3= 'diff' )
                    {
                    // InternalSequence.g:2021:3: (enumLiteral_3= 'diff' )
                    // InternalSequence.g:2022:4: enumLiteral_3= 'diff'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTimeConstraintTypeAccess().getDIFFERENCEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeConstraintTypeAccess().getDIFFERENCEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeConstraintType"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\32\2\4\5\uffff\1\27\1\5\1\30\2\5\1\30\1\uffff";
    static final String dfa_3s = "\1\52\2\4\5\uffff\1\27\1\33\1\50\1\5\1\33\1\50\1\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\3\1\4\1\5\1\6\6\uffff\1\1";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\uffff\1\4\1\5\1\6\1\7\11\uffff\1\1\1\2",
            "\1\10",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\11",
            "\1\12\25\uffff\1\4",
            "\1\14\17\uffff\1\13",
            "\1\15",
            "\1\16\25\uffff\1\5",
            "\1\14\17\uffff\1\13",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "492:3: (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000679F4004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000679F4000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001E00000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000067BF4000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000067FF4000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000679F4000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000067DF4000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000002L});

}