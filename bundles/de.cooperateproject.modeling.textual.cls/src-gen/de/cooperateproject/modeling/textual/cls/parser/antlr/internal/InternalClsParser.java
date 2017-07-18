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
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

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

                if ( (LA1_0==18) ) {
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

                if ( ((LA2_0>=20 && LA2_0<=21)||LA2_0==23||(LA2_0>=39 && LA2_0<=45)) ) {
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

                if ( ((LA3_0>=29 && LA3_0<=31)||(LA3_0>=46 && LA3_0<=48)) ) {
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

                if ( (LA4_0==15) ) {
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
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCls.g:296:3: ( (lv_packageImports_3_0= rulePackageImport ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
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

                if ( ((LA6_0>=20 && LA6_0<=21)||LA6_0==23||(LA6_0>=39 && LA6_0<=45)) ) {
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

                if ( ((LA7_0>=29 && LA7_0<=31)||(LA7_0>=46 && LA7_0<=48)) ) {
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

                if ( (LA8_0==15) ) {
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
    // InternalCls.g:387:1: rulePackageImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleFQN ) ) ) ;
    public final EObject rulePackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCls.g:393:2: ( (otherlv_0= 'import' ( ( ruleFQN ) ) ) )
            // InternalCls.g:394:2: (otherlv_0= 'import' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:394:2: (otherlv_0= 'import' ( ( ruleFQN ) ) )
            // InternalCls.g:395:3: otherlv_0= 'import' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageImportAccess().getImportKeyword_0());
            		
            // InternalCls.g:399:3: ( ( ruleFQN ) )
            // InternalCls.g:400:4: ( ruleFQN )
            {
            // InternalCls.g:400:4: ( ruleFQN )
            // InternalCls.g:401:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageImportRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_1_0());
            				
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
    // $ANTLR end "rulePackageImport"


    // $ANTLR start "entryRuleFQN"
    // InternalCls.g:419:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCls.g:419:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCls.g:420:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCls.g:426:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCls.g:432:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCls.g:433:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCls.g:433:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCls.g:434:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalCls.g:441:3: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCls.g:442:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_6); 

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
    // InternalCls.g:459:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalCls.g:459:51: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalCls.g:460:2: iv_ruleClassifier= ruleClassifier EOF
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
    // InternalCls.g:466:1: ruleClassifier returns [EObject current=null] : (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Interface_1 = null;



        	enterRule();

        try {
            // InternalCls.g:472:2: ( (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) )
            // InternalCls.g:473:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            {
            // InternalCls.g:473:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalCls.g:474:3: this_Class_0= ruleClass
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
                    // InternalCls.g:483:3: this_Interface_1= ruleInterface
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
    // InternalCls.g:495:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalCls.g:495:46: (iv_ruleClass= ruleClass EOF )
            // InternalCls.g:496:2: iv_ruleClass= ruleClass EOF
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
    // InternalCls.g:502:1: ruleClass returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_alias_5_0=null;
        Token lv_name_6_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_comments_9_0 = null;

        EObject lv_members_10_0 = null;



        	enterRule();

        try {
            // InternalCls.g:508:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) ) )
            // InternalCls.g:509:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) )
            {
            // InternalCls.g:509:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) )
            // InternalCls.g:510:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) )
            {
            // InternalCls.g:510:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=39 && LA11_0<=45)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCls.g:511:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:511:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:512:5: lv_visibility_0_0= ruleVisibility
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

            // InternalCls.g:529:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCls.g:530:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:530:4: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:531:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,20,FOLLOW_18); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
            		
            // InternalCls.g:547:3: ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) )
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
                    // InternalCls.g:548:4: ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) )
                    {
                    // InternalCls.g:548:4: ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) )
                    // InternalCls.g:549:5: ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) )
                    {
                    // InternalCls.g:549:5: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalCls.g:550:6: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalCls.g:550:6: (lv_name_3_0= RULE_STRING )
                    // InternalCls.g:551:7: lv_name_3_0= RULE_STRING
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

                    otherlv_4=(Token)match(input,22,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getClassAccess().getAsKeyword_3_0_1());
                    				
                    // InternalCls.g:571:5: ( (lv_alias_5_0= RULE_ID ) )
                    // InternalCls.g:572:6: (lv_alias_5_0= RULE_ID )
                    {
                    // InternalCls.g:572:6: (lv_alias_5_0= RULE_ID )
                    // InternalCls.g:573:7: lv_alias_5_0= RULE_ID
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
                    								"de.cooperateproject.modeling.textual.cls.Cls.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:591:4: ( (lv_name_6_0= RULE_ID ) )
                    {
                    // InternalCls.g:591:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalCls.g:592:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalCls.g:592:5: (lv_name_6_0= RULE_ID )
                    // InternalCls.g:593:6: lv_name_6_0= RULE_ID
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
                    							"de.cooperateproject.modeling.textual.cls.Cls.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCls.g:610:3: ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EOF||LA17_0==13||LA17_0==15||LA17_0==17||(LA17_0>=20 && LA17_0<=21)||LA17_0==23||(LA17_0>=29 && LA17_0<=31)||LA17_0==36||(LA17_0>=39 && LA17_0<=48)) ) {
                alt17=1;
            }
            else if ( (LA17_0==16) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCls.g:611:4: ( (lv_comments_7_0= ruleComment ) )?
                    {
                    // InternalCls.g:611:4: ( (lv_comments_7_0= ruleComment ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==36) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalCls.g:612:5: (lv_comments_7_0= ruleComment )
                            {
                            // InternalCls.g:612:5: (lv_comments_7_0= ruleComment )
                            // InternalCls.g:613:6: lv_comments_7_0= ruleComment
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
                    // InternalCls.g:631:4: (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )
                    {
                    // InternalCls.g:631:4: (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )
                    // InternalCls.g:632:5: otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_22); 

                    					newLeafNode(otherlv_8, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalCls.g:636:5: ( (lv_comments_9_0= ruleComment ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==36) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalCls.g:637:6: (lv_comments_9_0= ruleComment )
                            {
                            // InternalCls.g:637:6: (lv_comments_9_0= ruleComment )
                            // InternalCls.g:638:7: lv_comments_9_0= ruleComment
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

                    // InternalCls.g:655:5: ( (lv_members_10_0= ruleMember ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID||LA16_0==20||LA16_0==24||(LA16_0>=39 && LA16_0<=45)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCls.g:656:6: (lv_members_10_0= ruleMember )
                    	    {
                    	    // InternalCls.g:656:6: (lv_members_10_0= ruleMember )
                    	    // InternalCls.g:657:7: lv_members_10_0= ruleMember
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
                    	    break loop16;
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
    // InternalCls.g:684:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCls.g:684:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalCls.g:685:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalCls.g:691:1: ruleInterface returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_comments_6_0 = null;

        EObject lv_comments_8_0 = null;

        EObject lv_members_9_0 = null;



        	enterRule();

        try {
            // InternalCls.g:697:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) ) ) )
            // InternalCls.g:698:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) ) )
            {
            // InternalCls.g:698:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) ) )
            // InternalCls.g:699:3: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) )
            {
            // InternalCls.g:699:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=39 && LA18_0<=45)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCls.g:700:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:700:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:701:5: lv_visibility_0_0= ruleVisibility
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

            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalCls.g:722:3: ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCls.g:723:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    {
                    // InternalCls.g:723:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    // InternalCls.g:724:5: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    // InternalCls.g:724:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalCls.g:725:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalCls.g:725:6: (lv_name_2_0= RULE_STRING )
                    // InternalCls.g:726:7: lv_name_2_0= RULE_STRING
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

                    otherlv_3=(Token)match(input,22,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getAsKeyword_2_0_1());
                    				
                    // InternalCls.g:746:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalCls.g:747:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalCls.g:747:6: (lv_alias_4_0= RULE_ID )
                    // InternalCls.g:748:7: lv_alias_4_0= RULE_ID
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
                    								"de.cooperateproject.modeling.textual.cls.Cls.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:766:4: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // InternalCls.g:766:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalCls.g:767:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalCls.g:767:5: (lv_name_5_0= RULE_ID )
                    // InternalCls.g:768:6: lv_name_5_0= RULE_ID
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
                    							"de.cooperateproject.modeling.textual.cls.Cls.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCls.g:785:3: ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EOF||LA23_0==13||LA23_0==15||LA23_0==17||(LA23_0>=20 && LA23_0<=21)||LA23_0==23||(LA23_0>=29 && LA23_0<=31)||LA23_0==36||(LA23_0>=39 && LA23_0<=48)) ) {
                alt23=1;
            }
            else if ( (LA23_0==16) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:786:4: ( (lv_comments_6_0= ruleComment ) )?
                    {
                    // InternalCls.g:786:4: ( (lv_comments_6_0= ruleComment ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==36) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalCls.g:787:5: (lv_comments_6_0= ruleComment )
                            {
                            // InternalCls.g:787:5: (lv_comments_6_0= ruleComment )
                            // InternalCls.g:788:6: lv_comments_6_0= ruleComment
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
                    // InternalCls.g:806:4: (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' )
                    {
                    // InternalCls.g:806:4: (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' )
                    // InternalCls.g:807:5: otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_22); 

                    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalCls.g:811:5: ( (lv_comments_8_0= ruleComment ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==36) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalCls.g:812:6: (lv_comments_8_0= ruleComment )
                            {
                            // InternalCls.g:812:6: (lv_comments_8_0= ruleComment )
                            // InternalCls.g:813:7: lv_comments_8_0= ruleComment
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

                    // InternalCls.g:830:5: ( (lv_members_9_0= ruleMember ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID||LA22_0==20||LA22_0==24||(LA22_0>=39 && LA22_0<=45)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalCls.g:831:6: (lv_members_9_0= ruleMember )
                    	    {
                    	    // InternalCls.g:831:6: (lv_members_9_0= ruleMember )
                    	    // InternalCls.g:832:7: lv_members_9_0= ruleMember
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
                    	    break loop22;
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
    // InternalCls.g:859:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalCls.g:859:47: (iv_ruleMember= ruleMember EOF )
            // InternalCls.g:860:2: iv_ruleMember= ruleMember EOF
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
    // InternalCls.g:866:1: ruleMember returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalCls.g:872:2: ( (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) )
            // InternalCls.g:873:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            {
            // InternalCls.g:873:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalCls.g:874:3: this_Attribute_0= ruleAttribute
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
                    // InternalCls.g:883:3: this_Method_1= ruleMethod
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
    // InternalCls.g:895:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalCls.g:895:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalCls.g:896:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalCls.g:902:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalCls.g:908:2: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ) )
            // InternalCls.g:909:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:909:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) )
            // InternalCls.g:910:3: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) )
            {
            // InternalCls.g:910:3: ()
            // InternalCls.g:911:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalCls.g:917:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=39 && LA25_0<=45)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:918:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalCls.g:918:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalCls.g:919:5: lv_visibility_1_0= ruleVisibility
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

            // InternalCls.g:936:3: ( (lv_static_2_0= 'static' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:937:4: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:937:4: (lv_static_2_0= 'static' )
                    // InternalCls.g:938:5: lv_static_2_0= 'static'
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

            // InternalCls.g:950:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCls.g:951:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCls.g:951:4: (lv_name_3_0= RULE_ID )
            // InternalCls.g:952:5: lv_name_3_0= RULE_ID
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
            		
            // InternalCls.g:972:3: ( ( ruleFQN ) )
            // InternalCls.g:973:4: ( ruleFQN )
            {
            // InternalCls.g:973:4: ( ruleFQN )
            // InternalCls.g:974:5: ruleFQN
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
    // InternalCls.g:992:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalCls.g:992:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalCls.g:993:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalCls.g:999:1: ruleMethod returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )* otherlv_8= ')' (otherlv_9= ':' ( ( ruleFQN ) ) )? ) ;
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
            // InternalCls.g:1005:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )* otherlv_8= ')' (otherlv_9= ':' ( ( ruleFQN ) ) )? ) )
            // InternalCls.g:1006:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )* otherlv_8= ')' (otherlv_9= ':' ( ( ruleFQN ) ) )? )
            {
            // InternalCls.g:1006:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )* otherlv_8= ')' (otherlv_9= ':' ( ( ruleFQN ) ) )? )
            // InternalCls.g:1007:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )* otherlv_8= ')' (otherlv_9= ':' ( ( ruleFQN ) ) )?
            {
            // InternalCls.g:1007:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=39 && LA27_0<=45)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:1008:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:1008:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:1009:5: lv_visibility_0_0= ruleVisibility
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

            // InternalCls.g:1026:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:1027:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:1027:4: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:1028:5: lv_abstract_1_0= 'abstract'
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

            // InternalCls.g:1040:3: ( (lv_static_2_0= 'static' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:1041:4: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:1041:4: (lv_static_2_0= 'static' )
                    // InternalCls.g:1042:5: lv_static_2_0= 'static'
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

            // InternalCls.g:1054:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCls.g:1055:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCls.g:1055:4: (lv_name_3_0= RULE_ID )
            // InternalCls.g:1056:5: lv_name_3_0= RULE_ID
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
            		
            // InternalCls.g:1076:3: ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=39 && LA31_0<=45)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCls.g:1077:4: ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
            	    {
            	    // InternalCls.g:1077:4: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalCls.g:1078:5: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalCls.g:1078:5: (lv_parameters_5_0= ruleParameter )
            	    // InternalCls.g:1079:6: lv_parameters_5_0= ruleParameter
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

            	    // InternalCls.g:1096:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==27) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalCls.g:1097:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,27,FOLLOW_31); 

            	    	    					newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getCommaKeyword_5_1_0());
            	    	    				
            	    	    // InternalCls.g:1101:5: ( (lv_parameters_7_0= ruleParameter ) )
            	    	    // InternalCls.g:1102:6: (lv_parameters_7_0= ruleParameter )
            	    	    {
            	    	    // InternalCls.g:1102:6: (lv_parameters_7_0= ruleParameter )
            	    	    // InternalCls.g:1103:7: lv_parameters_7_0= ruleParameter
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
            	    	    break loop30;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getRightParenthesisKeyword_6());
            		
            // InternalCls.g:1126:3: (otherlv_9= ':' ( ( ruleFQN ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCls.g:1127:4: otherlv_9= ':' ( ( ruleFQN ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getColonKeyword_7_0());
                    			
                    // InternalCls.g:1131:4: ( ( ruleFQN ) )
                    // InternalCls.g:1132:5: ( ruleFQN )
                    {
                    // InternalCls.g:1132:5: ( ruleFQN )
                    // InternalCls.g:1133:6: ruleFQN
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
    // InternalCls.g:1152:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCls.g:1152:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCls.g:1153:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCls.g:1159:1: ruleParameter returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1165:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) )
            // InternalCls.g:1166:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:1166:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) )
            // InternalCls.g:1167:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) )
            {
            // InternalCls.g:1167:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=39 && LA33_0<=45)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:1168:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:1168:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:1169:5: lv_visibility_0_0= ruleVisibility
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

            // InternalCls.g:1186:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCls.g:1187:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCls.g:1187:4: (lv_name_1_0= RULE_ID )
            // InternalCls.g:1188:5: lv_name_1_0= RULE_ID
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
            		
            // InternalCls.g:1208:3: ( ( ruleFQN ) )
            // InternalCls.g:1209:4: ( ruleFQN )
            {
            // InternalCls.g:1209:4: ( ruleFQN )
            // InternalCls.g:1210:5: ruleFQN
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
    // InternalCls.g:1228:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCls.g:1228:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCls.g:1229:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalCls.g:1235:1: ruleConnector returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_XtextAssociation_1 = null;

        EObject this_Implementation_2 = null;



        	enterRule();

        try {
            // InternalCls.g:1241:2: ( (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation ) )
            // InternalCls.g:1242:2: (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation )
            {
            // InternalCls.g:1242:2: (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation )
            int alt34=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalCls.g:1243:3: this_Generalization_0= ruleGeneralization
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
                    // InternalCls.g:1252:3: this_XtextAssociation_1= ruleXtextAssociation
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
                    // InternalCls.g:1261:3: this_Implementation_2= ruleImplementation
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
    // InternalCls.g:1273:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalCls.g:1273:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalCls.g:1274:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalCls.g:1280:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCls.g:1286:2: ( (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) )
            // InternalCls.g:1287:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            {
            // InternalCls.g:1287:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            // InternalCls.g:1288:3: otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsaKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCls.g:1296:3: ( ( ruleFQN ) )
            // InternalCls.g:1297:4: ( ruleFQN )
            {
            // InternalCls.g:1297:4: ( ruleFQN )
            // InternalCls.g:1298:5: ruleFQN
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
            		
            // InternalCls.g:1316:3: ( ( ruleFQN ) )
            // InternalCls.g:1317:4: ( ruleFQN )
            {
            // InternalCls.g:1317:4: ( ruleFQN )
            // InternalCls.g:1318:5: ruleFQN
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
    // InternalCls.g:1340:1: entryRuleImplementation returns [EObject current=null] : iv_ruleImplementation= ruleImplementation EOF ;
    public final EObject entryRuleImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementation = null;


        try {
            // InternalCls.g:1340:55: (iv_ruleImplementation= ruleImplementation EOF )
            // InternalCls.g:1341:2: iv_ruleImplementation= ruleImplementation EOF
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
    // InternalCls.g:1347:1: ruleImplementation returns [EObject current=null] : (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) ;
    public final EObject ruleImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCls.g:1353:2: ( (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) )
            // InternalCls.g:1354:2: (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            {
            // InternalCls.g:1354:2: (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            // InternalCls.g:1355:3: otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementationAccess().getImplKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCls.g:1363:3: ( ( ruleFQN ) )
            // InternalCls.g:1364:4: ( ruleFQN )
            {
            // InternalCls.g:1364:4: ( ruleFQN )
            // InternalCls.g:1365:5: ruleFQN
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
            		
            // InternalCls.g:1383:3: ( ( ruleFQN ) )
            // InternalCls.g:1384:4: ( ruleFQN )
            {
            // InternalCls.g:1384:4: ( ruleFQN )
            // InternalCls.g:1385:5: ruleFQN
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


    // $ANTLR start "entryRuleXtextAssociation"
    // InternalCls.g:1407:1: entryRuleXtextAssociation returns [EObject current=null] : iv_ruleXtextAssociation= ruleXtextAssociation EOF ;
    public final EObject entryRuleXtextAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXtextAssociation = null;


        try {
            // InternalCls.g:1407:57: (iv_ruleXtextAssociation= ruleXtextAssociation EOF )
            // InternalCls.g:1408:2: iv_ruleXtextAssociation= ruleXtextAssociation EOF
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
    // InternalCls.g:1414:1: ruleXtextAssociation returns [EObject current=null] : ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? ) ;
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
            // InternalCls.g:1420:2: ( ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? ) )
            // InternalCls.g:1421:2: ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? )
            {
            // InternalCls.g:1421:2: ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )? )
            // InternalCls.g:1422:3: ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_7= ')' (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )? (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )? ( (lv_comments_20_0= ruleComment ) )?
            {
            // InternalCls.g:1422:3: ( (lv_twoSideBidirectionality_0_0= 'bi' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:1423:4: (lv_twoSideBidirectionality_0_0= 'bi' )
                    {
                    // InternalCls.g:1423:4: (lv_twoSideBidirectionality_0_0= 'bi' )
                    // InternalCls.g:1424:5: lv_twoSideBidirectionality_0_0= 'bi'
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

            // InternalCls.g:1436:3: ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) )
            // InternalCls.g:1437:4: (lv_twoSideAggregationKind_1_0= ruleAggregationKind )
            {
            // InternalCls.g:1437:4: (lv_twoSideAggregationKind_1_0= ruleAggregationKind )
            // InternalCls.g:1438:5: lv_twoSideAggregationKind_1_0= ruleAggregationKind
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

            // InternalCls.g:1455:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCls.g:1456:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCls.g:1456:4: (lv_name_2_0= RULE_ID )
            // InternalCls.g:1457:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getXtextAssociationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCls.g:1477:3: ( (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:1478:4: (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:1478:4: (lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:1479:5: lv_memberEndTypes_4_0= ruleXtextAssociationMemberEndReferencedType
            {

            					newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalCls.g:1496:3: (otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==27) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalCls.g:1497:4: otherlv_5= ',' ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) )
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getXtextAssociationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCls.g:1501:4: ( (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType ) )
            	    // InternalCls.g:1502:5: (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType )
            	    {
            	    // InternalCls.g:1502:5: (lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType )
            	    // InternalCls.g:1503:6: lv_memberEndTypes_6_0= ruleXtextAssociationMemberEndReferencedType
            	    {

            	    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    break loop36;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FOLLOW_37); 

            			newLeafNode(otherlv_7, grammarAccess.getXtextAssociationAccess().getRightParenthesisKeyword_6());
            		
            // InternalCls.g:1525:3: (otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:1526:4: otherlv_8= 'role' otherlv_9= '[' ( (lv_memberEndNames_10_0= ruleRoleName ) ) (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )* otherlv_13= ']'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getXtextAssociationAccess().getRoleKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,33,FOLLOW_39); 

                    				newLeafNode(otherlv_9, grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalCls.g:1534:4: ( (lv_memberEndNames_10_0= ruleRoleName ) )
                    // InternalCls.g:1535:5: (lv_memberEndNames_10_0= ruleRoleName )
                    {
                    // InternalCls.g:1535:5: (lv_memberEndNames_10_0= ruleRoleName )
                    // InternalCls.g:1536:6: lv_memberEndNames_10_0= ruleRoleName
                    {

                    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalCls.g:1553:4: (otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==27) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalCls.g:1554:5: otherlv_11= ',' ( (lv_memberEndNames_12_0= ruleRoleName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,27,FOLLOW_39); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getXtextAssociationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCls.g:1558:5: ( (lv_memberEndNames_12_0= ruleRoleName ) )
                    	    // InternalCls.g:1559:6: (lv_memberEndNames_12_0= ruleRoleName )
                    	    {
                    	    // InternalCls.g:1559:6: (lv_memberEndNames_12_0= ruleRoleName )
                    	    // InternalCls.g:1560:7: lv_memberEndNames_12_0= ruleRoleName
                    	    {

                    	    							newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,34,FOLLOW_41); 

                    				newLeafNode(otherlv_13, grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCls.g:1583:3: (otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCls.g:1584:4: otherlv_14= 'card' otherlv_15= '[' ( (lv_memberEndCardinalities_16_0= ruleCardinality ) ) (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )* otherlv_19= ']'
                    {
                    otherlv_14=(Token)match(input,35,FOLLOW_38); 

                    				newLeafNode(otherlv_14, grammarAccess.getXtextAssociationAccess().getCardKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,33,FOLLOW_42); 

                    				newLeafNode(otherlv_15, grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalCls.g:1592:4: ( (lv_memberEndCardinalities_16_0= ruleCardinality ) )
                    // InternalCls.g:1593:5: (lv_memberEndCardinalities_16_0= ruleCardinality )
                    {
                    // InternalCls.g:1593:5: (lv_memberEndCardinalities_16_0= ruleCardinality )
                    // InternalCls.g:1594:6: lv_memberEndCardinalities_16_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_43);
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

                    // InternalCls.g:1611:4: (otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==25) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalCls.g:1612:5: otherlv_17= ':' ( (lv_memberEndCardinalities_18_0= ruleCardinality ) )
                    	    {
                    	    otherlv_17=(Token)match(input,25,FOLLOW_42); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getXtextAssociationAccess().getColonKeyword_8_3_0());
                    	    				
                    	    // InternalCls.g:1616:5: ( (lv_memberEndCardinalities_18_0= ruleCardinality ) )
                    	    // InternalCls.g:1617:6: (lv_memberEndCardinalities_18_0= ruleCardinality )
                    	    {
                    	    // InternalCls.g:1617:6: (lv_memberEndCardinalities_18_0= ruleCardinality )
                    	    // InternalCls.g:1618:7: lv_memberEndCardinalities_18_0= ruleCardinality
                    	    {

                    	    							newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
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

                    otherlv_19=(Token)match(input,34,FOLLOW_44); 

                    				newLeafNode(otherlv_19, grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCls.g:1641:3: ( (lv_comments_20_0= ruleComment ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCls.g:1642:4: (lv_comments_20_0= ruleComment )
                    {
                    // InternalCls.g:1642:4: (lv_comments_20_0= ruleComment )
                    // InternalCls.g:1643:5: lv_comments_20_0= ruleComment
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
    // InternalCls.g:1664:1: entryRuleXtextAssociationMemberEndReferencedType returns [EObject current=null] : iv_ruleXtextAssociationMemberEndReferencedType= ruleXtextAssociationMemberEndReferencedType EOF ;
    public final EObject entryRuleXtextAssociationMemberEndReferencedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXtextAssociationMemberEndReferencedType = null;


        try {
            // InternalCls.g:1664:80: (iv_ruleXtextAssociationMemberEndReferencedType= ruleXtextAssociationMemberEndReferencedType EOF )
            // InternalCls.g:1665:2: iv_ruleXtextAssociationMemberEndReferencedType= ruleXtextAssociationMemberEndReferencedType EOF
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
    // InternalCls.g:1671:1: ruleXtextAssociationMemberEndReferencedType returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleXtextAssociationMemberEndReferencedType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCls.g:1677:2: ( ( ( ruleFQN ) ) )
            // InternalCls.g:1678:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:1678:2: ( ( ruleFQN ) )
            // InternalCls.g:1679:3: ( ruleFQN )
            {
            // InternalCls.g:1679:3: ( ruleFQN )
            // InternalCls.g:1680:4: ruleFQN
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
    // InternalCls.g:1697:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalCls.g:1697:48: (iv_ruleComment= ruleComment EOF )
            // InternalCls.g:1698:2: iv_ruleComment= ruleComment EOF
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
    // InternalCls.g:1704:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1710:2: ( (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) )
            // InternalCls.g:1711:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            {
            // InternalCls.g:1711:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            // InternalCls.g:1712:3: otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
            		
            // InternalCls.g:1716:3: ( (lv_body_1_0= ruleCommentBody ) )
            // InternalCls.g:1717:4: (lv_body_1_0= ruleCommentBody )
            {
            // InternalCls.g:1717:4: (lv_body_1_0= ruleCommentBody )
            // InternalCls.g:1718:5: lv_body_1_0= ruleCommentBody
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
    // InternalCls.g:1739:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalCls.g:1739:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalCls.g:1740:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalCls.g:1746:1: ruleCardinality returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1752:2: ( ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) )
            // InternalCls.g:1753:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            {
            // InternalCls.g:1753:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            // InternalCls.g:1754:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            {
            // InternalCls.g:1754:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) )
            // InternalCls.g:1755:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            {
            // InternalCls.g:1755:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            // InternalCls.g:1756:5: lv_lowerBound_0_0= ruleCardinalityBound
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

            // InternalCls.g:1773:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCls.g:1774:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalCls.g:1778:4: ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    // InternalCls.g:1779:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    {
                    // InternalCls.g:1779:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    // InternalCls.g:1780:6: lv_upperBound_2_0= ruleCardinalityBound
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
    // InternalCls.g:1802:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalCls.g:1802:51: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalCls.g:1803:2: iv_ruleCommentBody= ruleCommentBody EOF
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
    // InternalCls.g:1809:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCls.g:1815:2: (this_STRING_0= RULE_STRING )
            // InternalCls.g:1816:2: this_STRING_0= RULE_STRING
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
    // InternalCls.g:1826:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // InternalCls.g:1826:56: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // InternalCls.g:1827:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
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
    // InternalCls.g:1833:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCls.g:1839:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalCls.g:1840:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalCls.g:1840:2: (kw= '*' | this_INT_1= RULE_INT )
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
                    // InternalCls.g:1841:3: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:1847:3: this_INT_1= RULE_INT
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
    // InternalCls.g:1858:1: entryRuleRoleName returns [String current=null] : iv_ruleRoleName= ruleRoleName EOF ;
    public final String entryRuleRoleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRoleName = null;


        try {
            // InternalCls.g:1858:48: (iv_ruleRoleName= ruleRoleName EOF )
            // InternalCls.g:1859:2: iv_ruleRoleName= ruleRoleName EOF
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
    // InternalCls.g:1865:1: ruleRoleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE ) ;
    public final AntlrDatatypeRuleToken ruleRoleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNDERSCORE_1=null;


        	enterRule();

        try {
            // InternalCls.g:1871:2: ( (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE ) )
            // InternalCls.g:1872:2: (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE )
            {
            // InternalCls.g:1872:2: (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_UNDERSCORE) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalCls.g:1873:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getRoleNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:1881:3: this_UNDERSCORE_1= RULE_UNDERSCORE
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
    // InternalCls.g:1892:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
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
            // InternalCls.g:1898:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalCls.g:1899:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalCls.g:1899:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt45=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt45=1;
                }
                break;
            case 40:
                {
                alt45=2;
                }
                break;
            case 41:
                {
                alt45=3;
                }
                break;
            case 42:
                {
                alt45=4;
                }
                break;
            case 43:
                {
                alt45=5;
                }
                break;
            case 44:
                {
                alt45=6;
                }
                break;
            case 45:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalCls.g:1900:3: (enumLiteral_0= '+' )
                    {
                    // InternalCls.g:1900:3: (enumLiteral_0= '+' )
                    // InternalCls.g:1901:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1908:3: (enumLiteral_1= 'public' )
                    {
                    // InternalCls.g:1908:3: (enumLiteral_1= 'public' )
                    // InternalCls.g:1909:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1916:3: (enumLiteral_2= '-' )
                    {
                    // InternalCls.g:1916:3: (enumLiteral_2= '-' )
                    // InternalCls.g:1917:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1924:3: (enumLiteral_3= 'private' )
                    {
                    // InternalCls.g:1924:3: (enumLiteral_3= 'private' )
                    // InternalCls.g:1925:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1932:3: (enumLiteral_4= '#' )
                    {
                    // InternalCls.g:1932:3: (enumLiteral_4= '#' )
                    // InternalCls.g:1933:4: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:1940:3: (enumLiteral_5= 'protected' )
                    {
                    // InternalCls.g:1940:3: (enumLiteral_5= 'protected' )
                    // InternalCls.g:1941:4: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:1948:3: (enumLiteral_6= '~' )
                    {
                    // InternalCls.g:1948:3: (enumLiteral_6= '~' )
                    // InternalCls.g:1949:4: enumLiteral_6= '~'
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
    // InternalCls.g:1959:1: ruleAggregationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) ;
    public final Enumerator ruleAggregationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCls.g:1965:2: ( ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) )
            // InternalCls.g:1966:2: ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            {
            // InternalCls.g:1966:2: ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt46=1;
                }
                break;
            case 47:
                {
                alt46=2;
                }
                break;
            case 48:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalCls.g:1967:3: (enumLiteral_0= 'asc' )
                    {
                    // InternalCls.g:1967:3: (enumLiteral_0= 'asc' )
                    // InternalCls.g:1968:4: enumLiteral_0= 'asc'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1975:3: (enumLiteral_1= 'agg' )
                    {
                    // InternalCls.g:1975:3: (enumLiteral_1= 'agg' )
                    // InternalCls.g:1976:4: enumLiteral_1= 'agg'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1983:3: (enumLiteral_2= 'com' )
                    {
                    // InternalCls.g:1983:3: (enumLiteral_2= 'com' )
                    // InternalCls.g:1984:4: enumLiteral_2= 'com'
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
    protected DFA24 dfa24 = new DFA24(this);
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
            return "473:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )";
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

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "873:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000010002L});
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
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001900000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000002L});

}