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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-uc'", "'@end-uc'", "'rootElement'", "'abstract'", "'actor'", "'as'", "'['", "']'", "'system'", "'{'", "'}'", "'usecase'", "'extensionpoint'", "'iac'", "'|'", "'isA'", "'inc'", "'ext'", "'note'", "'..'", "'*'", "'.'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'human'", "'machine'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalUsecase.g:72:1: ruleUseCaseDiagram returns [EObject current=null] : (otherlv_0= '@start-uc' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_rootPackage_2_0= ruleRootPackage ) ) otherlv_3= '@end-uc' ) ;
    public final EObject ruleUseCaseDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_3=null;
        EObject lv_rootPackage_2_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:78:2: ( (otherlv_0= '@start-uc' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_rootPackage_2_0= ruleRootPackage ) ) otherlv_3= '@end-uc' ) )
            // InternalUsecase.g:79:2: (otherlv_0= '@start-uc' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_rootPackage_2_0= ruleRootPackage ) ) otherlv_3= '@end-uc' )
            {
            // InternalUsecase.g:79:2: (otherlv_0= '@start-uc' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_rootPackage_2_0= ruleRootPackage ) ) otherlv_3= '@end-uc' )
            // InternalUsecase.g:80:3: otherlv_0= '@start-uc' ( (lv_title_1_0= RULE_STRING ) ) ( (lv_rootPackage_2_0= ruleRootPackage ) ) otherlv_3= '@end-uc'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseDiagramAccess().getStartUcKeyword_0());
            		
            // InternalUsecase.g:84:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalUsecase.g:85:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalUsecase.g:85:4: (lv_title_1_0= RULE_STRING )
            // InternalUsecase.g:86:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_1_0, grammarAccess.getUseCaseDiagramAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUsecase.g:102:3: ( (lv_rootPackage_2_0= ruleRootPackage ) )
            // InternalUsecase.g:103:4: (lv_rootPackage_2_0= ruleRootPackage )
            {
            // InternalUsecase.g:103:4: (lv_rootPackage_2_0= ruleRootPackage )
            // InternalUsecase.g:104:5: lv_rootPackage_2_0= ruleRootPackage
            {

            					newCompositeNode(grammarAccess.getUseCaseDiagramAccess().getRootPackageRootPackageParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_rootPackage_2_0=ruleRootPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseCaseDiagramRule());
            					}
            					set(
            						current,
            						"rootPackage",
            						lv_rootPackage_2_0,
            						"de.cooperateproject.modeling.textual.usecase.Usecase.RootPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUseCaseDiagramAccess().getEndUcKeyword_3());
            		

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
    // InternalUsecase.g:129:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalUsecase.g:129:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalUsecase.g:130:2: iv_ruleRootPackage= ruleRootPackage EOF
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
    // InternalUsecase.g:136:1: ruleRootPackage returns [EObject current=null] : (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_systems_3_0= ruleSystem ) )* ( (lv_relationships_4_0= ruleRelationship ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actors_2_0 = null;

        EObject lv_systems_3_0 = null;

        EObject lv_relationships_4_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:142:2: ( (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_systems_3_0= ruleSystem ) )* ( (lv_relationships_4_0= ruleRelationship ) )* ) )
            // InternalUsecase.g:143:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_systems_3_0= ruleSystem ) )* ( (lv_relationships_4_0= ruleRelationship ) )* )
            {
            // InternalUsecase.g:143:2: (otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_systems_3_0= ruleSystem ) )* ( (lv_relationships_4_0= ruleRelationship ) )* )
            // InternalUsecase.g:144:3: otherlv_0= 'rootElement' ( (lv_name_1_0= ruleFQN ) ) ( (lv_actors_2_0= ruleActor ) )* ( (lv_systems_3_0= ruleSystem ) )* ( (lv_relationships_4_0= ruleRelationship ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRootPackageAccess().getRootElementKeyword_0());
            		
            // InternalUsecase.g:148:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalUsecase.g:149:4: (lv_name_1_0= ruleFQN )
            {
            // InternalUsecase.g:149:4: (lv_name_1_0= ruleFQN )
            // InternalUsecase.g:150:5: lv_name_1_0= ruleFQN
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
            						"de.cooperateproject.modeling.textual.usecase.Usecase.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUsecase.g:167:3: ( (lv_actors_2_0= ruleActor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||(LA1_0>=33 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUsecase.g:168:4: (lv_actors_2_0= ruleActor )
            	    {
            	    // InternalUsecase.g:168:4: (lv_actors_2_0= ruleActor )
            	    // InternalUsecase.g:169:5: lv_actors_2_0= ruleActor
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
            	    						"de.cooperateproject.modeling.textual.usecase.Usecase.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUsecase.g:186:3: ( (lv_systems_3_0= ruleSystem ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUsecase.g:187:4: (lv_systems_3_0= ruleSystem )
            	    {
            	    // InternalUsecase.g:187:4: (lv_systems_3_0= ruleSystem )
            	    // InternalUsecase.g:188:5: lv_systems_3_0= ruleSystem
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getSystemsSystemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_systems_3_0=ruleSystem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systems",
            	    						lv_systems_3_0,
            	    						"de.cooperateproject.modeling.textual.usecase.Usecase.System");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalUsecase.g:205:3: ( (lv_relationships_4_0= ruleRelationship ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUsecase.g:206:4: (lv_relationships_4_0= ruleRelationship )
            	    {
            	    // InternalUsecase.g:206:4: (lv_relationships_4_0= ruleRelationship )
            	    // InternalUsecase.g:207:5: lv_relationships_4_0= ruleRelationship
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getRelationshipsRelationshipParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_relationships_4_0=ruleRelationship();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relationships",
            	    						lv_relationships_4_0,
            	    						"de.cooperateproject.modeling.textual.usecase.Usecase.Relationship");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // InternalUsecase.g:228:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalUsecase.g:228:46: (iv_ruleActor= ruleActor EOF )
            // InternalUsecase.g:229:2: iv_ruleActor= ruleActor EOF
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
    // InternalUsecase.g:235:1: ruleActor returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'actor' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= '[' ( (lv_type_8_0= ruleActorType ) ) otherlv_9= ']' )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_alias_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:241:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'actor' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= '[' ( (lv_type_8_0= ruleActorType ) ) otherlv_9= ']' )? ) )
            // InternalUsecase.g:242:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'actor' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= '[' ( (lv_type_8_0= ruleActorType ) ) otherlv_9= ']' )? )
            {
            // InternalUsecase.g:242:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'actor' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= '[' ( (lv_type_8_0= ruleActorType ) ) otherlv_9= ']' )? )
            // InternalUsecase.g:243:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'actor' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= '[' ( (lv_type_8_0= ruleActorType ) ) otherlv_9= ']' )?
            {
            // InternalUsecase.g:243:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=33 && LA4_0<=39)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUsecase.g:244:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUsecase.g:244:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUsecase.g:245:5: lv_visibility_0_0= ruleVisibility
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

            // InternalUsecase.g:262:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUsecase.g:263:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalUsecase.g:263:4: (lv_abstract_1_0= 'abstract' )
                    // InternalUsecase.g:264:5: lv_abstract_1_0= 'abstract'
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

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getActorKeyword_2());
            		
            // InternalUsecase.g:280:3: ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUsecase.g:281:4: ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:281:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUsecase.g:282:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUsecase.g:282:5: (lv_name_3_0= RULE_ID )
                    // InternalUsecase.g:283:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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
                    // InternalUsecase.g:300:4: ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    {
                    // InternalUsecase.g:300:4: ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    // InternalUsecase.g:301:5: ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:301:5: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalUsecase.g:302:6: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalUsecase.g:302:6: (lv_name_4_0= RULE_STRING )
                    // InternalUsecase.g:303:7: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_3_1_0_0());
                    						

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

                    otherlv_5=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getActorAccess().getAsKeyword_3_1_1());
                    				
                    // InternalUsecase.g:323:5: ( (lv_alias_6_0= RULE_ID ) )
                    // InternalUsecase.g:324:6: (lv_alias_6_0= RULE_ID )
                    {
                    // InternalUsecase.g:324:6: (lv_alias_6_0= RULE_ID )
                    // InternalUsecase.g:325:7: lv_alias_6_0= RULE_ID
                    {
                    lv_alias_6_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    							newLeafNode(lv_alias_6_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_3_1_2_0());
                    						

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

            }

            // InternalUsecase.g:343:3: (otherlv_7= '[' ( (lv_type_8_0= ruleActorType ) ) otherlv_9= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUsecase.g:344:4: otherlv_7= '[' ( (lv_type_8_0= ruleActorType ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getActorAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalUsecase.g:348:4: ( (lv_type_8_0= ruleActorType ) )
                    // InternalUsecase.g:349:5: (lv_type_8_0= ruleActorType )
                    {
                    // InternalUsecase.g:349:5: (lv_type_8_0= ruleActorType )
                    // InternalUsecase.g:350:6: lv_type_8_0= ruleActorType
                    {

                    						newCompositeNode(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_type_8_0=ruleActorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_8_0,
                    							"de.cooperateproject.modeling.textual.usecase.Usecase.ActorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getActorAccess().getRightSquareBracketKeyword_4_2());
                    			

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
    // InternalUsecase.g:376:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalUsecase.g:376:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalUsecase.g:377:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalUsecase.g:383:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_usecases_3_0= ruleUseCase ) )* otherlv_4= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_usecases_3_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:389:2: ( (otherlv_0= 'system' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_usecases_3_0= ruleUseCase ) )* otherlv_4= '}' ) )
            // InternalUsecase.g:390:2: (otherlv_0= 'system' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_usecases_3_0= ruleUseCase ) )* otherlv_4= '}' )
            {
            // InternalUsecase.g:390:2: (otherlv_0= 'system' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_usecases_3_0= ruleUseCase ) )* otherlv_4= '}' )
            // InternalUsecase.g:391:3: otherlv_0= 'system' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_usecases_3_0= ruleUseCase ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalUsecase.g:395:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalUsecase.g:396:4: (lv_name_1_0= ruleFQN )
            {
            // InternalUsecase.g:396:4: (lv_name_1_0= ruleFQN )
            // InternalUsecase.g:397:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUsecase.g:418:3: ( (lv_usecases_3_0= ruleUseCase ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14||LA8_0==22||(LA8_0>=33 && LA8_0<=39)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUsecase.g:419:4: (lv_usecases_3_0= ruleUseCase )
            	    {
            	    // InternalUsecase.g:419:4: (lv_usecases_3_0= ruleUseCase )
            	    // InternalUsecase.g:420:5: lv_usecases_3_0= ruleUseCase
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getUsecasesUseCaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_usecases_3_0=ruleUseCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"usecases",
            	    						lv_usecases_3_0,
            	    						"de.cooperateproject.modeling.textual.usecase.Usecase.UseCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalUsecase.g:445:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUsecase.g:445:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUsecase.g:446:2: iv_ruleUseCase= ruleUseCase EOF
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
    // InternalUsecase.g:452:1: ruleUseCase returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'usecase' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= '{' ( (lv_extensionPoints_8_0= ruleExtensionPoint ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_alias_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_extensionPoints_8_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:458:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'usecase' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= '{' ( (lv_extensionPoints_8_0= ruleExtensionPoint ) )* otherlv_9= '}' )? ) )
            // InternalUsecase.g:459:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'usecase' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= '{' ( (lv_extensionPoints_8_0= ruleExtensionPoint ) )* otherlv_9= '}' )? )
            {
            // InternalUsecase.g:459:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'usecase' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= '{' ( (lv_extensionPoints_8_0= ruleExtensionPoint ) )* otherlv_9= '}' )? )
            // InternalUsecase.g:460:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'usecase' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) ) (otherlv_7= '{' ( (lv_extensionPoints_8_0= ruleExtensionPoint ) )* otherlv_9= '}' )?
            {
            // InternalUsecase.g:460:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=33 && LA9_0<=39)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUsecase.g:461:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUsecase.g:461:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUsecase.g:462:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalUsecase.g:479:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUsecase.g:480:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalUsecase.g:480:4: (lv_abstract_1_0= 'abstract' )
                    // InternalUsecase.g:481:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,14,FOLLOW_20); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getUseCaseAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUseCaseRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getUsecaseKeyword_2());
            		
            // InternalUsecase.g:497:3: ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUsecase.g:498:4: ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:498:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUsecase.g:499:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUsecase.g:499:5: (lv_name_3_0= RULE_ID )
                    // InternalUsecase.g:500:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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
                    // InternalUsecase.g:517:4: ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    {
                    // InternalUsecase.g:517:4: ( ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )
                    // InternalUsecase.g:518:5: ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:518:5: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalUsecase.g:519:6: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalUsecase.g:519:6: (lv_name_4_0= RULE_STRING )
                    // InternalUsecase.g:520:7: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_3_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getUseCaseRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getAsKeyword_3_1_1());
                    				
                    // InternalUsecase.g:540:5: ( (lv_alias_6_0= RULE_ID ) )
                    // InternalUsecase.g:541:6: (lv_alias_6_0= RULE_ID )
                    {
                    // InternalUsecase.g:541:6: (lv_alias_6_0= RULE_ID )
                    // InternalUsecase.g:542:7: lv_alias_6_0= RULE_ID
                    {
                    lv_alias_6_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(lv_alias_6_0, grammarAccess.getUseCaseAccess().getAliasIDTerminalRuleCall_3_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getUseCaseRule());
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

            }

            // InternalUsecase.g:560:3: (otherlv_7= '{' ( (lv_extensionPoints_8_0= ruleExtensionPoint ) )* otherlv_9= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUsecase.g:561:4: otherlv_7= '{' ( (lv_extensionPoints_8_0= ruleExtensionPoint ) )* otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalUsecase.g:565:4: ( (lv_extensionPoints_8_0= ruleExtensionPoint ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==23) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalUsecase.g:566:5: (lv_extensionPoints_8_0= ruleExtensionPoint )
                    	    {
                    	    // InternalUsecase.g:566:5: (lv_extensionPoints_8_0= ruleExtensionPoint )
                    	    // InternalUsecase.g:567:6: lv_extensionPoints_8_0= ruleExtensionPoint
                    	    {

                    	    						newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionPointsExtensionPointParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_extensionPoints_8_0=ruleExtensionPoint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"extensionPoints",
                    	    							lv_extensionPoints_8_0,
                    	    							"de.cooperateproject.modeling.textual.usecase.Usecase.ExtensionPoint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_4_2());
                    			

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
    // InternalUsecase.g:593:1: entryRuleExtensionPoint returns [EObject current=null] : iv_ruleExtensionPoint= ruleExtensionPoint EOF ;
    public final EObject entryRuleExtensionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionPoint = null;


        try {
            // InternalUsecase.g:593:55: (iv_ruleExtensionPoint= ruleExtensionPoint EOF )
            // InternalUsecase.g:594:2: iv_ruleExtensionPoint= ruleExtensionPoint EOF
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
    // InternalUsecase.g:600:1: ruleExtensionPoint returns [EObject current=null] : (otherlv_0= 'extensionpoint' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) ) ) ;
    public final EObject ruleExtensionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;


        	enterRule();

        try {
            // InternalUsecase.g:606:2: ( (otherlv_0= 'extensionpoint' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) ) ) )
            // InternalUsecase.g:607:2: (otherlv_0= 'extensionpoint' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) ) )
            {
            // InternalUsecase.g:607:2: (otherlv_0= 'extensionpoint' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) ) )
            // InternalUsecase.g:608:3: otherlv_0= 'extensionpoint' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getExtensionpointKeyword_0());
            		
            // InternalUsecase.g:612:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUsecase.g:613:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:613:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUsecase.g:614:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUsecase.g:614:5: (lv_name_1_0= RULE_ID )
                    // InternalUsecase.g:615:6: lv_name_1_0= RULE_ID
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
                    // InternalUsecase.g:632:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    {
                    // InternalUsecase.g:632:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    // InternalUsecase.g:633:5: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    // InternalUsecase.g:633:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalUsecase.g:634:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalUsecase.g:634:6: (lv_name_2_0= RULE_STRING )
                    // InternalUsecase.g:635:7: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    							newLeafNode(lv_name_2_0, grammarAccess.getExtensionPointAccess().getNameSTRINGTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtensionPointRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getExtensionPointAccess().getAsKeyword_1_1_1());
                    				
                    // InternalUsecase.g:655:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalUsecase.g:656:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalUsecase.g:656:6: (lv_alias_4_0= RULE_ID )
                    // InternalUsecase.g:657:7: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(lv_alias_4_0, grammarAccess.getExtensionPointAccess().getAliasIDTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtensionPointRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_4_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

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


    // $ANTLR start "entryRuleRelationship"
    // InternalUsecase.g:679:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalUsecase.g:679:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalUsecase.g:680:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalUsecase.g:686:1: ruleRelationship returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_Include_2= ruleInclude | this_Extend_3= ruleExtend | this_Comment_4= ruleComment ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Generalization_1 = null;

        EObject this_Include_2 = null;

        EObject this_Extend_3 = null;

        EObject this_Comment_4 = null;



        	enterRule();

        try {
            // InternalUsecase.g:692:2: ( (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_Include_2= ruleInclude | this_Extend_3= ruleExtend | this_Comment_4= ruleComment ) )
            // InternalUsecase.g:693:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_Include_2= ruleInclude | this_Extend_3= ruleExtend | this_Comment_4= ruleComment )
            {
            // InternalUsecase.g:693:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_Include_2= ruleInclude | this_Extend_3= ruleExtend | this_Comment_4= ruleComment )
            int alt15=5;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalUsecase.g:694:3: this_Association_0= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_0=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsecase.g:703:3: this_Generalization_1= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getGeneralizationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_1=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUsecase.g:712:3: this_Include_2= ruleInclude
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getIncludeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Include_2=ruleInclude();

                    state._fsp--;


                    			current = this_Include_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUsecase.g:721:3: this_Extend_3= ruleExtend
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getExtendParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extend_3=ruleExtend();

                    state._fsp--;


                    			current = this_Extend_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUsecase.g:730:3: this_Comment_4= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getCommentParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_4=ruleComment();

                    state._fsp--;


                    			current = this_Comment_4;
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleAssociation"
    // InternalUsecase.g:742:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUsecase.g:742:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUsecase.g:743:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalUsecase.g:749:1: ruleAssociation returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= 'iac' ( ( ruleFQN ) ) (otherlv_3= '[' ( (lv_leftCardinality_4_0= ruleCardinality ) ) otherlv_5= '|' ( (lv_rightCardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )? ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_leftCardinality_4_0 = null;

        EObject lv_rightCardinality_6_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:755:2: ( ( ( ( ruleFQN ) ) otherlv_1= 'iac' ( ( ruleFQN ) ) (otherlv_3= '[' ( (lv_leftCardinality_4_0= ruleCardinality ) ) otherlv_5= '|' ( (lv_rightCardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )? ) )
            // InternalUsecase.g:756:2: ( ( ( ruleFQN ) ) otherlv_1= 'iac' ( ( ruleFQN ) ) (otherlv_3= '[' ( (lv_leftCardinality_4_0= ruleCardinality ) ) otherlv_5= '|' ( (lv_rightCardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )? )
            {
            // InternalUsecase.g:756:2: ( ( ( ruleFQN ) ) otherlv_1= 'iac' ( ( ruleFQN ) ) (otherlv_3= '[' ( (lv_leftCardinality_4_0= ruleCardinality ) ) otherlv_5= '|' ( (lv_rightCardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )? )
            // InternalUsecase.g:757:3: ( ( ruleFQN ) ) otherlv_1= 'iac' ( ( ruleFQN ) ) (otherlv_3= '[' ( (lv_leftCardinality_4_0= ruleCardinality ) ) otherlv_5= '|' ( (lv_rightCardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )?
            {
            // InternalUsecase.g:757:3: ( ( ruleFQN ) )
            // InternalUsecase.g:758:4: ( ruleFQN )
            {
            // InternalUsecase.g:758:4: ( ruleFQN )
            // InternalUsecase.g:759:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getActorActorCrossReference_0_0());
            				
            pushFollow(FOLLOW_23);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getIacKeyword_1());
            		
            // InternalUsecase.g:777:3: ( ( ruleFQN ) )
            // InternalUsecase.g:778:4: ( ruleFQN )
            {
            // InternalUsecase.g:778:4: ( ruleFQN )
            // InternalUsecase.g:779:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getUsecaseUseCaseCrossReference_2_0());
            				
            pushFollow(FOLLOW_13);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUsecase.g:793:3: (otherlv_3= '[' ( (lv_leftCardinality_4_0= ruleCardinality ) ) otherlv_5= '|' ( (lv_rightCardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUsecase.g:794:4: otherlv_3= '[' ( (lv_leftCardinality_4_0= ruleCardinality ) ) otherlv_5= '|' ( (lv_rightCardinality_6_0= ruleCardinality ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalUsecase.g:798:4: ( (lv_leftCardinality_4_0= ruleCardinality ) )
                    // InternalUsecase.g:799:5: (lv_leftCardinality_4_0= ruleCardinality )
                    {
                    // InternalUsecase.g:799:5: (lv_leftCardinality_4_0= ruleCardinality )
                    // InternalUsecase.g:800:6: lv_leftCardinality_4_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getAssociationAccess().getLeftCardinalityCardinalityParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_leftCardinality_4_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationRule());
                    						}
                    						set(
                    							current,
                    							"leftCardinality",
                    							lv_leftCardinality_4_0,
                    							"de.cooperateproject.modeling.textual.usecase.Usecase.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getVerticalLineKeyword_3_2());
                    			
                    // InternalUsecase.g:821:4: ( (lv_rightCardinality_6_0= ruleCardinality ) )
                    // InternalUsecase.g:822:5: (lv_rightCardinality_6_0= ruleCardinality )
                    {
                    // InternalUsecase.g:822:5: (lv_rightCardinality_6_0= ruleCardinality )
                    // InternalUsecase.g:823:6: lv_rightCardinality_6_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getAssociationAccess().getRightCardinalityCardinalityParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_rightCardinality_6_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationRule());
                    						}
                    						set(
                    							current,
                    							"rightCardinality",
                    							lv_rightCardinality_6_0,
                    							"de.cooperateproject.modeling.textual.usecase.Usecase.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_3_4());
                    			

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
    // InternalUsecase.g:849:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalUsecase.g:849:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalUsecase.g:850:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalUsecase.g:856:1: ruleGeneralization returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= 'isA' ( ( ruleFQN ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUsecase.g:862:2: ( ( ( ( ruleFQN ) ) otherlv_1= 'isA' ( ( ruleFQN ) ) ) )
            // InternalUsecase.g:863:2: ( ( ( ruleFQN ) ) otherlv_1= 'isA' ( ( ruleFQN ) ) )
            {
            // InternalUsecase.g:863:2: ( ( ( ruleFQN ) ) otherlv_1= 'isA' ( ( ruleFQN ) ) )
            // InternalUsecase.g:864:3: ( ( ruleFQN ) ) otherlv_1= 'isA' ( ( ruleFQN ) )
            {
            // InternalUsecase.g:864:3: ( ( ruleFQN ) )
            // InternalUsecase.g:865:4: ( ruleFQN )
            {
            // InternalUsecase.g:865:4: ( ruleFQN )
            // InternalUsecase.g:866:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getClientBehavioredClassifierCrossReference_0_0());
            				
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getIsAKeyword_1());
            		
            // InternalUsecase.g:884:3: ( ( ruleFQN ) )
            // InternalUsecase.g:885:4: ( ruleFQN )
            {
            // InternalUsecase.g:885:4: ( ruleFQN )
            // InternalUsecase.g:886:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getSupplierBehavioredClassifierCrossReference_2_0());
            				
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
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleInclude"
    // InternalUsecase.g:904:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalUsecase.g:904:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalUsecase.g:905:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalUsecase.g:911:1: ruleInclude returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= 'inc' ( ( ruleFQN ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUsecase.g:917:2: ( ( ( ( ruleFQN ) ) otherlv_1= 'inc' ( ( ruleFQN ) ) ) )
            // InternalUsecase.g:918:2: ( ( ( ruleFQN ) ) otherlv_1= 'inc' ( ( ruleFQN ) ) )
            {
            // InternalUsecase.g:918:2: ( ( ( ruleFQN ) ) otherlv_1= 'inc' ( ( ruleFQN ) ) )
            // InternalUsecase.g:919:3: ( ( ruleFQN ) ) otherlv_1= 'inc' ( ( ruleFQN ) )
            {
            // InternalUsecase.g:919:3: ( ( ruleFQN ) )
            // InternalUsecase.g:920:4: ( ruleFQN )
            {
            // InternalUsecase.g:920:4: ( ruleFQN )
            // InternalUsecase.g:921:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIncludeAccess().getClientUseCaseCrossReference_0_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getIncKeyword_1());
            		
            // InternalUsecase.g:939:3: ( ( ruleFQN ) )
            // InternalUsecase.g:940:4: ( ruleFQN )
            {
            // InternalUsecase.g:940:4: ( ruleFQN )
            // InternalUsecase.g:941:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIncludeAccess().getSupplierUseCaseCrossReference_2_0());
            				
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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleExtend"
    // InternalUsecase.g:959:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalUsecase.g:959:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalUsecase.g:960:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalUsecase.g:966:1: ruleExtend returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= 'ext' ( ( ruleFQN ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '|' ( (lv_condition_6_0= RULE_STRING ) ) )? otherlv_7= ']' ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_condition_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalUsecase.g:972:2: ( ( ( ( ruleFQN ) ) otherlv_1= 'ext' ( ( ruleFQN ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '|' ( (lv_condition_6_0= RULE_STRING ) ) )? otherlv_7= ']' ) )
            // InternalUsecase.g:973:2: ( ( ( ruleFQN ) ) otherlv_1= 'ext' ( ( ruleFQN ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '|' ( (lv_condition_6_0= RULE_STRING ) ) )? otherlv_7= ']' )
            {
            // InternalUsecase.g:973:2: ( ( ( ruleFQN ) ) otherlv_1= 'ext' ( ( ruleFQN ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '|' ( (lv_condition_6_0= RULE_STRING ) ) )? otherlv_7= ']' )
            // InternalUsecase.g:974:3: ( ( ruleFQN ) ) otherlv_1= 'ext' ( ( ruleFQN ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '|' ( (lv_condition_6_0= RULE_STRING ) ) )? otherlv_7= ']'
            {
            // InternalUsecase.g:974:3: ( ( ruleFQN ) )
            // InternalUsecase.g:975:4: ( ruleFQN )
            {
            // InternalUsecase.g:975:4: ( ruleFQN )
            // InternalUsecase.g:976:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getClientUseCaseCrossReference_0_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendAccess().getExtKeyword_1());
            		
            // InternalUsecase.g:994:3: ( ( ruleFQN ) )
            // InternalUsecase.g:995:4: ( ruleFQN )
            {
            // InternalUsecase.g:995:4: ( ruleFQN )
            // InternalUsecase.g:996:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getSupplierUseCaseCrossReference_2_0());
            				
            pushFollow(FOLLOW_29);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getExtendAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalUsecase.g:1014:3: ( (otherlv_4= RULE_ID ) )
            // InternalUsecase.g:1015:4: (otherlv_4= RULE_ID )
            {
            // InternalUsecase.g:1015:4: (otherlv_4= RULE_ID )
            // InternalUsecase.g:1016:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getExtensionPointExtensionPointCrossReference_4_0());
            				

            }


            }

            // InternalUsecase.g:1027:3: (otherlv_5= '|' ( (lv_condition_6_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUsecase.g:1028:4: otherlv_5= '|' ( (lv_condition_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getExtendAccess().getVerticalLineKeyword_5_0());
                    			
                    // InternalUsecase.g:1032:4: ( (lv_condition_6_0= RULE_STRING ) )
                    // InternalUsecase.g:1033:5: (lv_condition_6_0= RULE_STRING )
                    {
                    // InternalUsecase.g:1033:5: (lv_condition_6_0= RULE_STRING )
                    // InternalUsecase.g:1034:6: lv_condition_6_0= RULE_STRING
                    {
                    lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_condition_6_0, grammarAccess.getExtendAccess().getConditionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtendRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExtendAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalUsecase.g:1059:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalUsecase.g:1059:48: (iv_ruleComment= ruleComment EOF )
            // InternalUsecase.g:1060:2: iv_ruleComment= ruleComment EOF
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
    // InternalUsecase.g:1066:1: ruleComment returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= 'note' ( (lv_comment_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalUsecase.g:1072:2: ( ( ( ( ruleFQN ) ) otherlv_1= 'note' ( (lv_comment_2_0= RULE_STRING ) ) ) )
            // InternalUsecase.g:1073:2: ( ( ( ruleFQN ) ) otherlv_1= 'note' ( (lv_comment_2_0= RULE_STRING ) ) )
            {
            // InternalUsecase.g:1073:2: ( ( ( ruleFQN ) ) otherlv_1= 'note' ( (lv_comment_2_0= RULE_STRING ) ) )
            // InternalUsecase.g:1074:3: ( ( ruleFQN ) ) otherlv_1= 'note' ( (lv_comment_2_0= RULE_STRING ) )
            {
            // InternalUsecase.g:1074:3: ( ( ruleFQN ) )
            // InternalUsecase.g:1075:4: ( ruleFQN )
            {
            // InternalUsecase.g:1075:4: ( ruleFQN )
            // InternalUsecase.g:1076:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommentAccess().getCommentedElementCommentableCrossReference_0_0());
            				
            pushFollow(FOLLOW_31);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getNoteKeyword_1());
            		
            // InternalUsecase.g:1094:3: ( (lv_comment_2_0= RULE_STRING ) )
            // InternalUsecase.g:1095:4: (lv_comment_2_0= RULE_STRING )
            {
            // InternalUsecase.g:1095:4: (lv_comment_2_0= RULE_STRING )
            // InternalUsecase.g:1096:5: lv_comment_2_0= RULE_STRING
            {
            lv_comment_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_comment_2_0, grammarAccess.getCommentAccess().getCommentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_2_0,
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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleCardinality"
    // InternalUsecase.g:1116:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalUsecase.g:1116:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalUsecase.g:1117:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalUsecase.g:1123:1: ruleCardinality returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalUsecase.g:1129:2: ( ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) )
            // InternalUsecase.g:1130:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            {
            // InternalUsecase.g:1130:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            // InternalUsecase.g:1131:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            {
            // InternalUsecase.g:1131:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) )
            // InternalUsecase.g:1132:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            {
            // InternalUsecase.g:1132:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            // InternalUsecase.g:1133:5: lv_lowerBound_0_0= ruleCardinalityBound
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalUsecase.g:1150:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUsecase.g:1151:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalUsecase.g:1155:4: ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    // InternalUsecase.g:1156:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    {
                    // InternalUsecase.g:1156:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    // InternalUsecase.g:1157:6: lv_upperBound_2_0= ruleCardinalityBound
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
    // InternalUsecase.g:1179:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // InternalUsecase.g:1179:56: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // InternalUsecase.g:1180:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
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
    // InternalUsecase.g:1186:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUsecase.g:1192:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalUsecase.g:1193:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalUsecase.g:1193:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_INT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalUsecase.g:1194:3: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUsecase.g:1200:3: this_INT_1= RULE_INT
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
    // InternalUsecase.g:1211:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalUsecase.g:1211:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalUsecase.g:1212:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalUsecase.g:1218:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUsecase.g:1224:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUsecase.g:1225:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUsecase.g:1225:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUsecase.g:1226:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalUsecase.g:1233:3: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUsecase.g:1234:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_33); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalUsecase.g:1251:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
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
            // InternalUsecase.g:1257:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalUsecase.g:1258:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalUsecase.g:1258:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt21=7;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            case 36:
                {
                alt21=4;
                }
                break;
            case 37:
                {
                alt21=5;
                }
                break;
            case 38:
                {
                alt21=6;
                }
                break;
            case 39:
                {
                alt21=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalUsecase.g:1259:3: (enumLiteral_0= '+' )
                    {
                    // InternalUsecase.g:1259:3: (enumLiteral_0= '+' )
                    // InternalUsecase.g:1260:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:1267:3: (enumLiteral_1= 'public' )
                    {
                    // InternalUsecase.g:1267:3: (enumLiteral_1= 'public' )
                    // InternalUsecase.g:1268:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUsecase.g:1275:3: (enumLiteral_2= '-' )
                    {
                    // InternalUsecase.g:1275:3: (enumLiteral_2= '-' )
                    // InternalUsecase.g:1276:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUsecase.g:1283:3: (enumLiteral_3= 'private' )
                    {
                    // InternalUsecase.g:1283:3: (enumLiteral_3= 'private' )
                    // InternalUsecase.g:1284:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUsecase.g:1291:3: (enumLiteral_4= '#' )
                    {
                    // InternalUsecase.g:1291:3: (enumLiteral_4= '#' )
                    // InternalUsecase.g:1292:4: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalUsecase.g:1299:3: (enumLiteral_5= 'protected' )
                    {
                    // InternalUsecase.g:1299:3: (enumLiteral_5= 'protected' )
                    // InternalUsecase.g:1300:4: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalUsecase.g:1307:3: (enumLiteral_6= '~' )
                    {
                    // InternalUsecase.g:1307:3: (enumLiteral_6= '~' )
                    // InternalUsecase.g:1308:4: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_6());
                    			

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
    // InternalUsecase.g:1318:1: ruleActorType returns [Enumerator current=null] : ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) ;
    public final Enumerator ruleActorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUsecase.g:1324:2: ( ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) ) )
            // InternalUsecase.g:1325:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            {
            // InternalUsecase.g:1325:2: ( (enumLiteral_0= 'human' ) | (enumLiteral_1= 'machine' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            else if ( (LA22_0==41) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalUsecase.g:1326:3: (enumLiteral_0= 'human' )
                    {
                    // InternalUsecase.g:1326:3: (enumLiteral_0= 'human' )
                    // InternalUsecase.g:1327:4: enumLiteral_0= 'human'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUsecase.g:1334:3: (enumLiteral_1= 'machine' )
                    {
                    // InternalUsecase.g:1334:3: (enumLiteral_1= 'machine' )
                    // InternalUsecase.g:1335:4: enumLiteral_1= 'machine'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

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


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\5\1\30\1\5\5\uffff\1\30";
    static final String dfa_3s = "\1\5\1\40\1\5\5\uffff\1\40";
    static final String dfa_4s = "\3\uffff\1\3\1\2\1\1\1\5\1\4\1\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\5\1\uffff\1\4\1\3\1\7\1\6\2\uffff\1\2",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\5\1\uffff\1\4\1\3\1\7\1\6\2\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "693:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_Include_2= ruleInclude | this_Extend_3= ruleExtend | this_Comment_4= ruleComment )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000FE0008C022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000FE00604000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000002L});

}