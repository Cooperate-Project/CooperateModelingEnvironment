package de.cooperateproject.modeling.textual.activity.parser.antlr.internal; 

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
import de.cooperateproject.modeling.textual.activity.services.ActivityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@startactivity'", "'@endactivity'", "'action'", "'as'", "'condition'", "':'", "'fork'", "'-'", "'note['", "']'", "'start'", "'end'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalActivityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActivity.g"; }



     	private ActivityGrammarAccess grammarAccess;
     	
        public InternalActivityParser(TokenStream input, ActivityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ActivityDiagram";	
       	}
       	
       	@Override
       	protected ActivityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleActivityDiagram"
    // InternalActivity.g:68:1: entryRuleActivityDiagram returns [EObject current=null] : iv_ruleActivityDiagram= ruleActivityDiagram EOF ;
    public final EObject entryRuleActivityDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityDiagram = null;


        try {
            // InternalActivity.g:69:2: (iv_ruleActivityDiagram= ruleActivityDiagram EOF )
            // InternalActivity.g:70:2: iv_ruleActivityDiagram= ruleActivityDiagram EOF
            {
             newCompositeNode(grammarAccess.getActivityDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityDiagram=ruleActivityDiagram();

            state._fsp--;

             current =iv_ruleActivityDiagram; 
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
    // $ANTLR end "entryRuleActivityDiagram"


    // $ANTLR start "ruleActivityDiagram"
    // InternalActivity.g:77:1: ruleActivityDiagram returns [EObject current=null] : ( () otherlv_1= '@startactivity' ( (lv_elements_2_0= ruleActivityElement ) )* otherlv_3= '@endactivity' ) ;
    public final EObject ruleActivityDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:80:28: ( ( () otherlv_1= '@startactivity' ( (lv_elements_2_0= ruleActivityElement ) )* otherlv_3= '@endactivity' ) )
            // InternalActivity.g:81:1: ( () otherlv_1= '@startactivity' ( (lv_elements_2_0= ruleActivityElement ) )* otherlv_3= '@endactivity' )
            {
            // InternalActivity.g:81:1: ( () otherlv_1= '@startactivity' ( (lv_elements_2_0= ruleActivityElement ) )* otherlv_3= '@endactivity' )
            // InternalActivity.g:81:2: () otherlv_1= '@startactivity' ( (lv_elements_2_0= ruleActivityElement ) )* otherlv_3= '@endactivity'
            {
            // InternalActivity.g:81:2: ()
            // InternalActivity.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityDiagramAccess().getStartactivityKeyword_1());
                
            // InternalActivity.g:91:1: ( (lv_elements_2_0= ruleActivityElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==15||LA1_0==17||(LA1_0>=21 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalActivity.g:92:1: (lv_elements_2_0= ruleActivityElement )
            	    {
            	    // InternalActivity.g:92:1: (lv_elements_2_0= ruleActivityElement )
            	    // InternalActivity.g:93:3: lv_elements_2_0= ruleActivityElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityDiagramAccess().getElementsActivityElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_elements_2_0=ruleActivityElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"de.cooperateproject.modeling.textual.activity.Activity.ActivityElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityDiagramAccess().getEndactivityKeyword_3());
                

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
    // $ANTLR end "ruleActivityDiagram"


    // $ANTLR start "entryRuleActivityElement"
    // InternalActivity.g:121:1: entryRuleActivityElement returns [EObject current=null] : iv_ruleActivityElement= ruleActivityElement EOF ;
    public final EObject entryRuleActivityElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityElement = null;


        try {
            // InternalActivity.g:122:2: (iv_ruleActivityElement= ruleActivityElement EOF )
            // InternalActivity.g:123:2: iv_ruleActivityElement= ruleActivityElement EOF
            {
             newCompositeNode(grammarAccess.getActivityElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityElement=ruleActivityElement();

            state._fsp--;

             current =iv_ruleActivityElement; 
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
    // $ANTLR end "entryRuleActivityElement"


    // $ANTLR start "ruleActivityElement"
    // InternalActivity.g:130:1: ruleActivityElement returns [EObject current=null] : (this_Action_0= ruleAction | this_Condition_1= ruleCondition | this_Fork_2= ruleFork | this_Association_3= ruleAssociation ) ;
    public final EObject ruleActivityElement() throws RecognitionException {
        EObject current = null;

        EObject this_Action_0 = null;

        EObject this_Condition_1 = null;

        EObject this_Fork_2 = null;

        EObject this_Association_3 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:133:28: ( (this_Action_0= ruleAction | this_Condition_1= ruleCondition | this_Fork_2= ruleFork | this_Association_3= ruleAssociation ) )
            // InternalActivity.g:134:1: (this_Action_0= ruleAction | this_Condition_1= ruleCondition | this_Fork_2= ruleFork | this_Association_3= ruleAssociation )
            {
            // InternalActivity.g:134:1: (this_Action_0= ruleAction | this_Condition_1= ruleCondition | this_Fork_2= ruleFork | this_Association_3= ruleAssociation )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
            case 21:
            case 22:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalActivity.g:135:5: this_Action_0= ruleAction
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Action_0=ruleAction();

                    state._fsp--;

                     
                            current = this_Action_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalActivity.g:145:5: this_Condition_1= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getConditionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Condition_1=ruleCondition();

                    state._fsp--;

                     
                            current = this_Condition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalActivity.g:155:5: this_Fork_2= ruleFork
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getForkParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Fork_2=ruleFork();

                    state._fsp--;

                     
                            current = this_Fork_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalActivity.g:165:5: this_Association_3= ruleAssociation
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getAssociationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Association_3=ruleAssociation();

                    state._fsp--;

                     
                            current = this_Association_3; 
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
    // $ANTLR end "ruleActivityElement"


    // $ANTLR start "entryRuleAction"
    // InternalActivity.g:181:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalActivity.g:182:2: (iv_ruleAction= ruleAction EOF )
            // InternalActivity.g:183:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalActivity.g:190:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( ( ( (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID ) ) ) otherlv_2= 'as' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_comment_4_0= ruleComment ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_longName_1_1=null;
        Token lv_longName_1_2=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:193:28: ( (otherlv_0= 'action' ( ( ( (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID ) ) ) otherlv_2= 'as' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_comment_4_0= ruleComment ) )? ) )
            // InternalActivity.g:194:1: (otherlv_0= 'action' ( ( ( (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID ) ) ) otherlv_2= 'as' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_comment_4_0= ruleComment ) )? )
            {
            // InternalActivity.g:194:1: (otherlv_0= 'action' ( ( ( (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID ) ) ) otherlv_2= 'as' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_comment_4_0= ruleComment ) )? )
            // InternalActivity.g:194:3: otherlv_0= 'action' ( ( ( (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID ) ) ) otherlv_2= 'as' )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_comment_4_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
                
            // InternalActivity.g:198:1: ( ( ( (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID ) ) ) otherlv_2= 'as' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==14) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalActivity.g:198:2: ( ( (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID ) ) ) otherlv_2= 'as'
                    {
                    // InternalActivity.g:198:2: ( ( (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID ) ) )
                    // InternalActivity.g:199:1: ( (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID ) )
                    {
                    // InternalActivity.g:199:1: ( (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID ) )
                    // InternalActivity.g:200:1: (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID )
                    {
                    // InternalActivity.g:200:1: (lv_longName_1_1= RULE_STRING | lv_longName_1_2= RULE_ID )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_STRING) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==RULE_ID) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalActivity.g:201:3: lv_longName_1_1= RULE_STRING
                            {
                            lv_longName_1_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                            			newLeafNode(lv_longName_1_1, grammarAccess.getActionAccess().getLongNameSTRINGTerminalRuleCall_1_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_1_1, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }
                            break;
                        case 2 :
                            // InternalActivity.g:216:8: lv_longName_1_2= RULE_ID
                            {
                            lv_longName_1_2=(Token)match(input,RULE_ID,FOLLOW_5); 

                            			newLeafNode(lv_longName_1_2, grammarAccess.getActionAccess().getLongNameIDTerminalRuleCall_1_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_1_2, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_6); 

                        	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getAsKeyword_1_1());
                        

                    }
                    break;

            }

            // InternalActivity.g:238:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalActivity.g:239:1: (lv_name_3_0= RULE_ID )
            {
            // InternalActivity.g:239:1: (lv_name_3_0= RULE_ID )
            // InternalActivity.g:240:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			newLeafNode(lv_name_3_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalActivity.g:256:2: ( (lv_comment_4_0= ruleComment ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalActivity.g:257:1: (lv_comment_4_0= ruleComment )
                    {
                    // InternalActivity.g:257:1: (lv_comment_4_0= ruleComment )
                    // InternalActivity.g:258:3: lv_comment_4_0= ruleComment
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getCommentCommentParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_comment_4_0=ruleComment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_4_0, 
                            		"de.cooperateproject.modeling.textual.activity.Activity.Comment");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCondition"
    // InternalActivity.g:282:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalActivity.g:283:2: (iv_ruleCondition= ruleCondition EOF )
            // InternalActivity.g:284:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalActivity.g:291:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_conditionStart_1_0= ruleConditionEnd ) ) otherlv_2= ':' ( (lv_conditionEnd_3_0= ruleConditionEnd ) ) ( (lv_comment_4_0= ruleComment ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_conditionStart_1_0 = null;

        EObject lv_conditionEnd_3_0 = null;

        EObject lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:294:28: ( (otherlv_0= 'condition' ( (lv_conditionStart_1_0= ruleConditionEnd ) ) otherlv_2= ':' ( (lv_conditionEnd_3_0= ruleConditionEnd ) ) ( (lv_comment_4_0= ruleComment ) )? ) )
            // InternalActivity.g:295:1: (otherlv_0= 'condition' ( (lv_conditionStart_1_0= ruleConditionEnd ) ) otherlv_2= ':' ( (lv_conditionEnd_3_0= ruleConditionEnd ) ) ( (lv_comment_4_0= ruleComment ) )? )
            {
            // InternalActivity.g:295:1: (otherlv_0= 'condition' ( (lv_conditionStart_1_0= ruleConditionEnd ) ) otherlv_2= ':' ( (lv_conditionEnd_3_0= ruleConditionEnd ) ) ( (lv_comment_4_0= ruleComment ) )? )
            // InternalActivity.g:295:3: otherlv_0= 'condition' ( (lv_conditionStart_1_0= ruleConditionEnd ) ) otherlv_2= ':' ( (lv_conditionEnd_3_0= ruleConditionEnd ) ) ( (lv_comment_4_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
                
            // InternalActivity.g:299:1: ( (lv_conditionStart_1_0= ruleConditionEnd ) )
            // InternalActivity.g:300:1: (lv_conditionStart_1_0= ruleConditionEnd )
            {
            // InternalActivity.g:300:1: (lv_conditionStart_1_0= ruleConditionEnd )
            // InternalActivity.g:301:3: lv_conditionStart_1_0= ruleConditionEnd
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getConditionStartConditionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_8);
            lv_conditionStart_1_0=ruleConditionEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"conditionStart",
                    		lv_conditionStart_1_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.ConditionEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getColonKeyword_2());
                
            // InternalActivity.g:321:1: ( (lv_conditionEnd_3_0= ruleConditionEnd ) )
            // InternalActivity.g:322:1: (lv_conditionEnd_3_0= ruleConditionEnd )
            {
            // InternalActivity.g:322:1: (lv_conditionEnd_3_0= ruleConditionEnd )
            // InternalActivity.g:323:3: lv_conditionEnd_3_0= ruleConditionEnd
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getConditionEndConditionEndParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_7);
            lv_conditionEnd_3_0=ruleConditionEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"conditionEnd",
                    		lv_conditionEnd_3_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.ConditionEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivity.g:339:2: ( (lv_comment_4_0= ruleComment ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalActivity.g:340:1: (lv_comment_4_0= ruleComment )
                    {
                    // InternalActivity.g:340:1: (lv_comment_4_0= ruleComment )
                    // InternalActivity.g:341:3: lv_comment_4_0= ruleComment
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionAccess().getCommentCommentParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_comment_4_0=ruleComment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_4_0, 
                            		"de.cooperateproject.modeling.textual.activity.Activity.Comment");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionEnd"
    // InternalActivity.g:365:1: entryRuleConditionEnd returns [EObject current=null] : iv_ruleConditionEnd= ruleConditionEnd EOF ;
    public final EObject entryRuleConditionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionEnd = null;


        try {
            // InternalActivity.g:366:2: (iv_ruleConditionEnd= ruleConditionEnd EOF )
            // InternalActivity.g:367:2: iv_ruleConditionEnd= ruleConditionEnd EOF
            {
             newCompositeNode(grammarAccess.getConditionEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionEnd=ruleConditionEnd();

            state._fsp--;

             current =iv_ruleConditionEnd; 
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
    // $ANTLR end "entryRuleConditionEnd"


    // $ANTLR start "ruleConditionEnd"
    // InternalActivity.g:374:1: ruleConditionEnd returns [EObject current=null] : ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleConditionEnd() throws RecognitionException {
        EObject current = null;

        Token lv_longName_0_1=null;
        Token lv_longName_0_2=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // InternalActivity.g:377:28: ( ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalActivity.g:378:1: ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalActivity.g:378:1: ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalActivity.g:378:2: ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalActivity.g:378:2: ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==14) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalActivity.g:378:3: ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as'
                    {
                    // InternalActivity.g:378:3: ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) )
                    // InternalActivity.g:379:1: ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) )
                    {
                    // InternalActivity.g:379:1: ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) )
                    // InternalActivity.g:380:1: (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID )
                    {
                    // InternalActivity.g:380:1: (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_STRING) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==RULE_ID) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalActivity.g:381:3: lv_longName_0_1= RULE_STRING
                            {
                            lv_longName_0_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                            			newLeafNode(lv_longName_0_1, grammarAccess.getConditionEndAccess().getLongNameSTRINGTerminalRuleCall_0_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getConditionEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_0_1, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }
                            break;
                        case 2 :
                            // InternalActivity.g:396:8: lv_longName_0_2= RULE_ID
                            {
                            lv_longName_0_2=(Token)match(input,RULE_ID,FOLLOW_5); 

                            			newLeafNode(lv_longName_0_2, grammarAccess.getConditionEndAccess().getLongNameIDTerminalRuleCall_0_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getConditionEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_0_2, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_6); 

                        	newLeafNode(otherlv_1, grammarAccess.getConditionEndAccess().getAsKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalActivity.g:418:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalActivity.g:419:1: (lv_name_2_0= RULE_ID )
            {
            // InternalActivity.g:419:1: (lv_name_2_0= RULE_ID )
            // InternalActivity.g:420:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConditionEndAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionEndRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

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
    // $ANTLR end "ruleConditionEnd"


    // $ANTLR start "entryRuleFork"
    // InternalActivity.g:444:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // InternalActivity.g:445:2: (iv_ruleFork= ruleFork EOF )
            // InternalActivity.g:446:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
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
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // InternalActivity.g:453:1: ruleFork returns [EObject current=null] : (otherlv_0= 'fork' ( (lv_forkStart_1_0= ruleForkEnd ) ) otherlv_2= ':' ( (lv_forkEnd_3_0= ruleForkEnd ) ) ( (lv_comment_4_0= ruleComment ) )? ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_forkStart_1_0 = null;

        EObject lv_forkEnd_3_0 = null;

        EObject lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:456:28: ( (otherlv_0= 'fork' ( (lv_forkStart_1_0= ruleForkEnd ) ) otherlv_2= ':' ( (lv_forkEnd_3_0= ruleForkEnd ) ) ( (lv_comment_4_0= ruleComment ) )? ) )
            // InternalActivity.g:457:1: (otherlv_0= 'fork' ( (lv_forkStart_1_0= ruleForkEnd ) ) otherlv_2= ':' ( (lv_forkEnd_3_0= ruleForkEnd ) ) ( (lv_comment_4_0= ruleComment ) )? )
            {
            // InternalActivity.g:457:1: (otherlv_0= 'fork' ( (lv_forkStart_1_0= ruleForkEnd ) ) otherlv_2= ':' ( (lv_forkEnd_3_0= ruleForkEnd ) ) ( (lv_comment_4_0= ruleComment ) )? )
            // InternalActivity.g:457:3: otherlv_0= 'fork' ( (lv_forkStart_1_0= ruleForkEnd ) ) otherlv_2= ':' ( (lv_forkEnd_3_0= ruleForkEnd ) ) ( (lv_comment_4_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getForkAccess().getForkKeyword_0());
                
            // InternalActivity.g:461:1: ( (lv_forkStart_1_0= ruleForkEnd ) )
            // InternalActivity.g:462:1: (lv_forkStart_1_0= ruleForkEnd )
            {
            // InternalActivity.g:462:1: (lv_forkStart_1_0= ruleForkEnd )
            // InternalActivity.g:463:3: lv_forkStart_1_0= ruleForkEnd
            {
             
            	        newCompositeNode(grammarAccess.getForkAccess().getForkStartForkEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_8);
            lv_forkStart_1_0=ruleForkEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForkRule());
            	        }
                   		set(
                   			current, 
                   			"forkStart",
                    		lv_forkStart_1_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.ForkEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getForkAccess().getColonKeyword_2());
                
            // InternalActivity.g:483:1: ( (lv_forkEnd_3_0= ruleForkEnd ) )
            // InternalActivity.g:484:1: (lv_forkEnd_3_0= ruleForkEnd )
            {
            // InternalActivity.g:484:1: (lv_forkEnd_3_0= ruleForkEnd )
            // InternalActivity.g:485:3: lv_forkEnd_3_0= ruleForkEnd
            {
             
            	        newCompositeNode(grammarAccess.getForkAccess().getForkEndForkEndParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_7);
            lv_forkEnd_3_0=ruleForkEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForkRule());
            	        }
                   		set(
                   			current, 
                   			"forkEnd",
                    		lv_forkEnd_3_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.ForkEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivity.g:501:2: ( (lv_comment_4_0= ruleComment ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalActivity.g:502:1: (lv_comment_4_0= ruleComment )
                    {
                    // InternalActivity.g:502:1: (lv_comment_4_0= ruleComment )
                    // InternalActivity.g:503:3: lv_comment_4_0= ruleComment
                    {
                     
                    	        newCompositeNode(grammarAccess.getForkAccess().getCommentCommentParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_comment_4_0=ruleComment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForkRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_4_0, 
                            		"de.cooperateproject.modeling.textual.activity.Activity.Comment");
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
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleForkEnd"
    // InternalActivity.g:527:1: entryRuleForkEnd returns [EObject current=null] : iv_ruleForkEnd= ruleForkEnd EOF ;
    public final EObject entryRuleForkEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkEnd = null;


        try {
            // InternalActivity.g:528:2: (iv_ruleForkEnd= ruleForkEnd EOF )
            // InternalActivity.g:529:2: iv_ruleForkEnd= ruleForkEnd EOF
            {
             newCompositeNode(grammarAccess.getForkEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForkEnd=ruleForkEnd();

            state._fsp--;

             current =iv_ruleForkEnd; 
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
    // $ANTLR end "entryRuleForkEnd"


    // $ANTLR start "ruleForkEnd"
    // InternalActivity.g:536:1: ruleForkEnd returns [EObject current=null] : ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleForkEnd() throws RecognitionException {
        EObject current = null;

        Token lv_longName_0_1=null;
        Token lv_longName_0_2=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // InternalActivity.g:539:28: ( ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalActivity.g:540:1: ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalActivity.g:540:1: ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalActivity.g:540:2: ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalActivity.g:540:2: ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==14) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalActivity.g:540:3: ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as'
                    {
                    // InternalActivity.g:540:3: ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) )
                    // InternalActivity.g:541:1: ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) )
                    {
                    // InternalActivity.g:541:1: ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) )
                    // InternalActivity.g:542:1: (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID )
                    {
                    // InternalActivity.g:542:1: (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_STRING) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_ID) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalActivity.g:543:3: lv_longName_0_1= RULE_STRING
                            {
                            lv_longName_0_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                            			newLeafNode(lv_longName_0_1, grammarAccess.getForkEndAccess().getLongNameSTRINGTerminalRuleCall_0_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getForkEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_0_1, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }
                            break;
                        case 2 :
                            // InternalActivity.g:558:8: lv_longName_0_2= RULE_ID
                            {
                            lv_longName_0_2=(Token)match(input,RULE_ID,FOLLOW_5); 

                            			newLeafNode(lv_longName_0_2, grammarAccess.getForkEndAccess().getLongNameIDTerminalRuleCall_0_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getForkEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_0_2, 
                                    		"org.eclipse.xtext.common.Terminals.ID");
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_6); 

                        	newLeafNode(otherlv_1, grammarAccess.getForkEndAccess().getAsKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalActivity.g:580:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalActivity.g:581:1: (lv_name_2_0= RULE_ID )
            {
            // InternalActivity.g:581:1: (lv_name_2_0= RULE_ID )
            // InternalActivity.g:582:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_name_2_0, grammarAccess.getForkEndAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForkEndRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

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
    // $ANTLR end "ruleForkEnd"


    // $ANTLR start "entryRuleAssociation"
    // InternalActivity.g:606:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalActivity.g:607:2: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalActivity.g:608:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalActivity.g:615:1: ruleAssociation returns [EObject current=null] : ( ( (lv_left_0_0= ruleReference ) ) otherlv_1= '-' ( (lv_right_2_0= ruleReference ) ) ( (lv_comment_3_0= ruleComment ) )? ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:618:28: ( ( ( (lv_left_0_0= ruleReference ) ) otherlv_1= '-' ( (lv_right_2_0= ruleReference ) ) ( (lv_comment_3_0= ruleComment ) )? ) )
            // InternalActivity.g:619:1: ( ( (lv_left_0_0= ruleReference ) ) otherlv_1= '-' ( (lv_right_2_0= ruleReference ) ) ( (lv_comment_3_0= ruleComment ) )? )
            {
            // InternalActivity.g:619:1: ( ( (lv_left_0_0= ruleReference ) ) otherlv_1= '-' ( (lv_right_2_0= ruleReference ) ) ( (lv_comment_3_0= ruleComment ) )? )
            // InternalActivity.g:619:2: ( (lv_left_0_0= ruleReference ) ) otherlv_1= '-' ( (lv_right_2_0= ruleReference ) ) ( (lv_comment_3_0= ruleComment ) )?
            {
            // InternalActivity.g:619:2: ( (lv_left_0_0= ruleReference ) )
            // InternalActivity.g:620:1: (lv_left_0_0= ruleReference )
            {
            // InternalActivity.g:620:1: (lv_left_0_0= ruleReference )
            // InternalActivity.g:621:3: lv_left_0_0= ruleReference
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getLeftReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_9);
            lv_left_0_0=ruleReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.Reference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1());
                
            // InternalActivity.g:641:1: ( (lv_right_2_0= ruleReference ) )
            // InternalActivity.g:642:1: (lv_right_2_0= ruleReference )
            {
            // InternalActivity.g:642:1: (lv_right_2_0= ruleReference )
            // InternalActivity.g:643:3: lv_right_2_0= ruleReference
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getRightReferenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_7);
            lv_right_2_0=ruleReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.Reference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivity.g:659:2: ( (lv_comment_3_0= ruleComment ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalActivity.g:660:1: (lv_comment_3_0= ruleComment )
                    {
                    // InternalActivity.g:660:1: (lv_comment_3_0= ruleComment )
                    // InternalActivity.g:661:3: lv_comment_3_0= ruleComment
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationAccess().getCommentCommentParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_comment_3_0=ruleComment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_3_0, 
                            		"de.cooperateproject.modeling.textual.activity.Activity.Comment");
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


    // $ANTLR start "entryRuleReference"
    // InternalActivity.g:685:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalActivity.g:686:2: (iv_ruleReference= ruleReference EOF )
            // InternalActivity.g:687:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalActivity.g:694:1: ruleReference returns [EObject current=null] : (this_DefReference_0= ruleDefReference | this_StartAndEnd_1= ruleStartAndEnd ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject this_DefReference_0 = null;

        EObject this_StartAndEnd_1 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:697:28: ( (this_DefReference_0= ruleDefReference | this_StartAndEnd_1= ruleStartAndEnd ) )
            // InternalActivity.g:698:1: (this_DefReference_0= ruleDefReference | this_StartAndEnd_1= ruleStartAndEnd )
            {
            // InternalActivity.g:698:1: (this_DefReference_0= ruleDefReference | this_StartAndEnd_1= ruleStartAndEnd )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=21 && LA13_0<=22)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalActivity.g:699:5: this_DefReference_0= ruleDefReference
                    {
                     
                            newCompositeNode(grammarAccess.getReferenceAccess().getDefReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DefReference_0=ruleDefReference();

                    state._fsp--;

                     
                            current = this_DefReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalActivity.g:709:5: this_StartAndEnd_1= ruleStartAndEnd
                    {
                     
                            newCompositeNode(grammarAccess.getReferenceAccess().getStartAndEndParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_StartAndEnd_1=ruleStartAndEnd();

                    state._fsp--;

                     
                            current = this_StartAndEnd_1; 
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleDefReference"
    // InternalActivity.g:725:1: entryRuleDefReference returns [EObject current=null] : iv_ruleDefReference= ruleDefReference EOF ;
    public final EObject entryRuleDefReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefReference = null;


        try {
            // InternalActivity.g:726:2: (iv_ruleDefReference= ruleDefReference EOF )
            // InternalActivity.g:727:2: iv_ruleDefReference= ruleDefReference EOF
            {
             newCompositeNode(grammarAccess.getDefReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefReference=ruleDefReference();

            state._fsp--;

             current =iv_ruleDefReference; 
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
    // $ANTLR end "entryRuleDefReference"


    // $ANTLR start "ruleDefReference"
    // InternalActivity.g:734:1: ruleDefReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDefReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalActivity.g:737:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalActivity.g:738:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalActivity.g:738:1: ( (otherlv_0= RULE_ID ) )
            // InternalActivity.g:739:1: (otherlv_0= RULE_ID )
            {
            // InternalActivity.g:739:1: (otherlv_0= RULE_ID )
            // InternalActivity.g:740:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getDefReferenceAccess().getTypeDefRefCrossReference_0()); 
            	

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
    // $ANTLR end "ruleDefReference"


    // $ANTLR start "entryRuleStartAndEnd"
    // InternalActivity.g:761:1: entryRuleStartAndEnd returns [EObject current=null] : iv_ruleStartAndEnd= ruleStartAndEnd EOF ;
    public final EObject entryRuleStartAndEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartAndEnd = null;


        try {
            // InternalActivity.g:762:2: (iv_ruleStartAndEnd= ruleStartAndEnd EOF )
            // InternalActivity.g:763:2: iv_ruleStartAndEnd= ruleStartAndEnd EOF
            {
             newCompositeNode(grammarAccess.getStartAndEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartAndEnd=ruleStartAndEnd();

            state._fsp--;

             current =iv_ruleStartAndEnd; 
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
    // $ANTLR end "entryRuleStartAndEnd"


    // $ANTLR start "ruleStartAndEnd"
    // InternalActivity.g:770:1: ruleStartAndEnd returns [EObject current=null] : ( (lv_type_0_0= ruleStartAndEndEnum ) ) ;
    public final EObject ruleStartAndEnd() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:773:28: ( ( (lv_type_0_0= ruleStartAndEndEnum ) ) )
            // InternalActivity.g:774:1: ( (lv_type_0_0= ruleStartAndEndEnum ) )
            {
            // InternalActivity.g:774:1: ( (lv_type_0_0= ruleStartAndEndEnum ) )
            // InternalActivity.g:775:1: (lv_type_0_0= ruleStartAndEndEnum )
            {
            // InternalActivity.g:775:1: (lv_type_0_0= ruleStartAndEndEnum )
            // InternalActivity.g:776:3: lv_type_0_0= ruleStartAndEndEnum
            {
             
            	        newCompositeNode(grammarAccess.getStartAndEndAccess().getTypeStartAndEndEnumEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleStartAndEndEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStartAndEndRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.StartAndEndEnum");
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
    // $ANTLR end "ruleStartAndEnd"


    // $ANTLR start "entryRuleComment"
    // InternalActivity.g:800:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalActivity.g:801:2: (iv_ruleComment= ruleComment EOF )
            // InternalActivity.g:802:2: iv_ruleComment= ruleComment EOF
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
    // InternalActivity.g:809:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note[' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ']' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalActivity.g:812:28: ( (otherlv_0= 'note[' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ']' ) )
            // InternalActivity.g:813:1: (otherlv_0= 'note[' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ']' )
            {
            // InternalActivity.g:813:1: (otherlv_0= 'note[' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ']' )
            // InternalActivity.g:813:3: otherlv_0= 'note[' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
                
            // InternalActivity.g:817:1: ( (lv_description_1_0= RULE_STRING ) )
            // InternalActivity.g:818:1: (lv_description_1_0= RULE_STRING )
            {
            // InternalActivity.g:818:1: (lv_description_1_0= RULE_STRING )
            // InternalActivity.g:819:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            			newLeafNode(lv_description_1_0, grammarAccess.getCommentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getRightSquareBracketKeyword_2());
                

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


    // $ANTLR start "ruleStartAndEndEnum"
    // InternalActivity.g:847:1: ruleStartAndEndEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'end' ) ) ;
    public final Enumerator ruleStartAndEndEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalActivity.g:849:28: ( ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'end' ) ) )
            // InternalActivity.g:850:1: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'end' ) )
            {
            // InternalActivity.g:850:1: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'end' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            else if ( (LA14_0==22) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalActivity.g:850:2: (enumLiteral_0= 'start' )
                    {
                    // InternalActivity.g:850:2: (enumLiteral_0= 'start' )
                    // InternalActivity.g:850:4: enumLiteral_0= 'start'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                            current = grammarAccess.getStartAndEndEnumAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStartAndEndEnumAccess().getSTARTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalActivity.g:856:6: (enumLiteral_1= 'end' )
                    {
                    // InternalActivity.g:856:6: (enumLiteral_1= 'end' )
                    // InternalActivity.g:856:8: enumLiteral_1= 'end'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                            current = grammarAccess.getStartAndEndEnumAccess().getENDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStartAndEndEnumAccess().getENDEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleStartAndEndEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000062B020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000062A020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});

}