package de.cooperateproject.uml.xtext.clazz.parser.antlr.internal; 

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
import de.cooperateproject.uml.xtext.clazz.services.UmlDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUmlDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@startclass'", "'@endclass'", "'datatype'", "'class'", "'interface'", "'{'", "','", "'}'", "' as '", "'abstract'", "'extends'", "'implements'", "'static'", "'final'", "':'", "'('", "')'", "'isa'", "'-'", "'['", "'|'", "'<'", "'>'", "']'", "'*'", "'..'", "'note['", "'#'", "'~'", "'+'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUmlDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUmlDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUmlDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g"; }



     	private UmlDslGrammarAccess grammarAccess;
     	
        public InternalUmlDslParser(TokenStream input, UmlDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ClassDiagram";	
       	}
       	
       	@Override
       	protected UmlDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleClassDiagram"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:68:1: entryRuleClassDiagram returns [EObject current=null] : iv_ruleClassDiagram= ruleClassDiagram EOF ;
    public final EObject entryRuleClassDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDiagram = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:69:2: (iv_ruleClassDiagram= ruleClassDiagram EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:70:2: iv_ruleClassDiagram= ruleClassDiagram EOF
            {
             newCompositeNode(grammarAccess.getClassDiagramRule()); 
            pushFollow(FOLLOW_ruleClassDiagram_in_entryRuleClassDiagram75);
            iv_ruleClassDiagram=ruleClassDiagram();

            state._fsp--;

             current =iv_ruleClassDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDiagram85); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:77:1: ruleClassDiagram returns [EObject current=null] : ( () otherlv_1= '@startclass' ( (lv_elements_2_0= ruleElement ) )* otherlv_3= '@endclass' ) ;
    public final EObject ruleClassDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:80:28: ( ( () otherlv_1= '@startclass' ( (lv_elements_2_0= ruleElement ) )* otherlv_3= '@endclass' ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:81:1: ( () otherlv_1= '@startclass' ( (lv_elements_2_0= ruleElement ) )* otherlv_3= '@endclass' )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:81:1: ( () otherlv_1= '@startclass' ( (lv_elements_2_0= ruleElement ) )* otherlv_3= '@endclass' )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:81:2: () otherlv_1= '@startclass' ( (lv_elements_2_0= ruleElement ) )* otherlv_3= '@endclass'
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:81:2: ()
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClassDiagramAccess().getClassDiagramAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleClassDiagram131); 

                	newLeafNode(otherlv_1, grammarAccess.getClassDiagramAccess().getStartclassKeyword_1());
                
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:91:1: ( (lv_elements_2_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=15)||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:92:1: (lv_elements_2_0= ruleElement )
            	    {
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:92:1: (lv_elements_2_0= ruleElement )
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:93:3: lv_elements_2_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassDiagramAccess().getElementsElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleClassDiagram152);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleClassDiagram165); 

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


    // $ANTLR start "entryRuleElement"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:121:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:122:2: (iv_ruleElement= ruleElement EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:123:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement201);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement211); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:130:1: ruleElement returns [EObject current=null] : (this_ClassDef_0= ruleClassDef | this_Class_1= ruleClass | this_DataType_2= ruleDataType | this_Connector_3= ruleConnector ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDef_0 = null;

        EObject this_Class_1 = null;

        EObject this_DataType_2 = null;

        EObject this_Connector_3 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:133:28: ( (this_ClassDef_0= ruleClassDef | this_Class_1= ruleClass | this_DataType_2= ruleDataType | this_Connector_3= ruleConnector ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:134:1: (this_ClassDef_0= ruleClassDef | this_Class_1= ruleClass | this_DataType_2= ruleDataType | this_Connector_3= ruleConnector )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:134:1: (this_ClassDef_0= ruleClassDef | this_Class_1= ruleClass | this_DataType_2= ruleDataType | this_Connector_3= ruleConnector )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==16||(LA2_3>=21 && LA2_3<=22)) ) {
                    alt2=2;
                }
                else if ( ((LA2_3>=28 && LA2_3<=29)) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:135:5: this_ClassDef_0= ruleClassDef
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getClassDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClassDef_in_ruleElement258);
                    this_ClassDef_0=ruleClassDef();

                    state._fsp--;

                     
                            current = this_ClassDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:145:5: this_Class_1= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getClassParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClass_in_ruleElement285);
                    this_Class_1=ruleClass();

                    state._fsp--;

                     
                            current = this_Class_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:155:5: this_DataType_2= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getDataTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleElement312);
                    this_DataType_2=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:165:5: this_Connector_3= ruleConnector
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getConnectorParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleConnector_in_ruleElement339);
                    this_Connector_3=ruleConnector();

                    state._fsp--;

                     
                            current = this_Connector_3; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDataType"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:181:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:182:2: (iv_ruleDataType= ruleDataType EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:183:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType374);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType384); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:190:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:193:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:194:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:194:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:194:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDataType421); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:198:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:199:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:199:1: (lv_name_1_0= RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:200:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType438); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleClassDef"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:226:1: entryRuleClassDef returns [EObject current=null] : iv_ruleClassDef= ruleClassDef EOF ;
    public final EObject entryRuleClassDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDef = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:227:2: (iv_ruleClassDef= ruleClassDef EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:228:2: iv_ruleClassDef= ruleClassDef EOF
            {
             newCompositeNode(grammarAccess.getClassDefRule()); 
            pushFollow(FOLLOW_ruleClassDef_in_entryRuleClassDef481);
            iv_ruleClassDef=ruleClassDef();

            state._fsp--;

             current =iv_ruleClassDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDef491); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:235:1: ruleClassDef returns [EObject current=null] : ( (otherlv_0= 'class' | otherlv_1= 'interface' ) otherlv_2= '{' ( (lv_classes_3_0= ruleClassName ) ) (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )* otherlv_6= '}' ) ;
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
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:238:28: ( ( (otherlv_0= 'class' | otherlv_1= 'interface' ) otherlv_2= '{' ( (lv_classes_3_0= ruleClassName ) ) (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )* otherlv_6= '}' ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:239:1: ( (otherlv_0= 'class' | otherlv_1= 'interface' ) otherlv_2= '{' ( (lv_classes_3_0= ruleClassName ) ) (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )* otherlv_6= '}' )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:239:1: ( (otherlv_0= 'class' | otherlv_1= 'interface' ) otherlv_2= '{' ( (lv_classes_3_0= ruleClassName ) ) (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )* otherlv_6= '}' )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:239:2: (otherlv_0= 'class' | otherlv_1= 'interface' ) otherlv_2= '{' ( (lv_classes_3_0= ruleClassName ) ) (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )* otherlv_6= '}'
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:239:2: (otherlv_0= 'class' | otherlv_1= 'interface' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:239:4: otherlv_0= 'class'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleClassDef529); 

                        	newLeafNode(otherlv_0, grammarAccess.getClassDefAccess().getClassKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:244:7: otherlv_1= 'interface'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleClassDef547); 

                        	newLeafNode(otherlv_1, grammarAccess.getClassDefAccess().getInterfaceKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleClassDef560); 

                	newLeafNode(otherlv_2, grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:252:1: ( (lv_classes_3_0= ruleClassName ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:253:1: (lv_classes_3_0= ruleClassName )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:253:1: (lv_classes_3_0= ruleClassName )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:254:3: lv_classes_3_0= ruleClassName
            {
             
            	        newCompositeNode(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleClassName_in_ruleClassDef581);
            lv_classes_3_0=ruleClassName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDefRule());
            	        }
                   		add(
                   			current, 
                   			"classes",
                    		lv_classes_3_0, 
                    		"ClassName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:270:2: (otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:270:4: otherlv_4= ',' ( (lv_classes_5_0= ruleClassName ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleClassDef594); 

            	        	newLeafNode(otherlv_4, grammarAccess.getClassDefAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:274:1: ( (lv_classes_5_0= ruleClassName ) )
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:275:1: (lv_classes_5_0= ruleClassName )
            	    {
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:275:1: (lv_classes_5_0= ruleClassName )
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:276:3: lv_classes_5_0= ruleClassName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassName_in_ruleClassDef615);
            	    lv_classes_5_0=ruleClassName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classes",
            	            		lv_classes_5_0, 
            	            		"ClassName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleClassDef629); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:304:1: entryRuleClassName returns [EObject current=null] : iv_ruleClassName= ruleClassName EOF ;
    public final EObject entryRuleClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassName = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:305:2: (iv_ruleClassName= ruleClassName EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:306:2: iv_ruleClassName= ruleClassName EOF
            {
             newCompositeNode(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_ruleClassName_in_entryRuleClassName665);
            iv_ruleClassName=ruleClassName();

            state._fsp--;

             current =iv_ruleClassName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassName675); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:313:1: ruleClassName returns [EObject current=null] : this_Name_0= ruleName ;
    public final EObject ruleClassName() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:316:28: (this_Name_0= ruleName )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:318:5: this_Name_0= ruleName
            {
             
                    newCompositeNode(grammarAccess.getClassNameAccess().getNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleName_in_ruleClassName721);
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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:334:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:335:2: (iv_ruleName= ruleName EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:336:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName755);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName765); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:343:1: ruleName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_longname_1_1=null;
        Token lv_longname_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:346:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:347:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:347:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==19) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||(LA6_1>=17 && LA6_1<=18)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
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
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:347:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:347:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:348:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:348:1: (lv_name_0_0= RULE_ID )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:349:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName807); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getNameAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:366:6: ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:366:6: ( ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:366:7: ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) ) otherlv_2= ' as ' ( (lv_name_3_0= RULE_ID ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:366:7: ( ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:367:1: ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:367:1: ( (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:368:1: (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:368:1: (lv_longname_1_1= RULE_STRING | lv_longname_1_2= RULE_ID )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_STRING) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==RULE_ID) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:369:3: lv_longname_1_1= RULE_STRING
                            {
                            lv_longname_1_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleName838); 

                            			newLeafNode(lv_longname_1_1, grammarAccess.getNameAccess().getLongnameSTRINGTerminalRuleCall_1_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNameRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longname",
                                    		lv_longname_1_1, 
                                    		"STRING");
                            	    

                            }
                            break;
                        case 2 :
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:384:8: lv_longname_1_2= RULE_ID
                            {
                            lv_longname_1_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName858); 

                            			newLeafNode(lv_longname_1_2, grammarAccess.getNameAccess().getLongnameIDTerminalRuleCall_1_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNameRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longname",
                                    		lv_longname_1_2, 
                                    		"ID");
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleName878); 

                        	newLeafNode(otherlv_2, grammarAccess.getNameAccess().getAsKeyword_1_1());
                        
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:406:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:407:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:407:1: (lv_name_3_0= RULE_ID )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:408:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName895); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:432:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:433:2: (iv_ruleClass= ruleClass EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:434:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass937);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass947); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:441:1: ruleClass returns [EObject current=null] : ( (otherlv_0= 'abstract' )? ( (otherlv_1= RULE_ID ) ) ( (lv_inheritance_2_0= ruleInheritance ) )? otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_inheritance_2_0 = null;

        EObject lv_members_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:444:28: ( ( (otherlv_0= 'abstract' )? ( (otherlv_1= RULE_ID ) ) ( (lv_inheritance_2_0= ruleInheritance ) )? otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:445:1: ( (otherlv_0= 'abstract' )? ( (otherlv_1= RULE_ID ) ) ( (lv_inheritance_2_0= ruleInheritance ) )? otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:445:1: ( (otherlv_0= 'abstract' )? ( (otherlv_1= RULE_ID ) ) ( (lv_inheritance_2_0= ruleInheritance ) )? otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:445:2: (otherlv_0= 'abstract' )? ( (otherlv_1= RULE_ID ) ) ( (lv_inheritance_2_0= ruleInheritance ) )? otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}'
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:445:2: (otherlv_0= 'abstract' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:445:4: otherlv_0= 'abstract'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleClass985); 

                        	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getAbstractKeyword_0());
                        

                    }
                    break;

            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:449:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:450:1: (otherlv_1= RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:450:1: (otherlv_1= RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:451:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1007); 

            		newLeafNode(otherlv_1, grammarAccess.getClassAccess().getTypeClassNameCrossReference_1_0()); 
            	

            }


            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:462:2: ( (lv_inheritance_2_0= ruleInheritance ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:463:1: (lv_inheritance_2_0= ruleInheritance )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:463:1: (lv_inheritance_2_0= ruleInheritance )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:464:3: lv_inheritance_2_0= ruleInheritance
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getInheritanceInheritanceParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInheritance_in_ruleClass1028);
                    lv_inheritance_2_0=ruleInheritance();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	        }
                           		set(
                           			current, 
                           			"inheritance",
                            		lv_inheritance_2_0, 
                            		"Inheritance");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleClass1041); 

                	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:484:1: ( (lv_members_4_0= ruleMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==20||(LA9_0>=23 && LA9_0<=24)||LA9_0==29||(LA9_0>=38 && LA9_0<=40)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:485:1: (lv_members_4_0= ruleMember )
            	    {
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:485:1: (lv_members_4_0= ruleMember )
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:486:3: lv_members_4_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleClass1062);
            	    lv_members_4_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_4_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleClass1075); 

                	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleInheritance"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:514:1: entryRuleInheritance returns [EObject current=null] : iv_ruleInheritance= ruleInheritance EOF ;
    public final EObject entryRuleInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritance = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:515:2: (iv_ruleInheritance= ruleInheritance EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:516:2: iv_ruleInheritance= ruleInheritance EOF
            {
             newCompositeNode(grammarAccess.getInheritanceRule()); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance1111);
            iv_ruleInheritance=ruleInheritance();

            state._fsp--;

             current =iv_ruleInheritance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance1121); 

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
    // $ANTLR end "entryRuleInheritance"


    // $ANTLR start "ruleInheritance"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:523:1: ruleInheritance returns [EObject current=null] : ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'implements' ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleInheritance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:526:28: ( ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'implements' ( (otherlv_3= RULE_ID ) ) ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:527:1: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'implements' ( (otherlv_3= RULE_ID ) ) ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:527:1: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'implements' ( (otherlv_3= RULE_ID ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:527:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:527:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:527:4: otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleInheritance1159); 

                        	newLeafNode(otherlv_0, grammarAccess.getInheritanceAccess().getExtendsKeyword_0_0());
                        
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:531:1: ( (otherlv_1= RULE_ID ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:532:1: (otherlv_1= RULE_ID )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:532:1: (otherlv_1= RULE_ID )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:533:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInheritanceRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInheritance1179); 

                    		newLeafNode(otherlv_1, grammarAccess.getInheritanceAccess().getTypeClassNameCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:545:6: (otherlv_2= 'implements' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:545:6: (otherlv_2= 'implements' ( (otherlv_3= RULE_ID ) ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:545:8: otherlv_2= 'implements' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleInheritance1199); 

                        	newLeafNode(otherlv_2, grammarAccess.getInheritanceAccess().getImplementsKeyword_1_0());
                        
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:549:1: ( (otherlv_3= RULE_ID ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:550:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:550:1: (otherlv_3= RULE_ID )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:551:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInheritanceRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInheritance1219); 

                    		newLeafNode(otherlv_3, grammarAccess.getInheritanceAccess().getTypeClassNameCrossReference_1_1_0()); 
                    	

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
    // $ANTLR end "ruleInheritance"


    // $ANTLR start "entryRuleMember"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:570:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:571:2: (iv_ruleMember= ruleMember EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:572:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember1256);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember1266); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:579:1: ruleMember returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Methode_1= ruleMethode ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Methode_1 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:582:28: ( (this_Attribute_0= ruleAttribute | this_Methode_1= ruleMethode ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:583:1: (this_Attribute_0= ruleAttribute | this_Methode_1= ruleMethode )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:583:1: (this_Attribute_0= ruleAttribute | this_Methode_1= ruleMethode )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:584:5: this_Attribute_0= ruleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleMember1313);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;

                     
                            current = this_Attribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:594:5: this_Methode_1= ruleMethode
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getMethodeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMethode_in_ruleMember1340);
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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:610:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:611:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:612:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1375);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1385); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:619:1: ruleAttribute returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? (otherlv_1= 'static' )? (otherlv_2= 'final' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_visibility_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:622:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? (otherlv_1= 'static' )? (otherlv_2= 'final' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:623:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? (otherlv_1= 'static' )? (otherlv_2= 'final' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:623:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? (otherlv_1= 'static' )? (otherlv_2= 'final' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:623:2: ( (lv_visibility_0_0= ruleVisibility ) )? (otherlv_1= 'static' )? (otherlv_2= 'final' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:623:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29||(LA12_0>=38 && LA12_0<=40)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:624:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:624:1: (lv_visibility_0_0= ruleVisibility )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:625:3: lv_visibility_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibility_in_ruleAttribute1431);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"visibility",
                            		lv_visibility_0_0, 
                            		"Visibility");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:641:3: (otherlv_1= 'static' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:641:5: otherlv_1= 'static'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleAttribute1445); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getStaticKeyword_1());
                        

                    }
                    break;

            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:645:3: (otherlv_2= 'final' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:645:5: otherlv_2= 'final'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAttribute1460); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getFinalKeyword_2());
                        

                    }
                    break;

            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:649:3: ( (lv_name_3_0= RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:650:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:650:1: (lv_name_3_0= RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:651:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1479); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleAttribute1496); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
                
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:671:1: ( (otherlv_5= RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:672:1: (otherlv_5= RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:672:1: (otherlv_5= RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:673:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1516); 

            		newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_5_0()); 
            	

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:692:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:693:2: (iv_ruleMethode= ruleMethode EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:694:2: iv_ruleMethode= ruleMethode EOF
            {
             newCompositeNode(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_ruleMethode_in_entryRuleMethode1552);
            iv_ruleMethode=ruleMethode();

            state._fsp--;

             current =iv_ruleMethode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethode1562); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:701:1: ruleMethode returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? (otherlv_1= 'abstract' )? (otherlv_2= 'static' )? (otherlv_3= 'final' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? ) ;
    public final EObject ruleMethode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:704:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? (otherlv_1= 'abstract' )? (otherlv_2= 'static' )? (otherlv_3= 'final' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:705:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? (otherlv_1= 'abstract' )? (otherlv_2= 'static' )? (otherlv_3= 'final' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:705:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? (otherlv_1= 'abstract' )? (otherlv_2= 'static' )? (otherlv_3= 'final' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:705:2: ( (lv_visibility_0_0= ruleVisibility ) )? (otherlv_1= 'abstract' )? (otherlv_2= 'static' )? (otherlv_3= 'final' )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )?
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:705:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29||(LA15_0>=38 && LA15_0<=40)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:706:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:706:1: (lv_visibility_0_0= ruleVisibility )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:707:3: lv_visibility_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibility_in_ruleMethode1608);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodeRule());
                    	        }
                           		set(
                           			current, 
                           			"visibility",
                            		lv_visibility_0_0, 
                            		"Visibility");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:723:3: (otherlv_1= 'abstract' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:723:5: otherlv_1= 'abstract'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMethode1622); 

                        	newLeafNode(otherlv_1, grammarAccess.getMethodeAccess().getAbstractKeyword_1());
                        

                    }
                    break;

            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:727:3: (otherlv_2= 'static' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:727:5: otherlv_2= 'static'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleMethode1637); 

                        	newLeafNode(otherlv_2, grammarAccess.getMethodeAccess().getStaticKeyword_2());
                        

                    }
                    break;

            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:731:3: (otherlv_3= 'final' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:731:5: otherlv_3= 'final'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleMethode1652); 

                        	newLeafNode(otherlv_3, grammarAccess.getMethodeAccess().getFinalKeyword_3());
                        

                    }
                    break;

            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:735:3: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:736:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:736:1: (lv_name_4_0= RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:737:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethode1671); 

            			newLeafNode(lv_name_4_0, grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleMethode1688); 

                	newLeafNode(otherlv_5, grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_5());
                
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:757:1: ( ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=23 && LA20_0<=24)||LA20_0==29||(LA20_0>=38 && LA20_0<=40)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:757:2: ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )*
            	    {
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:757:2: ( (lv_attributes_6_0= ruleAttribute ) )
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:758:1: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:758:1: (lv_attributes_6_0= ruleAttribute )
            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:759:3: lv_attributes_6_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleMethode1710);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_6_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:775:2: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==17) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:775:4: otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleMethode1723); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getMethodeAccess().getCommaKeyword_6_1_0());
            	    	        
            	    	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:779:1: ( (lv_attributes_8_0= ruleAttribute ) )
            	    	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:780:1: (lv_attributes_8_0= ruleAttribute )
            	    	    {
            	    	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:780:1: (lv_attributes_8_0= ruleAttribute )
            	    	    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:781:3: lv_attributes_8_0= ruleAttribute
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAttribute_in_ruleMethode1744);
            	    	    lv_attributes_8_0=ruleAttribute();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getMethodeRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"attributes",
            	    	            		lv_attributes_8_0, 
            	    	            		"Attribute");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleMethode1760); 

                	newLeafNode(otherlv_9, grammarAccess.getMethodeAccess().getRightParenthesisKeyword_7());
                
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:801:1: (otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:801:3: otherlv_10= ':' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleMethode1773); 

                        	newLeafNode(otherlv_10, grammarAccess.getMethodeAccess().getColonKeyword_8_0());
                        
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:805:1: ( (otherlv_11= RULE_ID ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:806:1: (otherlv_11= RULE_ID )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:806:1: (otherlv_11= RULE_ID )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:807:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodeRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethode1793); 

                    		newLeafNode(otherlv_11, grammarAccess.getMethodeAccess().getTypeTypeCrossReference_8_1_0()); 
                    	

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:826:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:827:2: (iv_ruleConnector= ruleConnector EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:828:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector1831);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector1841); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:835:1: ruleConnector returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_Association_1 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:838:28: ( (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:839:1: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:839:1: (this_Generalization_0= ruleGeneralization | this_Association_1= ruleAssociation )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==28) ) {
                    alt22=1;
                }
                else if ( (LA22_1==29) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:840:5: this_Generalization_0= ruleGeneralization
                    {
                     
                            newCompositeNode(grammarAccess.getConnectorAccess().getGeneralizationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGeneralization_in_ruleConnector1888);
                    this_Generalization_0=ruleGeneralization();

                    state._fsp--;

                     
                            current = this_Generalization_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:850:5: this_Association_1= ruleAssociation
                    {
                     
                            newCompositeNode(grammarAccess.getConnectorAccess().getAssociationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssociation_in_ruleConnector1915);
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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleGeneralization"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:866:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:867:2: (iv_ruleGeneralization= ruleGeneralization EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:868:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_ruleGeneralization_in_entryRuleGeneralization1950);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralization1960); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:875:1: ruleGeneralization returns [EObject current=null] : ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleAssociationEnd ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:878:28: ( ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleAssociationEnd ) ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:879:1: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleAssociationEnd ) ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:879:1: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleAssociationEnd ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:879:2: ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= 'isa' ( (lv_right_2_0= ruleAssociationEnd ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:879:2: ( (lv_left_0_0= ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:880:1: (lv_left_0_0= ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:880:1: (lv_left_0_0= ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:881:3: lv_left_0_0= ruleAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getGeneralizationAccess().getLeftAssociationEndParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAssociationEnd_in_ruleGeneralization2006);
            lv_left_0_0=ruleAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneralizationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"AssociationEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleGeneralization2018); 

                	newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getIsaKeyword_1());
                
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:901:1: ( (lv_right_2_0= ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:902:1: (lv_right_2_0= ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:902:1: (lv_right_2_0= ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:903:3: lv_right_2_0= ruleAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getGeneralizationAccess().getRightAssociationEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssociationEnd_in_ruleGeneralization2039);
            lv_right_2_0=ruleAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneralizationRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"AssociationEnd");
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


    // $ANTLR start "entryRuleAssociation"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:927:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:928:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:929:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation2075);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation2085); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:936:1: ruleAssociation returns [EObject current=null] : ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( ( ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_note_4_0= ruleNote ) )? ) | ( (lv_note_5_0= ruleNote ) ) ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_cardinality_3_0 = null;

        AntlrDatatypeRuleToken lv_note_4_0 = null;

        AntlrDatatypeRuleToken lv_note_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:939:28: ( ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( ( ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_note_4_0= ruleNote ) )? ) | ( (lv_note_5_0= ruleNote ) ) ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:940:1: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( ( ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_note_4_0= ruleNote ) )? ) | ( (lv_note_5_0= ruleNote ) ) ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:940:1: ( ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( ( ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_note_4_0= ruleNote ) )? ) | ( (lv_note_5_0= ruleNote ) ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:940:2: ( (lv_left_0_0= ruleAssociationEnd ) ) otherlv_1= '-' ( ( ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_note_4_0= ruleNote ) )? ) | ( (lv_note_5_0= ruleNote ) ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:940:2: ( (lv_left_0_0= ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:941:1: (lv_left_0_0= ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:941:1: (lv_left_0_0= ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:942:3: lv_left_0_0= ruleAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getLeftAssociationEndParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAssociationEnd_in_ruleAssociation2131);
            lv_left_0_0=ruleAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"AssociationEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleAssociation2143); 

                	newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1());
                
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:962:1: ( ( ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_note_4_0= ruleNote ) )? ) | ( (lv_note_5_0= ruleNote ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==37) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:962:2: ( ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_note_4_0= ruleNote ) )? )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:962:2: ( ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_note_4_0= ruleNote ) )? )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:962:3: ( (lv_right_2_0= ruleAssociationEnd ) ) ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )? ( (lv_note_4_0= ruleNote ) )?
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:962:3: ( (lv_right_2_0= ruleAssociationEnd ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:963:1: (lv_right_2_0= ruleAssociationEnd )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:963:1: (lv_right_2_0= ruleAssociationEnd )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:964:3: lv_right_2_0= ruleAssociationEnd
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getRightAssociationEndParserRuleCall_2_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssociationEnd_in_ruleAssociation2166);
                    lv_right_2_0=ruleAssociationEnd();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_2_0, 
                            		"AssociationEnd");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:980:2: ( (lv_cardinality_3_0= ruleConnectorCardinalitiy ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==30) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:981:1: (lv_cardinality_3_0= ruleConnectorCardinalitiy )
                            {
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:981:1: (lv_cardinality_3_0= ruleConnectorCardinalitiy )
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:982:3: lv_cardinality_3_0= ruleConnectorCardinalitiy
                            {
                             
                            	        newCompositeNode(grammarAccess.getAssociationAccess().getCardinalityConnectorCardinalitiyParserRuleCall_2_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConnectorCardinalitiy_in_ruleAssociation2187);
                            lv_cardinality_3_0=ruleConnectorCardinalitiy();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"cardinality",
                                    		lv_cardinality_3_0, 
                                    		"ConnectorCardinalitiy");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:998:3: ( (lv_note_4_0= ruleNote ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==37) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:999:1: (lv_note_4_0= ruleNote )
                            {
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:999:1: (lv_note_4_0= ruleNote )
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1000:3: lv_note_4_0= ruleNote
                            {
                             
                            	        newCompositeNode(grammarAccess.getAssociationAccess().getNoteNoteParserRuleCall_2_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNote_in_ruleAssociation2209);
                            lv_note_4_0=ruleNote();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"note",
                                    		lv_note_4_0, 
                                    		"Note");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1017:6: ( (lv_note_5_0= ruleNote ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1017:6: ( (lv_note_5_0= ruleNote ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1018:1: (lv_note_5_0= ruleNote )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1018:1: (lv_note_5_0= ruleNote )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1019:3: lv_note_5_0= ruleNote
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getNoteNoteParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNote_in_ruleAssociation2238);
                    lv_note_5_0=ruleNote();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"note",
                            		lv_note_5_0, 
                            		"Note");
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


    // $ANTLR start "entryRuleAssociationEnd"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1043:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1044:2: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1045:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
            {
             newCompositeNode(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_ruleAssociationEnd_in_entryRuleAssociationEnd2275);
            iv_ruleAssociationEnd=ruleAssociationEnd();

            state._fsp--;

             current =iv_ruleAssociationEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationEnd2285); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1052:1: ruleAssociationEnd returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1055:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1056:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1056:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1057:1: (otherlv_0= RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1057:1: (otherlv_0= RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1058:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationEndRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationEnd2329); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1077:1: entryRuleConnectorLabel returns [EObject current=null] : iv_ruleConnectorLabel= ruleConnectorLabel EOF ;
    public final EObject entryRuleConnectorLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorLabel = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1078:2: (iv_ruleConnectorLabel= ruleConnectorLabel EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1079:2: iv_ruleConnectorLabel= ruleConnectorLabel EOF
            {
             newCompositeNode(grammarAccess.getConnectorLabelRule()); 
            pushFollow(FOLLOW_ruleConnectorLabel_in_entryRuleConnectorLabel2364);
            iv_ruleConnectorLabel=ruleConnectorLabel();

            state._fsp--;

             current =iv_ruleConnectorLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectorLabel2374); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1086:1: ruleConnectorLabel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConnectorLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1089:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1090:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1090:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1091:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1091:1: (lv_name_0_0= RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1092:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorLabel2415); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConnectorLabelAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1116:1: entryRuleConnectorCardinalitiy returns [EObject current=null] : iv_ruleConnectorCardinalitiy= ruleConnectorCardinalitiy EOF ;
    public final EObject entryRuleConnectorCardinalitiy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorCardinalitiy = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1117:2: (iv_ruleConnectorCardinalitiy= ruleConnectorCardinalitiy EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1118:2: iv_ruleConnectorCardinalitiy= ruleConnectorCardinalitiy EOF
            {
             newCompositeNode(grammarAccess.getConnectorCardinalitiyRule()); 
            pushFollow(FOLLOW_ruleConnectorCardinalitiy_in_entryRuleConnectorCardinalitiy2455);
            iv_ruleConnectorCardinalitiy=ruleConnectorCardinalitiy();

            state._fsp--;

             current =iv_ruleConnectorCardinalitiy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectorCardinalitiy2465); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1125:1: ruleConnectorCardinalitiy returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_left_2_0= ruleCardinality ) )? (otherlv_3= '|' ( (lv_middle_4_0= ruleCardinality ) )? )? (otherlv_5= '|' ( (lv_right_6_0= ruleConnectorLabel ) )? (otherlv_7= '<' | otherlv_8= '>' )? )? otherlv_9= ']' ) ;
    public final EObject ruleConnectorCardinalitiy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_left_2_0 = null;

        AntlrDatatypeRuleToken lv_middle_4_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1128:28: ( ( () otherlv_1= '[' ( (lv_left_2_0= ruleCardinality ) )? (otherlv_3= '|' ( (lv_middle_4_0= ruleCardinality ) )? )? (otherlv_5= '|' ( (lv_right_6_0= ruleConnectorLabel ) )? (otherlv_7= '<' | otherlv_8= '>' )? )? otherlv_9= ']' ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1129:1: ( () otherlv_1= '[' ( (lv_left_2_0= ruleCardinality ) )? (otherlv_3= '|' ( (lv_middle_4_0= ruleCardinality ) )? )? (otherlv_5= '|' ( (lv_right_6_0= ruleConnectorLabel ) )? (otherlv_7= '<' | otherlv_8= '>' )? )? otherlv_9= ']' )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1129:1: ( () otherlv_1= '[' ( (lv_left_2_0= ruleCardinality ) )? (otherlv_3= '|' ( (lv_middle_4_0= ruleCardinality ) )? )? (otherlv_5= '|' ( (lv_right_6_0= ruleConnectorLabel ) )? (otherlv_7= '<' | otherlv_8= '>' )? )? otherlv_9= ']' )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1129:2: () otherlv_1= '[' ( (lv_left_2_0= ruleCardinality ) )? (otherlv_3= '|' ( (lv_middle_4_0= ruleCardinality ) )? )? (otherlv_5= '|' ( (lv_right_6_0= ruleConnectorLabel ) )? (otherlv_7= '<' | otherlv_8= '>' )? )? otherlv_9= ']'
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1129:2: ()
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1130:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConnectorCardinalitiyAccess().getConnectorCardinalitiyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleConnectorCardinalitiy2511); 

                	newLeafNode(otherlv_1, grammarAccess.getConnectorCardinalitiyAccess().getLeftSquareBracketKeyword_1());
                
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1139:1: ( (lv_left_2_0= ruleCardinality ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT||LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1140:1: (lv_left_2_0= ruleCardinality )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1140:1: (lv_left_2_0= ruleCardinality )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1141:3: lv_left_2_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectorCardinalitiyAccess().getLeftCardinalityParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleConnectorCardinalitiy2532);
                    lv_left_2_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectorCardinalitiyRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_2_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1157:3: (otherlv_3= '|' ( (lv_middle_4_0= ruleCardinality ) )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1157:5: otherlv_3= '|' ( (lv_middle_4_0= ruleCardinality ) )?
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleConnectorCardinalitiy2546); 

                        	newLeafNode(otherlv_3, grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_3_0());
                        
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1161:1: ( (lv_middle_4_0= ruleCardinality ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_INT||LA27_0==35) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1162:1: (lv_middle_4_0= ruleCardinality )
                            {
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1162:1: (lv_middle_4_0= ruleCardinality )
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1163:3: lv_middle_4_0= ruleCardinality
                            {
                             
                            	        newCompositeNode(grammarAccess.getConnectorCardinalitiyAccess().getMiddleCardinalityParserRuleCall_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCardinality_in_ruleConnectorCardinalitiy2567);
                            lv_middle_4_0=ruleCardinality();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConnectorCardinalitiyRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"middle",
                                    		lv_middle_4_0, 
                                    		"Cardinality");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1179:5: (otherlv_5= '|' ( (lv_right_6_0= ruleConnectorLabel ) )? (otherlv_7= '<' | otherlv_8= '>' )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1179:7: otherlv_5= '|' ( (lv_right_6_0= ruleConnectorLabel ) )? (otherlv_7= '<' | otherlv_8= '>' )?
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleConnectorCardinalitiy2583); 

                        	newLeafNode(otherlv_5, grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_4_0());
                        
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1183:1: ( (lv_right_6_0= ruleConnectorLabel ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ID) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1184:1: (lv_right_6_0= ruleConnectorLabel )
                            {
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1184:1: (lv_right_6_0= ruleConnectorLabel )
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1185:3: lv_right_6_0= ruleConnectorLabel
                            {
                             
                            	        newCompositeNode(grammarAccess.getConnectorCardinalitiyAccess().getRightConnectorLabelParserRuleCall_4_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConnectorLabel_in_ruleConnectorCardinalitiy2604);
                            lv_right_6_0=ruleConnectorLabel();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConnectorCardinalitiyRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"right",
                                    		lv_right_6_0, 
                                    		"ConnectorLabel");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1201:3: (otherlv_7= '<' | otherlv_8= '>' )?
                    int alt30=3;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==32) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==33) ) {
                        alt30=2;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1201:5: otherlv_7= '<'
                            {
                            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleConnectorCardinalitiy2618); 

                                	newLeafNode(otherlv_7, grammarAccess.getConnectorCardinalitiyAccess().getLessThanSignKeyword_4_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1206:7: otherlv_8= '>'
                            {
                            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleConnectorCardinalitiy2636); 

                                	newLeafNode(otherlv_8, grammarAccess.getConnectorCardinalitiyAccess().getGreaterThanSignKeyword_4_2_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleConnectorCardinalitiy2652); 

                	newLeafNode(otherlv_9, grammarAccess.getConnectorCardinalitiyAccess().getRightSquareBracketKeyword_5());
                

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1222:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1223:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1224:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality2689);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality2700); 

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
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1231:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) ) ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1234:28: ( (kw= '*' | (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1235:1: (kw= '*' | (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1235:1: (kw= '*' | (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
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
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1236:2: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleCardinality2738); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1242:6: (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1242:6: (this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT ) )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1242:11: this_INT_1= RULE_INT kw= '..' (kw= '*' | this_INT_4= RULE_INT )
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCardinality2760); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_0()); 
                        
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleCardinality2778); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_1()); 
                        
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1255:1: (kw= '*' | this_INT_4= RULE_INT )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==35) ) {
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
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1256:2: kw= '*'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleCardinality2792); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_2_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1262:10: this_INT_4= RULE_INT
                            {
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCardinality2813); 

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


    // $ANTLR start "entryRuleNote"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1277:1: entryRuleNote returns [String current=null] : iv_ruleNote= ruleNote EOF ;
    public final String entryRuleNote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNote = null;


        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1278:2: (iv_ruleNote= ruleNote EOF )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1279:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote2861);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote2872); 

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
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1286:1: ruleNote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'note[' this_STRING_1= RULE_STRING kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleNote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1289:28: ( (kw= 'note[' this_STRING_1= RULE_STRING kw= ']' ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1290:1: (kw= 'note[' this_STRING_1= RULE_STRING kw= ']' )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1290:1: (kw= 'note[' this_STRING_1= RULE_STRING kw= ']' )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1291:2: kw= 'note[' this_STRING_1= RULE_STRING kw= ']'
            {
            kw=(Token)match(input,37,FOLLOW_37_in_ruleNote2910); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNoteAccess().getNoteKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNote2925); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getNoteAccess().getSTRINGTerminalRuleCall_1()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleNote2943); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNoteAccess().getRightSquareBracketKeyword_2()); 
                

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
    // $ANTLR end "ruleNote"


    // $ANTLR start "ruleVisibility"
    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1317:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '#' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) | (enumLiteral_3= '+' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1319:28: ( ( (enumLiteral_0= '#' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) | (enumLiteral_3= '+' ) ) )
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1320:1: ( (enumLiteral_0= '#' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) | (enumLiteral_3= '+' ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1320:1: ( (enumLiteral_0= '#' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) | (enumLiteral_3= '+' ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt34=1;
                }
                break;
            case 29:
                {
                alt34=2;
                }
                break;
            case 39:
                {
                alt34=3;
                }
                break;
            case 40:
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
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1320:2: (enumLiteral_0= '#' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1320:2: (enumLiteral_0= '#' )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1320:4: enumLiteral_0= '#'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleVisibility2997); 

                            current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1326:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1326:6: (enumLiteral_1= '-' )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1326:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleVisibility3014); 

                            current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1332:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1332:6: (enumLiteral_2= '~' )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1332:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleVisibility3031); 

                            current = grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1338:6: (enumLiteral_3= '+' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1338:6: (enumLiteral_3= '+' )
                    // ../de.cooperateproject.uml.xtext.clazz/src-gen/de/cooperateproject/uml/xtext/clazz/parser/antlr/internal/InternalUmlDsl.g:1338:8: enumLiteral_3= '+'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_40_in_ruleVisibility3048); 

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

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\7\4\1\31\2\uffff";
    static final String DFA11_maxS =
        "\1\50\5\30\1\4\1\32\2\uffff";
    static final String DFA11_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\7\17\uffff\1\10\2\uffff\1\5\1\6\4\uffff\1\2\10\uffff\1\1"+
            "\1\3\1\4",
            "\1\7\17\uffff\1\10\2\uffff\1\5\1\6",
            "\1\7\17\uffff\1\10\2\uffff\1\5\1\6",
            "\1\7\17\uffff\1\10\2\uffff\1\5\1\6",
            "\1\7\17\uffff\1\10\2\uffff\1\5\1\6",
            "\1\7\23\uffff\1\6",
            "\1\7",
            "\1\11\1\10",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "583:1: (this_Attribute_0= ruleAttribute | this_Methode_1= ruleMethode )";
        }
    }
 

    public static final BitSet FOLLOW_ruleClassDiagram_in_entryRuleClassDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleClassDiagram131 = new BitSet(new long[]{0x000000000010F010L});
    public static final BitSet FOLLOW_ruleElement_in_ruleClassDiagram152 = new BitSet(new long[]{0x000000000010F010L});
    public static final BitSet FOLLOW_12_in_ruleClassDiagram165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDef_in_ruleElement258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleElement285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleElement312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleElement339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDataType421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDef_in_entryRuleClassDef481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDef491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleClassDef529 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15_in_ruleClassDef547 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClassDef560 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleClassDef581 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleClassDef594 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleClassDef615 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleClassDef629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleClassName721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleName838 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName858 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleName878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleClass985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1007 = new BitSet(new long[]{0x0000000000610000L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleClass1028 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClass1041 = new BitSet(new long[]{0x000001C021940010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleClass1062 = new BitSet(new long[]{0x000001C021940010L});
    public static final BitSet FOLLOW_18_in_ruleClass1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance1111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInheritance1159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInheritance1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInheritance1199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInheritance1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember1256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleMember1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_ruleMember1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAttribute1431 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_23_in_ruleAttribute1445 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleAttribute1460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1479 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAttribute1496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_entryRuleMethode1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethode1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleMethode1608 = new BitSet(new long[]{0x0000000001900010L});
    public static final BitSet FOLLOW_20_in_ruleMethode1622 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_23_in_ruleMethode1637 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleMethode1652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethode1671 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMethode1688 = new BitSet(new long[]{0x000001C029800010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleMethode1710 = new BitSet(new long[]{0x000001C029820010L});
    public static final BitSet FOLLOW_17_in_ruleMethode1723 = new BitSet(new long[]{0x000001C021800010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleMethode1744 = new BitSet(new long[]{0x000001C029820010L});
    public static final BitSet FOLLOW_27_in_ruleMethode1760 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleMethode1773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethode1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector1831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_ruleConnector1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleConnector1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_entryRuleGeneralization1950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralization1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_ruleGeneralization2006 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGeneralization2018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_ruleGeneralization2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_ruleAssociation2131 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAssociation2143 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_ruleAssociation2166 = new BitSet(new long[]{0x0000002040000012L});
    public static final BitSet FOLLOW_ruleConnectorCardinalitiy_in_ruleAssociation2187 = new BitSet(new long[]{0x0000002000000012L});
    public static final BitSet FOLLOW_ruleNote_in_ruleAssociation2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleAssociation2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_entryRuleAssociationEnd2275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationEnd2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationEnd2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorLabel_in_entryRuleConnectorLabel2364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectorLabel2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorLabel2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorCardinalitiy_in_entryRuleConnectorCardinalitiy2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectorCardinalitiy2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleConnectorCardinalitiy2511 = new BitSet(new long[]{0x0000000C80000040L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleConnectorCardinalitiy2532 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleConnectorCardinalitiy2546 = new BitSet(new long[]{0x0000000C80000040L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleConnectorCardinalitiy2567 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleConnectorCardinalitiy2583 = new BitSet(new long[]{0x0000000700000010L});
    public static final BitSet FOLLOW_ruleConnectorLabel_in_ruleConnectorCardinalitiy2604 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_ruleConnectorCardinalitiy2618 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_ruleConnectorCardinalitiy2636 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleConnectorCardinalitiy2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality2689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCardinality2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCardinality2760 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCardinality2778 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_35_in_ruleCardinality2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCardinality2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote2861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleNote2910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNote2925 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleNote2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVisibility2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVisibility3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVisibility3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVisibility3048 = new BitSet(new long[]{0x0000000000000002L});

}