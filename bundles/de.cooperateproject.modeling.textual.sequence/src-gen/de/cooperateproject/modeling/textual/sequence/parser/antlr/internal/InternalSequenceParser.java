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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-seqd'", "'@end-seqd'", "'rootElement'", "'act'", "':'", "'as'", "'role['", "']'", "'('", "','", "')'", "'found'", "'_'", "'lost'", "'dest'", "'.'", "'sync'", "'async'", "'human'", "'machine'"
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
    // InternalSequence.g:143:1: ruleRootPackage returns [EObject current=null] : (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )* ( (otherlv_4= RULE_ID ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actors_2_0 = null;

        EObject lv_interactionFragments_3_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:149:2: ( (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )* ( (otherlv_4= RULE_ID ) )* ) )
            // InternalSequence.g:150:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )* ( (otherlv_4= RULE_ID ) )* )
            {
            // InternalSequence.g:150:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )* ( (otherlv_4= RULE_ID ) )* )
            // InternalSequence.g:151:3: otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_interactionFragments_3_0= ruleInteractionFragment ) )* ( (otherlv_4= RULE_ID ) )*
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

                if ( (LA1_0==RULE_STRING||(LA1_0>=14 && LA1_0<=15)) ) {
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

                if ( (LA2_0==22||(LA2_0>=24 && LA2_0<=25)||(LA2_0>=27 && LA2_0<=28)) ) {
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

            // InternalSequence.g:212:3: ( (otherlv_4= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSequence.g:213:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSequence.g:213:4: (otherlv_4= RULE_ID )
            	    // InternalSequence.g:214:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRootPackageRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(otherlv_4, grammarAccess.getRootPackageAccess().getClsClassifierCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalSequence.g:229:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalSequence.g:229:46: (iv_ruleActor= ruleActor EOF )
            // InternalSequence.g:230:2: iv_ruleActor= ruleActor EOF
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
    // InternalSequence.g:236:1: ruleActor returns [EObject current=null] : ( (otherlv_0= 'act' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) ) | ( (otherlv_9= ':' ( ( ruleFQN ) ) otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) ) (otherlv_13= 'role[' ( (lv_actorType_14_0= ruleActorType ) ) otherlv_15= ']' )? ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_alias_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_alias_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_actorType_14_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:242:2: ( ( (otherlv_0= 'act' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) ) | ( (otherlv_9= ':' ( ( ruleFQN ) ) otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) ) (otherlv_13= 'role[' ( (lv_actorType_14_0= ruleActorType ) ) otherlv_15= ']' )? ) ) )
            // InternalSequence.g:243:2: ( (otherlv_0= 'act' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) ) | ( (otherlv_9= ':' ( ( ruleFQN ) ) otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) ) (otherlv_13= 'role[' ( (lv_actorType_14_0= ruleActorType ) ) otherlv_15= ']' )? ) )
            {
            // InternalSequence.g:243:2: ( (otherlv_0= 'act' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) ) | ( (otherlv_9= ':' ( ( ruleFQN ) ) otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) ) (otherlv_13= 'role[' ( (lv_actorType_14_0= ruleActorType ) ) otherlv_15= ']' )? ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSequence.g:244:3: (otherlv_0= 'act' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) )
                    {
                    // InternalSequence.g:244:3: (otherlv_0= 'act' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) )
                    // InternalSequence.g:245:4: otherlv_0= 'act' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) )
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActKeyword_0_0());
                    			
                    // InternalSequence.g:249:4: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) )
                    // InternalSequence.g:250:5: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) )
                    {
                    // InternalSequence.g:250:5: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSequence.g:251:6: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSequence.g:251:6: (lv_name_1_0= RULE_ID )
                    // InternalSequence.g:252:7: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_1_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getActorAccess().getColonKeyword_0_1_1());
                    				
                    // InternalSequence.g:272:5: ( ( ruleFQN ) )
                    // InternalSequence.g:273:6: ( ruleFQN )
                    {
                    // InternalSequence.g:273:6: ( ruleFQN )
                    // InternalSequence.g:274:7: ruleFQN
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getActorAccess().getTypeClassifierCrossReference_0_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:291:3: ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )
                    {
                    // InternalSequence.g:291:3: ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )
                    // InternalSequence.g:292:4: ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) )
                    {
                    // InternalSequence.g:292:4: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalSequence.g:293:5: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalSequence.g:293:5: (lv_name_4_0= RULE_STRING )
                    // InternalSequence.g:294:6: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getActorAccess().getColonKeyword_1_1());
                    			
                    // InternalSequence.g:314:4: ( ( ruleFQN ) )
                    // InternalSequence.g:315:5: ( ruleFQN )
                    {
                    // InternalSequence.g:315:5: ( ruleFQN )
                    // InternalSequence.g:316:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActorAccess().getTypeClassifierCrossReference_1_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getActorAccess().getAsKeyword_1_3());
                    			
                    // InternalSequence.g:334:4: ( (lv_alias_8_0= RULE_ID ) )
                    // InternalSequence.g:335:5: (lv_alias_8_0= RULE_ID )
                    {
                    // InternalSequence.g:335:5: (lv_alias_8_0= RULE_ID )
                    // InternalSequence.g:336:6: lv_alias_8_0= RULE_ID
                    {
                    lv_alias_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_alias_8_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_1_4_0());
                    					

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
                    // InternalSequence.g:354:3: ( (otherlv_9= ':' ( ( ruleFQN ) ) otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) ) (otherlv_13= 'role[' ( (lv_actorType_14_0= ruleActorType ) ) otherlv_15= ']' )? )
                    {
                    // InternalSequence.g:354:3: ( (otherlv_9= ':' ( ( ruleFQN ) ) otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) ) (otherlv_13= 'role[' ( (lv_actorType_14_0= ruleActorType ) ) otherlv_15= ']' )? )
                    // InternalSequence.g:355:4: (otherlv_9= ':' ( ( ruleFQN ) ) otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) ) (otherlv_13= 'role[' ( (lv_actorType_14_0= ruleActorType ) ) otherlv_15= ']' )?
                    {
                    // InternalSequence.g:355:4: (otherlv_9= ':' ( ( ruleFQN ) ) otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) )
                    // InternalSequence.g:356:5: otherlv_9= ':' ( ( ruleFQN ) ) otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_9, grammarAccess.getActorAccess().getColonKeyword_2_0_0());
                    				
                    // InternalSequence.g:360:5: ( ( ruleFQN ) )
                    // InternalSequence.g:361:6: ( ruleFQN )
                    {
                    // InternalSequence.g:361:6: ( ruleFQN )
                    // InternalSequence.g:362:7: ruleFQN
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getActorAccess().getTypeClassifierCrossReference_2_0_1_0());
                    						
                    pushFollow(FOLLOW_11);
                    ruleFQN();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_11, grammarAccess.getActorAccess().getAsKeyword_2_0_2());
                    				
                    // InternalSequence.g:380:5: ( (lv_alias_12_0= RULE_ID ) )
                    // InternalSequence.g:381:6: (lv_alias_12_0= RULE_ID )
                    {
                    // InternalSequence.g:381:6: (lv_alias_12_0= RULE_ID )
                    // InternalSequence.g:382:7: lv_alias_12_0= RULE_ID
                    {
                    lv_alias_12_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    							newLeafNode(lv_alias_12_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_2_0_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_12_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }

                    // InternalSequence.g:399:4: (otherlv_13= 'role[' ( (lv_actorType_14_0= ruleActorType ) ) otherlv_15= ']' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==17) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSequence.g:400:5: otherlv_13= 'role[' ( (lv_actorType_14_0= ruleActorType ) ) otherlv_15= ']'
                            {
                            otherlv_13=(Token)match(input,17,FOLLOW_13); 

                            					newLeafNode(otherlv_13, grammarAccess.getActorAccess().getRoleKeyword_2_1_0());
                            				
                            // InternalSequence.g:404:5: ( (lv_actorType_14_0= ruleActorType ) )
                            // InternalSequence.g:405:6: (lv_actorType_14_0= ruleActorType )
                            {
                            // InternalSequence.g:405:6: (lv_actorType_14_0= ruleActorType )
                            // InternalSequence.g:406:7: lv_actorType_14_0= ruleActorType
                            {

                            							newCompositeNode(grammarAccess.getActorAccess().getActorTypeActorTypeEnumRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_actorType_14_0=ruleActorType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getActorRule());
                            							}
                            							set(
                            								current,
                            								"actorType",
                            								lv_actorType_14_0,
                            								"de.cooperateproject.modeling.textual.sequence.Sequence.ActorType");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_15=(Token)match(input,18,FOLLOW_2); 

                            					newLeafNode(otherlv_15, grammarAccess.getActorAccess().getRightSquareBracketKeyword_2_1_2());
                            				

                            }
                            break;

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleInteractionFragment"
    // InternalSequence.g:433:1: entryRuleInteractionFragment returns [EObject current=null] : iv_ruleInteractionFragment= ruleInteractionFragment EOF ;
    public final EObject entryRuleInteractionFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionFragment = null;


        try {
            // InternalSequence.g:433:60: (iv_ruleInteractionFragment= ruleInteractionFragment EOF )
            // InternalSequence.g:434:2: iv_ruleInteractionFragment= ruleInteractionFragment EOF
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
    // InternalSequence.g:440:1: ruleInteractionFragment returns [EObject current=null] : (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification ) ;
    public final EObject ruleInteractionFragment() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_OccurenceSpecification_1 = null;



        	enterRule();

        try {
            // InternalSequence.g:446:2: ( (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification ) )
            // InternalSequence.g:447:2: (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification )
            {
            // InternalSequence.g:447:2: (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22||LA6_0==24||(LA6_0>=27 && LA6_0<=28)) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSequence.g:448:3: this_Message_0= ruleMessage
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
                    // InternalSequence.g:457:3: this_OccurenceSpecification_1= ruleOccurenceSpecification
                    {

                    			newCompositeNode(grammarAccess.getInteractionFragmentAccess().getOccurenceSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OccurenceSpecification_1=ruleOccurenceSpecification();

                    state._fsp--;


                    			current = this_OccurenceSpecification_1;
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
    // InternalSequence.g:469:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalSequence.g:469:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalSequence.g:470:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalSequence.g:476:1: ruleMessage returns [EObject current=null] : (this_FoundMessage_0= ruleFoundMessage | this_LostMessage_1= ruleLostMessage | ( ( (lv_type_2_0= ruleMessageType ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ',' ( ( ruleFQN ) ) otherlv_8= ')' ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_FoundMessage_0 = null;

        EObject this_LostMessage_1 = null;

        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:482:2: ( (this_FoundMessage_0= ruleFoundMessage | this_LostMessage_1= ruleLostMessage | ( ( (lv_type_2_0= ruleMessageType ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ',' ( ( ruleFQN ) ) otherlv_8= ')' ) ) )
            // InternalSequence.g:483:2: (this_FoundMessage_0= ruleFoundMessage | this_LostMessage_1= ruleLostMessage | ( ( (lv_type_2_0= ruleMessageType ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ',' ( ( ruleFQN ) ) otherlv_8= ')' ) )
            {
            // InternalSequence.g:483:2: (this_FoundMessage_0= ruleFoundMessage | this_LostMessage_1= ruleLostMessage | ( ( (lv_type_2_0= ruleMessageType ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ',' ( ( ruleFQN ) ) otherlv_8= ')' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 27:
            case 28:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSequence.g:484:3: this_FoundMessage_0= ruleFoundMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FoundMessage_0=ruleFoundMessage();

                    state._fsp--;


                    			current = this_FoundMessage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:493:3: this_LostMessage_1= ruleLostMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getLostMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LostMessage_1=ruleLostMessage();

                    state._fsp--;


                    			current = this_LostMessage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSequence.g:502:3: ( ( (lv_type_2_0= ruleMessageType ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ',' ( ( ruleFQN ) ) otherlv_8= ')' )
                    {
                    // InternalSequence.g:502:3: ( ( (lv_type_2_0= ruleMessageType ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ',' ( ( ruleFQN ) ) otherlv_8= ')' )
                    // InternalSequence.g:503:4: ( (lv_type_2_0= ruleMessageType ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ',' ( ( ruleFQN ) ) otherlv_8= ')'
                    {
                    // InternalSequence.g:503:4: ( (lv_type_2_0= ruleMessageType ) )
                    // InternalSequence.g:504:5: (lv_type_2_0= ruleMessageType )
                    {
                    // InternalSequence.g:504:5: (lv_type_2_0= ruleMessageType )
                    // InternalSequence.g:505:6: lv_type_2_0= ruleMessageType
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getTypeMessageTypeEnumRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_type_2_0=ruleMessageType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.MessageType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSequence.g:522:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalSequence.g:523:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalSequence.g:523:5: (lv_name_3_0= RULE_STRING )
                    // InternalSequence.g:524:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getMessageAccess().getNameSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalSequence.g:544:4: ( ( ruleFQN ) )
                    // InternalSequence.g:545:5: ( ruleFQN )
                    {
                    // InternalSequence.g:545:5: ( ruleFQN )
                    // InternalSequence.g:546:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageAccess().getLeftActorCrossReference_2_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getCommaKeyword_2_4());
                    			
                    // InternalSequence.g:564:4: ( ( ruleFQN ) )
                    // InternalSequence.g:565:5: ( ruleFQN )
                    {
                    // InternalSequence.g:565:5: ( ruleFQN )
                    // InternalSequence.g:566:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageAccess().getRightActorCrossReference_2_5_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getRightParenthesisKeyword_2_6());
                    			

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleFoundMessage"
    // InternalSequence.g:589:1: entryRuleFoundMessage returns [EObject current=null] : iv_ruleFoundMessage= ruleFoundMessage EOF ;
    public final EObject entryRuleFoundMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoundMessage = null;


        try {
            // InternalSequence.g:589:53: (iv_ruleFoundMessage= ruleFoundMessage EOF )
            // InternalSequence.g:590:2: iv_ruleFoundMessage= ruleFoundMessage EOF
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
    // InternalSequence.g:596:1: ruleFoundMessage returns [EObject current=null] : (otherlv_0= 'found' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' ) ;
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
            // InternalSequence.g:602:2: ( (otherlv_0= 'found' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' ) )
            // InternalSequence.g:603:2: (otherlv_0= 'found' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' )
            {
            // InternalSequence.g:603:2: (otherlv_0= 'found' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' )
            // InternalSequence.g:604:3: otherlv_0= 'found' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFoundMessageAccess().getFoundKeyword_0());
            		
            // InternalSequence.g:608:3: ( (lv_type_1_0= ruleMessageType ) )
            // InternalSequence.g:609:4: (lv_type_1_0= ruleMessageType )
            {
            // InternalSequence.g:609:4: (lv_type_1_0= ruleMessageType )
            // InternalSequence.g:610:5: lv_type_1_0= ruleMessageType
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

            // InternalSequence.g:627:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSequence.g:628:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSequence.g:628:4: (lv_name_2_0= RULE_STRING )
            // InternalSequence.g:629:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_3=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getFoundMessageAccess().get_Keyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getFoundMessageAccess().getCommaKeyword_5());
            		
            // InternalSequence.g:657:3: ( ( ruleFQN ) )
            // InternalSequence.g:658:4: ( ruleFQN )
            {
            // InternalSequence.g:658:4: ( ruleFQN )
            // InternalSequence.g:659:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoundMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0());
            				
            pushFollow(FOLLOW_17);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

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
    // InternalSequence.g:681:1: entryRuleLostMessage returns [EObject current=null] : iv_ruleLostMessage= ruleLostMessage EOF ;
    public final EObject entryRuleLostMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLostMessage = null;


        try {
            // InternalSequence.g:681:52: (iv_ruleLostMessage= ruleLostMessage EOF )
            // InternalSequence.g:682:2: iv_ruleLostMessage= ruleLostMessage EOF
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
    // InternalSequence.g:688:1: ruleLostMessage returns [EObject current=null] : (otherlv_0= 'lost' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' ) ;
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
            // InternalSequence.g:694:2: ( (otherlv_0= 'lost' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' ) )
            // InternalSequence.g:695:2: (otherlv_0= 'lost' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' )
            {
            // InternalSequence.g:695:2: (otherlv_0= 'lost' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')' )
            // InternalSequence.g:696:3: otherlv_0= 'lost' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '(' ( ( ruleFQN ) ) otherlv_5= ',' otherlv_6= '_' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getLostMessageAccess().getLostKeyword_0());
            		
            // InternalSequence.g:700:3: ( (lv_type_1_0= ruleMessageType ) )
            // InternalSequence.g:701:4: (lv_type_1_0= ruleMessageType )
            {
            // InternalSequence.g:701:4: (lv_type_1_0= ruleMessageType )
            // InternalSequence.g:702:5: lv_type_1_0= ruleMessageType
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

            // InternalSequence.g:719:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSequence.g:720:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSequence.g:720:4: (lv_name_2_0= RULE_STRING )
            // InternalSequence.g:721:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_3=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLostMessageAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSequence.g:741:3: ( ( ruleFQN ) )
            // InternalSequence.g:742:4: ( ruleFQN )
            {
            // InternalSequence.g:742:4: ( ruleFQN )
            // InternalSequence.g:743:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLostMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getLostMessageAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getLostMessageAccess().get_Keyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOccurenceSpecification"
    // InternalSequence.g:773:1: entryRuleOccurenceSpecification returns [EObject current=null] : iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF ;
    public final EObject entryRuleOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurenceSpecification = null;


        try {
            // InternalSequence.g:773:63: (iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF )
            // InternalSequence.g:774:2: iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF
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
    // InternalSequence.g:780:1: ruleOccurenceSpecification returns [EObject current=null] : this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification ;
    public final EObject ruleOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_DestructionOccurenceSpecification_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:786:2: (this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification )
            // InternalSequence.g:787:2: this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification
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
    // InternalSequence.g:798:1: entryRuleDestructionOccurenceSpecification returns [EObject current=null] : iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF ;
    public final EObject entryRuleDestructionOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructionOccurenceSpecification = null;


        try {
            // InternalSequence.g:798:74: (iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF )
            // InternalSequence.g:799:2: iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF
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
    // InternalSequence.g:805:1: ruleDestructionOccurenceSpecification returns [EObject current=null] : (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDestructionOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSequence.g:811:2: ( (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSequence.g:812:2: (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSequence.g:812:2: (otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSequence.g:813:3: otherlv_0= 'dest' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDestructionOccurenceSpecificationAccess().getDestKeyword_0());
            		
            // InternalSequence.g:817:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSequence.g:818:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSequence.g:818:4: (lv_name_1_0= RULE_ID )
            // InternalSequence.g:819:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleFQN"
    // InternalSequence.g:839:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSequence.g:839:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSequence.g:840:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalSequence.g:846:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSequence.g:852:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSequence.g:853:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSequence.g:853:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSequence.g:854:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSequence.g:861:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSequence.g:862:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "entryRuleCommentBody"
    // InternalSequence.g:879:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalSequence.g:879:51: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalSequence.g:880:2: iv_ruleCommentBody= ruleCommentBody EOF
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
    // InternalSequence.g:886:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSequence.g:892:2: (this_STRING_0= RULE_STRING )
            // InternalSequence.g:893:2: this_STRING_0= RULE_STRING
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
    // InternalSequence.g:903:1: ruleMessageType returns [Enumerator current=null] : ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) ) ;
    public final Enumerator ruleMessageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSequence.g:909:2: ( ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) ) )
            // InternalSequence.g:910:2: ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) )
            {
            // InternalSequence.g:910:2: ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSequence.g:911:3: (enumLiteral_0= 'sync' )
                    {
                    // InternalSequence.g:911:3: (enumLiteral_0= 'sync' )
                    // InternalSequence.g:912:4: enumLiteral_0= 'sync'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:919:3: (enumLiteral_1= 'async' )
                    {
                    // InternalSequence.g:919:3: (enumLiteral_1= 'async' )
                    // InternalSequence.g:920:4: enumLiteral_1= 'async'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSequence.g:930:1: ruleActorType returns [Enumerator current=null] : ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) ;
    public final Enumerator ruleActorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSequence.g:936:2: ( ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) )
            // InternalSequence.g:937:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            {
            // InternalSequence.g:937:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            else if ( (LA10_0==30) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSequence.g:938:3: (enumLiteral_0= 'human' )
                    {
                    // InternalSequence.g:938:3: (enumLiteral_0= 'human' )
                    // InternalSequence.g:939:4: enumLiteral_0= 'human'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:946:3: (enumLiteral_1= 'machine' )
                    {
                    // InternalSequence.g:946:3: (enumLiteral_1= 'machine' )
                    // InternalSequence.g:947:4: enumLiteral_1= 'machine'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001B40C032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001B400022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000019400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});

}