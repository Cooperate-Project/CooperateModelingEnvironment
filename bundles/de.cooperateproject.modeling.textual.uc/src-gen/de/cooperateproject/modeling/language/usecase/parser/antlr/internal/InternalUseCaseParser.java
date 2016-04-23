package de.cooperateproject.modeling.language.usecase.parser.antlr.internal;

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
import de.cooperateproject.modeling.language.usecase.services.UseCaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use'", "';'", "'test'", "'test2'", "'.'", "'actor'", "'extends'", "'{'", "'}'", "'system'", "'usecase'", "'UC'", "'extensionpoint'", "'extension'", "'location'", "'condition'", "'include'", "'association'", "'rule'", "'..'", "'*'", "'defined'", "'final'", "'abstract'", "'leaf'", "'public'", "'private'", "'protected'", "'package'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUseCaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUseCaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUseCaseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUseCase.g"; }



     	private UseCaseGrammarAccess grammarAccess;

        public InternalUseCaseParser(TokenStream input, UseCaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Diagram";
       	}

       	@Override
       	protected UseCaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDiagram"
    // InternalUseCase.g:65:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalUseCase.g:65:48: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalUseCase.g:66:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalUseCase.g:72:1: ruleDiagram returns [EObject current=null] : ( ( (lv_umlModel_0_0= ruleUMLModelReference ) ) ( (lv_test_1_0= ruleTest ) ) ( (lv_test2_2_0= ruleTest2 ) ) ( (lv_actors_3_0= ruleActor ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_associations_5_0= ruleAssociation ) )* ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        EObject lv_umlModel_0_0 = null;

        EObject lv_test_1_0 = null;

        EObject lv_test2_2_0 = null;

        EObject lv_actors_3_0 = null;

        EObject lv_system_4_0 = null;

        EObject lv_associations_5_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:78:2: ( ( ( (lv_umlModel_0_0= ruleUMLModelReference ) ) ( (lv_test_1_0= ruleTest ) ) ( (lv_test2_2_0= ruleTest2 ) ) ( (lv_actors_3_0= ruleActor ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_associations_5_0= ruleAssociation ) )* ) )
            // InternalUseCase.g:79:2: ( ( (lv_umlModel_0_0= ruleUMLModelReference ) ) ( (lv_test_1_0= ruleTest ) ) ( (lv_test2_2_0= ruleTest2 ) ) ( (lv_actors_3_0= ruleActor ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_associations_5_0= ruleAssociation ) )* )
            {
            // InternalUseCase.g:79:2: ( ( (lv_umlModel_0_0= ruleUMLModelReference ) ) ( (lv_test_1_0= ruleTest ) ) ( (lv_test2_2_0= ruleTest2 ) ) ( (lv_actors_3_0= ruleActor ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_associations_5_0= ruleAssociation ) )* )
            // InternalUseCase.g:80:3: ( (lv_umlModel_0_0= ruleUMLModelReference ) ) ( (lv_test_1_0= ruleTest ) ) ( (lv_test2_2_0= ruleTest2 ) ) ( (lv_actors_3_0= ruleActor ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_associations_5_0= ruleAssociation ) )*
            {
            // InternalUseCase.g:80:3: ( (lv_umlModel_0_0= ruleUMLModelReference ) )
            // InternalUseCase.g:81:4: (lv_umlModel_0_0= ruleUMLModelReference )
            {
            // InternalUseCase.g:81:4: (lv_umlModel_0_0= ruleUMLModelReference )
            // InternalUseCase.g:82:5: lv_umlModel_0_0= ruleUMLModelReference
            {

            					newCompositeNode(grammarAccess.getDiagramAccess().getUmlModelUMLModelReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_umlModel_0_0=ruleUMLModelReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiagramRule());
            					}
            					set(
            						current,
            						"umlModel",
            						lv_umlModel_0_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.UMLModelReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:99:3: ( (lv_test_1_0= ruleTest ) )
            // InternalUseCase.g:100:4: (lv_test_1_0= ruleTest )
            {
            // InternalUseCase.g:100:4: (lv_test_1_0= ruleTest )
            // InternalUseCase.g:101:5: lv_test_1_0= ruleTest
            {

            					newCompositeNode(grammarAccess.getDiagramAccess().getTestTestParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_test_1_0=ruleTest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiagramRule());
            					}
            					set(
            						current,
            						"test",
            						lv_test_1_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.Test");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:118:3: ( (lv_test2_2_0= ruleTest2 ) )
            // InternalUseCase.g:119:4: (lv_test2_2_0= ruleTest2 )
            {
            // InternalUseCase.g:119:4: (lv_test2_2_0= ruleTest2 )
            // InternalUseCase.g:120:5: lv_test2_2_0= ruleTest2
            {

            					newCompositeNode(grammarAccess.getDiagramAccess().getTest2Test2ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_test2_2_0=ruleTest2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiagramRule());
            					}
            					set(
            						current,
            						"test2",
            						lv_test2_2_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.Test2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:137:3: ( (lv_actors_3_0= ruleActor ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalUseCase.g:138:4: (lv_actors_3_0= ruleActor )
            	    {
            	    // InternalUseCase.g:138:4: (lv_actors_3_0= ruleActor )
            	    // InternalUseCase.g:139:5: lv_actors_3_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getDiagramAccess().getActorsActorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_actors_3_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_3_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUseCase.g:156:3: ( (lv_system_4_0= ruleSystem ) )
            // InternalUseCase.g:157:4: (lv_system_4_0= ruleSystem )
            {
            // InternalUseCase.g:157:4: (lv_system_4_0= ruleSystem )
            // InternalUseCase.g:158:5: lv_system_4_0= ruleSystem
            {

            					newCompositeNode(grammarAccess.getDiagramAccess().getSystemSystemParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_system_4_0=ruleSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiagramRule());
            					}
            					set(
            						current,
            						"system",
            						lv_system_4_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.System");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:175:3: ( (lv_associations_5_0= ruleAssociation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ML_COMMENT && LA2_0<=RULE_SL_COMMENT)||LA2_0==28||(LA2_0>=33 && LA2_0<=39)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCase.g:176:4: (lv_associations_5_0= ruleAssociation )
            	    {
            	    // InternalUseCase.g:176:4: (lv_associations_5_0= ruleAssociation )
            	    // InternalUseCase.g:177:5: lv_associations_5_0= ruleAssociation
            	    {

            	    					newCompositeNode(grammarAccess.getDiagramAccess().getAssociationsAssociationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_associations_5_0=ruleAssociation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"associations",
            	    						lv_associations_5_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Association");
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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleUMLModelReference"
    // InternalUseCase.g:198:1: entryRuleUMLModelReference returns [EObject current=null] : iv_ruleUMLModelReference= ruleUMLModelReference EOF ;
    public final EObject entryRuleUMLModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUMLModelReference = null;


        try {
            // InternalUseCase.g:198:58: (iv_ruleUMLModelReference= ruleUMLModelReference EOF )
            // InternalUseCase.g:199:2: iv_ruleUMLModelReference= ruleUMLModelReference EOF
            {
             newCompositeNode(grammarAccess.getUMLModelReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUMLModelReference=ruleUMLModelReference();

            state._fsp--;

             current =iv_ruleUMLModelReference; 
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
    // $ANTLR end "entryRuleUMLModelReference"


    // $ANTLR start "ruleUMLModelReference"
    // InternalUseCase.g:205:1: ruleUMLModelReference returns [EObject current=null] : (otherlv_0= 'use' ( (lv_importURI_1_0= ruleImportURI ) ) otherlv_2= ';' ) ;
    public final EObject ruleUMLModelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:211:2: ( (otherlv_0= 'use' ( (lv_importURI_1_0= ruleImportURI ) ) otherlv_2= ';' ) )
            // InternalUseCase.g:212:2: (otherlv_0= 'use' ( (lv_importURI_1_0= ruleImportURI ) ) otherlv_2= ';' )
            {
            // InternalUseCase.g:212:2: (otherlv_0= 'use' ( (lv_importURI_1_0= ruleImportURI ) ) otherlv_2= ';' )
            // InternalUseCase.g:213:3: otherlv_0= 'use' ( (lv_importURI_1_0= ruleImportURI ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getUMLModelReferenceAccess().getUseKeyword_0());
            		
            // InternalUseCase.g:217:3: ( (lv_importURI_1_0= ruleImportURI ) )
            // InternalUseCase.g:218:4: (lv_importURI_1_0= ruleImportURI )
            {
            // InternalUseCase.g:218:4: (lv_importURI_1_0= ruleImportURI )
            // InternalUseCase.g:219:5: lv_importURI_1_0= ruleImportURI
            {

            					newCompositeNode(grammarAccess.getUMLModelReferenceAccess().getImportURIImportURIParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_importURI_1_0=ruleImportURI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUMLModelReferenceRule());
            					}
            					set(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.ImportURI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getUMLModelReferenceAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleUMLModelReference"


    // $ANTLR start "entryRuleImportURI"
    // InternalUseCase.g:244:1: entryRuleImportURI returns [String current=null] : iv_ruleImportURI= ruleImportURI EOF ;
    public final String entryRuleImportURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportURI = null;


        try {
            // InternalUseCase.g:244:49: (iv_ruleImportURI= ruleImportURI EOF )
            // InternalUseCase.g:245:2: iv_ruleImportURI= ruleImportURI EOF
            {
             newCompositeNode(grammarAccess.getImportURIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportURI=ruleImportURI();

            state._fsp--;

             current =iv_ruleImportURI.getText(); 
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
    // $ANTLR end "entryRuleImportURI"


    // $ANTLR start "ruleImportURI"
    // InternalUseCase.g:251:1: ruleImportURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleImportURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:257:2: (this_STRING_0= RULE_STRING )
            // InternalUseCase.g:258:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getImportURIAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleImportURI"


    // $ANTLR start "entryRuleTest"
    // InternalUseCase.g:268:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalUseCase.g:268:45: (iv_ruleTest= ruleTest EOF )
            // InternalUseCase.g:269:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalUseCase.g:275:1: ruleTest returns [EObject current=null] : (otherlv_0= 'test' ( ( ruleName ) ) otherlv_2= ';' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:281:2: ( (otherlv_0= 'test' ( ( ruleName ) ) otherlv_2= ';' ) )
            // InternalUseCase.g:282:2: (otherlv_0= 'test' ( ( ruleName ) ) otherlv_2= ';' )
            {
            // InternalUseCase.g:282:2: (otherlv_0= 'test' ( ( ruleName ) ) otherlv_2= ';' )
            // InternalUseCase.g:283:3: otherlv_0= 'test' ( ( ruleName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalUseCase.g:287:3: ( ( ruleName ) )
            // InternalUseCase.g:288:4: ( ruleName )
            {
            // InternalUseCase.g:288:4: ( ruleName )
            // InternalUseCase.g:289:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTestAccess().getActorActorCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleTest2"
    // InternalUseCase.g:311:1: entryRuleTest2 returns [EObject current=null] : iv_ruleTest2= ruleTest2 EOF ;
    public final EObject entryRuleTest2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest2 = null;


        try {
            // InternalUseCase.g:311:46: (iv_ruleTest2= ruleTest2 EOF )
            // InternalUseCase.g:312:2: iv_ruleTest2= ruleTest2 EOF
            {
             newCompositeNode(grammarAccess.getTest2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest2=ruleTest2();

            state._fsp--;

             current =iv_ruleTest2; 
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
    // $ANTLR end "entryRuleTest2"


    // $ANTLR start "ruleTest2"
    // InternalUseCase.g:318:1: ruleTest2 returns [EObject current=null] : (otherlv_0= 'test2' ( ( ruleFQN ) ) otherlv_2= ';' ) ;
    public final EObject ruleTest2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:324:2: ( (otherlv_0= 'test2' ( ( ruleFQN ) ) otherlv_2= ';' ) )
            // InternalUseCase.g:325:2: (otherlv_0= 'test2' ( ( ruleFQN ) ) otherlv_2= ';' )
            {
            // InternalUseCase.g:325:2: (otherlv_0= 'test2' ( ( ruleFQN ) ) otherlv_2= ';' )
            // InternalUseCase.g:326:3: otherlv_0= 'test2' ( ( ruleFQN ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTest2Access().getTest2Keyword_0());
            		
            // InternalUseCase.g:330:3: ( ( ruleFQN ) )
            // InternalUseCase.g:331:4: ( ruleFQN )
            {
            // InternalUseCase.g:331:4: ( ruleFQN )
            // InternalUseCase.g:332:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTest2Rule());
            					}
            				

            					newCompositeNode(grammarAccess.getTest2Access().getActorActorCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTest2Access().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleTest2"


    // $ANTLR start "entryRuleFQN"
    // InternalUseCase.g:354:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalUseCase.g:354:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalUseCase.g:355:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalUseCase.g:361:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:367:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUseCase.g:368:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUseCase.g:368:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUseCase.g:369:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalUseCase.g:376:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCase.g:377:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleActor"
    // InternalUseCase.g:394:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalUseCase.g:394:46: (iv_ruleActor= ruleActor EOF )
            // InternalUseCase.g:395:2: iv_ruleActor= ruleActor EOF
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
    // InternalUseCase.g:401:1: ruleActor returns [EObject current=null] : ( () ( (lv_comments_1_0= ruleComment ) )* ( (lv_visibility_2_0= ruleVisibility ) )? ( (lv_modifiers_3_0= ruleModifier ) )* otherlv_4= 'actor' ( (lv_name_5_0= ruleName ) ) (otherlv_6= 'extends' ( ( ruleName ) ) )? ( (otherlv_8= '{' otherlv_9= '}' ) | otherlv_10= ';' ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_comments_1_0 = null;

        Enumerator lv_visibility_2_0 = null;

        Enumerator lv_modifiers_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:407:2: ( ( () ( (lv_comments_1_0= ruleComment ) )* ( (lv_visibility_2_0= ruleVisibility ) )? ( (lv_modifiers_3_0= ruleModifier ) )* otherlv_4= 'actor' ( (lv_name_5_0= ruleName ) ) (otherlv_6= 'extends' ( ( ruleName ) ) )? ( (otherlv_8= '{' otherlv_9= '}' ) | otherlv_10= ';' ) ) )
            // InternalUseCase.g:408:2: ( () ( (lv_comments_1_0= ruleComment ) )* ( (lv_visibility_2_0= ruleVisibility ) )? ( (lv_modifiers_3_0= ruleModifier ) )* otherlv_4= 'actor' ( (lv_name_5_0= ruleName ) ) (otherlv_6= 'extends' ( ( ruleName ) ) )? ( (otherlv_8= '{' otherlv_9= '}' ) | otherlv_10= ';' ) )
            {
            // InternalUseCase.g:408:2: ( () ( (lv_comments_1_0= ruleComment ) )* ( (lv_visibility_2_0= ruleVisibility ) )? ( (lv_modifiers_3_0= ruleModifier ) )* otherlv_4= 'actor' ( (lv_name_5_0= ruleName ) ) (otherlv_6= 'extends' ( ( ruleName ) ) )? ( (otherlv_8= '{' otherlv_9= '}' ) | otherlv_10= ';' ) )
            // InternalUseCase.g:409:3: () ( (lv_comments_1_0= ruleComment ) )* ( (lv_visibility_2_0= ruleVisibility ) )? ( (lv_modifiers_3_0= ruleModifier ) )* otherlv_4= 'actor' ( (lv_name_5_0= ruleName ) ) (otherlv_6= 'extends' ( ( ruleName ) ) )? ( (otherlv_8= '{' otherlv_9= '}' ) | otherlv_10= ';' )
            {
            // InternalUseCase.g:409:3: ()
            // InternalUseCase.g:410:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActorAccess().getActorAction_0(),
            					current);
            			

            }

            // InternalUseCase.g:416:3: ( (lv_comments_1_0= ruleComment ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ML_COMMENT && LA4_0<=RULE_SL_COMMENT)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCase.g:417:4: (lv_comments_1_0= ruleComment )
            	    {
            	    // InternalUseCase.g:417:4: (lv_comments_1_0= ruleComment )
            	    // InternalUseCase.g:418:5: lv_comments_1_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getActorAccess().getCommentsCommentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_comments_1_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comments",
            	    						lv_comments_1_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalUseCase.g:435:3: ( (lv_visibility_2_0= ruleVisibility ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=36 && LA5_0<=39)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCase.g:436:4: (lv_visibility_2_0= ruleVisibility )
                    {
                    // InternalUseCase.g:436:4: (lv_visibility_2_0= ruleVisibility )
                    // InternalUseCase.g:437:5: lv_visibility_2_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getVisibilityVisibilityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_visibility_2_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActorRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_2_0,
                    						"de.cooperateproject.modeling.language.usecase.UseCase.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:454:3: ( (lv_modifiers_3_0= ruleModifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=33 && LA6_0<=35)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUseCase.g:455:4: (lv_modifiers_3_0= ruleModifier )
            	    {
            	    // InternalUseCase.g:455:4: (lv_modifiers_3_0= ruleModifier )
            	    // InternalUseCase.g:456:5: lv_modifiers_3_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getActorAccess().getModifiersModifierEnumRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_modifiers_3_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifiers",
            	    						lv_modifiers_3_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Modifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getActorAccess().getActorKeyword_4());
            		
            // InternalUseCase.g:477:3: ( (lv_name_5_0= ruleName ) )
            // InternalUseCase.g:478:4: (lv_name_5_0= ruleName )
            {
            // InternalUseCase.g:478:4: (lv_name_5_0= ruleName )
            // InternalUseCase.g:479:5: lv_name_5_0= ruleName
            {

            					newCompositeNode(grammarAccess.getActorAccess().getNameNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_5_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:496:3: (otherlv_6= 'extends' ( ( ruleName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:497:4: otherlv_6= 'extends' ( ( ruleName ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getActorAccess().getExtendsKeyword_6_0());
                    			
                    // InternalUseCase.g:501:4: ( ( ruleName ) )
                    // InternalUseCase.g:502:5: ( ruleName )
                    {
                    // InternalUseCase.g:502:5: ( ruleName )
                    // InternalUseCase.g:503:6: ruleName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActorAccess().getBaseActorsActorCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:518:3: ( (otherlv_8= '{' otherlv_9= '}' ) | otherlv_10= ';' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:519:4: (otherlv_8= '{' otherlv_9= '}' )
                    {
                    // InternalUseCase.g:519:4: (otherlv_8= '{' otherlv_9= '}' )
                    // InternalUseCase.g:520:5: otherlv_8= '{' otherlv_9= '}'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_16); 

                    					newLeafNode(otherlv_8, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_7_0_0());
                    				
                    otherlv_9=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_7_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:530:4: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getActorAccess().getSemicolonKeyword_7_1());
                    			

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
    // InternalUseCase.g:539:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalUseCase.g:539:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalUseCase.g:540:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalUseCase.g:546:1: ruleSystem returns [EObject current=null] : ( ( (lv_comments_0_0= ruleComment ) )* otherlv_1= 'system' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_usecases_4_0= ruleUseCase ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_comments_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_usecases_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:552:2: ( ( ( (lv_comments_0_0= ruleComment ) )* otherlv_1= 'system' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_usecases_4_0= ruleUseCase ) )* otherlv_5= '}' ) )
            // InternalUseCase.g:553:2: ( ( (lv_comments_0_0= ruleComment ) )* otherlv_1= 'system' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_usecases_4_0= ruleUseCase ) )* otherlv_5= '}' )
            {
            // InternalUseCase.g:553:2: ( ( (lv_comments_0_0= ruleComment ) )* otherlv_1= 'system' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_usecases_4_0= ruleUseCase ) )* otherlv_5= '}' )
            // InternalUseCase.g:554:3: ( (lv_comments_0_0= ruleComment ) )* otherlv_1= 'system' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_usecases_4_0= ruleUseCase ) )* otherlv_5= '}'
            {
            // InternalUseCase.g:554:3: ( (lv_comments_0_0= ruleComment ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ML_COMMENT && LA9_0<=RULE_SL_COMMENT)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCase.g:555:4: (lv_comments_0_0= ruleComment )
            	    {
            	    // InternalUseCase.g:555:4: (lv_comments_0_0= ruleComment )
            	    // InternalUseCase.g:556:5: lv_comments_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getCommentsCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_comments_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comments",
            	    						lv_comments_0_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getSystemKeyword_1());
            		
            // InternalUseCase.g:577:3: ( (lv_name_2_0= ruleName ) )
            // InternalUseCase.g:578:4: (lv_name_2_0= ruleName )
            {
            // InternalUseCase.g:578:4: (lv_name_2_0= ruleName )
            // InternalUseCase.g:579:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUseCase.g:600:3: ( (lv_usecases_4_0= ruleUseCase ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ML_COMMENT && LA10_0<=RULE_SL_COMMENT)||(LA10_0>=21 && LA10_0<=22)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUseCase.g:601:4: (lv_usecases_4_0= ruleUseCase )
            	    {
            	    // InternalUseCase.g:601:4: (lv_usecases_4_0= ruleUseCase )
            	    // InternalUseCase.g:602:5: lv_usecases_4_0= ruleUseCase
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getUsecasesUseCaseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_usecases_4_0=ruleUseCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"usecases",
            	    						lv_usecases_4_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.UseCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalUseCase.g:627:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUseCase.g:627:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCase.g:628:2: iv_ruleUseCase= ruleUseCase EOF
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
    // InternalUseCase.g:634:1: ruleUseCase returns [EObject current=null] : ( ( (lv_comments_0_0= ruleComment ) )* (otherlv_1= 'usecase' | otherlv_2= 'UC' ) ( (lv_name_3_0= ruleName ) ) (otherlv_4= 'extends' ( ( ruleName ) ) )? (otherlv_6= ';' | (otherlv_7= '{' ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )* otherlv_11= '}' ) ) ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_comments_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_extensionPoints_8_0 = null;

        EObject lv_extensions_9_0 = null;

        EObject lv_includes_10_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:640:2: ( ( ( (lv_comments_0_0= ruleComment ) )* (otherlv_1= 'usecase' | otherlv_2= 'UC' ) ( (lv_name_3_0= ruleName ) ) (otherlv_4= 'extends' ( ( ruleName ) ) )? (otherlv_6= ';' | (otherlv_7= '{' ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )* otherlv_11= '}' ) ) ) )
            // InternalUseCase.g:641:2: ( ( (lv_comments_0_0= ruleComment ) )* (otherlv_1= 'usecase' | otherlv_2= 'UC' ) ( (lv_name_3_0= ruleName ) ) (otherlv_4= 'extends' ( ( ruleName ) ) )? (otherlv_6= ';' | (otherlv_7= '{' ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )* otherlv_11= '}' ) ) )
            {
            // InternalUseCase.g:641:2: ( ( (lv_comments_0_0= ruleComment ) )* (otherlv_1= 'usecase' | otherlv_2= 'UC' ) ( (lv_name_3_0= ruleName ) ) (otherlv_4= 'extends' ( ( ruleName ) ) )? (otherlv_6= ';' | (otherlv_7= '{' ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )* otherlv_11= '}' ) ) )
            // InternalUseCase.g:642:3: ( (lv_comments_0_0= ruleComment ) )* (otherlv_1= 'usecase' | otherlv_2= 'UC' ) ( (lv_name_3_0= ruleName ) ) (otherlv_4= 'extends' ( ( ruleName ) ) )? (otherlv_6= ';' | (otherlv_7= '{' ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )* otherlv_11= '}' ) )
            {
            // InternalUseCase.g:642:3: ( (lv_comments_0_0= ruleComment ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ML_COMMENT && LA11_0<=RULE_SL_COMMENT)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUseCase.g:643:4: (lv_comments_0_0= ruleComment )
            	    {
            	    // InternalUseCase.g:643:4: (lv_comments_0_0= ruleComment )
            	    // InternalUseCase.g:644:5: lv_comments_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseAccess().getCommentsCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_comments_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comments",
            	    						lv_comments_0_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalUseCase.g:661:3: (otherlv_1= 'usecase' | otherlv_2= 'UC' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCase.g:662:4: otherlv_1= 'usecase'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getUseCaseAccess().getUsecaseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:667:4: otherlv_2= 'UC'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getUCKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:672:3: ( (lv_name_3_0= ruleName ) )
            // InternalUseCase.g:673:4: (lv_name_3_0= ruleName )
            {
            // InternalUseCase.g:673:4: (lv_name_3_0= ruleName )
            // InternalUseCase.g:674:5: lv_name_3_0= ruleName
            {

            					newCompositeNode(grammarAccess.getUseCaseAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_3_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:691:3: (otherlv_4= 'extends' ( ( ruleName ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCase.g:692:4: otherlv_4= 'extends' ( ( ruleName ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0());
                    			
                    // InternalUseCase.g:696:4: ( ( ruleName ) )
                    // InternalUseCase.g:697:5: ( ruleName )
                    {
                    // InternalUseCase.g:697:5: ( ruleName )
                    // InternalUseCase.g:698:6: ruleName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUseCaseAccess().getBaseUseCasesUseCaseCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:713:3: (otherlv_6= ';' | (otherlv_7= '{' ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )* otherlv_11= '}' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            else if ( (LA15_0==18) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalUseCase.g:714:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:719:4: (otherlv_7= '{' ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )* otherlv_11= '}' )
                    {
                    // InternalUseCase.g:719:4: (otherlv_7= '{' ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )* otherlv_11= '}' )
                    // InternalUseCase.g:720:5: otherlv_7= '{' ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )* otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_21); 

                    					newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalUseCase.g:724:5: ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )*
                    loop14:
                    do {
                        int alt14=4;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // InternalUseCase.g:725:6: ( (lv_extensionPoints_8_0= ruleExtensionPoint ) )
                    	    {
                    	    // InternalUseCase.g:725:6: ( (lv_extensionPoints_8_0= ruleExtensionPoint ) )
                    	    // InternalUseCase.g:726:7: (lv_extensionPoints_8_0= ruleExtensionPoint )
                    	    {
                    	    // InternalUseCase.g:726:7: (lv_extensionPoints_8_0= ruleExtensionPoint )
                    	    // InternalUseCase.g:727:8: lv_extensionPoints_8_0= ruleExtensionPoint
                    	    {

                    	    								newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionPointsExtensionPointParserRuleCall_4_1_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_21);
                    	    lv_extensionPoints_8_0=ruleExtensionPoint();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"extensionPoints",
                    	    									lv_extensionPoints_8_0,
                    	    									"de.cooperateproject.modeling.language.usecase.UseCase.ExtensionPoint");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUseCase.g:745:6: ( (lv_extensions_9_0= ruleExtension ) )
                    	    {
                    	    // InternalUseCase.g:745:6: ( (lv_extensions_9_0= ruleExtension ) )
                    	    // InternalUseCase.g:746:7: (lv_extensions_9_0= ruleExtension )
                    	    {
                    	    // InternalUseCase.g:746:7: (lv_extensions_9_0= ruleExtension )
                    	    // InternalUseCase.g:747:8: lv_extensions_9_0= ruleExtension
                    	    {

                    	    								newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionsExtensionParserRuleCall_4_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_21);
                    	    lv_extensions_9_0=ruleExtension();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"extensions",
                    	    									lv_extensions_9_0,
                    	    									"de.cooperateproject.modeling.language.usecase.UseCase.Extension");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalUseCase.g:765:6: ( (lv_includes_10_0= ruleInclude ) )
                    	    {
                    	    // InternalUseCase.g:765:6: ( (lv_includes_10_0= ruleInclude ) )
                    	    // InternalUseCase.g:766:7: (lv_includes_10_0= ruleInclude )
                    	    {
                    	    // InternalUseCase.g:766:7: (lv_includes_10_0= ruleInclude )
                    	    // InternalUseCase.g:767:8: lv_includes_10_0= ruleInclude
                    	    {

                    	    								newCompositeNode(grammarAccess.getUseCaseAccess().getIncludesIncludeParserRuleCall_4_1_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_21);
                    	    lv_includes_10_0=ruleInclude();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"includes",
                    	    									lv_includes_10_0,
                    	    									"de.cooperateproject.modeling.language.usecase.UseCase.Include");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

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
    // InternalUseCase.g:795:1: entryRuleExtensionPoint returns [EObject current=null] : iv_ruleExtensionPoint= ruleExtensionPoint EOF ;
    public final EObject entryRuleExtensionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionPoint = null;


        try {
            // InternalUseCase.g:795:55: (iv_ruleExtensionPoint= ruleExtensionPoint EOF )
            // InternalUseCase.g:796:2: iv_ruleExtensionPoint= ruleExtensionPoint EOF
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
    // InternalUseCase.g:802:1: ruleExtensionPoint returns [EObject current=null] : ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_modifiers_2_0= ruleModifier ) )* otherlv_3= 'extensionpoint' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' ) ;
    public final EObject ruleExtensionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_comments_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        Enumerator lv_modifiers_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:808:2: ( ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_modifiers_2_0= ruleModifier ) )* otherlv_3= 'extensionpoint' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' ) )
            // InternalUseCase.g:809:2: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_modifiers_2_0= ruleModifier ) )* otherlv_3= 'extensionpoint' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' )
            {
            // InternalUseCase.g:809:2: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_modifiers_2_0= ruleModifier ) )* otherlv_3= 'extensionpoint' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' )
            // InternalUseCase.g:810:3: ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_modifiers_2_0= ruleModifier ) )* otherlv_3= 'extensionpoint' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';'
            {
            // InternalUseCase.g:810:3: ( (lv_comments_0_0= ruleComment ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ML_COMMENT && LA16_0<=RULE_SL_COMMENT)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUseCase.g:811:4: (lv_comments_0_0= ruleComment )
            	    {
            	    // InternalUseCase.g:811:4: (lv_comments_0_0= ruleComment )
            	    // InternalUseCase.g:812:5: lv_comments_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionPointAccess().getCommentsCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_comments_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtensionPointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comments",
            	    						lv_comments_0_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalUseCase.g:829:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=36 && LA17_0<=39)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCase.g:830:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalUseCase.g:830:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalUseCase.g:831:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getExtensionPointAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_visibility_1_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExtensionPointRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"de.cooperateproject.modeling.language.usecase.UseCase.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:848:3: ( (lv_modifiers_2_0= ruleModifier ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=33 && LA18_0<=35)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUseCase.g:849:4: (lv_modifiers_2_0= ruleModifier )
            	    {
            	    // InternalUseCase.g:849:4: (lv_modifiers_2_0= ruleModifier )
            	    // InternalUseCase.g:850:5: lv_modifiers_2_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionPointAccess().getModifiersModifierEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_modifiers_2_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtensionPointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifiers",
            	    						lv_modifiers_2_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Modifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getExtensionPointAccess().getExtensionpointKeyword_3());
            		
            // InternalUseCase.g:871:3: ( (lv_name_4_0= ruleName ) )
            // InternalUseCase.g:872:4: (lv_name_4_0= ruleName )
            {
            // InternalUseCase.g:872:4: (lv_name_4_0= ruleName )
            // InternalUseCase.g:873:5: lv_name_4_0= ruleName
            {

            					newCompositeNode(grammarAccess.getExtensionPointAccess().getNameNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_4_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtensionPointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExtensionPointAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleExtension"
    // InternalUseCase.g:898:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalUseCase.g:898:50: (iv_ruleExtension= ruleExtension EOF )
            // InternalUseCase.g:899:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
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
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // InternalUseCase.g:905:1: ruleExtension returns [EObject current=null] : ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'extension' ( (lv_name_3_0= ruleName ) )? otherlv_4= '{' otherlv_5= 'location' ( ( ruleName ) ) (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConstraint ) ) otherlv_9= ';' )? otherlv_10= '}' ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_comments_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_condition_8_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:911:2: ( ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'extension' ( (lv_name_3_0= ruleName ) )? otherlv_4= '{' otherlv_5= 'location' ( ( ruleName ) ) (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConstraint ) ) otherlv_9= ';' )? otherlv_10= '}' ) )
            // InternalUseCase.g:912:2: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'extension' ( (lv_name_3_0= ruleName ) )? otherlv_4= '{' otherlv_5= 'location' ( ( ruleName ) ) (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConstraint ) ) otherlv_9= ';' )? otherlv_10= '}' )
            {
            // InternalUseCase.g:912:2: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'extension' ( (lv_name_3_0= ruleName ) )? otherlv_4= '{' otherlv_5= 'location' ( ( ruleName ) ) (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConstraint ) ) otherlv_9= ';' )? otherlv_10= '}' )
            // InternalUseCase.g:913:3: ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'extension' ( (lv_name_3_0= ruleName ) )? otherlv_4= '{' otherlv_5= 'location' ( ( ruleName ) ) (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConstraint ) ) otherlv_9= ';' )? otherlv_10= '}'
            {
            // InternalUseCase.g:913:3: ( (lv_comments_0_0= ruleComment ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ML_COMMENT && LA19_0<=RULE_SL_COMMENT)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUseCase.g:914:4: (lv_comments_0_0= ruleComment )
            	    {
            	    // InternalUseCase.g:914:4: (lv_comments_0_0= ruleComment )
            	    // InternalUseCase.g:915:5: lv_comments_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionAccess().getCommentsCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_comments_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtensionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comments",
            	    						lv_comments_0_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalUseCase.g:932:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=36 && LA20_0<=39)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:933:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalUseCase.g:933:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalUseCase.g:934:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getExtensionAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_visibility_1_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExtensionRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"de.cooperateproject.modeling.language.usecase.UseCase.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getExtensionKeyword_2());
            		
            // InternalUseCase.g:955:3: ( (lv_name_3_0= ruleName ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:956:4: (lv_name_3_0= ruleName )
                    {
                    // InternalUseCase.g:956:4: (lv_name_3_0= ruleName )
                    // InternalUseCase.g:957:5: lv_name_3_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getExtensionAccess().getNameNameParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_name_3_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExtensionRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_3_0,
                    						"de.cooperateproject.modeling.language.usecase.UseCase.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getExtensionAccess().getLocationKeyword_5());
            		
            // InternalUseCase.g:982:3: ( ( ruleName ) )
            // InternalUseCase.g:983:4: ( ruleName )
            {
            // InternalUseCase.g:983:4: ( ruleName )
            // InternalUseCase.g:984:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtensionAccess().getLocationExtensionPointCrossReference_6_0());
            				
            pushFollow(FOLLOW_28);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:998:3: (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConstraint ) ) otherlv_9= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:999:4: otherlv_7= 'condition' ( (lv_condition_8_0= ruleConstraint ) ) otherlv_9= ';'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getExtensionAccess().getConditionKeyword_7_0());
                    			
                    // InternalUseCase.g:1003:4: ( (lv_condition_8_0= ruleConstraint ) )
                    // InternalUseCase.g:1004:5: (lv_condition_8_0= ruleConstraint )
                    {
                    // InternalUseCase.g:1004:5: (lv_condition_8_0= ruleConstraint )
                    // InternalUseCase.g:1005:6: lv_condition_8_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getExtensionAccess().getConditionConstraintParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_condition_8_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_8_0,
                    							"de.cooperateproject.modeling.language.usecase.UseCase.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getSemicolonKeyword_7_2());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleInclude"
    // InternalUseCase.g:1035:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalUseCase.g:1035:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalUseCase.g:1036:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalUseCase.g:1042:1: ruleInclude returns [EObject current=null] : ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'include' ( (lv_name_3_0= ruleName ) )? ( ( ruleName ) ) otherlv_5= ';' ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_comments_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1048:2: ( ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'include' ( (lv_name_3_0= ruleName ) )? ( ( ruleName ) ) otherlv_5= ';' ) )
            // InternalUseCase.g:1049:2: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'include' ( (lv_name_3_0= ruleName ) )? ( ( ruleName ) ) otherlv_5= ';' )
            {
            // InternalUseCase.g:1049:2: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'include' ( (lv_name_3_0= ruleName ) )? ( ( ruleName ) ) otherlv_5= ';' )
            // InternalUseCase.g:1050:3: ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'include' ( (lv_name_3_0= ruleName ) )? ( ( ruleName ) ) otherlv_5= ';'
            {
            // InternalUseCase.g:1050:3: ( (lv_comments_0_0= ruleComment ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ML_COMMENT && LA23_0<=RULE_SL_COMMENT)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUseCase.g:1051:4: (lv_comments_0_0= ruleComment )
            	    {
            	    // InternalUseCase.g:1051:4: (lv_comments_0_0= ruleComment )
            	    // InternalUseCase.g:1052:5: lv_comments_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getIncludeAccess().getCommentsCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_comments_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIncludeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comments",
            	    						lv_comments_0_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalUseCase.g:1069:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=36 && LA24_0<=39)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:1070:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalUseCase.g:1070:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalUseCase.g:1071:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getIncludeAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_visibility_1_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIncludeRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"de.cooperateproject.modeling.language.usecase.UseCase.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getIncludeKeyword_2());
            		
            // InternalUseCase.g:1092:3: ( (lv_name_3_0= ruleName ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>=RULE_STRING && LA25_1<=RULE_ID)) ) {
                    alt25=1;
                }
            }
            else if ( (LA25_0==RULE_STRING) ) {
                int LA25_2 = input.LA(2);

                if ( ((LA25_2>=RULE_STRING && LA25_2<=RULE_ID)) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:1093:4: (lv_name_3_0= ruleName )
                    {
                    // InternalUseCase.g:1093:4: (lv_name_3_0= ruleName )
                    // InternalUseCase.g:1094:5: lv_name_3_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getIncludeAccess().getNameNameParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_name_3_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIncludeRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_3_0,
                    						"de.cooperateproject.modeling.language.usecase.UseCase.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1111:3: ( ( ruleName ) )
            // InternalUseCase.g:1112:4: ( ruleName )
            {
            // InternalUseCase.g:1112:4: ( ruleName )
            // InternalUseCase.g:1113:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIncludeAccess().getAdditionUseCaseCrossReference_4_0());
            				
            pushFollow(FOLLOW_8);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleConstraint"
    // InternalUseCase.g:1135:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalUseCase.g:1135:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalUseCase.g:1136:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalUseCase.g:1142:1: ruleConstraint returns [EObject current=null] : ( ( (lv_language_0_0= ruleExpressionType ) ) ( (lv_expression_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_expression_1_0=null;
        AntlrDatatypeRuleToken lv_language_0_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1148:2: ( ( ( (lv_language_0_0= ruleExpressionType ) ) ( (lv_expression_1_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:1149:2: ( ( (lv_language_0_0= ruleExpressionType ) ) ( (lv_expression_1_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:1149:2: ( ( (lv_language_0_0= ruleExpressionType ) ) ( (lv_expression_1_0= RULE_STRING ) ) )
            // InternalUseCase.g:1150:3: ( (lv_language_0_0= ruleExpressionType ) ) ( (lv_expression_1_0= RULE_STRING ) )
            {
            // InternalUseCase.g:1150:3: ( (lv_language_0_0= ruleExpressionType ) )
            // InternalUseCase.g:1151:4: (lv_language_0_0= ruleExpressionType )
            {
            // InternalUseCase.g:1151:4: (lv_language_0_0= ruleExpressionType )
            // InternalUseCase.g:1152:5: lv_language_0_0= ruleExpressionType
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getLanguageExpressionTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_language_0_0=ruleExpressionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"language",
            						lv_language_0_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.ExpressionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:1169:3: ( (lv_expression_1_0= RULE_STRING ) )
            // InternalUseCase.g:1170:4: (lv_expression_1_0= RULE_STRING )
            {
            // InternalUseCase.g:1170:4: (lv_expression_1_0= RULE_STRING )
            // InternalUseCase.g:1171:5: lv_expression_1_0= RULE_STRING
            {
            lv_expression_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_expression_1_0, grammarAccess.getConstraintAccess().getExpressionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_1_0,
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleAssociation"
    // InternalUseCase.g:1191:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUseCase.g:1191:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUseCase.g:1192:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalUseCase.g:1198:1: ruleAssociation returns [EObject current=null] : ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_modifiers_2_0= ruleModifier ) )* otherlv_3= 'association' ( (lv_name_4_0= ruleName ) )? (otherlv_5= 'extends' ( ( ruleName ) ) )? otherlv_7= '{' ( (lv_actorMultiplicity_8_0= ruleMultiplicity ) )? ( ( ruleName ) ) ( (lv_usecaseMultiplicity_10_0= ruleMultiplicity ) )? ( ( ruleName ) ) (otherlv_12= 'rule' ( (lv_ownedRules_13_0= ruleConstraint ) ) otherlv_14= ';' )* otherlv_15= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_comments_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        Enumerator lv_modifiers_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_actorMultiplicity_8_0 = null;

        EObject lv_usecaseMultiplicity_10_0 = null;

        EObject lv_ownedRules_13_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1204:2: ( ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_modifiers_2_0= ruleModifier ) )* otherlv_3= 'association' ( (lv_name_4_0= ruleName ) )? (otherlv_5= 'extends' ( ( ruleName ) ) )? otherlv_7= '{' ( (lv_actorMultiplicity_8_0= ruleMultiplicity ) )? ( ( ruleName ) ) ( (lv_usecaseMultiplicity_10_0= ruleMultiplicity ) )? ( ( ruleName ) ) (otherlv_12= 'rule' ( (lv_ownedRules_13_0= ruleConstraint ) ) otherlv_14= ';' )* otherlv_15= '}' ) )
            // InternalUseCase.g:1205:2: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_modifiers_2_0= ruleModifier ) )* otherlv_3= 'association' ( (lv_name_4_0= ruleName ) )? (otherlv_5= 'extends' ( ( ruleName ) ) )? otherlv_7= '{' ( (lv_actorMultiplicity_8_0= ruleMultiplicity ) )? ( ( ruleName ) ) ( (lv_usecaseMultiplicity_10_0= ruleMultiplicity ) )? ( ( ruleName ) ) (otherlv_12= 'rule' ( (lv_ownedRules_13_0= ruleConstraint ) ) otherlv_14= ';' )* otherlv_15= '}' )
            {
            // InternalUseCase.g:1205:2: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_modifiers_2_0= ruleModifier ) )* otherlv_3= 'association' ( (lv_name_4_0= ruleName ) )? (otherlv_5= 'extends' ( ( ruleName ) ) )? otherlv_7= '{' ( (lv_actorMultiplicity_8_0= ruleMultiplicity ) )? ( ( ruleName ) ) ( (lv_usecaseMultiplicity_10_0= ruleMultiplicity ) )? ( ( ruleName ) ) (otherlv_12= 'rule' ( (lv_ownedRules_13_0= ruleConstraint ) ) otherlv_14= ';' )* otherlv_15= '}' )
            // InternalUseCase.g:1206:3: ( (lv_comments_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_modifiers_2_0= ruleModifier ) )* otherlv_3= 'association' ( (lv_name_4_0= ruleName ) )? (otherlv_5= 'extends' ( ( ruleName ) ) )? otherlv_7= '{' ( (lv_actorMultiplicity_8_0= ruleMultiplicity ) )? ( ( ruleName ) ) ( (lv_usecaseMultiplicity_10_0= ruleMultiplicity ) )? ( ( ruleName ) ) (otherlv_12= 'rule' ( (lv_ownedRules_13_0= ruleConstraint ) ) otherlv_14= ';' )* otherlv_15= '}'
            {
            // InternalUseCase.g:1206:3: ( (lv_comments_0_0= ruleComment ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ML_COMMENT && LA26_0<=RULE_SL_COMMENT)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUseCase.g:1207:4: (lv_comments_0_0= ruleComment )
            	    {
            	    // InternalUseCase.g:1207:4: (lv_comments_0_0= ruleComment )
            	    // InternalUseCase.g:1208:5: lv_comments_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationAccess().getCommentsCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_comments_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comments",
            	    						lv_comments_0_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalUseCase.g:1225:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=36 && LA27_0<=39)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUseCase.g:1226:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalUseCase.g:1226:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalUseCase.g:1227:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_32);
                    lv_visibility_1_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"de.cooperateproject.modeling.language.usecase.UseCase.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1244:3: ( (lv_modifiers_2_0= ruleModifier ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=33 && LA28_0<=35)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUseCase.g:1245:4: (lv_modifiers_2_0= ruleModifier )
            	    {
            	    // InternalUseCase.g:1245:4: (lv_modifiers_2_0= ruleModifier )
            	    // InternalUseCase.g:1246:5: lv_modifiers_2_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationAccess().getModifiersModifierEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_modifiers_2_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifiers",
            	    						lv_modifiers_2_0,
            	    						"de.cooperateproject.modeling.language.usecase.UseCase.Modifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getAssociationKeyword_3());
            		
            // InternalUseCase.g:1267:3: ( (lv_name_4_0= ruleName ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUseCase.g:1268:4: (lv_name_4_0= ruleName )
                    {
                    // InternalUseCase.g:1268:4: (lv_name_4_0= ruleName )
                    // InternalUseCase.g:1269:5: lv_name_4_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getNameNameParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_name_4_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_4_0,
                    						"de.cooperateproject.modeling.language.usecase.UseCase.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1286:3: (otherlv_5= 'extends' ( ( ruleName ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUseCase.g:1287:4: otherlv_5= 'extends' ( ( ruleName ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getExtendsKeyword_5_0());
                    			
                    // InternalUseCase.g:1291:4: ( ( ruleName ) )
                    // InternalUseCase.g:1292:5: ( ruleName )
                    {
                    // InternalUseCase.g:1292:5: ( ruleName )
                    // InternalUseCase.g:1293:6: ruleName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssociationAccess().getBaseAssociationsAssociationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_35); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalUseCase.g:1312:3: ( (lv_actorMultiplicity_8_0= ruleMultiplicity ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT||LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUseCase.g:1313:4: (lv_actorMultiplicity_8_0= ruleMultiplicity )
                    {
                    // InternalUseCase.g:1313:4: (lv_actorMultiplicity_8_0= ruleMultiplicity )
                    // InternalUseCase.g:1314:5: lv_actorMultiplicity_8_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getActorMultiplicityMultiplicityParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_actorMultiplicity_8_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationRule());
                    					}
                    					set(
                    						current,
                    						"actorMultiplicity",
                    						lv_actorMultiplicity_8_0,
                    						"de.cooperateproject.modeling.language.usecase.UseCase.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1331:3: ( ( ruleName ) )
            // InternalUseCase.g:1332:4: ( ruleName )
            {
            // InternalUseCase.g:1332:4: ( ruleName )
            // InternalUseCase.g:1333:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getActorActorCrossReference_8_0());
            				
            pushFollow(FOLLOW_35);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:1347:3: ( (lv_usecaseMultiplicity_10_0= ruleMultiplicity ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT||LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUseCase.g:1348:4: (lv_usecaseMultiplicity_10_0= ruleMultiplicity )
                    {
                    // InternalUseCase.g:1348:4: (lv_usecaseMultiplicity_10_0= ruleMultiplicity )
                    // InternalUseCase.g:1349:5: lv_usecaseMultiplicity_10_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getUsecaseMultiplicityMultiplicityParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_usecaseMultiplicity_10_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationRule());
                    					}
                    					set(
                    						current,
                    						"usecaseMultiplicity",
                    						lv_usecaseMultiplicity_10_0,
                    						"de.cooperateproject.modeling.language.usecase.UseCase.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1366:3: ( ( ruleName ) )
            // InternalUseCase.g:1367:4: ( ruleName )
            {
            // InternalUseCase.g:1367:4: ( ruleName )
            // InternalUseCase.g:1368:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getUsecaseUseCaseCrossReference_10_0());
            				
            pushFollow(FOLLOW_36);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:1382:3: (otherlv_12= 'rule' ( (lv_ownedRules_13_0= ruleConstraint ) ) otherlv_14= ';' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==29) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUseCase.g:1383:4: otherlv_12= 'rule' ( (lv_ownedRules_13_0= ruleConstraint ) ) otherlv_14= ';'
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_7); 

            	    				newLeafNode(otherlv_12, grammarAccess.getAssociationAccess().getRuleKeyword_11_0());
            	    			
            	    // InternalUseCase.g:1387:4: ( (lv_ownedRules_13_0= ruleConstraint ) )
            	    // InternalUseCase.g:1388:5: (lv_ownedRules_13_0= ruleConstraint )
            	    {
            	    // InternalUseCase.g:1388:5: (lv_ownedRules_13_0= ruleConstraint )
            	    // InternalUseCase.g:1389:6: lv_ownedRules_13_0= ruleConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationAccess().getOwnedRulesConstraintParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_ownedRules_13_0=ruleConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRules",
            	    							lv_ownedRules_13_0,
            	    							"de.cooperateproject.modeling.language.usecase.UseCase.Constraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_14=(Token)match(input,12,FOLLOW_36); 

            	    				newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getSemicolonKeyword_11_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleMultiplicity"
    // InternalUseCase.g:1419:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalUseCase.g:1419:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalUseCase.g:1420:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
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
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalUseCase.g:1426:1: ruleMultiplicity returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleMultiplicityElement ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleMultiplicityElement ) ) )? ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1432:2: ( ( ( (lv_lowerBound_0_0= ruleMultiplicityElement ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleMultiplicityElement ) ) )? ) )
            // InternalUseCase.g:1433:2: ( ( (lv_lowerBound_0_0= ruleMultiplicityElement ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleMultiplicityElement ) ) )? )
            {
            // InternalUseCase.g:1433:2: ( ( (lv_lowerBound_0_0= ruleMultiplicityElement ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleMultiplicityElement ) ) )? )
            // InternalUseCase.g:1434:3: ( (lv_lowerBound_0_0= ruleMultiplicityElement ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleMultiplicityElement ) ) )?
            {
            // InternalUseCase.g:1434:3: ( (lv_lowerBound_0_0= ruleMultiplicityElement ) )
            // InternalUseCase.g:1435:4: (lv_lowerBound_0_0= ruleMultiplicityElement )
            {
            // InternalUseCase.g:1435:4: (lv_lowerBound_0_0= ruleMultiplicityElement )
            // InternalUseCase.g:1436:5: lv_lowerBound_0_0= ruleMultiplicityElement
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerBoundMultiplicityElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_lowerBound_0_0=ruleMultiplicityElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicityRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_0_0,
            						"de.cooperateproject.modeling.language.usecase.UseCase.MultiplicityElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:1453:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleMultiplicityElement ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUseCase.g:1454:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleMultiplicityElement ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalUseCase.g:1458:4: ( (lv_upperBound_2_0= ruleMultiplicityElement ) )
                    // InternalUseCase.g:1459:5: (lv_upperBound_2_0= ruleMultiplicityElement )
                    {
                    // InternalUseCase.g:1459:5: (lv_upperBound_2_0= ruleMultiplicityElement )
                    // InternalUseCase.g:1460:6: lv_upperBound_2_0= ruleMultiplicityElement
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperBoundMultiplicityElementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_upperBound_2_0=ruleMultiplicityElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiplicityRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_2_0,
                    							"de.cooperateproject.modeling.language.usecase.UseCase.MultiplicityElement");
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
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleMultiplicityElement"
    // InternalUseCase.g:1482:1: entryRuleMultiplicityElement returns [String current=null] : iv_ruleMultiplicityElement= ruleMultiplicityElement EOF ;
    public final String entryRuleMultiplicityElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicityElement = null;


        try {
            // InternalUseCase.g:1482:59: (iv_ruleMultiplicityElement= ruleMultiplicityElement EOF )
            // InternalUseCase.g:1483:2: iv_ruleMultiplicityElement= ruleMultiplicityElement EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityElement=ruleMultiplicityElement();

            state._fsp--;

             current =iv_ruleMultiplicityElement.getText(); 
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
    // $ANTLR end "entryRuleMultiplicityElement"


    // $ANTLR start "ruleMultiplicityElement"
    // InternalUseCase.g:1489:1: ruleMultiplicityElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicityElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCase.g:1495:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalUseCase.g:1496:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalUseCase.g:1496:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT) ) {
                alt35=1;
            }
            else if ( (LA35_0==31) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalUseCase.g:1497:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getMultiplicityElementAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1505:3: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityElementAccess().getAsteriskKeyword_1());
                    		

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
    // $ANTLR end "ruleMultiplicityElement"


    // $ANTLR start "entryRuleExpressionType"
    // InternalUseCase.g:1514:1: entryRuleExpressionType returns [String current=null] : iv_ruleExpressionType= ruleExpressionType EOF ;
    public final String entryRuleExpressionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionType = null;


        try {
            // InternalUseCase.g:1514:54: (iv_ruleExpressionType= ruleExpressionType EOF )
            // InternalUseCase.g:1515:2: iv_ruleExpressionType= ruleExpressionType EOF
            {
             newCompositeNode(grammarAccess.getExpressionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionType=ruleExpressionType();

            state._fsp--;

             current =iv_ruleExpressionType.getText(); 
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
    // $ANTLR end "entryRuleExpressionType"


    // $ANTLR start "ruleExpressionType"
    // InternalUseCase.g:1521:1: ruleExpressionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleExpressionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:1527:2: (this_STRING_0= RULE_STRING )
            // InternalUseCase.g:1528:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getExpressionTypeAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleExpressionType"


    // $ANTLR start "entryRuleAnnotation"
    // InternalUseCase.g:1538:1: entryRuleAnnotation returns [String current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final String entryRuleAnnotation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotation = null;


        try {
            // InternalUseCase.g:1538:50: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalUseCase.g:1539:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation.getText(); 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalUseCase.g:1545:1: ruleAnnotation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_AnnotationDefined_0= ruleAnnotationDefined ;
    public final AntlrDatatypeRuleToken ruleAnnotation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AnnotationDefined_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1551:2: (this_AnnotationDefined_0= ruleAnnotationDefined )
            // InternalUseCase.g:1552:2: this_AnnotationDefined_0= ruleAnnotationDefined
            {

            		newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationDefinedParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AnnotationDefined_0=ruleAnnotationDefined();

            state._fsp--;


            		current.merge(this_AnnotationDefined_0);
            	

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnnotationDefined"
    // InternalUseCase.g:1565:1: entryRuleAnnotationDefined returns [String current=null] : iv_ruleAnnotationDefined= ruleAnnotationDefined EOF ;
    public final String entryRuleAnnotationDefined() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationDefined = null;


        try {
            // InternalUseCase.g:1565:57: (iv_ruleAnnotationDefined= ruleAnnotationDefined EOF )
            // InternalUseCase.g:1566:2: iv_ruleAnnotationDefined= ruleAnnotationDefined EOF
            {
             newCompositeNode(grammarAccess.getAnnotationDefinedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationDefined=ruleAnnotationDefined();

            state._fsp--;

             current =iv_ruleAnnotationDefined.getText(); 
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
    // $ANTLR end "entryRuleAnnotationDefined"


    // $ANTLR start "ruleAnnotationDefined"
    // InternalUseCase.g:1572:1: ruleAnnotationDefined returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'defined' ;
    public final AntlrDatatypeRuleToken ruleAnnotationDefined() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUseCase.g:1578:2: (kw= 'defined' )
            // InternalUseCase.g:1579:2: kw= 'defined'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAnnotationDefinedAccess().getDefinedKeyword());
            	

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
    // $ANTLR end "ruleAnnotationDefined"


    // $ANTLR start "entryRuleName"
    // InternalUseCase.g:1587:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalUseCase.g:1587:44: (iv_ruleName= ruleName EOF )
            // InternalUseCase.g:1588:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalUseCase.g:1594:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalUseCase.g:1600:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // InternalUseCase.g:1601:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // InternalUseCase.g:1601:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_STRING) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalUseCase.g:1602:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1610:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getNameAccess().getSTRINGTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleComment"
    // InternalUseCase.g:1621:1: entryRuleComment returns [String current=null] : iv_ruleComment= ruleComment EOF ;
    public final String entryRuleComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComment = null;


        try {
            // InternalUseCase.g:1621:47: (iv_ruleComment= ruleComment EOF )
            // InternalUseCase.g:1622:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment.getText(); 
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
    // InternalUseCase.g:1628:1: ruleComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ML_COMMENT_0=null;
        Token this_SL_COMMENT_1=null;


        	enterRule();

        try {
            // InternalUseCase.g:1634:2: ( (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // InternalUseCase.g:1635:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // InternalUseCase.g:1635:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ML_COMMENT) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_SL_COMMENT) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalUseCase.g:1636:3: this_ML_COMMENT_0= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    			current.merge(this_ML_COMMENT_0);
                    		

                    			newLeafNode(this_ML_COMMENT_0, grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1644:3: this_SL_COMMENT_1= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

                    			current.merge(this_SL_COMMENT_1);
                    		

                    			newLeafNode(this_SL_COMMENT_1, grammarAccess.getCommentAccess().getSL_COMMENTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "ruleModifier"
    // InternalUseCase.g:1655:1: ruleModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'leaf' ) ) ;
    public final Enumerator ruleModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:1661:2: ( ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'leaf' ) ) )
            // InternalUseCase.g:1662:2: ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'leaf' ) )
            {
            // InternalUseCase.g:1662:2: ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'abstract' ) | (enumLiteral_2= 'leaf' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt38=1;
                }
                break;
            case 34:
                {
                alt38=2;
                }
                break;
            case 35:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalUseCase.g:1663:3: (enumLiteral_0= 'final' )
                    {
                    // InternalUseCase.g:1663:3: (enumLiteral_0= 'final' )
                    // InternalUseCase.g:1664:4: enumLiteral_0= 'final'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getModifierAccess().getFINALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModifierAccess().getFINALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1671:3: (enumLiteral_1= 'abstract' )
                    {
                    // InternalUseCase.g:1671:3: (enumLiteral_1= 'abstract' )
                    // InternalUseCase.g:1672:4: enumLiteral_1= 'abstract'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getModifierAccess().getABSTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModifierAccess().getABSTRACTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:1679:3: (enumLiteral_2= 'leaf' )
                    {
                    // InternalUseCase.g:1679:3: (enumLiteral_2= 'leaf' )
                    // InternalUseCase.g:1680:4: enumLiteral_2= 'leaf'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getModifierAccess().getLEAFEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getModifierAccess().getLEAFEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "ruleVisibility"
    // InternalUseCase.g:1690:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'package' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalUseCase.g:1696:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'package' ) ) )
            // InternalUseCase.g:1697:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'package' ) )
            {
            // InternalUseCase.g:1697:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'package' ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt39=1;
                }
                break;
            case 37:
                {
                alt39=2;
                }
                break;
            case 38:
                {
                alt39=3;
                }
                break;
            case 39:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalUseCase.g:1698:3: (enumLiteral_0= 'public' )
                    {
                    // InternalUseCase.g:1698:3: (enumLiteral_0= 'public' )
                    // InternalUseCase.g:1699:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1706:3: (enumLiteral_1= 'private' )
                    {
                    // InternalUseCase.g:1706:3: (enumLiteral_1= 'private' )
                    // InternalUseCase.g:1707:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:1714:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalUseCase.g:1714:3: (enumLiteral_2= 'protected' )
                    // InternalUseCase.g:1715:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCase.g:1722:3: (enumLiteral_3= 'package' )
                    {
                    // InternalUseCase.g:1722:3: (enumLiteral_3= 'package' )
                    // InternalUseCase.g:1723:4: enumLiteral_3= 'package'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_3());
                    			

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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\3\7\2\uffff";
    static final String dfa_3s = "\3\47\2\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\1";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\7\uffff\1\4\3\uffff\1\3\14\uffff\7\4",
            "\1\1\1\2\7\uffff\1\4\3\uffff\1\3\14\uffff\7\4",
            "\1\1\1\2\7\uffff\1\4\3\uffff\1\3\14\uffff\7\4",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 137:3: ( (lv_actors_3_0= ruleActor ) )*";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\7\1\uffff\2\7\4\27\3\uffff";
    static final String dfa_9s = "\1\47\1\uffff\2\47\4\43\3\uffff";
    static final String dfa_10s = "\1\uffff\1\4\6\uffff\1\1\1\2\1\3";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\12\uffff\1\1\3\uffff\1\10\1\11\2\uffff\1\12\5\uffff\3\10\1\4\1\5\1\6\1\7",
            "",
            "\1\2\1\3\16\uffff\1\10\1\11\2\uffff\1\12\5\uffff\3\10\1\4\1\5\1\6\1\7",
            "\1\2\1\3\16\uffff\1\10\1\11\2\uffff\1\12\5\uffff\3\10\1\4\1\5\1\6\1\7",
            "\1\10\1\11\2\uffff\1\12\5\uffff\3\10",
            "\1\10\1\11\2\uffff\1\12\5\uffff\3\10",
            "\1\10\1\11\2\uffff\1\12\5\uffff\3\10",
            "\1\10\1\11\2\uffff\1\12\5\uffff\3\10",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 724:5: ( ( (lv_extensionPoints_8_0= ruleExtensionPoint ) ) | ( (lv_extensions_9_0= ruleExtension ) ) | ( (lv_includes_10_0= ruleInclude ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000FE00110180L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000FE10000182L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000FE00010180L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000E00010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000061000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100180L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000680180L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000600180L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000FE09880180L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000FE00800180L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000E00800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000F001000180L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000F008000180L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000FE10000180L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000E10000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000070L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000040L});

}