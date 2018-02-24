package de.cooperateproject.modeling.textual.usecase.parser.antlr.internal;

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
import de.cooperateproject.modeling.textual.usecase.services.UsecaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUsecaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-uscd'", "'@end-uscd'", "'rootPackage'", "'abstract'", "'act'", "'as'", "'role'", "'['", "']'", "'sys'", "'{'", "'}'", "'uc'", "'ep'", "'iac'", "'('", "','", "')'", "'card'", "':'", "'isa'", "'inc'", "'ext'", "'cond'", "'note'", "'..'", "'*'", "'.'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'human'", "'machine'"
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


        public InternalUsecaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUsecaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUsecaseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUsecase.g"; }



     	private UsecaseGrammarAccess grammarAccess;

        public InternalUsecaseParser(TokenStream input, UsecaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UseCaseDiagram";
       	}

       	@Override
       	protected UsecaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUseCaseDiagram"
    // InternalUsecase.g:65:1: entryRuleUseCaseDiagram returns [EObject current=null] : iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF ;
    public final EObject entryRuleUseCaseDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseDiagram = null;


        try {
            // InternalUsecase.g:65:55: (iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF )
            // InternalUsecase.g:66:2: iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF
            {
             newCompositeNode(grammarAccess.getUseCaseDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseDiagram=ruleUseCaseDiagram();

            state._fsp--;

             current =iv_ruleUseCaseDiagram; 
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
    // $ANTLR end "entryRuleUseCaseDiagram"


    // $ANTLR start "ruleUseCaseDiagram"
    // InternalUsecase.g:72:1: ruleUseCaseDiagram returns [EObject current=null] : ( () otherlv_1= '@start-uscd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-uscd' ) ;
    public final EObject ruleUseCaseDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_4=null;
        EObject lv_rootPackage_3_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:78:2: ( ( () otherlv_1= '@start-uscd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-uscd' ) )
            // InternalUsecase.g:79:2: ( () otherlv_1= '@start-uscd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-uscd' )
            {
            // InternalUsecase.g:79:2: ( () otherlv_1= '@start-uscd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-uscd' )
            // InternalUsecase.g:80:3: () otherlv_1= '@start-uscd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-uscd'
            {
            // InternalUsecase.g:80:3: ()
            // InternalUsecase.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseCaseDiagramAccess().getUseCaseDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUseCaseDiagramAccess().getStartUscdKeyword_1());
            		
            // InternalUsecase.g:91:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalUsecase.g:92:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalUsecase.g:92:4: (lv_title_2_0= RULE_STRING )
            // InternalUsecase.g:93:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_2_0, grammarAccess.getUseCaseDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUsecase.g:109:3: ( (lv_rootPackage_3_0= ruleRootPackage ) )
            // InternalUsecase.g:110:4: (lv_rootPackage_3_0= ruleRootPackage )
            {
            // InternalUsecase.g:110:4: (lv_rootPackage_3_0= ruleRootPackage )
            // InternalUsecase.g:111:5: lv_rootPackage_3_0= ruleRootPackage
            {

            					newCompositeNode(grammarAccess.getUseCaseDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_rootPackage_3_0=ruleRootPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseCaseDiagramRule());
            					}
            					set(
            						current,
            						"rootPackage",
            						lv_rootPackage_3_0,
            						"de.cooperateproject.modeling.textual.usecase.Usecase.RootPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUseCaseDiagramAccess().getEndUscdKeyword_4());
            		

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
    // $ANTLR end "ruleUseCaseDiagram"


    // $ANTLR start "entryRuleRootPackage"
    // InternalUsecase.g:136:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalUsecase.g:136:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalUsecase.g:137:2: iv_ruleRootPackage= ruleRootPackage EOF
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
    // InternalUsecase.g:143:1: ruleRootPackage returns [EObject current=null] : ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_actors_3_0= ruleActor ) )* ( (lv_systems_4_0= ruleSystem ) )* ( (lv_relationships_5_0= ruleActorUsecaseRelationship ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actors_3_0 = null;

        EObject lv_systems_4_0 = null;

        EObject lv_relationships_5_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:149:2: ( ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_actors_3_0= ruleActor ) )* ( (lv_systems_4_0= ruleSystem ) )* ( (lv_relationships_5_0= ruleActorUsecaseRelationship ) )* ) )
            // InternalUsecase.g:150:2: ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_actors_3_0= ruleActor ) )* ( (lv_systems_4_0= ruleSystem ) )* ( (lv_relationships_5_0= ruleActorUsecaseRelationship ) )* )
            {
            // InternalUsecase.g:150:2: ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_actors_3_0= ruleActor ) )* ( (lv_systems_4_0= ruleSystem ) )* ( (lv_relationships_5_0= ruleActorUsecaseRelationship ) )* )
            // InternalUsecase.g:151:3: () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_actors_3_0= ruleActor ) )* ( (lv_systems_4_0= ruleSystem ) )* ( (lv_relationships_5_0= ruleActorUsecaseRelationship ) )*
            {
            // InternalUsecase.g:151:3: ()
            // InternalUsecase.g:152:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootPackageAccess().getRootPackageAction_0(),
            					current);
            			

            }

            // InternalUsecase.g:158:3: (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUsecase.g:159:4: otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0());
                    			
                    // InternalUsecase.g:163:4: ( (lv_name_2_0= ruleFQN ) )
                    // InternalUsecase.g:164:5: (lv_name_2_0= ruleFQN )
                    {
                    // InternalUsecase.g:164:5: (lv_name_2_0= ruleFQN )
                    // InternalUsecase.g:165:6: lv_name_2_0= ruleFQN
                    {

                    						newCompositeNode(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_name_2_0=ruleFQN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootPackageRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"de.cooperateproject.modeling.textual.usecase.Usecase.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUsecase.g:183:3: ( (lv_actors_3_0= ruleActor ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=15)||(LA2_0>=39 && LA2_0<=45)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUsecase.g:184:4: (lv_actors_3_0= ruleActor )
            	    {
            	    // InternalUsecase.g:184:4: (lv_actors_3_0= ruleActor )
            	    // InternalUsecase.g:185:5: lv_actors_3_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getActorsActorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_actors_3_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_3_0,
            	    						"de.cooperateproject.modeling.textual.usecase.Usecase.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalUsecase.g:202:3: ( (lv_systems_4_0= ruleSystem ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUsecase.g:203:4: (lv_systems_4_0= ruleSystem )
            	    {
            	    // InternalUsecase.g:203:4: (lv_systems_4_0= ruleSystem )
            	    // InternalUsecase.g:204:5: lv_systems_4_0= ruleSystem
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getSystemsSystemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_systems_4_0=ruleSystem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systems",
            	    						lv_systems_4_0,
            	    						"de.cooperateproject.modeling.textual.usecase.Usecase.System");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalUsecase.g:221:3: ( (lv_relationships_5_0= ruleActorUsecaseRelationship ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25||LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUsecase.g:222:4: (lv_relationships_5_0= ruleActorUsecaseRelationship )
            	    {
            	    // InternalUsecase.g:222:4: (lv_relationships_5_0= ruleActorUsecaseRelationship )
            	    // InternalUsecase.g:223:5: lv_relationships_5_0= ruleActorUsecaseRelationship
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getRelationshipsActorUsecaseRelationshipParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_relationships_5_0=ruleActorUsecaseRelationship();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relationships",
            	    						lv_relationships_5_0,
            	    						"de.cooperateproject.modeling.textual.usecase.Usecase.ActorUsecaseRelationship");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleUseCaseRelationship"
    // InternalUsecase.g:244:1: entryRuleUseCaseRelationship returns [EObject current=null] : iv_ruleUseCaseRelationship= ruleUseCaseRelationship EOF ;
    public final EObject entryRuleUseCaseRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseRelationship = null;


        try {
            // InternalUsecase.g:244:60: (iv_ruleUseCaseRelationship= ruleUseCaseRelationship EOF )
            // InternalUsecase.g:245:2: iv_ruleUseCaseRelationship= ruleUseCaseRelationship EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseRelationship=ruleUseCaseRelationship();

            state._fsp--;

             current =iv_ruleUseCaseRelationship; 
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
    // $ANTLR end "entryRuleUseCaseRelationship"


    // $ANTLR start "ruleUseCaseRelationship"
    // InternalUsecase.g:251:1: ruleUseCaseRelationship returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_Extend_1= ruleExtend | this_Include_2= ruleInclude ) ;
    public final EObject ruleUseCaseRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_Extend_1 = null;

        EObject this_Include_2 = null;



        	enterRule();

        try {
            // InternalUsecase.g:257:2: ( (this_Generalization_0= ruleGeneralization | this_Extend_1= ruleExtend | this_Include_2= ruleInclude ) )
            // InternalUsecase.g:258:2: (this_Generalization_0= ruleGeneralization | this_Extend_1= ruleExtend | this_Include_2= ruleInclude )
            {
            // InternalUsecase.g:258:2: (this_Generalization_0= ruleGeneralization | this_Extend_1= ruleExtend | this_Include_2= ruleInclude )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 32:
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
                    // InternalUsecase.g:259:3: this_Generalization_0= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getUseCaseRelationshipAccess().getGeneralizationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_0=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsecase.g:268:3: this_Extend_1= ruleExtend
                    {

                    			newCompositeNode(grammarAccess.getUseCaseRelationshipAccess().getExtendParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extend_1=ruleExtend();

                    state._fsp--;


                    			current = this_Extend_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUsecase.g:277:3: this_Include_2= ruleInclude
                    {

                    			newCompositeNode(grammarAccess.getUseCaseRelationshipAccess().getIncludeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Include_2=ruleInclude();

                    state._fsp--;


                    			current = this_Include_2;
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
    // $ANTLR end "ruleUseCaseRelationship"


    // $ANTLR start "entryRuleActorUsecaseRelationship"
    // InternalUsecase.g:289:1: entryRuleActorUsecaseRelationship returns [EObject current=null] : iv_ruleActorUsecaseRelationship= ruleActorUsecaseRelationship EOF ;
    public final EObject entryRuleActorUsecaseRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorUsecaseRelationship = null;


        try {
            // InternalUsecase.g:289:65: (iv_ruleActorUsecaseRelationship= ruleActorUsecaseRelationship EOF )
            // InternalUsecase.g:290:2: iv_ruleActorUsecaseRelationship= ruleActorUsecaseRelationship EOF
            {
             newCompositeNode(grammarAccess.getActorUsecaseRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActorUsecaseRelationship=ruleActorUsecaseRelationship();

            state._fsp--;

             current =iv_ruleActorUsecaseRelationship; 
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
    // $ANTLR end "entryRuleActorUsecaseRelationship"


    // $ANTLR start "ruleActorUsecaseRelationship"
    // InternalUsecase.g:296:1: ruleActorUsecaseRelationship returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation ) ;
    public final EObject ruleActorUsecaseRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_Association_1 = null;



        	enterRule();

        try {
            // InternalUsecase.g:302:2: ( (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation ) )
            // InternalUsecase.g:303:2: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation )
            {
            // InternalUsecase.g:303:2: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
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
                    // InternalUsecase.g:304:3: this_Generalization_0= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getActorUsecaseRelationshipAccess().getGeneralizationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_0=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsecase.g:313:3: this_Association_1= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getActorUsecaseRelationshipAccess().getAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_1=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_1;
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
    // $ANTLR end "ruleActorUsecaseRelationship"


    // $ANTLR start "entryRuleActor"
    // InternalUsecase.g:325:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalUsecase.g:325:46: (iv_ruleActor= ruleActor EOF )
            // InternalUsecase.g:326:2: iv_ruleActor= ruleActor EOF
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
    // InternalUsecase.g:332:1: ruleActor returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'act' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )? ( (lv_comments_11_0= ruleComment ) )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_alias_4_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_type_9_0 = null;

        EObject lv_comments_11_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:338:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'act' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )? ( (lv_comments_11_0= ruleComment ) )? ) )
            // InternalUsecase.g:339:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'act' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )? ( (lv_comments_11_0= ruleComment ) )? )
            {
            // InternalUsecase.g:339:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'act' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )? ( (lv_comments_11_0= ruleComment ) )? )
            // InternalUsecase.g:340:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'act' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )? ( (lv_comments_11_0= ruleComment ) )?
            {
            // InternalUsecase.g:340:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=39 && LA7_0<=45)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUsecase.g:341:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUsecase.g:341:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUsecase.g:342:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActorRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.usecase.Usecase.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUsecase.g:359:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUsecase.g:360:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalUsecase.g:360:4: (lv_abstract_1_0= 'abstract' )
                    // InternalUsecase.g:361:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,14,FOLLOW_11); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getActorAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActorRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getActKeyword_2());
            		
            // InternalUsecase.g:377:3: ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==16) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||LA9_1==12||(LA9_1>=14 && LA9_1<=15)||LA9_1==17||LA9_1==20||LA9_1==25||LA9_1==31||LA9_1==35||(LA9_1>=39 && LA9_1<=45)) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUsecase.g:378:4: ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:378:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUsecase.g:379:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUsecase.g:379:5: (lv_name_3_0= RULE_ID )
                    // InternalUsecase.g:380:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:397:4: ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) )
                    {
                    // InternalUsecase.g:397:4: ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) )
                    // InternalUsecase.g:398:5: ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) )
                    {
                    // InternalUsecase.g:398:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalUsecase.g:399:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalUsecase.g:399:6: (lv_alias_4_0= RULE_ID )
                    // InternalUsecase.g:400:7: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    							newLeafNode(lv_alias_4_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_3_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_4_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getActorAccess().getAsKeyword_3_1_1());
                    				
                    // InternalUsecase.g:420:5: ( (lv_name_6_0= RULE_STRING ) )
                    // InternalUsecase.g:421:6: (lv_name_6_0= RULE_STRING )
                    {
                    // InternalUsecase.g:421:6: (lv_name_6_0= RULE_STRING )
                    // InternalUsecase.g:422:7: lv_name_6_0= RULE_STRING
                    {
                    lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    							newLeafNode(lv_name_6_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_3_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_6_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalUsecase.g:440:3: (otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUsecase.g:441:4: otherlv_7= 'role' otherlv_8= '[' ( (lv_type_9_0= ruleActorType ) ) otherlv_10= ']'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getActorAccess().getRoleKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getActorAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalUsecase.g:449:4: ( (lv_type_9_0= ruleActorType ) )
                    // InternalUsecase.g:450:5: (lv_type_9_0= ruleActorType )
                    {
                    // InternalUsecase.g:450:5: (lv_type_9_0= ruleActorType )
                    // InternalUsecase.g:451:6: lv_type_9_0= ruleActorType
                    {

                    						newCompositeNode(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_type_9_0=ruleActorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"de.cooperateproject.modeling.textual.usecase.Usecase.ActorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getActorAccess().getRightSquareBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalUsecase.g:473:3: ( (lv_comments_11_0= ruleComment ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUsecase.g:474:4: (lv_comments_11_0= ruleComment )
                    {
                    // InternalUsecase.g:474:4: (lv_comments_11_0= ruleComment )
                    // InternalUsecase.g:475:5: lv_comments_11_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getCommentsCommentParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_11_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActorRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_11_0,
                    						"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
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


    // $ANTLR start "entryRuleSystem"
    // InternalUsecase.g:496:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalUsecase.g:496:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalUsecase.g:497:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalUsecase.g:503:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'sys' ( (lv_name_1_0= ruleFQN ) ) ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* ( (lv_relationships_6_0= ruleUseCaseRelationship ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_comments_2_0 = null;

        EObject lv_comments_4_0 = null;

        EObject lv_usecases_5_0 = null;

        EObject lv_relationships_6_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:509:2: ( (otherlv_0= 'sys' ( (lv_name_1_0= ruleFQN ) ) ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* ( (lv_relationships_6_0= ruleUseCaseRelationship ) )* otherlv_7= '}' ) ) ) )
            // InternalUsecase.g:510:2: (otherlv_0= 'sys' ( (lv_name_1_0= ruleFQN ) ) ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* ( (lv_relationships_6_0= ruleUseCaseRelationship ) )* otherlv_7= '}' ) ) )
            {
            // InternalUsecase.g:510:2: (otherlv_0= 'sys' ( (lv_name_1_0= ruleFQN ) ) ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* ( (lv_relationships_6_0= ruleUseCaseRelationship ) )* otherlv_7= '}' ) ) )
            // InternalUsecase.g:511:3: otherlv_0= 'sys' ( (lv_name_1_0= ruleFQN ) ) ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* ( (lv_relationships_6_0= ruleUseCaseRelationship ) )* otherlv_7= '}' ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSysKeyword_0());
            		
            // InternalUsecase.g:515:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalUsecase.g:516:4: (lv_name_1_0= ruleFQN )
            {
            // InternalUsecase.g:516:4: (lv_name_1_0= ruleFQN )
            // InternalUsecase.g:517:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cooperateproject.modeling.textual.usecase.Usecase.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUsecase.g:534:3: ( ( (lv_comments_2_0= ruleComment ) )? | (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* ( (lv_relationships_6_0= ruleUseCaseRelationship ) )* otherlv_7= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EOF||LA16_0==12||LA16_0==20||LA16_0==25||LA16_0==31||LA16_0==35) ) {
                alt16=1;
            }
            else if ( (LA16_0==21) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalUsecase.g:535:4: ( (lv_comments_2_0= ruleComment ) )?
                    {
                    // InternalUsecase.g:535:4: ( (lv_comments_2_0= ruleComment ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==35) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalUsecase.g:536:5: (lv_comments_2_0= ruleComment )
                            {
                            // InternalUsecase.g:536:5: (lv_comments_2_0= ruleComment )
                            // InternalUsecase.g:537:6: lv_comments_2_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getSystemAccess().getCommentsCommentParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_2_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSystemRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_2_0,
                            							"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:555:4: (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* ( (lv_relationships_6_0= ruleUseCaseRelationship ) )* otherlv_7= '}' )
                    {
                    // InternalUsecase.g:555:4: (otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* ( (lv_relationships_6_0= ruleUseCaseRelationship ) )* otherlv_7= '}' )
                    // InternalUsecase.g:556:5: otherlv_3= '{' ( (lv_comments_4_0= ruleComment ) )? ( (lv_usecases_5_0= ruleUseCase ) )* ( (lv_relationships_6_0= ruleUseCaseRelationship ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_19); 

                    					newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalUsecase.g:560:5: ( (lv_comments_4_0= ruleComment ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==35) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalUsecase.g:561:6: (lv_comments_4_0= ruleComment )
                            {
                            // InternalUsecase.g:561:6: (lv_comments_4_0= ruleComment )
                            // InternalUsecase.g:562:7: lv_comments_4_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getSystemAccess().getCommentsCommentParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_20);
                            lv_comments_4_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSystemRule());
                            							}
                            							add(
                            								current,
                            								"comments",
                            								lv_comments_4_0,
                            								"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalUsecase.g:579:5: ( (lv_usecases_5_0= ruleUseCase ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14||LA14_0==23||(LA14_0>=39 && LA14_0<=45)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalUsecase.g:580:6: (lv_usecases_5_0= ruleUseCase )
                    	    {
                    	    // InternalUsecase.g:580:6: (lv_usecases_5_0= ruleUseCase )
                    	    // InternalUsecase.g:581:7: lv_usecases_5_0= ruleUseCase
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getUsecasesUseCaseParserRuleCall_2_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_usecases_5_0=ruleUseCase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"usecases",
                    	    								lv_usecases_5_0,
                    	    								"de.cooperateproject.modeling.textual.usecase.Usecase.UseCase");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // InternalUsecase.g:598:5: ( (lv_relationships_6_0= ruleUseCaseRelationship ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=31 && LA15_0<=33)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalUsecase.g:599:6: (lv_relationships_6_0= ruleUseCaseRelationship )
                    	    {
                    	    // InternalUsecase.g:599:6: (lv_relationships_6_0= ruleUseCaseRelationship )
                    	    // InternalUsecase.g:600:7: lv_relationships_6_0= ruleUseCaseRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getRelationshipsUseCaseRelationshipParserRuleCall_2_1_3_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_relationships_6_0=ruleUseCaseRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relationships",
                    	    								lv_relationships_6_0,
                    	    								"de.cooperateproject.modeling.textual.usecase.Usecase.UseCaseRelationship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_2_1_4());
                    				

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleUseCase"
    // InternalUsecase.g:627:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUsecase.g:627:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUsecase.g:628:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
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
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUsecase.g:634:1: ruleUseCase returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'uc' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) ) ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_alias_4_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_comments_9_0 = null;

        EObject lv_extensionPoints_10_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:640:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'uc' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) ) ) )
            // InternalUsecase.g:641:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'uc' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) ) )
            {
            // InternalUsecase.g:641:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'uc' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) ) )
            // InternalUsecase.g:642:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'uc' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) )
            {
            // InternalUsecase.g:642:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=39 && LA17_0<=45)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUsecase.g:643:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUsecase.g:643:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUsecase.g:644:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.usecase.Usecase.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUsecase.g:661:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUsecase.g:662:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalUsecase.g:662:4: (lv_abstract_1_0= 'abstract' )
                    // InternalUsecase.g:663:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,14,FOLLOW_23); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getUseCaseAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUseCaseRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getUcKeyword_2());
            		
            // InternalUsecase.g:679:3: ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||LA19_1==14||(LA19_1>=21 && LA19_1<=23)||(LA19_1>=31 && LA19_1<=33)||LA19_1==35||(LA19_1>=39 && LA19_1<=45)) ) {
                    alt19=1;
                }
                else if ( (LA19_1==16) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalUsecase.g:680:4: ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:680:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUsecase.g:681:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUsecase.g:681:5: (lv_name_3_0= RULE_ID )
                    // InternalUsecase.g:682:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:699:4: ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) )
                    {
                    // InternalUsecase.g:699:4: ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) )
                    // InternalUsecase.g:700:5: ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) )
                    {
                    // InternalUsecase.g:700:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalUsecase.g:701:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalUsecase.g:701:6: (lv_alias_4_0= RULE_ID )
                    // InternalUsecase.g:702:7: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    							newLeafNode(lv_alias_4_0, grammarAccess.getUseCaseAccess().getAliasIDTerminalRuleCall_3_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getUseCaseRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_4_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getAsKeyword_3_1_1());
                    				
                    // InternalUsecase.g:722:5: ( (lv_name_6_0= RULE_STRING ) )
                    // InternalUsecase.g:723:6: (lv_name_6_0= RULE_STRING )
                    {
                    // InternalUsecase.g:723:6: (lv_name_6_0= RULE_STRING )
                    // InternalUsecase.g:724:7: lv_name_6_0= RULE_STRING
                    {
                    lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    							newLeafNode(lv_name_6_0, grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_3_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getUseCaseRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_6_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalUsecase.g:742:3: ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EOF||LA23_0==14||(LA23_0>=22 && LA23_0<=23)||(LA23_0>=31 && LA23_0<=33)||LA23_0==35||(LA23_0>=39 && LA23_0<=45)) ) {
                alt23=1;
            }
            else if ( (LA23_0==21) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalUsecase.g:743:4: ( (lv_comments_7_0= ruleComment ) )?
                    {
                    // InternalUsecase.g:743:4: ( (lv_comments_7_0= ruleComment ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==35) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalUsecase.g:744:5: (lv_comments_7_0= ruleComment )
                            {
                            // InternalUsecase.g:744:5: (lv_comments_7_0= ruleComment )
                            // InternalUsecase.g:745:6: lv_comments_7_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getUseCaseAccess().getCommentsCommentParserRuleCall_4_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_7_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getUseCaseRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_7_0,
                            							"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:763:4: (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' )
                    {
                    // InternalUsecase.g:763:4: (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}' )
                    // InternalUsecase.g:764:5: otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_24); 

                    					newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalUsecase.g:768:5: ( (lv_comments_9_0= ruleComment ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==35) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalUsecase.g:769:6: (lv_comments_9_0= ruleComment )
                            {
                            // InternalUsecase.g:769:6: (lv_comments_9_0= ruleComment )
                            // InternalUsecase.g:770:7: lv_comments_9_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getUseCaseAccess().getCommentsCommentParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_comments_9_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getUseCaseRule());
                            							}
                            							add(
                            								current,
                            								"comments",
                            								lv_comments_9_0,
                            								"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalUsecase.g:787:5: ( (lv_extensionPoints_10_0= ruleExtensionPoint ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==24) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalUsecase.g:788:6: (lv_extensionPoints_10_0= ruleExtensionPoint )
                    	    {
                    	    // InternalUsecase.g:788:6: (lv_extensionPoints_10_0= ruleExtensionPoint )
                    	    // InternalUsecase.g:789:7: lv_extensionPoints_10_0= ruleExtensionPoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionPointsExtensionPointParserRuleCall_4_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_extensionPoints_10_0=ruleExtensionPoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"extensionPoints",
                    	    								lv_extensionPoints_10_0,
                    	    								"de.cooperateproject.modeling.textual.usecase.Usecase.ExtensionPoint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_4_1_3());
                    				

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
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleExtensionPoint"
    // InternalUsecase.g:816:1: entryRuleExtensionPoint returns [EObject current=null] : iv_ruleExtensionPoint= ruleExtensionPoint EOF ;
    public final EObject entryRuleExtensionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionPoint = null;


        try {
            // InternalUsecase.g:816:55: (iv_ruleExtensionPoint= ruleExtensionPoint EOF )
            // InternalUsecase.g:817:2: iv_ruleExtensionPoint= ruleExtensionPoint EOF
            {
             newCompositeNode(grammarAccess.getExtensionPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionPoint=ruleExtensionPoint();

            state._fsp--;

             current =iv_ruleExtensionPoint; 
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
    // $ANTLR end "entryRuleExtensionPoint"


    // $ANTLR start "ruleExtensionPoint"
    // InternalUsecase.g:823:1: ruleExtensionPoint returns [EObject current=null] : (otherlv_0= 'ep' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleExtensionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalUsecase.g:829:2: ( (otherlv_0= 'ep' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ) )
            // InternalUsecase.g:830:2: (otherlv_0= 'ep' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) )
            {
            // InternalUsecase.g:830:2: (otherlv_0= 'ep' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) )
            // InternalUsecase.g:831:3: otherlv_0= 'ep' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getEpKeyword_0());
            		
            // InternalUsecase.g:835:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==EOF||LA24_1==22||LA24_1==24) ) {
                    alt24=1;
                }
                else if ( (LA24_1==16) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUsecase.g:836:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:836:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUsecase.g:837:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUsecase.g:837:5: (lv_name_1_0= RULE_ID )
                    // InternalUsecase.g:838:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getExtensionPointAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtensionPointRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:855:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    {
                    // InternalUsecase.g:855:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    // InternalUsecase.g:856:5: ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) )
                    {
                    // InternalUsecase.g:856:5: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalUsecase.g:857:6: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalUsecase.g:857:6: (lv_alias_2_0= RULE_ID )
                    // InternalUsecase.g:858:7: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    							newLeafNode(lv_alias_2_0, grammarAccess.getExtensionPointAccess().getAliasIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtensionPointRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_2_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getExtensionPointAccess().getAsKeyword_1_1_1());
                    				
                    // InternalUsecase.g:878:5: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalUsecase.g:879:6: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalUsecase.g:879:6: (lv_name_4_0= RULE_STRING )
                    // InternalUsecase.g:880:7: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getExtensionPointAccess().getNameSTRINGTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtensionPointRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


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
    // $ANTLR end "ruleExtensionPoint"


    // $ANTLR start "entryRuleAssociation"
    // InternalUsecase.g:902:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUsecase.g:902:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUsecase.g:903:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalUsecase.g:909:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'iac' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )? ( (lv_comments_12_0= ruleComment ) )? ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_actorCardinality_8_0 = null;

        EObject lv_useCaseCardinality_10_0 = null;

        EObject lv_comments_12_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:915:2: ( (otherlv_0= 'iac' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )? ( (lv_comments_12_0= ruleComment ) )? ) )
            // InternalUsecase.g:916:2: (otherlv_0= 'iac' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )? ( (lv_comments_12_0= ruleComment ) )? )
            {
            // InternalUsecase.g:916:2: (otherlv_0= 'iac' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )? ( (lv_comments_12_0= ruleComment ) )? )
            // InternalUsecase.g:917:3: otherlv_0= 'iac' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )? ( (lv_comments_12_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getIacKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUsecase.g:925:3: ( ( ruleFQN ) )
            // InternalUsecase.g:926:4: ( ruleFQN )
            {
            // InternalUsecase.g:926:4: ( ruleFQN )
            // InternalUsecase.g:927:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getActorActorCrossReference_2_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getCommaKeyword_3());
            		
            // InternalUsecase.g:945:3: ( ( ruleFQN ) )
            // InternalUsecase.g:946:4: ( ruleFQN )
            {
            // InternalUsecase.g:946:4: ( ruleFQN )
            // InternalUsecase.g:947:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getUsecaseUseCaseCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getRightParenthesisKeyword_5());
            		
            // InternalUsecase.g:965:3: (otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUsecase.g:966:4: otherlv_6= 'card' otherlv_7= '[' ( (lv_actorCardinality_8_0= ruleCardinality ) ) (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )? otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getCardKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalUsecase.g:974:4: ( (lv_actorCardinality_8_0= ruleCardinality ) )
                    // InternalUsecase.g:975:5: (lv_actorCardinality_8_0= ruleCardinality )
                    {
                    // InternalUsecase.g:975:5: (lv_actorCardinality_8_0= ruleCardinality )
                    // InternalUsecase.g:976:6: lv_actorCardinality_8_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getAssociationAccess().getActorCardinalityCardinalityParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_actorCardinality_8_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationRule());
                    						}
                    						set(
                    							current,
                    							"actorCardinality",
                    							lv_actorCardinality_8_0,
                    							"de.cooperateproject.modeling.textual.usecase.Usecase.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUsecase.g:993:4: (otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==30) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalUsecase.g:994:5: otherlv_9= ':' ( (lv_useCaseCardinality_10_0= ruleCardinality ) )
                            {
                            otherlv_9=(Token)match(input,30,FOLLOW_30); 

                            					newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getColonKeyword_6_3_0());
                            				
                            // InternalUsecase.g:998:5: ( (lv_useCaseCardinality_10_0= ruleCardinality ) )
                            // InternalUsecase.g:999:6: (lv_useCaseCardinality_10_0= ruleCardinality )
                            {
                            // InternalUsecase.g:999:6: (lv_useCaseCardinality_10_0= ruleCardinality )
                            // InternalUsecase.g:1000:7: lv_useCaseCardinality_10_0= ruleCardinality
                            {

                            							newCompositeNode(grammarAccess.getAssociationAccess().getUseCaseCardinalityCardinalityParserRuleCall_6_3_1_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_useCaseCardinality_10_0=ruleCardinality();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationRule());
                            							}
                            							set(
                            								current,
                            								"useCaseCardinality",
                            								lv_useCaseCardinality_10_0,
                            								"de.cooperateproject.modeling.textual.usecase.Usecase.Cardinality");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalUsecase.g:1023:3: ( (lv_comments_12_0= ruleComment ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUsecase.g:1024:4: (lv_comments_12_0= ruleComment )
                    {
                    // InternalUsecase.g:1024:4: (lv_comments_12_0= ruleComment )
                    // InternalUsecase.g:1025:5: lv_comments_12_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getCommentsCommentParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_12_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_12_0,
                    						"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleGeneralization"
    // InternalUsecase.g:1046:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalUsecase.g:1046:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalUsecase.g:1047:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
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
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalUsecase.g:1053:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_comments_6_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:1059:2: ( (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? ) )
            // InternalUsecase.g:1060:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? )
            {
            // InternalUsecase.g:1060:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? )
            // InternalUsecase.g:1061:3: otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsaKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUsecase.g:1069:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1070:4: ( ruleFQN )
            {
            // InternalUsecase.g:1070:4: ( ruleFQN )
            // InternalUsecase.g:1071:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getSpecificBehavioredClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getCommaKeyword_3());
            		
            // InternalUsecase.g:1089:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1090:4: ( ruleFQN )
            {
            // InternalUsecase.g:1090:4: ( ruleFQN )
            // InternalUsecase.g:1091:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getGeneralBehavioredClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_5());
            		
            // InternalUsecase.g:1109:3: ( (lv_comments_6_0= ruleComment ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUsecase.g:1110:4: (lv_comments_6_0= ruleComment )
                    {
                    // InternalUsecase.g:1110:4: (lv_comments_6_0= ruleComment )
                    // InternalUsecase.g:1111:5: lv_comments_6_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getGeneralizationAccess().getCommentsCommentParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_6_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeneralizationRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_6_0,
                    						"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
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
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleInclude"
    // InternalUsecase.g:1132:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalUsecase.g:1132:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalUsecase.g:1133:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalUsecase.g:1139:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'inc' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_comments_6_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:1145:2: ( (otherlv_0= 'inc' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? ) )
            // InternalUsecase.g:1146:2: (otherlv_0= 'inc' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? )
            {
            // InternalUsecase.g:1146:2: (otherlv_0= 'inc' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? )
            // InternalUsecase.g:1147:3: otherlv_0= 'inc' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUsecase.g:1155:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1156:4: ( ruleFQN )
            {
            // InternalUsecase.g:1156:4: ( ruleFQN )
            // InternalUsecase.g:1157:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIncludeAccess().getIncludingCaseUseCaseCrossReference_2_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getCommaKeyword_3());
            		
            // InternalUsecase.g:1175:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1176:4: ( ruleFQN )
            {
            // InternalUsecase.g:1176:4: ( ruleFQN )
            // InternalUsecase.g:1177:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIncludeAccess().getAdditionUseCaseCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getRightParenthesisKeyword_5());
            		
            // InternalUsecase.g:1195:3: ( (lv_comments_6_0= ruleComment ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUsecase.g:1196:4: (lv_comments_6_0= ruleComment )
                    {
                    // InternalUsecase.g:1196:4: (lv_comments_6_0= ruleComment )
                    // InternalUsecase.g:1197:5: lv_comments_6_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getIncludeAccess().getCommentsCommentParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_6_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIncludeRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_6_0,
                    						"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleExtend"
    // InternalUsecase.g:1218:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalUsecase.g:1218:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalUsecase.g:1219:2: iv_ruleExtend= ruleExtend EOF
            {
             newCompositeNode(grammarAccess.getExtendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtend=ruleExtend();

            state._fsp--;

             current =iv_ruleExtend; 
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
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // InternalUsecase.g:1225:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'ext' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' otherlv_6= 'ep' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )? ( (lv_comments_14_0= ruleComment ) )? ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_condition_12_0=null;
        Token otherlv_13=null;
        EObject lv_comments_14_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:1231:2: ( (otherlv_0= 'ext' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' otherlv_6= 'ep' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )? ( (lv_comments_14_0= ruleComment ) )? ) )
            // InternalUsecase.g:1232:2: (otherlv_0= 'ext' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' otherlv_6= 'ep' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )? ( (lv_comments_14_0= ruleComment ) )? )
            {
            // InternalUsecase.g:1232:2: (otherlv_0= 'ext' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' otherlv_6= 'ep' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )? ( (lv_comments_14_0= ruleComment ) )? )
            // InternalUsecase.g:1233:3: otherlv_0= 'ext' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' otherlv_6= 'ep' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )? ( (lv_comments_14_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUsecase.g:1241:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1242:4: ( ruleFQN )
            {
            // InternalUsecase.g:1242:4: ( ruleFQN )
            // InternalUsecase.g:1243:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getExtensionUseCaseCrossReference_2_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getExtendAccess().getCommaKeyword_3());
            		
            // InternalUsecase.g:1261:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1262:4: ( ruleFQN )
            {
            // InternalUsecase.g:1262:4: ( ruleFQN )
            // InternalUsecase.g:1263:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getExtendedCaseUseCaseCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getExtendAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getExtendAccess().getEpKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getExtendAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUsecase.g:1289:3: ( (otherlv_8= RULE_ID ) )
            // InternalUsecase.g:1290:4: (otherlv_8= RULE_ID )
            {
            // InternalUsecase.g:1290:4: (otherlv_8= RULE_ID )
            // InternalUsecase.g:1291:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_8, grammarAccess.getExtendAccess().getExtensionLocationExtensionPointCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_33); 

            			newLeafNode(otherlv_9, grammarAccess.getExtendAccess().getRightSquareBracketKeyword_9());
            		
            // InternalUsecase.g:1306:3: (otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUsecase.g:1307:4: otherlv_10= 'cond' otherlv_11= '[' ( (lv_condition_12_0= RULE_STRING ) ) otherlv_13= ']'
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getExtendAccess().getCondKeyword_10_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getExtendAccess().getLeftSquareBracketKeyword_10_1());
                    			
                    // InternalUsecase.g:1315:4: ( (lv_condition_12_0= RULE_STRING ) )
                    // InternalUsecase.g:1316:5: (lv_condition_12_0= RULE_STRING )
                    {
                    // InternalUsecase.g:1316:5: (lv_condition_12_0= RULE_STRING )
                    // InternalUsecase.g:1317:6: lv_condition_12_0= RULE_STRING
                    {
                    lv_condition_12_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_condition_12_0, grammarAccess.getExtendAccess().getConditionSTRINGTerminalRuleCall_10_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtendRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getExtendAccess().getRightSquareBracketKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalUsecase.g:1338:3: ( (lv_comments_14_0= ruleComment ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUsecase.g:1339:4: (lv_comments_14_0= ruleComment )
                    {
                    // InternalUsecase.g:1339:4: (lv_comments_14_0= ruleComment )
                    // InternalUsecase.g:1340:5: lv_comments_14_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getExtendAccess().getCommentsCommentParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_14_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExtendRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_14_0,
                    						"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
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
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleComment"
    // InternalUsecase.g:1361:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalUsecase.g:1361:48: (iv_ruleComment= ruleComment EOF )
            // InternalUsecase.g:1362:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalUsecase.g:1368:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:1374:2: ( (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) )
            // InternalUsecase.g:1375:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            {
            // InternalUsecase.g:1375:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            // InternalUsecase.g:1376:3: otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
            		
            // InternalUsecase.g:1380:3: ( (lv_body_1_0= ruleCommentBody ) )
            // InternalUsecase.g:1381:4: (lv_body_1_0= ruleCommentBody )
            {
            // InternalUsecase.g:1381:4: (lv_body_1_0= ruleCommentBody )
            // InternalUsecase.g:1382:5: lv_body_1_0= ruleCommentBody
            {

            					newCompositeNode(grammarAccess.getCommentAccess().getBodyCommentBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleCommentBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"de.cooperateproject.modeling.textual.usecase.Usecase.CommentBody");
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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleCommentBody"
    // InternalUsecase.g:1403:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalUsecase.g:1403:51: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalUsecase.g:1404:2: iv_ruleCommentBody= ruleCommentBody EOF
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
    // InternalUsecase.g:1410:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalUsecase.g:1416:2: (this_STRING_0= RULE_STRING )
            // InternalUsecase.g:1417:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "entryRuleCardinality"
    // InternalUsecase.g:1427:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalUsecase.g:1427:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalUsecase.g:1428:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalUsecase.g:1434:1: ruleCardinality returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:1440:2: ( ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) )
            // InternalUsecase.g:1441:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            {
            // InternalUsecase.g:1441:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            // InternalUsecase.g:1442:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            {
            // InternalUsecase.g:1442:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) )
            // InternalUsecase.g:1443:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            {
            // InternalUsecase.g:1443:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            // InternalUsecase.g:1444:5: lv_lowerBound_0_0= ruleCardinalityBound
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_lowerBound_0_0=ruleCardinalityBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_0_0,
            						"de.cooperateproject.modeling.textual.usecase.Usecase.CardinalityBound");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUsecase.g:1461:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUsecase.g:1462:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalUsecase.g:1466:4: ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    // InternalUsecase.g:1467:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    {
                    // InternalUsecase.g:1467:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    // InternalUsecase.g:1468:6: lv_upperBound_2_0= ruleCardinalityBound
                    {

                    						newCompositeNode(grammarAccess.getCardinalityAccess().getUpperBoundCardinalityBoundParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_upperBound_2_0=ruleCardinalityBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCardinalityRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_2_0,
                    							"de.cooperateproject.modeling.textual.usecase.Usecase.CardinalityBound");
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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleCardinalityBound"
    // InternalUsecase.g:1490:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // InternalUsecase.g:1490:56: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // InternalUsecase.g:1491:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
            {
             newCompositeNode(grammarAccess.getCardinalityBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinalityBound=ruleCardinalityBound();

            state._fsp--;

             current =iv_ruleCardinalityBound.getText(); 
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
    // $ANTLR end "entryRuleCardinalityBound"


    // $ANTLR start "ruleCardinalityBound"
    // InternalUsecase.g:1497:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUsecase.g:1503:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalUsecase.g:1504:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalUsecase.g:1504:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_INT) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalUsecase.g:1505:3: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUsecase.g:1511:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getCardinalityBoundAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleCardinalityBound"


    // $ANTLR start "entryRuleFQN"
    // InternalUsecase.g:1522:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalUsecase.g:1522:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalUsecase.g:1523:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalUsecase.g:1529:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUsecase.g:1535:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUsecase.g:1536:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUsecase.g:1536:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUsecase.g:1537:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalUsecase.g:1544:3: (kw= '.' this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalUsecase.g:1545:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,38,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
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


    // $ANTLR start "ruleVisibility"
    // InternalUsecase.g:1562:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalUsecase.g:1568:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalUsecase.g:1569:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalUsecase.g:1569:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt35=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt35=1;
                }
                break;
            case 40:
                {
                alt35=2;
                }
                break;
            case 41:
                {
                alt35=3;
                }
                break;
            case 42:
                {
                alt35=4;
                }
                break;
            case 43:
                {
                alt35=5;
                }
                break;
            case 44:
                {
                alt35=6;
                }
                break;
            case 45:
                {
                alt35=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalUsecase.g:1570:3: (enumLiteral_0= '+' )
                    {
                    // InternalUsecase.g:1570:3: (enumLiteral_0= '+' )
                    // InternalUsecase.g:1571:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:1578:3: (enumLiteral_1= 'public' )
                    {
                    // InternalUsecase.g:1578:3: (enumLiteral_1= 'public' )
                    // InternalUsecase.g:1579:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUsecase.g:1586:3: (enumLiteral_2= '-' )
                    {
                    // InternalUsecase.g:1586:3: (enumLiteral_2= '-' )
                    // InternalUsecase.g:1587:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUsecase.g:1594:3: (enumLiteral_3= 'private' )
                    {
                    // InternalUsecase.g:1594:3: (enumLiteral_3= 'private' )
                    // InternalUsecase.g:1595:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUsecase.g:1602:3: (enumLiteral_4= '#' )
                    {
                    // InternalUsecase.g:1602:3: (enumLiteral_4= '#' )
                    // InternalUsecase.g:1603:4: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalUsecase.g:1610:3: (enumLiteral_5= 'protected' )
                    {
                    // InternalUsecase.g:1610:3: (enumLiteral_5= 'protected' )
                    // InternalUsecase.g:1611:4: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalUsecase.g:1618:3: (enumLiteral_6= '~' )
                    {
                    // InternalUsecase.g:1618:3: (enumLiteral_6= '~' )
                    // InternalUsecase.g:1619:4: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "ruleActorType"
    // InternalUsecase.g:1629:1: ruleActorType returns [Enumerator current=null] : ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) ;
    public final Enumerator ruleActorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUsecase.g:1635:2: ( ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) )
            // InternalUsecase.g:1636:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            {
            // InternalUsecase.g:1636:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            else if ( (LA36_0==47) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalUsecase.g:1637:3: (enumLiteral_0= 'human' )
                    {
                    // InternalUsecase.g:1637:3: (enumLiteral_0= 'human' )
                    // InternalUsecase.g:1638:4: enumLiteral_0= 'human'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:1645:3: (enumLiteral_1= 'machine' )
                    {
                    // InternalUsecase.g:1645:3: (enumLiteral_1= 'machine' )
                    // InternalUsecase.g:1646:4: enumLiteral_1= 'machine'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00003F808210F000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00003F808210C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000082100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00003F8B80C04000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00003F8380C04000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000380400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000801400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000002L});

}