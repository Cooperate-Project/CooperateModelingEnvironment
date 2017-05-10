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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-seqd'", "'@end-seqd'", "'rootElement'", "'act'", "'deferred'", "'as'", "'role['", "']'", "':'", "'{'", "'}'", "'num['", "'time['", "'='", "'('", "','", "')'", "'resp'", "'_'", "'found'", "'lost'", "'create'", "'dest'", "'alt'", "'opt'", "'par'", "'critical'", "'loop'", "'['", "'.'", "'sync'", "'async'", "'human'", "'machine'", "'d'", "'t'", "'max'", "'diff'"
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
    // InternalSequence.g:143:1: ruleRootPackage returns [EObject current=null] : (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_behaviorFragments_3_0= ruleBehaviorFragment ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actors_2_0 = null;

        EObject lv_behaviorFragments_3_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:149:2: ( (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_behaviorFragments_3_0= ruleBehaviorFragment ) )* ) )
            // InternalSequence.g:150:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_behaviorFragments_3_0= ruleBehaviorFragment ) )* )
            {
            // InternalSequence.g:150:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_behaviorFragments_3_0= ruleBehaviorFragment ) )* )
            // InternalSequence.g:151:3: otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_behaviorFragments_3_0= ruleBehaviorFragment ) )*
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

            // InternalSequence.g:193:3: ( (lv_behaviorFragments_3_0= ruleBehaviorFragment ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==28||(LA2_0>=30 && LA2_0<=38)||(LA2_0>=41 && LA2_0<=42)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSequence.g:194:4: (lv_behaviorFragments_3_0= ruleBehaviorFragment )
            	    {
            	    // InternalSequence.g:194:4: (lv_behaviorFragments_3_0= ruleBehaviorFragment )
            	    // InternalSequence.g:195:5: lv_behaviorFragments_3_0= ruleBehaviorFragment
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getBehaviorFragmentsBehaviorFragmentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_behaviorFragments_3_0=ruleBehaviorFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"behaviorFragments",
            	    						lv_behaviorFragments_3_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.BehaviorFragment");
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
    // InternalSequence.g:223:1: ruleActor returns [EObject current=null] : (otherlv_0= 'act' ( (lv_deferred_1_0= 'deferred' ) )? ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) ) (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_deferred_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token lv_alias_6_0=null;
        Token lv_name_7_0=null;
        Token otherlv_9=null;
        Token lv_alias_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeMapping_3_0 = null;

        EObject lv_typeMapping_4_0 = null;

        EObject lv_typeMapping_8_0 = null;

        Enumerator lv_actorType_12_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:229:2: ( (otherlv_0= 'act' ( (lv_deferred_1_0= 'deferred' ) )? ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) ) (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )? ) )
            // InternalSequence.g:230:2: (otherlv_0= 'act' ( (lv_deferred_1_0= 'deferred' ) )? ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) ) (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )? )
            {
            // InternalSequence.g:230:2: (otherlv_0= 'act' ( (lv_deferred_1_0= 'deferred' ) )? ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) ) (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )? )
            // InternalSequence.g:231:3: otherlv_0= 'act' ( (lv_deferred_1_0= 'deferred' ) )? ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) ) (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )?
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

            // InternalSequence.g:249:3: ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
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
                    // InternalSequence.g:250:4: ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? )
                    {
                    // InternalSequence.g:250:4: ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? )
                    // InternalSequence.g:251:5: ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )?
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

                    // InternalSequence.g:269:5: ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==19) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSequence.g:270:6: (lv_typeMapping_3_0= ruleActorClassifierMapping )
                            {
                            // InternalSequence.g:270:6: (lv_typeMapping_3_0= ruleActorClassifierMapping )
                            // InternalSequence.g:271:7: lv_typeMapping_3_0= ruleActorClassifierMapping
                            {

                            							newCompositeNode(grammarAccess.getActorAccess().getTypeMappingActorClassifierMappingParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_typeMapping_3_0=ruleActorClassifierMapping();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getActorRule());
                            							}
                            							set(
                            								current,
                            								"typeMapping",
                            								lv_typeMapping_3_0,
                            								"de.cooperateproject.modeling.textual.sequence.Sequence.ActorClassifierMapping");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:290:4: ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    {
                    // InternalSequence.g:290:4: ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    // InternalSequence.g:291:5: ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) )
                    {
                    // InternalSequence.g:291:5: ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) )
                    // InternalSequence.g:292:6: (lv_typeMapping_4_0= ruleActorClassifierMapping )
                    {
                    // InternalSequence.g:292:6: (lv_typeMapping_4_0= ruleActorClassifierMapping )
                    // InternalSequence.g:293:7: lv_typeMapping_4_0= ruleActorClassifierMapping
                    {

                    							newCompositeNode(grammarAccess.getActorAccess().getTypeMappingActorClassifierMappingParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_typeMapping_4_0=ruleActorClassifierMapping();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getActorRule());
                    							}
                    							set(
                    								current,
                    								"typeMapping",
                    								lv_typeMapping_4_0,
                    								"de.cooperateproject.modeling.textual.sequence.Sequence.ActorClassifierMapping");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getActorAccess().getAsKeyword_2_1_1());
                    				
                    // InternalSequence.g:314:5: ( (lv_alias_6_0= RULE_ID ) )
                    // InternalSequence.g:315:6: (lv_alias_6_0= RULE_ID )
                    {
                    // InternalSequence.g:315:6: (lv_alias_6_0= RULE_ID )
                    // InternalSequence.g:316:7: lv_alias_6_0= RULE_ID
                    {
                    lv_alias_6_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    							newLeafNode(lv_alias_6_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_6_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:334:4: ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) )
                    {
                    // InternalSequence.g:334:4: ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) )
                    // InternalSequence.g:335:5: ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) )
                    {
                    // InternalSequence.g:335:5: ( (lv_name_7_0= RULE_STRING ) )
                    // InternalSequence.g:336:6: (lv_name_7_0= RULE_STRING )
                    {
                    // InternalSequence.g:336:6: (lv_name_7_0= RULE_STRING )
                    // InternalSequence.g:337:7: lv_name_7_0= RULE_STRING
                    {
                    lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    							newLeafNode(lv_name_7_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_2_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    // InternalSequence.g:353:5: ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSequence.g:354:6: (lv_typeMapping_8_0= ruleActorClassifierMapping )
                            {
                            // InternalSequence.g:354:6: (lv_typeMapping_8_0= ruleActorClassifierMapping )
                            // InternalSequence.g:355:7: lv_typeMapping_8_0= ruleActorClassifierMapping
                            {

                            							newCompositeNode(grammarAccess.getActorAccess().getTypeMappingActorClassifierMappingParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_typeMapping_8_0=ruleActorClassifierMapping();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getActorRule());
                            							}
                            							set(
                            								current,
                            								"typeMapping",
                            								lv_typeMapping_8_0,
                            								"de.cooperateproject.modeling.textual.sequence.Sequence.ActorClassifierMapping");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_9, grammarAccess.getActorAccess().getAsKeyword_2_2_2());
                    				
                    // InternalSequence.g:376:5: ( (lv_alias_10_0= RULE_ID ) )
                    // InternalSequence.g:377:6: (lv_alias_10_0= RULE_ID )
                    {
                    // InternalSequence.g:377:6: (lv_alias_10_0= RULE_ID )
                    // InternalSequence.g:378:7: lv_alias_10_0= RULE_ID
                    {
                    lv_alias_10_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    							newLeafNode(lv_alias_10_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_2_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_10_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSequence.g:396:3: (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSequence.g:397:4: otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getActorAccess().getRoleKeyword_3_0());
                    			
                    // InternalSequence.g:401:4: ( (lv_actorType_12_0= ruleActorType ) )
                    // InternalSequence.g:402:5: (lv_actorType_12_0= ruleActorType )
                    {
                    // InternalSequence.g:402:5: (lv_actorType_12_0= ruleActorType )
                    // InternalSequence.g:403:6: lv_actorType_12_0= ruleActorType
                    {

                    						newCompositeNode(grammarAccess.getActorAccess().getActorTypeActorTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_actorType_12_0=ruleActorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActorRule());
                    						}
                    						set(
                    							current,
                    							"actorType",
                    							lv_actorType_12_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.ActorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getActorAccess().getRightSquareBracketKeyword_3_2());
                    			

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


    // $ANTLR start "entryRuleActorClassifierMapping"
    // InternalSequence.g:429:1: entryRuleActorClassifierMapping returns [EObject current=null] : iv_ruleActorClassifierMapping= ruleActorClassifierMapping EOF ;
    public final EObject entryRuleActorClassifierMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorClassifierMapping = null;


        try {
            // InternalSequence.g:429:63: (iv_ruleActorClassifierMapping= ruleActorClassifierMapping EOF )
            // InternalSequence.g:430:2: iv_ruleActorClassifierMapping= ruleActorClassifierMapping EOF
            {
             newCompositeNode(grammarAccess.getActorClassifierMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActorClassifierMapping=ruleActorClassifierMapping();

            state._fsp--;

             current =iv_ruleActorClassifierMapping; 
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
    // $ANTLR end "entryRuleActorClassifierMapping"


    // $ANTLR start "ruleActorClassifierMapping"
    // InternalSequence.g:436:1: ruleActorClassifierMapping returns [EObject current=null] : (otherlv_0= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleActorClassifierMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSequence.g:442:2: ( (otherlv_0= ':' ( ( ruleFQN ) ) ) )
            // InternalSequence.g:443:2: (otherlv_0= ':' ( ( ruleFQN ) ) )
            {
            // InternalSequence.g:443:2: (otherlv_0= ':' ( ( ruleFQN ) ) )
            // InternalSequence.g:444:3: otherlv_0= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getActorClassifierMappingAccess().getColonKeyword_0());
            		
            // InternalSequence.g:448:3: ( ( ruleFQN ) )
            // InternalSequence.g:449:4: ( ruleFQN )
            {
            // InternalSequence.g:449:4: ( ruleFQN )
            // InternalSequence.g:450:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorClassifierMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActorClassifierMappingAccess().getClassifierClassifierCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleActorClassifierMapping"


    // $ANTLR start "entryRuleBehaviorFragment"
    // InternalSequence.g:468:1: entryRuleBehaviorFragment returns [EObject current=null] : iv_ruleBehaviorFragment= ruleBehaviorFragment EOF ;
    public final EObject entryRuleBehaviorFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorFragment = null;


        try {
            // InternalSequence.g:468:57: (iv_ruleBehaviorFragment= ruleBehaviorFragment EOF )
            // InternalSequence.g:469:2: iv_ruleBehaviorFragment= ruleBehaviorFragment EOF
            {
             newCompositeNode(grammarAccess.getBehaviorFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorFragment=ruleBehaviorFragment();

            state._fsp--;

             current =iv_ruleBehaviorFragment; 
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
    // $ANTLR end "entryRuleBehaviorFragment"


    // $ANTLR start "ruleBehaviorFragment"
    // InternalSequence.g:475:1: ruleBehaviorFragment returns [EObject current=null] : (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment ) ;
    public final EObject ruleBehaviorFragment() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_OccurenceSpecification_1 = null;

        EObject this_CombinedFragment_2 = null;



        	enterRule();

        try {
            // InternalSequence.g:481:2: ( (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment ) )
            // InternalSequence.g:482:2: (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment )
            {
            // InternalSequence.g:482:2: (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 28:
            case 30:
            case 31:
            case 32:
            case 41:
            case 42:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_STRING||LA8_2==25) ) {
                    alt8=1;
                }
                else if ( (LA8_2==RULE_ID) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSequence.g:483:3: this_Message_0= ruleMessage
                    {

                    			newCompositeNode(grammarAccess.getBehaviorFragmentAccess().getMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Message_0=ruleMessage();

                    state._fsp--;


                    			current = this_Message_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:492:3: this_OccurenceSpecification_1= ruleOccurenceSpecification
                    {

                    			newCompositeNode(grammarAccess.getBehaviorFragmentAccess().getOccurenceSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OccurenceSpecification_1=ruleOccurenceSpecification();

                    state._fsp--;


                    			current = this_OccurenceSpecification_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSequence.g:501:3: this_CombinedFragment_2= ruleCombinedFragment
                    {

                    			newCompositeNode(grammarAccess.getBehaviorFragmentAccess().getCombinedFragmentParserRuleCall_2());
                    		
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
    // $ANTLR end "ruleBehaviorFragment"


    // $ANTLR start "entryRuleBehaviorFragments"
    // InternalSequence.g:513:1: entryRuleBehaviorFragments returns [EObject current=null] : iv_ruleBehaviorFragments= ruleBehaviorFragments EOF ;
    public final EObject entryRuleBehaviorFragments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorFragments = null;


        try {
            // InternalSequence.g:513:58: (iv_ruleBehaviorFragments= ruleBehaviorFragments EOF )
            // InternalSequence.g:514:2: iv_ruleBehaviorFragments= ruleBehaviorFragments EOF
            {
             newCompositeNode(grammarAccess.getBehaviorFragmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorFragments=ruleBehaviorFragments();

            state._fsp--;

             current =iv_ruleBehaviorFragments; 
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
    // $ANTLR end "entryRuleBehaviorFragments"


    // $ANTLR start "ruleBehaviorFragments"
    // InternalSequence.g:520:1: ruleBehaviorFragments returns [EObject current=null] : ( (otherlv_0= '{' ( (lv_fragments_1_0= ruleBehaviorFragment ) )+ otherlv_2= '}' ) | ( (lv_fragments_3_0= ruleBehaviorFragment ) ) ) ;
    public final EObject ruleBehaviorFragments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fragments_1_0 = null;

        EObject lv_fragments_3_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:526:2: ( ( (otherlv_0= '{' ( (lv_fragments_1_0= ruleBehaviorFragment ) )+ otherlv_2= '}' ) | ( (lv_fragments_3_0= ruleBehaviorFragment ) ) ) )
            // InternalSequence.g:527:2: ( (otherlv_0= '{' ( (lv_fragments_1_0= ruleBehaviorFragment ) )+ otherlv_2= '}' ) | ( (lv_fragments_3_0= ruleBehaviorFragment ) ) )
            {
            // InternalSequence.g:527:2: ( (otherlv_0= '{' ( (lv_fragments_1_0= ruleBehaviorFragment ) )+ otherlv_2= '}' ) | ( (lv_fragments_3_0= ruleBehaviorFragment ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==28||(LA10_0>=30 && LA10_0<=38)||(LA10_0>=41 && LA10_0<=42)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSequence.g:528:3: (otherlv_0= '{' ( (lv_fragments_1_0= ruleBehaviorFragment ) )+ otherlv_2= '}' )
                    {
                    // InternalSequence.g:528:3: (otherlv_0= '{' ( (lv_fragments_1_0= ruleBehaviorFragment ) )+ otherlv_2= '}' )
                    // InternalSequence.g:529:4: otherlv_0= '{' ( (lv_fragments_1_0= ruleBehaviorFragment ) )+ otherlv_2= '}'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getBehaviorFragmentsAccess().getLeftCurlyBracketKeyword_0_0());
                    			
                    // InternalSequence.g:533:4: ( (lv_fragments_1_0= ruleBehaviorFragment ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==28||(LA9_0>=30 && LA9_0<=38)||(LA9_0>=41 && LA9_0<=42)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSequence.g:534:5: (lv_fragments_1_0= ruleBehaviorFragment )
                    	    {
                    	    // InternalSequence.g:534:5: (lv_fragments_1_0= ruleBehaviorFragment )
                    	    // InternalSequence.g:535:6: lv_fragments_1_0= ruleBehaviorFragment
                    	    {

                    	    						newCompositeNode(grammarAccess.getBehaviorFragmentsAccess().getFragmentsBehaviorFragmentParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_fragments_1_0=ruleBehaviorFragment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBehaviorFragmentsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fragments",
                    	    							lv_fragments_1_0,
                    	    							"de.cooperateproject.modeling.textual.sequence.Sequence.BehaviorFragment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBehaviorFragmentsAccess().getRightCurlyBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:558:3: ( (lv_fragments_3_0= ruleBehaviorFragment ) )
                    {
                    // InternalSequence.g:558:3: ( (lv_fragments_3_0= ruleBehaviorFragment ) )
                    // InternalSequence.g:559:4: (lv_fragments_3_0= ruleBehaviorFragment )
                    {
                    // InternalSequence.g:559:4: (lv_fragments_3_0= ruleBehaviorFragment )
                    // InternalSequence.g:560:5: lv_fragments_3_0= ruleBehaviorFragment
                    {

                    					newCompositeNode(grammarAccess.getBehaviorFragmentsAccess().getFragmentsBehaviorFragmentParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fragments_3_0=ruleBehaviorFragment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBehaviorFragmentsRule());
                    					}
                    					add(
                    						current,
                    						"fragments",
                    						lv_fragments_3_0,
                    						"de.cooperateproject.modeling.textual.sequence.Sequence.BehaviorFragment");
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
    // $ANTLR end "ruleBehaviorFragments"


    // $ANTLR start "entryRuleMessage"
    // InternalSequence.g:581:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalSequence.g:581:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalSequence.g:582:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalSequence.g:588:1: ruleMessage returns [EObject current=null] : ( (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )? ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )? ) ;
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
            // InternalSequence.g:594:2: ( ( (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )? ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )? ) )
            // InternalSequence.g:595:2: ( (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )? ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )? )
            {
            // InternalSequence.g:595:2: ( (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )? ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )? )
            // InternalSequence.g:596:3: (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )? ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )?
            {
            // InternalSequence.g:596:3: (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage )
            int alt11=6;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalSequence.g:597:4: this_StandardMessage_0= ruleStandardMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getStandardMessageParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_19);
                    this_StandardMessage_0=ruleStandardMessage();

                    state._fsp--;


                    				current = this_StandardMessage_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSequence.g:606:4: this_ResponseMessage_1= ruleResponseMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getResponseMessageParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_ResponseMessage_1=ruleResponseMessage();

                    state._fsp--;


                    				current = this_ResponseMessage_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalSequence.g:615:4: this_FoundMessage_2= ruleFoundMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_19);
                    this_FoundMessage_2=ruleFoundMessage();

                    state._fsp--;


                    				current = this_FoundMessage_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalSequence.g:624:4: this_LostMessage_3= ruleLostMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getLostMessageParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_19);
                    this_LostMessage_3=ruleLostMessage();

                    state._fsp--;


                    				current = this_LostMessage_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalSequence.g:633:4: this_CreateMessage_4= ruleCreateMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getCreateMessageParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_19);
                    this_CreateMessage_4=ruleCreateMessage();

                    state._fsp--;


                    				current = this_CreateMessage_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalSequence.g:642:4: this_DestructionMessage_5= ruleDestructionMessage
                    {

                    				newCompositeNode(grammarAccess.getMessageAccess().getDestructionMessageParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_19);
                    this_DestructionMessage_5=ruleDestructionMessage();

                    state._fsp--;


                    				current = this_DestructionMessage_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalSequence.g:651:3: (otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSequence.g:652:4: otherlv_6= 'num[' ( (lv_order_7_0= ruleOrder ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getNumKeyword_1_0());
                    			
                    // InternalSequence.g:656:4: ( (lv_order_7_0= ruleOrder ) )
                    // InternalSequence.g:657:5: (lv_order_7_0= ruleOrder )
                    {
                    // InternalSequence.g:657:5: (lv_order_7_0= ruleOrder )
                    // InternalSequence.g:658:6: lv_order_7_0= ruleOrder
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getOrderOrderParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    otherlv_8=(Token)match(input,18,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalSequence.g:680:3: ( (lv_timeConstraint_9_0= ruleTimeConstraint ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSequence.g:681:4: (lv_timeConstraint_9_0= ruleTimeConstraint )
                    {
                    // InternalSequence.g:681:4: (lv_timeConstraint_9_0= ruleTimeConstraint )
                    // InternalSequence.g:682:5: lv_timeConstraint_9_0= ruleTimeConstraint
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
    // InternalSequence.g:703:1: entryRuleTimeConstraint returns [EObject current=null] : iv_ruleTimeConstraint= ruleTimeConstraint EOF ;
    public final EObject entryRuleTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeConstraint = null;


        try {
            // InternalSequence.g:703:55: (iv_ruleTimeConstraint= ruleTimeConstraint EOF )
            // InternalSequence.g:704:2: iv_ruleTimeConstraint= ruleTimeConstraint EOF
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
    // InternalSequence.g:710:1: ruleTimeConstraint returns [EObject current=null] : (otherlv_0= 'time[' ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+ otherlv_2= ']' ) ;
    public final EObject ruleTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:716:2: ( (otherlv_0= 'time[' ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+ otherlv_2= ']' ) )
            // InternalSequence.g:717:2: (otherlv_0= 'time[' ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+ otherlv_2= ']' )
            {
            // InternalSequence.g:717:2: (otherlv_0= 'time[' ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+ otherlv_2= ']' )
            // InternalSequence.g:718:3: otherlv_0= 'time[' ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeConstraintAccess().getTimeKeyword_0());
            		
            // InternalSequence.g:722:3: ( (lv_constraints_1_0= ruleInnerTimeConstraint ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=45 && LA14_0<=48)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSequence.g:723:4: (lv_constraints_1_0= ruleInnerTimeConstraint )
            	    {
            	    // InternalSequence.g:723:4: (lv_constraints_1_0= ruleInnerTimeConstraint )
            	    // InternalSequence.g:724:5: lv_constraints_1_0= ruleInnerTimeConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getTimeConstraintAccess().getConstraintsInnerTimeConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalSequence.g:749:1: entryRuleInnerTimeConstraint returns [EObject current=null] : iv_ruleInnerTimeConstraint= ruleInnerTimeConstraint EOF ;
    public final EObject entryRuleInnerTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerTimeConstraint = null;


        try {
            // InternalSequence.g:749:60: (iv_ruleInnerTimeConstraint= ruleInnerTimeConstraint EOF )
            // InternalSequence.g:750:2: iv_ruleInnerTimeConstraint= ruleInnerTimeConstraint EOF
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
    // InternalSequence.g:756:1: ruleInnerTimeConstraint returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeConstraintType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInnerTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:762:2: ( ( ( (lv_type_0_0= ruleTimeConstraintType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalSequence.g:763:2: ( ( (lv_type_0_0= ruleTimeConstraintType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalSequence.g:763:2: ( ( (lv_type_0_0= ruleTimeConstraintType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalSequence.g:764:3: ( (lv_type_0_0= ruleTimeConstraintType ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalSequence.g:764:3: ( (lv_type_0_0= ruleTimeConstraintType ) )
            // InternalSequence.g:765:4: (lv_type_0_0= ruleTimeConstraintType )
            {
            // InternalSequence.g:765:4: (lv_type_0_0= ruleTimeConstraintType )
            // InternalSequence.g:766:5: lv_type_0_0= ruleTimeConstraintType
            {

            					newCompositeNode(grammarAccess.getInnerTimeConstraintAccess().getTypeTimeConstraintTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInnerTimeConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalSequence.g:787:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalSequence.g:788:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalSequence.g:788:4: (lv_value_2_0= RULE_STRING )
            // InternalSequence.g:789:5: lv_value_2_0= RULE_STRING
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
    // InternalSequence.g:809:1: entryRuleStandardMessage returns [EObject current=null] : iv_ruleStandardMessage= ruleStandardMessage EOF ;
    public final EObject entryRuleStandardMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardMessage = null;


        try {
            // InternalSequence.g:809:56: (iv_ruleStandardMessage= ruleStandardMessage EOF )
            // InternalSequence.g:810:2: iv_ruleStandardMessage= ruleStandardMessage EOF
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
    // InternalSequence.g:816:1: ruleStandardMessage returns [EObject current=null] : ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) ;
    public final EObject ruleStandardMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:822:2: ( ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) )
            // InternalSequence.g:823:2: ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            {
            // InternalSequence.g:823:2: ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            // InternalSequence.g:824:3: ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')'
            {
            // InternalSequence.g:824:3: ( (lv_type_0_0= ruleMessageType ) )
            // InternalSequence.g:825:4: (lv_type_0_0= ruleMessageType )
            {
            // InternalSequence.g:825:4: (lv_type_0_0= ruleMessageType )
            // InternalSequence.g:826:5: lv_type_0_0= ruleMessageType
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

            // InternalSequence.g:843:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSequence.g:844:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSequence.g:844:4: (lv_name_1_0= RULE_STRING )
            // InternalSequence.g:845:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStandardMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:865:3: ( ( ruleFQN ) )
            // InternalSequence.g:866:4: ( ruleFQN )
            {
            // InternalSequence.g:866:4: ( ruleFQN )
            // InternalSequence.g:867:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStandardMessageAccess().getLeftActorCrossReference_3_0());
            				
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getStandardMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:885:3: ( ( ruleFQN ) )
            // InternalSequence.g:886:4: ( ruleFQN )
            {
            // InternalSequence.g:886:4: ( ruleFQN )
            // InternalSequence.g:887:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStandardMessageAccess().getRightActorCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

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
    // InternalSequence.g:909:1: entryRuleResponseMessage returns [EObject current=null] : iv_ruleResponseMessage= ruleResponseMessage EOF ;
    public final EObject entryRuleResponseMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseMessage = null;


        try {
            // InternalSequence.g:909:56: (iv_ruleResponseMessage= ruleResponseMessage EOF )
            // InternalSequence.g:910:2: iv_ruleResponseMessage= ruleResponseMessage EOF
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
    // InternalSequence.g:916:1: ruleResponseMessage returns [EObject current=null] : (otherlv_0= 'resp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' ) ;
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
            // InternalSequence.g:922:2: ( (otherlv_0= 'resp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' ) )
            // InternalSequence.g:923:2: (otherlv_0= 'resp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' )
            {
            // InternalSequence.g:923:2: (otherlv_0= 'resp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' )
            // InternalSequence.g:924:3: otherlv_0= 'resp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseMessageAccess().getRespKeyword_0());
            		
            // InternalSequence.g:928:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSequence.g:929:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSequence.g:929:4: (lv_name_1_0= RULE_STRING )
            // InternalSequence.g:930:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getResponseMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:950:3: ( ( ( ruleFQN ) ) | otherlv_4= '_' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSequence.g:951:4: ( ( ruleFQN ) )
                    {
                    // InternalSequence.g:951:4: ( ( ruleFQN ) )
                    // InternalSequence.g:952:5: ( ruleFQN )
                    {
                    // InternalSequence.g:952:5: ( ruleFQN )
                    // InternalSequence.g:953:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResponseMessageAccess().getLeftActorCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:968:4: otherlv_4= '_'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getResponseMessageAccess().get_Keyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getResponseMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:977:3: ( ( ( ruleFQN ) ) | otherlv_7= '_' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSequence.g:978:4: ( ( ruleFQN ) )
                    {
                    // InternalSequence.g:978:4: ( ( ruleFQN ) )
                    // InternalSequence.g:979:5: ( ruleFQN )
                    {
                    // InternalSequence.g:979:5: ( ruleFQN )
                    // InternalSequence.g:980:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResponseMessageAccess().getRightActorCrossReference_5_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:995:4: otherlv_7= '_'
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getResponseMessageAccess().get_Keyword_5_1());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

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
    // InternalSequence.g:1008:1: entryRuleFoundMessage returns [EObject current=null] : iv_ruleFoundMessage= ruleFoundMessage EOF ;
    public final EObject entryRuleFoundMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoundMessage = null;


        try {
            // InternalSequence.g:1008:53: (iv_ruleFoundMessage= ruleFoundMessage EOF )
            // InternalSequence.g:1009:2: iv_ruleFoundMessage= ruleFoundMessage EOF
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
    // InternalSequence.g:1015:1: ruleFoundMessage returns [EObject current=null] : ( (otherlv_0= 'found' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' ) ;
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
            // InternalSequence.g:1021:2: ( ( (otherlv_0= 'found' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' ) )
            // InternalSequence.g:1022:2: ( (otherlv_0= 'found' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' )
            {
            // InternalSequence.g:1022:2: ( (otherlv_0= 'found' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' )
            // InternalSequence.g:1023:3: (otherlv_0= 'found' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')'
            {
            // InternalSequence.g:1023:3: (otherlv_0= 'found' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSequence.g:1024:4: otherlv_0= 'found'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_29); 

                    				newLeafNode(otherlv_0, grammarAccess.getFoundMessageAccess().getFoundKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSequence.g:1029:3: ( (lv_type_1_0= ruleMessageType ) )
            // InternalSequence.g:1030:4: (lv_type_1_0= ruleMessageType )
            {
            // InternalSequence.g:1030:4: (lv_type_1_0= ruleMessageType )
            // InternalSequence.g:1031:5: lv_type_1_0= ruleMessageType
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

            // InternalSequence.g:1048:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSequence.g:1049:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSequence.g:1049:4: (lv_name_2_0= RULE_STRING )
            // InternalSequence.g:1050:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_3=(Token)match(input,25,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getFoundMessageAccess().get_Keyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getFoundMessageAccess().getCommaKeyword_5());
            		
            // InternalSequence.g:1078:3: ( ( ruleFQN ) )
            // InternalSequence.g:1079:4: ( ruleFQN )
            {
            // InternalSequence.g:1079:4: ( ruleFQN )
            // InternalSequence.g:1080:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoundMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_2); 

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
    // InternalSequence.g:1102:1: entryRuleLostMessage returns [EObject current=null] : iv_ruleLostMessage= ruleLostMessage EOF ;
    public final EObject entryRuleLostMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLostMessage = null;


        try {
            // InternalSequence.g:1102:52: (iv_ruleLostMessage= ruleLostMessage EOF )
            // InternalSequence.g:1103:2: iv_ruleLostMessage= ruleLostMessage EOF
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
    // InternalSequence.g:1109:1: ruleLostMessage returns [EObject current=null] : ( (otherlv_0= 'lost' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' ) ;
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
            // InternalSequence.g:1115:2: ( ( (otherlv_0= 'lost' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' ) )
            // InternalSequence.g:1116:2: ( (otherlv_0= 'lost' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' )
            {
            // InternalSequence.g:1116:2: ( (otherlv_0= 'lost' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' )
            // InternalSequence.g:1117:3: (otherlv_0= 'lost' )? ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')'
            {
            // InternalSequence.g:1117:3: (otherlv_0= 'lost' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSequence.g:1118:4: otherlv_0= 'lost'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_0, grammarAccess.getLostMessageAccess().getLostKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSequence.g:1123:3: ( (lv_type_1_0= ruleMessageType ) )
            // InternalSequence.g:1124:4: (lv_type_1_0= ruleMessageType )
            {
            // InternalSequence.g:1124:4: (lv_type_1_0= ruleMessageType )
            // InternalSequence.g:1125:5: lv_type_1_0= ruleMessageType
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

            // InternalSequence.g:1142:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSequence.g:1143:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSequence.g:1143:4: (lv_name_2_0= RULE_STRING )
            // InternalSequence.g:1144:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_3=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLostMessageAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSequence.g:1164:3: ( ( ruleFQN ) )
            // InternalSequence.g:1165:4: ( ruleFQN )
            {
            // InternalSequence.g:1165:4: ( ruleFQN )
            // InternalSequence.g:1166:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLostMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getLostMessageAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getLostMessageAccess().get_Keyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_2); 

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
    // InternalSequence.g:1196:1: entryRuleCreateMessage returns [EObject current=null] : iv_ruleCreateMessage= ruleCreateMessage EOF ;
    public final EObject entryRuleCreateMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMessage = null;


        try {
            // InternalSequence.g:1196:54: (iv_ruleCreateMessage= ruleCreateMessage EOF )
            // InternalSequence.g:1197:2: iv_ruleCreateMessage= ruleCreateMessage EOF
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
    // InternalSequence.g:1203:1: ruleCreateMessage returns [EObject current=null] : (otherlv_0= 'create' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) ;
    public final EObject ruleCreateMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSequence.g:1209:2: ( (otherlv_0= 'create' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) )
            // InternalSequence.g:1210:2: (otherlv_0= 'create' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            {
            // InternalSequence.g:1210:2: (otherlv_0= 'create' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            // InternalSequence.g:1211:3: otherlv_0= 'create' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMessageAccess().getCreateKeyword_0());
            		
            // InternalSequence.g:1215:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSequence.g:1216:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalSequence.g:1216:4: (lv_name_1_0= RULE_STRING )
                    // InternalSequence.g:1217:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:1237:3: ( ( ruleFQN ) )
            // InternalSequence.g:1238:4: ( ruleFQN )
            {
            // InternalSequence.g:1238:4: ( ruleFQN )
            // InternalSequence.g:1239:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCreateMessageAccess().getLeftActorCrossReference_3_0());
            				
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCreateMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:1257:3: ( ( ruleFQN ) )
            // InternalSequence.g:1258:4: ( ruleFQN )
            {
            // InternalSequence.g:1258:4: ( ruleFQN )
            // InternalSequence.g:1259:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCreateMessageAccess().getRightActorCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

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
    // InternalSequence.g:1281:1: entryRuleDestructionMessage returns [EObject current=null] : iv_ruleDestructionMessage= ruleDestructionMessage EOF ;
    public final EObject entryRuleDestructionMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructionMessage = null;


        try {
            // InternalSequence.g:1281:59: (iv_ruleDestructionMessage= ruleDestructionMessage EOF )
            // InternalSequence.g:1282:2: iv_ruleDestructionMessage= ruleDestructionMessage EOF
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
    // InternalSequence.g:1288:1: ruleDestructionMessage returns [EObject current=null] : (otherlv_0= 'dest' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) ;
    public final EObject ruleDestructionMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSequence.g:1294:2: ( (otherlv_0= 'dest' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' ) )
            // InternalSequence.g:1295:2: (otherlv_0= 'dest' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            {
            // InternalSequence.g:1295:2: (otherlv_0= 'dest' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' )
            // InternalSequence.g:1296:3: otherlv_0= 'dest' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getDestructionMessageAccess().getDestKeyword_0());
            		
            // InternalSequence.g:1300:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSequence.g:1301:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalSequence.g:1301:4: (lv_name_1_0= RULE_STRING )
                    // InternalSequence.g:1302:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDestructionMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:1322:3: ( ( ruleFQN ) )
            // InternalSequence.g:1323:4: ( ruleFQN )
            {
            // InternalSequence.g:1323:4: ( ruleFQN )
            // InternalSequence.g:1324:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructionMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDestructionMessageAccess().getLeftActorCrossReference_3_0());
            				
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDestructionMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:1342:3: ( ( ruleFQN ) )
            // InternalSequence.g:1343:4: ( ruleFQN )
            {
            // InternalSequence.g:1343:4: ( ruleFQN )
            // InternalSequence.g:1344:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructionMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDestructionMessageAccess().getRightActorCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

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
    // InternalSequence.g:1366:1: entryRuleOccurenceSpecification returns [EObject current=null] : iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF ;
    public final EObject entryRuleOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurenceSpecification = null;


        try {
            // InternalSequence.g:1366:63: (iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF )
            // InternalSequence.g:1367:2: iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF
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
    // InternalSequence.g:1373:1: ruleOccurenceSpecification returns [EObject current=null] : this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification ;
    public final EObject ruleOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_DestructionOccurenceSpecification_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1379:2: (this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification )
            // InternalSequence.g:1380:2: this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification
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
    // InternalSequence.g:1391:1: entryRuleDestructionOccurenceSpecification returns [EObject current=null] : iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF ;
    public final EObject entryRuleDestructionOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructionOccurenceSpecification = null;


        try {
            // InternalSequence.g:1391:74: (iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF )
            // InternalSequence.g:1392:2: iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF
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
    // InternalSequence.g:1398:1: ruleDestructionOccurenceSpecification returns [EObject current=null] : (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDestructionOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSequence.g:1404:2: ( (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSequence.g:1405:2: (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSequence.g:1405:2: (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSequence.g:1406:3: otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDestructionOccurenceSpecificationAccess().getDestKeyword_0());
            		
            // InternalSequence.g:1410:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSequence.g:1411:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSequence.g:1411:4: (lv_name_1_0= RULE_ID )
            // InternalSequence.g:1412:5: lv_name_1_0= RULE_ID
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
    // InternalSequence.g:1432:1: entryRuleCombinedFragment returns [EObject current=null] : iv_ruleCombinedFragment= ruleCombinedFragment EOF ;
    public final EObject entryRuleCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinedFragment = null;


        try {
            // InternalSequence.g:1432:57: (iv_ruleCombinedFragment= ruleCombinedFragment EOF )
            // InternalSequence.g:1433:2: iv_ruleCombinedFragment= ruleCombinedFragment EOF
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
    // InternalSequence.g:1439:1: ruleCombinedFragment returns [EObject current=null] : (this_Alternative_0= ruleAlternative | this_Option_1= ruleOption | this_Parallel_2= ruleParallel | this_Critical_3= ruleCritical | this_Loop_4= ruleLoop ) ;
    public final EObject ruleCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject this_Alternative_0 = null;

        EObject this_Option_1 = null;

        EObject this_Parallel_2 = null;

        EObject this_Critical_3 = null;

        EObject this_Loop_4 = null;



        	enterRule();

        try {
            // InternalSequence.g:1445:2: ( (this_Alternative_0= ruleAlternative | this_Option_1= ruleOption | this_Parallel_2= ruleParallel | this_Critical_3= ruleCritical | this_Loop_4= ruleLoop ) )
            // InternalSequence.g:1446:2: (this_Alternative_0= ruleAlternative | this_Option_1= ruleOption | this_Parallel_2= ruleParallel | this_Critical_3= ruleCritical | this_Loop_4= ruleLoop )
            {
            // InternalSequence.g:1446:2: (this_Alternative_0= ruleAlternative | this_Option_1= ruleOption | this_Parallel_2= ruleParallel | this_Critical_3= ruleCritical | this_Loop_4= ruleLoop )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt21=1;
                }
                break;
            case 35:
                {
                alt21=2;
                }
                break;
            case 36:
                {
                alt21=3;
                }
                break;
            case 37:
                {
                alt21=4;
                }
                break;
            case 38:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSequence.g:1447:3: this_Alternative_0= ruleAlternative
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
                    // InternalSequence.g:1456:3: this_Option_1= ruleOption
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
                    // InternalSequence.g:1465:3: this_Parallel_2= ruleParallel
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
                    // InternalSequence.g:1474:3: this_Critical_3= ruleCritical
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
                    // InternalSequence.g:1483:3: this_Loop_4= ruleLoop
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
    // InternalSequence.g:1495:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalSequence.g:1495:52: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalSequence.g:1496:2: iv_ruleAlternative= ruleAlternative EOF
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
    // InternalSequence.g:1502:1: ruleAlternative returns [EObject current=null] : (otherlv_0= 'alt' otherlv_1= '{' ( (lv_alternatives_2_0= ruleBehaviorFragmentsWithCondition ) )+ otherlv_3= '}' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_alternatives_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1508:2: ( (otherlv_0= 'alt' otherlv_1= '{' ( (lv_alternatives_2_0= ruleBehaviorFragmentsWithCondition ) )+ otherlv_3= '}' ) )
            // InternalSequence.g:1509:2: (otherlv_0= 'alt' otherlv_1= '{' ( (lv_alternatives_2_0= ruleBehaviorFragmentsWithCondition ) )+ otherlv_3= '}' )
            {
            // InternalSequence.g:1509:2: (otherlv_0= 'alt' otherlv_1= '{' ( (lv_alternatives_2_0= ruleBehaviorFragmentsWithCondition ) )+ otherlv_3= '}' )
            // InternalSequence.g:1510:3: otherlv_0= 'alt' otherlv_1= '{' ( (lv_alternatives_2_0= ruleBehaviorFragmentsWithCondition ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getAltKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:1518:3: ( (lv_alternatives_2_0= ruleBehaviorFragmentsWithCondition ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSequence.g:1519:4: (lv_alternatives_2_0= ruleBehaviorFragmentsWithCondition )
            	    {
            	    // InternalSequence.g:1519:4: (lv_alternatives_2_0= ruleBehaviorFragmentsWithCondition )
            	    // InternalSequence.g:1520:5: lv_alternatives_2_0= ruleBehaviorFragmentsWithCondition
            	    {

            	    					newCompositeNode(grammarAccess.getAlternativeAccess().getAlternativesBehaviorFragmentsWithConditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_alternatives_2_0=ruleBehaviorFragmentsWithCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"alternatives",
            	    						lv_alternatives_2_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.BehaviorFragmentsWithCondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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
    // InternalSequence.g:1545:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalSequence.g:1545:47: (iv_ruleOption= ruleOption EOF )
            // InternalSequence.g:1546:2: iv_ruleOption= ruleOption EOF
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
    // InternalSequence.g:1552:1: ruleOption returns [EObject current=null] : (otherlv_0= 'opt' otherlv_1= '{' ( (lv_optional_2_0= ruleBehaviorFragmentsWithCondition ) ) otherlv_3= '}' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_optional_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1558:2: ( (otherlv_0= 'opt' otherlv_1= '{' ( (lv_optional_2_0= ruleBehaviorFragmentsWithCondition ) ) otherlv_3= '}' ) )
            // InternalSequence.g:1559:2: (otherlv_0= 'opt' otherlv_1= '{' ( (lv_optional_2_0= ruleBehaviorFragmentsWithCondition ) ) otherlv_3= '}' )
            {
            // InternalSequence.g:1559:2: (otherlv_0= 'opt' otherlv_1= '{' ( (lv_optional_2_0= ruleBehaviorFragmentsWithCondition ) ) otherlv_3= '}' )
            // InternalSequence.g:1560:3: otherlv_0= 'opt' otherlv_1= '{' ( (lv_optional_2_0= ruleBehaviorFragmentsWithCondition ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:1568:3: ( (lv_optional_2_0= ruleBehaviorFragmentsWithCondition ) )
            // InternalSequence.g:1569:4: (lv_optional_2_0= ruleBehaviorFragmentsWithCondition )
            {
            // InternalSequence.g:1569:4: (lv_optional_2_0= ruleBehaviorFragmentsWithCondition )
            // InternalSequence.g:1570:5: lv_optional_2_0= ruleBehaviorFragmentsWithCondition
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getOptionalBehaviorFragmentsWithConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
            lv_optional_2_0=ruleBehaviorFragmentsWithCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					add(
            						current,
            						"optional",
            						lv_optional_2_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.BehaviorFragmentsWithCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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
    // InternalSequence.g:1595:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // InternalSequence.g:1595:49: (iv_ruleParallel= ruleParallel EOF )
            // InternalSequence.g:1596:2: iv_ruleParallel= ruleParallel EOF
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
    // InternalSequence.g:1602:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'par' otherlv_1= '{' ( (lv_parallels_2_0= ruleBehaviorFragments ) )+ otherlv_3= '}' ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parallels_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1608:2: ( (otherlv_0= 'par' otherlv_1= '{' ( (lv_parallels_2_0= ruleBehaviorFragments ) )+ otherlv_3= '}' ) )
            // InternalSequence.g:1609:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parallels_2_0= ruleBehaviorFragments ) )+ otherlv_3= '}' )
            {
            // InternalSequence.g:1609:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_parallels_2_0= ruleBehaviorFragments ) )+ otherlv_3= '}' )
            // InternalSequence.g:1610:3: otherlv_0= 'par' otherlv_1= '{' ( (lv_parallels_2_0= ruleBehaviorFragments ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getParKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:1618:3: ( (lv_parallels_2_0= ruleBehaviorFragments ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20||LA23_0==28||(LA23_0>=30 && LA23_0<=38)||(LA23_0>=41 && LA23_0<=42)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSequence.g:1619:4: (lv_parallels_2_0= ruleBehaviorFragments )
            	    {
            	    // InternalSequence.g:1619:4: (lv_parallels_2_0= ruleBehaviorFragments )
            	    // InternalSequence.g:1620:5: lv_parallels_2_0= ruleBehaviorFragments
            	    {

            	    					newCompositeNode(grammarAccess.getParallelAccess().getParallelsBehaviorFragmentsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_parallels_2_0=ruleBehaviorFragments();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParallelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parallels",
            	    						lv_parallels_2_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.BehaviorFragments");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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
    // InternalSequence.g:1645:1: entryRuleCritical returns [EObject current=null] : iv_ruleCritical= ruleCritical EOF ;
    public final EObject entryRuleCritical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCritical = null;


        try {
            // InternalSequence.g:1645:49: (iv_ruleCritical= ruleCritical EOF )
            // InternalSequence.g:1646:2: iv_ruleCritical= ruleCritical EOF
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
    // InternalSequence.g:1652:1: ruleCritical returns [EObject current=null] : (otherlv_0= 'critical' otherlv_1= '{' ( (lv_fragments_2_0= ruleBehaviorFragment ) )+ otherlv_3= '}' ) ;
    public final EObject ruleCritical() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fragments_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1658:2: ( (otherlv_0= 'critical' otherlv_1= '{' ( (lv_fragments_2_0= ruleBehaviorFragment ) )+ otherlv_3= '}' ) )
            // InternalSequence.g:1659:2: (otherlv_0= 'critical' otherlv_1= '{' ( (lv_fragments_2_0= ruleBehaviorFragment ) )+ otherlv_3= '}' )
            {
            // InternalSequence.g:1659:2: (otherlv_0= 'critical' otherlv_1= '{' ( (lv_fragments_2_0= ruleBehaviorFragment ) )+ otherlv_3= '}' )
            // InternalSequence.g:1660:3: otherlv_0= 'critical' otherlv_1= '{' ( (lv_fragments_2_0= ruleBehaviorFragment ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getCriticalAccess().getCriticalKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCriticalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:1668:3: ( (lv_fragments_2_0= ruleBehaviorFragment ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==28||(LA24_0>=30 && LA24_0<=38)||(LA24_0>=41 && LA24_0<=42)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSequence.g:1669:4: (lv_fragments_2_0= ruleBehaviorFragment )
            	    {
            	    // InternalSequence.g:1669:4: (lv_fragments_2_0= ruleBehaviorFragment )
            	    // InternalSequence.g:1670:5: lv_fragments_2_0= ruleBehaviorFragment
            	    {

            	    					newCompositeNode(grammarAccess.getCriticalAccess().getFragmentsBehaviorFragmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_fragments_2_0=ruleBehaviorFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCriticalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fragments",
            	    						lv_fragments_2_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.BehaviorFragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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
    // InternalSequence.g:1695:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalSequence.g:1695:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalSequence.g:1696:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalSequence.g:1702:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop' otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_fragments_5_0= ruleBehaviorFragment ) )+ otherlv_6= '}' ) ;
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
            // InternalSequence.g:1708:2: ( (otherlv_0= 'loop' otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_fragments_5_0= ruleBehaviorFragment ) )+ otherlv_6= '}' ) )
            // InternalSequence.g:1709:2: (otherlv_0= 'loop' otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_fragments_5_0= ruleBehaviorFragment ) )+ otherlv_6= '}' )
            {
            // InternalSequence.g:1709:2: (otherlv_0= 'loop' otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_fragments_5_0= ruleBehaviorFragment ) )+ otherlv_6= '}' )
            // InternalSequence.g:1710:3: otherlv_0= 'loop' otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_fragments_5_0= ruleBehaviorFragment ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSequence.g:1718:3: ( (lv_condition_2_0= RULE_STRING ) )
            // InternalSequence.g:1719:4: (lv_condition_2_0= RULE_STRING )
            {
            // InternalSequence.g:1719:4: (lv_condition_2_0= RULE_STRING )
            // InternalSequence.g:1720:5: lv_condition_2_0= RULE_STRING
            {
            lv_condition_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSequence.g:1744:3: ( (lv_fragments_5_0= ruleBehaviorFragment ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28||(LA25_0>=30 && LA25_0<=38)||(LA25_0>=41 && LA25_0<=42)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSequence.g:1745:4: (lv_fragments_5_0= ruleBehaviorFragment )
            	    {
            	    // InternalSequence.g:1745:4: (lv_fragments_5_0= ruleBehaviorFragment )
            	    // InternalSequence.g:1746:5: lv_fragments_5_0= ruleBehaviorFragment
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getFragmentsBehaviorFragmentParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_fragments_5_0=ruleBehaviorFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fragments",
            	    						lv_fragments_5_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.BehaviorFragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBehaviorFragmentsWithCondition"
    // InternalSequence.g:1771:1: entryRuleBehaviorFragmentsWithCondition returns [EObject current=null] : iv_ruleBehaviorFragmentsWithCondition= ruleBehaviorFragmentsWithCondition EOF ;
    public final EObject entryRuleBehaviorFragmentsWithCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorFragmentsWithCondition = null;


        try {
            // InternalSequence.g:1771:71: (iv_ruleBehaviorFragmentsWithCondition= ruleBehaviorFragmentsWithCondition EOF )
            // InternalSequence.g:1772:2: iv_ruleBehaviorFragmentsWithCondition= ruleBehaviorFragmentsWithCondition EOF
            {
             newCompositeNode(grammarAccess.getBehaviorFragmentsWithConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorFragmentsWithCondition=ruleBehaviorFragmentsWithCondition();

            state._fsp--;

             current =iv_ruleBehaviorFragmentsWithCondition; 
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
    // $ANTLR end "entryRuleBehaviorFragmentsWithCondition"


    // $ANTLR start "ruleBehaviorFragmentsWithCondition"
    // InternalSequence.g:1778:1: ruleBehaviorFragmentsWithCondition returns [EObject current=null] : (otherlv_0= '[' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= ']' ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleBehaviorFragment ) )+ otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleBehaviorFragment ) ) ) ) ;
    public final EObject ruleBehaviorFragmentsWithCondition() throws RecognitionException {
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
            // InternalSequence.g:1784:2: ( (otherlv_0= '[' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= ']' ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleBehaviorFragment ) )+ otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleBehaviorFragment ) ) ) ) )
            // InternalSequence.g:1785:2: (otherlv_0= '[' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= ']' ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleBehaviorFragment ) )+ otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleBehaviorFragment ) ) ) )
            {
            // InternalSequence.g:1785:2: (otherlv_0= '[' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= ']' ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleBehaviorFragment ) )+ otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleBehaviorFragment ) ) ) )
            // InternalSequence.g:1786:3: otherlv_0= '[' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= ']' ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleBehaviorFragment ) )+ otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleBehaviorFragment ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorFragmentsWithConditionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSequence.g:1790:3: ( (lv_condition_1_0= RULE_STRING ) )
            // InternalSequence.g:1791:4: (lv_condition_1_0= RULE_STRING )
            {
            // InternalSequence.g:1791:4: (lv_condition_1_0= RULE_STRING )
            // InternalSequence.g:1792:5: lv_condition_1_0= RULE_STRING
            {
            lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_condition_1_0, grammarAccess.getBehaviorFragmentsWithConditionAccess().getConditionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviorFragmentsWithConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorFragmentsWithConditionAccess().getRightSquareBracketKeyword_2());
            		
            // InternalSequence.g:1812:3: ( (otherlv_3= '{' ( (lv_fragments_4_0= ruleBehaviorFragment ) )+ otherlv_5= '}' ) | ( (lv_fragments_6_0= ruleBehaviorFragment ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            else if ( (LA27_0==28||(LA27_0>=30 && LA27_0<=38)||(LA27_0>=41 && LA27_0<=42)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSequence.g:1813:4: (otherlv_3= '{' ( (lv_fragments_4_0= ruleBehaviorFragment ) )+ otherlv_5= '}' )
                    {
                    // InternalSequence.g:1813:4: (otherlv_3= '{' ( (lv_fragments_4_0= ruleBehaviorFragment ) )+ otherlv_5= '}' )
                    // InternalSequence.g:1814:5: otherlv_3= '{' ( (lv_fragments_4_0= ruleBehaviorFragment ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_17); 

                    					newLeafNode(otherlv_3, grammarAccess.getBehaviorFragmentsWithConditionAccess().getLeftCurlyBracketKeyword_3_0_0());
                    				
                    // InternalSequence.g:1818:5: ( (lv_fragments_4_0= ruleBehaviorFragment ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==28||(LA26_0>=30 && LA26_0<=38)||(LA26_0>=41 && LA26_0<=42)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalSequence.g:1819:6: (lv_fragments_4_0= ruleBehaviorFragment )
                    	    {
                    	    // InternalSequence.g:1819:6: (lv_fragments_4_0= ruleBehaviorFragment )
                    	    // InternalSequence.g:1820:7: lv_fragments_4_0= ruleBehaviorFragment
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsBehaviorFragmentParserRuleCall_3_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_fragments_4_0=ruleBehaviorFragment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorFragmentsWithConditionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fragments",
                    	    								lv_fragments_4_0,
                    	    								"de.cooperateproject.modeling.textual.sequence.Sequence.BehaviorFragment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getBehaviorFragmentsWithConditionAccess().getRightCurlyBracketKeyword_3_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1843:4: ( (lv_fragments_6_0= ruleBehaviorFragment ) )
                    {
                    // InternalSequence.g:1843:4: ( (lv_fragments_6_0= ruleBehaviorFragment ) )
                    // InternalSequence.g:1844:5: (lv_fragments_6_0= ruleBehaviorFragment )
                    {
                    // InternalSequence.g:1844:5: (lv_fragments_6_0= ruleBehaviorFragment )
                    // InternalSequence.g:1845:6: lv_fragments_6_0= ruleBehaviorFragment
                    {

                    						newCompositeNode(grammarAccess.getBehaviorFragmentsWithConditionAccess().getFragmentsBehaviorFragmentParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fragments_6_0=ruleBehaviorFragment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorFragmentsWithConditionRule());
                    						}
                    						add(
                    							current,
                    							"fragments",
                    							lv_fragments_6_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.BehaviorFragment");
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
    // $ANTLR end "ruleBehaviorFragmentsWithCondition"


    // $ANTLR start "entryRuleFQN"
    // InternalSequence.g:1867:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSequence.g:1867:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSequence.g:1868:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalSequence.g:1874:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSequence.g:1880:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSequence.g:1881:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSequence.g:1881:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSequence.g:1882:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSequence.g:1889:3: (kw= '.' this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSequence.g:1890:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalSequence.g:1907:1: entryRuleOrder returns [String current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final String entryRuleOrder() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrder = null;


        try {
            // InternalSequence.g:1907:45: (iv_ruleOrder= ruleOrder EOF )
            // InternalSequence.g:1908:2: iv_ruleOrder= ruleOrder EOF
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
    // InternalSequence.g:1914:1: ruleOrder returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleOrder() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSequence.g:1920:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) )
            // InternalSequence.g:1921:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            {
            // InternalSequence.g:1921:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            // InternalSequence.g:1922:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )*
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getOrderAccess().getINTTerminalRuleCall_0());
            		
            // InternalSequence.g:1929:3: (kw= '.' this_INT_2= RULE_INT )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSequence.g:1930:4: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,40,FOLLOW_20); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getOrderAccess().getFullStopKeyword_1_0());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_38); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getOrderAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSequence.g:1947:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalSequence.g:1947:51: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalSequence.g:1948:2: iv_ruleCommentBody= ruleCommentBody EOF
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
    // InternalSequence.g:1954:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSequence.g:1960:2: (this_STRING_0= RULE_STRING )
            // InternalSequence.g:1961:2: this_STRING_0= RULE_STRING
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
    // InternalSequence.g:1971:1: ruleMessageType returns [Enumerator current=null] : ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) ) ;
    public final Enumerator ruleMessageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSequence.g:1977:2: ( ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) ) )
            // InternalSequence.g:1978:2: ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) )
            {
            // InternalSequence.g:1978:2: ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            else if ( (LA30_0==42) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSequence.g:1979:3: (enumLiteral_0= 'sync' )
                    {
                    // InternalSequence.g:1979:3: (enumLiteral_0= 'sync' )
                    // InternalSequence.g:1980:4: enumLiteral_0= 'sync'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1987:3: (enumLiteral_1= 'async' )
                    {
                    // InternalSequence.g:1987:3: (enumLiteral_1= 'async' )
                    // InternalSequence.g:1988:4: enumLiteral_1= 'async'
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
    // InternalSequence.g:1998:1: ruleActorType returns [Enumerator current=null] : ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) ;
    public final Enumerator ruleActorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSequence.g:2004:2: ( ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) )
            // InternalSequence.g:2005:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            {
            // InternalSequence.g:2005:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            else if ( (LA31_0==44) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalSequence.g:2006:3: (enumLiteral_0= 'human' )
                    {
                    // InternalSequence.g:2006:3: (enumLiteral_0= 'human' )
                    // InternalSequence.g:2007:4: enumLiteral_0= 'human'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:2014:3: (enumLiteral_1= 'machine' )
                    {
                    // InternalSequence.g:2014:3: (enumLiteral_1= 'machine' )
                    // InternalSequence.g:2015:4: enumLiteral_1= 'machine'
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
    // InternalSequence.g:2025:1: ruleTimeConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'd' ) | (enumLiteral_1= 't' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'diff' ) ) ;
    public final Enumerator ruleTimeConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSequence.g:2031:2: ( ( (enumLiteral_0= 'd' ) | (enumLiteral_1= 't' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'diff' ) ) )
            // InternalSequence.g:2032:2: ( (enumLiteral_0= 'd' ) | (enumLiteral_1= 't' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'diff' ) )
            {
            // InternalSequence.g:2032:2: ( (enumLiteral_0= 'd' ) | (enumLiteral_1= 't' ) | (enumLiteral_2= 'max' ) | (enumLiteral_3= 'diff' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt32=1;
                }
                break;
            case 46:
                {
                alt32=2;
                }
                break;
            case 47:
                {
                alt32=3;
                }
                break;
            case 48:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSequence.g:2033:3: (enumLiteral_0= 'd' )
                    {
                    // InternalSequence.g:2033:3: (enumLiteral_0= 'd' )
                    // InternalSequence.g:2034:4: enumLiteral_0= 'd'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTimeConstraintTypeAccess().getDURATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeConstraintTypeAccess().getDURATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:2041:3: (enumLiteral_1= 't' )
                    {
                    // InternalSequence.g:2041:3: (enumLiteral_1= 't' )
                    // InternalSequence.g:2042:4: enumLiteral_1= 't'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTimeConstraintTypeAccess().getTIMEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeConstraintTypeAccess().getTIMEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSequence.g:2049:3: (enumLiteral_2= 'max' )
                    {
                    // InternalSequence.g:2049:3: (enumLiteral_2= 'max' )
                    // InternalSequence.g:2050:4: enumLiteral_2= 'max'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTimeConstraintTypeAccess().getMAXIMUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeConstraintTypeAccess().getMAXIMUMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSequence.g:2057:3: (enumLiteral_3= 'diff' )
                    {
                    // InternalSequence.g:2057:3: (enumLiteral_3= 'diff' )
                    // InternalSequence.g:2058:4: enumLiteral_3= 'diff'
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


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\34\2\4\5\uffff\1\31\1\5\1\32\2\5\1\32\1\uffff";
    static final String dfa_3s = "\1\52\2\4\5\uffff\1\31\1\35\1\50\1\5\1\35\1\50\1\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\3\1\4\1\5\1\6\6\uffff\1\1";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\uffff\1\4\1\5\1\6\1\7\7\uffff\1\1\1\2",
            "\1\10",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\11",
            "\1\12\27\uffff\1\4",
            "\1\14\15\uffff\1\13",
            "\1\15",
            "\1\16\27\uffff\1\5",
            "\1\14\15\uffff\1\13",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "596:3: (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000067FD0004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000067FD0000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000088030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000067FD0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000067FD0200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001E00000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000067FD0100000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000067FD0300000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000002L});

}