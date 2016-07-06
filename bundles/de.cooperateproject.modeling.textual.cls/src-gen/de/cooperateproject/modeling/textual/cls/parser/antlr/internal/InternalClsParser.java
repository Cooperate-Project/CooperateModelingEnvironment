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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@startclass'", "'@endclass'", "'import'", "'.'", "'abstract'", "'class'", "'as'", "'{'", "'}'", "'interface'", "'static'", "'final'", "':'", "'('", "','", "')'", "'isa'", "'impl'", "'-'", "'note'", "'['", "'|'", "']'", "'..'", "'*'", "'~'", "'#'", "'+'", "'<'", "'>'", "'string'", "'int'", "'double'", "'boolean'", "'char'", "'byte'", "'short'", "'long'", "'float'", "'ass'", "'agg'", "'com'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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
    // InternalCls.g:77:1: ruleClassDiagram returns [EObject current=null] : ( () otherlv_1= '@startclass' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* otherlv_6= '@endclass' ) ;
    public final EObject ruleClassDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_6=null;
        EObject lv_packageImports_3_0 = null;

        EObject lv_classifiers_4_0 = null;

        EObject lv_connectors_5_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:80:28: ( ( () otherlv_1= '@startclass' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* otherlv_6= '@endclass' ) )
            // InternalCls.g:81:1: ( () otherlv_1= '@startclass' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* otherlv_6= '@endclass' )
            {
            // InternalCls.g:81:1: ( () otherlv_1= '@startclass' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* otherlv_6= '@endclass' )
            // InternalCls.g:81:2: () otherlv_1= '@startclass' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_packageImports_3_0= rulePackageImport ) )* ( (lv_classifiers_4_0= ruleClassifier ) )* ( (lv_connectors_5_0= ruleConnector ) )* otherlv_6= '@endclass'
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
                
            // InternalCls.g:91:1: ( (lv_name_2_0= RULE_STRING ) )
            // InternalCls.g:92:1: (lv_name_2_0= RULE_STRING )
            {
            // InternalCls.g:92:1: (lv_name_2_0= RULE_STRING )
            // InternalCls.g:93:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            			newLeafNode(lv_name_2_0, grammarAccess.getClassDiagramAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalCls.g:109:2: ( (lv_packageImports_3_0= rulePackageImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCls.g:110:1: (lv_packageImports_3_0= rulePackageImport )
            	    {
            	    // InternalCls.g:110:1: (lv_packageImports_3_0= rulePackageImport )
            	    // InternalCls.g:111:3: lv_packageImports_3_0= rulePackageImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassDiagramAccess().getPackageImportsPackageImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_packageImports_3_0=rulePackageImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassDiagramRule());
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
            	    break loop1;
                }
            } while (true);

            // InternalCls.g:127:3: ( (lv_classifiers_4_0= ruleClassifier ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)||LA2_0==20||LA2_0==29||(LA2_0>=36 && LA2_0<=38)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCls.g:128:1: (lv_classifiers_4_0= ruleClassifier )
            	    {
            	    // InternalCls.g:128:1: (lv_classifiers_4_0= ruleClassifier )
            	    // InternalCls.g:129:3: lv_classifiers_4_0= ruleClassifier
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassDiagramAccess().getClassifiersClassifierParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_classifiers_4_0=ruleClassifier();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassDiagramRule());
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
            	    break loop2;
                }
            } while (true);

            // InternalCls.g:145:3: ( (lv_connectors_5_0= ruleConnector ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=50 && LA3_0<=52)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCls.g:146:1: (lv_connectors_5_0= ruleConnector )
            	    {
            	    // InternalCls.g:146:1: (lv_connectors_5_0= ruleConnector )
            	    // InternalCls.g:147:3: lv_connectors_5_0= ruleConnector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassDiagramAccess().getConnectorsConnectorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_connectors_5_0=ruleConnector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassDiagramRule());
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
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getClassDiagramAccess().getEndclassKeyword_6());
                

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


    // $ANTLR start "entryRulePackageImport"
    // InternalCls.g:175:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // InternalCls.g:176:2: (iv_rulePackageImport= rulePackageImport EOF )
            // InternalCls.g:177:2: iv_rulePackageImport= rulePackageImport EOF
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
    // InternalCls.g:184:1: rulePackageImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleFQN ) ) ) ;
    public final EObject rulePackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalCls.g:187:28: ( (otherlv_0= 'import' ( ( ruleFQN ) ) ) )
            // InternalCls.g:188:1: (otherlv_0= 'import' ( ( ruleFQN ) ) )
            {
            // InternalCls.g:188:1: (otherlv_0= 'import' ( ( ruleFQN ) ) )
            // InternalCls.g:188:3: otherlv_0= 'import' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageImportAccess().getImportKeyword_0());
                
            // InternalCls.g:192:1: ( ( ruleFQN ) )
            // InternalCls.g:193:1: ( ruleFQN )
            {
            // InternalCls.g:193:1: ( ruleFQN )
            // InternalCls.g:194:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageImportRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPackageImportAccess().getPackagePackageCrossReference_1_0()); 
            	    
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
    // InternalCls.g:215:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCls.g:216:2: (iv_ruleFQN= ruleFQN EOF )
            // InternalCls.g:217:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCls.g:224:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalCls.g:227:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCls.g:228:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCls.g:228:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCls.g:228:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // InternalCls.g:235:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCls.g:236:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_7); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleClassifier"
    // InternalCls.g:256:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalCls.g:257:2: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalCls.g:258:2: iv_ruleClassifier= ruleClassifier EOF
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
    // InternalCls.g:265:1: ruleClassifier returns [EObject current=null] : (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Interface_1 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:268:28: ( (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) )
            // InternalCls.g:269:1: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            {
            // InternalCls.g:269:1: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==20) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=15 && LA5_1<=16)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA5_2 = input.LA(2);

                if ( ((LA5_2>=15 && LA5_2<=16)) ) {
                    alt5=1;
                }
                else if ( (LA5_2==20) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==20) ) {
                    alt5=2;
                }
                else if ( ((LA5_3>=15 && LA5_3<=16)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==20) ) {
                    alt5=2;
                }
                else if ( ((LA5_4>=15 && LA5_4<=16)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 16:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCls.g:270:5: this_Class_0= ruleClass
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
                    // InternalCls.g:280:5: this_Interface_1= ruleInterface
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
    // InternalCls.g:296:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalCls.g:297:2: (iv_ruleClass= ruleClass EOF )
            // InternalCls.g:298:2: iv_ruleClass= ruleClass EOF
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
    // InternalCls.g:305:1: ruleClass returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID ) ) ) otherlv_4= 'as' )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_longName_3_1=null;
        Token lv_longName_3_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_members_7_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:308:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID ) ) ) otherlv_4= 'as' )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' ) )
            // InternalCls.g:309:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID ) ) ) otherlv_4= 'as' )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )
            {
            // InternalCls.g:309:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID ) ) ) otherlv_4= 'as' )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )
            // InternalCls.g:309:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( ( ( (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID ) ) ) otherlv_4= 'as' )? ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}'
            {
            // InternalCls.g:309:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29||(LA6_0>=36 && LA6_0<=38)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCls.g:310:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:310:1: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:311:3: lv_visibility_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_9);
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

            // InternalCls.g:327:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCls.g:328:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:328:1: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:329:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,15,FOLLOW_10); 

                            newLeafNode(lv_abstract_1_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

                	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
                
            // InternalCls.g:346:1: ( ( ( (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID ) ) ) otherlv_4= 'as' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==17) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalCls.g:346:2: ( ( (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID ) ) ) otherlv_4= 'as'
                    {
                    // InternalCls.g:346:2: ( ( (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID ) ) )
                    // InternalCls.g:347:1: ( (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID ) )
                    {
                    // InternalCls.g:347:1: ( (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID ) )
                    // InternalCls.g:348:1: (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID )
                    {
                    // InternalCls.g:348:1: (lv_longName_3_1= RULE_STRING | lv_longName_3_2= RULE_ID )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_STRING) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_ID) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalCls.g:349:3: lv_longName_3_1= RULE_STRING
                            {
                            lv_longName_3_1=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            			newLeafNode(lv_longName_3_1, grammarAccess.getClassAccess().getLongNameSTRINGTerminalRuleCall_3_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getClassRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_3_1, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }
                            break;
                        case 2 :
                            // InternalCls.g:364:8: lv_longName_3_2= RULE_ID
                            {
                            lv_longName_3_2=(Token)match(input,RULE_ID,FOLLOW_12); 

                            			newLeafNode(lv_longName_3_2, grammarAccess.getClassAccess().getLongNameIDTerminalRuleCall_3_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getClassRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_3_2, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_7); 

                        	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getAsKeyword_3_1());
                        

                    }
                    break;

            }

            // InternalCls.g:386:3: ( (otherlv_5= RULE_ID ) )
            // InternalCls.g:387:1: (otherlv_5= RULE_ID )
            {
            // InternalCls.g:387:1: (otherlv_5= RULE_ID )
            // InternalCls.g:388:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            		newLeafNode(otherlv_5, grammarAccess.getClassAccess().getReferencedElementClassCrossReference_4_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_14); 

                	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
                
            // InternalCls.g:403:1: ( (lv_members_7_0= ruleMember ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==15||(LA10_0>=21 && LA10_0<=22)||LA10_0==29||(LA10_0>=36 && LA10_0<=38)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCls.g:404:1: (lv_members_7_0= ruleMember )
            	    {
            	    // InternalCls.g:404:1: (lv_members_7_0= ruleMember )
            	    // InternalCls.g:405:3: lv_members_7_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_14);
            	    lv_members_7_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
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
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
                

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
    // InternalCls.g:433:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCls.g:434:2: (iv_ruleInterface= ruleInterface EOF )
            // InternalCls.g:435:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalCls.g:442:1: ruleInterface returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID ) ) ) otherlv_3= 'as' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_longName_2_1=null;
        Token lv_longName_2_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_members_6_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:445:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID ) ) ) otherlv_3= 'as' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' ) )
            // InternalCls.g:446:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID ) ) ) otherlv_3= 'as' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' )
            {
            // InternalCls.g:446:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID ) ) ) otherlv_3= 'as' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}' )
            // InternalCls.g:446:2: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'interface' ( ( ( (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID ) ) ) otherlv_3= 'as' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_members_6_0= ruleMember ) )* otherlv_7= '}'
            {
            // InternalCls.g:446:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29||(LA11_0>=36 && LA11_0<=38)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCls.g:447:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:447:1: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:448:3: lv_visibility_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterfaceAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_15);
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

            otherlv_1=(Token)match(input,20,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
                
            // InternalCls.g:468:1: ( ( ( (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID ) ) ) otherlv_3= 'as' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==17) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalCls.g:468:2: ( ( (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID ) ) ) otherlv_3= 'as'
                    {
                    // InternalCls.g:468:2: ( ( (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID ) ) )
                    // InternalCls.g:469:1: ( (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID ) )
                    {
                    // InternalCls.g:469:1: ( (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID ) )
                    // InternalCls.g:470:1: (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID )
                    {
                    // InternalCls.g:470:1: (lv_longName_2_1= RULE_STRING | lv_longName_2_2= RULE_ID )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_STRING) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_ID) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalCls.g:471:3: lv_longName_2_1= RULE_STRING
                            {
                            lv_longName_2_1=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            			newLeafNode(lv_longName_2_1, grammarAccess.getInterfaceAccess().getLongNameSTRINGTerminalRuleCall_2_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInterfaceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_2_1, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }
                            break;
                        case 2 :
                            // InternalCls.g:486:8: lv_longName_2_2= RULE_ID
                            {
                            lv_longName_2_2=(Token)match(input,RULE_ID,FOLLOW_12); 

                            			newLeafNode(lv_longName_2_2, grammarAccess.getInterfaceAccess().getLongNameIDTerminalRuleCall_2_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInterfaceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_2_2, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_7); 

                        	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getAsKeyword_2_1());
                        

                    }
                    break;

            }

            // InternalCls.g:508:3: ( (otherlv_4= RULE_ID ) )
            // InternalCls.g:509:1: (otherlv_4= RULE_ID )
            {
            // InternalCls.g:509:1: (otherlv_4= RULE_ID )
            // InternalCls.g:510:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

            		newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_14); 

                	newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalCls.g:525:1: ( (lv_members_6_0= ruleMember ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==15||(LA14_0>=21 && LA14_0<=22)||LA14_0==29||(LA14_0>=36 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCls.g:526:1: (lv_members_6_0= ruleMember )
            	    {
            	    // InternalCls.g:526:1: (lv_members_6_0= ruleMember )
            	    // InternalCls.g:527:3: lv_members_6_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_14);
            	    lv_members_6_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_6_0, 
            	            		"de.cooperateproject.modeling.textual.cls.Cls.Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6());
                

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
    // InternalCls.g:555:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalCls.g:556:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalCls.g:557:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalCls.g:564:1: ruleTypeReference returns [EObject current=null] : (this_DataTypeReference_0= ruleDataTypeReference | this_UMLTypeReference_1= ruleUMLTypeReference ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeReference_0 = null;

        EObject this_UMLTypeReference_1 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:567:28: ( (this_DataTypeReference_0= ruleDataTypeReference | this_UMLTypeReference_1= ruleUMLTypeReference ) )
            // InternalCls.g:568:1: (this_DataTypeReference_0= ruleDataTypeReference | this_UMLTypeReference_1= ruleUMLTypeReference )
            {
            // InternalCls.g:568:1: (this_DataTypeReference_0= ruleDataTypeReference | this_UMLTypeReference_1= ruleUMLTypeReference )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=41 && LA15_0<=49)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCls.g:569:5: this_DataTypeReference_0= ruleDataTypeReference
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
                    // InternalCls.g:579:5: this_UMLTypeReference_1= ruleUMLTypeReference
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
    // InternalCls.g:595:1: entryRuleDataTypeReference returns [EObject current=null] : iv_ruleDataTypeReference= ruleDataTypeReference EOF ;
    public final EObject entryRuleDataTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeReference = null;


        try {
            // InternalCls.g:596:2: (iv_ruleDataTypeReference= ruleDataTypeReference EOF )
            // InternalCls.g:597:2: iv_ruleDataTypeReference= ruleDataTypeReference EOF
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
    // InternalCls.g:604:1: ruleDataTypeReference returns [EObject current=null] : ( (lv_type_0_0= rulePrimitiveType ) ) ;
    public final EObject ruleDataTypeReference() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:607:28: ( ( (lv_type_0_0= rulePrimitiveType ) ) )
            // InternalCls.g:608:1: ( (lv_type_0_0= rulePrimitiveType ) )
            {
            // InternalCls.g:608:1: ( (lv_type_0_0= rulePrimitiveType ) )
            // InternalCls.g:609:1: (lv_type_0_0= rulePrimitiveType )
            {
            // InternalCls.g:609:1: (lv_type_0_0= rulePrimitiveType )
            // InternalCls.g:610:3: lv_type_0_0= rulePrimitiveType
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
    // InternalCls.g:634:1: entryRuleUMLTypeReference returns [EObject current=null] : iv_ruleUMLTypeReference= ruleUMLTypeReference EOF ;
    public final EObject entryRuleUMLTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUMLTypeReference = null;


        try {
            // InternalCls.g:635:2: (iv_ruleUMLTypeReference= ruleUMLTypeReference EOF )
            // InternalCls.g:636:2: iv_ruleUMLTypeReference= ruleUMLTypeReference EOF
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
    // InternalCls.g:643:1: ruleUMLTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUMLTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalCls.g:646:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCls.g:647:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCls.g:647:1: ( (otherlv_0= RULE_ID ) )
            // InternalCls.g:648:1: (otherlv_0= RULE_ID )
            {
            // InternalCls.g:648:1: (otherlv_0= RULE_ID )
            // InternalCls.g:649:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUMLTypeReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getUMLTypeReferenceAccess().getTypeTypeCrossReference_0()); 
            	

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
    // InternalCls.g:668:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalCls.g:669:2: (iv_ruleMember= ruleMember EOF )
            // InternalCls.g:670:2: iv_ruleMember= ruleMember EOF
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
    // InternalCls.g:677:1: ruleMember returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Method_1 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:680:28: ( (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) )
            // InternalCls.g:681:1: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            {
            // InternalCls.g:681:1: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalCls.g:682:5: this_Attribute_0= ruleAttribute
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
                    // InternalCls.g:692:5: this_Method_1= ruleMethod
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
    // InternalCls.g:708:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalCls.g:709:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalCls.g:710:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalCls.g:717:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) ) ;
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
            // InternalCls.g:720:28: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) ) )
            // InternalCls.g:721:1: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) )
            {
            // InternalCls.g:721:1: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) ) )
            // InternalCls.g:721:2: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleTypeReference ) )
            {
            // InternalCls.g:721:2: ()
            // InternalCls.g:722:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            // InternalCls.g:727:2: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29||(LA17_0>=36 && LA17_0<=38)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCls.g:728:1: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalCls.g:728:1: (lv_visibility_1_0= ruleVisibility )
                    // InternalCls.g:729:3: lv_visibility_1_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_16);
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

            // InternalCls.g:745:3: ( (lv_static_2_0= 'static' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCls.g:746:1: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:746:1: (lv_static_2_0= 'static' )
                    // InternalCls.g:747:3: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,21,FOLLOW_17); 

                            newLeafNode(lv_static_2_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "static", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:760:3: ( (lv_final_3_0= 'final' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCls.g:761:1: (lv_final_3_0= 'final' )
                    {
                    // InternalCls.g:761:1: (lv_final_3_0= 'final' )
                    // InternalCls.g:762:3: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,22,FOLLOW_7); 

                            newLeafNode(lv_final_3_0, grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "final", true, "final");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:775:3: ( (otherlv_4= RULE_ID ) )
            // InternalCls.g:776:1: (otherlv_4= RULE_ID )
            {
            // InternalCls.g:776:1: (otherlv_4= RULE_ID )
            // InternalCls.g:777:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_18); 

            		newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getReferencedElementPropertyCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_19); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getColonKeyword_5());
                
            // InternalCls.g:792:1: ( (lv_type_6_0= ruleTypeReference ) )
            // InternalCls.g:793:1: (lv_type_6_0= ruleTypeReference )
            {
            // InternalCls.g:793:1: (lv_type_6_0= ruleTypeReference )
            // InternalCls.g:794:3: lv_type_6_0= ruleTypeReference
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
    // InternalCls.g:818:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalCls.g:819:2: (iv_ruleMethod= ruleMethod EOF )
            // InternalCls.g:820:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalCls.g:827:1: ruleMethod returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )? ) ;
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
            // InternalCls.g:830:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )? ) )
            // InternalCls.g:831:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )? )
            {
            // InternalCls.g:831:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )? )
            // InternalCls.g:831:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )?
            {
            // InternalCls.g:831:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29||(LA20_0>=36 && LA20_0<=38)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCls.g:832:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:832:1: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:833:3: lv_visibility_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_20);
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

            // InternalCls.g:849:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCls.g:850:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:850:1: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:851:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,15,FOLLOW_16); 

                            newLeafNode(lv_abstract_1_0, grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:864:3: ( (lv_static_2_0= 'static' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCls.g:865:1: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:865:1: (lv_static_2_0= 'static' )
                    // InternalCls.g:866:3: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,21,FOLLOW_17); 

                            newLeafNode(lv_static_2_0, grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "static", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:879:3: ( (lv_final_3_0= 'final' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:880:1: (lv_final_3_0= 'final' )
                    {
                    // InternalCls.g:880:1: (lv_final_3_0= 'final' )
                    // InternalCls.g:881:3: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,22,FOLLOW_7); 

                            newLeafNode(lv_final_3_0, grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "final", true, "final");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:894:3: ( (otherlv_4= RULE_ID ) )
            // InternalCls.g:895:1: (otherlv_4= RULE_ID )
            {
            // InternalCls.g:895:1: (otherlv_4= RULE_ID )
            // InternalCls.g:896:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            		newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getReferencedElementOperationCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_22); 

                	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
                
            // InternalCls.g:911:1: ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=21 && LA25_0<=22)||LA25_0==29||(LA25_0>=36 && LA25_0<=38)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCls.g:911:2: ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    {
            	    // InternalCls.g:911:2: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalCls.g:912:1: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalCls.g:912:1: (lv_parameters_6_0= ruleParameter )
            	    // InternalCls.g:913:3: lv_parameters_6_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_23);
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

            	    // InternalCls.g:929:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==25) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalCls.g:929:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,25,FOLLOW_24); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
            	    	        
            	    	    // InternalCls.g:933:1: ( (lv_parameters_8_0= ruleParameter ) )
            	    	    // InternalCls.g:934:1: (lv_parameters_8_0= ruleParameter )
            	    	    {
            	    	    // InternalCls.g:934:1: (lv_parameters_8_0= ruleParameter )
            	    	    // InternalCls.g:935:3: lv_parameters_8_0= ruleParameter
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_23);
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
            	    	    break loop24;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FOLLOW_25); 

                	newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
                
            // InternalCls.g:955:1: (otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:955:3: otherlv_10= ':' ( (lv_type_11_0= ruleTypeReference ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_19); 

                        	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getColonKeyword_8_0());
                        
                    // InternalCls.g:959:1: ( (lv_type_11_0= ruleTypeReference ) )
                    // InternalCls.g:960:1: (lv_type_11_0= ruleTypeReference )
                    {
                    // InternalCls.g:960:1: (lv_type_11_0= ruleTypeReference )
                    // InternalCls.g:961:3: lv_type_11_0= ruleTypeReference
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
    // InternalCls.g:985:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCls.g:986:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalCls.g:987:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCls.g:994:1: ruleParameter returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleTypeReference ) ) ) ;
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
            // InternalCls.g:997:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleTypeReference ) ) ) )
            // InternalCls.g:998:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleTypeReference ) ) )
            {
            // InternalCls.g:998:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleTypeReference ) ) )
            // InternalCls.g:998:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_final_2_0= 'final' ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleTypeReference ) )
            {
            // InternalCls.g:998:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29||(LA27_0>=36 && LA27_0<=38)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:999:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:999:1: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:1000:3: lv_visibility_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_16);
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

            // InternalCls.g:1016:3: ( (lv_static_1_0= 'static' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:1017:1: (lv_static_1_0= 'static' )
                    {
                    // InternalCls.g:1017:1: (lv_static_1_0= 'static' )
                    // InternalCls.g:1018:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,21,FOLLOW_17); 

                            newLeafNode(lv_static_1_0, grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "static", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:1031:3: ( (lv_final_2_0= 'final' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:1032:1: (lv_final_2_0= 'final' )
                    {
                    // InternalCls.g:1032:1: (lv_final_2_0= 'final' )
                    // InternalCls.g:1033:3: lv_final_2_0= 'final'
                    {
                    lv_final_2_0=(Token)match(input,22,FOLLOW_7); 

                            newLeafNode(lv_final_2_0, grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "final", true, "final");
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:1046:3: ( (otherlv_3= RULE_ID ) )
            // InternalCls.g:1047:1: (otherlv_3= RULE_ID )
            {
            // InternalCls.g:1047:1: (otherlv_3= RULE_ID )
            // InternalCls.g:1048:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

            		newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getReferencedElementParameterCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_19); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getColonKeyword_4());
                
            // InternalCls.g:1063:1: ( (lv_type_5_0= ruleTypeReference ) )
            // InternalCls.g:1064:1: (lv_type_5_0= ruleTypeReference )
            {
            // InternalCls.g:1064:1: (lv_type_5_0= ruleTypeReference )
            // InternalCls.g:1065:3: lv_type_5_0= ruleTypeReference
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
    // InternalCls.g:1089:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCls.g:1090:2: (iv_ruleConnector= ruleConnector EOF )
            // InternalCls.g:1091:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalCls.g:1098:1: ruleConnector returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_Association_1 = null;

        EObject this_Implementation_2 = null;

        EObject this_CommentLink_3 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1101:28: ( (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink ) )
            // InternalCls.g:1102:1: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink )
            {
            // InternalCls.g:1102:1: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink )
            int alt30=4;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt30=4;
                    }
                    break;
                case 27:
                    {
                    alt30=1;
                    }
                    break;
                case 28:
                    {
                    alt30=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA30_0>=50 && LA30_0<=52)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalCls.g:1103:5: this_Generalization_0= ruleGeneralization
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
                    // InternalCls.g:1113:5: this_Association_1= ruleAssociation
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
                    // InternalCls.g:1123:5: this_Implementation_2= ruleImplementation
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
                    // InternalCls.g:1133:5: this_CommentLink_3= ruleCommentLink
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


    // $ANTLR start "entryRuleClassifierAssociationEnd"
    // InternalCls.g:1149:1: entryRuleClassifierAssociationEnd returns [EObject current=null] : iv_ruleClassifierAssociationEnd= ruleClassifierAssociationEnd EOF ;
    public final EObject entryRuleClassifierAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierAssociationEnd = null;


        try {
            // InternalCls.g:1150:2: (iv_ruleClassifierAssociationEnd= ruleClassifierAssociationEnd EOF )
            // InternalCls.g:1151:2: iv_ruleClassifierAssociationEnd= ruleClassifierAssociationEnd EOF
            {
             newCompositeNode(grammarAccess.getClassifierAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifierAssociationEnd=ruleClassifierAssociationEnd();

            state._fsp--;

             current =iv_ruleClassifierAssociationEnd; 
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
    // $ANTLR end "entryRuleClassifierAssociationEnd"


    // $ANTLR start "ruleClassifierAssociationEnd"
    // InternalCls.g:1158:1: ruleClassifierAssociationEnd returns [EObject current=null] : this_UMLTypeReference_0= ruleUMLTypeReference ;
    public final EObject ruleClassifierAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject this_UMLTypeReference_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1161:28: (this_UMLTypeReference_0= ruleUMLTypeReference )
            // InternalCls.g:1163:5: this_UMLTypeReference_0= ruleUMLTypeReference
            {
             
                    newCompositeNode(grammarAccess.getClassifierAssociationEndAccess().getUMLTypeReferenceParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_UMLTypeReference_0=ruleUMLTypeReference();

            state._fsp--;

             
                    current = this_UMLTypeReference_0; 
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
    // $ANTLR end "ruleClassifierAssociationEnd"


    // $ANTLR start "entryRuleGeneralization"
    // InternalCls.g:1179:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalCls.g:1180:2: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalCls.g:1181:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalCls.g:1188:1: ruleGeneralization returns [EObject current=null] : ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleClassifierAssociationEnd ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1191:28: ( ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleClassifierAssociationEnd ) ) ) )
            // InternalCls.g:1192:1: ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleClassifierAssociationEnd ) ) )
            {
            // InternalCls.g:1192:1: ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleClassifierAssociationEnd ) ) )
            // InternalCls.g:1192:2: ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleClassifierAssociationEnd ) )
            {
            // InternalCls.g:1192:2: ( (lv_left_0_0= ruleClassifierAssociationEnd ) )
            // InternalCls.g:1193:1: (lv_left_0_0= ruleClassifierAssociationEnd )
            {
            // InternalCls.g:1193:1: (lv_left_0_0= ruleClassifierAssociationEnd )
            // InternalCls.g:1194:3: lv_left_0_0= ruleClassifierAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getGeneralizationAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_26);
            lv_left_0_0=ruleClassifierAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneralizationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.ClassifierAssociationEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getIsaKeyword_1());
                
            // InternalCls.g:1214:1: ( (lv_right_2_0= ruleClassifierAssociationEnd ) )
            // InternalCls.g:1215:1: (lv_right_2_0= ruleClassifierAssociationEnd )
            {
            // InternalCls.g:1215:1: (lv_right_2_0= ruleClassifierAssociationEnd )
            // InternalCls.g:1216:3: lv_right_2_0= ruleClassifierAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getGeneralizationAccess().getRightClassifierAssociationEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleClassifierAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneralizationRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.ClassifierAssociationEnd");
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
    // InternalCls.g:1240:1: entryRuleImplementation returns [EObject current=null] : iv_ruleImplementation= ruleImplementation EOF ;
    public final EObject entryRuleImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementation = null;


        try {
            // InternalCls.g:1241:2: (iv_ruleImplementation= ruleImplementation EOF )
            // InternalCls.g:1242:2: iv_ruleImplementation= ruleImplementation EOF
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
    // InternalCls.g:1249:1: ruleImplementation returns [EObject current=null] : ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleClassifierAssociationEnd ) ) ) ;
    public final EObject ruleImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1252:28: ( ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleClassifierAssociationEnd ) ) ) )
            // InternalCls.g:1253:1: ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleClassifierAssociationEnd ) ) )
            {
            // InternalCls.g:1253:1: ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleClassifierAssociationEnd ) ) )
            // InternalCls.g:1253:2: ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleClassifierAssociationEnd ) )
            {
            // InternalCls.g:1253:2: ( (lv_left_0_0= ruleClassifierAssociationEnd ) )
            // InternalCls.g:1254:1: (lv_left_0_0= ruleClassifierAssociationEnd )
            {
            // InternalCls.g:1254:1: (lv_left_0_0= ruleClassifierAssociationEnd )
            // InternalCls.g:1255:3: lv_left_0_0= ruleClassifierAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getImplementationAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_27);
            lv_left_0_0=ruleClassifierAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplementationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.ClassifierAssociationEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getImplementationAccess().getImplKeyword_1());
                
            // InternalCls.g:1275:1: ( (lv_right_2_0= ruleClassifierAssociationEnd ) )
            // InternalCls.g:1276:1: (lv_right_2_0= ruleClassifierAssociationEnd )
            {
            // InternalCls.g:1276:1: (lv_right_2_0= ruleClassifierAssociationEnd )
            // InternalCls.g:1277:3: lv_right_2_0= ruleClassifierAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getImplementationAccess().getRightClassifierAssociationEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleClassifierAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplementationRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.ClassifierAssociationEnd");
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
    // InternalCls.g:1301:1: entryRuleCommentLink returns [EObject current=null] : iv_ruleCommentLink= ruleCommentLink EOF ;
    public final EObject entryRuleCommentLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentLink = null;


        try {
            // InternalCls.g:1302:2: (iv_ruleCommentLink= ruleCommentLink EOF )
            // InternalCls.g:1303:2: iv_ruleCommentLink= ruleCommentLink EOF
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
    // InternalCls.g:1310:1: ruleCommentLink returns [EObject current=null] : ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= '-' otherlv_2= 'note' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleCommentLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1313:28: ( ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= '-' otherlv_2= 'note' ( (otherlv_3= RULE_STRING ) ) ) )
            // InternalCls.g:1314:1: ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= '-' otherlv_2= 'note' ( (otherlv_3= RULE_STRING ) ) )
            {
            // InternalCls.g:1314:1: ( ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= '-' otherlv_2= 'note' ( (otherlv_3= RULE_STRING ) ) )
            // InternalCls.g:1314:2: ( (lv_left_0_0= ruleClassifierAssociationEnd ) ) otherlv_1= '-' otherlv_2= 'note' ( (otherlv_3= RULE_STRING ) )
            {
            // InternalCls.g:1314:2: ( (lv_left_0_0= ruleClassifierAssociationEnd ) )
            // InternalCls.g:1315:1: (lv_left_0_0= ruleClassifierAssociationEnd )
            {
            // InternalCls.g:1315:1: (lv_left_0_0= ruleClassifierAssociationEnd )
            // InternalCls.g:1316:3: lv_left_0_0= ruleClassifierAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getCommentLinkAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_28);
            lv_left_0_0=ruleClassifierAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommentLinkRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.ClassifierAssociationEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29); 

                	newLeafNode(otherlv_1, grammarAccess.getCommentLinkAccess().getHyphenMinusKeyword_1());
                
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getCommentLinkAccess().getNoteKeyword_2());
                
            // InternalCls.g:1340:1: ( (otherlv_3= RULE_STRING ) )
            // InternalCls.g:1341:1: (otherlv_3= RULE_STRING )
            {
            // InternalCls.g:1341:1: (otherlv_3= RULE_STRING )
            // InternalCls.g:1342:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentLinkRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		newLeafNode(otherlv_3, grammarAccess.getCommentLinkAccess().getCommentCommentCrossReference_3_0()); 
            	

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
    // InternalCls.g:1361:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalCls.g:1362:2: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalCls.g:1363:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalCls.g:1370:1: ruleAssociation returns [EObject current=null] : ( ( (lv_aggregationKind_0_0= ruleAggregationKind ) ) ( (lv_left_1_0= ruleClassifierAssociationEnd ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_right_3_0= ruleClassifierAssociationEnd ) ) ( (lv_properties_4_0= ruleAssociationProperties ) )? (otherlv_5= 'note' ( (otherlv_6= RULE_STRING ) ) )? ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_aggregationKind_0_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1373:28: ( ( ( (lv_aggregationKind_0_0= ruleAggregationKind ) ) ( (lv_left_1_0= ruleClassifierAssociationEnd ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_right_3_0= ruleClassifierAssociationEnd ) ) ( (lv_properties_4_0= ruleAssociationProperties ) )? (otherlv_5= 'note' ( (otherlv_6= RULE_STRING ) ) )? ) )
            // InternalCls.g:1374:1: ( ( (lv_aggregationKind_0_0= ruleAggregationKind ) ) ( (lv_left_1_0= ruleClassifierAssociationEnd ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_right_3_0= ruleClassifierAssociationEnd ) ) ( (lv_properties_4_0= ruleAssociationProperties ) )? (otherlv_5= 'note' ( (otherlv_6= RULE_STRING ) ) )? )
            {
            // InternalCls.g:1374:1: ( ( (lv_aggregationKind_0_0= ruleAggregationKind ) ) ( (lv_left_1_0= ruleClassifierAssociationEnd ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_right_3_0= ruleClassifierAssociationEnd ) ) ( (lv_properties_4_0= ruleAssociationProperties ) )? (otherlv_5= 'note' ( (otherlv_6= RULE_STRING ) ) )? )
            // InternalCls.g:1374:2: ( (lv_aggregationKind_0_0= ruleAggregationKind ) ) ( (lv_left_1_0= ruleClassifierAssociationEnd ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_right_3_0= ruleClassifierAssociationEnd ) ) ( (lv_properties_4_0= ruleAssociationProperties ) )? (otherlv_5= 'note' ( (otherlv_6= RULE_STRING ) ) )?
            {
            // InternalCls.g:1374:2: ( (lv_aggregationKind_0_0= ruleAggregationKind ) )
            // InternalCls.g:1375:1: (lv_aggregationKind_0_0= ruleAggregationKind )
            {
            // InternalCls.g:1375:1: (lv_aggregationKind_0_0= ruleAggregationKind )
            // InternalCls.g:1376:3: lv_aggregationKind_0_0= ruleAggregationKind
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getAggregationKindAggregationKindEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_7);
            lv_aggregationKind_0_0=ruleAggregationKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"aggregationKind",
                    		lv_aggregationKind_0_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.AggregationKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCls.g:1392:2: ( (lv_left_1_0= ruleClassifierAssociationEnd ) )
            // InternalCls.g:1393:1: (lv_left_1_0= ruleClassifierAssociationEnd )
            {
            // InternalCls.g:1393:1: (lv_left_1_0= ruleClassifierAssociationEnd )
            // InternalCls.g:1394:3: lv_left_1_0= ruleClassifierAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getLeftClassifierAssociationEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_7);
            lv_left_1_0=ruleClassifierAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_1_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.ClassifierAssociationEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCls.g:1410:2: ( (otherlv_2= RULE_ID ) )
            // InternalCls.g:1411:1: (otherlv_2= RULE_ID )
            {
            // InternalCls.g:1411:1: (otherlv_2= RULE_ID )
            // InternalCls.g:1412:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            		newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_2_0()); 
            	

            }


            }

            // InternalCls.g:1423:2: ( (lv_right_3_0= ruleClassifierAssociationEnd ) )
            // InternalCls.g:1424:1: (lv_right_3_0= ruleClassifierAssociationEnd )
            {
            // InternalCls.g:1424:1: (lv_right_3_0= ruleClassifierAssociationEnd )
            // InternalCls.g:1425:3: lv_right_3_0= ruleClassifierAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getRightClassifierAssociationEndParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_30);
            lv_right_3_0=ruleClassifierAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_3_0, 
                    		"de.cooperateproject.modeling.textual.cls.Cls.ClassifierAssociationEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalCls.g:1441:2: ( (lv_properties_4_0= ruleAssociationProperties ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:1442:1: (lv_properties_4_0= ruleAssociationProperties )
                    {
                    // InternalCls.g:1442:1: (lv_properties_4_0= ruleAssociationProperties )
                    // InternalCls.g:1443:3: lv_properties_4_0= ruleAssociationProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getPropertiesAssociationPropertiesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_31);
                    lv_properties_4_0=ruleAssociationProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_4_0, 
                            		"de.cooperateproject.modeling.textual.cls.Cls.AssociationProperties");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalCls.g:1459:3: (otherlv_5= 'note' ( (otherlv_6= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCls.g:1459:5: otherlv_5= 'note' ( (otherlv_6= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_3); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getNoteKeyword_5_0());
                        
                    // InternalCls.g:1463:1: ( (otherlv_6= RULE_STRING ) )
                    // InternalCls.g:1464:1: (otherlv_6= RULE_STRING )
                    {
                    // InternalCls.g:1464:1: (otherlv_6= RULE_STRING )
                    // InternalCls.g:1465:3: otherlv_6= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    		newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getCommentCommentCrossReference_5_1_0()); 
                    	

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


    // $ANTLR start "entryRuleAssociationProperties"
    // InternalCls.g:1484:1: entryRuleAssociationProperties returns [EObject current=null] : iv_ruleAssociationProperties= ruleAssociationProperties EOF ;
    public final EObject entryRuleAssociationProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationProperties = null;


        try {
            // InternalCls.g:1485:2: (iv_ruleAssociationProperties= ruleAssociationProperties EOF )
            // InternalCls.g:1486:2: iv_ruleAssociationProperties= ruleAssociationProperties EOF
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
    // InternalCls.g:1493:1: ruleAssociationProperties returns [EObject current=null] : (otherlv_0= '[' ( (lv_cardinalityLeft_1_0= ruleCardinality ) ) (otherlv_2= '|' ( (lv_cardinalityRight_3_0= ruleCardinality ) ) (otherlv_4= '|' ( (lv_readingDirection_5_0= ruleReadingDirection ) ) )? )? otherlv_6= ']' ) ;
    public final EObject ruleAssociationProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cardinalityLeft_1_0 = null;

        EObject lv_cardinalityRight_3_0 = null;

        Enumerator lv_readingDirection_5_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1496:28: ( (otherlv_0= '[' ( (lv_cardinalityLeft_1_0= ruleCardinality ) ) (otherlv_2= '|' ( (lv_cardinalityRight_3_0= ruleCardinality ) ) (otherlv_4= '|' ( (lv_readingDirection_5_0= ruleReadingDirection ) ) )? )? otherlv_6= ']' ) )
            // InternalCls.g:1497:1: (otherlv_0= '[' ( (lv_cardinalityLeft_1_0= ruleCardinality ) ) (otherlv_2= '|' ( (lv_cardinalityRight_3_0= ruleCardinality ) ) (otherlv_4= '|' ( (lv_readingDirection_5_0= ruleReadingDirection ) ) )? )? otherlv_6= ']' )
            {
            // InternalCls.g:1497:1: (otherlv_0= '[' ( (lv_cardinalityLeft_1_0= ruleCardinality ) ) (otherlv_2= '|' ( (lv_cardinalityRight_3_0= ruleCardinality ) ) (otherlv_4= '|' ( (lv_readingDirection_5_0= ruleReadingDirection ) ) )? )? otherlv_6= ']' )
            // InternalCls.g:1497:3: otherlv_0= '[' ( (lv_cardinalityLeft_1_0= ruleCardinality ) ) (otherlv_2= '|' ( (lv_cardinalityRight_3_0= ruleCardinality ) ) (otherlv_4= '|' ( (lv_readingDirection_5_0= ruleReadingDirection ) ) )? )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_32); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationPropertiesAccess().getLeftSquareBracketKeyword_0());
                
            // InternalCls.g:1501:1: ( (lv_cardinalityLeft_1_0= ruleCardinality ) )
            // InternalCls.g:1502:1: (lv_cardinalityLeft_1_0= ruleCardinality )
            {
            // InternalCls.g:1502:1: (lv_cardinalityLeft_1_0= ruleCardinality )
            // InternalCls.g:1503:3: lv_cardinalityLeft_1_0= ruleCardinality
            {
             
            	        newCompositeNode(grammarAccess.getAssociationPropertiesAccess().getCardinalityLeftCardinalityParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_33);
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

            // InternalCls.g:1519:2: (otherlv_2= '|' ( (lv_cardinalityRight_3_0= ruleCardinality ) ) (otherlv_4= '|' ( (lv_readingDirection_5_0= ruleReadingDirection ) ) )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:1519:4: otherlv_2= '|' ( (lv_cardinalityRight_3_0= ruleCardinality ) ) (otherlv_4= '|' ( (lv_readingDirection_5_0= ruleReadingDirection ) ) )?
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_2_0());
                        
                    // InternalCls.g:1523:1: ( (lv_cardinalityRight_3_0= ruleCardinality ) )
                    // InternalCls.g:1524:1: (lv_cardinalityRight_3_0= ruleCardinality )
                    {
                    // InternalCls.g:1524:1: (lv_cardinalityRight_3_0= ruleCardinality )
                    // InternalCls.g:1525:3: lv_cardinalityRight_3_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightCardinalityParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_33);
                    lv_cardinalityRight_3_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinalityRight",
                            		lv_cardinalityRight_3_0, 
                            		"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalCls.g:1541:2: (otherlv_4= '|' ( (lv_readingDirection_5_0= ruleReadingDirection ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==32) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalCls.g:1541:4: otherlv_4= '|' ( (lv_readingDirection_5_0= ruleReadingDirection ) )
                            {
                            otherlv_4=(Token)match(input,32,FOLLOW_34); 

                                	newLeafNode(otherlv_4, grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_2_2_0());
                                
                            // InternalCls.g:1545:1: ( (lv_readingDirection_5_0= ruleReadingDirection ) )
                            // InternalCls.g:1546:1: (lv_readingDirection_5_0= ruleReadingDirection )
                            {
                            // InternalCls.g:1546:1: (lv_readingDirection_5_0= ruleReadingDirection )
                            // InternalCls.g:1547:3: lv_readingDirection_5_0= ruleReadingDirection
                            {
                             
                            	        newCompositeNode(grammarAccess.getAssociationPropertiesAccess().getReadingDirectionReadingDirectionEnumRuleCall_2_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_35);
                            lv_readingDirection_5_0=ruleReadingDirection();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAssociationPropertiesRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"readingDirection",
                                    		lv_readingDirection_5_0, 
                                    		"de.cooperateproject.modeling.textual.cls.Cls.ReadingDirection");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getAssociationPropertiesAccess().getRightSquareBracketKeyword_3());
                

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
    // InternalCls.g:1575:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalCls.g:1576:2: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalCls.g:1577:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalCls.g:1584:1: ruleCardinality returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // InternalCls.g:1587:28: ( ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? ) )
            // InternalCls.g:1588:1: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            {
            // InternalCls.g:1588:1: ( ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )? )
            // InternalCls.g:1588:2: ( (lv_lowerBound_0_0= ruleCardinalityBound ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            {
            // InternalCls.g:1588:2: ( (lv_lowerBound_0_0= ruleCardinalityBound ) )
            // InternalCls.g:1589:1: (lv_lowerBound_0_0= ruleCardinalityBound )
            {
            // InternalCls.g:1589:1: (lv_lowerBound_0_0= ruleCardinalityBound )
            // InternalCls.g:1590:3: lv_lowerBound_0_0= ruleCardinalityBound
            {
             
            	        newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_36);
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

            // InternalCls.g:1606:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:1606:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_32); 

                        	newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0());
                        
                    // InternalCls.g:1610:1: ( (lv_upperBound_2_0= ruleCardinalityBound ) )
                    // InternalCls.g:1611:1: (lv_upperBound_2_0= ruleCardinalityBound )
                    {
                    // InternalCls.g:1611:1: (lv_upperBound_2_0= ruleCardinalityBound )
                    // InternalCls.g:1612:3: lv_upperBound_2_0= ruleCardinalityBound
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


    // $ANTLR start "entryRuleCardinalityBound"
    // InternalCls.g:1636:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // InternalCls.g:1637:2: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // InternalCls.g:1638:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
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
    // InternalCls.g:1645:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalCls.g:1648:28: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalCls.g:1649:1: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalCls.g:1649:1: (kw= '*' | this_INT_1= RULE_INT )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_INT) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalCls.g:1650:2: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalCls.g:1656:10: this_INT_1= RULE_INT
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
    // InternalCls.g:1671:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '~' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '+' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalCls.g:1673:28: ( ( (enumLiteral_0= '~' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '+' ) ) )
            // InternalCls.g:1674:1: ( (enumLiteral_0= '~' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '+' ) )
            {
            // InternalCls.g:1674:1: ( (enumLiteral_0= '~' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '+' ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt37=1;
                }
                break;
            case 29:
                {
                alt37=2;
                }
                break;
            case 37:
                {
                alt37=3;
                }
                break;
            case 38:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalCls.g:1674:2: (enumLiteral_0= '~' )
                    {
                    // InternalCls.g:1674:2: (enumLiteral_0= '~' )
                    // InternalCls.g:1674:4: enumLiteral_0= '~'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                            current = grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1680:6: (enumLiteral_1= '-' )
                    {
                    // InternalCls.g:1680:6: (enumLiteral_1= '-' )
                    // InternalCls.g:1680:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                            current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1686:6: (enumLiteral_2= '#' )
                    {
                    // InternalCls.g:1686:6: (enumLiteral_2= '#' )
                    // InternalCls.g:1686:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                            current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1692:6: (enumLiteral_3= '+' )
                    {
                    // InternalCls.g:1692:6: (enumLiteral_3= '+' )
                    // InternalCls.g:1692:8: enumLiteral_3= '+'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                            current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3()); 
                        

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


    // $ANTLR start "ruleReadingDirection"
    // InternalCls.g:1702:1: ruleReadingDirection returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) ) ;
    public final Enumerator ruleReadingDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalCls.g:1704:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) ) )
            // InternalCls.g:1705:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) )
            {
            // InternalCls.g:1705:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            else if ( (LA38_0==40) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:1705:2: (enumLiteral_0= '<' )
                    {
                    // InternalCls.g:1705:2: (enumLiteral_0= '<' )
                    // InternalCls.g:1705:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                            current = grammarAccess.getReadingDirectionAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getReadingDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1711:6: (enumLiteral_1= '>' )
                    {
                    // InternalCls.g:1711:6: (enumLiteral_1= '>' )
                    // InternalCls.g:1711:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                            current = grammarAccess.getReadingDirectionAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getReadingDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleReadingDirection"


    // $ANTLR start "rulePrimitiveType"
    // InternalCls.g:1721:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) ) ;
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
            // InternalCls.g:1723:28: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) ) )
            // InternalCls.g:1724:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) )
            {
            // InternalCls.g:1724:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) )
            int alt39=9;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt39=1;
                }
                break;
            case 42:
                {
                alt39=2;
                }
                break;
            case 43:
                {
                alt39=3;
                }
                break;
            case 44:
                {
                alt39=4;
                }
                break;
            case 45:
                {
                alt39=5;
                }
                break;
            case 46:
                {
                alt39=6;
                }
                break;
            case 47:
                {
                alt39=7;
                }
                break;
            case 48:
                {
                alt39=8;
                }
                break;
            case 49:
                {
                alt39=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalCls.g:1724:2: (enumLiteral_0= 'string' )
                    {
                    // InternalCls.g:1724:2: (enumLiteral_0= 'string' )
                    // InternalCls.g:1724:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1730:6: (enumLiteral_1= 'int' )
                    {
                    // InternalCls.g:1730:6: (enumLiteral_1= 'int' )
                    // InternalCls.g:1730:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1736:6: (enumLiteral_2= 'double' )
                    {
                    // InternalCls.g:1736:6: (enumLiteral_2= 'double' )
                    // InternalCls.g:1736:8: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1742:6: (enumLiteral_3= 'boolean' )
                    {
                    // InternalCls.g:1742:6: (enumLiteral_3= 'boolean' )
                    // InternalCls.g:1742:8: enumLiteral_3= 'boolean'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1748:6: (enumLiteral_4= 'char' )
                    {
                    // InternalCls.g:1748:6: (enumLiteral_4= 'char' )
                    // InternalCls.g:1748:8: enumLiteral_4= 'char'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:1754:6: (enumLiteral_5= 'byte' )
                    {
                    // InternalCls.g:1754:6: (enumLiteral_5= 'byte' )
                    // InternalCls.g:1754:8: enumLiteral_5= 'byte'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:1760:6: (enumLiteral_6= 'short' )
                    {
                    // InternalCls.g:1760:6: (enumLiteral_6= 'short' )
                    // InternalCls.g:1760:8: enumLiteral_6= 'short'
                    {
                    enumLiteral_6=(Token)match(input,47,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalCls.g:1766:6: (enumLiteral_7= 'long' )
                    {
                    // InternalCls.g:1766:6: (enumLiteral_7= 'long' )
                    // InternalCls.g:1766:8: enumLiteral_7= 'long'
                    {
                    enumLiteral_7=(Token)match(input,48,FOLLOW_2); 

                            current = grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalCls.g:1772:6: (enumLiteral_8= 'float' )
                    {
                    // InternalCls.g:1772:6: (enumLiteral_8= 'float' )
                    // InternalCls.g:1772:8: enumLiteral_8= 'float'
                    {
                    enumLiteral_8=(Token)match(input,49,FOLLOW_2); 

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
    // InternalCls.g:1782:1: ruleAggregationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'ass' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) ;
    public final Enumerator ruleAggregationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalCls.g:1784:28: ( ( (enumLiteral_0= 'ass' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) ) )
            // InternalCls.g:1785:1: ( (enumLiteral_0= 'ass' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            {
            // InternalCls.g:1785:1: ( (enumLiteral_0= 'ass' ) | (enumLiteral_1= 'agg' ) | (enumLiteral_2= 'com' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt40=1;
                }
                break;
            case 51:
                {
                alt40=2;
                }
                break;
            case 52:
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
                    // InternalCls.g:1785:2: (enumLiteral_0= 'ass' )
                    {
                    // InternalCls.g:1785:2: (enumLiteral_0= 'ass' )
                    // InternalCls.g:1785:4: enumLiteral_0= 'ass'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                            current = grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1791:6: (enumLiteral_1= 'agg' )
                    {
                    // InternalCls.g:1791:6: (enumLiteral_1= 'agg' )
                    // InternalCls.g:1791:8: enumLiteral_1= 'agg'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                            current = grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1797:6: (enumLiteral_2= 'com' )
                    {
                    // InternalCls.g:1797:6: (enumLiteral_2= 'com' )
                    // InternalCls.g:1797:8: enumLiteral_2= 'com'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

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


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\7\5\1\27\2\uffff";
    static final String dfa_3s = "\1\46\5\26\1\5\1\30\2\uffff";
    static final String dfa_4s = "\10\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\11\uffff\1\10\5\uffff\1\5\1\6\6\uffff\1\2\6\uffff\1\1\1\3\1\4",
            "\1\7\11\uffff\1\10\5\uffff\1\5\1\6",
            "\1\7\11\uffff\1\10\5\uffff\1\5\1\6",
            "\1\7\11\uffff\1\10\5\uffff\1\5\1\6",
            "\1\7\11\uffff\1\10\5\uffff\1\5\1\6",
            "\1\7\20\uffff\1\6",
            "\1\7",
            "\1\11\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "681:1: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x001C00702011B020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x001C007020119020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x001C000000001020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000007020688020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0003FE0000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000608020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007024600020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007026600020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000007020600020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000002L});

}