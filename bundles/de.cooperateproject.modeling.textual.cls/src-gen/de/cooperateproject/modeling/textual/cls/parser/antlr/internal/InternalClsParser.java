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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_STEREOTYPE_O", "RULE_STEREOTYPE_C", "RULE_UNDERSCORE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-clsd'", "'@end-clsd'", "'rootPackage'", "'package'", "'{'", "'}'", "'import'", "'.'", "'abstract'", "'class'", "'as'", "'interface'", "'static'", "':'", "'('", "','", "')'", "'isa'", "'impl'", "'bi'", "'role'", "'['", "']'", "'card'", "'note'", "'..'", "'*'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'asc'", "'agg'", "'com'"
    };
    public static final int T__50=50;
    public static final int RULE_STEREOTYPE_C=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_UNDERSCORE=9;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_STEREOTYPE_O=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
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

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

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

                if ( (LA1_0==20) ) {
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

                if ( ((LA2_0>=22 && LA2_0<=23)||LA2_0==25||(LA2_0>=41 && LA2_0<=47)) ) {
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

                if ( ((LA3_0>=31 && LA3_0<=33)||(LA3_0>=48 && LA3_0<=50)) ) {
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

                if ( (LA4_0==17) ) {
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
    // InternalCls.g:261:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_appliedStereotypes_2_0= ruleStereotypeApplication ) )* otherlv_3= '{' ( (lv_packageImports_4_0= rulePackageImport ) )* ( (lv_classifiers_5_0= ruleClassifier ) )* ( (lv_connectors_6_0= ruleConnector ) )* ( (lv_packages_7_0= rulePackage ) )* otherlv_8= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_appliedStereotypes_2_0 = null;

        EObject lv_packageImports_4_0 = null;

        EObject lv_classifiers_5_0 = null;

        EObject lv_connectors_6_0 = null;

        EObject lv_packages_7_0 = null;



        	enterRule();

        try {
            // InternalCls.g:267:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_appliedStereotypes_2_0= ruleStereotypeApplication ) )* otherlv_3= '{' ( (lv_packageImports_4_0= rulePackageImport ) )* ( (lv_classifiers_5_0= ruleClassifier ) )* ( (lv_connectors_6_0= ruleConnector ) )* ( (lv_packages_7_0= rulePackage ) )* otherlv_8= '}' ) )
            // InternalCls.g:268:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_appliedStereotypes_2_0= ruleStereotypeApplication ) )* otherlv_3= '{' ( (lv_packageImports_4_0= rulePackageImport ) )* ( (lv_classifiers_5_0= ruleClassifier ) )* ( (lv_connectors_6_0= ruleConnector ) )* ( (lv_packages_7_0= rulePackage ) )* otherlv_8= '}' )
            {
            // InternalCls.g:268:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_appliedStereotypes_2_0= ruleStereotypeApplication ) )* otherlv_3= '{' ( (lv_packageImports_4_0= rulePackageImport ) )* ( (lv_classifiers_5_0= ruleClassifier ) )* ( (lv_connectors_6_0= ruleConnector ) )* ( (lv_packages_7_0= rulePackage ) )* otherlv_8= '}' )
            // InternalCls.g:269:3: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_appliedStereotypes_2_0= ruleStereotypeApplication ) )* otherlv_3= '{' ( (lv_packageImports_4_0= rulePackageImport ) )* ( (lv_classifiers_5_0= ruleClassifier ) )* ( (lv_connectors_6_0= ruleConnector ) )* ( (lv_packages_7_0= rulePackage ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

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

            // InternalCls.g:292:3: ( (lv_appliedStereotypes_2_0= ruleStereotypeApplication ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STEREOTYPE_O) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCls.g:293:4: (lv_appliedStereotypes_2_0= ruleStereotypeApplication )
            	    {
            	    // InternalCls.g:293:4: (lv_appliedStereotypes_2_0= ruleStereotypeApplication )
            	    // InternalCls.g:294:5: lv_appliedStereotypes_2_0= ruleStereotypeApplication
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_appliedStereotypes_2_0=ruleStereotypeApplication();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"appliedStereotypes",
            	    						lv_appliedStereotypes_2_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.StereotypeApplication");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCls.g:315:3: ( (lv_packageImports_4_0= rulePackageImport ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCls.g:316:4: (lv_packageImports_4_0= rulePackageImport )
            	    {
            	    // InternalCls.g:316:4: (lv_packageImports_4_0= rulePackageImport )
            	    // InternalCls.g:317:5: lv_packageImports_4_0= rulePackageImport
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getPackageImportsPackageImportParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_packageImports_4_0=rulePackageImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packageImports",
            	    						lv_packageImports_4_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.PackageImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalCls.g:334:3: ( (lv_classifiers_5_0= ruleClassifier ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=22 && LA7_0<=23)||LA7_0==25||(LA7_0>=41 && LA7_0<=47)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCls.g:335:4: (lv_classifiers_5_0= ruleClassifier )
            	    {
            	    // InternalCls.g:335:4: (lv_classifiers_5_0= ruleClassifier )
            	    // InternalCls.g:336:5: lv_classifiers_5_0= ruleClassifier
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getClassifiersClassifierParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_classifiers_5_0=ruleClassifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classifiers",
            	    						lv_classifiers_5_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Classifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalCls.g:353:3: ( (lv_connectors_6_0= ruleConnector ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=31 && LA8_0<=33)||(LA8_0>=48 && LA8_0<=50)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCls.g:354:4: (lv_connectors_6_0= ruleConnector )
            	    {
            	    // InternalCls.g:354:4: (lv_connectors_6_0= ruleConnector )
            	    // InternalCls.g:355:5: lv_connectors_6_0= ruleConnector
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getConnectorsConnectorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_connectors_6_0=ruleConnector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectors",
            	    						lv_connectors_6_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Connector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalCls.g:372:3: ( (lv_packages_7_0= rulePackage ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCls.g:373:4: (lv_packages_7_0= rulePackage )
            	    {
            	    // InternalCls.g:373:4: (lv_packages_7_0= rulePackage )
            	    // InternalCls.g:374:5: lv_packages_7_0= rulePackage
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_packages_7_0=rulePackage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packages",
            	    						lv_packages_7_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Package");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalCls.g:399:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // InternalCls.g:399:54: (iv_rulePackageImport= rulePackageImport EOF )
            // InternalCls.g:400:2: iv_rulePackageImport= rulePackageImport EOF
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
    // InternalCls.g:406:1: rulePackageImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleFQN ) ) ) ;
    public final EObject rulePackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCls.g:412:2: ( (otherlv_0= 'import' ( ( ruleFQN ) ) ) )
            // InternalCls.g:413:2: (otherlv_0= 'import' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:413:2: (otherlv_0= 'import' ( ( ruleFQN ) ) )
            // InternalCls.g:414:3: otherlv_0= 'import' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageImportAccess().getImportKeyword_0());
            		
            // InternalCls.g:418:3: ( ( ruleFQN ) )
            // InternalCls.g:419:4: ( ruleFQN )
            {
            // InternalCls.g:419:4: ( ruleFQN )
            // InternalCls.g:420:5: ruleFQN
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
    // InternalCls.g:438:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCls.g:438:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCls.g:439:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCls.g:445:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCls.g:451:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCls.g:452:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCls.g:452:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCls.g:453:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalCls.g:460:3: (kw= '.' this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCls.g:461:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCls.g:478:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalCls.g:478:51: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalCls.g:479:2: iv_ruleClassifier= ruleClassifier EOF
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
    // InternalCls.g:485:1: ruleClassifier returns [EObject current=null] : (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Interface_1 = null;



        	enterRule();

        try {
            // InternalCls.g:491:2: ( (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) )
            // InternalCls.g:492:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            {
            // InternalCls.g:492:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalCls.g:493:3: this_Class_0= ruleClass
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
                    // InternalCls.g:502:3: this_Interface_1= ruleInterface
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
    // InternalCls.g:514:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalCls.g:514:46: (iv_ruleClass= ruleClass EOF )
            // InternalCls.g:515:2: iv_ruleClass= ruleClass EOF
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
    // InternalCls.g:521:1: ruleClass returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ( (lv_appliedStereotypes_7_0= ruleStereotypeApplication ) )* ( ( (lv_comments_8_0= ruleComment ) )? | (otherlv_9= '{' ( (lv_comments_10_0= ruleComment ) )? ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_alias_5_0=null;
        Token lv_name_6_0=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_appliedStereotypes_7_0 = null;

        EObject lv_comments_8_0 = null;

        EObject lv_comments_10_0 = null;

        EObject lv_members_11_0 = null;



        	enterRule();

        try {
            // InternalCls.g:527:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ( (lv_appliedStereotypes_7_0= ruleStereotypeApplication ) )* ( ( (lv_comments_8_0= ruleComment ) )? | (otherlv_9= '{' ( (lv_comments_10_0= ruleComment ) )? ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) ) ) )
            // InternalCls.g:528:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ( (lv_appliedStereotypes_7_0= ruleStereotypeApplication ) )* ( ( (lv_comments_8_0= ruleComment ) )? | (otherlv_9= '{' ( (lv_comments_10_0= ruleComment ) )? ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) ) )
            {
            // InternalCls.g:528:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ( (lv_appliedStereotypes_7_0= ruleStereotypeApplication ) )* ( ( (lv_comments_8_0= ruleComment ) )? | (otherlv_9= '{' ( (lv_comments_10_0= ruleComment ) )? ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) ) )
            // InternalCls.g:529:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) ) ( (lv_appliedStereotypes_7_0= ruleStereotypeApplication ) )* ( ( (lv_comments_8_0= ruleComment ) )? | (otherlv_9= '{' ( (lv_comments_10_0= ruleComment ) )? ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) )
            {
            // InternalCls.g:529:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=41 && LA12_0<=47)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCls.g:530:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:530:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:531:5: lv_visibility_0_0= ruleVisibility
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

            // InternalCls.g:548:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCls.g:549:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:549:4: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:550:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,22,FOLLOW_18); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
            		
            // InternalCls.g:566:3: ( ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) ) | ( (lv_name_6_0= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCls.g:567:4: ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) )
                    {
                    // InternalCls.g:567:4: ( ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) ) )
                    // InternalCls.g:568:5: ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_alias_5_0= RULE_ID ) )
                    {
                    // InternalCls.g:568:5: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalCls.g:569:6: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalCls.g:569:6: (lv_name_3_0= RULE_STRING )
                    // InternalCls.g:570:7: lv_name_3_0= RULE_STRING
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

                    otherlv_4=(Token)match(input,24,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getClassAccess().getAsKeyword_3_0_1());
                    				
                    // InternalCls.g:590:5: ( (lv_alias_5_0= RULE_ID ) )
                    // InternalCls.g:591:6: (lv_alias_5_0= RULE_ID )
                    {
                    // InternalCls.g:591:6: (lv_alias_5_0= RULE_ID )
                    // InternalCls.g:592:7: lv_alias_5_0= RULE_ID
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
                    // InternalCls.g:610:4: ( (lv_name_6_0= RULE_ID ) )
                    {
                    // InternalCls.g:610:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalCls.g:611:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalCls.g:611:5: (lv_name_6_0= RULE_ID )
                    // InternalCls.g:612:6: lv_name_6_0= RULE_ID
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

            // InternalCls.g:629:3: ( (lv_appliedStereotypes_7_0= ruleStereotypeApplication ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STEREOTYPE_O) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCls.g:630:4: (lv_appliedStereotypes_7_0= ruleStereotypeApplication )
            	    {
            	    // InternalCls.g:630:4: (lv_appliedStereotypes_7_0= ruleStereotypeApplication )
            	    // InternalCls.g:631:5: lv_appliedStereotypes_7_0= ruleStereotypeApplication
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_appliedStereotypes_7_0=ruleStereotypeApplication();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"appliedStereotypes",
            	    						lv_appliedStereotypes_7_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.StereotypeApplication");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalCls.g:648:3: ( ( (lv_comments_8_0= ruleComment ) )? | (otherlv_9= '{' ( (lv_comments_10_0= ruleComment ) )? ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==EOF||LA19_0==15||LA19_0==17||LA19_0==19||(LA19_0>=22 && LA19_0<=23)||LA19_0==25||(LA19_0>=31 && LA19_0<=33)||LA19_0==38||(LA19_0>=41 && LA19_0<=50)) ) {
                alt19=1;
            }
            else if ( (LA19_0==18) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCls.g:649:4: ( (lv_comments_8_0= ruleComment ) )?
                    {
                    // InternalCls.g:649:4: ( (lv_comments_8_0= ruleComment ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==38) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalCls.g:650:5: (lv_comments_8_0= ruleComment )
                            {
                            // InternalCls.g:650:5: (lv_comments_8_0= ruleComment )
                            // InternalCls.g:651:6: lv_comments_8_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_5_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_8_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClassRule());
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


                    }
                    break;
                case 2 :
                    // InternalCls.g:669:4: (otherlv_9= '{' ( (lv_comments_10_0= ruleComment ) )? ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' )
                    {
                    // InternalCls.g:669:4: (otherlv_9= '{' ( (lv_comments_10_0= ruleComment ) )? ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' )
                    // InternalCls.g:670:5: otherlv_9= '{' ( (lv_comments_10_0= ruleComment ) )? ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_22); 

                    					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1_0());
                    				
                    // InternalCls.g:674:5: ( (lv_comments_10_0= ruleComment ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==38) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalCls.g:675:6: (lv_comments_10_0= ruleComment )
                            {
                            // InternalCls.g:675:6: (lv_comments_10_0= ruleComment )
                            // InternalCls.g:676:7: lv_comments_10_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_comments_10_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassRule());
                            							}
                            							add(
                            								current,
                            								"comments",
                            								lv_comments_10_0,
                            								"de.cooperateproject.modeling.textual.cls.Cls.Comment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalCls.g:693:5: ( (lv_members_11_0= ruleMember ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID||LA18_0==22||LA18_0==26||(LA18_0>=41 && LA18_0<=47)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalCls.g:694:6: (lv_members_11_0= ruleMember )
                    	    {
                    	    // InternalCls.g:694:6: (lv_members_11_0= ruleMember )
                    	    // InternalCls.g:695:7: lv_members_11_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_5_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_members_11_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_11_0,
                    	    								"de.cooperateproject.modeling.textual.cls.Cls.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_1_3());
                    				

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
    // InternalCls.g:722:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCls.g:722:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalCls.g:723:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalCls.g:729:1: ruleInterface returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )* ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_appliedStereotypes_6_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_comments_9_0 = null;

        EObject lv_members_10_0 = null;



        	enterRule();

        try {
            // InternalCls.g:735:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )* ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) ) )
            // InternalCls.g:736:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )* ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) )
            {
            // InternalCls.g:736:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )* ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ) )
            // InternalCls.g:737:3: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )* ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) )
            {
            // InternalCls.g:737:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=41 && LA20_0<=47)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCls.g:738:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:738:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:739:5: lv_visibility_0_0= ruleVisibility
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

            otherlv_1=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalCls.g:760:3: ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalCls.g:761:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    {
                    // InternalCls.g:761:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    // InternalCls.g:762:5: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    // InternalCls.g:762:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalCls.g:763:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalCls.g:763:6: (lv_name_2_0= RULE_STRING )
                    // InternalCls.g:764:7: lv_name_2_0= RULE_STRING
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

                    otherlv_3=(Token)match(input,24,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getAsKeyword_2_0_1());
                    				
                    // InternalCls.g:784:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalCls.g:785:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalCls.g:785:6: (lv_alias_4_0= RULE_ID )
                    // InternalCls.g:786:7: lv_alias_4_0= RULE_ID
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
                    // InternalCls.g:804:4: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // InternalCls.g:804:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalCls.g:805:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalCls.g:805:5: (lv_name_5_0= RULE_ID )
                    // InternalCls.g:806:6: lv_name_5_0= RULE_ID
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

            // InternalCls.g:823:3: ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STEREOTYPE_O) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCls.g:824:4: (lv_appliedStereotypes_6_0= ruleStereotypeApplication )
            	    {
            	    // InternalCls.g:824:4: (lv_appliedStereotypes_6_0= ruleStereotypeApplication )
            	    // InternalCls.g:825:5: lv_appliedStereotypes_6_0= ruleStereotypeApplication
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_appliedStereotypes_6_0=ruleStereotypeApplication();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"appliedStereotypes",
            	    						lv_appliedStereotypes_6_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.StereotypeApplication");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalCls.g:842:3: ( ( (lv_comments_7_0= ruleComment ) )? | (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EOF||LA26_0==15||LA26_0==17||LA26_0==19||(LA26_0>=22 && LA26_0<=23)||LA26_0==25||(LA26_0>=31 && LA26_0<=33)||LA26_0==38||(LA26_0>=41 && LA26_0<=50)) ) {
                alt26=1;
            }
            else if ( (LA26_0==18) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:843:4: ( (lv_comments_7_0= ruleComment ) )?
                    {
                    // InternalCls.g:843:4: ( (lv_comments_7_0= ruleComment ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==38) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalCls.g:844:5: (lv_comments_7_0= ruleComment )
                            {
                            // InternalCls.g:844:5: (lv_comments_7_0= ruleComment )
                            // InternalCls.g:845:6: lv_comments_7_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_4_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_7_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInterfaceRule());
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
                    // InternalCls.g:863:4: (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )
                    {
                    // InternalCls.g:863:4: (otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )
                    // InternalCls.g:864:5: otherlv_8= '{' ( (lv_comments_9_0= ruleComment ) )? ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_22); 

                    					newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalCls.g:868:5: ( (lv_comments_9_0= ruleComment ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==38) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalCls.g:869:6: (lv_comments_9_0= ruleComment )
                            {
                            // InternalCls.g:869:6: (lv_comments_9_0= ruleComment )
                            // InternalCls.g:870:7: lv_comments_9_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_comments_9_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInterfaceRule());
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

                    // InternalCls.g:887:5: ( (lv_members_10_0= ruleMember ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID||LA25_0==22||LA25_0==26||(LA25_0>=41 && LA25_0<=47)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalCls.g:888:6: (lv_members_10_0= ruleMember )
                    	    {
                    	    // InternalCls.g:888:6: (lv_members_10_0= ruleMember )
                    	    // InternalCls.g:889:7: lv_members_10_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_4_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_members_10_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_1_3());
                    				

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
    // InternalCls.g:916:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalCls.g:916:47: (iv_ruleMember= ruleMember EOF )
            // InternalCls.g:917:2: iv_ruleMember= ruleMember EOF
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
    // InternalCls.g:923:1: ruleMember returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalCls.g:929:2: ( (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) )
            // InternalCls.g:930:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            {
            // InternalCls.g:930:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalCls.g:931:3: this_Attribute_0= ruleAttribute
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
                    // InternalCls.g:940:3: this_Method_1= ruleMethod
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
    // InternalCls.g:952:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalCls.g:952:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalCls.g:953:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalCls.g:959:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )* ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_appliedStereotypes_6_0 = null;



        	enterRule();

        try {
            // InternalCls.g:965:2: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )* ) )
            // InternalCls.g:966:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )* )
            {
            // InternalCls.g:966:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )* )
            // InternalCls.g:967:3: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )*
            {
            // InternalCls.g:967:3: ()
            // InternalCls.g:968:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalCls.g:974:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=41 && LA28_0<=47)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:975:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalCls.g:975:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalCls.g:976:5: lv_visibility_1_0= ruleVisibility
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

            // InternalCls.g:993:3: ( (lv_static_2_0= 'static' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:994:4: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:994:4: (lv_static_2_0= 'static' )
                    // InternalCls.g:995:5: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,26,FOLLOW_6); 

                    					newLeafNode(lv_static_2_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1007:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCls.g:1008:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCls.g:1008:4: (lv_name_3_0= RULE_ID )
            // InternalCls.g:1009:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
            		
            // InternalCls.g:1029:3: ( ( ruleFQN ) )
            // InternalCls.g:1030:4: ( ruleFQN )
            {
            // InternalCls.g:1030:4: ( ruleFQN )
            // InternalCls.g:1031:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:1045:3: ( (lv_appliedStereotypes_6_0= ruleStereotypeApplication ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STEREOTYPE_O) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCls.g:1046:4: (lv_appliedStereotypes_6_0= ruleStereotypeApplication )
            	    {
            	    // InternalCls.g:1046:4: (lv_appliedStereotypes_6_0= ruleStereotypeApplication )
            	    // InternalCls.g:1047:5: lv_appliedStereotypes_6_0= ruleStereotypeApplication
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_appliedStereotypes_6_0=ruleStereotypeApplication();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"appliedStereotypes",
            	    						lv_appliedStereotypes_6_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.StereotypeApplication");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalCls.g:1068:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalCls.g:1068:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalCls.g:1069:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalCls.g:1075:1: ruleMethod returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_appliedStereotypes_4_0= ruleStereotypeApplication ) )* otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_appliedStereotypes_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1081:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_appliedStereotypes_4_0= ruleStereotypeApplication ) )* otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? ) )
            // InternalCls.g:1082:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_appliedStereotypes_4_0= ruleStereotypeApplication ) )* otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? )
            {
            // InternalCls.g:1082:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_appliedStereotypes_4_0= ruleStereotypeApplication ) )* otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? )
            // InternalCls.g:1083:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_appliedStereotypes_4_0= ruleStereotypeApplication ) )* otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )?
            {
            // InternalCls.g:1083:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=41 && LA31_0<=47)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:1084:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:1084:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:1085:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_28);
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

            // InternalCls.g:1102:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCls.g:1103:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:1103:4: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:1104:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,22,FOLLOW_25); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1116:3: ( (lv_static_2_0= 'static' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:1117:4: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:1117:4: (lv_static_2_0= 'static' )
                    // InternalCls.g:1118:5: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,26,FOLLOW_6); 

                    					newLeafNode(lv_static_2_0, grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1130:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCls.g:1131:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCls.g:1131:4: (lv_name_3_0= RULE_ID )
            // InternalCls.g:1132:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            // InternalCls.g:1148:3: ( (lv_appliedStereotypes_4_0= ruleStereotypeApplication ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_STEREOTYPE_O) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCls.g:1149:4: (lv_appliedStereotypes_4_0= ruleStereotypeApplication )
            	    {
            	    // InternalCls.g:1149:4: (lv_appliedStereotypes_4_0= ruleStereotypeApplication )
            	    // InternalCls.g:1150:5: lv_appliedStereotypes_4_0= ruleStereotypeApplication
            	    {

            	    					newCompositeNode(grammarAccess.getMethodAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_appliedStereotypes_4_0=ruleStereotypeApplication();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodRule());
            	    					}
            	    					add(
            	    						current,
            	    						"appliedStereotypes",
            	    						lv_appliedStereotypes_4_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.StereotypeApplication");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
            		
            // InternalCls.g:1171:3: ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==RULE_STEREOTYPE_O||(LA36_0>=41 && LA36_0<=47)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalCls.g:1172:4: ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    {
            	    // InternalCls.g:1172:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalCls.g:1173:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalCls.g:1173:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalCls.g:1174:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_31);
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

            	    // InternalCls.g:1191:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==29) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // InternalCls.g:1192:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,29,FOLLOW_32); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
            	    	    				
            	    	    // InternalCls.g:1196:5: ( (lv_parameters_8_0= ruleParameter ) )
            	    	    // InternalCls.g:1197:6: (lv_parameters_8_0= ruleParameter )
            	    	    {
            	    	    // InternalCls.g:1197:6: (lv_parameters_8_0= ruleParameter )
            	    	    // InternalCls.g:1198:7: lv_parameters_8_0= ruleParameter
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_31);
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
            	    	    break loop35;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_9=(Token)match(input,30,FOLLOW_33); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
            		
            // InternalCls.g:1221:3: (otherlv_10= ':' ( ( ruleFQN ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCls.g:1222:4: otherlv_10= ':' ( ( ruleFQN ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getColonKeyword_8_0());
                    			
                    // InternalCls.g:1226:4: ( ( ruleFQN ) )
                    // InternalCls.g:1227:5: ( ruleFQN )
                    {
                    // InternalCls.g:1227:5: ( ruleFQN )
                    // InternalCls.g:1228:6: ruleFQN
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
    // InternalCls.g:1247:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCls.g:1247:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCls.g:1248:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCls.g:1254:1: ruleParameter returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_appliedStereotypes_1_0= ruleStereotypeApplication ) )* ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_appliedStereotypes_1_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1260:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_appliedStereotypes_1_0= ruleStereotypeApplication ) )* ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) )
            // InternalCls.g:1261:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_appliedStereotypes_1_0= ruleStereotypeApplication ) )* ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:1261:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_appliedStereotypes_1_0= ruleStereotypeApplication ) )* ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            // InternalCls.g:1262:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_appliedStereotypes_1_0= ruleStereotypeApplication ) )* ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) )
            {
            // InternalCls.g:1262:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=41 && LA38_0<=47)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:1263:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:1263:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:1264:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_34);
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

            // InternalCls.g:1281:3: ( (lv_appliedStereotypes_1_0= ruleStereotypeApplication ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_STEREOTYPE_O) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalCls.g:1282:4: (lv_appliedStereotypes_1_0= ruleStereotypeApplication )
            	    {
            	    // InternalCls.g:1282:4: (lv_appliedStereotypes_1_0= ruleStereotypeApplication )
            	    // InternalCls.g:1283:5: lv_appliedStereotypes_1_0= ruleStereotypeApplication
            	    {

            	    					newCompositeNode(grammarAccess.getParameterAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_appliedStereotypes_1_0=ruleStereotypeApplication();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"appliedStereotypes",
            	    						lv_appliedStereotypes_1_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.StereotypeApplication");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalCls.g:1300:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCls.g:1301:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCls.g:1301:4: (lv_name_2_0= RULE_ID )
            // InternalCls.g:1302:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
            		
            // InternalCls.g:1322:3: ( ( ruleFQN ) )
            // InternalCls.g:1323:4: ( ruleFQN )
            {
            // InternalCls.g:1323:4: ( ruleFQN )
            // InternalCls.g:1324:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeClassifierCrossReference_4_0());
            				
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
    // InternalCls.g:1342:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCls.g:1342:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCls.g:1343:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalCls.g:1349:1: ruleConnector returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_XtextAssociation_1 = null;

        EObject this_Implementation_2 = null;



        	enterRule();

        try {
            // InternalCls.g:1355:2: ( (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation ) )
            // InternalCls.g:1356:2: (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation )
            {
            // InternalCls.g:1356:2: (this_Generalization_0= ruleGeneralization | this_XtextAssociation_1= ruleXtextAssociation | this_Implementation_2= ruleImplementation )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt40=1;
                }
                break;
            case 33:
            case 48:
            case 49:
            case 50:
                {
                alt40=2;
                }
                break;
            case 32:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalCls.g:1357:3: this_Generalization_0= ruleGeneralization
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
                    // InternalCls.g:1366:3: this_XtextAssociation_1= ruleXtextAssociation
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
                    // InternalCls.g:1375:3: this_Implementation_2= ruleImplementation
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
    // InternalCls.g:1387:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalCls.g:1387:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalCls.g:1388:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalCls.g:1394:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCls.g:1400:2: ( (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) )
            // InternalCls.g:1401:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            {
            // InternalCls.g:1401:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            // InternalCls.g:1402:3: otherlv_0= 'isa' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsaKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCls.g:1410:3: ( ( ruleFQN ) )
            // InternalCls.g:1411:4: ( ruleFQN )
            {
            // InternalCls.g:1411:4: ( ruleFQN )
            // InternalCls.g:1412:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getLeftClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_36);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getCommaKeyword_3());
            		
            // InternalCls.g:1430:3: ( ( ruleFQN ) )
            // InternalCls.g:1431:4: ( ruleFQN )
            {
            // InternalCls.g:1431:4: ( ruleFQN )
            // InternalCls.g:1432:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getRightClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_37);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalCls.g:1454:1: entryRuleImplementation returns [EObject current=null] : iv_ruleImplementation= ruleImplementation EOF ;
    public final EObject entryRuleImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementation = null;


        try {
            // InternalCls.g:1454:55: (iv_ruleImplementation= ruleImplementation EOF )
            // InternalCls.g:1455:2: iv_ruleImplementation= ruleImplementation EOF
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
    // InternalCls.g:1461:1: ruleImplementation returns [EObject current=null] : (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) ;
    public final EObject ruleImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCls.g:1467:2: ( (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' ) )
            // InternalCls.g:1468:2: (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            {
            // InternalCls.g:1468:2: (otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' )
            // InternalCls.g:1469:3: otherlv_0= 'impl' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementationAccess().getImplKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCls.g:1477:3: ( ( ruleFQN ) )
            // InternalCls.g:1478:4: ( ruleFQN )
            {
            // InternalCls.g:1478:4: ( ruleFQN )
            // InternalCls.g:1479:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplementationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplementationAccess().getLeftClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_36);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getImplementationAccess().getCommaKeyword_3());
            		
            // InternalCls.g:1497:3: ( ( ruleFQN ) )
            // InternalCls.g:1498:4: ( ruleFQN )
            {
            // InternalCls.g:1498:4: ( ruleFQN )
            // InternalCls.g:1499:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplementationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImplementationAccess().getRightClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_37);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalCls.g:1521:1: entryRuleXtextAssociation returns [EObject current=null] : iv_ruleXtextAssociation= ruleXtextAssociation EOF ;
    public final EObject entryRuleXtextAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXtextAssociation = null;


        try {
            // InternalCls.g:1521:57: (iv_ruleXtextAssociation= ruleXtextAssociation EOF )
            // InternalCls.g:1522:2: iv_ruleXtextAssociation= ruleXtextAssociation EOF
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
    // InternalCls.g:1528:1: ruleXtextAssociation returns [EObject current=null] : ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_appliedStereotypes_3_0= ruleStereotypeApplication ) )* otherlv_4= '(' ( (lv_memberEndTypes_5_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_6= ',' ( (lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_8= ')' (otherlv_9= 'role' otherlv_10= '[' ( (lv_memberEndNames_11_0= ruleRoleName ) ) (otherlv_12= ',' ( (lv_memberEndNames_13_0= ruleRoleName ) ) )* otherlv_14= ']' )? (otherlv_15= 'card' otherlv_16= '[' ( (lv_memberEndCardinalities_17_0= ruleCardinality ) ) (otherlv_18= ':' ( (lv_memberEndCardinalities_19_0= ruleCardinality ) ) )* otherlv_20= ']' )? ( (lv_comments_21_0= ruleComment ) )? ) ;
    public final EObject ruleXtextAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_twoSideBidirectionality_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Enumerator lv_twoSideAggregationKind_1_0 = null;

        EObject lv_appliedStereotypes_3_0 = null;

        EObject lv_memberEndTypes_5_0 = null;

        EObject lv_memberEndTypes_7_0 = null;

        AntlrDatatypeRuleToken lv_memberEndNames_11_0 = null;

        AntlrDatatypeRuleToken lv_memberEndNames_13_0 = null;

        EObject lv_memberEndCardinalities_17_0 = null;

        EObject lv_memberEndCardinalities_19_0 = null;

        EObject lv_comments_21_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1534:2: ( ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_appliedStereotypes_3_0= ruleStereotypeApplication ) )* otherlv_4= '(' ( (lv_memberEndTypes_5_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_6= ',' ( (lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_8= ')' (otherlv_9= 'role' otherlv_10= '[' ( (lv_memberEndNames_11_0= ruleRoleName ) ) (otherlv_12= ',' ( (lv_memberEndNames_13_0= ruleRoleName ) ) )* otherlv_14= ']' )? (otherlv_15= 'card' otherlv_16= '[' ( (lv_memberEndCardinalities_17_0= ruleCardinality ) ) (otherlv_18= ':' ( (lv_memberEndCardinalities_19_0= ruleCardinality ) ) )* otherlv_20= ']' )? ( (lv_comments_21_0= ruleComment ) )? ) )
            // InternalCls.g:1535:2: ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_appliedStereotypes_3_0= ruleStereotypeApplication ) )* otherlv_4= '(' ( (lv_memberEndTypes_5_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_6= ',' ( (lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_8= ')' (otherlv_9= 'role' otherlv_10= '[' ( (lv_memberEndNames_11_0= ruleRoleName ) ) (otherlv_12= ',' ( (lv_memberEndNames_13_0= ruleRoleName ) ) )* otherlv_14= ']' )? (otherlv_15= 'card' otherlv_16= '[' ( (lv_memberEndCardinalities_17_0= ruleCardinality ) ) (otherlv_18= ':' ( (lv_memberEndCardinalities_19_0= ruleCardinality ) ) )* otherlv_20= ']' )? ( (lv_comments_21_0= ruleComment ) )? )
            {
            // InternalCls.g:1535:2: ( ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_appliedStereotypes_3_0= ruleStereotypeApplication ) )* otherlv_4= '(' ( (lv_memberEndTypes_5_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_6= ',' ( (lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_8= ')' (otherlv_9= 'role' otherlv_10= '[' ( (lv_memberEndNames_11_0= ruleRoleName ) ) (otherlv_12= ',' ( (lv_memberEndNames_13_0= ruleRoleName ) ) )* otherlv_14= ']' )? (otherlv_15= 'card' otherlv_16= '[' ( (lv_memberEndCardinalities_17_0= ruleCardinality ) ) (otherlv_18= ':' ( (lv_memberEndCardinalities_19_0= ruleCardinality ) ) )* otherlv_20= ']' )? ( (lv_comments_21_0= ruleComment ) )? )
            // InternalCls.g:1536:3: ( (lv_twoSideBidirectionality_0_0= 'bi' ) )? ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_appliedStereotypes_3_0= ruleStereotypeApplication ) )* otherlv_4= '(' ( (lv_memberEndTypes_5_0= ruleXtextAssociationMemberEndReferencedType ) ) (otherlv_6= ',' ( (lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType ) ) )* otherlv_8= ')' (otherlv_9= 'role' otherlv_10= '[' ( (lv_memberEndNames_11_0= ruleRoleName ) ) (otherlv_12= ',' ( (lv_memberEndNames_13_0= ruleRoleName ) ) )* otherlv_14= ']' )? (otherlv_15= 'card' otherlv_16= '[' ( (lv_memberEndCardinalities_17_0= ruleCardinality ) ) (otherlv_18= ':' ( (lv_memberEndCardinalities_19_0= ruleCardinality ) ) )* otherlv_20= ']' )? ( (lv_comments_21_0= ruleComment ) )?
            {
            // InternalCls.g:1536:3: ( (lv_twoSideBidirectionality_0_0= 'bi' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCls.g:1537:4: (lv_twoSideBidirectionality_0_0= 'bi' )
                    {
                    // InternalCls.g:1537:4: (lv_twoSideBidirectionality_0_0= 'bi' )
                    // InternalCls.g:1538:5: lv_twoSideBidirectionality_0_0= 'bi'
                    {
                    lv_twoSideBidirectionality_0_0=(Token)match(input,33,FOLLOW_38); 

                    					newLeafNode(lv_twoSideBidirectionality_0_0, grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXtextAssociationRule());
                    					}
                    					setWithLastConsumed(current, "twoSideBidirectionality", true, "bi");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1550:3: ( (lv_twoSideAggregationKind_1_0= ruleAggregationKind ) )
            // InternalCls.g:1551:4: (lv_twoSideAggregationKind_1_0= ruleAggregationKind )
            {
            // InternalCls.g:1551:4: (lv_twoSideAggregationKind_1_0= ruleAggregationKind )
            // InternalCls.g:1552:5: lv_twoSideAggregationKind_1_0= ruleAggregationKind
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

            // InternalCls.g:1569:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCls.g:1570:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCls.g:1570:4: (lv_name_2_0= RULE_ID )
            // InternalCls.g:1571:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            // InternalCls.g:1587:3: ( (lv_appliedStereotypes_3_0= ruleStereotypeApplication ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_STEREOTYPE_O) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCls.g:1588:4: (lv_appliedStereotypes_3_0= ruleStereotypeApplication )
            	    {
            	    // InternalCls.g:1588:4: (lv_appliedStereotypes_3_0= ruleStereotypeApplication )
            	    // InternalCls.g:1589:5: lv_appliedStereotypes_3_0= ruleStereotypeApplication
            	    {

            	    					newCompositeNode(grammarAccess.getXtextAssociationAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_appliedStereotypes_3_0=ruleStereotypeApplication();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"appliedStereotypes",
            	    						lv_appliedStereotypes_3_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.StereotypeApplication");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getXtextAssociationAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCls.g:1610:3: ( (lv_memberEndTypes_5_0= ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:1611:4: (lv_memberEndTypes_5_0= ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:1611:4: (lv_memberEndTypes_5_0= ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:1612:5: lv_memberEndTypes_5_0= ruleXtextAssociationMemberEndReferencedType
            {

            					newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_39);
            lv_memberEndTypes_5_0=ruleXtextAssociationMemberEndReferencedType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
            					}
            					add(
            						current,
            						"memberEndTypes",
            						lv_memberEndTypes_5_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.XtextAssociationMemberEndReferencedType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:1629:3: (otherlv_6= ',' ( (lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==29) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalCls.g:1630:4: otherlv_6= ',' ( (lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType ) )
            	    {
            	    otherlv_6=(Token)match(input,29,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getXtextAssociationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCls.g:1634:4: ( (lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType ) )
            	    // InternalCls.g:1635:5: (lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType )
            	    {
            	    // InternalCls.g:1635:5: (lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType )
            	    // InternalCls.g:1636:6: lv_memberEndTypes_7_0= ruleXtextAssociationMemberEndReferencedType
            	    {

            	    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_memberEndTypes_7_0=ruleXtextAssociationMemberEndReferencedType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"memberEndTypes",
            	    							lv_memberEndTypes_7_0,
            	    							"de.cooperateproject.modeling.textual.cls.Cls.XtextAssociationMemberEndReferencedType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_8=(Token)match(input,30,FOLLOW_40); 

            			newLeafNode(otherlv_8, grammarAccess.getXtextAssociationAccess().getRightParenthesisKeyword_7());
            		
            // InternalCls.g:1658:3: (otherlv_9= 'role' otherlv_10= '[' ( (lv_memberEndNames_11_0= ruleRoleName ) ) (otherlv_12= ',' ( (lv_memberEndNames_13_0= ruleRoleName ) ) )* otherlv_14= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==34) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCls.g:1659:4: otherlv_9= 'role' otherlv_10= '[' ( (lv_memberEndNames_11_0= ruleRoleName ) ) (otherlv_12= ',' ( (lv_memberEndNames_13_0= ruleRoleName ) ) )* otherlv_14= ']'
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_41); 

                    				newLeafNode(otherlv_9, grammarAccess.getXtextAssociationAccess().getRoleKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,35,FOLLOW_42); 

                    				newLeafNode(otherlv_10, grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalCls.g:1667:4: ( (lv_memberEndNames_11_0= ruleRoleName ) )
                    // InternalCls.g:1668:5: (lv_memberEndNames_11_0= ruleRoleName )
                    {
                    // InternalCls.g:1668:5: (lv_memberEndNames_11_0= ruleRoleName )
                    // InternalCls.g:1669:6: lv_memberEndNames_11_0= ruleRoleName
                    {

                    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_memberEndNames_11_0=ruleRoleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
                    						}
                    						add(
                    							current,
                    							"memberEndNames",
                    							lv_memberEndNames_11_0,
                    							"de.cooperateproject.modeling.textual.cls.Cls.RoleName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCls.g:1686:4: (otherlv_12= ',' ( (lv_memberEndNames_13_0= ruleRoleName ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==29) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalCls.g:1687:5: otherlv_12= ',' ( (lv_memberEndNames_13_0= ruleRoleName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,29,FOLLOW_42); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getXtextAssociationAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCls.g:1691:5: ( (lv_memberEndNames_13_0= ruleRoleName ) )
                    	    // InternalCls.g:1692:6: (lv_memberEndNames_13_0= ruleRoleName )
                    	    {
                    	    // InternalCls.g:1692:6: (lv_memberEndNames_13_0= ruleRoleName )
                    	    // InternalCls.g:1693:7: lv_memberEndNames_13_0= ruleRoleName
                    	    {

                    	    							newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    lv_memberEndNames_13_0=ruleRoleName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"memberEndNames",
                    	    								lv_memberEndNames_13_0,
                    	    								"de.cooperateproject.modeling.textual.cls.Cls.RoleName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,36,FOLLOW_44); 

                    				newLeafNode(otherlv_14, grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCls.g:1716:3: (otherlv_15= 'card' otherlv_16= '[' ( (lv_memberEndCardinalities_17_0= ruleCardinality ) ) (otherlv_18= ':' ( (lv_memberEndCardinalities_19_0= ruleCardinality ) ) )* otherlv_20= ']' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==37) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCls.g:1717:4: otherlv_15= 'card' otherlv_16= '[' ( (lv_memberEndCardinalities_17_0= ruleCardinality ) ) (otherlv_18= ':' ( (lv_memberEndCardinalities_19_0= ruleCardinality ) ) )* otherlv_20= ']'
                    {
                    otherlv_15=(Token)match(input,37,FOLLOW_41); 

                    				newLeafNode(otherlv_15, grammarAccess.getXtextAssociationAccess().getCardKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,35,FOLLOW_45); 

                    				newLeafNode(otherlv_16, grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_9_1());
                    			
                    // InternalCls.g:1725:4: ( (lv_memberEndCardinalities_17_0= ruleCardinality ) )
                    // InternalCls.g:1726:5: (lv_memberEndCardinalities_17_0= ruleCardinality )
                    {
                    // InternalCls.g:1726:5: (lv_memberEndCardinalities_17_0= ruleCardinality )
                    // InternalCls.g:1727:6: lv_memberEndCardinalities_17_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_memberEndCardinalities_17_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
                    						}
                    						add(
                    							current,
                    							"memberEndCardinalities",
                    							lv_memberEndCardinalities_17_0,
                    							"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCls.g:1744:4: (otherlv_18= ':' ( (lv_memberEndCardinalities_19_0= ruleCardinality ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==27) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalCls.g:1745:5: otherlv_18= ':' ( (lv_memberEndCardinalities_19_0= ruleCardinality ) )
                    	    {
                    	    otherlv_18=(Token)match(input,27,FOLLOW_45); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getXtextAssociationAccess().getColonKeyword_9_3_0());
                    	    				
                    	    // InternalCls.g:1749:5: ( (lv_memberEndCardinalities_19_0= ruleCardinality ) )
                    	    // InternalCls.g:1750:6: (lv_memberEndCardinalities_19_0= ruleCardinality )
                    	    {
                    	    // InternalCls.g:1750:6: (lv_memberEndCardinalities_19_0= ruleCardinality )
                    	    // InternalCls.g:1751:7: lv_memberEndCardinalities_19_0= ruleCardinality
                    	    {

                    	    							newCompositeNode(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    lv_memberEndCardinalities_19_0=ruleCardinality();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"memberEndCardinalities",
                    	    								lv_memberEndCardinalities_19_0,
                    	    								"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,36,FOLLOW_47); 

                    				newLeafNode(otherlv_20, grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCls.g:1774:3: ( (lv_comments_21_0= ruleComment ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCls.g:1775:4: (lv_comments_21_0= ruleComment )
                    {
                    // InternalCls.g:1775:4: (lv_comments_21_0= ruleComment )
                    // InternalCls.g:1776:5: lv_comments_21_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getXtextAssociationAccess().getCommentsCommentParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_21_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getXtextAssociationRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_21_0,
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
    // InternalCls.g:1797:1: entryRuleXtextAssociationMemberEndReferencedType returns [EObject current=null] : iv_ruleXtextAssociationMemberEndReferencedType= ruleXtextAssociationMemberEndReferencedType EOF ;
    public final EObject entryRuleXtextAssociationMemberEndReferencedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXtextAssociationMemberEndReferencedType = null;


        try {
            // InternalCls.g:1797:80: (iv_ruleXtextAssociationMemberEndReferencedType= ruleXtextAssociationMemberEndReferencedType EOF )
            // InternalCls.g:1798:2: iv_ruleXtextAssociationMemberEndReferencedType= ruleXtextAssociationMemberEndReferencedType EOF
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
    // InternalCls.g:1804:1: ruleXtextAssociationMemberEndReferencedType returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleXtextAssociationMemberEndReferencedType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCls.g:1810:2: ( ( ( ruleFQN ) ) )
            // InternalCls.g:1811:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:1811:2: ( ( ruleFQN ) )
            // InternalCls.g:1812:3: ( ruleFQN )
            {
            // InternalCls.g:1812:3: ( ruleFQN )
            // InternalCls.g:1813:4: ruleFQN
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
    // InternalCls.g:1830:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalCls.g:1830:48: (iv_ruleComment= ruleComment EOF )
            // InternalCls.g:1831:2: iv_ruleComment= ruleComment EOF
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
    // InternalCls.g:1837:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1843:2: ( (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) ) )
            // InternalCls.g:1844:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            {
            // InternalCls.g:1844:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) ) )
            // InternalCls.g:1845:3: otherlv_0= 'note' ( (lv_body_1_0= ruleCommentBody ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
            		
            // InternalCls.g:1849:3: ( (lv_body_1_0= ruleCommentBody ) )
            // InternalCls.g:1850:4: (lv_body_1_0= ruleCommentBody )
            {
            // InternalCls.g:1850:4: (lv_body_1_0= ruleCommentBody )
            // InternalCls.g:1851:5: lv_body_1_0= ruleCommentBody
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
    // InternalCls.g:1872:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalCls.g:1872:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalCls.g:1873:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalCls.g:1879:1: ruleCardinality returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1885:2: ( ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) )
            // InternalCls.g:1886:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            {
            // InternalCls.g:1886:2: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            // InternalCls.g:1887:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            {
            // InternalCls.g:1887:3: ( (lv_lowerBound_0_0= ruleCardinalityBound ) )
            // InternalCls.g:1888:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            {
            // InternalCls.g:1888:4: (lv_lowerBound_0_0= ruleCardinalityBound )
            // InternalCls.g:1889:5: lv_lowerBound_0_0= ruleCardinalityBound
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalCls.g:1906:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCls.g:1907:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_45); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalCls.g:1911:4: ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    // InternalCls.g:1912:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    {
                    // InternalCls.g:1912:5: (lv_upperBound_2_0= ruleCardinalityBound )
                    // InternalCls.g:1913:6: lv_upperBound_2_0= ruleCardinalityBound
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
    // InternalCls.g:1935:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalCls.g:1935:51: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalCls.g:1936:2: iv_ruleCommentBody= ruleCommentBody EOF
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
    // InternalCls.g:1942:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCls.g:1948:2: (this_STRING_0= RULE_STRING )
            // InternalCls.g:1949:2: this_STRING_0= RULE_STRING
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
    // InternalCls.g:1959:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // InternalCls.g:1959:56: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // InternalCls.g:1960:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
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
    // InternalCls.g:1966:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCls.g:1972:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalCls.g:1973:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalCls.g:1973:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_INT) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalCls.g:1974:3: kw= '*'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:1980:3: this_INT_1= RULE_INT
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


    // $ANTLR start "entryRuleStereotypeApplication"
    // InternalCls.g:1991:1: entryRuleStereotypeApplication returns [EObject current=null] : iv_ruleStereotypeApplication= ruleStereotypeApplication EOF ;
    public final EObject entryRuleStereotypeApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStereotypeApplication = null;


        try {
            // InternalCls.g:1991:62: (iv_ruleStereotypeApplication= ruleStereotypeApplication EOF )
            // InternalCls.g:1992:2: iv_ruleStereotypeApplication= ruleStereotypeApplication EOF
            {
             newCompositeNode(grammarAccess.getStereotypeApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStereotypeApplication=ruleStereotypeApplication();

            state._fsp--;

             current =iv_ruleStereotypeApplication; 
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
    // $ANTLR end "entryRuleStereotypeApplication"


    // $ANTLR start "ruleStereotypeApplication"
    // InternalCls.g:1998:1: ruleStereotypeApplication returns [EObject current=null] : (this_STEREOTYPE_O_0= RULE_STEREOTYPE_O ( ( ruleFQN ) ) this_STEREOTYPE_C_2= RULE_STEREOTYPE_C (otherlv_3= '{' ( (lv_values_4_0= ruleTaggedValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleTaggedValue ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleStereotypeApplication() throws RecognitionException {
        EObject current = null;

        Token this_STEREOTYPE_O_0=null;
        Token this_STEREOTYPE_C_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_values_4_0 = null;

        EObject lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalCls.g:2004:2: ( (this_STEREOTYPE_O_0= RULE_STEREOTYPE_O ( ( ruleFQN ) ) this_STEREOTYPE_C_2= RULE_STEREOTYPE_C (otherlv_3= '{' ( (lv_values_4_0= ruleTaggedValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleTaggedValue ) ) )* otherlv_7= '}' )? ) )
            // InternalCls.g:2005:2: (this_STEREOTYPE_O_0= RULE_STEREOTYPE_O ( ( ruleFQN ) ) this_STEREOTYPE_C_2= RULE_STEREOTYPE_C (otherlv_3= '{' ( (lv_values_4_0= ruleTaggedValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleTaggedValue ) ) )* otherlv_7= '}' )? )
            {
            // InternalCls.g:2005:2: (this_STEREOTYPE_O_0= RULE_STEREOTYPE_O ( ( ruleFQN ) ) this_STEREOTYPE_C_2= RULE_STEREOTYPE_C (otherlv_3= '{' ( (lv_values_4_0= ruleTaggedValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleTaggedValue ) ) )* otherlv_7= '}' )? )
            // InternalCls.g:2006:3: this_STEREOTYPE_O_0= RULE_STEREOTYPE_O ( ( ruleFQN ) ) this_STEREOTYPE_C_2= RULE_STEREOTYPE_C (otherlv_3= '{' ( (lv_values_4_0= ruleTaggedValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleTaggedValue ) ) )* otherlv_7= '}' )?
            {
            this_STEREOTYPE_O_0=(Token)match(input,RULE_STEREOTYPE_O,FOLLOW_6); 

            			newLeafNode(this_STEREOTYPE_O_0, grammarAccess.getStereotypeApplicationAccess().getSTEREOTYPE_OTerminalRuleCall_0());
            		
            // InternalCls.g:2010:3: ( ( ruleFQN ) )
            // InternalCls.g:2011:4: ( ruleFQN )
            {
            // InternalCls.g:2011:4: ( ruleFQN )
            // InternalCls.g:2012:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStereotypeApplicationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStereotypeApplicationAccess().getStereotypeStereotypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_49);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_STEREOTYPE_C_2=(Token)match(input,RULE_STEREOTYPE_C,FOLLOW_50); 

            			newLeafNode(this_STEREOTYPE_C_2, grammarAccess.getStereotypeApplicationAccess().getSTEREOTYPE_CTerminalRuleCall_2());
            		
            // InternalCls.g:2030:3: (otherlv_3= '{' ( (lv_values_4_0= ruleTaggedValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleTaggedValue ) ) )* otherlv_7= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==18) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_STRING) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalCls.g:2031:4: otherlv_3= '{' ( (lv_values_4_0= ruleTaggedValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleTaggedValue ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getStereotypeApplicationAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalCls.g:2035:4: ( (lv_values_4_0= ruleTaggedValue ) )
                    // InternalCls.g:2036:5: (lv_values_4_0= ruleTaggedValue )
                    {
                    // InternalCls.g:2036:5: (lv_values_4_0= ruleTaggedValue )
                    // InternalCls.g:2037:6: lv_values_4_0= ruleTaggedValue
                    {

                    						newCompositeNode(grammarAccess.getStereotypeApplicationAccess().getValuesTaggedValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_values_4_0=ruleTaggedValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStereotypeApplicationRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_4_0,
                    							"de.cooperateproject.modeling.textual.cls.Cls.TaggedValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCls.g:2054:4: (otherlv_5= ',' ( (lv_values_6_0= ruleTaggedValue ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==29) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalCls.g:2055:5: otherlv_5= ',' ( (lv_values_6_0= ruleTaggedValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getStereotypeApplicationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalCls.g:2059:5: ( (lv_values_6_0= ruleTaggedValue ) )
                    	    // InternalCls.g:2060:6: (lv_values_6_0= ruleTaggedValue )
                    	    {
                    	    // InternalCls.g:2060:6: (lv_values_6_0= ruleTaggedValue )
                    	    // InternalCls.g:2061:7: lv_values_6_0= ruleTaggedValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStereotypeApplicationAccess().getValuesTaggedValueParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    lv_values_6_0=ruleTaggedValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStereotypeApplicationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_6_0,
                    	    								"de.cooperateproject.modeling.textual.cls.Cls.TaggedValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getStereotypeApplicationAccess().getRightCurlyBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleStereotypeApplication"


    // $ANTLR start "entryRuleTaggedValue"
    // InternalCls.g:2088:1: entryRuleTaggedValue returns [EObject current=null] : iv_ruleTaggedValue= ruleTaggedValue EOF ;
    public final EObject entryRuleTaggedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaggedValue = null;


        try {
            // InternalCls.g:2088:52: (iv_ruleTaggedValue= ruleTaggedValue EOF )
            // InternalCls.g:2089:2: iv_ruleTaggedValue= ruleTaggedValue EOF
            {
             newCompositeNode(grammarAccess.getTaggedValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaggedValue=ruleTaggedValue();

            state._fsp--;

             current =iv_ruleTaggedValue; 
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
    // $ANTLR end "entryRuleTaggedValue"


    // $ANTLR start "ruleTaggedValue"
    // InternalCls.g:2095:1: ruleTaggedValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTaggedValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCls.g:2101:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalCls.g:2102:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalCls.g:2102:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalCls.g:2103:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalCls.g:2103:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalCls.g:2104:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalCls.g:2104:4: (lv_name_0_0= RULE_STRING )
            // InternalCls.g:2105:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTaggedValueAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaggedValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTaggedValueAccess().getColonKeyword_1());
            		
            // InternalCls.g:2125:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCls.g:2126:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalCls.g:2126:4: (lv_value_2_0= RULE_STRING )
            // InternalCls.g:2127:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTaggedValueAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaggedValueRule());
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
    // $ANTLR end "ruleTaggedValue"


    // $ANTLR start "entryRuleRoleName"
    // InternalCls.g:2147:1: entryRuleRoleName returns [String current=null] : iv_ruleRoleName= ruleRoleName EOF ;
    public final String entryRuleRoleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRoleName = null;


        try {
            // InternalCls.g:2147:48: (iv_ruleRoleName= ruleRoleName EOF )
            // InternalCls.g:2148:2: iv_ruleRoleName= ruleRoleName EOF
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
    // InternalCls.g:2154:1: ruleRoleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE ) ;
    public final AntlrDatatypeRuleToken ruleRoleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNDERSCORE_1=null;


        	enterRule();

        try {
            // InternalCls.g:2160:2: ( (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE ) )
            // InternalCls.g:2161:2: (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE )
            {
            // InternalCls.g:2161:2: (this_ID_0= RULE_ID | this_UNDERSCORE_1= RULE_UNDERSCORE )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_UNDERSCORE) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalCls.g:2162:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getRoleNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:2170:3: this_UNDERSCORE_1= RULE_UNDERSCORE
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
    // InternalCls.g:2181:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
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
            // InternalCls.g:2187:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalCls.g:2188:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalCls.g:2188:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt54=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt54=1;
                }
                break;
            case 42:
                {
                alt54=2;
                }
                break;
            case 43:
                {
                alt54=3;
                }
                break;
            case 44:
                {
                alt54=4;
                }
                break;
            case 45:
                {
                alt54=5;
                }
                break;
            case 46:
                {
                alt54=6;
                }
                break;
            case 47:
                {
                alt54=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalCls.g:2189:3: (enumLiteral_0= '+' )
                    {
                    // InternalCls.g:2189:3: (enumLiteral_0= '+' )
                    // InternalCls.g:2190:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:2197:3: (enumLiteral_1= 'public' )
                    {
                    // InternalCls.g:2197:3: (enumLiteral_1= 'public' )
                    // InternalCls.g:2198:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:2205:3: (enumLiteral_2= '-' )
                    {
                    // InternalCls.g:2205:3: (enumLiteral_2= '-' )
                    // InternalCls.g:2206:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:2213:3: (enumLiteral_3= 'private' )
                    {
                    // InternalCls.g:2213:3: (enumLiteral_3= 'private' )
                    // InternalCls.g:2214:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:2221:3: (enumLiteral_4= '#' )
                    {
                    // InternalCls.g:2221:3: (enumLiteral_4= '#' )
                    // InternalCls.g:2222:4: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:2229:3: (enumLiteral_5= 'protected' )
                    {
                    // InternalCls.g:2229:3: (enumLiteral_5= 'protected' )
                    // InternalCls.g:2230:4: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:2237:3: (enumLiteral_6= '~' )
                    {
                    // InternalCls.g:2237:3: (enumLiteral_6= '~' )
                    // InternalCls.g:2238:4: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,47,FOLLOW_2); 

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
    // InternalCls.g:2248:1: ruleAggregationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) ;
    public final Enumerator ruleAggregationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCls.g:2254:2: ( ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) )
            // InternalCls.g:2255:2: ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            {
            // InternalCls.g:2255:2: ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt55=1;
                }
                break;
            case 49:
                {
                alt55=2;
                }
                break;
            case 50:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalCls.g:2256:3: (enumLiteral_0= 'asc' )
                    {
                    // InternalCls.g:2256:3: (enumLiteral_0= 'asc' )
                    // InternalCls.g:2257:4: enumLiteral_0= 'asc'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:2264:3: (enumLiteral_1= 'agg' )
                    {
                    // InternalCls.g:2264:3: (enumLiteral_1= 'agg' )
                    // InternalCls.g:2265:4: enumLiteral_1= 'agg'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:2272:3: (enumLiteral_2= 'com' )
                    {
                    // InternalCls.g:2272:3: (enumLiteral_2= 'com' )
                    // InternalCls.g:2273:4: enumLiteral_2= 'com'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

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


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\10\26\2\uffff";
    static final String dfa_3s = "\1\57\7\31\2\uffff";
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
            return "492:2: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\11\5\1\7\2\uffff";
    static final String dfa_9s = "\1\57\7\32\1\5\1\34\2\uffff";
    static final String dfa_10s = "\12\uffff\1\2\1\1";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\11\20\uffff\1\12\3\uffff\1\10\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\11\20\uffff\1\12\3\uffff\1\10",
            "\1\11\20\uffff\1\12\3\uffff\1\10",
            "\1\11\20\uffff\1\12\3\uffff\1\10",
            "\1\11\20\uffff\1\12\3\uffff\1\10",
            "\1\11\20\uffff\1\12\3\uffff\1\10",
            "\1\11\20\uffff\1\12\3\uffff\1\10",
            "\1\11\20\uffff\1\12\3\uffff\1\10",
            "\1\11",
            "\1\12\23\uffff\1\13\1\12",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "930:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0007FE0382D20002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0007FE0382C20002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0007000380020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0007FE0382DA0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0007FE0382CA0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00070003800A0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000040082L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000FE4004480020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000FE0004480020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004400020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000FE00400000A0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000FE00600000A0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000FE00000000A0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0007000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000006400000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000020080000L});

}