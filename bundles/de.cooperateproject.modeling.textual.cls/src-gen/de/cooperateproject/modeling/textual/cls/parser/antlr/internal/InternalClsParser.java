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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-cls'", "'@end-cls'", "'rootPackage'", "'package'", "'{'", "'}'", "'import'", "'.'", "'abstract'", "'class'", "'as'", "'interface'", "'static'", "'final'", "':'", "'('", "','", "')'", "'isa'", "'impl'", "'bi'", "'role'", "'['", "']'", "'card'", "'note'", "'..'", "'*'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'asc'", "'agg'", "'com'"
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
    // InternalCls.g:72:1: ruleClassDiagram returns [EObject current=null] : ( () otherlv_1= '@start-cls' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cls' ) ;
    public final EObject ruleClassDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_4=null;
        EObject lv_rootPackage_3_0 = null;



        	enterRule();

        try {
            // InternalCls.g:78:2: ( ( () otherlv_1= '@start-cls' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cls' ) )
            // InternalCls.g:79:2: ( () otherlv_1= '@start-cls' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cls' )
            {
            // InternalCls.g:79:2: ( () otherlv_1= '@start-cls' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cls' )
            // InternalCls.g:80:3: () otherlv_1= '@start-cls' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cls'
            {
            // InternalCls.g:80:3: ()
            // InternalCls.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassDiagramAccess().getClassDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDiagramAccess().getStartClsKeyword_1());
            		
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

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getClassDiagramAccess().getEndClsKeyword_4());
            		

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
    // InternalCls.g:143:1: ruleRootPackage returns [EObject current=null] : (otherlv_0= 'rootPackage' ( (lv_name_1_0= ruleFQN ) ) ( (lv_packageImports_2_0= rulePackageImport ) )* ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_connectors_4_0= ruleConnector ) )* ( (lv_packages_5_0= rulePackage ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_packageImports_2_0 = null;

        EObject lv_classifiers_3_0 = null;

        EObject lv_connectors_4_0 = null;

        EObject lv_packages_5_0 = null;



        	enterRule();

        try {
            // InternalCls.g:149:2: ( (otherlv_0= 'rootPackage' ( (lv_name_1_0= ruleFQN ) ) ( (lv_packageImports_2_0= rulePackageImport ) )* ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_connectors_4_0= ruleConnector ) )* ( (lv_packages_5_0= rulePackage ) )* ) )
            // InternalCls.g:150:2: (otherlv_0= 'rootPackage' ( (lv_name_1_0= ruleFQN ) ) ( (lv_packageImports_2_0= rulePackageImport ) )* ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_connectors_4_0= ruleConnector ) )* ( (lv_packages_5_0= rulePackage ) )* )
            {
            // InternalCls.g:150:2: (otherlv_0= 'rootPackage' ( (lv_name_1_0= ruleFQN ) ) ( (lv_packageImports_2_0= rulePackageImport ) )* ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_connectors_4_0= ruleConnector ) )* ( (lv_packages_5_0= rulePackage ) )* )
            // InternalCls.g:151:3: otherlv_0= 'rootPackage' ( (lv_name_1_0= ruleFQN ) ) ( (lv_packageImports_2_0= rulePackageImport ) )* ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_connectors_4_0= ruleConnector ) )* ( (lv_packages_5_0= rulePackage ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRootPackageAccess().getRootPackageKeyword_0());
            		
            // InternalCls.g:155:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalCls.g:156:4: (lv_name_1_0= ruleFQN )
            {
            // InternalCls.g:156:4: (lv_name_1_0= ruleFQN )
            // InternalCls.g:157:5: lv_name_1_0= ruleFQN
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
            						"de.cooperateproject.modeling.textual.cls.Cls.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:174:3: ( (lv_packageImports_2_0= rulePackageImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCls.g:175:4: (lv_packageImports_2_0= rulePackageImport )
            	    {
            	    // InternalCls.g:175:4: (lv_packageImports_2_0= rulePackageImport )
            	    // InternalCls.g:176:5: lv_packageImports_2_0= rulePackageImport
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getPackageImportsPackageImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_packageImports_2_0=rulePackageImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packageImports",
            	    						lv_packageImports_2_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.PackageImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCls.g:193:3: ( (lv_classifiers_3_0= ruleClassifier ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=20)||LA2_0==22||(LA2_0>=39 && LA2_0<=45)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCls.g:194:4: (lv_classifiers_3_0= ruleClassifier )
            	    {
            	    // InternalCls.g:194:4: (lv_classifiers_3_0= ruleClassifier )
            	    // InternalCls.g:195:5: lv_classifiers_3_0= ruleClassifier
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getClassifiersClassifierParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_classifiers_3_0=ruleClassifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classifiers",
            	    						lv_classifiers_3_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Classifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCls.g:212:3: ( (lv_connectors_4_0= ruleConnector ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=29 && LA3_0<=31)||LA3_0==36||(LA3_0>=46 && LA3_0<=48)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCls.g:213:4: (lv_connectors_4_0= ruleConnector )
            	    {
            	    // InternalCls.g:213:4: (lv_connectors_4_0= ruleConnector )
            	    // InternalCls.g:214:5: lv_connectors_4_0= ruleConnector
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getConnectorsConnectorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_connectors_4_0=ruleConnector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectors",
            	    						lv_connectors_4_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Connector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalCls.g:231:3: ( (lv_packages_5_0= rulePackage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCls.g:232:4: (lv_packages_5_0= rulePackage )
            	    {
            	    // InternalCls.g:232:4: (lv_packages_5_0= rulePackage )
            	    // InternalCls.g:233:5: lv_packages_5_0= rulePackage
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getPackagesPackageParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_packages_5_0=rulePackage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packages",
            	    						lv_packages_5_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Package");
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


    // $ANTLR start "entryRulePackage"
    // InternalCls.g:254:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalCls.g:254:48: (iv_rulePackage= rulePackage EOF )
            // InternalCls.g:255:2: iv_rulePackage= rulePackage EOF
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
    // InternalCls.g:261:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' ) ;
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
            // InternalCls.g:267:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' ) )
            // InternalCls.g:268:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' )
            {
            // InternalCls.g:268:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' )
            // InternalCls.g:269:3: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalCls.g:273:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalCls.g:274:4: (lv_name_1_0= ruleFQN )
            {
            // InternalCls.g:274:4: (lv_name_1_0= ruleFQN )
            // InternalCls.g:275:5: lv_name_1_0= ruleFQN
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

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCls.g:296:3: ( (lv_packageImports_3_0= rulePackageImport ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCls.g:297:4: (lv_packageImports_3_0= rulePackageImport )
            	    {
            	    // InternalCls.g:297:4: (lv_packageImports_3_0= rulePackageImport )
            	    // InternalCls.g:298:5: lv_packageImports_3_0= rulePackageImport
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
            	    break loop5;
                }
            } while (true);

            // InternalCls.g:315:3: ( (lv_classifiers_4_0= ruleClassifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=20)||LA6_0==22||(LA6_0>=39 && LA6_0<=45)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCls.g:316:4: (lv_classifiers_4_0= ruleClassifier )
            	    {
            	    // InternalCls.g:316:4: (lv_classifiers_4_0= ruleClassifier )
            	    // InternalCls.g:317:5: lv_classifiers_4_0= ruleClassifier
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
            	    break loop6;
                }
            } while (true);

            // InternalCls.g:334:3: ( (lv_connectors_5_0= ruleConnector ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=29 && LA7_0<=31)||LA7_0==36||(LA7_0>=46 && LA7_0<=48)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCls.g:335:4: (lv_connectors_5_0= ruleConnector )
            	    {
            	    // InternalCls.g:335:4: (lv_connectors_5_0= ruleConnector )
            	    // InternalCls.g:336:5: lv_connectors_5_0= ruleConnector
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
            	    break loop7;
                }
            } while (true);

            // InternalCls.g:353:3: ( (lv_packages_6_0= rulePackage ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCls.g:354:4: (lv_packages_6_0= rulePackage )
            	    {
            	    // InternalCls.g:354:4: (lv_packages_6_0= rulePackage )
            	    // InternalCls.g:355:5: lv_packages_6_0= rulePackage
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
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalCls.g:380:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // InternalCls.g:380:54: (iv_rulePackageImport= rulePackageImport EOF )
            // InternalCls.g:381:2: iv_rulePackageImport= rulePackageImport EOF
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
    // InternalCls.g:387:1: rulePackageImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedPackage_1_0= ruleFQN ) ) ) ;
    public final EObject rulePackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedPackage_1_0 = null;



        	enterRule();

        try {
            // InternalCls.g:393:2: ( (otherlv_0= 'import' ( (lv_importedPackage_1_0= ruleFQN ) ) ) )
            // InternalCls.g:394:2: (otherlv_0= 'import' ( (lv_importedPackage_1_0= ruleFQN ) ) )
            {
            // InternalCls.g:394:2: (otherlv_0= 'import' ( (lv_importedPackage_1_0= ruleFQN ) ) )
            // InternalCls.g:395:3: otherlv_0= 'import' ( (lv_importedPackage_1_0= ruleFQN ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageImportAccess().getImportKeyword_0());
            		
            // InternalCls.g:399:3: ( (lv_importedPackage_1_0= ruleFQN ) )
            // InternalCls.g:400:4: (lv_importedPackage_1_0= ruleFQN )
            {
            // InternalCls.g:400:4: (lv_importedPackage_1_0= ruleFQN )
            // InternalCls.g:401:5: lv_importedPackage_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackageFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedPackage_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageImportRule());
            					}
            					set(
            						current,
            						"importedPackage",
            						lv_importedPackage_1_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.FQN");
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
    // $ANTLR end "rulePackageImport"


    // $ANTLR start "entryRuleFQN"
    // InternalCls.g:422:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCls.g:422:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCls.g:423:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCls.g:429:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCls.g:435:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCls.g:436:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCls.g:436:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCls.g:437:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalCls.g:444:3: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCls.g:445:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCls.g:462:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalCls.g:462:51: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalCls.g:463:2: iv_ruleClassifier= ruleClassifier EOF
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
    // InternalCls.g:469:1: ruleClassifier returns [EObject current=null] : (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Interface_1 = null;



        	enterRule();

        try {
            // InternalCls.g:475:2: ( (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) )
            // InternalCls.g:476:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            {
            // InternalCls.g:476:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalCls.g:477:3: this_Class_0= ruleClass
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
                    // InternalCls.g:486:3: this_Interface_1= ruleInterface
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
    // InternalCls.g:498:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalCls.g:498:46: (iv_ruleClass= ruleClass EOF )
            // InternalCls.g:499:2: iv_ruleClass= ruleClass EOF
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
    // InternalCls.g:505:1: ruleClass returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) (otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_alias_5_0=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_members_8_0 = null;



        	enterRule();

        try {
            // InternalCls.g:511:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) (otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )? ) )
            // InternalCls.g:512:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) (otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )? )
            {
            // InternalCls.g:512:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) (otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )? )
            // InternalCls.g:513:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) (otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )?
            {
            // InternalCls.g:513:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=39 && LA11_0<=45)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCls.g:514:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:514:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:515:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_17);
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

            // InternalCls.g:532:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCls.g:533:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:533:4: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:534:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,19,FOLLOW_18); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
            		
            // InternalCls.g:550:3: ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCls.g:551:4: ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) )
                    {
                    // InternalCls.g:551:4: ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) )
                    // InternalCls.g:552:5: ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) )
                    {
                    // InternalCls.g:552:5: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalCls.g:553:6: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalCls.g:553:6: (lv_name_3_0= RULE_STRING )
                    // InternalCls.g:554:7: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    							newLeafNode(lv_name_3_0, grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getClassAccess().getAsKeyword_3_0_1());
                    				
                    // InternalCls.g:574:5: ( (lv_alias_5_0= RULE_ID ) )
                    // InternalCls.g:575:6: (lv_alias_5_0= RULE_ID )
                    {
                    // InternalCls.g:575:6: (lv_alias_5_0= RULE_ID )
                    // InternalCls.g:576:7: lv_alias_5_0= RULE_ID
                    {
                    lv_alias_5_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(lv_alias_5_0, grammarAccess.getClassAccess().getAliasIDTerminalRuleCall_3_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_5_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:594:4: ( (lv_name_6_0= RULE_ID ) )
                    {
                    // InternalCls.g:594:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalCls.g:595:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalCls.g:595:5: (lv_name_6_0= RULE_ID )
                    // InternalCls.g:596:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCls.g:613:3: (otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCls.g:614:4: otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalCls.g:618:4: ( (lv_members_8_0= ruleMember ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID||LA14_0==19||(LA14_0>=23 && LA14_0<=24)||(LA14_0>=39 && LA14_0<=45)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalCls.g:619:5: (lv_members_8_0= ruleMember )
                    	    {
                    	    // InternalCls.g:619:5: (lv_members_8_0= ruleMember )
                    	    // InternalCls.g:620:6: lv_members_8_0= ruleMember
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_members_8_0=ruleMember();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"members",
                    	    							lv_members_8_0,
                    	    							"de.cooperateproject.modeling.textual.cls.Cls.Member");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_2());
                    			

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
    // InternalCls.g:646:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCls.g:646:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalCls.g:647:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalCls.g:653:1: ruleInterface returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_members_7_0 = null;



        	enterRule();

        try {
            // InternalCls.g:659:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )? ) )
            // InternalCls.g:660:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )? )
            {
            // InternalCls.g:660:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )? )
            // InternalCls.g:661:3: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )?
            {
            // InternalCls.g:661:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=39 && LA16_0<=45)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCls.g:662:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:662:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:663:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getInterfaceAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_23);
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

            otherlv_1=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalCls.g:684:3: ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCls.g:685:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    {
                    // InternalCls.g:685:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    // InternalCls.g:686:5: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    // InternalCls.g:686:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalCls.g:687:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalCls.g:687:6: (lv_name_2_0= RULE_STRING )
                    // InternalCls.g:688:7: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    							newLeafNode(lv_name_2_0, grammarAccess.getInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInterfaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getAsKeyword_2_0_1());
                    				
                    // InternalCls.g:708:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalCls.g:709:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalCls.g:709:6: (lv_alias_4_0= RULE_ID )
                    // InternalCls.g:710:7: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(lv_alias_4_0, grammarAccess.getInterfaceAccess().getAliasIDTerminalRuleCall_2_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInterfaceRule());
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
                case 2 :
                    // InternalCls.g:728:4: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // InternalCls.g:728:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalCls.g:729:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalCls.g:729:5: (lv_name_5_0= RULE_ID )
                    // InternalCls.g:730:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCls.g:747:3: (otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCls.g:748:4: otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalCls.g:752:4: ( (lv_members_7_0= ruleMember ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID||LA18_0==19||(LA18_0>=23 && LA18_0<=24)||(LA18_0>=39 && LA18_0<=45)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalCls.g:753:5: (lv_members_7_0= ruleMember )
                    	    {
                    	    // InternalCls.g:753:5: (lv_members_7_0= ruleMember )
                    	    // InternalCls.g:754:6: lv_members_7_0= ruleMember
                    	    {

                    	    						newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_members_7_0=ruleMember();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"members",
                    	    							lv_members_7_0,
                    	    							"de.cooperateproject.modeling.textual.cls.Cls.Member");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // InternalCls.g:780:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalCls.g:780:47: (iv_ruleMember= ruleMember EOF )
            // InternalCls.g:781:2: iv_ruleMember= ruleMember EOF
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
    // InternalCls.g:787:1: ruleMember returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalCls.g:793:2: ( (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) )
            // InternalCls.g:794:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            {
            // InternalCls.g:794:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalCls.g:795:3: this_Attribute_0= ruleAttribute
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
                    // InternalCls.g:804:3: this_Method_1= ruleMethod
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
    // InternalCls.g:816:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalCls.g:816:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalCls.g:817:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalCls.g:823:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_final_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalCls.g:829:2: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( ( ruleFQN ) ) ) )
            // InternalCls.g:830:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:830:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( ( ruleFQN ) ) )
            // InternalCls.g:831:3: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( ( ruleFQN ) )
            {
            // InternalCls.g:831:3: ()
            // InternalCls.g:832:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalCls.g:838:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=39 && LA21_0<=45)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCls.g:839:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalCls.g:839:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalCls.g:840:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_24);
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

            // InternalCls.g:857:3: ( (lv_static_2_0= 'static' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCls.g:858:4: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:858:4: (lv_static_2_0= 'static' )
                    // InternalCls.g:859:5: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,23,FOLLOW_25); 

                    					newLeafNode(lv_static_2_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:871:3: ( (lv_final_3_0= 'final' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:872:4: (lv_final_3_0= 'final' )
                    {
                    // InternalCls.g:872:4: (lv_final_3_0= 'final' )
                    // InternalCls.g:873:5: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,24,FOLLOW_6); 

                    					newLeafNode(lv_final_3_0, grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:885:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCls.g:886:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCls.g:886:4: (lv_name_4_0= RULE_ID )
            // InternalCls.g:887:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_4_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getColonKeyword_5());
            		
            // InternalCls.g:907:3: ( ( ruleFQN ) )
            // InternalCls.g:908:4: ( ruleFQN )
            {
            // InternalCls.g:908:4: ( ruleFQN )
            // InternalCls.g:909:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_6_0());
            				
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
    // InternalCls.g:927:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalCls.g:927:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalCls.g:928:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalCls.g:934:1: ruleMethod returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_static_2_0=null;
        Token lv_final_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalCls.g:940:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? ) )
            // InternalCls.g:941:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? )
            {
            // InternalCls.g:941:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? )
            // InternalCls.g:942:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )?
            {
            // InternalCls.g:942:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=39 && LA24_0<=45)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCls.g:943:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:943:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:944:5: lv_visibility_0_0= ruleVisibility
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

            // InternalCls.g:961:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:962:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:962:4: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:963:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,19,FOLLOW_24); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:975:3: ( (lv_static_2_0= 'static' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:976:4: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:976:4: (lv_static_2_0= 'static' )
                    // InternalCls.g:977:5: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,23,FOLLOW_25); 

                    					newLeafNode(lv_static_2_0, grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:989:3: ( (lv_final_3_0= 'final' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:990:4: (lv_final_3_0= 'final' )
                    {
                    // InternalCls.g:990:4: (lv_final_3_0= 'final' )
                    // InternalCls.g:991:5: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,24,FOLLOW_6); 

                    					newLeafNode(lv_final_3_0, grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1003:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCls.g:1004:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCls.g:1004:4: (lv_name_4_0= RULE_ID )
            // InternalCls.g:1005:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
            		
            // InternalCls.g:1025:3: ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||(LA29_0>=23 && LA29_0<=24)||(LA29_0>=39 && LA29_0<=45)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCls.g:1026:4: ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    {
            	    // InternalCls.g:1026:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalCls.g:1027:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalCls.g:1027:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalCls.g:1028:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"de.cooperateproject.modeling.textual.cls.Cls.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCls.g:1045:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==27) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalCls.g:1046:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,27,FOLLOW_31); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
            	    	    				
            	    	    // InternalCls.g:1050:5: ( (lv_parameters_8_0= ruleParameter ) )
            	    	    // InternalCls.g:1051:6: (lv_parameters_8_0= ruleParameter )
            	    	    {
            	    	    // InternalCls.g:1051:6: (lv_parameters_8_0= ruleParameter )
            	    	    // InternalCls.g:1052:7: lv_parameters_8_0= ruleParameter
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_30);
            	    	    lv_parameters_8_0=ruleParameter();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"parameters",
            	    	    								lv_parameters_8_0,
            	    	    								"de.cooperateproject.modeling.textual.cls.Cls.Parameter");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_9=(Token)match(input,28,FOLLOW_32); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
            		
            // InternalCls.g:1075:3: (otherlv_10= ':' ( ( ruleFQN ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCls.g:1076:4: otherlv_10= ':' ( ( ruleFQN ) )
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getColonKeyword_8_0());
                    			
                    // InternalCls.g:1080:4: ( ( ruleFQN ) )
                    // InternalCls.g:1081:5: ( ruleFQN )
                    {
                    // InternalCls.g:1081:5: ( ruleFQN )
                    // InternalCls.g:1082:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethodAccess().getTypeClassifierCrossReference_8_1_0());
                    					
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
    // InternalCls.g:1101:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCls.g:1101:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCls.g:1102:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCls.g:1108:1: ruleParameter returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_final_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1114:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ) )
            // InternalCls.g:1115:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:1115:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) )
            // InternalCls.g:1116:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) )
            {
            // InternalCls.g:1116:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=39 && LA31_0<=45)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:1117:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:1117:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:1118:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_24);
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

            // InternalCls.g:1135:3: ( (lv_static_1_0= 'static' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCls.g:1136:4: (lv_static_1_0= 'static' )
                    {
                    // InternalCls.g:1136:4: (lv_static_1_0= 'static' )
                    // InternalCls.g:1137:5: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,23,FOLLOW_25); 

                    					newLeafNode(lv_static_1_0, grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1149:3: ( (lv_final_2_0= 'final' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:1150:4: (lv_final_2_0= 'final' )
                    {
                    // InternalCls.g:1150:4: (lv_final_2_0= 'final' )
                    // InternalCls.g:1151:5: lv_final_2_0= 'final'
                    {
                    lv_final_2_0=(Token)match(input,24,FOLLOW_6); 

                    					newLeafNode(lv_final_2_0, grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1163:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCls.g:1164:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCls.g:1164:4: (lv_name_3_0= RULE_ID )
            // InternalCls.g:1165:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_3_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getColonKeyword_4());
            		
            // InternalCls.g:1185:3: ( ( ruleFQN ) )
            // InternalCls.g:1186:4: ( ruleFQN )
            {
            // InternalCls.g:1186:4: ( ruleFQN )
            // InternalCls.g:1187:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeClassifierCrossReference_5_0());
            				
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
    // InternalCls.g:1205:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCls.g:1205:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCls.g:1206:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalCls.g:1212:1: ruleConnector returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_XtextAssociation_1 = null;

        EObject this_Implementation_2 = null;

        EObject this_CommentLink_3 = null;



        	enterRule();

        try {
            // InternalCls.g:1218:2: ( (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink ) )
            // InternalCls.g:1219:2: (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink )
            {
            // InternalCls.g:1219:2: (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt34=1;
                }
                break;
            case 31:
            case 46:
            case 47:
            case 48:
                {
                alt34=2;
                }
                break;
            case 30:
                {
                alt34=3;
                }
                break;
            case 36:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalCls.g:1220:3: this_Generalization_0= ruleGeneralization
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
                    // InternalCls.g:1229:3: this_XtextAssociation_1= ruleXtextAssociation
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
                    // InternalCls.g:1238:3: this_Implementation_2= ruleImplementation
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getImplementationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Implementation_2=ruleImplementation();

                    state._fsp--;


                    			current = this_Implementation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCls.g:1247:3: this_CommentLink_3= ruleCommentLink
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getCommentLinkParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommentLink_3=ruleCommentLink();

                    state._fsp--;


                    			current = this_CommentLink_3;
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
    // InternalCls.g:1259:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalCls.g:1259:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalCls.g:1260:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalCls.g:1266:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCls.g:1272:2: ( (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) )
            // InternalCls.g:1273:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            {
            // InternalCls.g:1273:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            // InternalCls.g:1274:3: otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsaKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCls.g:1282:3: ( ( ruleFQN ) )
            // InternalCls.g:1283:4: ( ruleFQN )
            {
            // InternalCls.g:1283:4: ( ruleFQN )
            // InternalCls.g:1284:5: ruleFQN
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
            		
            // InternalCls.g:1302:3: ( ( ruleFQN ) )
            // InternalCls.g:1303:4: ( ruleFQN )
            {
            // InternalCls.g:1303:4: ( ruleFQN )
            // InternalCls.g:1304:5: ruleFQN
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

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalCls.g:1326:1: entryRuleImplementation returns [EObject current=null] : iv_ruleImplementation= ruleImplementation EOF ;
    public final EObject entryRuleImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementation = null;


        try {
            // InternalCls.g:1326:55: (iv_ruleImplementation= ruleImplementation EOF )
            // InternalCls.g:1327:2: iv_ruleImplementation= ruleImplementation EOF
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
    // InternalCls.g:1333:1: ruleImplementation returns [EObject current=null] : (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) ;
    public final EObject ruleImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCls.g:1339:2: ( (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) )
            // InternalCls.g:1340:2: (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            {
            // InternalCls.g:1340:2: (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            // InternalCls.g:1341:3: otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementationAccess().getImplKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCls.g:1349:3: ( ( ruleFQN ) )
            // InternalCls.g:1350:4: ( ruleFQN )
            {
            // InternalCls.g:1350:4: ( ruleFQN )
            // InternalCls.g:1351:5: ruleFQN
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
            		
            // InternalCls.g:1369:3: ( ( ruleFQN ) )
            // InternalCls.g:1370:4: ( ruleFQN )
            {
            // InternalCls.g:1370:4: ( ruleFQN )
            // InternalCls.g:1371:5: ruleFQN
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

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getImplementationAccess().getRightParenthesisKeyword_5());
            		

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


    // $ANTLR start "entryRuleCommentLink"
    // InternalCls.g:1393:1: entryRuleCommentLink returns [EObject current=null] : iv_ruleCommentLink= ruleCommentLink EOF ;
    public final EObject entryRuleCommentLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentLink = null;


        try {
            // InternalCls.g:1393:52: (iv_ruleCommentLink= ruleCommentLink EOF )
            // InternalCls.g:1394:2: iv_ruleCommentLink= ruleCommentLink EOF
            {
             newCompositeNode(grammarAccess.getCommentLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentLink=ruleCommentLink();

            state._fsp--;

             current =iv_ruleCommentLink; 
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
    // $ANTLR end "entryRuleCommentLink"


    // $ANTLR start "ruleCommentLink"
    // InternalCls.g:1400:1: ruleCommentLink returns [EObject current=null] : ( ( (lv_comments_0_0= ruleComment ) ) ( ( ruleFQN ) ) ) ;
    public final EObject ruleCommentLink() throws RecognitionException {
        EObject current = null;

        EObject lv_comments_0_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1406:2: ( ( ( (lv_comments_0_0= ruleComment ) ) ( ( ruleFQN ) ) ) )
            // InternalCls.g:1407:2: ( ( (lv_comments_0_0= ruleComment ) ) ( ( ruleFQN ) ) )
            {
            // InternalCls.g:1407:2: ( ( (lv_comments_0_0= ruleComment ) ) ( ( ruleFQN ) ) )
            // InternalCls.g:1408:3: ( (lv_comments_0_0= ruleComment ) ) ( ( ruleFQN ) )
            {
            // InternalCls.g:1408:3: ( (lv_comments_0_0= ruleComment ) )
            // InternalCls.g:1409:4: (lv_comments_0_0= ruleComment )
            {
            // InternalCls.g:1409:4: (lv_comments_0_0= ruleComment )
            // InternalCls.g:1410:5: lv_comments_0_0= ruleComment
            {

            					newCompositeNode(grammarAccess.getCommentLinkAccess().getCommentsCommentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_comments_0_0=ruleComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentLinkRule());
            					}
            					add(
            						current,
            						"comments",
            						lv_comments_0_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.Comment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:1427:3: ( ( ruleFQN ) )
            // InternalCls.g:1428:4: ( ruleFQN )
            {
            // InternalCls.g:1428:4: ( ruleFQN )
            // InternalCls.g:1429:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommentLinkAccess().getCommentedElementClassifierCrossReference_1_0());
            				
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
    // $ANTLR end "ruleCommentLink"


    // $ANTLR start "entryRuleXtextAssociation"
    // InternalCls.g:1447:1: entryRuleXtextAssociation returns [EObject current=null] : iv_ruleXtextAssociation= ruleXtextAssociation EOF ;
    public final EObject entryRuleXtextAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXtextAssociation = null;


        try {
            // InternalCls.g:1447:57: (iv_ruleXtextAssociation= ruleXtextAssociation EOF )
            // InternalCls.g:1448:2: iv_ruleXtextAssociation= ruleXtextAssociation EOF
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
    // InternalCls.g:1454:1: ruleXtextAssociation returns [EObject current=null] : ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= RULE_ID ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? ) ;
    public final EObject ruleXtextAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_twoSideBidirectionality_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_memberEndNames_10_0=null;
        Token otherlv_11=null;
        Token lv_memberEndNames_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_twoSideAggregationKind_1_0 = null;

        EObject lv_memberEndCardinalities_16_0 = null;

        EObject lv_memberEndCardinalities_18_0 = null;

        EObject lv_comments_20_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1460:2: ( ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= RULE_ID ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? ) )
            // InternalCls.g:1461:2: ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= RULE_ID ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? )
            {
            // InternalCls.g:1461:2: ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= RULE_ID ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? )
            // InternalCls.g:1462:3: ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= RULE_ID ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )?
            {
            // InternalCls.g:1462:3: ( (lv_twoSideBidirectionality_0_0= 'bi' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:1463:4: (lv_twoSideBidirectionality_0_0= 'bi' )
                    {
                    // InternalCls.g:1463:4: (lv_twoSideBidirectionality_0_0= 'bi' )
                    // InternalCls.g:1464:5: lv_twoSideBidirectionality_0_0= 'bi'
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

            // InternalCls.g:1476:3: ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) )
            // InternalCls.g:1477:4: (lv_twoSideAggregationKind_1_0= ruleAggregationKind )
            {
            // InternalCls.g:1477:4: (lv_twoSideAggregationKind_1_0= ruleAggregationKind )
            // InternalCls.g:1478:5: lv_twoSideAggregationKind_1_0= ruleAggregationKind
            {

            					newCompositeNode(grammarAccess.getXtextAssociationAccess().getTwoSideAggregationKindAggregationKindEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalCls.g:1495:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCls.g:1496:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCls.g:1496:4: (lv_name_2_0= RULE_ID )
            // InternalCls.g:1497:5: lv_name_2_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getXtextAssociationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCls.g:1517:3: ( ( ruleFQN ) )
            // InternalCls.g:1518:4: ( ruleFQN )
            {
            // InternalCls.g:1518:4: ( ruleFQN )
            // InternalCls.g:1519:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXtextAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndTypesClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_36);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:1533:3: (otherlv_5= ',' ( ( ruleFQN ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==27) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalCls.g:1534:4: otherlv_5= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getXtextAssociationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCls.g:1538:4: ( ( ruleFQN ) )
            	    // InternalCls.g:1539:5: ( ruleFQN )
            	    {
            	    // InternalCls.g:1539:5: ( ruleFQN )
            	    // InternalCls.g:1540:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getXtextAssociationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndTypesClassifierCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    ruleFQN();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FOLLOW_37); 

            			newLeafNode(otherlv_7, grammarAccess.getXtextAssociationAccess().getRightParenthesisKeyword_6());
            		
            // InternalCls.g:1559:3: (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= RULE_ID ) ) )* otherlv_13= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:1560:4: otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= RULE_ID ) ) )* otherlv_13= ']'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getXtextAssociationAccess().getRoleKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalCls.g:1568:4: ( (lv_memberEndNames_10_0= RULE_ID ) )
                    // InternalCls.g:1569:5: (lv_memberEndNames_10_0= RULE_ID )
                    {
                    // InternalCls.g:1569:5: (lv_memberEndNames_10_0= RULE_ID )
                    // InternalCls.g:1570:6: lv_memberEndNames_10_0= RULE_ID
                    {
                    lv_memberEndNames_10_0=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(lv_memberEndNames_10_0, grammarAccess.getXtextAssociationAccess().getMemberEndNamesIDTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXtextAssociationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"memberEndNames",
                    							lv_memberEndNames_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalCls.g:1586:4: (otherlv_11= ',' ( (lv_memberEndNames_12_0= RULE_ID ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==27) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalCls.g:1587:5: otherlv_11= ',' ( (lv_memberEndNames_12_0= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,27,FOLLOW_6); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getXtextAssociationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCls.g:1591:5: ( (lv_memberEndNames_12_0= RULE_ID ) )
                    	    // InternalCls.g:1592:6: (lv_memberEndNames_12_0= RULE_ID )
                    	    {
                    	    // InternalCls.g:1592:6: (lv_memberEndNames_12_0= RULE_ID )
                    	    // InternalCls.g:1593:7: lv_memberEndNames_12_0= RULE_ID
                    	    {
                    	    lv_memberEndNames_12_0=(Token)match(input,RULE_ID,FOLLOW_39); 

                    	    							newLeafNode(lv_memberEndNames_12_0, grammarAccess.getXtextAssociationAccess().getMemberEndNamesIDTerminalRuleCall_7_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getXtextAssociationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"memberEndNames",
                    	    								lv_memberEndNames_12_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,34,FOLLOW_40); 

                    				newLeafNode(otherlv_13, grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCls.g:1615:3: (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCls.g:1616:4: otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']'
                    {
                    otherlv_14=(Token)match(input,35,FOLLOW_38); 

                    				newLeafNode(otherlv_14, grammarAccess.getXtextAssociationAccess().getCardKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,33,FOLLOW_41); 

                    				newLeafNode(otherlv_15, grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalCls.g:1624:4: ( (lv_memberEndCardinalities_16_0= ruleCardinality ) )
                    // InternalCls.g:1625:5: (lv_memberEndCardinalities_16_0= ruleCardinality )
                    {
                    // InternalCls.g:1625:5: (lv_memberEndCardinalities_16_0= ruleCardinality )
                    // InternalCls.g:1626:6: lv_memberEndCardinalities_16_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_42);
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

                    // InternalCls.g:1643:4: (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==25) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalCls.g:1644:5: otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) )
                    	    {
                    	    otherlv_17=(Token)match(input,25,FOLLOW_41); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getXtextAssociationAccess().getColonKeyword_8_3_0());
                    	    				
                    	    // InternalCls.g:1648:5: ( (lv_memberEndCardinalities_18_0= ruleCardinality ) )
                    	    // InternalCls.g:1649:6: (lv_memberEndCardinalities_18_0= ruleCardinality )
                    	    {
                    	    // InternalCls.g:1649:6: (lv_memberEndCardinalities_18_0= ruleCardinality )
                    	    // InternalCls.g:1650:7: lv_memberEndCardinalities_18_0= ruleCardinality
                    	    {

                    	    							newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,34,FOLLOW_43); 

                    				newLeafNode(otherlv_19, grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCls.g:1673:3: ( (lv_comments_20_0= ruleComment ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_STRING) ) {
                    int LA41_3 = input.LA(3);

                    if ( (LA41_3==EOF||LA41_3==12||LA41_3==14||LA41_3==16||(LA41_3>=29 && LA41_3<=31)||LA41_3==36||(LA41_3>=46 && LA41_3<=48)) ) {
                        alt41=1;
                    }
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalCls.g:1674:4: (lv_comments_20_0= ruleComment )
                    {
                    // InternalCls.g:1674:4: (lv_comments_20_0= ruleComment )
                    // InternalCls.g:1675:5: lv_comments_20_0= ruleComment
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


    // $ANTLR start "entryRuleComment"
    // InternalCls.g:1696:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalCls.g:1696:48: (iv_ruleComment= ruleComment EOF )
            // InternalCls.g:1697:2: iv_ruleComment= ruleComment EOF
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
    // InternalCls.g:1703:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1709:2: ( (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) )
            // InternalCls.g:1710:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            {
            // InternalCls.g:1710:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            // InternalCls.g:1711:3: otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
            		
            // InternalCls.g:1715:3: ( (lv_body_1_0= ruleCommentBody ) )
            // InternalCls.g:1716:4: (lv_body_1_0= ruleCommentBody )
            {
            // InternalCls.g:1716:4: (lv_body_1_0= ruleCommentBody )
            // InternalCls.g:1717:5: lv_body_1_0= ruleCommentBody
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
    // InternalCls.g:1738:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalCls.g:1738:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalCls.g:1739:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalCls.g:1745:1: ruleCardinality returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1751:2: ( ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) )
            // InternalCls.g:1752:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            {
            // InternalCls.g:1752:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            // InternalCls.g:1753:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            {
            // InternalCls.g:1753:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) )
            // InternalCls.g:1754:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            {
            // InternalCls.g:1754:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            // InternalCls.g:1755:5: lv_lowerBound_0_0= ruleCardinalityBound
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalCls.g:1772:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCls.g:1773:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_41); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalCls.g:1777:4: ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    // InternalCls.g:1778:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    {
                    // InternalCls.g:1778:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    // InternalCls.g:1779:6: lv_upperBound_2_0= ruleCardinalityBound
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
    // InternalCls.g:1801:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalCls.g:1801:51: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalCls.g:1802:2: iv_ruleCommentBody= ruleCommentBody EOF
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
    // InternalCls.g:1808:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCls.g:1814:2: (this_STRING_0= RULE_STRING )
            // InternalCls.g:1815:2: this_STRING_0= RULE_STRING
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
    // InternalCls.g:1825:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // InternalCls.g:1825:56: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // InternalCls.g:1826:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
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
    // InternalCls.g:1832:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCls.g:1838:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalCls.g:1839:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalCls.g:1839:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_INT) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalCls.g:1840:3: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:1846:3: this_INT_1= RULE_INT
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


    // $ANTLR start "ruleVisibility"
    // InternalCls.g:1857:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
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
            // InternalCls.g:1863:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalCls.g:1864:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalCls.g:1864:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt44=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt44=1;
                }
                break;
            case 40:
                {
                alt44=2;
                }
                break;
            case 41:
                {
                alt44=3;
                }
                break;
            case 42:
                {
                alt44=4;
                }
                break;
            case 43:
                {
                alt44=5;
                }
                break;
            case 44:
                {
                alt44=6;
                }
                break;
            case 45:
                {
                alt44=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalCls.g:1865:3: (enumLiteral_0= '+' )
                    {
                    // InternalCls.g:1865:3: (enumLiteral_0= '+' )
                    // InternalCls.g:1866:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1873:3: (enumLiteral_1= 'public' )
                    {
                    // InternalCls.g:1873:3: (enumLiteral_1= 'public' )
                    // InternalCls.g:1874:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1881:3: (enumLiteral_2= '-' )
                    {
                    // InternalCls.g:1881:3: (enumLiteral_2= '-' )
                    // InternalCls.g:1882:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1889:3: (enumLiteral_3= 'private' )
                    {
                    // InternalCls.g:1889:3: (enumLiteral_3= 'private' )
                    // InternalCls.g:1890:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1897:3: (enumLiteral_4= '#' )
                    {
                    // InternalCls.g:1897:3: (enumLiteral_4= '#' )
                    // InternalCls.g:1898:4: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:1905:3: (enumLiteral_5= 'protected' )
                    {
                    // InternalCls.g:1905:3: (enumLiteral_5= 'protected' )
                    // InternalCls.g:1906:4: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:1913:3: (enumLiteral_6= '~' )
                    {
                    // InternalCls.g:1913:3: (enumLiteral_6= '~' )
                    // InternalCls.g:1914:4: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

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


    // $ANTLR start "ruleAggregationKind"
    // InternalCls.g:1924:1: ruleAggregationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) ;
    public final Enumerator ruleAggregationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCls.g:1930:2: ( ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) )
            // InternalCls.g:1931:2: ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            {
            // InternalCls.g:1931:2: ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt45=1;
                }
                break;
            case 47:
                {
                alt45=2;
                }
                break;
            case 48:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalCls.g:1932:3: (enumLiteral_0= 'asc' )
                    {
                    // InternalCls.g:1932:3: (enumLiteral_0= 'asc' )
                    // InternalCls.g:1933:4: enumLiteral_0= 'asc'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1940:3: (enumLiteral_1= 'agg' )
                    {
                    // InternalCls.g:1940:3: (enumLiteral_1= 'agg' )
                    // InternalCls.g:1941:4: enumLiteral_1= 'agg'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1948:3: (enumLiteral_2= 'com' )
                    {
                    // InternalCls.g:1948:3: (enumLiteral_2= 'com' )
                    // InternalCls.g:1949:4: enumLiteral_2= 'com'
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


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\10\23\2\uffff";
    static final String dfa_3s = "\1\55\7\26\2\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\2\10\1\uffff\1\11\20\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "476:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\12\5\1\31\2\uffff";
    static final String dfa_9s = "\1\55\10\30\1\5\1\32\2\uffff";
    static final String dfa_10s = "\13\uffff\1\2\1\1";
    static final String dfa_11s = "\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\12\15\uffff\1\13\3\uffff\1\10\1\11\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\12\15\uffff\1\13\3\uffff\1\10\1\11",
            "\1\12\15\uffff\1\13\3\uffff\1\10\1\11",
            "\1\12\15\uffff\1\13\3\uffff\1\10\1\11",
            "\1\12\15\uffff\1\13\3\uffff\1\10\1\11",
            "\1\12\15\uffff\1\13\3\uffff\1\10\1\11",
            "\1\12\15\uffff\1\13\3\uffff\1\10\1\11",
            "\1\12\15\uffff\1\13\3\uffff\1\10\1\11",
            "\1\12\22\uffff\1\11",
            "\1\12",
            "\1\14\1\13",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "794:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001FF90E05A4002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001FF90E0584002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001C010E0004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001FF90E05B4000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001FF90E0594000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001C010E0014000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00003F8001890020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001800020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001880020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00003F8011800020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00003F8019800020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00003F8001800020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001C00080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001C019E0000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001C018E0000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001C010E0000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000002L});

}