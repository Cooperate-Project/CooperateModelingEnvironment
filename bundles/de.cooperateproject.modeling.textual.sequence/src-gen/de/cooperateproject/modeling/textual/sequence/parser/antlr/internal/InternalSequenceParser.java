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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-seqd'", "'@end-seqd'", "'rootElement'", "'def'", "'act'", "'as'", "'role['", "']'", "':'", "'{'", "'}'", "'['", "'arrives'", "'arrival'", "'('", "','", "')'", "'reply'", "'_'", "'found'", "'lost'", "'create'", "'dest'", "'par'", "'alt'", "'loop'", "'opt'", "'critical'", "'ref'", "'cstr'", "'t'", "'d'", "'obs'", "'.'", "'note'", "'sync'", "'async'", "'human'", "'machine'"
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
    // InternalSequence.g:72:1: ruleSequenceDiagram returns [EObject current=null] : ( () otherlv_1= '@start-seqd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) ( (lv_actors_4_0= ruleActor ) )* ( (lv_fragments_5_0= ruleFragment ) )* ( ( (lv_fragments_6_1= ruleConstraint | lv_fragments_6_2= ruleObservation ) ) )* otherlv_7= '@end-seqd' ) ;
    public final EObject ruleSequenceDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_7=null;
        EObject lv_rootPackage_3_0 = null;

        EObject lv_actors_4_0 = null;

        EObject lv_fragments_5_0 = null;

        EObject lv_fragments_6_1 = null;

        EObject lv_fragments_6_2 = null;



        	enterRule();

        try {
            // InternalSequence.g:78:2: ( ( () otherlv_1= '@start-seqd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) ( (lv_actors_4_0= ruleActor ) )* ( (lv_fragments_5_0= ruleFragment ) )* ( ( (lv_fragments_6_1= ruleConstraint | lv_fragments_6_2= ruleObservation ) ) )* otherlv_7= '@end-seqd' ) )
            // InternalSequence.g:79:2: ( () otherlv_1= '@start-seqd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) ( (lv_actors_4_0= ruleActor ) )* ( (lv_fragments_5_0= ruleFragment ) )* ( ( (lv_fragments_6_1= ruleConstraint | lv_fragments_6_2= ruleObservation ) ) )* otherlv_7= '@end-seqd' )
            {
            // InternalSequence.g:79:2: ( () otherlv_1= '@start-seqd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) ( (lv_actors_4_0= ruleActor ) )* ( (lv_fragments_5_0= ruleFragment ) )* ( ( (lv_fragments_6_1= ruleConstraint | lv_fragments_6_2= ruleObservation ) ) )* otherlv_7= '@end-seqd' )
            // InternalSequence.g:80:3: () otherlv_1= '@start-seqd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) ( (lv_actors_4_0= ruleActor ) )* ( (lv_fragments_5_0= ruleFragment ) )* ( ( (lv_fragments_6_1= ruleConstraint | lv_fragments_6_2= ruleObservation ) ) )* otherlv_7= '@end-seqd'
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

            // InternalSequence.g:128:3: ( (lv_actors_4_0= ruleActor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSequence.g:129:4: (lv_actors_4_0= ruleActor )
            	    {
            	    // InternalSequence.g:129:4: (lv_actors_4_0= ruleActor )
            	    // InternalSequence.g:130:5: lv_actors_4_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getSequenceDiagramAccess().getActorsActorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_actors_4_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSequenceDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_4_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSequence.g:147:3: ( (lv_fragments_5_0= ruleFragment ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24||LA2_0==28||(LA2_0>=30 && LA2_0<=39)||(LA2_0>=46 && LA2_0<=47)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSequence.g:148:4: (lv_fragments_5_0= ruleFragment )
            	    {
            	    // InternalSequence.g:148:4: (lv_fragments_5_0= ruleFragment )
            	    // InternalSequence.g:149:5: lv_fragments_5_0= ruleFragment
            	    {

            	    					newCompositeNode(grammarAccess.getSequenceDiagramAccess().getFragmentsFragmentParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_fragments_5_0=ruleFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSequenceDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fragments",
            	    						lv_fragments_5_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.Fragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSequence.g:166:3: ( ( (lv_fragments_6_1= ruleConstraint | lv_fragments_6_2= ruleObservation ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==40||LA4_0==43) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSequence.g:167:4: ( (lv_fragments_6_1= ruleConstraint | lv_fragments_6_2= ruleObservation ) )
            	    {
            	    // InternalSequence.g:167:4: ( (lv_fragments_6_1= ruleConstraint | lv_fragments_6_2= ruleObservation ) )
            	    // InternalSequence.g:168:5: (lv_fragments_6_1= ruleConstraint | lv_fragments_6_2= ruleObservation )
            	    {
            	    // InternalSequence.g:168:5: (lv_fragments_6_1= ruleConstraint | lv_fragments_6_2= ruleObservation )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==40) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==43) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalSequence.g:169:6: lv_fragments_6_1= ruleConstraint
            	            {

            	            						newCompositeNode(grammarAccess.getSequenceDiagramAccess().getFragmentsConstraintParserRuleCall_6_0_0());
            	            					
            	            pushFollow(FOLLOW_7);
            	            lv_fragments_6_1=ruleConstraint();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSequenceDiagramRule());
            	            						}
            	            						add(
            	            							current,
            	            							"fragments",
            	            							lv_fragments_6_1,
            	            							"de.cooperateproject.modeling.textual.sequence.Sequence.Constraint");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalSequence.g:185:6: lv_fragments_6_2= ruleObservation
            	            {

            	            						newCompositeNode(grammarAccess.getSequenceDiagramAccess().getFragmentsObservationParserRuleCall_6_0_1());
            	            					
            	            pushFollow(FOLLOW_7);
            	            lv_fragments_6_2=ruleObservation();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSequenceDiagramRule());
            	            						}
            	            						add(
            	            							current,
            	            							"fragments",
            	            							lv_fragments_6_2,
            	            							"de.cooperateproject.modeling.textual.sequence.Sequence.Observation");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSequenceDiagramAccess().getEndSeqdKeyword_7());
            		

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
    // InternalSequence.g:211:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalSequence.g:211:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalSequence.g:212:2: iv_ruleRootPackage= ruleRootPackage EOF
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
    // InternalSequence.g:218:1: ruleRootPackage returns [EObject current=null] : (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:224:2: ( (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ) )
            // InternalSequence.g:225:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) )
            {
            // InternalSequence.g:225:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) )
            // InternalSequence.g:226:3: otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRootPackageAccess().getRootElementKeyword_0());
            		
            // InternalSequence.g:230:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalSequence.g:231:4: (lv_name_1_0= ruleFQN )
            {
            // InternalSequence.g:231:4: (lv_name_1_0= ruleFQN )
            // InternalSequence.g:232:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalSequence.g:253:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalSequence.g:253:46: (iv_ruleActor= ruleActor EOF )
            // InternalSequence.g:254:2: iv_ruleActor= ruleActor EOF
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
    // InternalSequence.g:260:1: ruleActor returns [EObject current=null] : ( ( (lv_deferred_0_0= 'def' ) )? otherlv_1= 'act' ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) ) (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )? ( (lv_comments_14_0= ruleInlineComment ) )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_deferred_0_0=null;
        Token otherlv_1=null;
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

        EObject lv_comments_14_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:266:2: ( ( ( (lv_deferred_0_0= 'def' ) )? otherlv_1= 'act' ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) ) (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )? ( (lv_comments_14_0= ruleInlineComment ) )? ) )
            // InternalSequence.g:267:2: ( ( (lv_deferred_0_0= 'def' ) )? otherlv_1= 'act' ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) ) (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )? ( (lv_comments_14_0= ruleInlineComment ) )? )
            {
            // InternalSequence.g:267:2: ( ( (lv_deferred_0_0= 'def' ) )? otherlv_1= 'act' ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) ) (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )? ( (lv_comments_14_0= ruleInlineComment ) )? )
            // InternalSequence.g:268:3: ( (lv_deferred_0_0= 'def' ) )? otherlv_1= 'act' ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) ) (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )? ( (lv_comments_14_0= ruleInlineComment ) )?
            {
            // InternalSequence.g:268:3: ( (lv_deferred_0_0= 'def' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSequence.g:269:4: (lv_deferred_0_0= 'def' )
                    {
                    // InternalSequence.g:269:4: (lv_deferred_0_0= 'def' )
                    // InternalSequence.g:270:5: lv_deferred_0_0= 'def'
                    {
                    lv_deferred_0_0=(Token)match(input,14,FOLLOW_9); 

                    					newLeafNode(lv_deferred_0_0, grammarAccess.getActorAccess().getDeferredDefKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActorRule());
                    					}
                    					setWithLastConsumed(current, "deferred", true, "def");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getActorAccess().getActKeyword_1());
            		
            // InternalSequence.g:286:3: ( ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? ) | ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) | ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
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
                    // InternalSequence.g:287:4: ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? )
                    {
                    // InternalSequence.g:287:4: ( ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )? )
                    // InternalSequence.g:288:5: ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )?
                    {
                    // InternalSequence.g:288:5: ( (lv_name_2_0= RULE_ID ) )
                    // InternalSequence.g:289:6: (lv_name_2_0= RULE_ID )
                    {
                    // InternalSequence.g:289:6: (lv_name_2_0= RULE_ID )
                    // InternalSequence.g:290:7: lv_name_2_0= RULE_ID
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

                    // InternalSequence.g:306:5: ( (lv_typeMapping_3_0= ruleActorClassifierMapping ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==19) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSequence.g:307:6: (lv_typeMapping_3_0= ruleActorClassifierMapping )
                            {
                            // InternalSequence.g:307:6: (lv_typeMapping_3_0= ruleActorClassifierMapping )
                            // InternalSequence.g:308:7: lv_typeMapping_3_0= ruleActorClassifierMapping
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
                    // InternalSequence.g:327:4: ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    {
                    // InternalSequence.g:327:4: ( ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    // InternalSequence.g:328:5: ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) )
                    {
                    // InternalSequence.g:328:5: ( (lv_typeMapping_4_0= ruleActorClassifierMapping ) )
                    // InternalSequence.g:329:6: (lv_typeMapping_4_0= ruleActorClassifierMapping )
                    {
                    // InternalSequence.g:329:6: (lv_typeMapping_4_0= ruleActorClassifierMapping )
                    // InternalSequence.g:330:7: lv_typeMapping_4_0= ruleActorClassifierMapping
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

                    otherlv_5=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getActorAccess().getAsKeyword_2_1_1());
                    				
                    // InternalSequence.g:351:5: ( (lv_alias_6_0= RULE_ID ) )
                    // InternalSequence.g:352:6: (lv_alias_6_0= RULE_ID )
                    {
                    // InternalSequence.g:352:6: (lv_alias_6_0= RULE_ID )
                    // InternalSequence.g:353:7: lv_alias_6_0= RULE_ID
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
                    // InternalSequence.g:371:4: ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) )
                    {
                    // InternalSequence.g:371:4: ( ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) )
                    // InternalSequence.g:372:5: ( (lv_name_7_0= RULE_STRING ) ) ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )? otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) )
                    {
                    // InternalSequence.g:372:5: ( (lv_name_7_0= RULE_STRING ) )
                    // InternalSequence.g:373:6: (lv_name_7_0= RULE_STRING )
                    {
                    // InternalSequence.g:373:6: (lv_name_7_0= RULE_STRING )
                    // InternalSequence.g:374:7: lv_name_7_0= RULE_STRING
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

                    // InternalSequence.g:390:5: ( (lv_typeMapping_8_0= ruleActorClassifierMapping ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSequence.g:391:6: (lv_typeMapping_8_0= ruleActorClassifierMapping )
                            {
                            // InternalSequence.g:391:6: (lv_typeMapping_8_0= ruleActorClassifierMapping )
                            // InternalSequence.g:392:7: lv_typeMapping_8_0= ruleActorClassifierMapping
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

                    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(otherlv_9, grammarAccess.getActorAccess().getAsKeyword_2_2_2());
                    				
                    // InternalSequence.g:413:5: ( (lv_alias_10_0= RULE_ID ) )
                    // InternalSequence.g:414:6: (lv_alias_10_0= RULE_ID )
                    {
                    // InternalSequence.g:414:6: (lv_alias_10_0= RULE_ID )
                    // InternalSequence.g:415:7: lv_alias_10_0= RULE_ID
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

            // InternalSequence.g:433:3: (otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSequence.g:434:4: otherlv_11= 'role[' ( (lv_actorType_12_0= ruleActorType ) ) otherlv_13= ']'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getActorAccess().getRoleKeyword_3_0());
                    			
                    // InternalSequence.g:438:4: ( (lv_actorType_12_0= ruleActorType ) )
                    // InternalSequence.g:439:5: (lv_actorType_12_0= ruleActorType )
                    {
                    // InternalSequence.g:439:5: (lv_actorType_12_0= ruleActorType )
                    // InternalSequence.g:440:6: lv_actorType_12_0= ruleActorType
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

                    otherlv_13=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getActorAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalSequence.g:462:3: ( (lv_comments_14_0= ruleInlineComment ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSequence.g:463:4: (lv_comments_14_0= ruleInlineComment )
                    {
                    // InternalSequence.g:463:4: (lv_comments_14_0= ruleInlineComment )
                    // InternalSequence.g:464:5: lv_comments_14_0= ruleInlineComment
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getCommentsInlineCommentParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_14_0=ruleInlineComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActorRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_14_0,
                    						"de.cooperateproject.modeling.textual.sequence.Sequence.InlineComment");
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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleActorClassifierMapping"
    // InternalSequence.g:485:1: entryRuleActorClassifierMapping returns [EObject current=null] : iv_ruleActorClassifierMapping= ruleActorClassifierMapping EOF ;
    public final EObject entryRuleActorClassifierMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorClassifierMapping = null;


        try {
            // InternalSequence.g:485:63: (iv_ruleActorClassifierMapping= ruleActorClassifierMapping EOF )
            // InternalSequence.g:486:2: iv_ruleActorClassifierMapping= ruleActorClassifierMapping EOF
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
    // InternalSequence.g:492:1: ruleActorClassifierMapping returns [EObject current=null] : (otherlv_0= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleActorClassifierMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSequence.g:498:2: ( (otherlv_0= ':' ( ( ruleFQN ) ) ) )
            // InternalSequence.g:499:2: (otherlv_0= ':' ( ( ruleFQN ) ) )
            {
            // InternalSequence.g:499:2: (otherlv_0= ':' ( ( ruleFQN ) ) )
            // InternalSequence.g:500:3: otherlv_0= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getActorClassifierMappingAccess().getColonKeyword_0());
            		
            // InternalSequence.g:504:3: ( ( ruleFQN ) )
            // InternalSequence.g:505:4: ( ruleFQN )
            {
            // InternalSequence.g:505:4: ( ruleFQN )
            // InternalSequence.g:506:5: ruleFQN
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


    // $ANTLR start "entryRuleFragment"
    // InternalSequence.g:524:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalSequence.g:524:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalSequence.g:525:2: iv_ruleFragment= ruleFragment EOF
            {
             newCompositeNode(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragment=ruleFragment();

            state._fsp--;

             current =iv_ruleFragment; 
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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalSequence.g:531:1: ruleFragment returns [EObject current=null] : (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment | this_Reference_3= ruleReference ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_OccurenceSpecification_1 = null;

        EObject this_CombinedFragment_2 = null;

        EObject this_Reference_3 = null;



        	enterRule();

        try {
            // InternalSequence.g:537:2: ( (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment | this_Reference_3= ruleReference ) )
            // InternalSequence.g:538:2: (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment | this_Reference_3= ruleReference )
            {
            // InternalSequence.g:538:2: (this_Message_0= ruleMessage | this_OccurenceSpecification_1= ruleOccurenceSpecification | this_CombinedFragment_2= ruleCombinedFragment | this_Reference_3= ruleReference )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 28:
            case 30:
            case 31:
            case 32:
            case 46:
            case 47:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_ID) ) {
                    int LA11_6 = input.LA(3);

                    if ( (LA11_6==EOF||LA11_6==12||(LA11_6>=20 && LA11_6<=22)||LA11_6==24||LA11_6==28||(LA11_6>=30 && LA11_6<=40)||(LA11_6>=43 && LA11_6<=44)||(LA11_6>=46 && LA11_6<=47)) ) {
                        alt11=2;
                    }
                    else if ( (LA11_6==25) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA11_2==RULE_STRING||LA11_2==25) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt11=3;
                }
                break;
            case 39:
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
                    // InternalSequence.g:539:3: this_Message_0= ruleMessage
                    {

                    			newCompositeNode(grammarAccess.getFragmentAccess().getMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Message_0=ruleMessage();

                    state._fsp--;


                    			current = this_Message_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:548:3: this_OccurenceSpecification_1= ruleOccurenceSpecification
                    {

                    			newCompositeNode(grammarAccess.getFragmentAccess().getOccurenceSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OccurenceSpecification_1=ruleOccurenceSpecification();

                    state._fsp--;


                    			current = this_OccurenceSpecification_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSequence.g:557:3: this_CombinedFragment_2= ruleCombinedFragment
                    {

                    			newCompositeNode(grammarAccess.getFragmentAccess().getCombinedFragmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CombinedFragment_2=ruleCombinedFragment();

                    state._fsp--;


                    			current = this_CombinedFragment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSequence.g:566:3: this_Reference_3= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getFragmentAccess().getReferenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_3=ruleReference();

                    state._fsp--;


                    			current = this_Reference_3;
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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleOneFragment"
    // InternalSequence.g:578:1: entryRuleOneFragment returns [EObject current=null] : iv_ruleOneFragment= ruleOneFragment EOF ;
    public final EObject entryRuleOneFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneFragment = null;


        try {
            // InternalSequence.g:578:52: (iv_ruleOneFragment= ruleOneFragment EOF )
            // InternalSequence.g:579:2: iv_ruleOneFragment= ruleOneFragment EOF
            {
             newCompositeNode(grammarAccess.getOneFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneFragment=ruleOneFragment();

            state._fsp--;

             current =iv_ruleOneFragment; 
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
    // $ANTLR end "entryRuleOneFragment"


    // $ANTLR start "ruleOneFragment"
    // InternalSequence.g:585:1: ruleOneFragment returns [EObject current=null] : ( (lv_fragments_0_0= ruleFragment ) ) ;
    public final EObject ruleOneFragment() throws RecognitionException {
        EObject current = null;

        EObject lv_fragments_0_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:591:2: ( ( (lv_fragments_0_0= ruleFragment ) ) )
            // InternalSequence.g:592:2: ( (lv_fragments_0_0= ruleFragment ) )
            {
            // InternalSequence.g:592:2: ( (lv_fragments_0_0= ruleFragment ) )
            // InternalSequence.g:593:3: (lv_fragments_0_0= ruleFragment )
            {
            // InternalSequence.g:593:3: (lv_fragments_0_0= ruleFragment )
            // InternalSequence.g:594:4: lv_fragments_0_0= ruleFragment
            {

            				newCompositeNode(grammarAccess.getOneFragmentAccess().getFragmentsFragmentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_fragments_0_0=ruleFragment();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOneFragmentRule());
            				}
            				add(
            					current,
            					"fragments",
            					lv_fragments_0_0,
            					"de.cooperateproject.modeling.textual.sequence.Sequence.Fragment");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleOneFragment"


    // $ANTLR start "entryRuleOneOrMultipleFragments"
    // InternalSequence.g:614:1: entryRuleOneOrMultipleFragments returns [EObject current=null] : iv_ruleOneOrMultipleFragments= ruleOneOrMultipleFragments EOF ;
    public final EObject entryRuleOneOrMultipleFragments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneOrMultipleFragments = null;


        try {
            // InternalSequence.g:614:63: (iv_ruleOneOrMultipleFragments= ruleOneOrMultipleFragments EOF )
            // InternalSequence.g:615:2: iv_ruleOneOrMultipleFragments= ruleOneOrMultipleFragments EOF
            {
             newCompositeNode(grammarAccess.getOneOrMultipleFragmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneOrMultipleFragments=ruleOneOrMultipleFragments();

            state._fsp--;

             current =iv_ruleOneOrMultipleFragments; 
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
    // $ANTLR end "entryRuleOneOrMultipleFragments"


    // $ANTLR start "ruleOneOrMultipleFragments"
    // InternalSequence.g:621:1: ruleOneOrMultipleFragments returns [EObject current=null] : ( (lv_fragments_0_0= ruleFragment ) )+ ;
    public final EObject ruleOneOrMultipleFragments() throws RecognitionException {
        EObject current = null;

        EObject lv_fragments_0_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:627:2: ( ( (lv_fragments_0_0= ruleFragment ) )+ )
            // InternalSequence.g:628:2: ( (lv_fragments_0_0= ruleFragment ) )+
            {
            // InternalSequence.g:628:2: ( (lv_fragments_0_0= ruleFragment ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24||LA12_0==28||(LA12_0>=30 && LA12_0<=39)||(LA12_0>=46 && LA12_0<=47)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSequence.g:629:3: (lv_fragments_0_0= ruleFragment )
            	    {
            	    // InternalSequence.g:629:3: (lv_fragments_0_0= ruleFragment )
            	    // InternalSequence.g:630:4: lv_fragments_0_0= ruleFragment
            	    {

            	    				newCompositeNode(grammarAccess.getOneOrMultipleFragmentsAccess().getFragmentsFragmentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_18);
            	    lv_fragments_0_0=ruleFragment();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getOneOrMultipleFragmentsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"fragments",
            	    					lv_fragments_0_0,
            	    					"de.cooperateproject.modeling.textual.sequence.Sequence.Fragment");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


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
    // $ANTLR end "ruleOneOrMultipleFragments"


    // $ANTLR start "entryRuleOrderedFragmentContainer"
    // InternalSequence.g:650:1: entryRuleOrderedFragmentContainer returns [EObject current=null] : iv_ruleOrderedFragmentContainer= ruleOrderedFragmentContainer EOF ;
    public final EObject entryRuleOrderedFragmentContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedFragmentContainer = null;


        try {
            // InternalSequence.g:650:65: (iv_ruleOrderedFragmentContainer= ruleOrderedFragmentContainer EOF )
            // InternalSequence.g:651:2: iv_ruleOrderedFragmentContainer= ruleOrderedFragmentContainer EOF
            {
             newCompositeNode(grammarAccess.getOrderedFragmentContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderedFragmentContainer=ruleOrderedFragmentContainer();

            state._fsp--;

             current =iv_ruleOrderedFragmentContainer; 
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
    // $ANTLR end "entryRuleOrderedFragmentContainer"


    // $ANTLR start "ruleOrderedFragmentContainer"
    // InternalSequence.g:657:1: ruleOrderedFragmentContainer returns [EObject current=null] : ( (otherlv_0= '{' this_OneOrMultipleFragments_1= ruleOneOrMultipleFragments otherlv_2= '}' ) | this_OneFragment_3= ruleOneFragment ) ;
    public final EObject ruleOrderedFragmentContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_OneOrMultipleFragments_1 = null;

        EObject this_OneFragment_3 = null;



        	enterRule();

        try {
            // InternalSequence.g:663:2: ( ( (otherlv_0= '{' this_OneOrMultipleFragments_1= ruleOneOrMultipleFragments otherlv_2= '}' ) | this_OneFragment_3= ruleOneFragment ) )
            // InternalSequence.g:664:2: ( (otherlv_0= '{' this_OneOrMultipleFragments_1= ruleOneOrMultipleFragments otherlv_2= '}' ) | this_OneFragment_3= ruleOneFragment )
            {
            // InternalSequence.g:664:2: ( (otherlv_0= '{' this_OneOrMultipleFragments_1= ruleOneOrMultipleFragments otherlv_2= '}' ) | this_OneFragment_3= ruleOneFragment )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==24||LA13_0==28||(LA13_0>=30 && LA13_0<=39)||(LA13_0>=46 && LA13_0<=47)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSequence.g:665:3: (otherlv_0= '{' this_OneOrMultipleFragments_1= ruleOneOrMultipleFragments otherlv_2= '}' )
                    {
                    // InternalSequence.g:665:3: (otherlv_0= '{' this_OneOrMultipleFragments_1= ruleOneOrMultipleFragments otherlv_2= '}' )
                    // InternalSequence.g:666:4: otherlv_0= '{' this_OneOrMultipleFragments_1= ruleOneOrMultipleFragments otherlv_2= '}'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_0, grammarAccess.getOrderedFragmentContainerAccess().getLeftCurlyBracketKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getOrderedFragmentContainerAccess().getOneOrMultipleFragmentsParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_20);
                    this_OneOrMultipleFragments_1=ruleOneOrMultipleFragments();

                    state._fsp--;


                    				current = this_OneOrMultipleFragments_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getOrderedFragmentContainerAccess().getRightCurlyBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:684:3: this_OneFragment_3= ruleOneFragment
                    {

                    			newCompositeNode(grammarAccess.getOrderedFragmentContainerAccess().getOneFragmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneFragment_3=ruleOneFragment();

                    state._fsp--;


                    			current = this_OneFragment_3;
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
    // $ANTLR end "ruleOrderedFragmentContainer"


    // $ANTLR start "entryRuleCondition"
    // InternalSequence.g:696:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSequence.g:696:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSequence.g:697:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSequence.g:703:1: ruleCondition returns [EObject current=null] : (otherlv_0= '[' ( (lv_condition_1_0= ruleUnescapedString ) ) otherlv_2= ']' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_condition_1_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:709:2: ( (otherlv_0= '[' ( (lv_condition_1_0= ruleUnescapedString ) ) otherlv_2= ']' ) )
            // InternalSequence.g:710:2: (otherlv_0= '[' ( (lv_condition_1_0= ruleUnescapedString ) ) otherlv_2= ']' )
            {
            // InternalSequence.g:710:2: (otherlv_0= '[' ( (lv_condition_1_0= ruleUnescapedString ) ) otherlv_2= ']' )
            // InternalSequence.g:711:3: otherlv_0= '[' ( (lv_condition_1_0= ruleUnescapedString ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSequence.g:715:3: ( (lv_condition_1_0= ruleUnescapedString ) )
            // InternalSequence.g:716:4: (lv_condition_1_0= ruleUnescapedString )
            {
            // InternalSequence.g:716:4: (lv_condition_1_0= ruleUnescapedString )
            // InternalSequence.g:717:5: lv_condition_1_0= ruleUnescapedString
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getConditionUnescapedStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_condition_1_0=ruleUnescapedString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOrderedFragmentContainerWithCondition"
    // InternalSequence.g:742:1: entryRuleOrderedFragmentContainerWithCondition returns [EObject current=null] : iv_ruleOrderedFragmentContainerWithCondition= ruleOrderedFragmentContainerWithCondition EOF ;
    public final EObject entryRuleOrderedFragmentContainerWithCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedFragmentContainerWithCondition = null;


        try {
            // InternalSequence.g:742:78: (iv_ruleOrderedFragmentContainerWithCondition= ruleOrderedFragmentContainerWithCondition EOF )
            // InternalSequence.g:743:2: iv_ruleOrderedFragmentContainerWithCondition= ruleOrderedFragmentContainerWithCondition EOF
            {
             newCompositeNode(grammarAccess.getOrderedFragmentContainerWithConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderedFragmentContainerWithCondition=ruleOrderedFragmentContainerWithCondition();

            state._fsp--;

             current =iv_ruleOrderedFragmentContainerWithCondition; 
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
    // $ANTLR end "entryRuleOrderedFragmentContainerWithCondition"


    // $ANTLR start "ruleOrderedFragmentContainerWithCondition"
    // InternalSequence.g:749:1: ruleOrderedFragmentContainerWithCondition returns [EObject current=null] : ( ( (lv_condition_0_0= ruleCondition ) ) ( (otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' ) | ( (lv_fragments_4_0= ruleFragment ) ) ) ) ;
    public final EObject ruleOrderedFragmentContainerWithCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_0_0 = null;

        EObject lv_fragments_2_0 = null;

        EObject lv_fragments_4_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:755:2: ( ( ( (lv_condition_0_0= ruleCondition ) ) ( (otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' ) | ( (lv_fragments_4_0= ruleFragment ) ) ) ) )
            // InternalSequence.g:756:2: ( ( (lv_condition_0_0= ruleCondition ) ) ( (otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' ) | ( (lv_fragments_4_0= ruleFragment ) ) ) )
            {
            // InternalSequence.g:756:2: ( ( (lv_condition_0_0= ruleCondition ) ) ( (otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' ) | ( (lv_fragments_4_0= ruleFragment ) ) ) )
            // InternalSequence.g:757:3: ( (lv_condition_0_0= ruleCondition ) ) ( (otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' ) | ( (lv_fragments_4_0= ruleFragment ) ) )
            {
            // InternalSequence.g:757:3: ( (lv_condition_0_0= ruleCondition ) )
            // InternalSequence.g:758:4: (lv_condition_0_0= ruleCondition )
            {
            // InternalSequence.g:758:4: (lv_condition_0_0= ruleCondition )
            // InternalSequence.g:759:5: lv_condition_0_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getConditionConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_condition_0_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderedFragmentContainerWithConditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSequence.g:776:3: ( (otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' ) | ( (lv_fragments_4_0= ruleFragment ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==24||LA15_0==28||(LA15_0>=30 && LA15_0<=39)||(LA15_0>=46 && LA15_0<=47)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSequence.g:777:4: (otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' )
                    {
                    // InternalSequence.g:777:4: (otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' )
                    // InternalSequence.g:778:5: otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_19); 

                    					newLeafNode(otherlv_1, grammarAccess.getOrderedFragmentContainerWithConditionAccess().getLeftCurlyBracketKeyword_1_0_0());
                    				
                    // InternalSequence.g:782:5: ( (lv_fragments_2_0= ruleFragment ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24||LA14_0==28||(LA14_0>=30 && LA14_0<=39)||(LA14_0>=46 && LA14_0<=47)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSequence.g:783:6: (lv_fragments_2_0= ruleFragment )
                    	    {
                    	    // InternalSequence.g:783:6: (lv_fragments_2_0= ruleFragment )
                    	    // InternalSequence.g:784:7: lv_fragments_2_0= ruleFragment
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsFragmentParserRuleCall_1_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_fragments_2_0=ruleFragment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOrderedFragmentContainerWithConditionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fragments",
                    	    								lv_fragments_2_0,
                    	    								"de.cooperateproject.modeling.textual.sequence.Sequence.Fragment");
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

                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getOrderedFragmentContainerWithConditionAccess().getRightCurlyBracketKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:807:4: ( (lv_fragments_4_0= ruleFragment ) )
                    {
                    // InternalSequence.g:807:4: ( (lv_fragments_4_0= ruleFragment ) )
                    // InternalSequence.g:808:5: (lv_fragments_4_0= ruleFragment )
                    {
                    // InternalSequence.g:808:5: (lv_fragments_4_0= ruleFragment )
                    // InternalSequence.g:809:6: lv_fragments_4_0= ruleFragment
                    {

                    						newCompositeNode(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsFragmentParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fragments_4_0=ruleFragment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrderedFragmentContainerWithConditionRule());
                    						}
                    						add(
                    							current,
                    							"fragments",
                    							lv_fragments_4_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.Fragment");
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
    // $ANTLR end "ruleOrderedFragmentContainerWithCondition"


    // $ANTLR start "entryRuleOrderedFragmentContainerWithConditionMandatoryBrackets"
    // InternalSequence.g:831:1: entryRuleOrderedFragmentContainerWithConditionMandatoryBrackets returns [EObject current=null] : iv_ruleOrderedFragmentContainerWithConditionMandatoryBrackets= ruleOrderedFragmentContainerWithConditionMandatoryBrackets EOF ;
    public final EObject entryRuleOrderedFragmentContainerWithConditionMandatoryBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedFragmentContainerWithConditionMandatoryBrackets = null;


        try {
            // InternalSequence.g:831:95: (iv_ruleOrderedFragmentContainerWithConditionMandatoryBrackets= ruleOrderedFragmentContainerWithConditionMandatoryBrackets EOF )
            // InternalSequence.g:832:2: iv_ruleOrderedFragmentContainerWithConditionMandatoryBrackets= ruleOrderedFragmentContainerWithConditionMandatoryBrackets EOF
            {
             newCompositeNode(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderedFragmentContainerWithConditionMandatoryBrackets=ruleOrderedFragmentContainerWithConditionMandatoryBrackets();

            state._fsp--;

             current =iv_ruleOrderedFragmentContainerWithConditionMandatoryBrackets; 
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
    // $ANTLR end "entryRuleOrderedFragmentContainerWithConditionMandatoryBrackets"


    // $ANTLR start "ruleOrderedFragmentContainerWithConditionMandatoryBrackets"
    // InternalSequence.g:838:1: ruleOrderedFragmentContainerWithConditionMandatoryBrackets returns [EObject current=null] : ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' ) ;
    public final EObject ruleOrderedFragmentContainerWithConditionMandatoryBrackets() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_0_0 = null;

        EObject lv_fragments_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:844:2: ( ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' ) )
            // InternalSequence.g:845:2: ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' )
            {
            // InternalSequence.g:845:2: ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}' )
            // InternalSequence.g:846:3: ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '{' ( (lv_fragments_2_0= ruleFragment ) )+ otherlv_3= '}'
            {
            // InternalSequence.g:846:3: ( (lv_condition_0_0= ruleCondition ) )
            // InternalSequence.g:847:4: (lv_condition_0_0= ruleCondition )
            {
            // InternalSequence.g:847:4: (lv_condition_0_0= ruleCondition )
            // InternalSequence.g:848:5: lv_condition_0_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getConditionConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_condition_0_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:869:3: ( (lv_fragments_2_0= ruleFragment ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24||LA16_0==28||(LA16_0>=30 && LA16_0<=39)||(LA16_0>=46 && LA16_0<=47)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSequence.g:870:4: (lv_fragments_2_0= ruleFragment )
            	    {
            	    // InternalSequence.g:870:4: (lv_fragments_2_0= ruleFragment )
            	    // InternalSequence.g:871:5: lv_fragments_2_0= ruleFragment
            	    {

            	    					newCompositeNode(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsFragmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_fragments_2_0=ruleFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fragments",
            	    						lv_fragments_2_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.Fragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOrderedFragmentContainerWithConditionMandatoryBrackets"


    // $ANTLR start "entryRuleMessage"
    // InternalSequence.g:896:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalSequence.g:896:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalSequence.g:897:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalSequence.g:903:1: ruleMessage returns [EObject current=null] : (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_StandardMessage_0 = null;

        EObject this_ResponseMessage_1 = null;

        EObject this_FoundMessage_2 = null;

        EObject this_LostMessage_3 = null;

        EObject this_CreateMessage_4 = null;

        EObject this_DestructionMessage_5 = null;



        	enterRule();

        try {
            // InternalSequence.g:909:2: ( (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage ) )
            // InternalSequence.g:910:2: (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage )
            {
            // InternalSequence.g:910:2: (this_StandardMessage_0= ruleStandardMessage | this_ResponseMessage_1= ruleResponseMessage | this_FoundMessage_2= ruleFoundMessage | this_LostMessage_3= ruleLostMessage | this_CreateMessage_4= ruleCreateMessage | this_DestructionMessage_5= ruleDestructionMessage )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 46:
            case 47:
                {
                alt17=1;
                }
                break;
            case 28:
                {
                alt17=2;
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            case 31:
                {
                alt17=4;
                }
                break;
            case 32:
                {
                alt17=5;
                }
                break;
            case 33:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSequence.g:911:3: this_StandardMessage_0= ruleStandardMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getStandardMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StandardMessage_0=ruleStandardMessage();

                    state._fsp--;


                    			current = this_StandardMessage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:920:3: this_ResponseMessage_1= ruleResponseMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getResponseMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ResponseMessage_1=ruleResponseMessage();

                    state._fsp--;


                    			current = this_ResponseMessage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSequence.g:929:3: this_FoundMessage_2= ruleFoundMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FoundMessage_2=ruleFoundMessage();

                    state._fsp--;


                    			current = this_FoundMessage_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSequence.g:938:3: this_LostMessage_3= ruleLostMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getLostMessageParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LostMessage_3=ruleLostMessage();

                    state._fsp--;


                    			current = this_LostMessage_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSequence.g:947:3: this_CreateMessage_4= ruleCreateMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getCreateMessageParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateMessage_4=ruleCreateMessage();

                    state._fsp--;


                    			current = this_CreateMessage_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSequence.g:956:3: this_DestructionMessage_5= ruleDestructionMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getDestructionMessageParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DestructionMessage_5=ruleDestructionMessage();

                    state._fsp--;


                    			current = this_DestructionMessage_5;
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleExplicitArrivalOccurenceReference"
    // InternalSequence.g:968:1: entryRuleExplicitArrivalOccurenceReference returns [EObject current=null] : iv_ruleExplicitArrivalOccurenceReference= ruleExplicitArrivalOccurenceReference EOF ;
    public final EObject entryRuleExplicitArrivalOccurenceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitArrivalOccurenceReference = null;


        try {
            // InternalSequence.g:968:74: (iv_ruleExplicitArrivalOccurenceReference= ruleExplicitArrivalOccurenceReference EOF )
            // InternalSequence.g:969:2: iv_ruleExplicitArrivalOccurenceReference= ruleExplicitArrivalOccurenceReference EOF
            {
             newCompositeNode(grammarAccess.getExplicitArrivalOccurenceReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExplicitArrivalOccurenceReference=ruleExplicitArrivalOccurenceReference();

            state._fsp--;

             current =iv_ruleExplicitArrivalOccurenceReference; 
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
    // $ANTLR end "entryRuleExplicitArrivalOccurenceReference"


    // $ANTLR start "ruleExplicitArrivalOccurenceReference"
    // InternalSequence.g:975:1: ruleExplicitArrivalOccurenceReference returns [EObject current=null] : (otherlv_0= 'arrives' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) ;
    public final EObject ruleExplicitArrivalOccurenceReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSequence.g:981:2: ( (otherlv_0= 'arrives' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) )
            // InternalSequence.g:982:2: (otherlv_0= 'arrives' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
            {
            // InternalSequence.g:982:2: (otherlv_0= 'arrives' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
            // InternalSequence.g:983:3: otherlv_0= 'arrives' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getArrivesKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSequence.g:991:3: ( (otherlv_2= RULE_ID ) )
            // InternalSequence.g:992:4: (otherlv_2= RULE_ID )
            {
            // InternalSequence.g:992:4: (otherlv_2= RULE_ID )
            // InternalSequence.g:993:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplicitArrivalOccurenceReferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getExplicitOccurenceSpecificationExplicitArrivalOccurenceSpecificationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleExplicitArrivalOccurenceReference"


    // $ANTLR start "entryRuleExplicitArrivalOccurenceSpecification"
    // InternalSequence.g:1012:1: entryRuleExplicitArrivalOccurenceSpecification returns [EObject current=null] : iv_ruleExplicitArrivalOccurenceSpecification= ruleExplicitArrivalOccurenceSpecification EOF ;
    public final EObject entryRuleExplicitArrivalOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitArrivalOccurenceSpecification = null;


        try {
            // InternalSequence.g:1012:78: (iv_ruleExplicitArrivalOccurenceSpecification= ruleExplicitArrivalOccurenceSpecification EOF )
            // InternalSequence.g:1013:2: iv_ruleExplicitArrivalOccurenceSpecification= ruleExplicitArrivalOccurenceSpecification EOF
            {
             newCompositeNode(grammarAccess.getExplicitArrivalOccurenceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExplicitArrivalOccurenceSpecification=ruleExplicitArrivalOccurenceSpecification();

            state._fsp--;

             current =iv_ruleExplicitArrivalOccurenceSpecification; 
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
    // $ANTLR end "entryRuleExplicitArrivalOccurenceSpecification"


    // $ANTLR start "ruleExplicitArrivalOccurenceSpecification"
    // InternalSequence.g:1019:1: ruleExplicitArrivalOccurenceSpecification returns [EObject current=null] : (otherlv_0= 'arrival' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExplicitArrivalOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSequence.g:1025:2: ( (otherlv_0= 'arrival' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSequence.g:1026:2: (otherlv_0= 'arrival' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSequence.g:1026:2: (otherlv_0= 'arrival' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSequence.g:1027:3: otherlv_0= 'arrival' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getArrivalKeyword_0());
            		
            // InternalSequence.g:1031:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSequence.g:1032:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSequence.g:1032:4: (lv_name_1_0= RULE_ID )
            // InternalSequence.g:1033:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplicitArrivalOccurenceSpecificationRule());
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
    // $ANTLR end "ruleExplicitArrivalOccurenceSpecification"


    // $ANTLR start "entryRuleStandardMessage"
    // InternalSequence.g:1053:1: entryRuleStandardMessage returns [EObject current=null] : iv_ruleStandardMessage= ruleStandardMessage EOF ;
    public final EObject entryRuleStandardMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardMessage = null;


        try {
            // InternalSequence.g:1053:56: (iv_ruleStandardMessage= ruleStandardMessage EOF )
            // InternalSequence.g:1054:2: iv_ruleStandardMessage= ruleStandardMessage EOF
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
    // InternalSequence.g:1060:1: ruleStandardMessage returns [EObject current=null] : ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= ruleUnescapedString ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) ) ;
    public final EObject ruleStandardMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_alias_8_0=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sendEvent_9_0 = null;

        EObject lv_arrivalEvent_10_0 = null;

        EObject lv_arrivalEvent_11_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1066:2: ( ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= ruleUnescapedString ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) ) )
            // InternalSequence.g:1067:2: ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= ruleUnescapedString ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) )
            {
            // InternalSequence.g:1067:2: ( ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= ruleUnescapedString ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) )
            // InternalSequence.g:1068:3: ( (lv_type_0_0= ruleMessageType ) ) ( (lv_name_1_0= ruleUnescapedString ) ) otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) )
            {
            // InternalSequence.g:1068:3: ( (lv_type_0_0= ruleMessageType ) )
            // InternalSequence.g:1069:4: (lv_type_0_0= ruleMessageType )
            {
            // InternalSequence.g:1069:4: (lv_type_0_0= ruleMessageType )
            // InternalSequence.g:1070:5: lv_type_0_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getStandardMessageAccess().getTypeMessageTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalSequence.g:1087:3: ( (lv_name_1_0= ruleUnescapedString ) )
            // InternalSequence.g:1088:4: (lv_name_1_0= ruleUnescapedString )
            {
            // InternalSequence.g:1088:4: (lv_name_1_0= ruleUnescapedString )
            // InternalSequence.g:1089:5: lv_name_1_0= ruleUnescapedString
            {

            					newCompositeNode(grammarAccess.getStandardMessageAccess().getNameUnescapedStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_name_1_0=ruleUnescapedString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStandardMessageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getStandardMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:1110:3: ( ( ruleFQN ) )
            // InternalSequence.g:1111:4: ( ruleFQN )
            {
            // InternalSequence.g:1111:4: ( ruleFQN )
            // InternalSequence.g:1112:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStandardMessageAccess().getLeftActorCrossReference_3_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getStandardMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:1130:3: ( ( ruleFQN ) )
            // InternalSequence.g:1131:4: ( ruleFQN )
            {
            // InternalSequence.g:1131:4: ( ruleFQN )
            // InternalSequence.g:1132:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStandardMessageAccess().getRightActorCrossReference_5_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getStandardMessageAccess().getRightParenthesisKeyword_6());
            		
            // InternalSequence.g:1150:3: (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSequence.g:1151:4: otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getStandardMessageAccess().getAsKeyword_7_0());
                    			
                    // InternalSequence.g:1155:4: ( (lv_alias_8_0= RULE_ID ) )
                    // InternalSequence.g:1156:5: (lv_alias_8_0= RULE_ID )
                    {
                    // InternalSequence.g:1156:5: (lv_alias_8_0= RULE_ID )
                    // InternalSequence.g:1157:6: lv_alias_8_0= RULE_ID
                    {
                    lv_alias_8_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(lv_alias_8_0, grammarAccess.getStandardMessageAccess().getAliasIDTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStandardMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSequence.g:1174:3: ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:1175:4: (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:1175:4: (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:1176:5: lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification
            {

            					newCompositeNode(grammarAccess.getStandardMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_30);
            lv_sendEvent_9_0=ruleImplicitSendOccurenceSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStandardMessageRule());
            					}
            					set(
            						current,
            						"sendEvent",
            						lv_sendEvent_9_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.ImplicitSendOccurenceSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSequence.g:1193:3: ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            else if ( (LA19_0==EOF||LA19_0==12||(LA19_0>=20 && LA19_0<=22)||LA19_0==24||LA19_0==28||(LA19_0>=30 && LA19_0<=40)||LA19_0==43||(LA19_0>=46 && LA19_0<=47)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSequence.g:1194:4: ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) )
                    {
                    // InternalSequence.g:1194:4: ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) )
                    // InternalSequence.g:1195:5: (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference )
                    {
                    // InternalSequence.g:1195:5: (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference )
                    // InternalSequence.g:1196:6: lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference
                    {

                    						newCompositeNode(grammarAccess.getStandardMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arrivalEvent_10_0=ruleExplicitArrivalOccurenceReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStandardMessageRule());
                    						}
                    						set(
                    							current,
                    							"arrivalEvent",
                    							lv_arrivalEvent_10_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.ExplicitArrivalOccurenceReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1214:4: ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) )
                    {
                    // InternalSequence.g:1214:4: ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) )
                    // InternalSequence.g:1215:5: (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification )
                    {
                    // InternalSequence.g:1215:5: (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification )
                    // InternalSequence.g:1216:6: lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification
                    {

                    						newCompositeNode(grammarAccess.getStandardMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arrivalEvent_11_0=ruleImplicitArrivalOccurenceSpecification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStandardMessageRule());
                    						}
                    						set(
                    							current,
                    							"arrivalEvent",
                    							lv_arrivalEvent_11_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.ImplicitArrivalOccurenceSpecification");
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
    // $ANTLR end "ruleStandardMessage"


    // $ANTLR start "entryRuleResponseMessage"
    // InternalSequence.g:1238:1: entryRuleResponseMessage returns [EObject current=null] : iv_ruleResponseMessage= ruleResponseMessage EOF ;
    public final EObject entryRuleResponseMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseMessage = null;


        try {
            // InternalSequence.g:1238:56: (iv_ruleResponseMessage= ruleResponseMessage EOF )
            // InternalSequence.g:1239:2: iv_ruleResponseMessage= ruleResponseMessage EOF
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
    // InternalSequence.g:1245:1: ruleResponseMessage returns [EObject current=null] : (otherlv_0= 'reply' ( (lv_name_1_0= ruleUnescapedString ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' (otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) )? ( (lv_sendEvent_11_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification ) ) ) ) ;
    public final EObject ruleResponseMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_alias_10_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sendEvent_11_0 = null;

        EObject lv_arrivalEvent_12_0 = null;

        EObject lv_arrivalEvent_13_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1251:2: ( (otherlv_0= 'reply' ( (lv_name_1_0= ruleUnescapedString ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' (otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) )? ( (lv_sendEvent_11_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification ) ) ) ) )
            // InternalSequence.g:1252:2: (otherlv_0= 'reply' ( (lv_name_1_0= ruleUnescapedString ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' (otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) )? ( (lv_sendEvent_11_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification ) ) ) )
            {
            // InternalSequence.g:1252:2: (otherlv_0= 'reply' ( (lv_name_1_0= ruleUnescapedString ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' (otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) )? ( (lv_sendEvent_11_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification ) ) ) )
            // InternalSequence.g:1253:3: otherlv_0= 'reply' ( (lv_name_1_0= ruleUnescapedString ) ) otherlv_2= '(' ( ( ( ruleFQN ) ) | otherlv_4= '_' ) otherlv_5= ',' ( ( ( ruleFQN ) ) | otherlv_7= '_' ) otherlv_8= ')' (otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) )? ( (lv_sendEvent_11_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification ) ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseMessageAccess().getReplyKeyword_0());
            		
            // InternalSequence.g:1257:3: ( (lv_name_1_0= ruleUnescapedString ) )
            // InternalSequence.g:1258:4: (lv_name_1_0= ruleUnescapedString )
            {
            // InternalSequence.g:1258:4: (lv_name_1_0= ruleUnescapedString )
            // InternalSequence.g:1259:5: lv_name_1_0= ruleUnescapedString
            {

            					newCompositeNode(grammarAccess.getResponseMessageAccess().getNameUnescapedStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_name_1_0=ruleUnescapedString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseMessageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getResponseMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:1280:3: ( ( ( ruleFQN ) ) | otherlv_4= '_' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==29) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSequence.g:1281:4: ( ( ruleFQN ) )
                    {
                    // InternalSequence.g:1281:4: ( ( ruleFQN ) )
                    // InternalSequence.g:1282:5: ( ruleFQN )
                    {
                    // InternalSequence.g:1282:5: ( ruleFQN )
                    // InternalSequence.g:1283:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResponseMessageAccess().getLeftActorCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1298:4: otherlv_4= '_'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getResponseMessageAccess().get_Keyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getResponseMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:1307:3: ( ( ( ruleFQN ) ) | otherlv_7= '_' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==29) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSequence.g:1308:4: ( ( ruleFQN ) )
                    {
                    // InternalSequence.g:1308:4: ( ( ruleFQN ) )
                    // InternalSequence.g:1309:5: ( ruleFQN )
                    {
                    // InternalSequence.g:1309:5: ( ruleFQN )
                    // InternalSequence.g:1310:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseMessageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResponseMessageAccess().getRightActorCrossReference_5_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1325:4: otherlv_7= '_'
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getResponseMessageAccess().get_Keyword_5_1());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FOLLOW_29); 

            			newLeafNode(otherlv_8, grammarAccess.getResponseMessageAccess().getRightParenthesisKeyword_6());
            		
            // InternalSequence.g:1334:3: (otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSequence.g:1335:4: otherlv_9= 'as' ( (lv_alias_10_0= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getResponseMessageAccess().getAsKeyword_7_0());
                    			
                    // InternalSequence.g:1339:4: ( (lv_alias_10_0= RULE_ID ) )
                    // InternalSequence.g:1340:5: (lv_alias_10_0= RULE_ID )
                    {
                    // InternalSequence.g:1340:5: (lv_alias_10_0= RULE_ID )
                    // InternalSequence.g:1341:6: lv_alias_10_0= RULE_ID
                    {
                    lv_alias_10_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(lv_alias_10_0, grammarAccess.getResponseMessageAccess().getAliasIDTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSequence.g:1358:3: ( (lv_sendEvent_11_0= ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:1359:4: (lv_sendEvent_11_0= ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:1359:4: (lv_sendEvent_11_0= ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:1360:5: lv_sendEvent_11_0= ruleImplicitSendOccurenceSpecification
            {

            					newCompositeNode(grammarAccess.getResponseMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_30);
            lv_sendEvent_11_0=ruleImplicitSendOccurenceSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseMessageRule());
            					}
            					set(
            						current,
            						"sendEvent",
            						lv_sendEvent_11_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.ImplicitSendOccurenceSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSequence.g:1377:3: ( ( (lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            else if ( (LA23_0==EOF||LA23_0==12||(LA23_0>=20 && LA23_0<=22)||LA23_0==24||LA23_0==28||(LA23_0>=30 && LA23_0<=40)||LA23_0==43||(LA23_0>=46 && LA23_0<=47)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSequence.g:1378:4: ( (lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference ) )
                    {
                    // InternalSequence.g:1378:4: ( (lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference ) )
                    // InternalSequence.g:1379:5: (lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference )
                    {
                    // InternalSequence.g:1379:5: (lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference )
                    // InternalSequence.g:1380:6: lv_arrivalEvent_12_0= ruleExplicitArrivalOccurenceReference
                    {

                    						newCompositeNode(grammarAccess.getResponseMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arrivalEvent_12_0=ruleExplicitArrivalOccurenceReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResponseMessageRule());
                    						}
                    						set(
                    							current,
                    							"arrivalEvent",
                    							lv_arrivalEvent_12_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.ExplicitArrivalOccurenceReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1398:4: ( (lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification ) )
                    {
                    // InternalSequence.g:1398:4: ( (lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification ) )
                    // InternalSequence.g:1399:5: (lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification )
                    {
                    // InternalSequence.g:1399:5: (lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification )
                    // InternalSequence.g:1400:6: lv_arrivalEvent_13_0= ruleImplicitArrivalOccurenceSpecification
                    {

                    						newCompositeNode(grammarAccess.getResponseMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arrivalEvent_13_0=ruleImplicitArrivalOccurenceSpecification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResponseMessageRule());
                    						}
                    						set(
                    							current,
                    							"arrivalEvent",
                    							lv_arrivalEvent_13_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.ImplicitArrivalOccurenceSpecification");
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
    // $ANTLR end "ruleResponseMessage"


    // $ANTLR start "entryRuleFoundMessage"
    // InternalSequence.g:1422:1: entryRuleFoundMessage returns [EObject current=null] : iv_ruleFoundMessage= ruleFoundMessage EOF ;
    public final EObject entryRuleFoundMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoundMessage = null;


        try {
            // InternalSequence.g:1422:53: (iv_ruleFoundMessage= ruleFoundMessage EOF )
            // InternalSequence.g:1423:2: iv_ruleFoundMessage= ruleFoundMessage EOF
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
    // InternalSequence.g:1429:1: ruleFoundMessage returns [EObject current=null] : (otherlv_0= 'found' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= ruleUnescapedString ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? ( (lv_arrivalEvent_10_0= ruleImplicitArrivalOccurenceSpecification ) ) ) ;
    public final EObject ruleFoundMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_alias_9_0=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_arrivalEvent_10_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1435:2: ( (otherlv_0= 'found' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= ruleUnescapedString ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? ( (lv_arrivalEvent_10_0= ruleImplicitArrivalOccurenceSpecification ) ) ) )
            // InternalSequence.g:1436:2: (otherlv_0= 'found' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= ruleUnescapedString ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? ( (lv_arrivalEvent_10_0= ruleImplicitArrivalOccurenceSpecification ) ) )
            {
            // InternalSequence.g:1436:2: (otherlv_0= 'found' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= ruleUnescapedString ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? ( (lv_arrivalEvent_10_0= ruleImplicitArrivalOccurenceSpecification ) ) )
            // InternalSequence.g:1437:3: otherlv_0= 'found' ( (lv_type_1_0= ruleMessageType ) ) ( (lv_name_2_0= ruleUnescapedString ) ) otherlv_3= '(' otherlv_4= '_' otherlv_5= ',' ( ( ruleFQN ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? ( (lv_arrivalEvent_10_0= ruleImplicitArrivalOccurenceSpecification ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getFoundMessageAccess().getFoundKeyword_0());
            		
            // InternalSequence.g:1441:3: ( (lv_type_1_0= ruleMessageType ) )
            // InternalSequence.g:1442:4: (lv_type_1_0= ruleMessageType )
            {
            // InternalSequence.g:1442:4: (lv_type_1_0= ruleMessageType )
            // InternalSequence.g:1443:5: lv_type_1_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getFoundMessageAccess().getTypeMessageTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalSequence.g:1460:3: ( (lv_name_2_0= ruleUnescapedString ) )
            // InternalSequence.g:1461:4: (lv_name_2_0= ruleUnescapedString )
            {
            // InternalSequence.g:1461:4: (lv_name_2_0= ruleUnescapedString )
            // InternalSequence.g:1462:5: lv_name_2_0= ruleUnescapedString
            {

            					newCompositeNode(grammarAccess.getFoundMessageAccess().getNameUnescapedStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_name_2_0=ruleUnescapedString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFoundMessageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getFoundMessageAccess().get_Keyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getFoundMessageAccess().getCommaKeyword_5());
            		
            // InternalSequence.g:1491:3: ( ( ruleFQN ) )
            // InternalSequence.g:1492:4: ( ruleFQN )
            {
            // InternalSequence.g:1492:4: ( ruleFQN )
            // InternalSequence.g:1493:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoundMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFoundMessageAccess().getRightActorCrossReference_6_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getFoundMessageAccess().getRightParenthesisKeyword_7());
            		
            // InternalSequence.g:1511:3: (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSequence.g:1512:4: otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getFoundMessageAccess().getAsKeyword_8_0());
                    			
                    // InternalSequence.g:1516:4: ( (lv_alias_9_0= RULE_ID ) )
                    // InternalSequence.g:1517:5: (lv_alias_9_0= RULE_ID )
                    {
                    // InternalSequence.g:1517:5: (lv_alias_9_0= RULE_ID )
                    // InternalSequence.g:1518:6: lv_alias_9_0= RULE_ID
                    {
                    lv_alias_9_0=(Token)match(input,RULE_ID,FOLLOW_1); 

                    						newLeafNode(lv_alias_9_0, grammarAccess.getFoundMessageAccess().getAliasIDTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFoundMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSequence.g:1535:3: ( (lv_arrivalEvent_10_0= ruleImplicitArrivalOccurenceSpecification ) )
            // InternalSequence.g:1536:4: (lv_arrivalEvent_10_0= ruleImplicitArrivalOccurenceSpecification )
            {
            // InternalSequence.g:1536:4: (lv_arrivalEvent_10_0= ruleImplicitArrivalOccurenceSpecification )
            // InternalSequence.g:1537:5: lv_arrivalEvent_10_0= ruleImplicitArrivalOccurenceSpecification
            {

            					newCompositeNode(grammarAccess.getFoundMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_arrivalEvent_10_0=ruleImplicitArrivalOccurenceSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFoundMessageRule());
            					}
            					set(
            						current,
            						"arrivalEvent",
            						lv_arrivalEvent_10_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.ImplicitArrivalOccurenceSpecification");
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
    // $ANTLR end "ruleFoundMessage"


    // $ANTLR start "entryRuleLostMessage"
    // InternalSequence.g:1558:1: entryRuleLostMessage returns [EObject current=null] : iv_ruleLostMessage= ruleLostMessage EOF ;
    public final EObject entryRuleLostMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLostMessage = null;


        try {
            // InternalSequence.g:1558:52: (iv_ruleLostMessage= ruleLostMessage EOF )
            // InternalSequence.g:1559:2: iv_ruleLostMessage= ruleLostMessage EOF
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
    // InternalSequence.g:1565:1: ruleLostMessage returns [EObject current=null] : (otherlv_0= 'lost' ( (otherlv_1= 'reply' () ) | ( () ( (lv_type_4_0= ruleMessageType ) ) ) ) ( (lv_name_5_0= ruleUnescapedString ) ) otherlv_6= '(' ( ( ruleFQN ) ) otherlv_8= ',' otherlv_9= '_' otherlv_10= ')' (otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) )? ( (lv_sendEvent_13_0= ruleImplicitSendOccurenceSpecification ) ) ) ;
    public final EObject ruleLostMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_alias_12_0=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_sendEvent_13_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1571:2: ( (otherlv_0= 'lost' ( (otherlv_1= 'reply' () ) | ( () ( (lv_type_4_0= ruleMessageType ) ) ) ) ( (lv_name_5_0= ruleUnescapedString ) ) otherlv_6= '(' ( ( ruleFQN ) ) otherlv_8= ',' otherlv_9= '_' otherlv_10= ')' (otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) )? ( (lv_sendEvent_13_0= ruleImplicitSendOccurenceSpecification ) ) ) )
            // InternalSequence.g:1572:2: (otherlv_0= 'lost' ( (otherlv_1= 'reply' () ) | ( () ( (lv_type_4_0= ruleMessageType ) ) ) ) ( (lv_name_5_0= ruleUnescapedString ) ) otherlv_6= '(' ( ( ruleFQN ) ) otherlv_8= ',' otherlv_9= '_' otherlv_10= ')' (otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) )? ( (lv_sendEvent_13_0= ruleImplicitSendOccurenceSpecification ) ) )
            {
            // InternalSequence.g:1572:2: (otherlv_0= 'lost' ( (otherlv_1= 'reply' () ) | ( () ( (lv_type_4_0= ruleMessageType ) ) ) ) ( (lv_name_5_0= ruleUnescapedString ) ) otherlv_6= '(' ( ( ruleFQN ) ) otherlv_8= ',' otherlv_9= '_' otherlv_10= ')' (otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) )? ( (lv_sendEvent_13_0= ruleImplicitSendOccurenceSpecification ) ) )
            // InternalSequence.g:1573:3: otherlv_0= 'lost' ( (otherlv_1= 'reply' () ) | ( () ( (lv_type_4_0= ruleMessageType ) ) ) ) ( (lv_name_5_0= ruleUnescapedString ) ) otherlv_6= '(' ( ( ruleFQN ) ) otherlv_8= ',' otherlv_9= '_' otherlv_10= ')' (otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) )? ( (lv_sendEvent_13_0= ruleImplicitSendOccurenceSpecification ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getLostMessageAccess().getLostKeyword_0());
            		
            // InternalSequence.g:1577:3: ( (otherlv_1= 'reply' () ) | ( () ( (lv_type_4_0= ruleMessageType ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=46 && LA25_0<=47)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSequence.g:1578:4: (otherlv_1= 'reply' () )
                    {
                    // InternalSequence.g:1578:4: (otherlv_1= 'reply' () )
                    // InternalSequence.g:1579:5: otherlv_1= 'reply' ()
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_21); 

                    					newLeafNode(otherlv_1, grammarAccess.getLostMessageAccess().getReplyKeyword_1_0_0());
                    				
                    // InternalSequence.g:1583:5: ()
                    // InternalSequence.g:1584:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getLostMessageAccess().getResponseMessageAction_1_0_1(),
                    							current);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1592:4: ( () ( (lv_type_4_0= ruleMessageType ) ) )
                    {
                    // InternalSequence.g:1592:4: ( () ( (lv_type_4_0= ruleMessageType ) ) )
                    // InternalSequence.g:1593:5: () ( (lv_type_4_0= ruleMessageType ) )
                    {
                    // InternalSequence.g:1593:5: ()
                    // InternalSequence.g:1594:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getLostMessageAccess().getStandardMessageAction_1_1_0(),
                    							current);
                    					

                    }

                    // InternalSequence.g:1600:5: ( (lv_type_4_0= ruleMessageType ) )
                    // InternalSequence.g:1601:6: (lv_type_4_0= ruleMessageType )
                    {
                    // InternalSequence.g:1601:6: (lv_type_4_0= ruleMessageType )
                    // InternalSequence.g:1602:7: lv_type_4_0= ruleMessageType
                    {

                    							newCompositeNode(grammarAccess.getLostMessageAccess().getTypeMessageTypeEnumRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_type_4_0=ruleMessageType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getLostMessageRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_4_0,
                    								"de.cooperateproject.modeling.textual.sequence.Sequence.MessageType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSequence.g:1621:3: ( (lv_name_5_0= ruleUnescapedString ) )
            // InternalSequence.g:1622:4: (lv_name_5_0= ruleUnescapedString )
            {
            // InternalSequence.g:1622:4: (lv_name_5_0= ruleUnescapedString )
            // InternalSequence.g:1623:5: lv_name_5_0= ruleUnescapedString
            {

            					newCompositeNode(grammarAccess.getLostMessageAccess().getNameUnescapedStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_name_5_0=ruleUnescapedString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLostMessageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getLostMessageAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSequence.g:1644:3: ( ( ruleFQN ) )
            // InternalSequence.g:1645:4: ( ruleFQN )
            {
            // InternalSequence.g:1645:4: ( ruleFQN )
            // InternalSequence.g:1646:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLostMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLostMessageAccess().getLeftActorCrossReference_4_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_33); 

            			newLeafNode(otherlv_8, grammarAccess.getLostMessageAccess().getCommaKeyword_5());
            		
            otherlv_9=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_9, grammarAccess.getLostMessageAccess().get_Keyword_6());
            		
            otherlv_10=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getLostMessageAccess().getRightParenthesisKeyword_7());
            		
            // InternalSequence.g:1672:3: (otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSequence.g:1673:4: otherlv_11= 'as' ( (lv_alias_12_0= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getLostMessageAccess().getAsKeyword_8_0());
                    			
                    // InternalSequence.g:1677:4: ( (lv_alias_12_0= RULE_ID ) )
                    // InternalSequence.g:1678:5: (lv_alias_12_0= RULE_ID )
                    {
                    // InternalSequence.g:1678:5: (lv_alias_12_0= RULE_ID )
                    // InternalSequence.g:1679:6: lv_alias_12_0= RULE_ID
                    {
                    lv_alias_12_0=(Token)match(input,RULE_ID,FOLLOW_1); 

                    						newLeafNode(lv_alias_12_0, grammarAccess.getLostMessageAccess().getAliasIDTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLostMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_12_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSequence.g:1696:3: ( (lv_sendEvent_13_0= ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:1697:4: (lv_sendEvent_13_0= ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:1697:4: (lv_sendEvent_13_0= ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:1698:5: lv_sendEvent_13_0= ruleImplicitSendOccurenceSpecification
            {

            					newCompositeNode(grammarAccess.getLostMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_sendEvent_13_0=ruleImplicitSendOccurenceSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLostMessageRule());
            					}
            					set(
            						current,
            						"sendEvent",
            						lv_sendEvent_13_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.ImplicitSendOccurenceSpecification");
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
    // $ANTLR end "ruleLostMessage"


    // $ANTLR start "entryRuleCreateMessage"
    // InternalSequence.g:1719:1: entryRuleCreateMessage returns [EObject current=null] : iv_ruleCreateMessage= ruleCreateMessage EOF ;
    public final EObject entryRuleCreateMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMessage = null;


        try {
            // InternalSequence.g:1719:54: (iv_ruleCreateMessage= ruleCreateMessage EOF )
            // InternalSequence.g:1720:2: iv_ruleCreateMessage= ruleCreateMessage EOF
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
    // InternalSequence.g:1726:1: ruleCreateMessage returns [EObject current=null] : (otherlv_0= 'create' ( (lv_name_1_0= ruleUnescapedString ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) ) ;
    public final EObject ruleCreateMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_alias_8_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sendEvent_9_0 = null;

        EObject lv_arrivalEvent_10_0 = null;

        EObject lv_arrivalEvent_11_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1732:2: ( (otherlv_0= 'create' ( (lv_name_1_0= ruleUnescapedString ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) ) )
            // InternalSequence.g:1733:2: (otherlv_0= 'create' ( (lv_name_1_0= ruleUnescapedString ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) )
            {
            // InternalSequence.g:1733:2: (otherlv_0= 'create' ( (lv_name_1_0= ruleUnescapedString ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) )
            // InternalSequence.g:1734:3: otherlv_0= 'create' ( (lv_name_1_0= ruleUnescapedString ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateMessageAccess().getCreateKeyword_0());
            		
            // InternalSequence.g:1738:3: ( (lv_name_1_0= ruleUnescapedString ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSequence.g:1739:4: (lv_name_1_0= ruleUnescapedString )
                    {
                    // InternalSequence.g:1739:4: (lv_name_1_0= ruleUnescapedString )
                    // InternalSequence.g:1740:5: lv_name_1_0= ruleUnescapedString
                    {

                    					newCompositeNode(grammarAccess.getCreateMessageAccess().getNameUnescapedStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_name_1_0=ruleUnescapedString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCreateMessageRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:1761:3: ( ( ruleFQN ) )
            // InternalSequence.g:1762:4: ( ruleFQN )
            {
            // InternalSequence.g:1762:4: ( ruleFQN )
            // InternalSequence.g:1763:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCreateMessageAccess().getLeftActorCrossReference_3_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getCreateMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:1781:3: ( ( ruleFQN ) )
            // InternalSequence.g:1782:4: ( ruleFQN )
            {
            // InternalSequence.g:1782:4: ( ruleFQN )
            // InternalSequence.g:1783:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCreateMessageAccess().getRightActorCrossReference_5_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getCreateMessageAccess().getRightParenthesisKeyword_6());
            		
            // InternalSequence.g:1801:3: (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==16) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSequence.g:1802:4: otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getCreateMessageAccess().getAsKeyword_7_0());
                    			
                    // InternalSequence.g:1806:4: ( (lv_alias_8_0= RULE_ID ) )
                    // InternalSequence.g:1807:5: (lv_alias_8_0= RULE_ID )
                    {
                    // InternalSequence.g:1807:5: (lv_alias_8_0= RULE_ID )
                    // InternalSequence.g:1808:6: lv_alias_8_0= RULE_ID
                    {
                    lv_alias_8_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(lv_alias_8_0, grammarAccess.getCreateMessageAccess().getAliasIDTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCreateMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSequence.g:1825:3: ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:1826:4: (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:1826:4: (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:1827:5: lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification
            {

            					newCompositeNode(grammarAccess.getCreateMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_30);
            lv_sendEvent_9_0=ruleImplicitSendOccurenceSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateMessageRule());
            					}
            					set(
            						current,
            						"sendEvent",
            						lv_sendEvent_9_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.ImplicitSendOccurenceSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSequence.g:1844:3: ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            else if ( (LA29_0==EOF||LA29_0==12||(LA29_0>=20 && LA29_0<=22)||LA29_0==24||LA29_0==28||(LA29_0>=30 && LA29_0<=40)||LA29_0==43||(LA29_0>=46 && LA29_0<=47)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSequence.g:1845:4: ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) )
                    {
                    // InternalSequence.g:1845:4: ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) )
                    // InternalSequence.g:1846:5: (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference )
                    {
                    // InternalSequence.g:1846:5: (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference )
                    // InternalSequence.g:1847:6: lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference
                    {

                    						newCompositeNode(grammarAccess.getCreateMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arrivalEvent_10_0=ruleExplicitArrivalOccurenceReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateMessageRule());
                    						}
                    						set(
                    							current,
                    							"arrivalEvent",
                    							lv_arrivalEvent_10_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.ExplicitArrivalOccurenceReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:1865:4: ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) )
                    {
                    // InternalSequence.g:1865:4: ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) )
                    // InternalSequence.g:1866:5: (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification )
                    {
                    // InternalSequence.g:1866:5: (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification )
                    // InternalSequence.g:1867:6: lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification
                    {

                    						newCompositeNode(grammarAccess.getCreateMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arrivalEvent_11_0=ruleImplicitArrivalOccurenceSpecification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateMessageRule());
                    						}
                    						set(
                    							current,
                    							"arrivalEvent",
                    							lv_arrivalEvent_11_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.ImplicitArrivalOccurenceSpecification");
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
    // $ANTLR end "ruleCreateMessage"


    // $ANTLR start "entryRuleDestructionMessage"
    // InternalSequence.g:1889:1: entryRuleDestructionMessage returns [EObject current=null] : iv_ruleDestructionMessage= ruleDestructionMessage EOF ;
    public final EObject entryRuleDestructionMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructionMessage = null;


        try {
            // InternalSequence.g:1889:59: (iv_ruleDestructionMessage= ruleDestructionMessage EOF )
            // InternalSequence.g:1890:2: iv_ruleDestructionMessage= ruleDestructionMessage EOF
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
    // InternalSequence.g:1896:1: ruleDestructionMessage returns [EObject current=null] : (otherlv_0= 'dest' ( (lv_name_1_0= ruleUnescapedString ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) ) ;
    public final EObject ruleDestructionMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_alias_8_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sendEvent_9_0 = null;

        EObject lv_arrivalEvent_10_0 = null;

        EObject lv_arrivalEvent_11_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:1902:2: ( (otherlv_0= 'dest' ( (lv_name_1_0= ruleUnescapedString ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) ) )
            // InternalSequence.g:1903:2: (otherlv_0= 'dest' ( (lv_name_1_0= ruleUnescapedString ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) )
            {
            // InternalSequence.g:1903:2: (otherlv_0= 'dest' ( (lv_name_1_0= ruleUnescapedString ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) ) )
            // InternalSequence.g:1904:3: otherlv_0= 'dest' ( (lv_name_1_0= ruleUnescapedString ) )? otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ',' ( ( ruleFQN ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) ) ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getDestructionMessageAccess().getDestKeyword_0());
            		
            // InternalSequence.g:1908:3: ( (lv_name_1_0= ruleUnescapedString ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSequence.g:1909:4: (lv_name_1_0= ruleUnescapedString )
                    {
                    // InternalSequence.g:1909:4: (lv_name_1_0= ruleUnescapedString )
                    // InternalSequence.g:1910:5: lv_name_1_0= ruleUnescapedString
                    {

                    					newCompositeNode(grammarAccess.getDestructionMessageAccess().getNameUnescapedStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_name_1_0=ruleUnescapedString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDestructionMessageRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDestructionMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSequence.g:1931:3: ( ( ruleFQN ) )
            // InternalSequence.g:1932:4: ( ruleFQN )
            {
            // InternalSequence.g:1932:4: ( ruleFQN )
            // InternalSequence.g:1933:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructionMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDestructionMessageAccess().getLeftActorCrossReference_3_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getDestructionMessageAccess().getCommaKeyword_4());
            		
            // InternalSequence.g:1951:3: ( ( ruleFQN ) )
            // InternalSequence.g:1952:4: ( ruleFQN )
            {
            // InternalSequence.g:1952:4: ( ruleFQN )
            // InternalSequence.g:1953:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructionMessageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDestructionMessageAccess().getRightActorCrossReference_5_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getDestructionMessageAccess().getRightParenthesisKeyword_6());
            		
            // InternalSequence.g:1971:3: (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSequence.g:1972:4: otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getDestructionMessageAccess().getAsKeyword_7_0());
                    			
                    // InternalSequence.g:1976:4: ( (lv_alias_8_0= RULE_ID ) )
                    // InternalSequence.g:1977:5: (lv_alias_8_0= RULE_ID )
                    {
                    // InternalSequence.g:1977:5: (lv_alias_8_0= RULE_ID )
                    // InternalSequence.g:1978:6: lv_alias_8_0= RULE_ID
                    {
                    lv_alias_8_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(lv_alias_8_0, grammarAccess.getDestructionMessageAccess().getAliasIDTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDestructionMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSequence.g:1995:3: ( (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification ) )
            // InternalSequence.g:1996:4: (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification )
            {
            // InternalSequence.g:1996:4: (lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification )
            // InternalSequence.g:1997:5: lv_sendEvent_9_0= ruleImplicitSendOccurenceSpecification
            {

            					newCompositeNode(grammarAccess.getDestructionMessageAccess().getSendEventImplicitSendOccurenceSpecificationParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_30);
            lv_sendEvent_9_0=ruleImplicitSendOccurenceSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDestructionMessageRule());
            					}
            					set(
            						current,
            						"sendEvent",
            						lv_sendEvent_9_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.ImplicitSendOccurenceSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSequence.g:2014:3: ( ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) ) | ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            else if ( (LA32_0==EOF||LA32_0==12||(LA32_0>=20 && LA32_0<=22)||LA32_0==24||LA32_0==28||(LA32_0>=30 && LA32_0<=40)||LA32_0==43||(LA32_0>=46 && LA32_0<=47)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalSequence.g:2015:4: ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) )
                    {
                    // InternalSequence.g:2015:4: ( (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference ) )
                    // InternalSequence.g:2016:5: (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference )
                    {
                    // InternalSequence.g:2016:5: (lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference )
                    // InternalSequence.g:2017:6: lv_arrivalEvent_10_0= ruleExplicitArrivalOccurenceReference
                    {

                    						newCompositeNode(grammarAccess.getDestructionMessageAccess().getArrivalEventExplicitArrivalOccurenceReferenceParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arrivalEvent_10_0=ruleExplicitArrivalOccurenceReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDestructionMessageRule());
                    						}
                    						set(
                    							current,
                    							"arrivalEvent",
                    							lv_arrivalEvent_10_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.ExplicitArrivalOccurenceReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:2035:4: ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) )
                    {
                    // InternalSequence.g:2035:4: ( (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification ) )
                    // InternalSequence.g:2036:5: (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification )
                    {
                    // InternalSequence.g:2036:5: (lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification )
                    // InternalSequence.g:2037:6: lv_arrivalEvent_11_0= ruleImplicitArrivalOccurenceSpecification
                    {

                    						newCompositeNode(grammarAccess.getDestructionMessageAccess().getArrivalEventImplicitArrivalOccurenceSpecificationParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_arrivalEvent_11_0=ruleImplicitArrivalOccurenceSpecification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDestructionMessageRule());
                    						}
                    						set(
                    							current,
                    							"arrivalEvent",
                    							lv_arrivalEvent_11_0,
                    							"de.cooperateproject.modeling.textual.sequence.Sequence.ImplicitArrivalOccurenceSpecification");
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
    // $ANTLR end "ruleDestructionMessage"


    // $ANTLR start "entryRuleOccurenceSpecification"
    // InternalSequence.g:2059:1: entryRuleOccurenceSpecification returns [EObject current=null] : iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF ;
    public final EObject entryRuleOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurenceSpecification = null;


        try {
            // InternalSequence.g:2059:63: (iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF )
            // InternalSequence.g:2060:2: iv_ruleOccurenceSpecification= ruleOccurenceSpecification EOF
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
    // InternalSequence.g:2066:1: ruleOccurenceSpecification returns [EObject current=null] : (this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification | this_ExplicitArrivalOccurenceSpecification_1= ruleExplicitArrivalOccurenceSpecification ) ;
    public final EObject ruleOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_DestructionOccurenceSpecification_0 = null;

        EObject this_ExplicitArrivalOccurenceSpecification_1 = null;



        	enterRule();

        try {
            // InternalSequence.g:2072:2: ( (this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification | this_ExplicitArrivalOccurenceSpecification_1= ruleExplicitArrivalOccurenceSpecification ) )
            // InternalSequence.g:2073:2: (this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification | this_ExplicitArrivalOccurenceSpecification_1= ruleExplicitArrivalOccurenceSpecification )
            {
            // InternalSequence.g:2073:2: (this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification | this_ExplicitArrivalOccurenceSpecification_1= ruleExplicitArrivalOccurenceSpecification )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            else if ( (LA33_0==24) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalSequence.g:2074:3: this_DestructionOccurenceSpecification_0= ruleDestructionOccurenceSpecification
                    {

                    			newCompositeNode(grammarAccess.getOccurenceSpecificationAccess().getDestructionOccurenceSpecificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DestructionOccurenceSpecification_0=ruleDestructionOccurenceSpecification();

                    state._fsp--;


                    			current = this_DestructionOccurenceSpecification_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:2083:3: this_ExplicitArrivalOccurenceSpecification_1= ruleExplicitArrivalOccurenceSpecification
                    {

                    			newCompositeNode(grammarAccess.getOccurenceSpecificationAccess().getExplicitArrivalOccurenceSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExplicitArrivalOccurenceSpecification_1=ruleExplicitArrivalOccurenceSpecification();

                    state._fsp--;


                    			current = this_ExplicitArrivalOccurenceSpecification_1;
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
    // $ANTLR end "ruleOccurenceSpecification"


    // $ANTLR start "entryRuleDestructionOccurenceSpecification"
    // InternalSequence.g:2095:1: entryRuleDestructionOccurenceSpecification returns [EObject current=null] : iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF ;
    public final EObject entryRuleDestructionOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructionOccurenceSpecification = null;


        try {
            // InternalSequence.g:2095:74: (iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF )
            // InternalSequence.g:2096:2: iv_ruleDestructionOccurenceSpecification= ruleDestructionOccurenceSpecification EOF
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
    // InternalSequence.g:2102:1: ruleDestructionOccurenceSpecification returns [EObject current=null] : (otherlv_0= 'dest' ( ( ruleFQN ) ) ) ;
    public final EObject ruleDestructionOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSequence.g:2108:2: ( (otherlv_0= 'dest' ( ( ruleFQN ) ) ) )
            // InternalSequence.g:2109:2: (otherlv_0= 'dest' ( ( ruleFQN ) ) )
            {
            // InternalSequence.g:2109:2: (otherlv_0= 'dest' ( ( ruleFQN ) ) )
            // InternalSequence.g:2110:3: otherlv_0= 'dest' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDestructionOccurenceSpecificationAccess().getDestKeyword_0());
            		
            // InternalSequence.g:2114:3: ( ( ruleFQN ) )
            // InternalSequence.g:2115:4: ( ruleFQN )
            {
            // InternalSequence.g:2115:4: ( ruleFQN )
            // InternalSequence.g:2116:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructionOccurenceSpecificationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetActorCrossReference_1_0());
            				
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
    // $ANTLR end "ruleDestructionOccurenceSpecification"


    // $ANTLR start "entryRuleCombinedFragment"
    // InternalSequence.g:2134:1: entryRuleCombinedFragment returns [EObject current=null] : iv_ruleCombinedFragment= ruleCombinedFragment EOF ;
    public final EObject entryRuleCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinedFragment = null;


        try {
            // InternalSequence.g:2134:57: (iv_ruleCombinedFragment= ruleCombinedFragment EOF )
            // InternalSequence.g:2135:2: iv_ruleCombinedFragment= ruleCombinedFragment EOF
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
    // InternalSequence.g:2141:1: ruleCombinedFragment returns [EObject current=null] : (this_MultipleRegionContainer_0= ruleMultipleRegionContainer | this_SingleRegionContainer_1= ruleSingleRegionContainer ) ;
    public final EObject ruleCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject this_MultipleRegionContainer_0 = null;

        EObject this_SingleRegionContainer_1 = null;



        	enterRule();

        try {
            // InternalSequence.g:2147:2: ( (this_MultipleRegionContainer_0= ruleMultipleRegionContainer | this_SingleRegionContainer_1= ruleSingleRegionContainer ) )
            // InternalSequence.g:2148:2: (this_MultipleRegionContainer_0= ruleMultipleRegionContainer | this_SingleRegionContainer_1= ruleSingleRegionContainer )
            {
            // InternalSequence.g:2148:2: (this_MultipleRegionContainer_0= ruleMultipleRegionContainer | this_SingleRegionContainer_1= ruleSingleRegionContainer )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=34 && LA34_0<=35)) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=36 && LA34_0<=38)) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSequence.g:2149:3: this_MultipleRegionContainer_0= ruleMultipleRegionContainer
                    {

                    			newCompositeNode(grammarAccess.getCombinedFragmentAccess().getMultipleRegionContainerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultipleRegionContainer_0=ruleMultipleRegionContainer();

                    state._fsp--;


                    			current = this_MultipleRegionContainer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:2158:3: this_SingleRegionContainer_1= ruleSingleRegionContainer
                    {

                    			newCompositeNode(grammarAccess.getCombinedFragmentAccess().getSingleRegionContainerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleRegionContainer_1=ruleSingleRegionContainer();

                    state._fsp--;


                    			current = this_SingleRegionContainer_1;
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


    // $ANTLR start "entryRuleSingleRegionContainer"
    // InternalSequence.g:2170:1: entryRuleSingleRegionContainer returns [EObject current=null] : iv_ruleSingleRegionContainer= ruleSingleRegionContainer EOF ;
    public final EObject entryRuleSingleRegionContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRegionContainer = null;


        try {
            // InternalSequence.g:2170:62: (iv_ruleSingleRegionContainer= ruleSingleRegionContainer EOF )
            // InternalSequence.g:2171:2: iv_ruleSingleRegionContainer= ruleSingleRegionContainer EOF
            {
             newCompositeNode(grammarAccess.getSingleRegionContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleRegionContainer=ruleSingleRegionContainer();

            state._fsp--;

             current =iv_ruleSingleRegionContainer; 
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
    // $ANTLR end "entryRuleSingleRegionContainer"


    // $ANTLR start "ruleSingleRegionContainer"
    // InternalSequence.g:2177:1: ruleSingleRegionContainer returns [EObject current=null] : (this_Loop_0= ruleLoop | this_Option_1= ruleOption | this_Critical_2= ruleCritical ) ;
    public final EObject ruleSingleRegionContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Loop_0 = null;

        EObject this_Option_1 = null;

        EObject this_Critical_2 = null;



        	enterRule();

        try {
            // InternalSequence.g:2183:2: ( (this_Loop_0= ruleLoop | this_Option_1= ruleOption | this_Critical_2= ruleCritical ) )
            // InternalSequence.g:2184:2: (this_Loop_0= ruleLoop | this_Option_1= ruleOption | this_Critical_2= ruleCritical )
            {
            // InternalSequence.g:2184:2: (this_Loop_0= ruleLoop | this_Option_1= ruleOption | this_Critical_2= ruleCritical )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt35=1;
                }
                break;
            case 37:
                {
                alt35=2;
                }
                break;
            case 38:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSequence.g:2185:3: this_Loop_0= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getSingleRegionContainerAccess().getLoopParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_0=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:2194:3: this_Option_1= ruleOption
                    {

                    			newCompositeNode(grammarAccess.getSingleRegionContainerAccess().getOptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Option_1=ruleOption();

                    state._fsp--;


                    			current = this_Option_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSequence.g:2203:3: this_Critical_2= ruleCritical
                    {

                    			newCompositeNode(grammarAccess.getSingleRegionContainerAccess().getCriticalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Critical_2=ruleCritical();

                    state._fsp--;


                    			current = this_Critical_2;
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
    // $ANTLR end "ruleSingleRegionContainer"


    // $ANTLR start "entryRuleMultipleRegionContainer"
    // InternalSequence.g:2215:1: entryRuleMultipleRegionContainer returns [EObject current=null] : iv_ruleMultipleRegionContainer= ruleMultipleRegionContainer EOF ;
    public final EObject entryRuleMultipleRegionContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleRegionContainer = null;


        try {
            // InternalSequence.g:2215:64: (iv_ruleMultipleRegionContainer= ruleMultipleRegionContainer EOF )
            // InternalSequence.g:2216:2: iv_ruleMultipleRegionContainer= ruleMultipleRegionContainer EOF
            {
             newCompositeNode(grammarAccess.getMultipleRegionContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleRegionContainer=ruleMultipleRegionContainer();

            state._fsp--;

             current =iv_ruleMultipleRegionContainer; 
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
    // $ANTLR end "entryRuleMultipleRegionContainer"


    // $ANTLR start "ruleMultipleRegionContainer"
    // InternalSequence.g:2222:1: ruleMultipleRegionContainer returns [EObject current=null] : (this_Parallel_0= ruleParallel | this_Alternative_1= ruleAlternative ) ;
    public final EObject ruleMultipleRegionContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Parallel_0 = null;

        EObject this_Alternative_1 = null;



        	enterRule();

        try {
            // InternalSequence.g:2228:2: ( (this_Parallel_0= ruleParallel | this_Alternative_1= ruleAlternative ) )
            // InternalSequence.g:2229:2: (this_Parallel_0= ruleParallel | this_Alternative_1= ruleAlternative )
            {
            // InternalSequence.g:2229:2: (this_Parallel_0= ruleParallel | this_Alternative_1= ruleAlternative )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            else if ( (LA36_0==35) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalSequence.g:2230:3: this_Parallel_0= ruleParallel
                    {

                    			newCompositeNode(grammarAccess.getMultipleRegionContainerAccess().getParallelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parallel_0=ruleParallel();

                    state._fsp--;


                    			current = this_Parallel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:2239:3: this_Alternative_1= ruleAlternative
                    {

                    			newCompositeNode(grammarAccess.getMultipleRegionContainerAccess().getAlternativeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alternative_1=ruleAlternative();

                    state._fsp--;


                    			current = this_Alternative_1;
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
    // $ANTLR end "ruleMultipleRegionContainer"


    // $ANTLR start "entryRuleParallel"
    // InternalSequence.g:2251:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // InternalSequence.g:2251:49: (iv_ruleParallel= ruleParallel EOF )
            // InternalSequence.g:2252:2: iv_ruleParallel= ruleParallel EOF
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
    // InternalSequence.g:2258:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'par' otherlv_1= '{' ( (lv_regions_2_0= ruleOrderedFragmentContainer ) )+ otherlv_3= '}' ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_regions_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:2264:2: ( (otherlv_0= 'par' otherlv_1= '{' ( (lv_regions_2_0= ruleOrderedFragmentContainer ) )+ otherlv_3= '}' ) )
            // InternalSequence.g:2265:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_regions_2_0= ruleOrderedFragmentContainer ) )+ otherlv_3= '}' )
            {
            // InternalSequence.g:2265:2: (otherlv_0= 'par' otherlv_1= '{' ( (lv_regions_2_0= ruleOrderedFragmentContainer ) )+ otherlv_3= '}' )
            // InternalSequence.g:2266:3: otherlv_0= 'par' otherlv_1= '{' ( (lv_regions_2_0= ruleOrderedFragmentContainer ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getParKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:2274:3: ( (lv_regions_2_0= ruleOrderedFragmentContainer ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==20||LA37_0==24||LA37_0==28||(LA37_0>=30 && LA37_0<=39)||(LA37_0>=46 && LA37_0<=47)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSequence.g:2275:4: (lv_regions_2_0= ruleOrderedFragmentContainer )
            	    {
            	    // InternalSequence.g:2275:4: (lv_regions_2_0= ruleOrderedFragmentContainer )
            	    // InternalSequence.g:2276:5: lv_regions_2_0= ruleOrderedFragmentContainer
            	    {

            	    					newCompositeNode(grammarAccess.getParallelAccess().getRegionsOrderedFragmentContainerParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_regions_2_0=ruleOrderedFragmentContainer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParallelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"regions",
            	    						lv_regions_2_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.OrderedFragmentContainer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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


    // $ANTLR start "entryRuleAlternative"
    // InternalSequence.g:2301:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalSequence.g:2301:52: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalSequence.g:2302:2: iv_ruleAlternative= ruleAlternative EOF
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
    // InternalSequence.g:2308:1: ruleAlternative returns [EObject current=null] : (otherlv_0= 'alt' otherlv_1= '{' ( (lv_regions_2_0= ruleOrderedFragmentContainerWithCondition ) )+ otherlv_3= '}' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_regions_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:2314:2: ( (otherlv_0= 'alt' otherlv_1= '{' ( (lv_regions_2_0= ruleOrderedFragmentContainerWithCondition ) )+ otherlv_3= '}' ) )
            // InternalSequence.g:2315:2: (otherlv_0= 'alt' otherlv_1= '{' ( (lv_regions_2_0= ruleOrderedFragmentContainerWithCondition ) )+ otherlv_3= '}' )
            {
            // InternalSequence.g:2315:2: (otherlv_0= 'alt' otherlv_1= '{' ( (lv_regions_2_0= ruleOrderedFragmentContainerWithCondition ) )+ otherlv_3= '}' )
            // InternalSequence.g:2316:3: otherlv_0= 'alt' otherlv_1= '{' ( (lv_regions_2_0= ruleOrderedFragmentContainerWithCondition ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getAltKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:2324:3: ( (lv_regions_2_0= ruleOrderedFragmentContainerWithCondition ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==22) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSequence.g:2325:4: (lv_regions_2_0= ruleOrderedFragmentContainerWithCondition )
            	    {
            	    // InternalSequence.g:2325:4: (lv_regions_2_0= ruleOrderedFragmentContainerWithCondition )
            	    // InternalSequence.g:2326:5: lv_regions_2_0= ruleOrderedFragmentContainerWithCondition
            	    {

            	    					newCompositeNode(grammarAccess.getAlternativeAccess().getRegionsOrderedFragmentContainerWithConditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_regions_2_0=ruleOrderedFragmentContainerWithCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"regions",
            	    						lv_regions_2_0,
            	    						"de.cooperateproject.modeling.textual.sequence.Sequence.OrderedFragmentContainerWithCondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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


    // $ANTLR start "entryRuleLoop"
    // InternalSequence.g:2351:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalSequence.g:2351:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalSequence.g:2352:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalSequence.g:2358:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop' ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ) ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_region_1_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:2364:2: ( (otherlv_0= 'loop' ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ) ) )
            // InternalSequence.g:2365:2: (otherlv_0= 'loop' ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ) )
            {
            // InternalSequence.g:2365:2: (otherlv_0= 'loop' ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ) )
            // InternalSequence.g:2366:3: otherlv_0= 'loop' ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            // InternalSequence.g:2370:3: ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) )
            // InternalSequence.g:2371:4: (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            {
            // InternalSequence.g:2371:4: (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            // InternalSequence.g:2372:5: lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getRegionOrderedFragmentContainerWithConditionMandatoryBracketsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_region_1_0=ruleOrderedFragmentContainerWithConditionMandatoryBrackets();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"region",
            						lv_region_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.OrderedFragmentContainerWithConditionMandatoryBrackets");
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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleOption"
    // InternalSequence.g:2393:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalSequence.g:2393:47: (iv_ruleOption= ruleOption EOF )
            // InternalSequence.g:2394:2: iv_ruleOption= ruleOption EOF
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
    // InternalSequence.g:2400:1: ruleOption returns [EObject current=null] : (otherlv_0= 'opt' ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_region_1_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:2406:2: ( (otherlv_0= 'opt' ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ) ) )
            // InternalSequence.g:2407:2: (otherlv_0= 'opt' ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ) )
            {
            // InternalSequence.g:2407:2: (otherlv_0= 'opt' ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) ) )
            // InternalSequence.g:2408:3: otherlv_0= 'opt' ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptKeyword_0());
            		
            // InternalSequence.g:2412:3: ( (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets ) )
            // InternalSequence.g:2413:4: (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            {
            // InternalSequence.g:2413:4: (lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets )
            // InternalSequence.g:2414:5: lv_region_1_0= ruleOrderedFragmentContainerWithConditionMandatoryBrackets
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getRegionOrderedFragmentContainerWithConditionMandatoryBracketsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_region_1_0=ruleOrderedFragmentContainerWithConditionMandatoryBrackets();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"region",
            						lv_region_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.OrderedFragmentContainerWithConditionMandatoryBrackets");
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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleCritical"
    // InternalSequence.g:2435:1: entryRuleCritical returns [EObject current=null] : iv_ruleCritical= ruleCritical EOF ;
    public final EObject entryRuleCritical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCritical = null;


        try {
            // InternalSequence.g:2435:49: (iv_ruleCritical= ruleCritical EOF )
            // InternalSequence.g:2436:2: iv_ruleCritical= ruleCritical EOF
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
    // InternalSequence.g:2442:1: ruleCritical returns [EObject current=null] : (otherlv_0= 'critical' otherlv_1= '{' ( (lv_region_2_0= ruleOneOrMultipleFragments ) ) otherlv_3= '}' ) ;
    public final EObject ruleCritical() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_region_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:2448:2: ( (otherlv_0= 'critical' otherlv_1= '{' ( (lv_region_2_0= ruleOneOrMultipleFragments ) ) otherlv_3= '}' ) )
            // InternalSequence.g:2449:2: (otherlv_0= 'critical' otherlv_1= '{' ( (lv_region_2_0= ruleOneOrMultipleFragments ) ) otherlv_3= '}' )
            {
            // InternalSequence.g:2449:2: (otherlv_0= 'critical' otherlv_1= '{' ( (lv_region_2_0= ruleOneOrMultipleFragments ) ) otherlv_3= '}' )
            // InternalSequence.g:2450:3: otherlv_0= 'critical' otherlv_1= '{' ( (lv_region_2_0= ruleOneOrMultipleFragments ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getCriticalAccess().getCriticalKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getCriticalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSequence.g:2458:3: ( (lv_region_2_0= ruleOneOrMultipleFragments ) )
            // InternalSequence.g:2459:4: (lv_region_2_0= ruleOneOrMultipleFragments )
            {
            // InternalSequence.g:2459:4: (lv_region_2_0= ruleOneOrMultipleFragments )
            // InternalSequence.g:2460:5: lv_region_2_0= ruleOneOrMultipleFragments
            {

            					newCompositeNode(grammarAccess.getCriticalAccess().getRegionOneOrMultipleFragmentsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_region_2_0=ruleOneOrMultipleFragments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCriticalRule());
            					}
            					set(
            						current,
            						"region",
            						lv_region_2_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.OneOrMultipleFragments");
            					afterParserOrEnumRuleCall();
            				

            }


            }

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


    // $ANTLR start "entryRuleReference"
    // InternalSequence.g:2485:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalSequence.g:2485:50: (iv_ruleReference= ruleReference EOF )
            // InternalSequence.g:2486:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalSequence.g:2492:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleFQN ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;


        	enterRule();

        try {
            // InternalSequence.g:2498:2: ( (otherlv_0= 'ref' ( ( ruleFQN ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) )
            // InternalSequence.g:2499:2: (otherlv_0= 'ref' ( ( ruleFQN ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
            {
            // InternalSequence.g:2499:2: (otherlv_0= 'ref' ( ( ruleFQN ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
            // InternalSequence.g:2500:3: otherlv_0= 'ref' ( ( ruleFQN ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
            		
            // InternalSequence.g:2504:3: ( ( ruleFQN ) )
            // InternalSequence.g:2505:4: ( ruleFQN )
            {
            // InternalSequence.g:2505:4: ( ruleFQN )
            // InternalSequence.g:2506:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().getReferenceInteractionCrossReference_1_0());
            				
            pushFollow(FOLLOW_38);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSequence.g:2520:3: (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSequence.g:2521:4: otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getAsKeyword_2_0());
                    			
                    // InternalSequence.g:2525:4: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalSequence.g:2526:5: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalSequence.g:2526:5: (lv_alias_3_0= RULE_ID )
                    // InternalSequence.g:2527:6: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_alias_3_0, grammarAccess.getReferenceAccess().getAliasIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleConstraint"
    // InternalSequence.g:2548:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalSequence.g:2548:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalSequence.g:2549:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalSequence.g:2555:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'cstr' (this_TimeConstraint_1= ruleTimeConstraint | this_DurationConstraint_2= ruleDurationConstraint ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TimeConstraint_1 = null;

        EObject this_DurationConstraint_2 = null;



        	enterRule();

        try {
            // InternalSequence.g:2561:2: ( (otherlv_0= 'cstr' (this_TimeConstraint_1= ruleTimeConstraint | this_DurationConstraint_2= ruleDurationConstraint ) ) )
            // InternalSequence.g:2562:2: (otherlv_0= 'cstr' (this_TimeConstraint_1= ruleTimeConstraint | this_DurationConstraint_2= ruleDurationConstraint ) )
            {
            // InternalSequence.g:2562:2: (otherlv_0= 'cstr' (this_TimeConstraint_1= ruleTimeConstraint | this_DurationConstraint_2= ruleDurationConstraint ) )
            // InternalSequence.g:2563:3: otherlv_0= 'cstr' (this_TimeConstraint_1= ruleTimeConstraint | this_DurationConstraint_2= ruleDurationConstraint )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getCstrKeyword_0());
            		
            // InternalSequence.g:2567:3: (this_TimeConstraint_1= ruleTimeConstraint | this_DurationConstraint_2= ruleDurationConstraint )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalSequence.g:2568:4: this_TimeConstraint_1= ruleTimeConstraint
                    {

                    				newCompositeNode(grammarAccess.getConstraintAccess().getTimeConstraintParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_TimeConstraint_1=ruleTimeConstraint();

                    state._fsp--;


                    				current = this_TimeConstraint_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSequence.g:2577:4: this_DurationConstraint_2= ruleDurationConstraint
                    {

                    				newCompositeNode(grammarAccess.getConstraintAccess().getDurationConstraintParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DurationConstraint_2=ruleDurationConstraint();

                    state._fsp--;


                    				current = this_DurationConstraint_2;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleTimeConstraint"
    // InternalSequence.g:2590:1: entryRuleTimeConstraint returns [EObject current=null] : iv_ruleTimeConstraint= ruleTimeConstraint EOF ;
    public final EObject entryRuleTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeConstraint = null;


        try {
            // InternalSequence.g:2590:55: (iv_ruleTimeConstraint= ruleTimeConstraint EOF )
            // InternalSequence.g:2591:2: iv_ruleTimeConstraint= ruleTimeConstraint EOF
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
    // InternalSequence.g:2597:1: ruleTimeConstraint returns [EObject current=null] : (otherlv_0= '(' ( (lv_event_1_0= rulePointInTimeSelector ) ) otherlv_2= ')' otherlv_3= 't' otherlv_4= '[' ( (lv_time_5_0= ruleUnescapedString ) ) otherlv_6= ']' ) ;
    public final EObject ruleTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_event_1_0 = null;

        AntlrDatatypeRuleToken lv_time_5_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:2603:2: ( (otherlv_0= '(' ( (lv_event_1_0= rulePointInTimeSelector ) ) otherlv_2= ')' otherlv_3= 't' otherlv_4= '[' ( (lv_time_5_0= ruleUnescapedString ) ) otherlv_6= ']' ) )
            // InternalSequence.g:2604:2: (otherlv_0= '(' ( (lv_event_1_0= rulePointInTimeSelector ) ) otherlv_2= ')' otherlv_3= 't' otherlv_4= '[' ( (lv_time_5_0= ruleUnescapedString ) ) otherlv_6= ']' )
            {
            // InternalSequence.g:2604:2: (otherlv_0= '(' ( (lv_event_1_0= rulePointInTimeSelector ) ) otherlv_2= ')' otherlv_3= 't' otherlv_4= '[' ( (lv_time_5_0= ruleUnescapedString ) ) otherlv_6= ']' )
            // InternalSequence.g:2605:3: otherlv_0= '(' ( (lv_event_1_0= rulePointInTimeSelector ) ) otherlv_2= ')' otherlv_3= 't' otherlv_4= '[' ( (lv_time_5_0= ruleUnescapedString ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeConstraintAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSequence.g:2609:3: ( (lv_event_1_0= rulePointInTimeSelector ) )
            // InternalSequence.g:2610:4: (lv_event_1_0= rulePointInTimeSelector )
            {
            // InternalSequence.g:2610:4: (lv_event_1_0= rulePointInTimeSelector )
            // InternalSequence.g:2611:5: lv_event_1_0= rulePointInTimeSelector
            {

            					newCompositeNode(grammarAccess.getTimeConstraintAccess().getEventPointInTimeSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_event_1_0=rulePointInTimeSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeConstraintRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.PointInTimeSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeConstraintAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeConstraintAccess().getTKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeConstraintAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalSequence.g:2640:3: ( (lv_time_5_0= ruleUnescapedString ) )
            // InternalSequence.g:2641:4: (lv_time_5_0= ruleUnescapedString )
            {
            // InternalSequence.g:2641:4: (lv_time_5_0= ruleUnescapedString )
            // InternalSequence.g:2642:5: lv_time_5_0= ruleUnescapedString
            {

            					newCompositeNode(grammarAccess.getTimeConstraintAccess().getTimeUnescapedStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_time_5_0=ruleUnescapedString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeConstraintRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_5_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleDurationConstraint"
    // InternalSequence.g:2667:1: entryRuleDurationConstraint returns [EObject current=null] : iv_ruleDurationConstraint= ruleDurationConstraint EOF ;
    public final EObject entryRuleDurationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDurationConstraint = null;


        try {
            // InternalSequence.g:2667:59: (iv_ruleDurationConstraint= ruleDurationConstraint EOF )
            // InternalSequence.g:2668:2: iv_ruleDurationConstraint= ruleDurationConstraint EOF
            {
             newCompositeNode(grammarAccess.getDurationConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDurationConstraint=ruleDurationConstraint();

            state._fsp--;

             current =iv_ruleDurationConstraint; 
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
    // $ANTLR end "entryRuleDurationConstraint"


    // $ANTLR start "ruleDurationConstraint"
    // InternalSequence.g:2674:1: ruleDurationConstraint returns [EObject current=null] : (otherlv_0= '(' ( (lv_interval_1_0= ruleTimeIntervalSelector ) ) otherlv_2= ')' otherlv_3= 'd' otherlv_4= '[' ( (lv_duration_5_0= ruleUnescapedString ) ) otherlv_6= ']' ) ;
    public final EObject ruleDurationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interval_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_5_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:2680:2: ( (otherlv_0= '(' ( (lv_interval_1_0= ruleTimeIntervalSelector ) ) otherlv_2= ')' otherlv_3= 'd' otherlv_4= '[' ( (lv_duration_5_0= ruleUnescapedString ) ) otherlv_6= ']' ) )
            // InternalSequence.g:2681:2: (otherlv_0= '(' ( (lv_interval_1_0= ruleTimeIntervalSelector ) ) otherlv_2= ')' otherlv_3= 'd' otherlv_4= '[' ( (lv_duration_5_0= ruleUnescapedString ) ) otherlv_6= ']' )
            {
            // InternalSequence.g:2681:2: (otherlv_0= '(' ( (lv_interval_1_0= ruleTimeIntervalSelector ) ) otherlv_2= ')' otherlv_3= 'd' otherlv_4= '[' ( (lv_duration_5_0= ruleUnescapedString ) ) otherlv_6= ']' )
            // InternalSequence.g:2682:3: otherlv_0= '(' ( (lv_interval_1_0= ruleTimeIntervalSelector ) ) otherlv_2= ')' otherlv_3= 'd' otherlv_4= '[' ( (lv_duration_5_0= ruleUnescapedString ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDurationConstraintAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSequence.g:2686:3: ( (lv_interval_1_0= ruleTimeIntervalSelector ) )
            // InternalSequence.g:2687:4: (lv_interval_1_0= ruleTimeIntervalSelector )
            {
            // InternalSequence.g:2687:4: (lv_interval_1_0= ruleTimeIntervalSelector )
            // InternalSequence.g:2688:5: lv_interval_1_0= ruleTimeIntervalSelector
            {

            					newCompositeNode(grammarAccess.getDurationConstraintAccess().getIntervalTimeIntervalSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_interval_1_0=ruleTimeIntervalSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationConstraintRule());
            					}
            					set(
            						current,
            						"interval",
            						lv_interval_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.TimeIntervalSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getDurationConstraintAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getDurationConstraintAccess().getDKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getDurationConstraintAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalSequence.g:2717:3: ( (lv_duration_5_0= ruleUnescapedString ) )
            // InternalSequence.g:2718:4: (lv_duration_5_0= ruleUnescapedString )
            {
            // InternalSequence.g:2718:4: (lv_duration_5_0= ruleUnescapedString )
            // InternalSequence.g:2719:5: lv_duration_5_0= ruleUnescapedString
            {

            					newCompositeNode(grammarAccess.getDurationConstraintAccess().getDurationUnescapedStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_duration_5_0=ruleUnescapedString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationConstraintRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_5_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDurationConstraintAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDurationConstraint"


    // $ANTLR start "entryRuleObservation"
    // InternalSequence.g:2744:1: entryRuleObservation returns [EObject current=null] : iv_ruleObservation= ruleObservation EOF ;
    public final EObject entryRuleObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservation = null;


        try {
            // InternalSequence.g:2744:52: (iv_ruleObservation= ruleObservation EOF )
            // InternalSequence.g:2745:2: iv_ruleObservation= ruleObservation EOF
            {
             newCompositeNode(grammarAccess.getObservationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObservation=ruleObservation();

            state._fsp--;

             current =iv_ruleObservation; 
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
    // $ANTLR end "entryRuleObservation"


    // $ANTLR start "ruleObservation"
    // InternalSequence.g:2751:1: ruleObservation returns [EObject current=null] : (otherlv_0= 'obs' (this_TimeObservation_1= ruleTimeObservation | this_DurationObservation_2= ruleDurationObservation ) ) ;
    public final EObject ruleObservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TimeObservation_1 = null;

        EObject this_DurationObservation_2 = null;



        	enterRule();

        try {
            // InternalSequence.g:2757:2: ( (otherlv_0= 'obs' (this_TimeObservation_1= ruleTimeObservation | this_DurationObservation_2= ruleDurationObservation ) ) )
            // InternalSequence.g:2758:2: (otherlv_0= 'obs' (this_TimeObservation_1= ruleTimeObservation | this_DurationObservation_2= ruleDurationObservation ) )
            {
            // InternalSequence.g:2758:2: (otherlv_0= 'obs' (this_TimeObservation_1= ruleTimeObservation | this_DurationObservation_2= ruleDurationObservation ) )
            // InternalSequence.g:2759:3: otherlv_0= 'obs' (this_TimeObservation_1= ruleTimeObservation | this_DurationObservation_2= ruleDurationObservation )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getObservationAccess().getObsKeyword_0());
            		
            // InternalSequence.g:2763:3: (this_TimeObservation_1= ruleTimeObservation | this_DurationObservation_2= ruleDurationObservation )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalSequence.g:2764:4: this_TimeObservation_1= ruleTimeObservation
                    {

                    				newCompositeNode(grammarAccess.getObservationAccess().getTimeObservationParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_TimeObservation_1=ruleTimeObservation();

                    state._fsp--;


                    				current = this_TimeObservation_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSequence.g:2773:4: this_DurationObservation_2= ruleDurationObservation
                    {

                    				newCompositeNode(grammarAccess.getObservationAccess().getDurationObservationParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DurationObservation_2=ruleDurationObservation();

                    state._fsp--;


                    				current = this_DurationObservation_2;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleObservation"


    // $ANTLR start "entryRuleTimeObservation"
    // InternalSequence.g:2786:1: entryRuleTimeObservation returns [EObject current=null] : iv_ruleTimeObservation= ruleTimeObservation EOF ;
    public final EObject entryRuleTimeObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeObservation = null;


        try {
            // InternalSequence.g:2786:56: (iv_ruleTimeObservation= ruleTimeObservation EOF )
            // InternalSequence.g:2787:2: iv_ruleTimeObservation= ruleTimeObservation EOF
            {
             newCompositeNode(grammarAccess.getTimeObservationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeObservation=ruleTimeObservation();

            state._fsp--;

             current =iv_ruleTimeObservation; 
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
    // $ANTLR end "entryRuleTimeObservation"


    // $ANTLR start "ruleTimeObservation"
    // InternalSequence.g:2793:1: ruleTimeObservation returns [EObject current=null] : (otherlv_0= '(' ( (lv_event_1_0= rulePointInTimeSelector ) ) otherlv_2= ')' otherlv_3= 't' otherlv_4= '[' ( (lv_time_5_0= ruleUnescapedString ) ) otherlv_6= ']' ) ;
    public final EObject ruleTimeObservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_event_1_0 = null;

        AntlrDatatypeRuleToken lv_time_5_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:2799:2: ( (otherlv_0= '(' ( (lv_event_1_0= rulePointInTimeSelector ) ) otherlv_2= ')' otherlv_3= 't' otherlv_4= '[' ( (lv_time_5_0= ruleUnescapedString ) ) otherlv_6= ']' ) )
            // InternalSequence.g:2800:2: (otherlv_0= '(' ( (lv_event_1_0= rulePointInTimeSelector ) ) otherlv_2= ')' otherlv_3= 't' otherlv_4= '[' ( (lv_time_5_0= ruleUnescapedString ) ) otherlv_6= ']' )
            {
            // InternalSequence.g:2800:2: (otherlv_0= '(' ( (lv_event_1_0= rulePointInTimeSelector ) ) otherlv_2= ')' otherlv_3= 't' otherlv_4= '[' ( (lv_time_5_0= ruleUnescapedString ) ) otherlv_6= ']' )
            // InternalSequence.g:2801:3: otherlv_0= '(' ( (lv_event_1_0= rulePointInTimeSelector ) ) otherlv_2= ')' otherlv_3= 't' otherlv_4= '[' ( (lv_time_5_0= ruleUnescapedString ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeObservationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSequence.g:2805:3: ( (lv_event_1_0= rulePointInTimeSelector ) )
            // InternalSequence.g:2806:4: (lv_event_1_0= rulePointInTimeSelector )
            {
            // InternalSequence.g:2806:4: (lv_event_1_0= rulePointInTimeSelector )
            // InternalSequence.g:2807:5: lv_event_1_0= rulePointInTimeSelector
            {

            					newCompositeNode(grammarAccess.getTimeObservationAccess().getEventPointInTimeSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_event_1_0=rulePointInTimeSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeObservationRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.PointInTimeSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeObservationAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeObservationAccess().getTKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeObservationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalSequence.g:2836:3: ( (lv_time_5_0= ruleUnescapedString ) )
            // InternalSequence.g:2837:4: (lv_time_5_0= ruleUnescapedString )
            {
            // InternalSequence.g:2837:4: (lv_time_5_0= ruleUnescapedString )
            // InternalSequence.g:2838:5: lv_time_5_0= ruleUnescapedString
            {

            					newCompositeNode(grammarAccess.getTimeObservationAccess().getTimeUnescapedStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_time_5_0=ruleUnescapedString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeObservationRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_5_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTimeObservationAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTimeObservation"


    // $ANTLR start "entryRuleDurationObservation"
    // InternalSequence.g:2863:1: entryRuleDurationObservation returns [EObject current=null] : iv_ruleDurationObservation= ruleDurationObservation EOF ;
    public final EObject entryRuleDurationObservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDurationObservation = null;


        try {
            // InternalSequence.g:2863:60: (iv_ruleDurationObservation= ruleDurationObservation EOF )
            // InternalSequence.g:2864:2: iv_ruleDurationObservation= ruleDurationObservation EOF
            {
             newCompositeNode(grammarAccess.getDurationObservationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDurationObservation=ruleDurationObservation();

            state._fsp--;

             current =iv_ruleDurationObservation; 
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
    // $ANTLR end "entryRuleDurationObservation"


    // $ANTLR start "ruleDurationObservation"
    // InternalSequence.g:2870:1: ruleDurationObservation returns [EObject current=null] : (otherlv_0= '(' ( (lv_interval_1_0= ruleTimeIntervalSelector ) ) otherlv_2= ')' otherlv_3= 'd' otherlv_4= '[' ( (lv_duration_5_0= ruleUnescapedString ) ) otherlv_6= ']' ) ;
    public final EObject ruleDurationObservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_interval_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_5_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:2876:2: ( (otherlv_0= '(' ( (lv_interval_1_0= ruleTimeIntervalSelector ) ) otherlv_2= ')' otherlv_3= 'd' otherlv_4= '[' ( (lv_duration_5_0= ruleUnescapedString ) ) otherlv_6= ']' ) )
            // InternalSequence.g:2877:2: (otherlv_0= '(' ( (lv_interval_1_0= ruleTimeIntervalSelector ) ) otherlv_2= ')' otherlv_3= 'd' otherlv_4= '[' ( (lv_duration_5_0= ruleUnescapedString ) ) otherlv_6= ']' )
            {
            // InternalSequence.g:2877:2: (otherlv_0= '(' ( (lv_interval_1_0= ruleTimeIntervalSelector ) ) otherlv_2= ')' otherlv_3= 'd' otherlv_4= '[' ( (lv_duration_5_0= ruleUnescapedString ) ) otherlv_6= ']' )
            // InternalSequence.g:2878:3: otherlv_0= '(' ( (lv_interval_1_0= ruleTimeIntervalSelector ) ) otherlv_2= ')' otherlv_3= 'd' otherlv_4= '[' ( (lv_duration_5_0= ruleUnescapedString ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDurationObservationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSequence.g:2882:3: ( (lv_interval_1_0= ruleTimeIntervalSelector ) )
            // InternalSequence.g:2883:4: (lv_interval_1_0= ruleTimeIntervalSelector )
            {
            // InternalSequence.g:2883:4: (lv_interval_1_0= ruleTimeIntervalSelector )
            // InternalSequence.g:2884:5: lv_interval_1_0= ruleTimeIntervalSelector
            {

            					newCompositeNode(grammarAccess.getDurationObservationAccess().getIntervalTimeIntervalSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_interval_1_0=ruleTimeIntervalSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationObservationRule());
            					}
            					set(
            						current,
            						"interval",
            						lv_interval_1_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.TimeIntervalSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getDurationObservationAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getDurationObservationAccess().getDKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getDurationObservationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalSequence.g:2913:3: ( (lv_duration_5_0= ruleUnescapedString ) )
            // InternalSequence.g:2914:4: (lv_duration_5_0= ruleUnescapedString )
            {
            // InternalSequence.g:2914:4: (lv_duration_5_0= ruleUnescapedString )
            // InternalSequence.g:2915:5: lv_duration_5_0= ruleUnescapedString
            {

            					newCompositeNode(grammarAccess.getDurationObservationAccess().getDurationUnescapedStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_duration_5_0=ruleUnescapedString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationObservationRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_5_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.UnescapedString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDurationObservationAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDurationObservation"


    // $ANTLR start "entryRulePointInTimeSelector"
    // InternalSequence.g:2940:1: entryRulePointInTimeSelector returns [EObject current=null] : iv_rulePointInTimeSelector= rulePointInTimeSelector EOF ;
    public final EObject entryRulePointInTimeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointInTimeSelector = null;


        try {
            // InternalSequence.g:2940:60: (iv_rulePointInTimeSelector= rulePointInTimeSelector EOF )
            // InternalSequence.g:2941:2: iv_rulePointInTimeSelector= rulePointInTimeSelector EOF
            {
             newCompositeNode(grammarAccess.getPointInTimeSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointInTimeSelector=rulePointInTimeSelector();

            state._fsp--;

             current =iv_rulePointInTimeSelector; 
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
    // $ANTLR end "entryRulePointInTimeSelector"


    // $ANTLR start "rulePointInTimeSelector"
    // InternalSequence.g:2947:1: rulePointInTimeSelector returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject rulePointInTimeSelector() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSequence.g:2953:2: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:2954:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:2954:2: ( ( ruleFQN ) )
            // InternalSequence.g:2955:3: ( ruleFQN )
            {
            // InternalSequence.g:2955:3: ( ruleFQN )
            // InternalSequence.g:2956:4: ruleFQN
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPointInTimeSelectorRule());
            				}
            			

            				newCompositeNode(grammarAccess.getPointInTimeSelectorAccess().getPointInTimePointInTimeCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "rulePointInTimeSelector"


    // $ANTLR start "entryRuleTimeIntervalSelector"
    // InternalSequence.g:2973:1: entryRuleTimeIntervalSelector returns [EObject current=null] : iv_ruleTimeIntervalSelector= ruleTimeIntervalSelector EOF ;
    public final EObject entryRuleTimeIntervalSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeIntervalSelector = null;


        try {
            // InternalSequence.g:2973:61: (iv_ruleTimeIntervalSelector= ruleTimeIntervalSelector EOF )
            // InternalSequence.g:2974:2: iv_ruleTimeIntervalSelector= ruleTimeIntervalSelector EOF
            {
             newCompositeNode(grammarAccess.getTimeIntervalSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeIntervalSelector=ruleTimeIntervalSelector();

            state._fsp--;

             current =iv_ruleTimeIntervalSelector; 
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
    // $ANTLR end "entryRuleTimeIntervalSelector"


    // $ANTLR start "ruleTimeIntervalSelector"
    // InternalSequence.g:2980:1: ruleTimeIntervalSelector returns [EObject current=null] : (this_BiPointInTimeTimeIntervalSelector_0= ruleBiPointInTimeTimeIntervalSelector | this_FragmentTimeIntervalSelector_1= ruleFragmentTimeIntervalSelector ) ;
    public final EObject ruleTimeIntervalSelector() throws RecognitionException {
        EObject current = null;

        EObject this_BiPointInTimeTimeIntervalSelector_0 = null;

        EObject this_FragmentTimeIntervalSelector_1 = null;



        	enterRule();

        try {
            // InternalSequence.g:2986:2: ( (this_BiPointInTimeTimeIntervalSelector_0= ruleBiPointInTimeTimeIntervalSelector | this_FragmentTimeIntervalSelector_1= ruleFragmentTimeIntervalSelector ) )
            // InternalSequence.g:2987:2: (this_BiPointInTimeTimeIntervalSelector_0= ruleBiPointInTimeTimeIntervalSelector | this_FragmentTimeIntervalSelector_1= ruleFragmentTimeIntervalSelector )
            {
            // InternalSequence.g:2987:2: (this_BiPointInTimeTimeIntervalSelector_0= ruleBiPointInTimeTimeIntervalSelector | this_FragmentTimeIntervalSelector_1= ruleFragmentTimeIntervalSelector )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalSequence.g:2988:3: this_BiPointInTimeTimeIntervalSelector_0= ruleBiPointInTimeTimeIntervalSelector
                    {

                    			newCompositeNode(grammarAccess.getTimeIntervalSelectorAccess().getBiPointInTimeTimeIntervalSelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BiPointInTimeTimeIntervalSelector_0=ruleBiPointInTimeTimeIntervalSelector();

                    state._fsp--;


                    			current = this_BiPointInTimeTimeIntervalSelector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:2997:3: this_FragmentTimeIntervalSelector_1= ruleFragmentTimeIntervalSelector
                    {

                    			newCompositeNode(grammarAccess.getTimeIntervalSelectorAccess().getFragmentTimeIntervalSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FragmentTimeIntervalSelector_1=ruleFragmentTimeIntervalSelector();

                    state._fsp--;


                    			current = this_FragmentTimeIntervalSelector_1;
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
    // $ANTLR end "ruleTimeIntervalSelector"


    // $ANTLR start "entryRuleBiPointInTimeTimeIntervalSelector"
    // InternalSequence.g:3009:1: entryRuleBiPointInTimeTimeIntervalSelector returns [EObject current=null] : iv_ruleBiPointInTimeTimeIntervalSelector= ruleBiPointInTimeTimeIntervalSelector EOF ;
    public final EObject entryRuleBiPointInTimeTimeIntervalSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiPointInTimeTimeIntervalSelector = null;


        try {
            // InternalSequence.g:3009:74: (iv_ruleBiPointInTimeTimeIntervalSelector= ruleBiPointInTimeTimeIntervalSelector EOF )
            // InternalSequence.g:3010:2: iv_ruleBiPointInTimeTimeIntervalSelector= ruleBiPointInTimeTimeIntervalSelector EOF
            {
             newCompositeNode(grammarAccess.getBiPointInTimeTimeIntervalSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBiPointInTimeTimeIntervalSelector=ruleBiPointInTimeTimeIntervalSelector();

            state._fsp--;

             current =iv_ruleBiPointInTimeTimeIntervalSelector; 
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
    // $ANTLR end "entryRuleBiPointInTimeTimeIntervalSelector"


    // $ANTLR start "ruleBiPointInTimeTimeIntervalSelector"
    // InternalSequence.g:3016:1: ruleBiPointInTimeTimeIntervalSelector returns [EObject current=null] : ( ( (lv_start_0_0= rulePointInTimeSelector ) ) otherlv_1= ',' ( (lv_end_2_0= rulePointInTimeSelector ) ) ) ;
    public final EObject ruleBiPointInTimeTimeIntervalSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:3022:2: ( ( ( (lv_start_0_0= rulePointInTimeSelector ) ) otherlv_1= ',' ( (lv_end_2_0= rulePointInTimeSelector ) ) ) )
            // InternalSequence.g:3023:2: ( ( (lv_start_0_0= rulePointInTimeSelector ) ) otherlv_1= ',' ( (lv_end_2_0= rulePointInTimeSelector ) ) )
            {
            // InternalSequence.g:3023:2: ( ( (lv_start_0_0= rulePointInTimeSelector ) ) otherlv_1= ',' ( (lv_end_2_0= rulePointInTimeSelector ) ) )
            // InternalSequence.g:3024:3: ( (lv_start_0_0= rulePointInTimeSelector ) ) otherlv_1= ',' ( (lv_end_2_0= rulePointInTimeSelector ) )
            {
            // InternalSequence.g:3024:3: ( (lv_start_0_0= rulePointInTimeSelector ) )
            // InternalSequence.g:3025:4: (lv_start_0_0= rulePointInTimeSelector )
            {
            // InternalSequence.g:3025:4: (lv_start_0_0= rulePointInTimeSelector )
            // InternalSequence.g:3026:5: lv_start_0_0= rulePointInTimeSelector
            {

            					newCompositeNode(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getStartPointInTimeSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_start_0_0=rulePointInTimeSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBiPointInTimeTimeIntervalSelectorRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_0_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.PointInTimeSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getCommaKeyword_1());
            		
            // InternalSequence.g:3047:3: ( (lv_end_2_0= rulePointInTimeSelector ) )
            // InternalSequence.g:3048:4: (lv_end_2_0= rulePointInTimeSelector )
            {
            // InternalSequence.g:3048:4: (lv_end_2_0= rulePointInTimeSelector )
            // InternalSequence.g:3049:5: lv_end_2_0= rulePointInTimeSelector
            {

            					newCompositeNode(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getEndPointInTimeSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_2_0=rulePointInTimeSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBiPointInTimeTimeIntervalSelectorRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_2_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.PointInTimeSelector");
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
    // $ANTLR end "ruleBiPointInTimeTimeIntervalSelector"


    // $ANTLR start "entryRuleFragmentTimeIntervalSelector"
    // InternalSequence.g:3070:1: entryRuleFragmentTimeIntervalSelector returns [EObject current=null] : iv_ruleFragmentTimeIntervalSelector= ruleFragmentTimeIntervalSelector EOF ;
    public final EObject entryRuleFragmentTimeIntervalSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentTimeIntervalSelector = null;


        try {
            // InternalSequence.g:3070:69: (iv_ruleFragmentTimeIntervalSelector= ruleFragmentTimeIntervalSelector EOF )
            // InternalSequence.g:3071:2: iv_ruleFragmentTimeIntervalSelector= ruleFragmentTimeIntervalSelector EOF
            {
             newCompositeNode(grammarAccess.getFragmentTimeIntervalSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragmentTimeIntervalSelector=ruleFragmentTimeIntervalSelector();

            state._fsp--;

             current =iv_ruleFragmentTimeIntervalSelector; 
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
    // $ANTLR end "entryRuleFragmentTimeIntervalSelector"


    // $ANTLR start "ruleFragmentTimeIntervalSelector"
    // InternalSequence.g:3077:1: ruleFragmentTimeIntervalSelector returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleFragmentTimeIntervalSelector() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSequence.g:3083:2: ( ( ( ruleFQN ) ) )
            // InternalSequence.g:3084:2: ( ( ruleFQN ) )
            {
            // InternalSequence.g:3084:2: ( ( ruleFQN ) )
            // InternalSequence.g:3085:3: ( ruleFQN )
            {
            // InternalSequence.g:3085:3: ( ruleFQN )
            // InternalSequence.g:3086:4: ruleFQN
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFragmentTimeIntervalSelectorRule());
            				}
            			

            				newCompositeNode(grammarAccess.getFragmentTimeIntervalSelectorAccess().getNonInstantaneousFragmentNonInstantaneousFragmentCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleFragmentTimeIntervalSelector"


    // $ANTLR start "entryRuleImplicitSendOccurenceSpecification"
    // InternalSequence.g:3103:1: entryRuleImplicitSendOccurenceSpecification returns [EObject current=null] : iv_ruleImplicitSendOccurenceSpecification= ruleImplicitSendOccurenceSpecification EOF ;
    public final EObject entryRuleImplicitSendOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitSendOccurenceSpecification = null;


        try {
            // InternalSequence.g:3103:75: (iv_ruleImplicitSendOccurenceSpecification= ruleImplicitSendOccurenceSpecification EOF )
            // InternalSequence.g:3104:2: iv_ruleImplicitSendOccurenceSpecification= ruleImplicitSendOccurenceSpecification EOF
            {
             newCompositeNode(grammarAccess.getImplicitSendOccurenceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicitSendOccurenceSpecification=ruleImplicitSendOccurenceSpecification();

            state._fsp--;

             current =iv_ruleImplicitSendOccurenceSpecification; 
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
    // $ANTLR end "entryRuleImplicitSendOccurenceSpecification"


    // $ANTLR start "ruleImplicitSendOccurenceSpecification"
    // InternalSequence.g:3110:1: ruleImplicitSendOccurenceSpecification returns [EObject current=null] : () ;
    public final EObject ruleImplicitSendOccurenceSpecification() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSequence.g:3116:2: ( () )
            // InternalSequence.g:3117:2: ()
            {
            // InternalSequence.g:3117:2: ()
            // InternalSequence.g:3118:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getImplicitSendOccurenceSpecificationAccess().getImplicitMessageOccurenceSpecificationAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplicitSendOccurenceSpecification"


    // $ANTLR start "entryRuleImplicitArrivalOccurenceSpecification"
    // InternalSequence.g:3127:1: entryRuleImplicitArrivalOccurenceSpecification returns [EObject current=null] : iv_ruleImplicitArrivalOccurenceSpecification= ruleImplicitArrivalOccurenceSpecification EOF ;
    public final EObject entryRuleImplicitArrivalOccurenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitArrivalOccurenceSpecification = null;


        try {
            // InternalSequence.g:3127:78: (iv_ruleImplicitArrivalOccurenceSpecification= ruleImplicitArrivalOccurenceSpecification EOF )
            // InternalSequence.g:3128:2: iv_ruleImplicitArrivalOccurenceSpecification= ruleImplicitArrivalOccurenceSpecification EOF
            {
             newCompositeNode(grammarAccess.getImplicitArrivalOccurenceSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicitArrivalOccurenceSpecification=ruleImplicitArrivalOccurenceSpecification();

            state._fsp--;

             current =iv_ruleImplicitArrivalOccurenceSpecification; 
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
    // $ANTLR end "entryRuleImplicitArrivalOccurenceSpecification"


    // $ANTLR start "ruleImplicitArrivalOccurenceSpecification"
    // InternalSequence.g:3134:1: ruleImplicitArrivalOccurenceSpecification returns [EObject current=null] : () ;
    public final EObject ruleImplicitArrivalOccurenceSpecification() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSequence.g:3140:2: ( () )
            // InternalSequence.g:3141:2: ()
            {
            // InternalSequence.g:3141:2: ()
            // InternalSequence.g:3142:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getImplicitArrivalOccurenceSpecificationAccess().getImplicitMessageOccurenceSpecificationAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplicitArrivalOccurenceSpecification"


    // $ANTLR start "entryRuleFQN"
    // InternalSequence.g:3151:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSequence.g:3151:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSequence.g:3152:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalSequence.g:3158:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSequence.g:3164:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSequence.g:3165:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSequence.g:3165:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSequence.g:3166:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSequence.g:3173:3: (kw= '.' this_ID_2= RULE_ID )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==44) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSequence.g:3174:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,44,FOLLOW_8); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop43;
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


    // $ANTLR start "entryRuleInlineComment"
    // InternalSequence.g:3191:1: entryRuleInlineComment returns [EObject current=null] : iv_ruleInlineComment= ruleInlineComment EOF ;
    public final EObject entryRuleInlineComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineComment = null;


        try {
            // InternalSequence.g:3191:54: (iv_ruleInlineComment= ruleInlineComment EOF )
            // InternalSequence.g:3192:2: iv_ruleInlineComment= ruleInlineComment EOF
            {
             newCompositeNode(grammarAccess.getInlineCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineComment=ruleInlineComment();

            state._fsp--;

             current =iv_ruleInlineComment; 
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
    // $ANTLR end "entryRuleInlineComment"


    // $ANTLR start "ruleInlineComment"
    // InternalSequence.g:3198:1: ruleInlineComment returns [EObject current=null] : (otherlv_0= 'note' otherlv_1= '[' ( (lv_body_2_0= ruleCommentBody ) ) otherlv_3= ']' ) ;
    public final EObject ruleInlineComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalSequence.g:3204:2: ( (otherlv_0= 'note' otherlv_1= '[' ( (lv_body_2_0= ruleCommentBody ) ) otherlv_3= ']' ) )
            // InternalSequence.g:3205:2: (otherlv_0= 'note' otherlv_1= '[' ( (lv_body_2_0= ruleCommentBody ) ) otherlv_3= ']' )
            {
            // InternalSequence.g:3205:2: (otherlv_0= 'note' otherlv_1= '[' ( (lv_body_2_0= ruleCommentBody ) ) otherlv_3= ']' )
            // InternalSequence.g:3206:3: otherlv_0= 'note' otherlv_1= '[' ( (lv_body_2_0= ruleCommentBody ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineCommentAccess().getNoteKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInlineCommentAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSequence.g:3214:3: ( (lv_body_2_0= ruleCommentBody ) )
            // InternalSequence.g:3215:4: (lv_body_2_0= ruleCommentBody )
            {
            // InternalSequence.g:3215:4: (lv_body_2_0= ruleCommentBody )
            // InternalSequence.g:3216:5: lv_body_2_0= ruleCommentBody
            {

            					newCompositeNode(grammarAccess.getInlineCommentAccess().getBodyCommentBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_body_2_0=ruleCommentBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInlineCommentRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"de.cooperateproject.modeling.textual.sequence.Sequence.CommentBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInlineCommentAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleInlineComment"


    // $ANTLR start "entryRuleCommentBody"
    // InternalSequence.g:3241:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalSequence.g:3241:51: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalSequence.g:3242:2: iv_ruleCommentBody= ruleCommentBody EOF
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
    // InternalSequence.g:3248:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSequence.g:3254:2: (this_STRING_0= RULE_STRING )
            // InternalSequence.g:3255:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "entryRuleUnescapedString"
    // InternalSequence.g:3265:1: entryRuleUnescapedString returns [String current=null] : iv_ruleUnescapedString= ruleUnescapedString EOF ;
    public final String entryRuleUnescapedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnescapedString = null;


        try {
            // InternalSequence.g:3265:55: (iv_ruleUnescapedString= ruleUnescapedString EOF )
            // InternalSequence.g:3266:2: iv_ruleUnescapedString= ruleUnescapedString EOF
            {
             newCompositeNode(grammarAccess.getUnescapedStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnescapedString=ruleUnescapedString();

            state._fsp--;

             current =iv_ruleUnescapedString.getText(); 
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
    // $ANTLR end "entryRuleUnescapedString"


    // $ANTLR start "ruleUnescapedString"
    // InternalSequence.g:3272:1: ruleUnescapedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleUnescapedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalSequence.g:3278:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // InternalSequence.g:3279:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // InternalSequence.g:3279:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_STRING) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalSequence.g:3280:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getUnescapedStringAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSequence.g:3288:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getUnescapedStringAccess().getSTRINGTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleUnescapedString"


    // $ANTLR start "ruleMessageType"
    // InternalSequence.g:3299:1: ruleMessageType returns [Enumerator current=null] : ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) ) ;
    public final Enumerator ruleMessageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSequence.g:3305:2: ( ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) ) )
            // InternalSequence.g:3306:2: ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) )
            {
            // InternalSequence.g:3306:2: ( (enumLiteral_0= 'sync' ) | (enumLiteral_1= 'async' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46) ) {
                alt45=1;
            }
            else if ( (LA45_0==47) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalSequence.g:3307:3: (enumLiteral_0= 'sync' )
                    {
                    // InternalSequence.g:3307:3: (enumLiteral_0= 'sync' )
                    // InternalSequence.g:3308:4: enumLiteral_0= 'sync'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMessageTypeAccess().getSYNCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:3315:3: (enumLiteral_1= 'async' )
                    {
                    // InternalSequence.g:3315:3: (enumLiteral_1= 'async' )
                    // InternalSequence.g:3316:4: enumLiteral_1= 'async'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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
    // InternalSequence.g:3326:1: ruleActorType returns [Enumerator current=null] : ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) ;
    public final Enumerator ruleActorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSequence.g:3332:2: ( ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) )
            // InternalSequence.g:3333:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            {
            // InternalSequence.g:3333:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            else if ( (LA46_0==49) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalSequence.g:3334:3: (enumLiteral_0= 'human' )
                    {
                    // InternalSequence.g:3334:3: (enumLiteral_0= 'human' )
                    // InternalSequence.g:3335:4: enumLiteral_0= 'human'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSequence.g:3342:3: (enumLiteral_1= 'machine' )
                    {
                    // InternalSequence.g:3342:3: (enumLiteral_1= 'machine' )
                    // InternalSequence.g:3343:4: enumLiteral_1= 'machine'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

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


    protected DFA40 dfa40 = new DFA40(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\31\1\5\1\32\1\5\1\51\1\uffff\1\32\1\uffff";
    static final String dfa_3s = "\1\31\1\5\1\54\1\5\1\52\1\uffff\1\54\1\uffff";
    static final String dfa_4s = "\5\uffff\1\2\1\uffff\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\5\1\4\20\uffff\1\3",
            "\1\6",
            "\1\7\1\5",
            "",
            "\1\5\1\4\20\uffff\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2567:3: (this_TimeConstraint_1= ruleTimeConstraint | this_DurationConstraint_2= ruleDurationConstraint )";
        }
    }
    static final String dfa_7s = "\1\31\1\5\1\32\1\5\1\uffff\1\51\1\32\1\uffff";
    static final String dfa_8s = "\1\31\1\5\1\54\1\5\1\uffff\1\52\1\54\1\uffff";
    static final String dfa_9s = "\4\uffff\1\2\2\uffff\1\1";
    static final String[] dfa_10s = {
            "\1\1",
            "\1\2",
            "\1\4\1\5\20\uffff\1\3",
            "\1\6",
            "",
            "\1\7\1\4",
            "\1\4\1\5\20\uffff\1\3",
            ""
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "2763:3: (this_TimeObservation_1= ruleTimeObservation | this_DurationObservation_2= ruleDurationObservation )";
        }
    }
    static final String dfa_11s = "\6\uffff";
    static final String dfa_12s = "\1\uffff\1\4\3\uffff\1\4";
    static final String dfa_13s = "\1\5\1\32\1\5\2\uffff\1\32";
    static final String dfa_14s = "\1\5\1\54\1\5\2\uffff\1\54";
    static final String dfa_15s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_16s = "\6\uffff}>";
    static final String[] dfa_17s = {
            "\1\1",
            "\1\3\1\4\20\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\3\1\4\20\uffff\1\2"
    };

    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_11;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "2987:2: (this_BiPointInTimeTimeIntervalSelector_0= ruleBiPointInTimeTimeIntervalSelector | this_FragmentTimeIntervalSelector_1= ruleFragmentTimeIntervalSelector )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000C9FFD100D000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000C9FFD1001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000090000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00002000000A0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000C0FFD1000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000C0FFD1000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000C0FFD1100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000C0FFD1200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000C00010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000C0FFD1300000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000002L});

}