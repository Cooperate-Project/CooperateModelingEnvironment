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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@startclass'", "'@endclass'", "'class'", "'interface'", "'{'", "','", "'}'", "' as '", "'abstract'", "'static'", "'final'", "':'", "'('", "')'", "'isa'", "'impl'", "'-'", "'['", "'|'", "'<'", "'>'", "']'", "'*'", "'..'", "'note['", "'~'", "'#'", "'+'", "'string'", "'int'", "'double'", "'boolean'", "'char'", "'byte'", "'short'", "'long'", "'float'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
        	return "UmlDiagram";
       	}

       	@Override
       	protected ClsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUmlDiagram"
    // InternalCls.g:65:1: entryRuleUmlDiagram returns [EObject current=null] : iv_ruleUmlDiagram= ruleUmlDiagram EOF ;
    public final EObject entryRuleUmlDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUmlDiagram = null;


        try {
            // InternalCls.g:65:51: (iv_ruleUmlDiagram= ruleUmlDiagram EOF )
            // InternalCls.g:66:2: iv_ruleUmlDiagram= ruleUmlDiagram EOF
            {
             newCompositeNode(grammarAccess.getUmlDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUmlDiagram=ruleUmlDiagram();

            state._fsp--;

             current =iv_ruleUmlDiagram; 
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
    // $ANTLR end "entryRuleUmlDiagram"


    // $ANTLR start "ruleUmlDiagram"
    // InternalCls.g:72:1: ruleUmlDiagram returns [EObject current=null] : this_ClassDiagram_0= ruleClassDiagram ;
    public final EObject ruleUmlDiagram() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDiagram_0 = null;



        	enterRule();

        try {
            // InternalCls.g:78:2: (this_ClassDiagram_0= ruleClassDiagram )
            // InternalCls.g:79:2: this_ClassDiagram_0= ruleClassDiagram
            {

            		newCompositeNode(grammarAccess.getUmlDiagramAccess().getClassDiagramParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ClassDiagram_0=ruleClassDiagram();

            state._fsp--;


            		current = this_ClassDiagram_0;
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
    // $ANTLR end "ruleUmlDiagram"


    // $ANTLR start "entryRuleClassDiagram"
    // InternalCls.g:90:1: entryRuleClassDiagram returns [EObject current=null] : iv_ruleClassDiagram= ruleClassDiagram EOF ;
    public final EObject entryRuleClassDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDiagram = null;


        try {
            // InternalCls.g:90:53: (iv_ruleClassDiagram= ruleClassDiagram EOF )
            // InternalCls.g:91:2: iv_ruleClassDiagram= ruleClassDiagram EOF
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
    // InternalCls.g:97:1: ruleClassDiagram returns [EObject current=null] : ( () otherlv_1= '@startclass' ( (lv_elements_2_0= ruleClassElement ) )* otherlv_3= '@endclass' ) ;
    public final EObject ruleClassDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalCls.g:103:2: ( ( () otherlv_1= '@startclass' ( (lv_elements_2_0= ruleClassElement ) )* otherlv_3= '@endclass' ) )
            // InternalCls.g:104:2: ( () otherlv_1= '@startclass' ( (lv_elements_2_0= ruleClassElement ) )* otherlv_3= '@endclass' )
            {
            // InternalCls.g:104:2: ( () otherlv_1= '@startclass' ( (lv_elements_2_0= ruleClassElement ) )* otherlv_3= '@endclass' )
            // InternalCls.g:105:3: () otherlv_1= '@startclass' ( (lv_elements_2_0= ruleClassElement ) )* otherlv_3= '@endclass'
            {
            // InternalCls.g:105:3: ()
            // InternalCls.g:106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassDiagramAccess().getClassDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDiagramAccess().getStartclassKeyword_1());
            		
            // InternalCls.g:116:3: ( (lv_elements_2_0= ruleClassElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=14)||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCls.g:117:4: (lv_elements_2_0= ruleClassElement )
            	    {
            	    // InternalCls.g:117:4: (lv_elements_2_0= ruleClassElement )
            	    // InternalCls.g:118:5: lv_elements_2_0= ruleClassElement
            	    {

            	    					newCompositeNode(grammarAccess.getClassDiagramAccess().getElementsClassElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_2_0=ruleClassElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.ClassElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClassDiagramAccess().getEndclassKeyword_3());
            		

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


    // $ANTLR start "entryRuleClassElement"
    // InternalCls.g:143:1: entryRuleClassElement returns [EObject current=null] : iv_ruleClassElement= ruleClassElement EOF ;
    public final EObject entryRuleClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassElement = null;


        try {
            // InternalCls.g:143:53: (iv_ruleClassElement= ruleClassElement EOF )
            // InternalCls.g:144:2: iv_ruleClassElement= ruleClassElement EOF
            {
             newCompositeNode(grammarAccess.getClassElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassElement=ruleClassElement();

            state._fsp--;

             current =iv_ruleClassElement; 
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
    // $ANTLR end "entryRuleClassElement"


    // $ANTLR start "ruleClassElement"
    // InternalCls.g:150:1: ruleClassElement returns [EObject current=null] : (this_ClassDef_0= ruleClassDef | this_Class_1= ruleClass | this_Connector_2= ruleConnector ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDef_0 = null;

        EObject this_Class_1 = null;

        EObject this_Connector_2 = null;



        	enterRule();

        try {
            // InternalCls.g:156:2: ( (this_ClassDef_0= ruleClassDef | this_Class_1= ruleClass | this_Connector_2= ruleConnector ) )
            // InternalCls.g:157:2: (this_ClassDef_0= ruleClassDef | this_Class_1= ruleClass | this_Connector_2= ruleConnector )
            {
            // InternalCls.g:157:2: (this_ClassDef_0= ruleClassDef | this_Class_1= ruleClass | this_Connector_2= ruleConnector )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                int LA2_3 = input.LA(2);

                if ( ((LA2_3>=25 && LA2_3<=27)) ) {
                    alt2=3;
                }
                else if ( (LA2_3==15) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCls.g:158:3: this_ClassDef_0= ruleClassDef
                    {

                    			newCompositeNode(grammarAccess.getClassElementAccess().getClassDefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDef_0=ruleClassDef();

                    state._fsp--;


                    			current = this_ClassDef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:167:3: this_Class_1= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getClassElementAccess().getClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_1=ruleClass();

                    state._fsp--;


                    			current = this_Class_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCls.g:176:3: this_Connector_2= ruleConnector
                    {

                    			newCompositeNode(grammarAccess.getClassElementAccess().getConnectorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connector_2=ruleConnector();

                    state._fsp--;


                    			current = this_Connector_2;
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
    // $ANTLR end "ruleClassElement"


    // $ANTLR start "entryRuleType"
    // InternalCls.g:188:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalCls.g:188:45: (iv_ruleType= ruleType EOF )
            // InternalCls.g:189:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalCls.g:195:1: ruleType returns [EObject current=null] : (this_ClassType_0= ruleClassType | this_DataType_1= ruleDataType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ClassType_0 = null;

        EObject this_DataType_1 = null;



        	enterRule();

        try {
            // InternalCls.g:201:2: ( (this_ClassType_0= ruleClassType | this_DataType_1= ruleDataType ) )
            // InternalCls.g:202:2: (this_ClassType_0= ruleClassType | this_DataType_1= ruleDataType )
            {
            // InternalCls.g:202:2: (this_ClassType_0= ruleClassType | this_DataType_1= ruleDataType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=39 && LA3_0<=47)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCls.g:203:3: this_ClassType_0= ruleClassType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getClassTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassType_0=ruleClassType();

                    state._fsp--;


                    			current = this_ClassType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:212:3: this_DataType_1= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_1=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleClassType"
    // InternalCls.g:224:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // InternalCls.g:224:50: (iv_ruleClassType= ruleClassType EOF )
            // InternalCls.g:225:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // InternalCls.g:231:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCls.g:237:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCls.g:238:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCls.g:238:2: ( (otherlv_0= RULE_ID ) )
            // InternalCls.g:239:3: (otherlv_0= RULE_ID )
            {
            // InternalCls.g:239:3: (otherlv_0= RULE_ID )
            // InternalCls.g:240:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getClassTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getTypeClassNameCrossReference_0());
            			

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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleDataType"
    // InternalCls.g:254:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalCls.g:254:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalCls.g:255:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalCls.g:261:1: ruleDataType returns [EObject current=null] : ( (lv_type_0_0= ruleDataTypeEnum ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalCls.g:267:2: ( ( (lv_type_0_0= ruleDataTypeEnum ) ) )
            // InternalCls.g:268:2: ( (lv_type_0_0= ruleDataTypeEnum ) )
            {
            // InternalCls.g:268:2: ( (lv_type_0_0= ruleDataTypeEnum ) )
            // InternalCls.g:269:3: (lv_type_0_0= ruleDataTypeEnum )
            {
            // InternalCls.g:269:3: (lv_type_0_0= ruleDataTypeEnum )
            // InternalCls.g:270:4: lv_type_0_0= ruleDataTypeEnum
            {

            				newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypeEnumEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleDataTypeEnum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDataTypeRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"de.cooperateproject.modeling.textual.cls.Cls.DataTypeEnum");
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleClassDef"
    // InternalCls.g:290:1: entryRuleClassDef returns [EObject current=null] : iv_ruleClassDef= ruleClassDef EOF ;
    public final EObject entryRuleClassDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDef = null;


        try {
            // InternalCls.g:290:49: (iv_ruleClassDef= ruleClassDef EOF )
            // InternalCls.g:291:2: iv_ruleClassDef= ruleClassDef EOF
            {
             newCompositeNode(grammarAccess.getClassDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDef=ruleClassDef();

            state._fsp--;

             current =iv_ruleClassDef; 
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
    // $ANTLR end "entryRuleClassDef"


    // $ANTLR start "ruleClassDef"
    // InternalCls.g:297:1: ruleClassDef returns [EObject current=null] : ( (otherlv_0= 'class' | otherlv_1= 'interface' ) otherlv_2= '{' ( (lv_classes_3_0= ruleClassName ) ) (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleClassDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_classes_3_0 = null;

        EObject lv_classes_5_0 = null;



        	enterRule();

        try {
            // InternalCls.g:303:2: ( ( (otherlv_0= 'class' | otherlv_1= 'interface' ) otherlv_2= '{' ( (lv_classes_3_0= ruleClassName ) ) (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )* otherlv_6= '}' ) )
            // InternalCls.g:304:2: ( (otherlv_0= 'class' | otherlv_1= 'interface' ) otherlv_2= '{' ( (lv_classes_3_0= ruleClassName ) ) (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )* otherlv_6= '}' )
            {
            // InternalCls.g:304:2: ( (otherlv_0= 'class' | otherlv_1= 'interface' ) otherlv_2= '{' ( (lv_classes_3_0= ruleClassName ) ) (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )* otherlv_6= '}' )
            // InternalCls.g:305:3: (otherlv_0= 'class' | otherlv_1= 'interface' ) otherlv_2= '{' ( (lv_classes_3_0= ruleClassName ) ) (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )* otherlv_6= '}'
            {
            // InternalCls.g:305:3: (otherlv_0= 'class' | otherlv_1= 'interface' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCls.g:306:4: otherlv_0= 'class'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassDefAccess().getClassKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCls.g:311:4: otherlv_1= 'interface'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassDefAccess().getInterfaceKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCls.g:320:3: ( (lv_classes_3_0= ruleClassName ) )
            // InternalCls.g:321:4: (lv_classes_3_0= ruleClassName )
            {
            // InternalCls.g:321:4: (lv_classes_3_0= ruleClassName )
            // InternalCls.g:322:5: lv_classes_3_0= ruleClassName
            {

            					newCompositeNode(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_classes_3_0=ruleClassName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDefRule());
            					}
            					add(
            						current,
            						"classes",
            						lv_classes_3_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.ClassName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:339:3: (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCls.g:340:4: otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getClassDefAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCls.g:344:4: ( (lv_classes_5_0= ruleClassName ) )
            	    // InternalCls.g:345:5: (lv_classes_5_0= ruleClassName )
            	    {
            	    // InternalCls.g:345:5: (lv_classes_5_0= ruleClassName )
            	    // InternalCls.g:346:6: lv_classes_5_0= ruleClassName
            	    {

            	    						newCompositeNode(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_classes_5_0=ruleClassName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassDefRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classes",
            	    							lv_classes_5_0,
            	    							"de.cooperateproject.modeling.textual.cls.Cls.ClassName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getClassDefAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleClassDef"


    // $ANTLR start "entryRuleClassName"
    // InternalCls.g:372:1: entryRuleClassName returns [EObject current=null] : iv_ruleClassName= ruleClassName EOF ;
    public final EObject entryRuleClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassName = null;


        try {
            // InternalCls.g:372:50: (iv_ruleClassName= ruleClassName EOF )
            // InternalCls.g:373:2: iv_ruleClassName= ruleClassName EOF
            {
             newCompositeNode(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassName=ruleClassName();

            state._fsp--;

             current =iv_ruleClassName; 
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
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // InternalCls.g:379:1: ruleClassName returns [EObject current=null] : this_Name_0= ruleName ;
    public final EObject ruleClassName() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;



        	enterRule();

        try {
            // InternalCls.g:385:2: (this_Name_0= ruleName )
            // InternalCls.g:386:2: this_Name_0= ruleName
            {

            		newCompositeNode(grammarAccess.getClassNameAccess().getNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Name_0=ruleName();

            state._fsp--;


            		current = this_Name_0;
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
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRuleName"
    // InternalCls.g:397:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalCls.g:397:45: (iv_ruleName= ruleName EOF )
            // InternalCls.g:398:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
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
    // InternalCls.g:404:1: ruleName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_longname_1_1=null;
        Token lv_longname_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalCls.g:410:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) ) ) )
            // InternalCls.g:411:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) ) )
            {
            // InternalCls.g:411:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==18) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||(LA7_1>=16 && LA7_1<=17)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCls.g:412:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalCls.g:412:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalCls.g:413:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalCls.g:413:4: (lv_name_0_0= RULE_ID )
                    // InternalCls.g:414:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getNameAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:431:3: ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalCls.g:431:3: ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalCls.g:432:4: ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalCls.g:432:4: ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) )
                    // InternalCls.g:433:5: ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) )
                    {
                    // InternalCls.g:433:5: ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) )
                    // InternalCls.g:434:6: (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID )
                    {
                    // InternalCls.g:434:6: (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_STRING) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_ID) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCls.g:435:7: lv_longname_1_1= RULE_STRING
                            {
                            lv_longname_1_1=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            							newLeafNode(lv_longname_1_1, grammarAccess.getNameAccess().getLongnameSTRINGTerminalRuleCall_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNameRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"longname",
                            								lv_longname_1_1,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;
                        case 2 :
                            // InternalCls.g:450:7: lv_longname_1_2= RULE_ID
                            {
                            lv_longname_1_2=(Token)match(input,RULE_ID,FOLLOW_7); 

                            							newLeafNode(lv_longname_1_2, grammarAccess.getNameAccess().getLongnameIDTerminalRuleCall_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNameRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"longname",
                            								lv_longname_1_2,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getNameAccess().getAsKeyword_1_1());
                    			
                    // InternalCls.g:471:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalCls.g:472:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalCls.g:472:5: (lv_name_3_0= RULE_ID )
                    // InternalCls.g:473:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleClass"
    // InternalCls.g:494:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalCls.g:494:46: (iv_ruleClass= ruleClass EOF )
            // InternalCls.g:495:2: iv_ruleClass= ruleClass EOF
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
    // InternalCls.g:501:1: ruleClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalCls.g:507:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* otherlv_4= '}' ) )
            // InternalCls.g:508:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* otherlv_4= '}' )
            {
            // InternalCls.g:508:2: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* otherlv_4= '}' )
            // InternalCls.g:509:3: ( (lv_abstract_0_0= 'abstract' ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* otherlv_4= '}'
            {
            // InternalCls.g:509:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCls.g:510:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalCls.g:510:4: (lv_abstract_0_0= 'abstract' )
                    // InternalCls.g:511:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,19,FOLLOW_8); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:523:3: ( (otherlv_1= RULE_ID ) )
            // InternalCls.g:524:4: (otherlv_1= RULE_ID )
            {
            // InternalCls.g:524:4: (otherlv_1= RULE_ID )
            // InternalCls.g:525:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getClassAccess().getNameClassNameCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCls.g:540:3: ( (lv_members_3_0= ruleMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=19 && LA9_0<=21)||LA9_0==27||(LA9_0>=36 && LA9_0<=38)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCls.g:541:4: (lv_members_3_0= ruleMember )
            	    {
            	    // InternalCls.g:541:4: (lv_members_3_0= ruleMember )
            	    // InternalCls.g:542:5: lv_members_3_0= ruleMember
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_members_3_0=ruleMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_3_0,
            	    						"de.cooperateproject.modeling.textual.cls.Cls.Member");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleMember"
    // InternalCls.g:567:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalCls.g:567:47: (iv_ruleMember= ruleMember EOF )
            // InternalCls.g:568:2: iv_ruleMember= ruleMember EOF
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
    // InternalCls.g:574:1: ruleMember returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Methode_1= ruleMethode ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Methode_1 = null;



        	enterRule();

        try {
            // InternalCls.g:580:2: ( (this_Attribute_0= ruleAttribute | this_Methode_1= ruleMethode ) )
            // InternalCls.g:581:2: (this_Attribute_0= ruleAttribute | this_Methode_1= ruleMethode )
            {
            // InternalCls.g:581:2: (this_Attribute_0= ruleAttribute | this_Methode_1= ruleMethode )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalCls.g:582:3: this_Attribute_0= ruleAttribute
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
                    // InternalCls.g:591:3: this_Methode_1= ruleMethode
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getMethodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Methode_1=ruleMethode();

                    state._fsp--;


                    			current = this_Methode_1;
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
    // InternalCls.g:603:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalCls.g:603:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalCls.g:604:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalCls.g:610:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_final_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalCls.g:616:2: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleType ) ) ) )
            // InternalCls.g:617:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleType ) ) )
            {
            // InternalCls.g:617:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleType ) ) )
            // InternalCls.g:618:3: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleType ) )
            {
            // InternalCls.g:618:3: ()
            // InternalCls.g:619:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalCls.g:625:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27||(LA11_0>=36 && LA11_0<=38)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCls.g:626:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalCls.g:626:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalCls.g:627:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_10);
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

            // InternalCls.g:644:3: ( (lv_static_2_0= 'static' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCls.g:645:4: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:645:4: (lv_static_2_0= 'static' )
                    // InternalCls.g:646:5: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,20,FOLLOW_11); 

                    					newLeafNode(lv_static_2_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:658:3: ( (lv_final_3_0= 'final' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCls.g:659:4: (lv_final_3_0= 'final' )
                    {
                    // InternalCls.g:659:4: (lv_final_3_0= 'final' )
                    // InternalCls.g:660:5: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,21,FOLLOW_8); 

                    					newLeafNode(lv_final_3_0, grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:672:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCls.g:673:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCls.g:673:4: (lv_name_4_0= RULE_ID )
            // InternalCls.g:674:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_5=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getColonKeyword_5());
            		
            // InternalCls.g:694:3: ( (lv_type_6_0= ruleType ) )
            // InternalCls.g:695:4: (lv_type_6_0= ruleType )
            {
            // InternalCls.g:695:4: (lv_type_6_0= ruleType )
            // InternalCls.g:696:5: lv_type_6_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_6_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.Type");
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


    // $ANTLR start "entryRuleMethode"
    // InternalCls.g:717:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // InternalCls.g:717:48: (iv_ruleMethode= ruleMethode EOF )
            // InternalCls.g:718:2: iv_ruleMethode= ruleMethode EOF
            {
             newCompositeNode(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethode=ruleMethode();

            state._fsp--;

             current =iv_ruleMethode; 
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
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // InternalCls.g:724:1: ruleMethode returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) )? ) ;
    public final EObject ruleMethode() throws RecognitionException {
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

        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_type_11_0 = null;



        	enterRule();

        try {
            // InternalCls.g:730:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) )? ) )
            // InternalCls.g:731:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) )? )
            {
            // InternalCls.g:731:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) )? )
            // InternalCls.g:732:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_final_3_0= 'final' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) )?
            {
            // InternalCls.g:732:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27||(LA14_0>=36 && LA14_0<=38)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCls.g:733:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalCls.g:733:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalCls.g:734:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getMethodeAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodeRule());
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

            // InternalCls.g:751:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCls.g:752:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalCls.g:752:4: (lv_abstract_1_0= 'abstract' )
                    // InternalCls.g:753:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,19,FOLLOW_10); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getMethodeAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodeRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:765:3: ( (lv_static_2_0= 'static' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCls.g:766:4: (lv_static_2_0= 'static' )
                    {
                    // InternalCls.g:766:4: (lv_static_2_0= 'static' )
                    // InternalCls.g:767:5: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,20,FOLLOW_11); 

                    					newLeafNode(lv_static_2_0, grammarAccess.getMethodeAccess().getStaticStaticKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodeRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:779:3: ( (lv_final_3_0= 'final' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCls.g:780:4: (lv_final_3_0= 'final' )
                    {
                    // InternalCls.g:780:4: (lv_final_3_0= 'final' )
                    // InternalCls.g:781:5: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,21,FOLLOW_8); 

                    					newLeafNode(lv_final_3_0, grammarAccess.getMethodeAccess().getFinalFinalKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodeRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:793:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCls.g:794:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCls.g:794:4: (lv_name_4_0= RULE_ID )
            // InternalCls.g:795:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_5());
            		
            // InternalCls.g:815:3: ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=20 && LA19_0<=21)||LA19_0==27||(LA19_0>=36 && LA19_0<=38)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCls.g:816:4: ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )*
            	    {
            	    // InternalCls.g:816:4: ( (lv_attributes_6_0= ruleAttribute ) )
            	    // InternalCls.g:817:5: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // InternalCls.g:817:5: (lv_attributes_6_0= ruleAttribute )
            	    // InternalCls.g:818:6: lv_attributes_6_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_6_0,
            	    							"de.cooperateproject.modeling.textual.cls.Cls.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCls.g:835:4: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==16) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalCls.g:836:5: otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,16,FOLLOW_18); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getMethodeAccess().getCommaKeyword_6_1_0());
            	    	    				
            	    	    // InternalCls.g:840:5: ( (lv_attributes_8_0= ruleAttribute ) )
            	    	    // InternalCls.g:841:6: (lv_attributes_8_0= ruleAttribute )
            	    	    {
            	    	    // InternalCls.g:841:6: (lv_attributes_8_0= ruleAttribute )
            	    	    // InternalCls.g:842:7: lv_attributes_8_0= ruleAttribute
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_attributes_8_0=ruleAttribute();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMethodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"attributes",
            	    	    								lv_attributes_8_0,
            	    	    								"de.cooperateproject.modeling.textual.cls.Cls.Attribute");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_9=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodeAccess().getRightParenthesisKeyword_7());
            		
            // InternalCls.g:865:3: (otherlv_10= ':' ( (lv_type_11_0= ruleType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCls.g:866:4: otherlv_10= ':' ( (lv_type_11_0= ruleType ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodeAccess().getColonKeyword_8_0());
                    			
                    // InternalCls.g:870:4: ( (lv_type_11_0= ruleType ) )
                    // InternalCls.g:871:5: (lv_type_11_0= ruleType )
                    {
                    // InternalCls.g:871:5: (lv_type_11_0= ruleType )
                    // InternalCls.g:872:6: lv_type_11_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMethodeAccess().getTypeTypeParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_11_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_11_0,
                    							"de.cooperateproject.modeling.textual.cls.Cls.Type");
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
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleConnector"
    // InternalCls.g:894:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCls.g:894:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCls.g:895:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalCls.g:901:1: ruleConnector returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_Association_1 = null;

        EObject this_Implementation_2 = null;

        EObject this_CommentLink_3 = null;



        	enterRule();

        try {
            // InternalCls.g:907:2: ( (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink ) )
            // InternalCls.g:908:2: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink )
            {
            // InternalCls.g:908:2: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation | this_Implementation_2= ruleImplementation | this_CommentLink_3= ruleCommentLink )
            int alt21=4;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==35) ) {
                        alt21=4;
                    }
                    else if ( (LA21_2==RULE_ID) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                    {
                    alt21=3;
                    }
                    break;
                case 25:
                    {
                    alt21=1;
                    }
                    break;
                default:
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
                    // InternalCls.g:909:3: this_Generalization_0= ruleGeneralization
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
                    // InternalCls.g:918:3: this_Association_1= ruleAssociation
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
                    // InternalCls.g:927:3: this_Implementation_2= ruleImplementation
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
                    // InternalCls.g:936:3: this_CommentLink_3= ruleCommentLink
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
    // InternalCls.g:948:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalCls.g:948:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalCls.g:949:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalCls.g:955:1: ruleGeneralization returns [EObject current=null] : ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleAssociationEnd ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalCls.g:961:2: ( ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleAssociationEnd ) ) ) )
            // InternalCls.g:962:2: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleAssociationEnd ) ) )
            {
            // InternalCls.g:962:2: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleAssociationEnd ) ) )
            // InternalCls.g:963:3: ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleAssociationEnd ) )
            {
            // InternalCls.g:963:3: ( (lv_left_0_0= ruleAssociationEnd ) )
            // InternalCls.g:964:4: (lv_left_0_0= ruleAssociationEnd )
            {
            // InternalCls.g:964:4: (lv_left_0_0= ruleAssociationEnd )
            // InternalCls.g:965:5: lv_left_0_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getLeftAssociationEndParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_left_0_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralizationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getIsaKeyword_1());
            		
            // InternalCls.g:986:3: ( (lv_right_2_0= ruleAssociationEnd ) )
            // InternalCls.g:987:4: (lv_right_2_0= ruleAssociationEnd )
            {
            // InternalCls.g:987:4: (lv_right_2_0= ruleAssociationEnd )
            // InternalCls.g:988:5: lv_right_2_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getRightAssociationEndParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralizationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
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
    // InternalCls.g:1009:1: entryRuleImplementation returns [EObject current=null] : iv_ruleImplementation= ruleImplementation EOF ;
    public final EObject entryRuleImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementation = null;


        try {
            // InternalCls.g:1009:55: (iv_ruleImplementation= ruleImplementation EOF )
            // InternalCls.g:1010:2: iv_ruleImplementation= ruleImplementation EOF
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
    // InternalCls.g:1016:1: ruleImplementation returns [EObject current=null] : ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleAssociationEnd ) ) ) ;
    public final EObject ruleImplementation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1022:2: ( ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleAssociationEnd ) ) ) )
            // InternalCls.g:1023:2: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleAssociationEnd ) ) )
            {
            // InternalCls.g:1023:2: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleAssociationEnd ) ) )
            // InternalCls.g:1024:3: ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'impl' ( (lv_right_2_0= ruleAssociationEnd ) )
            {
            // InternalCls.g:1024:3: ( (lv_left_0_0= ruleAssociationEnd ) )
            // InternalCls.g:1025:4: (lv_left_0_0= ruleAssociationEnd )
            {
            // InternalCls.g:1025:4: (lv_left_0_0= ruleAssociationEnd )
            // InternalCls.g:1026:5: lv_left_0_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getImplementationAccess().getLeftAssociationEndParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_left_0_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplementationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementationAccess().getImplKeyword_1());
            		
            // InternalCls.g:1047:3: ( (lv_right_2_0= ruleAssociationEnd ) )
            // InternalCls.g:1048:4: (lv_right_2_0= ruleAssociationEnd )
            {
            // InternalCls.g:1048:4: (lv_right_2_0= ruleAssociationEnd )
            // InternalCls.g:1049:5: lv_right_2_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getImplementationAccess().getRightAssociationEndParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplementationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
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
    // InternalCls.g:1070:1: entryRuleCommentLink returns [EObject current=null] : iv_ruleCommentLink= ruleCommentLink EOF ;
    public final EObject entryRuleCommentLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentLink = null;


        try {
            // InternalCls.g:1070:52: (iv_ruleCommentLink= ruleCommentLink EOF )
            // InternalCls.g:1071:2: iv_ruleCommentLink= ruleCommentLink EOF
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
    // InternalCls.g:1077:1: ruleCommentLink returns [EObject current=null] : ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( (lv_comment_2_0= ruleComment ) ) ) ;
    public final EObject ruleCommentLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1083:2: ( ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( (lv_comment_2_0= ruleComment ) ) ) )
            // InternalCls.g:1084:2: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( (lv_comment_2_0= ruleComment ) ) )
            {
            // InternalCls.g:1084:2: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( (lv_comment_2_0= ruleComment ) ) )
            // InternalCls.g:1085:3: ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( (lv_comment_2_0= ruleComment ) )
            {
            // InternalCls.g:1085:3: ( (lv_left_0_0= ruleAssociationEnd ) )
            // InternalCls.g:1086:4: (lv_left_0_0= ruleAssociationEnd )
            {
            // InternalCls.g:1086:4: (lv_left_0_0= ruleAssociationEnd )
            // InternalCls.g:1087:5: lv_left_0_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getCommentLinkAccess().getLeftAssociationEndParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_left_0_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentLinkRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentLinkAccess().getHyphenMinusKeyword_1());
            		
            // InternalCls.g:1108:3: ( (lv_comment_2_0= ruleComment ) )
            // InternalCls.g:1109:4: (lv_comment_2_0= ruleComment )
            {
            // InternalCls.g:1109:4: (lv_comment_2_0= ruleComment )
            // InternalCls.g:1110:5: lv_comment_2_0= ruleComment
            {

            					newCompositeNode(grammarAccess.getCommentLinkAccess().getCommentCommentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_comment_2_0=ruleComment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentLinkRule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_2_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.Comment");
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
    // InternalCls.g:1131:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalCls.g:1131:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalCls.g:1132:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalCls.g:1138:1: ruleAssociation returns [EObject current=null] : ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_comment_4_0= ruleComment ) )? ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_cardinality_3_0 = null;

        EObject lv_comment_4_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1144:2: ( ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_comment_4_0= ruleComment ) )? ) )
            // InternalCls.g:1145:2: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_comment_4_0= ruleComment ) )? )
            {
            // InternalCls.g:1145:2: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_comment_4_0= ruleComment ) )? )
            // InternalCls.g:1146:3: ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_comment_4_0= ruleComment ) )?
            {
            // InternalCls.g:1146:3: ( (lv_left_0_0= ruleAssociationEnd ) )
            // InternalCls.g:1147:4: (lv_left_0_0= ruleAssociationEnd )
            {
            // InternalCls.g:1147:4: (lv_left_0_0= ruleAssociationEnd )
            // InternalCls.g:1148:5: lv_left_0_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getLeftAssociationEndParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_left_0_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1());
            		
            // InternalCls.g:1169:3: ( (lv_right_2_0= ruleAssociationEnd ) )
            // InternalCls.g:1170:4: (lv_right_2_0= ruleAssociationEnd )
            {
            // InternalCls.g:1170:4: (lv_right_2_0= ruleAssociationEnd )
            // InternalCls.g:1171:5: lv_right_2_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getRightAssociationEndParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_right_2_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCls.g:1188:3: ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCls.g:1189:4: (lv_cardinality_3_0= ruleConnectorCardinalitiy )
                    {
                    // InternalCls.g:1189:4: (lv_cardinality_3_0= ruleConnectorCardinalitiy )
                    // InternalCls.g:1190:5: lv_cardinality_3_0= ruleConnectorCardinalitiy
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getCardinalityConnectorCardinalitiyParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_cardinality_3_0=ruleConnectorCardinalitiy();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_3_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.ConnectorCardinalitiy");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1207:3: ( (lv_comment_4_0= ruleComment ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:1208:4: (lv_comment_4_0= ruleComment )
                    {
                    // InternalCls.g:1208:4: (lv_comment_4_0= ruleComment )
                    // InternalCls.g:1209:5: lv_comment_4_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getCommentCommentParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comment_4_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_4_0,
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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalCls.g:1230:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalCls.g:1230:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalCls.g:1231:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
            {
             newCompositeNode(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationEnd=ruleAssociationEnd();

            state._fsp--;

             current =iv_ruleAssociationEnd; 
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
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalCls.g:1237:1: ruleAssociationEnd returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCls.g:1243:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCls.g:1244:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCls.g:1244:2: ( (otherlv_0= RULE_ID ) )
            // InternalCls.g:1245:3: (otherlv_0= RULE_ID )
            {
            // InternalCls.g:1245:3: (otherlv_0= RULE_ID )
            // InternalCls.g:1246:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAssociationEndRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getAssociationEndAccess().getTypeClassNameCrossReference_0());
            			

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
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleConnectorLabel"
    // InternalCls.g:1260:1: entryRuleConnectorLabel returns [EObject current=null] : iv_ruleConnectorLabel= ruleConnectorLabel EOF ;
    public final EObject entryRuleConnectorLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorLabel = null;


        try {
            // InternalCls.g:1260:55: (iv_ruleConnectorLabel= ruleConnectorLabel EOF )
            // InternalCls.g:1261:2: iv_ruleConnectorLabel= ruleConnectorLabel EOF
            {
             newCompositeNode(grammarAccess.getConnectorLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorLabel=ruleConnectorLabel();

            state._fsp--;

             current =iv_ruleConnectorLabel; 
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
    // $ANTLR end "entryRuleConnectorLabel"


    // $ANTLR start "ruleConnectorLabel"
    // InternalCls.g:1267:1: ruleConnectorLabel returns [EObject current=null] : ( ( (lv_label_0_1= RULE_ID | lv_label_0_2= RULE_STRING ) ) ) ;
    public final EObject ruleConnectorLabel() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_1=null;
        Token lv_label_0_2=null;


        	enterRule();

        try {
            // InternalCls.g:1273:2: ( ( ( (lv_label_0_1= RULE_ID | lv_label_0_2= RULE_STRING ) ) ) )
            // InternalCls.g:1274:2: ( ( (lv_label_0_1= RULE_ID | lv_label_0_2= RULE_STRING ) ) )
            {
            // InternalCls.g:1274:2: ( ( (lv_label_0_1= RULE_ID | lv_label_0_2= RULE_STRING ) ) )
            // InternalCls.g:1275:3: ( (lv_label_0_1= RULE_ID | lv_label_0_2= RULE_STRING ) )
            {
            // InternalCls.g:1275:3: ( (lv_label_0_1= RULE_ID | lv_label_0_2= RULE_STRING ) )
            // InternalCls.g:1276:4: (lv_label_0_1= RULE_ID | lv_label_0_2= RULE_STRING )
            {
            // InternalCls.g:1276:4: (lv_label_0_1= RULE_ID | lv_label_0_2= RULE_STRING )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_STRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCls.g:1277:5: lv_label_0_1= RULE_ID
                    {
                    lv_label_0_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_label_0_1, grammarAccess.getConnectorLabelAccess().getLabelIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConnectorLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"label",
                    						lv_label_0_1,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }
                    break;
                case 2 :
                    // InternalCls.g:1292:5: lv_label_0_2= RULE_STRING
                    {
                    lv_label_0_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_label_0_2, grammarAccess.getConnectorLabelAccess().getLabelSTRINGTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConnectorLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"label",
                    						lv_label_0_2,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }
                    break;

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
    // $ANTLR end "ruleConnectorLabel"


    // $ANTLR start "entryRuleConnectorCardinalitiy"
    // InternalCls.g:1312:1: entryRuleConnectorCardinalitiy returns [EObject current=null] : iv_ruleConnectorCardinalitiy= ruleConnectorCardinalitiy EOF ;
    public final EObject entryRuleConnectorCardinalitiy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorCardinalitiy = null;


        try {
            // InternalCls.g:1312:62: (iv_ruleConnectorCardinalitiy= ruleConnectorCardinalitiy EOF )
            // InternalCls.g:1313:2: iv_ruleConnectorCardinalitiy= ruleConnectorCardinalitiy EOF
            {
             newCompositeNode(grammarAccess.getConnectorCardinalitiyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorCardinalitiy=ruleConnectorCardinalitiy();

            state._fsp--;

             current =iv_ruleConnectorCardinalitiy; 
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
    // $ANTLR end "entryRuleConnectorCardinalitiy"


    // $ANTLR start "ruleConnectorCardinalitiy"
    // InternalCls.g:1319:1: ruleConnectorCardinalitiy returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_left_2_0= ruleCardinality ) )? (otherlv_3= '|' ( (lv_right_4_0= ruleCardinality ) )? ) (otherlv_5= '|' ( (lv_label_6_0= ruleConnectorLabel ) )? ( ( (lv_direction_7_1= '<' | lv_direction_7_2= '>' ) ) )? )? otherlv_8= ']' ) ;
    public final EObject ruleConnectorCardinalitiy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_direction_7_1=null;
        Token lv_direction_7_2=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_left_2_0 = null;

        AntlrDatatypeRuleToken lv_right_4_0 = null;

        EObject lv_label_6_0 = null;



        	enterRule();

        try {
            // InternalCls.g:1325:2: ( ( () otherlv_1= '[' ( (lv_left_2_0= ruleCardinality ) )? (otherlv_3= '|' ( (lv_right_4_0= ruleCardinality ) )? ) (otherlv_5= '|' ( (lv_label_6_0= ruleConnectorLabel ) )? ( ( (lv_direction_7_1= '<' | lv_direction_7_2= '>' ) ) )? )? otherlv_8= ']' ) )
            // InternalCls.g:1326:2: ( () otherlv_1= '[' ( (lv_left_2_0= ruleCardinality ) )? (otherlv_3= '|' ( (lv_right_4_0= ruleCardinality ) )? ) (otherlv_5= '|' ( (lv_label_6_0= ruleConnectorLabel ) )? ( ( (lv_direction_7_1= '<' | lv_direction_7_2= '>' ) ) )? )? otherlv_8= ']' )
            {
            // InternalCls.g:1326:2: ( () otherlv_1= '[' ( (lv_left_2_0= ruleCardinality ) )? (otherlv_3= '|' ( (lv_right_4_0= ruleCardinality ) )? ) (otherlv_5= '|' ( (lv_label_6_0= ruleConnectorLabel ) )? ( ( (lv_direction_7_1= '<' | lv_direction_7_2= '>' ) ) )? )? otherlv_8= ']' )
            // InternalCls.g:1327:3: () otherlv_1= '[' ( (lv_left_2_0= ruleCardinality ) )? (otherlv_3= '|' ( (lv_right_4_0= ruleCardinality ) )? ) (otherlv_5= '|' ( (lv_label_6_0= ruleConnectorLabel ) )? ( ( (lv_direction_7_1= '<' | lv_direction_7_2= '>' ) ) )? )? otherlv_8= ']'
            {
            // InternalCls.g:1327:3: ()
            // InternalCls.g:1328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectorCardinalitiyAccess().getConnectorCardinalitiyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectorCardinalitiyAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalCls.g:1338:3: ( (lv_left_2_0= ruleCardinality ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT||LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:1339:4: (lv_left_2_0= ruleCardinality )
                    {
                    // InternalCls.g:1339:4: (lv_left_2_0= ruleCardinality )
                    // InternalCls.g:1340:5: lv_left_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getConnectorCardinalitiyAccess().getLeftCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_left_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectorCardinalitiyRule());
                    					}
                    					set(
                    						current,
                    						"left",
                    						lv_left_2_0,
                    						"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCls.g:1357:3: (otherlv_3= '|' ( (lv_right_4_0= ruleCardinality ) )? )
            // InternalCls.g:1358:4: otherlv_3= '|' ( (lv_right_4_0= ruleCardinality ) )?
            {
            otherlv_3=(Token)match(input,29,FOLLOW_28); 

            				newLeafNode(otherlv_3, grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_3_0());
            			
            // InternalCls.g:1362:4: ( (lv_right_4_0= ruleCardinality ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT||LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:1363:5: (lv_right_4_0= ruleCardinality )
                    {
                    // InternalCls.g:1363:5: (lv_right_4_0= ruleCardinality )
                    // InternalCls.g:1364:6: lv_right_4_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getConnectorCardinalitiyAccess().getRightCardinalityParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_right_4_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectorCardinalitiyRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_4_0,
                    							"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }


            }

            // InternalCls.g:1382:3: (otherlv_5= '|' ( (lv_label_6_0= ruleConnectorLabel ) )? ( ( (lv_direction_7_1= '<' | lv_direction_7_2= '>' ) ) )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCls.g:1383:4: otherlv_5= '|' ( (lv_label_6_0= ruleConnectorLabel ) )? ( ( (lv_direction_7_1= '<' | lv_direction_7_2= '>' ) ) )?
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_4_0());
                    			
                    // InternalCls.g:1387:4: ( (lv_label_6_0= ruleConnectorLabel ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalCls.g:1388:5: (lv_label_6_0= ruleConnectorLabel )
                            {
                            // InternalCls.g:1388:5: (lv_label_6_0= ruleConnectorLabel )
                            // InternalCls.g:1389:6: lv_label_6_0= ruleConnectorLabel
                            {

                            						newCompositeNode(grammarAccess.getConnectorCardinalitiyAccess().getLabelConnectorLabelParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_31);
                            lv_label_6_0=ruleConnectorLabel();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConnectorCardinalitiyRule());
                            						}
                            						set(
                            							current,
                            							"label",
                            							lv_label_6_0,
                            							"de.cooperateproject.modeling.textual.cls.Cls.ConnectorLabel");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalCls.g:1406:4: ( ( (lv_direction_7_1= '<' | lv_direction_7_2= '>' ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=30 && LA29_0<=31)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalCls.g:1407:5: ( (lv_direction_7_1= '<' | lv_direction_7_2= '>' ) )
                            {
                            // InternalCls.g:1407:5: ( (lv_direction_7_1= '<' | lv_direction_7_2= '>' ) )
                            // InternalCls.g:1408:6: (lv_direction_7_1= '<' | lv_direction_7_2= '>' )
                            {
                            // InternalCls.g:1408:6: (lv_direction_7_1= '<' | lv_direction_7_2= '>' )
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==30) ) {
                                alt28=1;
                            }
                            else if ( (LA28_0==31) ) {
                                alt28=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 28, 0, input);

                                throw nvae;
                            }
                            switch (alt28) {
                                case 1 :
                                    // InternalCls.g:1409:7: lv_direction_7_1= '<'
                                    {
                                    lv_direction_7_1=(Token)match(input,30,FOLLOW_32); 

                                    							newLeafNode(lv_direction_7_1, grammarAccess.getConnectorCardinalitiyAccess().getDirectionLessThanSignKeyword_4_2_0_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getConnectorCardinalitiyRule());
                                    							}
                                    							setWithLastConsumed(current, "direction", lv_direction_7_1, null);
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalCls.g:1420:7: lv_direction_7_2= '>'
                                    {
                                    lv_direction_7_2=(Token)match(input,31,FOLLOW_32); 

                                    							newLeafNode(lv_direction_7_2, grammarAccess.getConnectorCardinalitiyAccess().getDirectionGreaterThanSignKeyword_4_2_0_1());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getConnectorCardinalitiyRule());
                                    							}
                                    							setWithLastConsumed(current, "direction", lv_direction_7_2, null);
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectorCardinalitiyAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleConnectorCardinalitiy"


    // $ANTLR start "entryRuleCardinality"
    // InternalCls.g:1442:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalCls.g:1442:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalCls.g:1443:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality.getText(); 
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
    // InternalCls.g:1449:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) ) ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalCls.g:1455:2: ( (kw= '*' | (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) ) ) )
            // InternalCls.g:1456:2: (kw= '*' | (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) ) )
            {
            // InternalCls.g:1456:2: (kw= '*' | (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_INT) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalCls.g:1457:3: kw= '*'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCls.g:1463:3: (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) )
                    {
                    // InternalCls.g:1463:3: (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) )
                    // InternalCls.g:1464:4: this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT )
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_33); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,34,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_1());
                    			
                    // InternalCls.g:1476:4: (kw= '*' | this_INT_4= RULE_INT )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==33) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==RULE_INT) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalCls.g:1477:5: kw= '*'
                            {
                            kw=(Token)match(input,33,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCls.g:1483:5: this_INT_4= RULE_INT
                            {
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                            					current.merge(this_INT_4);
                            				

                            					newLeafNode(this_INT_4, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_2_1());
                            				

                            }
                            break;

                    }


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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleComment"
    // InternalCls.g:1496:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalCls.g:1496:48: (iv_ruleComment= ruleComment EOF )
            // InternalCls.g:1497:2: iv_ruleComment= ruleComment EOF
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
    // InternalCls.g:1503:1: ruleComment returns [EObject current=null] : ( () otherlv_1= 'note[' ( (lv_comment_2_0= RULE_STRING ) ) otherlv_3= ']' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCls.g:1509:2: ( ( () otherlv_1= 'note[' ( (lv_comment_2_0= RULE_STRING ) ) otherlv_3= ']' ) )
            // InternalCls.g:1510:2: ( () otherlv_1= 'note[' ( (lv_comment_2_0= RULE_STRING ) ) otherlv_3= ']' )
            {
            // InternalCls.g:1510:2: ( () otherlv_1= 'note[' ( (lv_comment_2_0= RULE_STRING ) ) otherlv_3= ']' )
            // InternalCls.g:1511:3: () otherlv_1= 'note[' ( (lv_comment_2_0= RULE_STRING ) ) otherlv_3= ']'
            {
            // InternalCls.g:1511:3: ()
            // InternalCls.g:1512:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommentAccess().getCommentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getNoteKeyword_1());
            		
            // InternalCls.g:1522:3: ( (lv_comment_2_0= RULE_STRING ) )
            // InternalCls.g:1523:4: (lv_comment_2_0= RULE_STRING )
            {
            // InternalCls.g:1523:4: (lv_comment_2_0= RULE_STRING )
            // InternalCls.g:1524:5: lv_comment_2_0= RULE_STRING
            {
            lv_comment_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCommentAccess().getRightSquareBracketKeyword_3());
            		

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


    // $ANTLR start "ruleVisibility"
    // InternalCls.g:1548:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '~' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '+' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCls.g:1554:2: ( ( (enumLiteral_0= '~' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '+' ) ) )
            // InternalCls.g:1555:2: ( (enumLiteral_0= '~' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '+' ) )
            {
            // InternalCls.g:1555:2: ( (enumLiteral_0= '~' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '+' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt33=1;
                }
                break;
            case 27:
                {
                alt33=2;
                }
                break;
            case 37:
                {
                alt33=3;
                }
                break;
            case 38:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalCls.g:1556:3: (enumLiteral_0= '~' )
                    {
                    // InternalCls.g:1556:3: (enumLiteral_0= '~' )
                    // InternalCls.g:1557:4: enumLiteral_0= '~'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1564:3: (enumLiteral_1= '-' )
                    {
                    // InternalCls.g:1564:3: (enumLiteral_1= '-' )
                    // InternalCls.g:1565:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1572:3: (enumLiteral_2= '#' )
                    {
                    // InternalCls.g:1572:3: (enumLiteral_2= '#' )
                    // InternalCls.g:1573:4: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1580:3: (enumLiteral_3= '+' )
                    {
                    // InternalCls.g:1580:3: (enumLiteral_3= '+' )
                    // InternalCls.g:1581:4: enumLiteral_3= '+'
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


    // $ANTLR start "ruleDataTypeEnum"
    // InternalCls.g:1591:1: ruleDataTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) ) ;
    public final Enumerator ruleDataTypeEnum() throws RecognitionException {
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
            // InternalCls.g:1597:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) ) )
            // InternalCls.g:1598:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) )
            {
            // InternalCls.g:1598:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'char' ) | (enumLiteral_5= 'byte' ) | (enumLiteral_6= 'short' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'float' ) )
            int alt34=9;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt34=1;
                }
                break;
            case 40:
                {
                alt34=2;
                }
                break;
            case 41:
                {
                alt34=3;
                }
                break;
            case 42:
                {
                alt34=4;
                }
                break;
            case 43:
                {
                alt34=5;
                }
                break;
            case 44:
                {
                alt34=6;
                }
                break;
            case 45:
                {
                alt34=7;
                }
                break;
            case 46:
                {
                alt34=8;
                }
                break;
            case 47:
                {
                alt34=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalCls.g:1599:3: (enumLiteral_0= 'string' )
                    {
                    // InternalCls.g:1599:3: (enumLiteral_0= 'string' )
                    // InternalCls.g:1600:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeEnumAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeEnumAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1607:3: (enumLiteral_1= 'int' )
                    {
                    // InternalCls.g:1607:3: (enumLiteral_1= 'int' )
                    // InternalCls.g:1608:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeEnumAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeEnumAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1615:3: (enumLiteral_2= 'double' )
                    {
                    // InternalCls.g:1615:3: (enumLiteral_2= 'double' )
                    // InternalCls.g:1616:4: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeEnumAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeEnumAccess().getDOUBLEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1623:3: (enumLiteral_3= 'boolean' )
                    {
                    // InternalCls.g:1623:3: (enumLiteral_3= 'boolean' )
                    // InternalCls.g:1624:4: enumLiteral_3= 'boolean'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1631:3: (enumLiteral_4= 'char' )
                    {
                    // InternalCls.g:1631:3: (enumLiteral_4= 'char' )
                    // InternalCls.g:1632:4: enumLiteral_4= 'char'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeEnumAccess().getCHAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeEnumAccess().getCHAREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:1639:3: (enumLiteral_5= 'byte' )
                    {
                    // InternalCls.g:1639:3: (enumLiteral_5= 'byte' )
                    // InternalCls.g:1640:4: enumLiteral_5= 'byte'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeEnumAccess().getBYTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeEnumAccess().getBYTEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:1647:3: (enumLiteral_6= 'short' )
                    {
                    // InternalCls.g:1647:3: (enumLiteral_6= 'short' )
                    // InternalCls.g:1648:4: enumLiteral_6= 'short'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeEnumAccess().getSHORTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeEnumAccess().getSHORTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCls.g:1655:3: (enumLiteral_7= 'long' )
                    {
                    // InternalCls.g:1655:3: (enumLiteral_7= 'long' )
                    // InternalCls.g:1656:4: enumLiteral_7= 'long'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeEnumAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeEnumAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalCls.g:1663:3: (enumLiteral_8= 'float' )
                    {
                    // InternalCls.g:1663:3: (enumLiteral_8= 'float' )
                    // InternalCls.g:1664:4: enumLiteral_8= 'float'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeEnumAccess().getFLOATEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDataTypeEnumAccess().getFLOATEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleDataTypeEnum"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\7\4\1\26\2\uffff";
    static final String dfa_3s = "\1\46\5\25\1\4\1\27\2\uffff";
    static final String dfa_4s = "\10\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\16\uffff\1\10\1\5\1\6\5\uffff\1\2\10\uffff\1\1\1\3\1\4",
            "\1\7\16\uffff\1\10\1\5\1\6",
            "\1\7\16\uffff\1\10\1\5\1\6",
            "\1\7\16\uffff\1\10\1\5\1\6",
            "\1\7\16\uffff\1\10\1\5\1\6",
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
            return "581:2: (this_Attribute_0= ruleAttribute | this_Methode_1= ruleMethode )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000087010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000070083A0010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000FF8000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000380010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000007009300010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007009310010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007008300010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000810000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000220000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000320000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000001C0000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});

}