package de.cooperateproject.modeling.textual.cls.parser.antlr.internal;

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
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_UNDERSCORE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-clsd'", "'@end-clsd'", "'rootPackage'", "'package'", "'{'", "'}'", "'import'", "'.'", "'abstract'", "'class'", "'as'", "'interface'", "'static'", "':'", "'('", "','", "')'", "'isa'", "'impl'", "'bi'", "'role'", "'['", "']'", "'card'", "'note'", "'..'", "'*'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'asc'", "'agg'", "'com'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_UNDERSCORE=7;
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
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalClsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalClsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalClsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCls.g"; }



     	private ClsGrammarAccess grammarAccess;

        public InternalClsParser(TokenStream input, ClsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ClassDiagram";
       	}

       	@Override
       	protected ClsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleClassDiagram"
    // InternalCls.g:65:1: entryRuleClassDiagram returns [EObject current=null] : iv_ruleClassDiagram= ruleClassDiagram EOF ;
    public final EObject entryRuleClassDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDiagram = null;


        try {
            // InternalCls.g:65:53: (iv_ruleClassDiagram= ruleClassDiagram EOF )
            // InternalCls.g:66:2: iv_ruleClassDiagram= ruleClassDiagram EOF
            {
             newCompositeNode(grammarAccess.getClassDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDiagram=ruleClassDiagram();

            state._fsp--;

             current =iv_ruleClassDiagram; 
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
    // $ANTLR end "entryRuleClassDiagram"


    // $ANTLR start "ruleClassDiagram"
    // InternalCls.g:72:1: ruleClassDiagram returns [EObject current=null] : ( () otherlv_1= '@start-clsd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-clsd' ) ;
    public final EObject ruleClassDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_4=null;
        EObject lv_rootPackage_3_0 = null;



        	enterRule();

        try {
            // InternalCls.g:78:2: ( ( () otherlv_1= '@start-clsd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-clsd' ) )
            // InternalCls.g:79:2: ( () otherlv_1= '@start-clsd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-clsd' )
            {
            // InternalCls.g:79:2: ( () otherlv_1= '@start-clsd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-clsd' )
            // InternalCls.g:80:3: () otherlv_1= '@start-clsd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-clsd'
            {
            // InternalCls.g:80:3: ()
            // InternalCls.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassDiagramAccess().getClassDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDiagramAccess().getStartClsdKeyword_1());
            		
            // InternalCls.g:91:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalCls.g:92:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalCls.g:92:4: (lv_title_2_0= RULE_STRING )
            // InternalCls.g:93:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_2_0, grammarAccess.getClassDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCls.g:109:3: ( (lv_rootPackage_3_0= ruleRootPackage ) )
            // InternalCls.g:110:4: (lv_rootPackage_3_0= ruleRootPackage )
            {
            // InternalCls.g:110:4: (lv_rootPackage_3_0= ruleRootPackage )
            // InternalCls.g:111:5: lv_rootPackage_3_0= ruleRootPackage
            {

            					newCompositeNode(grammarAccess.getClassDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_rootPackage_3_0=ruleRootPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDiagramRule());
            					}
            					set(
            						current,
            						"rootPackage",
            						lv_rootPackage_3_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.RootPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getClassDiagramAccess().getEndClsdKeyword_4());
            		

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
    // $ANTLR end "ruleClassDiagram"


    // $ANTLR start "entryRuleRootPackage"
    // InternalCls.g:136:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalCls.g:136:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalCls.g:137:2: iv_ruleRootPackage= ruleRootPackage EOF
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
    // InternalCls.g:143:1: ruleRootPackage returns [EObject current=null] : ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_packageImports_3_0 = null;

        EObject lv_classifiers_4_0 = null;

        EObject lv_connectors_5_0 = null;

        EObject lv_packages_6_0 = null;



        	enterRule();

        try {
            // InternalCls.g:149:2: ( ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* ) )
            // InternalCls.g:150:2: ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* )
            {
            // InternalCls.g:150:2: ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* )
            // InternalCls.g:151:3: () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )*
            {
            // InternalCls.g:151:3: ()
            // InternalCls.g:152:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            // InternalCls.g:158:3: (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCls.g:159:4: otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0());
                    			
                    // InternalCls.g:163:4: ( (lv_name_2_0= ruleFQN ) )
                    // InternalCls.g:164:5: (lv_name_2_0= ruleFQN )
                    {
                    // InternalCls.g:164:5: (lv_name_2_0= ruleFQN )
                    // InternalCls.g:165:6: lv_name_2_0= ruleFQN
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
                    							"de.cooperateproject.modeling.textual.cls.Cls.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCls.g:183:3: ( (lv_packageImports_3_0= rulePackageImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCls.g:184:4: (lv_packageImports_3_0= rulePackageImport )
            	    {
            	    // InternalCls.g:184:4: (lv_packageImports_3_0= rulePackageImport )
            	    // InternalCls.g:185:5: lv_packageImports_3_0= rulePackageImport
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getPackageImportsPackageImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_packageImports_3_0=rulePackageImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packageImports",
            	    						lv_packageImports_3_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.PackageImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCls.g:202:3: ( (lv_classifiers_4_0= ruleClassifier ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=20 && LA3_0<=21)||LA3_0==23||(LA3_0>=39 && LA3_0<=45)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCls.g:203:4: (lv_classifiers_4_0= ruleClassifier )
            	    {
            	    // InternalCls.g:203:4: (lv_classifiers_4_0= ruleClassifier )
            	    // InternalCls.g:204:5: lv_classifiers_4_0= ruleClassifier
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getClassifiersClassifierParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_classifiers_4_0=ruleClassifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classifiers",
            	    						lv_classifiers_4_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Classifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalCls.g:221:3: ( (lv_connectors_5_0= ruleConnector ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=29 && LA4_0<=31)||(LA4_0>=46 && LA4_0<=48)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCls.g:222:4: (lv_connectors_5_0= ruleConnector )
            	    {
            	    // InternalCls.g:222:4: (lv_connectors_5_0= ruleConnector )
            	    // InternalCls.g:223:5: lv_connectors_5_0= ruleConnector
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getConnectorsConnectorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_connectors_5_0=ruleConnector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectors",
            	    						lv_connectors_5_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Connector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalCls.g:240:3: ( (lv_packages_6_0= rulePackage ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCls.g:241:4: (lv_packages_6_0= rulePackage )
            	    {
            	    // InternalCls.g:241:4: (lv_packages_6_0= rulePackage )
            	    // InternalCls.g:242:5: lv_packages_6_0= rulePackage
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getPackagesPackageParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_packages_6_0=rulePackage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packages",
            	    						lv_packages_6_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Package");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "entryRulePackage"
    // InternalCls.g:263:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalCls.g:263:48: (iv_rulePackage= rulePackage EOF )
            // InternalCls.g:264:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalCls.g:270:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_packageImports_3_0 = null;

        EObject lv_classifiers_4_0 = null;

        EObject lv_connectors_5_0 = null;

        EObject lv_packages_6_0 = null;



        	enterRule();

        try {
            // InternalCls.g:276:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' ) )
            // InternalCls.g:277:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' )
            {
            // InternalCls.g:277:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' )
            // InternalCls.g:278:3: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalCls.g:282:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalCls.g:283:4: (lv_name_1_0= ruleFQN )
            {
            // InternalCls.g:283:4: (lv_name_1_0= ruleFQN )
            // InternalCls.g:284:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCls.g:305:3: ( (lv_packageImports_3_0= rulePackageImport ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCls.g:306:4: (lv_packageImports_3_0= rulePackageImport )
            	    {
            	    // InternalCls.g:306:4: (lv_packageImports_3_0= rulePackageImport )
            	    // InternalCls.g:307:5: lv_packageImports_3_0= rulePackageImport
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getPackageImportsPackageImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_packageImports_3_0=rulePackageImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packageImports",
            	    						lv_packageImports_3_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.PackageImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalCls.g:324:3: ( (lv_classifiers_4_0= ruleClassifier ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=20 && LA7_0<=21)||LA7_0==23||(LA7_0>=39 && LA7_0<=45)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCls.g:325:4: (lv_classifiers_4_0= ruleClassifier )
            	    {
            	    // InternalCls.g:325:4: (lv_classifiers_4_0= ruleClassifier )
            	    // InternalCls.g:326:5: lv_classifiers_4_0= ruleClassifier
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getClassifiersClassifierParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_classifiers_4_0=ruleClassifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classifiers",
            	    						lv_classifiers_4_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Classifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalCls.g:343:3: ( (lv_connectors_5_0= ruleConnector ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=29 && LA8_0<=31)||(LA8_0>=46 && LA8_0<=48)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCls.g:344:4: (lv_connectors_5_0= ruleConnector )
            	    {
            	    // InternalCls.g:344:4: (lv_connectors_5_0= ruleConnector )
            	    // InternalCls.g:345:5: lv_connectors_5_0= ruleConnector
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getConnectorsConnectorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_connectors_5_0=ruleConnector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectors",
            	    						lv_connectors_5_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Connector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalCls.g:362:3: ( (lv_packages_6_0= rulePackage ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCls.g:363:4: (lv_packages_6_0= rulePackage )
            	    {
            	    // InternalCls.g:363:4: (lv_packages_6_0= rulePackage )
            	    // InternalCls.g:364:5: lv_packages_6_0= rulePackage
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_packages_6_0=rulePackage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packages",
            	    						lv_packages_6_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Package");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackageImport"
    // InternalCls.g:389:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // InternalCls.g:389:54: (iv_rulePackageImport= rulePackageImport EOF )
            // InternalCls.g:390:2: iv_rulePackageImport= rulePackageImport EOF
            {
             newCompositeNode(grammarAccess.getPackageImportRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageImport=rulePackageImport();

            state._fsp--;

             current =iv_rulePackageImport; 
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
    // $ANTLR end "entryRulePackageImport"


    // $ANTLR start "rulePackageImport"
    // InternalCls.g:396:1: rulePackageImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleFQN ) ) ( (lv_comments_2_0= ruleComment ) )? ) ;
    public final EObject rulePackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_comments_2_0 = null;



        	enterRule();

        try {
            // InternalCls.g:402:2: ( (otherlv_0= 'import' ( ( ruleFQN ) ) ( (lv_comments_2_0= ruleComment ) )? ) )
            // InternalCls.g:403:2: (otherlv_0= 'import' ( ( ruleFQN ) ) ( (lv_comments_2_0= ruleComment ) )? )
            {
            // InternalCls.g:403:2: (otherlv_0= 'import' ( ( ruleFQN ) ) ( (lv_comments_2_0= ruleComment ) )? )
            // InternalCls.g:404:3: otherlv_0= 'import' ( ( ruleFQN ) ) ( (lv_comments_2_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageImportAccess().getImportKeyword_0());
            		
            // InternalCls.g:408:3: ( ( ruleFQN ) )
            // InternalCls.g:409:4: ( ruleFQN )
            {
            // InternalCls.g:409:4: ( ruleFQN )
            // InternalCls.g:410:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageImportRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:424:3: ( (lv_comments_2_0= ruleComment ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCls.g:425:4: (lv_comments_2_0= ruleComment )
                    {
                    // InternalCls.g:425:4: (lv_comments_2_0= ruleComment )
                    // InternalCls.g:426:5: lv_comments_2_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getPackageImportAccess().getCommentsCommentParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_2_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPackageImportRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_2_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.Comment");
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
    // $ANTLR end "rulePackageImport"


    // $ANTLR start "entryRuleFQN"
    // InternalCls.g:447:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCls.g:447:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCls.g:448:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCls.g:454:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCls.g:460:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCls.g:461:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCls.g:461:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCls.g:462:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalCls.g:469:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCls.g:470:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "entryRuleClassifier"
    // InternalCls.g:487:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalCls.g:487:51: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalCls.g:488:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier; 
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
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // InternalCls.g:494:1: ruleClassifier returns [EObject current=null] : (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Interface_1 = null;



        	enterRule();

        try {
            // InternalCls.g:500:2: ( (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) )
            // InternalCls.g:501:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            {
            // InternalCls.g:501:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalCls.g:502:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getClassifierAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:511:3: this_Interface_1= ruleInterface
                    {

                    			newCompositeNode(grammarAccess.getClassifierAccess().getInterfaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_1=ruleInterface();

                    state._fsp--;


                    			current = this_Interface_1;
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
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleClass"
    // InternalCls.g:523:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalCls.g:523:46: (iv_ruleClass= ruleClass EOF )
            // InternalCls.g:524:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalCls.g:530:1: ruleClass returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
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

        EObject lv_members_10_0 = null;



        	enterRule();

        try {
            // InternalCls.g:536:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) ) )
            // InternalCls.g:537:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) )
            {
            // InternalCls.g:537:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) )
            // InternalCls.g:538:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) )
            {
            // InternalCls.g:538:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=39 && LA13_0<=45)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCls.g:539:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:539:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:540:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:557:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCls.g:558:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:558:4: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:559:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,20,FOLLOW_19); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
            		
            // InternalCls.g:575:3: ( ( (lv_name_3_0= RULE_ID ) ) | ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||LA15_1==13||(LA15_1>=15 && LA15_1<=17)||(LA15_1>=20 && LA15_1<=21)||LA15_1==23||(LA15_1>=29 && LA15_1<=31)||LA15_1==36||(LA15_1>=39 && LA15_1<=48)) ) {
                    alt15=1;
                }
                else if ( (LA15_1==22) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCls.g:576:4: ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalCls.g:576:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalCls.g:577:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalCls.g:577:5: (lv_name_3_0= RULE_ID )
                    // InternalCls.g:578:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.cooperateproject.modeling.textual.cls.Cls.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:595:4: ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) )
                    {
                    // InternalCls.g:595:4: ( ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) ) )
                    // InternalCls.g:596:5: ( (lv_alias_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_name_6_0= RULE_STRING ) )
                    {
                    // InternalCls.g:596:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalCls.g:597:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalCls.g:597:6: (lv_alias_4_0= RULE_ID )
                    // InternalCls.g:598:7: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(lv_alias_4_0, grammarAccess.getClassAccess().getAliasIDTerminalRuleCall_3_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_4_0,
                    								"de.cooperateproject.modeling.textual.cls.Cls.ID");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getClassAccess().getAsKeyword_3_1_1());
                    				
                    // InternalCls.g:618:5: ( (lv_name_6_0= RULE_STRING ) )
                    // InternalCls.g:619:6: (lv_name_6_0= RULE_STRING )
                    {
                    // InternalCls.g:619:6: (lv_name_6_0= RULE_STRING )
                    // InternalCls.g:620:7: lv_name_6_0= RULE_STRING
                    {
                    lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    							newLeafNode(lv_name_6_0, grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_3_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassRule());
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

            // InternalCls.g:638:3: ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==EOF||LA19_0==13||LA19_0==15||LA19_0==17||(LA19_0>=20 && LA19_0<=21)||LA19_0==23||(LA19_0>=29 && LA19_0<=31)||LA19_0==36||(LA19_0>=39 && LA19_0<=48)) ) {
                alt19=1;
            }
            else if ( (LA19_0==16) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCls.g:639:4: ( (lv_comments_7_0= ruleComment ) )?
                    {
                    // InternalCls.g:639:4: ( (lv_comments_7_0= ruleComment ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==36) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalCls.g:640:5: (lv_comments_7_0= ruleComment )
                            {
                            // InternalCls.g:640:5: (lv_comments_7_0= ruleComment )
                            // InternalCls.g:641:6: lv_comments_7_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_4_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_7_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClassRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_7_0,
                            							"de.cooperateproject.modeling.textual.cls.Cls.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:659:4: (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )
                    {
                    // InternalCls.g:659:4: (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )
                    // InternalCls.g:660:5: otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_22); 

                    					newLeafNode(otherlv_8, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalCls.g:664:5: ( (lv_comments_9_0= ruleComment ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==36) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalCls.g:665:6: (lv_comments_9_0= ruleComment )
                            {
                            // InternalCls.g:665:6: (lv_comments_9_0= ruleComment )
                            // InternalCls.g:666:7: lv_comments_9_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_comments_9_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassRule());
                            							}
                            							add(
                            								current,
                            								"comments",
                            								lv_comments_9_0,
                            								"de.cooperateproject.modeling.textual.cls.Cls.Comment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalCls.g:683:5: ( (lv_members_10_0= ruleMember ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID||LA18_0==20||LA18_0==24||(LA18_0>=39 && LA18_0<=45)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalCls.g:684:6: (lv_members_10_0= ruleMember )
                    	    {
                    	    // InternalCls.g:684:6: (lv_members_10_0= ruleMember )
                    	    // InternalCls.g:685:7: lv_members_10_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_members_10_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_10_0,
                    	    								"de.cooperateproject.modeling.textual.cls.Cls.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_1_3());
                    				

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleInterface"
    // InternalCls.g:712:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCls.g:712:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalCls.g:713:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalCls.g:719:1: ruleInterface returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_comments_6_0 = null;

        EObject lv_comments_8_0 = null;

        EObject lv_members_9_0 = null;



        	enterRule();

        try {
            // InternalCls.g:725:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) ) ) )
            // InternalCls.g:726:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) ) )
            {
            // InternalCls.g:726:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) ) )
            // InternalCls.g:727:3: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) )
            {
            // InternalCls.g:727:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=39 && LA20_0<=45)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCls.g:728:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:728:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:729:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getInterfaceAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalCls.g:750:3: ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==22) ) {
                    alt21=2;
                }
                else if ( (LA21_1==EOF||LA21_1==13||(LA21_1>=15 && LA21_1<=17)||(LA21_1>=20 && LA21_1<=21)||LA21_1==23||(LA21_1>=29 && LA21_1<=31)||LA21_1==36||(LA21_1>=39 && LA21_1<=48)) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalCls.g:751:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalCls.g:751:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalCls.g:752:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalCls.g:752:5: (lv_name_2_0= RULE_ID )
                    // InternalCls.g:753:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"de.cooperateproject.modeling.textual.cls.Cls.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:770:4: ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) )
                    {
                    // InternalCls.g:770:4: ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) )
                    // InternalCls.g:771:5: ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) )
                    {
                    // InternalCls.g:771:5: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalCls.g:772:6: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalCls.g:772:6: (lv_alias_3_0= RULE_ID )
                    // InternalCls.g:773:7: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(lv_alias_3_0, grammarAccess.getInterfaceAccess().getAliasIDTerminalRuleCall_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInterfaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_3_0,
                    								"de.cooperateproject.modeling.textual.cls.Cls.ID");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getAsKeyword_2_1_1());
                    				
                    // InternalCls.g:793:5: ( (lv_name_5_0= RULE_STRING ) )
                    // InternalCls.g:794:6: (lv_name_5_0= RULE_STRING )
                    {
                    // InternalCls.g:794:6: (lv_name_5_0= RULE_STRING )
                    // InternalCls.g:795:7: lv_name_5_0= RULE_STRING
                    {
                    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    							newLeafNode(lv_name_5_0, grammarAccess.getInterfaceAccess().getNameSTRINGTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInterfaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalCls.g:813:3: ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==EOF||LA25_0==13||LA25_0==15||LA25_0==17||(LA25_0>=20 && LA25_0<=21)||LA25_0==23||(LA25_0>=29 && LA25_0<=31)||LA25_0==36||(LA25_0>=39 && LA25_0<=48)) ) {
                alt25=1;
            }
            else if ( (LA25_0==16) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:814:4: ( (lv_comments_6_0= ruleComment ) )?
                    {
                    // InternalCls.g:814:4: ( (lv_comments_6_0= ruleComment ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==36) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalCls.g:815:5: (lv_comments_6_0= ruleComment )
                            {
                            // InternalCls.g:815:5: (lv_comments_6_0= ruleComment )
                            // InternalCls.g:816:6: lv_comments_6_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_3_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_6_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_6_0,
                            							"de.cooperateproject.modeling.textual.cls.Cls.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:834:4: (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' )
                    {
                    // InternalCls.g:834:4: (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' )
                    // InternalCls.g:835:5: otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_22); 

                    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalCls.g:839:5: ( (lv_comments_8_0= ruleComment ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==36) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalCls.g:840:6: (lv_comments_8_0= ruleComment )
                            {
                            // InternalCls.g:840:6: (lv_comments_8_0= ruleComment )
                            // InternalCls.g:841:7: lv_comments_8_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_comments_8_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                            							}
                            							add(
                            								current,
                            								"comments",
                            								lv_comments_8_0,
                            								"de.cooperateproject.modeling.textual.cls.Cls.Comment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalCls.g:858:5: ( (lv_members_9_0= ruleMember ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID||LA24_0==20||LA24_0==24||(LA24_0>=39 && LA24_0<=45)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalCls.g:859:6: (lv_members_9_0= ruleMember )
                    	    {
                    	    // InternalCls.g:859:6: (lv_members_9_0= ruleMember )
                    	    // InternalCls.g:860:7: lv_members_9_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_3_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_members_9_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_9_0,
                    	    								"de.cooperateproject.modeling.textual.cls.Cls.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3_1_3());
                    				

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMember"
    // InternalCls.g:887:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalCls.g:887:47: (iv_ruleMember= ruleMember EOF )
            // InternalCls.g:888:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalCls.g:894:1: ruleMember returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalCls.g:900:2: ( (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) )
            // InternalCls.g:901:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            {
            // InternalCls.g:901:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalCls.g:902:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:911:3: this_Method_1= ruleMethod
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Method_1=ruleMethod();

                    state._fsp--;


                    			current = this_Method_1;
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleAttribute"
    // InternalCls.g:923:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalCls.g:923:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalCls.g:924:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalCls.g:930:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalCls.g:936:2: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ) )
            // InternalCls.g:937:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:937:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) )
            // InternalCls.g:938:3: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) )
            {
            // InternalCls.g:938:3: ()
            // InternalCls.g:939:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalCls.g:945:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=39 && LA27_0<=45)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:946:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalCls.g:946:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalCls.g:947:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_visibility_1_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:964:3: ( (lv_static_2_0= 'static' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:965:4: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:965:4: (lv_static_2_0= 'static' )
                    // InternalCls.g:966:5: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,24,FOLLOW_6); 

                    					newLeafNode(lv_static_2_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:978:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCls.g:979:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCls.g:979:4: (lv_name_3_0= RULE_ID )
            // InternalCls.g:980:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
            		
            // InternalCls.g:1000:3: ( ( ruleFQN ) )
            // InternalCls.g:1001:4: ( ruleFQN )
            {
            // InternalCls.g:1001:4: ( ruleFQN )
            // InternalCls.g:1002:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_5_0());
            				
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalCls.g:1020:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalCls.g:1020:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalCls.g:1021:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalCls.g:1027:1: ruleMethod returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )* otherlv_8= ')' (otherlv_9= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1033:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )* otherlv_8= ')' (otherlv_9= ':' ( ( ruleFQN ) ) )? ) )
            // InternalCls.g:1034:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )* otherlv_8= ')' (otherlv_9= ':' ( ( ruleFQN ) ) )? )
            {
            // InternalCls.g:1034:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )* otherlv_8= ')' (otherlv_9= ':' ( ( ruleFQN ) ) )? )
            // InternalCls.g:1035:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )* otherlv_8= ')' (otherlv_9= ':' ( ( ruleFQN ) ) )?
            {
            // InternalCls.g:1035:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=39 && LA29_0<=45)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:1036:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:1036:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:1037:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1054:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCls.g:1055:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:1055:4: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:1056:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,20,FOLLOW_25); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1068:3: ( (lv_static_2_0= 'static' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:1069:4: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:1069:4: (lv_static_2_0= 'static' )
                    // InternalCls.g:1070:5: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,24,FOLLOW_6); 

                    					newLeafNode(lv_static_2_0, grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1082:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCls.g:1083:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCls.g:1083:4: (lv_name_3_0= RULE_ID )
            // InternalCls.g:1084:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCls.g:1104:3: ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||(LA33_0>=39 && LA33_0<=45)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCls.g:1105:4: ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
            	    {
            	    // InternalCls.g:1105:4: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalCls.g:1106:5: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalCls.g:1106:5: (lv_parameters_5_0= ruleParameter )
            	    // InternalCls.g:1107:6: lv_parameters_5_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_5_0,
            	    							"de.cooperateproject.modeling.textual.cls.Cls.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCls.g:1124:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==27) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalCls.g:1125:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,27,FOLLOW_31); 

            	    	    					newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getCommaKeyword_5_1_0());
            	    	    				
            	    	    // InternalCls.g:1129:5: ( (lv_parameters_7_0= ruleParameter ) )
            	    	    // InternalCls.g:1130:6: (lv_parameters_7_0= ruleParameter )
            	    	    {
            	    	    // InternalCls.g:1130:6: (lv_parameters_7_0= ruleParameter )
            	    	    // InternalCls.g:1131:7: lv_parameters_7_0= ruleParameter
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_5_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_30);
            	    	    lv_parameters_7_0=ruleParameter();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"parameters",
            	    	    								lv_parameters_7_0,
            	    	    								"de.cooperateproject.modeling.textual.cls.Cls.Parameter");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getRightParenthesisKeyword_6());
            		
            // InternalCls.g:1154:3: (otherlv_9= ':' ( ( ruleFQN ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:1155:4: otherlv_9= ':' ( ( ruleFQN ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getColonKeyword_7_0());
                    			
                    // InternalCls.g:1159:4: ( ( ruleFQN ) )
                    // InternalCls.g:1160:5: ( ruleFQN )
                    {
                    // InternalCls.g:1160:5: ( ruleFQN )
                    // InternalCls.g:1161:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethodAccess().getTypeClassifierCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalCls.g:1180:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCls.g:1180:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCls.g:1181:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCls.g:1187:1: ruleParameter returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1193:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) )
            // InternalCls.g:1194:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:1194:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) )
            // InternalCls.g:1195:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) )
            {
            // InternalCls.g:1195:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=39 && LA35_0<=45)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:1196:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:1196:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:1197:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCls.g:1215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCls.g:1215:4: (lv_name_1_0= RULE_ID )
            // InternalCls.g:1216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            // InternalCls.g:1236:3: ( ( ruleFQN ) )
            // InternalCls.g:1237:4: ( ruleFQN )
            {
            // InternalCls.g:1237:4: ( ruleFQN )
            // InternalCls.g:1238:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeClassifierCrossReference_3_0());
            				
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConnector"
    // InternalCls.g:1256:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCls.g:1256:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCls.g:1257:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalCls.g:1263:1: ruleConnector returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_XtextAssociation_1 = null;

        EObject this_Implementation_2 = null;



        	enterRule();

        try {
            // InternalCls.g:1269:2: ( (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation ) )
            // InternalCls.g:1270:2: (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation )
            {
            // InternalCls.g:1270:2: (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt36=1;
                }
                break;
            case 31:
            case 46:
            case 47:
            case 48:
                {
                alt36=2;
                }
                break;
            case 30:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalCls.g:1271:3: this_Generalization_0= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getGeneralizationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_0=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:1280:3: this_XtextAssociation_1= ruleXtextAssociation
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getXtextAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XtextAssociation_1=ruleXtextAssociation();

                    state._fsp--;


                    			current = this_XtextAssociation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCls.g:1289:3: this_Implementation_2= ruleImplementation
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getImplementationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Implementation_2=ruleImplementation();

                    state._fsp--;


                    			current = this_Implementation_2;
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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleGeneralization"
    // InternalCls.g:1301:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalCls.g:1301:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalCls.g:1302:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalCls.g:1308:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_comments_6_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1314:2: ( (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? ) )
            // InternalCls.g:1315:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? )
            {
            // InternalCls.g:1315:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? )
            // InternalCls.g:1316:3: otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsaKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCls.g:1324:3: ( ( ruleFQN ) )
            // InternalCls.g:1325:4: ( ruleFQN )
            {
            // InternalCls.g:1325:4: ( ruleFQN )
            // InternalCls.g:1326:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getLeftClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_33);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getCommaKeyword_3());
            		
            // InternalCls.g:1344:3: ( ( ruleFQN ) )
            // InternalCls.g:1345:4: ( ruleFQN )
            {
            // InternalCls.g:1345:4: ( ruleFQN )
            // InternalCls.g:1346:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getRightClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_34);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_5());
            		
            // InternalCls.g:1364:3: ( (lv_comments_6_0= ruleComment ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCls.g:1365:4: (lv_comments_6_0= ruleComment )
                    {
                    // InternalCls.g:1365:4: (lv_comments_6_0= ruleComment )
                    // InternalCls.g:1366:5: lv_comments_6_0= ruleComment
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
                    						"de.cooperateproject.modeling.textual.cls.Cls.Comment");
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


    // $ANTLR start "entryRuleImplementation"
    // InternalCls.g:1387:1: entryRuleImplementation returns [EObject current=null] : iv_ruleImplementation= ruleImplementation EOF ;
    public final EObject entryRuleImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementation = null;


        try {
            // InternalCls.g:1387:55: (iv_ruleImplementation= ruleImplementation EOF )
            // InternalCls.g:1388:2: iv_ruleImplementation= ruleImplementation EOF
            {
             newCompositeNode(grammarAccess.getImplementationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementation=ruleImplementation();

            state._fsp--;

             current =iv_ruleImplementation; 
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
    // $ANTLR end "entryRuleImplementation"


    // $ANTLR start "ruleImplementation"
    // InternalCls.g:1394:1: ruleImplementation returns [EObject current=null] : (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? ) ;
    public final EObject ruleImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_comments_6_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1400:2: ( (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? ) )
            // InternalCls.g:1401:2: (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? )
            {
            // InternalCls.g:1401:2: (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? )
            // InternalCls.g:1402:3: otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementationAccess().getImplKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCls.g:1410:3: ( ( ruleFQN ) )
            // InternalCls.g:1411:4: ( ruleFQN )
            {
            // InternalCls.g:1411:4: ( ruleFQN )
            // InternalCls.g:1412:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplementationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplementationAccess().getLeftClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_33);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getImplementationAccess().getCommaKeyword_3());
            		
            // InternalCls.g:1430:3: ( ( ruleFQN ) )
            // InternalCls.g:1431:4: ( ruleFQN )
            {
            // InternalCls.g:1431:4: ( ruleFQN )
            // InternalCls.g:1432:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplementationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplementationAccess().getRightClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_34);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getImplementationAccess().getRightParenthesisKeyword_5());
            		
            // InternalCls.g:1450:3: ( (lv_comments_6_0= ruleComment ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:1451:4: (lv_comments_6_0= ruleComment )
                    {
                    // InternalCls.g:1451:4: (lv_comments_6_0= ruleComment )
                    // InternalCls.g:1452:5: lv_comments_6_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getImplementationAccess().getCommentsCommentParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_6_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplementationRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_6_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.Comment");
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
    // $ANTLR end "ruleImplementation"


    // $ANTLR start "entryRuleXtextAssociation"
    // InternalCls.g:1473:1: entryRuleXtextAssociation returns [EObject current=null] : iv_ruleXtextAssociation= ruleXtextAssociation EOF ;
    public final EObject entryRuleXtextAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXtextAssociation = null;


        try {
            // InternalCls.g:1473:57: (iv_ruleXtextAssociation= ruleXtextAssociation EOF )
            // InternalCls.g:1474:2: iv_ruleXtextAssociation= ruleXtextAssociation EOF
            {
             newCompositeNode(grammarAccess.getXtextAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXtextAssociation=ruleXtextAssociation();

            state._fsp--;

             current =iv_ruleXtextAssociation; 
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
    // $ANTLR end "entryRuleXtextAssociation"


    // $ANTLR start "ruleXtextAssociation"
    // InternalCls.g:1480:1: ruleXtextAssociation returns [EObject current=null] : ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '(' ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? ) ;
    public final EObject ruleXtextAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_twoSideBidirectionality_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_twoSideAggregationKind_1_0 = null;

        EObject lv_memberEndTypes_4_0 = null;

        EObject lv_memberEndTypes_6_0 = null;

        AntlrDatatypeRuleToken lv_memberEndNames_10_0 = null;

        AntlrDatatypeRuleToken lv_memberEndNames_12_0 = null;

        EObject lv_memberEndCardinalities_16_0 = null;

        EObject lv_memberEndCardinalities_18_0 = null;

        EObject lv_comments_20_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1486:2: ( ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '(' ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? ) )
            // InternalCls.g:1487:2: ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '(' ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? )
            {
            // InternalCls.g:1487:2: ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '(' ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? )
            // InternalCls.g:1488:3: ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '(' ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )?
            {
            // InternalCls.g:1488:3: ( (lv_twoSideBidirectionality_0_0= 'bi' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCls.g:1489:4: (lv_twoSideBidirectionality_0_0= 'bi' )
                    {
                    // InternalCls.g:1489:4: (lv_twoSideBidirectionality_0_0= 'bi' )
                    // InternalCls.g:1490:5: lv_twoSideBidirectionality_0_0= 'bi'
                    {
                    lv_twoSideBidirectionality_0_0=(Token)match(input,31,FOLLOW_35); 

                    					newLeafNode(lv_twoSideBidirectionality_0_0, grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXtextAssociationRule());
                    					}
                    					setWithLastConsumed(current, "twoSideBidirectionality", true, "bi");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1502:3: ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) )
            // InternalCls.g:1503:4: (lv_twoSideAggregationKind_1_0= ruleAggregationKind )
            {
            // InternalCls.g:1503:4: (lv_twoSideAggregationKind_1_0= ruleAggregationKind )
            // InternalCls.g:1504:5: lv_twoSideAggregationKind_1_0= ruleAggregationKind
            {

            					newCompositeNode(grammarAccess.getXtextAssociationAccess().getTwoSideAggregationKindAggregationKindEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_twoSideAggregationKind_1_0=ruleAggregationKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
            					}
            					set(
            						current,
            						"twoSideAggregationKind",
            						lv_twoSideAggregationKind_1_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.AggregationKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:1521:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCls.g:1522:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalCls.g:1522:4: (lv_name_2_0= RULE_ID )
                    // InternalCls.g:1523:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getXtextAssociationAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXtextAssociationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getXtextAssociationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCls.g:1543:3: ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:1544:4: (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:1544:4: (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:1545:5: lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType
            {

            					newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_memberEndTypes_4_0=ruleXtextAssociationMemberEndReferencedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
            					}
            					add(
            						current,
            						"memberEndTypes",
            						lv_memberEndTypes_4_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.XtextAssociationMemberEndReferencedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:1562:3: (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCls.g:1563:4: otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) )
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getXtextAssociationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCls.g:1567:4: ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) )
            	    // InternalCls.g:1568:5: (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType )
            	    {
            	    // InternalCls.g:1568:5: (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType )
            	    // InternalCls.g:1569:6: lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType
            	    {

            	    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_memberEndTypes_6_0=ruleXtextAssociationMemberEndReferencedType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"memberEndTypes",
            	    							lv_memberEndTypes_6_0,
            	    							"de.cooperateproject.modeling.textual.cls.Cls.XtextAssociationMemberEndReferencedType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FOLLOW_38); 

            			newLeafNode(otherlv_7, grammarAccess.getXtextAssociationAccess().getRightParenthesisKeyword_6());
            		
            // InternalCls.g:1591:3: (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCls.g:1592:4: otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getXtextAssociationAccess().getRoleKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,33,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalCls.g:1600:4: ( (lv_memberEndNames_10_0= ruleRoleName ) )
                    // InternalCls.g:1601:5: (lv_memberEndNames_10_0= ruleRoleName )
                    {
                    // InternalCls.g:1601:5: (lv_memberEndNames_10_0= ruleRoleName )
                    // InternalCls.g:1602:6: lv_memberEndNames_10_0= ruleRoleName
                    {

                    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_memberEndNames_10_0=ruleRoleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
                    						}
                    						add(
                    							current,
                    							"memberEndNames",
                    							lv_memberEndNames_10_0,
                    							"de.cooperateproject.modeling.textual.cls.Cls.RoleName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCls.g:1619:4: (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==27) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalCls.g:1620:5: otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,27,FOLLOW_40); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getXtextAssociationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCls.g:1624:5: ( (lv_memberEndNames_12_0= ruleRoleName ) )
                    	    // InternalCls.g:1625:6: (lv_memberEndNames_12_0= ruleRoleName )
                    	    {
                    	    // InternalCls.g:1625:6: (lv_memberEndNames_12_0= ruleRoleName )
                    	    // InternalCls.g:1626:7: lv_memberEndNames_12_0= ruleRoleName
                    	    {

                    	    							newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_memberEndNames_12_0=ruleRoleName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"memberEndNames",
                    	    								lv_memberEndNames_12_0,
                    	    								"de.cooperateproject.modeling.textual.cls.Cls.RoleName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,34,FOLLOW_42); 

                    				newLeafNode(otherlv_13, grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCls.g:1649:3: (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCls.g:1650:4: otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']'
                    {
                    otherlv_14=(Token)match(input,35,FOLLOW_39); 

                    				newLeafNode(otherlv_14, grammarAccess.getXtextAssociationAccess().getCardKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,33,FOLLOW_43); 

                    				newLeafNode(otherlv_15, grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalCls.g:1658:4: ( (lv_memberEndCardinalities_16_0= ruleCardinality ) )
                    // InternalCls.g:1659:5: (lv_memberEndCardinalities_16_0= ruleCardinality )
                    {
                    // InternalCls.g:1659:5: (lv_memberEndCardinalities_16_0= ruleCardinality )
                    // InternalCls.g:1660:6: lv_memberEndCardinalities_16_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_memberEndCardinalities_16_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
                    						}
                    						add(
                    							current,
                    							"memberEndCardinalities",
                    							lv_memberEndCardinalities_16_0,
                    							"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCls.g:1677:4: (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==25) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalCls.g:1678:5: otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) )
                    	    {
                    	    otherlv_17=(Token)match(input,25,FOLLOW_43); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getXtextAssociationAccess().getColonKeyword_8_3_0());
                    	    				
                    	    // InternalCls.g:1682:5: ( (lv_memberEndCardinalities_18_0= ruleCardinality ) )
                    	    // InternalCls.g:1683:6: (lv_memberEndCardinalities_18_0= ruleCardinality )
                    	    {
                    	    // InternalCls.g:1683:6: (lv_memberEndCardinalities_18_0= ruleCardinality )
                    	    // InternalCls.g:1684:7: lv_memberEndCardinalities_18_0= ruleCardinality
                    	    {

                    	    							newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    lv_memberEndCardinalities_18_0=ruleCardinality();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"memberEndCardinalities",
                    	    								lv_memberEndCardinalities_18_0,
                    	    								"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_19, grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCls.g:1707:3: ( (lv_comments_20_0= ruleComment ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==36) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCls.g:1708:4: (lv_comments_20_0= ruleComment )
                    {
                    // InternalCls.g:1708:4: (lv_comments_20_0= ruleComment )
                    // InternalCls.g:1709:5: lv_comments_20_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getXtextAssociationAccess().getCommentsCommentParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_20_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_20_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.Comment");
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
    // $ANTLR end "ruleXtextAssociation"


    // $ANTLR start "entryRuleXtextAssociationMemberEndReferencedType"
    // InternalCls.g:1730:1: entryRuleXtextAssociationMemberEndReferencedType returns [EObject current=null] : iv_ruleXtextAssociationMemberEndReferencedType= ruleXtextAssociationMemberEndReferencedType EOF ;
    public final EObject entryRuleXtextAssociationMemberEndReferencedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXtextAssociationMemberEndReferencedType = null;


        try {
            // InternalCls.g:1730:80: (iv_ruleXtextAssociationMemberEndReferencedType= ruleXtextAssociationMemberEndReferencedType EOF )
            // InternalCls.g:1731:2: iv_ruleXtextAssociationMemberEndReferencedType= ruleXtextAssociationMemberEndReferencedType EOF
            {
             newCompositeNode(grammarAccess.getXtextAssociationMemberEndReferencedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXtextAssociationMemberEndReferencedType=ruleXtextAssociationMemberEndReferencedType();

            state._fsp--;

             current =iv_ruleXtextAssociationMemberEndReferencedType; 
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
    // $ANTLR end "entryRuleXtextAssociationMemberEndReferencedType"


    // $ANTLR start "ruleXtextAssociationMemberEndReferencedType"
    // InternalCls.g:1737:1: ruleXtextAssociationMemberEndReferencedType returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleXtextAssociationMemberEndReferencedType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCls.g:1743:2: ( ( ( ruleFQN ) ) )
            // InternalCls.g:1744:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:1744:2: ( ( ruleFQN ) )
            // InternalCls.g:1745:3: ( ruleFQN )
            {
            // InternalCls.g:1745:3: ( ruleFQN )
            // InternalCls.g:1746:4: ruleFQN
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getXtextAssociationMemberEndReferencedTypeRule());
            				}
            			

            				newCompositeNode(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeClassifierCrossReference_0());
            			
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
    // $ANTLR end "ruleXtextAssociationMemberEndReferencedType"


    // $ANTLR start "entryRuleComment"
    // InternalCls.g:1763:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalCls.g:1763:48: (iv_ruleComment= ruleComment EOF )
            // InternalCls.g:1764:2: iv_ruleComment= ruleComment EOF
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
    // InternalCls.g:1770:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1776:2: ( (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) )
            // InternalCls.g:1777:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            {
            // InternalCls.g:1777:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            // InternalCls.g:1778:3: otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
            		
            // InternalCls.g:1782:3: ( (lv_body_1_0= ruleCommentBody ) )
            // InternalCls.g:1783:4: (lv_body_1_0= ruleCommentBody )
            {
            // InternalCls.g:1783:4: (lv_body_1_0= ruleCommentBody )
            // InternalCls.g:1784:5: lv_body_1_0= ruleCommentBody
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
            						"de.cooperateproject.modeling.textual.cls.Cls.CommentBody");
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


    // $ANTLR start "entryRuleCardinality"
    // InternalCls.g:1805:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalCls.g:1805:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalCls.g:1806:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalCls.g:1812:1: ruleCardinality returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1818:2: ( ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) )
            // InternalCls.g:1819:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            {
            // InternalCls.g:1819:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            // InternalCls.g:1820:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            {
            // InternalCls.g:1820:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) )
            // InternalCls.g:1821:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            {
            // InternalCls.g:1821:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            // InternalCls.g:1822:5: lv_lowerBound_0_0= ruleCardinalityBound
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
            lv_lowerBound_0_0=ruleCardinalityBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_0_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.CardinalityBound");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:1839:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==37) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCls.g:1840:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_43); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalCls.g:1844:4: ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    // InternalCls.g:1845:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    {
                    // InternalCls.g:1845:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    // InternalCls.g:1846:6: lv_upperBound_2_0= ruleCardinalityBound
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
                    							"de.cooperateproject.modeling.textual.cls.Cls.CardinalityBound");
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


    // $ANTLR start "entryRuleCommentBody"
    // InternalCls.g:1868:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalCls.g:1868:51: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalCls.g:1869:2: iv_ruleCommentBody= ruleCommentBody EOF
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
    // InternalCls.g:1875:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCls.g:1881:2: (this_STRING_0= RULE_STRING )
            // InternalCls.g:1882:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "entryRuleCardinalityBound"
    // InternalCls.g:1892:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // InternalCls.g:1892:56: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // InternalCls.g:1893:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
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
    // InternalCls.g:1899:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCls.g:1905:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalCls.g:1906:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalCls.g:1906:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_INT) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalCls.g:1907:3: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:1913:3: this_INT_1= RULE_INT
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


    // $ANTLR start "entryRuleRoleName"
    // InternalCls.g:1924:1: entryRuleRoleName returns [String current=null] : iv_ruleRoleName= ruleRoleName EOF ;
    public final String entryRuleRoleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRoleName = null;


        try {
            // InternalCls.g:1924:48: (iv_ruleRoleName= ruleRoleName EOF )
            // InternalCls.g:1925:2: iv_ruleRoleName= ruleRoleName EOF
            {
             newCompositeNode(grammarAccess.getRoleNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleName=ruleRoleName();

            state._fsp--;

             current =iv_ruleRoleName.getText(); 
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
    // $ANTLR end "entryRuleRoleName"


    // $ANTLR start "ruleRoleName"
    // InternalCls.g:1931:1: ruleRoleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE ) ;
    public final AntlrDatatypeRuleToken ruleRoleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNDERSCORE_1=null;


        	enterRule();

        try {
            // InternalCls.g:1937:2: ( (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE ) )
            // InternalCls.g:1938:2: (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE )
            {
            // InternalCls.g:1938:2: (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_UNDERSCORE) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalCls.g:1939:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getRoleNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:1947:3: this_UNDERSCORE_1= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_1=(Token)match(input,RULE_UNDERSCORE,FOLLOW_2); 

                    			current.merge(this_UNDERSCORE_1);
                    		

                    			newLeafNode(this_UNDERSCORE_1, grammarAccess.getRoleNameAccess().getUNDERSCORETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleRoleName"


    // $ANTLR start "ruleVisibility"
    // InternalCls.g:1958:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
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
            // InternalCls.g:1964:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalCls.g:1965:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalCls.g:1965:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt50=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt50=1;
                }
                break;
            case 40:
                {
                alt50=2;
                }
                break;
            case 41:
                {
                alt50=3;
                }
                break;
            case 42:
                {
                alt50=4;
                }
                break;
            case 43:
                {
                alt50=5;
                }
                break;
            case 44:
                {
                alt50=6;
                }
                break;
            case 45:
                {
                alt50=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalCls.g:1966:3: (enumLiteral_0= '+' )
                    {
                    // InternalCls.g:1966:3: (enumLiteral_0= '+' )
                    // InternalCls.g:1967:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1974:3: (enumLiteral_1= 'public' )
                    {
                    // InternalCls.g:1974:3: (enumLiteral_1= 'public' )
                    // InternalCls.g:1975:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1982:3: (enumLiteral_2= '-' )
                    {
                    // InternalCls.g:1982:3: (enumLiteral_2= '-' )
                    // InternalCls.g:1983:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1990:3: (enumLiteral_3= 'private' )
                    {
                    // InternalCls.g:1990:3: (enumLiteral_3= 'private' )
                    // InternalCls.g:1991:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1998:3: (enumLiteral_4= '#' )
                    {
                    // InternalCls.g:1998:3: (enumLiteral_4= '#' )
                    // InternalCls.g:1999:4: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:2006:3: (enumLiteral_5= 'protected' )
                    {
                    // InternalCls.g:2006:3: (enumLiteral_5= 'protected' )
                    // InternalCls.g:2007:4: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:2014:3: (enumLiteral_6= '~' )
                    {
                    // InternalCls.g:2014:3: (enumLiteral_6= '~' )
                    // InternalCls.g:2015:4: enumLiteral_6= '~'
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


    // $ANTLR start "ruleAggregationKind"
    // InternalCls.g:2025:1: ruleAggregationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) ;
    public final Enumerator ruleAggregationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCls.g:2031:2: ( ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) )
            // InternalCls.g:2032:2: ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            {
            // InternalCls.g:2032:2: ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt51=1;
                }
                break;
            case 47:
                {
                alt51=2;
                }
                break;
            case 48:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalCls.g:2033:3: (enumLiteral_0= 'asc' )
                    {
                    // InternalCls.g:2033:3: (enumLiteral_0= 'asc' )
                    // InternalCls.g:2034:4: enumLiteral_0= 'asc'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:2041:3: (enumLiteral_1= 'agg' )
                    {
                    // InternalCls.g:2041:3: (enumLiteral_1= 'agg' )
                    // InternalCls.g:2042:4: enumLiteral_1= 'agg'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:2049:3: (enumLiteral_2= 'com' )
                    {
                    // InternalCls.g:2049:3: (enumLiteral_2= 'com' )
                    // InternalCls.g:2050:4: enumLiteral_2= 'com'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getCOMPOSITIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAggregationKindAccess().getCOMPOSITIONEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAggregationKind"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\10\24\2\uffff";
    static final String dfa_3s = "\1\55\7\27\2\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\2\10\1\uffff\1\11\17\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\2\10\1\uffff\1\11",
            "\2\10\1\uffff\1\11",
            "\2\10\1\uffff\1\11",
            "\2\10\1\uffff\1\11",
            "\2\10\1\uffff\1\11",
            "\2\10\1\uffff\1\11",
            "\2\10\1\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "501:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\11\5\1\31\2\uffff";
    static final String dfa_9s = "\1\55\7\30\1\5\1\32\2\uffff";
    static final String dfa_10s = "\12\uffff\1\2\1\1";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\11\16\uffff\1\12\3\uffff\1\10\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\11\16\uffff\1\12\3\uffff\1\10",
            "\1\11\16\uffff\1\12\3\uffff\1\10",
            "\1\11\16\uffff\1\12\3\uffff\1\10",
            "\1\11\16\uffff\1\12\3\uffff\1\10",
            "\1\11\16\uffff\1\12\3\uffff\1\10",
            "\1\11\16\uffff\1\12\3\uffff\1\10",
            "\1\11\16\uffff\1\12\3\uffff\1\10",
            "\1\11",
            "\1\13\1\12",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "901:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001FF80E0B4E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001FF80E0B48002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001FF80E0B08002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001C000E0008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001FF80E0B68000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001FF80E0B28000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001C000E0028000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000010002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00003F9001120020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00003F8001120020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001100020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00003F8010000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00003F8018000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00003F8000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001C00080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001900000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000002L});

}