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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@startclass'", "'@endclass'", "'rootPackage'", "'package'", "'{'", "'}'", "'import'", "'.'", "'abstract'", "'class'", "'as'", "'interface'", "'static'", "'final'", "':'", "'('", "','", "')'", "'isa'", "'impl'", "'note'", "'bi'", "'asc'", "';'", "'<'", "'['", "'|'", "']'", "'..'", "'*'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'string'", "'int'", "'double'", "'boolean'", "'char'", "'byte'", "'short'", "'long'", "'float'", "'agg'", "'com'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    // InternalCls.g:68:1: entryRuleClassDiagram returns [EObject current=null] : iv_ruleClassDiagram= ruleClassDiagram EOF ;
    public final EObject entryRuleClassDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDiagram = null;


        try {
            // InternalCls.g:69:2: (iv_ruleClassDiagram= ruleClassDiagram EOF )
            // InternalCls.g:70:2: iv_ruleClassDiagram= ruleClassDiagram EOF
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
    // InternalCls.g:77:1: ruleClassDiagram returns [EObject current=null] : ( () otherlv_1= '@startclass' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@endclass' ) ;
    public final EObject ruleClassDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_4=null;
        EObject lv_rootPackage_3_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:80:28: ( ( () otherlv_1= '@startclass' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@endclass' ) )
            // InternalCls.g:81:1: ( () otherlv_1= '@startclass' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@endclass' )
            {
            // InternalCls.g:81:1: ( () otherlv_1= '@startclass' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@endclass' )
            // InternalCls.g:81:2: () otherlv_1= '@startclass' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@endclass'
            {
            // InternalCls.g:81:2: ()
            // InternalCls.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClassDiagramAccess().getClassDiagramAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getClassDiagramAccess().getStartclassKeyword_1());
                
            // InternalCls.g:91:1: ( (lv_title_2_0= RULE_STRING ) )
            // InternalCls.g:92:1: (lv_title_2_0= RULE_STRING )
            {
            // InternalCls.g:92:1: (lv_title_2_0= RULE_STRING )
            // InternalCls.g:93:3: lv_title_2_0= RULE_STRING
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

            // InternalCls.g:109:2: ( (lv_rootPackage_3_0= ruleRootPackage ) )
            // InternalCls.g:110:1: (lv_rootPackage_3_0= ruleRootPackage )
            {
            // InternalCls.g:110:1: (lv_rootPackage_3_0= ruleRootPackage )
            // InternalCls.g:111:3: lv_rootPackage_3_0= ruleRootPackage
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

                	newLeafNode(otherlv_4, grammarAccess.getClassDiagramAccess().getEndclassKeyword_4());
                

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
    // InternalCls.g:139:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalCls.g:140:2: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalCls.g:141:2: iv_ruleRootPackage= ruleRootPackage EOF
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
    // InternalCls.g:148:1: ruleRootPackage returns [EObject current=null] : (otherlv_0= 'rootPackage' ( ( ruleFQN ) ) ( (lv_packageImports_2_0= rulePackageImport ) )* ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_connectors_4_0= ruleConnector ) )* ( (lv_packages_5_0= rulePackage ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_packageImports_2_0 = null;

        EObject lv_classifiers_3_0 = null;

        EObject lv_connectors_4_0 = null;

        EObject lv_packages_5_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:151:28: ( (otherlv_0= 'rootPackage' ( ( ruleFQN ) ) ( (lv_packageImports_2_0= rulePackageImport ) )* ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_connectors_4_0= ruleConnector ) )* ( (lv_packages_5_0= rulePackage ) )* ) )
            // InternalCls.g:152:1: (otherlv_0= 'rootPackage' ( ( ruleFQN ) ) ( (lv_packageImports_2_0= rulePackageImport ) )* ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_connectors_4_0= ruleConnector ) )* ( (lv_packages_5_0= rulePackage ) )* )
            {
            // InternalCls.g:152:1: (otherlv_0= 'rootPackage' ( ( ruleFQN ) ) ( (lv_packageImports_2_0= rulePackageImport ) )* ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_connectors_4_0= ruleConnector ) )* ( (lv_packages_5_0= rulePackage ) )* )
            // InternalCls.g:152:3: otherlv_0= 'rootPackage' ( ( ruleFQN ) ) ( (lv_packageImports_2_0= rulePackageImport ) )* ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_connectors_4_0= ruleConnector ) )* ( (lv_packages_5_0= rulePackage ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getRootPackageAccess().getRootPackageKeyword_0());
                
            // InternalCls.g:156:1: ( ( ruleFQN ) )
            // InternalCls.g:157:1: ( ruleFQN )
            {
            // InternalCls.g:157:1: ( ruleFQN )
            // InternalCls.g:158:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRootPackageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRootPackageAccess().getReferencedElementPackageCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCls.g:171:2: ( (lv_packageImports_2_0= rulePackageImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCls.g:172:1: (lv_packageImports_2_0= rulePackageImport )
            	    {
            	    // InternalCls.g:172:1: (lv_packageImports_2_0= rulePackageImport )
            	    // InternalCls.g:173:3: lv_packageImports_2_0= rulePackageImport
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

            // InternalCls.g:189:3: ( (lv_classifiers_3_0= ruleClassifier ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=20)||LA2_0==22||(LA2_0>=41 && LA2_0<=47)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCls.g:190:1: (lv_classifiers_3_0= ruleClassifier )
            	    {
            	    // InternalCls.g:190:1: (lv_classifiers_3_0= ruleClassifier )
            	    // InternalCls.g:191:3: lv_classifiers_3_0= ruleClassifier
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

            // InternalCls.g:207:3: ( (lv_connectors_4_0= ruleConnector ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=32 && LA3_0<=33)||(LA3_0>=57 && LA3_0<=58)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCls.g:208:1: (lv_connectors_4_0= ruleConnector )
            	    {
            	    // InternalCls.g:208:1: (lv_connectors_4_0= ruleConnector )
            	    // InternalCls.g:209:3: lv_connectors_4_0= ruleConnector
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

            // InternalCls.g:225:3: ( (lv_packages_5_0= rulePackage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCls.g:226:1: (lv_packages_5_0= rulePackage )
            	    {
            	    // InternalCls.g:226:1: (lv_packages_5_0= rulePackage )
            	    // InternalCls.g:227:3: lv_packages_5_0= rulePackage
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
    // InternalCls.g:251:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalCls.g:252:2: (iv_rulePackage= rulePackage EOF )
            // InternalCls.g:253:2: iv_rulePackage= rulePackage EOF
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
    // InternalCls.g:260:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_packageImports_3_0 = null;

        EObject lv_classifiers_4_0 = null;

        EObject lv_connectors_5_0 = null;

        EObject lv_packages_6_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:263:28: ( (otherlv_0= 'package' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' ) )
            // InternalCls.g:264:1: (otherlv_0= 'package' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' )
            {
            // InternalCls.g:264:1: (otherlv_0= 'package' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}' )
            // InternalCls.g:264:3: otherlv_0= 'package' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* ( (lv_packages_6_0= rulePackage ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // InternalCls.g:268:1: ( ( ruleFQN ) )
            // InternalCls.g:269:1: ( ruleFQN )
            {
            // InternalCls.g:269:1: ( ruleFQN )
            // InternalCls.g:270:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getReferencedElementPackageCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_11);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalCls.g:287:1: ( (lv_packageImports_3_0= rulePackageImport ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCls.g:288:1: (lv_packageImports_3_0= rulePackageImport )
            	    {
            	    // InternalCls.g:288:1: (lv_packageImports_3_0= rulePackageImport )
            	    // InternalCls.g:289:3: lv_packageImports_3_0= rulePackageImport
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

            // InternalCls.g:305:3: ( (lv_classifiers_4_0= ruleClassifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=20)||LA6_0==22||(LA6_0>=41 && LA6_0<=47)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCls.g:306:1: (lv_classifiers_4_0= ruleClassifier )
            	    {
            	    // InternalCls.g:306:1: (lv_classifiers_4_0= ruleClassifier )
            	    // InternalCls.g:307:3: lv_classifiers_4_0= ruleClassifier
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

            // InternalCls.g:323:3: ( (lv_connectors_5_0= ruleConnector ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=32 && LA7_0<=33)||(LA7_0>=57 && LA7_0<=58)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCls.g:324:1: (lv_connectors_5_0= ruleConnector )
            	    {
            	    // InternalCls.g:324:1: (lv_connectors_5_0= ruleConnector )
            	    // InternalCls.g:325:3: lv_connectors_5_0= ruleConnector
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

            // InternalCls.g:341:3: ( (lv_packages_6_0= rulePackage ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCls.g:342:1: (lv_packages_6_0= rulePackage )
            	    {
            	    // InternalCls.g:342:1: (lv_packages_6_0= rulePackage )
            	    // InternalCls.g:343:3: lv_packages_6_0= rulePackage
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
    // InternalCls.g:371:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // InternalCls.g:372:2: (iv_rulePackageImport= rulePackageImport EOF )
            // InternalCls.g:373:2: iv_rulePackageImport= rulePackageImport EOF
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
    // InternalCls.g:380:1: rulePackageImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleFQN ) ) ) ;
    public final EObject rulePackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalCls.g:383:28: ( (otherlv_0= 'import' ( ( ruleFQN ) ) ) )
            // InternalCls.g:384:1: (otherlv_0= 'import' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:384:1: (otherlv_0= 'import' ( ( ruleFQN ) ) )
            // InternalCls.g:384:3: otherlv_0= 'import' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageImportAccess().getImportKeyword_0());
                
            // InternalCls.g:388:1: ( ( ruleFQN ) )
            // InternalCls.g:389:1: ( ruleFQN )
            {
            // InternalCls.g:389:1: ( ruleFQN )
            // InternalCls.g:390:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageImportRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPackageImportAccess().getReferencedElementPackageImportCrossReference_1_0()); 
            	    
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


    // $ANTLR start "entryRuleNameString"
    // InternalCls.g:411:1: entryRuleNameString returns [String current=null] : iv_ruleNameString= ruleNameString EOF ;
    public final String entryRuleNameString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameString = null;


        try {
            // InternalCls.g:412:2: (iv_ruleNameString= ruleNameString EOF )
            // InternalCls.g:413:2: iv_ruleNameString= ruleNameString EOF
            {
             newCompositeNode(grammarAccess.getNameStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameString=ruleNameString();

            state._fsp--;

             current =iv_ruleNameString.getText(); 
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
    // $ANTLR end "entryRuleNameString"


    // $ANTLR start "ruleNameString"
    // InternalCls.g:420:1: ruleNameString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNameString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // InternalCls.g:423:28: (this_STRING_0= RULE_STRING )
            // InternalCls.g:424:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getNameStringAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleNameString"


    // $ANTLR start "entryRuleFQN"
    // InternalCls.g:439:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCls.g:440:2: (iv_ruleFQN= ruleFQN EOF )
            // InternalCls.g:441:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCls.g:448:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalCls.g:451:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCls.g:452:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCls.g:452:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCls.g:452:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // InternalCls.g:459:1: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCls.g:460:2: kw= '.' this_ID_2= RULE_ID
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
    // InternalCls.g:480:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalCls.g:481:2: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalCls.g:482:2: iv_ruleClassifier= ruleClassifier EOF
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
    // InternalCls.g:489:1: ruleClassifier returns [EObject current=null] : (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Interface_1 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:492:28: ( (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) )
            // InternalCls.g:493:1: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            {
            // InternalCls.g:493:1: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalCls.g:494:5: this_Class_0= ruleClass
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
                    // InternalCls.g:504:5: this_Interface_1= ruleInterface
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
    // InternalCls.g:520:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalCls.g:521:2: (iv_ruleClass= ruleClass EOF )
            // InternalCls.g:522:2: iv_ruleClass= ruleClass EOF
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
    // InternalCls.g:529:1: ruleClass returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ) ) (otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_members_10_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:532:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ) ) (otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )? ) )
            // InternalCls.g:533:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ) ) (otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )? )
            {
            // InternalCls.g:533:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ) ) (otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )? )
            // InternalCls.g:533:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ) ) (otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )?
            {
            // InternalCls.g:533:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=41 && LA11_0<=47)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCls.g:534:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:534:1: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:535:3: lv_visibility_0_0= ruleVisibility
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

            // InternalCls.g:551:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCls.g:552:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:552:1: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:553:3: lv_abstract_1_0= 'abstract'
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
                
            // InternalCls.g:570:1: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) ) )
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
                    // InternalCls.g:570:2: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? )
                    {
                    // InternalCls.g:570:2: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? )
                    // InternalCls.g:570:3: ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )?
                    {
                    // InternalCls.g:570:3: ( (otherlv_3= RULE_ID ) )
                    // InternalCls.g:571:1: (otherlv_3= RULE_ID )
                    {
                    // InternalCls.g:571:1: (otherlv_3= RULE_ID )
                    // InternalCls.g:572:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

                    		newLeafNode(otherlv_3, grammarAccess.getClassAccess().getReferencedElementClassCrossReference_3_0_0_0()); 
                    	

                    }


                    }

                    // InternalCls.g:583:2: (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==21) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalCls.g:583:4: otherlv_4= 'as' ( (otherlv_5= RULE_ID ) )
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_6); 

                                	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getAsKeyword_3_0_1_0());
                                
                            // InternalCls.g:587:1: ( (otherlv_5= RULE_ID ) )
                            // InternalCls.g:588:1: (otherlv_5= RULE_ID )
                            {
                            // InternalCls.g:588:1: (otherlv_5= RULE_ID )
                            // InternalCls.g:589:3: otherlv_5= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getClassRule());
                            	        }
                                    
                            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

                            		newLeafNode(otherlv_5, grammarAccess.getClassAccess().getAliasExpressionStringExpressionCrossReference_3_0_1_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:601:6: ( ( ( ruleNameString ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalCls.g:601:6: ( ( ( ruleNameString ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) ) )
                    // InternalCls.g:601:7: ( ( ruleNameString ) ) otherlv_7= 'as' ( (otherlv_8= RULE_ID ) )
                    {
                    // InternalCls.g:601:7: ( ( ruleNameString ) )
                    // InternalCls.g:602:1: ( ruleNameString )
                    {
                    // InternalCls.g:602:1: ( ruleNameString )
                    // InternalCls.g:603:3: ruleNameString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getReferencedElementClassCrossReference_3_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_22);
                    ruleNameString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_6); 

                        	newLeafNode(otherlv_7, grammarAccess.getClassAccess().getAsKeyword_3_1_1());
                        
                    // InternalCls.g:620:1: ( (otherlv_8= RULE_ID ) )
                    // InternalCls.g:621:1: (otherlv_8= RULE_ID )
                    {
                    // InternalCls.g:621:1: (otherlv_8= RULE_ID )
                    // InternalCls.g:622:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_21); 

                    		newLeafNode(otherlv_8, grammarAccess.getClassAccess().getAliasExpressionStringExpressionCrossReference_3_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalCls.g:633:4: (otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCls.g:633:6: otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_23); 

                        	newLeafNode(otherlv_9, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // InternalCls.g:637:1: ( (lv_members_10_0= ruleMember ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||LA15_0==19||(LA15_0>=23 && LA15_0<=24)||(LA15_0>=41 && LA15_0<=47)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCls.g:638:1: (lv_members_10_0= ruleMember )
                    	    {
                    	    // InternalCls.g:638:1: (lv_members_10_0= ruleMember )
                    	    // InternalCls.g:639:3: lv_members_10_0= ruleMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_1_0()); 
                    	    	    
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_2); 

                        	newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_2());
                        

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
    // InternalCls.g:667:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCls.g:668:2: (iv_ruleInterface= ruleInterface EOF )
            // InternalCls.g:669:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalCls.g:676:1: ruleInterface returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) ) ) (otherlv_8= '{' ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_members_9_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:679:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) ) ) (otherlv_8= '{' ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' )? ) )
            // InternalCls.g:680:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) ) ) (otherlv_8= '{' ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' )? )
            {
            // InternalCls.g:680:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) ) ) (otherlv_8= '{' ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' )? )
            // InternalCls.g:680:2: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) ) ) (otherlv_8= '{' ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' )?
            {
            // InternalCls.g:680:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=41 && LA17_0<=47)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCls.g:681:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:681:1: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:682:3: lv_visibility_0_0= ruleVisibility
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

            otherlv_1=(Token)match(input,22,FOLLOW_19); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
                
            // InternalCls.g:702:1: ( ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) | ( ( ( ruleNameString ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCls.g:702:2: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
                    {
                    // InternalCls.g:702:2: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
                    // InternalCls.g:702:3: ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
                    {
                    // InternalCls.g:702:3: ( (otherlv_2= RULE_ID ) )
                    // InternalCls.g:703:1: (otherlv_2= RULE_ID )
                    {
                    // InternalCls.g:703:1: (otherlv_2= RULE_ID )
                    // InternalCls.g:704:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

                    		newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_2_0_0_0()); 
                    	

                    }


                    }

                    // InternalCls.g:715:2: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==21) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalCls.g:715:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                            {
                            otherlv_3=(Token)match(input,21,FOLLOW_6); 

                                	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getAsKeyword_2_0_1_0());
                                
                            // InternalCls.g:719:1: ( (otherlv_4= RULE_ID ) )
                            // InternalCls.g:720:1: (otherlv_4= RULE_ID )
                            {
                            // InternalCls.g:720:1: (otherlv_4= RULE_ID )
                            // InternalCls.g:721:3: otherlv_4= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getInterfaceRule());
                            	        }
                                    
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

                            		newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getAliasExpressionStringExpressionCrossReference_2_0_1_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:733:6: ( ( ( ruleNameString ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalCls.g:733:6: ( ( ( ruleNameString ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) ) )
                    // InternalCls.g:733:7: ( ( ruleNameString ) ) otherlv_6= 'as' ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalCls.g:733:7: ( ( ruleNameString ) )
                    // InternalCls.g:734:1: ( ruleNameString )
                    {
                    // InternalCls.g:734:1: ( ruleNameString )
                    // InternalCls.g:735:3: ruleNameString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_2_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_22);
                    ruleNameString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_6); 

                        	newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getAsKeyword_2_1_1());
                        
                    // InternalCls.g:752:1: ( (otherlv_7= RULE_ID ) )
                    // InternalCls.g:753:1: (otherlv_7= RULE_ID )
                    {
                    // InternalCls.g:753:1: (otherlv_7= RULE_ID )
                    // InternalCls.g:754:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_21); 

                    		newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getAliasExpressionStringExpressionCrossReference_2_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalCls.g:765:4: (otherlv_8= '{' ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCls.g:765:6: otherlv_8= '{' ( (lv_members_9_0= ruleMember ) )* otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_23); 

                        	newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalCls.g:769:1: ( (lv_members_9_0= ruleMember ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID||LA20_0==19||(LA20_0>=23 && LA20_0<=24)||(LA20_0>=41 && LA20_0<=47)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalCls.g:770:1: (lv_members_9_0= ruleMember )
                    	    {
                    	    // InternalCls.g:770:1: (lv_members_9_0= ruleMember )
                    	    // InternalCls.g:771:3: lv_members_9_0= ruleMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_3_1_0()); 
                    	    	    
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_2); 

                        	newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3_2());
                        

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


    // $ANTLR start "entryRuleTypeReference"
    // InternalCls.g:799:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalCls.g:800:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalCls.g:801:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalCls.g:808:1: ruleTypeReference returns [EObject current=null] : (this_DataTypeReference_0= ruleDataTypeReference | this_UMLTypeReference_1= ruleUMLTypeReference ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeReference_0 = null;

        EObject this_UMLTypeReference_1 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:811:28: ( (this_DataTypeReference_0= ruleDataTypeReference | this_UMLTypeReference_1= ruleUMLTypeReference ) )
            // InternalCls.g:812:1: (this_DataTypeReference_0= ruleDataTypeReference | this_UMLTypeReference_1= ruleUMLTypeReference )
            {
            // InternalCls.g:812:1: (this_DataTypeReference_0= ruleDataTypeReference | this_UMLTypeReference_1= ruleUMLTypeReference )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=48 && LA22_0<=56)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCls.g:813:5: this_DataTypeReference_0= ruleDataTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getTypeReferenceAccess().getDataTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DataTypeReference_0=ruleDataTypeReference();

                    state._fsp--;

                     
                            current = this_DataTypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalCls.g:823:5: this_UMLTypeReference_1= ruleUMLTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getTypeReferenceAccess().getUMLTypeReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_UMLTypeReference_1=ruleUMLTypeReference();

                    state._fsp--;

                     
                            current = this_UMLTypeReference_1; 
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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleDataTypeReference"
    // InternalCls.g:839:1: entryRuleDataTypeReference returns [EObject current=null] : iv_ruleDataTypeReference= ruleDataTypeReference EOF ;
    public final EObject entryRuleDataTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeReference = null;


        try {
            // InternalCls.g:840:2: (iv_ruleDataTypeReference= ruleDataTypeReference EOF )
            // InternalCls.g:841:2: iv_ruleDataTypeReference= ruleDataTypeReference EOF
            {
             newCompositeNode(grammarAccess.getDataTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeReference=ruleDataTypeReference();

            state._fsp--;

             current =iv_ruleDataTypeReference; 
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
    // $ANTLR end "entryRuleDataTypeReference"


    // $ANTLR start "ruleDataTypeReference"
    // InternalCls.g:848:1: ruleDataTypeReference returns [EObject current=null] : ( (lv_type_0_0= rulePrimitiveType ) ) ;
    public final EObject ruleDataTypeReference() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:851:28: ( ( (lv_type_0_0= rulePrimitiveType ) ) )
            // InternalCls.g:852:1: ( (lv_type_0_0= rulePrimitiveType ) )
            {
            // InternalCls.g:852:1: ( (lv_type_0_0= rulePrimitiveType ) )
            // InternalCls.g:853:1: (lv_type_0_0= rulePrimitiveType )
            {
            // InternalCls.g:853:1: (lv_type_0_0= rulePrimitiveType )
            // InternalCls.g:854:3: lv_type_0_0= rulePrimitiveType
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeReferenceAccess().getTypePrimitiveTypeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_type_0_0=rulePrimitiveType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypeReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.PrimitiveType");
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
    // $ANTLR end "ruleDataTypeReference"


    // $ANTLR start "entryRuleUMLTypeReference"
    // InternalCls.g:878:1: entryRuleUMLTypeReference returns [EObject current=null] : iv_ruleUMLTypeReference= ruleUMLTypeReference EOF ;
    public final EObject entryRuleUMLTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUMLTypeReference = null;


        try {
            // InternalCls.g:879:2: (iv_ruleUMLTypeReference= ruleUMLTypeReference EOF )
            // InternalCls.g:880:2: iv_ruleUMLTypeReference= ruleUMLTypeReference EOF
            {
             newCompositeNode(grammarAccess.getUMLTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUMLTypeReference=ruleUMLTypeReference();

            state._fsp--;

             current =iv_ruleUMLTypeReference; 
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
    // $ANTLR end "entryRuleUMLTypeReference"


    // $ANTLR start "ruleUMLTypeReference"
    // InternalCls.g:887:1: ruleUMLTypeReference returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleUMLTypeReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalCls.g:890:28: ( ( ( ruleFQN ) ) )
            // InternalCls.g:891:1: ( ( ruleFQN ) )
            {
            // InternalCls.g:891:1: ( ( ruleFQN ) )
            // InternalCls.g:892:1: ( ruleFQN )
            {
            // InternalCls.g:892:1: ( ruleFQN )
            // InternalCls.g:893:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUMLTypeReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getUMLTypeReferenceAccess().getTypeTypeCrossReference_0()); 
            	    
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
    // $ANTLR end "ruleUMLTypeReference"


    // $ANTLR start "entryRuleMember"
    // InternalCls.g:914:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalCls.g:915:2: (iv_ruleMember= ruleMember EOF )
            // InternalCls.g:916:2: iv_ruleMember= ruleMember EOF
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
            // InternalCls.g:926:28: ( (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) )
            // InternalCls.g:927:1: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            {
            // InternalCls.g:927:1: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalCls.g:928:5: this_Attribute_0= ruleAttribute
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
                    // InternalCls.g:938:5: this_Method_1= ruleMethod
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
    // InternalCls.g:954:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalCls.g:955:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalCls.g:956:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalCls.g:963:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_final_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:966:28: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) ) )
            // InternalCls.g:967:1: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) )
            {
            // InternalCls.g:967:1: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) )
            // InternalCls.g:967:2: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) )
            {
            // InternalCls.g:967:2: ()
            // InternalCls.g:968:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            // InternalCls.g:973:2: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=41 && LA24_0<=47)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCls.g:974:1: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalCls.g:974:1: (lv_visibility_1_0= ruleVisibility )
                    // InternalCls.g:975:3: lv_visibility_1_0= ruleVisibility
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

            // InternalCls.g:991:3: ( (lv_static_2_0= 'static' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:992:1: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:992:1: (lv_static_2_0= 'static' )
                    // InternalCls.g:993:3: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,23,FOLLOW_26); 

                            newLeafNode(lv_static_2_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "static", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:1006:3: ( (lv_final_3_0= 'final' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:1007:1: (lv_final_3_0= 'final' )
                    {
                    // InternalCls.g:1007:1: (lv_final_3_0= 'final' )
                    // InternalCls.g:1008:3: lv_final_3_0= 'final'
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

            // InternalCls.g:1021:3: ( (otherlv_4= RULE_ID ) )
            // InternalCls.g:1022:1: (otherlv_4= RULE_ID )
            {
            // InternalCls.g:1022:1: (otherlv_4= RULE_ID )
            // InternalCls.g:1023:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); 

            		newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getReferencedElementPropertyCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_28); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getColonKeyword_5());
                
            // InternalCls.g:1038:1: ( (lv_type_6_0= ruleTypeReference ) )
            // InternalCls.g:1039:1: (lv_type_6_0= ruleTypeReference )
            {
            // InternalCls.g:1039:1: (lv_type_6_0= ruleTypeReference )
            // InternalCls.g:1040:3: lv_type_6_0= ruleTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeReferenceParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_type_6_0=ruleTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.TypeReference");
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
    // InternalCls.g:1064:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalCls.g:1065:2: (iv_ruleMethod= ruleMethod EOF )
            // InternalCls.g:1066:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalCls.g:1073:1: ruleMethod returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_static_2_0=null;
        Token lv_final_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_type_11_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1076:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )? ) )
            // InternalCls.g:1077:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )? )
            {
            // InternalCls.g:1077:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )? )
            // InternalCls.g:1077:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )?
            {
            // InternalCls.g:1077:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=41 && LA27_0<=47)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:1078:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:1078:1: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:1079:3: lv_visibility_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_29);
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

            // InternalCls.g:1095:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:1096:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:1096:1: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:1097:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,19,FOLLOW_25); 

                            newLeafNode(lv_abstract_1_0, grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:1110:3: ( (lv_static_2_0= 'static' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:1111:1: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:1111:1: (lv_static_2_0= 'static' )
                    // InternalCls.g:1112:3: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,23,FOLLOW_26); 

                            newLeafNode(lv_static_2_0, grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "static", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:1125:3: ( (lv_final_3_0= 'final' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCls.g:1126:1: (lv_final_3_0= 'final' )
                    {
                    // InternalCls.g:1126:1: (lv_final_3_0= 'final' )
                    // InternalCls.g:1127:3: lv_final_3_0= 'final'
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

            // InternalCls.g:1140:3: ( (otherlv_4= RULE_ID ) )
            // InternalCls.g:1141:1: (otherlv_4= RULE_ID )
            {
            // InternalCls.g:1141:1: (otherlv_4= RULE_ID )
            // InternalCls.g:1142:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_30); 

            		newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getReferencedElementOperationCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_31); 

                	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
                
            // InternalCls.g:1157:1: ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=23 && LA32_0<=24)||(LA32_0>=41 && LA32_0<=47)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCls.g:1157:2: ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    {
            	    // InternalCls.g:1157:2: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalCls.g:1158:1: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalCls.g:1158:1: (lv_parameters_6_0= ruleParameter )
            	    // InternalCls.g:1159:3: lv_parameters_6_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_32);
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

            	    // InternalCls.g:1175:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==27) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalCls.g:1175:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,27,FOLLOW_33); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
            	    	        
            	    	    // InternalCls.g:1179:1: ( (lv_parameters_8_0= ruleParameter ) )
            	    	    // InternalCls.g:1180:1: (lv_parameters_8_0= ruleParameter )
            	    	    {
            	    	    // InternalCls.g:1180:1: (lv_parameters_8_0= ruleParameter )
            	    	    // InternalCls.g:1181:3: lv_parameters_8_0= ruleParameter
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_32);
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
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_9=(Token)match(input,28,FOLLOW_34); 

                	newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
                
            // InternalCls.g:1201:1: (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:1201:3: otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) )
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_28); 

                        	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getColonKeyword_8_0());
                        
                    // InternalCls.g:1205:1: ( (lv_type_11_0= ruleTypeReference ) )
                    // InternalCls.g:1206:1: (lv_type_11_0= ruleTypeReference )
                    {
                    // InternalCls.g:1206:1: (lv_type_11_0= ruleTypeReference )
                    // InternalCls.g:1207:3: lv_type_11_0= ruleTypeReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getTypeTypeReferenceParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_type_11_0=ruleTypeReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_11_0, 
                            		"de.cooperateproject.modeling.textual.cls.Cls.TypeReference");
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
    // InternalCls.g:1231:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCls.g:1232:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalCls.g:1233:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCls.g:1240:1: ruleParameter returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleTypeReference ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_final_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1243:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleTypeReference ) ) ) )
            // InternalCls.g:1244:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleTypeReference ) ) )
            {
            // InternalCls.g:1244:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleTypeReference ) ) )
            // InternalCls.g:1244:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleTypeReference ) )
            {
            // InternalCls.g:1244:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=41 && LA34_0<=47)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:1245:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:1245:1: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:1246:3: lv_visibility_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_25);
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

            // InternalCls.g:1262:3: ( (lv_static_1_0= 'static' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:1263:1: (lv_static_1_0= 'static' )
                    {
                    // InternalCls.g:1263:1: (lv_static_1_0= 'static' )
                    // InternalCls.g:1264:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,23,FOLLOW_26); 

                            newLeafNode(lv_static_1_0, grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "static", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:1277:3: ( (lv_final_2_0= 'final' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCls.g:1278:1: (lv_final_2_0= 'final' )
                    {
                    // InternalCls.g:1278:1: (lv_final_2_0= 'final' )
                    // InternalCls.g:1279:3: lv_final_2_0= 'final'
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

            // InternalCls.g:1292:3: ( (otherlv_3= RULE_ID ) )
            // InternalCls.g:1293:1: (otherlv_3= RULE_ID )
            {
            // InternalCls.g:1293:1: (otherlv_3= RULE_ID )
            // InternalCls.g:1294:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            		newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getReferencedElementParameterCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_28); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getColonKeyword_4());
                
            // InternalCls.g:1309:1: ( (lv_type_5_0= ruleTypeReference ) )
            // InternalCls.g:1310:1: (lv_type_5_0= ruleTypeReference )
            {
            // InternalCls.g:1310:1: (lv_type_5_0= ruleTypeReference )
            // InternalCls.g:1311:3: lv_type_5_0= ruleTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeReferenceParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_type_5_0=ruleTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_5_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.TypeReference");
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
    // InternalCls.g:1335:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCls.g:1336:2: (iv_ruleConnector= ruleConnector EOF )
            // InternalCls.g:1337:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalCls.g:1344:1: ruleConnector returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink | this_MultiAssociation_4= ruleMultiAssociation ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_Association_1 = null;

        EObject this_Implementation_2 = null;

        EObject this_CommentLink_3 = null;

        EObject this_MultiAssociation_4 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1347:28: ( (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink | this_MultiAssociation_4= ruleMultiAssociation ) )
            // InternalCls.g:1348:1: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink | this_MultiAssociation_4= ruleMultiAssociation )
            {
            // InternalCls.g:1348:1: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink | this_MultiAssociation_4= ruleMultiAssociation )
            int alt37=5;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalCls.g:1349:5: this_Generalization_0= ruleGeneralization
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
                    // InternalCls.g:1359:5: this_Association_1= ruleAssociation
                    {
                     
                            newCompositeNode(grammarAccess.getConnectorAccess().getAssociationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Association_1=ruleAssociation();

                    state._fsp--;

                     
                            current = this_Association_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalCls.g:1369:5: this_Implementation_2= ruleImplementation
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
                    // InternalCls.g:1379:5: this_CommentLink_3= ruleCommentLink
                    {
                     
                            newCompositeNode(grammarAccess.getConnectorAccess().getCommentLinkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CommentLink_3=ruleCommentLink();

                    state._fsp--;

                     
                            current = this_CommentLink_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalCls.g:1389:5: this_MultiAssociation_4= ruleMultiAssociation
                    {
                     
                            newCompositeNode(grammarAccess.getConnectorAccess().getMultiAssociationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_MultiAssociation_4=ruleMultiAssociation();

                    state._fsp--;

                     
                            current = this_MultiAssociation_4; 
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
    // InternalCls.g:1405:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalCls.g:1406:2: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalCls.g:1407:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalCls.g:1414:1: ruleGeneralization returns [EObject current=null] : ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleUMLTypeReference ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1417:28: ( ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleUMLTypeReference ) ) ) )
            // InternalCls.g:1418:1: ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleUMLTypeReference ) ) )
            {
            // InternalCls.g:1418:1: ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleUMLTypeReference ) ) )
            // InternalCls.g:1418:2: ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleUMLTypeReference ) )
            {
            // InternalCls.g:1418:2: ( (lv_left_0_0= ruleUMLTypeReference ) )
            // InternalCls.g:1419:1: (lv_left_0_0= ruleUMLTypeReference )
            {
            // InternalCls.g:1419:1: (lv_left_0_0= ruleUMLTypeReference )
            // InternalCls.g:1420:3: lv_left_0_0= ruleUMLTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getGeneralizationAccess().getLeftUMLTypeReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_35);
            lv_left_0_0=ruleUMLTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneralizationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.UMLTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_6); 

                	newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getIsaKeyword_1());
                
            // InternalCls.g:1440:1: ( (lv_right_2_0= ruleUMLTypeReference ) )
            // InternalCls.g:1441:1: (lv_right_2_0= ruleUMLTypeReference )
            {
            // InternalCls.g:1441:1: (lv_right_2_0= ruleUMLTypeReference )
            // InternalCls.g:1442:3: lv_right_2_0= ruleUMLTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getGeneralizationAccess().getRightUMLTypeReferenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleUMLTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneralizationRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.UMLTypeReference");
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


    // $ANTLR start "entryRuleImplementation"
    // InternalCls.g:1466:1: entryRuleImplementation returns [EObject current=null] : iv_ruleImplementation= ruleImplementation EOF ;
    public final EObject entryRuleImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementation = null;


        try {
            // InternalCls.g:1467:2: (iv_ruleImplementation= ruleImplementation EOF )
            // InternalCls.g:1468:2: iv_ruleImplementation= ruleImplementation EOF
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
    // InternalCls.g:1475:1: ruleImplementation returns [EObject current=null] : ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleUMLTypeReference ) ) ) ;
    public final EObject ruleImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1478:28: ( ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleUMLTypeReference ) ) ) )
            // InternalCls.g:1479:1: ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleUMLTypeReference ) ) )
            {
            // InternalCls.g:1479:1: ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleUMLTypeReference ) ) )
            // InternalCls.g:1479:2: ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleUMLTypeReference ) )
            {
            // InternalCls.g:1479:2: ( (lv_left_0_0= ruleUMLTypeReference ) )
            // InternalCls.g:1480:1: (lv_left_0_0= ruleUMLTypeReference )
            {
            // InternalCls.g:1480:1: (lv_left_0_0= ruleUMLTypeReference )
            // InternalCls.g:1481:3: lv_left_0_0= ruleUMLTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getImplementationAccess().getLeftUMLTypeReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_36);
            lv_left_0_0=ruleUMLTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplementationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.UMLTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_6); 

                	newLeafNode(otherlv_1, grammarAccess.getImplementationAccess().getImplKeyword_1());
                
            // InternalCls.g:1501:1: ( (lv_right_2_0= ruleUMLTypeReference ) )
            // InternalCls.g:1502:1: (lv_right_2_0= ruleUMLTypeReference )
            {
            // InternalCls.g:1502:1: (lv_right_2_0= ruleUMLTypeReference )
            // InternalCls.g:1503:3: lv_right_2_0= ruleUMLTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getImplementationAccess().getRightUMLTypeReferenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleUMLTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplementationRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.UMLTypeReference");
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
    // $ANTLR end "ruleImplementation"


    // $ANTLR start "entryRuleCommentLink"
    // InternalCls.g:1527:1: entryRuleCommentLink returns [EObject current=null] : iv_ruleCommentLink= ruleCommentLink EOF ;
    public final EObject entryRuleCommentLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentLink = null;


        try {
            // InternalCls.g:1528:2: (iv_ruleCommentLink= ruleCommentLink EOF )
            // InternalCls.g:1529:2: iv_ruleCommentLink= ruleCommentLink EOF
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
    // InternalCls.g:1536:1: ruleCommentLink returns [EObject current=null] : ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'note' ( ( ruleCommentBody ) ) ) ;
    public final EObject ruleCommentLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1539:28: ( ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'note' ( ( ruleCommentBody ) ) ) )
            // InternalCls.g:1540:1: ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'note' ( ( ruleCommentBody ) ) )
            {
            // InternalCls.g:1540:1: ( ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'note' ( ( ruleCommentBody ) ) )
            // InternalCls.g:1540:2: ( (lv_left_0_0= ruleUMLTypeReference ) ) otherlv_1= 'note' ( ( ruleCommentBody ) )
            {
            // InternalCls.g:1540:2: ( (lv_left_0_0= ruleUMLTypeReference ) )
            // InternalCls.g:1541:1: (lv_left_0_0= ruleUMLTypeReference )
            {
            // InternalCls.g:1541:1: (lv_left_0_0= ruleUMLTypeReference )
            // InternalCls.g:1542:3: lv_left_0_0= ruleUMLTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getCommentLinkAccess().getLeftUMLTypeReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_37);
            lv_left_0_0=ruleUMLTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommentLinkRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.UMLTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getCommentLinkAccess().getNoteKeyword_1());
                
            // InternalCls.g:1562:1: ( ( ruleCommentBody ) )
            // InternalCls.g:1563:1: ( ruleCommentBody )
            {
            // InternalCls.g:1563:1: ( ruleCommentBody )
            // InternalCls.g:1564:3: ruleCommentBody
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCommentLinkAccess().getCommentCommentCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            ruleCommentBody();

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


    // $ANTLR start "entryRuleAssociation"
    // InternalCls.g:1585:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalCls.g:1586:2: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalCls.g:1587:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalCls.g:1594:1: ruleAssociation returns [EObject current=null] : ( ( (lv_bidirectional_0_0= 'bi' ) )? ( (lv_aggregationKind_1_0= ruleAggregationKind ) ) ( (lv_left_2_0= ruleUMLTypeReference ) ) ( ( (otherlv_3= RULE_ID ) ) | ( ( ruleNameString ) ) ) ( (lv_right_5_0= ruleUMLTypeReference ) ) ( (lv_properties_6_0= ruleAssociationProperties ) )? (otherlv_7= 'note' ( ( ruleCommentBody ) ) )? ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_bidirectional_0_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Enumerator lv_aggregationKind_1_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_right_5_0 = null;

        EObject lv_properties_6_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1597:28: ( ( ( (lv_bidirectional_0_0= 'bi' ) )? ( (lv_aggregationKind_1_0= ruleAggregationKind ) ) ( (lv_left_2_0= ruleUMLTypeReference ) ) ( ( (otherlv_3= RULE_ID ) ) | ( ( ruleNameString ) ) ) ( (lv_right_5_0= ruleUMLTypeReference ) ) ( (lv_properties_6_0= ruleAssociationProperties ) )? (otherlv_7= 'note' ( ( ruleCommentBody ) ) )? ) )
            // InternalCls.g:1598:1: ( ( (lv_bidirectional_0_0= 'bi' ) )? ( (lv_aggregationKind_1_0= ruleAggregationKind ) ) ( (lv_left_2_0= ruleUMLTypeReference ) ) ( ( (otherlv_3= RULE_ID ) ) | ( ( ruleNameString ) ) ) ( (lv_right_5_0= ruleUMLTypeReference ) ) ( (lv_properties_6_0= ruleAssociationProperties ) )? (otherlv_7= 'note' ( ( ruleCommentBody ) ) )? )
            {
            // InternalCls.g:1598:1: ( ( (lv_bidirectional_0_0= 'bi' ) )? ( (lv_aggregationKind_1_0= ruleAggregationKind ) ) ( (lv_left_2_0= ruleUMLTypeReference ) ) ( ( (otherlv_3= RULE_ID ) ) | ( ( ruleNameString ) ) ) ( (lv_right_5_0= ruleUMLTypeReference ) ) ( (lv_properties_6_0= ruleAssociationProperties ) )? (otherlv_7= 'note' ( ( ruleCommentBody ) ) )? )
            // InternalCls.g:1598:2: ( (lv_bidirectional_0_0= 'bi' ) )? ( (lv_aggregationKind_1_0= ruleAggregationKind ) ) ( (lv_left_2_0= ruleUMLTypeReference ) ) ( ( (otherlv_3= RULE_ID ) ) | ( ( ruleNameString ) ) ) ( (lv_right_5_0= ruleUMLTypeReference ) ) ( (lv_properties_6_0= ruleAssociationProperties ) )? (otherlv_7= 'note' ( ( ruleCommentBody ) ) )?
            {
            // InternalCls.g:1598:2: ( (lv_bidirectional_0_0= 'bi' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:1599:1: (lv_bidirectional_0_0= 'bi' )
                    {
                    // InternalCls.g:1599:1: (lv_bidirectional_0_0= 'bi' )
                    // InternalCls.g:1600:3: lv_bidirectional_0_0= 'bi'
                    {
                    lv_bidirectional_0_0=(Token)match(input,32,FOLLOW_38); 

                            newLeafNode(lv_bidirectional_0_0, grammarAccess.getAssociationAccess().getBidirectionalBiKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationRule());
                    	        }
                           		setWithLastConsumed(current, "bidirectional", true, "bi");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:1613:3: ( (lv_aggregationKind_1_0= ruleAggregationKind ) )
            // InternalCls.g:1614:1: (lv_aggregationKind_1_0= ruleAggregationKind )
            {
            // InternalCls.g:1614:1: (lv_aggregationKind_1_0= ruleAggregationKind )
            // InternalCls.g:1615:3: lv_aggregationKind_1_0= ruleAggregationKind
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getAggregationKindAggregationKindEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_6);
            lv_aggregationKind_1_0=ruleAggregationKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"aggregationKind",
                    		lv_aggregationKind_1_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.AggregationKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCls.g:1631:2: ( (lv_left_2_0= ruleUMLTypeReference ) )
            // InternalCls.g:1632:1: (lv_left_2_0= ruleUMLTypeReference )
            {
            // InternalCls.g:1632:1: (lv_left_2_0= ruleUMLTypeReference )
            // InternalCls.g:1633:3: lv_left_2_0= ruleUMLTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getLeftUMLTypeReferenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_19);
            lv_left_2_0=ruleUMLTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_2_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.UMLTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCls.g:1649:2: ( ( (otherlv_3= RULE_ID ) ) | ( ( ruleNameString ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_STRING) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalCls.g:1649:3: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalCls.g:1649:3: ( (otherlv_3= RULE_ID ) )
                    // InternalCls.g:1650:1: (otherlv_3= RULE_ID )
                    {
                    // InternalCls.g:1650:1: (otherlv_3= RULE_ID )
                    // InternalCls.g:1651:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    		newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_3_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1663:6: ( ( ruleNameString ) )
                    {
                    // InternalCls.g:1663:6: ( ( ruleNameString ) )
                    // InternalCls.g:1664:1: ( ruleNameString )
                    {
                    // InternalCls.g:1664:1: ( ruleNameString )
                    // InternalCls.g:1665:3: ruleNameString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_6);
                    ruleNameString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalCls.g:1678:3: ( (lv_right_5_0= ruleUMLTypeReference ) )
            // InternalCls.g:1679:1: (lv_right_5_0= ruleUMLTypeReference )
            {
            // InternalCls.g:1679:1: (lv_right_5_0= ruleUMLTypeReference )
            // InternalCls.g:1680:3: lv_right_5_0= ruleUMLTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getRightUMLTypeReferenceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_39);
            lv_right_5_0=ruleUMLTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_5_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.UMLTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCls.g:1696:2: ( (lv_properties_6_0= ruleAssociationProperties ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCls.g:1697:1: (lv_properties_6_0= ruleAssociationProperties )
                    {
                    // InternalCls.g:1697:1: (lv_properties_6_0= ruleAssociationProperties )
                    // InternalCls.g:1698:3: lv_properties_6_0= ruleAssociationProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getPropertiesAssociationPropertiesParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_40);
                    lv_properties_6_0=ruleAssociationProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_6_0, 
                            		"de.cooperateproject.modeling.textual.cls.Cls.AssociationProperties");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:1714:3: (otherlv_7= 'note' ( ( ruleCommentBody ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCls.g:1714:5: otherlv_7= 'note' ( ( ruleCommentBody ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_3); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getNoteKeyword_6_0());
                        
                    // InternalCls.g:1718:1: ( ( ruleCommentBody ) )
                    // InternalCls.g:1719:1: ( ruleCommentBody )
                    {
                    // InternalCls.g:1719:1: ( ruleCommentBody )
                    // InternalCls.g:1720:3: ruleCommentBody
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getCommentCommentCrossReference_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    ruleCommentBody();

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleMultiAssociation"
    // InternalCls.g:1741:1: entryRuleMultiAssociation returns [EObject current=null] : iv_ruleMultiAssociation= ruleMultiAssociation EOF ;
    public final EObject entryRuleMultiAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiAssociation = null;


        try {
            // InternalCls.g:1742:2: (iv_ruleMultiAssociation= ruleMultiAssociation EOF )
            // InternalCls.g:1743:2: iv_ruleMultiAssociation= ruleMultiAssociation EOF
            {
             newCompositeNode(grammarAccess.getMultiAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiAssociation=ruleMultiAssociation();

            state._fsp--;

             current =iv_ruleMultiAssociation; 
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
    // $ANTLR end "entryRuleMultiAssociation"


    // $ANTLR start "ruleMultiAssociation"
    // InternalCls.g:1750:1: ruleMultiAssociation returns [EObject current=null] : (otherlv_0= 'asc' ( ( (otherlv_1= RULE_ID ) ) | ( ( ruleNameString ) ) ) otherlv_3= '{' ( ( (lv_connectorEnds_4_0= ruleMemberEnd ) ) otherlv_5= ';' )+ otherlv_6= '}' ) ;
    public final EObject ruleMultiAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_connectorEnds_4_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1753:28: ( (otherlv_0= 'asc' ( ( (otherlv_1= RULE_ID ) ) | ( ( ruleNameString ) ) ) otherlv_3= '{' ( ( (lv_connectorEnds_4_0= ruleMemberEnd ) ) otherlv_5= ';' )+ otherlv_6= '}' ) )
            // InternalCls.g:1754:1: (otherlv_0= 'asc' ( ( (otherlv_1= RULE_ID ) ) | ( ( ruleNameString ) ) ) otherlv_3= '{' ( ( (lv_connectorEnds_4_0= ruleMemberEnd ) ) otherlv_5= ';' )+ otherlv_6= '}' )
            {
            // InternalCls.g:1754:1: (otherlv_0= 'asc' ( ( (otherlv_1= RULE_ID ) ) | ( ( ruleNameString ) ) ) otherlv_3= '{' ( ( (lv_connectorEnds_4_0= ruleMemberEnd ) ) otherlv_5= ';' )+ otherlv_6= '}' )
            // InternalCls.g:1754:3: otherlv_0= 'asc' ( ( (otherlv_1= RULE_ID ) ) | ( ( ruleNameString ) ) ) otherlv_3= '{' ( ( (lv_connectorEnds_4_0= ruleMemberEnd ) ) otherlv_5= ';' )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiAssociationAccess().getAscKeyword_0());
                
            // InternalCls.g:1758:1: ( ( (otherlv_1= RULE_ID ) ) | ( ( ruleNameString ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_STRING) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalCls.g:1758:2: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalCls.g:1758:2: ( (otherlv_1= RULE_ID ) )
                    // InternalCls.g:1759:1: (otherlv_1= RULE_ID )
                    {
                    // InternalCls.g:1759:1: (otherlv_1= RULE_ID )
                    // InternalCls.g:1760:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiAssociationRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_1, grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationCrossReference_1_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1772:6: ( ( ruleNameString ) )
                    {
                    // InternalCls.g:1772:6: ( ( ruleNameString ) )
                    // InternalCls.g:1773:1: ( ruleNameString )
                    {
                    // InternalCls.g:1773:1: ( ruleNameString )
                    // InternalCls.g:1774:3: ruleNameString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiAssociationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationCrossReference_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_11);
                    ruleNameString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getMultiAssociationAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalCls.g:1791:1: ( ( (lv_connectorEnds_4_0= ruleMemberEnd ) ) otherlv_5= ';' )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalCls.g:1791:2: ( (lv_connectorEnds_4_0= ruleMemberEnd ) ) otherlv_5= ';'
            	    {
            	    // InternalCls.g:1791:2: ( (lv_connectorEnds_4_0= ruleMemberEnd ) )
            	    // InternalCls.g:1792:1: (lv_connectorEnds_4_0= ruleMemberEnd )
            	    {
            	    // InternalCls.g:1792:1: (lv_connectorEnds_4_0= ruleMemberEnd )
            	    // InternalCls.g:1793:3: lv_connectorEnds_4_0= ruleMemberEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiAssociationAccess().getConnectorEndsMemberEndParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_41);
            	    lv_connectorEnds_4_0=ruleMemberEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiAssociationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"connectorEnds",
            	            		lv_connectorEnds_4_0, 
            	            		"de.cooperateproject.modeling.textual.cls.Cls.MemberEnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,34,FOLLOW_42); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultiAssociationAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getMultiAssociationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleMultiAssociation"


    // $ANTLR start "entryRuleMemberEnd"
    // InternalCls.g:1825:1: entryRuleMemberEnd returns [EObject current=null] : iv_ruleMemberEnd= ruleMemberEnd EOF ;
    public final EObject entryRuleMemberEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberEnd = null;


        try {
            // InternalCls.g:1826:2: (iv_ruleMemberEnd= ruleMemberEnd EOF )
            // InternalCls.g:1827:2: iv_ruleMemberEnd= ruleMemberEnd EOF
            {
             newCompositeNode(grammarAccess.getMemberEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberEnd=ruleMemberEnd();

            state._fsp--;

             current =iv_ruleMemberEnd; 
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
    // $ANTLR end "entryRuleMemberEnd"


    // $ANTLR start "ruleMemberEnd"
    // InternalCls.g:1834:1: ruleMemberEnd returns [EObject current=null] : ( ( (lv_type_0_0= ruleUMLTypeReference ) ) ( (otherlv_1= RULE_ID ) )? ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_navigable_3_0= '<' ) )? ) ;
    public final EObject ruleMemberEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_navigable_3_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_cardinality_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1837:28: ( ( ( (lv_type_0_0= ruleUMLTypeReference ) ) ( (otherlv_1= RULE_ID ) )? ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_navigable_3_0= '<' ) )? ) )
            // InternalCls.g:1838:1: ( ( (lv_type_0_0= ruleUMLTypeReference ) ) ( (otherlv_1= RULE_ID ) )? ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_navigable_3_0= '<' ) )? )
            {
            // InternalCls.g:1838:1: ( ( (lv_type_0_0= ruleUMLTypeReference ) ) ( (otherlv_1= RULE_ID ) )? ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_navigable_3_0= '<' ) )? )
            // InternalCls.g:1838:2: ( (lv_type_0_0= ruleUMLTypeReference ) ) ( (otherlv_1= RULE_ID ) )? ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_navigable_3_0= '<' ) )?
            {
            // InternalCls.g:1838:2: ( (lv_type_0_0= ruleUMLTypeReference ) )
            // InternalCls.g:1839:1: (lv_type_0_0= ruleUMLTypeReference )
            {
            // InternalCls.g:1839:1: (lv_type_0_0= ruleUMLTypeReference )
            // InternalCls.g:1840:3: lv_type_0_0= ruleUMLTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getMemberEndAccess().getTypeUMLTypeReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_43);
            lv_type_0_0=ruleUMLTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMemberEndRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.UMLTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCls.g:1856:2: ( (otherlv_1= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCls.g:1857:1: (otherlv_1= RULE_ID )
                    {
                    // InternalCls.g:1857:1: (otherlv_1= RULE_ID )
                    // InternalCls.g:1858:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMemberEndRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_44); 

                    		newLeafNode(otherlv_1, grammarAccess.getMemberEndAccess().getReferencedElementPropertyCrossReference_1_0()); 
                    	

                    }


                    }
                    break;

            }

            // InternalCls.g:1869:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT||LA45_0==40) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCls.g:1870:1: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalCls.g:1870:1: (lv_cardinality_2_0= ruleCardinality )
                    // InternalCls.g:1871:3: lv_cardinality_2_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getMemberEndAccess().getCardinalityCardinalityParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_45);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMemberEndRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_2_0, 
                            		"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:1887:3: ( (lv_navigable_3_0= '<' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCls.g:1888:1: (lv_navigable_3_0= '<' )
                    {
                    // InternalCls.g:1888:1: (lv_navigable_3_0= '<' )
                    // InternalCls.g:1889:3: lv_navigable_3_0= '<'
                    {
                    lv_navigable_3_0=(Token)match(input,35,FOLLOW_2); 

                            newLeafNode(lv_navigable_3_0, grammarAccess.getMemberEndAccess().getNavigableLessThanSignKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMemberEndRule());
                    	        }
                           		setWithLastConsumed(current, "navigable", true, "<");
                    	    

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
    // $ANTLR end "ruleMemberEnd"


    // $ANTLR start "entryRuleAssociationProperties"
    // InternalCls.g:1910:1: entryRuleAssociationProperties returns [EObject current=null] : iv_ruleAssociationProperties= ruleAssociationProperties EOF ;
    public final EObject entryRuleAssociationProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationProperties = null;


        try {
            // InternalCls.g:1911:2: (iv_ruleAssociationProperties= ruleAssociationProperties EOF )
            // InternalCls.g:1912:2: iv_ruleAssociationProperties= ruleAssociationProperties EOF
            {
             newCompositeNode(grammarAccess.getAssociationPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationProperties=ruleAssociationProperties();

            state._fsp--;

             current =iv_ruleAssociationProperties; 
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
    // $ANTLR end "entryRuleAssociationProperties"


    // $ANTLR start "ruleAssociationProperties"
    // InternalCls.g:1919:1: ruleAssociationProperties returns [EObject current=null] : (otherlv_0= '[' ( (lv_cardinalityLeft_1_0= ruleCardinality ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '|' ( (lv_cardinalityRight_5_0= ruleCardinality ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )? otherlv_8= ']' ) ;
    public final EObject ruleAssociationProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_cardinalityLeft_1_0 = null;

        EObject lv_cardinalityRight_5_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1922:28: ( (otherlv_0= '[' ( (lv_cardinalityLeft_1_0= ruleCardinality ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '|' ( (lv_cardinalityRight_5_0= ruleCardinality ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )? otherlv_8= ']' ) )
            // InternalCls.g:1923:1: (otherlv_0= '[' ( (lv_cardinalityLeft_1_0= ruleCardinality ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '|' ( (lv_cardinalityRight_5_0= ruleCardinality ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )? otherlv_8= ']' )
            {
            // InternalCls.g:1923:1: (otherlv_0= '[' ( (lv_cardinalityLeft_1_0= ruleCardinality ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '|' ( (lv_cardinalityRight_5_0= ruleCardinality ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )? otherlv_8= ']' )
            // InternalCls.g:1923:3: otherlv_0= '[' ( (lv_cardinalityLeft_1_0= ruleCardinality ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '|' ( (lv_cardinalityRight_5_0= ruleCardinality ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )? otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_46); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationPropertiesAccess().getLeftSquareBracketKeyword_0());
                
            // InternalCls.g:1927:1: ( (lv_cardinalityLeft_1_0= ruleCardinality ) )
            // InternalCls.g:1928:1: (lv_cardinalityLeft_1_0= ruleCardinality )
            {
            // InternalCls.g:1928:1: (lv_cardinalityLeft_1_0= ruleCardinality )
            // InternalCls.g:1929:3: lv_cardinalityLeft_1_0= ruleCardinality
            {
             
            	        newCompositeNode(grammarAccess.getAssociationPropertiesAccess().getCardinalityLeftCardinalityParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_47);
            lv_cardinalityLeft_1_0=ruleCardinality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationPropertiesRule());
            	        }
                   		set(
                   			current, 
                   			"cardinalityLeft",
                    		lv_cardinalityLeft_1_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCls.g:1945:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==27) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCls.g:1945:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_6); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssociationPropertiesAccess().getCommaKeyword_2_0());
                        
                    // InternalCls.g:1949:1: ( (otherlv_3= RULE_ID ) )
                    // InternalCls.g:1950:1: (otherlv_3= RULE_ID )
                    {
                    // InternalCls.g:1950:1: (otherlv_3= RULE_ID )
                    // InternalCls.g:1951:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationPropertiesRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_48); 

                    		newLeafNode(otherlv_3, grammarAccess.getAssociationPropertiesAccess().getPropertyLeftPropertyCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalCls.g:1962:4: (otherlv_4= '|' ( (lv_cardinalityRight_5_0= ruleCardinality ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )? )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==37) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCls.g:1962:6: otherlv_4= '|' ( (lv_cardinalityRight_5_0= ruleCardinality ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )?
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_46); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_3_0());
                        
                    // InternalCls.g:1966:1: ( (lv_cardinalityRight_5_0= ruleCardinality ) )
                    // InternalCls.g:1967:1: (lv_cardinalityRight_5_0= ruleCardinality )
                    {
                    // InternalCls.g:1967:1: (lv_cardinalityRight_5_0= ruleCardinality )
                    // InternalCls.g:1968:3: lv_cardinalityRight_5_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightCardinalityParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_49);
                    lv_cardinalityRight_5_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinalityRight",
                            		lv_cardinalityRight_5_0, 
                            		"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalCls.g:1984:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==27) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalCls.g:1984:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_6); 

                                	newLeafNode(otherlv_6, grammarAccess.getAssociationPropertiesAccess().getCommaKeyword_3_2_0());
                                
                            // InternalCls.g:1988:1: ( (otherlv_7= RULE_ID ) )
                            // InternalCls.g:1989:1: (otherlv_7= RULE_ID )
                            {
                            // InternalCls.g:1989:1: (otherlv_7= RULE_ID )
                            // InternalCls.g:1990:3: otherlv_7= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getAssociationPropertiesRule());
                            	        }
                                    
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_50); 

                            		newLeafNode(otherlv_7, grammarAccess.getAssociationPropertiesAccess().getPropertyRightPropertyCrossReference_3_2_1_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,38,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getAssociationPropertiesAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleAssociationProperties"


    // $ANTLR start "entryRuleCardinality"
    // InternalCls.g:2013:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalCls.g:2014:2: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalCls.g:2015:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalCls.g:2022:1: ruleCardinality returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:2025:28: ( ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) )
            // InternalCls.g:2026:1: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            {
            // InternalCls.g:2026:1: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            // InternalCls.g:2026:2: ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            {
            // InternalCls.g:2026:2: ( (lv_lowerBound_0_0= ruleCardinalityBound ) )
            // InternalCls.g:2027:1: (lv_lowerBound_0_0= ruleCardinalityBound )
            {
            // InternalCls.g:2027:1: (lv_lowerBound_0_0= ruleCardinalityBound )
            // InternalCls.g:2028:3: lv_lowerBound_0_0= ruleCardinalityBound
            {
             
            	        newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_51);
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

            // InternalCls.g:2044:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCls.g:2044:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_46); 

                        	newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0());
                        
                    // InternalCls.g:2048:1: ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    // InternalCls.g:2049:1: (lv_upperBound_2_0= ruleCardinalityBound )
                    {
                    // InternalCls.g:2049:1: (lv_upperBound_2_0= ruleCardinalityBound )
                    // InternalCls.g:2050:3: lv_upperBound_2_0= ruleCardinalityBound
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
    // InternalCls.g:2074:1: entryRuleCommentBody returns [String current=null] : iv_ruleCommentBody= ruleCommentBody EOF ;
    public final String entryRuleCommentBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentBody = null;


        try {
            // InternalCls.g:2075:2: (iv_ruleCommentBody= ruleCommentBody EOF )
            // InternalCls.g:2076:2: iv_ruleCommentBody= ruleCommentBody EOF
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
    // InternalCls.g:2083:1: ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCommentBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // InternalCls.g:2086:28: (this_STRING_0= RULE_STRING )
            // InternalCls.g:2087:5: this_STRING_0= RULE_STRING
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
    // InternalCls.g:2102:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // InternalCls.g:2103:2: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // InternalCls.g:2104:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
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
    // InternalCls.g:2111:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalCls.g:2114:28: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalCls.g:2115:1: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalCls.g:2115:1: (kw= '*' | this_INT_1= RULE_INT )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==40) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_INT) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalCls.g:2116:2: kw= '*'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalCls.g:2122:10: this_INT_1= RULE_INT
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
    // InternalCls.g:2137:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
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
            // InternalCls.g:2139:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalCls.g:2140:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalCls.g:2140:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt52=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt52=1;
                }
                break;
            case 42:
                {
                alt52=2;
                }
                break;
            case 43:
                {
                alt52=3;
                }
                break;
            case 44:
                {
                alt52=4;
                }
                break;
            case 45:
                {
                alt52=5;
                }
                break;
            case 46:
                {
                alt52=6;
                }
                break;
            case 47:
                {
                alt52=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalCls.g:2140:2: (enumLiteral_0= '+' )
                    {
                    // InternalCls.g:2140:2: (enumLiteral_0= '+' )
                    // InternalCls.g:2140:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                            current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:2146:6: (enumLiteral_1= 'public' )
                    {
                    // InternalCls.g:2146:6: (enumLiteral_1= 'public' )
                    // InternalCls.g:2146:8: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                            current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:2152:6: (enumLiteral_2= '-' )
                    {
                    // InternalCls.g:2152:6: (enumLiteral_2= '-' )
                    // InternalCls.g:2152:8: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                            current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:2158:6: (enumLiteral_3= 'private' )
                    {
                    // InternalCls.g:2158:6: (enumLiteral_3= 'private' )
                    // InternalCls.g:2158:8: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                            current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:2164:6: (enumLiteral_4= '#' )
                    {
                    // InternalCls.g:2164:6: (enumLiteral_4= '#' )
                    // InternalCls.g:2164:8: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                            current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:2170:6: (enumLiteral_5= 'protected' )
                    {
                    // InternalCls.g:2170:6: (enumLiteral_5= 'protected' )
                    // InternalCls.g:2170:8: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_2); 

                            current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:2176:6: (enumLiteral_6= '~' )
                    {
                    // InternalCls.g:2176:6: (enumLiteral_6= '~' )
                    // InternalCls.g:2176:8: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,47,FOLLOW_2); 

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


    // $ANTLR start "rulePrimitiveType"
    // InternalCls.g:2186:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // InternalCls.g:2188:28: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) ) )
            // InternalCls.g:2189:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) )
            {
            // InternalCls.g:2189:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) )
            int alt53=9;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt53=1;
                }
                break;
            case 49:
                {
                alt53=2;
                }
                break;
            case 50:
                {
                alt53=3;
                }
                break;
            case 51:
                {
                alt53=4;
                }
                break;
            case 52:
                {
                alt53=5;
                }
                break;
            case 53:
                {
                alt53=6;
                }
                break;
            case 54:
                {
                alt53=7;
                }
                break;
            case 55:
                {
                alt53=8;
                }
                break;
            case 56:
                {
                alt53=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalCls.g:2189:2: (enumLiteral_0= 'string' )
                    {
                    // InternalCls.g:2189:2: (enumLiteral_0= 'string' )
                    // InternalCls.g:2189:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:2195:6: (enumLiteral_1= 'int' )
                    {
                    // InternalCls.g:2195:6: (enumLiteral_1= 'int' )
                    // InternalCls.g:2195:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:2201:6: (enumLiteral_2= 'double' )
                    {
                    // InternalCls.g:2201:6: (enumLiteral_2= 'double' )
                    // InternalCls.g:2201:8: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:2207:6: (enumLiteral_3= 'boolean' )
                    {
                    // InternalCls.g:2207:6: (enumLiteral_3= 'boolean' )
                    // InternalCls.g:2207:8: enumLiteral_3= 'boolean'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:2213:6: (enumLiteral_4= 'char' )
                    {
                    // InternalCls.g:2213:6: (enumLiteral_4= 'char' )
                    // InternalCls.g:2213:8: enumLiteral_4= 'char'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:2219:6: (enumLiteral_5= 'byte' )
                    {
                    // InternalCls.g:2219:6: (enumLiteral_5= 'byte' )
                    // InternalCls.g:2219:8: enumLiteral_5= 'byte'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:2225:6: (enumLiteral_6= 'short' )
                    {
                    // InternalCls.g:2225:6: (enumLiteral_6= 'short' )
                    // InternalCls.g:2225:8: enumLiteral_6= 'short'
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalCls.g:2231:6: (enumLiteral_7= 'long' )
                    {
                    // InternalCls.g:2231:6: (enumLiteral_7= 'long' )
                    // InternalCls.g:2231:8: enumLiteral_7= 'long'
                    {
                    enumLiteral_7=(Token)match(input,55,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalCls.g:2237:6: (enumLiteral_8= 'float' )
                    {
                    // InternalCls.g:2237:6: (enumLiteral_8= 'float' )
                    // InternalCls.g:2237:8: enumLiteral_8= 'float'
                    {
                    enumLiteral_8=(Token)match(input,56,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getFLOATEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPrimitiveTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                        

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleAggregationKind"
    // InternalCls.g:2247:1: ruleAggregationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) ;
    public final Enumerator ruleAggregationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalCls.g:2249:28: ( ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) )
            // InternalCls.g:2250:1: ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            {
            // InternalCls.g:2250:1: ( (enumLiteral_0= 'asc' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt54=1;
                }
                break;
            case 57:
                {
                alt54=2;
                }
                break;
            case 58:
                {
                alt54=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalCls.g:2250:2: (enumLiteral_0= 'asc' )
                    {
                    // InternalCls.g:2250:2: (enumLiteral_0= 'asc' )
                    // InternalCls.g:2250:4: enumLiteral_0= 'asc'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                            current = grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:2256:6: (enumLiteral_1= 'agg' )
                    {
                    // InternalCls.g:2256:6: (enumLiteral_1= 'agg' )
                    // InternalCls.g:2256:8: enumLiteral_1= 'agg'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                            current = grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:2262:6: (enumLiteral_2= 'com' )
                    {
                    // InternalCls.g:2262:6: (enumLiteral_2= 'com' )
                    // InternalCls.g:2262:8: enumLiteral_2= 'com'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

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
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\10\23\2\uffff";
    static final String dfa_3s = "\1\57\7\26\2\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\2\10\1\uffff\1\11\22\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
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
            return "493:1: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\12\5\1\31\2\uffff";
    static final String dfa_9s = "\1\57\10\30\1\5\1\32\2\uffff";
    static final String dfa_10s = "\13\uffff\1\2\1\1";
    static final String dfa_11s = "\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\12\15\uffff\1\13\3\uffff\1\10\1\11\20\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
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

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "927:1: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )";
        }
    }
    static final String dfa_13s = "\13\uffff";
    static final String dfa_14s = "\1\5\1\22\1\uffff\1\4\1\5\3\uffff\1\4\1\uffff\1\22";
    static final String dfa_15s = "\1\72\1\37\1\uffff\2\5\3\uffff\1\22\1\uffff\1\37";
    static final String dfa_16s = "\2\uffff\1\2\2\uffff\1\1\1\3\1\4\1\uffff\1\5\1\uffff";
    static final String dfa_17s = "\13\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\32\uffff\1\2\1\3\27\uffff\2\2",
            "\1\4\12\uffff\1\5\1\6\1\7",
            "",
            "\1\11\1\10",
            "\1\12",
            "",
            "",
            "",
            "\2\2\11\uffff\1\11\2\uffff\1\2",
            "",
            "\1\4\12\uffff\1\5\1\6\1\7"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1348:1: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink | this_MultiAssociation_4= ruleMultiAssociation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0600FE03005A4022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0600FE0300584022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0600000300004022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0600FE03005B4020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0600FE0300594020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0600000300014020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000FE0001890020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001800020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x01FF000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001880020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000FE0011800020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000FE0019800020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000FE0001800020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0600000300000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001080000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010800000062L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010800000042L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000006008000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004008000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000008000000002L});

}